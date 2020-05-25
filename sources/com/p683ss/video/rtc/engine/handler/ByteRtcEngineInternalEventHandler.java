package com.p683ss.video.rtc.engine.handler;

import com.p683ss.video.rtc.engine.RtcEngineImpl.C51644RtcEngineImpl;
import com.p683ss.video.rtc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.video.rtc.engine.handler.ByteRtcEngineInternalEventHandler */
public class ByteRtcEngineInternalEventHandler {
    private WeakReference<C51644RtcEngineImpl> mRtcEngineImpl;

    public ByteRtcEngineInternalEventHandler(C51644RtcEngineImpl rtcEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rtcEngineImpl);
    }

    public void onConfigAddrChanged(String str) {
        try {
            if (!(this.mRtcEngineImpl == null || ((C51644RtcEngineImpl) this.mRtcEngineImpl.get()).getRtcEngineInternalEventHandler() == null)) {
                ((C51644RtcEngineImpl) this.mRtcEngineImpl.get()).getRtcEngineInternalEventHandler().onConfigAddrChanged(str);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onConfigAddrChanged callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m110864d("ByteRtcEngineInternalEventHandler", sb.toString());
        }
    }

    public void onSignalingAddrChanged(String str) {
        try {
            if (!(this.mRtcEngineImpl == null || ((C51644RtcEngineImpl) this.mRtcEngineImpl.get()).getRtcEngineInternalEventHandler() == null)) {
                ((C51644RtcEngineImpl) this.mRtcEngineImpl.get()).getRtcEngineInternalEventHandler().onSignalingAddrChanged(str);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onSignalingAddrChanged callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m110864d("ByteRtcEngineInternalEventHandler", sb.toString());
        }
    }

    public void onPeerConnectionICEMux(boolean z) {
        StringBuilder sb = new StringBuilder("onPeerConnectionICEMux..., muxed : ");
        sb.append(z);
        LogUtil.m110864d("ByteRtcEngineInternalEventHandler", sb.toString());
        try {
            if (!(this.mRtcEngineImpl == null || ((C51644RtcEngineImpl) this.mRtcEngineImpl.get()).getRtcEngineInternalEventHandler() == null)) {
                ((C51644RtcEngineImpl) this.mRtcEngineImpl.get()).getRtcEngineInternalEventHandler().onPeerConnectionICEMux(z);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onPeerConnectionICEMux callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m110864d("ByteRtcEngineInternalEventHandler", sb2.toString());
        }
    }

    public void onSystemInfoLog(double d, double d2, double d3) {
        try {
            if (!(this.mRtcEngineImpl == null || ((C51644RtcEngineImpl) this.mRtcEngineImpl.get()).getRtcEngineInternalEventHandler() == null)) {
                ((C51644RtcEngineImpl) this.mRtcEngineImpl.get()).getRtcEngineInternalEventHandler().onSystemInfoLog(d, d2, d3);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onSystemInfoLog callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m110864d("ByteRtcEngineInternalEventHandler", sb.toString());
        }
    }
}
