package com.p683ss.android.account;

import com.bytedance.sdk.account.p877l.C13206a;
import com.bytedance.sdk.account.p877l.C13207b;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;

/* renamed from: com.ss.android.account.b */
public final class C18492b extends C18490a {

    /* renamed from: A */
    public int f50924A;

    /* renamed from: B */
    public int f50925B;

    /* renamed from: C */
    public int f50926C;

    /* renamed from: D */
    public long f50927D;

    /* renamed from: E */
    public String f50928E;

    /* renamed from: F */
    public int f50929F;

    /* renamed from: G */
    public int f50930G;

    /* renamed from: H */
    public boolean f50931H;

    /* renamed from: I */
    public boolean f50932I;

    /* renamed from: J */
    public boolean f50933J;

    /* renamed from: K */
    public int f50934K;

    /* renamed from: o */
    public String f50935o;

    /* renamed from: p */
    public String f50936p;

    /* renamed from: q */
    public long f50937q;

    /* renamed from: r */
    public String f50938r;

    /* renamed from: s */
    public String f50939s;

    /* renamed from: t */
    public boolean f50940t;

    /* renamed from: u */
    public String f50941u;

    /* renamed from: v */
    public String f50942v;

    /* renamed from: w */
    public int f50943w;

    /* renamed from: x */
    public int f50944x;

    /* renamed from: y */
    public int f50945y;

    /* renamed from: z */
    public int f50946z;

    /* renamed from: com.ss.android.account.b$a */
    public static class C18493a implements C13206a<C18492b> {
        /* renamed from: a */
        public final /* synthetic */ C13207b mo24801a(JSONObject jSONObject) throws Exception {
            return m44735b(jSONObject);
        }

        /* renamed from: b */
        public static C18492b m44735b(JSONObject jSONObject) throws Exception {
            C18492b bVar = new C18492b(jSONObject);
            bVar.mo24803a();
            return bVar;
        }

        /* renamed from: a */
        public final /* synthetic */ C13207b mo24802a(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
            return m44736b(jSONObject, jSONObject2);
        }

        /* renamed from: b */
        public static C18492b m44736b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
            C18492b bVar = new C18492b(jSONObject, jSONObject2);
            bVar.mo24803a();
            return bVar;
        }
    }

    /* renamed from: a */
    public final void mo24803a() throws Exception {
        boolean z;
        super.mo24803a();
        JSONObject jSONObject = this.f34483k;
        this.f50943w = jSONObject.optInt("can_be_found_by_phone");
        this.f50944x = jSONObject.optInt("share_to_repost", -1);
        boolean z2 = true;
        this.f50945y = jSONObject.optInt("user_privacy_extend") & 1;
        this.f50946z = jSONObject.optInt("user_privacy_extend");
        this.f50930G = jSONObject.optInt("gender");
        this.f50935o = jSONObject.optString("screen_name");
        this.f50936p = jSONObject.optString("verified_content");
        this.f50931H = jSONObject.optBoolean("is_generated");
        this.f50932I = jSONObject.optBoolean("user_verified");
        if (jSONObject.optInt("is_recommend_allowed") != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f50940t = z;
        this.f50941u = jSONObject.optString("recommend_hint_message");
        this.f50942v = jSONObject.optString("user_decoration");
        if (jSONObject.optInt("has_password") == 0) {
            z2 = false;
        }
        this.f50933J = z2;
        JSONObject optJSONObject = jSONObject.optJSONObject("media");
        if (optJSONObject != null) {
            this.f50938r = optJSONObject.optString("avatar_url");
            this.f50937q = optJSONObject.optLong("id");
            this.f50939s = optJSONObject.optString(LeakCanaryFileProvider.f132049i);
            this.f50929F = optJSONObject.optInt("display_app_ocr_entrance", 0);
        }
        this.f50924A = jSONObject.optInt("followings_count");
        this.f50925B = jSONObject.optInt("followers_count");
        this.f50926C = jSONObject.optInt("visit_count_recent");
        this.f50927D = jSONObject.optLong("media_id");
        this.f50928E = jSONObject.optString("bg_img_url");
        this.f50934K = jSONObject.optInt("app_id");
    }

    public C18492b(JSONObject jSONObject) {
        super(jSONObject);
    }

    public C18492b(JSONObject jSONObject, JSONObject jSONObject2) {
        super(jSONObject, jSONObject2);
    }
}
