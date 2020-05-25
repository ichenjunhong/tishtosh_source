package com.p683ss.android.ugc.aweme.discover.mixfeed;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.utils.C23722i;
import com.p683ss.android.ugc.aweme.discover.model.Layout;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e */
public final class C28322e {
    @C17952c(mo34828a = "layout")

    /* renamed from: a */
    public Layout f74293a;
    @C17952c(mo34828a = "raw_data")

    /* renamed from: b */
    public String f74294b;
    @C17952c(mo34828a = "schema")

    /* renamed from: c */
    public String f74295c;
    @C17952c(mo34828a = "height")

    /* renamed from: d */
    public int f74296d;
    @C17952c(mo34828a = "origin_type")

    /* renamed from: e */
    public int f74297e;

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.f74293a != null) {
            i = this.f74293a.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        if (this.f74294b != null) {
            i2 = this.f74294b.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        if (this.f74295c != null) {
            i3 = this.f74295c.hashCode();
        }
        return ((i5 + i3) * 31) + this.f74296d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28322e)) {
            return false;
        }
        C28322e eVar = (C28322e) obj;
        if (this.f74296d == eVar.f74296d && C23722i.m58215a(this.f74293a, eVar.f74293a) && C23722i.m58215a(this.f74294b, eVar.f74294b)) {
            return C23722i.m58215a(this.f74295c, eVar.f74295c);
        }
        return false;
    }
}
