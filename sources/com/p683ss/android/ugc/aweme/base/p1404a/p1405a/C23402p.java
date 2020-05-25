package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.commerce.service.p1539e.C25545a;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.p */
public final class C23402p implements C25545a {

    /* renamed from: b */
    private Context f62429b;

    /* renamed from: c */
    private SharedPreferences f62430c = C35807d.m80935a(this.f62429b, "CommercePreferences", 0);

    /* renamed from: d */
    private Keva f62431d = Keva.getRepoFromSp(this.f62429b, "CommercePreferences", 0);

    /* renamed from: a */
    public final boolean mo48487a(boolean z) {
        return this.f62431d.getBoolean("shouldShowDiscoveryRankAutoScroll", true);
    }

    public C23402p(Context context) {
        this.f62429b = context;
    }

    /* renamed from: b */
    public final void mo48488b(boolean z) {
        String str = "shouldShowDiscoveryRankAutoScroll";
        Editor edit = this.f62430c.edit();
        edit.putBoolean(str, false);
        edit.apply();
        this.f62431d.storeBoolean(str, false);
    }
}
