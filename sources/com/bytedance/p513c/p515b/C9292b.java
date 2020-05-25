package com.bytedance.p513c.p515b;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.p513c.C9282a;
import com.bytedance.p513c.C9296c;
import com.bytedance.p513c.C9296c.C9299b;
import com.bytedance.p513c.C9328j;
import com.bytedance.p513c.p515b.C9290a.C9291a;
import com.bytedance.p513c.p516c.C9301b;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.c.b.b */
public final class C9292b {

    /* renamed from: a */
    public static C9299b f25406a = C9299b.REGION_CHINA;

    /* renamed from: f */
    public static int f25407f = 300;

    /* renamed from: g */
    public static int f25408g = 331;

    /* renamed from: h */
    public static double f25409h = 0.5d;

    /* renamed from: b */
    public C9301b f25410b;

    /* renamed from: c */
    public String f25411c;

    /* renamed from: d */
    public String f25412d;

    /* renamed from: e */
    public String f25413e;

    /* renamed from: i */
    public long f25414i;

    /* renamed from: j */
    public long f25415j;

    /* renamed from: k */
    public boolean f25416k;

    /* renamed from: l */
    private String f25417l;

    /* renamed from: m */
    private String f25418m;

    /* renamed from: n */
    private C9291a f25419n = new C9291a() {
        /* renamed from: a */
        public final void mo16882a(C9290a aVar, int i, String str) {
            StringBuilder sb = new StringBuilder("VerifyUrl update ");
            boolean z = false;
            if (i != 200 || TextUtils.isEmpty(str)) {
                C9292b.this.f25414i = System.currentTimeMillis() + C9292b.this.f25415j;
                sb.append("FAIL ");
                sb.append(i);
            } else {
                new StringBuilder("responseContent = ").append(str);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    C9292b.this.f25415j = jSONObject.getLong("period");
                    C9292b.this.f25414i = System.currentTimeMillis() + C9292b.this.f25415j;
                    jSONObject.put("available_time", C9292b.this.f25414i);
                    C9292b.this.f25411c = jSONObject.toString();
                    C9292b.this.mo16883a();
                    z = true;
                    sb.append("SUCCESS");
                } catch (JSONException unused) {
                    sb.append("FAIL cause JSON parse exception");
                }
            }
            C9292b.this.mo16887d();
            if (z) {
                C9328j.m18487a().mo16941a(10, C9292b.this.f25411c);
            }
        }
    };

    /* renamed from: d */
    public final void mo16887d() {
        m18414f();
    }

    /* renamed from: c */
    public final String mo16886c() {
        if (this.f25416k) {
            return m18412b(this.f25417l);
        }
        return this.f25417l;
    }

    /* renamed from: f */
    private void m18414f() {
        long currentTimeMillis = this.f25414i - System.currentTimeMillis();
        if (currentTimeMillis > this.f25415j) {
            currentTimeMillis = this.f25415j;
        }
        if (currentTimeMillis < 30000) {
            currentTimeMillis = 30000;
        }
        C9328j a = C9328j.m18487a();
        if (a.f25539b != null) {
            a.f25539b.removeMessages(2);
        }
        C9328j.m18487a().mo16942a(2, null, currentTimeMillis);
    }

    /* renamed from: b */
    public void mo16885b() {
        String e = m18413e();
        new StringBuilder("settingUrl = ").append(e);
        new C9290a(e, this.f25419n).mo16881a();
    }

    /* renamed from: a */
    public final void mo16883a() {
        C9299b bVar = f25406a;
        Bundle bundle = new Bundle();
        switch (bVar) {
            case REGION_USA_EAST:
                bundle.putString("setting", "verify_va");
                bundle.putString("h5url", "h5_va");
                bundle.putString("smsurl", "sms_va");
                break;
            case REGION_SINGAPOER:
                bundle.putString("setting", "verify_sg");
                bundle.putString("h5url", "h5_sg");
                bundle.putString("smsurl", "sms_sg");
                break;
            case REGION_CHINA:
                bundle.putString("setting", "verify_cn");
                bundle.putString("h5url", "h5_cn");
                bundle.putString("smsurl", "sms_cn");
                break;
            default:
                bundle.putString("setting", "verify_cn");
                bundle.putString("h5url", "h5_cn");
                bundle.putString("smsurl", "sms_cn");
                break;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f25411c);
            String string = jSONObject.getString(bundle.getString("setting"));
            switch (f25406a) {
                case REGION_USA_EAST:
                    if ("1233".equals(this.f25418m)) {
                        string = "https://verification-va.musical.ly";
                        break;
                    }
                    break;
                case REGION_SINGAPOER:
                    if (C23018b.f61360b.equals(this.f25418m)) {
                        string = "https://verify-sg.tiktokv.com";
                        break;
                    }
                    break;
            }
            this.f25417l = string;
            this.f25412d = jSONObject.optString(bundle.getString("h5url"), this.f25412d);
            this.f25413e = jSONObject.optString(bundle.getString("smsurl"), this.f25413e);
            f25407f = jSONObject.optInt("width", f25407f);
            f25408g = jSONObject.optInt("height", f25408g);
            f25409h = jSONObject.optDouble("alpha", f25409h);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: e */
    private String m18413e() {
        String str;
        String c = mo16886c();
        if (c.endsWith("/")) {
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append("captcha/setting");
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c);
            sb2.append("/captcha/setting");
            str = sb2.toString();
        }
        C9296c cVar = C9282a.m18401a().f25384b;
        if (cVar == null) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("?");
        StringBuilder sb4 = new StringBuilder(sb3.toString());
        sb4.append("aid=");
        sb4.append(cVar.f25426b);
        sb4.append("&lang=");
        sb4.append(cVar.f25427c);
        sb4.append("&locale=");
        sb4.append(cVar.f25445u);
        sb4.append("&app_name=");
        sb4.append(cVar.f25428d);
        sb4.append("&ch=");
        sb4.append(cVar.f25429e);
        sb4.append("&os_type=0");
        sb4.append("&sdk_version=");
        sb4.append(cVar.f25430f);
        sb4.append("&app_key=");
        sb4.append(cVar.f25431g);
        sb4.append("&iid=");
        sb4.append(cVar.f25432h);
        sb4.append("&vc=");
        sb4.append(cVar.f25433i);
        sb4.append("&os_name=");
        sb4.append(cVar.f25434j);
        sb4.append("&os_version=");
        sb4.append(cVar.f25435k);
        sb4.append("&did=");
        sb4.append(cVar.f25436l);
        sb4.append("&user_id=");
        sb4.append(cVar.f25439o);
        sb4.append("&session_id=");
        sb4.append(cVar.f25440p);
        sb4.append("&region=");
        sb4.append(cVar.f25425a.getName());
        sb4.append("&device_brand=");
        sb4.append(cVar.f25437m);
        sb4.append("&device_model=");
        sb4.append(cVar.f25438n);
        return sb4.toString();
    }

    /* renamed from: b */
    private static String m18412b(String str) {
        try {
            URL url = new URL(str);
            StringBuilder sb = new StringBuilder("http://");
            sb.append(url.getHost());
            sb.append(".boe-gateway.byted.org");
            return sb.toString();
        } catch (MalformedURLException unused) {
            return str;
        }
    }

    /* renamed from: a */
    public boolean mo16884a(String str) {
        if (str == null) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f25414i = jSONObject.optLong("available_time");
            this.f25415j = jSONObject.optLong("period", 30000);
            long currentTimeMillis = System.currentTimeMillis();
            new StringBuilder("isNeedUpdate ").append(this.f25414i - currentTimeMillis);
            if (this.f25414i > currentTimeMillis) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
            return true;
        }
    }

    public C9292b(String str, boolean z) {
        this.f25418m = str;
        this.f25416k = z;
    }
}
