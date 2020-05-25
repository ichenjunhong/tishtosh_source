package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.setting.model.IVerifyActionCache;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ah */
final class C23380ah implements IVerifyActionCache {

    /* renamed from: a */
    private Context f62398a;

    /* renamed from: b */
    private SharedPreferences f62399b = C35807d.m80935a(this.f62398a, "VerifyActionManager", 0);

    public final String getVerifyAction() {
        return this.f62399b.getString("verify_action", "");
    }

    public final void setVerifyAction(String str) {
        Editor edit = this.f62399b.edit();
        edit.putString("verify_action", str);
        edit.apply();
    }

    public C23380ah(Context context) {
        this.f62398a = context;
    }
}
