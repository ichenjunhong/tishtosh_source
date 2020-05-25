package com.p683ss.android.ugc.aweme.commercialize.feed.p1569c;

import android.view.View;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1317c.C22400a;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22434b;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.c.c */
public final class C25893c extends C25889a {
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e6, code lost:
        if (r1 != null) goto L_0x00eb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ba A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bb  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53215c() {
        /*
            r5 = this;
            android.widget.LinearLayout r0 = r5.f68424g
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 2132215184(0x7f170590, float:2.007423E38)
            android.view.View r0 = r5.mo53211a(r0, r1)
            r1 = 2132017250(0x7f140062, float:1.9672773E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "layout.findViewById(R.id.ad_desc)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.ad.view.DescTextView r1 = (com.p683ss.android.ugc.aweme.p1308ad.view.DescTextView) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.f68420c
            java.lang.String r2 = r2.getDesc()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0064
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.f68420c
            java.lang.String r2 = r2.getDesc()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x003f
            java.lang.String r2 = r2.getAdMoreTextual()
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0064
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 != 0) goto L_0x0053
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0053:
            java.lang.String r3 = "aweme.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r2 = r2.getAdMoreTextual()
            if (r2 != 0) goto L_0x0061
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0061:
            r1.setMoreString(r2)
        L_0x0064:
            r2 = r5
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            r1 = 2132017267(0x7f140073, float:1.9672808E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r3 = "layout.findViewById(R.id.ad_icon)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.ss.android.ugc.aweme.ad.common.legacy.image.RemoteImageView r1 = (com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image.RemoteImageView) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f68420c
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            if (r3 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f68420c
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            java.lang.String r4 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.getAvatarMedium()
            if (r3 != 0) goto L_0x0092
            goto L_0x00a5
        L_0x0092:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f68420c
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            java.lang.String r4 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.getAvatarMedium()
            com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image.C22389f.m55398a(r1, r3)
            goto L_0x00af
        L_0x00a5:
            r3 = 2131953301(0x7f130695, float:1.954307E38)
            com.ss.android.ugc.aweme.base.model.a r3 = com.p683ss.android.ugc.aweme.base.model.C23556a.m57755a(r3)
            com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image.C22389f.m55400a(r1, r3)
        L_0x00af:
            r1.setOnClickListener(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 != 0) goto L_0x00bb
            return
        L_0x00bb:
            r1 = 2132017287(0x7f140087, float:1.9672848E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "layout.findViewById(R.id.ad_name)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f68420c
            r3 = 3
            boolean r1 = com.p683ss.android.ugc.aweme.p1308ad.utils.C22445l.m55475a(r1, r3)
            if (r1 == 0) goto L_0x00f1
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 == 0) goto L_0x00e9
            com.ss.android.ugc.aweme.commercialize.model.y r1 = r1.getOmVast()
            if (r1 == 0) goto L_0x00e9
            com.bytedance.t.b.f r1 = r1.vast
            if (r1 == 0) goto L_0x00e9
            java.lang.String r1 = r1.adTitle
            if (r1 == 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            java.lang.String r1 = ""
        L_0x00eb:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            goto L_0x0105
        L_0x00f1:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f68420c
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            java.lang.String r3 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.lang.String r1 = r1.getNickname()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0105:
            r0.setOnClickListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.feed.p1569c.C25893c.mo53215c():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53213a(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.bi) {
            C22434b.m55466c(this.f68423f);
            this.f68422e.mo46461a(12);
        } else if (num != null && num.intValue() == R.id.by) {
            C22434b.m55466c(this.f68423f);
            this.f68422e.mo46461a(11);
        } else {
            if (num != null && num.intValue() == R.id.c9) {
                C22434b.m55466c(this.f68423f);
                this.f68422e.mo46461a(14);
            }
        }
    }

    public C25893c(LinearLayout linearLayout, C22400a aVar) {
        C52711k.m112240b(linearLayout, "feedAdLayout");
        C52711k.m112240b(aVar, "adMaskParams");
        super(linearLayout, aVar);
    }
}
