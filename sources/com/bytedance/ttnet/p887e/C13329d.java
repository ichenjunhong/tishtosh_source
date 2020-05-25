package com.bytedance.ttnet.p887e;

import com.C2240a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.ttnet.e.d */
final class C13329d<K, V> {

    /* renamed from: a */
    private Map<K, V> f34783a = Collections.synchronizedMap(new LinkedHashMap(0, 0.75f, true));

    /* renamed from: b */
    private int f34784b;

    /* renamed from: c */
    private int f34785c = 10;

    /* renamed from: d */
    private int f34786d;

    /* renamed from: e */
    private int f34787e;

    /* renamed from: f */
    private int f34788f;

    /* renamed from: g */
    private int f34789g;

    /* renamed from: b */
    private int m26845b(K k, V v) {
        return 1;
    }

    /* renamed from: a */
    public final synchronized int mo24933a() {
        return this.f34784b;
    }

    /* renamed from: b */
    public final synchronized Map<K, V> mo24936b() {
        return this.f34783a;
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f34788f + this.f34789g;
        if (i2 != 0) {
            i = (this.f34788f * 100) / i2;
        } else {
            i = 0;
        }
        return C2240a.m6772a("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f34785c), Integer.valueOf(this.f34788f), Integer.valueOf(this.f34789g), Integer.valueOf(i)});
    }

    public C13329d(int i) {
    }

    /* renamed from: a */
    public final synchronized V mo24934a(K k) {
        if (k != null) {
            V v = this.f34783a.get(k);
            if (v != null) {
                this.f34788f++;
                return v;
            }
            this.f34789g++;
            return null;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: a */
    private void m26844a(int i) {
        while (this.f34784b > i && !this.f34783a.isEmpty()) {
            Entry entry = (Entry) this.f34783a.entrySet().iterator().next();
            if (entry == null) {
                break;
            }
            Object key = entry.getKey();
            Object value = entry.getValue();
            this.f34783a.remove(key);
            this.f34784b -= m26845b(key, value);
            this.f34787e++;
        }
        if (this.f34784b < 0 || (this.f34783a.isEmpty() && this.f34784b != 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(".sizeOf() is reporting inconsistent results!");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final synchronized V mo24935a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        this.f34786d++;
        this.f34784b += m26845b(k, v);
        put = this.f34783a.put(k, v);
        if (put != null) {
            this.f34784b -= m26845b(k, put);
        }
        m26844a(this.f34785c);
        return put;
    }
}
