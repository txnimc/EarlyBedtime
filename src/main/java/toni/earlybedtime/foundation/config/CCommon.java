package toni.earlybedtime.foundation.config;

import toni.lib.config.ConfigBase;

public class CCommon extends ConfigBase {

    public final ConfigInt sleepTime = i(11500, "Allowed Sleep Time", "The earliest time that you can go to bed. Vanilla is 12542.");

    @Override
    public String getName() {
        return "common";
    }
}
