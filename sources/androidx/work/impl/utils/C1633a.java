package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: androidx.work.impl.utils.a */
public class C1633a {

    /* renamed from: a */
    private final Context f5746a;

    /* renamed from: b */
    private SharedPreferences f5747b;

    /* renamed from: c */
    private boolean f5748c;

    /* renamed from: b */
    private void m5715b() {
        if (!this.f5748c) {
            this.f5747b = C35807d.m80935a(this.f5746a, "androidx.work.util.id", 0);
            this.f5748c = true;
        }
    }

    /* renamed from: a */
    public final int mo6037a() {
        int a;
        synchronized (C1633a.class) {
            m5715b();
            a = m5713a("next_alarm_manager_id");
        }
        return a;
    }

    public C1633a(Context context) {
        this.f5746a = context;
    }

    /* renamed from: a */
    private int m5713a(String str) {
        int i = 0;
        int i2 = this.f5747b.getInt(str, 0);
        if (i2 != Integer.MAX_VALUE) {
            i = i2 + 1;
        }
        m5714a(str, i);
        return i2;
    }

    /* renamed from: a */
    private void m5714a(String str, int i) {
        this.f5747b.edit().putInt(str, i).apply();
    }

    /* renamed from: a */
    public final int mo6038a(int i, int i2) {
        synchronized (C1633a.class) {
            m5715b();
            int a = m5713a("next_job_scheduler_id");
            if (a >= i) {
                if (a <= i2) {
                    i = a;
                }
            }
            m5714a("next_job_scheduler_id", i + 1);
        }
        return i;
    }
}
