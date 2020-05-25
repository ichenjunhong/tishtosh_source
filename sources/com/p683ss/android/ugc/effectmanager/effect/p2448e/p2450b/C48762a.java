package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b;

import com.p683ss.android.ugc.effectmanager.common.p2436c.C48626c;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48627d;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48627d.C48628a;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48629e;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48630f;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48631g;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48632h;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48642c;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48657k;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2442a.C48693a;
import com.p683ss.android.ugc.effectmanager.effect.p2442a.C48694b;
import com.p683ss.android.ugc.effectmanager.effect.p2443b.C48695a;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48749e;
import com.p683ss.android.ugc.effectmanager.effect.p2453f.C48882a;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a */
public final class C48762a implements C48693a {

    /* renamed from: a */
    public final C48644a f122461a;

    /* renamed from: b */
    public final C48642c f122462b;

    /* renamed from: c */
    public final String f122463c;

    /* renamed from: d */
    public final String f122464d;

    /* renamed from: e */
    public C48627d f122465e;

    /* renamed from: f */
    public boolean f122466f;

    /* renamed from: g */
    private C48631g f122467g;

    /* renamed from: h */
    private C48882a f122468h;

    /* renamed from: a */
    public final C48657k<C48749e> mo59209a(final C48694b bVar) {
        if (this.f122467g == null) {
            this.f122467g = new C48695a(bVar.f122357a, this.f122461a);
        }
        if (this.f122468h == null) {
            this.f122468h = new C48882a(this.f122463c, this.f122464d, bVar, this.f122462b);
        }
        this.f122465e = new C48628a().mo96209a(this.f122467g).mo96210a((C48632h) this.f122468h).mo96208a(C48630f.EFFECT).mo96211a();
        return new C48657k<C48749e>() {

            /* renamed from: a */
            String f122469a;

            /* renamed from: b */
            String f122470b;

            /* renamed from: c */
            Effect f122471c;

            /* renamed from: f */
            long f122472f;

            /* renamed from: g */
            long f122473g;

            /* renamed from: h */
            long f122474h;

            /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a$1$a */
            class C48764a extends C48626c {

                /* renamed from: b */
                private C48657k<C48749e> f122478b;

                public C48764a(C48657k kVar) {
                    this.f122478b = kVar;
                }

                /* renamed from: a */
                public final void mo96205a(int i, long j) {
                    if (this.f122478b != null) {
                        this.f122478b.mo96241a(this.f122478b, i, j);
                    }
                }
            }

            /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a$1$b */
            class C48765b extends C48626c {

                /* renamed from: b */
                private C48657k<C48749e> f122480b;

                /* renamed from: a */
                public final void mo96206a(C48629e eVar) {
                    boolean z;
                    if (eVar.f122266f == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C487631.this.f122473g = eVar.f122264d;
                        C487631.this.f122472f = eVar.f122261a;
                        C487631.this.f122474h = eVar.f122265e;
                    }
                }

                public C48765b(C48657k<C48749e> kVar) {
                    this.f122480b = kVar;
                }

                /* renamed from: a */
                public final void mo96205a(int i, long j) {
                    if (this.f122480b != null) {
                        this.f122480b.mo96241a(this.f122480b, i, j);
                    }
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:51:0x0200, code lost:
                m105492a((com.p683ss.android.ugc.effectmanager.common.p2440g.C48657k<com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48749e>) r15, new com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48749e(r2, null));
             */
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00bf */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x00de A[Catch:{ Exception -> 0x0249 }] */
            /* JADX WARNING: Removed duplicated region for block: B:90:0x00c6 A[SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo96239a() {
                /*
                    r15 = this;
                    r15.mo96240a(r15)
                    long r0 = java.lang.System.currentTimeMillis()
                    com.ss.android.ugc.effectmanager.effect.a.b r2 = r5
                    com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f122357a
                    r15.f122471c = r2
                    if (r2 == 0) goto L_0x02f2
                    com.ss.android.ugc.effectmanager.effect.a.b r3 = r5
                    java.util.List<java.lang.String> r3 = r3.f122358b
                    if (r3 == 0) goto L_0x02f2
                    com.ss.android.ugc.effectmanager.effect.a.b r3 = r5
                    java.util.List<java.lang.String> r3 = r3.f122358b
                    boolean r3 = r3.isEmpty()
                    if (r3 != 0) goto L_0x02f2
                    com.ss.android.ugc.effectmanager.common.model.UrlModel r3 = r2.getFileUrl()
                    boolean r3 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105311a(r3)
                    if (r3 == 0) goto L_0x002b
                    goto L_0x02f2
                L_0x002b:
                    r3 = 0
                    com.ss.android.ugc.effectmanager.effect.a.b r4 = r5
                    java.util.List<java.lang.String> r4 = r4.f122358b
                    int r10 = r4.size()
                    r11 = 0
                L_0x0035:
                    if (r11 >= r10) goto L_0x02fc
                    boolean r3 = r15.f122295e
                    if (r3 == 0) goto L_0x0047
                    com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d
                    r1 = 10001(0x2711, float:1.4014E-41)
                    r0.<init>(r1)
                    r15.mo96242a(r15, r0)
                    goto L_0x02fc
                L_0x0047:
                    com.ss.android.ugc.effectmanager.effect.a.b r3 = r5
                    java.util.List<java.lang.String> r3 = r3.f122358b
                    java.lang.Object r3 = r3.get(r11)
                    java.lang.String r3 = (java.lang.String) r3
                    r15.f122469a = r3
                    java.lang.String r3 = r2.getZipPath()     // Catch:{ Exception -> 0x0249 }
                    boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0249 }
                    if (r3 != 0) goto L_0x0067
                    java.lang.String r3 = r2.getUnzipPath()     // Catch:{ Exception -> 0x0249 }
                    boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0249 }
                    if (r3 == 0) goto L_0x00aa
                L_0x0067:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0249 }
                    r3.<init>()     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.effect.a.b r4 = r5     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r4 = r4.f122359c     // Catch:{ Exception -> 0x0249 }
                    r3.append(r4)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r4 = java.io.File.separator     // Catch:{ Exception -> 0x0249 }
                    r3.append(r4)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r4 = r2.getId()     // Catch:{ Exception -> 0x0249 }
                    r3.append(r4)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r4 = ".zip"
                    r3.append(r4)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0249 }
                    r2.setZipPath(r3)     // Catch:{ Exception -> 0x0249 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0249 }
                    r3.<init>()     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.effect.a.b r4 = r5     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r4 = r4.f122359c     // Catch:{ Exception -> 0x0249 }
                    r3.append(r4)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r4 = java.io.File.separator     // Catch:{ Exception -> 0x0249 }
                    r3.append(r4)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r4 = r2.getId()     // Catch:{ Exception -> 0x0249 }
                    r3.append(r4)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0249 }
                    r2.setUnzipPath(r3)     // Catch:{ Exception -> 0x0249 }
                L_0x00aa:
                    java.net.URL r3 = new java.net.URL     // Catch:{ MalformedURLException | UnknownHostException -> 0x00bf }
                    java.lang.String r4 = r15.f122469a     // Catch:{ MalformedURLException | UnknownHostException -> 0x00bf }
                    r3.<init>(r4)     // Catch:{ MalformedURLException | UnknownHostException -> 0x00bf }
                    java.lang.String r3 = r3.getHost()     // Catch:{ MalformedURLException | UnknownHostException -> 0x00bf }
                    java.net.InetAddress r3 = java.net.InetAddress.getByName(r3)     // Catch:{ MalformedURLException | UnknownHostException -> 0x00bf }
                    java.lang.String r3 = r3.getHostAddress()     // Catch:{ MalformedURLException | UnknownHostException -> 0x00bf }
                    r15.f122470b = r3     // Catch:{ MalformedURLException | UnknownHostException -> 0x00bf }
                L_0x00bf:
                    com.ss.android.ugc.effectmanager.effect.e.b.a r3 = com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.C48762a.this     // Catch:{ Exception -> 0x0249 }
                    boolean r3 = r3.f122466f     // Catch:{ Exception -> 0x0249 }
                    r12 = 0
                    if (r3 == 0) goto L_0x00de
                    com.ss.android.ugc.effectmanager.effect.e.b.a r3 = com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.C48762a.this     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.common.c.d r3 = r3.f122465e     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.effect.a.b r4 = r5     // Catch:{ Exception -> 0x0249 }
                    java.util.List<java.lang.String> r4 = r4.f122358b     // Catch:{ Exception -> 0x0249 }
                    java.lang.Object r4 = r4.get(r11)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.effect.e.b.a$1$b r5 = new com.ss.android.ugc.effectmanager.effect.e.b.a$1$b     // Catch:{ Exception -> 0x0249 }
                    r5.<init>(r15)     // Catch:{ Exception -> 0x0249 }
                    r3.mo96207a(r4, r5)     // Catch:{ Exception -> 0x0249 }
                    goto L_0x0200
                L_0x00de:
                    com.ss.android.ugc.effectmanager.effect.e.b.a r3 = com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.C48762a.this     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.common.f.a r3 = r3.f122461a     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.effect.a.b r4 = r5     // Catch:{ Exception -> 0x0249 }
                    java.util.List<java.lang.String> r4 = r4.f122358b     // Catch:{ Exception -> 0x0249 }
                    java.lang.Object r4 = r4.get(r11)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.effect.e.b.a$1$a r9 = new com.ss.android.ugc.effectmanager.effect.e.b.a$1$a     // Catch:{ Exception -> 0x0249 }
                    r9.<init>(r15)     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.common.b r5 = new com.ss.android.ugc.effectmanager.common.b     // Catch:{ IOException -> 0x0243 }
                    java.lang.String r6 = "GET"
                    r5.<init>(r6, r4)     // Catch:{ IOException -> 0x0243 }
                    java.io.InputStream r13 = r3.mo96221a(r5)     // Catch:{ IOException -> 0x0243 }
                    java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    java.lang.String r4 = r2.getZipPath()     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    r3.<init>(r4)     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    java.lang.String r3 = r3.getParent()     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    com.ss.android.ugc.effectmanager.common.a.c r4 = com.p683ss.android.ugc.effectmanager.common.p2433a.C48593c.C48594a.m105132a()     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    com.ss.android.ugc.effectmanager.common.b.c r4 = r4.mo96146a(r3)     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    boolean r4 = r4 instanceof com.p683ss.android.ugc.effectmanager.common.p2433a.C48596d     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    if (r4 == 0) goto L_0x012f
                    com.ss.android.ugc.effectmanager.common.a.c r4 = com.p683ss.android.ugc.effectmanager.common.p2433a.C48593c.C48594a.m105132a()     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    com.ss.android.ugc.effectmanager.common.b.c r3 = r4.mo96146a(r3)     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    com.ss.android.ugc.effectmanager.common.a.d r3 = (com.p683ss.android.ugc.effectmanager.common.p2433a.C48596d) r3     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    com.ss.android.ugc.effectmanager.common.model.UrlModel r4 = r2.getFileUrl()     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    java.lang.String r6 = r4.getUri()     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    long r7 = r5.f122199c     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    r4 = r2
                    r5 = r13
                    r3.mo96150a(r4, r5, r6, r7, r9)     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    goto L_0x0138
                L_0x012f:
                    java.lang.String r3 = r2.getZipPath()     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    long r4 = r5.f122199c     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                    com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105305a(r13, r3, r4, r9)     // Catch:{ IOException -> 0x023d, all -> 0x023b }
                L_0x0138:
                    com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r13)     // Catch:{ Exception -> 0x0249 }
                    long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0249 }
                    java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r6 = r2.getZipPath()     // Catch:{ Exception -> 0x0249 }
                    r5.<init>(r6)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r6 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48675k.m105341a(r5)     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.effect.model.Effect r7 = r15.f122471c     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.common.model.UrlModel r7 = r7.getFileUrl()     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r7 = r7.getUri()     // Catch:{ Exception -> 0x0249 }
                    boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x0249 }
                    if (r7 == 0) goto L_0x020a
                    long r5 = r5.length()     // Catch:{ Exception -> 0x0249 }
                    int r7 = com.p683ss.android.ugc.effectmanager.common.C48590a.f122161a     // Catch:{ Exception -> 0x0249 }
                    long r7 = (long) r7     // Catch:{ Exception -> 0x0249 }
                    long r5 = r5 / r7
                    r15.f122474h = r5     // Catch:{ Exception -> 0x0249 }
                    java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r6 = r2.getZipPath()     // Catch:{ Exception -> 0x0249 }
                    r5.<init>(r6)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r5 = r5.getParent()     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.effect.a.b r6 = r5     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r6 = r6.f122359c     // Catch:{ Exception -> 0x0249 }
                    boolean r7 = r6.equals(r5)     // Catch:{ Exception -> 0x0249 }
                    if (r7 != 0) goto L_0x01c8
                    com.ss.android.ugc.effectmanager.effect.e.b.a r7 = com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.C48762a.this     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.common.e.c r7 = r7.f122462b     // Catch:{ Exception -> 0x0249 }
                    if (r7 == 0) goto L_0x01c8
                    com.ss.android.ugc.effectmanager.effect.e.b.a r7 = com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.C48762a.this     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.common.e.c r7 = r7.f122462b     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r8 = "effect_download_error"
                    com.ss.android.ugc.effectmanager.common.h.h r9 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h.m105314a()     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r13 = "app_id"
                    com.ss.android.ugc.effectmanager.effect.e.b.a r14 = com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.C48762a.this     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r14 = r14.f122463c     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.common.h.h r9 = r9.mo96255a(r13, r14)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r13 = "access_key"
                    com.ss.android.ugc.effectmanager.effect.e.b.a r14 = com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.C48762a.this     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r14 = r14.f122464d     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.common.h.h r9 = r9.mo96255a(r13, r14)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r13 = "effect_id"
                    com.ss.android.ugc.effectmanager.effect.model.Effect r14 = r15.f122471c     // Catch:{ Exception -> 0x0249 }
                    if (r14 != 0) goto L_0x01aa
                    java.lang.String r14 = ""
                    goto L_0x01b0
                L_0x01aa:
                    com.ss.android.ugc.effectmanager.effect.model.Effect r14 = r15.f122471c     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r14 = r14.getEffectId()     // Catch:{ Exception -> 0x0249 }
                L_0x01b0:
                    com.ss.android.ugc.effectmanager.common.h.h r9 = r9.mo96255a(r13, r14)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r13 = "EffectDir"
                    com.ss.android.ugc.effectmanager.common.h.h r6 = r9.mo96255a(r13, r6)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r9 = "zippath"
                    com.ss.android.ugc.effectmanager.common.h.h r6 = r6.mo96255a(r9, r5)     // Catch:{ Exception -> 0x0249 }
                    org.json.JSONObject r6 = r6.mo96256b()     // Catch:{ Exception -> 0x0249 }
                    r9 = 1
                    r7.mo59187a(r8, r9, r6)     // Catch:{ Exception -> 0x0249 }
                L_0x01c8:
                    com.ss.android.ugc.effectmanager.common.a.c r6 = com.p683ss.android.ugc.effectmanager.common.p2433a.C48593c.C48594a.m105132a()     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.common.b.c r5 = r6.mo96146a(r5)     // Catch:{ Exception -> 0x0249 }
                    boolean r6 = r5 instanceof com.p683ss.android.ugc.effectmanager.common.p2433a.C48596d     // Catch:{ Exception -> 0x0249 }
                    if (r6 == 0) goto L_0x01da
                    com.ss.android.ugc.effectmanager.common.a.d r5 = (com.p683ss.android.ugc.effectmanager.common.p2433a.C48596d) r5     // Catch:{ Exception -> 0x0249 }
                    r5.mo96149a(r2)     // Catch:{ Exception -> 0x0249 }
                    goto L_0x01f0
                L_0x01da:
                    com.ss.android.ugc.effectmanager.common.h.i r5 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.f122310a     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r6 = r2.getZipPath()     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r7 = r2.getUnzipPath()     // Catch:{ Exception -> 0x0249 }
                    r5.mo96258b(r6, r7)     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.common.h.i r5 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.f122310a     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r6 = r2.getZipPath()     // Catch:{ Exception -> 0x0249 }
                    r5.mo96260b(r6)     // Catch:{ Exception -> 0x0249 }
                L_0x01f0:
                    long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0249 }
                    r7 = 0
                    long r5 = r5 - r3
                    r15.f122473g = r5     // Catch:{ Exception -> 0x0249 }
                    long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0249 }
                    r5 = 0
                    long r3 = r3 - r0
                    r15.f122472f = r3     // Catch:{ Exception -> 0x0249 }
                L_0x0200:
                    com.ss.android.ugc.effectmanager.effect.e.a.e r3 = new com.ss.android.ugc.effectmanager.effect.e.a.e     // Catch:{ Exception -> 0x0249 }
                    r3.<init>(r2, r12)     // Catch:{ Exception -> 0x0249 }
                    r15.mo96243a(r15, r3)     // Catch:{ Exception -> 0x0249 }
                    goto L_0x02fc
                L_0x020a:
                    com.ss.android.ugc.effectmanager.common.h.i r3 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.f122310a     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r15.f122471c     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r4 = r4.getZipPath()     // Catch:{ Exception -> 0x0249 }
                    r3.mo96260b(r4)     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.common.d.a r3 = new com.ss.android.ugc.effectmanager.common.d.a     // Catch:{ Exception -> 0x0249 }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r5 = "downloadMD5: "
                    r4.<init>(r5)     // Catch:{ Exception -> 0x0249 }
                    r4.append(r6)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r5 = " expectMD5:"
                    r4.append(r5)     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r15.f122471c     // Catch:{ Exception -> 0x0249 }
                    com.ss.android.ugc.effectmanager.common.model.UrlModel r5 = r5.getFileUrl()     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r5 = r5.getUri()     // Catch:{ Exception -> 0x0249 }
                    r4.append(r5)     // Catch:{ Exception -> 0x0249 }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0249 }
                    r3.<init>(r4)     // Catch:{ Exception -> 0x0249 }
                    throw r3     // Catch:{ Exception -> 0x0249 }
                L_0x023b:
                    r3 = move-exception
                    goto L_0x0245
                L_0x023d:
                    r3 = move-exception
                    r12 = r13
                    goto L_0x0244
                L_0x0240:
                    r3 = move-exception
                    r13 = r12
                    goto L_0x0245
                L_0x0243:
                    r3 = move-exception
                L_0x0244:
                    throw r3     // Catch:{ all -> 0x0240 }
                L_0x0245:
                    com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r13)     // Catch:{ Exception -> 0x0249 }
                    throw r3     // Catch:{ Exception -> 0x0249 }
                L_0x0249:
                    r3 = move-exception
                    int r4 = r10 + -1
                    if (r11 != r4) goto L_0x02ee
                    com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d
                    r0.<init>(r3)
                    java.lang.String r1 = r15.f122469a
                    java.lang.String r3 = ""
                    java.lang.String r4 = r15.f122470b
                    r0.mo96230a(r1, r3, r4)
                    java.io.File r1 = new java.io.File
                    java.lang.String r3 = r2.getZipPath()
                    r1.<init>(r3)
                    java.lang.String r1 = r1.getParent()
                    com.ss.android.ugc.effectmanager.common.a.c r3 = com.p683ss.android.ugc.effectmanager.common.p2433a.C48593c.C48594a.m105132a()
                    com.ss.android.ugc.effectmanager.common.b.c r1 = r3.mo96146a(r1)
                    boolean r3 = r1 instanceof com.p683ss.android.ugc.effectmanager.common.p2433a.C48596d
                    if (r3 == 0) goto L_0x02d8
                    com.ss.android.ugc.effectmanager.common.a.d r1 = (com.p683ss.android.ugc.effectmanager.common.p2433a.C48596d) r1
                    java.lang.String r3 = "effect"
                    p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
                    com.ss.android.ugc.effectmanager.common.b.c r3 = r1.f122168a
                    boolean r4 = r3 instanceof com.p683ss.android.ugc.effectmanager.common.p2433a.C48604i
                    if (r4 == 0) goto L_0x029f
                    com.ss.android.ugc.effectmanager.common.b.c r1 = r1.f122168a
                    if (r1 == 0) goto L_0x0297
                    com.ss.android.ugc.effectmanager.common.a.i r1 = (com.p683ss.android.ugc.effectmanager.common.p2433a.C48604i) r1
                    java.lang.String r3 = r2.getUnzipPath()
                    r1.mo96153c(r3)
                    java.lang.String r2 = r2.getZipPath()
                    r1.mo96153c(r2)
                    goto L_0x02ea
                L_0x0297:
                    d.u r0 = new d.u
                    java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.effectmanager.common.cache.OldEffectDiskLruCache"
                    r0.<init>(r1)
                    throw r0
                L_0x029f:
                    boolean r3 = r3 instanceof com.p683ss.android.ugc.effectmanager.common.p2433a.C48601h
                    if (r3 == 0) goto L_0x02ea
                    com.ss.android.ugc.effectmanager.common.b.c r1 = r1.f122168a
                    if (r1 == 0) goto L_0x02d0
                    com.ss.android.ugc.effectmanager.common.a.h r1 = (com.p683ss.android.ugc.effectmanager.common.p2433a.C48601h) r1
                    java.lang.String r3 = "effect"
                    p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = r2.getId()
                    r3.append(r4)
                    java.lang.String r4 = ".zip"
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    r1.mo96153c(r3)
                    com.ss.android.ugc.effectmanager.common.h.i r1 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.f122310a
                    java.lang.String r2 = r2.getUnzipPath()
                    r1.mo96264e(r2)
                    goto L_0x02ea
                L_0x02d0:
                    d.u r0 = new d.u
                    java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.effectmanager.common.cache.NewEffectDiskLruCache"
                    r0.<init>(r1)
                    throw r0
                L_0x02d8:
                    com.ss.android.ugc.effectmanager.common.h.i r1 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.f122310a
                    java.lang.String r3 = r2.getUnzipPath()
                    r1.mo96264e(r3)
                    com.ss.android.ugc.effectmanager.common.h.i r1 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.f122310a
                    java.lang.String r2 = r2.getZipPath()
                    r1.mo96260b(r2)
                L_0x02ea:
                    r15.mo96242a(r15, r0)
                    goto L_0x02fc
                L_0x02ee:
                    int r11 = r11 + 1
                    goto L_0x0035
                L_0x02f2:
                    com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d
                    r1 = 10003(0x2713, float:1.4017E-41)
                    r0.<init>(r1)
                    r15.mo96242a(r15, r0)
                L_0x02fc:
                    r15.mo96245b(r15)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.C48762a.C487631.mo96239a():void");
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo96243a(C48657k<C48749e> kVar, C48749e eVar) {
                String str;
                super.mo96243a(kVar, eVar);
                if (C48762a.this.f122462b != null) {
                    C48642c cVar = C48762a.this.f122462b;
                    String str2 = "effect_download_success_rate";
                    C48670h a = C48670h.m105314a().mo96255a("app_id", C48762a.this.f122463c).mo96255a("access_key", C48762a.this.f122464d).mo96254a("duration", Long.valueOf(this.f122472f)).mo96254a("unzip_time", Long.valueOf(this.f122473g));
                    String str3 = "effect_id";
                    if (this.f122471c == null) {
                        str = "";
                    } else {
                        str = this.f122471c.getEffectId();
                    }
                    cVar.mo59187a(str2, 0, a.mo96255a(str3, str).mo96254a("size", Long.valueOf(this.f122474h)).mo96256b());
                }
            }

            /* renamed from: a */
            public final void mo96242a(C48657k<C48749e> kVar, C48649d dVar) {
                String str;
                super.mo96242a(kVar, dVar);
                if (C48762a.this.f122462b != null) {
                    C48642c cVar = C48762a.this.f122462b;
                    String str2 = "effect_download_success_rate";
                    C48670h a = C48670h.m105314a().mo96255a("app_id", C48762a.this.f122463c).mo96255a("access_key", C48762a.this.f122464d);
                    String str3 = "effect_id";
                    if (this.f122471c == null) {
                        str = "";
                    } else {
                        str = this.f122471c.getEffectId();
                    }
                    cVar.mo59187a(str2, 1, a.mo96255a(str3, str).mo96253a("error_code", Integer.valueOf(dVar.f122279a)).mo96255a("error_msg", dVar.f122280b).mo96255a("download_url", this.f122469a).mo96255a("host_ip", this.f122470b).mo96256b());
                }
            }

            /* renamed from: a */
            public final void mo96241a(C48657k<C48749e> kVar, int i, long j) {
                super.mo96241a(kVar, i, j);
            }
        };
    }

    public C48762a(C48644a aVar, C48631g gVar, C48642c cVar, String str, String str2, boolean z) {
        this.f122461a = aVar;
        this.f122467g = gVar;
        this.f122462b = cVar;
        this.f122463c = str;
        this.f122464d = str2;
        this.f122466f = z;
    }
}
