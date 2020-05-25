package com.bytedance.jedi.p725a.p743m;

import android.os.Environment;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.jedi.p725a.p742l.C11729a;
import com.bytedance.jedi.p725a.p742l.C11730b;
import com.bytedance.jedi.p725a.p743m.C11747e.C11749a;
import com.p1081h.p1082a.C18112a;
import com.p1081h.p1082a.C18113b;
import com.p1081h.p1082a.C18116e;
import java.io.File;
import java.util.concurrent.Executor;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.jedi.a.m.k */
public final class C11769k implements C11744c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f31255a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11769k.class), "defaultFormatStrategy", "getDefaultFormatStrategy()Lcom/bytedance/jedi/model/util/JediFormatStrategy;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11769k.class), "utFormatStrategy", "getUtFormatStrategy()Lcom/orhanobut/logger/FormatStrategy;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11769k.class), "executor", "getExecutor()Ljava/util/concurrent/Executor;"))};

    /* renamed from: b */
    static boolean f31256b = false;

    /* renamed from: c */
    static boolean f31257c = false;

    /* renamed from: d */
    static String f31258d = "REPO_SYNC";

    /* renamed from: e */
    static final int f31259e = f31259e;

    /* renamed from: f */
    static final C52668f f31260f = C52732g.m112285a(C11771b.f31265a);

    /* renamed from: g */
    static final C52668f f31261g = C52732g.m112285a(C11774e.f31272a);

    /* renamed from: h */
    public static final C11769k f31262h = new C11769k();

    /* renamed from: i */
    private static C18113b f31263i = new C11770a();

    /* renamed from: j */
    private static final C52668f f31264j = C52732g.m112285a(C11772c.f31266a);

    /* renamed from: com.bytedance.jedi.a.m.k$a */
    public static final class C11770a implements C18113b {
        C11770a() {
        }

        /* renamed from: a */
        public final boolean mo22518a(int i, String str) {
            return C11750f.f31208a;
        }

        /* renamed from: a */
        public final void mo22517a(int i, String str, String str2) {
            C18112a aVar;
            C52711k.m112240b(str2, "message");
            if (C11769k.f31256b) {
                C11769k kVar = C11769k.f31262h;
                aVar = (C18112a) C11769k.f31261g.getValue();
            } else {
                C11769k kVar2 = C11769k.f31262h;
                C11747e eVar = (C11747e) C11769k.f31260f.getValue();
                C52711k.m112236a((Object) eVar, "defaultFormatStrategy");
                aVar = eVar;
            }
            aVar.mo22499a(i, str, str2);
        }
    }

    /* renamed from: com.bytedance.jedi.a.m.k$b */
    static final class C11771b extends C52712l implements C52670a<C11747e> {

        /* renamed from: a */
        public static final C11771b f31265a = new C11771b();

        C11771b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C11749a a = C11747e.m24070a().mo22500a(C11769k.f31258d);
            if (C11769k.f31257c) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                C52711k.m112236a((Object) externalStorageDirectory, "Environment.getExternalStorageDirectory()");
                String absolutePath = externalStorageDirectory.getAbsolutePath();
                StringBuilder sb = new StringBuilder();
                sb.append(absolutePath);
                sb.append(File.separatorChar);
                sb.append("logger");
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder("AndroidFileLogger.");
                sb3.append(sb2);
                HandlerThread handlerThread = new HandlerThread(sb3.toString());
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                C11769k kVar = C11769k.f31262h;
                a.f31206a = new C11745d(new C11746a(looper, sb2, C11769k.f31259e));
            }
            return a.mo22501a();
        }
    }

    /* renamed from: com.bytedance.jedi.a.m.k$c */
    static final class C11772c extends C52712l implements C52670a<C11765j> {

        /* renamed from: a */
        public static final C11772c f31266a = new C11772c();

        C11772c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C11765j();
        }
    }

    /* renamed from: com.bytedance.jedi.a.m.k$d */
    static final class C11773d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11730b f31267a;

        /* renamed from: b */
        final /* synthetic */ long f31268b;

        /* renamed from: c */
        final /* synthetic */ long f31269c;

        /* renamed from: d */
        final /* synthetic */ C52847n f31270d;

        /* renamed from: e */
        final /* synthetic */ C11729a f31271e;

        C11773d(C11730b bVar, long j, long j2, C52847n nVar, C11729a aVar) {
            this.f31267a = bVar;
            this.f31268b = j;
            this.f31269c = j2;
            this.f31270d = nVar;
            this.f31271e = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a7, code lost:
            if (r2 == null) goto L_0x00a9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                com.bytedance.jedi.a.l.b r0 = r7.f31267a
                java.lang.Object r0 = r0.mo22487a()
                boolean r1 = r0 instanceof p2628d.C52847n
                r2 = 0
                if (r1 != 0) goto L_0x000c
                r0 = r2
            L_0x000c:
                d.n r0 = (p2628d.C52847n) r0
                if (r0 == 0) goto L_0x0014
                java.lang.Object r2 = r0.getSecond()
            L_0x0014:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "[time："
                r0.<init>(r1)
                long r3 = r7.f31268b
                r0.append(r3)
                r1 = 93
                r0.append(r1)
                java.lang.String r3 = "[dur："
                r0.append(r3)
                long r3 = r7.f31269c
                r0.append(r3)
                r0.append(r1)
                java.lang.String r3 = "[from："
                r0.append(r3)
                d.n r3 = r7.f31270d
                r0.append(r3)
                r0.append(r1)
                java.lang.String r3 = "[to："
                r0.append(r3)
                com.bytedance.jedi.a.l.a r3 = r7.f31271e
                r0.append(r3)
                r0.append(r1)
                java.lang.String r3 = "[size: "
                r0.append(r3)
                long[] r3 = com.bytedance.jedi.p725a.p743m.C11752g.m24081a(r2)
                r4 = 1
                r4 = r3[r4]
                r0.append(r4)
                r3 = 47
                r0.append(r3)
                long[] r3 = com.bytedance.jedi.p725a.p743m.C11752g.m24081a(r2)
                r4 = 0
                r5 = r3[r4]
                r0.append(r5)
                r0.append(r1)
                java.lang.String r3 = "[content："
                r0.append(r3)
                if (r2 == 0) goto L_0x00a9
                java.lang.String r2 = r2.toString()
                if (r2 == 0) goto L_0x00a9
                int r3 = r2.length()
                r5 = 200(0xc8, float:2.8E-43)
                if (r3 <= r5) goto L_0x00a7
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                if (r2 == 0) goto L_0x009f
                java.lang.String r2 = r2.substring(r4, r5)
                java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
                r3.append(r2)
                java.lang.String r2 = "..."
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                goto L_0x00a7
            L_0x009f:
                d.u r0 = new d.u
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x00a7:
                if (r2 != 0) goto L_0x00ab
            L_0x00a9:
                java.lang.String r2 = "null"
            L_0x00ab:
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Object[] r1 = new java.lang.Object[r4]
                com.p1081h.p1082a.C18116e.m44328a(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.p725a.p743m.C11769k.C11773d.run():void");
        }
    }

    /* renamed from: com.bytedance.jedi.a.m.k$e */
    static final class C11774e extends C52712l implements C52670a<C18112a> {

        /* renamed from: a */
        public static final C11774e f31272a = new C11774e();

        C11774e() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C117751.f31273a;
        }
    }

    private C11769k() {
    }

    static {
        C18116e.m44327a(f31263i);
    }

    /* renamed from: a */
    public final void mo22496a(C11729a<?> aVar, C11730b<?> bVar) {
        long j;
        C52711k.m112240b(aVar, "tracePoint");
        C52711k.m112240b(bVar, "traceable");
        long currentTimeMillis = System.currentTimeMillis();
        C52847n b = bVar.mo22489b();
        if (b != null) {
            Long l = (Long) b.getSecond();
            if (l != null) {
                j = l.longValue();
                long j2 = currentTimeMillis - j;
                Executor executor = (Executor) f31264j.getValue();
                C11773d dVar = new C11773d(bVar, currentTimeMillis, j2, b, aVar);
                executor.execute(dVar);
            }
        }
        j = currentTimeMillis;
        long j22 = currentTimeMillis - j;
        Executor executor2 = (Executor) f31264j.getValue();
        C11773d dVar2 = new C11773d(bVar, currentTimeMillis, j22, b, aVar);
        executor2.execute(dVar2);
    }
}
