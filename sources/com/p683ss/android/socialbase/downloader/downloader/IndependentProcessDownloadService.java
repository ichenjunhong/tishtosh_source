package com.p683ss.android.socialbase.downloader.downloader;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import com.p683ss.android.socialbase.downloader.p1214d.C19819a;
import com.p683ss.android.socialbase.downloader.p1221j.C19991b;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService */
public class IndependentProcessDownloadService extends DownloadService {

    /* renamed from: b */
    public static final String f54580b = "IndependentProcessDownloadService";

    /* renamed from: c */
    public static boolean f54581c;

    /* renamed from: e */
    private static int f54582e;

    /* renamed from: f */
    private static long f54583f;

    /* renamed from: d */
    ServiceConnection f54584d = new ServiceConnection() {
        public final void onServiceDisconnected(ComponentName componentName) {
            IndependentProcessDownloadService.f54581c = false;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IndependentProcessDownloadService.f54581c = true;
            try {
                iBinder.linkToDeath(new DeathRecipient() {
                    public final void binderDied() {
                        IndependentProcessDownloadService.f54581c = false;
                        C19819a.m48486b(IndependentProcessDownloadService.f54580b, "binderDied:");
                        IndependentProcessDownloadService.this.mo41454a();
                    }
                }, 0);
            } catch (Exception unused) {
            }
        }
    };

    /* renamed from: g */
    private Handler f54585g = new Handler(Looper.getMainLooper());

    public void onCreate() {
        super.onCreate();
        C19884b.m48601a((Context) this);
        this.f54575a = C19884b.m48618o();
        this.f54575a.mo41468a(new WeakReference<>(this));
        mo41454a();
    }

    /* renamed from: a */
    public final void mo41454a() {
        if (VERSION.SDK_INT >= 26 || !C19991b.m49327a(UnReadVideoExperiment.LIKE_USER_LIST) || f54581c) {
            return;
        }
        if (f54582e > 5) {
            C19819a.m48486b(f54580b, "bindMainProcess: bind too many times!!! ");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f54583f < 15000) {
            C19819a.m48486b(f54580b, "bindMainProcess: time too short since last bind!!! ");
            return;
        }
        f54582e++;
        f54583f = currentTimeMillis;
        this.f54585g.postDelayed(new Runnable() {
            public final void run() {
                IndependentProcessDownloadService independentProcessDownloadService = IndependentProcessDownloadService.this;
                Intent intent = new Intent(independentProcessDownloadService, DownloadService.class);
                try {
                    ServiceConnection serviceConnection = independentProcessDownloadService.f54584d;
                    if (!C40895d.m90464a(independentProcessDownloadService, intent)) {
                        independentProcessDownloadService.bindService(intent, serviceConnection, 1);
                    }
                    if (!C40895d.m90464a(independentProcessDownloadService, intent)) {
                        independentProcessDownloadService.startService(intent);
                    }
                } catch (Throwable unused) {
                }
            }
        }, 1000);
    }
}
