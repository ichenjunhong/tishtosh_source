package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38052c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ab */
final class C23374ab implements C38052c {

    /* renamed from: a */
    private Context f62386a;

    /* renamed from: b */
    private SharedPreferences f62387b = C35807d.m80935a(this.f62386a, "IMPreferences", 0);

    /* renamed from: a */
    public final void mo48438a(boolean z) {
        Editor edit = this.f62387b.edit();
        edit.putBoolean("stick_game_assistant", true);
        edit.apply();
    }

    public C23374ab(Context context) {
        this.f62386a = context;
    }
}
