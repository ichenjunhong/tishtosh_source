package com.bytedance.android.livesdk.gift.dialog.view.topbar;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.view.topbar.d */
final /* synthetic */ class C7282d implements C0199s {

    /* renamed from: a */
    private final LiveGiftTopWidget f19818a;

    C7282d(LiveGiftTopWidget liveGiftTopWidget) {
        this.f19818a = liveGiftTopWidget;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r3.f20539H != false) goto L_0x00d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(java.lang.Object r9) {
        /*
            r8 = this;
            com.bytedance.android.livesdk.gift.dialog.view.topbar.LiveGiftTopWidget r0 = r8.f19818a
            com.bytedance.android.livesdk.gift.dialog.viewmodel.b r9 = (com.bytedance.android.livesdk.gift.dialog.viewmodel.C7290b) r9
            if (r9 == 0) goto L_0x00fa
            java.lang.Class<com.bytedance.android.live.user.a> r1 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r1 = com.bytedance.android.live.p245d.C4116c.m10249a(r1)
            com.bytedance.android.live.user.a r1 = (com.bytedance.android.live.user.C4282a) r1
            com.bytedance.android.livesdk.user.e r1 = r1.user()
            boolean r1 = r1.mo14532c()
            int r2 = r9.f19851a
            switch(r2) {
                case 1: goto L_0x00df;
                case 2: goto L_0x001d;
                case 3: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x00fa
        L_0x001d:
            com.bytedance.android.livesdk.gift.dialog.view.topbar.LiveGiftGroupView r2 = r0.f19800b
            boolean r3 = r2.f19792i
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x00d6
            com.bytedance.android.livesdk.gift.model.a.b r3 = r9.f19852b
            r2.f19789f = r3
            com.bytedance.android.livesdk.gift.model.a.b r3 = r2.f19789f
            if (r3 == 0) goto L_0x00d6
            com.bytedance.android.livesdk.gift.model.a.b r3 = r2.f19789f
            boolean r3 = r3 instanceof com.bytedance.android.livesdk.gift.model.p379a.C7490a
            if (r3 == 0) goto L_0x00d6
            r3 = 0
            com.bytedance.android.livesdk.gift.model.a.b r6 = r2.f19789f
            T r6 = r6.f20516d
            boolean r6 = r6 instanceof com.bytedance.android.livesdk.gift.model.C7505d
            if (r6 == 0) goto L_0x0043
            com.bytedance.android.livesdk.gift.model.a.b r3 = r2.f19789f
            T r3 = r3.f20516d
            com.bytedance.android.livesdk.gift.model.d r3 = (com.bytedance.android.livesdk.gift.model.C7505d) r3
            goto L_0x0059
        L_0x0043:
            com.bytedance.android.livesdk.gift.model.a.b r6 = r2.f19789f
            T r6 = r6.f20516d
            boolean r6 = r6 instanceof com.bytedance.android.livesdk.gift.model.Prop
            if (r6 == 0) goto L_0x0059
            com.bytedance.android.livesdk.gift.model.a.b r3 = r2.f19789f
            T r3 = r3.f20516d
            com.bytedance.android.livesdk.gift.model.Prop r3 = (com.bytedance.android.livesdk.gift.model.Prop) r3
            com.bytedance.android.livesdk.gift.model.d r3 = r3.gift
            if (r3 == 0) goto L_0x0059
            boolean r6 = r3.f20539H
            if (r6 != 0) goto L_0x00d6
        L_0x0059:
            java.util.List<com.bytedance.android.livesdk.gift.model.f> r6 = r9.f19855e
            r2.f19786c = r6
            if (r3 == 0) goto L_0x00d6
            boolean r6 = r3.f20546g
            if (r6 == 0) goto L_0x00d6
            java.util.List<com.bytedance.android.livesdk.gift.model.f> r6 = r2.f19786c
            boolean r6 = com.bytedance.common.utility.C9414h.m18630a(r6)
            if (r6 != 0) goto L_0x00d6
            int r3 = r3.f20544e
            r6 = 5
            if (r3 == r6) goto L_0x00d6
            java.util.List<com.bytedance.android.livesdk.gift.model.f> r3 = r2.f19786c
            java.lang.Object r3 = r3.get(r5)
            com.bytedance.android.livesdk.gift.model.f r3 = (com.bytedance.android.livesdk.gift.model.C7507f) r3
            boolean r3 = r3.f20573c
            r6 = 8
            if (r3 == 0) goto L_0x0089
            android.view.View r3 = r2.f19787d
            r3.setVisibility(r6)
            android.view.View r3 = r2.f19788e
            r3.setVisibility(r5)
            goto L_0x00b1
        L_0x0089:
            java.util.List<com.bytedance.android.livesdk.gift.model.f> r3 = r2.f19786c
            java.util.List<com.bytedance.android.livesdk.gift.model.f> r7 = r2.f19786c
            int r7 = r7.size()
            int r7 = r7 - r4
            java.lang.Object r3 = r3.get(r7)
            com.bytedance.android.livesdk.gift.model.f r3 = (com.bytedance.android.livesdk.gift.model.C7507f) r3
            boolean r3 = r3.f20573c
            if (r3 == 0) goto L_0x00a7
            android.view.View r3 = r2.f19787d
            r3.setVisibility(r5)
            android.view.View r3 = r2.f19788e
            r3.setVisibility(r6)
            goto L_0x00b1
        L_0x00a7:
            android.view.View r3 = r2.f19787d
            r3.setVisibility(r5)
            android.view.View r3 = r2.f19788e
            r3.setVisibility(r5)
        L_0x00b1:
            java.util.List<com.bytedance.android.livesdk.gift.model.f> r3 = r2.f19786c
            int r3 = r3.size()
            if (r5 >= r3) goto L_0x00d0
            java.util.List<com.bytedance.android.livesdk.gift.model.f> r3 = r2.f19786c
            java.lang.Object r3 = r3.get(r5)
            com.bytedance.android.livesdk.gift.model.f r3 = (com.bytedance.android.livesdk.gift.model.C7507f) r3
            if (r3 == 0) goto L_0x00cd
            boolean r3 = r3.f20573c
            if (r3 == 0) goto L_0x00cd
            android.support.v7.widget.RecyclerView r3 = r2.f19784a
            r3.mo4814b(r5)
            goto L_0x00d0
        L_0x00cd:
            int r5 = r5 + 1
            goto L_0x00b1
        L_0x00d0:
            com.bytedance.android.livesdk.gift.dialog.view.topbar.LiveGiftGroupView$a r2 = r2.f19785b
            r2.notifyDataSetChanged()
            goto L_0x00d7
        L_0x00d6:
            r4 = 0
        L_0x00d7:
            if (r4 == 0) goto L_0x00df
            com.bytedance.android.livesdk.gift.dialog.view.topbar.LiveGiftGroupView r9 = r0.f19800b
            r0.mo13519a(r9)
            return
        L_0x00df:
            com.bytedance.android.livesdk.gift.dialog.view.topbar.LiveNobleGiftView r2 = r0.f19801c
            boolean r9 = r2.mo13521a(r9)
            if (r9 == 0) goto L_0x00ed
            com.bytedance.android.livesdk.gift.dialog.view.topbar.LiveNobleGiftView r9 = r0.f19801c
            r0.mo13519a(r9)
            return
        L_0x00ed:
            boolean r9 = r0.f19804f
            if (r9 == 0) goto L_0x00f7
            com.bytedance.android.livesdk.gift.dialog.view.topbar.LiveFirstChargeView r9 = r0.f19802d
            r0.mo13519a(r9)
            return
        L_0x00f7:
            java.lang.Boolean.valueOf(r1)
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.dialog.view.topbar.C7282d.onChanged(java.lang.Object):void");
    }
}
