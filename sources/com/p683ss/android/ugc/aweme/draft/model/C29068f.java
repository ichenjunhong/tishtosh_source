package com.p683ss.android.ugc.aweme.draft.model;

import com.google.gson.p1076a.C17952c;
import java.util.Arrays;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.draft.model.f */
public final class C29068f {
    @C17952c(mo34828a = "matrix")

    /* renamed from: a */
    public final String[] f76180a;
    @C17952c(mo34828a = "duration")

    /* renamed from: b */
    public final double[] f76181b;
    @C17952c(mo34828a = "seg_user_cher")

    /* renamed from: c */
    public final boolean[] f76182c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftCherEffectParam(matrix=");
        sb.append(Arrays.toString(this.f76180a));
        sb.append(", duration=");
        sb.append(Arrays.toString(this.f76181b));
        sb.append(", segUseCher=");
        sb.append(Arrays.toString(this.f76182c));
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.f76180a) * 31) + Arrays.hashCode(this.f76181b)) * 31) + Arrays.hashCode(this.f76182c);
    }

    public final boolean equals(Object obj) {
        Class cls;
        if (this == obj) {
            return true;
        }
        Class cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C52711k.m112239a((Object) cls2, (Object) cls)) {
            return false;
        }
        if (obj != null) {
            C29068f fVar = (C29068f) obj;
            if (Arrays.equals(this.f76180a, fVar.f76180a) && Arrays.equals(this.f76181b, fVar.f76181b) && Arrays.equals(this.f76182c, fVar.f76182c)) {
                return true;
            }
            return false;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.draft.model.DraftCherEffectParam");
    }

    public C29068f(String[] strArr, double[] dArr, boolean[] zArr) {
        C52711k.m112240b(strArr, "matrix");
        C52711k.m112240b(dArr, "duration");
        C52711k.m112240b(zArr, "segUseCher");
        this.f76180a = strArr;
        this.f76181b = dArr;
        this.f76182c = zArr;
    }
}
