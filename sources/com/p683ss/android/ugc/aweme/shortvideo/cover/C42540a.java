package com.p683ss.android.ugc.aweme.shortvideo.cover;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import com.p683ss.android.medialib.model.CoverInfo;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42542c.C42543a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import dmt.p2652av.video.C52928al;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.a */
final /* synthetic */ class C42540a implements Callable {

    /* renamed from: a */
    private final EffectVideoCoverGeneratorImpl f107588a;

    /* renamed from: b */
    private final EditVideoSegment f107589b;

    /* renamed from: c */
    private final int f107590c;

    /* renamed from: d */
    private final C42543a f107591d;

    C42540a(EffectVideoCoverGeneratorImpl effectVideoCoverGeneratorImpl, EditVideoSegment editVideoSegment, int i, C42543a aVar) {
        this.f107588a = effectVideoCoverGeneratorImpl;
        this.f107589b = editVideoSegment;
        this.f107590c = i;
        this.f107591d = aVar;
    }

    public final Object call() {
        int i;
        Bitmap bitmap;
        EffectVideoCoverGeneratorImpl effectVideoCoverGeneratorImpl = this.f107588a;
        EditVideoSegment editVideoSegment = this.f107589b;
        int i2 = this.f107590c;
        C42543a aVar = this.f107591d;
        if (editVideoSegment.getVideoCutInfo() == null || editVideoSegment.getVideoCutInfo().getRotate() <= 0) {
            i = 0;
        } else {
            i = C52928al.m112616e(editVideoSegment.getVideoPath());
            if (editVideoSegment.getVideoCutInfo() != null) {
                i += editVideoSegment.getVideoCutInfo().getRotate();
            }
        }
        CoverInfo thumb = effectVideoCoverGeneratorImpl.f107570a.getThumb(i2);
        if (thumb == null || thumb.getData() == null) {
            bitmap = null;
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(thumb.getData(), thumb.getWidth(), thumb.getHeight(), Config.ARGB_8888);
            if (i > 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) i);
                bitmap = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
            } else {
                bitmap = createBitmap;
            }
        }
        effectVideoCoverGeneratorImpl.f107571b.post(new C42541b(aVar, i2, bitmap));
        return null;
    }
}
