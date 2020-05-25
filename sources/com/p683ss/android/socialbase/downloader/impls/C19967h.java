package com.p683ss.android.socialbase.downloader.impls;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.p683ss.android.socialbase.downloader.downloader.C19882a;
import com.p683ss.android.socialbase.downloader.downloader.DownloadService;
import com.p683ss.android.socialbase.downloader.p1221j.C19991b;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

/* renamed from: com.ss.android.socialbase.downloader.impls.h */
public class C19967h extends C19882a {

    /* renamed from: f */
    private static final String f54896f = "h";

    /* renamed from: c */
    public final void mo41473c() {
        if (C19991b.m49327a(262144)) {
            this.f54592c = true;
            this.f54594e = false;
        }
    }

    /* renamed from: a */
    public final void mo41464a(Context context, ServiceConnection serviceConnection) {
        try {
            Intent intent = new Intent(context, DownloadService.class);
            if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent)) {
                context.startService(intent);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo41465a(Intent intent, int i, int i2) {
        if (!C19991b.m49327a(262144)) {
            this.f54592c = true;
        }
        mo41476e();
    }
}
