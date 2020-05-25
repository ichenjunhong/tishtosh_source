package com.zhihu.matisse;

import android.content.ContentResolver;
import android.net.Uri;
import android.support.p030v4.p038f.C0779b;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.zhihu.matisse.internal.p2253c.C45347c;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.zhihu.matisse.b */
public enum C45333b {
    JPEG("image/jpeg", m98824a("jpg", "jpeg")),
    PNG("image/png", m98824a("png")),
    GIF("image/gif", m98824a("gif")),
    BMP("image/x-ms-bmp", m98824a("bmp")),
    WEBP("image/webp", m98824a("webp")),
    MPEG("video/mpeg", m98824a("mpeg", "mpg")),
    MP4("video/mp4", m98824a("mp4", "m4v")),
    QUICKTIME("video/quicktime", m98824a("mov")),
    THREEGPP("video/3gpp", m98824a("3gp", "3gpp")),
    THREEGPP2("video/3gpp2", m98824a("3g2", "3gpp2")),
    MKV("video/x-matroska", m98824a("mkv")),
    WEBM("video/webm", m98824a("webm")),
    TS("video/mp2ts", m98824a("ts")),
    AVI("video/avi", m98824a("avi"));
    

    /* renamed from: a */
    private final String f114619a;

    /* renamed from: b */
    private final Set<String> f114620b;

    public final String toString() {
        return this.f114619a;
    }

    public static Set<C45333b> ofAll() {
        return EnumSet.allOf(C45333b.class);
    }

    public static Set<C45333b> ofImage() {
        return EnumSet.of(JPEG, PNG, GIF, BMP, WEBP);
    }

    public static Set<C45333b> ofVideo() {
        return EnumSet.of(MPEG, new C45333b[]{MP4, QUICKTIME, THREEGPP, THREEGPP2, MKV, WEBM, TS, AVI});
    }

    /* renamed from: a */
    private static Set<String> m98824a(String... strArr) {
        return new C0779b((Collection<E>) Arrays.asList(strArr));
    }

    /* renamed from: of */
    public static Set<C45333b> m98825of(C45333b bVar, C45333b... bVarArr) {
        return EnumSet.of(bVar, bVarArr);
    }

    public final boolean checkType(ContentResolver contentResolver, Uri uri) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        if (uri == null) {
            return false;
        }
        String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
        String str = null;
        boolean z = false;
        for (String str2 : this.f114620b) {
            if (str2.equals(extensionFromMimeType)) {
                return true;
            }
            if (!z) {
                String b = C45347c.m98879b(contentResolver, uri);
                if (!TextUtils.isEmpty(b)) {
                    b = b.toLowerCase(Locale.US);
                }
                str = b;
                z = true;
            }
            if (str != null && str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private C45333b(String str, Set<String> set) {
        this.f114619a = str;
        this.f114620b = set;
    }
}
