package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.C2240a;
import com.facebook.AccessToken;
import com.facebook.C13739d;
import com.facebook.C14457k;
import com.facebook.C14529m;
import com.facebook.C14533n;
import com.facebook.C14561p;
import com.facebook.FacebookRequestError;
import com.facebook.internal.C14277aa;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Collection;
import java.util.Locale;

abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: c */
    private String f37673c;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo26639c() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v_ */
    public abstract C13739d mo26641v_();

    WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Bundle mo26723b(Request request) {
        String str;
        Bundle bundle = new Bundle();
        if (!C14277aa.m29277a((Collection<T>) request.f37639b)) {
            String join = TextUtils.join(",", request.f37639b);
            bundle.putString("scope", join);
            mo26716a("scope", join);
        }
        bundle.putString("default_audience", request.f37640c.getNativeProtocolAudience());
        bundle.putString("state", mo26714a(request.f37642e));
        AccessToken a = AccessToken.m27253a();
        if (a != null) {
            str = a.f35176e;
        } else {
            str = null;
        }
        if (str == null || !str.equals(C35807d.m80935a(this.f37672b.mo26680a(), "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
            try {
                C14277aa.m29283b((Context) this.f37672b.mo26680a());
            } catch (Exception unused) {
            }
            mo26716a("access_token", "0");
        } else {
            bundle.putString("access_token", str);
            mo26716a("access_token", "1");
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo26721a(Bundle bundle, Request request) {
        StringBuilder sb = new StringBuilder("fb");
        sb.append(C14533n.m29777k());
        sb.append("://authorize");
        bundle.putString("redirect_uri", sb.toString());
        bundle.putString("client_id", request.f37641d);
        bundle.putString("e2e", LoginClient.m29645f());
        bundle.putString("response_type", "token,signed_request");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", request.f37645h);
        if (mo26639c() != null) {
            bundle.putString("sso", mo26639c());
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26722a(Request request, Bundle bundle, C14457k kVar) {
        Result result;
        String str;
        this.f37673c = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f37673c = bundle.getString("e2e");
            }
            try {
                AccessToken a = m29693a(request.f37639b, bundle, mo26641v_(), request.f37641d);
                result = Result.m29658a(this.f37672b.f37634g, a);
                CookieSyncManager.createInstance(this.f37672b.mo26680a()).sync();
                C35807d.m80935a(this.f37672b.mo26680a(), "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", a.f35176e).apply();
            } catch (C14457k e) {
                result = Result.m29660a(this.f37672b.f37634g, null, e.getMessage());
            }
        } else if (kVar instanceof C14529m) {
            result = Result.m29659a(this.f37672b.f37634g, "User canceled log in.");
        } else {
            this.f37673c = null;
            String message = kVar.getMessage();
            if (kVar instanceof C14561p) {
                FacebookRequestError requestError = ((C14561p) kVar).getRequestError();
                str = C2240a.m6773a(Locale.ROOT, "%d", new Object[]{Integer.valueOf(requestError.f35201d)});
                message = requestError.toString();
            } else {
                str = null;
            }
            result = Result.m29661a(this.f37672b.f37634g, null, message, str);
        }
        if (!C14277aa.m29276a(this.f37673c)) {
            mo26717b(this.f37673c);
        }
        this.f37672b.mo26682a(result);
    }
}
