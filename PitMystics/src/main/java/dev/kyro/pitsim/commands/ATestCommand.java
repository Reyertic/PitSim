package dev.kyro.pitsim.commands;

import dev.kyro.arcticapi.misc.AOutput;
import dev.kyro.pitsim.controllers.MapManager;
import dev.kyro.pitsim.controllers.log.DupeManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ATestCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) return false;
		if(!sender.isOp()) return false;

		if(args.length > 0) MapManager.disableMultiLobbies(true);
		else MapManager.enableMultiLobbies();


//		AOutput.send(sender, "Running dupe manager");
//		DupeManager.run();

		return false;
	}
}