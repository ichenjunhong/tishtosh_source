package com.p683ss.android.ugc.effectmanager.common.p2440g;

import android.os.Handler;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.common.g.b */
public abstract class C48647b<T, F extends BaseNetResponse> extends C48653h<T> {

    /* renamed from: d */
    private final C48644a f122276d;

    /* renamed from: e */
    private final C48641b f122277e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C48605b mo96223a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo96224a(C48649d dVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo96225a(F f);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo96226b() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo96227c() {
        return 10002;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Class<F> mo96228d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo96229e() {
        BaseNetResponse baseNetResponse;
        int b = mo96226b();
        while (true) {
            int i = b - 1;
            if (b != 0) {
                try {
                    if (!this.f122285a) {
                        C48605b a = mo96223a();
                        C48644a aVar = this.f122276d;
                        if (aVar != null) {
                            baseNetResponse = aVar.mo96220a(a, this.f122277e, mo96228d());
                        } else {
                            baseNetResponse = null;
                        }
                        if (baseNetResponse == null || !baseNetResponse.checkValue()) {
                            if (i == 0) {
                                mo96224a(new C48649d(mo96227c()));
                            }
                            b = i;
                        } else {
                            mo96225a((F) baseNetResponse);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (i == 0 || (e instanceof C48636c)) {
                        mo96224a(new C48649d(e));
                    }
                }
            } else {
                return;
            }
        }
        mo96224a(new C48649d(e));
    }

    public C48647b(C48644a aVar, C48641b bVar, Handler handler, String str) {
        C52711k.m112240b(bVar, "jsonConverter");
        C52711k.m112240b(str, "taskId");
        super(handler, str);
        this.f122276d = aVar;
        this.f122277e = bVar;
    }
}
