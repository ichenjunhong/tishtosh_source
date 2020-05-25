package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.C22718c;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.n */
final class C23400n implements C22718c {

    /* renamed from: a */
    private Context f62425a;

    /* renamed from: b */
    private SharedPreferences f62426b = C35807d.m80935a(this.f62425a, "TeenageModeSetting", 0);

    /* renamed from: a */
    public final String mo47158a() {
        return this.f62426b.getString("teenage_mode_setting", "");
    }

    public C23400n(Context context) {
        this.f62425a = context;
    }

    /* renamed from: a */
    public final void mo47159a(String str) {
        Editor edit = this.f62426b.edit();
        edit.putString("teenage_mode_setting", str);
        edit.apply();
    }
}
