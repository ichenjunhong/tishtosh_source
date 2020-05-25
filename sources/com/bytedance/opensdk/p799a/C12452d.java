package com.bytedance.opensdk.p799a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.opensdk.core.C12480a;
import com.bytedance.opensdk.core.base.C12497a;
import com.bytedance.opensdk.core.base.config.AppConfig;
import com.bytedance.opensdk.core.base.p806a.C12498a;
import com.bytedance.opensdk.core.base.p806a.C12499b;
import com.bytedance.opensdk.core.base.p809ui.p810a.C12511a;
import com.bytedance.opensdk.core.grant.model.GrantInfo;
import com.bytedance.opensdk.core.grant.p813a.C12518a;
import com.bytedance.opensdk.core.p801a.p802a.C12483b;
import com.bytedance.opensdk.core.p801a.p802a.C12486c;
import com.bytedance.opensdk.core.p801a.p803b.C12489b;
import com.bytedance.opensdk.core.p801a.p803b.C12490c;
import com.bytedance.opensdk.p800b.C12473k;
import com.bytedance.opensdk.p800b.C12477n;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.util.List;
import kotlinx.coroutines.C53199ae;
import kotlinx.coroutines.C53200af;
import kotlinx.coroutines.C53225av;
import kotlinx.coroutines.C53263bl;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.p2633b.p2634a.C52616d;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.opensdk.a.d */
public final class C12452d implements C12451c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f32742a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C12452d.class), "jobContext", "getJobContext()Lkotlinx/coroutines/Job;"))};

    /* renamed from: b */
    public C12518a f32743b;

    /* renamed from: c */
    private final C52668f f32744c;

    /* renamed from: d */
    private C12483b f32745d;

    /* renamed from: e */
    private C12486c f32746e;

    /* renamed from: f */
    private C12498a f32747f;

    /* renamed from: com.bytedance.opensdk.a.d$a */
    public static final class C12453a {

        /* renamed from: a */
        public String f32748a;

        /* renamed from: b */
        public String f32749b;

        /* renamed from: a */
        public final C12451c mo23499a() {
            C12453a aVar = this;
            if (aVar.f32749b == null || aVar.f32748a == null) {
                throw new IllegalStateException("you must init all these necessary properties before use builder!");
            }
            C12473k kVar = C12473k.f32778a;
            C12477n nVar = C12477n.f32780a;
            Context a = C12497a.f32821b.mo23519a();
            C52711k.m112240b(a, "context");
            String packageName = a.getPackageName();
            C52711k.m112236a((Object) packageName, "context.packageName");
            List a2 = C12477n.m25077a(a, packageName);
            int i = C12497a.f32821b.mo23522b().f32840c.f32831c;
            Context a3 = C12497a.f32821b.mo23519a();
            C52711k.m112240b(a3, "context");
            String packageName2 = a3.getPackageName();
            C52711k.m112236a((Object) packageName2, "context.packageName");
            C12483b bVar = new C12483b(new C12489b(a2, i, packageName2, C12497a.f32821b.mo23522b().f32839b));
            C12473k kVar2 = C12473k.f32778a;
            String str = this.f32748a;
            if (str == null) {
                C52711k.m112237a("hostAuthTicketDomain");
            }
            String str2 = this.f32749b;
            if (str2 == null) {
                C52711k.m112237a("hostAuthCodeDomain");
            }
            C52711k.m112240b(str, "ticketDomain");
            C52711k.m112240b(str2, "codeDomain");
            C12490c cVar = new C12490c(str, str2, null, null, C12497a.f32821b.mo23522b().f32840c.f32831c, C12497a.f32821b.mo23522b().f32838a, 12, null);
            C12486c cVar2 = new C12486c(cVar);
            AppConfig appConfig = C12497a.f32821b.mo23522b().f32840c;
            C52711k.m112240b(appConfig, "appConfig");
            C12452d dVar = new C12452d(bVar, cVar2, new C12518a(appConfig), new C12498a(), null);
            return dVar;
        }

        /* renamed from: a */
        public final void mo23500a(String str) {
            C52711k.m112240b(str, "<set-?>");
            this.f32748a = str;
        }

        /* renamed from: b */
        public final void mo23501b(String str) {
            C52711k.m112240b(str, "<set-?>");
            this.f32749b = str;
        }
    }

    @C52618f(mo110254b = "HeloOpenApiImpl.kt", mo110255c = {120, 125}, mo110256d = "auth", mo110257e = "com.bytedance.opensdk.api.HeloOpenApiImpl")
    /* renamed from: com.bytedance.opensdk.a.d$b */
    static final class C12454b extends C52616d {

        /* renamed from: a */
        /* synthetic */ Object f32750a;

        /* renamed from: b */
        int f32751b;

        /* renamed from: c */
        final /* synthetic */ C12452d f32752c;

        /* renamed from: d */
        Object f32753d;

        /* renamed from: e */
        Object f32754e;

        C12454b(C12452d dVar, C52625c cVar) {
            this.f32752c = dVar;
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f32750a = obj;
            this.f32751b |= DynamicTabYellowPointVersion.DEFAULT;
            return this.f32752c.mo23498a(this);
        }
    }

    /* renamed from: com.bytedance.opensdk.a.d$c */
    public static final class C12455c implements C12499b {

        /* renamed from: a */
        final /* synthetic */ int f32755a;

        /* renamed from: b */
        final /* synthetic */ C12449a f32756b;

        C12455c(int i, C12449a aVar) {
            this.f32755a = i;
            this.f32756b = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x005f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo23503a(int r4, int r5, android.content.Intent r6) {
            /*
                r3 = this;
                int r0 = r3.f32755a
                if (r0 != r4) goto L_0x006f
                r4 = 0
                if (r6 == 0) goto L_0x000e
                java.lang.String r0 = "result"
                java.lang.String r6 = r6.getStringExtra(r0)
                goto L_0x000f
            L_0x000e:
                r6 = r4
            L_0x000f:
                com.google.gson.f r0 = com.bytedance.opensdk.core.C12495b.m25087a()     // Catch:{ Exception -> 0x001c }
                java.lang.Class<com.bytedance.opensdk.core.c.a.a> r1 = com.bytedance.opensdk.core.p811c.p812a.C12514a.class
                java.lang.Object r6 = r0.mo34884a(r6, r1)     // Catch:{ Exception -> 0x001c }
                com.bytedance.opensdk.core.c.a.a r6 = (com.bytedance.opensdk.core.p811c.p812a.C12514a) r6     // Catch:{ Exception -> 0x001c }
                goto L_0x001d
            L_0x001c:
                r6 = r4
            L_0x001d:
                r0 = 0
                if (r6 == 0) goto L_0x0025
                boolean r1 = r6.mo23524a()
                goto L_0x0026
            L_0x0025:
                r1 = 0
            L_0x0026:
                r2 = -1
                if (r5 != r2) goto L_0x0041
                if (r1 == 0) goto L_0x0041
                com.bytedance.opensdk.a.b r5 = new com.bytedance.opensdk.a.b
                if (r6 == 0) goto L_0x0032
                java.lang.String r1 = r6.f32827b
                goto L_0x0033
            L_0x0032:
                r1 = r4
            L_0x0033:
                if (r6 == 0) goto L_0x003d
                T r6 = r6.f32828c
                com.bytedance.opensdk.core.c.a.b r6 = (com.bytedance.opensdk.core.p811c.p812a.C12515b) r6
                if (r6 == 0) goto L_0x003d
                java.lang.String r4 = r6.f32825c
            L_0x003d:
                r5.<init>(r0, r1, r4)
                goto L_0x006a
            L_0x0041:
                com.bytedance.opensdk.a.b r5 = new com.bytedance.opensdk.a.b
                if (r6 == 0) goto L_0x0054
                T r0 = r6.f32828c
                com.bytedance.opensdk.core.c.a.b r0 = (com.bytedance.opensdk.core.p811c.p812a.C12515b) r0
                if (r0 == 0) goto L_0x0054
                java.lang.Integer r0 = r0.f32826d
                if (r0 == 0) goto L_0x0054
                int r0 = r0.intValue()
                goto L_0x0055
            L_0x0054:
                r0 = 1
            L_0x0055:
                if (r6 == 0) goto L_0x005c
                java.lang.String r1 = r6.mo23525b()
                goto L_0x005d
            L_0x005c:
                r1 = r4
            L_0x005d:
                if (r6 == 0) goto L_0x0067
                T r6 = r6.f32828c
                com.bytedance.opensdk.core.c.a.b r6 = (com.bytedance.opensdk.core.p811c.p812a.C12515b) r6
                if (r6 == 0) goto L_0x0067
                java.lang.String r4 = r6.f32825c
            L_0x0067:
                r5.<init>(r0, r1, r4)
            L_0x006a:
                com.bytedance.opensdk.a.a r4 = r3.f32756b
                r4.mo23494a(r5)
            L_0x006f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.opensdk.p799a.C12452d.C12455c.mo23503a(int, int, android.content.Intent):void");
        }
    }

    @C52618f(mo110254b = "HeloOpenApiImpl.kt", mo110255c = {82, 84, 92}, mo110256d = "invokeSuspend", mo110257e = "com.bytedance.opensdk.api.HeloOpenApiImpl$grant$2")
    /* renamed from: com.bytedance.opensdk.a.d$d */
    static final class C12456d extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        Object f32757a;

        /* renamed from: b */
        int f32758b;

        /* renamed from: c */
        final /* synthetic */ C12452d f32759c;

        /* renamed from: d */
        final /* synthetic */ C52523a f32760d;

        /* renamed from: e */
        final /* synthetic */ AppCompatActivity f32761e;

        /* renamed from: f */
        final /* synthetic */ GrantInfo f32762f;

        /* renamed from: g */
        final /* synthetic */ C12449a f32763g;

        /* renamed from: h */
        private C53199ae f32764h;

        C12456d(C12452d dVar, C52523a aVar, AppCompatActivity appCompatActivity, GrantInfo grantInfo, C12449a aVar2, C52625c cVar) {
            this.f32759c = dVar;
            this.f32760d = aVar;
            this.f32761e = appCompatActivity;
            this.f32762f = grantInfo;
            this.f32763g = aVar2;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C12456d dVar = new C12456d(this.f32759c, this.f32760d, this.f32761e, this.f32762f, this.f32763g, cVar);
            dVar.f32764h = (C53199ae) obj;
            return dVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C12456d) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
            r1 = (com.bytedance.opensdk.core.p801a.C12481a) r11;
            r11 = kotlinx.coroutines.C53225av.m113074b();
            r2 = new com.bytedance.opensdk.p799a.C12452d.C12456d.C124571(r10, null);
            r10.f32757a = r1;
            r10.f32758b = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
            if (kotlinx.coroutines.C53299e.m113284a(r11, r2, r10) != r0) goto L_0x0061;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
            if (r1.f32797a != 0) goto L_0x00aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
            if (r1.f32798b == null) goto L_0x00aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
            r11 = r10.f32759c.f32743b;
            r2 = r10.f32761e;
            r6 = r10.f32762f;
            r7 = r1.f32798b;
            r10.f32757a = r1;
            r10.f32758b = 3;
            r3 = new com.bytedance.opensdk.core.grant.config.GrantConfig(r6.f32876c, r11.f32867a, r6, r7, com.bytedance.opensdk.core.C12480a.GRANT, r11.f32867a.f32835g);
            r11 = new android.content.Intent(r2, com.bytedance.opensdk.core.grant.web.WebGrantActivity.class);
            r11.putExtra("bind_config", r3);
            r2.startActivityForResult(r11, r3.f32872e.getRequestCodeInt());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a7, code lost:
            if (p2628d.C52860x.f131107a != r0) goto L_0x00ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a9, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00aa, code lost:
            r10.f32763g.mo23494a(new com.bytedance.opensdk.p799a.C12450b(r1.f32797a, r1.f32799c, r1.f32800d));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bc, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p2628d.p2631c.p2632a.C52601b.m112157a()
                int r1 = r10.f32758b
                switch(r1) {
                    case 0: goto L_0x0034;
                    case 1: goto L_0x002a;
                    case 2: goto L_0x001c;
                    case 3: goto L_0x0011;
                    default: goto L_0x0009;
                }
            L_0x0009:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0011:
                boolean r0 = r11 instanceof p2628d.C52848o.C52850b
                if (r0 != 0) goto L_0x0017
                goto L_0x00ba
            L_0x0017:
                d.o$b r11 = (p2628d.C52848o.C52850b) r11
                java.lang.Throwable r11 = r11.exception
                throw r11
            L_0x001c:
                java.lang.Object r1 = r10.f32757a
                com.bytedance.opensdk.core.a.a r1 = (com.bytedance.opensdk.core.p801a.C12481a) r1
                boolean r2 = r11 instanceof p2628d.C52848o.C52850b
                if (r2 != 0) goto L_0x0025
                goto L_0x0061
            L_0x0025:
                d.o$b r11 = (p2628d.C52848o.C52850b) r11
                java.lang.Throwable r11 = r11.exception
                throw r11
            L_0x002a:
                boolean r1 = r11 instanceof p2628d.C52848o.C52850b
                if (r1 != 0) goto L_0x002f
                goto L_0x0044
            L_0x002f:
                d.o$b r11 = (p2628d.C52848o.C52850b) r11
                java.lang.Throwable r11 = r11.exception
                throw r11
            L_0x0034:
                boolean r1 = r11 instanceof p2628d.C52848o.C52850b
                if (r1 != 0) goto L_0x00bd
                com.bytedance.opensdk.a.d r11 = r10.f32759c
                r1 = 1
                r10.f32758b = r1
                java.lang.Object r11 = r11.mo23498a(r10)
                if (r11 != r0) goto L_0x0044
                return r0
            L_0x0044:
                r1 = r11
                com.bytedance.opensdk.core.a.a r1 = (com.bytedance.opensdk.core.p801a.C12481a) r1
                kotlinx.coroutines.bw r11 = kotlinx.coroutines.C53225av.m113074b()
                d.c.e r11 = (p2628d.p2631c.C52628e) r11
                com.bytedance.opensdk.a.d$d$1 r2 = new com.bytedance.opensdk.a.d$d$1
                r3 = 0
                r2.<init>(r10, r3)
                d.f.a.m r2 = (p2628d.p2639f.p2640a.C52682m) r2
                r10.f32757a = r1
                r3 = 2
                r10.f32758b = r3
                java.lang.Object r11 = kotlinx.coroutines.C53299e.m113284a(r11, r2, r10)
                if (r11 != r0) goto L_0x0061
                return r0
            L_0x0061:
                int r11 = r1.f32797a
                if (r11 != 0) goto L_0x00aa
                java.lang.String r11 = r1.f32798b
                if (r11 == 0) goto L_0x00aa
                com.bytedance.opensdk.a.d r11 = r10.f32759c
                com.bytedance.opensdk.core.grant.a.a r11 = r11.f32743b
                android.support.v7.app.AppCompatActivity r2 = r10.f32761e
                android.app.Activity r2 = (android.app.Activity) r2
                com.bytedance.opensdk.core.grant.model.GrantInfo r6 = r10.f32762f
                java.lang.String r7 = r1.f32798b
                r10.f32757a = r1
                r1 = 3
                r10.f32758b = r1
                com.bytedance.opensdk.core.grant.config.GrantConfig r1 = new com.bytedance.opensdk.core.grant.config.GrantConfig
                int r4 = r6.f32876c
                com.bytedance.opensdk.core.base.config.AppConfig r5 = r11.f32867a
                com.bytedance.opensdk.core.a r8 = com.bytedance.opensdk.core.C12480a.GRANT
                com.bytedance.opensdk.core.base.config.AppConfig r11 = r11.f32867a
                java.util.Locale r9 = r11.f32835g
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9)
                android.content.Intent r11 = new android.content.Intent
                r3 = r2
                android.content.Context r3 = (android.content.Context) r3
                java.lang.Class<com.bytedance.opensdk.core.grant.web.WebGrantActivity> r4 = com.bytedance.opensdk.core.grant.web.WebGrantActivity.class
                r11.<init>(r3, r4)
                java.lang.String r3 = "bind_config"
                r4 = r1
                android.os.Parcelable r4 = (android.os.Parcelable) r4
                r11.putExtra(r3, r4)
                com.bytedance.opensdk.core.a r1 = r1.f32872e
                int r1 = r1.getRequestCodeInt()
                r2.startActivityForResult(r11, r1)
                d.x r11 = p2628d.C52860x.f131107a
                if (r11 != r0) goto L_0x00ba
                return r0
            L_0x00aa:
                com.bytedance.opensdk.a.a r11 = r10.f32763g
                com.bytedance.opensdk.a.b r0 = new com.bytedance.opensdk.a.b
                int r2 = r1.f32797a
                java.lang.String r3 = r1.f32799c
                java.lang.String r1 = r1.f32800d
                r0.<init>(r2, r3, r1)
                r11.mo23494a(r0)
            L_0x00ba:
                d.x r11 = p2628d.C52860x.f131107a
                return r11
            L_0x00bd:
                d.o$b r11 = (p2628d.C52848o.C52850b) r11
                java.lang.Throwable r11 = r11.exception
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.opensdk.p799a.C12452d.C12456d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.bytedance.opensdk.a.d$e */
    static final class C12458e extends C52712l implements C52670a<C53263bl> {

        /* renamed from: a */
        public static final C12458e f32768a = new C12458e();

        C12458e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C53270bq.m113187a(null, 1, null);
        }
    }

    /* renamed from: b */
    private final C53263bl m25038b() {
        return (C53263bl) this.f32744c.getValue();
    }

    /* renamed from: a */
    public final void mo23495a() {
        m25038b().mo110868m();
        this.f32747f.f32824a.clear();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo23498a(p2628d.p2631c.C52625c<? super com.bytedance.opensdk.core.p801a.C12481a> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.bytedance.opensdk.p799a.C12452d.C12454b
            if (r0 == 0) goto L_0x0014
            r0 = r9
            com.bytedance.opensdk.a.d$b r0 = (com.bytedance.opensdk.p799a.C12452d.C12454b) r0
            int r1 = r0.f32751b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r9 = r0.f32751b
            int r9 = r9 - r2
            r0.f32751b = r9
            goto L_0x0019
        L_0x0014:
            com.bytedance.opensdk.a.d$b r0 = new com.bytedance.opensdk.a.d$b
            r0.<init>(r8, r9)
        L_0x0019:
            java.lang.Object r9 = r0.f32750a
            java.lang.Object r1 = p2628d.p2631c.p2632a.C52601b.m112157a()
            int r2 = r0.f32751b
            r3 = 0
            r4 = 1
            switch(r2) {
                case 0: goto L_0x0047;
                case 1: goto L_0x0039;
                case 2: goto L_0x002e;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x002e:
            boolean r0 = r9 instanceof p2628d.C52848o.C52850b
            if (r0 != 0) goto L_0x0034
            goto L_0x012b
        L_0x0034:
            d.o$b r9 = (p2628d.C52848o.C52850b) r9
            java.lang.Throwable r9 = r9.exception
            throw r9
        L_0x0039:
            java.lang.Object r2 = r0.f32753d
            com.bytedance.opensdk.a.d r2 = (com.bytedance.opensdk.p799a.C12452d) r2
            boolean r5 = r9 instanceof p2628d.C52848o.C52850b
            if (r5 != 0) goto L_0x0042
            goto L_0x009d
        L_0x0042:
            d.o$b r9 = (p2628d.C52848o.C52850b) r9
            java.lang.Throwable r9 = r9.exception
            throw r9
        L_0x0047:
            boolean r2 = r9 instanceof p2628d.C52848o.C52850b
            if (r2 != 0) goto L_0x012e
            com.bytedance.opensdk.core.a.a.b r9 = r8.f32745d
            r0.f32753d = r8
            r0.f32751b = r4
            T r2 = r9.f32801a
            com.bytedance.opensdk.core.a.b.b r2 = (com.bytedance.opensdk.core.p801a.p803b.C12489b) r2
            int r2 = r2.f32806b
            T r5 = r9.f32801a
            com.bytedance.opensdk.core.a.b.b r5 = (com.bytedance.opensdk.core.p801a.p803b.C12489b) r5
            java.lang.String r5 = r5.f32808d
            com.bytedance.opensdk.core.a.a.b$b r9 = r9.mo23515a(r2, r5)
            java.lang.String r2 = "receiver$0"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r2)
            boolean r2 = r9.mo23524a()
            if (r2 == 0) goto L_0x0078
            com.bytedance.opensdk.core.a.a r9 = new com.bytedance.opensdk.core.a.a
            java.lang.String r2 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r9.<init>(r3, r2, r5, r6)
            goto L_0x0099
        L_0x0078:
            com.bytedance.opensdk.core.a.a r2 = new com.bytedance.opensdk.core.a.a
            T r5 = r9.f32828c
            com.bytedance.opensdk.core.a.a.b$a r5 = (com.bytedance.opensdk.core.p801a.p802a.C12483b.C12484a) r5
            java.lang.Integer r5 = r5.f32826d
            if (r5 == 0) goto L_0x0087
            int r5 = r5.intValue()
            goto L_0x0089
        L_0x0087:
            r5 = 300(0x12c, float:4.2E-43)
        L_0x0089:
            java.lang.String r6 = ""
            java.lang.String r7 = r9.mo23525b()
            T r9 = r9.f32828c
            com.bytedance.opensdk.core.a.a.b$a r9 = (com.bytedance.opensdk.core.p801a.p802a.C12483b.C12484a) r9
            java.lang.String r9 = r9.f32825c
            r2.<init>(r5, r6, r7, r9)
            r9 = r2
        L_0x0099:
            if (r9 != r1) goto L_0x009c
            return r1
        L_0x009c:
            r2 = r8
        L_0x009d:
            com.bytedance.opensdk.core.a.a r9 = (com.bytedance.opensdk.core.p801a.C12481a) r9
            int r5 = r9.f32797a
            if (r5 == 0) goto L_0x00a4
            return r9
        L_0x00a4:
            com.bytedance.opensdk.core.a.a.c r5 = r2.f32746e
            r0.f32753d = r2
            r0.f32754e = r9
            r9 = 2
            r0.f32751b = r9
            T r9 = r5.f32801a
            com.bytedance.opensdk.core.a.b.c r9 = (com.bytedance.opensdk.core.p801a.p803b.C12490c) r9
            int r9 = r9.f32813e
            com.bytedance.opensdk.core.a.c.d r9 = r5.mo23517a(r9)
            com.bytedance.opensdk.core.a.a.c$a r0 = new com.bytedance.opensdk.core.a.a.c$a
            r0.<init>(r5)
            d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
            java.lang.String r2 = "getCodeAction"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            r2 = 0
            if (r9 == 0) goto L_0x011d
            boolean r5 = r9.mo23524a()
            if (r5 == 0) goto L_0x00fa
            T r5 = r9.f32828c
            com.bytedance.opensdk.core.a.c.c r5 = (com.bytedance.opensdk.core.p801a.p804c.C12493c) r5
            java.lang.String r5 = r5.f32817a
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x00dd
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00de
        L_0x00dd:
            r3 = 1
        L_0x00de:
            if (r3 != 0) goto L_0x00e8
            java.lang.Object r9 = r0.invoke(r5)
            com.bytedance.opensdk.core.a.a r9 = (com.bytedance.opensdk.core.p801a.C12481a) r9
            r0 = r9
            goto L_0x0118
        L_0x00e8:
            com.bytedance.opensdk.core.a.a r0 = new com.bytedance.opensdk.core.a.a
            r3 = 102(0x66, float:1.43E-43)
            java.lang.String r4 = r9.mo23525b()
            T r9 = r9.f32828c
            com.bytedance.opensdk.core.a.c.c r9 = (com.bytedance.opensdk.core.p801a.p804c.C12493c) r9
            java.lang.String r9 = r9.f32825c
            r0.<init>(r3, r2, r4, r9)
            goto L_0x0118
        L_0x00fa:
            com.bytedance.opensdk.core.a.a r0 = new com.bytedance.opensdk.core.a.a
            T r3 = r9.f32828c
            com.bytedance.opensdk.core.a.c.c r3 = (com.bytedance.opensdk.core.p801a.p804c.C12493c) r3
            java.lang.Integer r3 = r3.f32826d
            if (r3 == 0) goto L_0x0109
            int r3 = r3.intValue()
            goto L_0x010b
        L_0x0109:
            r3 = 101(0x65, float:1.42E-43)
        L_0x010b:
            java.lang.String r4 = r9.mo23525b()
            T r9 = r9.f32828c
            com.bytedance.opensdk.core.a.c.c r9 = (com.bytedance.opensdk.core.p801a.p804c.C12493c) r9
            java.lang.String r9 = r9.f32825c
            r0.<init>(r3, r2, r4, r9)
        L_0x0118:
            if (r0 != 0) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            r9 = r0
            goto L_0x0128
        L_0x011d:
            com.bytedance.opensdk.core.a.a r9 = new com.bytedance.opensdk.core.a.a
            r0 = 100
            java.lang.String r3 = "error: 100"
            java.lang.String r4 = "ticket resp null error!"
            r9.<init>(r0, r2, r3, r4)
        L_0x0128:
            if (r9 != r1) goto L_0x012b
            return r1
        L_0x012b:
            com.bytedance.opensdk.core.a.a r9 = (com.bytedance.opensdk.core.p801a.C12481a) r9
            return r9
        L_0x012e:
            d.o$b r9 = (p2628d.C52848o.C52850b) r9
            java.lang.Throwable r9 = r9.exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.opensdk.p799a.C12452d.mo23498a(d.c.c):java.lang.Object");
    }

    /* renamed from: a */
    public final void mo23496a(int i, int i2, Intent intent) {
        C12499b bVar = (C12499b) this.f32747f.f32824a.get(Integer.valueOf(i));
        if (bVar != null) {
            bVar.mo23503a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public final void mo23497a(GrantInfo grantInfo, AppCompatActivity appCompatActivity, C12449a aVar) {
        C52711k.m112240b(grantInfo, "grantInfo");
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(aVar, "callback");
        C52524a aVar2 = C52523a.f130793a;
        C52523a aVar3 = new C52523a();
        Bundle bundle = new Bundle();
        bundle.putString("hint", null);
        aVar3.setArguments(bundle);
        C0654k supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        if (supportFragmentManager != null) {
            try {
                supportFragmentManager.mo2234b();
            } catch (Exception unused) {
            }
        }
        if (!aVar3.isAdded()) {
            C12511a aVar4 = aVar3;
            String str = "LoadingDialog";
            C52711k.m112240b(aVar4, "dialogFragment");
            C52711k.m112240b(str, "tag");
            try {
                aVar4.show(supportFragmentManager, str);
            } catch (Exception unused2) {
            }
        }
        int requestCodeInt = C12480a.GRANT.getRequestCodeInt();
        C12498a aVar5 = this.f32747f;
        C12499b cVar = new C12455c(requestCodeInt, aVar);
        C52711k.m112240b(cVar, "callback");
        aVar5.f32824a.put(Integer.valueOf(requestCodeInt), cVar);
        C53199ae a = C53200af.m113027a(m25038b().plus(C53225av.m113075c()));
        C12456d dVar = new C12456d(this, aVar3, appCompatActivity, grantInfo, aVar, null);
        C53301g.m113291a(a, null, null, dVar, 3, null);
    }

    private C12452d(C12483b bVar, C12486c cVar, C12518a aVar, C12498a aVar2) {
        this.f32745d = bVar;
        this.f32746e = cVar;
        this.f32743b = aVar;
        this.f32747f = aVar2;
        this.f32744c = C52732g.m112285a(C12458e.f32768a);
    }

    public /* synthetic */ C12452d(C12483b bVar, C12486c cVar, C12518a aVar, C12498a aVar2, C52707g gVar) {
        this(bVar, cVar, aVar, aVar2);
    }
}
