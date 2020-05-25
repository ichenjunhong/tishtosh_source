package com.p683ss.android.ugc.aweme.discover.mob;

import android.view.View;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.mob.C28386ag.C28387a;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.ab */
public final class C28381ab implements C28420y {

    /* renamed from: b */
    public static boolean f74511b;

    /* renamed from: c */
    public static boolean f74512c;

    /* renamed from: d */
    public static boolean f74513d;

    /* renamed from: e */
    static int f74514e;

    /* renamed from: f */
    static int f74515f = -1;

    /* renamed from: g */
    public static int f74516g;

    /* renamed from: h */
    public static int f74517h;

    /* renamed from: i */
    public static final C28381ab f74518i = new C28381ab();

    /* renamed from: j */
    private static final HashMap<Integer, String> f74519j = new HashMap<>();

    /* renamed from: k */
    private static String f74520k = "";

    /* renamed from: l */
    private static String f74521l = "";

    private C28381ab() {
    }

    /* renamed from: b */
    public static String m67354b() {
        return f74520k;
    }

    /* renamed from: c */
    public static String m67357c() {
        return f74521l;
    }

    /* renamed from: d */
    public static final C28381ab m67359d() {
        return f74518i;
    }

    /* renamed from: e */
    public static int m67360e() {
        return f74516g;
    }

    /* renamed from: a */
    public static boolean m67353a() {
        return f74511b;
    }

    /* renamed from: a */
    public static void m67352a(boolean z) {
        f74511b = z;
    }

    /* renamed from: b */
    public static void m67355b(int i) {
        f74516g = i;
    }

    /* renamed from: c */
    public static void m67358c(boolean z) {
        f74513d = z;
    }

    /* renamed from: b */
    public static void m67356b(boolean z) {
        f74512c = z;
    }

    /* renamed from: a */
    public final String mo56813a(int i) {
        return (String) f74519j.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m67349a(int i, String str) {
        C52711k.m112240b(str, "searchId");
        f74519j.put(Integer.valueOf(i), str);
    }

    /* renamed from: a */
    public static void m67350a(View view, String str, int i) {
        if (view != null) {
            C27797ad a = C28387a.m67363a(view);
            f74514e = a.mo56233a();
            f74521l = a.f73041d;
            if (str == null) {
                str = "";
            }
            f74520k = str;
            f74515f = i;
        }
    }
}
