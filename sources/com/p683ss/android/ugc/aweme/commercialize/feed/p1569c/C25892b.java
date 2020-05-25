package com.p683ss.android.ugc.aweme.commercialize.feed.p1569c;

import android.view.View;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1317c.C22400a;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22434b;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.c.b */
public final class C25892b extends C25889a {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ee  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53215c() {
        /*
            r10 = this;
            android.widget.LinearLayout r0 = r10.f68424g
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 2132215183(0x7f17058f, float:2.0074229E38)
            android.view.View r0 = r10.mo53211a(r0, r1)
            r1 = 2132017250(0x7f140062, float:1.9672773E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "layout.findViewById(R.id.ad_desc)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.ad.view.DescTextView r1 = (com.p683ss.android.ugc.aweme.p1308ad.view.DescTextView) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r10.f68420c
            java.lang.String r2 = r2.getDesc()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 0
            if (r2 != 0) goto L_0x0065
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r10.f68420c
            java.lang.String r2 = r2.getDesc()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r10.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x0040
            java.lang.String r2 = r2.getAdMoreTextual()
            goto L_0x0041
        L_0x0040:
            r2 = r3
        L_0x0041:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0065
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r10.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 != 0) goto L_0x0054
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0054:
            java.lang.String r4 = "aweme.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            java.lang.String r2 = r2.getAdMoreTextual()
            if (r2 != 0) goto L_0x0062
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0062:
            r1.setMoreString(r2)
        L_0x0065:
            r2 = r10
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            r1 = 2132017267(0x7f140073, float:1.9672808E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r4 = "layout.findViewById(R.id.ad_icon)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            com.ss.android.ugc.aweme.ad.common.legacy.image.RemoteImageView r1 = (com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image.RemoteImageView) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.f68420c
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getAuthor()
            if (r4 == 0) goto L_0x00a6
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.f68420c
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getAuthor()
            java.lang.String r5 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getAvatarMedium()
            if (r4 != 0) goto L_0x0093
            goto L_0x00a6
        L_0x0093:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.f68420c
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getAuthor()
            java.lang.String r5 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getAvatarMedium()
            com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image.C22389f.m55398a(r1, r4)
            goto L_0x00b0
        L_0x00a6:
            r4 = 2131953301(0x7f130695, float:1.954307E38)
            com.ss.android.ugc.aweme.base.model.a r4 = com.p683ss.android.ugc.aweme.base.model.C23556a.m57755a(r4)
            com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image.C22389f.m55400a(r1, r4)
        L_0x00b0:
            r1.setOnClickListener(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r10.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 != 0) goto L_0x00bc
            return
        L_0x00bc:
            r1 = 2132017287(0x7f140087, float:1.9672848E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r4 = "layout.findViewById(R.id.ad_name)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.f68420c
            r5 = 3
            boolean r4 = com.p683ss.android.ugc.aweme.p1308ad.utils.C22445l.m55475a(r4, r5)
            if (r4 == 0) goto L_0x010a
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r4.getAwemeRawAd()
            if (r4 == 0) goto L_0x00e8
            com.ss.android.ugc.aweme.commercialize.model.y r4 = r4.getOmVast()
            if (r4 == 0) goto L_0x00e8
            com.bytedance.t.b.f r4 = r4.vast
            if (r4 == 0) goto L_0x00e8
            java.lang.String r4 = r4.adTitle
            goto L_0x00e9
        L_0x00e8:
            r4 = r3
        L_0x00e9:
            if (r4 != 0) goto L_0x00ee
            java.lang.String r4 = ""
            goto L_0x0104
        L_0x00ee:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r4.getAwemeRawAd()
            if (r4 == 0) goto L_0x0103
            com.ss.android.ugc.aweme.commercialize.model.y r4 = r4.getOmVast()
            if (r4 == 0) goto L_0x0103
            com.bytedance.t.b.f r4 = r4.vast
            if (r4 == 0) goto L_0x0103
            java.lang.String r4 = r4.adTitle
            goto L_0x0104
        L_0x0103:
            r4 = r3
        L_0x0104:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r1.setText(r4)
            goto L_0x012a
        L_0x010a:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.f68420c
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getAuthor()
            if (r4 != 0) goto L_0x0117
            java.lang.String r4 = ""
        L_0x0114:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            goto L_0x0127
        L_0x0117:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.f68420c
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getAuthor()
            java.lang.String r5 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r4 = r4.getNickname()
            goto L_0x0114
        L_0x0127:
            r1.setText(r4)
        L_0x012a:
            r1.setOnClickListener(r2)
            r1 = 2132017283(0x7f140083, float:1.967284E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r4 = "layout.findViewById(R.id.ad_like_layout)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r4 = 2132017309(0x7f14009d, float:1.9672893E38)
            android.view.View r4 = r0.findViewById(r4)
            java.lang.String r5 = "layout.findViewById(R.id.ad_rating_view)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.ad.view.AdRatingView r4 = (com.p683ss.android.ugc.aweme.p1308ad.view.AdRatingView) r4
            r5 = 2132017228(0x7f14004c, float:1.9672728E38)
            android.view.View r5 = r0.findViewById(r5)
            java.lang.String r6 = "layout.findViewById(R.id.ad_app_use_number)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 2132017280(0x7f140080, float:1.9672834E38)
            android.view.View r6 = r0.findViewById(r6)
            java.lang.String r7 = "layout.findViewById(R.id.ad_like_divide)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r10.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r7.getAwemeRawAd()
            if (r7 == 0) goto L_0x0170
            java.lang.String r7 = r7.getAppInstall()
            goto L_0x0171
        L_0x0170:
            r7 = r3
        L_0x0171:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r8 = 1082130432(0x40800000, float:4.0)
            r9 = 8
            if (r7 == 0) goto L_0x019f
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r10.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r7.getAwemeRawAd()
            if (r7 == 0) goto L_0x018e
            float r7 = r7.getAppLike()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            goto L_0x018f
        L_0x018e:
            r7 = r3
        L_0x018f:
            if (r7 != 0) goto L_0x0194
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0194:
            float r7 = r7.floatValue()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x019f
            r1.setVisibility(r9)
        L_0x019f:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r10.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r7.getAwemeRawAd()
            if (r7 == 0) goto L_0x01ac
            java.lang.String r7 = r7.getAppInstall()
            goto L_0x01ad
        L_0x01ac:
            r7 = r3
        L_0x01ad:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x01bc
            r5.setVisibility(r9)
            r6.setVisibility(r9)
            goto L_0x01cf
        L_0x01bc:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r10.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r7.getAwemeRawAd()
            if (r7 == 0) goto L_0x01c9
            java.lang.String r7 = r7.getAppInstall()
            goto L_0x01ca
        L_0x01c9:
            r7 = r3
        L_0x01ca:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r5.setText(r7)
        L_0x01cf:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r10.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r5.getAwemeRawAd()
            if (r5 == 0) goto L_0x01e0
            float r5 = r5.getAppLike()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            goto L_0x01e1
        L_0x01e0:
            r5 = r3
        L_0x01e1:
            if (r5 != 0) goto L_0x01e6
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01e6:
            float r5 = r5.floatValue()
            r4.setRatingProgress(r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r10.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r5.getAwemeRawAd()
            if (r5 == 0) goto L_0x01fd
            float r3 = r5.getAppLike()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
        L_0x01fd:
            if (r3 != 0) goto L_0x0202
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0202:
            float r3 = r3.floatValue()
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0210
            r4.setVisibility(r9)
            r6.setVisibility(r9)
        L_0x0210:
            r1.setOnClickListener(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r10.f68420c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 == 0) goto L_0x026a
            java.lang.String[] r1 = r1.getAppCategory()
            if (r1 == 0) goto L_0x026a
            r3 = 2132017330(0x7f1400b2, float:1.9672935E38)
            android.view.View r0 = r0.findViewById(r3)
            java.lang.String r3 = "layout.findViewById(R.id.ad_tag_layout)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            com.ss.android.ugc.aweme.ad.view.AdTagGroup r0 = (com.p683ss.android.ugc.aweme.p1308ad.view.AdTagGroup) r0
            int r3 = r1.length
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0236
            r3 = 1
            goto L_0x0237
        L_0x0236:
            r3 = 0
        L_0x0237:
            r3 = r3 ^ r5
            if (r3 == 0) goto L_0x0263
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r5 = r1.length
            r6 = 0
        L_0x0241:
            if (r6 >= r5) goto L_0x0252
            r7 = r1[r6]
            int r8 = r7.length()
            r9 = 6
            if (r8 > r9) goto L_0x024f
            r3.add(r7)
        L_0x024f:
            int r6 = r6 + 1
            goto L_0x0241
        L_0x0252:
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.Object[] r1 = r3.toArray(r1)
            java.lang.String r3 = "strings.toArray(arrayOf<String>())"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.setTagList(r1)
            goto L_0x0266
        L_0x0263:
            r0.setVisibility(r9)
        L_0x0266:
            r0.setOnClickListener(r2)
            return
        L_0x026a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.feed.p1569c.C25892b.mo53215c():void");
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
        } else if (num != null && num.intValue() == R.id.c9) {
            C22434b.m55466c(this.f68423f);
            this.f68422e.mo46461a(14);
        } else if (num != null && num.intValue() == R.id.c6) {
            C22434b.m55466c(this.f68423f);
            this.f68422e.mo46461a(13);
        } else {
            if (num != null && num.intValue() == R.id.d0) {
                C22434b.m55466c(this.f68423f);
                this.f68422e.mo46461a(15);
            }
        }
    }

    public C25892b(LinearLayout linearLayout, C22400a aVar) {
        C52711k.m112240b(linearLayout, "feedAdLayout");
        C52711k.m112240b(aVar, "adMaskParams");
        super(linearLayout, aVar);
    }
}
