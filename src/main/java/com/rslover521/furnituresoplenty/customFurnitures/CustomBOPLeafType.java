package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.LeafType;

public enum CustomBOPLeafType {

    FLOWERING_OAK("flowering_oak", "Flowering Oak"),
    CYPRESS("cypress", "Cypress"),
    SNOWBLOSSOM("snowblossom", "Snowblossom"),
    RAINBOW_BIRCH("rainbow_birch", "Rainbow Birch"),
    FIR("fir", "Fir"),
    PINE("pine", "Pine"),
    RED_MAPLE("red_maple", "Red Maple"),
    ORANGE_MAPLE("orange_maple", "Orange Maple"),
    YELLOW_MAPLE("yellow_maple", "Yellow Maple"),
    REDWOOD("redwood", "Redwood"),
    MAHOGANY("mahogany", "Mahogany"),
    JACARANDA("jacaranda", "Jacaranda"),
    PALM("palm", "Palm"),
	DEAD("dead", "Dead"),
    WILLOW("willow", "Willow"),
    MAGIC("magic", "Magic"),
    UMBRAN("umbran", "Umbran"),
    HELLBARK("hellbark", "Hellbark"),
    EMPYREAL("empyreal", "Empyreal"),
    BRAMBLE("bramble", "Bramble");

    private final String id;
    private final String displayName;

    CustomBOPLeafType(String id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

	public LeafType toLeafType() {
        // You can tweak this mapping however you want
        return switch (this) {
			case FLOWERING_OAK -> LeafType.AZALEA;
			case CYPRESS -> LeafType.SPRUCE;
			case SNOWBLOSSOM -> LeafType.CHERRY;
			case RAINBOW_BIRCH -> LeafType.BIRCH;
            case FIR -> LeafType.SPRUCE;
			case PINE -> LeafType.SPRUCE;
			case RED_MAPLE -> LeafType.OAK;
			case YELLOW_MAPLE -> LeafType.OAK;
			case ORANGE_MAPLE -> LeafType.OAK;
            case REDWOOD -> LeafType.SPRUCE;
			case MAHOGANY -> LeafType.JUNGLE;
			case JACARANDA -> LeafType.CHERRY;
			case PALM -> LeafType.JUNGLE;
			case DEAD -> LeafType.DARK_OAK;
			case MAGIC -> LeafType.AZALEA;
			case WILLOW -> LeafType.OAK;
			case UMBRAN -> LeafType.DARK_OAK;
			case HELLBARK -> LeafType.DARK_OAK;
			case EMPYREAL -> LeafType.CHERRY;
			case BRAMBLE -> LeafType.OAK;
            default -> LeafType.OAK;
        };
    }
}