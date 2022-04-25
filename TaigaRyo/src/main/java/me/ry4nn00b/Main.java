package me.ry4nn00b;

import me.ry4nn00b.Managers.CommandManager;
import me.ry4nn00b.Managers.EventManager;
import me.ry4nn00b.Managers.FileManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class Main extends JavaPlugin {

    public static Main plugin;
    private static Main instance;

    @Override
    public void onEnable() {

        plugin = this;

        Bukkit.getConsoleSender().sendMessage("§b####################");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§aTaigaRyo Iniciado");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§aCriador: §fRy4nN00B");
        Bukkit.getConsoleSender().sendMessage("§aVersão: §f1.0");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§b####################");

        CommandManager.Command();
        EventManager.Event();
        FileManager.File();

    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage("§cTaigaRyo Desligado");

    }

    public void createFile(Main main, String fileName, boolean isFile) {
        try {
            File file = new File(main.getDataFolder() + File.separator + fileName);
            if (isFile) file.createNewFile();
            else if (!file.exists()) file.mkdirs();
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }

    public static Main getInstance() {
        if (instance == null);
        instance = (Main)getPlugin(Main.class);
        return instance;
    }
}
