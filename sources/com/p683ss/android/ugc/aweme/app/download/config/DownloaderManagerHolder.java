package com.p683ss.android.ugc.aweme.app.download.config;

import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12713o;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder */
public final class DownloaderManagerHolder {

    /* renamed from: a */
    public static Boolean f61481a;

    /* renamed from: b */
    private static final int f61482b = Runtime.getRuntime().availableProcessors();

    /* renamed from: c */
    private static final int f61483c = Math.max(2, Math.min(f61482b - 1, 4));

    /* renamed from: d */
    private static ExecutorService f61484d = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49845a("downloader-db").mo49844a(f61483c).mo49847a());

    /* renamed from: com.ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder$DownloaderManagerApi */
    interface DownloaderManagerApi {
        @C12706h
        C17832m<String> doGet(@C12713o int i, @C12699af String str);
    }
}
