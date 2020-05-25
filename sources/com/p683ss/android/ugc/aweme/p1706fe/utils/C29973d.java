package com.p683ss.android.ugc.aweme.p1706fe.utils;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.fe.utils.d */
public final class C29973d {

    /* renamed from: a */
    private Keva f78227a;

    /* renamed from: com.ss.android.ugc.aweme.fe.utils.d$a */
    static class C29975a {

        /* renamed from: a */
        public static C29973d f78228a = new C29973d();
    }

    /* renamed from: a */
    public static C29973d m70118a() {
        return C29975a.f78228a;
    }

    private C29973d() {
        this.f78227a = Keva.getRepoFromSp(C11010c.m22280a(), "fe-storage", 0);
    }

    /* renamed from: a */
    public final String mo60150a(String str, String str2) {
        return this.f78227a.getString(str, str2);
    }

    /* renamed from: b */
    public final void mo60154b(String str, String str2) {
        this.f78227a.storeString(str, str2);
    }

    /* renamed from: a */
    public final Boolean mo60148a(String str, Boolean bool) {
        return Boolean.valueOf(this.f78227a.getBoolean(str, bool.booleanValue()));
    }

    /* renamed from: b */
    public final void mo60152b(String str, Boolean bool) {
        this.f78227a.storeBoolean(str, bool.booleanValue());
    }

    /* renamed from: a */
    public final Integer mo60149a(String str, Integer num) {
        return Integer.valueOf(this.f78227a.getInt(str, num.intValue()));
    }

    /* renamed from: b */
    public final void mo60153b(String str, Integer num) {
        this.f78227a.storeInt(str, num.intValue());
    }

    /* renamed from: a */
    public final boolean mo60151a(String str, Object obj) {
        if (str == null || obj == null) {
            return false;
        }
        try {
            if (!(obj instanceof String)) {
                return false;
            }
            mo60154b(str, (String) obj);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
