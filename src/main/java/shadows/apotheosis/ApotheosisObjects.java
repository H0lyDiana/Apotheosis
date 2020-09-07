package shadows.apotheosis;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Potion;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.registries.ObjectHolder;
import shadows.apotheosis.ench.altar.SeaAltarBlock;
import shadows.apotheosis.ench.altar.SeaAltarTile;
import shadows.apotheosis.ench.anvil.AnvilTile;
import shadows.apotheosis.ench.anvil.SplittingEnchant;
import shadows.apotheosis.ench.enchantments.BerserkersFuryEnchant;
import shadows.apotheosis.ench.enchantments.HellInfusionEnchantment;
import shadows.apotheosis.ench.enchantments.IcyThornsEnchant;
import shadows.apotheosis.ench.enchantments.KnowledgeEnchant;
import shadows.apotheosis.ench.enchantments.LifeMendingEnchant;
import shadows.apotheosis.ench.enchantments.MagicProtEnchant;
import shadows.apotheosis.ench.enchantments.MinersFervorEnchant;
import shadows.apotheosis.ench.enchantments.NaturesBlessingEnchant;
import shadows.apotheosis.ench.enchantments.ReboundingEnchant;
import shadows.apotheosis.ench.enchantments.ReflectiveEnchant;
import shadows.apotheosis.ench.enchantments.ScavengerEnchant;
import shadows.apotheosis.ench.enchantments.SeaInfusionEnchantment;
import shadows.apotheosis.ench.enchantments.ShieldBashEnchant;
import shadows.apotheosis.ench.enchantments.StableFootingEnchant;
import shadows.apotheosis.ench.enchantments.TemptingEnchant;
import shadows.apotheosis.ench.objects.HellshelfBlock;
import shadows.apotheosis.ench.objects.ScrappingTomeItem;
import shadows.apotheosis.ench.objects.SeashelfBlock;
import shadows.apotheosis.ench.objects.TomeItem;
import shadows.apotheosis.ench.table.ApothEnchantContainer;
import shadows.apotheosis.ench.table.ApothEnchantTile;
import shadows.apotheosis.garden.EnderLeashItem;
import shadows.apotheosis.potion.LuckyFootItem;
import shadows.apotheosis.potion.PotionCharmItem;
import shadows.apotheosis.potion.TrueInfinityEnchant;
import shadows.apotheosis.potion.potions.KnowledgeEffect;
import shadows.apotheosis.potion.potions.SunderingEffect;
import shadows.apotheosis.spawn.enchantment.CapturingEnchant;
import shadows.apotheosis.village.fletching.FletchingContainer;
import shadows.apotheosis.village.fletching.arrows.BroadheadArrowEntity;
import shadows.apotheosis.village.fletching.arrows.BroadheadArrowItem;
import shadows.apotheosis.village.fletching.arrows.ObsidianArrowEntity;
import shadows.apotheosis.village.fletching.arrows.ObsidianArrowItem;

@ObjectHolder(Apotheosis.MODID)
public class ApotheosisObjects {
	public static final HellshelfBlock HELLSHELF = null;
	public static final Item PRISMATIC_WEB = null;
	public static final HellInfusionEnchantment HELL_INFUSION = null;
	public static final MinersFervorEnchant DEPTH_MINER = null;
	public static final StableFootingEnchant STABLE_FOOTING = null;
	public static final ScavengerEnchant SCAVENGER = null;
	public static final LifeMendingEnchant LIFE_MENDING = null;
	public static final IcyThornsEnchant ICY_THORNS = null;
	public static final TemptingEnchant TEMPTING = null;
	public static final ShieldBashEnchant SHIELD_BASH = null;
	public static final ReflectiveEnchant REFLECTIVE = null;
	public static final BerserkersFuryEnchant BERSERK = null;
	public static final CapturingEnchant CAPTURING = null;
	public static final TrueInfinityEnchant TRUE_INFINITY = null;
	public static final Potion RESISTANCE = null;
	public static final Potion LONG_RESISTANCE = null;
	public static final Potion STRONG_RESISTANCE = null;
	public static final Potion ABSORPTION = null;
	public static final Potion LONG_ABSORPTION = null;
	public static final Potion STRONG_ABSORPTION = null;
	public static final Potion HASTE = null;
	public static final Potion LONG_HASTE = null;
	public static final Potion STRONG_HASTE = null;
	public static final Potion FATIGUE = null;
	public static final Potion LONG_FATIGUE = null;
	public static final Potion STRONG_FATIGUE = null;
	@ObjectHolder("witherskelefix:fragment")
	public static final Item SKULL_FRAGMENT = null;
	public static final Potion WITHER = null;
	public static final Potion LONG_WITHER = null;
	public static final Potion STRONG_WITHER = null;
	public static final SunderingEffect SUNDERING = null;
	@ObjectHolder("apotheosis:sundering")
	public static final Potion T_SUNDERING = null;
	public static final Potion LONG_SUNDERING = null;
	public static final Potion STRONG_SUNDERING = null;
	public static final KnowledgeEnchant KNOWLEDGE = null;
	public static final SplittingEnchant SPLITTING = null;
	public static final NaturesBlessingEnchant NATURES_BLESSING = null;
	public static final ReboundingEnchant REBOUNDING = null;
	public static final TomeItem NULL_BOOK = null;
	public static final TomeItem ARMOR_HEAD_BOOK = null;
	public static final TomeItem ARMOR_CHEST_BOOK = null;
	public static final TomeItem ARMOR_LEGS_BOOK = null;
	public static final TomeItem ARMOR_FEET_BOOK = null;
	public static final TomeItem WEAPON_BOOK = null;
	public static final TomeItem DIGGER_BOOK = null;
	public static final TomeItem FISHING_ROD_BOOK = null;
	public static final TomeItem BOW_BOOK = null;
	public static final SeaAltarBlock PRISMATIC_ALTAR = null;
	public static final SoundEvent ALTAR_SOUND = null;
	@ObjectHolder("apotheosis:knowledge")
	public static final KnowledgeEffect P_KNOWLEDGE = null;
	@ObjectHolder("apotheosis:knowledge")
	public static final Potion T_KNOWLEDGE = null;
	public static final Potion LONG_KNOWLEDGE = null;
	public static final Potion STRONG_KNOWLEDGE = null;
	public static final LuckyFootItem LUCKY_FOOT = null;
	public static final MagicProtEnchant MAGIC_PROTECTION = null;
	public static final ScrappingTomeItem SCRAP_TOME = null;
	public static final EnderLeashItem FARMERS_LEASH = null;
	public static final TileEntityType<AnvilTile> ANVIL = null;
	@ObjectHolder("apotheosis:prismatic_altar")
	public static final TileEntityType<SeaAltarTile> ALTAR_TYPE = null;
	public static final ContainerType<FletchingContainer> FLETCHING = null;
	public static final ObsidianArrowItem OBSIDIAN_ARROW = null;
	public static final EntityType<ObsidianArrowEntity> OB_ARROW_ENTITY = null;
	public static final Effect BLEEDING = null;
	public static final EntityType<BroadheadArrowEntity> BH_ARROW_ENTITY = null;
	public static final BroadheadArrowItem BROADHEAD_ARROW = null;
	public static final PotionCharmItem POTION_CHARM = null;
	public static final Feature<NoFeatureConfig> DEADLY_WORLD_GEN = null;
	@ObjectHolder("minecraft:enchanting_table")
	public static final TileEntityType<ApothEnchantTile> ENCHANTING_TABLE = null;
	public static final ContainerType<ApothEnchantContainer> ENCHANTING = null;
	public static final SeaInfusionEnchantment SEA_INFUSION = null;
	public static final SeashelfBlock SEASHELF = null;
	public static final Block BLAZING_HELLSHELF = null;
	public static final Block GLOWING_HELLSHELF = null;
	public static final Block CRYSTAL_SEASHELF = null;
	public static final Block HEART_SEASHELF = null;
	public static final Block ENDSHELF = null;
	public static final Block PEARL_ENDSHELF = null;
	public static final Block DRACONIC_ENDSHELF = null;
	public static final Block BEESHELF = null;
	public static final Block MELONSHELF = null;
	public static final Enchantment OBLITERATION = null;
	public static final Enchantment CRESCENDO = null;

}