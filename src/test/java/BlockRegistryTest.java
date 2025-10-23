import net.minecraft.core.registries.BuiltInRegistries;

public class BlockRegistryTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println("=== Registered Blocks in Furnitures O' Plenty ===");
		BuiltInRegistries.BLOCK.stream()
			.filter(block -> BuiltInRegistries.BLOCK.getKey(block) != null)
			.filter(block -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals("furnituresoplenty"))
			.forEach(block -> {
				var id = BuiltInRegistries.BLOCK.getKey(block);
				System.out.println("Block: " + id + "| Class: " + block.getClass().getSimpleName());
			});

			System.out.println("=== End of List ===");
	}
}
