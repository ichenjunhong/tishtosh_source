package com.bytedance.liko.p771a;

import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.liko.a.c */
public final class C12267c {

    /* renamed from: a */
    public static int f32371a = 20;

    /* renamed from: b */
    public static float f32372b = 0.8f;

    /* renamed from: c */
    public static boolean f32373c = true;

    /* renamed from: d */
    public static final C12267c f32374d = new C12267c();

    /* renamed from: e */
    private static boolean f32375e;

    /* renamed from: f */
    private static long f32376f = 180000;

    /* renamed from: g */
    private static JSONObject f32377g = new JSONObject();

    private C12267c() {
    }

    /* renamed from: b */
    public static long m24748b() {
        return f32376f;
    }

    /* renamed from: c */
    public static JSONObject m24749c() {
        return f32377g;
    }

    /* renamed from: a */
    public static boolean m24747a() {
        return f32375e;
    }

    /* renamed from: a */
    public static void m24746a(boolean z) {
        f32375e = z;
    }

    /* renamed from: a */
    public static void m24745a(JSONObject jSONObject) {
        C52711k.m112240b(jSONObject, "<set-?>");
        f32377g = jSONObject;
    }
}
