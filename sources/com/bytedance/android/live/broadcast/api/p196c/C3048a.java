package com.bytedance.android.live.broadcast.api.p196c;

import android.os.Bundle;
import android.view.SurfaceView;
import com.p683ss.avframework.livestreamv2.ILiveStream.CatchVideoCallback;
import com.p683ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener;
import com.p683ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener;
import com.p683ss.avframework.livestreamv2.core.Client;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.avframework.livestreamv2.filter.IFilterManager;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.bytedance.android.live.broadcast.api.c.a */
public interface C3048a {
    /* renamed from: a */
    Client mo8292a(InteractConfig interactConfig, Boolean bool);

    /* renamed from: a */
    void mo8293a();

    /* renamed from: a */
    void mo8294a(Bundle bundle, CatchVideoCallback catchVideoCallback);

    /* renamed from: a */
    void mo8295a(SurfaceView surfaceView);

    /* renamed from: a */
    void mo8296a(C3049b bVar);

    /* renamed from: a */
    void mo8297a(ILiveStreamErrorListener iLiveStreamErrorListener);

    /* renamed from: a */
    void mo8298a(ITextureFrameAvailableListener iTextureFrameAvailableListener);

    /* renamed from: a */
    void mo8299a(String str);

    /* renamed from: a */
    void mo8300a(List<String> list);

    /* renamed from: a */
    void mo8301a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j);

    /* renamed from: a */
    void mo8302a(boolean z);

    /* renamed from: b */
    void mo8303b();

    /* renamed from: c */
    void mo8304c();

    /* renamed from: d */
    void mo8305d();

    /* renamed from: e */
    void mo8306e();

    /* renamed from: f */
    void mo8307f();

    /* renamed from: g */
    IFilterManager mo8308g();

    /* renamed from: h */
    void mo8309h();

    /* renamed from: i */
    void mo8310i();
}
