package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.friends.C32502a;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.t */
final class C23406t implements C32502a {

    /* renamed from: b */
    private Context f62438b;

    /* renamed from: c */
    private Keva f62439c = Keva.getRepoFromSp(this.f62438b, "FriendsSharePreferences", 0);

    /* renamed from: a */
    public final boolean mo48497a(boolean z) {
        return this.f62439c.getBoolean("read_contact_denied", false);
    }

    /* renamed from: b */
    public final void mo48498b(boolean z) {
        this.f62439c.storeBoolean("read_contact_denied", true);
    }

    public C23406t(Context context) {
        this.f62438b = context;
    }
}
