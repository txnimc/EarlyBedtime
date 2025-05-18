package toni.earlybedtime.foundation.data;

#if FABRIC
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import toni.earlybedtime.EarlyBedtime;

public class EarlyBedtimeDatagen  implements DataGeneratorEntrypoint {

    @Override
    public String getEffectiveModId() {
        return EarlyBedtime.ID;
    }

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();
        pack.addProvider(ConfigLangDatagen::new);
    }
}
#endif