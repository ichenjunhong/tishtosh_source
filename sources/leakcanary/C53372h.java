package leakcanary;

import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2673h.C53173a;
import p2673h.C53173a.C53174a;

/* renamed from: leakcanary.h */
public final class C53372h {

    /* renamed from: a */
    private final Set<C53374i> f132011a = new LinkedHashSet();

    /* renamed from: b */
    private final Map<String, KeyedWeakReference> f132012b = new LinkedHashMap();

    /* renamed from: c */
    private final ReferenceQueue<Object> f132013c = new ReferenceQueue<>();

    /* renamed from: d */
    private final C53364b f132014d;

    /* renamed from: e */
    private final Executor f132015e;

    /* renamed from: f */
    private final C52670a<Boolean> f132016f;

    /* renamed from: leakcanary.h$a */
    static final class C53373a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C53372h f132017a;

        /* renamed from: b */
        final /* synthetic */ String f132018b;

        C53373a(C53372h hVar, String str) {
            this.f132017a = hVar;
            this.f132018b = str;
        }

        public final void run() {
            this.f132017a.mo110962a(this.f132018b);
        }
    }

    /* renamed from: b */
    private final void m113447b() {
        KeyedWeakReference keyedWeakReference;
        do {
            keyedWeakReference = (KeyedWeakReference) this.f132013c.poll();
            if (keyedWeakReference != null) {
                this.f132012b.remove(keyedWeakReference.getKey());
                continue;
            }
        } while (keyedWeakReference != null);
    }

    /* renamed from: a */
    public final synchronized int mo110959a() {
        boolean z;
        m113447b();
        Map<String, KeyedWeakReference> map = this.f132012b;
        if (map.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Entry value : map.entrySet()) {
            if (((KeyedWeakReference) value.getValue()).getRetainedUptimeMillis() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final synchronized void mo110961a(Object obj) {
        C52711k.m112240b(obj, "watchedObject");
        m113446a(obj, "");
    }

    /* renamed from: a */
    public final synchronized void mo110963a(C53374i iVar) {
        C52711k.m112240b(iVar, "listener");
        this.f132011a.add(iVar);
    }

    /* renamed from: a */
    public final synchronized void mo110962a(String str) {
        m113447b();
        KeyedWeakReference keyedWeakReference = (KeyedWeakReference) this.f132012b.get(str);
        if (keyedWeakReference != null) {
            keyedWeakReference.setRetainedUptimeMillis(this.f132014d.mo110953a());
            for (C53374i onObjectRetained : this.f132011a) {
                onObjectRetained.onObjectRetained();
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo110964b(Object obj) {
        boolean z;
        C52711k.m112240b(obj, "unWatchedObject");
        Map<String, KeyedWeakReference> map = this.f132012b;
        Map linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            Object obj2 = ((KeyedWeakReference) entry.getValue()).get();
            if (obj2 != null) {
                z = C52711k.m112239a(obj2, obj);
            } else {
                z = false;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (String remove : linkedHashMap.keySet()) {
            this.f132012b.remove(remove);
        }
    }

    /* renamed from: a */
    public final synchronized void mo110960a(long j) {
        boolean z;
        Map<String, KeyedWeakReference> map = this.f132012b;
        Map linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            if (((KeyedWeakReference) entry.getValue()).getWatchUptimeMillis() <= j) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (KeyedWeakReference clear : linkedHashMap.values()) {
            clear.clear();
        }
        this.f132012b.keySet().removeAll(linkedHashMap.keySet());
    }

    /* renamed from: a */
    private synchronized void m113446a(Object obj, String str) {
        String str2;
        boolean z;
        String str3;
        C52711k.m112240b(obj, "watchedObject");
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        if (((Boolean) this.f132016f.invoke()).booleanValue()) {
            m113447b();
            String uuid = UUID.randomUUID().toString();
            C52711k.m112236a((Object) uuid, "UUID.randomUUID()\n        .toString()");
            KeyedWeakReference keyedWeakReference = new KeyedWeakReference(obj, uuid, str, this.f132014d.mo110953a(), this.f132013c);
            C53174a a = C53173a.m112969a();
            if (a != null) {
                StringBuilder sb = new StringBuilder("Watching ");
                if (obj instanceof Class) {
                    str2 = obj.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder("instance of ");
                    sb2.append(obj.getClass().getName());
                    str2 = sb2.toString();
                }
                sb.append(str2);
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    StringBuilder sb3 = new StringBuilder(" named ");
                    sb3.append(str);
                    str3 = sb3.toString();
                } else {
                    str3 = "";
                }
                sb.append(str3);
                sb.append(" with key ");
                sb.append(uuid);
                a.mo110681a(sb.toString());
            }
            this.f132012b.put(uuid, keyedWeakReference);
            this.f132015e.execute(new C53373a(this, uuid));
        }
    }

    public C53372h(C53364b bVar, Executor executor, C52670a<Boolean> aVar) {
        C52711k.m112240b(bVar, "clock");
        C52711k.m112240b(executor, "checkRetainedExecutor");
        C52711k.m112240b(aVar, "isEnabled");
        this.f132014d = bVar;
        this.f132015e = executor;
        this.f132016f = aVar;
    }
}
