package com.bytedance.android.livesdk.player;

import android.graphics.Point;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.g */
public interface C8086g {

    /* renamed from: com.bytedance.android.livesdk.player.g$a */
    public interface C8087a {
        /* renamed from: a */
        void mo14265a(C8089c cVar, int i, String str);
    }

    /* renamed from: com.bytedance.android.livesdk.player.g$b */
    public interface C8088b {
        /* renamed from: e */
        void mo14266e();

        /* renamed from: f */
        void mo14267f();
    }

    /* renamed from: com.bytedance.android.livesdk.player.g$c */
    public enum C8089c {
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

    /* renamed from: com.bytedance.android.livesdk.player.g$d */
    public enum C8090d {
        VIDEO,
        AUDIO,
        OBS,
        SCREENSHOT
    }

    /* renamed from: a */
    void mo14243a();

    /* renamed from: a */
    void mo14244a(int i);

    /* renamed from: a */
    void mo14245a(Surface surface);

    /* renamed from: a */
    void mo14246a(SurfaceHolder surfaceHolder);

    /* renamed from: a */
    void mo14247a(C8087a aVar, C8088b bVar);

    /* renamed from: a */
    void mo14248a(String str);

    /* renamed from: a */
    void mo14249a(String str, String str2) throws IOException;

    /* renamed from: a */
    void mo14250a(String str, Map<String, String> map, C8090d dVar) throws IOException;

    /* renamed from: a */
    void mo14251a(boolean z);

    /* renamed from: a */
    void mo14252a(boolean z, boolean z2, int i);

    /* renamed from: b */
    void mo14253b();

    /* renamed from: b */
    void mo14254b(String str);

    /* renamed from: b */
    void mo14255b(boolean z);

    /* renamed from: c */
    void mo14256c();

    /* renamed from: c */
    void mo14257c(boolean z);

    /* renamed from: d */
    void mo14258d();

    /* renamed from: e */
    void mo14259e();

    /* renamed from: f */
    void mo14260f();

    /* renamed from: g */
    boolean mo14261g();

    /* renamed from: h */
    boolean mo14262h();

    /* renamed from: i */
    Point mo14263i();

    /* renamed from: j */
    JSONObject mo14264j();
}
