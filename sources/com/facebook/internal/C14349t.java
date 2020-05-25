package com.facebook.internal;

import com.C2240a;
import com.facebook.C14533n;
import com.facebook.C14699w;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: com.facebook.internal.t */
public final class C14349t {

    /* renamed from: b */
    private static final HashMap<String, String> f37331b = new HashMap<>();

    /* renamed from: a */
    public int f37332a = 3;

    /* renamed from: c */
    private final C14699w f37333c;

    /* renamed from: d */
    private final String f37334d;

    /* renamed from: e */
    private StringBuilder f37335e;

    /* renamed from: b */
    private boolean m29413b() {
        return C14533n.m29765a(this.f37333c);
    }

    /* renamed from: a */
    public final void mo26549a() {
        m29415d(this.f37335e.toString());
        this.f37335e = new StringBuilder();
    }

    /* renamed from: d */
    private void m29415d(String str) {
        m29407a(this.f37333c, this.f37332a, this.f37334d, str);
    }

    /* renamed from: b */
    public final void mo26551b(String str) {
        if (m29413b()) {
            this.f37335e.append(str);
        }
    }

    /* renamed from: a */
    public static synchronized void m29410a(String str) {
        synchronized (C14349t.class) {
            if (!C14533n.m29765a(C14699w.INCLUDE_ACCESS_TOKENS)) {
                m29411a(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    /* renamed from: c */
    private static synchronized String m29414c(String str) {
        synchronized (C14349t.class) {
            for (Entry entry : f37331b.entrySet()) {
                str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
            }
        }
        return str;
    }

    public C14349t(C14699w wVar, String str) {
        C14283ab.m29307a(str, "tag");
        this.f37333c = wVar;
        StringBuilder sb = new StringBuilder("FacebookSDK.");
        sb.append(str);
        this.f37334d = sb.toString();
        this.f37335e = new StringBuilder();
    }

    /* renamed from: a */
    private static synchronized void m29411a(String str, String str2) {
        synchronized (C14349t.class) {
            f37331b.put(str, str2);
        }
    }

    /* renamed from: a */
    private void m29412a(String str, Object... objArr) {
        if (m29413b()) {
            this.f37335e.append(C2240a.m6772a(str, objArr));
        }
    }

    /* renamed from: a */
    public final void mo26550a(String str, Object obj) {
        m29412a("  %s:\t%s\n", str, obj);
    }

    /* renamed from: a */
    public static void m29408a(C14699w wVar, String str, String str2) {
        m29407a(wVar, 3, str, str2);
    }

    /* renamed from: a */
    public static void m29409a(C14699w wVar, String str, String str2, Object... objArr) {
        if (C14533n.m29765a(wVar)) {
            m29407a(wVar, 3, str, C2240a.m6772a(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m29407a(C14699w wVar, int i, String str, String str2) {
        if (C14533n.m29765a(wVar)) {
            m29414c(str2);
            if (!str.startsWith("FacebookSDK.")) {
                new StringBuilder("FacebookSDK.").append(str);
            }
        }
    }
}
