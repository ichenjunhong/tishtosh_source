package com.p683ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.router.SmartRouter;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C22835a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.comment.C25273o;
import com.p683ss.android.ugc.aweme.comment.GifEmojiServiceImpl;
import com.p683ss.android.ugc.aweme.comment.list.C25265n;
import com.p683ss.android.ugc.aweme.comment.list.C25267p;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25225e;
import com.p683ss.android.ugc.aweme.comment.p1528ui.C25330aa;
import com.p683ss.android.ugc.aweme.comment.p1528ui.C25392y;
import com.p683ss.android.ugc.aweme.comment.p1528ui.C25393z;
import com.p683ss.android.ugc.aweme.comment.p1528ui.CommentTranslationStatusView;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.comment.viewmodel.UnReadVideoCommentListViewModel;
import com.p683ss.android.ugc.aweme.comment.widget.C25424a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45549f;
import com.p683ss.android.ugc.aweme.unread.UnReadCircleView;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47857eo;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48160d;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48162f;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder */
public class CommentViewHolder extends C1352v implements C25267p {

    /* renamed from: a */
    public Comment f66445a;

    /* renamed from: b */
    protected String f66446b;

    /* renamed from: c */
    protected String f66447c;

    /* renamed from: d */
    protected String f66448d;

    /* renamed from: e */
    protected String f66449e;

    /* renamed from: f */
    protected int f66450f;

    /* renamed from: g */
    protected C25424a f66451g;

    /* renamed from: h */
    protected boolean f66452h = true;

    /* renamed from: i */
    protected C25147a f66453i;

    /* renamed from: j */
    private UnReadVideoCommentListViewModel f66454j;

    /* renamed from: k */
    private C25392y f66455k = new C25392y() {
        /* renamed from: a */
        public final void mo51134a(View view) {
            if (CommentViewHolder.this.f66445a != null && !C32800a.m75679a(view)) {
                User user = CommentViewHolder.this.f66445a.getUser();
                if (!(user == null || TextUtils.isEmpty(user.getUid()) || CommentViewHolder.this.f66453i == null)) {
                    CommentViewHolder.this.f66453i.mo51258a(user.getUid(), user.getSecUid());
                }
            }
        }
    };
    SmartAvatarImageView mAvatarView;
    View mBgView;
    ImageView mBuryView;
    protected MentionTextView mContentView;
    View mInvalidUsernamePrompt;
    ImageView mMenuItem;
    public View mReplyContainer;
    protected MentionTextView mReplyContentView;
    protected View mReplyDivider;
    DmtTextView mReplyTitleView;
    View mRootView;
    DmtTextView mTitleView;
    CommentTranslationStatusView mTranslationView;
    UnReadCircleView mUnReadCircleView;
    int size;

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder$a */
    class C25088a implements OnClickListener, OnLongClickListener {
        C25088a() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (CommentViewHolder.this.f66453i != null && CommentViewHolder.this.f66445a != null) {
                CommentViewHolder.this.f66453i.mo51253a((C25265n) CommentViewHolder.this.f66451g, CommentViewHolder.this.f66445a);
            }
        }

        public final boolean onLongClick(View view) {
            if (!(CommentViewHolder.this.f66453i == null || CommentViewHolder.this.f66445a == null)) {
                CommentViewHolder.this.f66453i.mo51259b((C25265n) CommentViewHolder.this.f66451g, CommentViewHolder.this.f66445a);
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo51149a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo51156b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo51159c() {
        return true;
    }

    /* renamed from: d */
    public void mo51160d() {
        mo51161e();
    }

    /* renamed from: f */
    public final Comment mo51162f() {
        return this.f66445a;
    }

    /* renamed from: g */
    public final View mo51163g() {
        return this.itemView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo51164i() {
        return false;
    }

    /* renamed from: h */
    protected static boolean m60955h() {
        if (C25282a.m61494a().isBlackBackground() || C25112e.m61020a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo51161e() {
        boolean z;
        String str;
        if (!C25273o.f66859b.mo51547a(this.f66445a) && this.f66445a.getEmoji() == null && this.mBuryView == null) {
            z = false;
        } else {
            z = true;
        }
        if (mo51164i()) {
            str = C25225e.m61345f(this.f66445a);
        } else {
            str = C25225e.m61336a(this.f66445a, !z, false);
        }
        if (!TextUtils.isEmpty(str)) {
            this.mContentView.setText(str);
            this.mContentView.setVisibility(0);
            C29408b.m69342a((TextView) this.mContentView);
        } else {
            this.mContentView.setVisibility(8);
        }
        C25225e.m61344e(this.f66445a);
        this.mContentView.setSpanColor(this.mContentView.getResources().getColor(R.color.a0z));
        this.mContentView.setOnSpanClickListener(new C25125n(this));
        List b = C25225e.m61340b(this.f66445a);
        C29366a emoji = this.f66445a.getEmoji();
        if (emoji != null && mo51164i()) {
            int length = str.length();
            b.addAll(GifEmojiServiceImpl.createIGifEmojiServicebyMonsterPlugin().getGifEmojiDetailTailSpan(emoji, length - 1, length));
        }
        this.mContentView.mo95551a(b, (C48160d) new C45549f(C25282a.m61494a().isChallengeToHashTag()));
        this.mContentView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: c */
    public final void mo51158c(String str) {
        this.f66449e = str;
    }

    /* renamed from: a */
    public final void mo51150a(int i) {
        this.f66450f = i;
    }

    /* renamed from: b */
    public final void mo51157b(String str) {
        this.f66448d = str;
    }

    /* renamed from: a */
    public void mo51152a(Comment comment) {
        mo51153a(comment, (Rect) null);
    }

    /* renamed from: a */
    public void mo51154a(String str) {
        this.f66447c = str;
    }

    /* renamed from: a */
    public final void mo51155a(boolean z) {
        this.f66452h = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo51151a(View view, TextExtraStruct textExtraStruct) {
        if (C11016e.m22312g() != null) {
            SmartRouter.buildRoute((Context) C11016e.m22312g(), "aweme://user/profile/").withParam("uid", textExtraStruct.getUserId()).withParam(C22835a.f61196a, textExtraStruct.getSecUid()).open();
        }
        C26890h.m65005a(this.mContentView.getContext(), LeakCanaryFileProvider.f132049i, "comment_at", textExtraStruct.getUserId(), 0);
        C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_from", this.f66447c).mo47829a("to_user_id", textExtraStruct.getUserId()).mo47829a("group_id", this.f66448d).mo47829a("author_id", this.f66449e).mo47829a("enter_method", "comment_at").f61491a);
        C30578o.m71566a(C29988ad.PROFILE);
    }

    public CommentViewHolder(View view, C25147a aVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f66453i = aVar;
        if (((C13833a) this.mAvatarView.getHierarchy()).f36079a != null) {
            ((C13833a) this.mAvatarView.getHierarchy()).f36079a.mo25939c((float) C23728o.m58241a(0.5d));
            ((C13833a) this.mAvatarView.getHierarchy()).f36079a.mo25938b(this.mAvatarView.getResources().getColor(R.color.j5));
        }
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (CommentViewHolder.this.f66453i != null && CommentViewHolder.this.f66445a != null && CommentViewHolder.this.f66445a.getUser() != null && CommentViewHolder.this.f66445a.getCid() != null) {
                    CommentViewHolder.this.f66453i.mo51253a((C25265n) CommentViewHolder.this.f66451g, CommentViewHolder.this.f66445a);
                }
            }
        });
        this.f66451g = new C25424a(this.mContentView.getContext());
        C47857eo.m103505a(this.mContentView);
        C47857eo.m103505a(this.mReplyContentView);
        this.mAvatarView.setOnTouchListener(this.f66455k);
        this.mTitleView.setOnTouchListener(this.f66455k);
        if (VERSION.SDK_INT >= 23) {
            this.mContentView.setBreakStrategy(0);
            this.mReplyContentView.setBreakStrategy(0);
        }
        float b = C9432q.m18687b(C11010c.m22280a(), 3.0f);
        this.mContentView.setLineSpacing(b, 1.0f);
        this.mReplyContentView.setLineSpacing(b, 1.0f);
        if (view.getContext() instanceof FragmentActivity) {
            this.f66454j = UnReadVideoCommentListViewModel.m61819a((FragmentActivity) view.getContext(), C25393z.class.getSimpleName());
        }
    }

    /* renamed from: a */
    public void mo51153a(Comment comment, Rect rect) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (comment != null && this.mContentView != null) {
            View view = this.mRootView;
            if (rect != null) {
                if (rect.top >= 0) {
                    i = rect.top;
                } else {
                    i = view.getPaddingTop();
                }
                if (rect.bottom >= 0) {
                    i2 = rect.bottom;
                } else {
                    i2 = view.getPaddingBottom();
                }
                if (VERSION.SDK_INT >= 17) {
                    if (rect.left >= 0) {
                        i5 = rect.left;
                    } else {
                        i5 = view.getPaddingStart();
                    }
                    if (rect.right >= 0) {
                        i6 = rect.right;
                    } else {
                        i6 = view.getPaddingEnd();
                    }
                    view.setPaddingRelative(i5, i, i6, i2);
                } else {
                    if (rect.left >= 0) {
                        i3 = rect.left;
                    } else {
                        i3 = view.getPaddingLeft();
                    }
                    if (rect.right >= 0) {
                        i4 = rect.right;
                    } else {
                        i4 = view.getPaddingRight();
                    }
                    if (C47918gj.m103682a(C11010c.m22280a())) {
                        view.setPadding(i4, i, i3, i2);
                    } else {
                        view.setPadding(i3, i, i4, i2);
                    }
                }
            }
            this.f66445a = comment;
            this.f66451g.mo52023a(this.mContentView.getContext(), comment, new C25330aa(this.mContentView.getContext(), this.mContentView), new C25330aa(this.mContentView.getContext(), this.mReplyContentView), this.mTranslationView);
            boolean c = mo51159c();
            if (!this.f66452h || !c || C9376b.m18558a((Collection<T>) this.f66445a.getReplyComments())) {
                this.mReplyContainer.setVisibility(8);
            } else {
                Comment comment2 = (Comment) this.f66445a.getReplyComments().get(0);
                final User user = comment2.getUser();
                String c2 = C47915gg.m103653c(user);
                if (user != null) {
                    this.mReplyContainer.setVisibility(0);
                    this.mReplyTitleView.setText(c2);
                    C47916gh.m103675a(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.mReplyTitleView);
                    this.mReplyTitleView.setTag(user.getUid());
                    this.mReplyTitleView.setOnTouchListener(new C25392y() {
                        /* renamed from: a */
                        public final void mo51134a(View view) {
                            if (!TextUtils.isEmpty(user.getUid()) && CommentViewHolder.this.f66453i != null) {
                                CommentViewHolder.this.f66453i.mo51258a(user.getUid(), user.getSecUid());
                            }
                        }
                    });
                    mo51156b();
                    String a = C25225e.m61333a(comment2, C25225e.m61331a(comment2));
                    this.mReplyContentView.setText(a);
                    C29408b.m69342a((TextView) this.mReplyContentView);
                    C25225e.m61344e(comment2);
                    this.mReplyContentView.setSpanColor(this.mReplyContentView.getResources().getColor(R.color.a0z));
                    this.mReplyContentView.setOnSpanClickListener(new C48162f() {
                        /* renamed from: a */
                        public final void mo51166a(View view, TextExtraStruct textExtraStruct) {
                            if (C11016e.m22312g() != null) {
                                C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_from", CommentViewHolder.this.f66447c).mo47829a("to_user_id", textExtraStruct.getUserId()).mo47829a("group_id", CommentViewHolder.this.f66448d).mo47829a("author_id", CommentViewHolder.this.f66449e).mo47829a("enter_method", "comment_at").f61491a);
                                C30578o.m71566a(C29988ad.PROFILE);
                                SmartRouter.buildRoute((Context) C11016e.m22312g(), "aweme://user/profile/").withParam("uid", textExtraStruct.getUserId()).withParam(C22835a.f61196a, textExtraStruct.getSecUid()).open();
                            }
                        }
                    });
                    List b = C25225e.m61340b(comment2);
                    C29366a emoji = comment2.getEmoji();
                    if (emoji != null) {
                        int length = a.length();
                        b.addAll(GifEmojiServiceImpl.createIGifEmojiServicebyMonsterPlugin().getGifEmojiDetailTailSpan(emoji, length - 1, length));
                    }
                    this.mReplyContentView.mo95551a(b, (C48160d) new C45549f(C25282a.m61494a().isChallengeToHashTag()));
                    this.mReplyContentView.setMovementMethod(LinkMovementMethod.getInstance());
                } else {
                    this.mReplyContainer.setVisibility(8);
                }
            }
            mo51160d();
            User user2 = comment.getUser();
            if (this.mUnReadCircleView != null) {
                this.mUnReadCircleView.setVisibility(8);
            }
            if (user2 != null) {
                UrlModel avatarThumb = user2.getAvatarThumb();
                User curUser = C20854a.m53161a().userService().getCurUser();
                if (!(curUser == null || curUser.getUid() == null || !curUser.getUid().equals(user2.getUid()))) {
                    avatarThumb = curUser.getAvatarThumb();
                }
                if (!(avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0)) {
                    C12203q.m24645a((Object) C23608p.m57874a(avatarThumb)).mo23125b(C47788ct.m103417a(100)).mo23111a(this.size, this.size).mo23127c(true).mo23118a("CommentViewHolder").mo23116a((C12197k) this.mAvatarView).mo23121a();
                }
                this.mTitleView.setText(C47915gg.m103653c(user2));
                C47916gh.m103675a(this.itemView.getContext(), user2.getCustomVerify(), user2.getEnterpriseVerifyReason(), this.mTitleView);
                mo51149a();
            }
        }
    }
}
