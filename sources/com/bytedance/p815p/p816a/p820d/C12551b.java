package com.bytedance.p815p.p816a.p820d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.bytedance.p.a.d.b */
public final class C12551b implements C12550a {

    /* renamed from: a */
    private SharedPreferences f32935a;

    /* renamed from: b */
    private Editor f32936b = this.f32935a.edit();

    public C12551b(Context context) {
        this.f32935a = C35807d.m80935a(context, "google_play_plugin_status", 0);
    }

    /* renamed from: a */
    public final void mo23591a(String str, String str2) {
        this.f32936b.putString(str, str2);
        this.f32936b.commit();
    }
}
