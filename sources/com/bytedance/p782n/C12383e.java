package com.bytedance.p782n;

/* renamed from: com.bytedance.n.e */
public interface C12383e {

    /* renamed from: com.bytedance.n.e$a */
    public static class C12384a implements C12383e {
        /* renamed from: a */
        public final <T> T mo23397a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    <T> T mo23397a(Class<T> cls);
}
