package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.setting.C41536al;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ag */
final class C23379ag implements C41536al {

    /* renamed from: a */
    private Context f62396a;

    /* renamed from: b */
    private SharedPreferences f62397b = C35807d.m80935a(this.f62396a, "Player", 0);

    /* renamed from: a */
    public final void mo48470a(int i) {
        Editor edit = this.f62397b.edit();
        edit.putInt("testPlayerType", i);
        edit.apply();
    }

    public C23379ag(Context context) {
        this.f62396a = context;
    }
}
