package com.bytedance.common.utility;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.common.utility.l */
public final class C9425l {

    /* renamed from: a */
    public static C9427b f25671a;

    /* renamed from: b */
    static C9426a f25672b = C9426a.UNKNOWN;

    /* renamed from: com.bytedance.common.utility.l$a */
    public enum C9426a {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);
        

        /* renamed from: a */
        final int f25674a;

        public final int getValue() {
            return this.f25674a;
        }

        public final boolean isWifi() {
            if (this == WIFI) {
                return true;
            }
            return false;
        }

        public final boolean is2G() {
            if (this == MOBILE || this == MOBILE_2G) {
                return true;
            }
            return false;
        }

        public final boolean isAvailable() {
            if (this == UNKNOWN || this == NONE) {
                return false;
            }
            return true;
        }

        private C9426a(int i) {
            this.f25674a = i;
        }
    }

    /* renamed from: com.bytedance.common.utility.l$b */
    public interface C9427b {
        /* renamed from: a */
        C9426a mo17067a();
    }

    /* renamed from: e */
    public static String m18654e(Context context) {
        return m18646a(m18652c(context));
    }

    /* renamed from: a */
    public static boolean m18649a(Context context) {
        C9426a c = m18652c(context);
        if (c == C9426a.MOBILE || c == C9426a.MOBILE_2G) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m18651b(Context context) {
        try {
            NetworkInfo a = C9428m.m18656a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a != null) {
                if (a.isAvailable()) {
                    if (f25671a == null || f25671a.mo17067a() == C9426a.NONE) {
                        if (1 == a.getType()) {
                            return true;
                        }
                        return false;
                    } else if (f25671a.mo17067a() == C9426a.WIFI) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m18646a(C9426a aVar) {
        String str = "";
        if (aVar == C9426a.WIFI) {
            return "wifi";
        }
        if (aVar == C9426a.WIFI_24GHZ) {
            return "wifi24ghz";
        }
        if (aVar == C9426a.WIFI_5GHZ) {
            return "wifi5ghz";
        }
        if (aVar == C9426a.MOBILE_2G) {
            return "2g";
        }
        if (aVar == C9426a.MOBILE_3G) {
            return "3g";
        }
        if (aVar == C9426a.MOBILE_3G_H) {
            return "3gh";
        }
        if (aVar == C9426a.MOBILE_3G_HP) {
            return "3ghp";
        }
        if (aVar == C9426a.MOBILE_4G) {
            return "4g";
        }
        if (aVar == C9426a.MOBILE_5G) {
            return "5g";
        }
        if (aVar == C9426a.MOBILE) {
            return "mobile";
        }
        return str;
    }

    /* renamed from: c */
    public static C9426a m18652c(Context context) {
        try {
            NetworkInfo a = C9428m.m18656a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a != null) {
                if (a.isAvailable()) {
                    int type = a.getType();
                    if (1 == type) {
                        return C9426a.WIFI;
                    }
                    if (type != 0) {
                        return C9426a.MOBILE;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    switch (telephonyManager.getNetworkType()) {
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return C9426a.MOBILE_3G;
                        case 13:
                            if (VERSION.SDK_INT < 28 || !m18650a(telephonyManager)) {
                                return C9426a.MOBILE_4G;
                            }
                            return C9426a.MOBILE_5G;
                        case 20:
                            return C9426a.MOBILE_5G;
                        default:
                            return C9426a.MOBILE;
                    }
                }
            }
            return C9426a.NONE;
        } catch (Throwable unused) {
            return C9426a.MOBILE;
        }
    }

    /* renamed from: d */
    public static String m18653d(Context context) {
        int i;
        try {
            NetworkInfo a = C9428m.m18656a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a != null) {
                if (a.isAvailable()) {
                    int type = a.getType();
                    boolean z = true;
                    if (1 == type) {
                        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                        if (VERSION.SDK_INT >= 21) {
                            i = connectionInfo.getFrequency();
                        } else {
                            String ssid = connectionInfo.getSSID();
                            if (ssid != null && ssid.length() > 2) {
                                String substring = ssid.substring(1, ssid.length() - 1);
                                List scanResults = wifiManager.getScanResults();
                                if (scanResults != null && !scanResults.isEmpty()) {
                                    Iterator it = scanResults.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        ScanResult scanResult = (ScanResult) it.next();
                                        if (scanResult.SSID.equals(substring)) {
                                            i = scanResult.frequency;
                                            break;
                                        }
                                    }
                                }
                            }
                            i = 0;
                        }
                        if (i <= 4900 || i >= 5900) {
                            z = false;
                        }
                        if (z) {
                            return "wifi5g";
                        }
                        return "wifi";
                    } else if (type != 0) {
                        return "unknown";
                    } else {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        switch (telephonyManager.getNetworkType()) {
                            case 2:
                                return "edge";
                            case 3:
                                return "umts";
                            case 4:
                                return "cdma";
                            case 5:
                                return "evdo_0";
                            case 6:
                                return "evdo_a";
                            case 8:
                                return "hsdpa";
                            case 9:
                                return "hsupa";
                            case 10:
                                return "hspa";
                            case 12:
                                return "evdo_b";
                            case 13:
                                return "lte";
                            case 14:
                                return "ehrpd";
                            case 15:
                                return "hspap";
                            case 20:
                                return "nr";
                            default:
                                return String.valueOf(telephonyManager.getNetworkType());
                        }
                        return "unknown";
                    }
                }
            }
            return "none";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: a */
    private static boolean m18650a(TelephonyManager telephonyManager) {
        try {
            Object invoke = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getServiceState", new Class[0]).invoke(telephonyManager, new Object[0]);
            Method[] declaredMethods = Class.forName(invoke.getClass().getName()).getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (i < length) {
                Method method = declaredMethods[i];
                if (!method.getName().equals("getNrStatus")) {
                    if (!method.getName().equals("getNrState")) {
                        i++;
                    }
                }
                method.setAccessible(true);
                if (((Integer) method.invoke(invoke, new Object[0])).intValue() == 3) {
                    return true;
                }
                return false;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    private static String m18647a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m18648a(List<Pair<String, String>> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Pair pair : list) {
            String a = m18647a((String) pair.first, str);
            String str3 = (String) pair.second;
            if (str3 != null) {
                str2 = m18647a(str3, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
