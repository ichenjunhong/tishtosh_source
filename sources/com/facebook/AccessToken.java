package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14283ab;
import com.facebook.internal.C14365x;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AccessToken implements Parcelable {
    public static final Creator<AccessToken> CREATOR = new Creator() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AccessToken[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AccessToken(parcel);
        }
    };

    /* renamed from: k */
    private static final Date f35168k;

    /* renamed from: l */
    private static final Date f35169l;

    /* renamed from: m */
    private static final Date f35170m = new Date();

    /* renamed from: n */
    private static final C13739d f35171n = C13739d.FACEBOOK_APPLICATION_WEB;

    /* renamed from: a */
    public final Date f35172a;

    /* renamed from: b */
    public final Set<String> f35173b;

    /* renamed from: c */
    public final Set<String> f35174c;

    /* renamed from: d */
    public final Set<String> f35175d;

    /* renamed from: e */
    public final String f35176e;

    /* renamed from: f */
    public final C13739d f35177f;

    /* renamed from: g */
    public final Date f35178g;

    /* renamed from: h */
    public final String f35179h;

    /* renamed from: i */
    public final String f35180i;

    /* renamed from: j */
    public final Date f35181j;

    /* renamed from: com.facebook.AccessToken$a */
    public interface C13489a {
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public static AccessToken m27253a() {
        return C13607b.m27474a().f35508b;
    }

    /* renamed from: c */
    public final boolean mo25279c() {
        return new Date().after(this.f35172a);
    }

    /* renamed from: b */
    public static boolean m27257b() {
        AccessToken accessToken = C13607b.m27474a().f35508b;
        if (accessToken == null || accessToken.mo25279c()) {
            return false;
        }
        return true;
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f35168k = date;
        f35169l = date;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final JSONObject mo25280d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C42311c.f106863g, 1);
        jSONObject.put("token", this.f35176e);
        jSONObject.put("expires_at", this.f35172a.getTime());
        jSONObject.put("permissions", new JSONArray(this.f35173b));
        jSONObject.put("declined_permissions", new JSONArray(this.f35174c));
        jSONObject.put("expired_permissions", new JSONArray(this.f35175d));
        jSONObject.put("last_refresh", this.f35178g.getTime());
        jSONObject.put("source", this.f35177f.name());
        jSONObject.put("application_id", this.f35179h);
        jSONObject.put("user_id", this.f35180i);
        jSONObject.put("data_access_expiration_time", this.f35181j.getTime());
        return jSONObject;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((this.f35172a.hashCode() + 527) * 31) + this.f35173b.hashCode()) * 31) + this.f35174c.hashCode()) * 31) + this.f35175d.hashCode()) * 31) + this.f35176e.hashCode()) * 31) + this.f35177f.hashCode()) * 31) + this.f35178g.hashCode()) * 31;
        if (this.f35179h == null) {
            i = 0;
        } else {
            i = this.f35179h.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f35180i.hashCode()) * 31) + this.f35181j.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        if (this.f35176e == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else if (C14533n.m29765a(C14699w.INCLUDE_ACCESS_TOKENS)) {
            str = this.f35176e;
        } else {
            str = "ACCESS_TOKEN_REMOVED";
        }
        sb.append(str);
        sb.append(" permissions:");
        if (this.f35173b == null) {
            sb.append(TEVideoRecorder.FACE_BEAUTY_NULL);
        } else {
            sb.append("[");
            sb.append(TextUtils.join(", ", this.f35173b));
            sb.append("]");
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m27256a(AccessToken accessToken) {
        C13607b.m27474a().mo25460a(accessToken);
    }

    AccessToken(Parcel parcel) {
        this.f35172a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f35173b = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f35174c = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f35175d = Collections.unmodifiableSet(new HashSet(arrayList));
        this.f35176e = parcel.readString();
        this.f35177f = C13739d.valueOf(parcel.readString());
        this.f35178g = new Date(parcel.readLong());
        this.f35179h = parcel.readString();
        this.f35180i = parcel.readString();
        this.f35181j = new Date(parcel.readLong());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (!this.f35172a.equals(accessToken.f35172a) || !this.f35173b.equals(accessToken.f35173b) || !this.f35174c.equals(accessToken.f35174c) || !this.f35175d.equals(accessToken.f35175d) || !this.f35176e.equals(accessToken.f35176e) || this.f35177f != accessToken.f35177f || !this.f35178g.equals(accessToken.f35178g) || (this.f35179h != null ? !this.f35179h.equals(accessToken.f35179h) : accessToken.f35179h != null) || !this.f35180i.equals(accessToken.f35180i) || !this.f35181j.equals(accessToken.f35181j)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static AccessToken m27254a(Bundle bundle) {
        C13739d dVar;
        List a = m27255a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List a2 = m27255a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        List a3 = m27255a(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
        C14283ab.m29306a((Object) bundle, "bundle");
        String string = bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        if (C14277aa.m29276a(string)) {
            string = C14533n.m29777k();
        }
        String str = string;
        C14283ab.m29306a((Object) bundle, "bundle");
        String string2 = bundle.getString("com.facebook.TokenCachingStrategy.Token");
        JSONObject a4 = C14365x.m29467a(string2);
        if (a4 == null) {
            C14696t a5 = C14277aa.m29289d(string2).mo25312a();
            if (a5.f38086d != null) {
                a4 = null;
            } else {
                a4 = a5.f38084b;
            }
        }
        try {
            String string3 = a4.getString("id");
            C14283ab.m29306a((Object) bundle, "bundle");
            if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                dVar = (C13739d) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            } else if (bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO")) {
                dVar = C13739d.FACEBOOK_APPLICATION_WEB;
            } else {
                dVar = C13739d.WEB_VIEW;
            }
            AccessToken accessToken = new AccessToken(string2, str, string3, a, a2, a3, dVar, C14698v.m30060a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), C14698v.m30060a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), null);
            return accessToken;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static List<String> m27255a(Bundle bundle, String str) {
        ArrayList stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f35172a.getTime());
        parcel.writeStringList(new ArrayList(this.f35173b));
        parcel.writeStringList(new ArrayList(this.f35174c));
        parcel.writeStringList(new ArrayList(this.f35175d));
        parcel.writeString(this.f35176e);
        parcel.writeString(this.f35177f.name());
        parcel.writeLong(this.f35178g.getTime());
        parcel.writeString(this.f35179h);
        parcel.writeString(this.f35180i);
        parcel.writeLong(this.f35181j.getTime());
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C13739d dVar, Date date, Date date2, Date date3) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        C14283ab.m29307a(str, "accessToken");
        C14283ab.m29307a(str2, "applicationId");
        C14283ab.m29307a(str3, "userId");
        if (date == null) {
            date = f35169l;
        }
        this.f35172a = date;
        if (collection != null) {
            hashSet = new HashSet(collection);
        } else {
            hashSet = new HashSet();
        }
        this.f35173b = Collections.unmodifiableSet(hashSet);
        if (collection2 != null) {
            hashSet2 = new HashSet(collection2);
        } else {
            hashSet2 = new HashSet();
        }
        this.f35174c = Collections.unmodifiableSet(hashSet2);
        if (collection3 != null) {
            hashSet3 = new HashSet(collection3);
        } else {
            hashSet3 = new HashSet();
        }
        this.f35175d = Collections.unmodifiableSet(hashSet3);
        this.f35176e = str;
        if (dVar == null) {
            dVar = f35171n;
        }
        this.f35177f = dVar;
        if (date2 == null) {
            date2 = f35170m;
        }
        this.f35178g = date2;
        this.f35179h = str2;
        this.f35180i = str3;
        if (date3 == null || date3.getTime() == 0) {
            date3 = f35169l;
        }
        this.f35181j = date3;
    }
}
