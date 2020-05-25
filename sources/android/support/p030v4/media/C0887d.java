package android.support.p030v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: android.support.v4.media.d */
final class C0887d {
    /* renamed from: a */
    public static String m2478a(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: b */
    public static CharSequence m2479b(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: c */
    public static CharSequence m2480c(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: d */
    public static CharSequence m2481d(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: e */
    public static Bitmap m2482e(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: f */
    public static Uri m2483f(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: g */
    public static Bundle m2484g(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }
}
