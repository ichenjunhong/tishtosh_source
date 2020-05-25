package com.p683ss.android.ugc.aweme.protection.antiaddiction;

import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.Calendar;

/* renamed from: com.ss.android.ugc.aweme.protection.antiaddiction.c */
public class C40849c {

    /* renamed from: c */
    private static C40849c f104001c;

    /* renamed from: a */
    public boolean f104002a;

    /* renamed from: b */
    public String f104003b;

    /* renamed from: d */
    private int f104004d = 22;

    /* renamed from: e */
    private int f104005e = -1;

    /* renamed from: f */
    private int f104006f = -1;

    /* renamed from: g */
    private int f104007g = -1;

    /* renamed from: b */
    public final long mo83178b() {
        return (long) (this.f104007g * 1000);
    }

    /* renamed from: c */
    public final int mo83179c() {
        boolean z = this.f104002a;
        this.f104002a = false;
        return z ? 1 : 0;
    }

    /* renamed from: d */
    public final String mo83180d() {
        String str = this.f104003b;
        this.f104003b = "";
        return str;
    }

    private C40849c() {
    }

    /* renamed from: a */
    public static C40849c m90331a() {
        if (f104001c == null) {
            synchronized (C40849c.class) {
                if (f104001c == null) {
                    f104001c = new C40849c();
                }
            }
        }
        return f104001c;
    }

    /* renamed from: a */
    public final void mo83175a(IESSettingsProxy iESSettingsProxy) {
        this.f104004d = 22;
        this.f104005e = iESSettingsProxy.getAntiAddictionDayTime().intValue();
        this.f104006f = iESSettingsProxy.getAntiAddictionNightTime().intValue();
        this.f104007g = iESSettingsProxy.getAntiAddictionToastTime().intValue();
    }

    /* renamed from: a */
    public final boolean mo83176a(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(11);
        if (i >= this.f104004d || i < 5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo83177a(long j, long j2) {
        long j3;
        if (mo83176a(j)) {
            j3 = (long) (this.f104006f * 1000);
        } else {
            j3 = (long) (this.f104005e * 1000);
        }
        if (j3 <= 0 || j2 <= j3) {
            return false;
        }
        return true;
    }
}
