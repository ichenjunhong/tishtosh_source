package com.p683ss.android.ugc.aweme.account.login.p1292v2;

import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AgeGateSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.EmailLoginSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a */
public final class C21636a {

    /* renamed from: a */
    public static final C21636a f58649a = new C21636a();

    /* renamed from: b */
    private static final List<String> f58650b = C52575l.m112099b((Object[]) new String[]{"gmail.com", "hotmail.com", "outlook.com", "yahoo.com", "icloud.com"});

    /* renamed from: c */
    private static final Date f58651c = new Date(System.currentTimeMillis() - 31536000000L);

    private C21636a() {
    }

    /* renamed from: a */
    public static List<String> m54341a() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            EmailLoginSettings emailLoginSettings = b.getEmailLoginSettings();
            C52711k.m112236a((Object) emailLoginSettings, "setting");
            List domainRecommendation = emailLoginSettings.getDomainRecommendation();
            C52711k.m112236a((Object) domainRecommendation, "setting.domainRecommendation");
            if (!domainRecommendation.isEmpty()) {
                return emailLoginSettings.getDomainRecommendation();
            }
        } catch (C10174a unused) {
        }
        return f58650b;
    }

    /* renamed from: b */
    public static Date m54342b() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            AgeGateSettings ageGateSettings = b.getAgeGateSettings();
            C52711k.m112236a((Object) ageGateSettings, "setting");
            if (C52711k.m112230a(ageGateSettings.getInitialDate().intValue(), 0) > 0) {
                return new Date(TimeUnit.SECONDS.toMillis((long) ageGateSettings.getInitialDate().intValue()));
            }
        } catch (C10174a unused) {
        }
        return f58651c;
    }
}
