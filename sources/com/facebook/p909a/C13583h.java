package com.facebook.p909a;

import android.content.Context;
import com.facebook.AccessToken;
import com.facebook.C14533n;
import com.facebook.C14699w;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14283ab;
import com.facebook.internal.C14338p;
import com.facebook.internal.C14349t;
import com.facebook.p909a.C13581g.C13582a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.a.h */
public class C13583h {

    /* renamed from: a */
    public static final String f35437a = C13583h.class.getCanonicalName();

    /* renamed from: b */
    public static ScheduledThreadPoolExecutor f35438b;

    /* renamed from: e */
    private static C13582a f35439e = C13582a.AUTO;

    /* renamed from: f */
    private static final Object f35440f = new Object();

    /* renamed from: g */
    private static String f35441g;

    /* renamed from: h */
    private static String f35442h;

    /* renamed from: c */
    private final String f35443c;

    /* renamed from: d */
    private final C13509a f35444d;

    /* renamed from: b */
    public static void m27420b() {
        C13573e.m27408a(C13586i.EXPLICIT);
    }

    /* renamed from: a */
    public static C13582a m27417a() {
        C13582a aVar;
        synchronized (f35440f) {
            aVar = f35439e;
        }
        return aVar;
    }

    /* renamed from: c */
    static String m27421c() {
        String str;
        synchronized (f35440f) {
            str = f35442h;
        }
        return str;
    }

    /* renamed from: d */
    public static void m27422d() {
        synchronized (f35440f) {
            if (f35438b == null) {
                f35438b = new ScheduledThreadPoolExecutor(1);
                f35438b.scheduleAtFixedRate(new Runnable() {
                    public final void run() {
                        HashSet<String> hashSet = new HashSet<>();
                        for (C13509a a : C13573e.f35422b.mo25397a()) {
                            hashSet.add(a.mo25337a());
                        }
                        for (String a2 : hashSet) {
                            C14338p.m29399a(a2, true);
                        }
                    }
                }, 0, 86400, TimeUnit.SECONDS);
            }
        }
    }

    /* renamed from: a */
    public static void m27419a(String str) {
        C14349t.m29408a(C14699w.DEVELOPER_ERRORS, "AppEvents", str);
    }

    /* renamed from: a */
    static String m27418a(Context context) {
        if (f35441g == null) {
            synchronized (f35440f) {
                if (f35441g == null) {
                    String string = C35807d.m80935a(context, "com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    f35441g = string;
                    if (string == null) {
                        StringBuilder sb = new StringBuilder("XZ");
                        sb.append(UUID.randomUUID().toString());
                        f35441g = sb.toString();
                        C35807d.m80935a(context, "com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", f35441g).apply();
                    }
                }
            }
        }
        return f35441g;
    }

    public C13583h(Context context, String str, AccessToken accessToken) {
        this(C14277aa.m29287c(context), str, accessToken);
    }

    C13583h(String str, String str2, AccessToken accessToken) {
        C14283ab.m29303a();
        this.f35443c = str;
        if (accessToken == null) {
            accessToken = AccessToken.m27253a();
        }
        if (!AccessToken.m27257b() || (str2 != null && !str2.equals(accessToken.f35179h))) {
            if (str2 == null) {
                str2 = C14277aa.m29250a(C14533n.m29773g());
            }
            this.f35444d = new C13509a(null, str2);
        } else {
            this.f35444d = new C13509a(accessToken);
        }
        m27422d();
    }
}
