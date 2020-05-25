package com.p683ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.C10721b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.C39102ah;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.VerticalSPULayout */
public final class VerticalSPULayout extends LinearLayout {

    /* renamed from: a */
    public List<C39102ah> f100977a;

    /* renamed from: b */
    public boolean f100978b;

    /* renamed from: c */
    private C39067g f100979c;

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.VerticalSPULayout$a */
    static final class C39477a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39102ah f100980a;

        /* renamed from: b */
        final /* synthetic */ VerticalSPULayout f100981b;

        C39477a(C39102ah ahVar, VerticalSPULayout verticalSPULayout) {
            this.f100980a = ahVar;
            this.f100981b = verticalSPULayout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
            if (r0 == null) goto L_0x0025;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r4) {
            /*
                r3 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r4)
                com.ss.android.ugc.aweme.poi.widget.VerticalSPULayout r4 = r3.f100981b
                java.lang.String r0 = "project_click_card"
                com.ss.android.ugc.aweme.poi.model.ah r1 = r3.f100980a
                java.lang.String r1 = r1.extId
                java.lang.String r2 = "product.extId"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                r4.mo80477a(r0, r1)
                com.ss.android.ugc.aweme.poi.widget.VerticalSPULayout r4 = r3.f100981b
                android.content.Context r4 = r4.getContext()
                com.ss.android.ugc.aweme.poi.model.ah r0 = r3.f100980a
                com.ss.android.ugc.aweme.poi.model.ar r0 = r0.detailInfo
                if (r0 == 0) goto L_0x0025
                java.lang.String r0 = r0.getUrl()
                if (r0 != 0) goto L_0x0027
            L_0x0025:
                java.lang.String r0 = ""
            L_0x0027:
                com.bytedance.router.SmartRoute r4 = com.bytedance.router.SmartRouter.buildRoute(r4, r0)
                r4.open()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.widget.VerticalSPULayout.C39477a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.VerticalSPULayout$b */
    static final class C39478b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39102ah f100982a;

        /* renamed from: b */
        final /* synthetic */ VerticalSPULayout f100983b;

        C39478b(C39102ah ahVar, VerticalSPULayout verticalSPULayout) {
            this.f100982a = ahVar;
            this.f100983b = verticalSPULayout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
            if (r0 == null) goto L_0x0025;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r4) {
            /*
                r3 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r4)
                com.ss.android.ugc.aweme.poi.widget.VerticalSPULayout r4 = r3.f100983b
                java.lang.String r0 = "project_click_card"
                com.ss.android.ugc.aweme.poi.model.ah r1 = r3.f100982a
                java.lang.String r1 = r1.extId
                java.lang.String r2 = "product.extId"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                r4.mo80477a(r0, r1)
                com.ss.android.ugc.aweme.poi.widget.VerticalSPULayout r4 = r3.f100983b
                android.content.Context r4 = r4.getContext()
                com.ss.android.ugc.aweme.poi.model.ah r0 = r3.f100982a
                com.ss.android.ugc.aweme.poi.model.ar r0 = r0.detailInfo
                if (r0 == 0) goto L_0x0025
                java.lang.String r0 = r0.getUrl()
                if (r0 != 0) goto L_0x0027
            L_0x0025:
                java.lang.String r0 = ""
            L_0x0027:
                com.bytedance.router.SmartRoute r4 = com.bytedance.router.SmartRouter.buildRoute(r4, r0)
                r4.open()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.widget.VerticalSPULayout.C39478b.onClick(android.view.View):void");
        }
    }

    public VerticalSPULayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public VerticalSPULayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C39067g getPoiSimpleBundle() {
        return this.f100979c;
    }

    public final void setPoiSimpleBundle(C39067g gVar) {
        this.f100979c = gVar;
    }

    /* renamed from: a */
    public final void mo80478a(List<C39102ah> list) {
        for (C39102ah ahVar : list) {
            LayoutParams layoutParams = new LayoutParams(-1, (int) C9432q.m18687b(getContext(), 96.0f));
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.bng, null);
            C52711k.m112236a((Object) inflate, "child");
            C23515d.m57669a((RemoteImageView) inflate.findViewById(R.id.efh), ahVar.imageUrl);
            DmtTextView dmtTextView = (DmtTextView) inflate.findViewById(R.id.ept);
            C52711k.m112236a((Object) dmtTextView, "child.poi_spu_name");
            dmtTextView.setText(ahVar.name);
            DmtTextView dmtTextView2 = (DmtTextView) inflate.findViewById(R.id.epx);
            C52711k.m112236a((Object) dmtTextView2, "child.poi_spu_sales");
            dmtTextView2.setText(ahVar.sales);
            SpannableString spannableString = new SpannableString(ahVar.onSale);
            spannableString.setSpan(new AbsoluteSizeSpan((int) C9432q.m18687b(getContext(), 13.0f)), 0, 1, 17);
            DmtTextView dmtTextView3 = (DmtTextView) inflate.findViewById(R.id.epw);
            C52711k.m112236a((Object) dmtTextView3, "child.poi_spu_price");
            dmtTextView3.setText(spannableString);
            DmtTextView dmtTextView4 = (DmtTextView) inflate.findViewById(R.id.enx);
            C52711k.m112236a((Object) dmtTextView4, "child.panic_buying");
            dmtTextView4.setText(ahVar.buttonInfo.getTitle());
            ((DmtTextView) inflate.findViewById(R.id.enx)).setOnTouchListener(new C10721b(0.5f, 1.0f));
            ((DmtTextView) inflate.findViewById(R.id.enx)).setOnClickListener(new C39477a(ahVar, this));
            DmtTextView dmtTextView5 = (DmtTextView) inflate.findViewById(R.id.epu);
            C52711k.m112236a((Object) dmtTextView5, "child.poi_spu_original_price");
            dmtTextView5.setText(ahVar.price);
            DmtTextView dmtTextView6 = (DmtTextView) inflate.findViewById(R.id.epu);
            C52711k.m112236a((Object) dmtTextView6, "child.poi_spu_original_price");
            dmtTextView6.setPaintFlags(16);
            inflate.setOnClickListener(new C39478b(ahVar, this));
            String str = ahVar.extId;
            C52711k.m112236a((Object) str, "product.extId");
            mo80477a("project_card_show", str);
            addView(inflate, layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo80479a(List<C39102ah> list, C39067g gVar) {
        C52711k.m112240b(list, "products");
        this.f100977a = list;
        this.f100979c = gVar;
        if (list.size() > 3) {
            list = C52575l.m112139e((Collection<? extends T>) C52575l.m112129b((Iterable<? extends T>) list, 3));
        }
        mo80478a(list);
    }

    /* renamed from: a */
    public final void mo80477a(String str, String str2) {
        String str3;
        C39067g gVar = this.f100979c;
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("product_id", str2);
        String str4 = "poi_id";
        C39067g gVar2 = this.f100979c;
        if (gVar2 != null) {
            str3 = gVar2.getPoiId();
        } else {
            str3 = null;
        }
        C39452l.m87730a(gVar, str, a.mo47829a(str4, str3).mo47829a("content_type", "product"));
    }

    public VerticalSPULayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f100978b = true;
    }

    public /* synthetic */ VerticalSPULayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
