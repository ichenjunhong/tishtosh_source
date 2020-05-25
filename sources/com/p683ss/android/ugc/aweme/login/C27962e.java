package com.p683ss.android.ugc.aweme.login;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.base.AmeActivity;

/* renamed from: com.ss.android.ugc.aweme.login.e */
public final class C27962e {

    /* renamed from: a */
    private static C27963a f73390a;

    /* renamed from: com.ss.android.ugc.aweme.login.e$a */
    public static class C27963a {

        /* renamed from: a */
        public Class<?> f73391a;

        /* renamed from: b */
        public int f73392b = 1;

        /* renamed from: c */
        public C27964b f73393c;

        /* renamed from: d */
        public String f73394d;
    }

    /* renamed from: com.ss.android.ugc.aweme.login.e$b */
    public interface C27964b {
    }

    /* renamed from: a */
    public static void m66716a(Activity activity) {
        m66717a(activity, null, null, null, 1, false);
    }

    /* renamed from: a */
    private static void m66718a(Class<?> cls, C27964b bVar, String str, int i) {
        if (f73390a == null) {
            f73390a = new C27963a();
        } else {
            C27963a aVar = f73390a;
            aVar.f73391a = null;
            aVar.f73392b = 1;
            aVar.f73393c = null;
            aVar.f73394d = null;
        }
        f73390a.f73392b = i;
        f73390a.f73391a = cls;
        f73390a.f73394d = str;
        f73390a.f73393c = bVar;
    }

    /* renamed from: a */
    private static void m66717a(Activity activity, Class<?> cls, C27964b bVar, String str, int i, boolean z) {
        m66718a(null, null, null, 1);
        if (activity instanceof AmeActivity) {
            ((AmeActivity) activity).showLoginDialog();
        }
    }
}
