package com.p683ss.android.ugc.aweme.profile.settings;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;

@Keep
/* renamed from: com.ss.android.ugc.aweme.profile.settings.ThirdPartyBindingEntry */
public final class ThirdPartyBindingEntry {
    @C17952c(mo34828a = "ins")
    public final boolean ins;
    @C17952c(mo34828a = "twitter")
    public final boolean twitter;
    @C17952c(mo34828a = "youtube")
    public final boolean youtube;

    public ThirdPartyBindingEntry() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ ThirdPartyBindingEntry copy$default(ThirdPartyBindingEntry thirdPartyBindingEntry, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = thirdPartyBindingEntry.twitter;
        }
        if ((i & 2) != 0) {
            z2 = thirdPartyBindingEntry.ins;
        }
        if ((i & 4) != 0) {
            z3 = thirdPartyBindingEntry.youtube;
        }
        return thirdPartyBindingEntry.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.twitter;
    }

    public final boolean component2() {
        return this.ins;
    }

    public final boolean component3() {
        return this.youtube;
    }

    public final ThirdPartyBindingEntry copy(boolean z, boolean z2, boolean z3) {
        return new ThirdPartyBindingEntry(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ThirdPartyBindingEntry) {
                ThirdPartyBindingEntry thirdPartyBindingEntry = (ThirdPartyBindingEntry) obj;
                if (this.twitter == thirdPartyBindingEntry.twitter) {
                    if (this.ins == thirdPartyBindingEntry.ins) {
                        if (this.youtube == thirdPartyBindingEntry.youtube) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getIns() {
        return this.ins;
    }

    public final boolean getTwitter() {
        return this.twitter;
    }

    public final boolean getYoutube() {
        return this.youtube;
    }

    public final int hashCode() {
        boolean z = this.twitter;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.ins;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.youtube;
        if (!z3) {
            i = z3;
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThirdPartyBindingEntry(twitter=");
        sb.append(this.twitter);
        sb.append(", ins=");
        sb.append(this.ins);
        sb.append(", youtube=");
        sb.append(this.youtube);
        sb.append(")");
        return sb.toString();
    }

    public ThirdPartyBindingEntry(boolean z, boolean z2, boolean z3) {
        this.twitter = z;
        this.ins = z2;
        this.youtube = z3;
    }

    public /* synthetic */ ThirdPartyBindingEntry(boolean z, boolean z2, boolean z3, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        this(z, z2, z3);
    }
}
