#!/usr/bin/env bash

echo "Stopping Xpra sessions..."
XPRA_SESSIONS=$(xpra list 2>/dev/null | awk -F: '/:[0-9]+/ {print $2}')

if [ -n "$XPRA_SESSIONS" ]; then
    for S in $XPRA_SESSIONS; do
        echo " - Stopping xpra session :$S"
        xpra stop :$S 2>/dev/null
    done
else
    echo " - No active xpra sessions found."
fi

echo "Force-killing any leftover xpra processes..."
pkill -9 xpra 2>/dev/null

echo "Stopping Sunshine..."
if systemctl --user status sunshine >/dev/null 2>&1; then
    echo " - Stopping user-level sunshine service..."
    systemctl --user stop sunshine
elif systemctl status sunshine >/dev/null 2>&1; then
    echo " - Stopping system-level sunshine service..."
    sudo systemctl stop sunshine
else
    echo " - Sunshine not managed by systemd. Killing process..."
    pkill -9 sunshine 2>/dev/null
fi

echo "All streaming sessions stopped."
echo "✅ Cleanup complete."