package com.bytedance.jirafast.net;

import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9432q;
import com.bytedance.jirafast.C11991a;
import com.bytedance.jirafast.net.C12060c.C12061a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.squareup.okhttp.MultipartBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.Response;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.jirafast.net.d */
public final class C12062d {

    /* renamed from: a */
    private OkHttpClient f31890a;

    /* renamed from: b */
    private C12061a f31891b;

    /* renamed from: c */
    private C12060c f31892c;

    /* renamed from: d */
    private int f31893d;

    /* renamed from: a */
    private void m24516a(String str) {
        if (this.f31891b != null) {
            new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public final void mo22835a(C12061a aVar) {
        this.f31891b = aVar;
        if (this.f31892c != null) {
            this.f31892c.f31888a = aVar;
        }
    }

    public C12062d(OkHttpClient okHttpClient, int i) {
        this.f31890a = okHttpClient;
        this.f31893d = i;
    }

    /* renamed from: a */
    public final Response mo22834a(String str, String str2) {
        Response response;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            m24516a("file or url invalid");
            return null;
        }
        File file = new File(str);
        if (!file.exists() || file.length() == 0) {
            m24516a("file not exists");
            file = null;
        }
        if (file == null) {
            C18842a.m45934b(new Runnable() {
                public final void run() {
                    C9432q.m18676a(C11991a.m24390a(), "file does not exist");
                }
            });
            m24516a("file not exists");
            return null;
        }
        MultipartBuilder multipartBuilder = new MultipartBuilder();
        this.f31892c = new C12060c(file, this.f31891b);
        multipartBuilder.addFormDataPart("file", file.getName(), this.f31892c);
        String a = C9395d.m18570a(file);
        String str3 = "md5";
        if (a == null) {
            a = "";
        }
        multipartBuilder.addFormDataPart(str3, a);
        if (this.f31893d == 1) {
            multipartBuilder.addFormDataPart("file_type", "txt");
        }
        Request build = new Builder().url(str2).post(multipartBuilder.build()).addHeader("Host", URI.create(str2).getHost()).build();
        this.f31890a.setConnectTimeout(60000, TimeUnit.MILLISECONDS);
        this.f31890a.setWriteTimeout(60000, TimeUnit.MILLISECONDS);
        this.f31890a.setReadTimeout(60000, TimeUnit.MILLISECONDS);
        this.f31890a.setRetryOnConnectionFailure(true);
        try {
            response = this.f31890a.newCall(build).execute();
        } catch (IOException unused) {
            response = null;
        }
        return response;
    }
}
