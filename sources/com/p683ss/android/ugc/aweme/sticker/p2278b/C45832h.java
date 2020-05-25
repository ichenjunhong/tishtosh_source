package com.p683ss.android.ugc.aweme.sticker.p2278b;

import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1677a.C29190b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29193c;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29195e;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.b.h */
public final class C45832h<Param, Target> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f115838a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45832h.class), "mMainThread", "getMMainThread()Ljava/lang/Thread;"))};

    /* renamed from: b */
    public Param f115839b;

    /* renamed from: c */
    public final C45829e<Param, Target> f115840c;

    /* renamed from: d */
    public final C45821a<Param, Target> f115841d;

    /* renamed from: e */
    private final Queue<Param> f115842e = new LinkedList();

    /* renamed from: f */
    private final Handler f115843f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private final C52668f f115844g = C52732g.m112285a(C45836c.f115851a);

    /* renamed from: h */
    private final C29190b<Param, Target> f115845h = new C45833a(this);

    /* renamed from: i */
    private final C29193c<Param, Target> f115846i;

    /* renamed from: com.ss.android.ugc.aweme.sticker.b.h$a */
    public static final class C45833a implements C29190b<Param, Target> {

        /* renamed from: a */
        final /* synthetic */ C45832h f115847a;

        /* renamed from: com.ss.android.ugc.aweme.sticker.b.h$a$a */
        static final class C45834a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C45833a f115848a;

            /* renamed from: b */
            final /* synthetic */ C29192b f115849b;

            C45834a(C45833a aVar, C29192b bVar) {
                this.f115848a = aVar;
                this.f115849b = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                Integer num;
                String str;
                C45829e<Param, Target> eVar = this.f115848a.f115847a.f115840c;
                Param param = this.f115849b.f76498g;
                C29195e eVar2 = this.f115849b.f76496e;
                Exception exc = null;
                if (eVar2 != null) {
                    num = eVar2.f76501a;
                } else {
                    num = null;
                }
                C29195e eVar3 = this.f115849b.f76496e;
                if (eVar3 != null) {
                    str = eVar3.f76502b;
                } else {
                    str = null;
                }
                C29195e eVar4 = this.f115849b.f76496e;
                if (eVar4 != null) {
                    exc = eVar4.f76503c;
                }
                eVar.mo92264a(param, num, str, exc);
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo59062a(C29192b<Param, Target> bVar) {
            C52711k.m112240b(bVar, "task");
        }

        C45833a(C45832h hVar) {
            this.f115847a = hVar;
        }

        /* renamed from: b */
        public final void mo59067b(C29192b<Param, Target> bVar) {
            C52711k.m112240b(bVar, "task");
            this.f115847a.f115841d.mo59067b(bVar);
            this.f115847a.mo92268b();
        }

        /* renamed from: c */
        public final void mo59072c(C29192b<Param, Target> bVar) {
            C52711k.m112240b(bVar, "task");
            this.f115847a.mo92266a((C52670a<? extends Object>) new C45834a<Object>(this, bVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.b.h$b */
    static final class C45835b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C45832h f115850a;

        C45835b(C45832h hVar) {
            this.f115850a = hVar;
        }

        public final /* synthetic */ Object call() {
            this.f115850a.mo92268b();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.b.h$c */
    static final class C45836c extends C52712l implements C52670a<Thread> {

        /* renamed from: a */
        public static final C45836c f115851a = new C45836c();

        C45836c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Looper mainLooper = Looper.getMainLooper();
            C52711k.m112236a((Object) mainLooper, "Looper.getMainLooper()");
            return mainLooper.getThread();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.b.h$d */
    static final class C45837d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45832h f115852a;

        C45837d(C45832h hVar) {
            this.f115852a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f115852a.f115840c.mo92263a(null);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.b.h$e */
    static final class C45838e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45832h f115853a;

        /* renamed from: b */
        final /* synthetic */ Exception f115854b;

        C45838e(C45832h hVar, Exception exc) {
            this.f115853a = hVar;
            this.f115854b = exc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C45829e<Param, Target> eVar = this.f115853a.f115840c;
            Param param = this.f115853a.f115839b;
            if (param == null) {
                C52711k.m112234a();
            }
            eVar.mo92264a(param, null, null, this.f115854b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.b.h$f */
    static final class C45839f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C45832h f115855a;

        /* renamed from: b */
        final /* synthetic */ C52670a f115856b;

        C45839f(C45832h hVar, C52670a aVar) {
            this.f115855a = hVar;
            this.f115856b = aVar;
        }

        public final void run() {
            C45832h.m99656b(this.f115856b);
        }
    }

    /* renamed from: c */
    private final Thread m99657c() {
        return (Thread) this.f115844g.getValue();
    }

    /* renamed from: d */
    private final boolean m99658d() {
        return C52711k.m112239a((Object) m99657c(), (Object) Thread.currentThread());
    }

    /* renamed from: a */
    public final void mo92265a() {
        C0013i.m16a((Callable<TResult>) new C45835b<TResult>(this));
    }

    /* renamed from: b */
    public final void mo92268b() {
        while (!this.f115842e.isEmpty()) {
            this.f115839b = this.f115842e.poll();
            if (this.f115839b != null) {
                C29193c<Param, Target> cVar = this.f115846i;
                Param param = this.f115839b;
                if (param == null) {
                    C52711k.m112234a();
                }
                try {
                    cVar.mo59086a(param).mo59081a(this.f115845h);
                    return;
                } catch (Exception e) {
                    mo92266a((C52670a<? extends Object>) new C45838e<Object>(this, e));
                    return;
                }
            }
        }
        mo92266a((C52670a<? extends Object>) new C45837d<Object>(this));
    }

    /* renamed from: b */
    public static void m99656b(C52670a<? extends Object> aVar) {
        try {
            aVar.invoke();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo92266a(C52670a<? extends Object> aVar) {
        if (m99658d()) {
            m99656b(aVar);
        } else {
            this.f115843f.post(new C45839f(this, aVar));
        }
    }

    /* renamed from: a */
    public final void mo92267a(List<? extends Param> list) {
        C52711k.m112240b(list, "task");
        this.f115842e.addAll(list);
    }

    public C45832h(C29193c<Param, Target> cVar, C45829e<Param, Target> eVar, C45821a<Param, Target> aVar) {
        C52711k.m112240b(cVar, "execTask");
        C52711k.m112240b(eVar, "listener");
        C52711k.m112240b(aVar, "onTaskExecListener");
        this.f115846i = cVar;
        this.f115840c = eVar;
        this.f115841d = aVar;
    }
}
