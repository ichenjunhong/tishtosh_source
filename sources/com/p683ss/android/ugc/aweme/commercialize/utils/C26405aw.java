package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.common.utility.p524d.C9398b;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aw */
public final class C26405aw {
    /* renamed from: a */
    public static String m63872a(String str) {
        GZIPOutputStream gZIPOutputStream;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(str.getBytes());
                C9398b.m18586a((Closeable) gZIPOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C9398b.m18586a((Closeable) byteArrayOutputStream);
                return Base64.encodeToString(byteArray, 0);
            } catch (Throwable th) {
                C9398b.m18586a((Closeable) byteArrayOutputStream);
                throw th;
            }
        } catch (IOException | UnsupportedEncodingException unused) {
            return null;
        }
    }
}
