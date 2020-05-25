package com.p683ss.android.ugc.aweme.proaccount;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.proaccount.g */
public final class C39709g extends C23526a {

    /* renamed from: a */
    public static final int[] f101339a = {R.string.fez, R.string.ff1};

    /* renamed from: b */
    public static final int[] f101340b = {R.string.fey, R.string.ff0};

    /* renamed from: c */
    public static final int[] f101341c = {R.drawable.b1u, R.drawable.b1v};

    /* renamed from: d */
    public static final C39710a f101342d = new C39710a(null);

    /* renamed from: e */
    private RemoteImageView f101343e;

    /* renamed from: j */
    private DmtTextView f101344j;

    /* renamed from: k */
    private DmtTextView f101345k;

    /* renamed from: l */
    private ConstraintLayout f101346l;

    /* renamed from: m */
    private int f101347m;

    /* renamed from: n */
    private HashMap f101348n;

    /* renamed from: com.ss.android.ugc.aweme.proaccount.g$a */
    public static final class C39710a {
        private C39710a() {
        }

        public /* synthetic */ C39710a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C39709g m88413a(int i, boolean z) {
            C39709g gVar = new C39709g();
            Bundle bundle = new Bundle();
            bundle.putInt(IWalletMainProxy.KEY_PAGE_INDEX, i);
            bundle.putBoolean("page_default", true);
            gVar.setArguments(bundle);
            return gVar;
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f101348n != null) {
            this.f101348n.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
        /*
            r3 = this;
            java.lang.String r6 = "inflater"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r6)
            r6 = 0
            r0 = 2132214645(0x7f170375, float:2.0073138E38)
            android.view.View r4 = r4.inflate(r0, r5, r6)
            r5 = 2132024721(0x7f141d91, float:1.9687926E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r0 = "view.findViewById(R.id.welcome_im)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r5
            r3.f101343e = r5
            r5 = 2132024726(0x7f141d96, float:1.9687936E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r0 = "view.findViewById(R.id.welcome_tv_title)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r5
            r3.f101344j = r5
            r5 = 2132024725(0x7f141d95, float:1.9687934E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r0 = "view.findViewById(R.id.welcome_tv_desc)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r5
            r3.f101345k = r5
            r5 = 2132024720(0x7f141d90, float:1.9687924E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r0 = "view.findViewById(R.id.welcome_bg)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            android.support.constraint.ConstraintLayout r5 = (android.support.constraint.ConstraintLayout) r5
            r3.f101346l = r5
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r3.f101344j
            if (r5 != 0) goto L_0x0056
            java.lang.String r0 = "mTitle"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0056:
            java.lang.String r0 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28903b
            r5.setFontType(r0)
            android.content.Context r5 = r3.getContext()
            int r5 = com.p683ss.android.ttve.utils.C20141b.m49699b(r5)
            android.content.Context r0 = r3.getContext()
            int r0 = com.p683ss.android.ttve.utils.C20141b.m49701c(r0)
            int r5 = r5 - r0
            android.content.Context r0 = r3.getContext()
            r1 = 1142931456(0x441fc000, float:639.0)
            float r0 = com.p683ss.android.ttve.utils.C20141b.m49696a(r0, r1)
            int r0 = (int) r0
            int r5 = r5 - r0
            r0 = 2
            if (r5 <= 0) goto L_0x00a4
            android.content.Context r5 = r3.getContext()
            int r5 = com.p683ss.android.ttve.utils.C20141b.m49699b(r5)
            android.content.Context r2 = r3.getContext()
            int r2 = com.p683ss.android.ttve.utils.C20141b.m49701c(r2)
            int r5 = r5 - r2
            android.content.Context r2 = r3.getContext()
            float r1 = com.p683ss.android.ttve.utils.C20141b.m49696a(r2, r1)
            int r1 = (int) r1
            int r5 = r5 - r1
            int r5 = r5 / r0
            android.support.constraint.ConstraintLayout r1 = r3.f101346l
            if (r1 != 0) goto L_0x00a1
            java.lang.String r2 = "mContainer"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00a1:
            r1.setPadding(r6, r5, r6, r5)
        L_0x00a4:
            android.os.Bundle r5 = r3.getArguments()
            if (r5 == 0) goto L_0x018e
            android.os.Bundle r5 = r3.getArguments()
            if (r5 != 0) goto L_0x00b3
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00b3:
            java.lang.String r6 = "page_default"
            boolean r5 = r5.getBoolean(r6)
            android.os.Bundle r6 = r3.getArguments()
            if (r6 != 0) goto L_0x00c2
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00c2:
            java.lang.String r1 = "page_index"
            int r6 = r6.getInt(r1)
            r3.f101347m = r6
            if (r5 == 0) goto L_0x012e
            int r5 = r3.f101347m
            if (r5 >= r0) goto L_0x012e
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = r3.f101343e
            if (r5 != 0) goto L_0x00d9
            java.lang.String r6 = "mImageView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x00d9:
            int[] r6 = f101341c
            int r0 = r3.f101347m
            r6 = r6[r0]
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r5, r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r3.f101344j
            if (r5 != 0) goto L_0x00eb
            java.lang.String r6 = "mTitle"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x00eb:
            android.content.Context r6 = r3.getContext()
            r0 = 0
            if (r6 == 0) goto L_0x0103
            android.content.res.Resources r6 = r6.getResources()
            if (r6 == 0) goto L_0x0103
            int[] r1 = f101339a
            int r2 = r3.f101347m
            r1 = r1[r2]
            java.lang.String r6 = r6.getString(r1)
            goto L_0x0104
        L_0x0103:
            r6 = r0
        L_0x0104:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.setText(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r3.f101345k
            if (r5 != 0) goto L_0x0112
            java.lang.String r6 = "mDesc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0112:
            android.content.Context r6 = r3.getContext()
            if (r6 == 0) goto L_0x0128
            android.content.res.Resources r6 = r6.getResources()
            if (r6 == 0) goto L_0x0128
            int[] r0 = f101340b
            int r1 = r3.f101347m
            r0 = r0[r1]
            java.lang.String r0 = r6.getString(r0)
        L_0x0128:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.setText(r0)
            goto L_0x018e
        L_0x012e:
            android.os.Bundle r5 = r3.getArguments()
            if (r5 != 0) goto L_0x0137
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0137:
            java.lang.String r6 = "image_url"
            java.lang.String r0 = ""
            java.lang.String r5 = r5.getString(r6, r0)
            java.lang.String r6 = "arguments!!.getString(IMAGE_URL, \"\")"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r3.f101343e
            if (r6 != 0) goto L_0x014d
            java.lang.String r0 = "mImageView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x014d:
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r6, r5)
            android.os.Bundle r5 = r3.getArguments()
            if (r5 != 0) goto L_0x0159
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0159:
            java.lang.String r6 = "title_text"
            java.lang.String r0 = ""
            java.lang.String r5 = r5.getString(r6, r0)
            android.os.Bundle r6 = r3.getArguments()
            if (r6 != 0) goto L_0x016a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x016a:
            java.lang.String r0 = "desc_text"
            java.lang.String r1 = ""
            java.lang.String r6 = r6.getString(r0, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r3.f101344j
            if (r0 != 0) goto L_0x017b
            java.lang.String r1 = "mTitle"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x017b:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.setText(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r3.f101345k
            if (r5 != 0) goto L_0x0189
            java.lang.String r0 = "mDesc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0189:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.setText(r6)
        L_0x018e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.proaccount.C39709g.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
