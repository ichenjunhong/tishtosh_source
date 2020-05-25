package com.bytedance.p702im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.p702im.core.p703a.C11165c;

/* renamed from: com.bytedance.im.core.internal.utils.b */
public class C11463b {

    /* renamed from: a */
    static final String f30772a = "b";

    /* renamed from: b */
    public static int m23446b() {
        int[] a = m23445a();
        if (a == null) {
            return 0;
        }
        return a.length;
    }

    /* renamed from: a */
    public static int[] m23445a() {
        int[] iArr = C11165c.m22588a().mo20513b().f30153q;
        if (iArr == null) {
            return C11165c.m22588a().mo20513b().f30152p;
        }
        return iArr;
    }

    /* renamed from: a */
    public static float m23441a(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception e) {
            C11467e.m23465a(f30772a, (Throwable) e);
            return f;
        }
    }

    /* renamed from: a */
    public static int m23442a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            C11467e.m23465a(f30772a, (Throwable) e);
            return i;
        }
    }

    /* renamed from: a */
    public static long m23443a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            C11467e.m23465a(f30772a, (Throwable) e);
            return j;
        }
    }

    /* renamed from: a */
    public static boolean m23444a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception e) {
            C11467e.m23465a(f30772a, (Throwable) e);
            return z;
        }
    }
}
