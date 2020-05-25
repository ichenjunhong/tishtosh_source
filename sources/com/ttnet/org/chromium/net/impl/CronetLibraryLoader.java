package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.C2240a;
import com.bytedance.android.p161c.C2835a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a;
import com.p683ss.android.ugc.aweme.p2391v.C47964c;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.net.NetworkChangeNotifier;
import java.io.File;

@JNINamespace("cronet")
public class CronetLibraryLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = CronetLibraryLoader.class.getSimpleName();
    private static final HandlerThread sInitThread = new HandlerThread("CronetInit");
    private static volatile boolean sInitThreadInitDone;
    private static volatile boolean sLibraryLoaded = false;
    private static final Object sLoadLock = new Object();
    private static final ConditionVariable sWaitForLibLoad = new ConditionVariable();

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.load(str);
            C18973a.m46141a(uptimeMillis, str);
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

    private static native void nativeCronetInitOnInitThread();

    private static native String nativeGetCronetVersion();

    private static String getDefaultUserAgent() {
        return UserAgent.from(ContextUtils.getApplicationContext());
    }

    private static boolean onInitThread() {
        if (sInitThread.getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    private static void ensureInitializedFromNative() {
        synchronized (sLoadLock) {
            sLibraryLoaded = true;
            sWaitForLibLoad.open();
        }
        ensureInitialized(ContextUtils.getApplicationContext(), null);
    }

    static void ensureInitializedOnInitThread() {
        if (!sInitThreadInitDone) {
            NetworkChangeNotifier.init();
            NetworkChangeNotifier.registerToReceiveNotificationsAlways();
            sWaitForLibLoad.block();
            nativeCronetInitOnInitThread();
            sInitThreadInitDone = true;
        }
    }

    private static void setNetworkThreadPriorityOnNetworkThread(int i) {
        Process.setThreadPriority(i);
    }

    public static void postToInitThread(Runnable runnable) {
        if (onInitThread()) {
            runnable.run();
        } else {
            new Handler(sInitThread.getLooper()).post(runnable);
        }
    }

    private static void loadCronetLibrary(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        String cronetSoPath = cronetEngineBuilderImpl.getCronetSoPath();
        if (!TextUtils.isEmpty(cronetSoPath)) {
            File file = new File(cronetSoPath);
            if (file.exists() && !file.isDirectory()) {
                Log.m111335i(TAG, "cronet so load: %s", cronetSoPath);
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(cronetSoPath);
                return;
            }
        }
        if (cronetEngineBuilderImpl.libraryLoader() != null) {
            cronetEngineBuilderImpl.libraryLoader().loadLibrary("sscronet");
        } else {
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("sscronet");
        }
    }

    public static void ensureInitialized(Context context, CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        synchronized (sLoadLock) {
            if (!sInitThreadInitDone) {
                ContextUtils.initApplicationContext(context);
                if (!sInitThread.isAlive()) {
                    sInitThread.start();
                }
                postToInitThread(new Runnable() {
                    public void run() {
                        CronetLibraryLoader.ensureInitializedOnInitThread();
                    }
                });
            }
            if (!sLibraryLoaded) {
                loadCronetLibrary(cronetEngineBuilderImpl);
                String cronetVersion = ImplVersion.getCronetVersion();
                if (cronetVersion.equals(nativeGetCronetVersion())) {
                    Log.m111335i(TAG, "Cronet version: %s, arch: %s", cronetVersion, System.getProperty("os.arch"));
                    sLibraryLoaded = true;
                    sWaitForLibLoad.open();
                } else {
                    throw new RuntimeException(C2240a.m6772a("Expected Cronet version number %s, actual version number %s.", new Object[]{cronetVersion, nativeGetCronetVersion()}));
                }
            }
        }
    }
}
