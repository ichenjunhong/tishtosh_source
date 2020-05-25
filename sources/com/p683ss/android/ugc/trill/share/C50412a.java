package com.p683ss.android.ugc.trill.share;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.experiment.EnableSyncToHeloEntryExperiment;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.trill.share.a */
public final class C50412a {
    /* renamed from: b */
    public static final boolean m108716b() {
        if (!C10181b.m20511a().mo18172a(EnableSyncToHeloEntryExperiment.class, true, "enable_sync_to_helo_entry", 31744, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m108717c() {
        int i;
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Integer closeSyncToHeloEntry = b.getCloseSyncToHeloEntry();
            if (closeSyncToHeloEntry == null) {
                C52711k.m112234a();
            }
            i = closeSyncToHeloEntry.intValue();
        } catch (C10174a unused) {
            i = 1;
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m108715a() {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (!m108717c() && !m108716b()) {
            C52711k.m112236a((Object) baseUserService_Monster, "service");
            if (baseUserService_Monster.isLogin()) {
                return true;
            }
        }
        return false;
    }
}
