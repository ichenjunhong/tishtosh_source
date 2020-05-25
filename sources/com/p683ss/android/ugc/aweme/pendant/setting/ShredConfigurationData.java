package com.p683ss.android.ugc.aweme.pendant.setting;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.pendant.setting.ShredConfigurationData */
public final class ShredConfigurationData {
    @C17952c(mo34828a = "fragment_display_switch")
    public final boolean twinkleEnabled;
    @C17952c(mo34828a = "vv_of_fragments")
    public final int[] vvList;

    public static /* synthetic */ ShredConfigurationData copy$default(ShredConfigurationData shredConfigurationData, boolean z, int[] iArr, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shredConfigurationData.twinkleEnabled;
        }
        if ((i & 2) != 0) {
            iArr = shredConfigurationData.vvList;
        }
        return shredConfigurationData.copy(z, iArr);
    }

    public final boolean component1() {
        return this.twinkleEnabled;
    }

    public final int[] component2() {
        return this.vvList;
    }

    public final ShredConfigurationData copy(boolean z, int[] iArr) {
        C52711k.m112240b(iArr, "vvList");
        return new ShredConfigurationData(z, iArr);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShredConfigurationData) {
                ShredConfigurationData shredConfigurationData = (ShredConfigurationData) obj;
                if (!(this.twinkleEnabled == shredConfigurationData.twinkleEnabled) || !C52711k.m112239a((Object) this.vvList, (Object) shredConfigurationData.vvList)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getTwinkleEnabled() {
        return this.twinkleEnabled;
    }

    public final int[] getVvList() {
        return this.vvList;
    }

    public final int hashCode() {
        boolean z = this.twinkleEnabled;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        int[] iArr = this.vvList;
        return i + (iArr != null ? Arrays.hashCode(iArr) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShredConfigurationData(twinkleEnabled=");
        sb.append(this.twinkleEnabled);
        sb.append(", vvList=");
        sb.append(Arrays.toString(this.vvList));
        sb.append(")");
        return sb.toString();
    }

    public ShredConfigurationData(boolean z, int[] iArr) {
        C52711k.m112240b(iArr, "vvList");
        this.twinkleEnabled = z;
        this.vvList = iArr;
    }
}
