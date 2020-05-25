package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: androidx.work.impl.utils.c */
public class C1652c {

    /* renamed from: a */
    private Context f5785a;

    /* renamed from: b */
    private SharedPreferences f5786b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public SharedPreferences mo6066a() {
        SharedPreferences sharedPreferences;
        synchronized (C1652c.class) {
            if (this.f5786b == null) {
                this.f5786b = C35807d.m80935a(this.f5785a, "androidx.work.util.preferences", 0);
            }
            sharedPreferences = this.f5786b;
        }
        return sharedPreferences;
    }

    public C1652c(Context context) {
        this.f5785a = context;
    }

    /* renamed from: a */
    public final void mo6067a(boolean z) {
        mo6066a().edit().putBoolean("reschedule_needed", z).apply();
    }
}
