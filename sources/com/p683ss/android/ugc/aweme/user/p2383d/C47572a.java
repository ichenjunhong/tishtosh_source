package com.p683ss.android.ugc.aweme.user.p2383d;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.user.d.a */
public final class C47572a {

    /* renamed from: a */
    private C17971f f120021a = new C17971f();

    /* renamed from: b */
    private SharedPreferences f120022b = C35807d.m80935a(AwemeApplication.m56199a(), "aweme_user", 0);

    /* renamed from: c */
    private Editor f120023c = this.f120022b.edit();

    /* renamed from: a */
    public final int mo94886a(String str) {
        SharedPreferences sharedPreferences = this.f120022b;
        StringBuilder sb = new StringBuilder("ftc_user_mode_prefix_");
        sb.append(str);
        return sharedPreferences.getInt(sb.toString(), 0);
    }
}
