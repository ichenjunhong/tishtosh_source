package net.openid.appauth;

import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.j */
public final class C53474j {

    /* renamed from: A */
    static final C53485f f132278A = m113559a("service_documentation");

    /* renamed from: B */
    static final C53484e f132279B = m113560b("claims_locales_supported");

    /* renamed from: C */
    static final C53484e f132280C = m113560b("ui_locales_supported");

    /* renamed from: D */
    static final C53480a f132281D = m113557a("claims_parameter_supported", false);

    /* renamed from: E */
    static final C53480a f132282E = m113557a("request_parameter_supported", false);

    /* renamed from: F */
    static final C53480a f132283F = m113557a("request_uri_parameter_supported", true);

    /* renamed from: G */
    static final C53480a f132284G = m113557a("require_request_uri_registration", false);

    /* renamed from: H */
    static final C53485f f132285H = m113559a("op_policy_uri");

    /* renamed from: I */
    static final C53485f f132286I = m113559a("op_tos_uri");

    /* renamed from: K */
    private static final List<String> f132287K = Arrays.asList(new String[]{f132288a.f132317a, f132289b.f132317a, f132292e.f132317a, f132295h.f132319a, f132299l.f132319a, f132300m.f132319a});

    /* renamed from: a */
    static final C53483d f132288a = new C53483d("issuer");

    /* renamed from: b */
    static final C53485f f132289b = m113559a("authorization_endpoint");

    /* renamed from: c */
    static final C53485f f132290c = m113559a("token_endpoint");

    /* renamed from: d */
    static final C53485f f132291d = m113559a("userinfo_endpoint");

    /* renamed from: e */
    static final C53485f f132292e = m113559a("jwks_uri");

    /* renamed from: f */
    static final C53485f f132293f = m113559a("registration_endpoint");

    /* renamed from: g */
    static final C53484e f132294g = m113560b("scopes_supported");

    /* renamed from: h */
    static final C53484e f132295h = m113560b("response_types_supported");

    /* renamed from: i */
    static final C53484e f132296i = m113560b("response_modes_supported");

    /* renamed from: j */
    static final C53484e f132297j = m113558a("grant_types_supported", Arrays.asList(new String[]{"authorization_code", "implicit"}));

    /* renamed from: k */
    static final C53484e f132298k = m113560b("acr_values_supported");

    /* renamed from: l */
    static final C53484e f132299l = m113560b("subject_types_supported");

    /* renamed from: m */
    static final C53484e f132300m = m113560b("id_token_signing_alg_values_supported");

    /* renamed from: n */
    static final C53484e f132301n = m113560b("id_token_encryption_enc_values_supported");

    /* renamed from: o */
    static final C53484e f132302o = m113560b("id_token_encryption_enc_values_supported");

    /* renamed from: p */
    static final C53484e f132303p = m113560b("userinfo_signing_alg_values_supported");

    /* renamed from: q */
    static final C53484e f132304q = m113560b("userinfo_encryption_alg_values_supported");

    /* renamed from: r */
    static final C53484e f132305r = m113560b("userinfo_encryption_enc_values_supported");

    /* renamed from: s */
    static final C53484e f132306s = m113560b("request_object_signing_alg_values_supported");

    /* renamed from: t */
    static final C53484e f132307t = m113560b("request_object_encryption_alg_values_supported");

    /* renamed from: u */
    static final C53484e f132308u = m113560b("request_object_encryption_enc_values_supported");

    /* renamed from: v */
    static final C53484e f132309v = m113558a("token_endpoint_auth_methods_supported", Collections.singletonList("client_secret_basic"));

    /* renamed from: w */
    static final C53484e f132310w = m113560b("token_endpoint_auth_signing_alg_values_supported");

    /* renamed from: x */
    static final C53484e f132311x = m113560b("display_values_supported");

    /* renamed from: y */
    static final C53484e f132312y = m113558a("claim_types_supported", Collections.singletonList(C31483a.f82385b));

    /* renamed from: z */
    static final C53484e f132313z = m113560b("claims_supported");

    /* renamed from: J */
    public final JSONObject f132314J;

    /* renamed from: net.openid.appauth.j$a */
    public static class C53475a extends Exception {

        /* renamed from: a */
        private String f132315a;

        public final String getMissingField() {
            return this.f132315a;
        }

        public C53475a(String str) {
            StringBuilder sb = new StringBuilder("Missing mandatory configuration field: ");
            sb.append(str);
            super(sb.toString());
            this.f132315a = str;
        }
    }

    /* renamed from: b */
    private static C53484e m113560b(String str) {
        return new C53484e(str);
    }

    /* renamed from: a */
    private static C53485f m113559a(String str) {
        return new C53485f(str);
    }

    public C53474j(JSONObject jSONObject) throws JSONException, C53475a {
        this.f132314J = (JSONObject) C53487p.m113584a(jSONObject);
        for (String str : f132287K) {
            if (this.f132314J.has(str)) {
                if (this.f132314J.get(str) == null) {
                }
            }
            throw new C53475a(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T> T mo111234a(C53481b<T> bVar) {
        return C53479n.m113567a(this.f132314J, bVar);
    }

    /* renamed from: a */
    private static C53480a m113557a(String str, boolean z) {
        return new C53480a(str, z);
    }

    /* renamed from: a */
    private static C53484e m113558a(String str, List<String> list) {
        return new C53484e(str, list);
    }
}
