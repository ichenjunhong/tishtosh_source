package com.p683ss.sys.p2584ck.p2585a;

import android.app.Application;
import android.content.Context;
import java.net.Inet4Address;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* renamed from: com.ss.sys.ck.a.i */
public final class C51437i {

    /* renamed from: a */
    private static Application f128618a;

    /* renamed from: a */
    public static String m110617a() {
        try {
            Context applicationContext = m110619c().getApplicationContext();
            int i = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionCode;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m110618b() {
        String str = "";
        String str2 = "";
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = (NetworkInterface) networkInterfaces.nextElement();
                if ("wlan0".equals(networkInterface.getName())) {
                    for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses()) {
                        if (interfaceAddress.getAddress() instanceof Inet4Address) {
                            str = ((Inet4Address) interfaceAddress.getAddress()).getHostAddress();
                        }
                    }
                }
                if ("rmnet0".equals(networkInterface.getName())) {
                    for (InterfaceAddress interfaceAddress2 : networkInterface.getInterfaceAddresses()) {
                        if (interfaceAddress2.getAddress() instanceof Inet4Address) {
                            str2 = ((Inet4Address) interfaceAddress2.getAddress()).getHostAddress();
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return !str.equals("") ? str : str2;
    }

    /* renamed from: c */
    private static Application m110619c() {
        if (f128618a != null) {
            return f128618a;
        }
        try {
            Application application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            f128618a = application;
            return application;
        } catch (Throwable unused) {
            return null;
        }
    }
}
