package com.p683ss.android.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.ss.android.download.DownloadReceiver */
public class DownloadReceiver extends BroadcastReceiver {

    /* renamed from: a */
    C19138v f52515a;

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null && C19129n.m46627a(context)) {
            try {
                if (C19129n.m46626a()) {
                    String action = intent.getAction();
                    if (!TextUtils.isEmpty(action) && !"android.intent.action.BOOT_COMPLETED".equals(action)) {
                        if (this.f52515a == null) {
                            this.f52515a = C19133r.m46640a(context);
                        }
                        if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                            DownloadService.m46455a(context);
                        } else if (action.equals("android.intent.action.MEDIA_MOUNTED")) {
                            DownloadService.m46455a(context);
                        } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                            NetworkInfo a = C19122i.m46604a((ConnectivityManager) context.getSystemService("connectivity"));
                            if (a != null && a.isConnected()) {
                                DownloadService.m46455a(context);
                            }
                        } else {
                            if (action.equals("android.intent.action.PACKAGE_ADDED") || action.equals("android.intent.action.PACKAGE_REPLACED")) {
                                Uri data = intent.getData();
                                if (data != null) {
                                    data.getSchemeSpecificPart();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
