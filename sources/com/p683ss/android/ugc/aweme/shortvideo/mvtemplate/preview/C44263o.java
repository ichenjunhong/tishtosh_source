package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.graphics.PointF;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45426bi;
import p2628d.C52847n;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.o */
public final class C44263o {

    /* renamed from: a */
    private static final C52847n<PointF, PointF> f112063a = new C52847n<>(new PointF(0.445f, 0.05f), new PointF(0.55f, 0.95f));

    /* renamed from: a */
    public static final C52847n<PointF, PointF> m96945a() {
        return f112063a;
    }

    /* renamed from: b */
    private static final boolean m96947b() {
        return C45426bi.m98997a();
    }

    /* renamed from: a */
    public static final boolean m96946a(MediaModel mediaModel) {
        if (mediaModel == null || !mediaModel.mo76676c() || !m96948b(mediaModel) || m96947b()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static final boolean m96948b(MediaModel mediaModel) {
        if (mediaModel == null) {
            return false;
        }
        int c = C52753d.m112321c(mediaModel.f95390i, mediaModel.f95391j);
        int d = C52753d.m112322d(mediaModel.f95390i, mediaModel.f95391j);
        if (c >= 4096 || d >= 2160) {
            return true;
        }
        return false;
    }
}
