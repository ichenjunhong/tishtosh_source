package com.p683ss.android.ugc.effectmanager.common;

import android.util.Pair;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48646a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48651f;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48652g;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48661b;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.ss.android.ugc.effectmanager.common.i */
public final class C48681i {

    /* renamed from: a */
    public boolean f122330a;

    /* renamed from: b */
    public ExecutorService f122331b;

    /* renamed from: c */
    public boolean f122332c;

    /* renamed from: d */
    public Map<String, C48646a> f122333d;

    /* renamed from: e */
    public Map<String, Pair<C48652g, Future>> f122334e = new ConcurrentHashMap();

    /* renamed from: com.ss.android.ugc.effectmanager.common.i$a */
    public static class C48684a {

        /* renamed from: a */
        public ExecutorService f122340a;

        /* renamed from: b */
        public boolean f122341b;
    }

    /* renamed from: a */
    private void m105352a() {
        if (!this.f122330a) {
            throw new IllegalStateException("EffectPlatformSDK: TaskManager is not init !!!");
        }
    }

    /* renamed from: a */
    public final void mo96269a(final C48651f fVar) {
        boolean z;
        m105352a();
        if (!C48661b.m105289a(this.f122333d)) {
            Iterator it = this.f122333d.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C48646a) it.next()).mo96222a(fVar)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            this.f122331b.execute(new Runnable() {
                public final void run() {
                    fVar.mo96139a();
                }
            });
        }
    }

    /* renamed from: a */
    public final <T> void mo96270a(final C48652g<T> gVar, final C48650e<T> eVar) {
        m105352a();
        this.f122334e.put(gVar.mo96233f(), new Pair(gVar, this.f122331b.submit(new Runnable() {
            public final void run() {
                gVar.mo96232a(eVar);
                C48681i.this.f122334e.remove(gVar.mo96233f());
            }
        })));
    }
}
