package com.toutiao.proxyserver.p2614f;

/* renamed from: com.toutiao.proxyserver.f.b */
public final class C51836b {
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m111163a(android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r4.getSystemService(r1)     // Catch:{  }
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch:{  }
            android.net.NetworkInfo r1 = com.toutiao.proxyserver.p2614f.C51837c.m111164a(r1)     // Catch:{  }
            if (r1 == 0) goto L_0x009f
            boolean r2 = r1.isConnected()     // Catch:{  }
            if (r2 == 0) goto L_0x009f
            int r2 = r1.getType()     // Catch:{  }
            if (r2 != 0) goto L_0x0051
            java.util.Enumeration r4 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Error -> 0x009f }
            if (r4 == 0) goto L_0x009f
        L_0x0024:
            boolean r1 = r4.hasMoreElements()     // Catch:{ Error -> 0x009f }
            if (r1 == 0) goto L_0x009f
            java.lang.Object r1 = r4.nextElement()     // Catch:{ Error -> 0x009f }
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch:{ Error -> 0x009f }
            java.util.Enumeration r1 = r1.getInetAddresses()     // Catch:{ Error -> 0x009f }
            if (r1 == 0) goto L_0x0024
        L_0x0036:
            boolean r2 = r1.hasMoreElements()     // Catch:{ Error -> 0x009f }
            if (r2 == 0) goto L_0x0024
            java.lang.Object r2 = r1.nextElement()     // Catch:{ Error -> 0x009f }
            java.net.InetAddress r2 = (java.net.InetAddress) r2     // Catch:{ Error -> 0x009f }
            boolean r3 = r2 instanceof java.net.Inet4Address     // Catch:{ Error -> 0x009f }
            if (r3 == 0) goto L_0x0036
            boolean r3 = r2.isLoopbackAddress()     // Catch:{ Error -> 0x009f }
            if (r3 != 0) goto L_0x0036
            java.lang.String r4 = r2.getHostAddress()     // Catch:{ Error -> 0x009f }
            return r4
        L_0x0051:
            int r1 = r1.getType()     // Catch:{  }
            r2 = 1
            if (r1 != r2) goto L_0x009f
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ Error -> 0x009f }
            java.lang.String r1 = "wifi"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch:{ Error -> 0x009f }
            android.net.wifi.WifiManager r4 = (android.net.wifi.WifiManager) r4     // Catch:{ Error -> 0x009f }
            android.net.wifi.WifiInfo r4 = r4.getConnectionInfo()     // Catch:{ Error -> 0x009f }
            int r4 = r4.getIpAddress()     // Catch:{ Error -> 0x009f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Error -> 0x009f }
            r1.<init>()     // Catch:{ Error -> 0x009f }
            r2 = r4 & 255(0xff, float:3.57E-43)
            r1.append(r2)     // Catch:{ Error -> 0x009f }
            java.lang.String r2 = "."
            r1.append(r2)     // Catch:{ Error -> 0x009f }
            int r2 = r4 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.append(r2)     // Catch:{ Error -> 0x009f }
            java.lang.String r2 = "."
            r1.append(r2)     // Catch:{ Error -> 0x009f }
            int r2 = r4 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.append(r2)     // Catch:{ Error -> 0x009f }
            java.lang.String r2 = "."
            r1.append(r2)     // Catch:{ Error -> 0x009f }
            int r4 = r4 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            r1.append(r4)     // Catch:{ Error -> 0x009f }
            java.lang.String r4 = r1.toString()     // Catch:{ Error -> 0x009f }
            return r4
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.p2614f.C51836b.m111163a(android.content.Context):java.lang.String");
    }
}
