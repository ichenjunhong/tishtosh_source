package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SoLoader {

    /* renamed from: a */
    static final boolean f38024a;

    /* renamed from: b */
    static C14684i f38025b;

    /* renamed from: c */
    private static final ReentrantReadWriteLock f38026c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private static C14685j[] f38027d = null;

    /* renamed from: e */
    private static int f38028e = 0;

    /* renamed from: f */
    private static C14689m f38029f;

    /* renamed from: g */
    private static C14668b f38030g;

    /* renamed from: h */
    private static final HashSet<String> f38031h = new HashSet<>();

    /* renamed from: i */
    private static final Map<String, Object> f38032i = new HashMap();

    /* renamed from: j */
    private static final Set<String> f38033j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k */
    private static C14688l f38034k = null;

    /* renamed from: l */
    private static int f38035l;

    static class Api14Utils {
        private Api14Utils() {
        }

        /* renamed from: a */
        public static String m30002a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            } else {
                StringBuilder sb = new StringBuilder("ClassLoader ");
                sb.append(classLoader.getClass().getName());
                sb.append(" should be of type BaseDexClassLoader");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: com.facebook.soloader.SoLoader$a */
    public static final class C14665a extends UnsatisfiedLinkError {
        C14665a(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    static {
        boolean z = false;
        try {
            if (VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        f38024a = z;
    }

    /* renamed from: a */
    private static int m29991a() {
        int i;
        f38026c.writeLock().lock();
        try {
            if ((f38035l & 2) != 0) {
                i = 1;
            } else {
                i = 0;
            }
            return i;
        } finally {
            f38026c.writeLock().unlock();
        }
    }

    /* renamed from: b */
    private static Method m29999b() {
        Method method;
        if (VERSION.SDK_INT < 23) {
            return null;
        }
        try {
            if (VERSION.SDK_INT <= 27) {
                method = Runtime.class.getDeclaredMethod("nativeLoad", new Class[]{String.class, ClassLoader.class, String.class});
            } else {
                method = Runtime.class.getDeclaredMethod("nativeLoad", new Class[]{String.class, ClassLoader.class});
            }
            method.setAccessible(true);
            return method;
        } catch (NoSuchMethodException | SecurityException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m29996a(String str) {
        return m29997a(str, 0);
    }

    /* renamed from: a */
    private static synchronized void m29994a(C14684i iVar) {
        final boolean z;
        final String str;
        final String str2;
        synchronized (SoLoader.class) {
            if (iVar != null) {
                f38025b = iVar;
                return;
            }
            final Runtime runtime = Runtime.getRuntime();
            final Method b = m29999b();
            if (b != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = Api14Utils.m30002a();
            } else {
                str = null;
            }
            if (str == null) {
                str2 = null;
            } else {
                String[] split = str.split(":");
                ArrayList arrayList = new ArrayList(split.length);
                for (String str3 : split) {
                    if (!str3.contains("!")) {
                        arrayList.add(str3);
                    }
                }
                str2 = TextUtils.join(":", arrayList);
            }
            C146641 r1 = new C14684i() {
                /* renamed from: a */
                public final void mo26939a(String str, int i) {
                    boolean z;
                    String str2;
                    String str3;
                    if (z) {
                        if ((i & 4) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            str2 = str;
                        } else {
                            str2 = str2;
                        }
                        try {
                            synchronized (runtime) {
                                if (VERSION.SDK_INT <= 27) {
                                    str3 = (String) b.invoke(runtime, new Object[]{str, SoLoader.class.getClassLoader(), str2});
                                } else {
                                    str3 = (String) b.invoke(runtime, new Object[]{str, SoLoader.class.getClassLoader()});
                                }
                                if (str3 != null) {
                                    throw new UnsatisfiedLinkError(str3);
                                }
                            }
                            if (str3 == null) {
                            }
                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                            StringBuilder sb = new StringBuilder("Error: Cannot load ");
                            sb.append(str);
                            throw new RuntimeException(sb.toString(), e);
                        }
                    } else {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        System.load(str);
                        C18973a.m46141a(uptimeMillis, str);
                    }
                }
            };
            f38025b = r1;
        }
    }

    /* renamed from: a */
    public static void m29992a(Context context, int i) throws IOException {
        m29993a(context, 0, (C14684i) null);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:26|27|28|(2:30|(1:32)(1:33))|34|35) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00aa */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m29997a(java.lang.String r6, int r7) throws java.lang.UnsatisfiedLinkError {
        /*
            java.util.concurrent.locks.ReentrantReadWriteLock r7 = f38026c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r7.readLock()
            r7.lock()
            com.facebook.soloader.j[] r7 = f38027d     // Catch:{ all -> 0x00d2 }
            if (r7 != 0) goto L_0x00be
            java.lang.String r7 = "http://www.android.com/"
            java.lang.String r0 = "java.vendor.url"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x00d2 }
            boolean r7 = r7.equals(r0)     // Catch:{ all -> 0x00d2 }
            if (r7 == 0) goto L_0x0046
            java.util.concurrent.locks.ReentrantReadWriteLock r7 = f38026c     // Catch:{ all -> 0x00d2 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r7.readLock()     // Catch:{ all -> 0x00d2 }
            r7.lock()     // Catch:{ all -> 0x00d2 }
            com.facebook.soloader.j[] r7 = f38027d     // Catch:{ all -> 0x003b }
            if (r7 == 0) goto L_0x0033
            java.util.concurrent.locks.ReentrantReadWriteLock r7 = f38026c     // Catch:{ all -> 0x00d2 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r7.readLock()     // Catch:{ all -> 0x00d2 }
            r7.unlock()     // Catch:{ all -> 0x00d2 }
            goto L_0x00be
        L_0x0033:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x003b }
            java.lang.String r7 = "SoLoader.init() not yet called"
            r6.<init>(r7)     // Catch:{ all -> 0x003b }
            throw r6     // Catch:{ all -> 0x003b }
        L_0x003b:
            r6 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r7 = f38026c     // Catch:{ all -> 0x00d2 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r7.readLock()     // Catch:{ all -> 0x00d2 }
            r7.unlock()     // Catch:{ all -> 0x00d2 }
            throw r6     // Catch:{ all -> 0x00d2 }
        L_0x0046:
            java.lang.Class<com.facebook.soloader.SoLoader> r7 = com.facebook.soloader.SoLoader.class
            monitor-enter(r7)     // Catch:{ all -> 0x00d2 }
            java.util.HashSet<java.lang.String> r0 = f38031h     // Catch:{ all -> 0x00bb }
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x00bb }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b0
            com.facebook.soloader.l r1 = f38034k     // Catch:{ all -> 0x00bb }
            if (r1 != 0) goto L_0x00b0
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00bb }
            boolean r3 = com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46144a(r6)     // Catch:{ Throwable -> 0x00aa }
            if (r3 == 0) goto L_0x00aa
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Throwable -> 0x00aa }
            long r4 = com.bytedance.ies.ugc.p694a.C11010c.m22286g()     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x00aa }
            com.bytedance.android.p161c.C2835a.m8098a(r3, r4)     // Catch:{ Throwable -> 0x00aa }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00aa }
            r3.<init>()     // Catch:{ Throwable -> 0x00aa }
            com.p683ss.android.ugc.aweme.p2391v.C47964c.m103778e()     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p2391v.C47964c.m103775a()     // Catch:{ Throwable -> 0x00aa }
            r3.append(r4)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r4 = "/lib"
            r3.append(r4)     // Catch:{ Throwable -> 0x00aa }
            r3.append(r6)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r4 = ".so"
            r3.append(r4)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x00aa }
            java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x00aa }
            r4.<init>(r3)     // Catch:{ Throwable -> 0x00aa }
            boolean r4 = r4.exists()     // Catch:{ Throwable -> 0x00aa }
            if (r4 == 0) goto L_0x00a6
            r4 = 2
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46142a(r6, r4)     // Catch:{ Throwable -> 0x00aa }
            java.lang.System.load(r3)     // Catch:{ Throwable -> 0x00aa }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r1, r6)     // Catch:{ Throwable -> 0x00aa }
            goto L_0x00b0
        L_0x00a6:
            r3 = 3
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46142a(r6, r3)     // Catch:{ Throwable -> 0x00aa }
        L_0x00aa:
            com.bytedance.p723j.C11511a.m23578a(r6)     // Catch:{ all -> 0x00bb }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r1, r6)     // Catch:{ all -> 0x00bb }
        L_0x00b0:
            monitor-exit(r7)     // Catch:{ all -> 0x00bb }
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = f38026c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r6 = r6.readLock()
            r6.unlock()
            return r0
        L_0x00bb:
            r6 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00bb }
            throw r6     // Catch:{ all -> 0x00d2 }
        L_0x00be:
            java.util.concurrent.locks.ReentrantReadWriteLock r7 = f38026c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r7.readLock()
            r7.unlock()
            java.lang.String r7 = java.lang.System.mapLibraryName(r6)
            r0 = 0
            r1 = 0
            boolean r6 = m29998a(r7, r6, r1, r0, r1)
            return r6
        L_0x00d2:
            r6 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r7 = f38026c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r7.readLock()
            r7.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.m29997a(java.lang.String, int):boolean");
    }

    /* renamed from: a */
    private static void m29993a(Context context, int i, C14684i iVar) throws IOException {
        ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            m29994a((C14684i) null);
            m30000b(context, i, null);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* renamed from: b */
    private static void m30000b(Context context, int i, C14684i iVar) throws IOException {
        boolean z;
        int i2;
        int i3;
        f38026c.writeLock().lock();
        try {
            if (f38027d == null) {
                f38035l = i;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = "/vendor/lib:/system/lib";
                }
                String[] split = str.split(":");
                for (String file : split) {
                    arrayList.add(new C14669c(new File(file), 2));
                }
                if (context != null) {
                    if ((i & 1) != 0) {
                        f38029f = null;
                        arrayList.add(0, new C14671e(context, "lib-main"));
                    } else {
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if ((applicationInfo.flags & 1) == 0 || (applicationInfo.flags & 128) != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            i2 = 0;
                        } else {
                            if (VERSION.SDK_INT <= 17) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            f38030g = new C14668b(context, i3);
                            arrayList.add(0, f38030g);
                            i2 = 1;
                        }
                        f38029f = new C14666a(context, "lib-main", i2);
                        arrayList.add(0, f38029f);
                    }
                }
                C14685j[] jVarArr = (C14685j[]) arrayList.toArray(new C14685j[arrayList.size()]);
                int a = m29991a();
                int length = jVarArr.length;
                while (true) {
                    int i4 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    jVarArr[i4].mo26944a(a);
                    length = i4;
                }
                f38027d = jVarArr;
                f38028e++;
            }
        } finally {
            f38026c.writeLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static void m29995a(String str, int i, ThreadPolicy threadPolicy) throws IOException {
        boolean z;
        boolean z2;
        f38026c.readLock().lock();
        try {
            if (f38027d != null) {
                f38026c.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                if (f38024a) {
                    StringBuilder sb = new StringBuilder("SoLoader.loadLibrary[");
                    sb.append(str);
                    sb.append("]");
                    Api18TraceUtils.m29990a(sb.toString());
                }
                int i2 = 0;
                do {
                    try {
                        f38026c.readLock().lock();
                        int i3 = f38028e;
                        int i4 = 0;
                        while (true) {
                            if (i2 != 0) {
                                break;
                            }
                            try {
                                if (i4 >= f38027d.length) {
                                    break;
                                }
                                int a = f38027d[i4].mo26943a(str, i, threadPolicy);
                                if (a == 3) {
                                    try {
                                        if (f38029f != null) {
                                            f38029f.mo26956a(str);
                                            i2 = f38029f.mo26943a(str, i, threadPolicy);
                                            break;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        i2 = a;
                                        f38026c.readLock().unlock();
                                        throw th;
                                    }
                                }
                                i4++;
                                i2 = a;
                            } catch (Throwable th2) {
                                th = th2;
                                f38026c.readLock().unlock();
                                throw th;
                            }
                        }
                        f38026c.readLock().unlock();
                        if (i2 == 0) {
                            f38026c.writeLock().lock();
                            if (f38030g != null && f38030g.mo26945a()) {
                                f38028e++;
                            }
                            if (f38028e != i3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            f38026c.writeLock().unlock();
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                    } catch (Throwable th3) {
                        if (f38024a) {
                            Api18TraceUtils.m29989a();
                        }
                        if (z) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        if (i2 == 0 || i2 == 3) {
                            StringBuilder sb2 = new StringBuilder("couldn't find DSO to load: ");
                            sb2.append(str);
                            throw new UnsatisfiedLinkError(sb2.toString());
                        }
                        throw th3;
                    }
                } while (z2);
                if (f38024a) {
                    Api18TraceUtils.m29989a();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                if (i2 == 0 || i2 == 3) {
                    StringBuilder sb3 = new StringBuilder("couldn't find DSO to load: ");
                    sb3.append(str);
                    throw new UnsatisfiedLinkError(sb3.toString());
                }
                return;
            }
            StringBuilder sb4 = new StringBuilder("couldn't find DSO to load: ");
            sb4.append(str);
            throw new UnsatisfiedLinkError(sb4.toString());
        } catch (Throwable th4) {
            f38026c.readLock().unlock();
            throw th4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r2 != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r0 = com.facebook.soloader.SoLoader.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        if (f38031h.contains(r6) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        if (r8 != null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0052, code lost:
        if (r2 != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        m29995a(r6, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0057, code lost:
        r9 = com.facebook.soloader.SoLoader.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        f38031h.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005f, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0064, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0065, code lost:
        r7 = r6.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0069, code lost:
        if (r7 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0078, code lost:
        throw new com.facebook.soloader.SoLoader.C14665a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0079, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x007a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0080, code lost:
        throw new java.lang.RuntimeException(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0084, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x008a, code lost:
        if (android.text.TextUtils.isEmpty(r7) != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0092, code lost:
        if (f38033j.contains(r7) == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0094, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0096, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0097, code lost:
        if (r8 == null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0099, code lost:
        if (r6 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x009d, code lost:
        if (f38024a == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x009f, code lost:
        r6 = new java.lang.StringBuilder("MergedSoMapping.invokeJniOnload[");
        r6.append(r7);
        r6.append("]");
        com.facebook.soloader.Api18TraceUtils.m29990a(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r8 = new java.lang.StringBuilder("Unknown library: ");
        r8.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00c8, code lost:
        throw new java.lang.IllegalArgumentException(r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00c9, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00cc, code lost:
        if (f38024a != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00ce, code lost:
        com.facebook.soloader.Api18TraceUtils.m29989a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00d1, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x00d2, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00d3, code lost:
        if (r2 != false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x00d5, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x00d6, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x00d8, code lost:
        throw r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m29998a(java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, android.os.StrictMode.ThreadPolicy r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            java.util.Set<java.lang.String> r0 = f38033j
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x0010
            return r1
        L_0x0010:
            java.lang.Class<com.facebook.soloader.SoLoader> r0 = com.facebook.soloader.SoLoader.class
            monitor-enter(r0)
            java.util.HashSet<java.lang.String> r2 = f38031h     // Catch:{ all -> 0x00d9 }
            boolean r2 = r2.contains(r6)     // Catch:{ all -> 0x00d9 }
            r3 = 1
            if (r2 == 0) goto L_0x0022
            if (r8 != 0) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x00d9 }
            return r1
        L_0x0020:
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            java.util.Map<java.lang.String, java.lang.Object> r4 = f38032i     // Catch:{ all -> 0x00d9 }
            boolean r4 = r4.containsKey(r6)     // Catch:{ all -> 0x00d9 }
            if (r4 == 0) goto L_0x0032
            java.util.Map<java.lang.String, java.lang.Object> r4 = f38032i     // Catch:{ all -> 0x00d9 }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ all -> 0x00d9 }
            goto L_0x003c
        L_0x0032:
            java.lang.Object r4 = new java.lang.Object     // Catch:{ all -> 0x00d9 }
            r4.<init>()     // Catch:{ all -> 0x00d9 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = f38032i     // Catch:{ all -> 0x00d9 }
            r5.put(r6, r4)     // Catch:{ all -> 0x00d9 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x00d9 }
            monitor-enter(r4)
            if (r2 != 0) goto L_0x0086
            java.lang.Class<com.facebook.soloader.SoLoader> r0 = com.facebook.soloader.SoLoader.class
            monitor-enter(r0)     // Catch:{ all -> 0x0084 }
            java.util.HashSet<java.lang.String> r5 = f38031h     // Catch:{ all -> 0x0081 }
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x0051
            if (r8 != 0) goto L_0x0050
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            monitor-exit(r4)     // Catch:{ all -> 0x0084 }
            return r1
        L_0x0050:
            r2 = 1
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x0086
            m29995a(r6, r9, r10)     // Catch:{ IOException -> 0x007a, UnsatisfiedLinkError -> 0x0064 }
            java.lang.Class<com.facebook.soloader.SoLoader> r9 = com.facebook.soloader.SoLoader.class
            monitor-enter(r9)     // Catch:{ all -> 0x0084 }
            java.util.HashSet<java.lang.String> r10 = f38031h     // Catch:{ all -> 0x0061 }
            r10.add(r6)     // Catch:{ all -> 0x0061 }
            monitor-exit(r9)     // Catch:{ all -> 0x0061 }
            goto L_0x0086
        L_0x0061:
            r6 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0061 }
            throw r6     // Catch:{ all -> 0x0084 }
        L_0x0064:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x0079
            java.lang.String r8 = "unexpected e_machine:"
            boolean r7 = r7.contains(r8)     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x0079
            com.facebook.soloader.SoLoader$a r7 = new com.facebook.soloader.SoLoader$a     // Catch:{ all -> 0x0084 }
            r7.<init>(r6)     // Catch:{ all -> 0x0084 }
            throw r7     // Catch:{ all -> 0x0084 }
        L_0x0079:
            throw r6     // Catch:{ all -> 0x0084 }
        L_0x007a:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ all -> 0x0084 }
            r7.<init>(r6)     // Catch:{ all -> 0x0084 }
            throw r7     // Catch:{ all -> 0x0084 }
        L_0x0081:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            throw r6     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r6 = move-exception
            goto L_0x00d7
        L_0x0086:
            boolean r6 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0084 }
            if (r6 != 0) goto L_0x0096
            java.util.Set<java.lang.String> r6 = f38033j     // Catch:{ all -> 0x0084 }
            boolean r6 = r6.contains(r7)     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x0096
            r6 = 1
            goto L_0x0097
        L_0x0096:
            r6 = 0
        L_0x0097:
            if (r8 == 0) goto L_0x00d2
            if (r6 != 0) goto L_0x00d2
            boolean r6 = f38024a     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x00b5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            java.lang.String r8 = "MergedSoMapping.invokeJniOnload["
            r6.<init>(r8)     // Catch:{ all -> 0x0084 }
            r6.append(r7)     // Catch:{ all -> 0x0084 }
            java.lang.String r8 = "]"
            r6.append(r8)     // Catch:{ all -> 0x0084 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0084 }
            com.facebook.soloader.Api18TraceUtils.m29990a(r6)     // Catch:{ all -> 0x0084 }
        L_0x00b5:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c9 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            java.lang.String r9 = "Unknown library: "
            r8.<init>(r9)     // Catch:{ all -> 0x00c9 }
            r8.append(r7)     // Catch:{ all -> 0x00c9 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x00c9 }
            r6.<init>(r7)     // Catch:{ all -> 0x00c9 }
            throw r6     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r6 = move-exception
            boolean r7 = f38024a     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x00d1
            com.facebook.soloader.Api18TraceUtils.m29989a()     // Catch:{ all -> 0x0084 }
        L_0x00d1:
            throw r6     // Catch:{ all -> 0x0084 }
        L_0x00d2:
            monitor-exit(r4)     // Catch:{ all -> 0x0084 }
            if (r2 != 0) goto L_0x00d6
            return r3
        L_0x00d6:
            return r1
        L_0x00d7:
            monitor-exit(r4)     // Catch:{ all -> 0x0084 }
            throw r6
        L_0x00d9:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d9 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.m29998a(java.lang.String, java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }
}
