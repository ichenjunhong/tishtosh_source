package com.bytedance.android.live.core.p224c;

import android.text.TextUtils;
import com.p683ss.p2544b.p2545a.C51151a;

/* renamed from: com.bytedance.android.live.core.c.a */
public final class C3831a {
    /* renamed from: a */
    public static void m9707a(String str, String str2) {
        m9704a(3, str, str2);
    }

    /* renamed from: c */
    public static void m9715c(String str, String str2) {
        m9704a(5, str, str2);
    }

    /* renamed from: d */
    public static void m9716d(String str, String str2) {
        m9704a(6, str, str2);
    }

    /* renamed from: b */
    public static void m9712b(String str, String str2) {
        m9704a(4, str, str2);
    }

    /* renamed from: a */
    public static void m9709a(String str, Throwable th) {
        m9711b(5, str, null, th);
    }

    /* renamed from: b */
    public static void m9714b(String str, Throwable th) {
        m9711b(6, str, null, th);
    }

    /* renamed from: a */
    public static void m9706a(int i, String str, StackTraceElement[] stackTraceElementArr) {
        C51151a.m110013a(i, str, stackTraceElementArr);
    }

    /* renamed from: b */
    public static void m9710b(int i, String str, String str2) {
        C51151a.m110012a(i, str, str2);
    }

    /* renamed from: a */
    public static void m9708a(String str, String str2, Throwable th) {
        m9711b(5, str, str2, th);
    }

    /* renamed from: b */
    public static void m9713b(String str, String str2, Throwable th) {
        m9711b(6, str, str2, th);
    }

    /* renamed from: a */
    public static void m9704a(int i, String str, String str2) {
        switch (i) {
            case 2:
                C51151a.m110015a(str, str2);
                return;
            case 3:
                C51151a.m110018b(str, str2);
                return;
            case 4:
                C51151a.m110021c(str, str2);
                return;
            case 5:
                C51151a.m110022d(str, str2);
                return;
            case 6:
                C51151a.m110023e(str, str2);
                break;
        }
    }

    /* renamed from: b */
    private static void m9711b(int i, String str, String str2, Throwable th) {
        m9705a(i, str, str2, th);
    }

    /* renamed from: a */
    private static void m9705a(int i, String str, String str2, Throwable th) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        switch (i) {
            case 5:
                if (isEmpty) {
                    C51151a.m110017a(str, th);
                    return;
                } else {
                    C51151a.m110016a(str, str2, th);
                    return;
                }
            case 6:
                if (!isEmpty) {
                    C51151a.m110019b(str, str2, th);
                    break;
                } else {
                    C51151a.m110020b(str, th);
                    return;
                }
        }
    }
}
