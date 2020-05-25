package com.p683ss.android.ugc.aweme.update;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Enumeration;

/* renamed from: com.ss.android.ugc.aweme.update.e */
public final class C47516e {
    /* renamed from: a */
    static String m102944a() {
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration inetAddresses = ((NetworkInterface) networkInterfaces.nextElement()).getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddress = (InetAddress) inetAddresses.nextElement();
                        if (!inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress()) {
                            return inetAddress.getHostAddress();
                        }
                    }
                }
            }
            return null;
        } catch (SocketException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m102945a(String str) {
        try {
            return InetAddress.getByName(new URL(str).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
            return "";
        }
    }
}
