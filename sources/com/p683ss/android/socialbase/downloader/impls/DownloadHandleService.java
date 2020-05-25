package com.p683ss.android.socialbase.downloader.impls;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.downloader.C19886c;
import com.p683ss.android.socialbase.downloader.downloader.C19904n;

/* renamed from: com.ss.android.socialbase.downloader.impls.DownloadHandleService */
public class DownloadHandleService extends Service {

    /* renamed from: a */
    private static final String f54852a = "DownloadHandleService";

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C19884b.m48601a((Context) this);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                final int intExtra = intent.getIntExtra("extra_download_id", 0);
                if (intExtra != 0) {
                    if (action.equals("com.ss.android.downloader.action.DOWNLOAD_WAKEUP")) {
                        C19884b.m48611h().execute(new Runnable() {
                            public final void run() {
                                try {
                                    C19886c a = C19886c.m48631a();
                                    int i = intExtra;
                                    C19904n c = a.mo41488c(i);
                                    if (c != null) {
                                        c.mo41614l(i);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        });
                    } else if (action.equals("com.ss.android.downloader.action.PROCESS_NOTIFY")) {
                        C19886c a = C19886c.m48631a();
                        if (intExtra != 0) {
                            a.mo41487b(intExtra, Boolean.TRUE.booleanValue());
                            C19904n a2 = C19971l.m49132a(true);
                            if (a2 != null) {
                                a2.mo41601d();
                            }
                        }
                    } else if (action.equals("com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY")) {
                        C19884b.m48605b();
                    }
                }
            }
        }
        return 2;
    }
}
