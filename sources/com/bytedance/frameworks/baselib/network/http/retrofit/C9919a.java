package com.bytedance.frameworks.baselib.network.http.retrofit;

import com.bytedance.frameworks.baselib.network.p567b.C9819a;
import com.bytedance.frameworks.baselib.network.p567b.C9821c.C9822a;
import com.bytedance.frameworks.baselib.network.p567b.C9823d;
import com.bytedance.frameworks.baselib.network.p567b.C9827f;
import com.bytedance.retrofit2.C12800v;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a */
public final class C9919a implements Executor {

    /* renamed from: a */
    private static volatile C9823d f26988a;

    public final void execute(Runnable runnable) {
        int i;
        C9822a aVar;
        C9822a aVar2;
        if (runnable != null) {
            C9822a aVar3 = C9822a.NORMAL;
            boolean z = false;
            if (runnable instanceof C12800v) {
                C12800v vVar = (C12800v) runnable;
                int a = vVar.mo23842a();
                if (a == 0) {
                    aVar2 = C9822a.LOW;
                } else {
                    if (1 != a) {
                        if (2 == a) {
                            aVar2 = C9822a.HIGH;
                        } else if (3 == a) {
                            aVar2 = C9822a.IMMEDIATE;
                        }
                    }
                    aVar2 = C9822a.NORMAL;
                }
                z = vVar.mo23843b();
                i = vVar.mo23844c();
                aVar = aVar2;
            } else {
                aVar = aVar3;
                i = 0;
            }
            if (f26988a == null) {
                f26988a = C9827f.m19663b();
            }
            C9819a aVar4 = new C9819a("NetExecutor", aVar, i, runnable, z);
            if (z) {
                f26988a.mo17664a(aVar4);
                return;
            }
            f26988a.mo17665b(aVar4);
        }
    }
}
