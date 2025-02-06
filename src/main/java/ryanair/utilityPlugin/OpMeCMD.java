package ryanair.utilityPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class OpMeCMD implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (!sender.hasPermission("minecrow.opme")) {
            sender.sendMessage(ChatColor.DARK_RED + "Myślisz że dostaniesz operatora? Jeśli chcesz wstąpić w szeregi ADMINISTRACJI wejdź na discorda (/discord) i poczekaj na rekrutację!");
        }
        if (sender.hasPermission("minecrow.opme")) {
            sender.sendMessage("Jesteś administratorem!");
        }

        if (sender.hasPermission("minecrow.opme.*")) {
            sender.sendMessage(ChatColor.AQUA + "Jesteś wysoką administracją używaj permisji z rozwagą!");
        }
        return false;
    }
}