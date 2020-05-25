package com.p683ss.android.ugc.aweme.lego;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue.IdleHandler;
import com.p683ss.android.ugc.aweme.lego.p1914b.C35884a;
import com.p683ss.android.ugc.aweme.lego.p1914b.C35886b;
import com.p683ss.android.ugc.aweme.lego.p1914b.C35887c;
import com.p683ss.android.ugc.aweme.lego.p1914b.C35888d;
import com.p683ss.android.ugc.aweme.lego.p1915c.C35892c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.lego.a */
public final class C35857a {

    /* renamed from: a */
    public static C35896f f92056a;

    /* renamed from: b */
    public static final C35888d f92057b = new C35888d();

    /* renamed from: c */
    public static final C35886b f92058c = new C35886b();

    /* renamed from: d */
    public static final C35887c f92059d = new C35887c();

    /* renamed from: e */
    public static final C35884a f92060e = new C35884a();

    /* renamed from: f */
    public static Context f92061f;

    /* renamed from: g */
    public static C35861c f92062g;

    /* renamed from: h */
    public static C35858a f92063h = C35858a.COLD_BOOT_BEGIN;

    /* renamed from: i */
    public static C35895e f92064i;

    /* renamed from: j */
    public static final C35857a f92065j = new C35857a();

    /* renamed from: k */
    private static long f92066k = 60000;

    /* renamed from: com.ss.android.ugc.aweme.lego.a$a */
    public enum C35858a {
        COLD_BOOT_BEGIN,
        COLD_BOOT_END,
        HOT_BOOT_BEGIN,
        HOT_BOOT_END
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$b */
    public static final class C35859b {

        /* renamed from: a */
        private final List<Class<? extends LegoInflate>> f92068a = new ArrayList();

        /* renamed from: com.ss.android.ugc.aweme.lego.a$b$a */
        static final class C35860a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Class f92069a;

            C35860a(Class cls) {
                this.f92069a = cls;
            }

            public final void run() {
                C35857a.f92060e.mo74542c(this.f92069a);
                C35892c c = C35883b.m81031c();
                C35857a aVar = C35857a.f92065j;
                Context context = C35857a.f92061f;
                if (context == null) {
                    C52711k.m112237a("context");
                }
                c.mo74568a(context);
            }
        }

        /* renamed from: a */
        public final void mo74514a() {
            if (!this.f92068a.isEmpty()) {
                for (Class aVar : this.f92068a) {
                    C35883b.m81030b().post(new C35860a(aVar));
                }
                this.f92068a.clear();
            }
        }

        /* renamed from: a */
        public final C35859b mo74513a(Class<? extends LegoInflate> cls) {
            C52711k.m112240b(cls, LeakCanaryFileProvider.f132049i);
            if (C35857a.f92060e.mo74541b(cls)) {
                return this;
            }
            this.f92068a.add(cls);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$c */
    public static final class C35861c extends Handler {
        /* renamed from: a */
        public final void mo74516a(int i) {
            mo74517a(i, 0);
        }

        public final void handleMessage(Message message) {
            Integer num;
            if (message != null) {
                num = Integer.valueOf(message.what);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1205) {
                C35857a.m81008e();
            } else if (num != null && num.intValue() == 1201) {
                Class b = C35857a.f92059d.mo74560b(C35898h.BOOT_FINISH);
                if (b != null) {
                    C35883b.m81028a().execute(new C35873i(b));
                }
                LegoTask b2 = C35857a.f92057b.mo74565b(C35898h.BOOT_FINISH);
                if (b2 != null) {
                    C35883b.m81028a().execute(new C35874j(b2));
                }
                if (C35857a.f92059d.mo74558a(C35898h.BOOT_FINISH) || C35857a.f92057b.mo74564a(C35898h.BOOT_FINISH)) {
                    C35861c cVar = C35857a.f92062g;
                    if (cVar == null) {
                        C52711k.m112237a("mainHandler");
                    }
                    cVar.mo74517a(1201, 50);
                }
            } else if (num != null && num.intValue() == 1202) {
                Class b3 = C35857a.f92059d.mo74560b(C35898h.SPARSE);
                if (b3 != null) {
                    C35883b.m81028a().execute(new C35877m(b3));
                }
                LegoTask b4 = C35857a.f92057b.mo74565b(C35898h.SPARSE);
                if (b4 != null) {
                    C35883b.m81028a().execute(new C35878n(b4));
                }
                if (C35857a.f92059d.mo74558a(C35898h.SPARSE) || C35857a.f92057b.mo74564a(C35898h.SPARSE)) {
                    C35861c cVar2 = C35857a.f92062g;
                    if (cVar2 == null) {
                        C52711k.m112237a("mainHandler");
                    }
                    cVar2.mo74517a(1202, 50);
                }
            } else if (num != null && num.intValue() == 1203) {
                if (C35857a.f92058c.mo74552a(C35897g.SPARSE)) {
                    C35889c b5 = C35857a.f92058c.mo74553b(C35897g.SPARSE);
                    if (b5 != null) {
                        C35883b.m81029a(C35897g.SPARSE).execute(new C35872h(b5));
                    }
                }
                if (C35857a.f92058c.mo74552a(C35897g.SPARSE)) {
                    C35861c cVar3 = C35857a.f92062g;
                    if (cVar3 == null) {
                        C52711k.m112237a("mainHandler");
                    }
                    cVar3.mo74517a(1203, 2000);
                }
            } else {
                if (num != null && num.intValue() == 1204) {
                    if (C35857a.f92058c.mo74552a(C35897g.SPARSE)) {
                        C35861c cVar4 = C35857a.f92062g;
                        if (cVar4 == null) {
                            C52711k.m112237a("mainHandler");
                        }
                        cVar4.mo74517a(1204, 2000);
                        return;
                    }
                    if (C35857a.f92058c.mo74552a(C35897g.IDLE)) {
                        C35889c b6 = C35857a.f92058c.mo74553b(C35897g.IDLE);
                        if (b6 != null) {
                            C35883b.m81029a(C35897g.IDLE).execute(new C35871g(b6));
                        }
                    }
                    if (C35857a.f92058c.mo74552a(C35897g.IDLE)) {
                        C35861c cVar5 = C35857a.f92062g;
                        if (cVar5 == null) {
                            C52711k.m112237a("mainHandler");
                        }
                        cVar5.mo74517a(1204, 2000);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo74517a(int i, long j) {
            m81017a(i, j, null);
        }

        /* renamed from: a */
        private void m81017a(int i, long j, Object obj) {
            Message obtainMessage = obtainMessage();
            obtainMessage.what = i;
            obtainMessage.obj = null;
            removeMessages(i);
            sendMessageDelayed(obtainMessage, j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$d */
    public static final class C35862d {

        /* renamed from: a */
        public final List<C35889c> f92070a = new ArrayList();

        /* renamed from: com.ss.android.ugc.aweme.lego.a$d$a */
        static final class C35863a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35862d f92071a;

            C35863a(C35862d dVar) {
                this.f92071a = dVar;
            }

            public final void run() {
                for (final C35889c cVar : this.f92071a.f92070a) {
                    C35897g a = cVar.mo46246a();
                    C35886b g = C35857a.f92058c;
                    C52711k.m112240b(a, "type");
                    C52711k.m112240b(cVar, "request");
                    synchronized (g.f92102a) {
                        Object obj = g.f92102a.get(a);
                        if (obj == null) {
                            C52711k.m112234a();
                        }
                        ((List) obj).add(cVar);
                    }
                    if (a == C35897g.P0) {
                        C35883b.m81029a(C35897g.P0).execute(new Runnable() {
                            public final void run() {
                                C35857a.f92058c.mo74551a(cVar, C35857a.m81010f());
                            }
                        });
                    } else if (a == C35897g.NORMAL) {
                        C35883b.m81029a(C35897g.NORMAL).execute(new Runnable() {
                            public final void run() {
                                C35857a.f92058c.mo74551a(cVar, C35857a.m81010f());
                            }
                        });
                    }
                }
                if (C35857a.m81012g()) {
                    if (!C35857a.m81000b(C35857a.f92065j).hasMessages(1203) && C35857a.f92058c.mo74552a(C35897g.SPARSE)) {
                        C35857a.m81000b(C35857a.f92065j).mo74517a(1203, 2000);
                    }
                    if (!C35857a.m81000b(C35857a.f92065j).hasMessages(1204) && C35857a.f92058c.mo74552a(C35897g.IDLE)) {
                        C35857a.m81000b(C35857a.f92065j).mo74517a(1204, 2000);
                    }
                }
                this.f92071a.f92070a.clear();
            }
        }

        /* renamed from: a */
        public final void mo74520a() {
            if (!this.f92070a.isEmpty()) {
                C35883b.m81029a(C35897g.P0).execute(new C35863a(this));
            }
        }

        /* renamed from: a */
        public final C35862d mo74519a(C35889c cVar) {
            C52711k.m112240b(cVar, "request");
            this.f92070a.add(cVar);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$e */
    public static final class C35866e {

        /* renamed from: a */
        public final Map<C35898h, List<Class<? extends LegoService>>> f92074a = new HashMap();

        /* renamed from: com.ss.android.ugc.aweme.lego.a$e$a */
        public static final class C35867a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Class f92075a;

            public C35867a(Class cls) {
                this.f92075a = cls;
            }

            public final void run() {
                C35857a.f92059d.mo74554a(this.f92075a);
            }
        }

        public C35866e() {
            for (C35898h put : C35898h.values()) {
                this.f92074a.put(put, new ArrayList());
            }
        }

        /* renamed from: a */
        public final C35866e mo74524a(Class<? extends LegoService> cls) {
            C52711k.m112240b(cls, LeakCanaryFileProvider.f132049i);
            LegoService b = C35857a.f92059d.mo74559b(cls);
            if (b != null) {
                Object obj = this.f92074a.get(b.type());
                if (obj == null) {
                    C52711k.m112234a();
                }
                ((List) obj).add(cls);
            }
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$f */
    public static final class C35868f {

        /* renamed from: a */
        private final Map<C35898h, List<LegoTask>> f92076a = new HashMap();

        /* renamed from: com.ss.android.ugc.aweme.lego.a$f$a */
        static final class C35869a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ LegoTask f92077a;

            C35869a(LegoTask legoTask) {
                this.f92077a = legoTask;
            }

            public final void run() {
                C35857a.f92057b.mo74566b(this.f92077a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.lego.a$f$b */
        static final class C35870b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ LegoTask f92078a;

            C35870b(LegoTask legoTask) {
                this.f92078a = legoTask;
            }

            public final void run() {
                C35857a.f92057b.mo74566b(this.f92078a);
            }
        }

        public C35868f() {
            for (C35898h put : C35898h.values()) {
                this.f92076a.put(put, new ArrayList());
            }
        }

        /* renamed from: a */
        public final void mo74527a() {
            C35898h[] values;
            if (!this.f92076a.isEmpty()) {
                for (C35898h hVar : C35898h.values()) {
                    C35888d e = C35857a.f92057b;
                    Object obj = this.f92076a.get(hVar);
                    if (obj == null) {
                        C52711k.m112234a();
                    }
                    e.mo74567b(hVar, (List) obj);
                }
                C35888d e2 = C35857a.f92057b;
                C35898h hVar2 = C35898h.MAIN;
                Object obj2 = this.f92076a.get(C35898h.MAIN);
                if (obj2 == null) {
                    C52711k.m112234a();
                }
                for (LegoTask b : e2.mo74562a(hVar2, (List) obj2)) {
                    C35857a.f92057b.mo74566b(b);
                }
                C35888d e3 = C35857a.f92057b;
                C35898h hVar3 = C35898h.BACKGROUND;
                Object obj3 = this.f92076a.get(C35898h.BACKGROUND);
                if (obj3 == null) {
                    C52711k.m112234a();
                }
                for (LegoTask aVar : e3.mo74562a(hVar3, (List) obj3)) {
                    C35883b.m81028a().execute(new C35869a(aVar));
                }
                if (C35857a.f92063h != C35858a.COLD_BOOT_BEGIN) {
                    C35888d e4 = C35857a.f92057b;
                    C35898h hVar4 = C35898h.BOOT_FINISH;
                    Object obj4 = this.f92076a.get(C35898h.BOOT_FINISH);
                    if (obj4 == null) {
                        C52711k.m112234a();
                    }
                    for (LegoTask bVar : e4.mo74562a(hVar4, (List) obj4)) {
                        C35883b.m81028a().execute(new C35870b(bVar));
                    }
                }
                if (C35857a.f92057b.mo74564a(C35898h.SPARSE) && !C35857a.m81000b(C35857a.f92065j).hasMessages(1202)) {
                    C35857a.m81000b(C35857a.f92065j).mo74516a(1202);
                }
                if (C35857a.f92057b.mo74564a(C35898h.IDLE)) {
                    C35857a.m81000b(C35857a.f92065j).mo74516a(1200);
                }
                this.f92076a.clear();
            }
        }

        /* renamed from: a */
        public final C35868f mo74526a(LegoTask legoTask) {
            C52711k.m112240b(legoTask, "task");
            if (legoTask.process() == C35896f.ALL || legoTask.process() == C35857a.m81006d(C35857a.f92065j)) {
                Object obj = this.f92076a.get(legoTask.type());
                if (obj == null) {
                    C52711k.m112234a();
                }
                ((List) obj).add(legoTask);
            }
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$g */
    static final class C35871g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35889c f92079a;

        C35871g(C35889c cVar) {
            this.f92079a = cVar;
        }

        public final void run() {
            C35857a.f92058c.mo74551a(this.f92079a, C35857a.m81010f());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$h */
    static final class C35872h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35889c f92080a;

        C35872h(C35889c cVar) {
            this.f92080a = cVar;
        }

        public final void run() {
            C35857a.f92058c.mo74551a(this.f92080a, C35857a.m81010f());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$i */
    static final class C35873i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Class f92081a;

        C35873i(Class cls) {
            this.f92081a = cls;
        }

        public final void run() {
            C35857a.f92059d.mo74554a(this.f92081a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$j */
    static final class C35874j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LegoTask f92082a;

        C35874j(LegoTask legoTask) {
            this.f92082a = legoTask;
        }

        public final void run() {
            C35857a.f92057b.mo74566b(this.f92082a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$k */
    static final class C35875k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Class f92083a;

        C35875k(Class cls) {
            this.f92083a = cls;
        }

        public final void run() {
            C35857a.f92059d.mo74554a(this.f92083a);
            C35857a.m81000b(C35857a.f92065j).mo74516a(1200);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$l */
    static final class C35876l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LegoTask f92084a;

        C35876l(LegoTask legoTask) {
            this.f92084a = legoTask;
        }

        public final void run() {
            C35857a.f92057b.mo74566b(this.f92084a);
            C35857a.m81000b(C35857a.f92065j).mo74516a(1200);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$m */
    static final class C35877m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Class f92085a;

        C35877m(Class cls) {
            this.f92085a = cls;
        }

        public final void run() {
            C35857a.f92059d.mo74554a(this.f92085a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$n */
    static final class C35878n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LegoTask f92086a;

        C35878n(LegoTask legoTask) {
            this.f92086a = legoTask;
        }

        public final void run() {
            C35857a.f92057b.mo74566b(this.f92086a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$o */
    public static final class C35879o implements IdleHandler {

        /* renamed from: a */
        public static final C35879o f92087a = new C35879o();

        C35879o() {
        }

        public final boolean queueIdle() {
            if (C35857a.m81012g()) {
                Class b = C35857a.f92059d.mo74560b(C35898h.IDLE);
                if (b != null) {
                    C35883b.m81028a().execute(new C35875k(b));
                }
                LegoTask b2 = C35857a.f92057b.mo74565b(C35898h.IDLE);
                if (b2 != null) {
                    C35883b.m81028a().execute(new C35876l(b2));
                }
            }
            return true;
        }
    }

    private C35857a() {
    }

    /* renamed from: a */
    public static C35895e m80996a() {
        return f92064i;
    }

    /* renamed from: b */
    public static C35868f m81001b() {
        return new C35868f();
    }

    /* renamed from: c */
    public static C35859b m81003c() {
        return new C35859b();
    }

    /* renamed from: d */
    public static C35862d m81005d() {
        return new C35862d();
    }

    /* renamed from: f */
    public static boolean m81010f() {
        if (f92063h == C35858a.COLD_BOOT_BEGIN || f92063h == C35858a.COLD_BOOT_END) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m81012g() {
        if (f92063h == C35858a.COLD_BOOT_END || f92063h == C35858a.HOT_BOOT_END) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m81008e() {
        if (f92063h == C35858a.COLD_BOOT_BEGIN) {
            f92063h = C35858a.COLD_BOOT_END;
            C35861c cVar = f92062g;
            if (cVar == null) {
                C52711k.m112237a("mainHandler");
            }
            cVar.mo74517a(1201, 1000);
            C35861c cVar2 = f92062g;
            if (cVar2 == null) {
                C52711k.m112237a("mainHandler");
            }
            cVar2.mo74517a(1203, 1000);
            C35861c cVar3 = f92062g;
            if (cVar3 == null) {
                C52711k.m112237a("mainHandler");
            }
            cVar3.mo74517a(1204, f92066k);
        }
        if (f92063h == C35858a.HOT_BOOT_BEGIN) {
            f92063h = C35858a.HOT_BOOT_END;
            C35861c cVar4 = f92062g;
            if (cVar4 == null) {
                C52711k.m112237a("mainHandler");
            }
            cVar4.mo74517a(1203, 1000);
            C35861c cVar5 = f92062g;
            if (cVar5 == null) {
                C52711k.m112237a("mainHandler");
            }
            cVar5.mo74517a(1204, f92066k);
        }
    }

    /* renamed from: a */
    public static void m80998a(long j) {
        f92066k = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C35861c m81000b(C35857a aVar) {
        C35861c cVar = f92062g;
        if (cVar == null) {
            C52711k.m112237a("mainHandler");
        }
        return cVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ C35896f m81006d(C35857a aVar) {
        C35896f fVar = f92056a;
        if (fVar == null) {
            C52711k.m112237a("currentProcess");
        }
        return fVar;
    }

    /* renamed from: a */
    public static <T> T m80997a(Class<? extends LegoService> cls) {
        C52711k.m112240b(cls, LeakCanaryFileProvider.f132049i);
        C35887c cVar = f92059d;
        C52711k.m112240b(cls, LeakCanaryFileProvider.f132049i);
        T t = (LegoService) cVar.f92104a.get(cls);
        if (t == null) {
            t = cVar.mo74554a(cls);
        }
        return (Object) t;
    }

    /* renamed from: b */
    public static <T> T m81002b(Class<? extends LegoInflate> cls) {
        C52711k.m112240b(cls, LeakCanaryFileProvider.f132049i);
        return f92060e.mo74539a(cls);
    }

    /* renamed from: a */
    public static void m80999a(LegoTask legoTask) {
        C52711k.m112240b(legoTask, "task");
        f92057b.mo74563a(legoTask);
    }

    /* renamed from: a */
    public final C35857a mo74511a(Class<? extends LegoInflate> cls, LegoInflate legoInflate) {
        C52711k.m112240b(cls, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(legoInflate, "inflate");
        f92060e.mo74540a(cls, legoInflate);
        return this;
    }

    /* renamed from: a */
    public final C35857a mo74512a(Class<? extends LegoService> cls, LegoService legoService) {
        C52711k.m112240b(cls, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(legoService, "service");
        f92059d.mo74557a(cls, legoService);
        return this;
    }
}
