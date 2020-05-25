package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.ads.internal.C14963ax;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xj */
final /* synthetic */ class C16373xj implements afl {

    /* renamed from: a */
    private final C16372xi f45963a;

    C16373xj(C16372xi xiVar) {
        this.f45963a = xiVar;
    }

    /* renamed from: a */
    public final Object mo28739a(Object obj) {
        C16372xi xiVar = this.f45963a;
        JSONObject jSONObject = (JSONObject) obj;
        Editor edit = C35807d.m80935a(xiVar.f45959a, "google_ads_flags", 0).edit();
        caf.m37098c().mo30650a(edit, 1, jSONObject);
        edit.commit();
        xiVar.f45960b.edit().putLong("js_last_update", C14963ax.m30837g().mo28523a()).apply();
        return null;
    }
}
