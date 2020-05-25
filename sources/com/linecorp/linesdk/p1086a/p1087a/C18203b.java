package com.linecorp.linesdk.p1086a.p1087a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.linecorp.linesdk.p1086a.C18211b;
import com.linecorp.linesdk.p1086a.C18214d;
import com.linecorp.linesdk.p1086a.C18215e;
import com.linecorp.linesdk.p1086a.C18216f;
import com.linecorp.linesdk.p1086a.C18217g;
import com.linecorp.linesdk.p1086a.p1087a.p1088a.C18197a;
import com.linecorp.linesdk.p1086a.p1087a.p1088a.C18200d;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.linecorp.linesdk.a.a.b */
public final class C18203b {

    /* renamed from: a */
    public static final C18200d<C18216f> f50254a = new C18205b(0);

    /* renamed from: b */
    public static final C18200d<C18215e> f50255b = new C18204a(0);

    /* renamed from: c */
    public static final C18200d<C18211b> f50256c = new C18207d(0);

    /* renamed from: d */
    public static final C18200d<C18217g> f50257d = new C18206c(0);

    /* renamed from: e */
    public static final C18200d<?> f50258e = new C18208c();

    /* renamed from: f */
    public final Uri f50259f;

    /* renamed from: g */
    public final C18197a f50260g;

    /* renamed from: com.linecorp.linesdk.a.a.b$a */
    static class C18204a extends C18196a<C18215e> {
        private C18204a() {
        }

        /* synthetic */ C18204a(byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo36280a(JSONObject jSONObject) {
            List list;
            String string = jSONObject.getString("token_type");
            if ("Bearer".equals(string)) {
                String optString = jSONObject.optString("scope");
                C18214d dVar = new C18214d(jSONObject.getString("access_token"), jSONObject.getLong("expires_in") * 1000, System.currentTimeMillis(), jSONObject.getString("refresh_token"));
                if (TextUtils.isEmpty(optString)) {
                    list = Collections.emptyList();
                } else {
                    list = Arrays.asList(optString.split(" "));
                }
                return new C18215e(dVar, list);
            }
            throw new JSONException("Illegal token type. token_type=".concat(String.valueOf(string)));
        }
    }

    /* renamed from: com.linecorp.linesdk.a.a.b$b */
    static class C18205b extends C18196a<C18216f> {
        private C18205b() {
        }

        /* synthetic */ C18205b(byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo36280a(JSONObject jSONObject) {
            return new C18216f(jSONObject.getString("otpId"), jSONObject.getString("otp"));
        }
    }

    /* renamed from: com.linecorp.linesdk.a.a.b$c */
    static class C18206c extends C18196a<C18217g> {
        private C18206c() {
        }

        /* synthetic */ C18206c(byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo36280a(JSONObject jSONObject) {
            String string = jSONObject.getString("token_type");
            if ("Bearer".equals(string)) {
                return new C18217g(jSONObject.getString("access_token"), jSONObject.getLong("expires_in") * 1000, jSONObject.optString("refresh_token"));
            }
            throw new JSONException("Illegal token type. token_type=".concat(String.valueOf(string)));
        }
    }

    /* renamed from: com.linecorp.linesdk.a.a.b$d */
    static class C18207d extends C18196a<C18211b> {
        private C18207d() {
        }

        /* synthetic */ C18207d(byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo36280a(JSONObject jSONObject) {
            List list;
            String optString = jSONObject.optString("scope");
            String string = jSONObject.getString("client_id");
            long j = jSONObject.getLong("expires_in") * 1000;
            if (TextUtils.isEmpty(optString)) {
                list = Collections.emptyList();
            } else {
                list = Arrays.asList(optString.split(" "));
            }
            return new C18211b(string, j, list);
        }
    }

    private C18203b(Uri uri, C18197a aVar) {
        this.f50259f = uri;
        this.f50260g = aVar;
    }

    public C18203b(Context context, Uri uri) {
        this(uri, new C18197a(context, "4.0.8"));
    }
}
