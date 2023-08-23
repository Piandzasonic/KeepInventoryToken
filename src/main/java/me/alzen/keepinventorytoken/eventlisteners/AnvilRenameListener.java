package me.alzen.keepinventorytoken.eventlisteners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;

import java.util.Objects;

public class AnvilRenameListener implements Listener {
    @EventHandler
    public void onAnvilRename(PrepareAnvilEvent event) {
        String newName = event.getInventory().getRenameText();
        if(Objects.requireNonNull(newName).equalsIgnoreCase("Keep Inventory Token")) {
            event.setResult(null);
            event.getInventory().setRepairCost(0);
        }
    }
}
