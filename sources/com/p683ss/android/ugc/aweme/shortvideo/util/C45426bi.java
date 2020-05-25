package com.p683ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.setting.Enable4KImportBenchmark;
import com.p683ss.android.ugc.aweme.setting.UseBenchMarkImport;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bi */
public final class C45426bi {

    /* renamed from: a */
    public static final C45426bi f114813a = new C45426bi();

    private C45426bi() {
    }

    /* renamed from: a */
    public static boolean m98997a() {
        boolean z;
        try {
            if (C10181b.m20511a().mo18172a(UseBenchMarkImport.class, true, "ab_4k_import_use_benchmark", 31744, false)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return Enable4KImportBenchmark.INSTANCE.enable();
            }
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Integer enable4kImport = b.getEnable4kImport();
            if (enable4kImport == null) {
                return false;
            }
            if (enable4kImport.intValue() == 1) {
                return true;
            }
            return false;
        } catch (C10174a unused) {
            return false;
        }
    }
}
