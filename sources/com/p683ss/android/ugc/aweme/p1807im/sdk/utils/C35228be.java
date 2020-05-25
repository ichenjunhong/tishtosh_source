package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35226bd.C35227a;
import com.squareup.okhttp.MultipartBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.Response;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.be */
public final class C35228be {

    /* renamed from: a */
    private OkHttpClient f90527a;

    /* renamed from: b */
    private C35227a f90528b;

    /* renamed from: c */
    private C35226bd f90529c;

    /* renamed from: d */
    private int f90530d;

    /* renamed from: a */
    private void m79624a(String str) {
        if (this.f90528b != null) {
            this.f90528b.mo70785a((Throwable) new IllegalArgumentException(str));
        }
    }

    /* renamed from: b */
    private static String m79625b(String str) {
        return URI.create(str).getHost();
    }

    /* renamed from: a */
    public final void mo73334a(C35227a aVar) {
        this.f90528b = aVar;
        if (this.f90529c != null) {
            this.f90529c.f90525a = aVar;
        }
    }

    public C35228be(OkHttpClient okHttpClient, int i) {
        this.f90527a = okHttpClient;
        this.f90530d = i;
    }

    /* renamed from: b */
    private String m79626b(String str, File file) throws IOException {
        C12799u uVar;
        IUploaderApi iUploaderApi = (IUploaderApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C35268h.f90601b).mo19924a(true).mo19925a().mo19930a(IUploaderApi.class);
        String b = m79625b(str);
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        String a = C9395d.m18570a(file);
        multipartTypedOutput.addPart("file", new C35305x(null, file, this.f90528b));
        if (a == null) {
            a = "";
        }
        multipartTypedOutput.addPart("md5", new TypedString(a));
        if (this.f90530d == 1) {
            multipartTypedOutput.addPart("file_type", new TypedString("mpeg"));
        }
        try {
            uVar = iUploaderApi.upload(str, b, multipartTypedOutput).execute();
        } catch (Exception unused) {
            uVar = null;
        }
        if (uVar == null) {
            return null;
        }
        return (String) uVar.f33552b;
    }

    /* renamed from: a */
    public final String mo73333a(String str, String str2) throws IOException {
        if (!C35230bf.m79629a(C11010c.m22280a())) {
            C10691a.m21542b(C11010c.m22280a(), (int) R.string.bl6).mo19066a();
            m79624a("network is unavailable");
            return null;
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            m79624a("file or url invalid");
            return null;
        } else {
            File file = new File(str);
            if (!file.exists() || file.length() == 0) {
                m79624a("file not exists");
                file = null;
            }
            if (file == null) {
                C18842a.m45934b(new Runnable() {
                    public final void run() {
                        C9432q.m18672a(C11010c.m22280a(), (int) R.string.blx);
                    }
                });
                m79624a("file is null");
                return null;
            }
            try {
                if (C32816h.m75716b().getImUseOkhttpclient().getUploaderUseOkhttpclient().booleanValue()) {
                    return m79623a(str2, file);
                }
                return m79626b(str2, file);
            } catch (C10174a unused) {
                return m79626b(str2, file);
            }
        }
    }

    /* renamed from: a */
    private String m79623a(String str, File file) throws IOException {
        Response response;
        MultipartBuilder multipartBuilder = new MultipartBuilder();
        this.f90529c = new C35226bd(file, this.f90528b);
        multipartBuilder.addFormDataPart("file", file.getName(), this.f90529c);
        String a = C9395d.m18570a(file);
        String str2 = "md5";
        if (a == null) {
            a = "";
        }
        multipartBuilder.addFormDataPart(str2, a);
        if (this.f90530d == 1) {
            multipartBuilder.addFormDataPart("file_type", "mpeg");
        }
        Request build = new Builder().url(str).post(multipartBuilder.build()).addHeader("Host", m79625b(str)).build();
        if (this.f90527a == null) {
            this.f90527a = new OkHttpClient();
        }
        this.f90527a.setConnectTimeout(60000, TimeUnit.MILLISECONDS);
        this.f90527a.setWriteTimeout(60000, TimeUnit.MILLISECONDS);
        this.f90527a.setReadTimeout(60000, TimeUnit.MILLISECONDS);
        this.f90527a.setRetryOnConnectionFailure(true);
        try {
            response = this.f90527a.newCall(build).execute();
        } catch (Exception unused) {
            response = null;
        }
        if (response == null) {
            return null;
        }
        try {
            return response.body().string();
        } catch (IOException e) {
            throw e;
        }
    }
}
