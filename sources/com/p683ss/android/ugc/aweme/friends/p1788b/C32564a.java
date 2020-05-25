package com.p683ss.android.ugc.aweme.friends.p1788b;

import android.content.SharedPreferences;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.friends.b.a */
public final class C32564a {

    /* renamed from: a */
    public final SharedPreferences f84793a;

    /* renamed from: com.ss.android.ugc.aweme.friends.b.a$a */
    static class C32566a {

        /* renamed from: a */
        public static C32564a f84794a = new C32564a();
    }

    /* renamed from: a */
    public static C32564a m75339a() {
        return C32566a.f84794a;
    }

    /* renamed from: b */
    public final int mo65884b() {
        return this.f84793a.getInt("send_sms_strategy", 0);
    }

    private C32564a() {
        this.f84793a = C35807d.m80935a(C11010c.m22280a(), "invite_settings", 0);
    }
}
