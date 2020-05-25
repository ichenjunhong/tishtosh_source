package com.p683ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.SparseArray;
import com.p683ss.android.socialbase.downloader.impls.C19950a;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.socialbase.downloader.p1214d.C19819a;
import com.p683ss.android.socialbase.downloader.p1221j.C19991b;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.socialbase.downloader.downloader.a */
public abstract class C19882a implements C19906p {

    /* renamed from: a */
    public static final String f54590a = "a";

    /* renamed from: b */
    protected final SparseArray<DownloadTask> f54591b = new SparseArray<>();

    /* renamed from: c */
    protected volatile boolean f54592c = false;

    /* renamed from: d */
    protected volatile boolean f54593d;

    /* renamed from: e */
    protected volatile boolean f54594e = false;

    /* renamed from: f */
    private WeakReference<Service> f54595f;

    /* renamed from: g */
    private Handler f54596g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private Runnable f54597h = new Runnable() {
        public final void run() {
            if (!C19882a.this.f54592c) {
                C19882a.this.mo41464a(C19884b.m48627x(), (ServiceConnection) null);
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo41464a(Context context, ServiceConnection serviceConnection) {
    }

    /* renamed from: a */
    public void mo41465a(Intent intent, int i, int i2) {
    }

    /* renamed from: a */
    public void mo41466a(C19905o oVar) {
    }

    /* renamed from: c */
    public void mo41473c() {
    }

    /* renamed from: c */
    public void mo41474c(DownloadTask downloadTask) {
    }

    /* renamed from: d */
    public final void mo41475d() {
        this.f54592c = false;
    }

    /* renamed from: f */
    public void mo41477f() {
        if (!this.f54592c) {
            mo41464a(C19884b.m48627x(), (ServiceConnection) null);
        }
    }

    /* renamed from: b */
    public final boolean mo41472b() {
        String str = f54590a;
        StringBuilder sb = new StringBuilder("isServiceForeground = ");
        sb.append(this.f54593d);
        C19819a.m48484a(str, sb.toString());
        return this.f54593d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo41476e() {
        SparseArray clone;
        new StringBuilder("resumePendingTask pendingTasks.size:").append(this.f54591b.size());
        synchronized (this.f54591b) {
            clone = this.f54591b.clone();
            this.f54591b.clear();
        }
        C19950a q = C19884b.m48620q();
        if (q != null) {
            for (int i = 0; i < clone.size(); i++) {
                DownloadTask downloadTask = (DownloadTask) clone.get(clone.keyAt(i));
                if (downloadTask != null) {
                    q.mo41706a(downloadTask);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo41470a() {
        return this.f54592c;
    }

    /* renamed from: a */
    public void mo41462a(int i) {
        C19819a.m48483a(i);
    }

    /* renamed from: a */
    public IBinder mo41461a(Intent intent) {
        return new Binder();
    }

    /* renamed from: b */
    public void mo41471b(DownloadTask downloadTask) {
        if (downloadTask != null) {
            if (this.f54592c) {
                if (this.f54591b.get(downloadTask.getDownloadId()) != null) {
                    synchronized (this.f54591b) {
                        if (this.f54591b.get(downloadTask.getDownloadId()) != null) {
                            this.f54591b.remove(downloadTask.getDownloadId());
                        }
                    }
                }
                C19950a q = C19884b.m48620q();
                if (q != null) {
                    q.mo41706a(downloadTask);
                }
                mo41476e();
            } else if (C19991b.m49327a(262144)) {
                synchronized (this.f54591b) {
                    mo41467a(downloadTask);
                    if (!this.f54594e) {
                        mo41464a(C19884b.m48627x(), (ServiceConnection) null);
                        this.f54594e = true;
                    } else {
                        this.f54596g.removeCallbacks(this.f54597h);
                        this.f54596g.postDelayed(this.f54597h, 10);
                    }
                }
            } else {
                mo41467a(downloadTask);
                mo41464a(C19884b.m48627x(), (ServiceConnection) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo41467a(DownloadTask downloadTask) {
        if (downloadTask != null) {
            StringBuilder sb = new StringBuilder("pendDownloadTask pendingTasks.size:");
            sb.append(this.f54591b.size());
            sb.append(" downloadTask.getDownloadId():");
            sb.append(downloadTask.getDownloadId());
            if (this.f54591b.get(downloadTask.getDownloadId()) == null) {
                synchronized (this.f54591b) {
                    if (this.f54591b.get(downloadTask.getDownloadId()) == null) {
                        this.f54591b.put(downloadTask.getDownloadId(), downloadTask);
                    }
                }
            }
            new StringBuilder("after pendDownloadTask pendingTasks.size:").append(this.f54591b.size());
        }
    }

    /* renamed from: a */
    public final void mo41468a(WeakReference weakReference) {
        this.f54595f = weakReference;
    }

    /* renamed from: a */
    public final void mo41469a(boolean z) {
        if (!(this.f54595f == null || this.f54595f.get() == null)) {
            String str = f54590a;
            StringBuilder sb = new StringBuilder("stopForeground  service = ");
            sb.append(this.f54595f.get());
            sb.append(",  isServiceAlive = ");
            sb.append(this.f54592c);
            C19819a.m48484a(str, sb.toString());
            try {
                this.f54593d = false;
                ((Service) this.f54595f.get()).stopForeground(z);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo41463a(int i, Notification notification) {
        if (this.f54595f == null || this.f54595f.get() == null) {
            C19819a.m48486b(f54590a, "startForeground: downloadService is null, do nothing!");
            return;
        }
        String str = f54590a;
        StringBuilder sb = new StringBuilder("startForeground  id = ");
        sb.append(i);
        sb.append(", service = ");
        sb.append(this.f54595f.get());
        sb.append(",  isServiceAlive = ");
        sb.append(this.f54592c);
        C19819a.m48484a(str, sb.toString());
        try {
            ((Service) this.f54595f.get()).startForeground(i, notification);
            this.f54593d = true;
        } catch (Exception unused) {
        }
    }
}
