package com.p683ss.ttvideoengine;

import android.os.SystemClock;
import com.bytedance.android.p161c.C2835a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a;
import com.p683ss.android.ugc.aweme.p2391v.C47964c;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.File;

/* renamed from: com.ss.ttvideoengine.JniUtils */
public class JniUtils {
    public static volatile String exception = "";
    public static volatile boolean isLibraryLoaded;
    public static volatile LibraryLoaderProxy mProxy;

    /* renamed from: com.ss.ttvideoengine.JniUtils$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                if (C18973a.m46144a(str)) {
                    C2835a.m8098a(C11010c.m22280a(), String.valueOf(C11010c.m22286g()));
                    StringBuilder sb = new StringBuilder();
                    C47964c.m103778e();
                    sb.append(C47964c.m103775a());
                    sb.append("/lib");
                    sb.append(str);
                    sb.append(".so");
                    String sb2 = sb.toString();
                    if (new File(sb2).exists()) {
                        C18973a.m46142a(str, 2);
                        System.load(sb2);
                        C18973a.m46141a(uptimeMillis, str);
                        return;
                    }
                    C18973a.m46142a(str, 3);
                }
            } catch (Throwable unused) {
            }
            C11511a.m23578a(str);
            C18973a.m46141a(uptimeMillis, str);
        }
    }

    public static native String getDecodedStr(byte[] bArr, byte[] bArr2);

    public static native String getEncryptionKey(byte[] bArr);

    public static native int getSupportedMethod();

    public static synchronized void loadLibrary() {
        synchronized (JniUtils.class) {
            try {
                if (!isLibraryLoaded) {
                    if (mProxy != null) {
                        mProxy.loadLibrary("videodec");
                    } else {
                        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("videodec");
                    }
                    isLibraryLoaded = true;
                }
            } catch (Throwable th) {
                TTVideoEngineLog.m110645d(th);
                exception = th.toString();
            }
        }
    }

    public static int getDecodeMethod() throws Exception {
        String str;
        String str2;
        if (!isLibraryLoaded) {
            StringBuilder sb = new StringBuilder("library not load suc exception:");
            if (exception == null) {
                str2 = "exception is null";
            } else {
                str2 = exception;
            }
            sb.append(str2);
            throw new Exception(sb.toString());
        }
        try {
            return getSupportedMethod();
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("getDecodedStr exception:");
            if (th.toString() == null) {
                str = "exception is null";
            } else {
                str = th.toString();
            }
            sb2.append(str);
            throw new Exception(sb2.toString());
        }
    }

    public static void setLoadProxy(LibraryLoaderProxy libraryLoaderProxy) {
        if (libraryLoaderProxy != null) {
            mProxy = libraryLoaderProxy;
        }
    }

    public static String getEncryptionKeyWithCheck(byte[] bArr) throws Exception {
        String str;
        String str2;
        if (!isLibraryLoaded) {
            StringBuilder sb = new StringBuilder("library not load suc exception:");
            if (exception == null) {
                str2 = "exception is null";
            } else {
                str2 = exception;
            }
            sb.append(str2);
            throw new Exception(sb.toString());
        }
        try {
            return getEncryptionKey(bArr);
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("getEncryptionKey exception:");
            if (th.toString() == null) {
                str = "exception is null";
            } else {
                str = th.toString();
            }
            sb2.append(str);
            throw new Exception(sb2.toString());
        }
    }

    public static String getDecodedStrWithKey(byte[] bArr, byte[] bArr2) throws Exception {
        String str;
        String str2;
        if (!isLibraryLoaded) {
            StringBuilder sb = new StringBuilder("library not load suc exception:");
            if (exception == null) {
                str2 = "exception is null";
            } else {
                str2 = exception;
            }
            sb.append(str2);
            throw new Exception(sb.toString());
        }
        try {
            return getDecodedStr(bArr, bArr2);
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("getDecodedStr exception:");
            if (th.toString() == null) {
                str = "exception is null";
            } else {
                str = th.toString();
            }
            sb2.append(str);
            throw new Exception(sb2.toString());
        }
    }
}
