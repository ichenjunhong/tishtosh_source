package com.google.android.gms.tagmanager;

import com.C2240a;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.tagmanager.c */
public final class C17203c {

    /* renamed from: a */
    public static final Object f48633a = new Object();

    /* renamed from: c */
    private static final String[] f48634c = "gtm.lifetime".toString().split("\\.");

    /* renamed from: d */
    private static final Pattern f48635d = Pattern.compile("(\\d+)\\s*([smhd]?)");

    /* renamed from: b */
    final CountDownLatch f48636b;

    /* renamed from: e */
    private final ConcurrentHashMap<C17205b, Integer> f48637e;

    /* renamed from: f */
    private final Map<String, Object> f48638f;

    /* renamed from: g */
    private final ReentrantLock f48639g;

    /* renamed from: h */
    private final LinkedList<Map<String, Object>> f48640h;

    /* renamed from: i */
    private final C17206c f48641i;

    /* renamed from: com.google.android.gms.tagmanager.c$a */
    static final class C17204a {

        /* renamed from: a */
        public final String f48642a;

        /* renamed from: b */
        public final Object f48643b;

        C17204a(String str, Object obj) {
            this.f48642a = str;
            this.f48643b = obj;
        }

        public final String toString() {
            String str = this.f48642a;
            String obj = this.f48643b.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(obj).length());
            sb.append("Key: ");
            sb.append(str);
            sb.append(" value: ");
            sb.append(obj);
            return sb.toString();
        }

        public final int hashCode() {
            return Arrays.hashCode(new Integer[]{Integer.valueOf(this.f48642a.hashCode()), Integer.valueOf(this.f48643b.hashCode())});
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C17204a)) {
                return false;
            }
            C17204a aVar = (C17204a) obj;
            if (!this.f48642a.equals(aVar.f48642a) || !this.f48643b.equals(aVar.f48643b)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.c$b */
    interface C17205b {
        /* renamed from: a */
        void mo33441a(Map<String, Object> map);
    }

    /* renamed from: com.google.android.gms.tagmanager.c$c */
    interface C17206c {
        /* renamed from: a */
        void mo33467a(C17213i iVar);

        /* renamed from: a */
        void mo33468a(List<C17204a> list, long j);
    }

    C17203c() {
        this(new C17211g());
    }

    C17203c(C17206c cVar) {
        this.f48641i = cVar;
        this.f48637e = new ConcurrentHashMap<>();
        this.f48638f = new HashMap();
        this.f48639g = new ReentrantLock();
        this.f48640h = new LinkedList<>();
        this.f48636b = new CountDownLatch(1);
        this.f48641i.mo33467a(new C17212h(this));
    }

    public final String toString() {
        String sb;
        synchronized (this.f48638f) {
            StringBuilder sb2 = new StringBuilder();
            for (Entry entry : this.f48638f.entrySet()) {
                sb2.append(C2240a.m6772a("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[]{entry.getKey(), entry.getValue()}));
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: a */
    public final void mo33461a(Map<String, Object> map) {
        try {
            this.f48636b.await();
        } catch (InterruptedException unused) {
        }
        mo33462b(map);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33462b(Map<String, Object> map) {
        Long l;
        Object obj;
        this.f48639g.lock();
        try {
            this.f48640h.offer(map);
            int i = 0;
            if (this.f48639g.getHoldCount() == 1) {
                int i2 = 0;
                while (true) {
                    Map map2 = (Map) this.f48640h.poll();
                    if (map2 == null) {
                        break;
                    }
                    synchronized (this.f48638f) {
                        for (String str : map2.keySet()) {
                            m42152a(m42149a(str, map2.get(str)), this.f48638f);
                        }
                    }
                    for (C17205b a : this.f48637e.keySet()) {
                        a.mo33441a(map2);
                    }
                    i2++;
                    if (i2 > 500) {
                        this.f48640h.clear();
                        throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                    }
                }
            }
            String[] strArr = f48634c;
            int length = strArr.length;
            Object obj2 = map;
            while (true) {
                l = null;
                if (i >= length) {
                    obj = obj2;
                    break;
                }
                String str2 = strArr[i];
                if (!(obj2 instanceof Map)) {
                    obj = 0;
                    break;
                } else {
                    i++;
                    obj2 = ((Map) obj2).get(str2);
                }
            }
            if (obj != 0) {
                l = m42148a(obj.toString());
            }
            if (l != null) {
                ArrayList arrayList = new ArrayList();
                m42151a(map, "", arrayList);
                this.f48641i.mo33468a(arrayList, l.longValue());
            }
            this.f48639g.unlock();
        } catch (Throwable th) {
            this.f48639g.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    private final void m42151a(Map<String, Object> map, String str, Collection<C17204a> collection) {
        for (Entry entry : map.entrySet()) {
            String str2 = str.length() == 0 ? "" : ClassUtils.PACKAGE_SEPARATOR;
            String str3 = (String) entry.getKey();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            String sb2 = sb.toString();
            if (entry.getValue() instanceof Map) {
                m42151a((Map) entry.getValue(), sb2, collection);
            } else if (!sb2.equals("gtm.lifetime")) {
                collection.add(new C17204a(sb2, entry.getValue()));
            }
        }
    }

    /* renamed from: a */
    private static Long m42148a(String str) {
        long j;
        Matcher matcher = f48635d.matcher(str);
        if (!matcher.matches()) {
            String str2 = "unknown _lifetime: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return null;
        }
        try {
            j = Long.parseLong(matcher.group(1));
        } catch (NumberFormatException unused) {
            String str3 = "illegal number in _lifetime value: ";
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str3.concat(valueOf2);
            } else {
                new String(str3);
            }
            j = 0;
        }
        if (j <= 0) {
            String str4 = "non-positive _lifetime: ";
            String valueOf3 = String.valueOf(str);
            if (valueOf3.length() != 0) {
                str4.concat(valueOf3);
            } else {
                new String(str4);
            }
            return null;
        }
        String group = matcher.group(2);
        if (group.length() == 0) {
            return Long.valueOf(j);
        }
        char charAt = group.charAt(0);
        if (charAt == 'd') {
            return Long.valueOf(j * 1000 * 60 * 60 * 24);
        }
        if (charAt == 'h') {
            return Long.valueOf(j * 1000 * 60 * 60);
        }
        if (charAt == 'm') {
            return Long.valueOf(j * 1000 * 60);
        }
        if (charAt == 's') {
            return Long.valueOf(j * 1000);
        }
        String str5 = "unknown units in _lifetime: ";
        String valueOf4 = String.valueOf(str);
        if (valueOf4.length() != 0) {
            str5.concat(valueOf4);
        } else {
            new String(str5);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33460a(C17205b bVar) {
        this.f48637e.put(bVar, Integer.valueOf(0));
    }

    /* renamed from: a */
    static Map<String, Object> m42149a(String str, Object obj) {
        HashMap hashMap = new HashMap();
        String[] split = str.toString().split("\\.");
        int i = 0;
        HashMap hashMap2 = hashMap;
        while (i < split.length - 1) {
            HashMap hashMap3 = new HashMap();
            hashMap2.put(split[i], hashMap3);
            i++;
            hashMap2 = hashMap3;
        }
        hashMap2.put(split[split.length - 1], obj);
        return hashMap;
    }

    /* renamed from: a */
    private final void m42152a(Map<String, Object> map, Map<String, Object> map2) {
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                if (!(map2.get(str) instanceof List)) {
                    map2.put(str, new ArrayList());
                }
                m42150a((List) obj, (List) map2.get(str));
            } else if (obj instanceof Map) {
                if (!(map2.get(str) instanceof Map)) {
                    map2.put(str, new HashMap());
                }
                m42152a((Map) obj, (Map) map2.get(str));
            } else {
                map2.put(str, obj);
            }
        }
    }

    /* renamed from: a */
    private final void m42150a(List<Object> list, List<Object> list2) {
        while (list2.size() < list.size()) {
            list2.add(null);
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                if (!(list2.get(i) instanceof List)) {
                    list2.set(i, new ArrayList());
                }
                m42150a((List) obj, (List) list2.get(i));
            } else if (obj instanceof Map) {
                if (!(list2.get(i) instanceof Map)) {
                    list2.set(i, new HashMap());
                }
                m42152a((Map) obj, (Map) list2.get(i));
            } else if (obj != f48633a) {
                list2.set(i, obj);
            }
        }
    }
}
