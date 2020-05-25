package com.p683ss.android.ugc.asve.recorder;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import com.p683ss.android.medialib.p1181c.C19233b;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.asve.C20317b;
import com.p683ss.android.ugc.asve.context.C20363h;
import com.p683ss.android.ugc.asve.p1240d.C20372b;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.asve.recorder.p1244a.C20418b;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.asve.recorder.reaction.C20531a;
import com.p683ss.android.vesdk.C50601ah.C50616e;
import com.p683ss.android.vesdk.runtime.C50771d;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.asve.recorder.b */
public final class C20420b implements C20484e {

    /* renamed from: e */
    public static final C20421a f55978e = new C20421a(null);

    /* renamed from: a */
    public final C20422b f55979a;

    /* renamed from: b */
    public final C0184k f55980b;

    /* renamed from: c */
    public final C20484e f55981c;

    /* renamed from: d */
    public final C20363h f55982d;

    /* renamed from: f */
    private final double f55983f = 1.3333333333333333d;

    /* renamed from: g */
    private final C52847n<Integer, Integer> f55984g = this.f55982d.mo43121e();

    /* renamed from: h */
    private final String f55985h = this.f55982d.mo43126j().mo43175c();

    /* renamed from: i */
    private final String f55986i = this.f55982d.mo43126j().mo43174b();

    /* renamed from: j */
    private final boolean f55987j = this.f55982d.mo43126j().mo43178f();

    /* renamed from: k */
    private final String f55988k = this.f55982d.mo43127k().mo43180b();

    /* renamed from: l */
    private final String f55989l = this.f55982d.mo43127k().mo43179a();

    /* renamed from: com.ss.android.ugc.asve.recorder.b$a */
    public static final class C20421a {
        private C20421a() {
        }

        public /* synthetic */ C20421a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C20420b m50673a(C0184k kVar, C20363h hVar) {
            C52711k.m112240b(hVar, "recorderContext");
            return new C20420b(kVar, C20527j.m51508a(C20315a.m50093b(), kVar, hVar), hVar);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.b$b */
    public enum C20422b {
        CUSTOM,
        REACTION,
        DUET
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.b$c */
    public static final class C20423c implements Callback {

        /* renamed from: a */
        final /* synthetic */ C20420b f55991a;

        /* renamed from: com.ss.android.ugc.asve.recorder.b$c$a */
        static final class C20424a extends C52712l implements C52671b<Integer, C52860x> {

            /* renamed from: a */
            public static final C20424a f55992a = new C20424a();

            C20424a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return C52860x.f131107a;
            }
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        C20423c(C20420b bVar) {
            this.f55991a = bVar;
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f55991a.f55981c.mo43257e().mo43314f();
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C52711k.m112240b(surfaceHolder, "holder");
            this.f55991a.mo43275a();
            C20426a e = this.f55991a.f55981c.mo43257e();
            Surface surface = surfaceHolder.getSurface();
            C52711k.m112236a((Object) surface, "holder.surface");
            e.mo43292a(surface, "", (C52671b<? super Integer, C52860x>) C20424a.f55992a);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.b$d */
    static final class C20425d extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        public static final C20425d f55993a = new C20425d();

        C20425d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo43247a(Context context) {
        C52711k.m112240b(context, "context");
        this.f55981c.mo43247a(context);
    }

    /* renamed from: a */
    public final void mo43248a(C19233b bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f55981c.mo43248a(bVar);
    }

    /* renamed from: a */
    public final void mo43249a(C50616e eVar) {
        this.f55981c.mo43249a(eVar);
    }

    /* renamed from: a */
    public final void mo43250a(C50771d dVar, String str) {
        C52711k.m112240b(dVar, "resManager");
        C52711k.m112240b(str, "workSpacePath");
        this.f55981c.mo43250a(dVar, str);
    }

    /* renamed from: a */
    public final void mo43251a(C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(bVar, "callback");
        this.f55981c.mo43251a(bVar);
    }

    /* renamed from: a */
    public final void mo43252a(C52686q<? super Integer, ? super Integer, ? super String, C52860x> qVar) {
        C52711k.m112240b(qVar, "callback");
        this.f55981c.mo43252a(qVar);
    }

    /* renamed from: b */
    public final C20457b mo43253b() {
        return this.f55981c.mo43253b();
    }

    /* renamed from: b */
    public final void mo43254b(C19233b bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f55981c.mo43254b(bVar);
    }

    /* renamed from: c */
    public final C20418b mo43255c() {
        return this.f55981c.mo43255c();
    }

    /* renamed from: d */
    public final C20489b mo43256d() {
        return this.f55981c.mo43256d();
    }

    /* renamed from: e */
    public final C20426a mo43257e() {
        return this.f55981c.mo43257e();
    }

    /* renamed from: f */
    public final C20531a mo43258f() {
        return this.f55981c.mo43258f();
    }

    /* renamed from: g */
    public final C20372b mo43259g() {
        return this.f55981c.mo43259g();
    }

    /* renamed from: h */
    public final void mo43260h() {
        this.f55981c.mo43260h();
    }

    public final void release() {
        this.f55981c.release();
    }

    /* renamed from: a */
    public final void mo43275a() {
        String str;
        boolean z;
        mo43247a((Context) C20315a.m50093b());
        C20426a e = mo43257e();
        int e2 = mo43253b().mo43367e();
        int f = mo43253b().mo43369f();
        String absolutePath = this.f55982d.mo43120d().mo43188b().getAbsolutePath();
        C52711k.m112236a((Object) absolutePath, "recorderContext.workspac….segmentPath.absolutePath");
        boolean i = this.f55982d.mo43125i();
        e.mo43280a(e2, f, absolutePath, ((Number) this.f55984g.getSecond()).intValue(), ((Number) this.f55984g.getFirst()).intValue(), "", i ? 1 : 0, this.f55982d.mo43122f());
        mo43257e().mo43300a(true);
        mo43257e().mo43313e(this.f55982d.mo43132p());
        mo43256d().mo43454a(3);
        mo43256d().mo43491b(1);
        if (this.f55979a == C20422b.DUET) {
            C20317b.f55815a.mo42963d("initDuet() called");
            int d = this.f55982d.mo43126j().mo43176d();
            int e3 = this.f55982d.mo43126j().mo43177e();
            if (this.f55982d.mo43126j().mo43173a()) {
                str = null;
            } else {
                str = this.f55986i;
            }
            double d2 = this.f55983f;
            double d3 = (double) d;
            Double.isNaN(d3);
            if (d2 * d3 <= ((double) e3)) {
                z = false;
            } else {
                z = true;
            }
            mo43257e().mo43297a(str, 0, 0);
            mo43255c().mo43269a(this.f55985h, str, 0.0f, 0.16f, 0.6f, z, this.f55987j);
        }
        if (this.f55979a == C20422b.REACTION) {
            C20317b.f55815a.mo42963d("initReaction() called");
            mo43257e().mo43297a(this.f55989l, 0, 0);
            mo43258f().mo43576e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20420b(android.arch.lifecycle.C0184k r2, com.p683ss.android.ugc.asve.recorder.C20484e r3, com.p683ss.android.ugc.asve.context.C20363h r4) {
        /*
            r1 = this;
            java.lang.String r0 = "recorderImp"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            java.lang.String r0 = "recorderContext"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            r1.<init>()
            r1.f55980b = r2
            r1.f55981c = r3
            r1.f55982d = r4
            r2 = 4608683618675807573(0x3ff5555555555555, double:1.3333333333333333)
            r1.f55983f = r2
            com.ss.android.ugc.asve.context.h r2 = r1.f55982d
            d.n r2 = r2.mo43121e()
            r1.f55984g = r2
            com.ss.android.ugc.asve.context.h r2 = r1.f55982d
            com.ss.android.ugc.asve.context.f r2 = r2.mo43126j()
            java.lang.String r2 = r2.mo43175c()
            r1.f55985h = r2
            com.ss.android.ugc.asve.context.h r2 = r1.f55982d
            com.ss.android.ugc.asve.context.f r2 = r2.mo43126j()
            java.lang.String r2 = r2.mo43174b()
            r1.f55986i = r2
            com.ss.android.ugc.asve.context.h r2 = r1.f55982d
            com.ss.android.ugc.asve.context.f r2 = r2.mo43126j()
            boolean r2 = r2.mo43178f()
            r1.f55987j = r2
            com.ss.android.ugc.asve.context.h r2 = r1.f55982d
            com.ss.android.ugc.asve.context.g r2 = r2.mo43127k()
            java.lang.String r2 = r2.mo43180b()
            r1.f55988k = r2
            com.ss.android.ugc.asve.context.h r2 = r1.f55982d
            com.ss.android.ugc.asve.context.g r2 = r2.mo43127k()
            java.lang.String r2 = r2.mo43179a()
            r1.f55989l = r2
            java.lang.String r2 = r1.f55988k
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L_0x006c
            r2 = 1
            goto L_0x006d
        L_0x006c:
            r2 = 0
        L_0x006d:
            if (r2 == 0) goto L_0x0081
            java.lang.String r2 = r1.f55989l
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x007b
            r2 = 1
            goto L_0x007c
        L_0x007b:
            r2 = 0
        L_0x007c:
            if (r2 == 0) goto L_0x0081
            com.ss.android.ugc.asve.recorder.b$b r2 = com.p683ss.android.ugc.asve.recorder.C20420b.C20422b.REACTION
            goto L_0x00a2
        L_0x0081:
            java.lang.String r2 = r1.f55985h
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x008d
            r2 = 1
            goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            if (r2 == 0) goto L_0x00a0
            java.lang.String r2 = r1.f55986i
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x009b
            r3 = 1
        L_0x009b:
            if (r3 == 0) goto L_0x00a0
            com.ss.android.ugc.asve.recorder.b$b r2 = com.p683ss.android.ugc.asve.recorder.C20420b.C20422b.DUET
            goto L_0x00a2
        L_0x00a0:
            com.ss.android.ugc.asve.recorder.b$b r2 = com.p683ss.android.ugc.asve.recorder.C20420b.C20422b.CUSTOM
        L_0x00a2:
            r1.f55979a = r2
            com.ss.android.ugc.asve.context.h r2 = r1.f55982d
            boolean r2 = r2.mo43118b()
            if (r2 == 0) goto L_0x00e9
            com.ss.android.ugc.asve.context.h r2 = r1.f55982d
            android.view.SurfaceHolder r2 = r2.mo43119c()
            if (r2 == 0) goto L_0x00be
            com.ss.android.ugc.asve.recorder.b$c r3 = new com.ss.android.ugc.asve.recorder.b$c
            r3.<init>(r1)
            android.view.SurfaceHolder$Callback r3 = (android.view.SurfaceHolder.Callback) r3
            r2.addCallback(r3)
        L_0x00be:
            com.ss.android.ugc.asve.context.h r2 = r1.f55982d
            android.view.SurfaceHolder r2 = r2.mo43119c()
            if (r2 == 0) goto L_0x00e9
            android.view.Surface r2 = r2.getSurface()
            if (r2 == 0) goto L_0x00e9
            boolean r3 = r2.isValid()
            if (r3 == 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r2 = 0
        L_0x00d4:
            if (r2 == 0) goto L_0x00e9
            r1.mo43275a()
            com.ss.android.ugc.asve.recorder.e r3 = r1.f55981c
            com.ss.android.ugc.asve.recorder.b.a r3 = r3.mo43257e()
            java.lang.String r4 = ""
            com.ss.android.ugc.asve.recorder.b$d r0 = com.p683ss.android.ugc.asve.recorder.C20420b.C20425d.f55993a
            d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
            r3.mo43292a(r2, r4, r0)
            return
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.asve.recorder.C20420b.<init>(android.arch.lifecycle.k, com.ss.android.ugc.asve.recorder.e, com.ss.android.ugc.asve.context.h):void");
    }
}
