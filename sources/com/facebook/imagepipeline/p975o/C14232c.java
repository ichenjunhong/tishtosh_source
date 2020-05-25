package com.facebook.imagepipeline.p975o;

import android.net.Uri;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p927k.C13731f;
import com.facebook.imagepipeline.common.C13949a;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.common.C13951c;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.common.C13953e;
import com.facebook.imagepipeline.p965e.C14008i;
import com.facebook.imagepipeline.p971k.C14050c;
import com.facebook.imagepipeline.p975o.C14229b.C14230a;
import com.facebook.imagepipeline.p975o.C14229b.C14231b;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.o.c */
public final class C14232c {

    /* renamed from: a */
    public Uri f37130a;

    /* renamed from: b */
    public List<Uri> f37131b;

    /* renamed from: c */
    public C14231b f37132c = C14231b.FULL_FETCH;

    /* renamed from: d */
    public C13952d f37133d;

    /* renamed from: e */
    public C13953e f37134e;

    /* renamed from: f */
    public C13950b f37135f = C13950b.m28426a();

    /* renamed from: g */
    public C14230a f37136g = C14230a.DEFAULT;

    /* renamed from: h */
    public boolean f37137h = C14008i.f36504A.f36562a;

    /* renamed from: i */
    public boolean f37138i = false;

    /* renamed from: j */
    public C13951c f37139j = C13951c.HIGH;

    /* renamed from: k */
    public C14234d f37140k = null;

    /* renamed from: l */
    boolean f37141l = true;

    /* renamed from: m */
    public boolean f37142m = true;

    /* renamed from: n */
    public C14050c f37143n;

    /* renamed from: o */
    public C13949a f37144o = null;

    /* renamed from: com.facebook.imagepipeline.o.c$a */
    public static class C14233a extends RuntimeException {
        public C14233a(String str) {
            StringBuilder sb = new StringBuilder("Invalid request builder: ");
            sb.append(str);
            super(sb.toString());
        }
    }

    /* renamed from: a */
    public final C14232c mo26457a(C14231b bVar) {
        this.f37132c = bVar;
        return this;
    }

    /* renamed from: a */
    public final C14232c mo26459a(boolean z) {
        if (z) {
            return mo26454a(C13953e.m28428a());
        }
        return mo26454a(C13953e.m28429b());
    }

    /* renamed from: a */
    public final C14232c mo26456a(C14230a aVar) {
        this.f37136g = aVar;
        return this;
    }

    /* renamed from: a */
    public final C14232c mo26458a(C14234d dVar) {
        this.f37140k = dVar;
        return this;
    }

    private C14232c() {
    }

    /* renamed from: a */
    public final C14229b mo26449a() {
        if (this.f37130a != null) {
            if (C13731f.m27783g(this.f37130a)) {
                if (!this.f37130a.isAbsolute()) {
                    throw new C14233a("Resource URI path must be absolute.");
                } else if (!this.f37130a.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(this.f37130a.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new C14233a("Resource URI path must be a resource id.");
                    }
                } else {
                    throw new C14233a("Resource URI must not be empty");
                }
            }
            if (!C13731f.m27782f(this.f37130a) || this.f37130a.isAbsolute()) {
                return new C14229b(this);
            }
            throw new C14233a("Asset URI path must be absolute.");
        }
        throw new C14233a("Source must be set!");
    }

    /* renamed from: c */
    private C14232c m29172c(boolean z) {
        this.f37138i = z;
        return this;
    }

    /* renamed from: a */
    public final C14232c mo26450a(C13949a aVar) {
        this.f37144o = aVar;
        return this;
    }

    /* renamed from: b */
    public final C14232c mo26460b(boolean z) {
        this.f37137h = z;
        return this;
    }

    /* renamed from: b */
    private C14232c m29171b(Uri uri) {
        C13689i.m27652a(uri);
        this.f37130a = uri;
        return this;
    }

    /* renamed from: a */
    public final C14232c mo26451a(C13950b bVar) {
        this.f37135f = bVar;
        return this;
    }

    /* renamed from: a */
    public static C14232c m29168a(int i) {
        return m29169a(C13731f.m27775a(i));
    }

    /* renamed from: a */
    public static C14232c m29169a(Uri uri) {
        return new C14232c().m29171b(uri);
    }

    /* renamed from: a */
    public final C14232c mo26452a(C13951c cVar) {
        this.f37139j = cVar;
        return this;
    }

    /* renamed from: a */
    public static C14232c m29170a(C14229b bVar) {
        return m29169a(bVar.mSourceUri).mo26451a(bVar.mImageDecodeOptions).mo26450a(bVar.mBytesRange).mo26456a(bVar.mCacheChoice).m29172c(bVar.mLocalThumbnailPreviewsEnabled).mo26457a(bVar.mLowestPermittedRequestLevel).mo26458a(bVar.mPostprocessor).mo26460b(bVar.mProgressiveRenderingEnabled).mo26452a(bVar.mRequestPriority).mo26453a(bVar.mResizeOptions).mo26455a(bVar.mRequestListener).mo26454a(bVar.mRotationOptions);
    }

    /* renamed from: a */
    public final C14232c mo26453a(C13952d dVar) {
        this.f37133d = dVar;
        return this;
    }

    /* renamed from: a */
    public final C14232c mo26454a(C13953e eVar) {
        this.f37134e = eVar;
        return this;
    }

    /* renamed from: a */
    public final C14232c mo26455a(C14050c cVar) {
        this.f37143n = cVar;
        return this;
    }
}
