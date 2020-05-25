package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.account.login.C22042y;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.m */
public final class C23399m implements C22042y {

    /* renamed from: a */
    private Context f62424a;

    public C23399m(Context context) {
        this.f62424a = context;
    }

    /* renamed from: a */
    public final void mo46100a(String str) {
        C23394h.m57475a(null, C35807d.m80935a(this.f62424a, "LoginSharePreferences", 0), "latest_login_info", "java.lang.String", new Object[]{str});
    }

    /* renamed from: b */
    public final String mo46102b(String str) {
        return (String) C23394h.m57476a(null, null, C35807d.m80935a(this.f62424a, "LoginSharePreferences", 0), "latest_login_info", "java.lang.String", "java.lang.String", new Object[]{str});
    }

    /* renamed from: a */
    public final void mo46101a(boolean z) {
        C23394h.m57475a(null, C35807d.m80935a(this.f62424a, "LoginSharePreferences", 0), "save_login_info", "boolean", new Object[]{Boolean.valueOf(z)});
    }

    /* renamed from: b */
    public final boolean mo46103b(boolean z) {
        return ((Boolean) C23394h.m57476a(null, null, C35807d.m80935a(this.f62424a, "LoginSharePreferences", 0), "save_login_info", "boolean", "boolean", new Object[]{Boolean.valueOf(true)})).booleanValue();
    }
}
