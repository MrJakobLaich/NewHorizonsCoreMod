package com.dreammaster.scripts;

import net.minecraft.item.ItemStack;


import java.util.Arrays;
import java.util.List;

import static gregtech.api.util.GT_ModHandler.getModItem;

public class ScriptBiblioWoodsBoP implements IScriptLoader{

    private long startTime;
    private long endTime;
    private static final String scriptName = "BiblioWoodsBoP";
    private static final List<String> dependencies = Arrays.asList("BiomesOPlenty", "BiblioWoodsBoP", "BiblioCraft");

    @Override
    public void loadRecipes(){
        startTime = System.currentTimeMillis();
        ItemStack[] BOBwood= new ItemStack[]{
                getModItem("BiomesOPlenty", "woodenSingleSlab1", 1),
                getModItem("BiomesOPlenty", "woodenSingleSlab1", 1, 1),
                getModItem("BiomesOPlenty", "woodenSingleSlab1", 1, 2),
                getModItem("BiomesOPlenty", "woodenSingleSlab1", 1, 3),
                getModItem("BiomesOPlenty", "woodenSingleSlab2", 1, 3),
                getModItem("BiomesOPlenty", "woodenSingleSlab1", 1, 4),
                getModItem("BiomesOPlenty", "woodenSingleSlab2", 1, 4),
                getModItem("BiomesOPlenty", "woodenSingleSlab1", 1, 5),
                getModItem("BiomesOPlenty", "woodenSingleSlab1", 1, 6),
                getModItem("BiomesOPlenty", "woodenSingleSlab1", 1, 7),
                getModItem("BiomesOPlenty", "woodenSingleSlab2", 1, 2),
                getModItem("BiomesOPlenty", "woodenSingleSlab2", 1),
                getModItem("BiomesOPlenty", "woodenSingleSlab2", 1, 1),
                getModItem("BiomesOPlenty", "woodenSingleSlab2", 1, 5)};

        ItemStack[] FClockBOP= new ItemStack[]{
                getModItem("BiblioWoodsBoP", "BiblioWoodClock", 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodClock", 1, 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodClock", 1, 2),
                getModItem("BiblioWoodsBoP", "BiblioWoodClock", 1, 3),
                getModItem("BiblioWoodsBoP", "BiblioWoodClock", 1, 4),
                getModItem("BiblioWoodsBoP", "BiblioWoodClock", 1, 5),
                getModItem("BiblioWoodsBoP", "BiblioWoodClock", 1, 6),
                getModItem("BiblioWoodsBoP", "BiblioWoodClock", 1, 7),
                getModItem("BiblioWoodsBoP", "BiblioWoodClock", 1, 8),
                getModItem("BiblioWoodsBoP", "BiblioWoodClock", 1, 9),
                getModItem("BiblioWoodsBoP", "BiblioWoodClock", 1, 10),
                getModItem("BiblioWoodsBoP", "BiblioWoodClock", 1, 11),
                getModItem("BiblioWoodsBoP", "BiblioWoodClock", 1, 12),
                getModItem("BiblioWoodsBoP", "BiblioWoodClock", 1, 13)};

        ItemStack[] PaintingBOP= new ItemStack[]{
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT0", 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT0", 1, 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT0", 1, 2),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT0", 1, 3),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT0", 1, 4),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT0", 1, 5),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT0", 1, 6),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT0", 1, 7),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT0", 1, 8),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT0", 1, 9),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT0", 1, 10),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT0", 1, 11),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT0", 1, 12),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT0", 1, 13)};

        ItemStack[] BOBPT1= new ItemStack[]{
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT1", 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT1", 1, 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT1", 1, 2),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT1", 1, 3),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT1", 1, 4),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT1", 1, 5),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT1", 1, 6),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT1", 1, 7),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT1", 1, 8),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT1", 1, 9),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT1", 1, 10),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT1", 1, 11),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT1", 1, 12),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT1", 1, 13)};

        ItemStack[] BOBPT2= new ItemStack[]{
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT2", 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT2", 1, 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT2", 1, 2),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT2", 1, 3),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT2", 1, 4),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT2", 1, 5),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT2", 1, 6),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT2", 1, 7),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT2", 1, 8),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT2", 1, 9),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT2", 1, 10),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT2", 1, 11),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT2", 1, 12),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT2", 1, 13)};

        ItemStack[] BOBPT3= new ItemStack[]{
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT3", 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT3", 1, 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT3", 1, 2),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT3", 1, 3),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT3", 1, 4),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT3", 1, 5),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT3", 1, 6),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT3", 1, 7),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT3", 1, 8),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT3", 1, 9),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT3", 1, 10),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT3", 1, 11),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT3", 1, 12),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT3", 1, 13)};

        ItemStack[] BOBPT4= new ItemStack[]{
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT4", 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT4", 1, 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT4", 1, 2),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT4", 1, 3),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT4", 1, 4),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT4", 1, 5),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT4", 1, 6),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT4", 1, 7),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT4", 1, 8),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT4", 1, 9),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT4", 1, 10),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT4", 1, 11),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT4", 1, 12),
                getModItem("BiblioWoodsBoP", "BiblioWoodPaintingT4", 1, 13)};

        ItemStack[] FrameBOP= new ItemStack[]{
                getModItem("BiblioWoodsBoP", "BiblioWoodMapFrame", 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodMapFrame", 1, 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodMapFrame", 1, 2),
                getModItem("BiblioWoodsBoP", "BiblioWoodMapFrame", 1, 3),
                getModItem("BiblioWoodsBoP", "BiblioWoodMapFrame", 1, 4),
                getModItem("BiblioWoodsBoP", "BiblioWoodMapFrame", 1, 5),
                getModItem("BiblioWoodsBoP", "BiblioWoodMapFrame", 1, 6),
                getModItem("BiblioWoodsBoP", "BiblioWoodMapFrame", 1, 7),
                getModItem("BiblioWoodsBoP", "BiblioWoodMapFrame", 1, 8),
                getModItem("BiblioWoodsBoP", "BiblioWoodMapFrame", 1, 9),
                getModItem("BiblioWoodsBoP", "BiblioWoodMapFrame", 1, 10),
                getModItem("BiblioWoodsBoP", "BiblioWoodMapFrame", 1, 11),
                getModItem("BiblioWoodsBoP", "BiblioWoodMapFrame", 1, 12),
                getModItem("BiblioWoodsBoP", "BiblioWoodMapFrame", 1, 13)};

        ItemStack[] LableBOP= new ItemStack[]{
                getModItem("BiblioWoodsBoP", "BiblioWoodlabel", 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodlabel", 1, 1),
                getModItem("BiblioWoodsBoP", "BiblioWoodlabel", 1, 2),
                getModItem("BiblioWoodsBoP", "BiblioWoodlabel", 1, 3),
                getModItem("BiblioWoodsBoP", "BiblioWoodlabel", 1, 4),
                getModItem("BiblioWoodsBoP", "BiblioWoodlabel", 1, 5),
                getModItem("BiblioWoodsBoP", "BiblioWoodlabel", 1, 6),
                getModItem("BiblioWoodsBoP", "BiblioWoodlabel", 1, 7),
                getModItem("BiblioWoodsBoP", "BiblioWoodlabel", 1, 8),
                getModItem("BiblioWoodsBoP", "BiblioWoodlabel", 1, 9),
                getModItem("BiblioWoodsBoP", "BiblioWoodlabel", 1, 10),
                getModItem("BiblioWoodsBoP", "BiblioWoodlabel", 1, 11),
                getModItem("BiblioWoodsBoP", "BiblioWoodlabel", 1, 12),
                getModItem("BiblioWoodsBoP", "BiblioWoodlabel", 1, 13)};

        for (int i=0;i<14;i++){
            addShapedRecipe(FClockBOP[i], new Object[]{
                    BOBwood[i], getModItem("minecraft", "clock", 1), BOBwood[i],
                    BOBwood[i], "stickWood", BOBwood[i],
                    BOBwood[i], "plateGold", BOBwood[i]});
            addShapedRecipe(PaintingBOP[i], new Object[]{
                    BOBwood[i], BOBwood[i], BOBwood[i],
                    BOBwood[i], getModItem("BiblioCraft", "item.PaintingCanvas", 1), BOBwood[i],
                    BOBwood[i], BOBwood[i], BOBwood[i]});
            addShapedRecipe(BOBPT1[i], new Object[]{
                    "stickWood", "stickWood", "stickWood",
                    "stickWood", PaintingBOP[i], "stickWood",
                    "stickWood", "stickWood", "stickWood"});
            addShapedRecipe(BOBPT2[i], new Object[]{
                    "stickWood", "stickWood", "stickWood",
                    "stickWood", BOBPT1[i], "stickWood",
                    "stickWood", "stickWood", "stickWood"});
            addShapedRecipe(BOBPT3[i], new Object[]{
                    "stickWood", "stickWood", "stickWood",
                    "stickWood", BOBPT2[i], "stickWood",
                    "stickWood", "stickWood", "stickWood"});
            addShapedRecipe(BOBPT4[i], new Object[]{
                    "stickWood", "stickWood", "stickWood",
                    "stickWood", BOBPT3[i], "stickWood",
                    "stickWood", "stickWood", "stickWood"});
            addShapedRecipe(LableBOP[i], new Object[]{
                    "stickWood", "stickWood", "stickWood",
                    "stickWood", FrameBOP[i], "stickWood",
                    "stickWood", "stickWood", "stickWood"});
        }
        endTime = System.currentTimeMillis();
    }

    @Override
    public long getExecutionTime(){
        return endTime-startTime;
    }

    @Override
    public List<String> getDependencies() {
        return dependencies;
    }

    @Override
    public String getScriptName() {
        return scriptName;
    }
}


