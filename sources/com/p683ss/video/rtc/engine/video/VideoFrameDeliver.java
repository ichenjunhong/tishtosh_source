package com.p683ss.video.rtc.engine.video;

import com.p683ss.video.rtc.engine.mediaio.IFrameRender;
import com.p683ss.video.rtc.engine.utils.LogUtil;
import java.util.HashMap;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.video.rtc.engine.video.VideoFrameDeliver */
public class VideoFrameDeliver {
    private static VideoFrameDeliver mInstance;
    private String mScreenLocalUid = "";
    private HashMap<String, IFrameRender> mUidScreenObserverMap = new HashMap<>();
    private HashMap<String, IFrameRender> mUidVideoObserverMap = new HashMap<>();
    private String mVideoLocalUid = "";

    public static VideoFrameDeliver instance() {
        if (mInstance == null) {
            mInstance = new VideoFrameDeliver();
        }
        return mInstance;
    }

    private VideoFrameDeliver() {
    }

    public void clearObservers() {
        LogUtil.m110864d("VideoFrameDeliver", "clear all observers including video and screen.");
        this.mVideoLocalUid = "";
        this.mScreenLocalUid = "";
        this.mUidVideoObserverMap.clear();
    }

    public void deregisterScreenFrameObserver(String str) {
        StringBuilder sb = new StringBuilder("deregister screen frame observer for uid: ");
        sb.append(str);
        LogUtil.m110867i("VideoFrameDeliver", sb.toString());
        this.mUidScreenObserverMap.remove(str);
    }

    public void deregisterVideoFrameObserver(String str) {
        StringBuilder sb = new StringBuilder("deregister video frame observer for uid: : ");
        sb.append(str);
        LogUtil.m110867i("VideoFrameDeliver", sb.toString());
        this.mUidVideoObserverMap.remove(str);
    }

    public void setScreenLocalUid(String str) {
        StringBuilder sb = new StringBuilder("set local uid of screen frame deliver, uid: ");
        sb.append(str);
        LogUtil.m110864d("VideoFrameDeliver", sb.toString());
        this.mScreenLocalUid = str;
    }

    public void setVideoLocalUid(String str) {
        StringBuilder sb = new StringBuilder("set local uid of video frame deliver, uid: ");
        sb.append(str);
        LogUtil.m110864d("VideoFrameDeliver", sb.toString());
        this.mVideoLocalUid = str;
    }

    public void registerScreenFrameObserver(String str, IFrameRender iFrameRender) {
        StringBuilder sb = new StringBuilder("register screen frame observer for uid: : ");
        sb.append(str);
        LogUtil.m110867i("VideoFrameDeliver", sb.toString());
        this.mUidScreenObserverMap.put(str, iFrameRender);
    }

    public void registerVideoFrameObserver(String str, IFrameRender iFrameRender) {
        StringBuilder sb = new StringBuilder("register video frame observer for uid: ");
        sb.append(str);
        LogUtil.m110867i("VideoFrameDeliver", sb.toString());
        this.mUidVideoObserverMap.put(str, iFrameRender);
    }

    public void deliverScreenFrame(String str, VideoFrame videoFrame) {
        if (str.isEmpty()) {
            StringBuilder sb = new StringBuilder("deliverScreenFrame uid is empty and replace to : ");
            sb.append(this.mVideoLocalUid);
            LogUtil.m110868w("VideoFrameDeliver", sb.toString());
            str = this.mScreenLocalUid;
        }
        if (this.mUidScreenObserverMap.get(str) != null) {
            ((IFrameRender) this.mUidScreenObserverMap.get(str)).onVideoFrame(videoFrame);
        }
    }

    public void deliverVideoFrame(String str, VideoFrame videoFrame) {
        if (str.isEmpty()) {
            StringBuilder sb = new StringBuilder("deliverVideoFrame uid is empty and replace to : ");
            sb.append(this.mVideoLocalUid);
            LogUtil.m110868w("VideoFrameDeliver", sb.toString());
            str = this.mVideoLocalUid;
        }
        if (this.mUidVideoObserverMap.get(str) != null) {
            ((IFrameRender) this.mUidVideoObserverMap.get(str)).onVideoFrame(videoFrame);
        }
    }
}
