package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48626c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48653h;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48697b;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48698c;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.e */
public final class C48788e extends C48653h<ProviderEffect> {

    /* renamed from: d */
    public final ProviderEffect f122537d;

    /* renamed from: e */
    private final int f122538e;

    /* renamed from: f */
    private final String f122539f;

    /* renamed from: g */
    private final C48890g f122540g;

    /* renamed from: h */
    private String f122541h;

    /* renamed from: i */
    private String f122542i;

    /* renamed from: j */
    private final C48565a f122543j;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.e$a */
    public static final class C48789a extends C48626c {

        /* renamed from: a */
        final /* synthetic */ C48788e f122544a;

        /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.e$a$a */
        static final class C48790a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C48789a f122545a;

            /* renamed from: b */
            final /* synthetic */ int f122546b;

            /* renamed from: c */
            final /* synthetic */ long f122547c;

            C48790a(C48789a aVar, int i, long j) {
                this.f122545a = aVar;
                this.f122546b = i;
                this.f122547c = j;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                if (this.f122545a.f122544a.f122286b instanceof C48698c) {
                    C48650e<T> eVar = this.f122545a.f122544a.f122286b;
                    if (eVar != null) {
                        ((C48698c) eVar).mo73921a(this.f122545a.f122544a.f122537d, this.f122546b, this.f122547c);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectProgressListener");
                    }
                }
                return C52860x.f131107a;
            }
        }

        C48789a(C48788e eVar) {
            this.f122544a = eVar;
        }

        /* renamed from: a */
        public final void mo96205a(int i, long j) {
            this.f122544a.mo96235a((C52670a<C52860x>) new C48790a<C52860x>(this, i, j));
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.e$b */
    static final class C48791b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48788e f122548a;

        C48791b(C48788e eVar) {
            this.f122548a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122548a.f122286b instanceof C48697b) {
                C48650e<T> eVar = this.f122548a.f122286b;
                if (eVar != null) {
                    ((C48697b) eVar).mo73922a(this.f122548a.f122537d, new C48649d(10001));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.e$c */
    static final class C48792c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48788e f122549a;

        /* renamed from: b */
        final /* synthetic */ ProviderEffect f122550b;

        C48792c(C48788e eVar, ProviderEffect providerEffect) {
            this.f122549a = eVar;
            this.f122550b = providerEffect;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122549a.f122286b;
            if (eVar != null) {
                eVar.mo8638a(this.f122550b);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.e$d */
    static final class C48793d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48788e f122551a;

        /* renamed from: b */
        final /* synthetic */ C48649d f122552b;

        C48793d(C48788e eVar, C48649d dVar) {
            this.f122551a = eVar;
            this.f122552b = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122551a.f122286b instanceof C48697b) {
                C48650e<T> eVar = this.f122551a.f122286b;
                if (eVar != null) {
                    ((C48697b) eVar).mo73922a(this.f122551a.f122537d, this.f122552b);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
        if (this.f122286b instanceof C48697b) {
            C48650e<T> eVar = this.f122286b;
            if (eVar != null) {
                ((C48697b) eVar).mo73922a(this.f122537d, new C48649d(10001));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:6|7|(1:9)|10|11|12|13|14|(1:16)(1:17)|18|(3:32|20|21)(2:33|27)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x006c */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0081 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0086 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96229e() {
        /*
            r7 = this;
            int r0 = r7.f122538e
            r1 = 0
        L_0x0003:
            if (r1 >= r0) goto L_0x00c4
            boolean r2 = r7.f122285a
            if (r2 == 0) goto L_0x0014
            com.ss.android.ugc.effectmanager.effect.e.b.a.e$b r0 = new com.ss.android.ugc.effectmanager.effect.e.b.a.e$b
            r0.<init>(r7)
            d.f.a.a r0 = (p2628d.p2639f.p2640a.C52670a) r0
            r7.mo96235a(r0)
            return
        L_0x0014:
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r2 = r7.f122537d     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x00a2 }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x00a2 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x00a2 }
            if (r2 == 0) goto L_0x004e
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r2 = r7.f122537d     // Catch:{ Exception -> 0x00a2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a2 }
            r3.<init>()     // Catch:{ Exception -> 0x00a2 }
            com.ss.android.ugc.effectmanager.g r4 = r7.f122540g     // Catch:{ Exception -> 0x00a2 }
            java.io.File r4 = r4.f122964j     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00a2 }
            r3.append(r4)     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r4 = java.io.File.separator     // Catch:{ Exception -> 0x00a2 }
            r3.append(r4)     // Catch:{ Exception -> 0x00a2 }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r4 = r7.f122537d     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r4 = r4.getId()     // Catch:{ Exception -> 0x00a2 }
            r3.append(r4)     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r4 = ".gif"
            r3.append(r4)     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00a2 }
            r2.setPath(r3)     // Catch:{ Exception -> 0x00a2 }
        L_0x004e:
            java.lang.String r2 = r7.f122539f     // Catch:{ Exception -> 0x00a2 }
            r7.f122541h = r2     // Catch:{ Exception -> 0x00a2 }
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException | UnknownHostException -> 0x006c }
            java.lang.String r3 = r7.f122541h     // Catch:{ MalformedURLException | UnknownHostException -> 0x006c }
            r2.<init>(r3)     // Catch:{ MalformedURLException | UnknownHostException -> 0x006c }
            java.lang.String r2 = r2.getHost()     // Catch:{ MalformedURLException | UnknownHostException -> 0x006c }
            java.net.InetAddress r2 = java.net.InetAddress.getByName(r2)     // Catch:{ MalformedURLException | UnknownHostException -> 0x006c }
            java.lang.String r3 = "InetAddress.getByName(urlHost.host)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ MalformedURLException | UnknownHostException -> 0x006c }
            java.lang.String r2 = r2.getHostAddress()     // Catch:{ MalformedURLException | UnknownHostException -> 0x006c }
            r7.f122542i = r2     // Catch:{ MalformedURLException | UnknownHostException -> 0x006c }
        L_0x006c:
            java.lang.String r2 = r7.f122539f     // Catch:{ Exception -> 0x00a2 }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r3 = r7.f122537d     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x00a2 }
            com.ss.android.ugc.effectmanager.common.b r4 = new com.ss.android.ugc.effectmanager.common.b     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r5 = "GET"
            r4.<init>(r5, r2)     // Catch:{ Exception -> 0x00a2 }
            com.ss.android.ugc.effectmanager.g r2 = r7.f122540g     // Catch:{ Exception -> 0x00a2 }
            com.ss.android.ugc.effectmanager.common.f.a r2 = r2.f122977w     // Catch:{ Exception -> 0x00a2 }
            if (r2 == 0) goto L_0x0086
            java.io.InputStream r2 = r2.mo96221a(r4)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x0087
        L_0x0086:
            r2 = 0
        L_0x0087:
            long r4 = r4.f122199c     // Catch:{ Exception -> 0x00a2 }
            com.ss.android.ugc.effectmanager.effect.e.b.a.e$a r6 = new com.ss.android.ugc.effectmanager.effect.e.b.a.e$a     // Catch:{ Exception -> 0x00a2 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00a2 }
            com.ss.android.ugc.effectmanager.common.c.b r6 = (com.p683ss.android.ugc.effectmanager.common.p2436c.C48625b) r6     // Catch:{ Exception -> 0x00a2 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105305a(r2, r3, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r2 = r7.f122537d     // Catch:{ Exception -> 0x00a2 }
            if (r2 == 0) goto L_0x00c0
            com.ss.android.ugc.effectmanager.effect.e.b.a.e$c r3 = new com.ss.android.ugc.effectmanager.effect.e.b.a.e$c     // Catch:{ Exception -> 0x00a2 }
            r3.<init>(r7, r2)     // Catch:{ Exception -> 0x00a2 }
            d.f.a.a r3 = (p2628d.p2639f.p2640a.C52670a) r3     // Catch:{ Exception -> 0x00a2 }
            r7.mo96235a(r3)     // Catch:{ Exception -> 0x00a2 }
            return
        L_0x00a2:
            r2 = move-exception
            int r3 = r0 + -1
            if (r1 != r3) goto L_0x00c0
            com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d
            r0.<init>(r2)
            java.lang.String r1 = r7.f122541h
            java.lang.String r2 = ""
            java.lang.String r3 = r7.f122542i
            r0.mo96230a(r1, r2, r3)
            com.ss.android.ugc.effectmanager.effect.e.b.a.e$d r1 = new com.ss.android.ugc.effectmanager.effect.e.b.a.e$d
            r1.<init>(r7, r0)
            d.f.a.a r1 = (p2628d.p2639f.p2640a.C52670a) r1
            r7.mo96235a(r1)
            return
        L_0x00c0:
            int r1 = r1 + 1
            goto L_0x0003
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48788e.mo96229e():void");
    }

    public C48788e(C48565a aVar, ProviderEffect providerEffect, String str, Handler handler) {
        C52711k.m112240b(aVar, "mEffectContext");
        C52711k.m112240b(providerEffect, "mEffect");
        C52711k.m112240b(str, "taskFlag");
        super(handler, str);
        this.f122543j = aVar;
        this.f122537d = providerEffect;
        C48890g gVar = this.f122543j.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        this.f122538e = gVar.f122973s;
        String a = C48669g.m105306a(this.f122537d);
        C52711k.m112236a((Object) a, "EffectUtils.getUrl(mEffect)");
        this.f122539f = a;
        C48890g gVar2 = this.f122543j.f122047a;
        C52711k.m112236a((Object) gVar2, "mEffectContext.effectConfiguration");
        this.f122540g = gVar2;
    }
}
