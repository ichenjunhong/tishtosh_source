package com.p683ss.android.ugc.aweme.services.external.ability;

import android.content.Context;
import com.bef.effectsdk.C2592c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import java.util.List;
import java.util.Map;
import p001a.C0011g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVEffectService */
public interface IAVEffectService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVEffectService$EffectPlatformLoader */
    public interface EffectPlatformLoader {
        void load(C0011g<C29252f, Void> gVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVEffectService$IAVEffectReadyCallback */
    public interface IAVEffectReadyCallback<T> {
        void finish(T t);
    }

    void buildEffectPlatform(Context context, IAVEffectReadyCallback<C29252f> iAVEffectReadyCallback, C52671b<? super EffectPlatformBuilder, C52860x> bVar);

    void fetchEffectListResource(List<String> list, Map<String, String> map, boolean z, C29252f fVar, C48704i iVar);

    void fetchEffectModel(String[] strArr, IAVEffectReadyCallback<String[]> iAVEffectReadyCallback);

    void fetchEffectResource(String str, boolean z, String str2, Map<String, String> map, C29252f fVar, C48705j jVar);

    void provideResourceFinder(IAVEffectReadyCallback<C2592c> iAVEffectReadyCallback);
}
