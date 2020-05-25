package com.bytedance.common.utility;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.settings2.ShowStorageDotSizeSettings;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.utility.p */
public final class C9431p {
    /* renamed from: a */
    public static boolean m18664a(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static String m18667c(String str) {
        if (!m18664a(str)) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m18662a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                String str2 = (String) map.get(str);
                if (!m18664a(str) && !m18664a(str2)) {
                    jSONObject.put(str, str2);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m18666b(String str) {
        if (m18664a(str)) {
            return str;
        }
        try {
            String replace = str.replace("[ss_random]", String.valueOf(new Random().nextLong()));
            try {
                return replace.replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return replace;
            }
        } catch (Exception unused2) {
            return str;
        }
    }

    /* renamed from: d */
    public static String m18668d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ 5);
            }
            return C9395d.m18573a(bytes, 0, bytes.length);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static String m18661a(long j) {
        double d;
        long[] jArr = {1099511627776L, ShowStorageDotSizeSettings.DEFAULT, 1048576, 1024, 1};
        int i = 0;
        String[] strArr = {"TB", "GB", "MB", "KB", "B"};
        if (j < 1) {
            StringBuilder sb = new StringBuilder("0 ");
            sb.append(strArr[4]);
            return sb.toString();
        }
        String str = null;
        while (true) {
            if (i >= 5) {
                break;
            }
            long j2 = jArr[i];
            if (j >= j2) {
                String str2 = strArr[i];
                if (j2 > 1) {
                    double d2 = (double) j;
                    double d3 = (double) j2;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    d = d2 / d3;
                } else {
                    d = (double) j;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(new DecimalFormat("#.##").format(d));
                sb2.append(" ");
                sb2.append(str2);
                str = sb2.toString();
            } else {
                i++;
            }
        }
        return str;
    }

    /* renamed from: a */
    public static boolean m18665a(String str, String str2) {
        if ((!m18664a(str) || !m18664a(str2)) && (str == null || !str.equals(str2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Map<String, String> m18663a(String str, Map<String, String> map) {
        if (m18664a(str) || map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                String string = jSONObject.getString(str2);
                if (!m18664a(str2) && !m18664a(string)) {
                    map.put(str2, string);
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }
}
