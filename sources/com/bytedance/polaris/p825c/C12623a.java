package com.bytedance.polaris.p825c;

import android.app.ProgressDialog;
import com.bytedance.common.utility.C9431p;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.c.a */
public final class C12623a {

    /* renamed from: a */
    public int f33156a;

    /* renamed from: b */
    public String f33157b;

    /* renamed from: c */
    public String f33158c;

    /* renamed from: d */
    public String f33159d;

    /* renamed from: e */
    public String f33160e;

    /* renamed from: f */
    public String f33161f;

    /* renamed from: g */
    public String f33162g;

    /* renamed from: h */
    public String f33163h;

    /* renamed from: i */
    public String f33164i;

    /* renamed from: j */
    public boolean f33165j;

    /* renamed from: k */
    public boolean f33166k;

    /* renamed from: l */
    public JSONObject f33167l;

    /* renamed from: m */
    public WeakReference<ProgressDialog> f33168m;

    /* renamed from: n */
    public byte[] f33169n;

    /* renamed from: o */
    public String f33170o;

    /* renamed from: p */
    public String f33171p;

    /* renamed from: a */
    public final void mo23725a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.f33157b = jSONObject.optString("platform", "");
            this.f33158c = jSONObject.optString("title", "");
            this.f33159d = jSONObject.optString("desc", "");
            this.f33161f = jSONObject.optString("image", "");
            this.f33162g = jSONObject.optString("url", "");
            this.f33163h = jSONObject.optString("channel", "sdk");
            this.f33160e = jSONObject.optString("text", "");
            this.f33164i = jSONObject.optString("qr_code_url", "");
            this.f33166k = jSONObject.optBoolean("image_have_qrcode", false);
            this.f33165j = jSONObject.optBoolean("is_include_logo", false);
            if (C9431p.m18664a(this.f33159d)) {
                this.f33159d = this.f33160e;
            }
        }
    }
}
