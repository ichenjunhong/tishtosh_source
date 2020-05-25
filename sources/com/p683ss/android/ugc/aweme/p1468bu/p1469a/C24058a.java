package com.p683ss.android.ugc.aweme.p1468bu.p1469a;

import com.bytedance.apm.C8936b;
import java.util.HashSet;

/* renamed from: com.ss.android.ugc.aweme.bu.a.a */
public final class C24058a {

    /* renamed from: a */
    public static final String f63853a = f63853a;

    /* renamed from: b */
    public static int f63854b = 0;

    /* renamed from: c */
    public static int f63855c = 8;

    /* renamed from: d */
    public static final C24058a f63856d = new C24058a();

    /* renamed from: e */
    private static final String f63857e = f63857e;

    /* renamed from: f */
    private static HashSet<String> f63858f = new HashSet<>();

    /* renamed from: com.ss.android.ugc.aweme.bu.a.a$a */
    public static final class C24059a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f63859a;

        public C24059a(String str) {
            this.f63859a = str;
        }

        public final void run() {
            C24058a.m58880a(this.f63859a);
        }
    }

    private C24058a() {
    }

    /* renamed from: a */
    public static void m58880a(String str) {
        if (!f63858f.contains(str)) {
            f63858f.add(str);
            C8936b.m17659b(str);
        }
    }
}
