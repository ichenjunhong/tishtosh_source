package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28219f;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.q */
final class C23403q implements C28219f {

    /* renamed from: a */
    private Context f62432a;

    /* renamed from: b */
    private SharedPreferences f62433b = C35807d.m80935a(this.f62432a, "RankSp", 0);

    /* renamed from: a */
    public final boolean mo48490a() {
        return this.f62433b.getBoolean("hasShowToast", false);
    }

    /* renamed from: a */
    public final void mo48489a(boolean z) {
        Editor edit = this.f62433b.edit();
        edit.putBoolean("hasShowToast", true);
        edit.apply();
    }

    public C23403q(Context context) {
        this.f62432a = context;
    }
}
