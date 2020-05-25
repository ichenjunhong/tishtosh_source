package com.bytedance.android.livesdk.chatroom.event;

import com.bytedance.android.livesdk.chatroom.event.C5195o.C5196a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.event.al */
public final class C5166al implements C5195o {

    /* renamed from: a */
    public final String f13846a;

    /* renamed from: b */
    private final C5196a f13847b;

    /* renamed from: c */
    private final Map<String, Object> f13848c;

    /* renamed from: b */
    private C5196a m11803b() {
        return this.f13847b;
    }

    /* renamed from: a */
    public final Map<String, Object> mo11040a() {
        return this.f13848c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) mo11040a(), (java.lang.Object) r3.mo11040a()) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0031
            boolean r0 = r3 instanceof com.bytedance.android.livesdk.chatroom.event.C5166al
            if (r0 == 0) goto L_0x002f
            com.bytedance.android.livesdk.chatroom.event.al r3 = (com.bytedance.android.livesdk.chatroom.event.C5166al) r3
            java.lang.String r0 = r2.f13846a
            java.lang.String r1 = r3.f13846a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x002f
            com.bytedance.android.livesdk.chatroom.event.o$a r0 = r2.m11803b()
            com.bytedance.android.livesdk.chatroom.event.o$a r1 = r3.m11803b()
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x002f
            java.util.Map r0 = r2.mo11040a()
            java.util.Map r3 = r3.mo11040a()
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = 0
            return r3
        L_0x0031:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.event.C5166al.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f13846a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C5196a b = m11803b();
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        Map a = mo11040a();
        if (a != null) {
            i = a.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendBarrageEvent(content=");
        sb.append(this.f13846a);
        sb.append(", sender=");
        sb.append(m11803b());
        sb.append(", args=");
        sb.append(mo11040a());
        sb.append(")");
        return sb.toString();
    }

    public C5166al(String str, C5196a aVar, Map<String, ? extends Object> map) {
        C52711k.m112240b(str, C42311c.f106865i);
        C52711k.m112240b(aVar, "sender");
        C52711k.m112240b(map, "args");
        this.f13846a = str;
        this.f13847b = aVar;
        this.f13848c = map;
    }
}
