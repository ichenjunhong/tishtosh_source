package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d;

import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import java.io.Serializable;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.d.c */
public final class C34472c implements Serializable {

    /* renamed from: a */
    private final boolean f88910a;

    /* renamed from: b */
    private final ArrayList<C34409a> f88911b;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.ArrayList, code=java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.media.b.a>, for r2v0, types: [java.util.ArrayList] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34472c copy$default(com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34472c r0, boolean r1, java.util.ArrayList<com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            boolean r1 = r0.f88910a
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.media.b.a> r2 = r0.f88911b
        L_0x000c:
            com.ss.android.ugc.aweme.im.sdk.media.choose.d.c r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34472c.copy$default(com.ss.android.ugc.aweme.im.sdk.media.choose.d.c, boolean, java.util.ArrayList, int, java.lang.Object):com.ss.android.ugc.aweme.im.sdk.media.choose.d.c");
    }

    public final boolean component1() {
        return this.f88910a;
    }

    public final ArrayList<C34409a> component2() {
        return this.f88911b;
    }

    public final C34472c copy(boolean z, ArrayList<C34409a> arrayList) {
        C52711k.m112240b(arrayList, "selectedList");
        return new C34472c(z, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C34472c) {
                C34472c cVar = (C34472c) obj;
                if (!(this.f88910a == cVar.f88910a) || !C52711k.m112239a((Object) this.f88911b, (Object) cVar.f88911b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList<C34409a> getSelectedList() {
        return this.f88911b;
    }

    public final boolean getSendRaw() {
        return this.f88910a;
    }

    public final int hashCode() {
        boolean z = this.f88910a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        ArrayList<C34409a> arrayList = this.f88911b;
        return i + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaChooseResult(sendRaw=");
        sb.append(this.f88910a);
        sb.append(", selectedList=");
        sb.append(this.f88911b);
        sb.append(")");
        return sb.toString();
    }

    public C34472c(boolean z, ArrayList<C34409a> arrayList) {
        C52711k.m112240b(arrayList, "selectedList");
        this.f88910a = z;
        this.f88911b = arrayList;
    }
}
