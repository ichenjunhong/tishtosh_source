package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.ugc.asve.sandbox.p1251b.C20685i;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20685i.C20686a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20688j;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.d */
public final class C20623d {

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.d$a */
    static final class C20624a extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C20685i f56474a;

        C20624a(C20685i iVar) {
            this.f56474a = iVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.f56474a.mo43780a(((Number) obj).intValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.d$b */
    public static final class C20625b extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C20688j f56475a;

        public C20625b(C20688j jVar) {
            this.f56475a = jVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.f56475a.mo43782a(((Number) obj).intValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public static final C20686a m51959a(C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(bVar, "$this$toSandboxIntResultCallback");
        return new C20646u(bVar);
    }

    /* renamed from: a */
    public static final C52671b<Integer, C52860x> m51960a(C20685i iVar) {
        C52711k.m112240b(iVar, "$this$convert");
        return new C20624a<>(iVar);
    }
}
