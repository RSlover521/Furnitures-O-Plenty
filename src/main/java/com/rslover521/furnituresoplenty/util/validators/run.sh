#!/usr/bin/env bash
set -e

echo "Compiling validator..."
mkdir -p out

javac -cp "$CLASSPATH" -d out ModValidator.java

echo "Running validator..."
java -cp out:$CLASSPATH ModValidator
echo "Validation complete."