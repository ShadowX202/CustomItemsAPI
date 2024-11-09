package de.shadowx202.customitemsapi;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface CustomItemRegister {

    boolean addItem(String id, ItemStack itemStack);
    boolean addItem(CustomItem customItem);

    boolean removeItem(String id);
    boolean removeItem(CustomItem item);

    CustomItem getItem(String id);
    CustomItem getItem(ItemStack itemStack);

    List<CustomItem> getItems();

}
