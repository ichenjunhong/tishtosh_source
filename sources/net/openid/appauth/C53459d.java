package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import android.support.p030v4.p038f.C0777a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.d */
public final class C53459d extends Exception {
    public final int code;
    public final String error;
    public final String errorDescription;
    public final Uri errorUri;
    public final int type;

    /* renamed from: net.openid.appauth.d$a */
    public static final class C53460a {

        /* renamed from: a */
        public static final C53459d f132188a = C53459d.authEx(1000, "invalid_request");

        /* renamed from: b */
        public static final C53459d f132189b = C53459d.authEx(1001, "unauthorized_client");

        /* renamed from: c */
        public static final C53459d f132190c = C53459d.authEx(BaseNotice.CHECK_PROFILE, "access_denied");

        /* renamed from: d */
        public static final C53459d f132191d = C53459d.authEx(BaseNotice.COMMENT_REPLY_WITH_VIDEO, "unsupported_response_type");

        /* renamed from: e */
        public static final C53459d f132192e = C53459d.authEx(1004, "invalid_scope");

        /* renamed from: f */
        public static final C53459d f132193f = C53459d.authEx(1005, "server_error");

        /* renamed from: g */
        public static final C53459d f132194g = C53459d.authEx(1006, "temporarily_unavailable");

        /* renamed from: h */
        public static final C53459d f132195h = C53459d.authEx(1007, null);

        /* renamed from: i */
        public static final C53459d f132196i = C53459d.authEx(1008, null);

        /* renamed from: j */
        public static final C53459d f132197j = C53459d.generalEx(9, "Response state param did not match request state");

        /* renamed from: k */
        static final Map<String, C53459d> f132198k = C53459d.exceptionMapByString(f132188a, f132189b, f132190c, f132191d, f132192e, f132193f, f132194g, f132195h, f132196i);
    }

    /* renamed from: net.openid.appauth.d$b */
    public static final class C53461b {

        /* renamed from: a */
        public static final C53459d f132199a = C53459d.generalEx(0, "Invalid discovery document");

        /* renamed from: b */
        public static final C53459d f132200b = C53459d.generalEx(1, "User cancelled flow");

        /* renamed from: c */
        public static final C53459d f132201c = C53459d.generalEx(2, "Flow cancelled programmatically");

        /* renamed from: d */
        public static final C53459d f132202d = C53459d.generalEx(3, "Network error");

        /* renamed from: e */
        public static final C53459d f132203e = C53459d.generalEx(4, "Server error");

        /* renamed from: f */
        public static final C53459d f132204f = C53459d.generalEx(5, "JSON deserialization error");

        /* renamed from: g */
        public static final C53459d f132205g = C53459d.generalEx(6, "Token response construction error");

        /* renamed from: h */
        public static final C53459d f132206h = C53459d.generalEx(7, "Invalid registration response");
    }

    /* renamed from: net.openid.appauth.d$c */
    public static final class C53462c {

        /* renamed from: a */
        public static final C53459d f132207a = C53459d.tokenEx(2000, "invalid_request");

        /* renamed from: b */
        public static final C53459d f132208b = C53459d.tokenEx(2001, "invalid_client");

        /* renamed from: c */
        public static final C53459d f132209c = C53459d.tokenEx(2002, "invalid_grant");

        /* renamed from: d */
        public static final C53459d f132210d = C53459d.tokenEx(2003, "unauthorized_client");

        /* renamed from: e */
        public static final C53459d f132211e = C53459d.tokenEx(2004, "unsupported_grant_type");

        /* renamed from: f */
        public static final C53459d f132212f = C53459d.tokenEx(2005, "invalid_scope");

        /* renamed from: g */
        public static final C53459d f132213g = C53459d.tokenEx(2006, null);

        /* renamed from: h */
        public static final C53459d f132214h = C53459d.tokenEx(2007, null);

        /* renamed from: i */
        static final Map<String, C53459d> f132215i = C53459d.exceptionMapByString(f132207a, f132208b, f132209c, f132210d, f132211e, f132212f, f132213g, f132214h);
    }

    public final int hashCode() {
        return ((this.type + 31) * 31) + this.code;
    }

    public final Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationException", toJsonString());
        return intent;
    }

    public final String toJsonString() {
        return toJson().toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorizationException: ");
        sb.append(toJsonString());
        return sb.toString();
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        C53479n.m113570a(jSONObject, "type", this.type);
        C53479n.m113570a(jSONObject, "code", this.code);
        C53479n.m113574b(jSONObject, "error", this.error);
        C53479n.m113574b(jSONObject, "errorDescription", this.errorDescription);
        String str = "errorUri";
        Uri uri = this.errorUri;
        C53487p.m113585a(jSONObject, (Object) "json must not be null");
        C53487p.m113585a(str, (Object) "field must not be null");
        if (uri != null) {
            try {
                jSONObject.put(str, uri.toString());
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
        return jSONObject;
    }

    public static C53459d fromJson(String str) throws JSONException {
        C53487p.m113586a(str, (Object) "jsonStr cannot be null or empty");
        return fromJson(new JSONObject(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C53459d)) {
            return false;
        }
        C53459d dVar = (C53459d) obj;
        if (this.type == dVar.type && this.code == dVar.code) {
            return true;
        }
        return false;
    }

    public static Map<String, C53459d> exceptionMapByString(C53459d... dVarArr) {
        int i;
        if (dVarArr != null) {
            i = dVarArr.length;
        } else {
            i = 0;
        }
        C0777a aVar = new C0777a(i);
        if (dVarArr != null) {
            for (C53459d dVar : dVarArr) {
                if (dVar.error != null) {
                    aVar.put(dVar.error, dVar);
                }
            }
        }
        return Collections.unmodifiableMap(aVar);
    }

    public static C53459d fromIntent(Intent intent) {
        C53487p.m113584a(intent);
        if (!intent.hasExtra("net.openid.appauth.AuthorizationException")) {
            return null;
        }
        try {
            return fromJson(intent.getStringExtra("net.openid.appauth.AuthorizationException"));
        } catch (JSONException e) {
            throw new IllegalArgumentException("Intent contains malformed exception data", e);
        }
    }

    public static C53459d fromJson(JSONObject jSONObject) throws JSONException {
        C53487p.m113585a(jSONObject, (Object) "json cannot be null");
        C53459d dVar = new C53459d(jSONObject.getInt("type"), jSONObject.getInt("code"), C53479n.m113573b(jSONObject, "error"), C53479n.m113573b(jSONObject, "errorDescription"), C53479n.m113576d(jSONObject, "errorUri"), null);
        return dVar;
    }

    public static C53459d fromOAuthRedirect(Uri uri) {
        Uri uri2;
        String queryParameter = uri.getQueryParameter("error");
        String queryParameter2 = uri.getQueryParameter("error_description");
        String queryParameter3 = uri.getQueryParameter("error_uri");
        C53459d dVar = (C53459d) C53460a.f132198k.get(queryParameter);
        if (dVar == null) {
            dVar = C53460a.f132196i;
        }
        int i = dVar.type;
        int i2 = dVar.code;
        if (queryParameter2 == null) {
            queryParameter2 = dVar.errorDescription;
        }
        String str = queryParameter2;
        if (queryParameter3 != null) {
            uri2 = Uri.parse(queryParameter3);
        } else {
            uri2 = dVar.errorUri;
        }
        C53459d dVar2 = new C53459d(i, i2, queryParameter, str, uri2, null);
        return dVar2;
    }

    public static C53459d authEx(int i, String str) {
        C53459d dVar = new C53459d(1, i, str, null, null, null);
        return dVar;
    }

    public static C53459d generalEx(int i, String str) {
        C53459d dVar = new C53459d(0, i, null, str, null, null);
        return dVar;
    }

    public static C53459d registrationEx(int i, String str) {
        C53459d dVar = new C53459d(4, i, str, null, null, null);
        return dVar;
    }

    public static C53459d tokenEx(int i, String str) {
        C53459d dVar = new C53459d(2, i, str, null, null, null);
        return dVar;
    }

    public static C53459d fromTemplate(C53459d dVar, Throwable th) {
        C53459d dVar2 = new C53459d(dVar.type, dVar.code, dVar.error, dVar.errorDescription, dVar.errorUri, th);
        return dVar2;
    }

    public static C53459d fromOAuthTemplate(C53459d dVar, String str, String str2, Uri uri) {
        int i = dVar.type;
        int i2 = dVar.code;
        if (str == null) {
            str = dVar.error;
        }
        String str3 = str;
        if (str2 == null) {
            str2 = dVar.errorDescription;
        }
        String str4 = str2;
        if (uri == null) {
            uri = dVar.errorUri;
        }
        C53459d dVar2 = new C53459d(i, i2, str3, str4, uri, null);
        return dVar2;
    }

    public C53459d(int i, int i2, String str, String str2, Uri uri, Throwable th) {
        super(str2, th);
        this.type = i;
        this.code = i2;
        this.error = str;
        this.errorDescription = str2;
        this.errorUri = uri;
    }
}
