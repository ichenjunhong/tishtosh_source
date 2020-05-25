package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.location.C36255b.C36256a;
import p2628d.C52857u;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LocationStatusReportTask */
public final class LocationStatusReportTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.SPARSE;
    }

    public final void run(Context context) {
        boolean z;
        Object obj;
        int i = 1;
        if (VERSION.SDK_INT >= 23) {
            z = C36256a.m81866a();
        } else {
            z = true;
        }
        C23089d a = C23089d.m56640a();
        String str = "is_open";
        if (!z) {
            i = 0;
        }
        a.mo47826a(str, i);
        if (context != null) {
            try {
                obj = context.getSystemService("location");
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
        } else {
            obj = null;
        }
        if (obj != null) {
            LocationManager locationManager = (LocationManager) obj;
            if (locationManager != null) {
                a.mo47826a("device_gps_open", locationManager.isProviderEnabled("gps") ? 1 : 0);
            }
            C26890h.m65011a("location_status", a.f61491a);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.location.LocationManager");
    }
}
