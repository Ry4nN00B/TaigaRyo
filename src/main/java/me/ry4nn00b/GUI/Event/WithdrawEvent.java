package me.ry4nn00b.GUI.Event;

import me.ry4nn00b.Main;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.RegisteredServiceProvider;

import java.util.ArrayList;
import java.util.List;

public class WithdrawEvent implements Listener {

    public Economy economy;

    @EventHandler
    public void onclick(InventoryClickEvent e) {

        String sryo500 = "§4§l! §6Naruto TAIGA §8» §fVocê sacou §6500 Ryô.";
        String sryo1000 = "§4§l! §6Naruto TAIGA §8» §fVocê sacou §61000 Ryô.";
        String sryo100000 = "§4§l! §6Naruto TAIGA §8» §fVocê sacou §6100000 Ryô.";
        String error = "§4§l! §6Naruto TAIGA §8» §fVocê não possui dinheiro suficiente.";

        List<String> alllore = new ArrayList<>();
        alllore.add(" ");
        alllore.add("§7Moeda Comercial");
        alllore.add(" ");

        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getTitle().equalsIgnoreCase("§a§lSaque")) {
            e.setCancelled(true);

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6500 Ryô")) {
                setupEconomy();

                p.playSound(p.getLocation(), Sound.NOTE_PIANO, 10.0F, 1.0F);

                if(economy.getBalance(p.getPlayer()) >= 500.0D){

                    economy.withdrawPlayer(p.getPlayer(), 500.0D);

                    ItemStack ryo500 = new ItemStack(Material.getMaterial(4463));
                    ItemMeta metaryo500 = ryo500.getItemMeta();
                    metaryo500.setDisplayName("§6500 Ryô");
                    metaryo500.setLore(alllore);
                    ryo500.setItemMeta(metaryo500);

                    p.getInventory().addItem(ryo500);
                    p.sendMessage(sryo500);

                    return;

                }else {

                    p.sendMessage(error);

                }

            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§61000 Ryô")) {
                setupEconomy();

                p.playSound(p.getLocation(), Sound.NOTE_PIANO, 10.0F, 1.0F);

                if(economy.getBalance(p.getPlayer()) >= 1000.0D){

                    economy.withdrawPlayer(p.getPlayer(), 1000.0D);

                    ItemStack ryo1000 = new ItemStack(Material.getMaterial(4464));
                    ItemMeta metaryo1000 = ryo1000.getItemMeta();
                    metaryo1000.setDisplayName("§61000 Ryô");
                    metaryo1000.setLore(alllore);
                    ryo1000.setItemMeta(metaryo1000);

                    p.getInventory().addItem(new ItemStack(ryo1000));
                    p.sendMessage(sryo1000);

                    return;

                }else {

                    p.sendMessage(error);

                }

            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6100000 Ryô")) {
                setupEconomy();

                p.playSound(p.getLocation(), Sound.NOTE_PIANO, 10.0F, 1.0F);

                if(economy.getBalance(p.getPlayer()) >= 100000.0D){

                    economy.withdrawPlayer(p.getPlayer(), 100000.0D);

                    ItemStack ryo100000 = new ItemStack(Material.getMaterial(4465));
                    ItemMeta metaryo100000 = ryo100000.getItemMeta();
                    metaryo100000.setDisplayName("§6100000 Ryô");
                    metaryo100000.setLore(alllore);
                    ryo100000.setItemMeta(metaryo100000);

                    p.getInventory().addItem(new ItemStack(ryo100000));
                    p.sendMessage(sryo100000);

                    return;

                }else {

                    p.sendMessage(error);

                }

            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lFechar")) {

                p.closeInventory();

            }

        }

    }

    private boolean setupEconomy() {
        RegisteredServiceProvider<Economy> economyProvider = Main.getInstance().getServer().getServicesManager().getRegistration(Economy.class);
        if (economyProvider != null)
            this.economy = (Economy)economyProvider.getProvider();
        return (this.economy != null);
    }

}
