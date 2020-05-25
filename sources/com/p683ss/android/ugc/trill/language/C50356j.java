package com.p683ss.android.ugc.trill.language;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.trill.language.j */
public final class C50356j extends C1352v {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f126273a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50356j.class), "mTvLocalName", "getMTvLocalName()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50356j.class), "mTvEnName", "getMTvEnName()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50356j.class), "mImgIcon", "getMImgIcon()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50356j.class), "mImgSelected", "getMImgSelected()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50356j.class), "mBackground", "getMBackground()Landroid/view/View;"))};

    /* renamed from: b */
    private final C52668f f126274b;

    /* renamed from: c */
    private final C52668f f126275c;

    /* renamed from: d */
    private final C52668f f126276d;

    /* renamed from: e */
    private final C52668f f126277e;

    /* renamed from: f */
    private final C52668f f126278f;

    /* renamed from: com.ss.android.ugc.trill.language.j$a */
    static final class C50357a extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ View f126279a;

        C50357a(View view) {
            this.f126279a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (FrameLayout) this.f126279a.findViewById(R.id.b70);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.j$b */
    static final class C50358b extends C52712l implements C52670a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ View f126280a;

        C50358b(View view) {
            this.f126280a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RemoteImageView) this.f126280a.findViewById(R.id.aqa);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.j$c */
    static final class C50359c extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ View f126281a;

        C50359c(View view) {
            this.f126281a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f126281a.findViewById(R.id.at0);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.j$d */
    static final class C50360d extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f126282a;

        C50360d(View view) {
            this.f126282a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f126282a.findViewById(R.id.aab);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.j$e */
    static final class C50361e extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f126283a;

        C50361e(View view) {
            this.f126283a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f126283a.findViewById(R.id.bi4);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.j$f */
    public static final class C50362f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C50356j f126284a;

        C50362f(C50356j jVar) {
            this.f126284a = jVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f126284a.mo98260c().setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.j$g */
    public static final class C50363g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C50356j f126285a;

        C50363g(C50356j jVar) {
            this.f126285a = jVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f126285a.mo98261d().setVisibility(8);
        }
    }

    /* renamed from: a */
    public final DmtTextView mo98258a() {
        return (DmtTextView) this.f126274b.getValue();
    }

    /* renamed from: b */
    public final DmtTextView mo98259b() {
        return (DmtTextView) this.f126275c.getValue();
    }

    /* renamed from: c */
    public final RemoteImageView mo98260c() {
        return (RemoteImageView) this.f126276d.getValue();
    }

    /* renamed from: d */
    public final ImageView mo98261d() {
        return (ImageView) this.f126277e.getValue();
    }

    /* renamed from: e */
    public final View mo98262e() {
        return (View) this.f126278f.getValue();
    }

    public C50356j(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f126274b = C52732g.m112285a(new C50361e(view));
        this.f126275c = C52732g.m112285a(new C50360d(view));
        this.f126276d = C52732g.m112285a(new C50358b(view));
        this.f126277e = C52732g.m112285a(new C50359c(view));
        this.f126278f = C52732g.m112285a(new C50357a(view));
    }
}
