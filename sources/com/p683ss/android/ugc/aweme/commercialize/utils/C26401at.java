package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g;
import com.p683ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p683ss.android.ugc.aweme.router.C41302w;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.at */
public final class C26401at {

    /* renamed from: a */
    public static final C26401at f69646a = new C26401at();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.at$a */
    public static final class C26402a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ BlueVBrandInfo f69647a;

        C26402a(BlueVBrandInfo blueVBrandInfo) {
            this.f69647a = blueVBrandInfo;
        }

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            C23051bf brandScheme = inst.getBrandScheme();
            C52711k.m112236a((Object) brandScheme, "SharePrefCache.inst().brandScheme");
            Object d = brandScheme.mo47782d();
            C52711k.m112236a(d, "SharePrefCache.inst().brandScheme.cache");
            String uri = C37382g.m83707a((String) d).mo76659a("brand_category_id", String.valueOf(this.f69647a.getCategoryId())).mo76658a().toString();
            C52711k.m112236a((Object) uri, "RnSchemeHelper.parseRnSc…      .build().toString()");
            if (!TextUtils.isEmpty(uri)) {
                C41302w.m91042a().mo83861a(uri);
            }
        }
    }

    private C26401at() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r10 == null) goto L_0x0026;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m63860a(android.widget.TextView r8, com.p683ss.android.ugc.aweme.profile.model.BlueVBrandInfo r9, int r10) {
        /*
            java.lang.String r10 = "textView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r10)
            java.lang.String r10 = "brandInfo"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r10)
            int r10 = r9.getRank()
            if (r10 <= 0) goto L_0x00c9
            int r10 = r9.getRank()
            r0 = 30
            if (r10 <= r0) goto L_0x001a
            goto L_0x00c9
        L_0x001a:
            java.lang.CharSequence r10 = r8.getText()
            if (r10 == 0) goto L_0x0026
            java.lang.String r10 = r10.toString()
            if (r10 != 0) goto L_0x0028
        L_0x0026:
            java.lang.String r10 = ""
        L_0x0028:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r2 = " T"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.<init>(r1)
            com.ss.android.ugc.aweme.ae.d.a r2 = new com.ss.android.ugc.aweme.ae.d.a
            int r1 = r9.getRank()
            java.lang.String r3 = r9.getTagName()
            r4 = 4
            r2.<init>(r1, r3, r4)
            int r1 = r10.length()
            int r1 = r1 + 1
            int r10 = r10.length()
            int r10 = r10 + 2
            r3 = 33
            r0.setSpan(r2, r1, r10, r3)
            com.ss.android.ugc.aweme.commercialize.utils.at$a r4 = new com.ss.android.ugc.aweme.commercialize.utils.at$a
            r4.<init>(r9)
            r0.setSpan(r4, r1, r10, r3)
            com.ss.android.ugc.aweme.commercialize.utils.as r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26400as.f69645a
            android.text.method.MovementMethod r9 = (android.text.method.MovementMethod) r9
            r8.setMovementMethod(r9)
            r9 = 0
            r8.setClickable(r9)
            r8.setLongClickable(r9)
            float r9 = r8.getTextSize()
            android.text.TextPaint r10 = r8.getPaint()
            r3 = r10
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r10 = r0.length()
            int r5 = r10 + -1
            int r6 = r0.length()
            android.text.TextPaint r10 = r8.getPaint()
            java.lang.String r1 = "textView.paint"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r1)
            android.graphics.Paint$FontMetricsInt r7 = r10.getFontMetricsInt()
            int r5 = r2.getSize(r3, r4, r5, r6, r7)
            android.text.TextPaint r10 = r8.getPaint()
            java.lang.String r1 = "textView.paint"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r1)
            r10.setTextSize(r9)
            android.text.TextPaint r1 = r8.getPaint()
            int r2 = r8.getMaxWidth()
            int r3 = r8.getMaxLines()
            r4 = 1
            android.text.SpannableStringBuilder r9 = com.p683ss.android.ugc.aweme.p1323ae.p1326c.C22473b.m55522a(r0, r1, r2, r3, r4, r5)
            java.lang.String r10 = "TagUtil.ellipsizeText2Ex….maxLines, 1, imageWidth)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r8.setText(r9)
            r8.requestLayout()
            return
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26401at.m63860a(android.widget.TextView, com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo, int):void");
    }
}
