# Furnitures O' Plenty - Minecraft Forge Mod

## Overview
Furnitures O' Plenty is a Minecraft Forge mod for version 1.20.1 that expands decorating possibilities by bringing together Biomes O' Plenty and MrCrayfish's Refurbished Furniture Mod. The mod adds furniture variants crafted from every unique Biomes O' Plenty wood type (maple, umbran, fir, pine, redwood, mahogany, jacaranda, palm, willow, dead, magic, hellbark, and empyreal).

**Current Status**: Beta - Use wisely  
**Author**: RSlover521  
**License**: MIT  
**Version**: 1.0.1

## Project Structure

### Source Code
- `src/main/java/com/rslover521/furnituresoplenty/` - Main mod source code
  - `FurnituresOPlenty.java` - Main mod class with initialization logic
  - `customFurnitures/` - Custom furniture block implementations (chairs, tables, desks, etc.)
  - `customBlockEntities/` - Block entities for furniture with tile data (crates, drawers, sinks, etc.)
  - `modItems/` - Registration classes for blocks, block entities, and creative tabs
  - `util/` - Utility classes for JSON generation and translations

### Resources
- `src/main/resources/` - Mod assets and data
  - `assets/furnituresoplenty/` - Client-side assets (models, textures, blockstates, lang files)
  - `data/furnituresoplenty/` - Server-side data (recipes, loot tables, advancements)
  - `META-INF/mods.toml` - Mod metadata and dependency declarations

### Dependencies (in `libs/`)
- BiomesOPlenty-forge-1.20.1-19.0.0.96.jar
- refurbished_furniture-forge-1.20.1-1.0.14.jar
- framework-forge-1.20.1-0.7.15.jar
- TerraBlender-forge-1.20.1-3.0.1.10.jar

## Build System
The project uses **Gradle 8.8** with **ForgeGradle** plugin for building Minecraft mods.

### Requirements
- Java 17 (JDK) - Required by Minecraft 1.20.1
- Minecraft Forge 47.4.0
- Network access to Maven repositories (piston-meta.mojang.com, cursemaven.com)

### Build Commands
```bash
# Build the mod JAR
./gradlew build

# Run Minecraft client in dev environment
./gradlew runClient

# Run Minecraft server in dev environment
./gradlew runServer

# Generate data (recipes, models, etc.)
./gradlew runData
```

### Output
Built mod JAR will be located at:
`build/libs/furnituresoplenty-1.20.1-1.0.1.jar`

## Recent Changes
- **2025-10-29**: Initial Replit environment setup
  - Project imported from GitHub
  - Gradle wrapper configured (v8.8)
  - Documentation created

## Important Notes

### Network Limitations
This project requires network access to Mojang's servers and various Maven repositories to download Minecraft dependencies. In restricted environments, the full build process may not work. The mod JARs in the `libs/` folder serve as local fallbacks for some dependencies.

### Development in Replit
This is a **development project** for creating a Minecraft mod, not a web application. It cannot run a live Minecraft instance within Replit. The project is designed for:
1. Editing mod source code
2. Building the mod JAR file (when network access permits)
3. Version control and collaboration

To test the mod:
1. Build the JAR locally with full network access
2. Copy the JAR to your Minecraft mods folder
3. Run Minecraft 1.20.1 with Forge and required dependencies

## Furniture Types Included
- **Chairs** - All 13 wood types
- **Tables** - All 13 wood types  
- **Desks** - All 13 wood types
- **Storage Cabinets** - All 13 wood types
- **Kitchen Cabinetry** - All 13 wood types
- **Drawers & Kitchen Drawers** - All 13 wood types
- **Crates** - All 13 wood types
- **Basins & Kitchen Sinks** - All 13 wood types
- **Baths & Toilets** - All 13 wood types
- **Ceiling Fans** - All 13 wood types
- **Mailboxes** - All 13 wood types
- **Lattice Fences & Gates** - All 13 wood types
- **Cutting Boards** - All 13 wood types
- **Storage Jars** - All 13 wood types

## Configuration
Server-side configuration available through `Config.java` for enabling/disabling features and logging options.

## Links
- GitHub Repository: https://github.com/RSlover521/Furnitures-O-Plenty
- Biomes O' Plenty: CurseForge mod 220318
- Refurbished Furniture: CurseForge mod 897116
