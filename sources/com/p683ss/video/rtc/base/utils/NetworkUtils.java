package com.p683ss.video.rtc.base.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.ss.video.rtc.base.utils.NetworkUtils */
public class NetworkUtils {
    private static BroadcastReceiver sBroadcastReceiver;
    private static NetworkTypeInterceptor sNetworkTypeInterceptor;

    /* renamed from: com.ss.video.rtc.base.utils.NetworkUtils$CompressType */
    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        private CompressType(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: com.ss.video.rtc.base.utils.NetworkUtils$NetworkType */
    public enum NetworkType {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        public final boolean isAvailable() {
            if (this != NONE) {
                return true;
            }
            return false;
        }

        private NetworkType(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: com.ss.video.rtc.base.utils.NetworkUtils$NetworkTypeInterceptor */
    public interface NetworkTypeInterceptor {
        NetworkType getNetworkType();
    }

    /* renamed from: com.ss.video.rtc.base.utils.NetworkUtils$_lancet */
    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo */
        static NetworkInfo m110863xea89a0b0(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                return C18978d.m46154a();
            }
        }
    }

    public static void setNetworkTypeInterceptor(NetworkTypeInterceptor networkTypeInterceptor) {
        sNetworkTypeInterceptor = networkTypeInterceptor;
    }

    public static boolean isIpv4(String str) {
        return Pattern.matches("^(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])$", str);
    }

    public static boolean isIpv6(String str) {
        return Pattern.matches("^\\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?\\s*$", str);
    }

    public static String getNetworkAccessType(Context context) {
        return getNetworkAccessType(getNetworkType(context));
    }

    public static void unregisterReceiver(Context context) {
        if (sBroadcastReceiver != null && context != null) {
            context.unregisterReceiver(sBroadcastReceiver);
            sBroadcastReceiver = null;
        }
    }

    public static boolean is2G(Context context) {
        NetworkType networkType = getNetworkType(context);
        if (networkType == NetworkType.MOBILE || networkType == NetworkType.MOBILE_2G) {
            return true;
        }
        return false;
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo = _lancet.m110863xea89a0b0((ConnectivityManager) context.getSystemService("connectivity"));
            if (com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo == null || !com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getNetworkAccessType(NetworkType networkType) {
        String str = "";
        try {
            switch (networkType) {
                case WIFI:
                    return "wifi";
                case MOBILE_2G:
                    return "2g";
                case MOBILE_3G:
                    return "3g";
                case MOBILE_4G:
                    return "4g";
                case MOBILE:
                    str = "mobile";
                    break;
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static boolean isWifi(Context context) {
        try {
            NetworkInfo com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo = _lancet.m110863xea89a0b0((ConnectivityManager) context.getSystemService("connectivity"));
            if (com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo != null) {
                if (com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo.isAvailable()) {
                    if (sNetworkTypeInterceptor == null || sNetworkTypeInterceptor.getNetworkType() == NetworkType.NONE) {
                        if (1 == com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo.getType()) {
                            return true;
                        }
                        return false;
                    } else if (sNetworkTypeInterceptor.getNetworkType() == NetworkType.WIFI) {
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

    public static void registerReceiver(Context context) {
        if (sBroadcastReceiver == null && context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            sBroadcastReceiver = new NetworkConnectChangeReceiver();
            context.getApplicationContext().registerReceiver(sBroadcastReceiver, intentFilter);
        }
    }

    public static NetworkType getNetworkType(Context context) {
        if (sNetworkTypeInterceptor != null && sNetworkTypeInterceptor.getNetworkType() != NetworkType.NONE) {
            return sNetworkTypeInterceptor.getNetworkType();
        }
        try {
            NetworkInfo com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo = _lancet.m110863xea89a0b0((ConnectivityManager) context.getSystemService("connectivity"));
            if (com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo != null) {
                if (com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo.isAvailable()) {
                    int type = com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo.getType();
                    if (1 == type) {
                        return NetworkType.WIFI;
                    }
                    if (type != 0) {
                        return NetworkType.MOBILE;
                    }
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            return NetworkType.MOBILE_2G;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            return NetworkType.MOBILE_3G;
                        case 13:
                        case 18:
                            return NetworkType.MOBILE_4G;
                        default:
                            return NetworkType.MOBILE;
                    }
                }
            }
            return NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkType.UNKNOWN;
        }
    }

    private static String encode(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String format(List<Pair<String, String>> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Pair pair : list) {
            String encode = encode((String) pair.first, str);
            String str3 = (String) pair.second;
            if (str3 != null) {
                str2 = encode(str3, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(encode);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
