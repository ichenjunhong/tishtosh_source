package com.bytedance.opensdk.core.base;

import android.content.Context;
import com.bytedance.opensdk.core.base.config.C12504a;
import com.bytedance.opensdk.core.base.config.C12504a.C12505a;
import com.bytedance.opensdk.p800b.C12471i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.opensdk.core.base.a */
public final class C12497a {

    /* renamed from: a */
    public static int f32820a = 64206;

    /* renamed from: b */
    public static final C12497a f32821b = new C12497a();

    /* renamed from: c */
    private static C12504a f32822c;

    /* renamed from: d */
    private static Context f32823d;

    private C12497a() {
    }

    /* renamed from: a */
    public final Context mo23519a() {
        m25089c();
        Context context = f32823d;
        if (context == null) {
            C52711k.m112237a("context");
        }
        return context;
    }

    /* renamed from: b */
    public final C12504a mo23522b() {
        m25089c();
        C12504a aVar = f32822c;
        if (aVar == null) {
            C52711k.m112237a("heloConfig");
        }
        return aVar;
    }

    /* renamed from: c */
    private static void m25089c() {
        if (f32822c == null || f32823d == null) {
            throw new IllegalStateException("you must call install() to init HeloSdkManager before use helo open sdk!");
        }
    }

    /* renamed from: a */
    public final C12497a mo23520a(int i) {
        m25089c();
        f32820a = 64206;
        return this;
    }

    /* renamed from: a */
    public final C12497a mo23521a(C12504a aVar, Context context) {
        C52711k.m112240b(aVar, "heloConfig");
        C52711k.m112240b(context, "context");
        f32822c = aVar;
        Context applicationContext = context.getApplicationContext();
        C52711k.m112236a((Object) applicationContext, "context.applicationContext");
        f32823d = applicationContext;
        if (C12505a.m25100a()) {
            C12471i.f32774a = 2;
        }
        return this;
    }
}
