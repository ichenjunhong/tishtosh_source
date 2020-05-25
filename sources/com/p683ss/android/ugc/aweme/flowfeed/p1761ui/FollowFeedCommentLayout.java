package com.p683ss.android.ugc.aweme.flowfeed.p1761ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri.Builder;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.flowfeed.p1752a.C31745a;
import com.p683ss.android.ugc.aweme.flowfeed.p1752a.C31752g;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31781d;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.CommentLikeListView.C31822a;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.FollowFeedCommentLayout */
public class FollowFeedCommentLayout extends LinearLayout {

    /* renamed from: a */
    protected int f83163a;

    /* renamed from: b */
    protected String f83164b;

    /* renamed from: c */
    protected List<Comment> f83165c;

    /* renamed from: d */
    protected Aweme f83166d;

    /* renamed from: e */
    protected List<User> f83167e;

    /* renamed from: f */
    protected boolean f83168f;

    /* renamed from: g */
    protected C31745a f83169g;
    int mAvatarSize;
    CircleImageView mImgAvatar;
    LinearLayout mLayoutAddComment;
    CommentLikeListView mLayoutLikes;
    RecyclerView mRecComments;
    DmtTextView mShowAllComments;
    View mSpace;

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.FollowFeedCommentLayout$a */
    public interface C31830a {
        /* renamed from: a */
        void mo64703a(View view, Aweme aweme);

        /* renamed from: a */
        void mo64704a(View view, Aweme aweme, List<User> list, boolean z, String str);

        /* renamed from: a */
        void mo64706a(Aweme aweme, Comment comment);

        /* renamed from: a */
        void mo64707a(Aweme aweme, Comment comment, int i);

        /* renamed from: a */
        void mo64708a(Aweme aweme, String str, String str2);

        /* renamed from: a */
        void mo64710a(Aweme aweme, List<User> list, Comment comment, String str);

        /* renamed from: b */
        void mo64713b(Aweme aweme, String str, String str2);
    }

    public CommentLikeListView getLayoutLikes() {
        return this.mLayoutLikes;
    }

    /* renamed from: a */
    public final void mo64906a() {
        if (this.mLayoutAddComment.getVisibility() != 0) {
            this.mLayoutAddComment.setVisibility(0);
            final LinearLayout linearLayout = this.mLayoutAddComment;
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, this.mImgAvatar.getLayoutParams().height});
            ofInt.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    LayoutParams layoutParams = linearLayout.getLayoutParams();
                    layoutParams.height = intValue;
                    linearLayout.setLayoutParams(layoutParams);
                }
            });
            ofInt.setDuration(150);
            ofInt.start();
        }
    }

    /* renamed from: c */
    public final void mo64911c() {
        long j;
        if (this.f83168f) {
            if (this.f83166d == null || this.f83166d.getStatistics() == null) {
                j = 0;
            } else {
                j = this.f83166d.getStatistics().getDiggCount();
            }
            this.mLayoutLikes.mo51821a(this.f83167e, j, this.f83166d);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind((View) this);
        this.mRecComments.setFocusableInTouchMode(false);
        this.f83169g = C31781d.m73923b().mo64675a();
        this.f83169g.mo54798c(false);
        this.mRecComments.setAdapter(this.f83169g);
        this.mRecComments.setLayoutManager(new WrapLinearLayoutManager(getContext()) {
            /* renamed from: f */
            public final boolean mo4745f() {
                return false;
            }
        });
    }

    /* renamed from: b */
    public void mo64909b() {
        long j;
        if (this.f83168f) {
            if (this.f83166d == null || this.f83166d.getStatistics() == null) {
                j = 0;
            } else {
                j = this.f83166d.getStatistics().getCommentCount();
            }
            if (j <= 0 || this.f83165c == null || j <= ((long) this.f83165c.size())) {
                this.mShowAllComments.setVisibility(8);
                this.mLayoutAddComment.setPadding(0, C23728o.m58241a(12.0d), 0, C23728o.m58241a(12.0d));
                return;
            }
            this.mShowAllComments.setVisibility(0);
            this.mShowAllComments.setText(C2240a.m6772a(getResources().getString(R.string.djl), new Object[]{C33095b.m76068a(j)}));
            this.mLayoutAddComment.setPadding(0, C23728o.m58241a(10.0d), 0, C23728o.m58241a(12.0d));
        }
    }

    public void setEventType(String str) {
        this.f83164b = str;
    }

    public void setPageType(int i) {
        this.f83163a = i;
    }

    public FollowFeedCommentLayout(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    public final void mo64912c(int i) {
        if (this.f83169g != null) {
            this.f83169g.notifyItemChanged(i, Integer.valueOf(0));
        }
    }

    public void setCommentBackground(Drawable drawable) {
        if (drawable != null) {
            this.mRecComments.setBackground(drawable);
        }
    }

    /* renamed from: b */
    public final void mo64910b(int i) {
        if (this.f83169g != null) {
            this.f83169g.notifyItemRemoved(i);
            if (C9376b.m18558a((Collection<T>) this.f83169g.mo50673a())) {
                this.mRecComments.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo64907a(int i) {
        if (this.mRecComments.getVisibility() == 8) {
            this.mRecComments.setVisibility(0);
        }
        if (!this.f83168f && this.f83165c != null && this.f83165c.size() > 1) {
            Comment comment = (Comment) this.f83165c.get(1);
            if (!(C20854a.m53167g().getCurUser() == null || comment.getUser() == null || !TextUtils.equals(C20854a.m53167g().getCurUser().getUid(), comment.getUser().getUid()))) {
                this.f83165c.remove(1);
            }
        }
        if (this.f83169g != null) {
            this.f83169g.notifyDataSetChanged();
        }
    }

    public void setDisplayType(boolean z) {
        this.f83168f = z;
        if (this.f83168f) {
            int a = C23728o.m58241a(8.0d);
            setBackgroundResource(R.drawable.cx2);
            this.mSpace.setVisibility(0);
            this.mLayoutLikes.setVisibility(0);
            this.mLayoutAddComment.setVisibility(0);
            this.mShowAllComments.setVisibility(0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mRecComments.getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.rightMargin = a;
            layoutParams.leftMargin = a;
            this.mRecComments.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mLayoutAddComment.getLayoutParams();
            layoutParams2.topMargin = 0;
            layoutParams2.rightMargin = a;
            layoutParams2.leftMargin = a;
            this.mLayoutAddComment.setLayoutParams(layoutParams2);
            m74164a(this.mShowAllComments, a);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.mLayoutLikes.getLayoutParams();
            layoutParams3.topMargin = a;
            layoutParams3.rightMargin = a;
            layoutParams3.leftMargin = a;
            this.mLayoutLikes.setLayoutParams(layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.mImgAvatar.getLayoutParams();
            layoutParams4.width = C23728o.m58241a(16.0d);
            layoutParams4.height = C23728o.m58241a(16.0d);
            this.mImgAvatar.setLayoutParams(layoutParams4);
            this.mImgAvatar.mo48984a(false, false);
            this.mImgAvatar.setImageURI(new Builder().scheme("res").path("2131953109").build());
            return;
        }
        this.mSpace.setVisibility(8);
        this.mLayoutLikes.setVisibility(8);
        this.mLayoutAddComment.setVisibility(8);
        this.mShowAllComments.setVisibility(8);
    }

    public FollowFeedCommentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    protected static void m74164a(View view, int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.rightMargin = i;
        layoutParams.leftMargin = i;
        view.setLayoutParams(layoutParams);
    }

    public FollowFeedCommentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo64908a(final Aweme aweme, List<Comment> list, List<User> list2, final C31830a aVar) {
        String str;
        String str2;
        this.f83165c = list;
        this.f83166d = aweme;
        this.f83167e = list2;
        boolean z = true;
        if (this.f83166d.isAd()) {
            AwemeStatistics statistics = this.f83166d.getStatistics();
            C26129j commentArea = this.f83166d.getAwemeRawAd().getCommentArea();
            if (commentArea != null && (commentArea.getShowCommentNumber() != -1 ? statistics == null || statistics.getCommentCount() + statistics.getDiggCount() + statistics.getShareCount() >= ((long) commentArea.getShowCommentNumber()) : statistics == null || statistics.getCommentCount() > 0) && this.f83166d.getAwemeRawAd().isCommentAreaSwitch() && commentArea != null && commentArea.getType() != 1 && (C9376b.m18558a((Collection<T>) this.f83165c) || !(this.f83165c.get(0) instanceof C26129j))) {
                if (this.f83165c == null) {
                    this.f83165c = new ArrayList();
                }
                commentArea.setAid(this.f83166d.getAid());
                commentArea.setAwemeId(this.f83166d.getAid());
                User user = new User();
                if (this.f83166d.getAuthor() != null) {
                    str = this.f83166d.getAuthor().getUid();
                } else {
                    str = "";
                }
                user.setUid(str);
                if (this.f83166d.getAuthor() != null) {
                    str2 = this.f83166d.getAuthor().getSecUid();
                } else {
                    str2 = "";
                }
                user.setSecUid(str2);
                user.setAvatarThumb(commentArea.getAvatarIcon());
                commentArea.setUser(user);
                this.f83165c.add(0, commentArea);
            }
        }
        if (!this.f83168f && this.f83165c != null && this.f83165c.size() > 2) {
            Comment comment = (Comment) this.f83165c.get(0);
            Comment comment2 = (Comment) this.f83165c.get(1);
            this.f83165c.clear();
            this.f83165c.add(comment);
            this.f83165c.add(comment2);
        }
        if (this.f83168f) {
            mo64909b();
            this.mShowAllComments.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (aVar != null) {
                        aVar.mo64704a(FollowFeedCommentLayout.this.mShowAllComments, aweme, FollowFeedCommentLayout.this.f83167e, false, "click_more_comment");
                    }
                }
            });
            this.mLayoutLikes.setDiggCountCallback(new C31822a() {
                /* renamed from: a */
                public final void mo64903a(long j) {
                    int i;
                    View view = FollowFeedCommentLayout.this.mSpace;
                    if (j > 0) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    view.setVisibility(i);
                }
            });
            mo64911c();
            this.mLayoutLikes.setEventType(this.f83164b);
            this.mLayoutLikes.setAuthorId(this.f83166d.getAuthorUid());
            this.mLayoutLikes.setAwemeId(this.f83166d.getAid());
        } else if (C20854a.m53167g().getCurUser().getAvatarThumb() != null) {
            C23515d.m57670a((RemoteImageView) this.mImgAvatar, C20854a.m53167g().getCurUser().getAvatarThumb(), this.mAvatarSize, this.mAvatarSize);
        } else {
            C23515d.m57686b(this.mImgAvatar, "", this.mAvatarSize, this.mAvatarSize);
        }
        if (C9376b.m18558a((Collection<T>) list)) {
            this.mRecComments.setVisibility(8);
        } else {
            this.mRecComments.setVisibility(0);
        }
        this.mRecComments.setLayoutManager(new WrapLinearLayoutManager(getContext()) {
            /* renamed from: f */
            public final boolean mo4745f() {
                return false;
            }
        });
        this.mRecComments.setFocusable(false);
        C31752g gVar = new C31752g(aweme, list2, aVar, this.f83168f, this.f83164b, this.f83163a);
        this.f83169g.mo64620a(gVar);
        this.f83169g.mo50303a(this.f83165c);
        this.f83169g.notifyDataSetChanged();
        if (aweme == null || aweme.isCmtSwt()) {
            z = false;
        }
        if (z) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
    }
}
