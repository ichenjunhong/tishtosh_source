package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager;
import com.p683ss.android.ugc.aweme.global.config.settings.C32808a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.money.growth.C37164d;
import com.p683ss.android.ugc.aweme.money.growth.C37164d.C37165a;
import com.p683ss.android.ugc.aweme.protection.api.services.C40859b;
import com.p683ss.android.ugc.aweme.setting.p2136e.C41598d;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.ab */
public final class C41521ab extends C32808a {
    /* renamed from: a */
    public final void mo66389a(IESSettingsProxy iESSettingsProxy) {
        C47718bf.m103288a(new C41598d(iESSettingsProxy));
        C37164d b = C37165a.m83405b();
        C37164d.f94850g = true;
        b.mo76485a();
        if (b.f94853a != null) {
            try {
                UgAwemeActivitySetting ugAwemeActivitySetting = b.f94853a;
                if (ugAwemeActivitySetting == null) {
                    C52711k.m112234a();
                }
                if (!ugAwemeActivitySetting.getOverallSwitch().booleanValue()) {
                    b.f94855c.mo76484a(false);
                    b.f94855c.mo76482a(0);
                    b.f94855c.mo76483a("");
                }
            } catch (C10174a unused) {
            }
            for (C52671b invoke : C52575l.m112138e((Iterable<? extends T>) b.f94854b)) {
                invoke.invoke(b.f94853a);
            }
        } else {
            C37164d.m83388b("settingRequestComplete -> activityEntry 为空");
        }
        if (b.f94857e && !b.f94858f) {
            C37164d.m83392d();
        }
        C40859b.f104022a.getAntiAddictionService().mo83190a(iESSettingsProxy);
        SymphonyAdManager.m63648a();
        try {
            C35807d.m80935a(C11010c.m22280a(), "sp_symphony", 0).edit().putBoolean("enable_symphony_sdk_setting", C32816h.m75716b().getEnableSymphonySdk().booleanValue()).apply();
        } catch (C10174a unused2) {
        }
    }
}
