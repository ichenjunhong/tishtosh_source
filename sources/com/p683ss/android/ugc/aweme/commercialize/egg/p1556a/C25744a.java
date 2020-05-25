package com.p683ss.android.ugc.aweme.commercialize.egg.p1556a;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25876ah;
import com.p683ss.android.ugc.aweme.common.C26890h;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.a.a */
public final class C25744a implements C25746b {

    /* renamed from: h */
    public static final C25745a f68082h = new C25745a(null);

    /* renamed from: a */
    public String f68083a = "";

    /* renamed from: b */
    public String f68084b = "";

    /* renamed from: c */
    public String f68085c = "";

    /* renamed from: d */
    public String f68086d = "";

    /* renamed from: e */
    public String f68087e = "";

    /* renamed from: f */
    public String f68088f = "";

    /* renamed from: g */
    public String f68089g = "";

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.a.a$a */
    public static final class C25745a {
        private C25745a() {
        }

        public /* synthetic */ C25745a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: c */
    public final boolean mo52932c() {
        return true;
    }

    /* renamed from: d */
    public final boolean mo52933d() {
        return true;
    }

    /* renamed from: a */
    public final void mo52926a() {
        C26890h.m65011a("show_egg_ad", C23089d.m56640a().mo47829a("egg_ad_id", this.f68083a).mo47829a("comment_text", this.f68084b).mo47829a("scene_id", "1003").mo47829a("enter_from", this.f68089g).mo47829a("group_id", this.f68087e).mo47829a("author_id", this.f68088f).f61491a);
    }

    /* renamed from: b */
    public final void mo52930b() {
        C26890h.m65011a("show_egg_ad_fail", C23089d.m56640a().mo47829a("egg_ad_id", this.f68083a).mo47829a("comment_text", this.f68084b).mo47829a("scene_id", "1003").mo47829a("enter_from", this.f68089g).mo47829a("group_id", this.f68087e).mo47829a("author_id", this.f68088f).mo47829a("fail_type", "load_fail").f61491a);
    }

    /* renamed from: b */
    public final void mo52931b(View view, View view2) {
        C52711k.m112240b(view, "eggView");
        C52711k.m112240b(view2, "eggLayout");
        double measuredWidth = (double) view2.getMeasuredWidth();
        Double.isNaN(measuredWidth);
        int i = (int) (measuredWidth * 0.64d);
        LayoutParams layoutParams = new LayoutParams(i, i);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo52927a(View view, int i) {
        C52711k.m112240b(view, "eggView");
        if (!TextUtils.isEmpty(this.f68085c) || !TextUtils.isEmpty(this.f68086d)) {
            C25876ah e = C25945k.m62914e();
            C52711k.m112236a((Object) e, "LegacyCommercializeServi…s.getAdOpenUtilsService()");
            if (!e.mo53193a(view.getContext(), this.f68086d, false)) {
                e.mo53192a(view.getContext(), this.f68085c, "");
            }
            C26890h.m65011a("click_egg_ad", C23089d.m56640a().mo47829a("egg_ad_id", this.f68083a).mo47829a("comment_text", this.f68084b).mo47829a("scene_id", "1003").mo47829a("enter_from", this.f68089g).mo47829a("group_id", this.f68087e).mo47829a("author_id", this.f68088f).mo47826a("duration", i).f61491a);
        }
    }

    /* renamed from: a */
    public final void mo52928a(View view, View view2) {
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
}
