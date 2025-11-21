#!/usr/bin/env bash
set -e

echo "Compiling ModValidator..."
echo "Running ModValidator..."
cd /workspaces/Furnitures-O-Plenty ; /usr/bin/env /usr/local/sdkman/candidates/java/17.0.15-ms/bin/java @/tmp/cp_6pdy4t72o292ss76ms9thnapm.argfile com.rslover521.furnituresoplenty.util.validators.ModValidator
echo "Mod validation completed."