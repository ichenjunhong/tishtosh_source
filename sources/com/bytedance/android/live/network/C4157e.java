package com.bytedance.android.live.network;

import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.frameworks.baselib.network.http.retrofit.C9919a;
import com.bytedance.frameworks.baselib.network.http.retrofit.p575a.p576a.C9920a;
import com.bytedance.retrofit2.C12725c.C12726a;
import com.bytedance.retrofit2.C12744f.C12745a;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.C12792q.C12794a;
import com.bytedance.retrofit2.p830a.C12683a.C12684a;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p834d.p835a.C12742h;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.android.live.network.e */
public class C4157e {

    /* renamed from: c */
    private static volatile C4157e f11334c;

    /* renamed from: a */
    private final ConcurrentHashMap<Class, Object> f11335a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final C12792q f11336b;

    /* renamed from: a */
    public static C4157e m10322a() {
        if (f11334c == null) {
            synchronized (C4157e.class) {
                if (f11334c == null) {
                    f11334c = new C4157e();
                }
            }
        }
        return f11334c;
    }

    private C4157e() {
        IHostNetwork iHostNetwork = (IHostNetwork) C4116c.m10249a(INetworkService.class);
        C4170n nVar = new C4170n(iHostNetwork);
        C12794a aVar = new C12794a();
        StringBuilder sb = new StringBuilder("https://");
        sb.append(iHostNetwork.getHostDomain());
        this.f11336b = aVar.mo23945a(sb.toString()).mo23941a((C12684a) new C4171o(nVar)).mo23942a((C12726a) new C12742h(null, true)).mo23944a((C12745a) new C4164j()).mo23944a((C12745a) new C4158f(C9920a.m19891a(C4161h.f11350b.mo9558a()))).mo23943a((C12727a) new ResponseInterceptor()).mo23946a((Executor) new C9919a()).mo23947a();
    }

    /* renamed from: a */
    public final <T> T mo9550a(Class<T> cls) {
        if (!this.f11335a.contains(cls)) {
            this.f11335a.putIfAbsent(cls, this.f11336b.mo23937a(cls));
        }
        return this.f11335a.get(cls);
    }
}
