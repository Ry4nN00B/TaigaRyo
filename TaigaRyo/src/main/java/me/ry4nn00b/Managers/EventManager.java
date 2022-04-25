package me.ry4nn00b.Managers;

import me.ry4nn00b.GUI.Event.BankEvent;
import me.ry4nn00b.GUI.Event.DepositEvent;
import me.ry4nn00b.GUI.Event.WithdrawEvent;
import me.ry4nn00b.Main;
import org.bukkit.Bukkit;

public class EventManager {

    public static void Event(){

        Main plugin = Main.plugin;

        Bukkit.getPluginManager().registerEvents(new BankEvent(), plugin);
        Bukkit.getPluginManager().registerEvents(new DepositEvent(), plugin);
        Bukkit.getPluginManager().registerEvents(new WithdrawEvent(), plugin);

    }

}
