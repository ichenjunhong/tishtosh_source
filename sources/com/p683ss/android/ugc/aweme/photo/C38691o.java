package com.p683ss.android.ugc.aweme.photo;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.p683ss.android.ugc.tools.utils.C50200d;

/* renamed from: com.ss.android.ugc.aweme.photo.o */
public final class C38691o {
    /* renamed from: a */
    public static int[] m86047a(String str) {
        if (!C50200d.m108346a(str)) {
            return new int[]{0, 0};
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }
}
