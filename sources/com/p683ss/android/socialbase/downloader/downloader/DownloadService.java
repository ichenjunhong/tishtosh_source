package com.p683ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.socialbase.downloader.downloader.DownloadService */
public class DownloadService extends Service {

    /* renamed from: b */
    private static final String f54574b = "DownloadService";

    /* renamed from: a */
    protected C19906p f54575a;

    public void onDestroy() {
        if (this.f54575a != null) {
            this.f54575a.mo41475d();
            this.f54575a = null;
        }
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        C19884b.m48601a((Context) this);
        this.f54575a = C19884b.m48617n();
        this.f54575a.mo41468a(new WeakReference<>(this));
    }

    public IBinder onBind(Intent intent) {
        boolean z;
        StringBuilder sb = new StringBuilder("onBind downloadServiceHandler != null:");
        if (this.f54575a != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        if (this.f54575a != null) {
            return this.f54575a.mo41461a(intent);
        }
        return null;
    }

    public int onStartCommand(final Intent intent, final int i, final int i2) {
        this.f54575a.mo41473c();
        ExecutorService g = C19884b.m48610g();
        if (g != null) {
            g.execute(new Runnable() {
                public final void run() {
                    if (DownloadService.this.f54575a != null) {
                        DownloadService.this.f54575a.mo41465a(intent, i, i2);
                    }
                }
            });
        }
        return 3;
    }
}
