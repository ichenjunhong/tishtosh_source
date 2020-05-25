package com.p683ss.android.ugc.aweme;

import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ttve.nativePort.C20129b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39552aj;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.services.IPreloadVESo;
import com.p683ss.android.ugc.aweme.services.PreloadVESoStatus;
import dmt.p2652av.video.p2654b.C52938f;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.bq */
public final class C23951bq implements IPreloadVESo {

    /* renamed from: b */
    public static final C52668f f63614b = C52732g.m112285a(C23953b.f63622a);

    /* renamed from: c */
    public static final C23952a f63615c = new C23952a(null);

    /* renamed from: a */
    public volatile PreloadVESoStatus f63616a = PreloadVESoStatus.UNLOAD;

    /* renamed from: d */
    private volatile long f63617d = -1;

    /* renamed from: e */
    private final C17429o f63618e = C17429o.m42673a();

    /* renamed from: f */
    private final C39552aj f63619f = C39618d.f101147K;

    /* renamed from: g */
    private boolean f63620g;

    /* renamed from: com.ss.android.ugc.aweme.bq$a */
    public static final class C23952a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f63621a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23952a.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/PreloadVESoImpl;"))};

        private C23952a() {
        }

        /* renamed from: a */
        public static C23951bq m58759a() {
            return (C23951bq) C23951bq.f63614b.getValue();
        }

        public /* synthetic */ C23952a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bq$b */
    static final class C23953b extends C52712l implements C52670a<C23951bq> {

        /* renamed from: a */
        public static final C23953b f63622a = new C23953b();

        C23953b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23951bq();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bq$c */
    static final class C23954c extends C52712l implements C52682m<Boolean, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C23951bq f63623a;

        C23954c(C23951bq bqVar) {
            this.f63623a = bqVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).longValue();
            if (booleanValue) {
                C23951bq.m58757a();
            } else {
                this.f63623a.f63616a = PreloadVESoStatus.DECOMPRESS_ERROR;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: b */
    public static final C23951bq m58758b() {
        return C23952a.m58759a();
    }

    public final long getPreLoadVESoCostTime() {
        return this.f63617d;
    }

    public final PreloadVESoStatus getPreLoadVESoStatus() {
        return this.f63616a;
    }

    /* renamed from: a */
    public static void m58757a() {
        C20129b.m49684a(true);
        C52938f.f131308b.mo110536b();
        C20129b.m49686c();
        C39629l.m88232a().mo58571b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000b, code lost:
        r3.f63618e.mo33755c();
        r3.f63616a = com.p683ss.android.ugc.aweme.services.PreloadVESoStatus.LOADING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a().mo58583n().mo83103a(com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OpenCameraFrameOptimizePreLoadSo) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r3.f63619f.mo74199a() == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r3.f63616a = com.p683ss.android.ugc.aweme.services.PreloadVESoStatus.DECOMPRESSING;
        r3.f63619f.mo74198a(false, new com.p683ss.android.ugc.aweme.C23951bq.C23954c(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        m58757a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r3.f63616a = com.p683ss.android.ugc.aweme.services.PreloadVESoStatus.LOADED;
        r3.f63618e.mo33756d();
        r3.f63617d = r3.f63618e.mo33754a(java.util.concurrent.TimeUnit.MILLISECONDS);
        r3.f63618e.mo33757e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void preLoadVESo() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f63620g     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            r0 = 1
            r3.f63620g = r0     // Catch:{ all -> 0x005c }
            monitor-exit(r3)
            com.google.b.a.o r0 = r3.f63618e
            r0.mo33755c()
            com.ss.android.ugc.aweme.services.PreloadVESoStatus r0 = com.p683ss.android.ugc.aweme.services.PreloadVESoStatus.LOADING
            r3.f63616a = r0
            com.ss.android.ugc.aweme.port.in.u r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.property.h r0 = r0.mo58583n()
            com.ss.android.ugc.aweme.property.h$a r1 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OpenCameraFrameOptimizePreLoadSo
            com.ss.android.ugc.aweme.property.aa$a r1 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r1
            boolean r0 = r0.mo83103a(r1)
            if (r0 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.port.in.aj r0 = r3.f63619f
            boolean r0 = r0.mo74199a()
            if (r0 == 0) goto L_0x0040
            com.ss.android.ugc.aweme.services.PreloadVESoStatus r0 = com.p683ss.android.ugc.aweme.services.PreloadVESoStatus.DECOMPRESSING
            r3.f63616a = r0
            com.ss.android.ugc.aweme.port.in.aj r0 = r3.f63619f
            r1 = 0
            com.ss.android.ugc.aweme.bq$c r2 = new com.ss.android.ugc.aweme.bq$c
            r2.<init>(r3)
            d.f.a.m r2 = (p2628d.p2639f.p2640a.C52682m) r2
            r0.mo74198a(r1, r2)
            goto L_0x0043
        L_0x0040:
            m58757a()
        L_0x0043:
            com.ss.android.ugc.aweme.services.PreloadVESoStatus r0 = com.p683ss.android.ugc.aweme.services.PreloadVESoStatus.LOADED
            r3.f63616a = r0
            com.google.b.a.o r0 = r3.f63618e
            r0.mo33756d()
            com.google.b.a.o r0 = r3.f63618e
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r0.mo33754a(r1)
            r3.f63617d = r0
            com.google.b.a.o r0 = r3.f63618e
            r0.mo33757e()
            return
        L_0x005c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.C23951bq.preLoadVESo():void");
    }
}
