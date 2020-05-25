package com.p683ss.android.account.token;

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
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.account.token.AuthTokenMultiProcessSharedProvider */
public class AuthTokenMultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a */
    public static String f50962a = null;

    /* renamed from: b */
    public static Uri f50963b = null;

    /* renamed from: c */
    public static String f50964c = "token_shared_preference";

    /* renamed from: d */
    private static UriMatcher f50965d;

    /* renamed from: i */
    private static C18499b f50966i;

    /* renamed from: e */
    private SharedPreferences f50967e;

    /* renamed from: f */
    private Map<String, Object> f50968f = new ConcurrentHashMap();

    /* renamed from: g */
    private volatile boolean f50969g = false;

    /* renamed from: h */
    private final Object f50970h = new Object();

    /* renamed from: com.ss.android.account.token.AuthTokenMultiProcessSharedProvider$a */
    public static class C18498a {

        /* renamed from: a */
        Context f50974a;

        /* renamed from: b */
        ContentValues f50975b;

        /* renamed from: a */
        public final synchronized void mo37757a() {
            try {
                this.f50974a.getContentResolver().insert(AuthTokenMultiProcessSharedProvider.m44752a(this.f50974a, "key", "type"), this.f50975b);
            } catch (Throwable unused) {
            }
        }

        private C18498a(Context context) {
            this.f50975b = new ContentValues();
            this.f50974a = context.getApplicationContext();
        }

        /* renamed from: a */
        public final C18498a mo37756a(String str, String str2) {
            this.f50975b.put(str, str2);
            return this;
        }
    }

    /* renamed from: com.ss.android.account.token.AuthTokenMultiProcessSharedProvider$b */
    public static class C18499b {

        /* renamed from: a */
        private Context f50976a;

        /* renamed from: b */
        private boolean f50977b;

        /* renamed from: c */
        private SharedPreferences f50978c;

        /* renamed from: a */
        public final C18498a mo37758a() {
            return new C18498a(this.f50976a);
        }

        /* renamed from: a */
        public final String mo37759a(String str, String str2) {
            try {
                if (this.f50977b) {
                    return this.f50978c.getString(str, str2);
                }
                return AuthTokenMultiProcessSharedProvider.m44756a(this.f50976a.getContentResolver().query(AuthTokenMultiProcessSharedProvider.m44752a(this.f50976a, str, "string"), null, null, null, null), str2);
            } catch (Throwable unused) {
                return str2;
            }
        }

        /* renamed from: a */
        public final boolean mo37760a(String str, boolean z) {
            try {
                if (this.f50977b) {
                    return this.f50978c.getBoolean(str, true);
                }
                return AuthTokenMultiProcessSharedProvider.m44758a(this.f50976a.getContentResolver().query(AuthTokenMultiProcessSharedProvider.m44752a(this.f50976a, str, "boolean"), null, null, null, null), true);
            } catch (Throwable unused) {
                return true;
            }
        }

        private C18499b(Context context, String str, boolean z) {
            this.f50977b = z;
            this.f50976a = context.getApplicationContext();
            AuthTokenMultiProcessSharedProvider.f50964c = str;
            this.f50978c = C35807d.m80935a(this.f50976a.getApplicationContext(), AuthTokenMultiProcessSharedProvider.f50964c, 4);
        }
    }

    /* renamed from: b */
    private static boolean m44759b() {
        if (!TextUtils.isEmpty(f50962a) && f50965d != null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private synchronized SharedPreferences m44751a() {
        int i;
        if (this.f50967e == null) {
            int i2 = VERSION.SDK_INT;
            Context applicationContext = getContext().getApplicationContext();
            String str = f50964c;
            if (i2 >= 11) {
                i = 4;
            } else {
                i = 0;
            }
            this.f50967e = C35807d.m80935a(applicationContext, str, i);
            return this.f50967e;
        }
        return this.f50967e;
    }

    public boolean onCreate() {
        if (!C9415i.m18635b() || C18508f.m44798a(getContext())) {
            if (f50965d == null) {
                try {
                    m44757a(getContext());
                } catch (Exception unused) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalAccessError("should be create in main process");
    }

    /* renamed from: c */
    private void m44760c() {
        if (!this.f50969g) {
            synchronized (this.f50970h) {
                if (!this.f50969g) {
                    SharedPreferences a = m44751a();
                    if (a != null) {
                        for (Entry entry : a.getAll().entrySet()) {
                            this.f50968f.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    this.f50969g = true;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo37747a(Uri uri) {
        getContext().getContentResolver().notifyChange(uri, null);
    }

    public String getType(Uri uri) {
        m44760c();
        StringBuilder sb = new StringBuilder("vnd.android.cursor.item/vnd.");
        sb.append(f50962a);
        sb.append(".item");
        return sb.toString();
    }

    /* renamed from: a */
    private static void m44757a(Context context) throws IllegalStateException {
        if (TextUtils.isEmpty(f50962a)) {
            f50962a = m44755a(context, AuthTokenMultiProcessSharedProvider.class.getName());
        }
        if (!TextUtils.isEmpty(f50962a)) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            f50965d = uriMatcher;
            uriMatcher.addURI(f50962a, "*/*", 65536);
            StringBuilder sb = new StringBuilder("content://");
            sb.append(f50962a);
            f50963b = Uri.parse(sb.toString());
            return;
        }
        throw new IllegalStateException("Must Set AuthTokenMultiProcessSharedProvider Authority");
    }

    /* renamed from: a */
    private Runnable m44754a(final String str, final String str2) {
        return new Runnable() {
            public final void run() {
                AuthTokenMultiProcessSharedProvider.this.mo37747a(AuthTokenMultiProcessSharedProvider.m44752a(AuthTokenMultiProcessSharedProvider.this.getContext(), str, str2));
            }
        };
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f50962a = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    /* renamed from: a */
    private static String m44755a(Context context, String str) {
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
        sb.append(".auth_token.SHARE_PROVIDER_AUTHORITY");
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
    public static java.lang.String m44756a(boolean r1, java.lang.String r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.account.token.AuthTokenMultiProcessSharedProvider.m44756a(android.database.Cursor, java.lang.String):java.lang.String");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Object obj;
        m44760c();
        if (m44759b()) {
            return null;
        }
        if (f50965d.match(uri) == 65536) {
            try {
                ArrayList<Runnable> arrayList = new ArrayList<>();
                Editor editor = null;
                for (Entry entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String str = (String) entry.getKey();
                    boolean z = true;
                    if (value == null) {
                        this.f50968f.remove(str);
                    } else {
                        Object obj2 = this.f50968f.get(str);
                        if (obj2 != null) {
                            if (obj2.equals(value)) {
                                z = false;
                            }
                        }
                        this.f50968f.put(str, value);
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
                            editor = m44751a().edit();
                        }
                        if (value == null) {
                            editor.remove(str);
                            obj = null;
                        } else if (value instanceof String) {
                            editor.putString(str, (String) value);
                            obj = m44754a(str, "string");
                        } else if (value instanceof Boolean) {
                            editor.putBoolean(str, ((Boolean) value).booleanValue());
                            obj = m44754a(str, "boolean");
                        } else if (value instanceof Long) {
                            editor.putLong(str, ((Long) value).longValue());
                            obj = m44754a(str, "long");
                        } else if (value instanceof Integer) {
                            editor.putInt(str, ((Integer) value).intValue());
                            obj = m44754a(str, "integer");
                        } else if (value instanceof Float) {
                            editor.putFloat(str, ((Float) value).floatValue());
                            obj = m44754a(str, "float");
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

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != null) goto L_0x0015;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.database.Cursor, code=boolean, for r2v0, types: [android.database.Cursor] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m44758a(boolean r2, boolean r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.account.token.AuthTokenMultiProcessSharedProvider.m44758a(android.database.Cursor, boolean):boolean");
    }

    /* renamed from: a */
    public static synchronized C18499b m44753a(Context context, String str, boolean z) {
        C18499b bVar;
        synchronized (AuthTokenMultiProcessSharedProvider.class) {
            if (f50966i == null) {
                f50966i = new C18499b(context, str, z);
            }
            bVar = f50966i;
        }
        return bVar;
    }

    /* renamed from: a */
    public static final synchronized Uri m44752a(Context context, String str, String str2) {
        Uri build;
        synchronized (AuthTokenMultiProcessSharedProvider.class) {
            if (f50963b == null) {
                try {
                    m44757a(context);
                } catch (Exception unused) {
                    return null;
                }
            }
            build = f50963b.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        m44760c();
        if (m44759b()) {
            return 0;
        }
        if (f50965d.match(uri) == 65536) {
            try {
                this.f50968f.clear();
                m44751a().edit().clear().commit();
                mo37747a(m44752a(getContext(), "key", "type"));
            } catch (Exception unused) {
            }
            return 0;
        }
        StringBuilder sb = new StringBuilder("Unsupported uri ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor;
        m44760c();
        if (m44759b()) {
            return null;
        }
        if (f50965d.match(uri) == 65536) {
            try {
                if ("all".equals((String) uri.getPathSegments().get(1))) {
                    Map all = m44751a().getAll();
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
                    return matrixCursor;
                }
                String str5 = (String) uri.getPathSegments().get(0);
                if (!this.f50968f.containsKey(str5)) {
                    return null;
                }
                matrixCursor = new MatrixCursor(new String[]{str5});
                Object obj = this.f50968f.get(str5);
                RowBuilder newRow2 = matrixCursor.newRow();
                if (obj instanceof Boolean) {
                    obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                newRow2.add(obj);
                return matrixCursor;
            } catch (Exception unused2) {
                matrixCursor = null;
            }
        } else {
            StringBuilder sb = new StringBuilder("Unsupported uri ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
