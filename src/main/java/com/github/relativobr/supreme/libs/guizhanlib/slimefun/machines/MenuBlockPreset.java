package com.github.relativobr.supreme.libs.guizhanlib.slimefun.machines;

import io.github.thebusybiscuit.slimefun5.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun5.libraries.dough.protection.Interaction;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.inventory.DirtyChestMenu;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@link MenuBlockPreset} is a preset of a menu block.
 * <p>
 * Vendored Java-8-safe port of GuizhanLib 0.9.0's {@code MenuBlockPreset} - see the class javadoc
 * on {@link MenuBlock} for why this is vendored rather than a compile dependency.
 *
 * @author Mooy1 (InfinityLib original)
 * @author ybw0014 (GuizhanLib port)
 */
@ParametersAreNonnullByDefault
final class MenuBlockPreset extends BlockMenuPreset {

    private final MenuBlock menuBlock;

    MenuBlockPreset(MenuBlock menuBlock) {
        super(menuBlock.getId(), menuBlock.getItemName());
        optOutOfHeaderItem();
        this.menuBlock = menuBlock;
        menuBlock.setup(this);
    }

    @Override
    public void newInstance(BlockMenu menu, Block b) {
        menuBlock.onNewInstance(menu, b);
    }

    @Override
    public int[] getSlotsAccessedByItemTransport(DirtyChestMenu menu, ItemTransportFlow flow, ItemStack item) {
        return menuBlock.getTransportSlots(menu, flow, item);
    }

    @Override
    public void init() {

    }

    @Override
    public boolean canOpen(Block b, Player p) {
        return Slimefun.getProtectionManager().hasPermission(p, b.getLocation(), Interaction.INTERACT_BLOCK)
            && menuBlock.canUse(p, false);
    }

    @Override
    public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
        return new int[0];
    }
}
