package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.deviceregister.C19034d.C19035a;
import com.p683ss.android.ugc.aweme.feed.C30436k;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ObserveDeviceRegister */
public class ObserveDeviceRegister implements LegoTask {
    private static C19035a deviceConfigUpdateListener = new C19035a() {
        public final void onDeviceRegistrationInfoChanged(String str, String str2) {
        }

        public final void onRemoteConfigUpdate(boolean z, boolean z2) {
        }

        public final void onDidLoadLocally(boolean z) {
            boolean z2 = !z;
            if (C30436k.f79559c == null) {
                C30436k.f79559c = Boolean.valueOf(z2);
            }
        }
    };

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        C19034d.m46317a(deviceConfigUpdateListener);
    }
}
