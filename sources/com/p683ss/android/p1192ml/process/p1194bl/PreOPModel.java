package com.p683ss.android.p1192ml.process.p1194bl;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.p1192ml.process.C19520c;
import java.util.List;

/* renamed from: com.ss.android.ml.process.bl.PreOPModel */
public class PreOPModel implements C19520c {
    @C17952c(mo34828a = "args")
    public List<String> args;
    @C17952c(mo34828a = "feature")
    public String feature;
    @C17952c(mo34828a = "lables")
    public List<String> labels;
    @C17952c(mo34828a = "op")

    /* renamed from: op */
    public String f53864op;
    @C17952c(mo34828a = "opts")
    public List<Float> opts;

    public List<String> getArgs() {
        return this.args;
    }

    public String getFeature() {
        return this.feature;
    }

    public List<String> getLabels() {
        return this.labels;
    }

    public List<Float> getOPTs() {
        return this.opts;
    }

    public String getOperator() {
        return this.f53864op;
    }
}
