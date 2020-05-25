package com.facebook.imageutils;

import android.media.ExifInterface;
import android.os.Build.VERSION;
import com.facebook.common.p921e.C13697a;
import java.io.IOException;
import java.io.InputStream;

public final class HeifExifUtil {

    static class HeifExifUtilAndroidN {
        private HeifExifUtilAndroidN() {
        }

        static int getOrientation(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
            } catch (IOException e) {
                C13697a.m27681a("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", (Throwable) e);
                return 0;
            }
        }
    }

    /* renamed from: a */
    public static int m29201a(InputStream inputStream) {
        if (VERSION.SDK_INT >= 24) {
            return HeifExifUtilAndroidN.getOrientation(inputStream);
        }
        C13697a.m27680a("HeifExifUtil", "Trying to read Heif Exif information before Android N -> ignoring");
        return 0;
    }
}
