package com.p683ss.android.socialbase.downloader.downloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p683ss.android.socialbase.downloader.notification.DownloadNotificationService;

/* renamed from: com.ss.android.socialbase.downloader.downloader.DownloadReceiver */
public class DownloadReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f54573a = "DownloadReceiver";

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    if (C19884b.f54613d) {
                        try {
                            Intent intent2 = new Intent(context, DownloadNotificationService.class);
                            intent2.setAction(action);
                            C19888d.m48644a(context, intent2);
                        } catch (Throwable unused) {
                        }
                    }
                } else if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                    try {
                        Intent intent3 = new Intent(context, DownloadNotificationService.class);
                        intent3.setAction(action);
                        C19888d.m48644a(context, intent3);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }
}
