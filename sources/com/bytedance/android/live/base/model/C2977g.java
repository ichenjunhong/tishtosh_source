package com.bytedance.android.live.base.model;

import com.bytedance.android.live.base.C2957c;
import java.io.Serializable;

/* renamed from: com.bytedance.android.live.base.model.g */
public final class C2977g implements Serializable, Cloneable {
    private static final long serialVersionUID = -6437800749411518984L;

    /* renamed from: a */
    private final String f8727a;

    /* renamed from: b */
    private final String f8728b;

    public final String getName() {
        return this.f8727a;
    }

    public final String getValue() {
        return this.f8728b;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final int hashCode() {
        return C2957c.m8381a(C2957c.m8381a(17, this.f8727a), this.f8728b);
    }

    public final String toString() {
        if (this.f8728b == null) {
            return this.f8727a;
        }
        StringBuilder sb = new StringBuilder(this.f8727a.length() + 1 + this.f8728b.length());
        sb.append(this.f8727a);
        sb.append("=");
        sb.append(this.f8728b);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2977g)) {
            return false;
        }
        C2977g gVar = (C2977g) obj;
        if (this.f8727a.equals(gVar.f8727a)) {
            String str = this.f8728b;
            String str2 = gVar.f8728b;
            if (str != null) {
                z = str.equals(str2);
            } else if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public C2977g(String str, String str2) {
        if (str != null) {
            this.f8727a = str;
            this.f8728b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
