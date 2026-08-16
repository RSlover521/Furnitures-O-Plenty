#!/usr/bin/env bash
set -e

echo "Compiling ModValidator..."
mkdir -p out

# Get the Gson JAR from gradle cache
GSON_JAR=$(find ~/.gradle/caches -name "gson-*.jar" -type f 2>/dev/null | head -1)

if [ -z "$GSON_JAR" ]; then
    echo "Error: Gson JAR not found in Gradle cache. Please run './gradlew build' first."
    exit 1
fi

# Compile all .java files in the validators package
javac -cp "$GSON_JAR:$CLASSPATH" -d out common/src/main/java/com/rslover521/furnituresoplenty/util/validators/ModValidator.java

echo "Running ModValidator..."
# Run using full package name
java -cp out:$GSON_JAR:$CLASSPATH com.rslover521.furnituresoplenty.util.validators.ModValidator
echo "ModValidator finished."