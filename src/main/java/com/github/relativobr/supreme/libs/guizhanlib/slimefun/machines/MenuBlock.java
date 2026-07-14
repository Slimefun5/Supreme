package com.github.relativobr.supreme.libs.guizhanlib.slimefun.machines;

import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun5.core.handlers.BlockPlaceHandler;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.inventory.DirtyChestMenu;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

/**
 * A {@link MenuBlock} is a {@link SlimefunItem} with {@link MenuBlockPreset}.
 * <p>
 * Vendored Java-8-safe port of GuizhanLib 0.9.0's {@code MenuBlock} (itself "Modified from
 * InfinityLib"): the upstream jar is class-file version 60 (Java 16) and cannot be read by a
 * Java-8 javac as a compile dependency, so this single Slimefun-facing class Supreme depended on
 * is vendored directly instead. Only the API package was migrated (slimefun4 -> slimefun5); the
 * logic is unchanged from upstream.
 *
 * @author Mooy1 (InfinityLib original)
 * @author ybw0014 (GuizhanLib port)
 */
@ParametersAreNonnullByDefault
public abstract class MenuBlock extends SlimefunItem {

    /**
     * Constructor of {@link MenuBlock}.
     * Add events on break and place
     *
     * @param itemGroup the {@link ItemGroup} of this {@link MenuBlock}
     * @param item the {@link SlimefunItemStack} of this {@link MenuBlock}
     * @param recipeType the {@link RecipeType} of this {@link MenuBlock}
     * @param recipe the recipe of this {@link MenuBlock}
     */
    public MenuBlock(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);

        addItemHandler(
            new BlockBreakHandler(false, false) {
                @Override
                public void onPlayerBreak(BlockBreakEvent e, ItemStack itemStack, List<ItemStack> list) {
                    BlockMenu menu = BlockStorage.getInventory(e.getBlock());
                    if (menu != null) {
                        onBreak(e, menu);
                    }
                }
            },
            new BlockPlaceHandler(false) {
                @Override
                public void onPlayerPlace(BlockPlaceEvent e) {
                    onPlace(e, e.getBlockPlaced());
                }
            }
        );
    }

    @Override
    public final void postRegister() {
        new MenuBlockPreset(this);
    }

    protected abstract void setup(BlockMenuPreset preset);

    @Nonnull
    protected final int[] getTransportSlots(DirtyChestMenu menu, ItemTransportFlow flow, ItemStack item) {
        switch (flow) {
            case INSERT:
                return getInputSlots(menu, item);
            case WITHDRAW:
                return getOutputSlots();
            default:
                return new int[0];
        }
    }

    protected int[] getInputSlots(DirtyChestMenu menu, ItemStack item) {
        return getInputSlots();
    }

    protected abstract int[] getInputSlots();

    protected abstract int[] getOutputSlots();

    protected void onNewInstance(BlockMenu menu, Block b) {

    }

    protected void onBreak(BlockBreakEvent e, BlockMenu menu) {
        Location l = menu.getLocation();
        menu.dropItems(l, getInputSlots());
        menu.dropItems(l, getOutputSlots());
    }

    protected void onPlace(BlockPlaceEvent e, Block b) {

    }
}
