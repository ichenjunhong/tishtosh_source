package com.twitter.sdk.android.core;

import com.google.gson.p1076a.C17952c;
import com.twitter.sdk.android.core.C52067a;

/* renamed from: com.twitter.sdk.android.core.j */
public class C52188j<T extends C52067a> {
    @C17952c(mo34828a = "auth_token")

    /* renamed from: a */
    public final T f129901a;
    @C17952c(mo34828a = "id")

    /* renamed from: b */
    public final long f129902b;

    public int hashCode() {
        int i;
        if (this.f129901a != null) {
            i = this.f129901a.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + ((int) (this.f129902b ^ (this.f129902b >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C52188j jVar = (C52188j) obj;
        if (this.f129902b != jVar.f129902b) {
            return false;
        }
        if (this.f129901a != null) {
            return this.f129901a.equals(jVar.f129901a);
        }
        if (jVar.f129901a == null) {
            return true;
        }
        return false;
    }

    public C52188j(T t, long j) {
        if (t != null) {
            this.f129901a = t;
            this.f129902b = j;
            return;
        }
        throw new IllegalArgumentException("AuthToken must not be null.");
    }
}
