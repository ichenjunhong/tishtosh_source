package com.p683ss.video.rtc.engine.p2608ui;

import com.p683ss.video.rtc.engine.mediaio.IFrameRender;
import org.webrtc.EglBase.Context;
import org.webrtc.RendererCommon.ScalingType;

/* renamed from: com.ss.video.rtc.engine.ui.RenderView */
public interface RenderView extends IFrameRender {
    void init(Context context);

    void release();

    void setMirror(boolean z);

    void setScalingType(ScalingType scalingType);
}
