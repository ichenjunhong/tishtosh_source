package com.p683ss.android.ugc.aweme.property;

import android.arch.lifecycle.C0198r;
import android.support.p030v4.app.FragmentActivity;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.utils.C47655a;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.property.y */
public final class C40830y implements C40814s {

    /* renamed from: a */
    private final String f103970a = this.f103976g.mo83087f();

    /* renamed from: b */
    private final C0198r<C40803n> f103971b = this.f103976g.mo83083b();

    /* renamed from: c */
    private final C0198r<Integer> f103972c = this.f103976g.mo83085d();

    /* renamed from: d */
    private final C0198r<String> f103973d = this.f103976g.mo83086e();

    /* renamed from: e */
    private final C0198r<C40829x> f103974e = this.f103976g.mo83082a();

    /* renamed from: f */
    private final FragmentActivity f103975f;

    /* renamed from: g */
    private final C40815t f103976g;

    /* renamed from: com.ss.android.ugc.aweme.property.y$a */
    static final class C40831a extends C52712l implements C52671b<C40776c, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f103977a;

        C40831a(String str) {
            this.f103977a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C40776c cVar = (C40776c) obj;
            C52711k.m112240b(cVar, "it");
            return Boolean.valueOf(C52830p.m112455b((CharSequence) cVar.mo83094b(), (CharSequence) this.f103977a, true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.y$b */
    static final class C40832b extends C52712l implements C52671b<C40776c, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f103978a;

        C40832b(String str) {
            this.f103978a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C40776c cVar = (C40776c) obj;
            C52711k.m112240b(cVar, "it");
            boolean z = true;
            if (!C52830p.m112455b((CharSequence) cVar.f103885c, (CharSequence) this.f103978a, true) && !C52830p.m112455b((CharSequence) cVar.f103884b, (CharSequence) this.f103978a, true)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.y$c */
    static final class C40833c extends C52712l implements C52671b<C40776c, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f103979a;

        C40833c(String str) {
            this.f103979a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C40776c cVar = (C40776c) obj;
            C52711k.m112240b(cVar, "it");
            boolean z = false;
            if (C52711k.m112239a((Object) this.f103979a, (Object) "#")) {
                z = C47655a.m103153a(cVar.mo83094b().charAt(0));
            } else if (C47655a.m103155b(cVar.mo83094b().charAt(0))) {
                String a = C47655a.m103152a(String.valueOf(cVar.mo83094b().charAt(0)));
                C52711k.m112236a((Object) a, "AVCharacterUtil.hanziToP…chineseKey[0].toString())");
                if (a != null) {
                    String lowerCase = a.toLowerCase();
                    C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                    String str = this.f103979a;
                    if (str != null) {
                        String lowerCase2 = str.toLowerCase();
                        C52711k.m112236a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                        if (C52711k.m112239a((Object) lowerCase, (Object) lowerCase2)) {
                            z = true;
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.y$d */
    static final class C40834d extends C52712l implements C52671b<C40776c, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f103980a;

        C40834d(String str) {
            this.f103980a = str;
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r5, (java.lang.Object) r0) != false) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
            if (com.p683ss.android.ugc.aweme.utils.C47655a.m103153a(r5.f103885c.charAt(0)) == false) goto L_0x0067;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.property.c r5 = (com.p683ss.android.ugc.aweme.property.C40776c) r5
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
                java.lang.String r0 = r4.f103980a
                java.lang.String r1 = "#"
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0022
                java.lang.String r5 = r5.f103885c
                char r5 = r5.charAt(r2)
                boolean r5 = com.p683ss.android.ugc.aweme.utils.C47655a.m103153a(r5)
                if (r5 != 0) goto L_0x0020
                goto L_0x0067
            L_0x0020:
                r1 = 0
                goto L_0x0067
            L_0x0022:
                java.lang.String r0 = r5.f103885c
                char r0 = r0.charAt(r2)
                boolean r0 = com.p683ss.android.ugc.aweme.utils.C47655a.m103153a(r0)
                if (r0 == 0) goto L_0x0020
                java.lang.String r5 = r5.f103885c
                char r5 = r5.charAt(r2)
                java.lang.String r5 = java.lang.String.valueOf(r5)
                if (r5 == 0) goto L_0x005f
                java.lang.String r5 = r5.toLowerCase()
                java.lang.String r0 = "(this as java.lang.String).toLowerCase()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
                java.lang.String r0 = r4.f103980a
                if (r0 == 0) goto L_0x0057
                java.lang.String r0 = r0.toLowerCase()
                java.lang.String r3 = "(this as java.lang.String).toLowerCase()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
                boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r0)
                if (r5 == 0) goto L_0x0020
                goto L_0x0067
            L_0x0057:
                d.u r5 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r5.<init>(r0)
                throw r5
            L_0x005f:
                d.u r5 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r5.<init>(r0)
                throw r5
            L_0x0067:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.property.C40830y.C40834d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: b */
    public final C0198r<C40803n> mo83148b() {
        return this.f103971b;
    }

    /* renamed from: c */
    public final C0198r<Integer> mo83150c() {
        return this.f103972c;
    }

    /* renamed from: d */
    public final C0198r<String> mo83151d() {
        return this.f103973d;
    }

    /* renamed from: e */
    public final C0198r<C40829x> mo83152e() {
        return this.f103974e;
    }

    /* renamed from: a */
    public final void mo83146a() {
        if (C52711k.m112239a((Object) this.f103970a, (Object) "VESDK")) {
            C40835z.m90307a(Toast.makeText(this.f103975f, "更改 VESDK AB 后重启 APP 生效~", 1));
        }
    }

    /* renamed from: a */
    public final void mo83147a(String str) {
        C52711k.m112240b(str, "searchStr");
        if (((C40829x) this.f103976g.mo83082a().getValue()) == C40829x.Chinese) {
            C0198r b = this.f103976g.mo83083b();
            C40803n a = this.f103976g.mo83084c().mo83126a((C52671b<? super C40776c, Boolean>) new C40831a<Object,Boolean>(str));
            a.mo83127a();
            b.setValue(a);
            return;
        }
        C0198r b2 = this.f103976g.mo83083b();
        C40803n a2 = this.f103976g.mo83084c().mo83126a((C52671b<? super C40776c, Boolean>) new C40832b<Object,Boolean>(str));
        a2.mo83129b();
        b2.setValue(a2);
    }

    /* renamed from: b */
    public final void mo83149b(String str) {
        C52711k.m112240b(str, "searchStr");
        if (((C40829x) this.f103976g.mo83082a().getValue()) == C40829x.Chinese) {
            C0198r d = this.f103976g.mo83085d();
            Object value = this.f103976g.mo83083b().getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            d.setValue(Integer.valueOf(((C40803n) value).mo83128b(new C40833c(str))));
            return;
        }
        C0198r d2 = this.f103976g.mo83085d();
        Object value2 = this.f103976g.mo83083b().getValue();
        if (value2 == null) {
            C52711k.m112234a();
        }
        d2.setValue(Integer.valueOf(((C40803n) value2).mo83128b(new C40834d(str))));
    }

    public C40830y(FragmentActivity fragmentActivity, C40815t tVar) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(tVar, "viewModel");
        this.f103975f = fragmentActivity;
        this.f103976g = tVar;
    }
}
