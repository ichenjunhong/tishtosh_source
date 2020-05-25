package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.keva.Keva;
import java.util.Random;

/* renamed from: com.ss.android.ugc.aweme.setting.az */
public final class C41561az {

    /* renamed from: a */
    public static final C41561az f105268a = new C41561az();

    /* renamed from: b */
    public Keva f105269b;

    /* renamed from: c */
    private Random f105270c = new Random();

    /* renamed from: d */
    private boolean f105271d;

    private C41561az() {
        boolean z;
        if (this.f105270c.nextInt(1000) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f105271d = z;
        System.nanoTime();
        this.f105269b = Keva.getRepoSync("settings_data_repo", 1);
    }

    /* renamed from: a */
    public final void mo85344a(String str, String str2) {
        this.f105269b.storeString(str, str2);
    }

    /* renamed from: b */
    public final String mo85346b(String str, String str2) {
        return this.f105269b.getString(str, str2);
    }

    /* renamed from: a */
    public final boolean mo85345a(String str, boolean z) {
        return this.f105269b.getBoolean(str, z);
    }
}
