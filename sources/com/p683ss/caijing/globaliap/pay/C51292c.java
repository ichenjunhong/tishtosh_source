package com.p683ss.caijing.globaliap.pay;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.caijing.globaliap.pay.c */
public final class C51292c {

    /* renamed from: a */
    public static ArrayList<String> f128060a;

    /* renamed from: b */
    private static volatile boolean f128061b;

    /* renamed from: c */
    private static ConcurrentHashMap<String, Bundle> f128062c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static Context f128063d;

    /* renamed from: b */
    public static Context m110280b() {
        return f128063d;
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f128060a = arrayList;
        arrayList.add("GOOGLE_PAY");
    }

    /* renamed from: a */
    public static synchronized String m110275a() {
        synchronized (C51292c.class) {
            if (f128061b) {
                return null;
            }
            f128061b = true;
            String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            Random random = new Random();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 15; i++) {
                sb.append(str.charAt(random.nextInt(62)));
            }
            String sb2 = sb.toString();
            f128062c.put(sb2, new Bundle());
            return sb2;
        }
    }

    /* renamed from: a */
    public static void m110276a(Context context) {
        if (context != null && f128063d == null) {
            f128063d = context.getApplicationContext();
        }
    }

    /* renamed from: a */
    public static synchronized boolean m110277a(String str) {
        synchronized (C51292c.class) {
            if (!TextUtils.isEmpty(str)) {
                f128061b = false;
                if (!f128062c.containsKey(str)) {
                    StringBuilder sb = new StringBuilder("process ");
                    sb.append(str);
                    sb.append(" is not in processing");
                    return false;
                }
                f128062c.remove(str);
                return true;
            }
            throw new IllegalStateException("processId is null");
        }
    }

    /* renamed from: a */
    public static synchronized boolean m110278a(String str, String str2, Bundle bundle) {
        synchronized (C51292c.class) {
            Bundle bundle2 = (Bundle) f128062c.get(str);
            if (bundle2 == null) {
                return false;
            }
            if (bundle != null) {
                bundle2.putBundle(str2, bundle);
            }
            return true;
        }
    }

    /* renamed from: b */
    public static synchronized String m110281b(String str, String str2, String str3) {
        synchronized (C51292c.class) {
            Bundle bundle = (Bundle) f128062c.get(str);
            if (bundle == null) {
                return str3;
            }
            String string = bundle.getString(str2, str3);
            return string;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m110279a(String str, String str2, String str3) {
        synchronized (C51292c.class) {
            Bundle bundle = (Bundle) f128062c.get(str);
            if (bundle == null) {
                return false;
            }
            bundle.putString(str2, str3);
            return true;
        }
    }
}
