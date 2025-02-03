package ryanair.utilityPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class RoleCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
    sender.sendMessage(ChatColor.GOLD+""+ ChatColor.BOLD + "ROLE »" + " " + ChatColor.AQUA + "Twoja ranga to:" + " %luckperms_prefix%");
        return false;
    }
}
