package com.p683ss.android.socialbase.downloader.depend;

import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.downloader.depend.IDownloadDepend */
public interface IDownloadDepend {
    void monitorLogSend(DownloadInfo downloadInfo, BaseException baseException, int i);
}
