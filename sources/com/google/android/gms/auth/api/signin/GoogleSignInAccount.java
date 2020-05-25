package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.common.util.C15514e;
import com.google.android.gms.common.util.C15517h;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR = new C15140d();

    /* renamed from: a */
    public static C15514e f39117a = C15517h.m32280d();

    /* renamed from: b */
    public String f39118b;

    /* renamed from: c */
    public String f39119c;

    /* renamed from: d */
    public String f39120d;

    /* renamed from: e */
    public String f39121e;

    /* renamed from: f */
    public Uri f39122f;

    /* renamed from: g */
    public String f39123g;

    /* renamed from: h */
    public String f39124h;

    /* renamed from: i */
    public String f39125i;

    /* renamed from: j */
    public String f39126j;

    /* renamed from: k */
    private final int f39127k;

    /* renamed from: l */
    private long f39128l;

    /* renamed from: m */
    private List<Scope> f39129m;

    /* renamed from: n */
    private Set<Scope> f39130n = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f39127k = i;
        this.f39118b = str;
        this.f39119c = str2;
        this.f39120d = str3;
        this.f39121e = str4;
        this.f39122f = uri;
        this.f39123g = str5;
        this.f39128l = j;
        this.f39124h = str6;
        this.f39129m = list;
        this.f39125i = str7;
        this.f39126j = str8;
    }

    /* renamed from: a */
    public final Account mo27914a() {
        if (this.f39120d == null) {
            return null;
        }
        return new Account(this.f39120d, "com.google");
    }

    /* renamed from: b */
    public final Set<Scope> mo27915b() {
        HashSet hashSet = new HashSet(this.f39129m);
        hashSet.addAll(this.f39130n);
        return hashSet;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39127k);
        C15469b.m32187a(parcel, 2, this.f39118b, false);
        C15469b.m32187a(parcel, 3, this.f39119c, false);
        C15469b.m32187a(parcel, 4, this.f39120d, false);
        C15469b.m32187a(parcel, 5, this.f39121e, false);
        C15469b.m32183a(parcel, 6, (Parcelable) this.f39122f, i, false);
        C15469b.m32187a(parcel, 7, this.f39123g, false);
        C15469b.m32180a(parcel, 8, this.f39128l);
        C15469b.m32187a(parcel, 9, this.f39124h, false);
        C15469b.m32196b(parcel, 10, this.f39129m, false);
        C15469b.m32187a(parcel, 11, this.f39125i, false);
        C15469b.m32187a(parcel, 12, this.f39126j, false);
        C15469b.m32197c(parcel, a);
    }

    public int hashCode() {
        return ((this.f39124h.hashCode() + 527) * 31) + mo27915b().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f39124h.equals(this.f39124h) && googleSignInAccount.mo27915b().equals(mo27915b());
    }

    /* renamed from: c */
    public final JSONObject mo27916c() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f39118b != null) {
                jSONObject.put("id", this.f39118b);
            }
            if (this.f39119c != null) {
                jSONObject.put("tokenId", this.f39119c);
            }
            if (this.f39120d != null) {
                jSONObject.put("email", this.f39120d);
            }
            if (this.f39121e != null) {
                jSONObject.put("displayName", this.f39121e);
            }
            if (this.f39125i != null) {
                jSONObject.put("givenName", this.f39125i);
            }
            if (this.f39126j != null) {
                jSONObject.put("familyName", this.f39126j);
            }
            if (this.f39122f != null) {
                jSONObject.put("photoUrl", this.f39122f.toString());
            }
            if (this.f39123g != null) {
                jSONObject.put("serverAuthCode", this.f39123g);
            }
            jSONObject.put("expirationTime", this.f39128l);
            jSONObject.put("obfuscatedIdentifier", this.f39124h);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.f39129m.toArray(new Scope[this.f39129m.size()]);
            Arrays.sort(scopeArr, C15139c.f39169a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f39263a);
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
