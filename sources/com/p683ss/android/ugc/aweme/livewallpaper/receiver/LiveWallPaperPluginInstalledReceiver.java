package com.p683ss.android.ugc.aweme.livewallpaper.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.common.C26890h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.receiver.LiveWallPaperPluginInstalledReceiver */
public class LiveWallPaperPluginInstalledReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null && context != null && "android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) && "package:com.ss.android.ugc.tiktok.livewallpaper".equals(intent.getDataString())) {
            C26890h.m65011a("wallpaper_plugin_success", (Map<String, String>) new HashMap<String,String>());
        }
    }
}
