package com.p683ss.android.ugc.aweme.profile.unlogin;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52762e;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.profile.unlogin.m */
public final class C40506m {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f103379a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C40506m.class), "container", "getContainer()Landroid/widget/FrameLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C40506m.class), C22858c.f61208d, "getDetail()Landroid/widget/LinearLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C40506m.class), "title", "getTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C40506m.class), "desc", "getDesc()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C40506m.class), "background", "getBackground()Landroid/widget/LinearLayout;"))};

    /* renamed from: d */
    public static final C40507a f103380d = new C40507a(null);

    /* renamed from: b */
    public final View f103381b;

    /* renamed from: c */
    public final C52762e<C52860x> f103382c;

    /* renamed from: e */
    private final C52668f f103383e = C52732g.m112285a(new C40509c(this));

    /* renamed from: f */
    private final C52668f f103384f = C52732g.m112285a(new C40511e(this));

    /* renamed from: g */
    private final C52668f f103385g = C52732g.m112285a(new C40513g(this));

    /* renamed from: h */
    private final C52668f f103386h = C52732g.m112285a(new C40510d(this));

    /* renamed from: i */
    private final C52668f f103387i = C52732g.m112285a(new C40508b(this));

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.m$a */
    public static final class C40507a {
        private C40507a() {
        }

        public /* synthetic */ C40507a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.m$b */
    static final class C40508b extends C52712l implements C52670a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C40506m f103388a;

        C40508b(C40506m mVar) {
            this.f103388a = mVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LinearLayout) this.f103388a.f103381b.findViewById(R.id.iz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.m$c */
    static final class C40509c extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ C40506m f103389a;

        C40509c(C40506m mVar) {
            this.f103389a = mVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (FrameLayout) this.f103389a.f103381b.findViewById(R.id.ex3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.m$d */
    static final class C40510d extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C40506m f103390a;

        C40510d(C40506m mVar) {
            this.f103390a = mVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f103390a.f103381b.findViewById(R.id.d98);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.m$e */
    static final class C40511e extends C52712l implements C52670a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C40506m f103391a;

        C40511e(C40506m mVar) {
            this.f103391a = mVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LinearLayout) this.f103391a.f103381b.findViewById(R.id.e50);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.m$f */
    public static final class C40512f extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C40506m f103392a;

        C40512f(C40506m mVar) {
            this.f103392a = mVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
            ((C52671b) this.f103392a.f103382c).invoke("down_log_in_to_continue");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.m$g */
    static final class C40513g extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C40506m f103393a;

        C40513g(C40506m mVar) {
            this.f103393a = mVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f103393a.f103381b.findViewById(R.id.dhb);
        }
    }

    /* renamed from: a */
    public final FrameLayout mo82791a() {
        return (FrameLayout) this.f103383e.getValue();
    }

    /* renamed from: b */
    public final DmtTextView mo82793b() {
        return (DmtTextView) this.f103385g.getValue();
    }

    /* renamed from: c */
    public final DmtTextView mo82794c() {
        return (DmtTextView) this.f103386h.getValue();
    }

    /* renamed from: d */
    public final LinearLayout mo82795d() {
        return (LinearLayout) this.f103387i.getValue();
    }

    /* renamed from: a */
    public final C52860x mo82792a(int i) {
        FrameLayout a = mo82791a();
        if (a != null) {
            LayoutParams layoutParams = a.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams instanceof MarginLayoutParams) {
                    ((MarginLayoutParams) layoutParams).topMargin = i;
                }
                return C52860x.f131107a;
            }
        }
        return null;
    }

    public C40506m(View view, C52762e<C52860x> eVar) {
        C52711k.m112240b(view, "parent");
        C52711k.m112240b(eVar, "whenClickLoginSpan");
        this.f103381b = view;
        this.f103382c = eVar;
    }
}
