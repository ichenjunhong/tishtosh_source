package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.eo */
public class C16660eo {

    /* renamed from: a */
    public static final Uri f46878a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Pattern f46879b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: c */
    public static final Pattern f46880c = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: d */
    static final AtomicBoolean f46881d = new AtomicBoolean();

    /* renamed from: e */
    private static final Uri f46882e = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: f */
    private static HashMap<String, String> f46883f;

    /* renamed from: g */
    private static final HashMap<String, Boolean> f46884g = new HashMap<>();

    /* renamed from: h */
    private static final HashMap<String, Integer> f46885h = new HashMap<>();

    /* renamed from: i */
    private static final HashMap<String, Long> f46886i = new HashMap<>();

    /* renamed from: j */
    private static final HashMap<String, Float> f46887j = new HashMap<>();

    /* renamed from: k */
    private static Object f46888k;

    /* renamed from: l */
    private static boolean f46889l;

    /* renamed from: m */
    private static String[] f46890m = new String[0];

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        r10 = r10.query(f46878a, null, null, new java.lang.String[]{r11}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bd, code lost:
        if (r10 != null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bf, code lost:
        if (r10 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c1, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        if (r10.moveToFirst() != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cb, code lost:
        m39808a(r0, r11, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r12 = r10.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d8, code lost:
        if (r12 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
        if (r12.equals(null) == false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e0, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e1, code lost:
        m39808a(r0, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e4, code lost:
        if (r12 == null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e7, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e8, code lost:
        if (r10 == null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ea, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ed, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ee, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ef, code lost:
        if (r10 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f1, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f4, code lost:
        throw r11;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m39806a(android.content.ContentResolver r10, java.lang.String r11, java.lang.String r12) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.eo> r12 = com.google.android.gms.internal.measurement.C16660eo.class
            monitor-enter(r12)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f46883f     // Catch:{ all -> 0x00f5 }
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x002a
            java.util.concurrent.atomic.AtomicBoolean r0 = f46881d     // Catch:{ all -> 0x00f5 }
            r0.set(r2)     // Catch:{ all -> 0x00f5 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            f46883f = r0     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            f46888k = r0     // Catch:{ all -> 0x00f5 }
            f46889l = r2     // Catch:{ all -> 0x00f5 }
            android.net.Uri r0 = f46878a     // Catch:{ all -> 0x00f5 }
            com.google.android.gms.internal.measurement.ep r4 = new com.google.android.gms.internal.measurement.ep     // Catch:{ all -> 0x00f5 }
            r4.<init>(r3)     // Catch:{ all -> 0x00f5 }
            r10.registerContentObserver(r0, r1, r4)     // Catch:{ all -> 0x00f5 }
            goto L_0x0054
        L_0x002a:
            java.util.concurrent.atomic.AtomicBoolean r0 = f46881d     // Catch:{ all -> 0x00f5 }
            boolean r0 = r0.getAndSet(r2)     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x0054
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f46883f     // Catch:{ all -> 0x00f5 }
            r0.clear()     // Catch:{ all -> 0x00f5 }
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = f46884g     // Catch:{ all -> 0x00f5 }
            r0.clear()     // Catch:{ all -> 0x00f5 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = f46885h     // Catch:{ all -> 0x00f5 }
            r0.clear()     // Catch:{ all -> 0x00f5 }
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = f46886i     // Catch:{ all -> 0x00f5 }
            r0.clear()     // Catch:{ all -> 0x00f5 }
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = f46887j     // Catch:{ all -> 0x00f5 }
            r0.clear()     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            f46888k = r0     // Catch:{ all -> 0x00f5 }
            f46889l = r2     // Catch:{ all -> 0x00f5 }
        L_0x0054:
            java.lang.Object r0 = f46888k     // Catch:{ all -> 0x00f5 }
            java.util.HashMap<java.lang.String, java.lang.String> r4 = f46883f     // Catch:{ all -> 0x00f5 }
            boolean r4 = r4.containsKey(r11)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x006c
            java.util.HashMap<java.lang.String, java.lang.String> r10 = f46883f     // Catch:{ all -> 0x00f5 }
            java.lang.Object r10 = r10.get(r11)     // Catch:{ all -> 0x00f5 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x00f5 }
            if (r10 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r10 = r3
        L_0x006a:
            monitor-exit(r12)     // Catch:{ all -> 0x00f5 }
            return r10
        L_0x006c:
            java.lang.String[] r4 = f46890m     // Catch:{ all -> 0x00f5 }
            int r5 = r4.length     // Catch:{ all -> 0x00f5 }
            r6 = 0
        L_0x0070:
            if (r6 >= r5) goto L_0x00ae
            r7 = r4[r6]     // Catch:{ all -> 0x00f5 }
            boolean r7 = r11.startsWith(r7)     // Catch:{ all -> 0x00f5 }
            if (r7 == 0) goto L_0x00ab
            boolean r0 = f46889l     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x0086
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f46883f     // Catch:{ all -> 0x00f5 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x00a9
        L_0x0086:
            java.lang.String[] r0 = f46890m     // Catch:{ all -> 0x00f5 }
            java.util.HashMap<java.lang.String, java.lang.String> r2 = f46883f     // Catch:{ all -> 0x00f5 }
            java.util.Map r10 = m39807a(r10, r0)     // Catch:{ all -> 0x00f5 }
            r2.putAll(r10)     // Catch:{ all -> 0x00f5 }
            f46889l = r1     // Catch:{ all -> 0x00f5 }
            java.util.HashMap<java.lang.String, java.lang.String> r10 = f46883f     // Catch:{ all -> 0x00f5 }
            boolean r10 = r10.containsKey(r11)     // Catch:{ all -> 0x00f5 }
            if (r10 == 0) goto L_0x00a9
            java.util.HashMap<java.lang.String, java.lang.String> r10 = f46883f     // Catch:{ all -> 0x00f5 }
            java.lang.Object r10 = r10.get(r11)     // Catch:{ all -> 0x00f5 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x00f5 }
            if (r10 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r10 = r3
        L_0x00a7:
            monitor-exit(r12)     // Catch:{ all -> 0x00f5 }
            return r10
        L_0x00a9:
            monitor-exit(r12)     // Catch:{ all -> 0x00f5 }
            return r3
        L_0x00ab:
            int r6 = r6 + 1
            goto L_0x0070
        L_0x00ae:
            monitor-exit(r12)     // Catch:{ all -> 0x00f5 }
            android.net.Uri r5 = f46878a
            r6 = 0
            r7 = 0
            java.lang.String[] r8 = new java.lang.String[r1]
            r8[r2] = r11
            r9 = 0
            r4 = r10
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)
            if (r10 != 0) goto L_0x00c5
            if (r10 == 0) goto L_0x00c4
            r10.close()
        L_0x00c4:
            return r3
        L_0x00c5:
            boolean r12 = r10.moveToFirst()     // Catch:{ all -> 0x00ee }
            if (r12 != 0) goto L_0x00d4
            m39808a(r0, r11, r3)     // Catch:{ all -> 0x00ee }
            if (r10 == 0) goto L_0x00d3
            r10.close()
        L_0x00d3:
            return r3
        L_0x00d4:
            java.lang.String r12 = r10.getString(r1)     // Catch:{ all -> 0x00ee }
            if (r12 == 0) goto L_0x00e1
            boolean r1 = r12.equals(r3)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00e1
            r12 = r3
        L_0x00e1:
            m39808a(r0, r11, r12)     // Catch:{ all -> 0x00ee }
            if (r12 == 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r12 = r3
        L_0x00e8:
            if (r10 == 0) goto L_0x00ed
            r10.close()
        L_0x00ed:
            return r12
        L_0x00ee:
            r11 = move-exception
            if (r10 == 0) goto L_0x00f4
            r10.close()
        L_0x00f4:
            throw r11
        L_0x00f5:
            r10 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00f5 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16660eo.m39806a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static void m39808a(Object obj, String str, String str2) {
        synchronized (C16660eo.class) {
            if (obj == f46888k) {
                f46883f.put(str, str2);
            }
        }
    }

    /* renamed from: a */
    private static Map<String, String> m39807a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f46882e, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }
}
