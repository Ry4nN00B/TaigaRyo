package me.ry4nn00b.GUI;

import me.ry4nn00b.Utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static Inventory deposit(){

        List<String> ryo500 = new ArrayList<>();
        ryo500.add(" ");
        ryo500.add("§7Moeda Comercial");
        ryo500.add(" ");
        ryo500.add("§7Clique com botão direito para depositar uma moeda de 500 Ryô.");
        ryo500.add("§7Clique com botão direito para depositar todas as moedas de 500 Ryô.");

        List<String> ryo1000 = new ArrayList<>();
        ryo1000.add(" ");
        ryo1000.add("§7Moeda Comercial");
        ryo1000.add(" ");
        ryo1000.add("§7Clique com botão direito para depositar uma moeda de 1000 Ryô.");
        ryo1000.add("§7Clique com botão direito para depositar todas as moedas de 1000 Ryô.");

        List<String> ryo100000 = new ArrayList<>();
        ryo100000.add(" ");
        ryo100000.add("§7Moeda Comercial");
        ryo100000.add(" ");
        ryo100000.add("§7Clique com botão direito para depositar 100000 Ryô.");
        ryo100000.add("§7Clique com botão direito para depositar todas as moedas de 100000 Ryô.");

        Inventory deposit = Bukkit.createInventory(null, 9*5, "§a§lDeposito");

        deposit.setItem(11,
                new ItemBuilder(Material.getMaterial(4463)).setName("§6500 Ryô").setLore(ryo500).build());

        deposit.setItem(13,
                new ItemBuilder(Material.getMaterial(4464)).setName("§61000 Ryô").setLore(ryo1000).build());

        deposit.setItem(15,
                new ItemBuilder(Material.getMaterial(4465)).setName("§6100000 Ryô").setLore(ryo100000).build());

        deposit.setItem(40,
                new ItemBuilder(Material.REDSTONE_BLOCK).setName("§c§lFechar").build());

        return deposit;

    }

    public static Inventory withdraw(){

        List<String> ryo500 = new ArrayList<>();
        ryo500.add(" ");
        ryo500.add("§8Moeda Comercial");
        ryo500.add(" ");
        ryo500.add("§7Clique para sacar.");

        List<String> ryo1000 = new ArrayList<>();
        ryo1000.add(" ");
        ryo1000.add("§7Moeda Comercial");
        ryo1000.add(" ");
        ryo1000.add("§7Clique para sacar.");

        List<String> ryo100000 = new ArrayList<>();
        ryo100000.add(" ");
        ryo100000.add("§7Moeda Comercial");
        ryo100000.add(" ");
        ryo100000.add("§7Clique para sacar.");

        Inventory withdraw = Bukkit.createInventory(null, 9*5, "§a§lSaque");

        withdraw.setItem(11,
                new ItemBuilder(Material.getMaterial(4463)).setName("§6500 Ryô").setLore(ryo500).build());

        withdraw.setItem(13,
                new ItemBuilder(Material.getMaterial(4464)).setName("§61000 Ryô").setLore(ryo1000).build());

        withdraw.setItem(15,
                new ItemBuilder(Material.getMaterial(4465)).setName("§6100000 Ryô").setLore(ryo100000).build());

        withdraw.setItem(40,
                new ItemBuilder(Material.REDSTONE_BLOCK).setName("§c§lFechar").build());

        return withdraw;

    }

}
