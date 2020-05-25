package com.p683ss.android.ugc.aweme.commercialize.egg.p1556a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.a.c */
public final class C25747c implements C25746b {

    /* renamed from: d */
    public static final C25748a f68090d = new C25748a(null);

    /* renamed from: a */
    public String f68091a = "";

    /* renamed from: b */
    public String f68092b = "";

    /* renamed from: c */
    public String f68093c = "";

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.a.c$a */
    public static final class C25748a {
        private C25748a() {
        }

        public /* synthetic */ C25748a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo52927a(View view, int i) {
        C52711k.m112240b(view, "eggView");
    }

    /* renamed from: a */
    public final void mo52928a(View view, View view2) {
        C52711k.m112240b(view2, "eggLayout");
    }

    /* renamed from: c */
    public final boolean mo52932c() {
        return false;
    }

    /* renamed from: d */
    public final boolean mo52933d() {
        return false;
    }

    /* renamed from: a */
    public final void mo52926a() {
        C26890h.m65011a("show_egg_ad", C23089d.m56640a().mo47829a("enter_from", this.f68093c).mo47829a("group_id", this.f68091a).mo47829a("author_id", this.f68092b).f61491a);
    }

    /* renamed from: b */
    public final void mo52930b() {
        C26890h.m65011a("show_egg_ad_fail", C23089d.m56640a().mo47829a("fail_type", "load_fail").mo47829a("enter_from", this.f68093c).mo47829a("group_id", this.f68091a).mo47829a("author_id", this.f68092b).f61491a);
    }

    /* renamed from: b */
    public final void mo52931b(View view, View view2) {
        C52711k.m112240b(view, "eggView");
        C52711k.m112240b(view2, "eggLayout");
        Context context = view2.getContext();
        C52711k.m112236a((Object) context, "eggLayout.context");
        Resources resources = context.getResources();
        C52711k.m112236a((Object) resources, "eggLayout.context.resources");
        double d = (double) resources.getDisplayMetrics().widthPixels;
        Double.isNaN(d);
        double d2 = d * 0.64d;
        Context context2 = view2.getContext();
        C52711k.m112236a((Object) context2, "eggLayout.context");
        Resources resources2 = context2.getResources();
        C52711k.m112236a((Object) resources2, "eggLayout.context.resources");
        double d3 = (double) resources2.getDisplayMetrics().heightPixels;
        Double.isNaN(d3);
        LayoutParams layoutParams = new LayoutParams((int) d2, (int) (d3 * 0.64d));
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
    }
}
