package com.p683ss.android.ugc.aweme.flowfeed.p1761ui;

import android.content.Context;
import android.net.Uri.Builder;
import android.support.p043v7.widget.RecyclerView;
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
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.flowfeed.p1752a.C31745a;
import com.p683ss.android.ugc.aweme.flowfeed.p1752a.C31752g;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31781d;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedCommentLayout.C31830a;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.InsFollowFeedCommentLayout */
public final class InsFollowFeedCommentLayout extends FollowFeedCommentLayout {

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.InsFollowFeedCommentLayout$a */
    static final class C31832a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InsFollowFeedCommentLayout f83186a;

        /* renamed from: b */
        final /* synthetic */ C31830a f83187b;

        /* renamed from: c */
        final /* synthetic */ Aweme f83188c;

        /* renamed from: d */
        final /* synthetic */ List f83189d;

        C31832a(InsFollowFeedCommentLayout insFollowFeedCommentLayout, C31830a aVar, Aweme aweme, List list) {
            this.f83186a = insFollowFeedCommentLayout;
            this.f83187b = aVar;
            this.f83188c = aweme;
            this.f83189d = list;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C31830a aVar = this.f83187b;
            if (aVar != null) {
                aVar.mo64704a(this.f83186a.mShowAllComments, this.f83188c, this.f83189d, false, "click_more_comment");
            }
        }
    }

    public InsFollowFeedCommentLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public InsFollowFeedCommentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind((View) this);
        RecyclerView recyclerView = this.mRecComments;
        C52711k.m112236a((Object) recyclerView, "mRecComments");
        recyclerView.setFocusableInTouchMode(false);
    }

    /* renamed from: b */
    public final void mo64909b() {
        long j;
        if (this.f83168f) {
            if (this.f83166d != null) {
                Aweme aweme = this.f83166d;
                C52711k.m112236a((Object) aweme, "mAweme");
                if (aweme.getStatistics() != null) {
                    Aweme aweme2 = this.f83166d;
                    C52711k.m112236a((Object) aweme2, "mAweme");
                    AwemeStatistics statistics = aweme2.getStatistics();
                    C52711k.m112236a((Object) statistics, "mAweme.statistics");
                    j = statistics.getCommentCount();
                    if (j > 0 || this.f83165c == null || j <= ((long) this.f83165c.size())) {
                        DmtTextView dmtTextView = this.mShowAllComments;
                        C52711k.m112236a((Object) dmtTextView, "mShowAllComments");
                        dmtTextView.setVisibility(8);
                        this.mLayoutAddComment.setPadding(0, C23728o.m58241a(12.0d), 0, C23728o.m58241a(12.0d));
                    }
                    DmtTextView dmtTextView2 = this.mShowAllComments;
                    C52711k.m112236a((Object) dmtTextView2, "mShowAllComments");
                    dmtTextView2.setVisibility(0);
                    DmtTextView dmtTextView3 = this.mShowAllComments;
                    C52711k.m112236a((Object) dmtTextView3, "mShowAllComments");
                    String string = getResources().getString(R.string.djl);
                    C52711k.m112236a((Object) string, "resources.getString(R.string.show_all_comment)");
                    String a = C2240a.m6772a(string, Arrays.copyOf(new Object[]{C33095b.m76068a(j)}, 1));
                    C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
                    dmtTextView3.setText(a);
                    this.mLayoutAddComment.setPadding(0, C23728o.m58241a(12.0d), 0, C23728o.m58241a(12.0d));
                    return;
                }
            }
            j = 0;
            if (j > 0) {
            }
            DmtTextView dmtTextView4 = this.mShowAllComments;
            C52711k.m112236a((Object) dmtTextView4, "mShowAllComments");
            dmtTextView4.setVisibility(8);
            this.mLayoutAddComment.setPadding(0, C23728o.m58241a(12.0d), 0, C23728o.m58241a(12.0d));
        }
    }

    public final void setDisplayType(boolean z) {
        this.f83168f = z;
        CommentLikeListView commentLikeListView = this.mLayoutLikes;
        C52711k.m112236a((Object) commentLikeListView, "mLayoutLikes");
        commentLikeListView.setVisibility(0);
        LinearLayout linearLayout = this.mLayoutAddComment;
        C52711k.m112236a((Object) linearLayout, "mLayoutAddComment");
        linearLayout.setVisibility(0);
        DmtTextView dmtTextView = this.mShowAllComments;
        C52711k.m112236a((Object) dmtTextView, "mShowAllComments");
        dmtTextView.setVisibility(0);
        m74164a(this.mShowAllComments, 0);
        CircleImageView circleImageView = this.mImgAvatar;
        C52711k.m112236a((Object) circleImageView, "mImgAvatar");
        LayoutParams layoutParams = circleImageView.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = C23728o.m58241a(24.0d);
            layoutParams2.height = C23728o.m58241a(24.0d);
            CircleImageView circleImageView2 = this.mImgAvatar;
            C52711k.m112236a((Object) circleImageView2, "mImgAvatar");
            circleImageView2.setLayoutParams(layoutParams2);
            this.mImgAvatar.mo48984a(false, false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public InsFollowFeedCommentLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo64908a(Aweme aweme, List<? extends Comment> list, List<? extends User> list2, C31830a aVar) {
        List list3;
        this.f83165c = list;
        this.f83166d = aweme;
        this.f83167e = list2;
        mo64909b();
        this.mShowAllComments.setOnClickListener(new C31832a(this, aVar, aweme, list2));
        mo64911c();
        this.mLayoutLikes.setEventType(this.f83164b);
        CommentLikeListView commentLikeListView = this.mLayoutLikes;
        Aweme aweme2 = this.f83166d;
        C52711k.m112236a((Object) aweme2, "mAweme");
        commentLikeListView.setAuthorId(aweme2.getAuthorUid());
        CommentLikeListView commentLikeListView2 = this.mLayoutLikes;
        Aweme aweme3 = this.f83166d;
        C52711k.m112236a((Object) aweme3, "mAweme");
        commentLikeListView2.setAwemeId(aweme3.getAid());
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        User curUser = g.getCurUser();
        C52711k.m112236a((Object) curUser, "AccountProxyService.userService().curUser");
        if (curUser.getAvatarThumb() != null) {
            RemoteImageView remoteImageView = this.mImgAvatar;
            IAccountUserService g2 = C20854a.m53167g();
            C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
            User curUser2 = g2.getCurUser();
            C52711k.m112236a((Object) curUser2, "AccountProxyService.userService().curUser");
            C23515d.m57670a(remoteImageView, curUser2.getAvatarThumb(), this.mAvatarSize, this.mAvatarSize);
        } else {
            this.mImgAvatar.setImageURI(new Builder().scheme("res").path("2131953109").build());
        }
        if (C9376b.m18558a((Collection<T>) list)) {
            RecyclerView recyclerView = this.mRecComments;
            C52711k.m112236a((Object) recyclerView, "mRecComments");
            recyclerView.setVisibility(8);
        } else {
            RecyclerView recyclerView2 = this.mRecComments;
            C52711k.m112236a((Object) recyclerView2, "mRecComments");
            recyclerView2.setVisibility(0);
        }
        RecyclerView recyclerView3 = this.mRecComments;
        C52711k.m112236a((Object) recyclerView3, "mRecComments");
        recyclerView3.setLayoutManager(new InsFollowFeedCommentLayout$bind$2(this, getContext()));
        RecyclerView recyclerView4 = this.mRecComments;
        C52711k.m112236a((Object) recyclerView4, "mRecComments");
        recyclerView4.setFocusable(false);
        if (list2 != null) {
            list3 = C52575l.m112139e((Collection<? extends T>) list2);
        } else {
            list3 = null;
        }
        C31752g gVar = new C31752g(aweme, list3, aVar, true, this.f83164b, this.f83163a);
        if (this.f83169g == null) {
            this.f83169g = C31781d.m73923b().mo64675a();
            this.f83169g.mo64620a(gVar);
            C31745a aVar2 = this.f83169g;
            C52711k.m112236a((Object) aVar2, "mCommentAdapter");
            aVar2.mo54798c(false);
            C31745a aVar3 = this.f83169g;
            C52711k.m112236a((Object) aVar3, "mCommentAdapter");
            aVar3.mo50303a(this.f83165c);
            RecyclerView recyclerView5 = this.mRecComments;
            C52711k.m112236a((Object) recyclerView5, "mRecComments");
            recyclerView5.setAdapter(this.f83169g);
            return;
        }
        this.f83169g.mo64620a(gVar);
        C31745a aVar4 = this.f83169g;
        C52711k.m112236a((Object) aVar4, "mCommentAdapter");
        aVar4.mo50303a(this.f83165c);
        this.f83169g.notifyDataSetChanged();
    }

    public /* synthetic */ InsFollowFeedCommentLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
