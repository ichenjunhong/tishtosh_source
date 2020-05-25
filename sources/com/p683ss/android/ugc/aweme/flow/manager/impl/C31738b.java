package com.p683ss.android.ugc.aweme.flow.manager.impl;

import android.text.TextUtils;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.flow.manager.impl.b */
public final class C31738b {

    /* renamed from: a */
    private final String f82899a = "UTF-8";

    /* renamed from: b */
    private final String f82900b = "DSA";

    /* renamed from: a */
    public static String m73682a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo64617a(String str, Map<String, String> map) throws Exception {
        PrivateKey privateKey;
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return "";
        }
        byte[] bytes = m73682a(map).getBytes("UTF-8");
        Signature instance = Signature.getInstance("DSA");
        if (TextUtils.isEmpty(str)) {
            privateKey = null;
        } else {
            privateKey = KeyFactory.getInstance("DSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str.getBytes("UTF-8"), 0)));
        }
        instance.initSign(privateKey);
        instance.update(bytes);
        return new String(Base64.encode(instance.sign(), 0));
    }
}
