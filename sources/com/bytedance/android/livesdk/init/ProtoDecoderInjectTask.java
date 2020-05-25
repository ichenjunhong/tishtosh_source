package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.base.model.proto.C2994b;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p179a.C2941a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.p392l.C7734a;

@C2941a(mo7578a = 7)
public class ProtoDecoderInjectTask extends C7734a {
    public void run() {
        ((INetworkService) C4116c.m10249a(INetworkService.class)).injectProtoDecoders(C2994b.f8806a);
    }
}
