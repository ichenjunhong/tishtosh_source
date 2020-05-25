package com.p683ss.android.ugc.aweme.p1435bh;

import android.os.SystemClock;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.p1435bh.C23799c.C23800a;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.PublishServiceFactoryImpl;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoPublishService.Factory;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44366c;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44366c.C44367a;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44377g;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44386j;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44388l;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44388l.C44389a;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44388l.C44390b;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44388l.C44391c;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44398o;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.bh.f */
public final class C23811f implements Runnable {

    /* renamed from: a */
    public final C23812a f63436a;

    /* renamed from: b */
    public final C23825h f63437b;

    /* renamed from: c */
    C23798b f63438c;

    /* renamed from: d */
    public final List<C44377g> f63439d = new ArrayList();

    /* renamed from: e */
    final C23551l f63440e = C23551l.f62672a;

    /* renamed from: f */
    public final C23823g f63441f;

    /* renamed from: g */
    public final Executor f63442g;

    /* renamed from: h */
    private final C23799c f63443h;

    /* renamed from: com.ss.android.ugc.aweme.bh.f$a */
    public static final class C23812a {

        /* renamed from: a */
        public final String f63444a;

        /* renamed from: b */
        public volatile C44388l f63445b = C44390b.f112325a;

        /* renamed from: c */
        public long f63446c = -1;

        /* renamed from: d */
        public long f63447d = -1;

        /* renamed from: e */
        public C23811f f63448e;

        /* renamed from: f */
        public volatile C44386j f63449f;

        /* renamed from: a */
        public final void mo49397a(C44388l lVar) {
            C52711k.m112240b(lVar, "value");
            this.f63445b = lVar;
            if ((lVar instanceof C44391c) && this.f63446c == -1) {
                this.f63446c = SystemClock.uptimeMillis();
            }
            C23811f fVar = this.f63448e;
            if (fVar != null) {
                C23825h hVar = fVar.f63437b;
                if (hVar != null) {
                    StringBuilder sb = new StringBuilder("change state to:");
                    sb.append(this.f63445b);
                    hVar.mo49411b(sb.toString());
                }
            }
        }

        /* renamed from: a */
        public final void mo49396a(C44366c cVar, Object obj) {
            C52711k.m112240b(cVar, "result");
            mo49397a(new C44389a(cVar, obj));
            this.f63447d = SystemClock.uptimeMillis();
            this.f63448e = null;
        }

        public C23812a(C44386j jVar, C23811f fVar) {
            C52711k.m112240b(jVar, "publishModel");
            this.f63449f = jVar;
            String uuid = UUID.randomUUID().toString();
            C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
            this.f63444a = uuid;
            this.f63448e = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bh.f$b */
    static final class C23813b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44377g f63450a;

        /* renamed from: b */
        final /* synthetic */ C44388l f63451b;

        C23813b(C44377g gVar, C44388l lVar) {
            this.f63450a = gVar;
            this.f63451b = lVar;
        }

        public final void run() {
            this.f63450a.mo49383a(((C44391c) this.f63451b).f112326a, ((C44391c) this.f63451b).f112327b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bh.f$c */
    static final class C23814c extends C52712l implements C52671b<C44377g, C52860x> {

        /* renamed from: a */
        public static final C23814c f63452a = new C23814c();

        C23814c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C44377g gVar = (C44377g) obj;
            C52711k.m112240b(gVar, "$receiver");
            gVar.mo49384a((C44366c) C44367a.f112278a, (Object) null);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bh.f$d */
    static final class C23815d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f63453a;

        /* renamed from: b */
        final /* synthetic */ C52671b f63454b;

        C23815d(List list, C52671b bVar) {
            this.f63453a = list;
            this.f63454b = bVar;
        }

        public final void run() {
            for (C44377g invoke : this.f63453a) {
                this.f63454b.invoke(invoke);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bh.f$e */
    static final class C23816e extends C52712l implements C52671b<C44377g, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44334o f63455a;

        C23816e(C44334o oVar) {
            this.f63455a = oVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            C44377g gVar = (C44377g) obj;
            C52711k.m112240b(gVar, "it");
            if (!(gVar instanceof C23802d) || !C52711k.m112239a((Object) ((C23802d) gVar).f63417a, (Object) this.f63455a)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bh.f$f */
    public static final class C23817f extends C44377g {

        /* renamed from: a */
        final /* synthetic */ C23811f f63456a;

        /* renamed from: com.ss.android.ugc.aweme.bh.f$f$a */
        static final class C23818a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C23817f f63457a;

            /* renamed from: b */
            final /* synthetic */ C44366c f63458b;

            /* renamed from: c */
            final /* synthetic */ Object f63459c;

            C23818a(C23817f fVar, C44366c cVar, Object obj) {
                this.f63457a = fVar;
                this.f63458b = cVar;
                this.f63459c = obj;
            }

            public final void run() {
                if (this.f63457a.mo49400a(this.f63457a.f63456a.f63436a.f63445b, "finish not running")) {
                    this.f63457a.f63456a.f63436a.mo49396a(this.f63458b, this.f63459c);
                    this.f63457a.f63456a.f63441f.mo49405a();
                    this.f63457a.f63456a.mo49394a(new C52671b<C44377g, C52860x>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C23818a f63460a;

                        {
                            this.f63460a = r1;
                        }

                        public final /* synthetic */ Object invoke(Object obj) {
                            C44377g gVar = (C44377g) obj;
                            C52711k.m112240b(gVar, "$receiver");
                            gVar.mo49384a(this.f63460a.f63458b, this.f63460a.f63459c);
                            return C52860x.f131107a;
                        }
                    });
                    this.f63457a.f63456a.f63439d.clear();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.bh.f$f$b */
        static final class C23820b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C23817f f63461a;

            /* renamed from: b */
            final /* synthetic */ int f63462b;

            /* renamed from: c */
            final /* synthetic */ Object f63463c;

            C23820b(C23817f fVar, int i, Object obj) {
                this.f63461a = fVar;
                this.f63462b = i;
                this.f63463c = obj;
            }

            public final void run() {
                if (this.f63461a.mo49400a(this.f63461a.f63456a.f63436a.f63445b, "progress not running")) {
                    this.f63461a.f63456a.f63436a.mo49397a(new C44391c(this.f63462b, this.f63463c));
                    this.f63461a.f63456a.mo49394a(new C52671b<C44377g, C52860x>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C23820b f63464a;

                        {
                            this.f63464a = r1;
                        }

                        public final /* synthetic */ Object invoke(Object obj) {
                            C44377g gVar = (C44377g) obj;
                            C52711k.m112240b(gVar, "$receiver");
                            gVar.mo49383a(this.f63464a.f63462b, this.f63464a.f63463c);
                            return C52860x.f131107a;
                        }
                    });
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.bh.f$f$c */
        static final class C23822c extends C52712l implements C52671b<C44377g, C52860x> {

            /* renamed from: a */
            final /* synthetic */ String f63465a;

            /* renamed from: b */
            final /* synthetic */ C44398o f63466b;

            /* renamed from: c */
            final /* synthetic */ Object f63467c;

            C23822c(String str, C44398o oVar, Object obj) {
                this.f63465a = str;
                this.f63466b = oVar;
                this.f63467c = obj;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                C44377g gVar = (C44377g) obj;
                C52711k.m112240b(gVar, "$receiver");
                gVar.mo49385a(this.f63465a, this.f63466b, this.f63467c);
                return C52860x.f131107a;
            }
        }

        C23817f(C23811f fVar) {
            this.f63456a = fVar;
        }

        /* renamed from: a */
        public final void mo49383a(int i, Object obj) {
            this.f63456a.f63442g.execute(new C23820b(this, i, obj));
        }

        /* renamed from: a */
        public final void mo49384a(C44366c cVar, Object obj) {
            C52711k.m112240b(cVar, "result");
            this.f63456a.f63442g.execute(new C23818a(this, cVar, obj));
        }

        /* renamed from: a */
        public final boolean mo49400a(C44388l lVar, String str) {
            if (lVar instanceof C44391c) {
                return true;
            }
            this.f63456a.mo49393a(lVar, str);
            return false;
        }

        /* renamed from: a */
        public final void mo49385a(String str, C44398o oVar, Object obj) {
            C52711k.m112240b(str, "stage");
            C52711k.m112240b(oVar, "state");
            this.f63456a.mo49394a(new C23822c(str, oVar, obj));
        }
    }

    public final void run() {
        if (!C52711k.m112239a((Object) this.f63436a.f63445b, (Object) C44390b.f112325a)) {
            mo49393a(this.f63436a.f63445b, "start not new");
            return;
        }
        this.f63436a.mo49397a(new C44391c(0, null));
        C23812a aVar = this.f63436a;
        String str = this.f63436a.f63444a;
        C52711k.m112240b(aVar, "record");
        C52711k.m112240b(str, "publishId");
        Factory createShortVideoPublishService$FactorybyMonsterPlugin = PublishServiceFactoryImpl.createShortVideoPublishService$FactorybyMonsterPlugin();
        this.f63438c = new C23800a(aVar, createShortVideoPublishService$FactorybyMonsterPlugin, createShortVideoPublishService$FactorybyMonsterPlugin.buildFutureFactory(aVar.f63449f), str);
        if (this.f63438c == null) {
            this.f63437b.mo49411b("publisher create failed, do not publish");
            return;
        }
        C23798b bVar = this.f63438c;
        if (bVar != null) {
            bVar.mo49377a(new C23817f(this));
        }
    }

    /* renamed from: a */
    public final void mo49394a(C52671b<? super C44377g, C52860x> bVar) {
        if (!this.f63439d.isEmpty()) {
            List arrayList = new ArrayList();
            arrayList.addAll(this.f63439d);
            this.f63440e.execute(new C23815d(arrayList, bVar));
        }
    }

    /* renamed from: a */
    public final void mo49393a(C44388l lVar, String str) {
        if (!(lVar instanceof C44389a) || !C52711k.m112239a((Object) ((C44389a) lVar).f112323a, (Object) C44367a.f112278a)) {
            C23825h hVar = this.f63437b;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", require cancel, but state:");
            sb.append(lVar);
            hVar.mo49410a(sb.toString());
        }
    }

    public C23811f(String str, C44386j jVar, C23799c cVar, C23823g gVar, Executor executor) {
        C52711k.m112240b(str, "tagPrefix");
        C52711k.m112240b(jVar, "publishModel");
        C52711k.m112240b(cVar, "publisherFactory");
        C52711k.m112240b(gVar, "records");
        C52711k.m112240b(executor, "executor");
        this.f63443h = cVar;
        this.f63441f = gVar;
        this.f63442g = executor;
        this.f63436a = new C23812a(jVar, this);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-PublishTask-");
        sb.append(this.f63436a.f63444a);
        this.f63437b = new C23825h(sb.toString());
    }
}
