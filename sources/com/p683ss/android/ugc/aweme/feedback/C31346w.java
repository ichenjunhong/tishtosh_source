package com.p683ss.android.ugc.aweme.feedback;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.bytedance.common.utility.BitmapUtils;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50199c;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feedback.w */
public final class C31346w {

    /* renamed from: a */
    public static final C31346w f82109a = new C31346w();

    private C31346w() {
    }

    /* renamed from: a */
    private final String m73070a() {
        File a = C48016e.m103934a(m73071b());
        if (a == null) {
            return "";
        }
        String path = a.getPath();
        C52711k.m112236a((Object) path, "file.path");
        return path;
    }

    /* renamed from: b */
    private static String m73071b() {
        StringBuilder sb = new StringBuilder("feedback");
        sb.append(File.separator);
        sb.append("upload");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo64225a(int i) {
        if (i > 0) {
            C48016e.m103954e(m73070a());
        }
    }

    /* renamed from: a */
    public final String mo64224a(String str, File file, int i) {
        C52711k.m112240b(str, "fileName");
        C52711k.m112240b(file, "file");
        int min = Math.min(i, 720);
        if (min > 0) {
            try {
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                if (options.outWidth > min) {
                    options.inSampleSize = C50199c.m108333a(options, min, (options.outHeight * min) / options.outWidth);
                    options.inJustDecodeBounds = false;
                    Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                    C52711k.m112236a((Object) decodeFile, "BitmapFactory.decodeFile(fileName, option)");
                    Bitmap rotateBitmap = BitmapUtils.rotateBitmap(decodeFile, BitmapUtils.readPictureDegree(str));
                    C52711k.m112236a((Object) rotateBitmap, "BitmapUtils.rotateBitmap(resizeBitmap, degree)");
                    if (rotateBitmap != null) {
                        String a = m73070a();
                        if (BitmapUtils.saveBitmapToSD(rotateBitmap, a, file.getName())) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(a);
                            sb.append(File.separator);
                            sb.append(file.getName());
                            str = sb.toString();
                        }
                        rotateBitmap.recycle();
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
