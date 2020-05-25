package com.p683ss.android.ugc.aweme.flow.manager.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.p683ss.android.common.applog.AppLog;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.ss.android.ugc.aweme.flow.manager.impl.c */
public final class C31739c {

    /* renamed from: a */
    private static C31738b f82901a = new C31738b();

    /* renamed from: b */
    private static String f82902b = "MIIBSgIBADCCASsGByqGSM44BAEwggEeAoGBAP1KfX3E3GfvdRXFQY6axz8ET49su6XAmMxQnE6y\nOcy5ISHrtk3LY4TDrP69/YZVXr5n7TPqVvwimh3+Ps2T1O6Vyum2lzzTGsS+oJjDmt9bleQSIMc9\nYX58x5P/7yMEXUYW+9CiiudAe2Kf1xX9+172VYqyRJnV/Rs4poWnqcNDAhUA5OkDUsOYJPi1T9e9\nleOCeB0mlj8CgYB+4ZY6ZHOCVC+rNaW/JrYoZpiKiH/fxkEKE/DwbBbjBflsU27kOfeROlsPiT0d\nMwYJD1VbXmU2EvfGm3wJcf4Z9kuSQZmVrL8lLqf51cX9bt6c3PdeAA0r/2VTrLcPECJnWx9rIlwC\n6iKOzNv3VoF13qYjXbZfk5SzrEkxIgCreAQWAhQXGH99Ax5L3UnAW0sIZD2mwhP7Xw==";

    /* renamed from: c */
    private static String f82903c = "MIIBtzCCASsGByqGSM44BAEwggEeAoGBAP1KfX3E3GfvdRXFQY6axz8ET49su6XAmMxQnE6yOcy5\nISHrtk3LY4TDrP69/YZVXr5n7TPqVvwimh3+Ps2T1O6Vyum2lzzTGsS+oJjDmt9bleQSIMc9YX58\nx5P/7yMEXUYW+9CiiudAe2Kf1xX9+172VYqyRJnV/Rs4poWnqcNDAhUA5OkDUsOYJPi1T9e9leOC\neB0mlj8CgYB+4ZY6ZHOCVC+rNaW/JrYoZpiKiH/fxkEKE/DwbBbjBflsU27kOfeROlsPiT0dMwYJ\nD1VbXmU2EvfGm3wJcf4Z9kuSQZmVrL8lLqf51cX9bt6c3PdeAA0r/2VTrLcPECJnWx9rIlwC6iKO\nzNv3VoF13qYjXbZfk5SzrEkxIgCreAOBhQACgYEA1saTuDLhAHbcycTbuP4ybR3hInvNYCDWIBdm\naZyRIuc6fUldCFJL1Ci61AWu/Z9P2P50n9FuPzkpfTdXs3OOe8tHbZKO1FTJ5YbMt8jpFYwhVPPF\nROA1tPE32Tp7cmVch9kBZ6DGwRDQinAlk7JEO72McRl0BjA9zZFECahrYIU=";

    /* renamed from: d */
    private static TreeMap<String, String> f82904d;

    static {
        TreeMap<String, String> treeMap = new TreeMap<>();
        f82904d = treeMap;
        treeMap.put("channelId", "C10000001072");
        f82904d.put("openType", "1");
        f82904d.put("userId", "");
        f82904d.put("message", "");
    }

    /* renamed from: a */
    private static String m73685a(Map<String, String> map) {
        String str = "msgId";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            sb.append("__xxx__");
            sb.append(AppLog.getServerDeviceId());
            map.put(str, sb.toString());
            return f82901a.mo64617a(f82902b, map);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m73684a(String str, Map<String, String> map) {
        TreeMap treeMap = new TreeMap();
        String str2 = "expandParams";
        if (map != null) {
            treeMap.putAll(map);
        }
        if (!treeMap.containsKey(str2)) {
            treeMap.put(str2, "");
        }
        treeMap.putAll(f82904d);
        String a = m73685a(treeMap);
        m73686b(a, treeMap);
        if (!TextUtils.isEmpty(a)) {
            treeMap.put("sign", URLEncoder.encode(a));
        }
        if (map != null && map.containsKey(str2)) {
            treeMap.put(str2, URLEncoder.encode((String) map.get(str2)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(C31738b.m73682a(treeMap));
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m73686b(String str, Map<String, String> map) {
        PublicKey publicKey;
        try {
            C31738b bVar = f82901a;
            String str2 = f82903c;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && map != null) {
                if (!map.isEmpty()) {
                    byte[] bytes = C31738b.m73682a(map).getBytes("UTF-8");
                    byte[] decode = Base64.decode(str.getBytes("UTF-8"), 0);
                    Signature instance = Signature.getInstance("DSA");
                    if (TextUtils.isEmpty(str2)) {
                        publicKey = null;
                    } else {
                        publicKey = KeyFactory.getInstance("DSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2.getBytes("UTF-8"), 0)));
                    }
                    instance.initVerify(publicKey);
                    instance.update(bytes);
                    return instance.verify(decode);
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
