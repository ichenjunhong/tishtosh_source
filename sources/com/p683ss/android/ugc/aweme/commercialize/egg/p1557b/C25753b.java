package com.p683ss.android.ugc.aweme.commercialize.egg.p1557b;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
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
import com.p683ss.android.ugc.aweme.commercialize.egg.C25751b;
import com.p683ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25746b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.splash.C45699k.C45702a;
import com.p683ss.android.ugc.aweme.util.C47625i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.b */
public final class C25753b extends C25752a {

    /* renamed from: j */
    public static final C25754a f68107j = new C25754a(null);

    /* renamed from: a */
    public SimpleDraweeView f68108a;

    /* renamed from: b */
    public long f68109b;

    /* renamed from: c */
    public boolean f68110c;

    /* renamed from: k */
    private final Handler f68111k = new Handler();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.b$a */
    public static final class C25754a {
        private C25754a() {
        }

        public /* synthetic */ C25754a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.b$b */
    public static final class C25755b extends C13790c<C14045f> {

        /* renamed from: a */
        final /* synthetic */ C25753b f68112a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.b$b$a */
        public static final class C25756a implements C13882b {

            /* renamed from: a */
            final /* synthetic */ C25755b f68113a;

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

            C25756a(C25755b bVar) {
                this.f68113a = bVar;
            }

            /* renamed from: b */
            public final void mo26042b(C13877a aVar) {
                C52711k.m112240b(aVar, "drawable");
                this.f68113a.f68112a.mo52955d();
            }
        }

        C25755b(C25753b bVar) {
            this.f68112a = bVar;
        }

        public final void onFailure(String str, Throwable th) {
            String str2;
            C25746b bVar = this.f68112a.f68103f;
            if (bVar != null) {
                bVar.mo52930b();
            }
            C25753b bVar2 = this.f68112a;
            if (th != null) {
                str2 = th.getMessage();
            } else {
                str2 = null;
            }
            bVar2.mo52952a(str2);
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            try {
                this.f68112a.f68110c = true;
                C25746b bVar = this.f68112a.f68103f;
                if (bVar != null) {
                    bVar.mo52926a();
                }
                this.f68112a.mo52954c();
                if (animatable != null && (animatable instanceof C13877a)) {
                    C13877a aVar = (C13877a) animatable;
                    aVar.mo26024a((C13857a) new C45702a(aVar.f36202d, this.f68112a.f68104g));
                    aVar.mo26025a((C13882b) new C25756a(this));
                    animatable.start();
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("frescoOpenGifSplashError: e = ");
                sb.append(th);
                C47625i.m103103a(sb.toString());
                C32458a.m75148a(th);
                this.f68112a.mo52952a(th.getMessage());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.b$c */
    static final class C25757c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25746b f68114a;

        /* renamed from: b */
        final /* synthetic */ SimpleDraweeView f68115b;

        /* renamed from: c */
        final /* synthetic */ C25753b f68116c;

        /* renamed from: d */
        final /* synthetic */ String f68117d;

        C25757c(C25746b bVar, SimpleDraweeView simpleDraweeView, C25753b bVar2, String str) {
            this.f68114a = bVar;
            this.f68115b = simpleDraweeView;
            this.f68116c = bVar2;
            this.f68117d = str;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f68116c.f68109b);
            C25746b bVar = this.f68114a;
            C52711k.m112236a((Object) view, "v");
            bVar.mo52927a(view, currentTimeMillis);
            this.f68116c.mo52955d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.b$d */
    static final class C25758d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25746b f68118a;

        /* renamed from: b */
        final /* synthetic */ C25753b f68119b;

        C25758d(C25746b bVar, C25753b bVar2) {
            this.f68118a = bVar;
            this.f68119b = bVar2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C25746b bVar = this.f68118a;
            View view2 = this.f68119b.f68108a;
            C52711k.m112236a((Object) view, "v");
            bVar.mo52928a(view2, view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.b$e */
    static final class C25759e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C25753b f68120a;

        C25759e(C25753b bVar) {
            this.f68120a = bVar;
        }

        public final void run() {
            this.f68120a.mo52955d();
        }
    }

    /* renamed from: b */
    public final void mo52953b() {
        this.f68110c = false;
        this.f68111k.removeCallbacksAndMessages(null);
        mo52955d();
        if (this.f68108a != null) {
            this.f68106i.removeView(this.f68108a);
            this.f68108a = null;
        }
    }

    /* renamed from: d */
    public final void mo52955d() {
        this.f68110c = false;
        this.f68106i.setVisibility(8);
        SimpleDraweeView simpleDraweeView = this.f68108a;
        if (simpleDraweeView != null) {
            simpleDraweeView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo52951a() {
        boolean z;
        if (!this.f68110c) {
            C25751b bVar = this.f68102e;
            if (bVar == null) {
                C25746b bVar2 = this.f68103f;
                if (bVar2 != null) {
                    bVar2.mo52930b();
                    return;
                }
                return;
            }
            String str = bVar.f68094a;
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C25746b bVar3 = this.f68103f;
                if (bVar3 != null) {
                    bVar3.mo52930b();
                }
                mo52952a("materialUrl为空");
                return;
            }
            boolean z2 = bVar.f68097d;
            boolean a = C23515d.m57680a(Uri.parse(str));
            if (!z2 || (z2 && a)) {
                Context context = this.f68101d;
                if (this.f68108a == null) {
                    SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
                    simpleDraweeView.setHierarchy(new C13834b(context.getResources()).mo25930e(C13818b.f36063c).mo25912a());
                    this.f68108a = simpleDraweeView;
                    this.f68106i.addView(this.f68108a);
                }
                SimpleDraweeView simpleDraweeView2 = this.f68108a;
                Animatable animatable = null;
                if (simpleDraweeView2 != null) {
                    C25746b bVar4 = this.f68103f;
                    if (bVar4 != null) {
                        bVar4.mo52931b(simpleDraweeView2, this.f68106i);
                    }
                    simpleDraweeView2.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25723a(str).mo25751a((C13791d<? super INFO>) new C25755b<Object>(this))).mo25762c(true)).mo25763d());
                    C25746b bVar5 = this.f68103f;
                    if (bVar5 != null) {
                        if (bVar5.mo52932c()) {
                            simpleDraweeView2.setOnClickListener(new C25757c(bVar5, simpleDraweeView2, this, str));
                        } else {
                            simpleDraweeView2.setOnClickListener(null);
                            simpleDraweeView2.setClickable(false);
                        }
                    }
                }
                C25746b bVar6 = this.f68103f;
                if (bVar6 != null) {
                    if (bVar6.mo52933d()) {
                        this.f68106i.setOnClickListener(new C25758d(bVar6, this));
                    } else {
                        this.f68106i.setOnClickListener(null);
                        this.f68106i.setClickable(false);
                    }
                }
                this.f68106i.setVisibility(0);
                SimpleDraweeView simpleDraweeView3 = this.f68108a;
                if (simpleDraweeView3 != null) {
                    simpleDraweeView3.setVisibility(0);
                }
                if (this.f68108a != null) {
                    SimpleDraweeView simpleDraweeView4 = this.f68108a;
                    if (simpleDraweeView4 != null) {
                        simpleDraweeView4.bringToFront();
                    }
                    String str2 = bVar.f68095b;
                    int hashCode = str2.hashCode();
                    if (hashCode == 102340 ? !str2.equals("gif") : hashCode != 3645340 || !str2.equals("webp")) {
                        this.f68110c = true;
                        m62350a(3000);
                    } else {
                        SimpleDraweeView simpleDraweeView5 = this.f68108a;
                        if (simpleDraweeView5 != null) {
                            C13842a controller = simpleDraweeView5.getController();
                            if (controller != null) {
                                animatable = controller.mo25749i();
                            }
                        }
                        if (animatable != null && !animatable.isRunning()) {
                            animatable.start();
                        }
                        if (this.f68105h) {
                            m62350a(5000);
                        }
                    }
                    this.f68109b = System.currentTimeMillis();
                    return;
                }
                this.f68110c = false;
                C25746b bVar7 = this.f68103f;
                if (bVar7 != null) {
                    bVar7.mo52930b();
                }
            } else {
                this.f68110c = false;
                C25746b bVar8 = this.f68103f;
                if (bVar8 != null) {
                    bVar8.mo52930b();
                }
                mo52952a("preload失败");
            }
        }
    }

    public C25753b(CommerceEggLayout commerceEggLayout) {
        C52711k.m112240b(commerceEggLayout, "eggLayout");
        super(commerceEggLayout);
    }

    /* renamed from: a */
    private final void m62350a(long j) {
        this.f68111k.removeCallbacksAndMessages(null);
        this.f68111k.postDelayed(new C25759e(this), j);
    }
}
