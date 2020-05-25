package com.p683ss.android.ugc.aweme.music.p1974b;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.ugc.aweme.music.b.a */
public abstract class C37325a extends AbsDownloadListener {
    public void onCanceled(DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        if (downloadInfo != null) {
            Downloader.getInstance(C11010c.m22280a()).removeSubThreadListener(downloadInfo.getId(), this);
        }
    }

    public void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        if (downloadInfo != null) {
            Downloader.getInstance(C11010c.m22280a()).removeSubThreadListener(downloadInfo.getId(), this);
        }
    }

    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        if (downloadInfo != null) {
            Downloader.getInstance(C11010c.m22280a()).removeSubThreadListener(downloadInfo.getId(), this);
        }
    }
}
