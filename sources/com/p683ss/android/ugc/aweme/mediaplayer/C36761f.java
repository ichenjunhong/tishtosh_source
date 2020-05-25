package com.p683ss.android.ugc.aweme.mediaplayer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.f */
final /* synthetic */ class C36761f implements C0011g {

    /* renamed from: a */
    private final MediaPlayerModule f93941a;

    /* renamed from: b */
    private final SurfaceTexture f93942b;

    C36761f(MediaPlayerModule mediaPlayerModule, SurfaceTexture surfaceTexture) {
        this.f93941a = mediaPlayerModule;
        this.f93942b = surfaceTexture;
    }

    public final Object then(C0013i iVar) {
        MediaPlayerModule mediaPlayerModule = this.f93941a;
        SurfaceTexture surfaceTexture = this.f93942b;
        if (iVar.mo33d() || iVar.mo31c() || ((Integer) iVar.mo34e()).intValue() < 0) {
            return null;
        }
        Surface surface = new Surface(surfaceTexture);
        boolean a = mediaPlayerModule.f93929b.mo75878a(surface);
        surface.release();
        return Boolean.valueOf(a);
    }
}
