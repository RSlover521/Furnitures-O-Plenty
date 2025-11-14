#!/usr/bin/env bash
set -e

echo "Compiling ModValidator..."
mkdir -p out

# Compile all .java files in the validators package
javac -cp "$CLASSPATH" -d out src/main/java/com/rslover521/furnituresoplenty/util/validators/ModValidator.java

echo "Running ModValidator..."
# Run using full package name
java -cp out:$CLASSPATH com.rslover521.furnituresoplenty.util.validators.ModValidator
echo "ModValidator finished."
