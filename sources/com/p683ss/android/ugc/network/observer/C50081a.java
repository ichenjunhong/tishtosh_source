package com.p683ss.android.ugc.network.observer;

import com.bytedance.netecho.Netecho;
import com.bytedance.netecho.result.DnsResolveResult;
import com.p683ss.android.ugc.network.observer.bean.C50092a;
import com.p683ss.android.ugc.network.observer.bean.C50093b;
import com.p683ss.android.ugc.network.observer.bean.C50094c;
import com.p683ss.android.ugc.network.observer.bean.C50095d;
import com.p683ss.android.ugc.network.observer.bean.DetectorParam;
import com.p683ss.android.ugc.network.observer.p2490a.C50083a;
import com.p683ss.android.ugc.network.observer.p2490a.C50084b;
import com.p683ss.android.ugc.network.observer.p2490a.C50086c;
import com.p683ss.android.ugc.network.observer.p2491b.C50089a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.network.observer.a */
public final class C50081a implements Runnable {

    /* renamed from: a */
    public CopyOnWriteArrayList<C52847n<C52682m<C50088b, HashMap<String, HashMap<String, Object>>, C52860x>, C52671b<HashMap<String, Object>, C52860x>>> f125433a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public CopyOnWriteArrayList<Long> f125434b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final ArrayList<C50083a> f125435c = new ArrayList<>();

    /* renamed from: d */
    private HashMap<String, HashMap<String, Object>> f125436d = new HashMap<>();

    /* renamed from: e */
    private HashMap<String, C50093b> f125437e = new HashMap<>();

    /* renamed from: f */
    private final DetectorParam f125438f;

    /* renamed from: g */
    private final C50094c f125439g;

    /* renamed from: com.ss.android.ugc.network.observer.a$a */
    static final class C50082a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f125440a;

        /* renamed from: b */
        final /* synthetic */ C52727e f125441b;

        /* renamed from: c */
        final /* synthetic */ long f125442c;

        /* renamed from: d */
        final /* synthetic */ C52727e f125443d;

        C50082a(String str, C52727e eVar, long j, C52727e eVar2) {
            this.f125440a = str;
            this.f125441b = eVar;
            this.f125442c = j;
            this.f125443d = eVar2;
        }

        public final void run() {
            Object obj;
            try {
                List b = C52830p.m112452b(this.f125440a, new String[]{":"}, false, 0, 6, (Object) null);
                if (b.size() == 2) {
                    int parseInt = Integer.parseInt((String) b.get(1));
                    if (1 <= parseInt) {
                        if (65534 >= parseInt) {
                            ((ConcurrentHashMap) this.f125441b.element).put(this.f125440a, new C52847n(Netecho.INSTANCE.resolveDns((String) b.get(0), this.f125442c), Integer.valueOf(parseInt)));
                            StringBuilder sb = new StringBuilder("dns return ");
                            C52847n nVar = (C52847n) ((ConcurrentHashMap) this.f125441b.element).get(this.f125440a);
                            Integer num = null;
                            if (nVar != null) {
                                obj = (DnsResolveResult) nVar.getFirst();
                            } else {
                                obj = null;
                            }
                            sb.append(obj);
                            sb.append(" ");
                            C52847n nVar2 = (C52847n) ((ConcurrentHashMap) this.f125441b.element).get(this.f125440a);
                            if (nVar2 != null) {
                                num = (Integer) nVar2.getSecond();
                            }
                            sb.append(num);
                        }
                    }
                }
            } catch (Throwable th) {
                ((CountDownLatch) this.f125443d.element).countDown();
                throw th;
            }
            ((CountDownLatch) this.f125443d.element).countDown();
        }
    }

    public final void run() {
        String str;
        String[] targetList = this.f125438f.getTargetList();
        long dnsTimeout = (long) this.f125438f.getDnsTimeout();
        C52727e eVar = new C52727e();
        eVar.element = new CountDownLatch(targetList.length);
        C52727e eVar2 = new C52727e();
        eVar2.element = new ConcurrentHashMap();
        for (String aVar : targetList) {
            C50082a aVar2 = new C50082a(aVar, eVar2, dnsTimeout, eVar);
            new Thread(aVar2).start();
        }
        try {
            ((CountDownLatch) eVar.element).await(dnsTimeout + 1000, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        for (Entry entry : ((ConcurrentHashMap) eVar2.element).entrySet()) {
            DnsResolveResult dnsResolveResult = (DnsResolveResult) ((C52847n) entry.getValue()).getFirst();
            this.f125436d.put(entry.getKey(), new HashMap());
            HashMap hashMap = (HashMap) this.f125436d.get(entry.getKey());
            if (hashMap != null) {
                hashMap.put("dns_result", dnsResolveResult);
            }
            if (dnsResolveResult.getSuccess() && dnsResolveResult.getIp() != null) {
                Map map = this.f125437e;
                Object key = entry.getKey();
                String ip = ((DnsResolveResult) ((C52847n) entry.getValue()).getFirst()).getIp();
                if (ip == null) {
                    C52711k.m112234a();
                }
                map.put(key, new C50093b(ip, ((Number) ((C52847n) entry.getValue()).getSecond()).intValue()));
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        C50088b bVar = C50088b.UNKNOWN_STATUS;
        try {
            long j = -1;
            long j2 = -1;
            for (C50083a aVar3 : this.f125435c) {
                long currentTimeMillis2 = System.currentTimeMillis();
                C50092a a = aVar3.mo97851a();
                if (aVar3 instanceof C50084b) {
                    j2 = System.currentTimeMillis() - currentTimeMillis2;
                } else if (aVar3 instanceof C50086c) {
                    j = System.currentTimeMillis() - currentTimeMillis2;
                }
                if (!Thread.interrupted()) {
                    bVar = a.f125466b;
                    if (!a.f125465a) {
                        break;
                    }
                } else {
                    return;
                }
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            if (bVar == C50088b.NETWORK_GOOD) {
                C50099d.f125493a = currentTimeMillis3;
            }
            if (bVar == C50088b.NO_NETWORK && this.f125437e.size() == 0) {
                bVar = C50088b.UNKNOWN_STATUS;
                str = "2";
            } else {
                str = null;
            }
            long j3 = currentTimeMillis3 - currentTimeMillis;
            if (j3 > ((long) this.f125438f.getPingTimeout()) + ((long) this.f125438f.getTcpTimeout()) + 3000) {
                bVar = C50088b.UNKNOWN_STATUS;
                str = "3";
            }
            this.f125436d.put("extra_info", C50089a.m108045a(str, this.f125439g));
            boolean z = false;
            for (C52847n nVar : this.f125433a) {
                ((C52682m) nVar.getFirst()).invoke(bVar, this.f125436d);
                if (!z) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(C50095d.m108049b(), String.valueOf(bVar.ordinal()));
                    hashMap2.put(C50095d.f125472b, Long.valueOf(currentTimeMillis));
                    if (j != -1) {
                        hashMap2.put(C50095d.f125475e, Long.valueOf(j));
                    }
                    if (j2 != -1) {
                        hashMap2.put(C50095d.f125474d, Long.valueOf(j2));
                    }
                    hashMap2.put(C50095d.f125476f, Long.valueOf(j3));
                    hashMap2.put(C50095d.m108050c(), this.f125436d);
                    ((C52671b) nVar.getSecond()).invoke(hashMap2);
                    z = true;
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public C50081a(DetectorParam detectorParam, C50094c cVar) {
        C52711k.m112240b(detectorParam, "param");
        C52711k.m112240b(cVar, "localParam");
        this.f125438f = detectorParam;
        this.f125439g = cVar;
        this.f125435c.add(new C50084b(this.f125437e, this.f125436d, (long) this.f125438f.getPingTimeout()));
        this.f125435c.add(new C50086c(this.f125437e, this.f125436d, (long) this.f125438f.getTcpTimeout()));
    }
}
