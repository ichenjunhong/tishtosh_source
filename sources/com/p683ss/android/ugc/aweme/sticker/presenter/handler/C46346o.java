package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.medialib.presenter.C19378e;
import com.p683ss.android.medialib.presenter.C19378e.C19379a;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46294c;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46296e;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.o */
public final class C46346o extends C46306b implements C46294c {

    /* renamed from: f */
    public static final C46347a f116934f = new C46347a(null);

    /* renamed from: a */
    public Effect f116935a;

    /* renamed from: b */
    public int f116936b = 2;

    /* renamed from: c */
    public boolean f116937c;

    /* renamed from: d */
    public final C20489b f116938d;

    /* renamed from: e */
    public final C46296e f116939e;

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.o$a */
    public static final class C46347a {
        private C46347a() {
        }

        public /* synthetic */ C46347a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.o$b */
    static final class C46348b implements C19379a {

        /* renamed from: a */
        final /* synthetic */ C46346o f116940a;

        C46348b(C46346o oVar) {
            this.f116940a = oVar;
        }

        /* renamed from: a */
        public final void mo40428a() {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C46348b f116941a;

                {
                    this.f116941a = r1;
                }

                public final void run() {
                    C46296e eVar = this.f116941a.f116940a.f116939e;
                    if (eVar != null && !eVar.mo91210a()) {
                        this.f116941a.f116940a.f116939e.mo91211b();
                    }
                }
            }, 100);
        }
    }

    /* renamed from: a */
    public final boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        return true;
    }

    /* renamed from: a */
    public final void mo93028a() {
        this.f116935a = null;
        C19378e a = this.f116938d.mo43448a();
        if (a != null) {
            a.mo40426a(false);
        }
        C19378e a2 = this.f116938d.mo43448a();
        if (a2 != null) {
            a2.mo40425a((C19379a) null);
        }
    }

    public C46346o(C20489b bVar, C46296e eVar) {
        C52711k.m112240b(bVar, "effectController");
        this.f116938d = bVar;
        this.f116939e = eVar;
    }

    /* renamed from: a */
    public final void mo93029a(C46316b bVar, C46315a aVar) {
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(aVar, "session");
        this.f116935a = aVar.f116852a;
        if (!C46059g.m100080d(this.f116935a)) {
            C19378e a = this.f116938d.mo43448a();
            if (a != null) {
                a.mo40426a(false);
                return;
            }
            return;
        }
        this.f116937c = false;
        this.f116936b = 2;
        C19378e a2 = this.f116938d.mo43448a();
        if (a2 != null) {
            a2.mo40426a(true);
        }
        C19378e a3 = this.f116938d.mo43448a();
        if (a3 != null) {
            a3.mo40425a((C19379a) new C46348b(this));
        }
    }

    /* renamed from: a */
    public final void mo93021a(int i, int i2, int i3, String str) {
        if (C46059g.m100080d(this.f116935a) && i == 52) {
            this.f116936b = i2;
            switch (i2) {
                case 1:
                    if (!this.f116937c) {
                        C46296e eVar = this.f116939e;
                        if (eVar == null || !eVar.mo91210a() || !this.f116939e.mo91212c()) {
                            C19378e a = this.f116938d.mo43448a();
                            if (a != null) {
                                a.mo40424a();
                                break;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                    break;
                case 2:
                    C19378e a2 = this.f116938d.mo43448a();
                    if (a2 != null) {
                        a2.mo40427b();
                        break;
                    } else {
                        return;
                    }
                case 3:
                    C19378e a3 = this.f116938d.mo43448a();
                    if (a3 != null) {
                        a3.mo40424a();
                        return;
                    }
                    break;
            }
        }
    }
}
