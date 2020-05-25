package com.p683ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.commercialize.C25944j;
import com.p683ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.C26633b;
import com.p683ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.C26636c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout */
public final class OpenURLHintLayout extends HeaderFrameLayout implements OnClickListener {

    /* renamed from: f */
    private Aweme f70169f;

    /* renamed from: g */
    private boolean f70170g;

    /* access modifiers changed from: protected */
    public final boolean getCanScaleContent() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean getCanScroll() {
        return this.f70170g;
    }

    public OpenURLHintLayout(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
        setHeaderId(R.id.cd);
    }

    /* renamed from: a */
    public final void mo54442a(Aweme aweme) {
        setScrollOffset(0);
        setAweme(aweme);
        if (this.f70170g) {
            C25944j.m62908a().getFeedRawAdLogService().mo53152p(getContext(), aweme);
            View header = getHeader();
            if (header != null) {
                postDelayed(new C26633b(this, header, this), 500);
            }
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C52711k.m112240b(view, "v");
        int id = view.getId();
        if (id == R.id.cc) {
            C25944j.m62908a().getAdOpenUtilsService().mo53196b(getContext(), this.f70169f);
            C25944j.m62908a().getFeedRawAdLogService().mo53154r(getContext(), this.f70169f);
            return;
        }
        if (id == R.id.ca) {
            View header = getHeader();
            if (header != null) {
                postDelayed(new C26636c(this, header, this), 0);
            }
            C25944j.m62908a().getFeedRawAdLogService().mo53153q(getContext(), this.f70169f);
            setAweme(null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setAweme(com.p683ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r9.getAwemeRawAd()
            if (r0 == 0) goto L_0x000d
            int r0 = r0.getTipsType()
            goto L_0x000e
        L_0x000d:
            r0 = -1
        L_0x000e:
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x00bc
            com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService r0 = com.p683ss.android.ugc.aweme.commercialize.C25944j.m62908a()
            com.ss.android.ugc.aweme.commercialize.feed.ah r0 = r0.getAdOpenUtilsService()
            if (r9 != 0) goto L_0x0020
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0020:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r9.getAwemeRawAd()
            if (r4 == 0) goto L_0x002b
            java.lang.String r4 = r4.getOpenUrl()
            goto L_0x002c
        L_0x002b:
            r4 = r1
        L_0x002c:
            boolean r0 = r0.mo53198b(r4)
            if (r0 == 0) goto L_0x00bc
            android.view.View r0 = r8.getHeader()
            if (r0 != 0) goto L_0x004a
            android.content.Context r0 = r8.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r4 = 2132214389(0x7f170275, float:2.0072618E38)
            r5 = r8
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r0 = r0.inflate(r4, r5)
        L_0x004a:
            r4 = 2132017295(0x7f14008f, float:1.9672864E38)
            android.view.View r4 = r0.findViewById(r4)
            java.lang.String r5 = "header.findViewById<Text…>(R.id.ad_open_url_title)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r9.getAwemeRawAd()
            if (r5 == 0) goto L_0x009b
            java.lang.String r1 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r1)
            java.lang.String r1 = r5.getSchemaName()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0074
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r1 = 0
            goto L_0x0075
        L_0x0074:
            r1 = 1
        L_0x0075:
            if (r1 == 0) goto L_0x0083
            android.content.res.Resources r1 = r8.getResources()
            r5 = 2132541686(0x7f1c00f6, float:2.0736456E38)
            java.lang.String r1 = r1.getString(r5)
            goto L_0x0087
        L_0x0083:
            java.lang.String r1 = r5.getSchemaName()
        L_0x0087:
            android.content.res.Resources r5 = r8.getResources()
            r6 = 2132541690(0x7f1c00fa, float:2.0736464E38)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r1
            java.lang.String r1 = r5.getString(r6, r7)
            java.lang.String r2 = "resources.getString(R.st…en_url_title, schemaName)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
        L_0x009b:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4.setText(r1)
            r1 = 2132017293(0x7f14008d, float:1.967286E38)
            android.view.View r1 = r0.findViewById(r1)
            r2 = r8
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            r1 = 2132017291(0x7f14008b, float:1.9672856E38)
            android.view.View r0 = r0.findViewById(r1)
            r0.setOnClickListener(r2)
            r8.f70170g = r3
            r8.f70169f = r9
            return
        L_0x00bc:
            r8.f70170g = r2
            r8.f70169f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout.setAweme(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public OpenURLHintLayout(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet);
        setHeaderId(R.id.cd);
    }

    public OpenURLHintLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet, i);
        setHeaderId(R.id.cd);
    }
}
