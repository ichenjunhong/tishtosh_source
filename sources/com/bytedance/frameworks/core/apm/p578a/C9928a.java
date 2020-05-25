package com.bytedance.frameworks.core.apm.p578a;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.frameworks.core.apm.C9941c;
import com.bytedance.frameworks.core.apm.C9944d;
import com.bytedance.frameworks.core.apm.MonitorContentProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.frameworks.core.apm.a.a */
public abstract class C9928a<T> implements C9944d {

    /* renamed from: a */
    private final Context f27004a = C8976c.m17736a();

    /* renamed from: b */
    private final String f27005b;

    /* renamed from: c */
    private Uri f27006c;

    /* renamed from: d */
    private String f27007d;

    /* renamed from: e */
    private final HashMap<String, Integer> f27008e = new HashMap<>();

    /* renamed from: com.bytedance.frameworks.core.apm.a.a$a */
    public interface C9930a<T> {
        /* renamed from: a */
        T mo17886a(C9931b bVar);
    }

    /* renamed from: com.bytedance.frameworks.core.apm.a.a$b */
    public static class C9931b {

        /* renamed from: a */
        Cursor f27009a;

        /* renamed from: b */
        private final HashMap<String, Integer> f27010b;

        /* renamed from: a */
        public final long mo17887a(String str) {
            try {
                return this.f27009a.getLong(m19933d(str));
            } catch (Throwable unused) {
                return -1;
            }
        }

        /* renamed from: b */
        public final int mo17888b(String str) {
            try {
                return this.f27009a.getInt(m19933d(str));
            } catch (Throwable unused) {
                return -1;
            }
        }

        /* renamed from: c */
        public final String mo17889c(String str) {
            try {
                return this.f27009a.getString(m19933d(str));
            } catch (Throwable unused) {
                return "";
            }
        }

        /* renamed from: d */
        private int m19933d(String str) {
            Integer num = (Integer) this.f27010b.get(str);
            if (num == null) {
                try {
                    num = Integer.valueOf(this.f27009a.getColumnIndex(str));
                } catch (Throwable unused) {
                    num = Integer.valueOf(-1);
                }
                this.f27010b.put(str, num);
            }
            return num.intValue();
        }

        private C9931b(Cursor cursor, HashMap<String, Integer> hashMap) {
            this.f27009a = cursor;
            this.f27010b = hashMap;
        }
    }

    /* renamed from: f */
    private static String mo17897f() {
        return "apm_monitor_t1.db";
    }

    /* renamed from: a */
    public abstract ContentValues mo17876a(T t);

    /* renamed from: c */
    public boolean mo17883c() {
        return true;
    }

    /* renamed from: d */
    public abstract String mo17884d();

    /* renamed from: e */
    public abstract String[] mo17885e();

    /* renamed from: a */
    public final String mo17877a() {
        return mo17884d();
    }

    /* renamed from: b */
    public final long mo17881b() {
        return mo17882b(null, null);
    }

    /* renamed from: h */
    private String m19918h() {
        if (this.f27007d == null) {
            StringBuilder sb = new StringBuilder("SELECT count(*) FROM ");
            sb.append(mo17884d());
            this.f27007d = sb.toString();
        }
        return this.f27007d;
    }

    /* renamed from: g */
    private Uri m19917g() {
        if (this.f27006c == null) {
            StringBuilder sb = new StringBuilder("content://");
            sb.append(this.f27005b);
            sb.append("/");
            sb.append(mo17897f());
            sb.append("/");
            sb.append(mo17884d());
            this.f27006c = Uri.parse(sb.toString());
        }
        return this.f27006c;
    }

    protected C9928a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27004a.getPackageName());
        sb.append(".apm");
        this.f27005b = sb.toString();
        if (mo17883c()) {
            String absolutePath = C8976c.m17736a().getDatabasePath(mo17897f()).getAbsolutePath();
            if (absolutePath != null) {
                HashSet hashSet = (HashSet) C9941c.f27025a.get(absolutePath);
                if (hashSet == null) {
                    synchronized (C9941c.f27025a) {
                        hashSet = (HashSet) C9941c.f27025a.get(absolutePath);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            C9941c.f27025a.put(absolutePath, hashSet);
                        }
                    }
                }
                hashSet.add(this);
            }
        }
    }

    /* renamed from: a */
    private static void m19915a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        return 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized <I extends T> long mo17875a(android.content.ContentValues r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = -1
            if (r5 != 0) goto L_0x0007
            monitor-exit(r4)
            return r0
        L_0x0007:
            android.content.Context r2 = com.bytedance.apm.C8976c.m17736a()     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            android.net.Uri r3 = r4.m19917g()     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            android.net.Uri r5 = r2.insert(r3, r5)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            if (r5 != 0) goto L_0x001b
            monitor-exit(r4)
            return r0
        L_0x001b:
            java.lang.String r5 = r5.getLastPathSegment()     // Catch:{ Exception -> 0x0025, all -> 0x0029 }
            long r0 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x0025, all -> 0x0029 }
            monitor-exit(r4)
            return r0
        L_0x0025:
            r0 = 1
            monitor-exit(r4)
            return r0
        L_0x0029:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x002c:
            monitor-exit(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.apm.p578a.C9928a.mo17875a(android.content.ContentValues):long");
    }

    /* renamed from: a */
    public final void mo17879a(long j) {
        mo17874a("timestamp <=?", new String[]{String.valueOf(j)});
    }

    /* renamed from: a */
    public final synchronized void mo17880a(List<ContentValues> list) {
        int i;
        if (!C9190h.m18253a(list)) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2 = i) {
                ArrayList arrayList = new ArrayList(8);
                i = i2;
                for (int i3 = 0; i3 < 50 && i < size; i3++) {
                    Builder newInsert = ContentProviderOperation.newInsert(m19917g());
                    newInsert.withValues((ContentValues) list.get(i));
                    arrayList.add(newInsert.build());
                    i++;
                }
                try {
                    ContentProviderResult[] applyBatch = C8976c.m17736a().getContentResolver().applyBatch(this.f27005b, arrayList);
                    if (C8976c.m17751g()) {
                        for (ContentProviderResult contentProviderResult : applyBatch) {
                            String[] strArr = {"insertBatch ret: ", contentProviderResult.uri.toString()};
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo17874a(String str, String[] strArr) {
        try {
            return this.f27004a.getContentResolver().delete(m19917g(), str, strArr);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public final long mo17882b(String str, String[] strArr) {
        Cursor cursor;
        String str2;
        Cursor cursor2 = null;
        long j = -1;
        try {
            Context a = C8976c.m17736a();
            Uri g = m19917g();
            if (str == null) {
                str2 = m19918h();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(m19918h());
                sb.append(" where ");
                sb.append(str);
                str2 = sb.toString();
            }
            cursor = MonitorContentProvider.m19907a(a, g, str2, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToNext()) {
                        j = cursor.getLong(0);
                    }
                } catch (Exception unused) {
                    m19915a(cursor);
                    return -1;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    cursor2 = cursor;
                    th = th2;
                    m19915a(cursor2);
                    throw th;
                }
            }
            m19915a(cursor);
            return j;
        } catch (Exception unused2) {
            cursor = null;
            m19915a(cursor);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            m19915a(cursor2);
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo17873a(ContentValues contentValues, String str, String[] strArr) {
        if (contentValues == null) {
            return -1;
        }
        try {
            return C8976c.m17736a().getContentResolver().update(m19917g(), contentValues, str, strArr);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final List<T> mo17878a(String str, String[] strArr, String str2, C9930a<T> aVar) {
        Cursor cursor;
        try {
            cursor = this.f27004a.getContentResolver().query(m19917g(), mo17885e(), str, strArr, str2);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        int i = Integer.MAX_VALUE;
                        if (!TextUtils.isEmpty(str2)) {
                            int indexOf = str2.indexOf("LIMIT");
                            if (indexOf > 0) {
                                int indexOf2 = str2.indexOf("OFF");
                                i = indexOf2 > 0 ? Integer.valueOf(str2.substring(indexOf + 5, indexOf2).trim()).intValue() : Integer.valueOf(str2.substring(indexOf + 5).trim()).intValue();
                            }
                        }
                        LinkedList linkedList = new LinkedList();
                        int i2 = 0;
                        while (cursor.moveToNext() && i2 < i) {
                            linkedList.add(aVar.mo17886a(new C9931b(cursor, this.f27008e)));
                            i2++;
                        }
                        m19915a(cursor);
                        return linkedList;
                    }
                } catch (Throwable th) {
                    th = th;
                    m19915a(cursor);
                    throw th;
                }
            }
            List<T> emptyList = Collections.emptyList();
            m19915a(cursor);
            return emptyList;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            m19915a(cursor);
            throw th;
        }
    }
}
