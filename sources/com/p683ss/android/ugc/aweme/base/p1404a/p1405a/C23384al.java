package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43367d;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.al */
final class C23384al implements C43367d {

    /* renamed from: a */
    private Context f62406a;

    /* renamed from: b */
    private SharedPreferences f62407b = C35807d.m80935a(this.f62406a, "AudioEffect", 0);

    /* renamed from: a */
    public final int mo48479a(int i) {
        return this.f62407b.getInt("resource_version", i);
    }

    /* renamed from: b */
    public final void mo48480b(int i) {
        Editor edit = this.f62407b.edit();
        edit.putInt("resource_version", i);
        edit.apply();
    }

    public C23384al(Context context) {
        this.f62406a = context;
    }
}
