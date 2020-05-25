package com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.p1807im.sdk.arch.p1810a.C33254b;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.b */
public final class C34185b extends C33254b<C34186c, IMUser> {

    /* renamed from: a */
    public final C0184k f88327a;

    public C34185b(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        super(null, 1, null);
        this.f88327a = kVar;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        return new C34186c(this.f88327a, viewGroup);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        if (r4.contains(r5) == true) goto L_0x006e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48222a(android.support.p043v7.widget.RecyclerView.C1352v r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34186c
            if (r0 == 0) goto L_0x0072
            java.lang.Object r5 = r3.mo70602b(r5)
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser) r5
            if (r5 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.im.sdk.group.a.c r4 = (com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34186c) r4
            r4.f88332e = r5
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r4.f88329b
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r0
            r1 = 0
            if (r5 == 0) goto L_0x001c
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r5.getAvatarThumb()
            goto L_0x001d
        L_0x001c:
            r2 = r1
        L_0x001d:
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r0, r2)
            if (r5 == 0) goto L_0x0027
            java.lang.String r0 = r5.getRemarkName()
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003e
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r4.f88331d
            if (r5 == 0) goto L_0x0038
            java.lang.String r1 = r5.getRemarkName()
        L_0x0038:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            goto L_0x004b
        L_0x003e:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r4.f88331d
            if (r5 == 0) goto L_0x0046
            java.lang.String r1 = r5.getNickName()
        L_0x0046:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x004b:
            android.widget.ImageView r0 = r4.f88330c
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupFollowMemberViewModel r4 = r4.mo72200a()
            r1 = 1
            if (r4 == 0) goto L_0x006d
            java.util.List r4 = r4.mo73183o()
            if (r4 == 0) goto L_0x006d
            if (r5 == 0) goto L_0x0065
            com.ss.android.ugc.aweme.im.service.model.IMContact r5 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r5
            boolean r4 = r4.contains(r5)
            if (r4 != r1) goto L_0x006d
            goto L_0x006e
        L_0x0065:
            d.u r4 = new d.u
            java.lang.String r5 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMContact"
            r4.<init>(r5)
            throw r4
        L_0x006d:
            r1 = 0
        L_0x006e:
            r0.setSelected(r1)
            return
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34185b.mo48222a(android.support.v7.widget.RecyclerView$v, int):void");
    }
}
