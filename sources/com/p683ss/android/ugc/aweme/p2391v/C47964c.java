package com.p683ss.android.ugc.aweme.p2391v;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.p161c.C2835a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p2391v.C47970d.C47971a;
import com.p683ss.android.ugc.aweme.p2391v.C47970d.C47973c;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.v.c */
public final class C47964c {

    /* renamed from: e */
    public static final C52668f f120577e = C52732g.m112285a(C47966b.f120586a);

    /* renamed from: f */
    public static final C47965a f120578f = new C47965a(null);

    /* renamed from: a */
    public volatile int f120579a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<C52682m<Boolean, Long, C52860x>> f120580b;

    /* renamed from: c */
    public String f120581c;

    /* renamed from: d */
    public C45547d f120582d;

    /* renamed from: g */
    private final C47968d f120583g;

    /* renamed from: h */
    private boolean f120584h;

    /* renamed from: com.ss.android.ugc.aweme.v.c$a */
    public static final class C47965a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f120585a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47965a.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/decompress/DecompressManager;"))};

        private C47965a() {
        }

        /* renamed from: a */
        public static C47964c m103784a() {
            return (C47964c) C47964c.f120577e.getValue();
        }

        public /* synthetic */ C47965a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.v.c$b */
    static final class C47966b extends C52712l implements C52670a<C47964c> {

        /* renamed from: a */
        public static final C47966b f120586a = new C47966b();

        C47966b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C47964c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.v.c$c */
    static final class C47967c<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C47964c f120587a;

        C47967c(C47964c cVar) {
            this.f120587a = cVar;
        }

        public final /* synthetic */ Object call() {
            C45547d dVar = this.f120587a.f120582d;
            if (dVar != null && dVar.isShowing()) {
                C45547d dVar2 = this.f120587a.f120582d;
                if (dVar2 != null) {
                    dVar2.dismiss();
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.v.c$d */
    public static final class C47968d implements C47971a {

        /* renamed from: a */
        final /* synthetic */ C47964c f120588a;

        C47968d(C47964c cVar) {
            this.f120588a = cVar;
        }

        /* renamed from: a */
        public final void mo95127a(long j) {
            C47964c.m103776a("");
            C47964c.m103777a(false);
            this.f120588a.f120579a = 3;
            this.f120588a.mo95125d();
            CopyOnWriteArrayList<C52682m<Boolean, Long, C52860x>> copyOnWriteArrayList = this.f120588a.f120580b;
            if (copyOnWriteArrayList != null && (!copyOnWriteArrayList.isEmpty())) {
                for (C52682m mVar : copyOnWriteArrayList) {
                    if (mVar != null) {
                        mVar.invoke(Boolean.valueOf(false), Long.valueOf(j));
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo95128a(String str, long j) {
            C52711k.m112240b(str, "libPath");
            C47964c.m103776a(str);
            C47964c.m103777a(true);
            String str2 = this.f120588a.f120581c;
            if (str2 == null) {
                str2 = C47970d.m103788a("awemetool", C11010c.m22280a());
            }
            Keva.getRepo("LIBRARY_DECOMPRESS_REPO_3").storeString("LIBRARY_MD5", str2);
            this.f120588a.f120579a = 2;
            this.f120588a.mo95124c();
            this.f120588a.mo95125d();
            CopyOnWriteArrayList<C52682m<Boolean, Long, C52860x>> copyOnWriteArrayList = this.f120588a.f120580b;
            if (copyOnWriteArrayList != null && (!copyOnWriteArrayList.isEmpty())) {
                for (C52682m mVar : copyOnWriteArrayList) {
                    if (mVar != null) {
                        mVar.invoke(Boolean.valueOf(true), Long.valueOf(j));
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.v.c$e */
    static final class C47969e<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C47964c f120589a;

        /* renamed from: b */
        final /* synthetic */ Activity f120590b;

        C47969e(C47964c cVar, Activity activity) {
            this.f120589a = cVar;
            this.f120590b = activity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.v.c r0 = r5.f120589a
                com.ss.android.ugc.aweme.shortvideo.view.d r0 = r0.f120582d
                r1 = 1
                if (r0 != 0) goto L_0x0030
                com.ss.android.ugc.aweme.v.c r0 = r5.f120589a
                android.app.Activity r2 = r5.f120590b
                android.content.Context r2 = (android.content.Context) r2
                android.app.Activity r3 = r5.f120590b
                if (r3 == 0) goto L_0x001f
                android.content.res.Resources r3 = r3.getResources()
                if (r3 == 0) goto L_0x001f
                r4 = 2132547873(0x7f1c1921, float:2.0749004E38)
                java.lang.String r3 = r3.getString(r4)
                goto L_0x0020
            L_0x001f:
                r3 = 0
            L_0x0020:
                com.ss.android.ugc.aweme.shortvideo.view.d r2 = com.p683ss.android.ugc.aweme.shortvideo.view.C45547d.m99208b(r2, r3)
                r0.f120582d = r2
                com.ss.android.ugc.aweme.v.c r0 = r5.f120589a
                com.ss.android.ugc.aweme.shortvideo.view.d r0 = r0.f120582d
                if (r0 == 0) goto L_0x0042
                r0.setIndeterminate(r1)
                goto L_0x0042
            L_0x0030:
                com.ss.android.ugc.aweme.v.c r0 = r5.f120589a
                com.ss.android.ugc.aweme.shortvideo.view.d r0 = r0.f120582d
                if (r0 == 0) goto L_0x0039
                r0.show()
            L_0x0039:
                com.ss.android.ugc.aweme.v.c r0 = r5.f120589a
                com.ss.android.ugc.aweme.shortvideo.view.d r0 = r0.f120582d
                if (r0 == 0) goto L_0x0042
                r0.setIndeterminate(r1)
            L_0x0042:
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p2391v.C47964c.C47969e.call():java.lang.Object");
        }
    }

    /* renamed from: e */
    public static final C47964c m103778e() {
        return C47965a.m103784a();
    }

    /* renamed from: a */
    public static String m103775a() {
        return C47970d.m103787a(C11010c.m22280a());
    }

    /* renamed from: d */
    public final void mo95125d() {
        C0013i.m18a((Callable<TResult>) new C47967c<TResult>(this), C0013i.f25b);
    }

    /* renamed from: f */
    private static String m103779f() {
        String string = Keva.getRepo("LIBRARY_DECOMPRESS_REPO_3").getString("LIBRARY_PATH", "");
        C52711k.m112236a((Object) string, "Keva.getRepo(DecompressC…pressConfig.LIB_PATH, \"\")");
        return string;
    }

    /* renamed from: c */
    public final void mo95124c() {
        synchronized (this) {
            if (!this.f120584h) {
                AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().libraryLoaderService().setLoaderOnly();
                this.f120584h = true;
            }
        }
    }

    public C47964c() {
        int i;
        C2835a.m8098a(C11010c.m22280a(), String.valueOf(C11010c.m22286g()));
        if (mo95123b()) {
            i = 0;
        } else {
            i = 2;
        }
        this.f120579a = i;
        this.f120580b = new CopyOnWriteArrayList<>();
        this.f120583g = new C47968d(this);
    }

    /* renamed from: b */
    public final boolean mo95123b() {
        boolean z;
        if (!C47962a.m103773a().isEmpty()) {
            String str = this.f120581c;
            if (str == null) {
                str = C47970d.m103788a("awemetool", C11010c.m22280a());
            }
            this.f120581c = str;
            String str2 = this.f120581c;
            String string = Keva.getRepo("LIBRARY_DECOMPRESS_REPO_3").getString("LIBRARY_MD5", "");
            C52711k.m112236a((Object) string, "Keva.getRepo(DecompressC…mpressConfig.LIB_MD5, \"\")");
            boolean z2 = !C52711k.m112239a((Object) str2, (Object) string);
            if (Keva.getRepo("LIBRARY_DECOMPRESS_REPO_3").getBoolean("LIBRARY_DECOMPRESSED", false)) {
                if ((!C52711k.m112239a((Object) m103779f(), (Object) m103775a())) || TextUtils.isEmpty(m103779f())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || z2) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m103776a(String str) {
        Keva.getRepo("LIBRARY_DECOMPRESS_REPO_3").storeString("LIBRARY_PATH", str);
    }

    /* renamed from: a */
    public static void m103777a(boolean z) {
        Keva.getRepo("LIBRARY_DECOMPRESS_REPO_3").storeBoolean("LIBRARY_DECOMPRESSED", z);
    }

    /* renamed from: a */
    public final void mo95122a(int i, boolean z, C52682m<? super Boolean, ? super Long, C52860x> mVar) {
        boolean z2;
        if (this.f120579a == 2) {
            Iterator it = C47962a.m103773a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = true;
                    break;
                }
                String str = (String) it.next();
                StringBuilder sb = new StringBuilder();
                sb.append(m103779f());
                sb.append("/lib");
                sb.append(str);
                sb.append(".so");
                if (!new File(sb.toString()).exists()) {
                    z2 = false;
                    break;
                }
            }
            if (!z2 && TextUtils.isEmpty(m103779f())) {
                C23569o.m57776a("so_decompress_load_rate", 1, C23088c.m56631a().mo47822a("errorCode", Integer.valueOf(4)).mo47824a("errorMsg", Log.getStackTraceString(new RuntimeException("Library path not exist"))).mo47825b());
            }
            mo95124c();
            mo95125d();
            if (mVar != null) {
                mVar.invoke(Boolean.valueOf(true), Long.valueOf(-1));
            }
        } else {
            this.f120580b.add(mVar);
            if (z) {
                Activity g = C11016e.m22312g();
                if (g != null && g.hasWindowFocus()) {
                    C45547d dVar = this.f120582d;
                    if (dVar == null || !dVar.isShowing()) {
                        C0013i.m18a((Callable<TResult>) new C47969e<TResult>(this, g), C0013i.f25b);
                        C26890h.m65012a("show_decompress_dialog", C23088c.m56631a().mo47825b());
                    }
                }
            }
            if (this.f120579a == 0 || this.f120579a == 3) {
                if (TextUtils.equals(C11010c.m22295p(), "local_test")) {
                    C10691a.m21538a(C11010c.m22280a(), "Start Decompress", 1).mo19066a();
                }
                this.f120579a = 1;
                String str2 = "awemetool";
                C47971a aVar = this.f120583g;
                C52711k.m112240b(str2, "metadata");
                C52711k.m112240b(aVar, "callback");
                long currentTimeMillis = System.currentTimeMillis();
                Context a = C11010c.m22280a();
                C47963b.m103774a(i);
                C2835a.m8096a(a).mo7473a(a, str2, new C47973c(currentTimeMillis, aVar, i));
            }
        }
    }
}
