package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2181a;

import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.a */
public class C42988a implements IDownloadListener {
    public void onCanceled(DownloadInfo downloadInfo) {
        C52711k.m112240b(downloadInfo, "entity");
    }

    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
    }

    public void onFirstStart(DownloadInfo downloadInfo) {
        C52711k.m112240b(downloadInfo, "entity");
    }

    public void onFirstSuccess(DownloadInfo downloadInfo) {
        C52711k.m112240b(downloadInfo, "entity");
    }

    public void onPause(DownloadInfo downloadInfo) {
        C52711k.m112240b(downloadInfo, "entity");
    }

    public void onPrepare(DownloadInfo downloadInfo) {
        C52711k.m112240b(downloadInfo, "entity");
    }

    public void onProgress(DownloadInfo downloadInfo) {
        C52711k.m112240b(downloadInfo, "entity");
    }

    public void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        C52711k.m112240b(downloadInfo, "entity");
        C52711k.m112240b(baseException, "e");
    }

    public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        C52711k.m112240b(downloadInfo, "entity");
        C52711k.m112240b(baseException, "e");
    }

    public void onStart(DownloadInfo downloadInfo) {
        C52711k.m112240b(downloadInfo, "entity");
    }

    public void onSuccessed(DownloadInfo downloadInfo) {
    }
}
