package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ae */
public class C33739ae extends C33809cc {
    public C33739ae(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0086, code lost:
        if (r3 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011f, code lost:
        if (r8 != null) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005f, code lost:
        if (r3 == null) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71780a(com.bytedance.p702im.core.p706c.C11207p r8, com.bytedance.p702im.core.p706c.C11207p r9, com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent r10, int r11) {
        /*
            r7 = this;
            super.mo71780a(r8, r9, r10, r11)
            if (r10 == 0) goto L_0x0188
            com.ss.android.ugc.aweme.im.sdk.chat.model.GroupInviteContent r10 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.GroupInviteContent) r10
            android.view.View r8 = r7.f87708j
            r9 = 50331648(0x3000000, float:3.761582E-37)
            r11 = 37
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8.setTag(r9, r11)
            android.view.View r8 = r7.f87708j
            r9 = 67108864(0x4000000, float:1.5046328E-36)
            com.bytedance.im.core.c.p r11 = r7.f87712n
            r8.setTag(r9, r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r7.f87727w
            java.lang.String r9 = "titleView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            android.content.Context r9 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r9 = r9.getResources()
            r11 = 2132545352(0x7f1c0f48, float:2.0743891E38)
            java.lang.String r9 = r9.getString(r11)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r8.setText(r9)
            com.ss.android.ugc.aweme.im.sdk.group.model.e r8 = r10.getGroupInviteCardInfo()
            r9 = 2132545334(0x7f1c0f36, float:2.0743855E38)
            r10 = 2132545348(0x7f1c0f44, float:2.0743883E38)
            r11 = 1
            r0 = 2
            r1 = 0
            if (r8 == 0) goto L_0x0121
            com.bytedance.im.core.c.d r2 = com.bytedance.p702im.core.p706c.C11182d.m22641a()
            java.lang.String r3 = r8.getConversationId()
            com.bytedance.im.core.c.b r2 = r2.mo20658a(r3)
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r8.getGroupIcon()
            r4 = 0
            if (r3 == 0) goto L_0x0061
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = r7.f87726v
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r5, r3)
            if (r3 != 0) goto L_0x0074
        L_0x0061:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r7.f87726v
            if (r2 == 0) goto L_0x0070
            com.bytedance.im.core.c.c r5 = r2.getCoreInfo()
            if (r5 == 0) goto L_0x0070
            java.lang.String r5 = r5.getIcon()
            goto L_0x0071
        L_0x0070:
            r5 = r4
        L_0x0071:
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r3, r5)
        L_0x0074:
            com.ss.android.ugc.aweme.im.sdk.d.e r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
            java.lang.String r5 = r8.getFromUserId()
            com.ss.android.ugc.aweme.im.service.model.IMUser r3 = r3.mo71952a(r5)
            if (r3 == 0) goto L_0x0088
            java.lang.String r3 = r3.getDisplayName()
            if (r3 != 0) goto L_0x0094
        L_0x0088:
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getString(r9)
        L_0x0094:
            java.lang.String r5 = r8.getGroupName()
            if (r5 != 0) goto L_0x00a7
            if (r2 == 0) goto L_0x00a8
            com.bytedance.im.core.c.c r2 = r2.getCoreInfo()
            if (r2 == 0) goto L_0x00a8
            java.lang.String r4 = r2.getName()
            goto L_0x00a8
        L_0x00a7:
            r4 = r5
        L_0x00a8:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r7.f87728x
            java.lang.String r5 = "descView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            r2.setMaxLines(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r7.f87728x
            java.lang.String r5 = "descView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r5 = r5.getResources()
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r6[r1] = r3
            r6[r11] = r4
            java.lang.String r3 = r5.getString(r10, r6)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r7.f87728x
            java.lang.String r3 = "descView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r2.setVisibility(r1)
            int r2 = r8.getMemberCount()
            if (r2 <= 0) goto L_0x011f
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r7.f87727w
            java.lang.String r3 = "titleView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.setText(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r7.f87728x
            java.lang.String r3 = "descView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.view.View r3 = r7.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            android.content.Context r3 = r3.getContext()
            java.lang.String r4 = "itemView.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2132542744(0x7f1c0518, float:2.0738602E38)
            java.lang.Object[] r5 = new java.lang.Object[r11]
            int r6 = r8.getMemberCount()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r1] = r6
            java.lang.String r3 = r3.getString(r4, r5)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
        L_0x011f:
            if (r8 != 0) goto L_0x016e
        L_0x0121:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r7.f87728x
            java.lang.String r2 = "descView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r2)
            r8.setMaxLines(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r7.f87728x
            java.lang.String r2 = "descView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r2)
            r8.setVisibility(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r7.f87728x
            java.lang.String r2 = "descView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r2)
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r2 = r2.getResources()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r9 = r3.getString(r9)
            r0[r1] = r9
            android.content.Context r9 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r9 = r9.getResources()
            r1 = 2132545333(0x7f1c0f35, float:2.0743853E38)
            java.lang.String r9 = r9.getString(r1)
            r0[r11] = r9
            java.lang.String r9 = r2.getString(r10, r0)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r8.setText(r9)
        L_0x016e:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r7.f87729y
            java.lang.String r9 = "tagView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            android.content.Context r9 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2132545354(0x7f1c0f4a, float:2.0743895E38)
            java.lang.CharSequence r9 = r9.getText(r10)
            r8.setText(r9)
            return
        L_0x0188:
            d.u r8 = new d.u
            java.lang.String r9 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.model.GroupInviteContent"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33739ae.mo71780a(com.bytedance.im.core.c.p, com.bytedance.im.core.c.p, com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent, int):void");
    }
}
