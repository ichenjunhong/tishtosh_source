package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.common.utility.p526f.C9409b;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c;
import com.bytedance.ttnet.C13303d;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.network.C37819a;
import com.p683ss.android.ugc.aweme.network.C37834c;
import com.p683ss.android.ugc.aweme.network.INetwork;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

public class NetworkService implements INetwork {
    public C37819a getConfig() {
        return C11031g.f29632b;
    }

    public void waitTTNetInit() {
        C11031g.m22344b();
    }

    public static INetwork createINetworkbyMonsterPlugin() {
        Object a = C27991b.m66756a(INetwork.class);
        if (a != null) {
            return (INetwork) a;
        }
        return new NetworkService();
    }

    public void setAlogFuncAddr(long j) {
        if (C11031g.f29631a && C11031g.f29633c) {
            try {
                C13303d.f34700c = j;
                if (C13303d.m26805g() != null) {
                    if (C9874c.f26872b != null) {
                        C9409b.m18609a((Object) C9874c.f26872b).mo17052a("setAlogFuncAddr", (Class<?>[]) new Class[]{Long.class}, Long.valueOf(j));
                    } else {
                        throw new UnsupportedOperationException("CronetEngine is not created.");
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public void init(C37819a aVar, C37834c cVar) {
        C52711k.m112240b(aVar, "config");
        if (cVar != null) {
            cVar.mo77264a(aVar);
        }
        C11031g.f29632b = aVar;
        C0013i.m18a((Callable<TResult>) new C11032a<TResult>(aVar, cVar), aVar.f96291g);
    }
}
