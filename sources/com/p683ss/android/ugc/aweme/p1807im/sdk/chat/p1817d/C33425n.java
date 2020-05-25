package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import com.bytedance.common.utility.p524d.C9396a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35226bd.C35227a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35228be;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35268h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.squareup.okhttp.OkHttpClient;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.n */
public class C33425n extends C33393ac implements C33424m {

    /* renamed from: b */
    private static int f86643b;

    /* renamed from: a */
    public String f86644a;

    /* renamed from: c */
    private C35228be f86645c;

    /* renamed from: d */
    private C33424m f86646d;

    public int hashCode() {
        return this.f86585f.hashCode();
    }

    /* renamed from: a */
    public final void mo70782a() {
        if (this.f86646d != null) {
            this.f86646d.mo70782a();
        }
        mo70776b();
    }

    public void run() {
        String str = this.f86644a;
        boolean z = false;
        if (this.f86645c == null) {
            mo70785a((Throwable) new IllegalStateException("uploader is null"));
        } else {
            this.f86645c.mo73334a((C35227a) this);
            if (!C9396a.m18583b(str)) {
                mo70785a((Throwable) new IllegalStateException(" file not exist"));
            } else {
                z = true;
            }
        }
        if (z) {
            try {
                C35228be beVar = this.f86645c;
                String str2 = this.f86644a;
                StringBuilder sb = new StringBuilder();
                sb.append(C35268h.f90601b);
                sb.append("upload/file/");
                try {
                    JSONObject jSONObject = new JSONObject(beVar.mo73333a(str2, sb.toString()));
                    int i = -1;
                    if (jSONObject.has("status_code")) {
                        i = jSONObject.optInt("status_code");
                    }
                    if (i == 0) {
                        String string = jSONObject.getString("data");
                        UrlModel urlModel = (UrlModel) C35277o.m79760a(string, UrlModel.class);
                        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
                            StringBuilder sb2 = new StringBuilder(" audio upload success, url is null, data : ");
                            sb2.append(string);
                            String sb3 = sb2.toString();
                            StringBuilder sb4 = new StringBuilder("log_message_audio_error");
                            sb4.append(sb3);
                            C32458a.m75144a(sb4.toString());
                        }
                        mo70831a(this.f86644a, urlModel);
                        mo70782a();
                        return;
                    }
                    mo70784a(jSONObject.toString());
                } catch (JSONException e) {
                    mo70785a((Throwable) e);
                } catch (Exception e2) {
                    mo70785a((Throwable) e2);
                }
            } catch (IOException e3) {
                mo70785a((Throwable) e3);
            }
        }
    }

    public C33425n(OkHttpClient okHttpClient) {
        this.f86645c = new C35228be(okHttpClient, 1);
        f86643b++;
        this.f86585f = String.valueOf(f86643b);
    }

    /* renamed from: a */
    public final void mo70783a(double d) {
        if (this.f86646d != null) {
            this.f86646d.mo70783a(d);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C33425n) || this.f86644a == null) {
            return false;
        }
        return this.f86585f.equals(((C33425n) obj).f86585f);
    }

    /* renamed from: a */
    public void mo70784a(String str) {
        if (this.f86646d != null) {
            this.f86646d.mo70784a(str);
        }
        mo70776b();
    }

    /* renamed from: a */
    public void mo70785a(Throwable th) {
        if (this.f86646d != null) {
            this.f86646d.mo70785a(th);
        }
        mo70776b();
    }

    /* renamed from: a */
    public void mo70831a(String str, UrlModel urlModel) {
        if (this.f86646d != null) {
            this.f86646d.mo70831a(str, urlModel);
        }
        mo70776b();
    }
}
