package com.bytedance.crash.nativecrash;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p540b.C9553a;
import com.bytedance.crash.p540b.C9557c;
import com.bytedance.crash.p540b.C9558d;
import com.bytedance.crash.p540b.C9559e;
import com.bytedance.crash.p555n.C9685a;
import java.io.File;

public class NativeImpl {

    /* renamed from: a */
    public static volatile boolean f26446a;

    /* renamed from: b */
    public static volatile boolean f26447b;

    private static native boolean doCheckNativeCrash();

    public static native void doCloseFile(int i);

    public static native int doCreateCallbackThread();

    private static native void doDump(String str);

    public static native void doDumpHprof(String str);

    private static native void doDumpLogcat(String str, String str2, String str3);

    public static native void doDumpMemInfo(String str);

    static native String doGetCrashHeader(String str);

    private static native String[] doGetFdDump(int i, int i2, int[] iArr, String[] strArr);

    private static native int doLock(String str, int i);

    private static native int doOpenFile(String str);

    static native void doRebuildTombstone(String str, String str2, String str3);

    public static native void doSetAlogConfigPath(String str);

    public static native void doSetAlogFlushAddr(long j);

    public static native void doSetAlogLogDirAddr(long j);

    private static native void doSetUploadEnd();

    private static native void doSignalMainThread();

    public static native int doStart(int i, String str, String str2, String str3, int i2);

    static native void doStartAnrMonitor(int i);

    private static native void doWriteFile(int i, String str, int i2);

    private static native boolean is64Bit();

    /* renamed from: c */
    public static void m19473c() {
        if (f26446a) {
            doSignalMainThread();
        }
    }

    /* renamed from: d */
    public static void m19475d() {
        if (f26446a) {
            doSetUploadEnd();
        }
    }

    /* renamed from: b */
    public static boolean m19472b() {
        if (!f26446a) {
            return false;
        }
        try {
            return is64Bit();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static void reportEventForAnrMonitor() {
        C9553a aVar;
        try {
            System.currentTimeMillis();
            C9558d.f26058a = true;
            C9557c.f26057a = null;
            aVar = C9559e.m18967a(C9616k.m19154f()).f26061a;
            File filesDir = aVar.f26036b.getFilesDir();
            StringBuilder sb = new StringBuilder("has_anr_signal_");
            sb.append(C9685a.m19318c(aVar.f26036b).replaceAll(":", "_"));
            new File(filesDir, sb.toString()).createNewFile();
        } catch (Throwable unused) {
            return;
        }
        aVar.f26041h = SystemClock.uptimeMillis();
        aVar.f26040g = true;
    }

    /* renamed from: a */
    public static boolean m19469a() {
        if (!f26446a) {
            return false;
        }
        try {
            return doCheckNativeCrash();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static void handleNativeCrash(String str) {
        NativeCrashCollector.onNativeCrash(str);
    }

    /* renamed from: a */
    public static int m19465a(int i) {
        if (!f26446a && i > 0) {
            return -1;
        }
        try {
            return doLock("", i);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static int m19471b(String str) {
        if (!f26446a) {
            return -1;
        }
        try {
            return doOpenFile(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static int m19466a(String str) {
        if (!f26446a && !TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return doLock(str, -1);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static void m19474c(String str) {
        if (f26446a) {
            doDump(str);
        }
    }

    /* renamed from: a */
    public static void m19467a(int i, String str) {
        if (f26446a && !TextUtils.isEmpty(str)) {
            try {
                doWriteFile(i, str, str.length());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m19468a(String str, String str2, String str3) {
        if (f26446a) {
            try {
                doDumpLogcat(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static String[] m19470a(int i, int[] iArr, String[] strArr) {
        int i2;
        if (!f26446a) {
            return null;
        }
        String[] strArr2 = new String[100];
        int[] iArr2 = new int[100];
        for (int i3 = 0; i3 < iArr.length; i3 += 100) {
            if (iArr.length - i3 > 100) {
                i2 = 100;
            } else {
                i2 = iArr.length - i3;
            }
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = iArr[i4 + i3];
            }
            doGetFdDump(i, i2, iArr2, strArr2);
            for (int i5 = 0; i5 < i2; i5++) {
                strArr[i5 + i3] = strArr2[i5];
            }
        }
        return strArr;
    }
}
