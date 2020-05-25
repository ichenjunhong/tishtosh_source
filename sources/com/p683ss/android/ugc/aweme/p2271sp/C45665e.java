package com.p683ss.android.ugc.aweme.p2271sp;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.lancet.C18993n;
import com.p683ss.android.ugc.aweme.lego.p1915c.C35890a;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p2271sp.C45657a.C45660a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ss.android.ugc.aweme.sp.e */
public final class C45665e implements SharedPreferences {

    /* renamed from: l */
    private static final Object f115471l = new Object();

    /* renamed from: a */
    final File f115472a;

    /* renamed from: b */
    public final String f115473b;

    /* renamed from: c */
    final File f115474c;

    /* renamed from: d */
    public final Object f115475d = new Object();

    /* renamed from: e */
    public final Object f115476e = new Object();

    /* renamed from: f */
    public Map<String, Object> f115477f;

    /* renamed from: g */
    public int f115478g = 0;

    /* renamed from: h */
    public boolean f115479h = false;

    /* renamed from: i */
    public final WeakHashMap<OnSharedPreferenceChangeListener, Object> f115480i = new WeakHashMap<>();

    /* renamed from: j */
    public long f115481j;

    /* renamed from: k */
    long f115482k;

    /* renamed from: com.ss.android.ugc.aweme.sp.e$a */
    public final class C45668a implements Editor {

        /* renamed from: b */
        private final Object f115490b = new Object();

        /* renamed from: c */
        private final Map<String, Object> f115491c = new HashMap();

        /* renamed from: d */
        private boolean f115492d = false;

        public final Editor clear() {
            synchronized (this.f115490b) {
                this.f115492d = true;
            }
            return this;
        }

        public final boolean commit() {
            C45672b a = m99430a();
            C45665e.this.mo92076a(a, null, this, null, false);
            try {
                a.f115503e.await();
                mo92090a(a);
                return a.f115504f;
            } catch (InterruptedException unused) {
                return false;
            }
        }

        public final void apply() {
            List list;
            try {
                list = new ArrayList(this.f115491c.keySet());
            } catch (Exception unused) {
                list = Collections.emptyList();
            }
            List list2 = list;
            final C45672b a = m99430a();
            final C456691 r1 = new Runnable() {
                public final void run() {
                    try {
                        a.f115503e.await();
                    } catch (InterruptedException unused) {
                    }
                }
            };
            synchronized (C45663d.f115462a) {
                C45663d.f115464c.add(r1);
            }
            C45665e.this.mo92076a(a, new Runnable() {
                public final void run() {
                    r1.run();
                    Runnable runnable = r1;
                    synchronized (C45663d.f115462a) {
                        C45663d.f115464c.remove(runnable);
                    }
                }
            }, this, list2, true);
            mo92090a(a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.p683ss.android.ugc.aweme.p2271sp.C45665e.C45672b m99430a() {
            /*
                r12 = this;
                com.ss.android.ugc.aweme.sp.e r0 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this
                java.lang.Object r0 = r0.f115475d
                monitor-enter(r0)
                com.ss.android.ugc.aweme.sp.e r1 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00f2 }
                int r1 = r1.f115478g     // Catch:{ all -> 0x00f2 }
                if (r1 <= 0) goto L_0x0018
                com.ss.android.ugc.aweme.sp.e r1 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00f2 }
                java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x00f2 }
                com.ss.android.ugc.aweme.sp.e r3 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00f2 }
                java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f115477f     // Catch:{ all -> 0x00f2 }
                r2.<init>(r3)     // Catch:{ all -> 0x00f2 }
                r1.f115477f = r2     // Catch:{ all -> 0x00f2 }
            L_0x0018:
                com.ss.android.ugc.aweme.sp.e r1 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00f2 }
                java.util.Map<java.lang.String, java.lang.Object> r7 = r1.f115477f     // Catch:{ all -> 0x00f2 }
                com.ss.android.ugc.aweme.sp.e r1 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00f2 }
                int r2 = r1.f115478g     // Catch:{ all -> 0x00f2 }
                r3 = 1
                int r2 = r2 + r3
                r1.f115478g = r2     // Catch:{ all -> 0x00f2 }
                com.ss.android.ugc.aweme.sp.e r1 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00f2 }
                java.util.WeakHashMap<android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object> r1 = r1.f115480i     // Catch:{ all -> 0x00f2 }
                r2 = 0
                if (r1 == 0) goto L_0x0037
                com.ss.android.ugc.aweme.sp.e r1 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00f2 }
                java.util.WeakHashMap<android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object> r1 = r1.f115480i     // Catch:{ all -> 0x00f2 }
                int r1 = r1.size()     // Catch:{ all -> 0x00f2 }
                if (r1 <= 0) goto L_0x0037
                r1 = 1
                goto L_0x0038
            L_0x0037:
                r1 = 0
            L_0x0038:
                r4 = 0
                if (r1 == 0) goto L_0x0050
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00f2 }
                r4.<init>()     // Catch:{ all -> 0x00f2 }
                java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x00f2 }
                com.ss.android.ugc.aweme.sp.e r6 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00f2 }
                java.util.WeakHashMap<android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object> r6 = r6.f115480i     // Catch:{ all -> 0x00f2 }
                java.util.Set r6 = r6.keySet()     // Catch:{ all -> 0x00f2 }
                r5.<init>(r6)     // Catch:{ all -> 0x00f2 }
                r6 = r5
                r5 = r4
                goto L_0x0052
            L_0x0050:
                r5 = r4
                r6 = r5
            L_0x0052:
                java.lang.Object r4 = r12.f115490b     // Catch:{ all -> 0x00f2 }
                monitor-enter(r4)     // Catch:{ all -> 0x00f2 }
                boolean r8 = r12.f115492d     // Catch:{ all -> 0x00ef }
                if (r8 == 0) goto L_0x0070
                com.ss.android.ugc.aweme.sp.e r8 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00ef }
                java.util.Map<java.lang.String, java.lang.Object> r8 = r8.f115477f     // Catch:{ all -> 0x00ef }
                boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x00ef }
                if (r8 != 0) goto L_0x006c
                com.ss.android.ugc.aweme.sp.e r8 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00ef }
                java.util.Map<java.lang.String, java.lang.Object> r8 = r8.f115477f     // Catch:{ all -> 0x00ef }
                r8.clear()     // Catch:{ all -> 0x00ef }
                r8 = 1
                goto L_0x006d
            L_0x006c:
                r8 = 0
            L_0x006d:
                r12.f115492d = r2     // Catch:{ all -> 0x00ef }
                r2 = r8
            L_0x0070:
                java.util.Map<java.lang.String, java.lang.Object> r8 = r12.f115491c     // Catch:{ all -> 0x00ef }
                java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00ef }
                java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00ef }
            L_0x007a:
                boolean r9 = r8.hasNext()     // Catch:{ all -> 0x00ef }
                if (r9 == 0) goto L_0x00cf
                java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x00ef }
                java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ all -> 0x00ef }
                java.lang.Object r10 = r9.getKey()     // Catch:{ all -> 0x00ef }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x00ef }
                java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x00ef }
                if (r9 == r12) goto L_0x00b7
                if (r9 != 0) goto L_0x0095
                goto L_0x00b7
            L_0x0095:
                com.ss.android.ugc.aweme.sp.e r11 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00ef }
                java.util.Map<java.lang.String, java.lang.Object> r11 = r11.f115477f     // Catch:{ all -> 0x00ef }
                boolean r11 = r11.containsKey(r10)     // Catch:{ all -> 0x00ef }
                if (r11 == 0) goto L_0x00af
                com.ss.android.ugc.aweme.sp.e r11 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00ef }
                java.util.Map<java.lang.String, java.lang.Object> r11 = r11.f115477f     // Catch:{ all -> 0x00ef }
                java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x00ef }
                if (r11 == 0) goto L_0x00af
                boolean r11 = r11.equals(r9)     // Catch:{ all -> 0x00ef }
                if (r11 != 0) goto L_0x007a
            L_0x00af:
                com.ss.android.ugc.aweme.sp.e r2 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00ef }
                java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f115477f     // Catch:{ all -> 0x00ef }
                r2.put(r10, r9)     // Catch:{ all -> 0x00ef }
                goto L_0x00c8
            L_0x00b7:
                com.ss.android.ugc.aweme.sp.e r9 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00ef }
                java.util.Map<java.lang.String, java.lang.Object> r9 = r9.f115477f     // Catch:{ all -> 0x00ef }
                boolean r9 = r9.containsKey(r10)     // Catch:{ all -> 0x00ef }
                if (r9 == 0) goto L_0x007a
                com.ss.android.ugc.aweme.sp.e r2 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00ef }
                java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f115477f     // Catch:{ all -> 0x00ef }
                r2.remove(r10)     // Catch:{ all -> 0x00ef }
            L_0x00c8:
                if (r1 == 0) goto L_0x00cd
                r5.add(r10)     // Catch:{ all -> 0x00ef }
            L_0x00cd:
                r2 = 1
                goto L_0x007a
            L_0x00cf:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r12.f115491c     // Catch:{ all -> 0x00ef }
                r1.clear()     // Catch:{ all -> 0x00ef }
                if (r2 == 0) goto L_0x00df
                com.ss.android.ugc.aweme.sp.e r1 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00ef }
                long r2 = r1.f115481j     // Catch:{ all -> 0x00ef }
                r8 = 1
                long r2 = r2 + r8
                r1.f115481j = r2     // Catch:{ all -> 0x00ef }
            L_0x00df:
                com.ss.android.ugc.aweme.sp.e r1 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00ef }
                long r8 = r1.f115481j     // Catch:{ all -> 0x00ef }
                monitor-exit(r4)     // Catch:{ all -> 0x00ef }
                monitor-exit(r0)     // Catch:{ all -> 0x00f2 }
                com.ss.android.ugc.aweme.sp.e$b r0 = new com.ss.android.ugc.aweme.sp.e$b
                r1 = 0
                r2 = r0
                r3 = r8
                r8 = r1
                r2.<init>(r3, r5, r6, r7)
                return r0
            L_0x00ef:
                r1 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x00ef }
                throw r1     // Catch:{ all -> 0x00f2 }
            L_0x00f2:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00f2 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p2271sp.C45665e.C45668a.m99430a():com.ss.android.ugc.aweme.sp.e$b");
        }

        public final Editor remove(String str) {
            synchronized (this.f115490b) {
                this.f115491c.put(str, this);
            }
            return this;
        }

        public C45668a() {
        }

        /* renamed from: a */
        public final void mo92090a(final C45672b bVar) {
            if (bVar.f115501c != null && bVar.f115500b != null && bVar.f115500b.size() != 0) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    for (int size = bVar.f115500b.size() - 1; size >= 0; size--) {
                        String str = (String) bVar.f115500b.get(size);
                        for (OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : bVar.f115501c) {
                            if (onSharedPreferenceChangeListener != null) {
                                onSharedPreferenceChangeListener.onSharedPreferenceChanged(C45665e.this, str);
                            }
                        }
                    }
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        C45668a.this.mo92090a(bVar);
                    }
                });
            }
        }

        public final Editor putBoolean(String str, boolean z) {
            synchronized (this.f115490b) {
                this.f115491c.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        public final Editor putFloat(String str, float f) {
            synchronized (this.f115490b) {
                this.f115491c.put(str, Float.valueOf(f));
            }
            return this;
        }

        public final Editor putInt(String str, int i) {
            synchronized (this.f115490b) {
                this.f115491c.put(str, Integer.valueOf(i));
            }
            return this;
        }

        public final Editor putLong(String str, long j) {
            synchronized (this.f115490b) {
                this.f115491c.put(str, Long.valueOf(j));
            }
            return this;
        }

        public final Editor putStringSet(String str, Set<String> set) {
            Object obj;
            synchronized (this.f115490b) {
                Map<String, Object> map = this.f115491c;
                if (set == null) {
                    obj = null;
                } else {
                    obj = new HashSet(set);
                }
                map.put(str, obj);
            }
            return this;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(2:7|(2:9|10))|11|12) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0037 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.SharedPreferences.Editor putString(java.lang.String r5, java.lang.String r6) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f115490b
                monitor-enter(r0)
                java.util.Map<java.lang.String, java.lang.Object> r1 = r4.f115491c     // Catch:{ all -> 0x0039 }
                r1.put(r5, r6)     // Catch:{ all -> 0x0039 }
                if (r6 == 0) goto L_0x0037
                int r1 = r6.length()     // Catch:{ all -> 0x0039 }
                r2 = 500(0x1f4, float:7.0E-43)
                if (r1 <= r2) goto L_0x0037
                com.ss.android.ugc.aweme.sp.e r1 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x0039 }
                java.lang.String r1 = r1.f115473b     // Catch:{ all -> 0x0039 }
                if (r6 == 0) goto L_0x0037
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0037 }
                r2.<init>()     // Catch:{ Exception -> 0x0037 }
                java.lang.String r3 = "sp_value_size"
                int r6 = r6.length()     // Catch:{ Exception -> 0x0037 }
                r2.put(r3, r6)     // Catch:{ Exception -> 0x0037 }
                java.lang.String r6 = "sp_file_name"
                r2.put(r6, r1)     // Catch:{ Exception -> 0x0037 }
                java.lang.String r6 = "sp_key"
                r2.put(r6, r5)     // Catch:{ Exception -> 0x0037 }
                java.lang.String r5 = "sp_put_big_size_value"
                java.lang.String r6 = "sp_put_big_size_value"
                com.p683ss.android.ugc.aweme.base.C23569o.m57783b(r5, r6, r2)     // Catch:{ Exception -> 0x0037 }
            L_0x0037:
                monitor-exit(r0)     // Catch:{ all -> 0x0039 }
                return r4
            L_0x0039:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0039 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p2271sp.C45665e.C45668a.putString(java.lang.String, java.lang.String):android.content.SharedPreferences$Editor");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sp.e$b */
    static class C45672b {

        /* renamed from: a */
        final long f115499a;

        /* renamed from: b */
        final List<String> f115500b;

        /* renamed from: c */
        final Set<OnSharedPreferenceChangeListener> f115501c;

        /* renamed from: d */
        final Map<String, Object> f115502d;

        /* renamed from: e */
        final CountDownLatch f115503e;

        /* renamed from: f */
        volatile boolean f115504f;

        /* renamed from: g */
        boolean f115505g;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo92104a(boolean z, boolean z2) {
            this.f115505g = z;
            this.f115504f = z2;
            this.f115503e.countDown();
        }

        private C45672b(long j, List<String> list, Set<OnSharedPreferenceChangeListener> set, Map<String, Object> map) {
            this.f115503e = new CountDownLatch(1);
            this.f115504f = false;
            this.f115505g = false;
            this.f115499a = j;
            this.f115500b = list;
            this.f115501c = set;
            this.f115502d = map;
        }
    }

    public final Editor edit() {
        synchronized (this.f115475d) {
            m99427b();
        }
        return new C45668a();
    }

    public final Map<String, ?> getAll() {
        HashMap hashMap;
        synchronized (this.f115475d) {
            m99427b();
            hashMap = new HashMap(this.f115477f);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo92075a() {
        if (!this.f115479h) {
            C45660a aVar = (C45660a) C45657a.f115452b.get();
        }
        while (!this.f115479h) {
            try {
                this.f115475d.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: b */
    private void m99427b() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        Boolean valueOf = Boolean.valueOf(this.f115479h);
        mo92075a();
        Context a = C11010c.m22280a();
        if (Looper.myLooper() != Looper.getMainLooper() || C18993n.f52298b || !C22574a.m55738f().f60703d || valueOf == null || !(valueOf instanceof Boolean) || valueOf.booleanValue() || a == null || !C35890a.m81058a(a)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C18993n.f52297a += System.currentTimeMillis() - currentTimeMillis;
        }
    }

    public final void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f115475d) {
            this.f115480i.put(onSharedPreferenceChangeListener, f115471l);
        }
    }

    public final void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f115475d) {
            this.f115480i.remove(onSharedPreferenceChangeListener);
        }
    }

    /* renamed from: a */
    static FileOutputStream m99426a(File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdir()) {
                return null;
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused2) {
                fileOutputStream = null;
            }
        }
        return fileOutputStream;
    }

    public final boolean contains(String str) {
        boolean containsKey;
        synchronized (this.f115475d) {
            m99427b();
            containsKey = this.f115477f.containsKey(str);
        }
        return containsKey;
    }

    public final boolean getBoolean(String str, boolean z) {
        Boolean bool;
        synchronized (this.f115475d) {
            m99427b();
            try {
                bool = (Boolean) this.f115477f.get(str);
            } catch (ClassCastException unused) {
                bool = null;
            }
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        return z;
    }

    public final float getFloat(String str, float f) {
        Float f2;
        synchronized (this.f115475d) {
            m99427b();
            try {
                f2 = (Float) this.f115477f.get(str);
            } catch (ClassCastException unused) {
                f2 = null;
            }
            if (f2 != null) {
                f = f2.floatValue();
            }
        }
        return f;
    }

    public final int getInt(String str, int i) {
        Integer num;
        synchronized (this.f115475d) {
            m99427b();
            try {
                num = (Integer) this.f115477f.get(str);
            } catch (ClassCastException unused) {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            }
        }
        return i;
    }

    public final long getLong(String str, long j) {
        Long l;
        synchronized (this.f115475d) {
            m99427b();
            try {
                l = (Long) this.f115477f.get(str);
            } catch (ClassCastException unused) {
                l = null;
            }
            if (l != null) {
                j = l.longValue();
            }
        }
        return j;
    }

    public final String getString(String str, String str2) {
        String str3;
        synchronized (this.f115475d) {
            m99427b();
            try {
                str3 = (String) this.f115477f.get(str);
            } catch (Exception unused) {
                str3 = null;
            }
            if (str3 == null) {
                str3 = str2;
            }
        }
        return str3;
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        Set<String> set2;
        synchronized (this.f115475d) {
            m99427b();
            try {
                set2 = (Set) this.f115477f.get(str);
            } catch (ClassCastException unused) {
                set2 = null;
            }
            if (set2 == null) {
                set2 = set;
            }
        }
        return set2;
    }

    public C45665e(String str, File file) {
        this.f115472a = file;
        this.f115473b = str;
        File file2 = this.f115472a;
        StringBuilder sb = new StringBuilder();
        sb.append(file2.getPath());
        sb.append(".bak");
        this.f115474c = new File(sb.toString());
        this.f115479h = false;
        this.f115477f = null;
        synchronized (this.f115475d) {
            this.f115479h = false;
        }
        new Thread("SharedPreferencesImpl-load") {
            /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|(0)|29|30) */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
                r4 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
                if (r0.f115472a.canRead() == false) goto L_0x0060;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
                r5 = new java.io.BufferedInputStream(new java.io.FileInputStream(r0.f115472a), 16384);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                r6 = android.util.Xml.newPullParser();
                r6.setInput(r5, null);
                r6 = (java.util.HashMap) com.p683ss.android.ugc.aweme.p2271sp.C45675h.m99433a(r6, new java.lang.String[1]);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
                r5.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
                r6 = th;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
                r6 = th;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
                r5 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
                if (r5 != null) goto L_0x0056;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
                r5.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
                throw r6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
                r5 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x005b, code lost:
                if (r5 != null) goto L_0x005d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
                r5.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
                r0.f115479h = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x0065, code lost:
                if (r4 != null) goto L_0x0067;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:0x0067, code lost:
                r0.f115477f = r4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x006a, code lost:
                r0.f115477f = new java.util.HashMap();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x0071, code lost:
                r0.f115475d.notifyAll();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:49:0x0086, code lost:
                r3 = r0.f115473b;
                r4 = r0.f115472a.length();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
                r0 = new org.json.JSONObject();
                r0.put("sp_init_cost_time", r1);
                r0.put("sp_file_name", r3);
                r0.put("sp_file_size", r4);
                com.p683ss.android.ugc.aweme.base.C23569o.m57783b("sp_init_cost", "sp_init_cost", r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a9, code lost:
                return;
             */
            /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0059 */
            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x0056 A[SYNTHETIC, Splitter:B:27:0x0056] */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x005d A[SYNTHETIC, Splitter:B:35:0x005d] */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x0063 A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x0086  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r8 = this;
                    com.ss.android.ugc.aweme.sp.e r0 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this
                    long r1 = java.lang.System.currentTimeMillis()
                    java.lang.Object r3 = r0.f115475d
                    monitor-enter(r3)
                    boolean r4 = r0.f115479h     // Catch:{ all -> 0x00ae }
                    if (r4 == 0) goto L_0x000f
                    monitor-exit(r3)     // Catch:{ all -> 0x00ae }
                    return
                L_0x000f:
                    java.io.File r4 = r0.f115474c     // Catch:{ all -> 0x00ae }
                    boolean r4 = r4.exists()     // Catch:{ all -> 0x00ae }
                    if (r4 == 0) goto L_0x0023
                    java.io.File r4 = r0.f115472a     // Catch:{ all -> 0x00ae }
                    r4.delete()     // Catch:{ all -> 0x00ae }
                    java.io.File r4 = r0.f115474c     // Catch:{ all -> 0x00ae }
                    java.io.File r5 = r0.f115472a     // Catch:{ all -> 0x00ae }
                    r4.renameTo(r5)     // Catch:{ all -> 0x00ae }
                L_0x0023:
                    monitor-exit(r3)     // Catch:{ all -> 0x00ae }
                    r3 = 1
                    r4 = 0
                    java.io.File r5 = r0.f115472a     // Catch:{  }
                    boolean r5 = r5.canRead()     // Catch:{  }
                    if (r5 == 0) goto L_0x0060
                    java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x005a, all -> 0x0052 }
                    java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x005a, all -> 0x0052 }
                    java.io.File r7 = r0.f115472a     // Catch:{ Exception -> 0x005a, all -> 0x0052 }
                    r6.<init>(r7)     // Catch:{ Exception -> 0x005a, all -> 0x0052 }
                    r7 = 16384(0x4000, float:2.2959E-41)
                    r5.<init>(r6, r7)     // Catch:{ Exception -> 0x005a, all -> 0x0052 }
                    org.xmlpull.v1.XmlPullParser r6 = android.util.Xml.newPullParser()     // Catch:{ Exception -> 0x005b, all -> 0x0050 }
                    r6.setInput(r5, r4)     // Catch:{ Exception -> 0x005b, all -> 0x0050 }
                    java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ Exception -> 0x005b, all -> 0x0050 }
                    java.lang.Object r6 = com.p683ss.android.ugc.aweme.p2271sp.C45675h.m99433a(r6, r7)     // Catch:{ Exception -> 0x005b, all -> 0x0050 }
                    java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{ Exception -> 0x005b, all -> 0x0050 }
                    r5.close()     // Catch:{ IOException | Exception -> 0x004e }
                L_0x004e:
                    r4 = r6
                    goto L_0x0060
                L_0x0050:
                    r6 = move-exception
                    goto L_0x0054
                L_0x0052:
                    r6 = move-exception
                    r5 = r4
                L_0x0054:
                    if (r5 == 0) goto L_0x0059
                    r5.close()     // Catch:{ IOException -> 0x0059 }
                L_0x0059:
                    throw r6     // Catch:{  }
                L_0x005a:
                    r5 = r4
                L_0x005b:
                    if (r5 == 0) goto L_0x0060
                    r5.close()     // Catch:{ Exception -> 0x0060 }
                L_0x0060:
                    java.lang.Object r5 = r0.f115475d
                    monitor-enter(r5)
                    r0.f115479h = r3     // Catch:{ all -> 0x00ab }
                    if (r4 == 0) goto L_0x006a
                    r0.f115477f = r4     // Catch:{ all -> 0x00ab }
                    goto L_0x0071
                L_0x006a:
                    java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x00ab }
                    r3.<init>()     // Catch:{ all -> 0x00ab }
                    r0.f115477f = r3     // Catch:{ all -> 0x00ab }
                L_0x0071:
                    java.lang.Object r3 = r0.f115475d     // Catch:{ all -> 0x00ab }
                    r3.notifyAll()     // Catch:{ all -> 0x00ab }
                    monitor-exit(r5)     // Catch:{ all -> 0x00ab }
                    long r3 = java.lang.System.currentTimeMillis()
                    long r3 = r3 - r1
                    long r1 = java.lang.Math.abs(r3)
                    r3 = 400(0x190, double:1.976E-321)
                    int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r5 < 0) goto L_0x00aa
                    java.lang.String r3 = r0.f115473b
                    java.io.File r0 = r0.f115472a
                    long r4 = r0.length()
                    org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x00aa }
                    r0.<init>()     // Catch:{ Exception -> 0x00aa }
                    java.lang.String r6 = "sp_init_cost_time"
                    r0.put(r6, r1)     // Catch:{ Exception -> 0x00aa }
                    java.lang.String r1 = "sp_file_name"
                    r0.put(r1, r3)     // Catch:{ Exception -> 0x00aa }
                    java.lang.String r1 = "sp_file_size"
                    r0.put(r1, r4)     // Catch:{ Exception -> 0x00aa }
                    java.lang.String r1 = "sp_init_cost"
                    java.lang.String r2 = "sp_init_cost"
                    com.p683ss.android.ugc.aweme.base.C23569o.m57783b(r1, r2, r0)     // Catch:{ Exception -> 0x00aa }
                    return
                L_0x00aa:
                    return
                L_0x00ab:
                    r0 = move-exception
                    monitor-exit(r5)     // Catch:{ all -> 0x00ab }
                    throw r0
                L_0x00ae:
                    r0 = move-exception
                    monitor-exit(r3)     // Catch:{ all -> 0x00ae }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p2271sp.C45665e.C456661.run():void");
            }
        }.start();
    }

    /* renamed from: a */
    public final void mo92076a(C45672b bVar, Runnable runnable, C45668a aVar, List<String> list, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (runnable == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        final C45672b bVar2 = bVar;
        final boolean z4 = z2;
        final Runnable runnable2 = runnable;
        final List<String> list2 = list;
        C456672 r0 = new Runnable() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0093 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a3 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r13 = this;
                    long r0 = java.lang.System.currentTimeMillis()
                    com.ss.android.ugc.aweme.sp.e r2 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this
                    java.lang.Object r2 = r2.f115476e
                    monitor-enter(r2)
                    com.ss.android.ugc.aweme.sp.e r3 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00f6 }
                    com.ss.android.ugc.aweme.sp.e$b r4 = r2     // Catch:{ all -> 0x00f6 }
                    boolean r5 = r3     // Catch:{ all -> 0x00f6 }
                    java.io.File r6 = r3.f115472a     // Catch:{ all -> 0x00f6 }
                    boolean r6 = r6.exists()     // Catch:{ all -> 0x00f6 }
                    r7 = 1
                    r8 = 0
                    if (r6 == 0) goto L_0x005b
                    long r9 = r3.f115482k     // Catch:{ all -> 0x00f6 }
                    long r11 = r4.f115499a     // Catch:{ all -> 0x00f6 }
                    int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r6 >= 0) goto L_0x0038
                    if (r5 == 0) goto L_0x0025
                    r6 = 1
                    goto L_0x0039
                L_0x0025:
                    java.lang.Object r5 = r3.f115475d     // Catch:{ all -> 0x00f6 }
                    monitor-enter(r5)     // Catch:{ all -> 0x00f6 }
                    long r9 = r3.f115481j     // Catch:{ all -> 0x0035 }
                    long r11 = r4.f115499a     // Catch:{ all -> 0x0035 }
                    int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r6 != 0) goto L_0x0032
                    r6 = 1
                    goto L_0x0033
                L_0x0032:
                    r6 = 0
                L_0x0033:
                    monitor-exit(r5)     // Catch:{ all -> 0x0035 }
                    goto L_0x0039
                L_0x0035:
                    r0 = move-exception
                    monitor-exit(r5)     // Catch:{ all -> 0x0035 }
                    throw r0     // Catch:{ all -> 0x00f6 }
                L_0x0038:
                    r6 = 0
                L_0x0039:
                    if (r6 != 0) goto L_0x0040
                    r4.mo92104a(r8, r7)     // Catch:{ all -> 0x00f6 }
                    goto L_0x00b1
                L_0x0040:
                    java.io.File r5 = r3.f115474c     // Catch:{ all -> 0x00f6 }
                    boolean r5 = r5.exists()     // Catch:{ all -> 0x00f6 }
                    if (r5 != 0) goto L_0x0056
                    java.io.File r5 = r3.f115472a     // Catch:{ all -> 0x00f6 }
                    java.io.File r6 = r3.f115474c     // Catch:{ all -> 0x00f6 }
                    boolean r5 = r5.renameTo(r6)     // Catch:{ all -> 0x00f6 }
                    if (r5 != 0) goto L_0x005b
                    r4.mo92104a(r8, r8)     // Catch:{ all -> 0x00f6 }
                    goto L_0x00b1
                L_0x0056:
                    java.io.File r5 = r3.f115472a     // Catch:{ all -> 0x00f6 }
                    r5.delete()     // Catch:{ all -> 0x00f6 }
                L_0x005b:
                    java.io.File r5 = r3.f115472a     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    java.io.FileOutputStream r5 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.m99426a(r5)     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    if (r5 != 0) goto L_0x0067
                    r4.mo92104a(r8, r8)     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    goto L_0x00b1
                L_0x0067:
                    java.util.Map<java.lang.String, java.lang.Object> r6 = r4.f115502d     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    com.ss.android.ugc.aweme.sp.c r9 = new com.ss.android.ugc.aweme.sp.c     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    r9.<init>()     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    java.lang.String r10 = "utf-8"
                    r9.setOutput(r5, r10)     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    r11 = 0
                    r9.startDocument(r11, r10)     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    java.lang.String r10 = "http://xmlpull.org/v1/doc/features.html#indent-output"
                    r9.setFeature(r10, r7)     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    com.p683ss.android.ugc.aweme.p2271sp.C45675h.m99437a(r6, r11, r9)     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    r9.endDocument()     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    boolean r6 = com.p683ss.android.ugc.aweme.p2271sp.C45663d.m99425b()     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    if (r6 != 0) goto L_0x0093
                    java.io.FileDescriptor r6 = r5.getFD()     // Catch:{ Exception -> 0x0093 }
                    r6.sync()     // Catch:{ Exception -> 0x0093 }
                L_0x0093:
                    r5.close()     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    java.io.File r5 = r3.f115474c     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    r5.delete()     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    long r5 = r4.f115499a     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    r3.f115482k = r5     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    r4.mo92104a(r7, r7)     // Catch:{ IOException -> 0x00a9, XmlPullParserException -> 0x00a3 }
                    goto L_0x00b1
                L_0x00a3:
                    java.io.File r3 = r3.f115472a     // Catch:{ all -> 0x00f6 }
                    r3.delete()     // Catch:{ all -> 0x00f6 }
                    goto L_0x00ae
                L_0x00a9:
                    java.io.File r3 = r3.f115472a     // Catch:{ all -> 0x00f6 }
                    r3.delete()     // Catch:{ all -> 0x00f6 }
                L_0x00ae:
                    r4.mo92104a(r8, r8)     // Catch:{ all -> 0x00f6 }
                L_0x00b1:
                    monitor-exit(r2)     // Catch:{ all -> 0x00f6 }
                    com.ss.android.ugc.aweme.sp.e r2 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this
                    java.lang.Object r3 = r2.f115475d
                    monitor-enter(r3)
                    com.ss.android.ugc.aweme.sp.e r2 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this     // Catch:{ all -> 0x00f3 }
                    int r4 = r2.f115478g     // Catch:{ all -> 0x00f3 }
                    int r4 = r4 - r7
                    r2.f115478g = r4     // Catch:{ all -> 0x00f3 }
                    monitor-exit(r3)     // Catch:{ all -> 0x00f3 }
                    java.lang.Runnable r2 = r4
                    if (r2 == 0) goto L_0x00c8
                    java.lang.Runnable r2 = r4
                    r2.run()
                L_0x00c8:
                    long r2 = java.lang.System.currentTimeMillis()
                    long r2 = r2 - r0
                    r0 = 100
                    int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                    if (r4 <= 0) goto L_0x00f2
                    com.ss.android.ugc.aweme.sp.e r0 = com.p683ss.android.ugc.aweme.p2271sp.C45665e.this
                    java.lang.String r0 = r0.f115473b
                    java.util.List r1 = r5
                    if (r1 == 0) goto L_0x00f2
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00f2 }
                    r1.<init>()     // Catch:{ Exception -> 0x00f2 }
                    java.lang.String r4 = "sp_apply_cost_time"
                    r1.put(r4, r2)     // Catch:{ Exception -> 0x00f2 }
                    java.lang.String r2 = "sp_file_name"
                    r1.put(r2, r0)     // Catch:{ Exception -> 0x00f2 }
                    java.lang.String r0 = "sp_apply_cost"
                    java.lang.String r2 = "sp_apply_cost"
                    com.p683ss.android.ugc.aweme.base.C23569o.m57783b(r0, r2, r1)     // Catch:{ Exception -> 0x00f2 }
                    return
                L_0x00f2:
                    return
                L_0x00f3:
                    r0 = move-exception
                    monitor-exit(r3)     // Catch:{ all -> 0x00f3 }
                    throw r0
                L_0x00f6:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch:{ all -> 0x00f6 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p2271sp.C45665e.C456672.run():void");
            }
        };
        if (z2) {
            synchronized (this.f115475d) {
                if (this.f115478g == 1) {
                    z3 = true;
                }
            }
            if (z3) {
                r0.run();
                return;
            }
        }
        boolean z5 = !z2;
        Handler a = C45663d.m99424a();
        synchronized (C45663d.f115462a) {
            C45663d.f115465d.add(r0);
            if (!z5 || !C45663d.f115466e) {
                a.sendEmptyMessage(1);
            } else {
                a.sendEmptyMessageDelayed(1, 100);
            }
        }
    }
}
