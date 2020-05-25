package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.live.base.model.user.f */
public class C3006f {
    @C17952c(mo34828a = "icon")

    /* renamed from: a */
    public ImageModel f8838a;
    @C17952c(mo34828a = "level")

    /* renamed from: b */
    public long f8839b;

    public int hashCode() {
        int i;
        if (this.f8838a != null) {
            i = this.f8838a.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + ((int) (this.f8839b ^ (this.f8839b >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3006f fVar = (C3006f) obj;
        if (this.f8839b != fVar.f8839b) {
            return false;
        }
        if (this.f8838a != null) {
            return this.f8838a.equals(fVar.f8838a);
        }
        if (fVar.f8838a == null) {
            return true;
        }
        return false;
    }
}
