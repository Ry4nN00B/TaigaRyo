package me.ry4nn00b.GUI;

import me.ry4nn00b.Main;
import me.ry4nn00b.Utils.ItemBuilder;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.RegisteredServiceProvider;

import java.util.ArrayList;
import java.util.List;

public class RyoCommand implements CommandExecutor {

    public Economy economy;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("ryo")) {
            setupEconomy();

            List<String> saldolore = new ArrayList<>();
            saldolore.add("§a§lSaldo Atual: §f" + economy.getBalance(p.getPlayer()));

            List<String> deposito = new ArrayList<>();
            deposito.add("§7Clique para ver as opçoes de deposito.");

            List<String> saque = new ArrayList<>();
            saque.add("§7Clique para ver as opçoes de saque.");

            Inventory banco = Bukkit.createInventory(null, 9*5, "§a§lBanco");

            banco.setItem(4, new ItemBuilder(Material.BOOK).setName("§6§lSaldo Atual").setLore(saldolore).build());
            banco.setItem(21, new ItemBuilder(Material.WOOL, 1, (short) 5).setName("§a§lDepositar").setLore(deposito).build());
            banco.setItem(23, new ItemBuilder(Material.WOOL, 1, (short) 14).setName("§c§lSacar").setLore(saque).build());
            banco.setItem(40, new ItemBuilder(Material.REDSTONE_BLOCK).setName("§c§lFechar").build());

            p.openInventory(banco);
            p.sendMessage("§4§l! §6Naruto TAIGA §8» §fBanco Aberto.");

        }

        return false;
    }

    private boolean setupEconomy() {
        RegisteredServiceProvider<Economy> economyProvider = Main.getInstance().getServer().getServicesManager().getRegistration(Economy.class);
        if (economyProvider != null)
            this.economy = (Economy)economyProvider.getProvider();
        return (this.economy != null);
    }

}
