package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.viewmodel.C8424h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.eq */
public final class C6566eq {

    /* renamed from: a */
    public final C52682m<C8424h, Room, C52860x> f17898a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f17898a, (java.lang.Object) ((com.bytedance.android.livesdk.chatroom.viewmodule.C6566eq) r2).f17898a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bytedance.android.livesdk.chatroom.viewmodule.C6566eq
            if (r0 == 0) goto L_0x0013
            com.bytedance.android.livesdk.chatroom.viewmodule.eq r2 = (com.bytedance.android.livesdk.chatroom.viewmodule.C6566eq) r2
            d.f.a.m<com.bytedance.android.livesdk.viewmodel.h, com.bytedance.android.livesdkapi.depend.model.live.Room, d.x> r0 = r1.f17898a
            d.f.a.m<com.bytedance.android.livesdk.viewmodel.h, com.bytedance.android.livesdkapi.depend.model.live.Room, d.x> r2 = r2.f17898a
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.C6566eq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C52682m<C8424h, Room, C52860x> mVar = this.f17898a;
        if (mVar != null) {
            return mVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestPortalViewModelEvent(callback=");
        sb.append(this.f17898a);
        sb.append(")");
        return sb.toString();
    }

    public C6566eq(C52682m<? super C8424h, ? super Room, C52860x> mVar) {
        C52711k.m112240b(mVar, "callback");
        this.f17898a = mVar;
    }
}
