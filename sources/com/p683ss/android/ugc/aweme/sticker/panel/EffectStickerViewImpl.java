package com.p683ss.android.ugc.aweme.sticker.panel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.p780m.C12356a;
import com.p683ss.android.ugc.aweme.p1484bx.C24453c;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.C43844fm;
import com.p683ss.android.ugc.aweme.shortvideo.net.C44331a;
import com.p683ss.android.ugc.aweme.shortvideo.net.NetStateReceiver;
import com.p683ss.android.ugc.aweme.sticker.C45805a;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45819c;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45816b;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45858a;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.p2300j.C46041b;
import com.p683ss.android.ugc.aweme.sticker.p2300j.C46048d;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46057f;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.C46191k.C46193b;
import com.p683ss.android.ugc.aweme.sticker.panel.p2304c.C46104a;
import com.p683ss.android.ugc.aweme.sticker.panel.search.C46258a;
import com.p683ss.android.ugc.aweme.sticker.panel.search.C46275c;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46318d;
import com.p683ss.android.ugc.aweme.sticker.tabguide.IStickerTabGuidePresenter;
import com.p683ss.android.ugc.aweme.sticker.types.multi.MultiStickerPresenter;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p683ss.android.ugc.tools.utils.KeyboardUtils;
import com.p683ss.android.ugc.tools.view.widget.C50283g;
import com.p683ss.android.ugc.tools.view.widget.CheckableImageView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.EffectStickerViewImpl */
public abstract class EffectStickerViewImpl implements C0183j, C12356a, C46191k {

    /* renamed from: A */
    private C46041b f116251A;

    /* renamed from: B */
    private List<C46190j> f116252B;

    /* renamed from: C */
    private CheckableImageView f116253C;

    /* renamed from: D */
    private View f116254D;

    /* renamed from: a */
    protected long f116255a;

    /* renamed from: b */
    public boolean f116256b;

    /* renamed from: c */
    public AppCompatActivity f116257c;

    /* renamed from: d */
    protected MultiStickerPresenter f116258d;

    /* renamed from: e */
    public Effect f116259e;

    /* renamed from: f */
    C46258a f116260f;

    /* renamed from: g */
    public View f116261g;

    /* renamed from: h */
    public View f116262h;

    /* renamed from: i */
    View f116263i;

    /* renamed from: j */
    protected long f116264j;

    /* renamed from: k */
    public boolean f116265k;

    /* renamed from: l */
    protected boolean f116266l;

    /* renamed from: m */
    protected C46255p f116267m;

    /* renamed from: n */
    public C46354l f116268n;

    /* renamed from: o */
    protected C45814b f116269o;

    /* renamed from: p */
    public C45889c f116270p;

    /* renamed from: q */
    protected boolean f116271q;

    /* renamed from: r */
    boolean f116272r = true;

    /* renamed from: s */
    public AVDmtTabLayout f116273s;

    /* renamed from: t */
    public List<C46193b> f116274t = new ArrayList();

    /* renamed from: u */
    protected List<C46190j> f116275u = new ArrayList();

    /* renamed from: v */
    protected C46256q f116276v;

    /* renamed from: w */
    protected IStickerTabGuidePresenter<C0794k<EffectCategoryModel, Object>> f116277w;

    /* renamed from: x */
    public C46193b f116278x = new C46193b() {
        /* renamed from: a */
        public final void mo91208a(C46315a aVar) {
            EffectStickerViewImpl.this.mo92755b(!C46059g.m100082f(aVar.f116852a));
            for (C46193b a : EffectStickerViewImpl.this.f116274t) {
                a.mo91208a(aVar);
            }
        }

        /* renamed from: a */
        public final void mo91209a(C46318d dVar) {
            EffectStickerViewImpl.this.mo92755b(true);
            for (C46193b a : EffectStickerViewImpl.this.f116274t) {
                a.mo91209a(dVar);
            }
        }

        /* renamed from: a */
        public final void mo92763a(FaceStickerBean faceStickerBean, String str) {
            for (C46193b a : EffectStickerViewImpl.this.f116274t) {
                a.mo92763a(faceStickerBean, str);
            }
        }

        /* renamed from: b */
        public final void mo92764b(FaceStickerBean faceStickerBean, String str) {
            for (C46193b b : EffectStickerViewImpl.this.f116274t) {
                b.mo92764b(faceStickerBean, str);
            }
        }
    };

    /* renamed from: y */
    private View f116279y;

    /* renamed from: z */
    private C44331a f116280z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo92746a(C0184k kVar, C0654k kVar2, String str, View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo92747a(C0184k kVar, String str);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo92757c();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo92759e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo92760f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo92761g() {
    }

    /* renamed from: b */
    public final boolean mo92756b() {
        if (this.f116279y == null || this.f116279y.getParent() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo92745a() {
        C46788b.m101633a((String) null);
        if (this.f116251A != null) {
            this.f116251A.mo50223b(new C24453c());
        }
        if (this.f116260f != null) {
            C46258a aVar = this.f116260f;
            EditText editText = aVar.f116716d;
            if (editText == null) {
                C52711k.m112237a("searchEditText");
            }
            KeyboardUtils.m108325b(editText, aVar.f116721i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo92758d() {
        C39629l.m88232a().mo58567E().mo49431a("sticker_user_wait_time", C42437ay.m93202a().mo86520a("duration", Long.valueOf(System.currentTimeMillis() - this.f116264j)).mo86522b());
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.f116279y = null;
        this.f116274t.clear();
        if (this.f116253C != null) {
            this.f116253C.setOnStateChangeListener(null);
            this.f116253C.clearAnimation();
        }
        if (this.f116280z != null) {
            NetStateReceiver.m97104b(this.f116280z);
            this.f116280z = null;
        }
        NetStateReceiver.m97103b((Context) this.f116257c);
        this.f116257c = null;
        mo92761g();
    }

    /* renamed from: a */
    public final void mo92750a(C46190j jVar) {
        if (!this.f116275u.contains(jVar)) {
            this.f116275u.add(jVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92749a(View view) {
        this.f116270p.mo92484a("none");
        this.f116268n.mo92989g().mo93015b(null);
        this.f116269o.mo92249a((C45816b<T>) C45858a.m99693a());
    }

    /* renamed from: b */
    public final void mo92755b(boolean z) {
        float f;
        this.f116272r = z;
        float f2 = 0.5f;
        if (this.f116263i != null) {
            View view = this.f116263i;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            view.setAlpha(f);
        }
        if (this.f116254D != null) {
            View view2 = this.f116254D;
            if (z) {
                f2 = 1.0f;
            }
            view2.setAlpha(f2);
        }
    }

    /* renamed from: a */
    public final void mo92751a(C46256q qVar) {
        this.f116276v = qVar;
    }

    /* renamed from: a */
    public final void mo92752a(IStickerTabGuidePresenter<C0794k<EffectCategoryModel, Object>> iStickerTabGuidePresenter) {
        this.f116277w = iStickerTabGuidePresenter;
    }

    /* renamed from: a */
    public final void mo92753a(boolean z) {
        if (!z) {
            if (this.f116252B != null && !this.f116252B.isEmpty()) {
                for (C46190j c : this.f116252B) {
                    c.mo92900c();
                }
                this.f116252B.clear();
                this.f116252B = null;
            }
        } else if (!this.f116275u.isEmpty()) {
            this.f116252B = new ArrayList();
            for (C46190j jVar : this.f116275u) {
                if (jVar.mo92899b()) {
                    jVar.mo92901d();
                    this.f116252B.add(jVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo92754a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && mo92756b()) {
            mo92745a();
            if (!this.f116256b) {
                C47702b.f120193a.mo94984a("tool_performance_enter_prop_tab", C42438az.m93209a().mo86524a("duration", System.currentTimeMillis() - this.f116255a).mo86523a("status", 2).f107329a);
            }
        }
        return false;
    }

    public EffectStickerViewImpl(C46255p pVar, C46354l lVar, C45814b bVar, C45889c cVar) {
        this.f116268n = lVar;
        this.f116269o = bVar;
        this.f116266l = lVar.mo92992j().f116952d;
        this.f116267m = pVar;
        this.f116269o.mo92250a((C45819c) this.f116278x);
        this.f116270p = cVar;
    }

    /* renamed from: a */
    public final void mo92748a(AppCompatActivity appCompatActivity, C0184k kVar, C0654k kVar2, String str, FrameLayout frameLayout, C46193b bVar) {
        int i;
        this.f116255a = System.currentTimeMillis();
        this.f116268n.mo92976a(this.f116255a);
        frameLayout.removeAllViews();
        C46788b.m101633a(str);
        if (this.f116279y == null) {
            this.f116257c = appCompatActivity;
            kVar.getLifecycle().mo324a(this);
            this.f116279y = LayoutInflater.from(appCompatActivity).inflate(R.layout.ag9, frameLayout, false);
            FrameLayout frameLayout2 = (FrameLayout) this.f116279y.findViewById(R.id.csz);
            frameLayout2.removeAllViews();
            LayoutInflater.from(this.f116257c).inflate(mo92757c(), frameLayout2, true);
            this.f116273s = (AVDmtTabLayout) this.f116279y.findViewById(R.id.cx4);
            final FrameLayout frameLayout3 = (FrameLayout) this.f116279y.findViewById(R.id.b9w);
            C46194l lVar = this.f116267m.f116702c;
            if (lVar != null) {
                ViewGroup viewGroup = (ViewGroup) this.f116279y.findViewById(R.id.b75);
                viewGroup.addView(LayoutInflater.from(appCompatActivity).inflate(R.layout.zd, viewGroup, false));
                this.f116263i = viewGroup.findViewById(R.id.b1k);
                this.f116254D = viewGroup.findViewById(R.id.daj);
                View findViewById = viewGroup.findViewById(R.id.daj);
                if (C43844fm.m96281a(appCompatActivity)) {
                    i = 0;
                } else {
                    i = 8;
                }
                findViewById.setVisibility(i);
                viewGroup.findViewById(R.id.ayp).setVisibility(0);
                this.f116263i.setOnClickListener(new C46106d(this, lVar));
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f116263i.getLayoutParams();
                if (lVar.f116546a > 0) {
                    marginLayoutParams.topMargin = lVar.f116546a;
                }
                marginLayoutParams.topMargin += C43303dy.m94972c(appCompatActivity);
                mo92755b(this.f116272r);
            }
            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) ((FrameLayout) this.f116279y.findViewById(R.id.cxc)).getLayoutParams();
            if (this.f116267m.f116703d > 0) {
                marginLayoutParams2.topMargin = this.f116267m.f116703d;
            }
            marginLayoutParams2.topMargin += C43303dy.m94972c(this.f116279y.getContext());
            this.f116253C = (CheckableImageView) this.f116279y.findViewById(R.id.at5);
            this.f116261g = this.f116279y.findViewById(R.id.b_4);
            this.f116274t.add(bVar);
            View findViewById2 = this.f116279y.findViewById(R.id.b9x);
            Drawable background = findViewById2.getBackground();
            if (!(background == null || this.f116267m.f116705f == -1)) {
                C46788b.m101632a(background, this.f116257c.getResources().getColor(this.f116267m.f116705f));
                findViewById2.setBackground(background);
            }
            if (!str.equals("livestreaming") && this.f116277w != null) {
                this.f116277w.mo93132a(true);
                this.f116274t.add(this.f116277w);
            }
            this.f116251A = new C46041b(frameLayout, this.f116279y, frameLayout2);
            if (this.f116267m.f116707h) {
                this.f116262h = this.f116279y.findViewById(R.id.b_0);
                this.f116262h.setVisibility(0);
                this.f116262h.setOnClickListener(new C46103c(this));
                C46258a aVar = new C46258a(this.f116257c, this.f116279y, this.f116268n, this.f116269o, this.f116270p, new C46275c() {
                    /* renamed from: c */
                    public final void mo92767c() {
                        if (EffectStickerViewImpl.this.f116268n.mo92985c() != null && EffectStickerViewImpl.this.f116268n.mo92985c().equals(EffectStickerViewImpl.this.f116259e)) {
                            EffectStickerViewImpl.this.mo92753a(false);
                        }
                    }

                    /* renamed from: a */
                    public final void mo92765a() {
                        EffectStickerViewImpl.this.f116262h.setVisibility(8);
                        EffectStickerViewImpl.this.f116259e = EffectStickerViewImpl.this.f116268n.mo92985c();
                        EffectStickerViewImpl.this.mo92753a(true);
                        EffectStickerViewImpl effectStickerViewImpl = EffectStickerViewImpl.this;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(effectStickerViewImpl.f116261g, "alpha", new float[]{1.0f, 0.0f});
                        ofFloat.setDuration(250);
                        ofFloat.start();
                        ofFloat.addListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                EffectStickerViewImpl.this.f116261g.setVisibility(8);
                            }
                        });
                    }

                    /* renamed from: b */
                    public final void mo92766b() {
                        EffectStickerViewImpl effectStickerViewImpl = EffectStickerViewImpl.this;
                        effectStickerViewImpl.f116261g.setVisibility(0);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(effectStickerViewImpl.f116261g, "alpha", new float[]{0.0f, 1.0f});
                        ofFloat.setDuration(250);
                        ofFloat.start();
                        ofFloat.addListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                EffectStickerViewImpl.this.f116262h.setVisibility(0);
                            }
                        });
                        if (EffectStickerViewImpl.this.f116268n.mo92985c() != null && EffectStickerViewImpl.this.f116268n.mo92985c().equals(EffectStickerViewImpl.this.f116259e)) {
                            EffectStickerViewImpl.this.mo92753a(false);
                        }
                    }
                });
                this.f116260f = aVar;
            }
            if (!str.equals("livestreaming")) {
                MultiStickerPresenter multiStickerPresenter = new MultiStickerPresenter(this.f116257c, this.f116279y, mo23370j(), this.f116268n, this.f116269o, this.f116270p);
                this.f116258d = multiStickerPresenter;
                this.f116274t.add(this.f116258d);
            }
            mo92746a(kVar, kVar2, str, this.f116279y);
            if (this.f116276v != null) {
                this.f116276v.mo92779a(this.f116279y);
            }
            this.f116279y.findViewById(R.id.arx).setOnTouchListener(new C50283g(0.5f, 200, null));
            this.f116279y.findViewById(R.id.arx).setOnClickListener(new C46091b(this));
            this.f116251A.mo50220a((C24458h) new C46048d(this.f116276v) {
                /* renamed from: a */
                public final void mo50217a() {
                    super.mo50217a();
                    EffectStickerViewImpl.this.f116278x.mo92764b(C46057f.m100055a(EffectStickerViewImpl.this.f116268n.mo92985c()), null);
                    C46104a.m100190a().f116352b = false;
                }

                /* renamed from: d */
                public final void mo50225d() {
                    super.mo50225d();
                    C46104a.m100190a().f116351a = false;
                    EffectStickerViewImpl.this.f116268n.mo92973a().mo92537i().mo92539a().clear();
                    EffectStickerViewImpl.this.f116278x.mo92763a(C46057f.m100055a(EffectStickerViewImpl.this.f116268n.mo92985c()), null);
                    EffectStickerViewImpl.this.mo92760f();
                }

                /* renamed from: b */
                public final void mo50221b() {
                    super.mo50221b();
                    C46104a.m100190a().f116352b = true;
                    if (EffectStickerViewImpl.this.mo23370j().mo23374b(C45805a.class) != null) {
                        EffectStickerViewImpl.this.mo23370j().mo23372a(C45805a.class);
                    }
                    if (EffectStickerViewImpl.this.f116257c != null && !EffectStickerViewImpl.this.f116257c.isFinishing() && EffectStickerViewImpl.this.f116268n.mo92992j().f116952d) {
                        C46104a.m100190a().mo92798a(frameLayout3.findViewById(R.id.b9x), EffectStickerViewImpl.this.f116257c);
                    }
                    EffectStickerViewImpl.this.mo92759e();
                }
            });
            NetStateReceiver.m97101a((Context) appCompatActivity);
            this.f116280z = new C44331a() {

                /* renamed from: b */
                private boolean f116288b = true;

                /* renamed from: a */
                public final void mo90202a() {
                    this.f116288b = false;
                }

                /* renamed from: a */
                public final void mo90203a(int i) {
                    if (!this.f116288b) {
                        if (EffectStickerViewImpl.this.f116266l) {
                            EffectStickerViewImpl.this.f116268n.mo92990h();
                        }
                        this.f116288b = true;
                    }
                }
            };
            NetStateReceiver.m97102a(this.f116280z);
            this.f116264j = System.currentTimeMillis();
            mo92747a(kVar, str);
        }
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(new C46166e(this));
        }
        if (this.f116267m != null) {
            View findViewById3 = this.f116279y.findViewById(R.id.b_3);
            if (!(findViewById3 == null || this.f116267m.f116700a == 0)) {
                findViewById3.setBackground(appCompatActivity.getResources().getDrawable(this.f116267m.f116700a));
            }
            if (this.f116267m.f116701b != 0) {
                this.f116261g.setBackground(appCompatActivity.getResources().getDrawable(this.f116267m.f116701b));
            }
        }
        this.f116251A.mo50219a((C24454d) new C24453c());
    }
}
