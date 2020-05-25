package com.p683ss.ttuploader;

import android.os.SystemClock;
import com.bytedance.android.p161c.C2835a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p556d.p557a.C9729a;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a;
import com.p683ss.android.ugc.aweme.p2391v.C47964c;
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.TTUploadUtil */
public class TTUploadUtil {
    private static volatile boolean mIsLibraryLoaded;
    private static final ReentrantLock mLock = new ReentrantLock();
    private static volatile TTLibraryLoaderProxy mProxy;
    public static volatile String mServerIP;
    public static volatile long mServerIPTime;

    /* renamed from: com.ss.ttuploader.TTUploadUtil$_lancet */
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

    public static String getDNSServerIP() {
        updateDNSServerIP();
        return mServerIP;
    }

    public static synchronized boolean initInternal() {
        boolean z;
        synchronized (TTUploadUtil.class) {
            if (!loadLibrary()) {
                return false;
            }
            if (mProxy != null) {
                z = true;
            } else {
                z = false;
            }
            if (systemLoadInit(z) != 1) {
                return false;
            }
            return true;
        }
    }

    private static boolean loadLibrary() {
        boolean z;
        boolean z2 = true;
        if (mProxy == null) {
            return true;
        }
        if (mProxy != null && !mIsLibraryLoaded) {
            boolean a = C9729a.m19499a();
            boolean loadLibrary = mProxy.loadLibrary("ttopenssl");
            if (a || loadLibrary) {
                z = true;
            } else {
                z = false;
            }
            boolean loadLibrary2 = mProxy.loadLibrary("ttvideouploader");
            if (!z || !loadLibrary2) {
                z2 = false;
            }
            mIsLibraryLoaded = z2;
        }
        return mIsLibraryLoaded;
    }

    public static synchronized void updateDNSServerIP() {
        synchronized (TTUploadUtil.class) {
            if (SystemClock.elapsedRealtime() - mServerIPTime >= 300000) {
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                            if (byName != null) {
                                TTUploadUtil.mServerIP = byName.getHostAddress();
                                TTUploadUtil.mServerIPTime = SystemClock.elapsedRealtime();
                            }
                        } catch (UnknownHostException unused) {
                        }
                    }
                }).start();
            }
        }
    }

    public static Map<String, String> jsonToHashMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String valueOf = String.valueOf(keys.next());
            hashMap.put(valueOf, jSONObject.optString(valueOf));
        }
        return hashMap;
    }

    public static void setLoadProxy(TTLibraryLoaderProxy tTLibraryLoaderProxy) {
        mLock.lock();
        if (tTLibraryLoaderProxy != null) {
            try {
                mProxy = tTLibraryLoaderProxy;
            } catch (Throwable th) {
                mLock.unlock();
                throw th;
            }
        }
        mLock.unlock();
    }

    public static JSONObject mapToJSON(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!C9431p.m18664a(str)) {
                    jSONObject.put(str, obj);
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String mapToString(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!C9431p.m18664a(str)) {
                    jSONObject.put(str, obj);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private static int systemLoadInit(boolean z) {
        if (mIsLibraryLoaded) {
            return 1;
        }
        mIsLibraryLoaded = z;
        if (!z) {
            C9729a.m19499a();
            try {
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("ttopenssl");
            } catch (Throwable unused) {
            }
            try {
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("ttvideouploader");
                mIsLibraryLoaded = true;
            } catch (Throwable unused2) {
            }
        }
        if (!mIsLibraryLoaded) {
            return -1;
        }
        return 1;
    }
}
