package com.p683ss.android.ugc.aweme.comment.abtest;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "direct_show_comment_mention_list")
/* renamed from: com.ss.android.ugc.aweme.comment.abtest.DouyinDirectShowCommentMentionList */
public final class DouyinDirectShowCommentMentionList {
    @C10179b(mo18165a = true)
    private static final int DISABLED = 0;
    @C10179b
    private static final int ENABLED_WITHOUT_IM_TAG = 1;
    @C10179b
    private static final int ENABLED_WITH_IM_TAG = 2;
    public static final DouyinDirectShowCommentMentionList INSTANCE = new DouyinDirectShowCommentMentionList();

    private DouyinDirectShowCommentMentionList() {
    }
}
