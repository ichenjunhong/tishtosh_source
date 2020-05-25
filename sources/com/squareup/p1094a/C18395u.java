package com.squareup.p1094a;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.CacheControl.Builder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.p1094a.C18382l.C18383a;
import com.squareup.p1094a.C18382l.C18384b;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.a.u */
public final class C18395u implements C18382l {

    /* renamed from: a */
    public final OkHttpClient f50793a;

    public C18395u(Context context) {
        this(C18356aj.m44601b(context));
    }

    private C18395u(OkHttpClient okHttpClient) {
        this.f50793a = okHttpClient;
    }

    private C18395u(File file) {
        this(file, C18356aj.m44588a(file));
    }

    private C18395u(File file, long j) {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(15000, TimeUnit.MILLISECONDS);
        okHttpClient.setReadTimeout(20000, TimeUnit.MILLISECONDS);
        okHttpClient.setWriteTimeout(20000, TimeUnit.MILLISECONDS);
        this(okHttpClient);
        try {
            this.f50793a.setCache(new Cache(file, j));
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public final C18383a mo36800a(Uri uri, int i) throws IOException {
        CacheControl cacheControl;
        boolean z;
        if (i == 0) {
            cacheControl = null;
        } else if (C18392s.isOfflineOnly(i)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            Builder builder = new Builder();
            if (!C18392s.shouldReadFromDiskCache(i)) {
                builder.noCache();
            }
            if (!C18392s.shouldWriteToDiskCache(i)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        Response execute = this.f50793a.newCall(url.build()).execute();
        int code = execute.code();
        if (code < 300) {
            if (execute.cacheResponse() != null) {
                z = true;
            } else {
                z = false;
            }
            ResponseBody body = execute.body();
            return new C18383a(body.byteStream(), z, body.contentLength());
        }
        execute.body().close();
        StringBuilder sb = new StringBuilder();
        sb.append(code);
        sb.append(" ");
        sb.append(execute.message());
        throw new C18384b(sb.toString(), i, code);
    }
}
