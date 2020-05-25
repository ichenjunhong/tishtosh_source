package com.bytedance.android.livesdk.chatroom.viewmodule;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dw */
public final class C6542dw {

    /* renamed from: a */
    public final LinkPkTaskWidget f17870a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f17870a, (java.lang.Object) ((com.bytedance.android.livesdk.chatroom.viewmodule.C6542dw) r2).f17870a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bytedance.android.livesdk.chatroom.viewmodule.C6542dw
            if (r0 == 0) goto L_0x0013
            com.bytedance.android.livesdk.chatroom.viewmodule.dw r2 = (com.bytedance.android.livesdk.chatroom.viewmodule.C6542dw) r2
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkPkTaskWidget r0 = r1.f17870a
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkPkTaskWidget r2 = r2.f17870a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.C6542dw.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        LinkPkTaskWidget linkPkTaskWidget = this.f17870a;
        if (linkPkTaskWidget != null) {
            return linkPkTaskWidget.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadPkTaskWidgetEvent(widget=");
        sb.append(this.f17870a);
        sb.append(")");
        return sb.toString();
    }

    public C6542dw(LinkPkTaskWidget linkPkTaskWidget) {
        this.f17870a = linkPkTaskWidget;
    }
}
