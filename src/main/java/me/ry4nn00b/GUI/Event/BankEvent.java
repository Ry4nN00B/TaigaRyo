package me.ry4nn00b.GUI.Event;

import me.ry4nn00b.GUI.Menu;
import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


public class BankEvent implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e){

        Player p = (Player) e.getWhoClicked();

        //-----------------------------------------------------------------------------------------------------

        if(e.getInventory().getTitle().equalsIgnoreCase("§a§lBanco")){

            //--------------------------------------------------------------------------------------------------

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lDepositar")){
                e.setCancelled(true);
                p.openInventory(Menu.deposit());
                p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.A));

            }

            //--------------------------------------------------------------------------------------------------

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lSacar")){
                e.setCancelled(true);
                p.openInventory(Menu.withdraw());
                p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.A));

            }

            //--------------------------------------------------------------------------------------------------

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lFechar")){
                e.setCancelled(true);
                p.closeInventory();

            }

        }

    }

}
