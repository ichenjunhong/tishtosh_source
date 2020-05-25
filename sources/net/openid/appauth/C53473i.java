package net.openid.appauth;

import android.net.Uri;
import net.openid.appauth.C53474j.C53475a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.i */
public final class C53473i {

    /* renamed from: a */
    public final Uri f132274a;

    /* renamed from: b */
    public final Uri f132275b;

    /* renamed from: c */
    public final Uri f132276c;

    /* renamed from: d */
    public final C53474j f132277d;

    private C53473i(C53474j jVar) {
        C53487p.m113585a(jVar, (Object) "docJson cannot be null");
        this.f132277d = jVar;
        this.f132274a = (Uri) jVar.mo111234a((C53481b<T>) C53474j.f132289b);
        this.f132275b = (Uri) jVar.mo111234a((C53481b<T>) C53474j.f132290c);
        this.f132276c = (Uri) jVar.mo111234a((C53481b<T>) C53474j.f132293f);
    }

    /* renamed from: a */
    public static C53473i m113556a(JSONObject jSONObject) throws JSONException {
        C53487p.m113585a(jSONObject, (Object) "json object cannot be null");
        if (jSONObject.has("discoveryDoc")) {
            try {
                return new C53473i(new C53474j(jSONObject.optJSONObject("discoveryDoc")));
            } catch (C53475a e) {
                StringBuilder sb = new StringBuilder("Missing required field in discovery doc: ");
                sb.append(e.getMissingField());
                throw new JSONException(sb.toString());
            }
        } else {
            C53487p.m113587a(jSONObject.has("authorizationEndpoint"), (Object) "missing authorizationEndpoint");
            C53487p.m113587a(jSONObject.has("tokenEndpoint"), (Object) "missing tokenEndpoint");
            return new C53473i(C53479n.m113575c(jSONObject, "authorizationEndpoint"), C53479n.m113575c(jSONObject, "tokenEndpoint"), C53479n.m113576d(jSONObject, "registrationEndpoint"));
        }
    }

    public C53473i(Uri uri, Uri uri2) {
        this(uri, uri2, null);
    }

    private C53473i(Uri uri, Uri uri2, Uri uri3) {
        this.f132274a = (Uri) C53487p.m113584a(uri);
        this.f132275b = (Uri) C53487p.m113584a(uri2);
        this.f132276c = uri3;
        this.f132277d = null;
    }
}
