package com.p683ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.comment.list.C25265n;
import com.p683ss.android.ugc.aweme.comment.list.C25268q;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.q */
public final class C25128q extends CommentViewHolderNewStyle implements C25268q {
    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo51164i() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo51170j() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo51159c() {
        return C25282a.m61494a().isBlackBackground();
    }

    /* renamed from: a */
    public final void mo51152a(Comment comment) {
        super.mo51152a(comment);
        if (this.mCommentTimeView != null) {
            this.mCommentTimeView.setVisibility(8);
        }
        this.mContentView.setTextColor(C11010c.m22280a().getResources().getColor(R.color.a17));
        this.mReplyContentView.setTextColor(C11010c.m22280a().getResources().getColor(R.color.a17));
        this.mReplyDivider.setBackgroundResource(R.drawable.ci1);
        this.mTvRelationLabel.setBackgroundResource(R.drawable.de8);
        this.mTvReplyCommentRelationLabel.setBackgroundResource(R.drawable.de8);
        if (this.f66450f == 9 && C25282a.m61494a().isSearchMixViewHolder()) {
            this.mTitleView.requestLayout();
            this.mContentView.setTextSize(14.0f);
            this.mContentView.setLineSpacing(C9432q.m18687b(this.itemView.getContext(), 1.2f), 1.0f);
            LayoutParams layoutParams = this.mContentView.getLayoutParams();
            if (layoutParams instanceof MarginLayoutParams) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.rightMargin = (int) C9432q.m18687b(this.itemView.getContext(), 8.0f);
                this.mContentView.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public C25128q(ViewGroup viewGroup, C25147a aVar, String str) {
        super(C41431k.f105004a.inflateLayoutFromCache(viewGroup, R.layout.b1u), aVar, str);
        this.itemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C25128q.this.f66453i != null) {
                    C25128q.this.f66453i.mo51253a((C25265n) C25128q.this.f66451g, C25128q.this.f66445a);
                }
            }
        });
        this.itemView.setOnLongClickListener(new OnLongClickListener() {
            public final boolean onLongClick(View view) {
                if (C25128q.this.f66453i != null) {
                    C25128q.this.f66453i.mo51259b((C25265n) C25128q.this.f66451g, C25128q.this.f66445a);
                }
                return true;
            }
        });
    }
}
