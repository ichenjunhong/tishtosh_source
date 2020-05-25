package com.bytedance.android.p173d.p176b;

import android.util.Base64;
import android.util.LruCache;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.android.d.b.i */
public final class C2930i {

    /* renamed from: a */
    public static final C2932a f8624a = new C2932a();

    /* renamed from: b */
    public static transient boolean f8625b = false;

    /* renamed from: com.bytedance.android.d.b.i$a */
    public static final class C2932a {

        /* renamed from: a */
        public String f8626a;

        /* renamed from: b */
        public int f8627b;

        /* renamed from: c */
        private LruCache<String, C2912d> f8628c;

        private C2932a() {
            this.f8628c = new LruCache<String, C2912d>(8) {
                /* access modifiers changed from: protected */
                public final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
                    String str = (String) obj;
                    C2912d dVar = (C2912d) obj3;
                    ((C2912d) obj2).mo7558b();
                }
            };
        }

        /* renamed from: a */
        public final C2912d mo7573a(String str, boolean z) {
            C2912d dVar = (C2912d) this.f8628c.get(str);
            if (dVar != null) {
                if (dVar.f8591b == z) {
                    return dVar;
                }
                dVar.mo7558b();
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f8626a);
                sb.append(File.separator);
                sb.append(new String(Base64.encode(str.getBytes(), 2)));
                dVar = new C2912d(sb.toString(), this.f8627b, z);
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder("Failed to create DataStore: ");
                sb2.append(str);
                C2909b.m8286a((Throwable) new IllegalStateException(sb2.toString(), e));
            }
            if (dVar == null) {
                return new C2912d();
            }
            this.f8628c.put(str, dVar);
            return dVar;
        }
    }

    /* renamed from: com.bytedance.android.d.b.i$b */
    public static final class C2934b {

        /* renamed from: a */
        public String f8630a;

        /* renamed from: b */
        public int f8631b;

        /* renamed from: c */
        public int f8632c;

        /* renamed from: d */
        public int f8633d;

        /* renamed from: e */
        public boolean f8634e;

        /* renamed from: f */
        public C2935a f8635f;

        /* renamed from: com.bytedance.android.d.b.i$b$a */
        public interface C2935a {
            /* renamed from: a */
            void mo7544a(int i, String str);

            /* renamed from: a */
            void mo7545a(int i, String str, Throwable th);
        }

        private C2934b() {
            this.f8631b = 64;
            this.f8632c = C2918h.f8595a;
            this.f8633d = C2918h.f8596b;
        }
    }

    /* renamed from: a */
    private static void m8359a() {
        if (!f8625b) {
            throw new IllegalStateException("SuperKV must be initialized before using.");
        }
    }

    /* renamed from: a */
    public static C2914e m8357a(String str) {
        return m8358a(str, false);
    }

    /* renamed from: a */
    private static C2914e m8358a(String str, boolean z) {
        m8359a();
        return f8624a.mo7573a(str, false);
    }
}
