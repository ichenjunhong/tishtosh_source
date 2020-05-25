package com.p683ss.caijing.globaliap.p2561e.p2562a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b;
import com.taobao.android.dexposed.ClassUtils;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* renamed from: com.ss.caijing.globaliap.e.a.a */
public final class C51273a {

    /* renamed from: a */
    public static final byte[] f128040a = {52, 102, 65, 75, 74, 90, 97, 69, 109, 53, 88, 56, 66, 85, 89, 84, 70, 109, 53, 74, 102, 82, 55, 53, 109, 67, 100, 121, 48, 74, 71, 103, 77, 122, 111, 85, 102, 118, 98, 70, 117, 72, 119, 61};

    /* renamed from: c */
    public static Point m110230c(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* renamed from: a */
    public static String m110228a(Context context) {
        ApplicationInfo applicationInfo;
        String str = "未知应用";
        if (context == null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            if (packageManager != null && !TextUtils.isEmpty(context.getPackageName())) {
                String packageName = context.getPackageName();
                if (TextUtils.equals(packageName, C11010c.m22280a().getPackageName())) {
                    if (C18970b.f52271a == null) {
                        C18970b.f52271a = packageManager.getApplicationInfo(packageName, 128);
                    }
                    applicationInfo = C18970b.f52271a;
                } else {
                    applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                }
                if (applicationInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                    if (applicationLabel != null && !TextUtils.isEmpty(applicationLabel.toString())) {
                        str = applicationLabel.toString();
                    }
                }
            }
        } catch (Exception e) {
            C17840a.m43754b(e);
        }
        return str;
    }

    /* renamed from: b */
    public static String m110229b(Context context) {
        if (context == null) {
            return "";
        }
        NetworkInfo a = C51274b.m110231a((ConnectivityManager) context.getSystemService("connectivity"));
        if (a != null && a.isConnected()) {
            if (a.getType() == 0) {
                try {
                    Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    while (networkInterfaces.hasMoreElements()) {
                        Enumeration inetAddresses = ((NetworkInterface) networkInterfaces.nextElement()).getInetAddresses();
                        while (true) {
                            if (inetAddresses.hasMoreElements()) {
                                InetAddress inetAddress = (InetAddress) inetAddresses.nextElement();
                                if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                                    return inetAddress.getHostAddress();
                                }
                            }
                        }
                    }
                } catch (SocketException e) {
                    C17840a.m43754b(e);
                }
            } else if (a.getType() == 1) {
                int ipAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getIpAddress();
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
        return "";
    }
}
