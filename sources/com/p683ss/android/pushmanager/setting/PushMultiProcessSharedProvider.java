package com.p683ss.android.pushmanager.setting;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MatrixCursor.RowBuilder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.p519b.C9347a;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.message.p1191b.C19470k;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider */
public class PushMultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a */
    public static String f54241a;

    /* renamed from: b */
    public static Uri f54242b;

    /* renamed from: c */
    private static UriMatcher f54243c;

    /* renamed from: h */
    private static C19708b f54244h;

    /* renamed from: d */
    private SharedPreferences f54245d;

    /* renamed from: e */
    private Map<String, Object> f54246e = new ConcurrentHashMap();

    /* renamed from: f */
    private volatile boolean f54247f = false;

    /* renamed from: g */
    private final Object f54248g = new Object();

    /* renamed from: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$a */
    public static class C19707a {

        /* renamed from: a */
        Context f54252a;

        /* renamed from: b */
        ContentValues f54253b;

        /* renamed from: b */
        public final synchronized void mo41077b() {
            mo41076a();
        }

        /* renamed from: a */
        public final synchronized void mo41076a() {
            try {
                this.f54252a.getContentResolver().insert(PushMultiProcessSharedProvider.m48145a(this.f54252a, "key", "type"), this.f54253b);
            } catch (Throwable unused) {
            }
        }

        private C19707a(Context context) {
            this.f54253b = new ContentValues();
            this.f54252a = context.getApplicationContext();
        }

        /* renamed from: a */
        public final C19707a mo41074a(String str, String str2) {
            this.f54253b.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C19707a mo41072a(String str, int i) {
            this.f54253b.put(str, Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public final C19707a mo41073a(String str, long j) {
            this.f54253b.put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: a */
        public final C19707a mo41075a(String str, boolean z) {
            this.f54253b.put(str, Boolean.valueOf(z));
            return this;
        }
    }

    /* renamed from: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b */
    public static class C19708b {

        /* renamed from: a */
        private Context f54254a;

        /* renamed from: b */
        private boolean f54255b;

        /* renamed from: c */
        private SharedPreferences f54256c;

        /* renamed from: c */
        private static boolean m48160c() {
            C9347a.m18519a();
            if (!C9347a.m18520b()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final C19707a mo41080a() {
            return new C19707a(this.f54254a);
        }

        /* renamed from: b */
        public final boolean mo41083b() {
            if (this.f54255b) {
                return m48160c();
            }
            return mo41082a("current_app_foreground", false);
        }

        private C19708b(Context context) {
            this.f54255b = C19470k.m47658c(context);
            this.f54254a = context.getApplicationContext();
            this.f54256c = C35807d.m80935a(this.f54254a.getApplicationContext(), "push_multi_process_config", 4);
        }

        /* renamed from: a */
        public final int mo41078a(String str, int i) {
            try {
                if (this.f54255b) {
                    return this.f54256c.getInt(str, i);
                }
                return PushMultiProcessSharedProvider.m48142a(this.f54254a.getContentResolver().query(PushMultiProcessSharedProvider.m48145a(this.f54254a, str, "integer"), null, null, null, null), i);
            } catch (Throwable unused) {
                return i;
            }
        }

        /* renamed from: a */
        public final long mo41079a(String str, long j) {
            try {
                if (this.f54255b) {
                    return this.f54256c.getLong(str, j);
                }
                return PushMultiProcessSharedProvider.m48143a(this.f54254a.getContentResolver().query(PushMultiProcessSharedProvider.m48145a(this.f54254a, str, "long"), null, null, null, null), j);
            } catch (Throwable unused) {
                return j;
            }
        }

        /* renamed from: a */
        public final String mo41081a(String str, String str2) {
            try {
                if (this.f54255b) {
                    return this.f54256c.getString(str, str2);
                }
                return PushMultiProcessSharedProvider.m48149a(this.f54254a.getContentResolver().query(PushMultiProcessSharedProvider.m48145a(this.f54254a, str, "string"), null, null, null, null), str2);
            } catch (Throwable unused) {
                return str2;
            }
        }

        /* renamed from: a */
        public final boolean mo41082a(String str, boolean z) {
            try {
                if (this.f54255b) {
                    return this.f54256c.getBoolean(str, z);
                }
                return PushMultiProcessSharedProvider.m48150a(this.f54254a.getContentResolver().query(PushMultiProcessSharedProvider.m48145a(this.f54254a, str, "boolean"), null, null, null, null), z);
            } catch (Throwable unused) {
                return z;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != null) goto L_0x0015;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.database.Cursor, code=boolean, for r2v0, types: [android.database.Cursor] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m48150a(boolean r2, boolean r3) {
        /*
            if (r2 != 0) goto L_0x0003
            return r3
        L_0x0003:
            boolean r0 = r2.moveToFirst()     // Catch:{ Throwable -> 0x0020, all -> 0x0019 }
            if (r0 == 0) goto L_0x0013
            r0 = 0
            int r1 = r2.getInt(r0)     // Catch:{ Throwable -> 0x0020, all -> 0x0019 }
            if (r1 <= 0) goto L_0x0012
            r3 = 1
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            if (r2 == 0) goto L_0x0023
        L_0x0015:
            r2.close()     // Catch:{ Exception -> 0x0023 }
            goto L_0x0023
        L_0x0019:
            r3 = move-exception
            if (r2 == 0) goto L_0x001f
            r2.close()     // Catch:{ Exception -> 0x001f }
        L_0x001f:
            throw r3
        L_0x0020:
            if (r2 == 0) goto L_0x0023
            goto L_0x0015
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m48150a(android.database.Cursor, boolean):boolean");
    }

    /* renamed from: b */
    private static boolean m48152b() {
        if (!TextUtils.isEmpty(f54241a) && f54243c != null) {
            return false;
        }
        return true;
    }

    public boolean onCreate() {
        if (!C9415i.m18635b() || C19470k.m47658c(getContext())) {
            if (f54243c == null) {
                try {
                    m48151b(getContext());
                } catch (Exception unused) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalAccessError("should be create in main process");
    }

    /* renamed from: a */
    private synchronized SharedPreferences m48144a() {
        int i;
        if (this.f54245d == null) {
            int i2 = VERSION.SDK_INT;
            Context applicationContext = getContext().getApplicationContext();
            String str = "push_multi_process_config";
            if (i2 >= 11) {
                i = 4;
            } else {
                i = 0;
            }
            this.f54245d = C35807d.m80935a(applicationContext, str, i);
            return this.f54245d;
        }
        return this.f54245d;
    }

    /* renamed from: c */
    private void m48153c() {
        if (!this.f54247f) {
            synchronized (this.f54248g) {
                if (!this.f54247f) {
                    SharedPreferences a = m48144a();
                    if (a != null) {
                        for (Entry entry : a.getAll().entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (!(str == null || value == null)) {
                                this.f54246e.put(str, value);
                            }
                        }
                    }
                    this.f54247f = true;
                }
            }
        }
    }

    public String getType(Uri uri) {
        m48153c();
        StringBuilder sb = new StringBuilder("vnd.android.cursor.item/vnd.");
        sb.append(f54241a);
        sb.append(".item");
        return sb.toString();
    }

    /* renamed from: b */
    private static void m48151b(Context context) throws IllegalStateException {
        if (TextUtils.isEmpty(f54241a)) {
            f54241a = m48148a(context, PushMultiProcessSharedProvider.class.getName());
        }
        if (!TextUtils.isEmpty(f54241a)) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            f54243c = uriMatcher;
            uriMatcher.addURI(f54241a, "*/*", 65536);
            StringBuilder sb = new StringBuilder("content://");
            sb.append(f54241a);
            f54242b = Uri.parse(sb.toString());
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    /* renamed from: a */
    public static synchronized C19708b m48146a(Context context) {
        C19708b bVar;
        synchronized (PushMultiProcessSharedProvider.class) {
            if (f54244h == null) {
                f54244h = new C19708b(context);
            }
            bVar = f54244h;
        }
        return bVar;
    }

    /* renamed from: a */
    private Runnable m48147a(final String str, final String str2) {
        return new Runnable() {
            public final void run() {
                PushMultiProcessSharedProvider pushMultiProcessSharedProvider = PushMultiProcessSharedProvider.this;
                pushMultiProcessSharedProvider.getContext().getContentResolver().notifyChange(PushMultiProcessSharedProvider.m48145a(PushMultiProcessSharedProvider.this.getContext(), str, str2), null);
            }
        };
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f54241a = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.database.Cursor, code=boolean, for r1v0, types: [android.database.Cursor] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m48142a(boolean r1, int r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            if (r0 == 0) goto L_0x000f
            r0 = 0
            int r0 = r1.getInt(r0)     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            r2 = r0
        L_0x000f:
            if (r1 == 0) goto L_0x001f
        L_0x0011:
            r1.close()     // Catch:{ Exception -> 0x001f }
            goto L_0x001f
        L_0x0015:
            r2 = move-exception
            if (r1 == 0) goto L_0x001b
            r1.close()     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            throw r2
        L_0x001c:
            if (r1 == 0) goto L_0x001f
            goto L_0x0011
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m48142a(android.database.Cursor, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r2 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.database.Cursor, code=boolean, for r2v0, types: [android.database.Cursor] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m48143a(boolean r2, long r3) {
        /*
            if (r2 != 0) goto L_0x0003
            return r3
        L_0x0003:
            boolean r0 = r2.moveToFirst()     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            if (r0 == 0) goto L_0x000f
            r0 = 0
            long r0 = r2.getLong(r0)     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            r3 = r0
        L_0x000f:
            if (r2 == 0) goto L_0x001f
        L_0x0011:
            r2.close()     // Catch:{ Exception -> 0x001f }
            goto L_0x001f
        L_0x0015:
            r3 = move-exception
            if (r2 == 0) goto L_0x001b
            r2.close()     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            throw r3
        L_0x001c:
            if (r2 == 0) goto L_0x001f
            goto L_0x0011
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m48143a(android.database.Cursor, long):long");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Object obj;
        m48153c();
        if (m48152b()) {
            return null;
        }
        if (f54243c.match(uri) == 65536) {
            try {
                ArrayList<Runnable> arrayList = new ArrayList<>();
                Editor editor = null;
                for (Entry entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String str = (String) entry.getKey();
                    boolean z = true;
                    if (value == null) {
                        this.f54246e.remove(str);
                    } else {
                        Object obj2 = this.f54246e.get(str);
                        if (obj2 != null) {
                            if (obj2.equals(value)) {
                                z = false;
                            }
                        }
                        this.f54246e.put(str, value);
                    }
                    if (z) {
                        if (C9415i.m18635b()) {
                            StringBuilder sb = new StringBuilder("MultiProcessShareProvider reallly insert key = ");
                            sb.append(str);
                            sb.append(" value = ");
                            sb.append(value);
                            String sb2 = sb.toString();
                        }
                        if (editor == null) {
                            editor = m48144a().edit();
                        }
                        if (value == null) {
                            editor.remove(str);
                            obj = null;
                        } else if (value instanceof String) {
                            editor.putString(str, (String) value);
                            obj = m48147a(str, "string");
                        } else if (value instanceof Boolean) {
                            editor.putBoolean(str, ((Boolean) value).booleanValue());
                            obj = m48147a(str, "boolean");
                        } else if (value instanceof Long) {
                            editor.putLong(str, ((Long) value).longValue());
                            obj = m48147a(str, "long");
                        } else if (value instanceof Integer) {
                            editor.putInt(str, ((Integer) value).intValue());
                            obj = m48147a(str, "integer");
                        } else if (value instanceof Float) {
                            editor.putFloat(str, ((Float) value).floatValue());
                            obj = m48147a(str, "float");
                        } else {
                            StringBuilder sb3 = new StringBuilder("Unsupported type ");
                            sb3.append(uri);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        if (obj != null) {
                            arrayList.add(obj);
                        }
                    }
                }
                if (editor == null) {
                    return null;
                }
                if (VERSION.SDK_INT > 8) {
                    editor.apply();
                } else {
                    editor.commit();
                }
                for (Runnable run : arrayList) {
                    run.run();
                }
                return null;
            } catch (Exception unused) {
            }
        } else {
            StringBuilder sb4 = new StringBuilder("Unsupported uri ");
            sb4.append(uri);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    /* renamed from: a */
    private static String m48148a(Context context, String str) {
        ProviderInfo[] providerInfoArr;
        if (context == null || C9431p.m18664a(str)) {
            return null;
        }
        try {
            for (ProviderInfo providerInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers) {
                if (str.equals(providerInfo.name)) {
                    return providerInfo.authority;
                }
            }
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".push.SHARE_PROVIDER_AUTHORITY");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.database.Cursor, code=boolean, for r1v0, types: [android.database.Cursor] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m48149a(boolean r1, java.lang.String r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            if (r0 == 0) goto L_0x000f
            r0 = 0
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            r2 = r0
        L_0x000f:
            if (r1 == 0) goto L_0x001f
        L_0x0011:
            r1.close()     // Catch:{ Exception -> 0x001f }
            goto L_0x001f
        L_0x0015:
            r2 = move-exception
            if (r1 == 0) goto L_0x001b
            r1.close()     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            throw r2
        L_0x001c:
            if (r1 == 0) goto L_0x001f
            goto L_0x0011
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m48149a(android.database.Cursor, java.lang.String):java.lang.String");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        m48153c();
        if (m48152b() || f54243c.match(uri) == 65536) {
            return 0;
        }
        StringBuilder sb = new StringBuilder("Unsupported uri ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static final synchronized Uri m48145a(Context context, String str, String str2) {
        Uri build;
        synchronized (PushMultiProcessSharedProvider.class) {
            if (f54242b == null) {
                try {
                    m48151b(context);
                } catch (Exception unused) {
                    return null;
                }
            }
            build = f54242b.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor;
        Object obj;
        m48153c();
        if (m48152b()) {
            return null;
        }
        if (f54243c.match(uri) == 65536) {
            try {
                if ("all".equals((String) uri.getPathSegments().get(1))) {
                    Map all = m48144a().getAll();
                    matrixCursor = new MatrixCursor(new String[]{"key_column", "value_column", "type_column"});
                    try {
                        for (Entry entry : all.entrySet()) {
                            String str3 = (String) entry.getKey();
                            Object value = entry.getValue();
                            RowBuilder newRow = matrixCursor.newRow();
                            String str4 = "string";
                            if (value instanceof String) {
                                str4 = "string";
                            } else if (value instanceof Boolean) {
                                str4 = "boolean";
                                value = Integer.valueOf(((Boolean) value).booleanValue() ? 1 : 0);
                            } else if (value instanceof Integer) {
                                str4 = "integer";
                            } else if (value instanceof Long) {
                                str4 = "long";
                            } else if (value instanceof Float) {
                                str4 = "float";
                            }
                            newRow.add(str3);
                            newRow.add(value);
                            newRow.add(str4);
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    String str5 = (String) uri.getPathSegments().get(0);
                    boolean a = C9431p.m18665a(str5, "current_app_state");
                    boolean a2 = C9431p.m18665a(str5, "current_app_foreground");
                    if (!this.f54246e.containsKey(str5) && !a && !a2) {
                        return null;
                    }
                    MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{str5});
                    if (a) {
                        try {
                            obj = Boolean.valueOf(C9347a.m18519a().f25586a);
                        } catch (Exception unused2) {
                        }
                    } else if (a2) {
                        C9347a.m18519a();
                        obj = Boolean.valueOf(!C9347a.m18520b());
                    } else {
                        obj = this.f54246e.get(str5);
                    }
                    RowBuilder newRow2 = matrixCursor2.newRow();
                    if (obj instanceof Boolean) {
                        obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                    }
                    newRow2.add(obj);
                    matrixCursor = matrixCursor2;
                }
            } catch (Exception unused3) {
                matrixCursor = null;
            }
            return matrixCursor;
        }
        StringBuilder sb = new StringBuilder("Unsupported uri ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }
}
