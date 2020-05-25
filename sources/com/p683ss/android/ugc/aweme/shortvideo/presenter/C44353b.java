package com.p683ss.android.ugc.aweme.shortvideo.presenter;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.text.TextUtils;
import com.p683ss.android.medialib.jni.EffectThumb;
import com.p683ss.android.medialib.model.CoverInfo;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.tools.utils.C50199c;
import dmt.p2652av.video.C52928al;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.presenter.b */
final /* synthetic */ class C44353b implements Callable {

    /* renamed from: a */
    private final boolean f112249a;

    /* renamed from: b */
    private final EditVideoSegment f112250b;

    /* renamed from: c */
    private final EffectThumb f112251c;

    /* renamed from: d */
    private final String f112252d;

    /* renamed from: e */
    private final OnVideoCoverCallback f112253e;

    C44353b(boolean z, EditVideoSegment editVideoSegment, EffectThumb effectThumb, String str, OnVideoCoverCallback onVideoCoverCallback) {
        this.f112249a = z;
        this.f112250b = editVideoSegment;
        this.f112251c = effectThumb;
        this.f112252d = str;
        this.f112253e = onVideoCoverCallback;
    }

    public final Object call() {
        int i;
        Bitmap bitmap;
        boolean z = this.f112249a;
        EditVideoSegment editVideoSegment = this.f112250b;
        EffectThumb effectThumb = this.f112251c;
        String str = this.f112252d;
        OnVideoCoverCallback onVideoCoverCallback = this.f112253e;
        if (!z) {
            i = C52928al.m112616e(editVideoSegment.getVideoPath());
            if (editVideoSegment.getVideoCutInfo() != null) {
                i += editVideoSegment.getVideoCutInfo().getRotate();
            }
        } else {
            i = 0;
        }
        CoverInfo thumb = effectThumb.getThumb(0);
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
        if (!TextUtils.isEmpty(str) && bitmap != null) {
            C50199c.m108337a(bitmap, new File(str), 60, CompressFormat.PNG);
        }
        C18842a.m45934b(new C44354c(onVideoCoverCallback, bitmap));
        effectThumb.stopRender();
        return null;
    }
}
