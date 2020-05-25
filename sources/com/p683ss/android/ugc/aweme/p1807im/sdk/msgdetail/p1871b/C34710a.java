package com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1871b;

import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.DragView.IViewInfo;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.b.a */
public final class C34710a<T> {

    /* renamed from: a */
    public final T f89410a;

    /* renamed from: b */
    public final C11207p f89411b;

    /* renamed from: c */
    public final IViewInfo f89412c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f89412c, (java.lang.Object) r3.f89412c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1871b.C34710a
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.im.sdk.msgdetail.b.a r3 = (com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1871b.C34710a) r3
            T r0 = r2.f89410a
            T r1 = r3.f89410a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.bytedance.im.core.c.p r0 = r2.f89411b
            com.bytedance.im.core.c.p r1 = r3.f89411b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$IViewInfo r0 = r2.f89412c
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$IViewInfo r3 = r3.f89412c
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1871b.C34710a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        T t = this.f89410a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        C11207p pVar = this.f89411b;
        int hashCode2 = (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        IViewInfo iViewInfo = this.f89412c;
        if (iViewInfo != null) {
            i = iViewInfo.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaContent(content=");
        sb.append(this.f89410a);
        sb.append(", msg=");
        sb.append(this.f89411b);
        sb.append(", dragInfo=");
        sb.append(this.f89412c);
        sb.append(")");
        return sb.toString();
    }

    public C34710a(T t, C11207p pVar, IViewInfo iViewInfo) {
        C52711k.m112240b(pVar, "msg");
        this.f89410a = t;
        this.f89411b = pVar;
        this.f89412c = iViewInfo;
    }
}
