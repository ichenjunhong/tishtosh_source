package com.p683ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import com.p683ss.android.socialbase.downloader.impls.C19957d;

/* renamed from: com.ss.android.socialbase.downloader.downloader.SqlDownloadCacheService */
public class SqlDownloadCacheService extends Service {

    /* renamed from: a */
    private static final String f54589a = "SqlDownloadCacheService";

    public void onCreate() {
        super.onCreate();
        C19884b.m48601a(getApplicationContext());
    }

    public IBinder onBind(Intent intent) {
        C19909s sVar;
        C19901k m = C19884b.m48616m();
        if (m instanceof C19957d) {
            sVar = ((C19957d) m).f54878b;
        } else if (m instanceof C19909s) {
            sVar = (C19909s) m;
        } else {
            sVar = null;
        }
        if (sVar instanceof IBinder) {
            return (IBinder) sVar;
        }
        return new Binder();
    }

    /* renamed from: a */
    public static void m48575a(Context context, ServiceConnection serviceConnection) {
        if (context != null) {
            try {
                Intent intent = new Intent(context, SqlDownloadCacheService.class);
                if (serviceConnection != null) {
                    C19910t.m48887a(context, intent, serviceConnection, 1);
                }
                C19910t.m48886a(context, intent);
            } catch (Throwable unused) {
            }
        }
    }
}
