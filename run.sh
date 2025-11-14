#!/usr/bin/env bash
set -e

echo "Compiling ModValidator..."
mkdir -p out
javac -cp "$CLASSPATH" -d out src/main/java/com/rslover521/furnituresoplenty/util/validators/ModValidator.java

echo "Running ModValidator..."
java -cp out:$CLASSPATH com.rslover521.furnituresoplenty.util.validators.ModValidator
echo "Mod validation completed."