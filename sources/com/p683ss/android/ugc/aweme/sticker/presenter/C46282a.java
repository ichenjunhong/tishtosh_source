package com.p683ss.android.ugc.aweme.sticker.presenter;

import android.arch.lifecycle.C0184k;
import android.view.View;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45819c;
import com.p683ss.android.ugc.aweme.sticker.panel.C46190j;
import com.p683ss.android.ugc.aweme.sticker.panel.C46254o;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q.C46257a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46342l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46344n;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2309a.C46305a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46317c;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46318d;
import com.p683ss.android.ugc.aweme.sticker.presenter.p2308a.C46291c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a */
public abstract class C46282a implements C46297f {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f116766a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46282a.class), "stickerLoaderHandler", "getStickerLoaderHandler()Lcom/ss/android/ugc/aweme/sticker/presenter/handler/StickerLoaderHandler;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46282a.class), "stickerSelectedDispatcherHandler", "getStickerSelectedDispatcherHandler()Lcom/ss/android/ugc/aweme/sticker/presenter/handler/StickerSelectedDispatcherHandler;"))};

    /* renamed from: b */
    public C46352j f116767b;

    /* renamed from: c */
    public final List<C46256q> f116768c = new ArrayList();

    /* renamed from: d */
    public final List<C46190j> f116769d = new ArrayList();

    /* renamed from: e */
    public final List<C46190j> f116770e = new ArrayList();

    /* renamed from: f */
    private volatile boolean f116771f;

    /* renamed from: g */
    private final List<C46340k> f116772g = new ArrayList();

    /* renamed from: h */
    private final CopyOnWriteArrayList<C46294c> f116773h = new CopyOnWriteArrayList<>();

    /* renamed from: i */
    private final C52668f f116774i = C52732g.m112285a(new C46286d(this));

    /* renamed from: j */
    private final C52668f f116775j = C52732g.m112285a(new C46287e(this));

    /* renamed from: k */
    private C46254o f116776k;

    /* renamed from: l */
    private final SafeHandler f116777l = new SafeHandler(this.f116778m);

    /* renamed from: m */
    private final C0184k f116778m;

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a$a */
    public static final class C46283a implements C46256q {

        /* renamed from: a */
        final /* synthetic */ C46282a f116779a;

        public final void cl_() {
            for (C46256q cl_ : this.f116779a.f116768c) {
                cl_.cl_();
            }
        }

        C46283a(C46282a aVar) {
            this.f116779a = aVar;
        }

        /* renamed from: a */
        public final void mo92779a(View view) {
            C52711k.m112240b(view, "stickerView");
            for (C46256q a : this.f116779a.f116768c) {
                a.mo92779a(view);
            }
        }

        /* renamed from: b */
        public final void mo92781b(C46257a aVar) {
            C52711k.m112240b(aVar, "state");
            for (C46256q b : this.f116779a.f116768c) {
                b.mo92781b(aVar);
            }
        }

        /* renamed from: a */
        public final void mo92780a(C46257a aVar) {
            C52711k.m112240b(aVar, "state");
            for (C46256q a : this.f116779a.f116768c) {
                a.mo92780a(aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a$b */
    public static final class C46284b implements C46190j {

        /* renamed from: a */
        final /* synthetic */ C46282a f116780a;

        /* renamed from: b */
        public final boolean mo92899b() {
            Object obj;
            Iterator it = this.f116780a.f116770e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C46190j) obj).mo92899b()) {
                    break;
                }
            }
            if (obj != null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final void mo92900c() {
            for (C46190j c : this.f116780a.f116769d) {
                c.mo92900c();
            }
            this.f116780a.f116769d.clear();
        }

        /* renamed from: d */
        public final void mo92901d() {
            for (C46190j jVar : this.f116780a.f116770e) {
                if (jVar.mo92899b()) {
                    jVar.mo92901d();
                    this.f116780a.f116769d.add(jVar);
                }
            }
        }

        C46284b(C46282a aVar) {
            this.f116780a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a$c */
    public static final class C46285c implements C45819c {

        /* renamed from: a */
        final /* synthetic */ C46282a f116781a;

        C46285c(C46282a aVar) {
            this.f116781a = aVar;
        }

        /* renamed from: a */
        public final void mo91208a(C46315a aVar) {
            C52711k.m112240b(aVar, "session");
            this.f116781a.mo93000a((C46317c) aVar);
        }

        /* renamed from: a */
        public final void mo91209a(C46318d dVar) {
            C52711k.m112240b(dVar, "session");
            this.f116781a.mo93000a((C46317c) dVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a$d */
    static final class C46286d extends C52712l implements C52670a<C46342l> {

        /* renamed from: a */
        final /* synthetic */ C46282a f116782a;

        C46286d(C46282a aVar) {
            this.f116782a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C46342l(this.f116782a.mo92995a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a$e */
    static final class C46287e extends C52712l implements C52670a<C46344n> {

        /* renamed from: a */
        final /* synthetic */ C46282a f116783a;

        C46287e(C46282a aVar) {
            this.f116783a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C46344n(this.f116783a.f116767b);
        }
    }

    /* renamed from: a */
    public abstract C46291c mo92995a();

    /* renamed from: a */
    public final void mo92999a(C46296e eVar) {
    }

    /* renamed from: a */
    public final void mo93002a(String str, String str2, String str3) {
    }

    /* renamed from: a */
    public final void mo93003a(boolean z) {
    }

    /* renamed from: b */
    public final void mo93005b(boolean z) {
    }

    /* renamed from: c */
    public final C46254o mo93006c() {
        return this.f116776k;
    }

    /* renamed from: d */
    public final SafeHandler mo93007d() {
        return this.f116777l;
    }

    /* renamed from: e */
    public final void mo93008e() {
    }

    /* renamed from: b */
    public final void mo93004b() {
        if (!this.f116771f) {
            this.f116771f = true;
            mo93024i().mo92250a((C45819c) new C46285c(this));
        }
    }

    /* renamed from: a */
    public final C46340k mo92996a(C52671b<? super C46340k, Boolean> bVar) {
        Object obj;
        C52711k.m112240b(bVar, "predicate");
        Iterator it = this.f116772g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                break;
            }
        }
        return (C46340k) obj;
    }

    public C46282a(C0184k kVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        this.f116778m = kVar;
    }

    /* renamed from: a */
    public final void mo92998a(C46254o oVar) {
        C52711k.m112240b(oVar, "stickerView");
        this.f116776k = oVar;
        oVar.mo92773a((C46256q) new C46283a(this));
        oVar.mo92750a(new C46284b(this));
    }

    /* renamed from: a */
    public final void mo93000a(C46317c cVar) {
        List arrayList = new ArrayList();
        if (this.f116767b != null) {
            arrayList.add((C46344n) this.f116775j.getValue());
        }
        arrayList.addAll(this.f116772g);
        arrayList.add((C46342l) this.f116774i.getValue());
        new C46305a(arrayList, 0).mo93036a(cVar);
    }

    /* renamed from: a */
    public final void mo93001a(C46340k kVar) {
        C52711k.m112240b(kVar, "handler");
        if (!this.f116772g.contains(kVar)) {
            this.f116772g.add(kVar);
        }
        if ((kVar instanceof C46256q) && !this.f116768c.contains(kVar)) {
            this.f116768c.add(kVar);
        }
        if ((kVar instanceof C46190j) && !this.f116770e.contains(kVar)) {
            this.f116770e.add(kVar);
        }
        if ((kVar instanceof C46294c) && !this.f116773h.contains(kVar)) {
            this.f116773h.add(kVar);
        }
    }

    /* renamed from: a */
    public final void mo92997a(int i, int i2, int i3, String str) {
        for (C46294c a : this.f116773h) {
            a.mo93021a(i, i2, i3, str);
        }
    }
}
