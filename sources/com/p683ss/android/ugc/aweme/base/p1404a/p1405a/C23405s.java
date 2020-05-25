package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.festival.christmas.C31364d;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.s */
final class C23405s implements C31364d {

    /* renamed from: a */
    private Context f62436a;

    /* renamed from: b */
    private SharedPreferences f62437b = C35807d.m80935a(this.f62436a, "ShowXmaxTreeCache", 0);

    /* renamed from: a */
    public final long mo48493a() {
        return this.f62437b.getLong("lastShowTime", 0);
    }

    /* renamed from: b */
    public final long mo48495b() {
        return this.f62437b.getLong("shotLastShowTime", 0);
    }

    public C23405s(Context context) {
        this.f62436a = context;
    }

    /* renamed from: a */
    public final void mo48494a(long j) {
        Editor edit = this.f62437b.edit();
        edit.putLong("lastShowTime", j);
        edit.apply();
    }

    /* renamed from: b */
    public final void mo48496b(long j) {
        Editor edit = this.f62437b.edit();
        edit.putLong("shotLastShowTime", j);
        edit.apply();
    }
}
