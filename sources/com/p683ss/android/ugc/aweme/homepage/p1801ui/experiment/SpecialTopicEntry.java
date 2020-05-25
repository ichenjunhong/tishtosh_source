package com.p683ss.android.ugc.aweme.homepage.p1801ui.experiment;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry */
public final class SpecialTopicEntry {
    @C17952c(mo34828a = "child_viewable")
    private final boolean childViewable;
    @C17952c(mo34828a = "enable")
    private final boolean enable;
    @C17952c(mo34828a = "event_name")
    private final String eventName;
    @C17952c(mo34828a = "icon_url")
    private final String iconUrl;
    @C17952c(mo34828a = "landing_route")
    private final String landingRoute;
    @C17952c(mo34828a = "landing_type")
    private final String landingType;

    public SpecialTopicEntry() {
        this(false, false, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SpecialTopicEntry copy$default(SpecialTopicEntry specialTopicEntry, boolean z, boolean z2, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = specialTopicEntry.enable;
        }
        if ((i & 2) != 0) {
            z2 = specialTopicEntry.childViewable;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            str = specialTopicEntry.eventName;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = specialTopicEntry.iconUrl;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = specialTopicEntry.landingType;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = specialTopicEntry.landingRoute;
        }
        return specialTopicEntry.copy(z, z3, str5, str6, str7, str4);
    }

    public final boolean component1() {
        return this.enable;
    }

    public final boolean component2() {
        return this.childViewable;
    }

    public final String component3() {
        return this.eventName;
    }

    public final String component4() {
        return this.iconUrl;
    }

    public final String component5() {
        return this.landingType;
    }

    public final String component6() {
        return this.landingRoute;
    }

    public final SpecialTopicEntry copy(boolean z, boolean z2, String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(str2, "iconUrl");
        C52711k.m112240b(str3, "landingType");
        C52711k.m112240b(str4, "landingRoute");
        SpecialTopicEntry specialTopicEntry = new SpecialTopicEntry(z, z2, str, str2, str3, str4);
        return specialTopicEntry;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpecialTopicEntry) {
                SpecialTopicEntry specialTopicEntry = (SpecialTopicEntry) obj;
                if (this.enable == specialTopicEntry.enable) {
                    if (!(this.childViewable == specialTopicEntry.childViewable) || !C52711k.m112239a((Object) this.eventName, (Object) specialTopicEntry.eventName) || !C52711k.m112239a((Object) this.iconUrl, (Object) specialTopicEntry.iconUrl) || !C52711k.m112239a((Object) this.landingType, (Object) specialTopicEntry.landingType) || !C52711k.m112239a((Object) this.landingRoute, (Object) specialTopicEntry.landingRoute)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getChildViewable() {
        return this.childViewable;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLandingRoute() {
        return this.landingRoute;
    }

    public final String getLandingType() {
        return this.landingType;
    }

    public final int hashCode() {
        boolean z = this.enable;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.childViewable;
        if (!z2) {
            i = z2;
        }
        int i3 = (i2 + i) * 31;
        String str = this.eventName;
        int i4 = 0;
        int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.iconUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.landingType;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.landingRoute;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return hashCode3 + i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialTopicEntry(enable=");
        sb.append(this.enable);
        sb.append(", childViewable=");
        sb.append(this.childViewable);
        sb.append(", eventName=");
        sb.append(this.eventName);
        sb.append(", iconUrl=");
        sb.append(this.iconUrl);
        sb.append(", landingType=");
        sb.append(this.landingType);
        sb.append(", landingRoute=");
        sb.append(this.landingRoute);
        sb.append(")");
        return sb.toString();
    }

    public SpecialTopicEntry(boolean z, boolean z2, String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(str2, "iconUrl");
        C52711k.m112240b(str3, "landingType");
        C52711k.m112240b(str4, "landingRoute");
        this.enable = z;
        this.childViewable = z2;
        this.eventName = str;
        this.iconUrl = str2;
        this.landingType = str3;
        this.landingRoute = str4;
    }

    public /* synthetic */ SpecialTopicEntry(boolean z, boolean z2, String str, String str2, String str3, String str4, int i, C52707g gVar) {
        boolean z3;
        boolean z4 = false;
        if ((i & 1) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 2) == 0) {
            z4 = z2;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = "";
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = "";
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = "";
        }
        this(z3, z4, str5, str6, str7, str4);
    }
}
