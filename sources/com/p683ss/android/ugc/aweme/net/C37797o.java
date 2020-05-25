package com.p683ss.android.ugc.aweme.net;

import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.p683ss.android.ugc.aweme.network.INetwork;

/* renamed from: com.ss.android.ugc.aweme.net.o */
public final class C37797o {

    /* renamed from: a */
    public static final C37797o f96265a = new C37797o();

    private C37797o() {
    }

    /* renamed from: a */
    public static final INetwork m84398a() {
        INetwork iNetwork;
        try {
            iNetwork = NetworkService.createINetworkbyMonsterPlugin();
        } catch (Exception unused) {
            iNetwork = null;
        }
        if (iNetwork != null) {
            return iNetwork;
        }
        throw new IllegalStateException("SPI未获取到INetwork实例");
    }
}
