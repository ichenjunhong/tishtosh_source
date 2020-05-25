package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.live.base.model.user.h */
public class C3008h {
    @C17952c(mo34828a = "level_str")

    /* renamed from: a */
    public String f8843a;
    @C17952c(mo34828a = "icon_diamond")

    /* renamed from: b */
    public int f8844b;
    @C17952c(mo34828a = "icon")

    /* renamed from: c */
    public ImageModel f8845c;
    @C17952c(mo34828a = "level")

    /* renamed from: d */
    public int f8846d;

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.f8843a != null) {
            i = this.f8843a.hashCode();
        } else {
            i = 0;
        }
        int i3 = ((i * 31) + this.f8844b) * 31;
        if (this.f8845c != null) {
            i2 = this.f8845c.hashCode();
        }
        return ((i3 + i2) * 31) + this.f8846d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3008h hVar = (C3008h) obj;
        if (this.f8844b != hVar.f8844b || this.f8846d != hVar.f8846d) {
            return false;
        }
        if (this.f8843a == null ? hVar.f8843a != null : !this.f8843a.equals(hVar.f8843a)) {
            return false;
        }
        if (this.f8845c != null) {
            return this.f8845c.equals(hVar.f8845c);
        }
        if (hVar.f8845c == null) {
            return true;
        }
        return false;
    }
}
