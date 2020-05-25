package com.bytedance.crash.p555n;

import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.bytedance.crash.n.h */
public final class C9696h {

    /* renamed from: a */
    static final Set<String> f26422a;

    static {
        HashSet hashSet = new HashSet();
        f26422a = hashSet;
        hashSet.add("HeapTaskDaemon");
        f26422a.add("ThreadPlus");
        f26422a.add("ApiDispatcher");
        f26422a.add("ApiLocalDispatcher");
        f26422a.add("AsyncLoader");
        f26422a.add("AsyncTask");
        f26422a.add("Binder");
        f26422a.add("PackageProcessor");
        f26422a.add("SettingsObserver");
        f26422a.add("WifiManager");
        f26422a.add("JavaBridge");
        f26422a.add("Compiler");
        f26422a.add("Signal Catcher");
        f26422a.add("GC");
        f26422a.add("ReferenceQueueDaemon");
        f26422a.add("FinalizerDaemon");
        f26422a.add("FinalizerWatchdogDaemon");
        f26422a.add("CookieSyncManager");
        f26422a.add("RefQueueWorker");
        f26422a.add("CleanupReference");
        f26422a.add("VideoManager");
        f26422a.add("DBHelper-AsyncOp");
        f26422a.add("InstalledAppTracker2");
        f26422a.add("AppData-AsyncOp");
        f26422a.add("IdleConnectionMonitor");
        f26422a.add("LogReaper");
        f26422a.add("ActionReaper");
        f26422a.add("Okio Watchdog");
        f26422a.add("CheckWaitingQueue");
        f26422a.add("NPTH-CrashTimer");
        f26422a.add("NPTH-JavaCallback");
        f26422a.add("NPTH-LocalParser");
        f26422a.add("ANR_FILE_MODIFY");
    }

    /* renamed from: a */
    public static boolean m19369a(Throwable th) {
        if (th != null && !(th instanceof ConnectTimeoutException) && !(th instanceof SocketTimeoutException) && !(th instanceof BindException) && !(th instanceof ConnectException) && !(th instanceof NoRouteToHostException) && !(th instanceof PortUnreachableException) && !(th instanceof SocketException) && !(th instanceof UnknownHostException) && !(th instanceof ProtocolException) && !(th instanceof SSLException)) {
            return false;
        }
        return true;
    }
}
