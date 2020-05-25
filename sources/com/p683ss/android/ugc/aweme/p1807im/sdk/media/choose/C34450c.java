package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C33298c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34463a;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.c */
public final class C34450c extends C33298c<C34463a> {

    /* renamed from: b */
    public C34463a f88866b;

    /* renamed from: c */
    private RemoteImageView f88867c;

    /* renamed from: d */
    private TextView f88868d;

    /* renamed from: e */
    private TextView f88869e;

    /* renamed from: b */
    public final void mo70628b() {
        super.mo70628b();
        Object a = mo70624a((int) R.id.avo);
        C52711k.m112236a(a, "findViewById(R.id.item_image_view)");
        this.f88867c = (RemoteImageView) a;
        Object a2 = mo70624a((int) R.id.axe);
        C52711k.m112236a(a2, "findViewById(R.id.item_tv)");
        this.f88868d = (TextView) a2;
        Object a3 = mo70624a((int) R.id.d8u);
        C52711k.m112236a(a3, "findViewById(R.id.tv_count)");
        this.f88869e = (TextView) a3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00dd, code lost:
        if (r2 == null) goto L_0x00df;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70626a(com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34463a r10) {
        /*
            r9 = this;
            java.lang.String r0 = "album"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            super.mo70626a(r10)
            android.widget.TextView r0 = r9.f88868d
            if (r0 != 0) goto L_0x0011
            java.lang.String r1 = "textView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0011:
            boolean r1 = r10.f88897b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0035
            android.view.View r1 = r9.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            android.content.Context r1 = r1.getContext()
            java.lang.String r4 = "itemView.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2132545202(0x7f1c0eb2, float:2.0743587E38)
            java.lang.String r1 = r1.getString(r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x0053
        L_0x0035:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r4 = "Locale.ENGLISH"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            java.lang.String r4 = "%1$s"
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = r10.f88898c
            r5[r2] = r6
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r3)
            java.lang.String r1 = com.C2240a.m6773a(r1, r4, r5)
            java.lang.String r4 = "java.lang.String.format(locale, format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x0053:
            r0.setText(r1)
            android.widget.TextView r0 = r9.f88869e
            if (r0 != 0) goto L_0x005f
            java.lang.String r1 = "countView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x005f:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r4 = "Locale.ENGLISH"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            java.lang.String r4 = "%1$d"
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.util.List r6 = r10.mo72475a()
            int r6 = r6.size()
            java.util.List r7 = r10.mo72476b()
            int r7 = r7.size()
            int r6 = r6 + r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r2] = r6
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r3)
            java.lang.String r1 = com.C2240a.m6773a(r1, r4, r5)
            java.lang.String r4 = "java.lang.String.format(locale, format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r9.f88867c
            if (r0 != 0) goto L_0x009c
            java.lang.String r1 = "imageView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x009c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "file://"
            r1.<init>(r4)
            java.util.List r4 = r10.mo72475a()
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r3
            r5 = 0
            if (r4 == 0) goto L_0x00bc
            java.util.List r4 = r10.mo72475a()
            java.lang.Object r4 = r4.get(r2)
            com.ss.android.ugc.aweme.im.sdk.media.b.a r4 = (com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a) r4
            goto L_0x00bd
        L_0x00bc:
            r4 = r5
        L_0x00bd:
            java.util.List r6 = r10.mo72476b()
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x00d5
            java.util.List r3 = r10.mo72476b()
            java.lang.Object r2 = r3.get(r2)
            r5 = r2
            com.ss.android.ugc.aweme.im.sdk.media.b.a r5 = (com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a) r5
        L_0x00d5:
            if (r4 != 0) goto L_0x00e2
            if (r5 == 0) goto L_0x00df
            java.lang.String r2 = r5.getThumbnail()
            if (r2 != 0) goto L_0x0116
        L_0x00df:
            java.lang.String r2 = ""
            goto L_0x0116
        L_0x00e2:
            if (r5 != 0) goto L_0x00f3
            java.lang.String r2 = r4.getThumbnail()
            if (r2 != 0) goto L_0x00ee
            java.lang.String r2 = r4.getFilePath()
        L_0x00ee:
            if (r2 != 0) goto L_0x0116
            java.lang.String r2 = ""
            goto L_0x0116
        L_0x00f3:
            long r2 = r4.getDateModify()
            long r6 = r5.getDateModify()
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x010e
            java.lang.String r2 = r4.getThumbnail()
            if (r2 != 0) goto L_0x0109
            java.lang.String r2 = r4.getFilePath()
        L_0x0109:
            if (r2 != 0) goto L_0x0116
            java.lang.String r2 = ""
            goto L_0x0116
        L_0x010e:
            java.lang.String r2 = r5.getThumbnail()
            if (r2 != 0) goto L_0x0116
            java.lang.String r2 = ""
        L_0x0116:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 150(0x96, float:2.1E-43)
            com.p683ss.android.ugc.aweme.base.C23515d.m57686b(r0, r1, r2, r2)
            r9.f88866b = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.C34450c.mo70626a(com.ss.android.ugc.aweme.im.sdk.media.choose.d.a):void");
    }

    public C34450c(View view, final C52671b<? super C34463a, C52860x> bVar) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(bVar, "openAlbum");
        super(view);
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C34450c f88870a;

            {
                this.f88870a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C34463a aVar = this.f88870a.f88866b;
                if (aVar != null) {
                    bVar.invoke(aVar);
                }
            }
        });
    }
}
