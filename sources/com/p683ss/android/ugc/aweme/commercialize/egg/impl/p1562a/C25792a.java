package com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1562a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1564c.C25815a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25749d;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1558c.C25769c;
import com.p683ss.android.ugc.aweme.commercialize.log.C26083h;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.a.a */
public final class C25792a implements C25749d {

    /* renamed from: h */
    public static final C25793a f68207h = new C25793a(null);

    /* renamed from: a */
    public String f68208a = "";

    /* renamed from: b */
    public String f68209b = "";

    /* renamed from: c */
    public String f68210c = "";

    /* renamed from: d */
    public String f68211d = "";

    /* renamed from: e */
    public String f68212e = "";

    /* renamed from: f */
    public String f68213f = "";

    /* renamed from: g */
    public String f68214g = "";

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.a.a$a */
    public static final class C25793a {
        private C25793a() {
        }

        public /* synthetic */ C25793a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: c */
    public final boolean mo52947c() {
        return true;
    }

    /* renamed from: d */
    public final boolean mo52948d() {
        return true;
    }

    /* renamed from: a */
    public final void mo52942a() {
        Map<String, String> map = C23089d.m56640a().mo47829a("egg_ad_id", this.f68208a).mo47829a("comment_text", this.f68209b).mo47829a("scene_id", "1003").mo47829a("enter_from", this.f68214g).mo47829a("group_id", this.f68212e).mo47829a("author_id", this.f68213f).f61491a;
        C52711k.m112236a((Object) map, "EventMapBuilder.newBuild…               .builder()");
        C26083h.m63240a("show_egg_ad", map);
    }

    /* renamed from: b */
    public final void mo52945b() {
        Map<String, String> map = C23089d.m56640a().mo47829a("egg_ad_id", this.f68208a).mo47829a("comment_text", this.f68209b).mo47829a("scene_id", "1003").mo47829a("enter_from", this.f68214g).mo47829a("group_id", this.f68212e).mo47829a("author_id", this.f68213f).mo47829a("fail_type", "load_fail").f61491a;
        C52711k.m112236a((Object) map, "EventMapBuilder.newBuild…               .builder()");
        C26083h.m63240a("show_egg_ad_fail", map);
    }

    /* renamed from: a */
    public final void mo52944a(View view, View view2) {
        Animatable animatable;
        C52711k.m112240b(view2, "eggLayout");
        view2.setVisibility(8);
        if (view != null) {
            view.setVisibility(8);
            if (view instanceof SimpleDraweeView) {
                C13842a controller = ((SimpleDraweeView) view).getController();
                if (controller != null) {
                    animatable = controller.mo25749i();
                } else {
                    animatable = null;
                }
                if (animatable != null && animatable.isRunning()) {
                    animatable.stop();
                }
            }
        }
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
        int i = (int) (d * 0.64d);
        LayoutParams layoutParams = new LayoutParams(i, i);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo52943a(View view, int i) {
        C52711k.m112240b(view, "eggView");
        if (!TextUtils.isEmpty(this.f68210c) || !TextUtils.isEmpty(this.f68211d)) {
            C25769c a = C25815a.m62455a();
            Context context = view.getContext();
            C52711k.m112236a((Object) context, "eggView.context");
            if (!a.mo52809a(context, this.f68211d, false)) {
                Context context2 = view.getContext();
                C52711k.m112236a((Object) context2, "eggView.context");
                a.mo52808a(context2, this.f68210c, "");
            }
            Map<String, String> map = C23089d.m56640a().mo47829a("egg_ad_id", this.f68208a).mo47829a("comment_text", this.f68209b).mo47829a("scene_id", "1003").mo47829a("enter_from", this.f68214g).mo47829a("group_id", this.f68212e).mo47829a("author_id", this.f68213f).mo47826a("duration", i).f61491a;
            C52711k.m112236a((Object) map, "EventMapBuilder.newBuild…               .builder()");
            C26083h.m63240a("click_egg_ad", map);
        }
    }
}
