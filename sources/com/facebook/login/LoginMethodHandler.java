package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.AccessToken;
import com.facebook.C13739d;
import com.facebook.C14457k;
import com.facebook.internal.C14277aa;
import com.facebook.login.LoginClient.Request;
import com.facebook.p909a.C13589l;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: a */
    Map<String, String> f37671a;

    /* renamed from: b */
    protected LoginClient f37672b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract String mo26635a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26636a(JSONObject jSONObject) throws JSONException {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo26637a(int i, int i2, Intent intent) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo26638a(Request request);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo26672b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo26718d() {
        return false;
    }

    LoginMethodHandler(LoginClient loginClient) {
        this.f37672b = loginClient;
    }

    LoginMethodHandler(Parcel parcel) {
        this.f37671a = C14277aa.m29261a(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26715a(LoginClient loginClient) {
        if (this.f37672b == null) {
            this.f37672b = loginClient;
            return;
        }
        throw new C14457k("Can't set LoginClient if it is already set.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo26714a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo26635a());
            mo26636a(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: c */
    private static String m29694c(String str) throws C14457k {
        if (str == null || str.isEmpty()) {
            throw new C14457k("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), "UTF-8")).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new C14457k("Failed to retrieve user_id from signed_request");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo26717b(String str) {
        String str2 = this.f37672b.f37634g.f37641d;
        C13589l lVar = new C13589l(this.f37672b.mo26680a(), str2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", str2);
        lVar.mo25409a("fb_dialogs_web_login_dialog_complete", (Double) null, bundle);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C14277aa.m29266a(parcel, this.f37671a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26716a(String str, Object obj) {
        String str2;
        if (this.f37671a == null) {
            this.f37671a = new HashMap();
        }
        Map<String, String> map = this.f37671a;
        if (obj == null) {
            str2 = null;
        } else {
            str2 = obj.toString();
        }
        map.put(str, str2);
    }

    /* renamed from: a */
    static AccessToken m29692a(Bundle bundle, C13739d dVar, String str) {
        Bundle bundle2 = bundle;
        Date a = C14277aa.m29258a(bundle2, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList stringArrayList = bundle2.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle2.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date a2 = C14277aa.m29258a(bundle2, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
        if (C14277aa.m29276a(string)) {
            return null;
        }
        AccessToken accessToken = new AccessToken(string, str, bundle2.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, null, dVar, a, new Date(), a2);
        return accessToken;
    }

    /* renamed from: a */
    public static AccessToken m29693a(Collection<String> collection, Bundle bundle, C13739d dVar, String str) throws C14457k {
        Collection<String> collection2;
        Collection collection3;
        Collection collection4;
        Bundle bundle2 = bundle;
        Date a = C14277aa.m29258a(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        Date a2 = C14277aa.m29258a(bundle, "data_access_expiration_time", new Date(0));
        String string2 = bundle.getString("granted_scopes");
        if (!C14277aa.m29276a(string2)) {
            collection2 = new ArrayList<>(Arrays.asList(string2.split(",")));
        } else {
            collection2 = collection;
        }
        String string3 = bundle.getString("denied_scopes");
        if (!C14277aa.m29276a(string3)) {
            collection3 = new ArrayList(Arrays.asList(string3.split(",")));
        } else {
            collection3 = null;
        }
        String string4 = bundle.getString("expired_scopes");
        if (!C14277aa.m29276a(string4)) {
            collection4 = new ArrayList(Arrays.asList(string4.split(",")));
        } else {
            collection4 = null;
        }
        if (C14277aa.m29276a(string)) {
            return null;
        }
        AccessToken accessToken = new AccessToken(string, str, m29694c(bundle.getString("signed_request")), collection2, collection3, collection4, dVar, a, new Date(), a2);
        return accessToken;
    }
}
