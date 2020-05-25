package com.p683ss.android.ugc.aweme.opensdk.share.p2041a;

import android.app.Activity;
import android.app.Dialog;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.a.a */
public final class C38516a extends Dialog {

    /* renamed from: a */
    public C38519a f97994a;

    /* renamed from: b */
    private String f97995b;

    /* renamed from: c */
    private String f97996c;

    /* renamed from: d */
    private ImageView f97997d;

    /* renamed from: e */
    private DmtTextView f97998e;

    /* renamed from: f */
    private DmtTextView f97999f;

    /* renamed from: g */
    private RelativeLayout f98000g;

    /* renamed from: h */
    private RelativeLayout f98001h;

    /* renamed from: com.ss.android.ugc.aweme.opensdk.share.a.a$a */
    public interface C38519a {
        /* renamed from: a */
        void mo49717a();

        /* renamed from: b */
        void mo49718b();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r6 = 2132214209(0x7f1701c1, float:2.0072253E38)
            r5.setContentView(r6)
            java.lang.String r6 = r5.f97995b
            int r0 = r6.hashCode()
            r1 = -2076320574(0xffffffff843ddcc2, float:-2.231821E-36)
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0035
            r1 = -1846572353(0xffffffff91ef8abf, float:-3.779306E-28)
            if (r0 == r1) goto L_0x002b
            r1 = -1397149946(0xffffffffacb92f06, float:-5.263237E-12)
            if (r0 == r1) goto L_0x0021
            goto L_0x003f
        L_0x0021:
            java.lang.String r0 = "share saved"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "share fail"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = 2
            goto L_0x0040
        L_0x0035:
            java.lang.String r0 = "share success"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = 0
            goto L_0x0040
        L_0x003f:
            r6 = -1
        L_0x0040:
            r0 = 2131952587(0x7f1303cb, float:1.954162E38)
            r1 = 2132022782(0x7f1415fe, float:1.9683993E38)
            r4 = 2132022780(0x7f1415fc, float:1.968399E38)
            switch(r6) {
                case 0: goto L_0x008b;
                case 1: goto L_0x006d;
                default: goto L_0x004c;
            }
        L_0x004c:
            android.view.View r6 = r5.findViewById(r4)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5.f97997d = r6
            android.view.View r6 = r5.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            r5.f97998e = r6
            android.widget.ImageView r6 = r5.f97997d
            r0 = 2131952586(0x7f1303ca, float:1.9541619E38)
            r6.setImageResource(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r5.f97998e
            r0 = 2132549747(0x7f1c2073, float:2.0752805E38)
            r6.setText(r0)
            goto L_0x00a8
        L_0x006d:
            android.view.View r6 = r5.findViewById(r4)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5.f97997d = r6
            android.view.View r6 = r5.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            r5.f97998e = r6
            android.widget.ImageView r6 = r5.f97997d
            r6.setImageResource(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r5.f97998e
            r0 = 2132549748(0x7f1c2074, float:2.0752807E38)
            r6.setText(r0)
            goto L_0x00a8
        L_0x008b:
            android.view.View r6 = r5.findViewById(r4)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5.f97997d = r6
            android.view.View r6 = r5.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            r5.f97998e = r6
            android.widget.ImageView r6 = r5.f97997d
            r6.setImageResource(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r5.f97998e
            r0 = 2132549749(0x7f1c2075, float:2.075281E38)
            r6.setText(r0)
        L_0x00a8:
            r6 = 2132022778(0x7f1415fa, float:1.9683985E38)
            android.view.View r6 = r5.findViewById(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            r5.f97999f = r6
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r5.f97999f
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2132549746(0x7f1c2072, float:2.0752803E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = r5.f97996c
            r2[r3] = r4
            java.lang.String r0 = r0.getString(r1, r2)
            r6.setText(r0)
            r6 = 2132022777(0x7f1415f9, float:1.9683983E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r5.f98000g = r6
            r6 = 2132022781(0x7f1415fd, float:1.9683991E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r5.f98001h = r6
            android.widget.RelativeLayout r6 = r5.f98000g
            com.ss.android.ugc.aweme.opensdk.share.a.a$1 r0 = new com.ss.android.ugc.aweme.opensdk.share.a.a$1
            r0.<init>()
            r6.setOnClickListener(r0)
            android.widget.RelativeLayout r6 = r5.f98001h
            com.ss.android.ugc.aweme.opensdk.share.a.a$2 r0 = new com.ss.android.ugc.aweme.opensdk.share.a.a$2
            r0.<init>()
            r6.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.opensdk.share.p2041a.C38516a.onCreate(android.os.Bundle):void");
    }

    public C38516a(Activity activity, String str, String str2, C38519a aVar) {
        super(activity, R.style.a4x);
        this.f97996c = str;
        this.f97995b = str2;
        this.f97994a = aVar;
    }
}
