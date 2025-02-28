package binnie.genetics.machine;

import net.minecraft.item.ItemStack;

import binnie.core.machines.IMachineType;
import binnie.core.machines.MachinePackage;
import binnie.core.resource.IBinnieTexture;
import binnie.genetics.Genetics;
import binnie.genetics.machine.splicer.SplicerPackage;

public enum AdvGeneticMachine implements IMachineType {

    Splicer(SplicerPackage.class);

    private final Class<? extends MachinePackage> cls;

    AdvGeneticMachine(Class<? extends MachinePackage> cls) {
        this.cls = cls;
    }

    @Override
    public Class<? extends MachinePackage> getPackageClass() {
        return cls;
    }

    public ItemStack get(int i) {
        return new ItemStack(Genetics.packageAdvGenetic.getBlock(), i, ordinal());
    }

    public abstract static class PackageAdvGeneticBase extends PackageGeneticBase {

        protected PackageAdvGeneticBase(String uid, IBinnieTexture renderTexture, int flashColor, boolean powered) {
            super(uid, renderTexture, flashColor, powered);
        }
    }
}
