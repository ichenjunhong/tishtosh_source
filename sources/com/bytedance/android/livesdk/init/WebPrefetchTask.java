package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.p179a.C2941a;
import com.bytedance.android.livesdk.browser.C4672a.C4673a;
import com.bytedance.android.livesdk.browser.C4672a.C4674b;
import com.bytedance.android.livesdk.browser.C4672a.C4675c;
import com.bytedance.android.livesdk.config.C6717a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.android.livesdk.p392l.C7734a;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

@C2941a(mo7578a = 6)
public class WebPrefetchTask extends C7734a {
    public void run() {
        C4097p<String> pVar = LiveConfigSettingKeys.WEB_PREFETCH_CONFIG_FILE_LIST;
        C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.WE…PREFETCH_CONFIG_FILE_LIST");
        C2201v.m6614b(pVar.mo9431a()).mo6514a(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) C4673a.f12743a).mo6522a((C1715j<? super T>) C4674b.f12744a).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) C4675c.f12745a);
        C6717a.m14102a();
        C4526c<Boolean> cVar = C6717a.f18302a;
        cVar.mo10346a(cVar.f23614c);
    }
}
