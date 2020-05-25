package com.p683ss.video.rtc.interact.model;

/* renamed from: com.ss.video.rtc.interact.model.TalkingState */
public class TalkingState {
    public String mInteractId;
    public boolean mIsTalking;

    public String getInteractId() {
        return this.mInteractId;
    }

    public boolean getTalkingState() {
        return this.mIsTalking;
    }

    public TalkingState setInteractId(String str) {
        this.mInteractId = str;
        return this;
    }

    public TalkingState setTalkingState(boolean z) {
        this.mIsTalking = z;
        return this;
    }

    public TalkingState(String str, boolean z) {
        this.mInteractId = str;
        this.mIsTalking = z;
    }
}
