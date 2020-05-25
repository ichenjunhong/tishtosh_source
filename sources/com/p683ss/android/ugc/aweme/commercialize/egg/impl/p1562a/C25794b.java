package com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1562a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25749d;
import com.p683ss.android.ugc.aweme.commercialize.log.C26083h;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.a.b */
public final class C25794b implements C25749d {

    /* renamed from: d */
    public static final C25795a f68215d = new C25795a(null);

    /* renamed from: a */
    public String f68216a = "";

    /* renamed from: b */
    public String f68217b = "";

    /* renamed from: c */
    public String f68218c = "";

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.a.b$a */
    public static final class C25795a {
        private C25795a() {
        }

        public /* synthetic */ C25795a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: c */
    public final boolean mo52947c() {
        return false;
    }

    /* renamed from: d */
    public final boolean mo52948d() {
        return false;
    }

    /* renamed from: a */
    public final void mo52942a() {
        Map<String, String> map = C23089d.m56640a().mo47829a("enter_from", this.f68218c).mo47829a("group_id", this.f68216a).mo47829a("author_id", this.f68217b).f61491a;
        C52711k.m112236a((Object) map, "EventMapBuilder.newBuild…               .builder()");
        C26083h.m63240a("show_egg_ad", map);
    }

    /* renamed from: b */
    public final void mo52945b() {
        Map<String, String> map = C23089d.m56640a().mo47829a("fail_type", "load_fail").mo47829a("enter_from", this.f68218c).mo47829a("group_id", this.f68216a).mo47829a("author_id", this.f68217b).f61491a;
        C52711k.m112236a((Object) map, "EventMapBuilder.newBuild…               .builder()");
        C26083h.m63240a("show_egg_ad_fail", map);
    }

    /* renamed from: a */
    public final void mo52943a(View view, int i) {
        C52711k.m112240b(view, "eggView");
        C52711k.m112240b(view, "eggView");
    }

    /* renamed from: a */
    public final void mo52944a(View view, View view2) {
        C52711k.m112240b(view2, "eggLayout");
        C52711k.m112240b(view2, "eggLayout");
    }

    /* renamed from: b */
    public final void mo52946b(View view, View view2) {
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
