# Gradle Setup Guide for Furnitures O' Plenty

## Current Situation

This Minecraft Forge mod requires **ForgeGradle** to build, which needs to download:
- Minecraft client/server files from Mojang's servers (`piston-meta.mojang.com`)
- Forge libraries from Maven repositories
- MCP mappings for deobfuscation
- Mod dependencies from CurseForge Maven

**Issue in Replit**: The environment has network restrictions that prevent access to Mojang's servers, making it impossible to complete the initial Gradle setup here.

## ✅ What You CAN Do in Replit

1. **Edit source code** - All Java files work perfectly
2. **Modify textures and models** - PNG files and JSON configurations
3. **Update recipes and loot tables** - JSON data files
4. **Version control** - Git operations work normally
5. **Code review and collaboration** - Perfect for team development

## ❌ What Needs Local Setup

- Initial Gradle dependency download
- Building the mod JAR file
- Running the Minecraft client for testing
- Decompiling Minecraft source code

---

## Recommended Workflow

### Option 1: Hybrid Development (Recommended)

**Use Replit for coding:**
```bash
# Edit files in Replit
# Commit changes to Git
git add .
git commit -m "Added new furniture type"
git push
```

**Use Local Machine for building:**
```bash
# On your local computer
git pull

# First time setup (downloads ~500MB of dependencies)
./gradlew setupDecompWorkspace

# Build the mod
./gradlew build

# Output: build/libs/furnituresoplenty-1.20.1-1.0.1.jar
```

---

### Option 2: Full Local Setup

If you want to set up everything locally:

#### Step 1: Install Requirements
- **Java 17 JDK** (required for Minecraft 1.20.1)
  - Download: https://adoptium.net/temurin/releases/
- **IntelliJ IDEA** or **Eclipse IDE**

#### Step 2: Clone Repository
```bash
git clone https://github.com/RSlover521/Furnitures-O-Plenty.git
cd Furnitures-O-Plenty
```

#### Step 3: Initial Gradle Setup
```bash
# Make gradlew executable (Linux/Mac)
chmod +x gradlew

# Windows: Use gradlew.bat instead

# Download dependencies and set up workspace
./gradlew setupDecompWorkspace

# This will:
# - Download Minecraft 1.20.1
# - Download Forge 47.4.0
# - Decompile Minecraft source
# - Set up development environment
# Takes 5-15 minutes depending on internet speed
```

#### Step 4: Generate IDE Files

**For IntelliJ IDEA:**
```bash
./gradlew genIntellijRuns
# Then: File > Open > Select build.gradle
```

**For Eclipse:**
```bash
./gradlew eclipse
# Then: File > Import > Existing Projects
```

#### Step 5: Build the Mod
```bash
./gradlew build
```

Your mod JAR will be at: `build/libs/furnituresoplenty-1.20.1-1.0.1.jar`

---

### Option 3: Pre-Cached Offline Development

If you've set up Gradle on another machine, you can transfer the cache:

#### On Machine WITH Internet:
```bash
# Complete initial setup
./gradlew build

# Copy these folders to USB/cloud:
# 1. Entire project directory
# 2. ~/.gradle/caches/ folder (contains downloaded dependencies)
```

#### On Offline Machine:
```bash
# Place .gradle/caches in your home directory
# Copy project files

# Build in offline mode
./gradlew build --offline
```

---

## Testing Your Mod

### Step 1: Install Minecraft & Forge
1. Download **Minecraft Java Edition 1.20.1**
2. Install **Forge 47.4.0** for 1.20.1
   - From: https://files.minecraftforge.net/

### Step 2: Install Dependencies
Place these mods in your `.minecraft/mods/` folder:
- Biomes O' Plenty 19.0.0.96+
- Refurbished Furniture 1.0.14+
- Framework 0.7.15
- TerraBlender 3.0.1.10
- (Optional) Glitchcore 0.0.1.1

### Step 3: Install Your Mod
```bash
# Copy your built JAR to mods folder
cp build/libs/furnituresoplenty-1.20.1-1.0.1.jar ~/.minecraft/mods/

# Or on Windows
# copy build\libs\furnituresoplenty-1.20.1-1.0.1.jar "%APPDATA%\.minecraft\mods\"
```

### Step 4: Launch Minecraft
- Run Forge 1.20.1 profile
- Check for your mod in the Mods menu
- Test furniture in Creative mode

---

## Development Commands

### Building
```bash
# Clean build
./gradlew clean build

# Build without tests
./gradlew build -x test

# Refresh dependencies
./gradlew build --refresh-dependencies
```

### Running Minecraft from IDE
```bash
# Run client (for testing)
./gradlew runClient

# Run server (for server-side testing)
./gradlew runServer

# Run with specific JVM memory
./gradlew runClient -Xmx4G
```

### Data Generation
```bash
# Generate recipes, models, etc.
./gradlew runData
```

---

## Troubleshooting

### "piston-meta.mojang.com" UnknownHostException
**Cause**: No internet access to Mojang servers  
**Solution**: Must run initial setup on machine with internet

### "Could not resolve net.minecraftforge:forge"
**Cause**: Forge dependencies not downloaded  
**Solution**: Run `./gradlew build --refresh-dependencies` with internet

### Java Version Mismatch
**Issue**: Project requires Java 17, but different version installed  
**Check**: `java -version`  
**Solution**: Install Java 17 JDK from https://adoptium.net/

### Out of Memory Error
**Issue**: `java.lang.OutOfMemoryError: Java heap space`  
**Solution**: Edit `gradle.properties`:
```properties
org.gradle.jvmargs=-Xmx6G -Xms2G
```

---

## Current Replit Status

✅ **Gradle Wrapper**: Installed (v8.8)  
✅ **Java**: Installed (v19.0.2 - Note: Project needs v17)  
✅ **Source Files**: All present and editable  
❌ **Network Access**: Cannot reach Mojang servers  
❌ **Dependencies**: Not downloaded yet  

## Recommended Action

**For now, use Replit for:**
- Code editing and development
- Git version control
- Collaboration and code review

**Set up local environment for:**
- Building the mod JAR
- Testing in Minecraft
- Creating releases

This gives you the best of both worlds - cloud-based editing with local testing capabilities!
