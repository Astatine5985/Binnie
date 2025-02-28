package binnie.genetics.machine;

import net.minecraft.item.ItemStack;

import binnie.core.machines.IMachineType;
import binnie.core.machines.MachinePackage;
import binnie.genetics.Genetics;
import binnie.genetics.machine.inoculator.InoculatorPackage;
import binnie.genetics.machine.isolator.IsolatorPackage;
import binnie.genetics.machine.polymeriser.PolymeriserPackage;
import binnie.genetics.machine.sequencer.SequencerPackage;

public enum GeneticMachine implements IMachineType {

    Isolator(IsolatorPackage.class),
    Sequencer(SequencerPackage.class),
    Polymeriser(PolymeriserPackage.class),
    Inoculator(InoculatorPackage.class);

    private final Class<? extends MachinePackage> clss;

    GeneticMachine(Class<? extends MachinePackage> clss) {
        this.clss = clss;
    }

    @Override
    public Class<? extends MachinePackage> getPackageClass() {
        return clss;
    }

    public ItemStack get(int i) {
        return new ItemStack(Genetics.packageGenetic.getBlock(), i, ordinal());
    }
}
