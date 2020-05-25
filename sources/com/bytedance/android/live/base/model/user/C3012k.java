package com.bytedance.android.live.base.model.user;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.live.base.model.user.k */
public class C3012k {
    @C17952c(mo34828a = "is_muted")

    /* renamed from: a */
    public boolean f8850a;
    @C17952c(mo34828a = "is_admin")

    /* renamed from: b */
    public boolean f8851b;
    @C17952c(mo34828a = "is_super_admin")

    /* renamed from: c */
    public boolean f8852c;

    public int hashCode() {
        return ((this.f8850a ? 1 : 0) * true) + (this.f8851b ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3012k kVar = (C3012k) obj;
        if (this.f8850a == kVar.f8850a && this.f8851b == kVar.f8851b) {
            return true;
        }
        return false;
    }
}
