package com.p683ss.android.ugc.aweme.services.download;

import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.common.p1591c.C26856a;

/* renamed from: com.ss.android.ugc.aweme.services.download.AVDownloadServiceImpl$downloadFile$1 */
public final class AVDownloadServiceImpl$downloadFile$1 extends AbsDownloadListener {
    final /* synthetic */ C26856a $listener;
    final /* synthetic */ AVDownloadServiceImpl this$0;

    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
    }

    public final void onProgress(DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        if (downloadInfo != null) {
            downloadInfo.getCurBytes();
        }
        if (downloadInfo != null) {
            downloadInfo.getTotalBytes();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r1 == null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSuccessed(com.p683ss.android.socialbase.downloader.model.DownloadInfo r4) {
        /*
            r3 = this;
            super.onSuccessed(r4)
            com.ss.android.ugc.aweme.common.c.a r0 = r3.$listener
            if (r0 == 0) goto L_0x001b
            if (r4 == 0) goto L_0x000f
            java.lang.String r1 = r4.getUrl()
            if (r1 != 0) goto L_0x0011
        L_0x000f:
            java.lang.String r1 = ""
        L_0x0011:
            com.ss.android.ugc.aweme.services.download.AVDownloadServiceImpl r2 = r3.this$0
            java.lang.String r4 = r2.getFullFilePath(r4)
            r0.mo54811a(r1, r4)
            return
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.services.download.AVDownloadServiceImpl$downloadFile$1.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    AVDownloadServiceImpl$downloadFile$1(AVDownloadServiceImpl aVDownloadServiceImpl, C26856a aVar) {
        this.this$0 = aVDownloadServiceImpl;
        this.$listener = aVar;
    }

    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        super.onFailed(downloadInfo, baseException);
        C26856a aVar = this.$listener;
        if (aVar != null) {
            Exception exc = baseException;
            Integer num = null;
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = null;
            }
            if (baseException != null) {
                num = Integer.valueOf(baseException.getErrorCode());
            }
            aVar.mo54810a(exc, str, num);
        }
    }
}
