package com.p683ss.android.ugc.aweme.framework.p1780a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.framework.a.a */
public class C32458a {

    /* renamed from: a */
    public static volatile boolean f84531a;

    /* renamed from: b */
    private static CopyOnWriteArrayList<C32460c> f84532b;

    /* renamed from: c */
    private static Context f84533c;

    /* renamed from: d */
    private static boolean f84534d;

    /* renamed from: a */
    public static void m75141a(int i, String str, String str2) {
        C32459b.m75152a(i, str, str2);
    }

    /* renamed from: a */
    public static void m75143a(Exception exc) {
        m75145a("", exc);
    }

    /* renamed from: a */
    public static void m75144a(String str) {
        m75141a(3, null, str);
    }

    /* renamed from: a */
    public static void m75148a(Throwable th) {
        if (f84531a && f84532b != null) {
            Iterator it = f84532b.iterator();
            while (it.hasNext()) {
                C32460c cVar = (C32460c) it.next();
                if (cVar != null && cVar.mo46950a()) {
                    cVar.mo46949a(cVar.mo46951b(), th);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m75150b(String str, String str2) {
        m75141a(2, str, str2);
    }

    /* renamed from: a */
    public static void m75146a(String str, String str2) {
        m75151c(2, str, str2);
    }

    /* renamed from: a */
    public static void m75145a(String str, Exception exc) {
        if (f84531a && f84532b != null) {
            Iterator it = f84532b.iterator();
            while (it.hasNext()) {
                C32460c cVar = (C32460c) it.next();
                if (cVar != null && cVar.mo46950a()) {
                    cVar.mo46948a(cVar.mo46951b(), str, exc);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m75142a(Context context, List<C32460c> list) {
        synchronized (C32458a.class) {
            if (f84531a) {
                throw new IllegalStateException("CrashlyticsWrapper already inited!");
            } else if (context != null) {
                f84534d = true;
                f84533c = context.getApplicationContext();
                if (!list.isEmpty()) {
                    f84532b = new CopyOnWriteArrayList<>(list);
                }
                if (f84532b != null) {
                    Iterator it = f84532b.iterator();
                    while (it.hasNext()) {
                        C32460c cVar = (C32460c) it.next();
                        if (cVar != null && cVar.mo46950a()) {
                            cVar.mo46947a(f84533c);
                        }
                    }
                }
                f84531a = true;
            } else {
                throw new IllegalArgumentException("Context can't be null!");
            }
        }
    }

    /* renamed from: a */
    public static void m75147a(String str, Map<String, String> map) {
        if (f84531a && f84532b != null) {
            Iterator it = f84532b.iterator();
            while (it.hasNext()) {
                C32460c cVar = (C32460c) it.next();
                if (cVar != null && cVar.mo46950a()) {
                    cVar.mo46951b();
                }
            }
        }
    }

    /* renamed from: c */
    public static void m75151c(int i, String str, String str2) {
        if (!C23337c.m57398a()) {
            m75141a(i, str, str2);
        }
    }

    /* renamed from: b */
    public static void m75149b(int i, String str, String str2) {
        String str3;
        if (f84531a && f84532b != null) {
            Iterator it = f84532b.iterator();
            while (it.hasNext()) {
                C32460c cVar = (C32460c) it.next();
                if (cVar != null && cVar.mo46950a()) {
                    if (str == null) {
                        str3 = cVar.mo46951b();
                    } else {
                        str3 = str;
                    }
                    cVar.mo46946a(i, str3, str2);
                }
            }
        }
    }
}
