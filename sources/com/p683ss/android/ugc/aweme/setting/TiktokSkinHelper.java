package com.p683ss.android.ugc.aweme.setting;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.setting.TiktokSkinHelper */
public class TiktokSkinHelper {

    /* renamed from: a */
    public static boolean f105191a;

    /* renamed from: a */
    public static void m91332a(Resources resources) {
        if (f105191a) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.uiMode & 48) != 16) {
                configuration.uiMode = (configuration.uiMode & -49) | 16;
                resources.updateConfiguration(configuration, null);
                m91333b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m91333b(Resources resources) {
        if (VERSION.SDK_INT >= 21 && VERSION.SDK_INT < 26) {
            try {
                Method declaredMethod = Class.forName("android.support.v7.app.ResourcesFlusher").getDeclaredMethod("flush", new Class[]{Resources.class});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, new Object[]{resources});
            } catch (Exception unused) {
            }
        }
    }
}
