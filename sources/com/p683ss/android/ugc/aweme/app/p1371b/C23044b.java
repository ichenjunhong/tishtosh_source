package com.p683ss.android.ugc.aweme.app.p1371b;

import com.p683ss.android.ugc.aweme.app.C23098h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.ApiConfigEntity;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.b.b */
public final class C23044b {

    /* renamed from: a */
    public static final C23044b f61399a = new C23044b();

    /* renamed from: b */
    private static final Map<String, C23043a> f61400b = new LinkedHashMap();

    /* renamed from: c */
    private static final C23043a f61401c;

    private C23044b() {
    }

    static {
        C23043a aVar = new C23043a(false, C23098h.f61512f.mo47842b(), null, 4, null);
        f61401c = aVar;
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            SpringApiLimitConfig springApiLimitConfig = b.getSpringApiLimitConfig();
            C52711k.m112236a((Object) springApiLimitConfig, "SettingsReader.get().springApiLimitConfig");
            if (springApiLimitConfig != null) {
                List<ApiConfigEntity> configList = springApiLimitConfig.getConfigList();
                if (configList != null) {
                    for (ApiConfigEntity apiConfigEntity : configList) {
                        Map<String, C23043a> map = f61400b;
                        C52711k.m112236a((Object) apiConfigEntity, "it");
                        String apiName = apiConfigEntity.getApiName();
                        C52711k.m112236a((Object) apiName, "it.apiName");
                        Boolean isBanned = apiConfigEntity.getIsBanned();
                        C52711k.m112236a((Object) isBanned, "it.isBanned");
                        boolean booleanValue = isBanned.booleanValue();
                        Long delayTime = apiConfigEntity.getDelayTime();
                        C52711k.m112236a((Object) delayTime, "it.delayTime");
                        long longValue = delayTime.longValue();
                        String apiName2 = apiConfigEntity.getApiName();
                        C52711k.m112236a((Object) apiName2, "it.apiName");
                        map.put(apiName, new C23043a(booleanValue, longValue, apiName2));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C23043a m56560a(String str) {
        C52711k.m112240b(str, "apiName");
        C23043a aVar = (C23043a) f61400b.get(str);
        if (aVar != null) {
            return aVar;
        }
        return null;
    }
}
