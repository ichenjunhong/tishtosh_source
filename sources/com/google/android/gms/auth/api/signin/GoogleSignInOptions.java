package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.C15146a;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C15211a.C15215d.C15220e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends AbstractSafeParcelable implements C15220e, ReflectedParcelable {
    public static final Creator<GoogleSignInOptions> CREATOR = new C15142f();

    /* renamed from: a */
    public static final Scope f39138a = new Scope("profile");

    /* renamed from: b */
    public static final Scope f39139b = new Scope("email");

    /* renamed from: c */
    public static final Scope f39140c = new Scope("openid");

    /* renamed from: d */
    public static final Scope f39141d = new Scope("https://www.googleapis.com/auth/games_lite");

    /* renamed from: e */
    public static final Scope f39142e = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: f */
    public static final GoogleSignInOptions f39143f = new C15136a().mo27925a().mo27928b().mo27929c();

    /* renamed from: g */
    public static final GoogleSignInOptions f39144g = new C15136a().mo27926a(f39141d, new Scope[0]).mo27929c();

    /* renamed from: r */
    private static Comparator<Scope> f39145r = new C15141e();

    /* renamed from: h */
    final ArrayList<Scope> f39146h;

    /* renamed from: i */
    public Account f39147i;

    /* renamed from: j */
    public boolean f39148j;

    /* renamed from: k */
    public final boolean f39149k;

    /* renamed from: l */
    public final boolean f39150l;

    /* renamed from: m */
    public String f39151m;

    /* renamed from: n */
    String f39152n;

    /* renamed from: o */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> f39153o;

    /* renamed from: p */
    private final int f39154p;

    /* renamed from: q */
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> f39155q;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C15136a {

        /* renamed from: a */
        public Set<Scope> f39156a = new HashSet();

        /* renamed from: b */
        public boolean f39157b;

        /* renamed from: c */
        public boolean f39158c;

        /* renamed from: d */
        public boolean f39159d;

        /* renamed from: e */
        public String f39160e;

        /* renamed from: f */
        private Account f39161f;

        /* renamed from: g */
        private String f39162g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f39163h = new HashMap();

        public C15136a() {
        }

        public C15136a(GoogleSignInOptions googleSignInOptions) {
            C15464q.m32123a(googleSignInOptions);
            this.f39156a = new HashSet(googleSignInOptions.f39146h);
            this.f39157b = googleSignInOptions.f39149k;
            this.f39158c = googleSignInOptions.f39150l;
            this.f39159d = googleSignInOptions.f39148j;
            this.f39160e = googleSignInOptions.f39151m;
            this.f39161f = googleSignInOptions.f39147i;
            this.f39162g = googleSignInOptions.f39152n;
            this.f39163h = GoogleSignInOptions.m31301b(googleSignInOptions.f39153o);
        }

        /* renamed from: a */
        public final C15136a mo27925a() {
            this.f39156a.add(GoogleSignInOptions.f39140c);
            return this;
        }

        /* renamed from: b */
        public final C15136a mo27928b() {
            this.f39156a.add(GoogleSignInOptions.f39138a);
            return this;
        }

        /* renamed from: a */
        public final C15136a mo27926a(Scope scope, Scope... scopeArr) {
            this.f39156a.add(scope);
            this.f39156a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: c */
        public final GoogleSignInOptions mo27929c() {
            if (this.f39156a.contains(GoogleSignInOptions.f39142e) && this.f39156a.contains(GoogleSignInOptions.f39141d)) {
                this.f39156a.remove(GoogleSignInOptions.f39141d);
            }
            if (this.f39159d && (this.f39161f == null || !this.f39156a.isEmpty())) {
                mo27925a();
            }
            GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList(this.f39156a), this.f39161f, this.f39159d, this.f39157b, this.f39158c, this.f39160e, this.f39162g, this.f39163h, null);
            return googleSignInOptions;
        }

        /* renamed from: a */
        public final String mo27927a(String str) {
            C15464q.m32125a(str);
            C15464q.m32134b(this.f39160e == null || this.f39160e.equals(str), "two different server client ids provided");
            return str;
        }
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2) {
        this(i, arrayList, account, z, z2, z3, str, str2, m31301b(arrayList2));
    }

    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map) {
        this.f39154p = i;
        this.f39146h = arrayList;
        this.f39147i = account;
        this.f39148j = z;
        this.f39149k = z2;
        this.f39150l = z3;
        this.f39151m = str;
        this.f39152n = str2;
        this.f39153o = new ArrayList<>(map.values());
        this.f39155q = map;
    }

    /* renamed from: a */
    public final ArrayList<Scope> mo27920a() {
        return new ArrayList<>(this.f39146h);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> m31301b(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f39171a), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39154p);
        C15469b.m32196b(parcel, 2, mo27920a(), false);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f39147i, i, false);
        C15469b.m32189a(parcel, 4, this.f39148j);
        C15469b.m32189a(parcel, 5, this.f39149k);
        C15469b.m32189a(parcel, 6, this.f39150l);
        C15469b.m32187a(parcel, 7, this.f39151m, false);
        C15469b.m32187a(parcel, 8, this.f39152n, false);
        C15469b.m32196b(parcel, 9, this.f39153o, false);
        C15469b.m32197c(parcel, a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r3.f39147i.equals(r4.f39147i) != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r3.f39151m.equals(r4.f39151m) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0079 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f39153o     // Catch:{ ClassCastException -> 0x0079 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 > 0) goto L_0x0078
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f39153o     // Catch:{ ClassCastException -> 0x0079 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 <= 0) goto L_0x0017
            goto L_0x0078
        L_0x0017:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f39146h     // Catch:{ ClassCastException -> 0x0079 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0079 }
            java.util.ArrayList r2 = r4.mo27920a()     // Catch:{ ClassCastException -> 0x0079 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 != r2) goto L_0x0077
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f39146h     // Catch:{ ClassCastException -> 0x0079 }
            java.util.ArrayList r2 = r4.mo27920a()     // Catch:{ ClassCastException -> 0x0079 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 != 0) goto L_0x0034
            goto L_0x0077
        L_0x0034:
            android.accounts.Account r1 = r3.f39147i     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 != 0) goto L_0x003d
            android.accounts.Account r1 = r4.f39147i     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 != 0) goto L_0x0076
            goto L_0x0047
        L_0x003d:
            android.accounts.Account r1 = r3.f39147i     // Catch:{ ClassCastException -> 0x0079 }
            android.accounts.Account r2 = r4.f39147i     // Catch:{ ClassCastException -> 0x0079 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 == 0) goto L_0x0076
        L_0x0047:
            java.lang.String r1 = r3.f39151m     // Catch:{ ClassCastException -> 0x0079 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = r4.f39151m     // Catch:{ ClassCastException -> 0x0079 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 == 0) goto L_0x0076
            goto L_0x0062
        L_0x0058:
            java.lang.String r1 = r3.f39151m     // Catch:{ ClassCastException -> 0x0079 }
            java.lang.String r2 = r4.f39151m     // Catch:{ ClassCastException -> 0x0079 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 == 0) goto L_0x0076
        L_0x0062:
            boolean r1 = r3.f39150l     // Catch:{ ClassCastException -> 0x0079 }
            boolean r2 = r4.f39150l     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 != r2) goto L_0x0076
            boolean r1 = r3.f39148j     // Catch:{ ClassCastException -> 0x0079 }
            boolean r2 = r4.f39148j     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 != r2) goto L_0x0076
            boolean r1 = r3.f39149k     // Catch:{ ClassCastException -> 0x0079 }
            boolean r4 = r4.f39149k     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 != r4) goto L_0x0076
            r4 = 1
            return r4
        L_0x0076:
            return r0
        L_0x0077:
            return r0
        L_0x0078:
            return r0
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f39146h;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).f39263a);
        }
        Collections.sort(arrayList);
        return new C15146a().mo27949a((Object) arrayList).mo27949a((Object) this.f39147i).mo27949a((Object) this.f39151m).mo27950a(this.f39150l).mo27950a(this.f39148j).mo27950a(this.f39149k).f39184a;
    }

    /* renamed from: b */
    public final JSONObject mo27921b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f39146h, f39145r);
            ArrayList arrayList = this.f39146h;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((Scope) obj).f39263a);
            }
            jSONObject.put("scopes", jSONArray);
            if (this.f39147i != null) {
                jSONObject.put("accountName", this.f39147i.name);
            }
            jSONObject.put("idTokenRequested", this.f39148j);
            jSONObject.put("forceCodeForRefreshToken", this.f39150l);
            jSONObject.put("serverAuthRequested", this.f39149k);
            if (!TextUtils.isEmpty(this.f39151m)) {
                jSONObject.put("serverClientId", this.f39151m);
            }
            if (!TextUtils.isEmpty(this.f39152n)) {
                jSONObject.put("hostedDomain", this.f39152n);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, C15141e eVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map);
    }
}
