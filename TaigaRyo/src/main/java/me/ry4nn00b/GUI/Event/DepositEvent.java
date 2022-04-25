package me.ry4nn00b.GUI.Event;

import me.ry4nn00b.Main;
import me.ry4nn00b.Utils.ItemBuilder;
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

public class DepositEvent implements Listener {

    public Economy economy;

    @EventHandler
    public void onclick(InventoryClickEvent e){

        Player p = (Player) e.getWhoClicked();

        List<String> alllore = new ArrayList<>();
        alllore.add(" ");
        alllore.add("§7Moeda Comercial");
        alllore.add(" ");

        ItemStack ryo500 = new ItemStack(Material.getMaterial(4463));
        ItemMeta metaryo500 = ryo500.getItemMeta();
        metaryo500.setDisplayName("§6500 Ryô");
        metaryo500.setLore(alllore);
        ryo500.setItemMeta(metaryo500);

        ItemStack ryo1000 = new ItemStack(Material.getMaterial(4464));
        ItemMeta metaryo1000 = ryo1000.getItemMeta();
        metaryo1000.setDisplayName("§61000 Ryô");
        metaryo1000.setLore(alllore);
        ryo1000.setItemMeta(metaryo1000);

        ItemStack ryo100000 = new ItemStack(Material.getMaterial(4465));
        ItemMeta metaryo100000 = ryo100000.getItemMeta();
        metaryo100000.setDisplayName("§6100000 Ryô");
        metaryo100000.setLore(alllore);
        ryo100000.setItemMeta(metaryo100000);

        int amryo500 = getAmount(ryo500, p);
        int amryo1000 = getAmount(ryo1000, p);
        int amryo100000 = getAmount(ryo100000, p);

        String sryo500 = "§4§l! §6Naruto TAIGA §8» §fVocê depositou §6500 Ryô.";
        String sryo1000 = "§4§l! §6Naruto TAIGA §8» §fVocê depositou §61000 Ryô.";
        String sryo100000 = "§4§l! §6Naruto TAIGA §8» §fVocê depositou §6100000 Ryô.";
        String error = "§4§l! §6Naruto TAIGA §8» §fVocê não possui dinheiro suficiente.";

        String sryo500m = "§4§l! §6Naruto TAIGA §8» §fVocê depositou §6§l" + 500*amryo500 + " Ryô.";
        String sryo1000m = "§4§l! §6Naruto TAIGA §8» §fVocê depositou §6§l" + 1000*amryo1000 + " Ryô.";
        String sryo100000m = "§4§l! §6Naruto TAIGA §8» §fVocê depositou §6§l" + 100000*amryo100000 + " Ryô.";

        if(e.getInventory().getTitle().equalsIgnoreCase("§a§lDeposito")){
            e.setCancelled(true);

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6500 Ryô")){
                setupEconomy();

                if(e.getClick().isLeftClick()){

                    if(p.getInventory().containsAtLeast(ryo500, 1)){

                        p.getInventory().removeItem(ryo500);
                        economy.depositPlayer(p.getPlayer(), 500.0D);
                        p.sendMessage(sryo500);
                        p.playSound(p.getLocation(), Sound.NOTE_PIANO, 10.0F, 1.0F);

                    }else {

                        p.sendMessage(error);

                    }

                }

                if(e.getClick().isRightClick()){

                    if(p.getInventory().containsAtLeast(ryo500, 1)){

                        p.getInventory().removeItem(new ItemBuilder(Material.getMaterial(4463), amryo500).build());
                        economy.depositPlayer(p.getPlayer(), 500.0*amryo500);
                        p.sendMessage(sryo500m);
                        p.playSound(p.getLocation(), Sound.NOTE_PIANO, 10.0F, 1.0F);

                    }else {

                        p.sendMessage(error);

                    }

                }

            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§61000 Ryô")){
                setupEconomy();

                if(e.getClick().isLeftClick()){

                    if(p.getInventory().containsAtLeast(ryo1000, 1)){

                        p.getInventory().removeItem(ryo1000);
                        economy.depositPlayer(p.getPlayer(), 1000.0D);
                        p.sendMessage(sryo1000);
                        p.playSound(p.getLocation(), Sound.NOTE_PIANO, 10.0F, 1.0F);

                    }else {

                        p.sendMessage(error);

                    }

                }

                if(e.getClick().isRightClick()){

                    if(p.getInventory().containsAtLeast(ryo1000, 1)){

                        p.getInventory().removeItem(new ItemBuilder(Material.getMaterial(4464), amryo1000).build());
                        economy.depositPlayer(p.getPlayer(), 1000.0*amryo1000);
                        p.sendMessage(sryo1000m);
                        p.playSound(p.getLocation(), Sound.NOTE_PIANO, 10.0F, 1.0F);

                    }else {

                        p.sendMessage(error);

                    }

                }

            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6100000 Ryô")){
                setupEconomy();

                if(e.getClick().isLeftClick()){

                    if(p.getInventory().containsAtLeast(ryo100000, 1)){

                        p.getInventory().removeItem(ryo100000);
                        economy.depositPlayer(p.getPlayer(), 100000.0D);
                        p.sendMessage(sryo100000);
                        p.playSound(p.getLocation(), Sound.NOTE_PIANO, 10.0F, 1.0F);

                    }else {

                        p.sendMessage(error);

                    }

                }

                if(e.getClick().isRightClick()){

                    if(p.getInventory().containsAtLeast(ryo100000, 1)){

                        p.getInventory().removeItem(new ItemBuilder(Material.getMaterial(4465), amryo100000).build());
                        economy.depositPlayer(p.getPlayer(), 100000.0*amryo100000);
                        p.sendMessage(sryo100000m);
                        p.playSound(p.getLocation(), Sound.NOTE_PIANO, 10.0F, 1.0F);

                    }else {

                        p.sendMessage(error);

                    }

                }

            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lFechar")){

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

    public static int getAmount(ItemStack item, Player p) {
        if (item == null)
            return 0;
        int amount = 0;
        for (int i = 0; i < 36; i++) {
            ItemStack s = p.getInventory().getItem(i);
            if (s != null && s.isSimilar(item))
                amount += s.getAmount();
        }
        return amount;
    }

}

