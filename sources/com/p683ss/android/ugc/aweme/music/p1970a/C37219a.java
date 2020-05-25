package com.p683ss.android.ugc.aweme.music.p1970a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26990b;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p683ss.android.ugc.aweme.detail.C27365i;
import com.p683ss.android.ugc.aweme.detail.C27383j;
import com.p683ss.android.ugc.aweme.detail.C27387k;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.music.a.a */
public final class C37219a implements C27365i {

    /* renamed from: a */
    public final ViewGroup f95033a;

    /* renamed from: b */
    public final C27383j f95034b;

    /* renamed from: c */
    public final C27387k f95035c;

    /* renamed from: d */
    public final C27387k f95036d;

    /* renamed from: e */
    public final ScrollableLayout f95037e;

    /* renamed from: f */
    public boolean f95038f;

    /* renamed from: g */
    public boolean f95039g;

    /* renamed from: h */
    public boolean f95040h;

    /* renamed from: i */
    public final Context f95041i;

    /* renamed from: j */
    public final ViewGroup f95042j;

    /* renamed from: k */
    private boolean f95043k = true;

    /* renamed from: com.ss.android.ugc.aweme.music.a.a$a */
    static final class C37221a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37219a f95045a;

        C37221a(C37219a aVar) {
            this.f95045a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f95045a.f95035c.mo55863c(new C52670a<C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C37221a f95046a;

                {
                    this.f95046a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    this.f95046a.f95045a.f95034b.mo55759a(C27385a.f72157a);
                    this.f95046a.f95045a.f95038f = false;
                    this.f95046a.f95045a.f95040h = false;
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.a$b */
    static final class C37223b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37219a f95047a;

        C37223b(C37219a aVar) {
            this.f95047a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f95047a.f95036d.mo55759a(new C52670a<C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C37223b f95048a;

                {
                    this.f95048a = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke() {
                    this.f95048a.f95047a.f95038f = true;
                    this.f95048a.f95047a.f95039g = false;
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.a$c */
    public static final class C37225c implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C37219a f95049a;

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        C37225c(C37219a aVar) {
            this.f95049a = aVar;
        }

        public final void onAnimationEnd(Animation animation) {
            if (!this.f95049a.f95038f) {
                this.f95049a.f95034b.mo55759a(C27385a.f72157a);
            }
        }
    }

    /* renamed from: e */
    private boolean m83490e() {
        return this.f95043k;
    }

    /* renamed from: c */
    public final void mo55757c() {
        m83491f();
    }

    /* renamed from: a */
    public final void mo55753a() {
        this.f95034b.mo55760b(C27386b.f72158a);
    }

    /* renamed from: b */
    public final void mo55756b() {
        View findViewById = this.f95033a.findViewById(R.id.cse);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        this.f95034b.mo55759a(C27385a.f72157a);
    }

    /* renamed from: f */
    private void m83491f() {
        if (m83490e()) {
            C26990b helper = this.f95037e.getHelper();
            C52711k.m112236a((Object) helper, "scrollLayout.helper");
            if (helper.mo55139b() && this.f95038f && !this.f95040h) {
                this.f95033a.clearAnimation();
                this.f95040h = true;
                this.f95036d.mo55863c(new C37221a(this));
            }
        }
    }

    /* renamed from: d */
    public final void mo55758d() {
        if (m83490e() && !this.f95038f && !this.f95039g) {
            this.f95033a.clearAnimation();
            this.f95034b.mo55760b(C27386b.f72158a);
            this.f95039g = true;
            this.f95035c.mo55759a(new C37223b(this));
        }
    }

    /* renamed from: a */
    public final void mo55754a(int i) {
        m83491f();
    }

    /* renamed from: a */
    public final void mo55755a(boolean z) {
        this.f95033a.setVisibility(8);
        this.f95043k = false;
    }

    public C37219a(Context context, ViewGroup viewGroup) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(viewGroup, "viewGroup");
        this.f95041i = context;
        this.f95042j = viewGroup;
        View findViewById = this.f95042j.findViewById(R.id.csb);
        C52711k.m112236a((Object) findViewById, "this.viewGroup.findViewById(R.id.start_record)");
        this.f95033a = (ViewGroup) findViewById;
        this.f95034b = new C37226b(this.f95041i, this.f95033a);
        this.f95035c = new C37227c(this.f95041i, this.f95033a);
        this.f95036d = new C37246d(this.f95041i, this.f95033a);
        View findViewById2 = this.f95042j.findViewById(R.id.chv);
        C52711k.m112236a((Object) findViewById2, "this.viewGroup.findViewById(R.id.scroll_layout)");
        this.f95037e = (ScrollableLayout) findViewById2;
        this.f95033a.setOnTouchListener(new OnTouchListener(this) {

            /* renamed from: a */
            final /* synthetic */ C37219a f95044a;

            {
                this.f95044a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C52711k.m112236a((Object) motionEvent, "event");
                switch (motionEvent.getAction()) {
                    case 0:
                        C37219a aVar = this.f95044a;
                        aVar.f95033a.clearAnimation();
                        if (!aVar.f95038f) {
                            aVar.f95034b.mo55760b(C27386b.f72158a);
                        }
                        aVar.f95033a.startAnimation(AnimationUtils.loadAnimation(aVar.f95041i, R.anim.e_));
                        break;
                    case 1:
                        C37219a aVar2 = this.f95044a;
                        aVar2.f95033a.clearAnimation();
                        Animation loadAnimation = AnimationUtils.loadAnimation(aVar2.f95041i, R.anim.ea);
                        loadAnimation.setAnimationListener(new C37225c(aVar2));
                        aVar2.f95033a.startAnimation(loadAnimation);
                        break;
                }
                return false;
            }
        });
    }
}
