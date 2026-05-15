package github.killarexe.copper_extension;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Item;
import oshi.util.tuples.Pair;

import java.util.ArrayList;
import java.util.HashMap;

public class CEMaps {
    public static final HashMap<Item, Pair<Item, Float>> OXIDATION_MAP_ITEMS = new HashMap<>();
    public static final HashMap<Item, Item> WAXING_MAP_ITEMS = new HashMap<>();
    public static final HashMap<Item, ArrayList<MobEffectInstance>> ARMOR_EFFECTS = new HashMap<>();
}
