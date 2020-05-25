package com.bytedance.android.livesdk.feed.p334c;

import android.content.Context;
import com.bytedance.android.live.base.model.proto.C2993a;
import com.bytedance.android.live.core.C3828b;
import com.bytedance.android.live.core.setting.C4098q;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.feed.p332b.C6832c;
import com.bytedance.android.livesdk.feed.p332b.C6833d;
import com.bytedance.android.livesdk.feed.p332b.C6834e;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.p458l.C8833a;
import com.bytedance.android.livesdkapi.p458l.C8833a.C8834a;
import com.bytedance.android.livesdkapi.service.C8861d;

/* renamed from: com.bytedance.android.livesdk.feed.c.b */
public class C6856b {

    /* renamed from: a */
    public static Context f18792a;

    /* renamed from: b */
    private static C6856b f18793b = new C6856b();

    /* renamed from: c */
    private static C8861d f18794c;

    /* renamed from: d */
    private static boolean f18795d;

    private C6856b() {
    }

    /* renamed from: c */
    public static C8861d m14400c() {
        return f18794c;
    }

    /* renamed from: b */
    public static C6832c m14399b() {
        return new C6834e();
    }

    /* renamed from: a */
    public static Context m14397a() {
        if (f18792a != null) {
            return f18792a;
        }
        Context context = m14400c().mo13039a().context();
        f18792a = context;
        return context;
    }

    /* renamed from: a */
    public static void m14398a(C8861d dVar) {
        if (!f18795d) {
            synchronized (C6856b.class) {
                if (!f18795d) {
                    f18795d = true;
                    f18794c = new C6855a(dVar);
                    f18792a = dVar.mo13039a().context();
                    try {
                        C8833a.m17335a(Class.forName("com.bytedance.android.live.network.NetWorkService"), new C8834a(IHostNetwork.class, dVar.mo13046h()));
                    } catch (ClassNotFoundException unused) {
                    }
                    ((INetworkService) C4116c.m10249a(INetworkService.class)).injectProtoDecoders(C2993a.f8805a);
                    C3828b.m9701a(new C6833d());
                    if ("local_test".equals(f18794c.mo13039a().getChannel())) {
                        C4098q.m10217a(true);
                    }
                }
            }
        }
    }
}
