package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.experiment.DataSaverSettingExperiment;
import com.p683ss.android.ugc.aweme.framework.p1782c.C32462a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.k */
public final class C41631k {

    /* renamed from: a */
    public static final C41631k f105364a = new C41631k();

    private C41631k() {
    }

    /* renamed from: d */
    public final int mo85387d() {
        if (mo85386b() != 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m91508c() {
        if (C10181b.m20511a().mo18168a(DataSaverSettingExperiment.class, true, "data_saver_mode", 31744, 0) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int mo85386b() {
        if (!m91506a() || C32462a.m75159a(C11010c.m22280a())) {
            return 0;
        }
        return C10181b.m20511a().mo18168a(DataSaverSettingExperiment.class, true, "data_saver_mode", 31744, 0);
    }

    /* renamed from: a */
    public static boolean m91506a() {
        C23183v a = C23183v.m56778a();
        C52711k.m112236a((Object) a, "CommonSharePrefCache.inst()");
        C23051bf P = a.mo47905P();
        C52711k.m112236a((Object) P, "CommonSharePrefCache.inst().dataSaver");
        Integer num = (Integer) P.mo47782d();
        if (num != null && num.intValue() == 0) {
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                num = b.getDataSaverSetting();
                C23183v a2 = C23183v.m56778a();
                C52711k.m112236a((Object) a2, "CommonSharePrefCache.inst()");
                C23051bf P2 = a2.mo47905P();
                C52711k.m112236a((Object) P2, "CommonSharePrefCache.inst().dataSaver");
                P2.mo47776a(num);
            } catch (C10174a unused) {
                num = Integer.valueOf(2);
            }
        }
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m91507a(int i) {
        try {
            C23183v a = C23183v.m56778a();
            C52711k.m112236a((Object) a, "CommonSharePrefCache.inst()");
            C23051bf P = a.mo47905P();
            C52711k.m112236a((Object) P, "CommonSharePrefCache.inst().dataSaver");
            P.mo47776a(Integer.valueOf(i));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
