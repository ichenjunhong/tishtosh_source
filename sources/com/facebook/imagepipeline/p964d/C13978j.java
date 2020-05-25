package com.facebook.imagepipeline.p964d;

import android.net.Uri;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14234d;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p914c.p915a.C13624h;

/* renamed from: com.facebook.imagepipeline.d.j */
public final class C13978j implements C13969f {

    /* renamed from: a */
    private static C13978j f36461a;

    protected C13978j() {
    }

    /* renamed from: a */
    private static Uri m28503a(Uri uri) {
        return uri;
    }

    /* renamed from: a */
    public static synchronized C13978j m28504a() {
        C13978j jVar;
        synchronized (C13978j.class) {
            if (f36461a == null) {
                f36461a = new C13978j();
            }
            jVar = f36461a;
        }
        return jVar;
    }

    /* renamed from: c */
    public final C13619c mo26147c(C14229b bVar, Object obj) {
        return mo26144a(bVar, bVar.mSourceUri, obj);
    }

    /* renamed from: a */
    public final C13619c mo26145a(C14229b bVar, Object obj) {
        C13959c cVar = new C13959c(m28503a(bVar.mSourceUri).toString(), bVar.mResizeOptions, bVar.mRotationOptions, bVar.mImageDecodeOptions, null, null, obj);
        return cVar;
    }

    /* renamed from: b */
    public final C13619c mo26146b(C14229b bVar, Object obj) {
        String str;
        C13619c cVar;
        C14234d dVar = bVar.mPostprocessor;
        if (dVar != null) {
            C13619c postprocessorCacheKey = dVar.getPostprocessorCacheKey();
            str = dVar.getClass().getName();
            cVar = postprocessorCacheKey;
        } else {
            cVar = null;
            str = null;
        }
        C13959c cVar2 = new C13959c(m28503a(bVar.mSourceUri).toString(), bVar.mResizeOptions, bVar.mRotationOptions, bVar.mImageDecodeOptions, cVar, str, obj);
        return cVar2;
    }

    /* renamed from: a */
    public final C13619c mo26144a(C14229b bVar, Uri uri, Object obj) {
        return new C13624h(m28503a(uri).toString());
    }
}
