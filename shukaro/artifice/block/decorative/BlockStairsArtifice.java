package shukaro.artifice.block.decorative;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import shukaro.artifice.ArtificeCore;
import shukaro.artifice.gui.ArtificeCreativeTab;

public class BlockStairsArtifice extends BlockStairs
{
    public BlockStairsArtifice(int id, Block block, int meta)
    {
        super(id, block, meta);
        setLightOpacity(0);
        setCreativeTab(ArtificeCreativeTab.tab);
        String name = block.getUnlocalizedName() + ".stairs." + ArtificeCore.rocks[meta].toLowerCase();
        name = name.replace("tile.", "");
        setUnlocalizedName(name);
    }
}
