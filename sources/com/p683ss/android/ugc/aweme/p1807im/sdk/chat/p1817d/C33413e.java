package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33414f.C33416a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.squareup.okhttp.OkHttpClient;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.e */
public class C33413e extends C33392ab implements C33416a {

    /* renamed from: d */
    private static int f86623d;

    /* renamed from: a */
    protected UrlModel f86624a;

    /* renamed from: b */
    public String f86625b;

    /* renamed from: c */
    protected C33416a f86626c;

    /* renamed from: e */
    private C33414f f86627e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo70822a(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo70823b(String str) {
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo70824c(String str) {
        return str;
    }

    /* renamed from: d */
    private void m76591d() {
        this.f86627e.mo70826a(this.f86625b, mo70824c("download"), this.f86624a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo70818a() {
        StringBuilder sb = new StringBuilder();
        sb.append(C35265e.m79730b());
        sb.append("/im/download");
        return C11010c.m22280a().getExternalFilesDir(sb.toString()).getAbsolutePath();
    }

    public void run() {
        this.f86625b = mo70818a();
        File file = new File(mo70823b(this.f86625b));
        if (mo70822a(file.getAbsolutePath())) {
            mo70820a(file.getAbsolutePath(), null);
            return;
        }
        UrlModel urlModel = this.f86624a;
        boolean z = false;
        if (this.f86627e == null) {
            mo70821a((Throwable) new IllegalStateException("downloader is null"));
        } else {
            this.f86627e.f86628a = this;
            if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
                mo70821a((Throwable) new IllegalStateException("downloadUrl is null"));
            } else {
                z = true;
            }
        }
        if (z) {
            try {
                if (C32816h.m75716b().getImUseOkhttpclient().getDownloaderUseOkhttpclient().booleanValue()) {
                    m76590c();
                } else {
                    m76591d();
                }
            } catch (C10174a unused) {
                m76591d();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007c A[SYNTHETIC, Splitter:B:39:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0086 A[SYNTHETIC, Splitter:B:44:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0094 A[SYNTHETIC, Splitter:B:54:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009e A[SYNTHETIC, Splitter:B:59:0x009e] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m76590c() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.im.sdk.chat.d.f r0 = r7.f86627e
            java.lang.String r1 = r7.f86625b
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r7.f86624a
            com.squareup.okhttp.Response r0 = r0.mo70825a(r1, r2)
            if (r0 != 0) goto L_0x0017
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "response is null"
            r0.<init>(r1)
            r7.mo70821a(r0)
            return
        L_0x0017:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r7.f86625b
            java.lang.String r3 = "download"
            java.lang.String r3 = r7.mo70824c(r3)
            r1.<init>(r2, r3)
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]
            r3 = 0
            com.squareup.okhttp.ResponseBody r4 = r0.body()     // Catch:{ Exception -> 0x0075, all -> 0x0071 }
            java.io.InputStream r4 = r4.byteStream()     // Catch:{ Exception -> 0x0075, all -> 0x0071 }
            com.squareup.okhttp.ResponseBody r0 = r0.body()     // Catch:{ Exception -> 0x006d, all -> 0x006a }
            r0.contentLength()     // Catch:{ Exception -> 0x006d, all -> 0x006a }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x006d, all -> 0x006a }
            r0.<init>(r1)     // Catch:{ Exception -> 0x006d, all -> 0x006a }
        L_0x003d:
            int r5 = r4.read(r2)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            r6 = -1
            if (r5 == r6) goto L_0x0049
            r6 = 0
            r0.write(r2, r6, r5)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            goto L_0x003d
        L_0x0049:
            r0.flush()     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            r7.mo70820a(r1, r3)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            if (r4 == 0) goto L_0x005d
            r4.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r1 = move-exception
            r7.mo70821a(r1)
        L_0x005d:
            r0.close()     // Catch:{ IOException -> 0x0061 }
            return
        L_0x0061:
            r0 = move-exception
            r7.mo70821a(r0)
            return
        L_0x0066:
            r1 = move-exception
            goto L_0x0092
        L_0x0068:
            r1 = move-exception
            goto L_0x006f
        L_0x006a:
            r1 = move-exception
            r0 = r3
            goto L_0x0092
        L_0x006d:
            r1 = move-exception
            r0 = r3
        L_0x006f:
            r3 = r4
            goto L_0x0077
        L_0x0071:
            r1 = move-exception
            r0 = r3
            r4 = r0
            goto L_0x0092
        L_0x0075:
            r1 = move-exception
            r0 = r3
        L_0x0077:
            r7.mo70821a(r1)     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x0084
            r3.close()     // Catch:{ IOException -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            r1 = move-exception
            r7.mo70821a(r1)
        L_0x0084:
            if (r0 == 0) goto L_0x008f
            r0.close()     // Catch:{ IOException -> 0x008a }
            return
        L_0x008a:
            r0 = move-exception
            r7.mo70821a(r0)
            return
        L_0x008f:
            return
        L_0x0090:
            r1 = move-exception
            r4 = r3
        L_0x0092:
            if (r4 == 0) goto L_0x009c
            r4.close()     // Catch:{ IOException -> 0x0098 }
            goto L_0x009c
        L_0x0098:
            r2 = move-exception
            r7.mo70821a(r2)
        L_0x009c:
            if (r0 == 0) goto L_0x00a6
            r0.close()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00a6
        L_0x00a2:
            r0 = move-exception
            r7.mo70821a(r0)
        L_0x00a6:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33413e.m76590c():void");
    }

    /* renamed from: a */
    public final void mo70819a(C33416a aVar) {
        this.f86626c = aVar;
        if (this.f86627e != null) {
            this.f86627e.f86628a = this;
        }
    }

    public C33413e(OkHttpClient okHttpClient) {
        this.f86627e = new C33414f(okHttpClient);
        f86623d++;
        this.f86585f = String.valueOf(f86623d);
    }

    /* renamed from: a */
    public void mo70821a(Throwable th) {
        if (this.f86626c != null) {
            this.f86626c.mo70821a(th);
        }
        mo70776b();
    }

    /* renamed from: a */
    public void mo70820a(String str, UrlModel urlModel) {
        if (this.f86626c != null) {
            this.f86626c.mo70820a(str, urlModel);
        }
        mo70776b();
    }
}
