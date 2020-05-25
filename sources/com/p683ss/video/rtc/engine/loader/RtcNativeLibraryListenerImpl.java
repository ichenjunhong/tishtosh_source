package com.p683ss.video.rtc.engine.loader;

import com.p683ss.video.rtc.engine.utils.LogUtil;

/* renamed from: com.ss.video.rtc.engine.loader.RtcNativeLibraryListenerImpl */
public class RtcNativeLibraryListenerImpl implements RtcNativeLibraryLoaderListener {
    public void onLoadAlready(String str) {
        StringBuilder sb = new StringBuilder("onLoadAlready : ");
        sb.append(str);
        LogUtil.m110867i("RtcNativeLibraryLoaderListener", sb.toString());
    }

    public void onLoadError(String str) {
        StringBuilder sb = new StringBuilder("onLoadError : ");
        sb.append(str);
        LogUtil.m110867i("RtcNativeLibraryLoaderListener", sb.toString());
    }

    public void onLoadSuccess(String str) {
        StringBuilder sb = new StringBuilder("onLoadSuccess : ");
        sb.append(str);
        LogUtil.m110867i("RtcNativeLibraryLoaderListener", sb.toString());
    }
}
