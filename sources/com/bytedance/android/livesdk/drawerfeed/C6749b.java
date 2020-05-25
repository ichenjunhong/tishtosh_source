package com.bytedance.android.livesdk.drawerfeed;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.DrawerLayout;
import android.support.p030v4.widget.DrawerLayout.C1072c;
import com.bytedance.android.livesdkapi.C8606b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.drawerfeed.b */
public final class C6749b {

    /* renamed from: a */
    public static List<C1072c> f18442a;

    /* renamed from: a */
    private static boolean m14144a(Activity activity) {
        if (activity != null && (activity instanceof C8606b)) {
            return ((C8606b) activity).mo15099b();
        }
        return false;
    }

    /* renamed from: a */
    public static void m14142a(Activity activity, Boolean bool) {
        if (activity != null && (activity instanceof C8606b) && !m14144a(activity)) {
            DrawerLayout a = ((C8606b) activity).mo15098a();
            if (a != null && C1056u.m3018B(a)) {
                if (bool.booleanValue()) {
                    a.openDrawer(8388613);
                } else {
                    a.closeDrawer(8388613);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m14141a(Activity activity, Room room, boolean z) {
        if (room != null && !room.isOfficial() && (activity instanceof C8606b)) {
            DrawerLayout a = ((C8606b) activity).mo15098a();
            if (a != null && C1056u.m3018B(a)) {
                if (z) {
                    a.setDrawerLockMode(1);
                    return;
                }
                a.setDrawerLockMode(0);
            }
        }
    }

    /* renamed from: a */
    public static void m14143a(Activity activity, Boolean bool, Bundle bundle, String str) {
        if (activity instanceof FragmentActivity) {
            C0654k supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            if (!bool.booleanValue()) {
                if (supportFragmentManager.mo2224a("LiveDrawerDialog") instanceof C6744a) {
                    C6744a aVar = (C6744a) supportFragmentManager.mo2224a("LiveDrawerDialog");
                    if (aVar.isAdded()) {
                        aVar.dismiss();
                    }
                }
            } else if (supportFragmentManager.mo2224a("LiveDrawerDialog") instanceof C6744a) {
                C6744a aVar2 = (C6744a) supportFragmentManager.mo2224a("LiveDrawerDialog");
                if (!aVar2.isAdded()) {
                    aVar2.showNow(supportFragmentManager, "LiveDrawerDialog");
                }
            } else {
                C6744a.m14135a(f18442a, bundle, str).showNow(supportFragmentManager, "LiveDrawerDialog");
            }
        }
    }
}
