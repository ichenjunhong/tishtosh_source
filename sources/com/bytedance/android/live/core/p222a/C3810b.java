package com.bytedance.android.live.core.p222a;

import java.util.List;

/* renamed from: com.bytedance.android.live.core.a.b */
public interface C3810b<K, V> {

    /* renamed from: com.bytedance.android.live.core.a.b$a */
    public static class C3811a<V> {

        /* renamed from: a */
        public int f10754a;

        /* renamed from: b */
        public int f10755b;

        /* renamed from: c */
        public List<V> f10756c;

        C3811a(int i, int i2, List<V> list) {
            this.f10754a = i;
            this.f10755b = i2;
            this.f10756c = list;
        }
    }

    /* renamed from: a */
    V mo9184a(K k, C3823n<V> nVar);

    /* renamed from: a */
    List<V> mo9185a(K k);

    /* renamed from: a */
    List<V> mo9186a(K k, List<V> list);

    /* renamed from: a */
    void mo9187a(K k, int i);

    /* renamed from: a */
    void mo9188a(K k, V v);

    /* renamed from: b */
    int mo9189b(K k);

    /* renamed from: b */
    int mo9190b(K k, V v);

    /* renamed from: c */
    void mo9191c(K k);
}
