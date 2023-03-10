package com.jelly.MightyMiner.utils.HypixelUtils;

import com.jelly.MightyMiner.MightyMiner;
import com.jelly.MightyMiner.utils.BlockUtils.BlockData;
import com.jelly.MightyMiner.utils.LogUtils;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;

import java.awt.*;
import java.util.ArrayList;

public class MineUtils {

    public static EnumDyeColor[] gemPriority = {null, EnumDyeColor.RED, EnumDyeColor.PURPLE, EnumDyeColor.LIME, EnumDyeColor.LIGHT_BLUE, EnumDyeColor.ORANGE, EnumDyeColor.YELLOW};
    public static ArrayList<BlockData<EnumDyeColor>> getGemListBasedOnPriority(int priority) {
        ArrayList<BlockData<EnumDyeColor>> filter = new ArrayList<>();
        filter.add(new BlockData<>(Blocks.stained_glass, gemPriority[priority]));
        if(MightyMiner.config.aotvMineGemstonePanes)
            filter.add(new BlockData<>(Blocks.stained_glass_pane, gemPriority[priority]));
        return filter;
    }

    public static ArrayList<BlockData<EnumDyeColor>> getMithrilColorBasedOnPriority(int priority) {
        switch (priority) {
            case 0:
                return new ArrayList<BlockData<EnumDyeColor>>() {{
                    add(new BlockData<>(Blocks.stained_hardened_clay, null));
                    add(new BlockData<>(Blocks.wool, EnumDyeColor.GRAY));
                }};
            case 1:
                return new ArrayList<BlockData<EnumDyeColor>>() {{
                    add(new BlockData<>(Blocks.prismarine, null));
                }};
            case 2:
                return new ArrayList<BlockData<EnumDyeColor>>() {{
                    add(new BlockData<>(Blocks.wool, EnumDyeColor.LIGHT_BLUE));
                }};
            default:
                return null;
        }
    }

}
