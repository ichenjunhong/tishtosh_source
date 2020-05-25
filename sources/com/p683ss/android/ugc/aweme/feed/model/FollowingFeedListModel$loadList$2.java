package com.p683ss.android.ugc.aweme.feed.model;

import android.os.Message;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel$loadList$2 */
final class FollowingFeedListModel$loadList$2<T> implements C1710e<Throwable> {
    final /* synthetic */ FollowingFeedListModel this$0;

    FollowingFeedListModel$loadList$2(FollowingFeedListModel followingFeedListModel) {
        this.this$0 = followingFeedListModel;
    }

    public final void accept(Throwable th) {
        Message obtainMessage = this.this$0.mHandler.obtainMessage(0);
        obtainMessage.obj = new RuntimeException(th);
        this.this$0.mHandler.sendMessage(obtainMessage);
    }
}
