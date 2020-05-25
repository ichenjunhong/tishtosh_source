package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14320j;
import com.facebook.internal.C14336o;
import com.facebook.internal.C14338p;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError implements Parcelable {
    public static final Creator<FacebookRequestError> CREATOR = new Creator<FacebookRequestError>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FacebookRequestError[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FacebookRequestError(parcel);
        }
    };

    /* renamed from: a */
    static final C13494b f35198a = new C13494b();

    /* renamed from: b */
    public final C13493a f35199b;

    /* renamed from: c */
    public final int f35200c;

    /* renamed from: d */
    public final int f35201d;

    /* renamed from: e */
    public final int f35202e;

    /* renamed from: f */
    public final String f35203f;

    /* renamed from: g */
    public final String f35204g;

    /* renamed from: h */
    public final String f35205h;

    /* renamed from: i */
    public final String f35206i;

    /* renamed from: j */
    public final JSONObject f35207j;

    /* renamed from: k */
    public final JSONObject f35208k;

    /* renamed from: l */
    public final Object f35209l;

    /* renamed from: m */
    public final HttpURLConnection f35210m;

    /* renamed from: n */
    public final C14457k f35211n;

    /* renamed from: o */
    private final String f35212o;

    /* renamed from: com.facebook.FacebookRequestError$a */
    public enum C13493a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* renamed from: com.facebook.FacebookRequestError$b */
    static class C13494b {

        /* renamed from: a */
        final int f35214a;

        /* renamed from: b */
        final int f35215b;

        private C13494b(int i, int i2) {
            this.f35214a = i;
            this.f35215b = i2;
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final String mo25306a() {
        if (this.f35212o != null) {
            return this.f35212o;
        }
        return this.f35211n.getLocalizedMessage();
    }

    /* renamed from: b */
    private static synchronized C14320j m27263b() {
        synchronized (FacebookRequestError.class) {
            C14336o a = C14338p.m29397a(C14533n.m29777k());
            if (a == null) {
                C14320j a2 = C14320j.m29374a();
                return a2;
            }
            C14320j jVar = a.f37296h;
            return jVar;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{HttpStatus: ");
        sb.append(this.f35200c);
        sb.append(", errorCode: ");
        sb.append(this.f35201d);
        sb.append(", subErrorCode: ");
        sb.append(this.f35202e);
        sb.append(", errorType: ");
        sb.append(this.f35203f);
        sb.append(", errorMessage: ");
        sb.append(mo25306a());
        sb.append("}");
        return sb.toString();
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, null, null, null, null, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f35200c);
        parcel.writeInt(this.f35201d);
        parcel.writeInt(this.f35202e);
        parcel.writeString(this.f35203f);
        parcel.writeString(this.f35212o);
        parcel.writeString(this.f35204g);
        parcel.writeString(this.f35205h);
    }

    FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        C14457k kVar;
        Exception exc2 = exc;
        if (exc2 instanceof C14457k) {
            kVar = (C14457k) exc2;
        } else {
            kVar = new C14457k((Throwable) exc2);
        }
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpURLConnection, kVar);
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, false, null, null, null, null, null);
    }

    /* renamed from: a */
    static FacebookRequestError m27262a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        JSONObject jSONObject2;
        boolean z;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        int i2;
        boolean z2;
        JSONObject jSONObject3 = jSONObject;
        try {
            if (jSONObject3.has("code")) {
                int i3 = jSONObject3.getInt("code");
                Object a = C14277aa.m29248a(jSONObject3, "body", "FACEBOOK_NON_JSON_RESULT");
                boolean z3 = true;
                if (a != null && (a instanceof JSONObject)) {
                    JSONObject jSONObject4 = (JSONObject) a;
                    if (jSONObject4.has("error")) {
                        JSONObject jSONObject5 = (JSONObject) C14277aa.m29248a(jSONObject4, "error", (String) null);
                        str4 = jSONObject5.optString("type", null);
                        String optString = jSONObject5.optString("message", null);
                        int optInt = jSONObject5.optInt("code", -1);
                        i2 = jSONObject5.optInt("error_subcode", -1);
                        str2 = jSONObject5.optString("error_user_msg", null);
                        str = jSONObject5.optString("error_user_title", null);
                        z = jSONObject5.optBoolean("is_transient", false);
                        z2 = true;
                        int i4 = optInt;
                        str3 = optString;
                        i = i4;
                    } else {
                        if (!jSONObject4.has("error_code") && !jSONObject4.has("error_msg")) {
                            if (!jSONObject4.has("error_reason")) {
                                str4 = null;
                                str3 = null;
                                str2 = null;
                                str = null;
                                z2 = false;
                                i2 = 0;
                                i = 0;
                                z = false;
                            }
                        }
                        String optString2 = jSONObject4.optString("error_reason", null);
                        String optString3 = jSONObject4.optString("error_msg", null);
                        i = jSONObject4.optInt("error_code", -1);
                        i2 = jSONObject4.optInt("error_subcode", -1);
                        str3 = optString3;
                        str2 = null;
                        str = null;
                        z = false;
                        str4 = optString2;
                        z2 = true;
                    }
                    if (z2) {
                        FacebookRequestError facebookRequestError = new FacebookRequestError(i3, i, i2, str4, str3, str, str2, z, jSONObject4, jSONObject, obj, httpURLConnection, null);
                        return facebookRequestError;
                    }
                }
                C13494b bVar = f35198a;
                if (bVar.f35214a > i3 || i3 > bVar.f35215b) {
                    z3 = false;
                }
                if (!z3) {
                    if (jSONObject3.has("body")) {
                        jSONObject2 = (JSONObject) C14277aa.m29248a(jSONObject3, "body", "FACEBOOK_NON_JSON_RESULT");
                    } else {
                        jSONObject2 = null;
                    }
                    FacebookRequestError facebookRequestError2 = new FacebookRequestError(i3, -1, -1, null, null, null, null, false, jSONObject2, jSONObject, obj, httpURLConnection, null);
                    return facebookRequestError2;
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private FacebookRequestError(int r1, int r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, org.json.JSONObject r9, org.json.JSONObject r10, java.lang.Object r11, java.net.HttpURLConnection r12, com.facebook.C14457k r13) {
        /*
            r0 = this;
            r0.<init>()
            r0.f35200c = r1
            r0.f35201d = r2
            r0.f35202e = r3
            r0.f35203f = r4
            r0.f35212o = r5
            r0.f35208k = r9
            r0.f35207j = r10
            r0.f35209l = r11
            r0.f35210m = r12
            r0.f35204g = r6
            r0.f35205h = r7
            if (r13 == 0) goto L_0x001f
            r0.f35211n = r13
            r1 = 1
            goto L_0x0027
        L_0x001f:
            com.facebook.p r1 = new com.facebook.p
            r1.<init>(r0, r5)
            r0.f35211n = r1
            r1 = 0
        L_0x0027:
            com.facebook.internal.j r4 = m27263b()
            if (r1 != 0) goto L_0x00b4
            if (r8 == 0) goto L_0x0033
            com.facebook.FacebookRequestError$a r1 = com.facebook.FacebookRequestError.C13493a.TRANSIENT
            goto L_0x00b6
        L_0x0033:
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r1 = r4.f37264a
            if (r1 == 0) goto L_0x005e
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r1 = r4.f37264a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.containsKey(r5)
            if (r1 == 0) goto L_0x005e
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r1 = r4.f37264a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r5)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L_0x005b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L_0x005e
        L_0x005b:
            com.facebook.FacebookRequestError$a r1 = com.facebook.FacebookRequestError.C13493a.OTHER
            goto L_0x00b6
        L_0x005e:
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r1 = r4.f37266c
            if (r1 == 0) goto L_0x0089
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r1 = r4.f37266c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.containsKey(r5)
            if (r1 == 0) goto L_0x0089
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r1 = r4.f37266c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r5)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L_0x0086
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L_0x0089
        L_0x0086:
            com.facebook.FacebookRequestError$a r1 = com.facebook.FacebookRequestError.C13493a.LOGIN_RECOVERABLE
            goto L_0x00b6
        L_0x0089:
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r1 = r4.f37265b
            if (r1 == 0) goto L_0x00b4
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r1 = r4.f37265b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.containsKey(r5)
            if (r1 == 0) goto L_0x00b4
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r1 = r4.f37265b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L_0x00b1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x00b4
        L_0x00b1:
            com.facebook.FacebookRequestError$a r1 = com.facebook.FacebookRequestError.C13493a.TRANSIENT
            goto L_0x00b6
        L_0x00b4:
            com.facebook.FacebookRequestError$a r1 = com.facebook.FacebookRequestError.C13493a.OTHER
        L_0x00b6:
            r0.f35199b = r1
            com.facebook.FacebookRequestError$a r1 = r0.f35199b
            int[] r2 = com.facebook.internal.C14320j.C143233.f37270a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            switch(r1) {
                case 1: goto L_0x00cd;
                case 2: goto L_0x00ca;
                case 3: goto L_0x00c7;
                default: goto L_0x00c5;
            }
        L_0x00c5:
            r1 = 0
            goto L_0x00cf
        L_0x00c7:
            java.lang.String r1 = r4.f37268e
            goto L_0x00cf
        L_0x00ca:
            java.lang.String r1 = r4.f37269f
            goto L_0x00cf
        L_0x00cd:
            java.lang.String r1 = r4.f37267d
        L_0x00cf:
            r0.f35206i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.<init>(int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, org.json.JSONObject, org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection, com.facebook.k):void");
    }
}
