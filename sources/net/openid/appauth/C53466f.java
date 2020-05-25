package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.p2682c.C53458b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.f */
public final class C53466f {

    /* renamed from: a */
    public static final Set<String> f132245a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"token_type", "state", "code", "access_token", "expires_in", "id_token", "scope"})));

    /* renamed from: b */
    public final C53463e f132246b;

    /* renamed from: c */
    public final String f132247c;

    /* renamed from: d */
    public final String f132248d;

    /* renamed from: e */
    public final String f132249e;

    /* renamed from: f */
    public final String f132250f;

    /* renamed from: g */
    public final Long f132251g;

    /* renamed from: h */
    public final String f132252h;

    /* renamed from: i */
    public final String f132253i;

    /* renamed from: j */
    public final Map<String, String> f132254j;

    /* renamed from: net.openid.appauth.f$a */
    public static final class C53468a {

        /* renamed from: a */
        Long f132255a;

        /* renamed from: b */
        private C53463e f132256b;

        /* renamed from: c */
        private String f132257c;

        /* renamed from: d */
        private String f132258d;

        /* renamed from: e */
        private String f132259e;

        /* renamed from: f */
        private String f132260f;

        /* renamed from: g */
        private String f132261g;

        /* renamed from: h */
        private String f132262h;

        /* renamed from: i */
        private Map<String, String> f132263i = new LinkedHashMap();

        /* renamed from: a */
        public final C53466f mo111224a() {
            C53466f fVar = new C53466f(this.f132256b, this.f132257c, this.f132258d, this.f132259e, this.f132260f, this.f132255a, this.f132261g, this.f132262h, Collections.unmodifiableMap(this.f132263i));
            return fVar;
        }

        /* renamed from: a */
        private C53468a m113539a(Iterable<String> iterable) {
            this.f132262h = C53454c.m113509a(iterable);
            return this;
        }

        /* renamed from: b */
        public final C53468a mo111225b(String str) {
            C53487p.m113588b(str, "tokenType must not be empty");
            this.f132258d = str;
            return this;
        }

        /* renamed from: c */
        public final C53468a mo111226c(String str) {
            C53487p.m113588b(str, "authorizationCode must not be empty");
            this.f132259e = str;
            return this;
        }

        /* renamed from: d */
        public final C53468a mo111227d(String str) {
            C53487p.m113588b(str, "accessToken must not be empty");
            this.f132260f = str;
            return this;
        }

        /* renamed from: e */
        public final C53468a mo111228e(String str) {
            C53487p.m113588b(str, "idToken cannot be empty");
            this.f132261g = str;
            return this;
        }

        /* renamed from: a */
        private C53468a m113541a(String... strArr) {
            if (strArr == null) {
                this.f132262h = null;
            } else {
                m113539a((Iterable<String>) Arrays.asList(strArr));
            }
            return this;
        }

        public C53468a(C53463e eVar) {
            this.f132256b = (C53463e) C53487p.m113585a(eVar, (Object) "authorization request cannot be null");
        }

        /* renamed from: f */
        public final C53468a mo111229f(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f132262h = null;
            } else {
                m113541a(str.split(" +"));
            }
            return this;
        }

        /* renamed from: a */
        public final C53468a mo111221a(Uri uri) {
            return m113538a(uri, (C53477l) C53488q.f132322a);
        }

        /* renamed from: a */
        public final C53468a mo111222a(String str) {
            C53487p.m113588b(str, "state must not be empty");
            this.f132257c = str;
            return this;
        }

        /* renamed from: a */
        public final C53468a mo111223a(Map<String, String> map) {
            this.f132263i = C53442a.m113497a(map, C53466f.f132245a);
            return this;
        }

        /* renamed from: a */
        private C53468a m113540a(Long l, C53477l lVar) {
            if (l == null) {
                this.f132255a = null;
            } else {
                this.f132255a = Long.valueOf(lVar.mo111237a() + TimeUnit.SECONDS.toMillis(l.longValue()));
            }
            return this;
        }

        /* renamed from: a */
        private C53468a m113538a(Uri uri, C53477l lVar) {
            mo111222a(uri.getQueryParameter("state"));
            mo111225b(uri.getQueryParameter("token_type"));
            mo111226c(uri.getQueryParameter("code"));
            mo111227d(uri.getQueryParameter("access_token"));
            m113540a(C53458b.m113521a(uri, "expires_in"), lVar);
            mo111228e(uri.getQueryParameter("id_token"));
            mo111229f(uri.getQueryParameter("scope"));
            mo111223a(C53442a.m113496a(uri, C53466f.f132245a));
            return this;
        }
    }

    /* renamed from: c */
    private String m113536c() {
        return m113535b().toString();
    }

    /* renamed from: a */
    public final Intent mo111220a() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationResponse", m113536c());
        return intent;
    }

    /* renamed from: b */
    private JSONObject m113535b() {
        JSONObject jSONObject = new JSONObject();
        C53479n.m113572a(jSONObject, "request", this.f132246b.mo111215b());
        C53479n.m113574b(jSONObject, "state", this.f132247c);
        C53479n.m113574b(jSONObject, "token_type", this.f132248d);
        C53479n.m113574b(jSONObject, "code", this.f132249e);
        C53479n.m113574b(jSONObject, "access_token", this.f132250f);
        String str = "expires_at";
        Long l = this.f132251g;
        C53487p.m113585a(jSONObject, (Object) "json must not be null");
        C53487p.m113585a(str, (Object) "field must not be null");
        if (l != null) {
            try {
                jSONObject.put(str, l);
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
        C53479n.m113574b(jSONObject, "id_token", this.f132252h);
        C53479n.m113574b(jSONObject, "scope", this.f132253i);
        C53479n.m113572a(jSONObject, "additional_parameters", C53479n.m113569a(this.f132254j));
        return jSONObject;
    }

    /* renamed from: a */
    public static C53466f m113534a(Intent intent) {
        C53487p.m113585a(intent, (Object) "dataIntent must not be null");
        if (!intent.hasExtra("net.openid.appauth.AuthorizationResponse")) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("net.openid.appauth.AuthorizationResponse"));
            if (jSONObject.has("request")) {
                C53468a a = new C53468a(C53463e.m113527a(jSONObject.getJSONObject("request"))).mo111225b(C53479n.m113573b(jSONObject, "token_type")).mo111227d(C53479n.m113573b(jSONObject, "access_token")).mo111226c(C53479n.m113573b(jSONObject, "code")).mo111228e(C53479n.m113573b(jSONObject, "id_token")).mo111229f(C53479n.m113573b(jSONObject, "scope")).mo111222a(C53479n.m113573b(jSONObject, "state"));
                a.f132255a = C53479n.m113577e(jSONObject, "expires_at");
                return a.mo111223a(C53479n.m113578f(jSONObject, "additional_parameters")).mo111224a();
            }
            throw new IllegalArgumentException("authorization request not provided and not found in JSON");
        } catch (JSONException e) {
            throw new IllegalArgumentException("Intent contains malformed auth response", e);
        }
    }

    private C53466f(C53463e eVar, String str, String str2, String str3, String str4, Long l, String str5, String str6, Map<String, String> map) {
        this.f132246b = eVar;
        this.f132247c = str;
        this.f132248d = str2;
        this.f132249e = str3;
        this.f132250f = str4;
        this.f132251g = l;
        this.f132252h = str5;
        this.f132253i = str6;
        this.f132254j = map;
    }
}
