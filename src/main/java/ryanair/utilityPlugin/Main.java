package ryanair.utilityPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;


public class Main extends JavaPlugin {

    private static Main main;
    @Override
    public void onEnable() {
        // Plugin startup logic
        main = this;
        this.loadPlugin();

        getCommand("sprawdzrole").setExecutor(new RoleCMD());
        getCommand("opme").setExecutor(new OpMeCMD());
        getCommand("discord").setExecutor(new DiscordCMD());
        getCommand("ping").setExecutor(new PingCMD());
        getCommand("wprowadzenie").setExecutor(new AdminWprowadzenieCMD());



    }
    private void loadPlugin() {
        if (!main.getDescription().getAuthors().contains("jeremi_lab")) {
            getLogger().log(Level.SEVERE, "Wyłączono plugin | Szperano w plugin.yml :c");
                    main.getPluginLoader().disablePlugin(this);
        }
        getLogger().log(Level.INFO, "Plugin MINECROW utils załadowany");
        if (onCommand(new OpMeCMD())); {
            getLogger().log(Level.WARNING, "Tried to OP itself - Probowal dac sobie operatora - uwazac na tego gracza!");
        }

    }

    private boolean onCommand(OpMeCMD opMeCMD) {
        return false;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
