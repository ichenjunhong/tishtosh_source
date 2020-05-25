package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import com.bytedance.common.utility.p524d.C9396a;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35226bd.C35227a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35228be;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35268h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.squareup.okhttp.OkHttpClient;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.z */
public class C33446z extends C33393ac implements C33445y {

    /* renamed from: a */
    private static int f86682a;

    /* renamed from: b */
    private C35228be f86683b;

    /* renamed from: c */
    public String f86684c;

    /* renamed from: d */
    private C33445y f86685d;

    public int hashCode() {
        return this.f86585f.hashCode();
    }

    /* renamed from: a */
    public final void mo70782a() {
        if (this.f86685d != null) {
            this.f86685d.mo70782a();
        }
        mo70776b();
    }

    public void run() {
        boolean z = false;
        if (this.f86683b == null) {
            mo70785a((Throwable) new IllegalStateException("uploader is null"));
        } else {
            this.f86683b.mo73334a((C35227a) this);
            if (!C9396a.m18583b(this.f86684c)) {
                mo70785a((Throwable) new RuntimeException("compress failed"));
            } else {
                z = true;
            }
        }
        if (z) {
            try {
                C35228be beVar = this.f86683b;
                String str = this.f86684c;
                StringBuilder sb = new StringBuilder();
                sb.append(C35268h.f90601b);
                sb.append("upload/image/");
                String a = beVar.mo73333a(str, sb.toString());
                if (a == null) {
                    mo70785a((Throwable) new RuntimeException("response null"));
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(a);
                    boolean has = jSONObject.has("status_code");
                    int i = -1;
                    if (has) {
                        i = jSONObject.optInt("status_code");
                    }
                    if (!has || i != 0) {
                        mo70785a((Throwable) new C23459a(i).setErrorMsg(jSONObject.toString()));
                        return;
                    }
                    UrlModel urlModel = (UrlModel) C35277o.m79760a(jSONObject.getString("data"), UrlModel.class);
                    if (!(urlModel == null || urlModel.getUrlList() == null)) {
                        if (!urlModel.getUrlList().isEmpty()) {
                            mo70839b(this.f86684c, urlModel);
                            return;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("Code=");
                    sb2.append(i);
                    sb2.append(" Response=");
                    sb2.append(jSONObject.toString());
                    mo70785a((Throwable) new RuntimeException(sb2.toString()));
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

    /* renamed from: a */
    public void mo70784a(String str) {
        mo70776b();
        m76649a((Object) str, true);
    }

    public C33446z(OkHttpClient okHttpClient) {
        this.f86683b = new C35228be(okHttpClient, 0);
        f86682a++;
        this.f86585f = String.valueOf(f86682a);
    }

    /* renamed from: a */
    public final void mo70783a(double d) {
        if (this.f86685d != null) {
            this.f86685d.mo70783a(d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33446z) || this.f86684c == null) {
            return false;
        }
        return this.f86585f.equals(((C33446z) obj).f86585f);
    }

    /* renamed from: a */
    public final void mo70851a(C33445y yVar) {
        this.f86685d = yVar;
        if (this.f86683b != null) {
            this.f86683b.mo73334a((C35227a) this);
        }
    }

    /* renamed from: a */
    public void mo70785a(Throwable th) {
        if (this.f86685d != null) {
            this.f86685d.mo70785a(th);
        }
        mo70776b();
        m76649a((Object) th, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo70839b(String str, UrlModel urlModel) {
        mo70787a(str, urlModel);
    }

    /* renamed from: a */
    private static void m76649a(Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "PhotoUploadItem");
        if (obj != null) {
            if (z) {
                hashMap.put("error", obj);
            } else {
                hashMap.put("success", obj);
            }
        }
        C35265e.m79726a("message_upload_image", hashMap);
        if (z) {
            C35265e.m79731b("message_upload_image_error", hashMap);
        }
    }

    /* renamed from: a */
    public final void mo70787a(String str, UrlModel urlModel) {
        if (this.f86685d != null) {
            this.f86685d.mo70787a(str, urlModel);
        }
        mo70776b();
        m76649a((Object) str, false);
    }
}
