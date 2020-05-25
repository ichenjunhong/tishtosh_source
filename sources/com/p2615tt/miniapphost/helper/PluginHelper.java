package com.p2615tt.miniapphost.helper;

import com.p2615tt.miniapphost.AppBrandLogger;
import com.p2615tt.miniapphost.AppbrandSupport;

/* renamed from: com.tt.miniapphost.helper.PluginHelper */
public class PluginHelper {
    public static boolean tryLoadMiniAppPlugin() {
        for (int i = 0; i < 20; i++) {
            try {
                if (AppbrandSupport.inst() != null) {
                    Class.forName("com.tt.miniapphost.placeholder.MiniappService0");
                    return true;
                }
            } catch (ClassNotFoundException e) {
                AppBrandLogger.m111323e("PluginHelper", "tryLoadMiniAppPlugin", e);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e2) {
                AppBrandLogger.m111323e("PluginHelper", "tryLoadMiniAppPlugin", e2);
            }
        }
        return false;
    }
}
