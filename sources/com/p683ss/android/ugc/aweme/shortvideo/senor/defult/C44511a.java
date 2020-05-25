package com.p683ss.android.ugc.aweme.shortvideo.senor.defult;

import android.content.Context;
import android.view.OrientationEventListener;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.senor.defult.a */
public final class C44511a extends OrientationEventListener {

    /* renamed from: a */
    private final C20457b f112625a;

    public final void onOrientationChanged(int i) {
        if (i <= 45 || i > 315) {
            i = 0;
        }
        if (i > 45 && i <= 135) {
            i = 90;
        }
        if (i > 135 && i <= 225) {
            i = NormalGiftView.ALPHA_180;
        }
        if (i > 225) {
            i = 270;
        }
        this.f112625a.mo43339a(0.0f, 0.0f, (float) i);
    }

    public C44511a(Context context, C20457b bVar) {
        super(context);
        this.f112625a = bVar;
    }
}
