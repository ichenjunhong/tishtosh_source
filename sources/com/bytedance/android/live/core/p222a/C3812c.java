package com.bytedance.android.live.core.p222a;

import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.live.core.a.c */
public class C3812c<K, V> implements C3809a<K, V> {

    /* renamed from: a */
    private Map<K, V> f10757a;

    /* renamed from: b */
    private int f10758b;

    /* renamed from: c */
    private int f10759c;

    public C3812c() {
        this(8);
    }

    public final synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        for (Entry entry : this.f10757a.entrySet()) {
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            sb.append(",");
        }
        sb.append("maxMemory=");
        sb.append(this.f10758b);
        sb.append(",memorySize=");
        sb.append(this.f10759c);
        return sb.toString();
    }

    private C3812c(int i) {
        try {
            this.f10757a = new C3813d(8);
            this.f10758b = 8;
        } catch (OutOfMemoryError unused) {
            this.f10757a = new C3813d(10);
            this.f10758b = 10;
        }
    }

    /* renamed from: a */
    public final void mo9181a(K k) {
        synchronized (this) {
            if (this.f10757a.remove(k) != null) {
                this.f10759c--;
            }
        }
    }

    /* renamed from: b */
    public final V mo9183b(K k) {
        synchronized (this) {
            V v = this.f10757a.get(k);
            if (v != null) {
                return v;
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo9182a(K k, V v) {
        synchronized (this) {
            Object put = this.f10757a.put(k, v);
            this.f10759c++;
            if (put != null) {
                this.f10759c--;
            }
            int i = this.f10758b;
            while (this.f10759c > i && !this.f10757a.isEmpty()) {
                if (this.f10759c < 0 || (this.f10757a.isEmpty() && this.f10759c != 0)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C3812c.class.getName());
                    sb.append(".getValueSize() is reporting inconsistent results");
                    throw new IllegalStateException(sb.toString());
                }
                Entry entry = (Entry) this.f10757a.entrySet().iterator().next();
                this.f10757a.remove(entry.getKey());
                int i2 = this.f10759c;
                entry.getValue();
                this.f10759c = i2 - 1;
            }
        }
    }
}
