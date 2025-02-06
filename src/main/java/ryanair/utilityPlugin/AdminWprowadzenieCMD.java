package ryanair.utilityPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class AdminWprowadzenieCMD implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (sender.hasPermission("minecrow.admin")) {
            sender.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Witaj administratorze!");
            sender.sendMessage(ChatColor.AQUA + "Wszystkie swoje permisje masz wypisane na kanale #cmd-adm!");
            sender.sendMessage(ChatColor.AQUA + "Tutaj masz kilka porad:");
            sender.sendMessage(ChatColor.AQUA + "Aby uruchomić alerty od AC wpisz /grim alerts, jeśli pojawi się (Grim) Alerts enabled, wtedy będziesz otrzymywał powiadomienia od AC. ");
        }
        return false;
    }
}
