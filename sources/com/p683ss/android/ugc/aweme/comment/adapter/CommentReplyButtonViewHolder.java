package com.p683ss.android.ugc.aweme.comment.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.comment.list.C25261j;
import com.p683ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.comment.p1528ui.C25392y;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentReplyButtonViewHolder */
public class CommentReplyButtonViewHolder extends C1352v implements C25261j {

    /* renamed from: a */
    public CommentReplyButtonStruct f66403a;
    View mCollapseLayout;
    View mDivider;
    View mExpandLayout;
    ImageView mImgExpand;
    LinearLayout mLayoutButton;
    DmtLoadingLayout mLayoutLoading;
    DmtTextView mTvTitle;

    /* renamed from: a */
    public final int mo51131a() {
        return this.f66403a.getButtonStatus();
    }

    /* renamed from: f */
    private void m60934f() {
        this.mLayoutButton.setVisibility(8);
        this.mLayoutLoading.setVisibility(0);
    }

    /* renamed from: e */
    private void m60933e() {
        this.mLayoutButton.setVisibility(0);
        this.mLayoutLoading.setVisibility(8);
        this.mExpandLayout.setVisibility(8);
        this.mCollapseLayout.setVisibility(0);
    }

    /* renamed from: d */
    private void m60932d() {
        this.mLayoutButton.setVisibility(0);
        this.mLayoutLoading.setVisibility(8);
        this.mTvTitle.setText(R.string.fvn);
        this.mDivider.setVisibility(0);
        this.mExpandLayout.setVisibility(0);
        this.mCollapseLayout.setVisibility(0);
    }

    /* renamed from: b */
    private void m60930b() {
        if (this.f66403a.getReplyCommentTotal() > ((long) this.f66403a.getTopSize()) || this.f66403a.getButtonStatus() == 4) {
            switch (this.f66403a.getButtonStatus()) {
                case 0:
                    m60931c();
                    return;
                case 1:
                    m60932d();
                    return;
                case 2:
                    if (this.f66403a != null) {
                        int expandSize = this.f66403a.getExpandSize();
                        this.f66403a.setReplyCommentTotal((long) expandSize);
                        if (expandSize <= this.f66403a.getTopSize()) {
                            mo51132a(4);
                            return;
                        }
                    }
                    m60933e();
                    return;
                case 3:
                    m60934f();
                    return;
                case 4:
                    this.itemView.getLayoutParams().height = 0;
                    this.itemView.requestLayout();
                    break;
            }
            return;
        }
        mo51132a(4);
    }

    /* renamed from: c */
    private void m60931c() {
        this.mLayoutButton.setVisibility(0);
        this.mLayoutLoading.setVisibility(8);
        this.mTvTitle.setText(C2240a.m6772a(this.mTvTitle.getResources().getString(R.string.fvo), new Object[]{C33095b.m76068a(this.f66403a.getReplyCommentTotal() - ((long) this.f66403a.getExpandSize()))}));
        this.mDivider.setVisibility(8);
        this.mExpandLayout.setVisibility(0);
        this.mCollapseLayout.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo51132a(int i) {
        if (this.f66403a != null) {
            this.f66403a.setButtonStatus(i);
        }
        m60930b();
    }

    /* renamed from: a */
    public final void mo51133a(CommentReplyButtonStruct commentReplyButtonStruct) {
        if (commentReplyButtonStruct != null) {
            this.f66403a = commentReplyButtonStruct;
            m60930b();
        }
    }

    public CommentReplyButtonViewHolder(ViewGroup viewGroup, final C25147a aVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b1q, viewGroup, false));
        ButterKnife.bind((Object) this, this.itemView);
        this.mExpandLayout.setOnTouchListener(new C25392y() {
            /* renamed from: a */
            public final void mo51134a(View view) {
                if (CommentReplyButtonViewHolder.this.f66403a != null && aVar != null && CommentReplyButtonViewHolder.this.f66403a.getButtonStatus() != 3) {
                    aVar.mo51256a(CommentReplyButtonViewHolder.this.f66403a, (C25261j) CommentReplyButtonViewHolder.this);
                }
            }
        });
        this.mCollapseLayout.setOnTouchListener(new C25392y() {
            /* renamed from: a */
            public final void mo51134a(View view) {
                if (CommentReplyButtonViewHolder.this.f66403a != null && aVar != null && CommentReplyButtonViewHolder.this.f66403a.getButtonStatus() != 3) {
                    CommentReplyButtonViewHolder.this.f66403a.setButtonStatus(2);
                    aVar.mo51256a(CommentReplyButtonViewHolder.this.f66403a, (C25261j) CommentReplyButtonViewHolder.this);
                }
            }
        });
        this.mLayoutLoading.setProgressBarInfo(C23728o.m58241a(28.0d));
        if (C25282a.m61494a().isBlackBackground()) {
            this.mTvTitle.setTextColor(this.itemView.getResources().getColor(R.color.a1a));
            this.mImgExpand.setImageResource(R.drawable.ciw);
            this.mDivider.setBackgroundResource(R.drawable.chx);
        }
    }
}
