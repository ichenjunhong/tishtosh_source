package com.p683ss.android.ugc.aweme.live.livehostimpl;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.support.p030v4.app.C0610aa.C0614d;
import com.bytedance.android.livesdkapi.C8601a;
import com.bytedance.common.utility.p526f.C9407a;
import com.bytedance.ies.livehost_impl.R$drawable;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.BgBroadcastService */
public class BgBroadcastService extends Service {
    private static final String FOREGROUND_CHANNEL_ID = "BgBroadcastService.notification";
    private static final String IMPL_CLAZZ = "com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl";
    private NotificationManager mNotificationManager;
    private C8601a mService;

    public void onDestroy() {
        stopForeground(true);
        super.onDestroy();
        this.mService.onDestroy();
        this.mService.unBindService(this);
    }

    public void onCreate() {
        super.onCreate();
        this.mNotificationManager = (NotificationManager) getSystemService("notification");
        startForeground(R.id.enc, buildNotification(this));
        this.mService = (C8601a) C9407a.m18601a(IMPL_CLAZZ, new Object[0]);
        this.mService.bindService(this);
        this.mService.onCreate();
    }

    public IBinder onBind(Intent intent) {
        return this.mService;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mService.onConfigurationChanged(configuration);
    }

    private Notification buildNotification(Context context) {
        C0614d dVar;
        if (VERSION.SDK_INT >= 26 && this.mNotificationManager.getNotificationChannel(FOREGROUND_CHANNEL_ID) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(FOREGROUND_CHANNEL_ID, getString(R.string.gpu), 3);
            notificationChannel.enableVibration(false);
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(), 134217728);
        if (VERSION.SDK_INT >= 26) {
            dVar = new C0614d(context, FOREGROUND_CHANNEL_ID);
        } else {
            dVar = new C0614d(context);
        }
        C0614d a = dVar.mo2118a((CharSequence) getString(R.string.gpv)).mo2111a(R$drawable.icon).mo2120a(true).mo2113a(System.currentTimeMillis()).mo2114a(activity);
        a.f2187A = "service";
        a.mo2121a(8, true);
        a.mo2126b(true).mo2120a(true);
        if (VERSION.SDK_INT >= 21) {
            dVar.mo2132e(1);
        }
        return dVar.mo2122b();
    }
}
