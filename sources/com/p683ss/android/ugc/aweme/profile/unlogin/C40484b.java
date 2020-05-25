package com.p683ss.android.ugc.aweme.profile.unlogin;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.profile.unlogin.b */
public final class C40484b extends BaseResponse {
    @C17952c(mo34828a = "success_count")

    /* renamed from: a */
    public final int f103346a;
    @C17952c(mo34828a = "block")

    /* renamed from: b */
    public final boolean f103347b;

    public C40484b() {
        this(0, false, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C40484b) {
                C40484b bVar = (C40484b) obj;
                if (this.f103346a == bVar.f103346a) {
                    if (this.f103347b == bVar.f103347b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f103346a * 31;
        boolean z = this.f103347b;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnloginDiggSyncResponse(success_count=");
        sb.append(this.f103346a);
        sb.append(", block=");
        sb.append(this.f103347b);
        sb.append(")");
        return sb.toString();
    }

    private C40484b(int i, boolean z) {
        this.f103346a = i;
        this.f103347b = z;
    }

    private /* synthetic */ C40484b(int i, boolean z, int i2, C52707g gVar) {
        this(0, true);
    }
}
