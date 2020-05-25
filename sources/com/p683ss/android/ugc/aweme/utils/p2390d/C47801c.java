package com.p683ss.android.ugc.aweme.utils.p2390d;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.utils.d.c */
public final class C47801c {

    /* renamed from: a */
    public static int f120346a = 3;

    /* renamed from: b */
    private static int f120347b = 3;

    /* renamed from: c */
    private static int f120348c = 3;

    /* renamed from: d */
    private static int f120349d = 3;

    /* renamed from: e */
    private static int f120350e = 3;

    /* renamed from: f */
    private static int f120351f = 3;

    /* renamed from: g */
    private static int f120352g = 3;

    /* renamed from: h */
    private static int f120353h = 3;

    /* renamed from: i */
    private static int f120354i = 3;

    /* renamed from: a */
    public static boolean m103432a() {
        int i;
        if (f120347b == 3) {
            String str = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str) || !str.contains("HUAWEI")) {
                i = 2;
            } else {
                i = 1;
            }
            f120347b = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (f120347b == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m103433b() {
        int i;
        if (f120348c == 3) {
            if (!TextUtils.isEmpty(C47802d.m103436a("ro.miui.ui.version.name"))) {
                i = 1;
            } else {
                i = 2;
            }
            f120348c = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (f120348c == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m103434c() {
        int i;
        if (f120352g == 3) {
            String a = C47802d.m103436a("ro.product.brand");
            if (TextUtils.isEmpty(a) || !a.toLowerCase().contains("oppo")) {
                i = 2;
            } else {
                i = 1;
            }
            f120352g = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (f120352g == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m103435d() {
        int i;
        if (f120353h == 3) {
            String a = C47802d.m103436a("ro.vivo.os.name");
            if (TextUtils.isEmpty(a) || !a.toLowerCase().contains("funtouch")) {
                i = 2;
            } else {
                i = 1;
            }
            f120353h = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (f120353h == 1) {
            return true;
        } else {
            return false;
        }
    }
}
