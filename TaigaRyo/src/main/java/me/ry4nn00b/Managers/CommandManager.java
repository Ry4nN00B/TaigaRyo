package me.ry4nn00b.Managers;

import me.ry4nn00b.GUI.RyoCommand;
import me.ry4nn00b.Main;

import static org.bukkit.Bukkit.getPluginCommand;

public class CommandManager {

    public static void Command(){

        Main plugin = Main.plugin;

        getPluginCommand("ryo").setExecutor(new RyoCommand());

    }

}
