package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.socialbase.downloader.model.HttpHeader;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.Response;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.f */
public final class C33414f {

    /* renamed from: a */
    public C33416a f86628a;

    /* renamed from: b */
    private OkHttpClient f86629b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.f$a */
    public interface C33416a {
        /* renamed from: a */
        void mo70820a(String str, UrlModel urlModel);

        /* renamed from: a */
        void mo70821a(Throwable th);
    }

    public C33414f(OkHttpClient okHttpClient) {
        this.f86629b = okHttpClient;
    }

    /* renamed from: a */
    private void m76599a(Throwable th) {
        if (this.f86628a != null) {
            this.f86628a.mo70821a(th);
        }
    }

    /* renamed from: b */
    private boolean m76600b(String str, UrlModel urlModel) {
        if (!C33417g.m76605a(C11010c.m22280a())) {
            C10691a.m21542b(C11010c.m22280a(), (int) R.string.bl6).mo19066a();
            m76599a(new IllegalStateException("network is unavailable"));
            return false;
        } else if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            m76599a(new IllegalStateException("url is null"));
            return false;
        } else {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            return true;
        }
    }

    /* renamed from: a */
    public final Response mo70825a(String str, UrlModel urlModel) {
        Response response = null;
        if (!m76600b(str, urlModel)) {
            return null;
        }
        for (int i = 0; i < urlModel.getUrlList().size(); i++) {
            String str2 = (String) urlModel.getUrlList().get(i);
            Request build = new Builder().url(str2).addHeader("Host", URI.create(str2).getHost()).build();
            if (this.f86629b == null) {
                this.f86629b = new OkHttpClient();
            }
            this.f86629b.setConnectTimeout(60000, TimeUnit.MILLISECONDS);
            this.f86629b.setWriteTimeout(60000, TimeUnit.MILLISECONDS);
            this.f86629b.setReadTimeout(60000, TimeUnit.MILLISECONDS);
            this.f86629b.setRetryOnConnectionFailure(true);
            try {
                response = this.f86629b.newCall(build).execute();
            } catch (Exception unused) {
            }
            if (response != null && response.isSuccessful()) {
                break;
            }
        }
        return response;
    }

    /* renamed from: a */
    public final void mo70826a(String str, String str2, UrlModel urlModel) {
        String str3 = str;
        if (m76600b(str3, urlModel)) {
            boolean z = true;
            boolean[] zArr = {true};
            int i = 0;
            while (zArr[0] && i < urlModel.getUrlList().size()) {
                CountDownLatch countDownLatch = new CountDownLatch(z ? 1 : 0);
                String str4 = (String) urlModel.getUrlList().get(i);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new HttpHeader("Host", URI.create(str4).getHost()));
                DownloadTask retryCount = Downloader.with(C11010c.m22280a()).url(str4).name(str2).savePath(str3).extraHeaders(arrayList).force(z).retryCount(3);
                final String str5 = str;
                final String str6 = str2;
                final boolean[] zArr2 = zArr;
                C334151 r9 = r0;
                final CountDownLatch countDownLatch2 = countDownLatch;
                C334151 r0 = new IDownloadListener() {
                    public final void onFirstStart(DownloadInfo downloadInfo) {
                    }

                    public final void onFirstSuccess(DownloadInfo downloadInfo) {
                    }

                    public final void onPause(DownloadInfo downloadInfo) {
                    }

                    public final void onPrepare(DownloadInfo downloadInfo) {
                    }

                    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                    }

                    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                    }

                    public final void onStart(DownloadInfo downloadInfo) {
                    }

                    public final void onProgress(DownloadInfo downloadInfo) {
                        downloadInfo.getCurBytes();
                        downloadInfo.getTotalBytes();
                    }

                    public final void onCanceled(DownloadInfo downloadInfo) {
                        zArr2[0] = false;
                        countDownLatch2.countDown();
                    }

                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        C33414f.this.f86628a.mo70820a(new File(str5, str6).getAbsolutePath(), null);
                        zArr2[0] = false;
                        countDownLatch2.countDown();
                    }

                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        C33414f.this.f86628a.mo70821a(baseException);
                        zArr2[0] = true;
                        countDownLatch2.countDown();
                    }
                };
                retryCount.mainThreadListener(r9).download();
                try {
                    countDownLatch.await();
                    i++;
                    z = true;
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
