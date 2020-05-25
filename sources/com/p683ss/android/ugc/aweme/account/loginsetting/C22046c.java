package com.p683ss.android.ugc.aweme.account.loginsetting;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.account.loginsetting.c */
public final class C22046c {
    @C17952c(mo34828a = "result")

    /* renamed from: a */
    public final boolean f59543a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22046c) {
                if (this.f59543a == ((C22046c) obj).f59543a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f59543a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoolResult(result=");
        sb.append(this.f59543a);
        sb.append(")");
        return sb.toString();
    }
}
