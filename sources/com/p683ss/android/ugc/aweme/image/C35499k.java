package com.p683ss.android.ugc.aweme.image;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.image.k */
final class C35499k {

    /* renamed from: a */
    private Map<String, String> f91253a = new ConcurrentHashMap();

    C35499k() {
    }

    /* renamed from: b */
    private static byte[] m80241b(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo73894a(String str) {
        String str2;
        boolean z = true;
        if (str.contains("%%secretKey=")) {
            str2 = str.substring(0, str.indexOf("%%secretKey="));
            String substring = str.substring(str.lastIndexOf("=") + 1, str.length());
            if (!TextUtils.isEmpty(substring)) {
                this.f91253a.put(str2, substring);
            }
        } else {
            str2 = str;
            z = false;
        }
        if ((z || str.contains("secretKey")) && (str.length() == str2.length() || str2.contains("secretKey"))) {
            m80240a(str, str2, Boolean.valueOf(z));
        }
        return str2;
    }

    /* renamed from: a */
    private static void m80240a(String str, String str2, Boolean bool) {
        StringBuilder sb = new StringBuilder("ImageEncryptUtils parse failed: rawUrl=");
        sb.append(str);
        sb.append(", parseUrl=");
        sb.append(str2);
        sb.append(", contain=");
        sb.append(bool);
        C32458a.m75144a(sb.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("service", "secret_key_parse_error");
            jSONObject.put("raw_url", str);
            jSONObject.put("parse_url", str2);
            jSONObject.put("is_contain", bool.booleanValue() ? 1 : 0);
            C9951d.m19997a("im_error_event", jSONObject);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Pair<InputStream, Long> mo73893a(InputStream inputStream, String str, long j) throws Exception {
        if (this.f91253a.containsKey(str)) {
            String str2 = (String) this.f91253a.get(str);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (byteArray != null) {
                    byte[] b = m80241b(str2);
                    byte[] copyOfRange = Arrays.copyOfRange(byteArray, 12, byteArray.length);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(Arrays.copyOfRange(byteArray, 0, 12));
                    SecretKeySpec secretKeySpec = new SecretKeySpec(b, "AES");
                    Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                    instance.init(2, secretKeySpec, ivParameterSpec);
                    byte[] doFinal = instance.doFinal(copyOfRange);
                    Pair pair = new Pair(doFinal, Integer.valueOf(doFinal.length));
                    inputStream = new ByteArrayInputStream((byte[]) pair.first);
                    j = (long) ((Integer) pair.second).intValue();
                }
            } finally {
                this.f91253a.remove(str);
            }
        }
        return new Pair<>(inputStream, Long.valueOf(j));
    }
}
