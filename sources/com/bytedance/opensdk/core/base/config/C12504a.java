package com.bytedance.opensdk.core.base.config;

import com.bytedance.opensdk.core.base.p808c.C12502a;
import com.bytedance.opensdk.core.p805b.C12496a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.opensdk.core.base.config.a */
public final class C12504a {

    /* renamed from: f */
    public static boolean f32836f;

    /* renamed from: g */
    public static final C12505a f32837g = new C12505a(null);

    /* renamed from: a */
    public final String f32838a;

    /* renamed from: b */
    public final String f32839b;

    /* renamed from: c */
    public AppConfig f32840c;

    /* renamed from: d */
    public final C12502a f32841d;

    /* renamed from: e */
    public C12496a f32842e;

    /* renamed from: com.bytedance.opensdk.core.base.config.a$a */
    public static final class C12505a {
        private C12505a() {
        }

        /* renamed from: a */
        public static boolean m25100a() {
            return C12504a.f32836f;
        }

        public /* synthetic */ C12505a(C52707g gVar) {
            this();
        }
    }

    public C12504a(String str, String str2, AppConfig appConfig, C12502a aVar, C12496a aVar2) {
        C52711k.m112240b(str, "heloClientKey");
        C52711k.m112240b(str2, "hostClientKey");
        C52711k.m112240b(appConfig, "appConfig");
        C52711k.m112240b(aVar, "networkClient");
        C52711k.m112240b(aVar2, "eventTracker");
        this.f32838a = str;
        this.f32839b = str2;
        this.f32840c = appConfig;
        this.f32841d = aVar;
        this.f32842e = aVar2;
    }
}
