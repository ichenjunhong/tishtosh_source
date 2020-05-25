package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15516g;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {

    /* renamed from: a */
    public static final C15539b f40020a = new C15545b();

    /* renamed from: b */
    public static final C15539b f40021b = new C15547d();

    /* renamed from: c */
    public static final C15539b f40022c = new C15548e();

    /* renamed from: d */
    public static final C15539b f40023d = new C15549f();

    /* renamed from: f */
    private static Boolean f40024f = null;

    /* renamed from: g */
    private static C15552i f40025g = null;

    /* renamed from: h */
    private static C15554k f40026h = null;

    /* renamed from: i */
    private static String f40027i = null;

    /* renamed from: j */
    private static int f40028j = -1;

    /* renamed from: k */
    private static final ThreadLocal<C15542c> f40029k = new ThreadLocal<>();

    /* renamed from: l */
    private static final C15540a f40030l = new C15544a();

    /* renamed from: m */
    private static final C15539b f40031m = new C15546c();

    /* renamed from: n */
    private static final C15539b f40032n = new C15550g();

    /* renamed from: e */
    public final Context f40033e;

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C15538a extends Exception {
        private C15538a(String str) {
            super(str);
        }

        private C15538a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ C15538a(String str, C15544a aVar) {
            this(str);
        }

        /* synthetic */ C15538a(String str, Throwable th, C15544a aVar) {
            this(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface C15539b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public interface C15540a {
            /* renamed from: a */
            int mo28532a(Context context, String str);

            /* renamed from: a */
            int mo28533a(Context context, String str, boolean z) throws C15538a;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public static class C15541b {

            /* renamed from: a */
            public int f40034a;

            /* renamed from: b */
            public int f40035b;

            /* renamed from: c */
            public int f40036c;
        }

        /* renamed from: a */
        C15541b mo28531a(Context context, String str, C15540a aVar) throws C15538a;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    static class C15542c {

        /* renamed from: a */
        public Cursor f40037a;

        private C15542c() {
        }

        /* synthetic */ C15542c(C15544a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$d */
    static class C15543d implements C15540a {

        /* renamed from: a */
        private final int f40038a;

        public C15543d(int i, int i2) {
            this.f40038a = i;
        }

        /* renamed from: a */
        public final int mo28533a(Context context, String str, boolean z) {
            return 0;
        }

        /* renamed from: a */
        public final int mo28532a(Context context, String str) {
            return this.f40038a;
        }
    }

    /* renamed from: a */
    public static DynamiteModule m32334a(Context context, C15539b bVar, String str) throws C15538a {
        C15541b a;
        C15542c cVar = (C15542c) f40029k.get();
        C15542c cVar2 = new C15542c(null);
        f40029k.set(cVar2);
        try {
            a = bVar.mo28531a(context, str, f40030l);
            if (a.f40036c == 0 || ((a.f40036c == -1 && a.f40034a == 0) || (a.f40036c == 1 && a.f40035b == 0))) {
                int i = a.f40034a;
                int i2 = a.f40035b;
                StringBuilder sb = new StringBuilder(91);
                sb.append("No acceptable module found. Local version is ");
                sb.append(i);
                sb.append(" and remote version is ");
                sb.append(i2);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                throw new C15538a(sb.toString(), (C15544a) null);
            } else if (a.f40036c == -1) {
                DynamiteModule c = m32343c(context, str);
                if (cVar2.f40037a != null) {
                    cVar2.f40037a.close();
                }
                f40029k.set(cVar);
                return c;
            } else if (a.f40036c == 1) {
                DynamiteModule a2 = m32335a(context, str, a.f40035b);
                if (cVar2.f40037a != null) {
                    cVar2.f40037a.close();
                }
                f40029k.set(cVar);
                return a2;
            } else {
                int i3 = a.f40036c;
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append("VersionPolicy returned invalid code:");
                sb2.append(i3);
                throw new C15538a(sb2.toString(), (C15544a) null);
            }
        } catch (C15538a e) {
            String str2 = "Failed to load remote module: ";
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            if (a.f40034a == 0 || bVar.mo28531a(context, str, new C15543d(a.f40034a, 0)).f40036c != -1) {
                throw new C15538a("Remote load failed. No local fallback found.", e, null);
            }
            DynamiteModule c2 = m32343c(context, str);
            if (cVar2.f40037a != null) {
                cVar2.f40037a.close();
            }
            f40029k.set(cVar);
            return c2;
        } catch (Throwable th) {
            if (cVar2.f40037a != null) {
                cVar2.f40037a.close();
            }
            f40029k.set(cVar);
            throw th;
        }
    }

    /* renamed from: a */
    public static int m32331a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!declaredField.get(null).equals(str)) {
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e) {
            String str2 = "Failed to load module descriptor class: ";
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:40|41|42|43|50|51|52|53|(3:55|56|57)(2:67|68)) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.set(null, java.lang.ClassLoader.getSystemClassLoader());
        r2 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009c, code lost:
        return m32342c(r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00bd, code lost:
        return m32340b(r8, r9, r10);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x007e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x008d */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0098 A[SYNTHETIC, Splitter:B:55:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b9 A[Catch:{ a -> 0x009d, Throwable -> 0x00c1 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:18:0x0035=Splitter:B:18:0x0035, B:35:0x007b=Splitter:B:35:0x007b} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m32332a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ Throwable -> 0x00c1 }
            java.lang.Boolean r1 = f40024f     // Catch:{ all -> 0x00be }
            if (r1 != 0) goto L_0x0091
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x008a }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            if (r4 != r2) goto L_0x0032
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0032:
            m32338a(r4)     // Catch:{ a -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x008a }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x008a }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0052
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0052:
            int r4 = m32342c(r8, r9, r10)     // Catch:{ a -> 0x007e }
            java.lang.String r5 = f40027i     // Catch:{ a -> 0x007e }
            if (r5 == 0) goto L_0x007b
            java.lang.String r5 = f40027i     // Catch:{ a -> 0x007e }
            boolean r5 = r5.isEmpty()     // Catch:{ a -> 0x007e }
            if (r5 == 0) goto L_0x0063
            goto L_0x007b
        L_0x0063:
            com.google.android.gms.dynamite.h r5 = new com.google.android.gms.dynamite.h     // Catch:{ a -> 0x007e }
            java.lang.String r6 = f40027i     // Catch:{ a -> 0x007e }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x007e }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x007e }
            m32338a(r5)     // Catch:{ a -> 0x007e }
            r2.set(r3, r5)     // Catch:{ a -> 0x007e }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ a -> 0x007e }
            f40024f = r5     // Catch:{ a -> 0x007e }
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            return r4
        L_0x007b:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            return r4
        L_0x007e:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
        L_0x0087:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            r1 = r2
            goto L_0x008f
        L_0x008a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            throw r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        L_0x008d:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00be }
        L_0x008f:
            f40024f = r1     // Catch:{ all -> 0x00be }
        L_0x0091:
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            boolean r0 = r1.booleanValue()     // Catch:{ Throwable -> 0x00c1 }
            if (r0 == 0) goto L_0x00b9
            int r9 = m32342c(r8, r9, r10)     // Catch:{ a -> 0x009d }
            return r9
        L_0x009d:
            r9 = move-exception
            java.lang.String r10 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ Throwable -> 0x00c1 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x00c1 }
            int r0 = r9.length()     // Catch:{ Throwable -> 0x00c1 }
            if (r0 == 0) goto L_0x00b2
            r10.concat(r9)     // Catch:{ Throwable -> 0x00c1 }
            goto L_0x00b7
        L_0x00b2:
            java.lang.String r9 = new java.lang.String     // Catch:{ Throwable -> 0x00c1 }
            r9.<init>(r10)     // Catch:{ Throwable -> 0x00c1 }
        L_0x00b7:
            r8 = 0
            return r8
        L_0x00b9:
            int r9 = m32340b(r8, r9, r10)     // Catch:{ Throwable -> 0x00c1 }
            return r9
        L_0x00be:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            throw r9     // Catch:{ Throwable -> 0x00c1 }
        L_0x00c1:
            r9 = move-exception
            com.google.android.gms.common.util.C15516g.m32278a(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m32332a(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: b */
    private static int m32340b(Context context, String str, boolean z) {
        C15552i a = m32336a(context);
        if (a == null) {
            return 0;
        }
        try {
            if (a.mo28535a() >= 2) {
                return a.mo28538b(C14886d.m30544a(context), str, z);
            }
            return a.mo28536a(C14886d.m30544a(context), str, z);
        } catch (RemoteException e) {
            String str2 = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ad  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m32342c(android.content.Context r8, java.lang.String r9, boolean r10) throws com.google.android.gms.dynamite.DynamiteModule.C15538a {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            java.lang.String r10 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            int r10 = r10.length()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r2.append(r8)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r2.append(r9)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            if (r8 == 0) goto L_0x0090
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            if (r9 == 0) goto L_0x0090
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            if (r9 <= 0) goto L_0x0081
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x007e }
            f40027i = r1     // Catch:{ all -> 0x007e }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x007e }
            if (r1 < 0) goto L_0x006b
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x007e }
            f40028j = r1     // Catch:{ all -> 0x007e }
        L_0x006b:
            monitor-exit(r10)     // Catch:{ all -> 0x007e }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = f40029k     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.C15542c) r10     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            if (r10 == 0) goto L_0x0081
            android.database.Cursor r1 = r10.f40037a     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            if (r1 != 0) goto L_0x0081
            r10.f40037a = r8     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            r8 = r0
            goto L_0x0081
        L_0x007e:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x007e }
            throw r9     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
        L_0x0081:
            if (r8 == 0) goto L_0x0086
            r8.close()
        L_0x0086:
            return r9
        L_0x0087:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00ab
        L_0x008b:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x009c
        L_0x0090:
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            throw r9     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
        L_0x0098:
            r8 = move-exception
            goto L_0x00ab
        L_0x009a:
            r8 = move-exception
            r9 = r0
        L_0x009c:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.C15538a     // Catch:{ all -> 0x00a9 }
            if (r10 == 0) goto L_0x00a1
            throw r8     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00a9 }
            throw r10     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r8 = move-exception
            r0 = r9
        L_0x00ab:
            if (r0 == 0) goto L_0x00b0
            r0.close()
        L_0x00b0:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m32342c(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: b */
    public static int m32339b(Context context, String str) {
        return m32332a(context, str, false);
    }

    /* renamed from: c */
    private static DynamiteModule m32343c(Context context, String str) {
        String str2 = "Selected local version of ";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: a */
    private static DynamiteModule m32335a(Context context, String str, int i) throws C15538a {
        Boolean bool;
        try {
            synchronized (DynamiteModule.class) {
                bool = f40024f;
            }
            if (bool == null) {
                throw new C15538a("Failed to determine which loading route to use.", (C15544a) null);
            } else if (bool.booleanValue()) {
                return m32344c(context, str, i);
            } else {
                return m32341b(context, str, i);
            }
        } catch (Throwable th) {
            C15516g.m32278a(context, th);
            throw th;
        }
    }

    /* renamed from: b */
    private static DynamiteModule m32341b(Context context, String str, int i) throws C15538a {
        C14882b bVar;
        C15552i a = m32336a(context);
        if (a != null) {
            try {
                if (a.mo28535a() >= 2) {
                    bVar = a.mo28539b(C14886d.m30544a(context), str, i);
                } else {
                    bVar = a.mo28537a(C14886d.m30544a(context), str, i);
                }
                if (C14886d.m30545a(bVar) != null) {
                    return new DynamiteModule((Context) C14886d.m30545a(bVar));
                }
                throw new C15538a("Failed to load remote module.", (C15544a) null);
            } catch (RemoteException e) {
                throw new C15538a("Failed to load remote module.", e, null);
            }
        } else {
            throw new C15538a("Failed to create IDynamiteLoader.", (C15544a) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.dynamite.C15552i m32336a(android.content.Context r4) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            com.google.android.gms.dynamite.i r1 = f40025g     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x000b
            com.google.android.gms.dynamite.i r4 = f40025g     // Catch:{ all -> 0x0069 }
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r4
        L_0x000b:
            com.google.android.gms.common.c r1 = com.google.android.gms.common.C15369c.getInstance()     // Catch:{ all -> 0x0069 }
            int r1 = r1.isGooglePlayServicesAvailable(r4)     // Catch:{ all -> 0x0069 }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r2
        L_0x0018:
            java.lang.String r1 = "com.google.android.gms"
            r3 = 3
            android.content.Context r4 = r4.createPackageContext(r1, r3)     // Catch:{ Exception -> 0x004d }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ Exception -> 0x004d }
            java.lang.String r1 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r4 = r4.loadClass(r1)     // Catch:{ Exception -> 0x004d }
            java.lang.Object r4 = r4.newInstance()     // Catch:{ Exception -> 0x004d }
            android.os.IBinder r4 = (android.os.IBinder) r4     // Catch:{ Exception -> 0x004d }
            if (r4 != 0) goto L_0x0033
            r4 = r2
            goto L_0x0047
        L_0x0033:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)     // Catch:{ Exception -> 0x004d }
            boolean r3 = r1 instanceof com.google.android.gms.dynamite.C15552i     // Catch:{ Exception -> 0x004d }
            if (r3 == 0) goto L_0x0041
            r4 = r1
            com.google.android.gms.dynamite.i r4 = (com.google.android.gms.dynamite.C15552i) r4     // Catch:{ Exception -> 0x004d }
            goto L_0x0047
        L_0x0041:
            com.google.android.gms.dynamite.j r1 = new com.google.android.gms.dynamite.j     // Catch:{ Exception -> 0x004d }
            r1.<init>(r4)     // Catch:{ Exception -> 0x004d }
            r4 = r1
        L_0x0047:
            if (r4 == 0) goto L_0x0067
            f40025g = r4     // Catch:{ Exception -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r4
        L_0x004d:
            r4 = move-exception
            java.lang.String r1 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0069 }
            int r3 = r4.length()     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x0062
            r1.concat(r4)     // Catch:{ all -> 0x0069 }
            goto L_0x0067
        L_0x0062:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0069 }
            r4.<init>(r1)     // Catch:{ all -> 0x0069 }
        L_0x0067:
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r2
        L_0x0069:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m32336a(android.content.Context):com.google.android.gms.dynamite.i");
    }

    /* renamed from: c */
    private static DynamiteModule m32344c(Context context, String str, int i) throws C15538a {
        C15554k kVar;
        synchronized (DynamiteModule.class) {
            kVar = f40026h;
        }
        if (kVar != null) {
            C15542c cVar = (C15542c) f40029k.get();
            if (cVar == null || cVar.f40037a == null) {
                throw new C15538a("No result cursor", (C15544a) null);
            }
            Context a = m32333a(context.getApplicationContext(), str, i, cVar.f40037a, kVar);
            if (a != null) {
                return new DynamiteModule(a);
            }
            throw new C15538a("Failed to get module context", (C15544a) null);
        }
        throw new C15538a("DynamiteLoaderV2 was not cached.", (C15544a) null);
    }

    /* renamed from: a */
    private static Boolean m32337a() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f40028j >= 2);
        }
        return valueOf;
    }

    /* renamed from: a */
    private static Context m32333a(Context context, String str, int i, Cursor cursor, C15554k kVar) {
        C14882b bVar;
        try {
            C14886d.m30544a(null);
            if (m32337a().booleanValue()) {
                bVar = kVar.mo28541b(C14886d.m30544a(context), str, i, C14886d.m30544a(cursor));
            } else {
                bVar = kVar.mo28540a(C14886d.m30544a(context), str, i, C14886d.m30544a(cursor));
            }
            return (Context) C14886d.m30545a(bVar);
        } catch (Exception e) {
            String str2 = "Failed to load DynamiteLoader: ";
            String valueOf = String.valueOf(e.toString());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static void m32338a(ClassLoader classLoader) throws C15538a {
        C15554k kVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                kVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C15554k) {
                    kVar = (C15554k) queryLocalInterface;
                } else {
                    kVar = new C15555l(iBinder);
                }
            }
            f40026h = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C15538a("Failed to instantiate dynamite loader", e, null);
        }
    }

    /* renamed from: a */
    public final IBinder mo28530a(String str) throws C15538a {
        try {
            return (IBinder) this.f40033e.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String str2 = "Failed to instantiate module class: ";
            String valueOf = String.valueOf(str);
            throw new C15538a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e, null);
        }
    }

    private DynamiteModule(Context context) {
        this.f40033e = (Context) C15464q.m32123a(context);
    }
}
