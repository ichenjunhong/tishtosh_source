package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.comment.GifEmojiServiceImpl;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45549f;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48160d;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.b */
public final /* synthetic */ class C37952b implements Runnable {

    /* renamed from: a */
    private final CommentFollowFeedMomentViewHolder f96634a;

    /* renamed from: b */
    private final Comment f96635b;

    public C37952b(CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder, Comment comment) {
        this.f96634a = commentFollowFeedMomentViewHolder;
        this.f96635b = comment;
    }

    public final void run() {
        CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder = this.f96634a;
        Comment comment = this.f96635b;
        String textWithGifEmojiDetailTail = C25280a.m61493a().getTextWithGifEmojiDetailTail(comment, C25280a.m61493a().getDisplayTextForMoment(commentFollowFeedMomentViewHolder.f96610a, commentFollowFeedMomentViewHolder.mTvComment.getPaint(), commentFollowFeedMomentViewHolder.mTvComment.getMeasuredWidth()));
        if (!TextUtils.isEmpty(textWithGifEmojiDetailTail)) {
            commentFollowFeedMomentViewHolder.mTvComment.setText(textWithGifEmojiDetailTail);
            C29408b.m69342a((TextView) commentFollowFeedMomentViewHolder.mTvComment);
        }
        if (C25280a.m61493a().hasTextExtra(comment)) {
            commentFollowFeedMomentViewHolder.mTvComment.setSpanColor(commentFollowFeedMomentViewHolder.mTvComment.getResources().getColor(R.color.a0z));
            commentFollowFeedMomentViewHolder.mTvComment.setOnSpanClickListener(new C37953c(commentFollowFeedMomentViewHolder));
            List dispalyTextExtraForMoment = C25280a.m61493a().getDispalyTextExtraForMoment(comment);
            C29366a emoji = comment.getEmoji();
            if (emoji != null) {
                int length = textWithGifEmojiDetailTail.length();
                dispalyTextExtraForMoment.addAll(GifEmojiServiceImpl.createIGifEmojiServicebyMonsterPlugin().getGifEmojiDetailTailSpan(emoji, length - 1, length));
            }
            commentFollowFeedMomentViewHolder.mTvComment.mo95551a(dispalyTextExtraForMoment, (C48160d) new C45549f(true));
            commentFollowFeedMomentViewHolder.mTvComment.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
