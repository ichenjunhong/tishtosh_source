package com.p683ss.android.ugc.aweme.tile;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.tile.TileTask */
public final class TileTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void run(Context context) {
        if (VERSION.SDK_INT >= 24) {
            Context a = C11010c.m22280a();
            ComponentName componentName = new ComponentName(a, HotVideoTileService.class);
            ComponentName componentName2 = new ComponentName(a, PublishTileService.class);
            PackageManager packageManager = a.getPackageManager();
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            if (C10181b.m20511a().mo18172a(TileShortcutExperiment.class, true, "enable_tile_shortcut", 31744, false)) {
                if (componentEnabledSetting != 1) {
                    packageManager.setComponentEnabledSetting(componentName, 1, 1);
                }
                int componentEnabledSetting2 = packageManager.getComponentEnabledSetting(componentName2);
                if (C47915gg.m103651b()) {
                    if (componentEnabledSetting2 == 1) {
                        packageManager.setComponentEnabledSetting(componentName2, 2, 1);
                    }
                } else if (componentEnabledSetting2 != 1) {
                    packageManager.setComponentEnabledSetting(componentName2, 1, 1);
                }
            } else if (componentEnabledSetting == 1) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
                packageManager.setComponentEnabledSetting(componentName2, 2, 1);
            }
        }
    }
}
