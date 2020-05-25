package com.p683ss.ttvideoengine.net;

import android.os.SystemClock;
import com.p683ss.ttvideoengine.utils.EngineThreadPool;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: com.ss.ttvideoengine.net.DNSServerIP */
public class DNSServerIP {
    public static volatile String mServerIP;
    public static volatile long mServerIPTime;

    public static String getDNSServerIP() {
        updateDNSServerIP();
        return mServerIP;
    }

    public static void updateDNSServerIP() {
        if (SystemClock.elapsedRealtime() - mServerIPTime >= 300000) {
            EngineThreadPool.addExecuteTask(new Runnable() {
                public final void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            DNSServerIP.mServerIP = byName.getHostAddress();
                            DNSServerIP.mServerIPTime = SystemClock.elapsedRealtime();
                            StringBuilder sb = new StringBuilder("update dns server ip:");
                            sb.append(DNSServerIP.mServerIP);
                            TTVideoEngineLog.m110647i("DNSServerIP", sb.toString());
                        }
                    } catch (UnknownHostException unused) {
                    }
                }
            });
        }
    }
}
