package com.bytedance.android.live.base.model.user;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.live.base.model.user.b */
public class C3002b {
    @C17952c(mo34828a = "level")

    /* renamed from: a */
    public long f8814a;
    @C17952c(mo34828a = "type")

    /* renamed from: b */
    public long f8815b;

    public int hashCode() {
        return (((int) (this.f8814a ^ (this.f8814a >>> 32))) * 31) + ((int) (this.f8815b ^ (this.f8815b >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3002b bVar = (C3002b) obj;
        if (this.f8814a == bVar.f8814a && this.f8815b == bVar.f8815b) {
            return true;
        }
        return false;
    }
}
