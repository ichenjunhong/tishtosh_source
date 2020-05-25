package com.p683ss.ugc.live.sdk.p2606b;

import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.ugc.live.sdk.b.c */
public interface C51627c {

    /* renamed from: com.ss.ugc.live.sdk.b.c$a */
    public interface C51628a {
        /* renamed from: a */
        void mo78953a(C51629b bVar, int i, String str);
    }

    /* renamed from: com.ss.ugc.live.sdk.b.c$b */
    public enum C51629b {
        PREPARED,
        PREPARE_FAILED,
        VIDEO_SIZE_CHANGED,
        PLAY_COMPLETED,
        MEDIA_ERROR,
        RENDERING_START,
        BUFFERING_START,
        BUFFERING_END,
        SEI_UPDATE
    }

    /* renamed from: com.ss.ugc.live.sdk.b.c$c */
    public enum C51630c {
        VIDEO,
        AUDIO,
        OBS,
        SCREENSHOT
    }

    /* renamed from: a */
    void mo78954a();

    /* renamed from: a */
    void mo78955a(Surface surface);

    /* renamed from: a */
    void mo78956a(SurfaceHolder surfaceHolder);

    /* renamed from: a */
    void mo78957a(C51628a aVar);

    /* renamed from: a */
    void mo78958a(String str, Map<String, String> map, C51630c cVar) throws IOException;

    /* renamed from: b */
    void mo78959b();

    /* renamed from: c */
    void mo78960c();

    /* renamed from: d */
    void mo78961d();

    /* renamed from: e */
    void mo78962e();

    /* renamed from: f */
    boolean mo78963f();

    /* renamed from: g */
    long mo78964g();

    /* renamed from: h */
    long mo78965h();
}
