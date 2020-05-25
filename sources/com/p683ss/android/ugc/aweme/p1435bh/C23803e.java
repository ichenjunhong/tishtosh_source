package com.p683ss.android.ugc.aweme.p1435bh;

import android.os.Bundle;
import android.os.Looper;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1435bh.C23811f.C23812a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.aweme.settings.EnableMainThreadPublishScheduler;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44366c;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44366c.C44367a;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44366c.C44368b;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44366c.C44369c;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44377g;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44386j;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44388l;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44388l.C44389a;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44388l.C44390b;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44388l.C44391c;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bh.e */
public final class C23803e {

    /* renamed from: a */
    public static final C23823g f63419a = new C23823g(1, 1);

    /* renamed from: b */
    public static final Executor f63420b;

    /* renamed from: c */
    public static final C23803e f63421c = new C23803e();

    /* renamed from: d */
    private static final C23799c f63422d = new C23799c();

    /* renamed from: com.ss.android.ugc.aweme.bh.e$a */
    static final class C23804a implements Executor {

        /* renamed from: a */
        public static final C23804a f63423a = new C23804a();

        C23804a() {
        }

        public final void execute(final Runnable runnable) {
            if (C52711k.m112239a((Object) Looper.getMainLooper(), (Object) Looper.myLooper())) {
                runnable.run();
                return;
            }
            C23803e.m58430a("ShouldCallPublishSchedulerInMainThread");
            C23551l.f62672a.execute(new Runnable() {
                public final void run() {
                    runnable.run();
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bh.e$b */
    static final class C23806b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f63425a;

        /* renamed from: b */
        final /* synthetic */ C44377g f63426b;

        /* renamed from: com.ss.android.ugc.aweme.bh.e$b$a */
        static final class C23807a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C23812a f63427a;

            /* renamed from: b */
            final /* synthetic */ C44388l f63428b;

            /* renamed from: c */
            final /* synthetic */ C23806b f63429c;

            C23807a(C23812a aVar, C44388l lVar, C23806b bVar) {
                this.f63427a = aVar;
                this.f63428b = lVar;
                this.f63429c = bVar;
            }

            public final void run() {
                this.f63429c.f63426b.mo49384a(((C44389a) this.f63428b).f112323a, ((C44389a) this.f63428b).f112324b);
                StringBuilder sb = new StringBuilder("PublishScheduler | addCallback direct finish ");
                sb.append(this.f63427a.f63444a);
                C45407ay.m98973d(sb.toString());
            }
        }

        C23806b(String str, C44377g gVar) {
            this.f63425a = str;
            this.f63426b = gVar;
        }

        public final void run() {
            C23812a a = C23803e.f63419a.mo49403a(this.f63425a);
            if (a != null) {
                C44388l lVar = a.f63445b;
                if (lVar instanceof C44389a) {
                    C23551l.f62672a.execute(new C23807a(a, lVar, this));
                } else {
                    C23811f fVar = a.f63448e;
                    if (fVar != null) {
                        C44377g gVar = this.f63426b;
                        C52711k.m112240b(gVar, "callback");
                        fVar.f63439d.add(gVar);
                        C44388l lVar2 = fVar.f63436a.f63445b;
                        if ((lVar2 instanceof C44391c) && ((C44391c) lVar2).f112326a > 0) {
                            fVar.f63440e.execute(new C23813b(gVar, lVar2));
                        }
                        StringBuilder sb = new StringBuilder("PublishScheduler | addCallback success ");
                        sb.append(a.f63444a);
                        C45407ay.m98973d(sb.toString());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bh.e$c */
    public static final class C23808c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f63430a;

        public C23808c(String str) {
            this.f63430a = str;
        }

        public final void run() {
            boolean z;
            Iterable b = C23803e.f63419a.mo49407b(this.f63430a);
            Collection arrayList = new ArrayList();
            for (Object next : b) {
                if (!(((C23812a) next).f63445b instanceof C44389a)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            for (C23812a aVar : (List) arrayList) {
                C23811f fVar = aVar.f63448e;
                if (fVar != null) {
                    if (fVar.f63436a.f63445b instanceof C44389a) {
                        fVar.f63437b.mo49411b("finish need not cancel");
                    } else {
                        C26890h.m65011a("publish_service_cancel", C23089d.m56640a().mo47829a("invoke_type", "realStopPublish").f61491a);
                        C23798b bVar = fVar.f63438c;
                        if (bVar != null) {
                            bVar.mo49378b();
                        }
                        fVar.f63436a.mo49396a(C44367a.f112278a, null);
                        fVar.mo49394a(C23814c.f63452a);
                        fVar.f63441f.mo49408c(fVar.f63436a.f63444a);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bh.e$d */
    public static final class C23809d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f63431a;

        /* renamed from: b */
        final /* synthetic */ C44334o f63432b;

        public C23809d(String str, C44334o oVar) {
            this.f63431a = str;
            this.f63432b = oVar;
        }

        public final void run() {
            for (C23812a aVar : C23803e.f63419a.mo49407b(this.f63431a)) {
                C23811f fVar = aVar.f63448e;
                if (fVar != null) {
                    C44334o oVar = this.f63432b;
                    C52711k.m112240b(oVar, "callback");
                    List<C44377g> list = fVar.f63439d;
                    C52671b eVar = new C23816e(oVar);
                    ListIterator listIterator = list.listIterator();
                    while (listIterator.hasNext()) {
                        if (((Boolean) eVar.invoke(listIterator.next())).booleanValue()) {
                            listIterator.remove();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bh.e$e */
    static final class C23810e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23812a f63433a;

        /* renamed from: b */
        final /* synthetic */ String f63434b;

        /* renamed from: c */
        final /* synthetic */ C44386j f63435c;

        C23810e(C23812a aVar, String str, C44386j jVar) {
            this.f63433a = aVar;
            this.f63434b = str;
            this.f63435c = jVar;
        }

        public final void run() {
            C23812a aVar = this.f63433a;
            C44386j jVar = this.f63435c;
            C52711k.m112240b(jVar, "<set-?>");
            aVar.f63449f = jVar;
            C44388l lVar = this.f63433a.f63445b;
            if (lVar instanceof C44390b) {
                StringBuilder sb = new StringBuilder("ReStartNewPublish ");
                sb.append(this.f63434b);
                C23803e.m58430a(sb.toString());
            } else if (lVar instanceof C44389a) {
                C44366c cVar = ((C44389a) lVar).f112323a;
                if (cVar instanceof C44369c) {
                    StringBuilder sb2 = new StringBuilder("ReStartAlreadySuccessPublish ");
                    sb2.append(this.f63434b);
                    C23803e.m58430a(sb2.toString());
                } else if (cVar instanceof C44367a) {
                    String a = C23803e.m58427a(this.f63435c);
                    StringBuilder sb3 = new StringBuilder("PublishScheduler | reStart Cancel Publish, reStart new. old:");
                    sb3.append(this.f63434b);
                    sb3.append(" new:");
                    sb3.append(a);
                    C45407ay.m98968a(sb3.toString());
                } else {
                    if (cVar instanceof C44368b) {
                        String a2 = C23803e.m58427a(this.f63435c);
                        StringBuilder sb4 = new StringBuilder("PublishScheduler | reStart Failed Publish, reStart new. old:");
                        sb4.append(this.f63434b);
                        sb4.append(" new:");
                        sb4.append(a2);
                        C45407ay.m98968a(sb4.toString());
                    }
                }
            } else {
                if (lVar instanceof C44391c) {
                    C23811f fVar = this.f63433a.f63448e;
                    if (fVar != null) {
                        C23798b bVar = fVar.f63438c;
                        if (bVar != null) {
                            bVar.mo49376a();
                        }
                    }
                }
            }
        }
    }

    private C23803e() {
    }

    static {
        Executor executor;
        if (C10193n.m20607a().mo18204a(EnableMainThreadPublishScheduler.class, "enable_main_thread_publish_scheduler", C10181b.m20511a().mo18175c().getEnableMainThreadPublishScheduler(), false)) {
            C45407ay.m98968a("PublishScheduler | EnableMainThreadPublishScheduler");
            executor = C23804a.f63423a;
        } else {
            executor = C24076h.m58898a(C24085m.m58928a(C24093p.SERIAL).mo49845a("PublishScheduler").mo49847a());
        }
        f63420b = executor;
    }

    /* renamed from: a */
    public static String m58427a(C44386j jVar) {
        C23799c cVar = f63422d;
        C23823g gVar = f63419a;
        Executor executor = f63420b;
        C52711k.m112236a((Object) executor, "EXECUTOR");
        C23811f fVar = new C23811f("PublishScheduler", jVar, cVar, gVar, executor);
        if (!f63419a.mo49406a(fVar.f63436a)) {
            return null;
        }
        f63420b.execute(fVar);
        String str = fVar.f63436a.f63444a;
        StringBuilder sb = new StringBuilder("PublishScheduler | startNewPublish creationId:");
        sb.append(jVar.f112313b);
        sb.append(" publishId:");
        sb.append(str);
        C45407ay.m98968a(sb.toString());
        return str;
    }

    /* renamed from: a */
    public static void m58430a(String str) {
        StringBuilder sb = new StringBuilder("PublishScheduler | ");
        sb.append(str);
        C45407ay.m98971b(sb.toString());
        StringBuilder sb2 = new StringBuilder("PublishScheduler|");
        sb2.append(str);
        C9220a.m18310a(sb2.toString());
    }

    /* renamed from: a */
    public static final String m58426a(Bundle bundle, String str) {
        C52711k.m112240b(bundle, "bundle");
        return f63421c.m58428a(C23795a.m58413a(bundle), str);
    }

    /* renamed from: a */
    public static final void m58429a(C44377g gVar, String str) {
        C52711k.m112240b(gVar, "callback");
        StringBuilder sb = new StringBuilder("PublishScheduler | addCallback call ");
        sb.append(str);
        C45407ay.m98973d(sb.toString());
        f63420b.execute(new C23806b(str, gVar));
    }

    /* renamed from: a */
    private final synchronized String m58428a(C44386j jVar, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("PublishScheduler | startPublish creationId:");
        sb.append(jVar.f112313b);
        sb.append(" publishId:");
        sb.append(str);
        C45407ay.m98968a(sb.toString());
        C23823g gVar = f63419a;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        C23812a a = gVar.mo49404a(str2, jVar.f112313b);
        if (a != null) {
            C44388l lVar = a.f63445b;
            if (lVar instanceof C44390b) {
                StringBuilder sb2 = new StringBuilder("ReStartNewPublish ");
                sb2.append(str);
                m58430a(sb2.toString());
            } else if (lVar instanceof C44389a) {
                C44366c cVar = ((C44389a) lVar).f112323a;
                if (cVar instanceof C44369c) {
                    StringBuilder sb3 = new StringBuilder("ReStartSuccessPublish ");
                    sb3.append(str);
                    m58430a(sb3.toString());
                } else if ((cVar instanceof C44367a) || (cVar instanceof C44368b)) {
                    return m58427a(jVar);
                }
            } else if (lVar instanceof C44391c) {
                if (str == null) {
                    m58430a("ReStartRunningPublishWhenPublishIdIsNull");
                }
                f63420b.execute(new C23810e(a, str, jVar));
            }
            return a.f63444a;
        }
        return m58427a(jVar);
    }
}
