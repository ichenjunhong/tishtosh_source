package com.bytedance.android.livesdk.p279af;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ss.android.ugc.trill.R;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.android.livesdk.af.ab */
public final class C4560ab {

    /* renamed from: a */
    public static final int brx = 2131956030;

    /* renamed from: b */
    public static final int c69 = 2131956553;

    /* renamed from: c */
    private static WeakHashMap<Integer, Bitmap> f12524c = new WeakHashMap<>();

    /* renamed from: a */
    public static Bitmap m10952a(Context context, int i) {
        if (i == brx || i == c69) {
            return m10953a(context, i, context.getResources().getDimensionPixelSize(R.dimen.qt), context.getResources().getDimensionPixelSize(R.dimen.qs));
        }
        return null;
    }

    /* renamed from: a */
    public static Bitmap m10953a(Context context, int i, int i2, int i3) {
        Bitmap bitmap = (Bitmap) f12524c.get(Integer.valueOf(i));
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i);
        if (decodeResource == null) {
            return null;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, i2, i3, false);
        if (createScaledBitmap == null) {
            return null;
        }
        f12524c.put(Integer.valueOf(i), createScaledBitmap);
        return createScaledBitmap;
    }
}
