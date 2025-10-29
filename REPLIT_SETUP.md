# Replit Development Setup for Furnitures O' Plenty

## About This Project
This is a **Minecraft Forge mod development project** for creating and editing mod source code. It is NOT a web application and cannot run Minecraft within Replit.

## What You Can Do in Replit
✅ Edit Java source code for the mod  
✅ Modify textures, models, and JSON files  
✅ Update recipes and loot tables  
✅ Manage version control with Git  
✅ Collaborate on mod development  

## What Requires Local Setup
❌ Building the mod JAR (requires network access to Mojang servers)  
❌ Testing the mod in Minecraft  
❌ Running Minecraft client or server  

## Development Workflow

### 1. Editing Code in Replit
All mod source files are in `src/main/java/com/rslover521/furnituresoplenty/`

To add a new furniture type:
1. Create a new block class in `customFurnitures/`
2. Add the block registration in `modItems/ModBlocks.java`
3. Add the item to the creative tab in `modItems/ModCreativeTabs.java`
4. Create blockstate, model, and texture files in `src/main/resources/assets/furnituresoplenty/`

### 2. Building the Mod (Local Machine)
After editing in Replit, to build the mod:

```bash
# On your local machine with Minecraft Forge environment
./gradlew build
```

The JAR will be created at: `build/libs/furnituresoplenty-1.20.1-1.0.1.jar`

### 3. Testing the Mod
1. Copy the built JAR to your Minecraft `mods/` folder
2. Ensure you have:
   - Minecraft 1.20.1
   - Forge 47.4.0
   - Biomes O' Plenty 19.0.0.96+
   - Refurbished Furniture 1.0.14+
   - Framework 0.7.15
   - TerraBlender 3.0.1.10
3. Launch Minecraft and test your changes

## Project Files

### Important Files
- `gradle.properties` - Mod version and Minecraft/Forge versions
- `build.gradle` - Build configuration and dependencies
- `src/main/resources/META-INF/mods.toml` - Mod metadata

### Asset Structure
```
src/main/resources/assets/furnituresoplenty/
├── blockstates/    - Block state definitions
├── lang/           - Translations (en_us.json, zh_cn.json)
├── models/
│   ├── block/      - 3D block models
│   └── item/       - Item models
├── textures/       - PNG textures
└── recipes/        - Crafting recipes
```

### Data Structure
```
src/main/resources/data/furnituresoplenty/
├── advancements/   - Achievement definitions
├── loot_tables/    - Block drop tables
├── recipes/        - Crafting recipes
└── tags/           - Block/item tags
```

## Common Tasks

### Update Mod Version
Edit `gradle.properties`:
```properties
mod_version=1.0.2
```

### Add New Wood Type
1. Edit `ModBlocks.java` - Add registration for all furniture types
2. Edit `ModCreativeTabs.java` - Add items to creative tab
3. Create assets (blockstates, models, textures)
4. Add translations to `lang/en_us.json`

### Change Dependencies
Edit `build.gradle` dependencies section and update version ranges in `mods.toml`

## Troubleshooting

### LSP Errors in Replit
The Java language server will show errors because Minecraft/Forge dependencies aren't downloaded in Replit. This is expected. The code will compile correctly when built locally with full Gradle setup.

### Build Fails with Network Error
This is normal in Replit's environment. The build requires access to:
- piston-meta.mojang.com (Mojang's servers)
- cursemaven.com (mod dependencies)
- maven.minecraftforge.net (Forge libraries)

Build the project on your local machine with internet access.

## Resources
- [Minecraft Forge Documentation](https://docs.minecraftforge.net/)
- [Biomes O' Plenty on CurseForge](https://www.curseforge.com/minecraft/mc-mods/biomes-o-plenty)
- [Refurbished Furniture on CurseForge](https://www.curseforge.com/minecraft/mc-mods/refurbished-furniture)
- [Forge MDK Setup Guide](https://docs.minecraftforge.net/en/1.20.x/gettingstarted/)

## GitHub Repository
https://github.com/RSlover521/Furnitures-O-Plenty
