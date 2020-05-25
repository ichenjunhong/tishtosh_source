package com.p683ss.android.ugc.aweme.follow.p1765d;

import android.util.SparseArray;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.d.c */
public final class C31873c {

    /* renamed from: a */
    static int f83252a;

    /* renamed from: b */
    static String f83253b = "";

    /* renamed from: c */
    static long f83254c;

    /* renamed from: d */
    static long f83255d;

    /* renamed from: e */
    static final SparseArray<Integer> f83256e = new SparseArray<>();

    /* renamed from: f */
    static boolean f83257f = true;

    /* renamed from: g */
    static boolean f83258g = true;

    /* renamed from: h */
    public static final C31873c f83259h = new C31873c();

    private C31873c() {
    }

    /* renamed from: a */
    public static int m74289a() {
        return f83252a;
    }

    /* renamed from: b */
    public static String m74291b() {
        return f83253b;
    }

    /* renamed from: c */
    public static long m74292c() {
        return f83254c;
    }

    /* renamed from: d */
    public static long m74293d() {
        return f83255d;
    }

    /* renamed from: a */
    public static int m74290a(int i) {
        Object obj = f83256e.get(i, Integer.valueOf(0));
        C52711k.m112236a(obj, "followTabChannelCountArray.get(channel, 0)");
        return ((Number) obj).intValue();
    }
}
