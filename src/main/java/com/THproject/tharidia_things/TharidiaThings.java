package com.THproject.tharidia_things;

import com.THproject.tharidia_things.item.BattleGauntleAttachments;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(TharidiaThings.MODID)
public class TharidiaThings {
    public static final String MODID = "tharidiathings";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TharidiaThings(IEventBus modEventBus, ModContainer modContainer) {
        // Register attachments
        BattleGauntleAttachments.ATTACHMENT_TYPES.register(modEventBus);
        // Register items
        ITEMS.register(modEventBus);

        
        LOGGER.info("Tharidia Things - Duel System Loaded");
    }

}
