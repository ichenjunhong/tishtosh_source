package com.facebook.p943e.p944a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.C2240a;
import com.facebook.C14533n;
import com.facebook.internal.C14338p;
import com.facebook.internal.C14367z;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.e.a.a */
public class C13853a {

    /* renamed from: a */
    private static final String f36140a = C13853a.class.getCanonicalName();

    /* renamed from: b */
    private static HashMap<String, RegistrationListener> f36141b = new HashMap<>();

    /* renamed from: a */
    public static String m28172a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public static boolean m28175b() {
        if (VERSION.SDK_INT < 16 || !C14338p.m29397a(C14533n.m29777k()).f37293e.contains(C14367z.Enabled)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static void m28176c(String str) {
        RegistrationListener registrationListener = (RegistrationListener) f36141b.get(str);
        if (registrationListener != null) {
            try {
                ((NsdManager) C14533n.m29773g().getSystemService("servicediscovery")).unregisterService(registrationListener);
            } catch (IllegalArgumentException unused) {
            }
            f36141b.remove(str);
        }
    }

    /* renamed from: a */
    public static boolean m28173a(final String str) {
        if (!m28175b()) {
            return false;
        }
        if (f36141b.containsKey(str)) {
            return true;
        }
        final String a = C2240a.m6772a("%s_%s_%s", new Object[]{"fbsdk", C2240a.m6772a("%s-%s", new Object[]{"android", C14533n.m29775i().replace('.', '|')}), str});
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(a);
        nsdServiceInfo.setPort(80);
        NsdManager nsdManager = (NsdManager) C14533n.m29773g().getSystemService("servicediscovery");
        C138541 r4 = new RegistrationListener() {
            public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            }

            public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            }

            public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
                if (!a.equals(nsdServiceInfo.getServiceName())) {
                    C13853a.m28176c(str);
                }
            }

            public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
                C13853a.m28176c(str);
            }
        };
        f36141b.put(str, r4);
        nsdManager.registerService(nsdServiceInfo, 1, r4);
        return true;
    }

    /* renamed from: b */
    public static Bitmap m28174b(String str) {
        int i;
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        enumMap.put(EncodeHintType.MARGIN, Integer.valueOf(2));
        try {
            BitMatrix encode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, 200, 200, enumMap);
            int height = encode.getHeight();
            int width = encode.getWidth();
            int[] iArr = new int[(height * width)];
            for (int i2 = 0; i2 < height; i2++) {
                int i3 = i2 * width;
                for (int i4 = 0; i4 < width; i4++) {
                    int i5 = i3 + i4;
                    if (encode.get(i4, i2)) {
                        i = -16777216;
                    } else {
                        i = -1;
                    }
                    iArr[i5] = i;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
            try {
                createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                return createBitmap;
            } catch (WriterException unused) {
                return createBitmap;
            }
        } catch (WriterException unused2) {
            return null;
        }
    }
}
