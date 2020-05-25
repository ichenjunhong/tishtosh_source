package com.bytedance.jirafast.net;

import com.bytedance.common.utility.p524d.C9396a;
import com.bytedance.jirafast.models.C12052b;
import com.bytedance.jirafast.net.C12060c.C12061a;
import com.bytedance.jirafast.p751d.C12015a;
import com.bytedance.jirafast.p751d.C12026g;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.jirafast.net.b */
public final class C12059b implements C12061a {

    /* renamed from: a */
    private C12062d f31887a;

    public C12059b(OkHttpClient okHttpClient) {
        this.f31887a = new C12062d(okHttpClient, 0);
    }

    /* renamed from: a */
    public final List<C12052b> mo22830a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        C12052b bVar = new C12052b();
        for (String str : list) {
            UrlModel urlModel = null;
            try {
                urlModel = m24514a(str);
            } catch (Throwable unused) {
            }
            bVar.f31856a = str;
            bVar.f31857b = urlModel;
            arrayList.add(bVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    private UrlModel m24514a(String str) {
        boolean z = false;
        if (this.f31887a != null) {
            this.f31887a.mo22835a((C12061a) this);
            if (C9396a.m18583b(str)) {
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        C12062d dVar = this.f31887a;
        StringBuilder sb = new StringBuilder();
        sb.append(C12015a.m24416a().mo22755a(C12015a.f31783x));
        sb.append("upload/image/");
        Response a = dVar.mo22834a(str, sb.toString());
        if (a == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a.body().string());
            boolean has = jSONObject.has("status_code");
            int i = -1;
            if (has) {
                i = jSONObject.optInt("status_code");
            }
            if (has && i == 0) {
                return (UrlModel) C12026g.m24443a(jSONObject.getString("data"), UrlModel.class);
            }
        } catch (IOException | Exception | JSONException unused) {
        }
        return null;
    }
}
