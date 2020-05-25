package com.bytedance.geckox.utils;

import android.os.Process;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileLock {

    /* renamed from: a */
    private static final Map<String, Integer> f27488a = new HashMap();

    /* renamed from: b */
    private final int f27489b;

    /* renamed from: c */
    private final String f27490c;

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i) throws Exception;

    private static native void nLockFileSegment(int i, int i2) throws Exception;

    private static native void nRelease(int i) throws Exception;

    private static native boolean nTryLock(int i) throws Exception;

    private static native void nUnlockFile(int i) throws Exception;

    static {
        C10159g.m20484a("file_lock");
    }

    /* renamed from: a */
    public final void mo18151a() {
        try {
            nUnlockFile(this.f27489b);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("释放锁失败，path:");
            sb.append(this.f27490c);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: b */
    public final void mo18152b() {
        Integer num;
        synchronized (f27488a) {
            num = (Integer) f27488a.remove(this.f27490c);
        }
        try {
            nRelease(num.intValue());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("release lock failed, file:");
            sb.append(this.f27490c);
            sb.append(" caused by:");
            sb.append(e.getMessage());
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public static FileLock m20466a(String str) {
        try {
            int d = m20470d(str);
            nLockFile(d);
            return new FileLock(str, d);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("lock failed, file:");
            sb.append(str);
            sb.append(", pid:");
            sb.append(Process.myPid());
            sb.append(" caused by:");
            sb.append(e.getMessage());
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: b */
    public static FileLock m20468b(String str) {
        try {
            int d = m20470d(str);
            if (!nTryLock(d)) {
                return null;
            }
            return new FileLock(str, d);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("try lock failed, file:");
            sb.append(str);
            sb.append(" caused by:");
            sb.append(e.getMessage());
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: c */
    public static FileLock m20469c(String str) throws Exception {
        try {
            int d = m20470d(str);
            if (nTryLock(d)) {
                return new FileLock(str, d);
            }
            new FileLock(str, d).mo18152b();
            return null;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("try lock failed, file:");
            sb.append(str);
            sb.append(" caused by:");
            sb.append(e.getMessage());
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: d */
    private static int m20470d(String str) throws Exception {
        Integer num;
        synchronized (f27488a) {
            num = (Integer) f27488a.get(str);
            if (num == null) {
                new File(str).getParentFile().mkdirs();
                num = Integer.valueOf(nGetFD(str));
                f27488a.put(str, num);
            }
        }
        return num.intValue();
    }

    private FileLock(String str, int i) {
        this.f27490c = str;
        this.f27489b = i;
    }

    /* renamed from: a */
    public static FileLock m20467a(String str, int i) {
        try {
            int d = m20470d(str);
            nLockFileSegment(d, i);
            return new FileLock(str, d);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("lock segment failed, file:");
            sb.append(str);
            sb.append(" caused by:");
            sb.append(e.getMessage());
            throw new RuntimeException(sb.toString());
        }
    }
}
