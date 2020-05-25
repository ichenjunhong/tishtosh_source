package com.p683ss.android.ugc.aweme.main.story.feed;

import android.content.Context;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.main.story.feed.StoryFeedItemViewBig */
public class StoryFeedItemViewBig extends StoryFeedItemView {
    /* access modifiers changed from: protected */
    public int getItemLayout() {
        return R.layout.awv;
    }

    public StoryFeedItemViewBig(Context context) {
        super(context);
    }

    public void bind(C36719c cVar) {
        setIsBig(true);
        super.bind(cVar);
        if (this.mIvAvatar != null) {
            this.mIvAvatar.setAlpha(1.0f);
        }
    }
}
