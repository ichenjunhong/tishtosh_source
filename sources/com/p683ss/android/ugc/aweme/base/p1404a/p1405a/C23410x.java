package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.memory.C36771b;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.x */
final class C23410x implements C36771b {

    /* renamed from: a */
    private Context f62446a;

    /* renamed from: b */
    private SharedPreferences f62447b = C35807d.m80935a(this.f62446a, "LeakDetectorSp", 0);

    public C23410x(Context context) {
        this.f62446a = context;
    }

    /* renamed from: a */
    public final Boolean mo48535a(Boolean bool) {
        return Boolean.valueOf(this.f62447b.getBoolean("native_memory_monitor_status", bool.booleanValue()));
    }

    /* renamed from: b */
    public final void mo48536b(Boolean bool) {
        Editor edit = this.f62447b.edit();
        edit.putBoolean("native_memory_monitor_status", bool.booleanValue());
        edit.apply();
    }
}
