package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.trill.share.p2525a.C50413a;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ao */
final class C23387ao implements C50413a {

    /* renamed from: a */
    private Context f62412a;

    /* renamed from: b */
    private SharedPreferences f62413b = C35807d.m80935a(this.f62412a, "VideoPublishManager", 0);

    /* renamed from: a */
    public final void mo48483a(boolean z) {
        Editor edit = this.f62413b.edit();
        edit.putBoolean("is_aweme_private", z);
        edit.apply();
    }

    /* renamed from: b */
    public final boolean mo48484b(boolean z) {
        return this.f62413b.getBoolean("is_aweme_private", false);
    }

    /* renamed from: c */
    public final void mo48485c(boolean z) {
        Editor edit = this.f62413b.edit();
        edit.putBoolean("bind_helo_status", z);
        edit.apply();
    }

    /* renamed from: d */
    public final void mo48486d(boolean z) {
        Editor edit = this.f62413b.edit();
        edit.putBoolean("accredit_helo_status", z);
        edit.apply();
    }

    public C23387ao(Context context) {
        this.f62412a = context;
    }
}
