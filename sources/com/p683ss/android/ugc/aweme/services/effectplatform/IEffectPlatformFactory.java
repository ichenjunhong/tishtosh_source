package com.p683ss.android.ugc.aweme.services.effectplatform;

import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.C48890g.C48892a;
import com.p683ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory */
public interface IEffectPlatformFactory {
    C29252f create(EffectPlatformBuilder effectPlatformBuilder);

    C29252f create(C48892a aVar, C52671b<? super C48890g, C52860x> bVar);

    C48892a createEffectConfigurationBuilder(EffectPlatformBuilder effectPlatformBuilder);

    List<Host> getHosts();
}
