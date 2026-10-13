package name.rebornkalinga;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Personalmod implements ModInitializer {
	public static final String MOD_ID = "personalmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("first time using logger kinda nervous");
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
			dispatcher.register(Commands.literal("delhisultanate").executes(context -> {
				context.getSource().sendSuccess(() -> Component.literal("The Delhi Sultanate was a major Islamic empire based in Delhi that ruled large parts of the Indian subcontinent for 320 years, from 1206 to 1526."), false);
				return 1;
			}));
		});
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
