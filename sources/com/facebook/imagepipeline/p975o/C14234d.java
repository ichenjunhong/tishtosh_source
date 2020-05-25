package com.facebook.imagepipeline.p975o;

import android.graphics.Bitmap;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p963c.C13946f;
import com.facebook.p914c.p915a.C13619c;

/* renamed from: com.facebook.imagepipeline.o.d */
public interface C14234d {
    String getName();

    C13619c getPostprocessorCacheKey();

    C13715a<Bitmap> process(Bitmap bitmap, C13946f fVar);
}
