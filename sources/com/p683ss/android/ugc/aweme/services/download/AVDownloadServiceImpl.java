package com.p683ss.android.ugc.aweme.services.download;

import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.common.p1591c.C26856a;
import com.p683ss.android.ugc.aweme.common.p1591c.C26857b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.io.File;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.services.download.AVDownloadServiceImpl */
public final class AVDownloadServiceImpl implements C26857b {
    public static final Companion Companion = new Companion(null);

    /* renamed from: com.ss.android.ugc.aweme.services.download.AVDownloadServiceImpl$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public final String getFullFilePath(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return "";
        }
        String savePath = downloadInfo.getSavePath();
        if (savePath == null || !C52830p.m112413c(savePath, "/", false, 2, null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(downloadInfo.getSavePath());
            sb.append(File.separator);
            sb.append(downloadInfo.getName());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(downloadInfo.getSavePath());
        sb2.append(downloadInfo.getName());
        return sb2.toString();
    }

    public final void downloadFile(String str, String str2, String str3, C26856a aVar) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str2, "filePath");
        C52711k.m112240b(str3, "fileName");
        Downloader.with(C39629l.m88233b()).url(str).savePath(str2).name(str3).subThreadListener(new AVDownloadServiceImpl$downloadFile$1(this, aVar)).download();
    }
}
