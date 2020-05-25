package com.p683ss.android.ugc.aweme.shortvideo.transition;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.graphics.Bitmap;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder */
public class VideoCoverBitmapHolder implements C0183j {

    /* renamed from: a */
    public static Bitmap f113618a;

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        if (f113618a != null) {
            f113618a = null;
        }
    }
}
