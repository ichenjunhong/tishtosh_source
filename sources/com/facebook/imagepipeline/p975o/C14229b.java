package com.facebook.imagepipeline.p975o;

import android.net.Uri;
import com.facebook.common.p920d.C13685h;
import com.facebook.common.p922f.C13700a;
import com.facebook.common.p922f.C13701b;
import com.facebook.common.p927k.C13731f;
import com.facebook.imagepipeline.common.C13949a;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.common.C13951c;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.common.C13953e;
import com.facebook.imagepipeline.p971k.C14050c;
import com.facebook.p914c.p915a.C13619c;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: com.facebook.imagepipeline.o.b */
public class C14229b {
    public final List<Uri> mBackupUris;
    public final C13949a mBytesRange;
    public final C14230a mCacheChoice;
    public final C13950b mImageDecodeOptions;
    public final boolean mIsDiskCacheEnabled;
    public final boolean mIsMemoryCacheEnabled;
    public final boolean mLocalThumbnailPreviewsEnabled;
    public final C14231b mLowestPermittedRequestLevel;
    public final C14234d mPostprocessor;
    public final boolean mProgressiveRenderingEnabled;
    public final C14050c mRequestListener;
    public final C13951c mRequestPriority;
    public final C13952d mResizeOptions;
    public final C13953e mRotationOptions;
    private File mSourceFile;
    public final Uri mSourceUri;
    public final int mSourceUriType = getSourceUriType(this.mSourceUri);

    /* renamed from: com.facebook.imagepipeline.o.b$a */
    public enum C14230a {
        SMALL,
        DEFAULT
    }

    /* renamed from: com.facebook.imagepipeline.o.b$b */
    public enum C14231b {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        

        /* renamed from: a */
        private int f37129a;

        public final int getValue() {
            return this.f37129a;
        }

        public static C14231b getMax(C14231b bVar, C14231b bVar2) {
            if (bVar.getValue() > bVar2.getValue()) {
                return bVar;
            }
            return bVar2;
        }

        private C14231b(int i) {
            this.f37129a = i;
        }
    }

    public boolean getAutoRotateEnabled() {
        return this.mRotationOptions.mo26125d();
    }

    public int getPreferredHeight() {
        if (this.mResizeOptions != null) {
            return this.mResizeOptions.f36399b;
        }
        return 2048;
    }

    public int getPreferredWidth() {
        if (this.mResizeOptions != null) {
            return this.mResizeOptions.f36398a;
        }
        return 2048;
    }

    public synchronized File getSourceFile() {
        if (this.mSourceFile == null) {
            this.mSourceFile = new File(this.mSourceUri.getPath());
        }
        return this.mSourceFile;
    }

    public int hashCode() {
        C13619c cVar;
        if (this.mPostprocessor != null) {
            cVar = this.mPostprocessor.getPostprocessorCacheKey();
        } else {
            cVar = null;
        }
        return Arrays.hashCode(new Object[]{this.mCacheChoice, this.mSourceUri, this.mSourceFile, this.mBytesRange, this.mImageDecodeOptions, this.mResizeOptions, this.mRotationOptions, cVar});
    }

    public String toString() {
        return C13685h.m27644a(this).mo25581a("uri", (Object) this.mSourceUri).mo25581a("cacheChoice", (Object) this.mCacheChoice).mo25581a("decodeOptions", (Object) this.mImageDecodeOptions).mo25581a("postprocessor", (Object) this.mPostprocessor).mo25581a("priority", (Object) this.mRequestPriority).mo25581a("resizeOptions", (Object) this.mResizeOptions).mo25581a("rotationOptions", (Object) this.mRotationOptions).mo25581a("bytesRange", (Object) this.mBytesRange).toString();
    }

    public static C14229b fromFile(File file) {
        if (file == null) {
            return null;
        }
        return fromUri(Uri.fromFile(file));
    }

    public static C14229b fromUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        return C14232c.m29169a(uri).mo26449a();
    }

    public static C14229b fromUri(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return fromUri(Uri.parse(str));
    }

    protected C14229b(C14232c cVar) {
        C13953e eVar;
        boolean z;
        this.mCacheChoice = cVar.f37136g;
        this.mSourceUri = cVar.f37130a;
        this.mBackupUris = cVar.f37131b;
        this.mProgressiveRenderingEnabled = cVar.f37137h;
        this.mLocalThumbnailPreviewsEnabled = cVar.f37138i;
        this.mImageDecodeOptions = cVar.f37135f;
        this.mResizeOptions = cVar.f37133d;
        if (cVar.f37134e == null) {
            eVar = C13953e.m28428a();
        } else {
            eVar = cVar.f37134e;
        }
        this.mRotationOptions = eVar;
        this.mBytesRange = cVar.f37144o;
        this.mRequestPriority = cVar.f37139j;
        this.mLowestPermittedRequestLevel = cVar.f37132c;
        if (!cVar.f37141l || !C13731f.m27778b(cVar.f37130a)) {
            z = false;
        } else {
            z = true;
        }
        this.mIsDiskCacheEnabled = z;
        this.mIsMemoryCacheEnabled = cVar.f37142m;
        this.mPostprocessor = cVar.f37140k;
        this.mRequestListener = cVar.f37143n;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (!(obj instanceof C14229b)) {
            return false;
        }
        C14229b bVar = (C14229b) obj;
        if (!C13685h.m27645a(this.mSourceUri, bVar.mSourceUri) || !C13685h.m27645a(this.mCacheChoice, bVar.mCacheChoice) || !C13685h.m27645a(this.mSourceFile, bVar.mSourceFile) || !C13685h.m27645a(this.mBytesRange, bVar.mBytesRange) || !C13685h.m27645a(this.mImageDecodeOptions, bVar.mImageDecodeOptions) || !C13685h.m27645a(this.mResizeOptions, bVar.mResizeOptions) || !C13685h.m27645a(this.mRotationOptions, bVar.mRotationOptions)) {
            return false;
        }
        C13619c cVar = null;
        if (this.mPostprocessor != null) {
            obj2 = this.mPostprocessor.getPostprocessorCacheKey();
        } else {
            obj2 = null;
        }
        if (bVar.mPostprocessor != null) {
            cVar = bVar.mPostprocessor.getPostprocessorCacheKey();
        }
        return C13685h.m27645a(obj2, cVar);
    }

    private static int getSourceUriType(Uri uri) {
        String str;
        if (uri == null) {
            return -1;
        }
        if (C13731f.m27778b(uri)) {
            return 0;
        }
        if (C13731f.m27779c(uri)) {
            String path = uri.getPath();
            int lastIndexOf = path.lastIndexOf(46);
            String str2 = null;
            if (lastIndexOf < 0 || lastIndexOf == path.length() - 1) {
                str = null;
            } else {
                str = path.substring(lastIndexOf + 1);
            }
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.US);
                String str3 = (String) C13701b.f35675b.get(lowerCase);
                if (str3 == null) {
                    str3 = C13701b.f35674a.getMimeTypeFromExtension(lowerCase);
                }
                if (str3 == null) {
                    str2 = (String) C13700a.f35673a.get(lowerCase);
                } else {
                    str2 = str3;
                }
            }
            if (C13700a.m27723a(str2)) {
                return 2;
            }
            return 3;
        } else if (C13731f.m27780d(uri)) {
            return 4;
        } else {
            if (C13731f.m27782f(uri)) {
                return 5;
            }
            if (C13731f.m27783g(uri)) {
                return 6;
            }
            if ("data".equals(C13731f.m27784h(uri))) {
                return 7;
            }
            if ("android.resource".equals(C13731f.m27784h(uri))) {
                return 8;
            }
            return -1;
        }
    }
}
