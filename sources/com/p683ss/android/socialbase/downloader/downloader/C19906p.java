package com.p683ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.p683ss.android.socialbase.downloader.downloader.DownloadService;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.socialbase.downloader.downloader.p */
public interface C19906p<T extends DownloadService> {
    /* renamed from: a */
    IBinder mo41461a(Intent intent);

    /* renamed from: a */
    void mo41462a(int i);

    /* renamed from: a */
    void mo41463a(int i, Notification notification);

    /* renamed from: a */
    void mo41465a(Intent intent, int i, int i2);

    /* renamed from: a */
    void mo41466a(C19905o oVar);

    /* renamed from: a */
    void mo41468a(WeakReference<T> weakReference);

    /* renamed from: a */
    void mo41469a(boolean z);

    /* renamed from: a */
    boolean mo41470a();

    /* renamed from: b */
    void mo41471b(DownloadTask downloadTask);

    /* renamed from: b */
    boolean mo41472b();

    /* renamed from: c */
    void mo41473c();

    /* renamed from: c */
    void mo41474c(DownloadTask downloadTask);

    /* renamed from: d */
    void mo41475d();

    /* renamed from: f */
    void mo41477f();
}
