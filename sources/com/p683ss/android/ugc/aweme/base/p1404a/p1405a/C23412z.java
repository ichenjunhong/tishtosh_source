package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38050a;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.z */
final class C23412z implements C38050a {

    /* renamed from: a */
    private Context f62450a;

    /* renamed from: b */
    private SharedPreferences f62451b = C35807d.m80935a(this.f62450a, "aweme-app", 0);

    /* renamed from: a */
    public final int mo48537a() {
        return this.f62451b.getInt("notice_count_latency", 0);
    }

    public C23412z(Context context) {
        this.f62450a = context;
    }

    /* renamed from: a */
    public final int mo48538a(int i) {
        return this.f62451b.getInt("im_can_im", 1);
    }

    /* renamed from: a */
    public final void mo48539a(boolean z) {
        Editor edit = this.f62451b.edit();
        edit.putBoolean("si_show_user_feed_back_point", true);
        edit.apply();
    }
}
