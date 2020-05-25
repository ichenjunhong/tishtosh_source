package com.p683ss.android.ugc.aweme.device;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.device.C27528a.C27530a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.player.C38847b;
import com.p683ss.android.ugc.aweme.utils.C47689aw.C47691a;
import com.p683ss.android.ugc.aweme.utils.C47689aw.C47692b;
import com.p683ss.android.ugc.aweme.utils.C47689aw.C47693c;
import com.p683ss.android.ugc.aweme.utils.C47689aw.C47694d;
import com.p683ss.android.ugc.aweme.utils.C47689aw.C47695e;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.device.DeviceInfoReportTask */
public class DeviceInfoReportTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        boolean z;
        if (!C27528a.f72369a) {
            Context a = C11010c.m22280a();
            if (a != null) {
                String str = "KEVA_KEY_TIME_DeviceInfoReporter";
                C52711k.m112240b(str, "key");
                long j = C38847b.f98941a.getLong(str, 0);
                if (j != 0) {
                    Date date = new Date(j);
                    Date date2 = new Date();
                    Calendar instance = Calendar.getInstance();
                    Calendar instance2 = Calendar.getInstance();
                    instance.setTime(date);
                    instance2.setTime(date2);
                    if (instance.get(6) == instance2.get(6) && instance.get(1) == instance2.get(1)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                }
                String str2 = "KEVA_KEY_TIME_DeviceInfoReporter";
                long time = new Date().getTime();
                C52711k.m112240b(str2, "key");
                C38847b.f98941a.storeLong(str2, time);
                C1680ad.m5962a((Callable<? extends T>) new C27531b<Object>(a)).mo6155b(C2168a.m6521b()).mo6148a(C2168a.m6521b()).mo6159b((C1683ag<? super T>) new C1683ag<C27530a>() {
                    public final void onError(Throwable th) {
                    }

                    public final void onSubscribe(C1690c cVar) {
                    }

                    public final /* synthetic */ void onSuccess(Object obj) {
                        C27530a aVar = (C27530a) obj;
                        C47691a aVar2 = aVar.f72370a;
                        C47693c cVar = aVar.f72371b;
                        C47694d dVar = aVar.f72372c;
                        C47692b bVar = aVar.f72373d;
                        C26890h.m65011a("device_info", C23089d.m56640a().mo47829a("cpu_vendor", aVar2.f120173a).mo47826a("cpu_core_nums", aVar2.f120175c).mo47826a("cpu_freq", aVar2.f120174b).mo47826a("screen_dpi", cVar.f120178a).mo47826a("screen_width", cVar.f120179b).mo47826a("screen_height", cVar.f120180c).mo47827a("app_storage_size", dVar.f120185e).mo47827a("storage_total_external_size", dVar.f120182b).mo47827a("storage_available_external_size", dVar.f120181a).mo47827a("storage_total_internal_size", dVar.f120184d).mo47827a("storage_available_internal_size", dVar.f120183c).mo47827a("memory_total_size", bVar.f120176a).mo47827a("memory_available_size", bVar.f120177b).mo47829a("brand", Build.BRAND).mo47829a("os_version", VERSION.RELEASE).mo47826a("os_api_level", VERSION.SDK_INT).mo47829a("Board", Build.BOARD).mo47829a("brand", Build.BRAND).mo47829a("device", Build.DEVICE).mo47829a("hardware", Build.HARDWARE).mo47829a("manufacturer", Build.MANUFACTURER).mo47829a("model", Build.MODEL).mo47829a("product", Build.PRODUCT).mo47829a("abis", C47695e.f120187a.mo94983a()).mo47827a("build_time", Build.TIME).mo47826a("install_on_sdcard", dVar.f120186f).f61491a);
                    }
                });
                C27528a.f72369a = true;
            }
        }
    }
}
