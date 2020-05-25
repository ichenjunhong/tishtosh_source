package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.os.SystemClock;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.a */
public abstract class C40200a extends C40321dd implements C40266bq {

    /* renamed from: a */
    public static final C40201a f102677a = new C40201a(null);

    /* renamed from: b */
    private HashMap f102678b;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.a$a */
    public static final class C40201a {
        private C40201a() {
        }

        public /* synthetic */ C40201a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.a$b */
    public static final class C40202b {

        /* renamed from: a */
        static long f102679a = -1;

        /* renamed from: b */
        static String f102680b;

        /* renamed from: c */
        static String f102681c = "";

        /* renamed from: d */
        public static final C40202b f102682d = new C40202b();

        private C40202b() {
        }

        /* renamed from: a */
        public static long m89427a() {
            return f102679a;
        }

        /* renamed from: a */
        public static void m89428a(String str, String str2) {
            f102680b = str;
            if (str2 == null) {
                str2 = "";
            }
            f102681c = str2;
            f102679a = SystemClock.uptimeMillis();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f102678b != null) {
            this.f102678b.clear();
        }
    }
}
