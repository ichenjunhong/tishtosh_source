package com.toutiao.proxyserver;

import android.content.Context;
import com.toutiao.proxyserver.p2610b.C51809c;
import com.toutiao.proxyserver.p2612d.C51819b;

/* renamed from: com.toutiao.proxyserver.s */
public final class C51895s {

    /* renamed from: A */
    private static long f129465A = 0;

    /* renamed from: a */
    public static volatile C51841g f129466a = null;

    /* renamed from: b */
    public static volatile C51843h f129467b = null;

    /* renamed from: c */
    public static volatile C51809c f129468c = null;

    /* renamed from: d */
    public static volatile Context f129469d = null;

    /* renamed from: e */
    public static volatile String f129470e = null;

    /* renamed from: f */
    public static volatile C51880o f129471f = null;

    /* renamed from: g */
    public static volatile C51866n f129472g = null;

    /* renamed from: h */
    public static volatile C51865m f129473h = null;

    /* renamed from: i */
    public static volatile C51864l f129474i = null;

    /* renamed from: j */
    public static volatile boolean f129475j = false;

    /* renamed from: k */
    public static volatile boolean f129476k = true;

    /* renamed from: l */
    public static int f129477l = 8192;

    /* renamed from: m */
    public static int f129478m = 10;

    /* renamed from: n */
    public static volatile boolean f129479n = true;

    /* renamed from: o */
    public static boolean f129480o = false;

    /* renamed from: p */
    public static boolean f129481p = true;

    /* renamed from: q */
    public static boolean f129482q = false;

    /* renamed from: r */
    public static boolean f129483r = true;

    /* renamed from: s */
    public static boolean f129484s = false;

    /* renamed from: t */
    public static volatile boolean f129485t = false;

    /* renamed from: u */
    public static volatile int f129486u = 0;

    /* renamed from: v */
    public static volatile C51819b f129487v = null;

    /* renamed from: w */
    public static volatile boolean f129488w = true;

    /* renamed from: x */
    public static boolean f129489x = false;

    /* renamed from: y */
    public static boolean f129490y = false;

    /* renamed from: z */
    public static volatile boolean f129491z = true;

    /* renamed from: a */
    public static Context m111276a() {
        return f129469d;
    }

    /* renamed from: b */
    public static C51880o m111279b() {
        return f129471f;
    }

    /* renamed from: e */
    public static C51843h m111282e() {
        return f129467b;
    }

    /* renamed from: f */
    public static C51841g m111283f() {
        return f129466a;
    }

    /* renamed from: d */
    public static synchronized long m111281d() {
        long j;
        synchronized (C51895s.class) {
            j = f129465A;
        }
        return j;
    }

    /* renamed from: c */
    public static synchronized long m111280c() {
        long j;
        synchronized (C51895s.class) {
            j = 1;
            if (f129465A < Long.MAX_VALUE) {
                j = 1 + f129465A;
            }
            f129465A = j;
        }
        return j;
    }

    /* renamed from: a */
    public static void m111277a(int i, String str) {
        if (f129474i != null) {
            f129474i.mo95379a(i, str);
        }
    }

    /* renamed from: a */
    public static void m111278a(int i, String str, String str2) {
        if (f129473h != null) {
            f129473h.mo95378a(i, str, str2);
        }
    }
}
