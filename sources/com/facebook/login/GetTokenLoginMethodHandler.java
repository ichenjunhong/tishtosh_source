package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.C13739d;
import com.facebook.C14457k;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14277aa.C14280a;
import com.facebook.internal.C14283ab;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Creator<GetTokenLoginMethodHandler> CREATOR = new Creator() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }
    };

    /* renamed from: c */
    private C14520c f37622c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo26635a() {
        return "get_token";
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo26672b() {
        if (this.f37622c != null) {
            this.f37622c.f37356c = false;
            this.f37622c.f37355b = null;
            this.f37622c = null;
        }
    }

    GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo26638a(final com.facebook.login.LoginClient.Request r7) {
        /*
            r6 = this;
            com.facebook.login.c r0 = new com.facebook.login.c
            com.facebook.login.LoginClient r1 = r6.f37672b
            android.support.v4.app.FragmentActivity r1 = r1.mo26680a()
            java.lang.String r2 = r7.f37641d
            r0.<init>(r1, r2)
            r6.f37622c = r0
            com.facebook.login.c r0 = r6.f37622c
            boolean r1 = r0.f37356c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x004c
        L_0x0019:
            int r1 = r0.f37358e
            java.util.List<com.facebook.internal.v$e> r4 = com.facebook.internal.C14353v.f37345a
            int[] r5 = new int[r3]
            r5[r2] = r1
            com.facebook.internal.v$f r1 = com.facebook.internal.C14353v.m29437a(r4, r5)
            int r1 = r1.f37353b
            r4 = -1
            if (r1 != r4) goto L_0x002b
            goto L_0x0017
        L_0x002b:
            android.content.Context r1 = r0.f37354a
            android.content.Intent r1 = com.facebook.internal.C14353v.m29429a(r1)
            if (r1 != 0) goto L_0x0034
            goto L_0x0017
        L_0x0034:
            r0.f37356c = r3
            android.content.Context r4 = r0.f37354a
            if (r4 == 0) goto L_0x0048
            boolean r5 = r4 instanceof android.content.Context
            if (r5 == 0) goto L_0x0048
            r5 = r4
            android.content.Context r5 = (android.content.Context) r5
            boolean r5 = com.p683ss.android.ugc.aweme.push.downgrade.C40895d.m90464a(r5, r1)
            if (r5 == 0) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            r4.bindService(r1, r0, r3)
        L_0x004b:
            r0 = 1
        L_0x004c:
            if (r0 != 0) goto L_0x004f
            return r2
        L_0x004f:
            com.facebook.login.LoginClient r0 = r6.f37672b
            r0.mo26687e()
            com.facebook.login.GetTokenLoginMethodHandler$1 r0 = new com.facebook.login.GetTokenLoginMethodHandler$1
            r0.<init>(r7)
            com.facebook.login.c r7 = r6.f37622c
            r7.f37355b = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.GetTokenLoginMethodHandler.mo26638a(com.facebook.login.LoginClient$Request):boolean");
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo26673b(Request request, Bundle bundle) {
        this.f37672b.mo26682a(Result.m29658a(this.f37672b.f37634g, m29692a(bundle, C13739d.FACEBOOK_APPLICATION_SERVICE, request.f37641d)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26671a(final Request request, final Bundle bundle) {
        if (this.f37622c != null) {
            this.f37622c.f37355b = null;
        }
        this.f37622c = null;
        LoginClient loginClient = this.f37672b;
        if (loginClient.f37632e != null) {
            loginClient.f37632e.mo26701b();
        }
        if (bundle != null) {
            ArrayList stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> set = request.f37639b;
            if (stringArrayList == null || (set != null && !stringArrayList.containsAll(set))) {
                HashSet hashSet = new HashSet();
                for (String str : set) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    mo26716a("new_permissions", TextUtils.join(",", hashSet));
                }
                C14283ab.m29306a((Object) hashSet, "permissions");
                request.f37639b = hashSet;
            } else {
                String string = bundle.getString("com.facebook.platform.extra.USER_ID");
                if (string == null || string.isEmpty()) {
                    this.f37672b.mo26687e();
                    C14277aa.m29269a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), (C14280a) new C14280a() {
                        /* renamed from: a */
                        public final void mo25330a(C14457k kVar) {
                            GetTokenLoginMethodHandler.this.f37672b.mo26683b(Result.m29660a(GetTokenLoginMethodHandler.this.f37672b.f37634g, "Caught exception", kVar.getMessage()));
                        }

                        /* renamed from: a */
                        public final void mo25331a(JSONObject jSONObject) {
                            try {
                                bundle.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                                GetTokenLoginMethodHandler.this.mo26673b(request, bundle);
                            } catch (JSONException e) {
                                GetTokenLoginMethodHandler.this.f37672b.mo26683b(Result.m29660a(GetTokenLoginMethodHandler.this.f37672b.f37634g, "Caught exception", e.getMessage()));
                            }
                        }
                    });
                    return;
                }
                mo26673b(request, bundle);
                return;
            }
        }
        this.f37672b.mo26685d();
    }
}
