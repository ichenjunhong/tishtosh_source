package com.p683ss.android.ugc.effectmanager.common.p2441h;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.l */
public final class C48676l {
    /* renamed from: a */
    public static boolean m105347a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo a = C48677m.m105348a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a == null || !a.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static <T> String m105345a(List<T> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (list == null || list.isEmpty()) {
            sb.append("]");
            return sb.toString();
        }
        for (Object next : list) {
            sb.append("\"");
            sb.append(next.toString());
            sb.append("\"");
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m105346a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (map.size() > 0) {
            sb.append("?");
            int i = 0;
            for (Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    if (i == 0) {
                        sb.append(str2);
                        sb.append("=");
                        sb.append(str3);
                    } else {
                        sb.append("&");
                        sb.append(str2);
                        sb.append("=");
                        sb.append(str3);
                    }
                }
                i++;
            }
        }
        return new String(sb);
    }
}
