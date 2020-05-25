package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C15464q;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
public final class C15147b {

    /* renamed from: c */
    private static final Lock f39185c = new ReentrantLock();

    /* renamed from: d */
    private static C15147b f39186d;

    /* renamed from: a */
    final Lock f39187a = new ReentrantLock();

    /* renamed from: b */
    final SharedPreferences f39188b;

    /* renamed from: a */
    public static C15147b m31320a(Context context) {
        C15464q.m32123a(context);
        f39185c.lock();
        try {
            if (f39186d == null) {
                f39186d = new C15147b(context.getApplicationContext());
            }
            return f39186d;
        } finally {
            f39185c.unlock();
        }
    }

    private C15147b(Context context) {
        this.f39188b = C35807d.m80935a(context, "com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public final void mo27953a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C15464q.m32123a(googleSignInAccount);
        C15464q.m32123a(googleSignInOptions);
        m31322b("defaultGoogleSignInAccount", googleSignInAccount.f39124h);
        C15464q.m32123a(googleSignInAccount);
        C15464q.m32123a(googleSignInOptions);
        String str = googleSignInAccount.f39124h;
        String a = m31321a("googleSignInAccount", str);
        JSONObject c = googleSignInAccount.mo27916c();
        c.remove("serverAuthCode");
        m31322b(a, c.toString());
        m31322b(m31321a("googleSignInOptions", str), googleSignInOptions.mo27921b().toString());
    }

    /* renamed from: b */
    private final void m31322b(String str, String str2) {
        this.f39187a.lock();
        try {
            this.f39188b.edit().putString(str, str2).apply();
        } finally {
            this.f39187a.unlock();
        }
    }

    /* renamed from: a */
    public final GoogleSignInAccount mo27951a() {
        return m31323c(mo27952a("defaultGoogleSignInAccount"));
    }

    /* renamed from: c */
    private final GoogleSignInAccount m31323c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a = mo27952a(m31321a("googleSignInAccount", str));
        if (a == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a);
            String optString = jSONObject.optString("photoUrl", null);
            Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
            long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
            HashSet hashSet = new HashSet();
            JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                hashSet.add(new Scope(jSONArray.getString(i)));
            }
            String optString2 = jSONObject.optString("id");
            String optString3 = jSONObject.optString("tokenId", null);
            String optString4 = jSONObject.optString("email", null);
            String optString5 = jSONObject.optString("displayName", null);
            String optString6 = jSONObject.optString("givenName", null);
            String optString7 = jSONObject.optString("familyName", null);
            Long valueOf = Long.valueOf(parseLong);
            String string = jSONObject.getString("obfuscatedIdentifier");
            if (valueOf == null) {
                valueOf = Long.valueOf(GoogleSignInAccount.f39117a.mo28523a() / 1000);
            }
            GoogleSignInAccount googleSignInAccount = r4;
            GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, valueOf.longValue(), C15464q.m32125a(string), new ArrayList((Collection) C15464q.m32123a(hashSet)), optString6, optString7);
            String optString8 = jSONObject.optString("serverAuthCode", null);
            GoogleSignInAccount googleSignInAccount3 = googleSignInAccount;
            googleSignInAccount3.f39123g = optString8;
            return googleSignInAccount3;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final GoogleSignInOptions mo27954b() {
        return m31324d(mo27952a("defaultGoogleSignInAccount"));
    }

    /* renamed from: d */
    private final GoogleSignInOptions m31324d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a = mo27952a(m31321a("googleSignInOptions", str));
        if (a == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a);
            HashSet hashSet = new HashSet();
            JSONArray jSONArray = jSONObject.getJSONArray("scopes");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                hashSet.add(new Scope(jSONArray.getString(i)));
            }
            String optString = jSONObject.optString("accountName", null);
            GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList<>(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), (Map<Integer, GoogleSignInOptionsExtensionParcelable>) new HashMap<Integer,GoogleSignInOptionsExtensionParcelable>());
            return googleSignInOptions;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final String mo27952a(String str) {
        this.f39187a.lock();
        try {
            return this.f39188b.getString(str, null);
        } finally {
            this.f39187a.unlock();
        }
    }

    /* renamed from: b */
    public final void mo27955b(String str) {
        this.f39187a.lock();
        try {
            this.f39188b.edit().remove(str).apply();
        } finally {
            this.f39187a.unlock();
        }
    }

    /* renamed from: a */
    public static String m31321a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
