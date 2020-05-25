package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p030v4.app.FragmentActivity;
import com.facebook.C13739d;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Creator<CustomTabLoginMethodHandler> CREATOR = new Creator() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }
    };

    /* renamed from: c */
    private static final String[] f37586c = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* renamed from: d */
    private String f37587d;

    /* renamed from: e */
    private String f37588e;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo26635a() {
        return "custom_tab";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo26639c() {
        return "chrome_custom_tab";
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v_ */
    public final C13739d mo26641v_() {
        return C13739d.CHROME_CUSTOM_TAB;
    }

    /* renamed from: e */
    private String m29599e() {
        if (this.f37587d != null) {
            return this.f37587d;
        }
        FragmentActivity a = this.f37672b.mo26680a();
        List<ResolveInfo> queryIntentServices = a.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null) {
            HashSet hashSet = new HashSet(Arrays.asList(f37586c));
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    this.f37587d = serviceInfo.packageName;
                    return this.f37587d;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26636a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f37588e);
    }

    CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f37588e = parcel.readString();
    }

    CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f37588e = new BigInteger(100, new Random()).toString(32);
    }

    /* renamed from: a */
    private boolean m29598a(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f37588e);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo26638a(com.facebook.login.LoginClient.Request r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.m29599e()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0082
            android.content.Context r0 = com.facebook.C14533n.m29773g()
            java.lang.String r3 = "context"
            com.facebook.internal.C14283ab.m29306a(r0, r3)
            android.content.pm.PackageManager r3 = r0.getPackageManager()
            r4 = 0
            if (r3 == 0) goto L_0x0050
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r5 = "android.intent.action.VIEW"
            r4.setAction(r5)
            java.lang.String r5 = "android.intent.category.DEFAULT"
            r4.addCategory(r5)
            java.lang.String r5 = "android.intent.category.BROWSABLE"
            r4.addCategory(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "fb"
            r5.<init>(r6)
            java.lang.String r6 = com.facebook.C14533n.m29777k()
            r5.append(r6)
            java.lang.String r6 = "://authorize"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r4.setData(r5)
            r5 = 64
            java.util.List r4 = r3.queryIntentActivities(r4, r5)
        L_0x0050:
            if (r4 == 0) goto L_0x007d
            java.util.Iterator r3 = r4.iterator()
            r4 = 0
        L_0x0057:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007e
            java.lang.Object r4 = r3.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ActivityInfo r4 = r4.activityInfo
            java.lang.String r5 = r4.name
            java.lang.String r6 = "com.facebook.CustomTabActivity"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x007d
            java.lang.String r4 = r4.packageName
            java.lang.String r5 = r0.getPackageName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x007d
            r4 = 1
            goto L_0x0057
        L_0x007d:
            r4 = 0
        L_0x007e:
            if (r4 == 0) goto L_0x0082
            r0 = 1
            goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            if (r0 != 0) goto L_0x0086
            return r2
        L_0x0086:
            android.os.Bundle r0 = r7.mo26723b(r8)
            android.os.Bundle r8 = r7.mo26721a(r0, r8)
            com.facebook.login.LoginClient r0 = r7.f37672b
            android.support.v4.app.FragmentActivity r0 = r0.mo26680a()
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.facebook.CustomTabMainActivity> r3 = com.facebook.CustomTabMainActivity.class
            r2.<init>(r0, r3)
            java.lang.String r0 = com.facebook.CustomTabMainActivity.f35186a
            r2.putExtra(r0, r8)
            java.lang.String r8 = com.facebook.CustomTabMainActivity.f35187b
            java.lang.String r0 = r7.m29599e()
            r2.putExtra(r8, r0)
            com.facebook.login.LoginClient r8 = r7.f37672b
            android.support.v4.app.Fragment r8 = r8.f37630c
            r8.startActivityForResult(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.mo26638a(com.facebook.login.LoginClient$Request):boolean");
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f37588e);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ce  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo26637a(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            r0 = 1
            if (r7 == r0) goto L_0x0008
            boolean r7 = super.mo26637a(r7, r8, r9)
            return r7
        L_0x0008:
            com.facebook.login.LoginClient r7 = r6.f37672b
            com.facebook.login.LoginClient$Request r7 = r7.f37634g
            r1 = -1
            r2 = 0
            if (r8 != r1) goto L_0x00dc
            java.lang.String r8 = com.facebook.CustomTabMainActivity.f35188c
            java.lang.String r8 = r9.getStringExtra(r8)
            if (r8 == 0) goto L_0x00db
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r3 = "fb"
            r9.<init>(r3)
            java.lang.String r3 = com.facebook.C14533n.m29777k()
            r9.append(r3)
            java.lang.String r3 = "://authorize"
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x00db
            android.net.Uri r8 = android.net.Uri.parse(r8)
            java.lang.String r9 = r8.getQuery()
            android.os.Bundle r9 = com.facebook.internal.C14277aa.m29286c(r9)
            java.lang.String r8 = r8.getFragment()
            android.os.Bundle r8 = com.facebook.internal.C14277aa.m29286c(r8)
            r9.putAll(r8)
            boolean r8 = r6.m29598a(r9)
            if (r8 != 0) goto L_0x005e
            com.facebook.k r8 = new com.facebook.k
            java.lang.String r9 = "Invalid state parameter"
            r8.<init>(r9)
            super.mo26722a(r7, r2, r8)
            goto L_0x00db
        L_0x005e:
            java.lang.String r8 = "error"
            java.lang.String r8 = r9.getString(r8)
            if (r8 != 0) goto L_0x006c
            java.lang.String r8 = "error_type"
            java.lang.String r8 = r9.getString(r8)
        L_0x006c:
            java.lang.String r3 = "error_msg"
            java.lang.String r3 = r9.getString(r3)
            if (r3 != 0) goto L_0x007a
            java.lang.String r3 = "error_message"
            java.lang.String r3 = r9.getString(r3)
        L_0x007a:
            if (r3 != 0) goto L_0x0082
            java.lang.String r3 = "error_description"
            java.lang.String r3 = r9.getString(r3)
        L_0x0082:
            java.lang.String r4 = "error_code"
            java.lang.String r4 = r9.getString(r4)
            boolean r5 = com.facebook.internal.C14277aa.m29276a(r4)
            if (r5 != 0) goto L_0x0093
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0093 }
            goto L_0x0094
        L_0x0093:
            r4 = -1
        L_0x0094:
            boolean r5 = com.facebook.internal.C14277aa.m29276a(r8)
            if (r5 == 0) goto L_0x00a6
            boolean r5 = com.facebook.internal.C14277aa.m29276a(r3)
            if (r5 == 0) goto L_0x00a6
            if (r4 != r1) goto L_0x00a6
            super.mo26722a(r7, r9, r2)
            goto L_0x00db
        L_0x00a6:
            if (r8 == 0) goto L_0x00c1
            java.lang.String r9 = "access_denied"
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x00b8
            java.lang.String r9 = "OAuthAccessDeniedException"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x00c1
        L_0x00b8:
            com.facebook.m r8 = new com.facebook.m
            r8.<init>()
            super.mo26722a(r7, r2, r8)
            goto L_0x00db
        L_0x00c1:
            r9 = 4201(0x1069, float:5.887E-42)
            if (r4 != r9) goto L_0x00ce
            com.facebook.m r8 = new com.facebook.m
            r8.<init>()
            super.mo26722a(r7, r2, r8)
            goto L_0x00db
        L_0x00ce:
            com.facebook.FacebookRequestError r9 = new com.facebook.FacebookRequestError
            r9.<init>(r4, r8, r3)
            com.facebook.p r8 = new com.facebook.p
            r8.<init>(r9, r3)
            super.mo26722a(r7, r2, r8)
        L_0x00db:
            return r0
        L_0x00dc:
            com.facebook.m r8 = new com.facebook.m
            r8.<init>()
            super.mo26722a(r7, r2, r8)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.mo26637a(int, int, android.content.Intent):boolean");
    }
}
