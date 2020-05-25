package com.p683ss.android.ugc.aweme.effect.p1676e;

import android.os.Handler;
import android.os.Looper;
import com.google.p1057b.p1060c.C17592aq;
import com.google.p1057b.p1060c.C17609au;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1677a.C29189a;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1677a.C29190b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29193c;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29194d;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29195e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.effect.e.a */
public final class C29176a<Param, Target> implements C29190b<Param, Target> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f76454a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29176a.class), "mMultiCallbacks", "getMMultiCallbacks()Lcom/google/common/collect/ListMultimap;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29176a.class), "mMainThread", "getMMainThread()Ljava/lang/Thread;"))};

    /* renamed from: i */
    public static final C29177a f76455i = new C29177a(null);

    /* renamed from: b */
    public int f76456b;

    /* renamed from: c */
    public boolean f76457c;

    /* renamed from: d */
    public boolean f76458d;

    /* renamed from: e */
    public C29194d f76459e;

    /* renamed from: f */
    public boolean f76460f;

    /* renamed from: g */
    final Queue<C29192b<Param, Target>> f76461g;

    /* renamed from: h */
    final List<Param> f76462h;

    /* renamed from: j */
    private final Queue<C29192b<Param, Target>> f76463j;

    /* renamed from: k */
    private final Queue<C29192b<Param, Target>> f76464k;

    /* renamed from: l */
    private final C52668f f76465l;

    /* renamed from: m */
    private final Handler f76466m;

    /* renamed from: n */
    private final C52668f f76467n;

    /* renamed from: o */
    private AtomicInteger f76468o;

    /* renamed from: p */
    private final int f76469p = 3;

    /* renamed from: q */
    private final C29193c<Param, Target> f76470q;

    /* renamed from: com.ss.android.ugc.aweme.effect.e.a$a */
    public static final class C29177a {
        private C29177a() {
        }

        public /* synthetic */ C29177a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.e.a$b */
    static final class C29178b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29176a f76471a;

        /* renamed from: b */
        final /* synthetic */ C29192b f76472b;

        C29178b(C29176a aVar, C29192b bVar) {
            this.f76471a = aVar;
            this.f76472b = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f76471a.f76458d) {
                this.f76472b.f76494c.set(true);
                this.f76471a.mo59062a(this.f76472b);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.e.a$c */
    static final class C29179c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29176a f76473a;

        /* renamed from: b */
        final /* synthetic */ C29192b f76474b;

        C29179c(C29176a aVar, C29192b bVar) {
            this.f76473a = aVar;
            this.f76474b = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f76473a.f76458d) {
                this.f76474b.f76494c.set(true);
                this.f76473a.mo59062a(this.f76474b);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.e.a$d */
    static final class C29180d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29176a f76475a;

        /* renamed from: b */
        final /* synthetic */ C29192b f76476b;

        C29180d(C29176a aVar, C29192b bVar) {
            this.f76475a = aVar;
            this.f76476b = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Integer num;
            String str;
            switch (this.f76476b.mo59083b()) {
                case 2:
                    List<C29189a> list = this.f76475a.mo59060a().get(this.f76476b.f76498g);
                    if (list != null) {
                        for (C29189a aVar : list) {
                            if (aVar != null) {
                                aVar.mo59076a(this.f76476b.f76498g);
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder("task ");
                    sb.append(this.f76476b.f76497f);
                    sb.append(" state: running, info: ");
                    sb.append(this.f76476b.f76498g);
                    C29176a.m68709a(sb.toString());
                    break;
                case 3:
                    List<C29189a> list2 = this.f76475a.mo59060a().get(this.f76476b.f76498g);
                    if (list2 != null) {
                        for (C29189a aVar2 : list2) {
                            if (aVar2 != null) {
                                aVar2.mo59078a(this.f76476b.f76498g, this.f76476b.f76495d);
                            }
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("task ");
                    sb2.append(this.f76476b.f76497f);
                    sb2.append(" state: success, info: ");
                    sb2.append(this.f76476b.f76498g);
                    C29176a.m68709a(sb2.toString());
                    break;
                case 4:
                    List<C29189a> list3 = this.f76475a.mo59060a().get(this.f76476b.f76498g);
                    if (list3 != null) {
                        for (C29189a aVar3 : list3) {
                            if (aVar3 != null) {
                                Param param = this.f76476b.f76498g;
                                C29195e eVar = this.f76476b.f76496e;
                                Exception exc = null;
                                if (eVar != null) {
                                    num = eVar.f76501a;
                                } else {
                                    num = null;
                                }
                                C29195e eVar2 = this.f76476b.f76496e;
                                if (eVar2 != null) {
                                    str = eVar2.f76502b;
                                } else {
                                    str = null;
                                }
                                C29195e eVar3 = this.f76476b.f76496e;
                                if (eVar3 != null) {
                                    exc = eVar3.f76503c;
                                }
                                aVar3.mo59077a(param, num, str, exc);
                            }
                        }
                    }
                    StringBuilder sb3 = new StringBuilder("task ");
                    sb3.append(this.f76476b.f76497f);
                    sb3.append(" state: failed, info: ");
                    sb3.append(this.f76476b.f76498g);
                    C29176a.m68709a(sb3.toString());
                    break;
                default:
                    StringBuilder sb4 = new StringBuilder("task ");
                    sb4.append(this.f76476b.f76497f);
                    sb4.append(" state: unknown, info: ");
                    sb4.append(this.f76476b.f76498g);
                    C29176a.m68709a(sb4.toString());
                    break;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.e.a$e */
    static final class C29181e extends C52712l implements C52670a<Thread> {

        /* renamed from: a */
        public static final C29181e f76477a = new C29181e();

        C29181e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Looper mainLooper = Looper.getMainLooper();
            C52711k.m112236a((Object) mainLooper, "Looper.getMainLooper()");
            return mainLooper.getThread();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.e.a$f */
    static final class C29182f extends C52712l implements C52670a<C17592aq<Param, C29189a<Param, Target>>> {

        /* renamed from: a */
        public static final C29182f f76478a = new C29182f();

        C29182f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C17609au.m43299b().mo34187b().mo34186c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.e.a$g */
    static final class C29183g<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C29176a f76479a;

        /* renamed from: b */
        final /* synthetic */ C29192b f76480b;

        C29183g(C29176a aVar, C29192b bVar) {
            this.f76479a = aVar;
            this.f76480b = bVar;
        }

        public final /* synthetic */ Object call() {
            try {
                this.f76480b.mo59081a((C29190b<Param, Target>) this.f76479a);
            } catch (Exception e) {
                C29194d dVar = this.f76479a.f76459e;
                if (dVar != null) {
                    dVar.mo59088a(e);
                }
                C29176a aVar = this.f76479a;
                C39629l.m88232a().mo58588s();
                this.f76479a.mo59072c(this.f76480b);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.e.a$h */
    static final class C29184h extends C52712l implements C52670a<C52670a<? extends Object>> {

        /* renamed from: a */
        final /* synthetic */ C29176a f76481a;

        /* renamed from: b */
        final /* synthetic */ Object f76482b;

        /* renamed from: c */
        final /* synthetic */ C29189a f76483c;

        /* renamed from: d */
        final /* synthetic */ C52670a f76484d;

        C29184h(C29176a aVar, Object obj, C29189a aVar2, C52670a aVar3) {
            this.f76481a = aVar;
            this.f76482b = obj;
            this.f76483c = aVar2;
            this.f76484d = aVar3;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = this.f76482b;
            if (obj != null) {
                C29189a aVar = this.f76483c;
                if (aVar != null) {
                    this.f76481a.mo59060a().put(obj, aVar);
                }
            }
            C52670a aVar2 = this.f76484d;
            if (aVar2 == null) {
                return null;
            }
            aVar2.invoke();
            return aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.e.a$i */
    static final class C29185i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29176a f76485a;

        /* renamed from: b */
        final /* synthetic */ C52670a f76486b;

        C29185i(C29176a aVar, C52670a aVar2) {
            this.f76485a = aVar;
            this.f76486b = aVar2;
        }

        public final void run() {
            this.f76485a.mo59068b(this.f76486b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.e.a$j */
    static final class C29186j extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29176a f76487a;

        C29186j(C29176a aVar) {
            this.f76487a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f76487a.mo59071c();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.e.a$k */
    static final class C29187k extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29176a f76488a;

        C29187k(C29176a aVar) {
            this.f76488a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f76488a.f76460f = true;
            C29176a aVar = this.f76488a;
            aVar.f76461g.clear();
            List<Param> list = aVar.f76462h;
            C52711k.m112236a((Object) list, "mInitParam");
            for (Param a : list) {
                C29192b a2 = aVar.mo59061a(a);
                a2.f76493b = false;
                aVar.f76461g.offer(a2);
            }
            aVar.f76462h.clear();
            this.f76488a.mo59071c();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.e.a$l */
    public static final class C29188l extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C29176a f76489a;

        /* renamed from: b */
        final /* synthetic */ Object f76490b;

        /* renamed from: c */
        final /* synthetic */ C29189a f76491c;

        public C29188l(C29176a aVar, Object obj, C29189a aVar2) {
            this.f76489a = aVar;
            this.f76490b = obj;
            this.f76491c = aVar2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.f76489a.mo59060a().remove(this.f76490b, this.f76491c));
        }
    }

    /* renamed from: a */
    public final C17592aq<Param, C29189a<Param, Target>> mo59060a() {
        return (C17592aq) this.f76465l.getValue();
    }

    /* renamed from: a */
    public final void mo59065a(List<? extends Param> list) {
        for (Object next : list) {
            if (next != null) {
                this.f76462h.add(next);
            }
        }
    }

    /* renamed from: d */
    private final void m68711d() {
        mo59063a((C52670a<? extends Object>) new C29186j<Object>(this));
    }

    /* renamed from: b */
    public final void mo59066b() {
        mo59063a((C52670a<? extends Object>) new C29187k<Object>(this));
    }

    /* renamed from: e */
    private final boolean m68714e() {
        return C52711k.m112239a((Object) (Thread) this.f76467n.getValue(), (Object) Thread.currentThread());
    }

    /* renamed from: c */
    public final void mo59071c() {
        C29192b bVar;
        while (this.f76460f && this.f76468o.get() > 0) {
            if (!this.f76463j.isEmpty()) {
                bVar = (C29192b) this.f76463j.poll();
            } else if (!this.f76461g.isEmpty()) {
                bVar = (C29192b) this.f76461g.poll();
            } else {
                bVar = null;
            }
            if (bVar != null) {
                this.f76464k.offer(bVar);
                C0013i.m16a((Callable<TResult>) new C29183g<TResult>(this, bVar));
                this.f76468o.decrementAndGet();
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private final void m68712d(C29192b<Param, Target> bVar) {
        this.f76464k.remove(bVar);
    }

    /* renamed from: e */
    private final void m68713e(C29192b<Param, Target> bVar) {
        mo59063a((C52670a<? extends Object>) new C29180d<Object>(this, bVar));
    }

    /* renamed from: b */
    public final void mo59067b(C29192b<Param, Target> bVar) {
        C52711k.m112240b(bVar, "task");
        bVar.mo59080a(3);
        m68712d(bVar);
        m68713e(bVar);
        this.f76468o.incrementAndGet();
        m68711d();
    }

    /* renamed from: a */
    public static void m68709a(String str) {
        C39629l.m88232a().mo58588s();
    }

    /* renamed from: d */
    private final C29192b<Param, Target> m68710d(Param param) {
        Object obj;
        Iterator it = this.f76461g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Param param2 = ((C29192b) obj).f76498g;
            boolean z = true;
            if (param2 == null || !param2.equals(param)) {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C29192b) obj;
    }

    /* renamed from: b */
    public final void mo59068b(C52670a<? extends Object> aVar) {
        try {
            aVar.invoke();
        } catch (Exception e) {
            C29194d dVar = this.f76459e;
            if (dVar != null) {
                dVar.mo59088a(e);
            }
        }
    }

    /* renamed from: c */
    public final void mo59072c(C29192b<Param, Target> bVar) {
        C52711k.m112240b(bVar, "task");
        bVar.mo59080a(4);
        m68712d(bVar);
        if (bVar.f76492a < this.f76456b) {
            bVar.f76492a++;
            this.f76461g.offer(bVar);
        }
        m68713e(bVar);
        this.f76468o.incrementAndGet();
        m68711d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C29192b<Param, Target> mo59061a(Param param) {
        return this.f76470q.mo59086a(param);
    }

    /* renamed from: b */
    public final boolean mo59070b(Param param) {
        Object obj;
        boolean z;
        if (param == null) {
            return false;
        }
        Iterator it = this.f76464k.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Param param2 = ((C29192b) obj).f76498g;
            if (param2 == null || !param2.equals(param)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (((C29192b) obj) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo59073c(Param param) {
        Object obj;
        boolean z;
        if (param == null) {
            return false;
        }
        Iterator it = this.f76463j.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Param param2 = ((C29192b) obj).f76498g;
            if (param2 == null || !param2.equals(param)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (((C29192b) obj) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo59062a(C29192b<Param, Target> bVar) {
        C52711k.m112240b(bVar, "task");
        boolean z = false;
        if (bVar != null) {
            int b = bVar.mo59083b();
            if (3 == b || 4 == b) {
                z = true;
            }
        }
        if (!z) {
            bVar.mo59080a(2);
        }
        m68713e(bVar);
    }

    /* renamed from: a */
    public final void mo59063a(C52670a<? extends Object> aVar) {
        if (m68714e()) {
            mo59068b(aVar);
        } else {
            this.f76466m.post(new C29185i(this, aVar));
        }
    }

    public C29176a(int i, C29193c<Param, Target> cVar) {
        C52711k.m112240b(cVar, "taskGenerator");
        this.f76470q = cVar;
        this.f76457c = true;
        this.f76461g = new ConcurrentLinkedQueue();
        this.f76463j = new ConcurrentLinkedQueue();
        this.f76464k = new ConcurrentLinkedQueue();
        this.f76465l = C52732g.m112285a(C29182f.f76478a);
        this.f76466m = new Handler(Looper.getMainLooper());
        this.f76467n = C52732g.m112285a(C29181e.f76477a);
        this.f76468o = new AtomicInteger(this.f76469p);
        this.f76462h = Collections.synchronizedList(new ArrayList());
    }

    /* renamed from: b */
    public final void mo59069b(Param param, C29189a<Param, Target> aVar) {
        C29192b bVar;
        if (param != null) {
            if (mo59073c(param) || mo59070b(param)) {
                if (this.f76457c) {
                    StringBuilder sb = new StringBuilder("add priority task, download is already started, no reentrance, info: ");
                    sb.append(param);
                    m68709a(sb.toString());
                } else {
                    m68708a(param, aVar, null);
                }
                bVar = null;
            } else {
                bVar = m68710d(param);
                if (bVar != null) {
                    this.f76461g.remove(bVar);
                } else {
                    bVar = mo59061a(param);
                }
            }
            if (bVar != null) {
                bVar.f76493b = true;
                this.f76463j.offer(bVar);
                this.f76460f = true;
                m68708a(param, aVar, new C29179c(this, bVar));
                mo59071c();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59064a(Param r12, com.p683ss.android.ugc.aweme.effect.p1676e.p1677a.C29189a<Param, Target> r13) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Queue<com.ss.android.ugc.aweme.effect.e.b.b<Param, Target>> r0 = r11.f76461g
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r0.next()
            r5 = r1
            com.ss.android.ugc.aweme.effect.e.b.b r5 = (com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b) r5
            Param r5 = r5.f76498g
            if (r5 == 0) goto L_0x0027
            boolean r5 = r5.equals(r12)
            if (r5 != r4) goto L_0x0027
            r5 = 1
            goto L_0x0028
        L_0x0027:
            r5 = 0
        L_0x0028:
            if (r5 == 0) goto L_0x000b
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            com.ss.android.ugc.aweme.effect.e.b.b r1 = (com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b) r1
            if (r1 == 0) goto L_0x0032
        L_0x0030:
            r0 = 1
            goto L_0x0089
        L_0x0032:
            java.util.Queue<com.ss.android.ugc.aweme.effect.e.b.b<Param, Target>> r0 = r11.f76463j
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x003a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r0.next()
            r5 = r1
            com.ss.android.ugc.aweme.effect.e.b.b r5 = (com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b) r5
            Param r5 = r5.f76498g
            if (r5 == 0) goto L_0x0053
            boolean r5 = r5.equals(r12)
            if (r5 != r4) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            if (r5 == 0) goto L_0x003a
            goto L_0x0058
        L_0x0057:
            r1 = r2
        L_0x0058:
            com.ss.android.ugc.aweme.effect.e.b.b r1 = (com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b) r1
            if (r1 == 0) goto L_0x005d
            goto L_0x0030
        L_0x005d:
            java.util.Queue<com.ss.android.ugc.aweme.effect.e.b.b<Param, Target>> r0 = r11.f76464k
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0065:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0082
            java.lang.Object r1 = r0.next()
            r5 = r1
            com.ss.android.ugc.aweme.effect.e.b.b r5 = (com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b) r5
            Param r5 = r5.f76498g
            if (r5 == 0) goto L_0x007e
            boolean r5 = r5.equals(r12)
            if (r5 != r4) goto L_0x007e
            r5 = 1
            goto L_0x007f
        L_0x007e:
            r5 = 0
        L_0x007f:
            if (r5 == 0) goto L_0x0065
            goto L_0x0083
        L_0x0082:
            r1 = r2
        L_0x0083:
            com.ss.android.ugc.aweme.effect.e.b.b r1 = (com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b) r1
            if (r1 == 0) goto L_0x0088
            goto L_0x0030
        L_0x0088:
            r0 = 0
        L_0x0089:
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r11.f76457c
            if (r0 == 0) goto L_0x00a1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "add normal task, download is already started, no reentrance, info: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            m68709a(r0)
            goto L_0x00af
        L_0x00a1:
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m68708a(r6, r7, null)
            goto L_0x00af
        L_0x00ab:
            com.ss.android.ugc.aweme.effect.e.b.b r2 = r11.mo59061a((Param) r12)
        L_0x00af:
            if (r2 != 0) goto L_0x00b2
            return
        L_0x00b2:
            r2.f76493b = r3
            java.util.Queue<com.ss.android.ugc.aweme.effect.e.b.b<Param, Target>> r0 = r11.f76461g
            r0.offer(r2)
            r11.f76460f = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "download enqueued, info: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            m68709a(r0)
            com.ss.android.ugc.aweme.effect.e.a$b r0 = new com.ss.android.ugc.aweme.effect.e.a$b
            r0.<init>(r11, r2)
            d.f.a.a r0 = (p2628d.p2639f.p2640a.C52670a) r0
            r11.m68708a(r12, r13, r0)
            r11.mo59071c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.effect.p1676e.C29176a.mo59064a(java.lang.Object, com.ss.android.ugc.aweme.effect.e.a.a):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m68708a(Param param, C29189a<Param, Target> aVar, C52670a<? extends Object> aVar2) {
        mo59063a((C52670a<? extends Object>) new C29184h<Object>(this, param, aVar, aVar2));
    }
}
