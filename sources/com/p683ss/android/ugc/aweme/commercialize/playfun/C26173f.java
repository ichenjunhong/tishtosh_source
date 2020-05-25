package com.p683ss.android.ugc.aweme.commercialize.playfun;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.playfun.p1577a.C26159b;
import com.p683ss.android.ugc.aweme.commercialize.playfun.p1577a.C26160c;
import com.p683ss.android.ugc.aweme.commercialize.playfun.p1577a.C26162d;
import com.p683ss.android.ugc.aweme.commercialize.playfun.p1577a.C26164e;
import com.p683ss.android.ugc.aweme.commercialize.playfun.p1577a.C26165f;
import com.p683ss.android.ugc.aweme.commercialize.playfun.p1577a.C26166g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.f */
public final class C26173f {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f69112a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26173f.class), "introLl", "getIntroLl()Landroid/view/View;"))};

    /* renamed from: b */
    public String f69113b = "IdleState";

    /* renamed from: c */
    public AwemePlayFunModel f69114c;

    /* renamed from: d */
    public View f69115d;

    /* renamed from: e */
    public View f69116e;

    /* renamed from: f */
    public View f69117f;

    /* renamed from: g */
    public DataCenter f69118g;

    /* renamed from: h */
    public boolean f69119h;

    /* renamed from: i */
    public final HashMap<String, C26172e> f69120i;

    /* renamed from: j */
    public final AdPlayFunView f69121j;

    /* renamed from: k */
    public final C26171d f69122k;

    /* renamed from: l */
    private final C52668f f69123l;

    /* renamed from: m */
    private final HashMap<String, String> f69124m;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.f$a */
    static final class C26174a extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ C26173f f69125a;

        C26174a(C26173f fVar) {
            this.f69125a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ViewParent parent = this.f69125a.f69121j.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                return viewGroup.findViewById(R.id.id);
            }
            return null;
        }
    }

    /* renamed from: d */
    private final View m63456d() {
        return (View) this.f69123l.getValue();
    }

    /* renamed from: b */
    public final boolean mo53802b() {
        C26172e eVar = (C26172e) this.f69120i.get(this.f69113b);
        if (eVar != null) {
            return eVar.mo53785e();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo53798a() {
        this.f69116e.setAlpha(0.0f);
        this.f69117f.setAlpha(0.0f);
        this.f69115d.setAlpha(0.0f);
        Collection<C26172e> values = this.f69120i.values();
        C52711k.m112236a((Object) values, "stateTable.values");
        for (C26172e d : values) {
            d.mo53782d();
        }
        this.f69113b = "IdleState";
    }

    /* renamed from: c */
    public final PointF mo53803c() {
        int i;
        float f = ((1.0f - this.f69122k.f69109d) / 2.0f) * ((float) this.f69122k.f69106a);
        float b = C9432q.m18687b(C11010c.m22280a(), 10.0f) - f;
        if (m63456d() != null) {
            View d = m63456d();
            if (d == null) {
                C52711k.m112234a();
            }
            i = C26175g.m63463a(d);
        } else {
            i = C26175g.m63463a(this.f69121j) + this.f69121j.getHeight();
        }
        return new PointF(b, (((float) ((i - C26175g.m63463a(this.f69121j)) - this.f69122k.f69106a)) + f) - C9432q.m18687b(C11010c.m22280a(), 8.0f));
    }

    /* renamed from: a */
    public final void mo53800a(String str) {
        C52711k.m112240b(str, "type");
        AdPlayFunView adPlayFunView = this.f69121j;
        C52711k.m112240b(str, "type");
        Context context = adPlayFunView.getContext();
        Aweme aweme = adPlayFunView.f69060f;
        C26088l.m63322b(context, "othershow", aweme, C26088l.m63377o(context, aweme, str));
    }

    /* renamed from: a */
    public final void mo53799a(int i) {
        switch (i) {
            case 0:
                String str = (String) this.f69124m.get(this.f69113b);
                if (str != null) {
                    C52711k.m112236a((Object) str, "it");
                    this.f69113b = str;
                    C26172e eVar = (C26172e) this.f69120i.get(this.f69113b);
                    if (eVar != null) {
                        eVar.mo53778a();
                    }
                }
                return;
            case 1:
                this.f69113b = "FinishState";
                break;
        }
    }

    public C26173f(AdPlayFunView adPlayFunView, C26171d dVar) {
        C52711k.m112240b(adPlayFunView, "playFunView");
        C52711k.m112240b(dVar, "playFunParam");
        this.f69121j = adPlayFunView;
        this.f69122k = dVar;
        View findViewById = this.f69121j.findViewById(R.id.dx5);
        C52711k.m112236a((Object) findViewById, "playFunView.findViewById…d.ad_play_fun_background)");
        this.f69115d = findViewById;
        View findViewById2 = this.f69121j.findViewById(R.id.dx6);
        C52711k.m112236a((Object) findViewById2, "playFunView.findViewById…id.ad_play_fun_egg_image)");
        this.f69116e = findViewById2;
        View findViewById3 = this.f69121j.findViewById(R.id.dx7);
        C52711k.m112236a((Object) findViewById3, "playFunView.findViewById…id.ad_play_fun_egg_title)");
        this.f69117f = findViewById3;
        this.f69123l = C52732g.m112285a(new C26174a(this));
        this.f69119h = true;
        this.f69124m = C52550ab.m112057c(C52856t.m112465a("IdleState", "ExpandState"), C52856t.m112465a("ExpandState", "EggShowState"), C52856t.m112465a("EggShowState", "CollapseState"), C52856t.m112465a("CollapseState", "WidgetShowState"), C52856t.m112465a("WidgetShowState", "FinishState"));
        this.f69120i = C52550ab.m112057c(C52856t.m112465a("IdleState", new C26165f(this)), C52856t.m112465a("ExpandState", new C26162d(this)), C52856t.m112465a("EggShowState", new C26160c(this)), C52856t.m112465a("CollapseState", new C26159b(this)), C52856t.m112465a("WidgetShowState", new C26166g(this)), C52856t.m112465a("FinishState", new C26164e(this)));
    }

    /* renamed from: a */
    public final void mo53801a(String str, Point point, Point point2) {
        C52711k.m112240b(str, "state");
        AdPlayFunView adPlayFunView = this.f69121j;
        C52711k.m112240b(str, "state");
        C26169c.f69100a.mo53793a(adPlayFunView.f69060f, true, str, point, point2);
    }
}
