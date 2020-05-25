package com.p683ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.CommentUtils */
public final class CommentUtils {
    public static final CommentUtils INSTANCE = new CommentUtils();

    private CommentUtils() {
    }

    public static final boolean needMob(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null || !C52711k.m112239a((Object) "comment_reply", (Object) shortVideoContext.f107132y) || shortVideoContext.f107125r == null) {
            return false;
        }
        return true;
    }

    public static final boolean isDataValid(CommentVideoModel commentVideoModel) {
        if (commentVideoModel != null && !TextUtils.isEmpty(commentVideoModel.getUserName()) && !TextUtils.isEmpty(commentVideoModel.getCommentMsg()) && !TextUtils.isEmpty(commentVideoModel.getAwemeId()) && !TextUtils.isEmpty(commentVideoModel.getUserId())) {
            return true;
        }
        return false;
    }

    public static final boolean needMob(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || !C52711k.m112239a((Object) "comment_reply", (Object) videoPublishEditModel.mShootWay) || videoPublishEditModel.commentVideoModel == null) {
            return false;
        }
        return true;
    }
}
