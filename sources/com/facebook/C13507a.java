package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14283ab;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a */
final class C13507a {

    /* renamed from: a */
    private final SharedPreferences f35255a;

    /* renamed from: b */
    private final C13508a f35256b;

    /* renamed from: c */
    private C14698v f35257c;

    /* renamed from: com.facebook.a$a */
    static class C13508a {
        C13508a() {
        }
    }

    /* renamed from: d */
    private static boolean m27319d() {
        return C14533n.m29770d();
    }

    public C13507a() {
        this(C35807d.m80935a(C14533n.m29773g(), "com.facebook.AccessTokenManager.SharedPreferences", 0), new C13508a());
    }

    /* renamed from: e */
    private C14698v m27320e() {
        if (this.f35257c == null) {
            synchronized (this) {
                if (this.f35257c == null) {
                    this.f35257c = new C14698v(C14533n.m29773g());
                }
            }
        }
        return this.f35257c;
    }

    /* renamed from: b */
    public final void mo25336b() {
        this.f35255a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m27319d()) {
            m27320e().mo26963b();
        }
    }

    /* renamed from: a */
    public final AccessToken mo25334a() {
        AccessToken accessToken = null;
        if (this.f35255a.contains("com.facebook.AccessTokenManager.CachedAccessToken")) {
            return m27318c();
        }
        if (!m27319d()) {
            return null;
        }
        Bundle a = m27320e().mo26962a();
        if (a != null) {
            boolean z = false;
            if (a != null) {
                String string = a.getString("com.facebook.TokenCachingStrategy.Token");
                if (!(string == null || string.length() == 0 || a.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0) == 0)) {
                    z = true;
                }
            }
            if (z) {
                accessToken = AccessToken.m27254a(a);
            }
        }
        if (accessToken == null) {
            return accessToken;
        }
        mo25335a(accessToken);
        m27320e().mo26963b();
        return accessToken;
    }

    /* renamed from: c */
    private AccessToken m27318c() {
        AccessToken accessToken;
        Collection collection;
        String string = this.f35255a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.getInt(C42311c.f106863g) <= 1) {
                String string2 = jSONObject.getString("token");
                Date date = new Date(jSONObject.getLong("expires_at"));
                JSONArray jSONArray = jSONObject.getJSONArray("permissions");
                JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
                JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
                Date date2 = new Date(jSONObject.getLong("last_refresh"));
                C13739d valueOf = C13739d.valueOf(jSONObject.getString("source"));
                String string3 = jSONObject.getString("application_id");
                String string4 = jSONObject.getString("user_id");
                JSONArray jSONArray3 = jSONArray2;
                try {
                    Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
                    List a = C14277aa.m29260a(jSONArray);
                    List a2 = C14277aa.m29260a(jSONArray3);
                    if (optJSONArray == null) {
                        collection = new ArrayList();
                    } else {
                        collection = C14277aa.m29260a(optJSONArray);
                    }
                    AccessToken accessToken2 = new AccessToken(string2, string3, string4, a, a2, collection, valueOf, date, date2, date3);
                    return accessToken2;
                } catch (JSONException unused) {
                    accessToken = null;
                    return accessToken;
                }
            } else {
                throw new C14457k("Unknown AccessToken serialization format.");
            }
        } catch (JSONException unused2) {
            accessToken = null;
            return accessToken;
        }
    }

    /* renamed from: a */
    public final void mo25335a(AccessToken accessToken) {
        C14283ab.m29306a((Object) accessToken, "accessToken");
        try {
            this.f35255a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.mo25280d().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    private C13507a(SharedPreferences sharedPreferences, C13508a aVar) {
        this.f35255a = sharedPreferences;
        this.f35256b = aVar;
    }
}
