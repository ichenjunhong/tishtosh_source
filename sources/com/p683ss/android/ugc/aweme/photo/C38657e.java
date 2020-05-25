package com.p683ss.android.ugc.aweme.photo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.support.p030v4.p038f.C0781c;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.photo.e */
public final class C38657e {

    /* renamed from: com.ss.android.ugc.aweme.photo.e$a */
    public interface C38664a {
        /* renamed from: a */
        void mo78588a(Bitmap bitmap);
    }

    /* renamed from: a */
    public static void m85998a(C0781c<Bitmap> cVar) {
        m85996a((int) R.drawable.b5z, cVar);
    }

    /* renamed from: a */
    public static UrlModel m85995a(Uri uri) {
        if (uri == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(uri.toString());
        urlModel.setUrlList(arrayList);
        return urlModel;
    }

    /* renamed from: a */
    static boolean m86000a(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m85996a(int i, C0781c<Bitmap> cVar) {
        StringBuilder sb = new StringBuilder("res://");
        sb.append(C39618d.f101160a.getPackageName());
        sb.append("/2131954731");
        C50181a.m108296a(m85995a(Uri.parse(sb.toString())), 0, 0, cVar);
    }

    /* renamed from: a */
    public static void m85999a(PhotoContext photoContext, final C38664a aVar) {
        if (photoContext == null) {
            if (aVar != null) {
                aVar.mo78588a(null);
            }
            return;
        }
        C50181a.m108296a(m85995a(Uri.parse(Uri.fromFile(new File(photoContext.mPhotoLocalPath)).toString())), photoContext.mWidth, photoContext.mHeight, (C0781c<Bitmap>) new C0781c<Bitmap>() {
            public final /* synthetic */ void accept(Object obj) {
                final Bitmap bitmap = (Bitmap) obj;
                C38657e.m85998a((C0781c<Bitmap>) new C0781c<Bitmap>() {
                    public final /* synthetic */ void accept(Object obj) {
                        C38657e.m85997a(bitmap, (Bitmap) obj, aVar);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static void m85997a(final Bitmap bitmap, final Bitmap bitmap2, final C38664a aVar) {
        if (bitmap == null || bitmap2 == null) {
            if (aVar != null) {
                aVar.mo78588a(null);
            }
            return;
        }
        C18842a.m45932a(new Runnable() {
            public final void run() {
                final Bitmap bitmap;
                float min = (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 1.0f) / 1920.0f;
                float height = ((float) bitmap2.getHeight()) * min;
                int width = (int) (((float) bitmap2.getWidth()) * min);
                int width2 = (bitmap.getWidth() - ((int) C9432q.m18687b((Context) C39618d.f101160a, 11.0f))) - width;
                int i = (int) height;
                int height2 = (bitmap.getHeight() - ((int) C9432q.m18687b((Context) C39618d.f101160a, 10.5f))) - i;
                Bitmap bitmap2 = bitmap2;
                int width3 = bitmap2.getWidth();
                int height3 = bitmap2.getHeight();
                float f = ((float) width) / ((float) width3);
                float f2 = ((float) i) / ((float) height3);
                Matrix matrix = new Matrix();
                matrix.postScale(f, f2);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width3, height3, matrix, true);
                bitmap2.recycle();
                Bitmap bitmap3 = bitmap;
                if (!C38657e.m86000a(bitmap3) || !C38657e.m86000a(createBitmap)) {
                    bitmap = null;
                } else {
                    bitmap = Bitmap.createBitmap(bitmap3.getWidth(), bitmap3.getHeight(), Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    canvas.drawBitmap(bitmap3, 0.0f, 0.0f, null);
                    canvas.drawBitmap(createBitmap, (float) width2, (float) height2, null);
                    canvas.save();
                    canvas.restore();
                }
                bitmap.recycle();
                createBitmap.recycle();
                C18842a.m45934b(new Runnable() {
                    public final void run() {
                        if (aVar != null) {
                            aVar.mo78588a(bitmap);
                        }
                    }
                });
            }
        });
    }
}
