package com.bytedance.android.livesdk.widget.p423a;

import android.graphics.Typeface;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.livesdk.widget.a.f */
final /* synthetic */ class C8499f implements Callable {

    /* renamed from: a */
    private final DownloadInfo f23322a;

    C8499f(DownloadInfo downloadInfo) {
        this.f23322a = downloadInfo;
    }

    public final Object call() {
        return Typeface.createFromFile(this.f23322a.getTargetFilePath());
    }
}
