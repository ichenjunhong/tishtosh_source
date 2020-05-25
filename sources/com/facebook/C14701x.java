package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.C14283ab;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.x */
final class C14701x {

    /* renamed from: a */
    private final SharedPreferences f38094a = C35807d.m80935a(C14533n.m29773g(), "com.facebook.AccessTokenManager.SharedPreferences", 0);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo26969b() {
        this.f38094a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    C14701x() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Profile mo26967a() {
        String string = this.f38094a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26968a(Profile profile) {
        C14283ab.m29306a((Object) profile, "profile");
        JSONObject c = profile.mo25325c();
        if (c != null) {
            this.f38094a.edit().putString("com.facebook.ProfileManager.CachedProfile", c.toString()).apply();
        }
    }
}
