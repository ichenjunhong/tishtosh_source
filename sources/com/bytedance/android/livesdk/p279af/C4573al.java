package com.bytedance.android.livesdk.p279af;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.af.al */
public final class C4573al {

    /* renamed from: a */
    private static HashMap<String, Typeface> f12536a = new HashMap<>();

    /* renamed from: a */
    public static Typeface m10974a(Context context) {
        Typeface a = m10975a(context, "fonts/ByteNumber-Bold.ttf");
        if (a != null) {
            return a;
        }
        return m10975a(context, "fonts/DIN_Alternate.ttf");
    }

    /* renamed from: a */
    private static Typeface m10975a(Context context, String str) {
        Typeface typeface;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f12536a.containsKey(str) || context == null) {
            typeface = (Typeface) f12536a.get(str);
        } else {
            try {
                typeface = Typeface.createFromAsset(context.getApplicationContext().getAssets(), str);
            } catch (Throwable unused) {
                typeface = null;
            }
            f12536a.put(str, typeface);
        }
        return typeface;
    }
}
