package com.p683ss.android.ugc.aweme.greenscreen;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.w */
public abstract class C32927w extends AbsDownloadListener {
    /* renamed from: a */
    private final void m75832a(int i) {
        Downloader.getInstance(C11010c.m22280a()).removeSubThreadListener(i, this);
    }

    public void onCanceled(DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        if (downloadInfo != null) {
            m75832a(downloadInfo.getId());
        }
    }

    public void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        if (downloadInfo != null) {
            m75832a(downloadInfo.getId());
        }
    }

    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        if (downloadInfo != null) {
            m75832a(downloadInfo.getId());
        }
    }
}
