package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.support.p030v4.p038f.C0777a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.er */
public final class C16663er implements C16667ev {

    /* renamed from: a */
    public static final Map<Uri, C16663er> f46893a = new C0777a();

    /* renamed from: g */
    private static final String[] f46894g = {"key", "value"};

    /* renamed from: b */
    final Object f46895b = new Object();

    /* renamed from: c */
    volatile Map<String, String> f46896c;

    /* renamed from: d */
    final List<Object> f46897d = new ArrayList();

    /* renamed from: e */
    private final ContentResolver f46898e;

    /* renamed from: f */
    private final Uri f46899f;

    private C16663er(ContentResolver contentResolver, Uri uri) {
        this.f46898e = contentResolver;
        this.f46899f = uri;
        this.f46898e.registerContentObserver(uri, false, new C16665et(this, null));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C16663er m39812a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.er> r0 = com.google.android.gms.internal.measurement.C16663er.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.er> r1 = f46893a     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.er r1 = (com.google.android.gms.internal.measurement.C16663er) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.internal.measurement.er r2 = new com.google.android.gms.internal.measurement.er     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.er> r3 = f46893a     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16663er.m39812a(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.measurement.er");
    }

    /* renamed from: a */
    public final Map<String, String> mo31977a() {
        Map<String, String> map = this.f46896c;
        if (map == null) {
            synchronized (this.f46895b) {
                map = this.f46896c;
                if (map == null) {
                    map = m39813c();
                    this.f46896c = map;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    /* renamed from: c */
    private final Map<String, String> m39813c() {
        try {
            return (Map) C16668ew.m39824a(new C16664es(this));
        } catch (SQLiteException | SecurityException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo31976a(String str) {
        return (String) mo31977a().get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Map mo31978b() {
        Map map;
        Cursor query = this.f46898e.query(this.f46899f, f46894g, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new C0777a(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }
}
