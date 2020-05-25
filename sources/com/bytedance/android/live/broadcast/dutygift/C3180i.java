package com.bytedance.android.live.broadcast.dutygift;

import android.graphics.Bitmap;
import com.bytedance.common.utility.BitmapUtils;
import java.io.File;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.live.broadcast.dutygift.i */
final /* synthetic */ class C3180i implements C1711f {

    /* renamed from: a */
    private final String f9227a;

    /* renamed from: b */
    private final String f9228b;

    C3180i(String str, String str2) {
        this.f9227a = str;
        this.f9228b = str2;
    }

    public final Object apply(Object obj) {
        String str = this.f9227a;
        String str2 = this.f9228b;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return "";
        }
        if (bitmap.getWidth() > 32 || bitmap.getHeight() > 32) {
            bitmap = BitmapUtils.resizeBitmap(bitmap, 32, 32);
        }
        BitmapUtils.saveBitmapToSD(bitmap, str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        sb.append(str2);
        return sb.toString();
    }
}
