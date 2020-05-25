package com.p683ss.p2549c.p2550a.p2551a.p2552a;

import android.os.Handler;
import android.os.Looper;
import com.p683ss.p2549c.p2550a.p2551a.p2552a.p2553a.C51170a;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.c.a.a.a.e */
public final class C51177e {

    /* renamed from: a */
    public final Set<C51181a> f127826a = new HashSet();

    /* renamed from: b */
    public final Handler f127827b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final C51169a f127828c;

    /* renamed from: d */
    public C51170a f127829d = null;

    /* renamed from: e */
    public boolean f127830e = false;

    /* renamed from: f */
    public int f127831f = 0;

    /* renamed from: g */
    private final C51182f f127832g;

    /* renamed from: com.ss.c.a.a.a.e$a */
    public interface C51181a {
        /* renamed from: a */
        void mo101712a(C51170a aVar);
    }

    /* renamed from: a */
    public final void mo101708a() {
        if (!this.f127830e) {
            this.f127830e = true;
            this.f127832g.mo101713a(new Runnable() {
                public final void run() {
                    final C51170a aVar;
                    try {
                        C51169a aVar2 = C51177e.this.f127828c;
                        StringBuilder sb = new StringBuilder();
                        sb.append(aVar2.f127802a);
                        sb.append("/video/live/qos/v2/ipSettings");
                        aVar = new C51170a(new JSONObject(aVar2.f127803b.mo14019a(C51169a.m110078a(sb.toString(), aVar2.f127804c))));
                    } catch (Exception unused) {
                        aVar = null;
                    }
                    C51177e.this.f127827b.post(new Runnable() {
                        public final void run() {
                            C51177e.this.f127830e = false;
                            if (aVar == null) {
                                C51177e eVar = C51177e.this;
                                int i = eVar.f127831f + 1;
                                eVar.f127831f = i;
                                if (i <= 5) {
                                    C51177e eVar2 = C51177e.this;
                                    eVar2.f127827b.removeCallbacksAndMessages(null);
                                    eVar2.f127827b.postDelayed(new Runnable() {
                                        public final void run() {
                                            C51177e.this.mo101708a();
                                        }
                                    }, 10000);
                                    return;
                                }
                                return;
                            }
                            C51177e.this.f127831f = 0;
                            C51177e.this.f127829d = aVar;
                            for (C51181a a : C51177e.this.f127826a) {
                                a.mo101712a(C51177e.this.f127829d);
                            }
                        }
                    });
                }
            });
        }
    }

    C51177e(C51182f fVar, C51169a aVar) {
        this.f127832g = fVar;
        this.f127828c = aVar;
    }
}
