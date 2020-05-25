package com.p683ss.android.ugc.aweme.opensdk.p2040c;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import com.p683ss.android.ugc.aweme.common.C26855c;
import com.p683ss.android.ugc.aweme.opensdk.C38488b;
import com.p683ss.android.ugc.aweme.opensdk.C38513g;
import kotlinx.coroutines.C53199ae;
import kotlinx.coroutines.C53225av;
import kotlinx.coroutines.C53256be;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.opensdk.c.b */
public final class C38502b {

    /* renamed from: d */
    public static final C38503a f97960d = new C38503a(null);

    /* renamed from: a */
    public final C0198r<C26855c> f97961a = new C0198r<>();

    /* renamed from: b */
    public final C0198r<Boolean> f97962b = new C0198r<>();

    /* renamed from: c */
    public final C38513g f97963c;

    /* renamed from: com.ss.android.ugc.aweme.opensdk.c.b$a */
    public static final class C38503a {
        private C38503a() {
        }

        public /* synthetic */ C38503a(C52707g gVar) {
            this();
        }
    }

    @C52618f(mo110254b = "ShareFromSysActionHelper.kt", mo110255c = {35, 47, 54, 72, 88, 95}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.opensdk.viewmodel.ShareFromSysActionHelper$dealWithMedia$1")
    /* renamed from: com.ss.android.ugc.aweme.opensdk.c.b$b */
    static final class C38504b extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        Object f97964a;

        /* renamed from: b */
        Object f97965b;

        /* renamed from: c */
        boolean f97966c;

        /* renamed from: d */
        boolean f97967d;

        /* renamed from: e */
        boolean f97968e;

        /* renamed from: f */
        boolean f97969f;

        /* renamed from: g */
        int f97970g;

        /* renamed from: h */
        final /* synthetic */ C38502b f97971h;

        /* renamed from: i */
        final /* synthetic */ C38488b f97972i;

        /* renamed from: j */
        final /* synthetic */ String f97973j;

        /* renamed from: k */
        final /* synthetic */ Activity f97974k;

        /* renamed from: l */
        private C53199ae f97975l;

        C38504b(C38502b bVar, C38488b bVar2, String str, Activity activity, C52625c cVar) {
            this.f97971h = bVar;
            this.f97972i = bVar2;
            this.f97973j = str;
            this.f97974k = activity;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C38504b bVar = new C38504b(this.f97971h, this.f97972i, this.f97973j, this.f97974k, cVar);
            bVar.f97975l = (C53199ae) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C38504b) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x007e, code lost:
            r3 = r0;
            r2 = ((java.lang.Boolean) r2).booleanValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0085, code lost:
            if (r2 != false) goto L_0x0095;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0087, code lost:
            r7.f97971h.f97962b.setValue(p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0094, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0095, code lost:
            r0 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85820a(r7.f97974k);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x009b, code lost:
            if (r0 == false) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
            r7.f97971h.f97962b.setValue(p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00aa, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ab, code lost:
            r4 = r7.f97974k;
            r7.f97964a = r3;
            r7.f97966c = r2;
            r7.f97967d = r0;
            r7.f97970g = 2;
            r4 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85818a(r4, (p2628d.p2631c.C52625c<? super java.lang.Boolean>) r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ba, code lost:
            if (r4 != r8) goto L_0x00bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bc, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bd, code lost:
            r4 = ((java.lang.Boolean) r4).booleanValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c3, code lost:
            if (r4 != false) goto L_0x00e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c5, code lost:
            com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21543b((android.content.Context) r7.f97974k, (int) com.ss.android.ugc.trill.R.string.co0, 0).mo19066a();
            r7.f97971h.f97962b.setValue(p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e0, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e1, code lost:
            r5 = r7.f97974k;
            r7.f97964a = r3;
            r7.f97966c = r2;
            r7.f97967d = r0;
            r7.f97968e = r4;
            r7.f97970g = 3;
            r5 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85821b(r5, (p2628d.p2631c.C52625c<? super java.lang.Boolean>) r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f2, code lost:
            if (r5 != r8) goto L_0x00f5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f4, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f5, code lost:
            r6 = r3;
            r3 = r4;
            r4 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f8, code lost:
            r0 = ((java.lang.Boolean) r5).booleanValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fe, code lost:
            if (r0 != false) goto L_0x011c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0100, code lost:
            com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21543b((android.content.Context) r7.f97974k, (int) com.ss.android.ugc.trill.R.string.at3, 0).mo19066a();
            r7.f97971h.f97962b.setValue(p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x011b, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x011c, code lost:
            r5 = new com.p683ss.android.ugc.aweme.opensdk.C38505d(r7.f97971h.f97963c, r7.f97974k);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0135, code lost:
            if (r7.f97971h.f97963c.f97992a == com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85847b()) goto L_0x01cb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0141, code lost:
            if (r7.f97971h.f97963c.f97992a != com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85849d()) goto L_0x0145;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x014f, code lost:
            if (r7.f97971h.f97963c.f97992a == com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85846a()) goto L_0x015d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x015b, code lost:
            if (r7.f97971h.f97963c.f97992a != com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85848c()) goto L_0x022d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0169, code lost:
            if (com.bytedance.common.utility.p522b.C9376b.m18558a((java.util.Collection<T>) r7.f97971h.f97963c.f97993b) == false) goto L_0x0187;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x016b, code lost:
            com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c((android.content.Context) r7.f97974k, (int) com.ss.android.ugc.trill.R.string.dhq).mo19066a();
            r7.f97971h.f97962b.setValue(p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0186, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0191, code lost:
            if (r7.f97971h.f97963c.f97993b.size() <= 12) goto L_0x01a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0193, code lost:
            r7.f97971h.f97962b.setValue(p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x01a0, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a1, code lost:
            r7.f97964a = r6;
            r7.f97966c = r2;
            r7.f97967d = r4;
            r7.f97968e = r3;
            r7.f97969f = r0;
            r7.f97965b = r5;
            r7.f97970g = 5;
            r10 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85822b(r5, (p2628d.p2631c.C52625c<? super com.p683ss.android.ugc.aweme.opensdk.C38483a>) r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b4, code lost:
            if (r10 != r8) goto L_0x01b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x01b6, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x01bb, code lost:
            if (((com.p683ss.android.ugc.aweme.opensdk.C38483a) r10).f97902a != false) goto L_0x022d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x01bd, code lost:
            r7.f97971h.f97962b.setValue(p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ca, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d7, code lost:
            if (com.bytedance.common.utility.p522b.C9376b.m18558a((java.util.Collection<T>) r7.f97971h.f97963c.f97993b) == false) goto L_0x01e7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d9, code lost:
            r7.f97971h.f97962b.setValue(p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x01e6, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f1, code lost:
            if (r7.f97971h.f97963c.f97993b.size() <= 12) goto L_0x0201;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x01f3, code lost:
            r7.f97971h.f97962b.setValue(p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0200, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0201, code lost:
            r10 = r7.f97972i;
            r7.f97964a = r6;
            r7.f97966c = r2;
            r7.f97967d = r4;
            r7.f97968e = r3;
            r7.f97969f = r0;
            r7.f97965b = r5;
            r7.f97970g = 4;
            r10 = r10.mo78402a(r5, (p2628d.p2631c.C52625c<? super com.p683ss.android.ugc.aweme.opensdk.C38483a>) r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0216, code lost:
            if (r10 != r8) goto L_0x0219;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0218, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x021d, code lost:
            if (((com.p683ss.android.ugc.aweme.opensdk.C38483a) r10).f97902a != false) goto L_0x022d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x021f, code lost:
            r7.f97971h.f97962b.setValue(p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x022c, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x022d, code lost:
            r1 = r7.f97972i;
            r10 = r7.f97974k;
            r12 = r7.f97971h.f97963c;
            r13 = r7.f97971h.f97961a.getValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x023e, code lost:
            if (r13 != null) goto L_0x0243;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0240, code lost:
            p2628d.p2639f.p2641b.C52711k.m112234a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0243, code lost:
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, "baseShare.value!!");
            r13 = (com.p683ss.android.ugc.aweme.common.C26855c) r13;
            r14 = new com.p683ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse();
            r7.f97964a = r6;
            r7.f97966c = r2;
            r7.f97967d = r4;
            r7.f97968e = r3;
            r7.f97969f = r0;
            r7.f97965b = r5;
            r7.f97970g = 6;
            r0 = r1.mo78401a(r10, false, r12, r13, r14, r16);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x026a, code lost:
            if (r0 != r8) goto L_0x026d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x026c, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0273, code lost:
            if (((java.lang.Boolean) r0).booleanValue() == false) goto L_0x0280;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x0275, code lost:
            r7.f97971h.f97962b.setValue(p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(true));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0282, code lost:
            return p2628d.C52860x.f131107a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r7 = r16
                java.lang.Object r8 = p2628d.p2631c.p2632a.C52601b.m112157a()
                int r0 = r7.f97970g
                r9 = 1
                r1 = 0
                switch(r0) {
                    case 0: goto L_0x006d;
                    case 1: goto L_0x0066;
                    case 2: goto L_0x005b;
                    case 3: goto L_0x0049;
                    case 4: goto L_0x0031;
                    case 5: goto L_0x0019;
                    case 6: goto L_0x0015;
                    default: goto L_0x000d;
                }
            L_0x000d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0015:
                r0 = r17
                goto L_0x026d
            L_0x0019:
                java.lang.Object r0 = r7.f97965b
                com.ss.android.ugc.aweme.opensdk.d r0 = (com.p683ss.android.ugc.aweme.opensdk.C38505d) r0
                boolean r2 = r7.f97969f
                boolean r3 = r7.f97968e
                boolean r4 = r7.f97967d
                boolean r5 = r7.f97966c
                java.lang.Object r6 = r7.f97964a
                kotlinx.coroutines.ae r6 = (kotlinx.coroutines.C53199ae) r6
                r10 = r17
                r15 = r5
                r5 = r0
                r0 = r2
                r2 = r15
                goto L_0x01b7
            L_0x0031:
                java.lang.Object r0 = r7.f97965b
                com.ss.android.ugc.aweme.opensdk.d r0 = (com.p683ss.android.ugc.aweme.opensdk.C38505d) r0
                boolean r2 = r7.f97969f
                boolean r3 = r7.f97968e
                boolean r4 = r7.f97967d
                boolean r5 = r7.f97966c
                java.lang.Object r6 = r7.f97964a
                kotlinx.coroutines.ae r6 = (kotlinx.coroutines.C53199ae) r6
                r10 = r17
                r15 = r5
                r5 = r0
                r0 = r2
                r2 = r15
                goto L_0x0219
            L_0x0049:
                boolean r0 = r7.f97968e
                boolean r2 = r7.f97967d
                boolean r3 = r7.f97966c
                java.lang.Object r4 = r7.f97964a
                kotlinx.coroutines.ae r4 = (kotlinx.coroutines.C53199ae) r4
                r5 = r17
                r6 = r4
                r4 = r2
                r2 = r3
                r3 = r0
                goto L_0x00f8
            L_0x005b:
                boolean r0 = r7.f97967d
                boolean r2 = r7.f97966c
                java.lang.Object r3 = r7.f97964a
                kotlinx.coroutines.ae r3 = (kotlinx.coroutines.C53199ae) r3
                r4 = r17
                goto L_0x00bd
            L_0x0066:
                java.lang.Object r0 = r7.f97964a
                kotlinx.coroutines.ae r0 = (kotlinx.coroutines.C53199ae) r0
                r2 = r17
                goto L_0x007e
            L_0x006d:
                kotlinx.coroutines.ae r0 = r7.f97975l
                java.lang.String r2 = r7.f97973j
                android.app.Activity r3 = r7.f97974k
                r7.f97964a = r0
                r7.f97970g = r9
                java.lang.Object r2 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85819a(r2, r3, r7)
                if (r2 != r8) goto L_0x007e
                return r8
            L_0x007e:
                r3 = r0
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0095
                com.ss.android.ugc.aweme.opensdk.c.b r0 = r7.f97971h
                android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f97962b
                java.lang.Boolean r1 = p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(r1)
                r0.setValue(r1)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x0095:
                android.app.Activity r0 = r7.f97974k
                boolean r0 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85820a(r0)
                if (r0 == 0) goto L_0x00ab
                com.ss.android.ugc.aweme.opensdk.c.b r0 = r7.f97971h
                android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f97962b
                java.lang.Boolean r1 = p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(r1)
                r0.setValue(r1)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x00ab:
                android.app.Activity r4 = r7.f97974k
                r7.f97964a = r3
                r7.f97966c = r2
                r7.f97967d = r0
                r5 = 2
                r7.f97970g = r5
                java.lang.Object r4 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85818a(r4, r7)
                if (r4 != r8) goto L_0x00bd
                return r8
            L_0x00bd:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L_0x00e1
                android.app.Activity r0 = r7.f97974k
                android.content.Context r0 = (android.content.Context) r0
                r2 = 2132547288(0x7f1c16d8, float:2.0747818E38)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21543b(r0, r2, r1)
                r0.mo19066a()
                com.ss.android.ugc.aweme.opensdk.c.b r0 = r7.f97971h
                android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f97962b
                java.lang.Boolean r1 = p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(r1)
                r0.setValue(r1)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x00e1:
                android.app.Activity r5 = r7.f97974k
                r7.f97964a = r3
                r7.f97966c = r2
                r7.f97967d = r0
                r7.f97968e = r4
                r6 = 3
                r7.f97970g = r6
                java.lang.Object r5 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85821b(r5, r7)
                if (r5 != r8) goto L_0x00f5
                return r8
            L_0x00f5:
                r6 = r3
                r3 = r4
                r4 = r0
            L_0x00f8:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r0 = r5.booleanValue()
                if (r0 != 0) goto L_0x011c
                android.app.Activity r0 = r7.f97974k
                android.content.Context r0 = (android.content.Context) r0
                r2 = 2132544190(0x7f1c0abe, float:2.0741534E38)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21543b(r0, r2, r1)
                r0.mo19066a()
                com.ss.android.ugc.aweme.opensdk.c.b r0 = r7.f97971h
                android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f97962b
                java.lang.Boolean r1 = p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(r1)
                r0.setValue(r1)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x011c:
                com.ss.android.ugc.aweme.opensdk.d r5 = new com.ss.android.ugc.aweme.opensdk.d
                com.ss.android.ugc.aweme.opensdk.c.b r10 = r7.f97971h
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97963c
                android.app.Activity r11 = r7.f97974k
                android.content.Context r11 = (android.content.Context) r11
                r5.<init>(r10, r11)
                com.ss.android.ugc.aweme.opensdk.c.b r10 = r7.f97971h
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97963c
                int r10 = r10.f97992a
                int r11 = com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85847b()
                r12 = 12
                if (r10 == r11) goto L_0x01cb
                com.ss.android.ugc.aweme.opensdk.c.b r10 = r7.f97971h
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97963c
                int r10 = r10.f97992a
                int r11 = com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85849d()
                if (r10 != r11) goto L_0x0145
                goto L_0x01cb
            L_0x0145:
                com.ss.android.ugc.aweme.opensdk.c.b r10 = r7.f97971h
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97963c
                int r10 = r10.f97992a
                int r11 = com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85846a()
                if (r10 == r11) goto L_0x015d
                com.ss.android.ugc.aweme.opensdk.c.b r10 = r7.f97971h
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97963c
                int r10 = r10.f97992a
                int r11 = com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85848c()
                if (r10 != r11) goto L_0x022d
            L_0x015d:
                com.ss.android.ugc.aweme.opensdk.c.b r10 = r7.f97971h
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97963c
                java.util.List<java.lang.String> r10 = r10.f97993b
                java.util.Collection r10 = (java.util.Collection) r10
                boolean r10 = com.bytedance.common.utility.p522b.C9376b.m18558a(r10)
                if (r10 == 0) goto L_0x0187
                android.app.Activity r0 = r7.f97974k
                android.content.Context r0 = (android.content.Context) r0
                r2 = 2132549109(0x7f1c1df5, float:2.0751511E38)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r0, r2)
                r0.mo19066a()
                com.ss.android.ugc.aweme.opensdk.c.b r0 = r7.f97971h
                android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f97962b
                java.lang.Boolean r1 = p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(r1)
                r0.setValue(r1)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x0187:
                com.ss.android.ugc.aweme.opensdk.c.b r10 = r7.f97971h
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97963c
                java.util.List<java.lang.String> r10 = r10.f97993b
                int r10 = r10.size()
                if (r10 <= r12) goto L_0x01a1
                com.ss.android.ugc.aweme.opensdk.c.b r0 = r7.f97971h
                android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f97962b
                java.lang.Boolean r1 = p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(r1)
                r0.setValue(r1)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x01a1:
                r7.f97964a = r6
                r7.f97966c = r2
                r7.f97967d = r4
                r7.f97968e = r3
                r7.f97969f = r0
                r7.f97965b = r5
                r10 = 5
                r7.f97970g = r10
                java.lang.Object r10 = com.p683ss.android.ugc.aweme.opensdk.C38488b.m85822b(r5, r7)
                if (r10 != r8) goto L_0x01b7
                return r8
            L_0x01b7:
                com.ss.android.ugc.aweme.opensdk.a r10 = (com.p683ss.android.ugc.aweme.opensdk.C38483a) r10
                boolean r10 = r10.f97902a
                if (r10 != 0) goto L_0x022d
                com.ss.android.ugc.aweme.opensdk.c.b r0 = r7.f97971h
                android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f97962b
                java.lang.Boolean r1 = p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(r1)
                r0.setValue(r1)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x01cb:
                com.ss.android.ugc.aweme.opensdk.c.b r10 = r7.f97971h
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97963c
                java.util.List<java.lang.String> r10 = r10.f97993b
                java.util.Collection r10 = (java.util.Collection) r10
                boolean r10 = com.bytedance.common.utility.p522b.C9376b.m18558a(r10)
                if (r10 == 0) goto L_0x01e7
                com.ss.android.ugc.aweme.opensdk.c.b r0 = r7.f97971h
                android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f97962b
                java.lang.Boolean r1 = p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(r1)
                r0.setValue(r1)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x01e7:
                com.ss.android.ugc.aweme.opensdk.c.b r10 = r7.f97971h
                com.ss.android.ugc.aweme.opensdk.g r10 = r10.f97963c
                java.util.List<java.lang.String> r10 = r10.f97993b
                int r10 = r10.size()
                if (r10 <= r12) goto L_0x0201
                com.ss.android.ugc.aweme.opensdk.c.b r0 = r7.f97971h
                android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f97962b
                java.lang.Boolean r1 = p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(r1)
                r0.setValue(r1)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x0201:
                com.ss.android.ugc.aweme.opensdk.b r10 = r7.f97972i
                r7.f97964a = r6
                r7.f97966c = r2
                r7.f97967d = r4
                r7.f97968e = r3
                r7.f97969f = r0
                r7.f97965b = r5
                r11 = 4
                r7.f97970g = r11
                java.lang.Object r10 = r10.mo78402a(r5, r7)
                if (r10 != r8) goto L_0x0219
                return r8
            L_0x0219:
                com.ss.android.ugc.aweme.opensdk.a r10 = (com.p683ss.android.ugc.aweme.opensdk.C38483a) r10
                boolean r10 = r10.f97902a
                if (r10 != 0) goto L_0x022d
                com.ss.android.ugc.aweme.opensdk.c.b r0 = r7.f97971h
                android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f97962b
                java.lang.Boolean r1 = p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(r1)
                r0.setValue(r1)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            L_0x022d:
                com.ss.android.ugc.aweme.opensdk.b r1 = r7.f97972i
                android.app.Activity r10 = r7.f97974k
                r11 = 0
                com.ss.android.ugc.aweme.opensdk.c.b r12 = r7.f97971h
                com.ss.android.ugc.aweme.opensdk.g r12 = r12.f97963c
                com.ss.android.ugc.aweme.opensdk.c.b r13 = r7.f97971h
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.common.c> r13 = r13.f97961a
                java.lang.Object r13 = r13.getValue()
                if (r13 != 0) goto L_0x0243
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0243:
                java.lang.String r14 = "baseShare.value!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)
                com.ss.android.ugc.aweme.common.c r13 = (com.p683ss.android.ugc.aweme.common.C26855c) r13
                com.ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse r14 = new com.ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse
                r14.<init>()
                r7.f97964a = r6
                r7.f97966c = r2
                r7.f97967d = r4
                r7.f97968e = r3
                r7.f97969f = r0
                r7.f97965b = r5
                r0 = 6
                r7.f97970g = r0
                r0 = r1
                r1 = r10
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r16
                java.lang.Object r0 = r0.mo78401a(r1, r2, r3, r4, r5, r6)
                if (r0 != r8) goto L_0x026d
                return r8
            L_0x026d:
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x0280
                com.ss.android.ugc.aweme.opensdk.c.b r0 = r7.f97971h
                android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f97962b
                java.lang.Boolean r1 = p2628d.p2631c.p2633b.p2634a.C52614b.m112161a(r9)
                r0.setValue(r1)
            L_0x0280:
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.opensdk.p2040c.C38502b.C38504b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C38502b(C38513g gVar) {
        C52711k.m112240b(gVar, "shareDistinctType");
        this.f97963c = gVar;
    }

    /* renamed from: a */
    public final void mo78408a(String str, Activity activity) {
        C52711k.m112240b(str, "event");
        C52711k.m112240b(activity, "activity");
        C38488b bVar = new C38488b();
        C53199ae aeVar = C53256be.f131885a;
        C52628e b = C53225av.m113074b();
        C38504b bVar2 = new C38504b(this, bVar, str, activity, null);
        C53301g.m113291a(aeVar, b, null, bVar2, 2, null);
    }
}
