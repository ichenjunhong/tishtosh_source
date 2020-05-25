package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.os.Build.VERSION;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import butterknife.ButterKnife;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommentFollowFeedMomentViewHolder */
public class CommentFollowFeedMomentViewHolder extends C1352v {

    /* renamed from: a */
    public Comment f96610a;

    /* renamed from: b */
    public String f96611b;

    /* renamed from: c */
    public int f96612c;

    /* renamed from: d */
    public String f96613d;

    /* renamed from: e */
    public String f96614e;
    public MentionTextView mTvComment;

    public CommentFollowFeedMomentViewHolder(View view, C25147a aVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        view.setOnClickListener(new C37945a(this, aVar));
        this.mTvComment.setHighlightColor(this.mTvComment.getResources().getColor(R.color.a8w));
        if (VERSION.SDK_INT >= 23) {
            this.mTvComment.setBreakStrategy(0);
        }
    }
}
