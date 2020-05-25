package com.p683ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45380af;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.vesdk.utils.BitmapLoader;
import java.io.FileOutputStream;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.photo.j */
public final class C38681j {

    /* renamed from: a */
    public static final int f98387a;

    /* renamed from: b */
    public static final int f98388b;

    static {
        int i = 720;
        if (C40797m.m90254i() != null) {
            i = Math.max(720, C40797m.m90254i()[0]);
        }
        f98387a = i;
        int i2 = 1280;
        if (C40797m.m90254i() != null) {
            i2 = Math.max(1280, C40797m.m90254i()[1]);
        }
        f98388b = i2;
    }

    /* renamed from: a */
    public static int[] m86037a(String str) {
        if (!C47723bk.m103311a(str)) {
            return new int[]{0, 0};
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: a */
    public static PhotoContext m86035a(String str, C38706r rVar) {
        return m86036a(str, rVar, 1080, 1920);
    }

    /* renamed from: a */
    public static PhotoContext m86036a(String str, C38706r rVar, int i, int i2) {
        FileOutputStream fileOutputStream;
        Throwable th;
        Throwable th2;
        boolean z;
        int i3;
        try {
            Bitmap loadBitmap = BitmapLoader.loadBitmap(str, i, i2);
            long j = C45380af.m98935a().f114756f;
            StringBuilder sb = new StringBuilder(" totalPss: ");
            sb.append(j);
            C45407ay.m98971b(sb.toString());
            if (loadBitmap == null) {
                loadBitmap = null;
            } else {
                int width = loadBitmap.getWidth();
                int height = loadBitmap.getHeight();
                if ((loadBitmap.getWidth() & 1) == 1) {
                    i3 = loadBitmap.getWidth() - 1;
                    z = true;
                } else {
                    i3 = width;
                    z = false;
                }
                if ((loadBitmap.getHeight() & 1) == 1) {
                    height = loadBitmap.getHeight() - 1;
                    z = true;
                }
                if (z) {
                    Bitmap createBitmap = Bitmap.createBitmap(loadBitmap, 0, 0, i3, height);
                    loadBitmap.recycle();
                    loadBitmap = createBitmap;
                }
            }
            if (loadBitmap != null) {
                String a = rVar.mo78585a();
                fileOutputStream = new FileOutputStream(a);
                try {
                    boolean compress = loadBitmap.compress(CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    if (!compress) {
                        C45407ay.m98971b("compress bitmap fail");
                    }
                    if (compress) {
                        return PhotoContext.fromUpload(a, loadBitmap.getWidth(), loadBitmap.getHeight(), UUID.randomUUID().toString());
                    }
                    return null;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    th = r6;
                    th2 = th4;
                }
            } else {
                C45407ay.m98971b("bitmap = null");
                return null;
            }
            throw th2;
            if (th != null) {
                fileOutputStream.close();
            } else {
                fileOutputStream.close();
            }
            throw th2;
        } catch (Throwable th5) {
            C45407ay.m98971b(th5.getMessage());
        }
    }
}
