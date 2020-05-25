package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.a */
final /* synthetic */ class C7580a implements C0199s {

    /* renamed from: a */
    private final GiftConfigurablePanelTabWidget f20913a;

    C7580a(GiftConfigurablePanelTabWidget giftConfigurablePanelTabWidget) {
        this.f20913a = giftConfigurablePanelTabWidget;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(java.lang.Object r11) {
        /*
            r10 = this;
            com.bytedance.android.livesdk.gift.panel.widget.GiftConfigurablePanelTabWidget r0 = r10.f20913a
            java.util.List r11 = (java.util.List) r11
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftPage> r1 = r0.f20734a
            r1.clear()
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftPage> r1 = r0.f20734a
            r1.addAll(r11)
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftPage> r11 = r0.f20734a
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x001e
            android.view.ViewGroup r11 = r0.containerView
            r0 = 8
            r11.setVisibility(r0)
            return
        L_0x001e:
            android.view.ViewGroup r11 = r0.containerView
            r1 = 0
            r11.setVisibility(r1)
            java.util.Map<android.view.View, java.lang.Integer> r11 = r0.f20735b
            r11.clear()
            r11 = 0
            r0.f20737d = r11
            android.widget.LinearLayout r11 = r0.f20736c
            r11.removeAllViews()
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftPage> r11 = r0.f20734a
            java.util.Iterator r11 = r11.iterator()
        L_0x0037:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0100
            java.lang.Object r2 = r11.next()
            com.bytedance.android.livesdk.gift.model.GiftPage r2 = (com.bytedance.android.livesdk.gift.model.GiftPage) r2
            boolean r3 = r2.display
            if (r3 == 0) goto L_0x0037
            int r3 = r2.pageType
            r4 = 1096810496(0x41600000, float:14.0)
            r5 = 2131822573(0x7f1107ed, float:1.9277921E38)
            r6 = 5
            r7 = 17
            if (r3 != r6) goto L_0x007d
            com.bytedance.android.livesdk.gift.dialog.view.GiftTabTextView r8 = new com.bytedance.android.livesdk.gift.dialog.view.GiftTabTextView
            android.content.Context r9 = r0.context
            r8.<init>(r9)
            java.lang.String r9 = r2.pageName
            r8.setText(r9)
            android.content.Context r9 = r0.context
            android.content.res.Resources r9 = r9.getResources()
            int r5 = r9.getColor(r5)
            r8.setTextColor(r5)
            r8.setTextSize(r4)
            r8.setGravity(r7)
            r0.f20740g = r8
            boolean r4 = r0.f20741h
            if (r4 == 0) goto L_0x00a3
            r4 = 1
            r0.mo13944a(r4)
            goto L_0x00a3
        L_0x007d:
            android.widget.TextView r8 = new android.widget.TextView
            android.content.Context r9 = r0.context
            r8.<init>(r9)
            java.lang.String r9 = r2.pageName
            r8.setText(r9)
            android.content.Context r9 = r0.context
            android.content.res.Resources r9 = r9.getResources()
            int r5 = r9.getColor(r5)
            r8.setTextColor(r5)
            r8.setTextSize(r4)
            r8.setGravity(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r8.setTag(r4)
        L_0x00a3:
            android.widget.LinearLayout r4 = r0.f20736c
            r4.addView(r8)
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            boolean r4 = r4 instanceof android.widget.LinearLayout.LayoutParams
            if (r4 == 0) goto L_0x00d8
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            r5 = -2
            r4.width = r5
            r5 = -1
            r4.height = r5
            android.content.Context r5 = r0.context
            r9 = 1098907648(0x41800000, float:16.0)
            float r5 = com.bytedance.android.livesdk.p279af.C4577ap.m10990a(r5, r9)
            int r5 = (int) r5
            r4.leftMargin = r5
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r7) goto L_0x00d5
            android.content.Context r5 = r0.context
            float r5 = com.bytedance.android.livesdk.p279af.C4577ap.m10990a(r5, r9)
            int r5 = (int) r5
            r4.setMarginStart(r5)
        L_0x00d5:
            r8.setLayoutParams(r4)
        L_0x00d8:
            java.util.Map<android.view.View, java.lang.Integer> r4 = r0.f20735b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4.put(r8, r5)
            com.bytedance.android.livesdk.gift.panel.widget.f r4 = new com.bytedance.android.livesdk.gift.panel.widget.f
            r4.<init>(r0, r8, r2)
            r8.setOnClickListener(r4)
            android.view.View r4 = r0.f20737d
            if (r4 != 0) goto L_0x0037
            boolean r4 = r0.f20739f
            if (r4 == 0) goto L_0x00f3
            if (r3 != r6) goto L_0x0037
        L_0x00f3:
            r0.mo13942a(r8, r1, r2)
            com.bytedance.android.livesdk.gift.panel.widget.g r2 = new com.bytedance.android.livesdk.gift.panel.widget.g
            r2.<init>(r0)
            r8.post(r2)
            goto L_0x0037
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.panel.widget.C7580a.onChanged(java.lang.Object):void");
    }
}
