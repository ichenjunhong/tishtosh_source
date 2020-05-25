package com.p683ss.android.ugc.aweme.protection.serviceimpl;

import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.C40841b;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.C40849c;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.C40850d;
import com.p683ss.android.ugc.aweme.protection.api.services.C40860c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.serviceimpl.b */
public abstract class C40882b implements C40860c {
    /* renamed from: c */
    public final void mo83192c() {
        C40841b.m90322a();
    }

    /* renamed from: g */
    public final C27979p mo83196g() {
        return new C40850d();
    }

    /* renamed from: a */
    public final String mo83188a() {
        return C40849c.m90331a().mo83180d();
    }

    /* renamed from: b */
    public final int mo83191b() {
        return C40849c.m90331a().mo83179c();
    }

    /* renamed from: a */
    public final void mo83189a(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        C40841b.m90323a(aweme);
    }

    /* renamed from: a */
    public final void mo83190a(IESSettingsProxy iESSettingsProxy) {
        C52711k.m112240b(iESSettingsProxy, "settings");
        C40849c.m90331a().mo83175a(iESSettingsProxy);
    }
}
