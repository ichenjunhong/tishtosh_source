package com.p683ss.android.pushmanager;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.pushmanager.f */
public final class C19700f {

    /* renamed from: a */
    public static final Set<Integer> f54210a;

    /* renamed from: b */
    public static final String f54211b;

    /* renamed from: c */
    public static final String f54212c = C19658a.m48026a("/push/get_service_addrs/");

    /* renamed from: d */
    public static final String f54213d = C19658a.m48026a("/service/1/update_token/");

    /* renamed from: e */
    public static final String f54214e = C19658a.m48026a("/cloudpush/callback/meizu/");

    /* renamed from: f */
    public static final String f54215f = C19658a.m48026a("/cloudpush/callback/register_device/");

    /* renamed from: g */
    public static final String f54216g = C19658a.m48026a("/service/1/app_notice_status/");

    /* renamed from: h */
    public static final String f54217h = C19658a.m48026a("/cloudpush/update_sender/");

    /* renamed from: i */
    public static C19681c f54218i;

    /* renamed from: j */
    private static C19699e f54219j;

    /* renamed from: a */
    public static String m48125a(String str, String str2) {
        return C19701g.m48129a(str, str2);
    }

    /* renamed from: a */
    public static C19699e m48124a() {
        if (f54219j != null) {
            return f54219j;
        }
        throw new IllegalArgumentException("sMessageDepend is null !!!");
    }

    /* renamed from: b */
    public static C19681c m48127b() {
        if (f54218i != null) {
            return f54218i;
        }
        C19681c cVar = new C19681c();
        f54218i = cVar;
        return cVar;
    }

    static {
        HashSet hashSet = new HashSet();
        f54210a = hashSet;
        hashSet.add(Integer.valueOf(1));
        f54210a.add(Integer.valueOf(2));
        f54210a.add(Integer.valueOf(3));
        f54210a.add(Integer.valueOf(4));
        StringBuilder sb = new StringBuilder();
        sb.append(C19658a.f54156c);
        sb.append("/service/2/app_notify/");
        f54211b = sb.toString();
    }

    /* renamed from: a */
    public static void m48126a(C19699e eVar) {
        f54219j = eVar;
    }

    /* renamed from: b */
    public static String m48128b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }
}
