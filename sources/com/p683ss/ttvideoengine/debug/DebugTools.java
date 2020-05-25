package com.p683ss.ttvideoengine.debug;

import android.view.ViewGroup;
import com.p683ss.ttvideoengine.TTVideoEngine;

/* renamed from: com.ss.ttvideoengine.debug.DebugTools */
public class DebugTools {
    public static boolean DEBUG;
    private int mDebugType = 1;
    private ViewGroup mHudView;
    private InfoHudViewHolderInterface mHudViewHolder;
    private TTVideoEngine mVideoEngine;

    public void stop() {
        if (DEBUG && (this.mDebugType & 1) == 1 && this.mHudView != null && this.mHudViewHolder != null) {
            this.mHudView.setVisibility(8);
            this.mHudViewHolder.monitor(false);
        }
    }

    public void start() {
        if (DEBUG && (this.mDebugType & 1) == 1 && this.mVideoEngine != null && this.mHudViewHolder != null && this.mHudView != null && this.mVideoEngine != null) {
            this.mHudViewHolder.setVideoEngine(this.mVideoEngine);
            this.mHudView.setVisibility(0);
            this.mHudViewHolder.monitor(true);
        }
    }

    public void setDebugType(int i) {
        if (DEBUG) {
            this.mDebugType = i;
        }
    }

    public void setVideoEngine(TTVideoEngine tTVideoEngine) {
        if (DEBUG) {
            this.mVideoEngine = tTVideoEngine;
        }
    }

    public void setInfoHudView(ViewGroup viewGroup) {
        stop();
        if (DEBUG && this.mHudViewHolder == null) {
            this.mHudView = viewGroup;
            this.mHudViewHolder = new InfoHudViewHolder(viewGroup);
        }
    }
}
