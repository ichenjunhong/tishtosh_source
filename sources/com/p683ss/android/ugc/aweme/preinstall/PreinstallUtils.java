package com.p683ss.android.ugc.aweme.preinstall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Process;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.splash.C45688a;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;

/* renamed from: com.ss.android.ugc.aweme.preinstall.PreinstallUtils */
public final class PreinstallUtils {

    /* renamed from: com.ss.android.ugc.aweme.preinstall.PreinstallUtils$KillApplicationReceiver */
    public static class KillApplicationReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            new Handler().post(new Runnable() {
                public final void run() {
                    Process.killProcess(Process.myPid());
                }
            });
        }
    }

    /* renamed from: a */
    public static boolean m88376a(Context context) {
        return false;
    }

    /* renamed from: a */
    private static C45688a m88375a() {
        Object a = C27991b.m66756a(C45688a.class);
        if (a != null) {
            return (C45688a) a;
        }
        return (C45688a) C20302a.m50070a(C45688a.class).mo42947a(new C20310d()).mo42946a().mo42948b();
    }

    /* renamed from: b */
    public static void m88377b(Context context) {
        m88375a();
    }
}
