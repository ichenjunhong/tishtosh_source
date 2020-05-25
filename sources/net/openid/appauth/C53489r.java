package net.openid.appauth;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: net.openid.appauth.r */
public final class C53489r {

    /* renamed from: a */
    public static final Set<String> f132323a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"client_id", "code", "code_verifier", "grant_type", "redirect_uri", "refresh_token", "scope"})));

    /* renamed from: b */
    public final C53473i f132324b;

    /* renamed from: c */
    public final String f132325c;

    /* renamed from: d */
    public final String f132326d;

    /* renamed from: e */
    public final Uri f132327e;

    /* renamed from: f */
    public final String f132328f;

    /* renamed from: g */
    public final String f132329g;

    /* renamed from: h */
    public final String f132330h;

    /* renamed from: i */
    public final String f132331i;

    /* renamed from: j */
    public final Map<String, String> f132332j;

    /* renamed from: net.openid.appauth.r$a */
    public static final class C53491a {

        /* renamed from: a */
        public Uri f132333a;

        /* renamed from: b */
        public String f132334b;

        /* renamed from: c */
        public String f132335c;

        /* renamed from: d */
        public String f132336d;

        /* renamed from: e */
        public String f132337e;

        /* renamed from: f */
        public Map<String, String> f132338f = new LinkedHashMap();

        /* renamed from: g */
        private C53473i f132339g;

        /* renamed from: h */
        private String f132340h;

        /* renamed from: i */
        private String f132341i;

        /* renamed from: b */
        private String m113591b() {
            if (this.f132341i != null) {
                return this.f132341i;
            }
            if (this.f132335c != null) {
                return "authorization_code";
            }
            if (this.f132336d != null) {
                return "refresh_token";
            }
            throw new IllegalStateException("grant type not specified and cannot be inferred");
        }

        /* renamed from: a */
        public final C53489r mo111240a() {
            String b = m113591b();
            if ("authorization_code".equals(b)) {
                C53487p.m113585a(this.f132335c, (Object) "authorization code must be specified for grant_type = authorization_code");
            }
            if ("refresh_token".equals(b)) {
                C53487p.m113585a(this.f132336d, (Object) "refresh token must be specified for grant_type = refresh_token");
            }
            if (!b.equals("authorization_code") || this.f132333a != null) {
                C53489r rVar = new C53489r(this.f132339g, this.f132340h, b, this.f132333a, this.f132334b, this.f132335c, this.f132336d, this.f132337e, Collections.unmodifiableMap(this.f132338f));
                return rVar;
            }
            throw new IllegalStateException("no redirect URI specified on token request for code exchange");
        }

        /* renamed from: a */
        public final C53491a mo111239a(String str) {
            this.f132341i = C53487p.m113586a(str, (Object) "grantType cannot be null or empty");
            return this;
        }

        public C53491a(C53473i iVar, String str) {
            this.f132339g = (C53473i) C53487p.m113584a(iVar);
            this.f132340h = C53487p.m113586a(str, (Object) "clientId cannot be null or empty");
        }
    }

    /* renamed from: a */
    static void m113590a(Map<String, String> map, String str, Object obj) {
        if (obj != null) {
            map.put(str, obj.toString());
        }
    }

    private C53489r(C53473i iVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.f132324b = iVar;
        this.f132325c = str;
        this.f132326d = str2;
        this.f132327e = uri;
        this.f132329g = str3;
        this.f132328f = str4;
        this.f132330h = str5;
        this.f132331i = str6;
        this.f132332j = map;
    }
}
