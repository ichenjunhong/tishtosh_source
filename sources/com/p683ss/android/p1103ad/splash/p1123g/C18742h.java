package com.p683ss.android.p1103ad.splash.p1123g;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import com.taobao.android.dexposed.ClassUtils;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* renamed from: com.ss.android.ad.splash.g.h */
public final class C18742h {
    /* renamed from: a */
    public static String m45695a() {
        Context L = C18642g.m45184L();
        NetworkInfo a = C18743i.m45700a((ConnectivityManager) L.getSystemService("connectivity"));
        if (a != null && a.isConnected()) {
            if (a.getType() == 0) {
                try {
                    Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    if (networkInterfaces != null) {
                        while (networkInterfaces.hasMoreElements()) {
                            Enumeration inetAddresses = ((NetworkInterface) networkInterfaces.nextElement()).getInetAddresses();
                            if (inetAddresses != null) {
                                while (inetAddresses.hasMoreElements()) {
                                    InetAddress inetAddress = (InetAddress) inetAddresses.nextElement();
                                    if ((inetAddress instanceof Inet4Address) && !inetAddress.isLoopbackAddress()) {
                                        return inetAddress.getHostAddress();
                                    }
                                }
                                continue;
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            } else if (a.getType() == 1) {
                int ipAddress = ((WifiManager) L.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
                StringBuilder sb = new StringBuilder();
                sb.append(ipAddress & NormalGiftView.ALPHA_255);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append((ipAddress >> 8) & NormalGiftView.ALPHA_255);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append((ipAddress >> 16) & NormalGiftView.ALPHA_255);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append((ipAddress >> 24) & NormalGiftView.ALPHA_255);
                return sb.toString();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m45697b(Context context) {
        try {
            NetworkInfo a = C18743i.m45700a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a == null || !a.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m45696a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
            if (allNetworkInfo != null) {
                for (NetworkInfo networkInfo : allNetworkInfo) {
                    if (networkInfo.getState() == State.CONNECTED || networkInfo.getState() == State.CONNECTING) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static String m45699d(Context context) {
        int c = m45698c(context);
        String str = "";
        if (c == 4) {
            return "3g";
        }
        if (c == 8) {
            return "2g";
        }
        if (c == 16) {
            return "mobile";
        }
        switch (c) {
            case 1:
                return "wifi";
            case 2:
                return "4g";
            default:
                return str;
        }
    }

    /* renamed from: c */
    public static int m45698c(Context context) {
        try {
            NetworkInfo a = C18743i.m45700a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a != null) {
                if (a.isAvailable()) {
                    int type = a.getType();
                    if (1 == type) {
                        return 1;
                    }
                    if (type != 0) {
                        return 16;
                    }
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return 4;
                        case 13:
                            return 2;
                        default:
                            return 16;
                    }
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 16;
        }
    }
}
