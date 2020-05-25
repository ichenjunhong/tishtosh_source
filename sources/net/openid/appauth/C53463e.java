package net.openid.appauth;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import net.openid.appauth.p2682c.C53458b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.e */
public final class C53463e {

    /* renamed from: a */
    public static final Set<String> f132216a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"client_id", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "redirect_uri", "response_mode", "response_type", "scope", "state"})));

    /* renamed from: b */
    public final C53473i f132217b;

    /* renamed from: c */
    public final String f132218c;

    /* renamed from: d */
    public final String f132219d;

    /* renamed from: e */
    public final String f132220e;

    /* renamed from: f */
    public final String f132221f;

    /* renamed from: g */
    public final String f132222g;

    /* renamed from: h */
    public final Uri f132223h;

    /* renamed from: i */
    public final String f132224i;

    /* renamed from: j */
    public final String f132225j;

    /* renamed from: k */
    public final String f132226k;

    /* renamed from: l */
    public final String f132227l;

    /* renamed from: m */
    public final String f132228m;

    /* renamed from: n */
    public final String f132229n;

    /* renamed from: o */
    public final Map<String, String> f132230o;

    /* renamed from: net.openid.appauth.e$a */
    public static final class C53465a {

        /* renamed from: a */
        String f132231a;

        /* renamed from: b */
        String f132232b;

        /* renamed from: c */
        String f132233c;

        /* renamed from: d */
        String f132234d;

        /* renamed from: e */
        String f132235e;

        /* renamed from: f */
        String f132236f;

        /* renamed from: g */
        String f132237g;

        /* renamed from: h */
        Map<String, String> f132238h = new HashMap();

        /* renamed from: i */
        private C53473i f132239i;

        /* renamed from: j */
        private String f132240j;

        /* renamed from: k */
        private String f132241k;

        /* renamed from: l */
        private Uri f132242l;

        /* renamed from: m */
        private String f132243m;

        /* renamed from: n */
        private String f132244n;

        /* renamed from: a */
        public final C53463e mo111219a() {
            C53463e eVar = new C53463e(this.f132239i, this.f132240j, this.f132241k, this.f132242l, this.f132231a, this.f132232b, this.f132233c, this.f132243m, this.f132244n, this.f132234d, this.f132235e, this.f132236f, this.f132237g, Collections.unmodifiableMap(new HashMap(this.f132238h)));
            return eVar;
        }

        /* renamed from: a */
        public final C53465a mo111217a(Iterable<String> iterable) {
            this.f132243m = C53454c.m113509a(iterable);
            return this;
        }

        /* renamed from: a */
        public final C53465a mo111218a(String str) {
            this.f132244n = C53487p.m113588b(str, "state cannot be empty if defined");
            return this;
        }

        public C53465a(C53473i iVar, String str, String str2, Uri uri) {
            this.f132239i = (C53473i) C53487p.m113585a(iVar, (Object) "configuration cannot be null");
            this.f132240j = C53487p.m113586a(str, (Object) "client ID cannot be null or empty");
            this.f132241k = C53487p.m113586a(str2, (Object) "expected response type cannot be null or empty");
            this.f132242l = (Uri) C53487p.m113585a(uri, (Object) "redirect URI cannot be null or empty");
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            mo111218a(Base64.encodeToString(bArr, 11));
            SecureRandom secureRandom = new SecureRandom();
            C53487p.m113585a(secureRandom, (Object) "entropySource cannot be null");
            C53487p.m113587a(true, (Object) "entropyBytes is less than the minimum permitted");
            C53487p.m113587a(true, (Object) "entropyBytes is greater than the maximum permitted");
            byte[] bArr2 = new byte[64];
            secureRandom.nextBytes(bArr2);
            String encodeToString = Base64.encodeToString(bArr2, 11);
            if (encodeToString != null) {
                C53478m.m113565a(encodeToString);
                this.f132234d = encodeToString;
                this.f132235e = C53478m.m113566b(encodeToString);
                this.f132236f = C53478m.m113564a();
                return;
            }
            this.f132234d = null;
            this.f132235e = null;
            this.f132236f = null;
        }
    }

    /* renamed from: c */
    public final String mo111216c() {
        return mo111215b().toString();
    }

    /* renamed from: b */
    public final JSONObject mo111215b() {
        JSONObject jSONObject = new JSONObject();
        String str = "configuration";
        C53473i iVar = this.f132217b;
        JSONObject jSONObject2 = new JSONObject();
        C53479n.m113571a(jSONObject2, "authorizationEndpoint", iVar.f132274a.toString());
        C53479n.m113571a(jSONObject2, "tokenEndpoint", iVar.f132275b.toString());
        if (iVar.f132276c != null) {
            C53479n.m113571a(jSONObject2, "registrationEndpoint", iVar.f132276c.toString());
        }
        if (iVar.f132277d != null) {
            C53479n.m113572a(jSONObject2, "discoveryDoc", iVar.f132277d.f132314J);
        }
        C53479n.m113572a(jSONObject, str, jSONObject2);
        C53479n.m113571a(jSONObject, "clientId", this.f132218c);
        C53479n.m113571a(jSONObject, "responseType", this.f132222g);
        C53479n.m113571a(jSONObject, "redirectUri", this.f132223h.toString());
        C53479n.m113574b(jSONObject, "display", this.f132219d);
        C53479n.m113574b(jSONObject, "login_hint", this.f132220e);
        C53479n.m113574b(jSONObject, "scope", this.f132224i);
        C53479n.m113574b(jSONObject, "prompt", this.f132221f);
        C53479n.m113574b(jSONObject, "state", this.f132225j);
        C53479n.m113574b(jSONObject, "codeVerifier", this.f132226k);
        C53479n.m113574b(jSONObject, "codeVerifierChallenge", this.f132227l);
        C53479n.m113574b(jSONObject, "codeVerifierChallengeMethod", this.f132228m);
        C53479n.m113574b(jSONObject, "responseMode", this.f132229n);
        C53479n.m113572a(jSONObject, "additionalParameters", C53479n.m113569a(this.f132230o));
        return jSONObject;
    }

    /* renamed from: a */
    public final Uri mo111214a() {
        Builder appendQueryParameter = this.f132217b.f132274a.buildUpon().appendQueryParameter("redirect_uri", this.f132223h.toString()).appendQueryParameter("client_id", this.f132218c).appendQueryParameter("response_type", this.f132222g);
        C53458b.m113525a(appendQueryParameter, "display", this.f132219d);
        C53458b.m113525a(appendQueryParameter, "login_hint", this.f132220e);
        C53458b.m113525a(appendQueryParameter, "prompt", this.f132221f);
        C53458b.m113525a(appendQueryParameter, "state", this.f132225j);
        C53458b.m113525a(appendQueryParameter, "scope", this.f132224i);
        C53458b.m113525a(appendQueryParameter, "response_mode", this.f132229n);
        if (this.f132226k != null) {
            appendQueryParameter.appendQueryParameter("code_challenge", this.f132227l).appendQueryParameter("code_challenge_method", this.f132228m);
        }
        for (Entry entry : this.f132230o.entrySet()) {
            appendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return appendQueryParameter.build();
    }

    /* renamed from: a */
    public static C53463e m113526a(String str) throws JSONException {
        C53487p.m113585a(str, (Object) "json string cannot be null");
        return m113527a(new JSONObject(str));
    }

    /* renamed from: a */
    public static C53463e m113527a(JSONObject jSONObject) throws JSONException {
        LinkedHashSet linkedHashSet;
        boolean z;
        C53487p.m113585a(jSONObject, (Object) "json cannot be null");
        C53465a aVar = new C53465a(C53473i.m113556a(jSONObject.getJSONObject("configuration")), C53479n.m113568a(jSONObject, "clientId"), C53479n.m113568a(jSONObject, "responseType"), C53479n.m113575c(jSONObject, "redirectUri"));
        aVar.f132231a = C53487p.m113588b(C53479n.m113573b(jSONObject, "display"), "display must be null or not empty");
        aVar.f132232b = C53487p.m113588b(C53479n.m113573b(jSONObject, "login_hint"), "login hint must be null or not empty");
        aVar.f132233c = C53487p.m113588b(C53479n.m113573b(jSONObject, "prompt"), "prompt must be null or non-empty");
        C53465a a = aVar.mo111218a(C53479n.m113573b(jSONObject, "state"));
        String b = C53479n.m113573b(jSONObject, "codeVerifier");
        String b2 = C53479n.m113573b(jSONObject, "codeVerifierChallenge");
        String b3 = C53479n.m113573b(jSONObject, "codeVerifierChallengeMethod");
        if (b != null) {
            C53478m.m113565a(b);
            C53487p.m113586a(b2, (Object) "code verifier challenge cannot be null or empty if verifier is set");
            C53487p.m113586a(b3, (Object) "code verifier challenge method cannot be null or empty if verifier is set");
        } else {
            boolean z2 = false;
            if (b2 == null) {
                z = true;
            } else {
                z = false;
            }
            C53487p.m113587a(z, (Object) "code verifier challenge must be null if verifier is null");
            if (b3 == null) {
                z2 = true;
            }
            C53487p.m113587a(z2, (Object) "code verifier challenge method must be null if verifier is null");
        }
        a.f132234d = b;
        a.f132235e = b2;
        a.f132236f = b3;
        String b4 = C53479n.m113573b(jSONObject, "responseMode");
        C53487p.m113588b(b4, "responseMode must not be empty");
        a.f132237g = b4;
        a.f132238h = C53442a.m113497a(C53479n.m113578f(jSONObject, "additionalParameters"), f132216a);
        if (jSONObject.has("scope")) {
            String a2 = C53479n.m113568a(jSONObject, "scope");
            if (a2 == null) {
                linkedHashSet = null;
            } else {
                List asList = Arrays.asList(TextUtils.split(a2, " "));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(asList.size());
                linkedHashSet2.addAll(asList);
                linkedHashSet = linkedHashSet2;
            }
            a.mo111217a((Iterable<String>) linkedHashSet);
        }
        return a.mo111219a();
    }

    private C53463e(C53473i iVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map<String, String> map) {
        this.f132217b = iVar;
        this.f132218c = str;
        this.f132222g = str2;
        this.f132223h = uri;
        this.f132230o = map;
        this.f132219d = str3;
        this.f132220e = str4;
        this.f132221f = str5;
        this.f132224i = str6;
        this.f132225j = str7;
        this.f132226k = str8;
        this.f132227l = str9;
        this.f132228m = str10;
        this.f132229n = str11;
    }
}
