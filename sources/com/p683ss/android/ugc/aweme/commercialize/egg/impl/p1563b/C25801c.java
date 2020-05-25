package com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.fresco.animation.p947a.C13857a;
import com.facebook.fresco.animation.p952c.C13877a;
import com.facebook.fresco.animation.p952c.C13882b;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.commercialize.C26103m;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25789i.C25790a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25749d;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25773a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.util.C47625i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.c */
public final class C25801c extends C25797a {

    /* renamed from: k */
    public static final C25802a f68231k = new C25802a(null);

    /* renamed from: h */
    public SimpleDraweeView f68232h;

    /* renamed from: i */
    public long f68233i;

    /* renamed from: j */
    public boolean f68234j;

    /* renamed from: l */
    private final Handler f68235l = new Handler();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.c$a */
    public static final class C25802a {
        private C25802a() {
        }

        public /* synthetic */ C25802a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.c$b */
    public static final class C25803b extends C13790c<C14045f> {

        /* renamed from: a */
        final /* synthetic */ C25801c f68236a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.c$b$a */
        public static final class C25804a implements C13882b {

            /* renamed from: a */
            final /* synthetic */ C25803b f68237a;

            /* renamed from: a */
            public final void mo26040a(C13877a aVar) {
                C52711k.m112240b(aVar, "drawable");
            }

            /* renamed from: a */
            public final void mo26041a(C13877a aVar, int i) {
                C52711k.m112240b(aVar, "drawable");
            }

            /* renamed from: c */
            public final void mo26043c(C13877a aVar) {
                C52711k.m112240b(aVar, "drawable");
            }

            C25804a(C25803b bVar) {
                this.f68237a = bVar;
            }

            /* renamed from: b */
            public final void mo26042b(C13877a aVar) {
                C52711k.m112240b(aVar, "drawable");
                this.f68237a.f68236a.mo53006d();
            }
        }

        C25803b(C25801c cVar) {
            this.f68236a = cVar;
        }

        public final void onFailure(String str, Throwable th) {
            String str2;
            C25749d dVar = this.f68236a.f68223d;
            if (dVar != null) {
                dVar.mo52945b();
            }
            C25801c cVar = this.f68236a;
            if (th != null) {
                str2 = th.getMessage();
            } else {
                str2 = null;
            }
            cVar.mo53003a(str2);
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            try {
                this.f68236a.f68234j = true;
                C25749d dVar = this.f68236a.f68223d;
                if (dVar != null) {
                    dVar.mo52942a();
                }
                this.f68236a.mo53005c();
                if (animatable != null && (animatable instanceof C13877a)) {
                    C13877a aVar = (C13877a) animatable;
                    aVar.mo26024a((C13857a) new C26103m(aVar.f36202d, ((Number) this.f68236a.f68224e.getValue()).intValue()));
                    aVar.mo26025a((C13882b) new C25804a(this));
                    animatable.start();
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("frescoOpenGifSplashError: e = ");
                sb.append(th);
                C47625i.m103103a(sb.toString());
                C32458a.m75148a(th);
                this.f68236a.mo53003a(th.getMessage());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.c$c */
    static final class C25805c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25749d f68238a;

        /* renamed from: b */
        final /* synthetic */ SimpleDraweeView f68239b;

        /* renamed from: c */
        final /* synthetic */ C25801c f68240c;

        /* renamed from: d */
        final /* synthetic */ String f68241d;

        C25805c(C25749d dVar, SimpleDraweeView simpleDraweeView, C25801c cVar, String str) {
            this.f68238a = dVar;
            this.f68239b = simpleDraweeView;
            this.f68240c = cVar;
            this.f68241d = str;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f68240c.f68233i);
            C25749d dVar = this.f68238a;
            C52711k.m112236a((Object) view, "v");
            dVar.mo52943a(view, currentTimeMillis);
            this.f68240c.mo53006d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.c$d */
    static final class C25806d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25749d f68242a;

        /* renamed from: b */
        final /* synthetic */ C25801c f68243b;

        C25806d(C25749d dVar, C25801c cVar) {
            this.f68242a = dVar;
            this.f68243b = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C25749d dVar = this.f68242a;
            View view2 = this.f68243b.f68232h;
            C52711k.m112236a((Object) view, "v");
            dVar.mo52944a(view2, view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.c$e */
    static final class C25807e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C25801c f68244a;

        C25807e(C25801c cVar) {
            this.f68244a = cVar;
        }

        public final void run() {
            this.f68244a.mo53006d();
        }
    }

    /* renamed from: b */
    public final void mo53004b() {
        this.f68234j = false;
        this.f68223d = null;
        this.f68235l.removeCallbacksAndMessages(null);
        mo53006d();
        if (this.f68232h != null) {
            this.f68226g.removeView(this.f68232h);
            this.f68232h = null;
        }
    }

    /* renamed from: d */
    public final void mo53006d() {
        this.f68234j = false;
        this.f68226g.setVisibility(8);
        SimpleDraweeView simpleDraweeView = this.f68232h;
        if (simpleDraweeView != null) {
            simpleDraweeView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo53002a() {
        boolean z;
        if (!this.f68234j) {
            C25773a aVar = this.f68222c;
            if (aVar == null) {
                C25749d dVar = this.f68223d;
                if (dVar != null) {
                    dVar.mo52945b();
                    return;
                }
                return;
            }
            String str = aVar.f68153a;
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C25749d dVar2 = this.f68223d;
                if (dVar2 != null) {
                    dVar2.mo52945b();
                }
                mo53003a("materialUrl为空");
                return;
            }
            boolean z2 = aVar.f68159g;
            boolean a = C23515d.m57680a(Uri.parse(str));
            if (!z2 || (z2 && a)) {
                Context context = this.f68221b;
                if (this.f68232h == null) {
                    SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
                    simpleDraweeView.setHierarchy(new C13834b(context.getResources()).mo25930e(C13818b.f36063c).mo25912a());
                    this.f68232h = simpleDraweeView;
                    this.f68226g.addView(this.f68232h);
                }
                SimpleDraweeView simpleDraweeView2 = this.f68232h;
                Animatable animatable = null;
                if (simpleDraweeView2 != null) {
                    C25749d dVar3 = this.f68223d;
                    if (dVar3 != null) {
                        dVar3.mo52946b(simpleDraweeView2, this.f68226g);
                    }
                    simpleDraweeView2.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25723a(str).mo25751a((C13791d<? super INFO>) new C25803b<Object>(this))).mo25762c(true)).mo25763d());
                    C25749d dVar4 = this.f68223d;
                    if (dVar4 != null) {
                        if (dVar4.mo52947c()) {
                            simpleDraweeView2.setOnClickListener(new C25805c(dVar4, simpleDraweeView2, this, str));
                        } else {
                            simpleDraweeView2.setOnClickListener(null);
                            simpleDraweeView2.setClickable(false);
                        }
                    }
                }
                C25749d dVar5 = this.f68223d;
                if (dVar5 != null) {
                    if (dVar5.mo52948d()) {
                        this.f68226g.setOnClickListener(new C25806d(dVar5, this));
                    } else {
                        this.f68226g.setOnClickListener(null);
                        this.f68226g.setClickable(false);
                    }
                }
                this.f68226g.setVisibility(0);
                SimpleDraweeView simpleDraweeView3 = this.f68232h;
                if (simpleDraweeView3 != null) {
                    simpleDraweeView3.setVisibility(0);
                }
                if (this.f68232h != null) {
                    SimpleDraweeView simpleDraweeView4 = this.f68232h;
                    if (simpleDraweeView4 != null) {
                        simpleDraweeView4.bringToFront();
                    }
                    String str2 = aVar.f68154b;
                    if (C52711k.m112239a((Object) str2, (Object) C25790a.m62415c()) || C52711k.m112239a((Object) str2, (Object) C25790a.m62416d())) {
                        SimpleDraweeView simpleDraweeView5 = this.f68232h;
                        if (simpleDraweeView5 != null) {
                            C13842a controller = simpleDraweeView5.getController();
                            if (controller != null) {
                                animatable = controller.mo25749i();
                            }
                        }
                        if (animatable != null && !animatable.isRunning()) {
                            animatable.start();
                        }
                        if (((Boolean) this.f68225f.getValue()).booleanValue()) {
                            m62440a(5000);
                        }
                    } else {
                        this.f68234j = true;
                        m62440a(3000);
                    }
                    this.f68233i = System.currentTimeMillis();
                    return;
                }
                this.f68234j = false;
                C25749d dVar6 = this.f68223d;
                if (dVar6 != null) {
                    dVar6.mo52945b();
                }
            } else {
                this.f68234j = false;
                C25749d dVar7 = this.f68223d;
                if (dVar7 != null) {
                    dVar7.mo52945b();
                }
                mo53003a("preload失败");
            }
        }
    }

    public C25801c(FrameLayout frameLayout) {
        C52711k.m112240b(frameLayout, "eggLayout");
        super(frameLayout);
    }

    /* renamed from: a */
    private final void m62440a(long j) {
        this.f68235l.removeCallbacksAndMessages(null);
        this.f68235l.postDelayed(new C25807e(this), j);
    }
}
