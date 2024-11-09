package de.shadowx202.customitemsapi;

import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public interface CustomItem extends Listener {

    @NotNull String getId();

    @NotNull ItemStack getItemStack();

    void setItemStack(ItemStack itemStack);

    ItemStack create();
}
