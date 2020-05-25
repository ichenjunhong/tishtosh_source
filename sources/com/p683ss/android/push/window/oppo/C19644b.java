package com.p683ss.android.push.window.oppo;

import com.C2240a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.push.window.oppo.b */
public final class C19644b<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f54106a;

    /* renamed from: b */
    private int f54107b;

    /* renamed from: c */
    private int f54108c;

    /* renamed from: d */
    private int f54109d;

    /* renamed from: e */
    private int f54110e;

    /* renamed from: f */
    private int f54111f;

    /* renamed from: g */
    private int f54112g;

    /* renamed from: b */
    private int m48001b(K k, V v) {
        return 1;
    }

    /* renamed from: a */
    public final synchronized void mo40961a() {
        m48000a(-1);
    }

    /* renamed from: b */
    public final synchronized Map<K, V> mo40962b() {
        return new LinkedHashMap(this.f54106a);
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f54111f + this.f54112g;
        if (i2 != 0) {
            i = (this.f54111f * 100) / i2;
        } else {
            i = 0;
        }
        return C2240a.m6772a("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f54108c), Integer.valueOf(this.f54111f), Integer.valueOf(this.f54112g), Integer.valueOf(i)});
    }

    public C19644b(int i) {
        if (i > 0) {
            this.f54108c = i;
            this.f54106a = new LinkedHashMap<>(0, 0.75f, false);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public final synchronized V mo40959a(K k) {
        V remove;
        if (k != null) {
            remove = this.f54106a.remove(k);
            if (remove != null) {
                this.f54107b -= m48001b(k, remove);
            }
        } else {
            throw new NullPointerException("key == null");
        }
        return remove;
    }

    /* renamed from: a */
    private void m48000a(int i) {
        while (this.f54107b > i && !this.f54106a.isEmpty()) {
            Entry entry = (Entry) this.f54106a.entrySet().iterator().next();
            if (entry == null) {
                break;
            }
            Object key = entry.getKey();
            Object value = entry.getValue();
            this.f54106a.remove(key);
            this.f54107b -= m48001b(key, value);
            this.f54110e++;
        }
        if (this.f54107b < 0 || (this.f54106a.isEmpty() && this.f54107b != 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(".sizeOf() is reporting inconsistent results!");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final synchronized V mo40960a(K k, V v) {
        V put;
        if (k != null) {
            this.f54109d++;
            this.f54107b += m48001b(k, v);
            put = this.f54106a.put(k, v);
            if (put != null) {
                this.f54107b -= m48001b(k, put);
            }
            m48000a(this.f54108c);
        } else {
            throw new NullPointerException("key == null || value == null");
        }
        return put;
    }
}
