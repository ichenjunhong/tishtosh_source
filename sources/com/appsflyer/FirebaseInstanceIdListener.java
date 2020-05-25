package com.appsflyer;

import com.google.firebase.iid.C17890aa;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FirebaseInstanceIdListener extends FirebaseInstanceIdService {
    public void onTokenRefresh() {
        super.onTokenRefresh();
        long currentTimeMillis = System.currentTimeMillis();
        String str = null;
        try {
            FirebaseInstanceId a = FirebaseInstanceId.m43841a();
            C17890aa e = a.mo34721e();
            if (e == null || e.mo34729b(a.f49700d.mo34783b())) {
                a.mo34720c();
            }
            if (e != null) {
                str = e.f49715a;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("Error registering for uninstall tracking", th);
        }
        if (str != null) {
            AFLogger.afInfoLog("Firebase Refreshed Token = ".concat(String.valueOf(str)));
            C2508c r3 = C2508c.m7358(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            C2508c cVar = new C2508c(currentTimeMillis, str);
            if (r3.mo6994(cVar)) {
                C2539u.m7449(getApplicationContext(), cVar);
            }
        }
    }
}
