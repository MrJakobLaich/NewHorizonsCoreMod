package com.dreammaster.scripts;

import net.minecraft.item.ItemStack;

import java.util.Arrays;
import java.util.List;

import static gregtech.api.util.GT_ModHandler.getModItem;

public class ScriptBiblioWoodsNatura implements IScriptLoader{
    private long startTime;
    private long endTime;
    private static final String scriptName = "BiblioWoodsNatura";
    private static final List<String> dependencies = Arrays.asList("BiomesOPlenty", "BiblioWoodsBoP", "BiblioCraft");

    public ScriptBiblioWoodsNatura() {

    }

    @Override
    public void loadRecipes() {
        startTime = System.currentTimeMillis();
        ItemStack[] FClockN= new ItemStack[]{
                getModItem("BiblioWoodsNatura", "BiblioWoodClock", 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodClock", 1, 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodClock", 1, 2),
                getModItem("BiblioWoodsNatura", "BiblioWoodClock", 1, 3),
                getModItem("BiblioWoodsNatura", "BiblioWoodClock", 1, 4),
                getModItem("BiblioWoodsNatura", "BiblioWoodClock", 1, 5),
                getModItem("BiblioWoodsNatura", "BiblioWoodClock", 1, 6),
                getModItem("BiblioWoodsNatura", "BiblioWoodClock", 1, 7),
                getModItem("BiblioWoodsNatura", "BiblioWoodClock", 1, 8),
                getModItem("BiblioWoodsNatura", "BiblioWoodClock", 1, 9),
                getModItem("BiblioWoodsNatura", "BiblioWoodClock", 1, 10),
                getModItem("BiblioWoodsNatura", "BiblioWoodClock", 1, 11),
                getModItem("BiblioWoodsNatura", "BiblioWoodClock", 1, 12)};

        ItemStack[] Nwood= new ItemStack[]{
                getModItem("Natura", "plankSlab1", 1, 4),
                getModItem("Natura", "plankSlab2", 1, 3),
                getModItem("Natura", "plankSlab1", 1),
                getModItem("Natura", "plankSlab2", 1, 4),
                getModItem("Natura", "plankSlab1", 1, 2),
                getModItem("Natura", "plankSlab1", 1, 5),
                getModItem("Natura", "plankSlab1", 1, 6),
                getModItem("Natura", "plankSlab2", 1),
                getModItem("Natura", "plankSlab1", 1, 3),
                getModItem("Natura", "plankSlab1", 1, 7),
                getModItem("Natura", "plankSlab1", 1, 1),
                getModItem("Natura", "plankSlab2", 1, 1),
                getModItem("Natura", "plankSlab2", 1, 2)};

        ItemStack[] PaintingN= new ItemStack[]{
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT0", 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT0", 1, 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT0", 1, 2),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT0", 1, 3),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT0", 1, 4),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT0", 1, 5),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT0", 1, 6),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT0", 1, 7),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT0", 1, 8),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT0", 1, 9),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT0", 1, 10),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT0", 1, 11),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT0", 1, 12)};

        ItemStack[] NPT1= new ItemStack[]{
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT1", 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT1", 1, 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT1", 1, 2),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT1", 1, 3),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT1", 1, 4),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT1", 1, 5),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT1", 1, 6),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT1", 1, 7),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT1", 1, 8),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT1", 1, 9),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT1", 1, 10),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT1", 1, 11),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT1", 1, 12)};

        ItemStack[] NPT2= new ItemStack[]{
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT2", 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT2", 1, 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT2", 1, 2),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT2", 1, 3),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT2", 1, 4),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT2", 1, 5),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT2", 1, 6),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT2", 1, 7),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT2", 1, 8),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT2", 1, 9),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT2", 1, 10),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT2", 1, 11),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT2", 1, 12)};

        ItemStack[] NPT3= new ItemStack[]{
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT3", 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT3", 1, 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT3", 1, 2),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT3", 1, 3),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT3", 1, 4),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT3", 1, 5),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT3", 1, 6),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT3", 1, 7),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT3", 1, 8),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT3", 1, 9),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT3", 1, 10),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT3", 1, 11),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT3", 1, 12)};

        ItemStack[] NPT4= new ItemStack[]{
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT4", 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT4", 1, 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT4", 1, 2),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT4", 1, 3),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT4", 1, 4),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT4", 1, 5),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT4", 1, 6),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT4", 1, 7),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT4", 1, 8),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT4", 1, 9),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT4", 1, 10),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT4", 1, 11),
                getModItem("BiblioWoodsNatura", "BiblioWoodPaintingT4", 1, 12)};

        ItemStack[] FrameN= new ItemStack[]{
                getModItem("BiblioWoodsNatura", "BiblioWoodMapFrame", 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodMapFrame", 1, 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodMapFrame", 1, 2),
                getModItem("BiblioWoodsNatura", "BiblioWoodMapFrame", 1, 3),
                getModItem("BiblioWoodsNatura", "BiblioWoodMapFrame", 1, 4),
                getModItem("BiblioWoodsNatura", "BiblioWoodMapFrame", 1, 5),
                getModItem("BiblioWoodsNatura", "BiblioWoodMapFrame", 1, 6),
                getModItem("BiblioWoodsNatura", "BiblioWoodMapFrame", 1, 7),
                getModItem("BiblioWoodsNatura", "BiblioWoodMapFrame", 1, 8),
                getModItem("BiblioWoodsNatura", "BiblioWoodMapFrame", 1, 9),
                getModItem("BiblioWoodsNatura", "BiblioWoodMapFrame", 1, 10),
                getModItem("BiblioWoodsNatura", "BiblioWoodMapFrame", 1, 11),
                getModItem("BiblioWoodsNatura", "BiblioWoodMapFrame", 1, 12)};

        ItemStack[] LableN= new ItemStack[]{
                getModItem("BiblioWoodsNatura", "BiblioWoodlabel", 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodlabel", 1, 1),
                getModItem("BiblioWoodsNatura", "BiblioWoodlabel", 1, 2),
                getModItem("BiblioWoodsNatura", "BiblioWoodlabel", 1, 3),
                getModItem("BiblioWoodsNatura", "BiblioWoodlabel", 1, 4),
                getModItem("BiblioWoodsNatura", "BiblioWoodlabel", 1, 5),
                getModItem("BiblioWoodsNatura", "BiblioWoodlabel", 1, 6),
                getModItem("BiblioWoodsNatura", "BiblioWoodlabel", 1, 7),
                getModItem("BiblioWoodsNatura", "BiblioWoodlabel", 1, 8),
                getModItem("BiblioWoodsNatura", "BiblioWoodlabel", 1, 9),
                getModItem("BiblioWoodsNatura", "BiblioWoodlabel", 1, 10),
                getModItem("BiblioWoodsNatura", "BiblioWoodlabel", 1, 11),
                getModItem("BiblioWoodsNatura", "BiblioWoodlabel", 1, 12)};

        for(int i=0; i < 13;i++){
            addShapedRecipe(FClockN[i], new Object[]{
                    Nwood[i], getModItem("minecraft", "clock", 1), Nwood[i],
                    Nwood[i], "stickWood", Nwood[i],
                    Nwood[i], "plateGold", Nwood[i]});
            addShapedRecipe(PaintingN[i], new Object[]{
                    Nwood[i], Nwood[i], Nwood[i],
                    Nwood[i], getModItem("BiblioCraft", "item.PaintingCanvas", 1), Nwood[i],
                    Nwood[i], Nwood[i], Nwood[i]});
            addShapedRecipe(NPT1[i], new Object[]{
                    "stickWood", "stickWood", "stickWood",
                    "stickWood", PaintingN[i], "stickWood",
                    "stickWood", "stickWood", "stickWood"});
            addShapedRecipe(NPT2[i], new Object[]{
                    "stickWood", "stickWood", "stickWood",
                    "stickWood", NPT1[i], "stickWood",
                    "stickWood", "stickWood", "stickWood"});
            addShapedRecipe(NPT3[i], new Object[]{
                    "stickWood", "stickWood", "stickWood",
                    "stickWood", NPT2[i], "stickWood",
                    "stickWood", "stickWood", "stickWood"});
            addShapedRecipe(NPT4[i], new Object[]{
                    "stickWood", "stickWood", "stickWood",
                    "stickWood", NPT3[i], "stickWood",
                    "stickWood", "stickWood", "stickWood"});
            addShapedRecipe(LableN[i], new Object[]{
                    "stickWood", "stickWood", "stickWood",
                    "stickWood", FrameN[i], "stickWood",
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
