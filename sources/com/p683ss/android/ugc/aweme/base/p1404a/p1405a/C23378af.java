package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.profile.C40732y;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.af */
final class C23378af implements C40732y {

    /* renamed from: a */
    private Context f62394a;

    /* renamed from: b */
    private SharedPreferences f62395b = C35807d.m80935a(this.f62394a, MultiAccountViewModel.f103548a, 0);

    /* renamed from: a */
    public final void mo48469a(String str) {
        Editor edit = this.f62395b.edit();
        edit.putString("profile_cache_post_list", str);
        edit.apply();
    }

    public C23378af(Context context) {
        this.f62394a = context;
    }
}
