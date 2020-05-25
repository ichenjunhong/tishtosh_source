package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.effect.C29162c;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.r */
final class C23404r implements C29162c {

    /* renamed from: a */
    private Context f62434a;

    /* renamed from: b */
    private SharedPreferences f62435b = C35807d.m80935a(this.f62434a, "EditEffectConfig", 0);

    /* renamed from: a */
    public final int mo48491a(int i) {
        return this.f62435b.getInt("fallback_resource_version", -1);
    }

    /* renamed from: b */
    public final void mo48492b(int i) {
        Editor edit = this.f62435b.edit();
        edit.putInt("fallback_resource_version", i);
        edit.apply();
    }

    public C23404r(Context context) {
        this.f62434a = context;
    }
}
