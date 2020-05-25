package com.p683ss.android.ugc.aweme.feed.model;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeForHotComment */
public class AwemeForHotComment {
    public Aweme mAweme;
    public int mEventType;
    public String mHotCommentTargetId;

    public AwemeForHotComment(int i, Aweme aweme) {
        this.mEventType = i;
        this.mAweme = aweme;
    }
}
