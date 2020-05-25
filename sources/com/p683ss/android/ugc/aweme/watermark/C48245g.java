package com.p683ss.android.ugc.aweme.watermark;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.text.TextUtils;
import com.bytedance.common.utility.BitmapUtils;
import com.p683ss.android.ugc.aweme.photo.p2045a.C38653a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.photo.IPhotoProcessService.IPhotoServiceListener;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a.C45640d;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.watermark.g */
final /* synthetic */ class C48245g implements Callable {

    /* renamed from: a */
    private final String f121397a;

    /* renamed from: b */
    private final IPhotoServiceListener f121398b;

    /* renamed from: c */
    private final String f121399c;

    C48245g(String str, IPhotoServiceListener iPhotoServiceListener, String str2) {
        this.f121397a = str;
        this.f121398b = iPhotoServiceListener;
        this.f121399c = str2;
    }

    public final Object call() {
        String str = this.f121397a;
        IPhotoServiceListener iPhotoServiceListener = this.f121398b;
        String str2 = this.f121399c;
        Options options = new Options();
        options.inMutable = true;
        options.inPreferredConfig = Config.ARGB_8888;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        if (decodeFile == null || decodeFile.isRecycled()) {
            if (iPhotoServiceListener != null) {
                iPhotoServiceListener.onSaved(-1, null);
            }
            return null;
        }
        C48246h hVar = new C48246h(str, decodeFile.getWidth(), decodeFile.getHeight());
        String[] b = hVar.mo92022b(false, C39618d.f101183x.mo74285e());
        C45640d a = hVar.mo92019a();
        Bitmap decodeFile2 = BitmapFactory.decodeFile(b[0]);
        new Canvas(decodeFile).drawBitmap(decodeFile2, (float) ((decodeFile.getWidth() - a.xOffset) - decodeFile2.getWidth()), (float) ((decodeFile.getHeight() - a.yOffset) - decodeFile2.getHeight()), null);
        if (TextUtils.isEmpty(str2)) {
            if (iPhotoServiceListener != null) {
                iPhotoServiceListener.onWaterMakerAdded(decodeFile);
            }
        } else if (BitmapUtils.saveBitmapToSD(decodeFile, new File(str2).getParent(), new File(str2).getName())) {
            C38653a.m85993a(C39618d.f101160a, str2);
            if (iPhotoServiceListener != null) {
                iPhotoServiceListener.onSaved(0, null);
            }
        } else if (iPhotoServiceListener != null) {
            iPhotoServiceListener.onSaved(-1, null);
        }
        return null;
    }
}
