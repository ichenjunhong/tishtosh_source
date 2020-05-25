package com.p683ss.android.ugc.network.observer.p2490a;

import com.bytedance.netecho.Netecho;
import com.bytedance.netecho.result.IcmpDetectResult;
import com.p683ss.android.ugc.network.observer.C50088b;
import com.p683ss.android.ugc.network.observer.bean.C50092a;
import com.p683ss.android.ugc.network.observer.bean.C50093b;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52723a;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.network.observer.a.b */
public final class C50084b implements C50083a {

    /* renamed from: a */
    public final long f125444a;

    /* renamed from: b */
    private final HashMap<String, C50093b> f125445b;

    /* renamed from: c */
    private final HashMap<String, HashMap<String, Object>> f125446c;

    /* renamed from: com.ss.android.ugc.network.observer.a.b$a */
    static final class C50085a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Entry f125447a;

        /* renamed from: b */
        final /* synthetic */ C50084b f125448b;

        /* renamed from: c */
        final /* synthetic */ C52727e f125449c;

        /* renamed from: d */
        final /* synthetic */ C52723a f125450d;

        /* renamed from: e */
        final /* synthetic */ C52727e f125451e;

        C50085a(Entry entry, C50084b bVar, C52727e eVar, C52723a aVar, C52727e eVar2) {
            this.f125447a = entry;
            this.f125448b = bVar;
            this.f125449c = eVar;
            this.f125450d = aVar;
            this.f125451e = eVar2;
        }

        public final void run() {
            try {
                IcmpDetectResult detectIcmp = Netecho.INSTANCE.detectIcmp(((C50093b) this.f125447a.getValue()).f125467a, this.f125448b.f125444a, 3);
                ((ConcurrentHashMap) this.f125449c.element).put(this.f125447a.getKey(), detectIcmp);
                if (detectIcmp.getSuccess()) {
                    this.f125450d.element = true;
                }
            } catch (Throwable th) {
                ((CountDownLatch) this.f125451e.element).countDown();
                throw th;
            }
            ((CountDownLatch) this.f125451e.element).countDown();
        }
    }

    /* renamed from: a */
    public final C50092a mo97851a() {
        C50088b bVar;
        C52727e eVar = new C52727e();
        eVar.element = new CountDownLatch(this.f125445b.size());
        C52723a aVar = new C52723a();
        aVar.element = false;
        C52727e eVar2 = new C52727e();
        eVar2.element = new ConcurrentHashMap();
        for (Entry aVar2 : this.f125445b.entrySet()) {
            C50085a aVar3 = new C50085a(aVar2, this, eVar2, aVar, eVar);
            new Thread(aVar3).start();
        }
        try {
            ((CountDownLatch) eVar.element).await(this.f125444a + 1000, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        boolean z = aVar.element;
        for (Entry entry : ((ConcurrentHashMap) eVar2.element).entrySet()) {
            HashMap hashMap = (HashMap) this.f125446c.get(entry.getKey());
            if (hashMap != null) {
                hashMap.put("icmp_result", entry.getValue());
            }
        }
        boolean z2 = !z;
        if (z) {
            bVar = C50088b.NETWORK_GOOD;
        } else {
            bVar = C50088b.NO_NETWORK;
        }
        return new C50092a(z2, bVar);
    }

    public C50084b(HashMap<String, C50093b> hashMap, HashMap<String, HashMap<String, Object>> hashMap2, long j) {
        C52711k.m112240b(hashMap, "dnsMap");
        C52711k.m112240b(hashMap2, "resultMap");
        this.f125445b = hashMap;
        this.f125446c = hashMap2;
        this.f125444a = j;
    }
}
