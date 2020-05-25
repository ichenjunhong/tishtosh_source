package com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileParam;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileResult;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.d */
public final class C34424d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88818a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34424d.class), "taskQueue", "getTaskQueue()Ljava/util/List;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34424d.class), "handler", "getHandler()Lcom/ss/android/ugc/aweme/im/sdk/media/utils/VideoCompileHelper$handler$2$1;"))};

    /* renamed from: b */
    public static final C34424d f88819b = new C34424d();

    /* renamed from: c */
    private static C34412a f88820c;

    /* renamed from: d */
    private static final C52668f f88821d = C52732g.m112285a(C34429d.f88826a);

    /* renamed from: e */
    private static final C52668f f88822e = C52732g.m112285a(C34427c.f88825a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.d$a */
    static final class C34425a extends C52712l implements C52671b<CompileResult, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34412a f88823a;

        C34425a(C34412a aVar) {
            this.f88823a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CompileResult compileResult = (CompileResult) obj;
            C52711k.m112240b(compileResult, "it");
            StringBuilder sb = new StringBuilder("VideoCompileHelper compileVideoInternal success: ");
            sb.append(compileResult);
            C32458a.m75144a(sb.toString());
            C34424d.f88819b.mo72452a();
            this.f88823a.f88803b.invoke(compileResult);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.d$b */
    static final class C34426b extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34412a f88824a;

        C34426b(C34412a aVar) {
            this.f88824a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112240b(th, "it");
            C32458a.m75148a(th);
            C34424d.f88819b.mo72452a();
            this.f88824a.f88803b.invoke(null);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.d$c */
    static final class C34427c extends C52712l implements C52670a<C344281> {

        /* renamed from: a */
        public static final C34427c f88825a = new C34427c();

        C34427c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Handler(Looper.getMainLooper()) {
                /* JADX WARNING: Removed duplicated region for block: B:16:0x0026  */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void handleMessage(android.os.Message r5) {
                    /*
                        r4 = this;
                        r0 = 0
                        if (r5 == 0) goto L_0x0006
                        java.lang.Object r5 = r5.obj
                        goto L_0x0007
                    L_0x0006:
                        r5 = r0
                    L_0x0007:
                        boolean r1 = r5 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34412a
                        if (r1 != 0) goto L_0x000c
                        r5 = r0
                    L_0x000c:
                        com.ss.android.ugc.aweme.im.sdk.media.c.a r5 = (com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34412a) r5
                        if (r5 == 0) goto L_0x005c
                        com.ss.android.ugc.aweme.services.IExternalService r1 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
                        com.ss.android.ugc.aweme.services.IExternalService r1 = (com.p683ss.android.ugc.aweme.services.IExternalService) r1
                        if (r1 == 0) goto L_0x0023
                        com.ss.android.ugc.aweme.services.external.ability.IAbilityService r1 = r1.abilityService()
                        if (r1 == 0) goto L_0x0023
                        com.ss.android.ugc.aweme.services.external.ability.IAVProcessService r1 = r1.processService()
                        goto L_0x0024
                    L_0x0023:
                        r1 = r0
                    L_0x0024:
                        if (r1 != 0) goto L_0x0030
                        java.lang.String r2 = "VideoCompileHelper compileVideoInternal service null"
                        com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r2)
                        d.f.a.b<com.ss.android.ugc.aweme.services.external.ability.IAVProcessService$CompileResult, d.x> r2 = r5.f88803b
                        r2.invoke(r0)
                    L_0x0030:
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r2 = "VideoCompileHelper compileVideoInternal start: "
                        r0.<init>(r2)
                        com.ss.android.ugc.aweme.services.external.ability.IAVProcessService$CompileParam r2 = r5.f88802a
                        r0.append(r2)
                        java.lang.String r0 = r0.toString()
                        com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r0)
                        if (r1 != 0) goto L_0x0048
                        p2628d.p2639f.p2641b.C52711k.m112234a()
                    L_0x0048:
                        com.ss.android.ugc.aweme.services.external.ability.IAVProcessService$CompileParam r0 = r5.f88802a
                        com.ss.android.ugc.aweme.im.sdk.media.c.d$a r2 = new com.ss.android.ugc.aweme.im.sdk.media.c.d$a
                        r2.<init>(r5)
                        d.f.a.b r2 = (p2628d.p2639f.p2640a.C52671b) r2
                        com.ss.android.ugc.aweme.im.sdk.media.c.d$b r3 = new com.ss.android.ugc.aweme.im.sdk.media.c.d$b
                        r3.<init>(r5)
                        d.f.a.b r3 = (p2628d.p2639f.p2640a.C52671b) r3
                        r1.compileVideo(r0, r2, r3)
                        return
                    L_0x005c:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34424d.C34427c.C344281.handleMessage(android.os.Message):void");
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.d$d */
    static final class C34429d extends C52712l implements C52670a<List<C34412a>> {

        /* renamed from: a */
        public static final C34429d f88826a = new C34429d();

        C34429d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    private C34424d() {
    }

    /* renamed from: b */
    private final List<C34412a> m78369b() {
        return (List) f88821d.getValue();
    }

    /* renamed from: c */
    private final C344281 m78370c() {
        return (C344281) f88822e.getValue();
    }

    /* renamed from: a */
    public final void mo72452a() {
        synchronized (this) {
            f88820c = null;
            if (!f88819b.m78369b().isEmpty()) {
                f88820c = (C34412a) f88819b.m78369b().remove(0);
                C344281 c = f88819b.m78370c();
                Message obtain = Message.obtain();
                obtain.obj = f88820c;
                c.sendMessage(obtain);
            }
        }
    }

    /* renamed from: a */
    public static final void m78368a(CompileParam compileParam, C52671b<? super CompileResult, C52860x> bVar) {
        C52711k.m112240b(compileParam, "compileParam");
        C52711k.m112240b(bVar, "callback");
        synchronized (f88819b) {
            f88819b.m78369b().add(new C34412a(compileParam, bVar));
            if (f88820c == null) {
                f88819b.mo72452a();
            }
        }
    }
}
