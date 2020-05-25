package com.p683ss.android.ugc.aweme.comment.adapter;

import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Paint.FontMetrics;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p669e.C10705c.C10707a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p975o.C14232c;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.comment.C25152e.C25154b;
import com.p683ss.android.ugc.aweme.comment.C25273o;
import com.p683ss.android.ugc.aweme.comment.abtest.MTCommentsNegativeFeedbackExperiment;
import com.p683ss.android.ugc.aweme.comment.list.C25264m;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.comment.p1519d.C25151a;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25207a;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25218a;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25225e;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25236i;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25236i.C25237a;
import com.p683ss.android.ugc.aweme.comment.p1528ui.C25330aa;
import com.p683ss.android.ugc.aweme.comment.p1528ui.C25392y;
import com.p683ss.android.ugc.aweme.comment.p1528ui.CommentTranslationStatusView;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.comment.widget.C25424a;
import com.p683ss.android.ugc.aweme.comment.widget.DynamicLabelTextView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.emoji.utils.C29478h;
import com.p683ss.android.ugc.aweme.emoji.utils.C29482j;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45549f;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.p683ss.android.ugc.aweme.utils.C47857eo;
import com.p683ss.android.ugc.aweme.utils.C47903fw;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48160d;
import com.p683ss.android.ugc.aweme.views.RelationLabelTextView;
import com.ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentReplyViewHolder */
public class CommentReplyViewHolder extends C1352v implements C25264m {

    /* renamed from: a */
    public C25147a f66409a;

    /* renamed from: b */
    public Comment f66410b;

    /* renamed from: c */
    C25424a f66411c;

    /* renamed from: d */
    public boolean f66412d;

    /* renamed from: e */
    public C25102a f66413e;

    /* renamed from: f */
    String f66414f;

    /* renamed from: g */
    String f66415g;

    /* renamed from: h */
    String f66416h;

    /* renamed from: i */
    C25154b f66417i;

    /* renamed from: j */
    private C29482j f66418j;

    /* renamed from: k */
    private C29482j f66419k;

    /* renamed from: l */
    private final int f66420l;

    /* renamed from: m */
    private final int f66421m;
    SmartCircleImageView mAvatarView;
    View mBgView;
    View mBuryLayout;
    ImageView mBuryView;
    DmtTextView mCommentSplitView;
    TextView mCommentStyleView;
    protected TextView mCommentTimeView;
    MentionTextView mContentView;
    TextView mDiggCountView;
    View mDiggLayout;
    ImageView mDiggView;
    protected RemoteImageView mGifEmojiView;
    View mInvalidUsernamePrompt;
    DynamicLabelTextView mIronFanLabel;
    DmtTextView mPostStatus;
    View mRootView;
    DmtTextView mTitleView;
    CommentTranslationStatusView mTranslationView;
    DmtTextView mTvLikedByCreator;
    TextView mTvPromptContent;
    RelationLabelTextView mTvRelationLabel;
    protected RemoteImageView mVideoCoverView;

    /* renamed from: n */
    private C25392y f66422n;

    /* renamed from: o */
    private C25392y f66423o;

    /* renamed from: c */
    public final Comment mo51140c() {
        return this.f66410b;
    }

    /* renamed from: e */
    private void m60943e() {
        this.f66411c = new C25424a(this.mContentView.getContext());
    }

    /* renamed from: g */
    private static boolean m60945g() {
        return C25282a.m61494a().isBlackBackground();
    }

    /* renamed from: b */
    public final void mo51138b() {
        if (this.f66410b != null) {
            m60940a(this.f66410b.isUserDigged(), this.f66410b.getDiggCount(), false, this.f66410b.isAuthorDigged(), false);
        }
    }

    /* renamed from: f */
    private void m60944f() {
        boolean z;
        if (!C25273o.f66859b.mo51547a(this.f66410b) && this.f66410b.getEmoji() == null && this.mBuryView == null) {
            z = false;
        } else {
            z = true;
        }
        String a = C25225e.m61335a(this.f66410b, !z);
        if (!TextUtils.isEmpty(a)) {
            this.mContentView.setText(a);
            this.mContentView.setVisibility(0);
            C29408b.m69342a((TextView) this.mContentView);
        } else {
            this.mContentView.setVisibility(8);
        }
        C25225e.m61344e(this.f66410b);
        this.mContentView.setSpanColor(this.mContentView.getResources().getColor(R.color.a0z));
        this.mContentView.setOnSpanClickListener(new C25119j(this));
        this.mContentView.mo95551a(C25225e.m61340b(this.f66410b), (C48160d) new C45549f(C25282a.m61494a().isChallengeToHashTag()));
        this.mContentView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: a */
    public final void mo51135a() {
        if (this.f66410b != null) {
            int i = 4;
            if (C25273o.f66859b.mo51547a(this.f66410b)) {
                if (this.mCommentTimeView != null) {
                    this.mCommentTimeView.setVisibility(8);
                }
                if (this.f66410b.getAliasAweme() == null) {
                    this.mDiggCountView.setVisibility(4);
                    this.mDiggLayout.setVisibility(4);
                    this.mDiggView.setVisibility(4);
                    if (this.mBuryView != null) {
                        this.mBuryLayout.setVisibility(4);
                        this.mBuryView.setVisibility(4);
                    }
                }
            } else {
                if (this.mCommentTimeView != null) {
                    if (this.f66410b.getEmoji() == null && this.mBuryView == null) {
                        this.mCommentTimeView.setVisibility(8);
                    } else {
                        this.mCommentTimeView.setVisibility(0);
                        this.mCommentTimeView.setText(C47903fw.m103625b(this.itemView.getContext(), ((long) this.f66410b.getCreateTime()) * 1000));
                    }
                }
                if (this.f66410b.getAliasAweme() == null) {
                    TextView textView = this.mDiggCountView;
                    if (this.f66410b.getDiggCount() != 0) {
                        i = 0;
                    }
                    textView.setVisibility(i);
                    this.mDiggLayout.setVisibility(0);
                    this.mDiggView.setVisibility(0);
                    if (this.mBuryView != null) {
                        this.mBuryLayout.setVisibility(0);
                        this.mBuryView.setVisibility(0);
                    }
                }
            }
            C25273o.m61471a(this.f66410b, this.mPostStatus);
            m60944f();
        }
    }

    /* renamed from: d */
    private void m60942d() {
        if (((C13833a) this.mAvatarView.getHierarchy()).f36079a != null) {
            ((C13833a) this.mAvatarView.getHierarchy()).f36079a.mo25939c((float) C23728o.m58241a(0.5d));
            ((C13833a) this.mAvatarView.getHierarchy()).f36079a.mo25938b(this.mAvatarView.getResources().getColor(R.color.j5));
        }
        this.itemView.setOnClickListener(new C25116g(this));
        this.itemView.setOnLongClickListener(new C25117h(this));
        if (m60945g() || C25112e.m61020a()) {
            this.mTitleView.setTextColor(this.itemView.getResources().getColor(R.color.a1a));
            this.mCommentSplitView.setTextColor(this.itemView.getResources().getColor(R.color.a1a));
            this.mContentView.setTextColor(this.itemView.getResources().getColor(R.color.a17));
            this.mTvRelationLabel.setTextColor(this.itemView.getResources().getColor(R.color.a1o));
            this.mTvRelationLabel.setBackgroundResource(R.drawable.de8);
            if (this.mIronFanLabel != null) {
                this.mIronFanLabel.setFillColor(this.itemView.getResources().getColor(R.color.a1l));
                this.mIronFanLabel.setTextColor(this.itemView.getResources().getColor(R.color.a2j));
            }
        }
        if (this.mPostStatus != null) {
            this.mPostStatus.setOnTouchListener(new C10707a());
            this.mPostStatus.setOnClickListener(new C25118i(this));
        }
        this.mAvatarView.setOnTouchListener(this.f66422n);
        this.mTitleView.setOnTouchListener(this.f66422n);
        this.mTvRelationLabel.setOnTouchListener(this.f66423o);
        m60943e();
        C47857eo.m103505a(this.mContentView);
        if (VERSION.SDK_INT >= 23) {
            this.mContentView.setBreakStrategy(0);
        }
        this.mContentView.setLineSpacing(C9432q.m18687b(C11010c.m22280a(), 3.0f), 1.0f);
    }

    /* renamed from: a */
    public final void mo51137a(String str) {
        this.f66414f = str;
    }

    /* renamed from: b */
    public final void mo51139b(String str) {
        this.f66415g = str;
    }

    /* renamed from: c */
    public final void mo51141c(String str) {
        this.f66416h = str;
    }

    public boolean onLongClick(View view) {
        if (this.f66410b != null && !this.f66412d) {
            C25110d.m61017a(view, this.f66410b.getEmoji(), this.f66409a);
        }
        return true;
    }

    public void onClick(View view) {
        boolean z;
        int id = view.getId();
        int i = 1;
        if (id == R.id.b7f) {
            if (!C25273o.f66859b.mo51547a(this.f66410b) && this.f66410b.getCid() != null && this.mDiggLayout.getVisibility() == 0) {
                if (!C20854a.m53167g().isLogin()) {
                    C27965f.m66720a(C11016e.m22312g(), this.f66414f, "like_comment", C47661ab.m103163a().mo94972a("group_id", this.f66415g).mo94972a("log_pb", C23198ae.m56874k(this.f66415g)).f120139a);
                } else if (!(this.f66410b == null || this.f66409a == null)) {
                    if (C25151a.m61114a(this.f66410b)) {
                        boolean z2 = !this.f66410b.isUserDigged();
                        boolean isAuthorDigged = this.f66410b.isAuthorDigged();
                        if (!TextUtils.equals(this.f66416h, C20854a.m53167g().getCurUserId()) || TextUtils.equals(this.f66416h, Comment.getAuthorUid(this.f66410b))) {
                            z = isAuthorDigged;
                        } else {
                            if (z2) {
                                C25207a.m61295b(this.f66414f, this.f66415g, this.f66416h, this.f66410b.getCid());
                            }
                            z = z2;
                        }
                        if (this.mBuryView != null && !this.f66410b.isUserDigged() && this.f66410b.getUserBuried()) {
                            m60941a(false, false);
                        }
                        int diggCount = this.f66410b.getDiggCount();
                        if (!z2) {
                            i = -1;
                        }
                        m60940a(z2, diggCount + i, true, z, false);
                    }
                    this.f66409a.mo51255a(this.f66410b, getAdapterPosition());
                }
            }
        } else if (id == R.id.akl && this.f66412d) {
            C29478h.m69560a(this.mGifEmojiView, this.f66410b.getEmoji().getAnimateUrl(), this.f66418j);
        } else if (id == R.id.ei3) {
            if (!C25273o.f66859b.mo51547a(this.f66410b) && this.f66410b.getCid() != null && (this.mBuryLayout == null || this.mBuryLayout.getVisibility() == 0)) {
                if (!C20854a.m53167g().isLogin()) {
                    C27965f.m66720a(C11016e.m22312g(), this.f66414f, "dislike_comment", C47661ab.m103163a().mo94972a("group_id", this.f66415g).mo94972a("log_pb", C23198ae.m56874k(this.f66415g)).f120139a);
                } else if (!(this.f66410b == null || this.f66409a == null)) {
                    if (!this.f66410b.getUserBuried() && this.f66410b.isUserDigged()) {
                        m60940a(false, this.f66410b.getDiggCount() - 1, false, false, true);
                    }
                    m60941a(!this.f66410b.getUserBuried(), true);
                    this.f66409a.mo51260b(this.f66410b, getAdapterPosition());
                }
            }
        } else if (id == R.id.eda && C11016e.m22312g() != null) {
            C25282a.m61494a().switchToUsername(C11016e.m22312g());
            this.mInvalidUsernamePrompt.setVisibility(8);
            this.f66410b.setNeedShowPrompt(false);
            C26890h.onEventV3("click_modify_username_comment");
        }
    }

    /* renamed from: a */
    public final void mo51136a(Comment comment) {
        C12208t tVar;
        if (comment != null) {
            if (C25112e.m61020a()) {
                this.mRootView.setBackgroundResource(R.drawable.cmf);
            } else if (m60945g()) {
                this.mRootView.setBackgroundResource(R.drawable.ci0);
            } else {
                this.mRootView.setBackgroundResource(R.drawable.chz);
            }
            this.f66410b = comment;
            this.f66411c.mo52023a(this.mContentView.getContext(), comment, new C25330aa(this.mContentView.getContext(), this.mContentView), new C25330aa(this.mContentView.getContext(), null), this.mTranslationView);
            mo51135a();
            if (this.mGifEmojiView != null) {
                if (this.f66410b.getEmoji() != null) {
                    this.mGifEmojiView.setVisibility(0);
                    C29366a emoji = this.f66410b.getEmoji();
                    if (this.mGifEmojiView != null) {
                        UrlModel animateUrl = emoji.getAnimateUrl();
                        LayoutParams layoutParams = this.mGifEmojiView.getLayoutParams();
                        int width = emoji.getWidth();
                        int height = emoji.getHeight();
                        if (animateUrl != null && (width == 0 || height == 0)) {
                            width = animateUrl.getWidth();
                            height = animateUrl.getHeight();
                        }
                        int i = this.f66420l;
                        if (width > 0 && height > 0) {
                            i = (width * this.f66420l) / height;
                            if (i > this.f66421m) {
                                i = this.f66421m;
                            }
                        }
                        layoutParams.width = i;
                        if (this.f66418j == null) {
                            this.f66418j = new C29482j() {
                                public final void as_() {
                                }

                                public final void at_() {
                                    CommentReplyViewHolder.this.mGifEmojiView.setBackgroundResource(R.color.a2q);
                                    ((C13833a) CommentReplyViewHolder.this.mGifEmojiView.getHierarchy()).mo25898a(C13818b.f36066f);
                                    CommentReplyViewHolder.this.mGifEmojiView.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25759b(CommentReplyViewHolder.this.mGifEmojiView.getController())).mo25757b(C14232c.m29168a((int) R.drawable.cja).mo26451a(new ImageDecodeOptionsBuilder().setBitmapConfig(Config.ARGB_8888).mo26114a()).mo26449a())).mo25763d());
                                    CommentReplyViewHolder.this.f66412d = true;
                                }
                            };
                        }
                        C29478h.m69560a(this.mGifEmojiView, animateUrl, this.f66418j);
                    }
                } else {
                    this.mGifEmojiView.setVisibility(8);
                }
            }
            User user = this.f66410b.getUser();
            int a = C23728o.m58241a(24.0d);
            boolean z = true;
            if (user != null) {
                UrlModel avatarThumb = user.getAvatarThumb();
                User curUser = C20854a.m53161a().userService().getCurUser();
                if (!(curUser == null || curUser.getUid() == null || !curUser.getUid().equals(user.getUid()))) {
                    avatarThumb = curUser.getAvatarThumb();
                }
                if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                    tVar = C12203q.m24642a(2131953301);
                } else {
                    tVar = C12203q.m24645a((Object) C23608p.m57874a(avatarThumb));
                }
                tVar.mo23125b(C47788ct.m103417a(100)).mo23111a(a, a).mo23127c(true).mo23118a("CommentViewHolder").mo23116a((C12197k) this.mAvatarView).mo23121a();
                this.mTitleView.setText(C47915gg.m103653c(user));
            }
            C25218a.m61325a(comment, this.mCommentSplitView);
            TextView textView = this.mCommentStyleView;
            if (!m60945g() && !C25112e.m61020a()) {
                z = false;
            }
            C25218a.m61326a(comment, textView, z);
            this.mTvRelationLabel.mo95566a(comment.getRelationLabel());
            if (this.f66410b.getAliasAweme() == null) {
                this.mDiggCountView.setText(C33095b.m76068a((long) comment.getDiggCount()));
                m60940a(comment.isUserDigged(), comment.getDiggCount(), false, comment.isAuthorDigged(), false);
                if (this.mBuryView != null) {
                    m60941a(this.f66410b.getUserBuried(), false);
                }
                if (this.mVideoCoverView != null && this.mVideoCoverView.getVisibility() == 0) {
                    this.mVideoCoverView.setVisibility(8);
                }
            } else {
                this.mDiggView.setVisibility(8);
                this.mDiggCountView.setVisibility(8);
                if (this.mBuryView != null) {
                    this.mBuryView.setVisibility(8);
                }
                if (this.mVideoCoverView != null) {
                    Aweme aliasAweme = this.f66410b.getAliasAweme();
                    if (aliasAweme != null) {
                        this.mVideoCoverView.setVisibility(0);
                        Video video = aliasAweme.getVideo();
                        if (!(this.mVideoCoverView == null || video == null || video.getCover() == null)) {
                            UrlModel cover = video.getCover();
                            if (this.f66419k == null) {
                                this.f66419k = new C29482j() {
                                    public final void as_() {
                                    }

                                    public final void at_() {
                                        CommentReplyViewHolder.this.mVideoCoverView.setBackgroundResource(R.color.a2q);
                                        ((C13833a) CommentReplyViewHolder.this.mVideoCoverView.getHierarchy()).mo25898a(C13818b.f36066f);
                                        CommentReplyViewHolder.this.mVideoCoverView.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25759b(CommentReplyViewHolder.this.mVideoCoverView.getController())).mo25757b(C14232c.m29168a((int) R.drawable.cja).mo26451a(new ImageDecodeOptionsBuilder().setBitmapConfig(Config.ARGB_8888).mo26114a()).mo26449a())).mo25763d());
                                    }
                                };
                            }
                            C29478h.m69560a(this.mVideoCoverView, cover, this.f66419k);
                        }
                    } else {
                        this.mVideoCoverView.setVisibility(8);
                    }
                }
            }
            if (!this.f66410b.isNeedShowPrompt() && this.mInvalidUsernamePrompt != null && this.mInvalidUsernamePrompt.getVisibility() == 0) {
                this.mInvalidUsernamePrompt.setVisibility(8);
            }
        }
    }

    public CommentReplyViewHolder(ViewGroup viewGroup, C25147a aVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b1p, viewGroup, false));
        this.f66412d = false;
        this.f66420l = (int) C9432q.m18687b(C11010c.m22280a(), 100.0f);
        this.f66421m = (int) C9432q.m18687b(C11010c.m22280a(), 180.0f);
        this.f66422n = new C25392y() {
            /* renamed from: a */
            public final void mo51134a(View view) {
                if (CommentReplyViewHolder.this.f66410b != null && !C32800a.m75679a(view)) {
                    User user = CommentReplyViewHolder.this.f66410b.getUser();
                    if (!(user == null || TextUtils.isEmpty(user.getUid()) || CommentReplyViewHolder.this.f66409a == null)) {
                        CommentReplyViewHolder.this.f66409a.mo51258a(user.getUid(), user.getSecUid());
                    }
                }
            }
        };
        this.f66423o = new C25392y() {
            /* renamed from: a */
            public final void mo51134a(View view) {
                Comment comment;
                String str;
                if (CommentReplyViewHolder.this.f66410b != null && CommentReplyViewHolder.this.f66409a != null) {
                    String str2 = "";
                    String str3 = "";
                    if (view.getId() == R.id.del) {
                        if (CommentReplyViewHolder.this.f66410b.getRelationLabel() != null) {
                            str = CommentReplyViewHolder.this.f66410b.getRelationLabel().getUserId();
                        } else {
                            str = "";
                        }
                        str2 = str;
                        str3 = CommentReplyViewHolder.this.f66410b.getUser().getSecUid();
                    } else {
                        if (!C9376b.m18558a((Collection<T>) CommentReplyViewHolder.this.f66410b.getReplyComments())) {
                            comment = (Comment) CommentReplyViewHolder.this.f66410b.getReplyComments().get(0);
                        } else {
                            comment = null;
                        }
                        if (comment != null) {
                            if (comment.getRelationLabel() != null) {
                                str2 = comment.getRelationLabel().getUserId();
                            } else {
                                str2 = "";
                            }
                            str3 = comment.getUser().getSecUid();
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        CommentReplyViewHolder.this.f66409a.mo51261b(str2, str3);
                    }
                }
            }
        };
        ButterKnife.bind((Object) this, this.itemView);
        this.f66409a = aVar;
        m60942d();
    }

    /* renamed from: a */
    private void m60941a(boolean z, boolean z2) {
        if (this.mBuryView != null) {
            if (z2) {
                this.mBuryView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                    public final void run() {
                        CommentReplyViewHolder.this.mBuryView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                    }
                }).start();
            }
            if (z) {
                this.mBuryView.setSelected(true);
                this.mBuryView.setImageDrawable(this.mBuryView.getResources().getDrawable(R.drawable.cih));
                return;
            }
            this.mBuryView.setSelected(false);
            this.mBuryView.setImageDrawable(this.mBuryView.getResources().getDrawable(R.drawable.cig));
        }
    }

    public CommentReplyViewHolder(View view, C25147a aVar) {
        int i;
        super(view);
        this.f66420l = (int) C9432q.m18687b(C11010c.m22280a(), 100.0f);
        this.f66421m = (int) C9432q.m18687b(C11010c.m22280a(), 180.0f);
        this.f66422n = new C25392y() {
            /* renamed from: a */
            public final void mo51134a(View view) {
                if (CommentReplyViewHolder.this.f66410b != null && !C32800a.m75679a(view)) {
                    User user = CommentReplyViewHolder.this.f66410b.getUser();
                    if (!(user == null || TextUtils.isEmpty(user.getUid()) || CommentReplyViewHolder.this.f66409a == null)) {
                        CommentReplyViewHolder.this.f66409a.mo51258a(user.getUid(), user.getSecUid());
                    }
                }
            }
        };
        this.f66423o = new C25392y() {
            /* renamed from: a */
            public final void mo51134a(View view) {
                Comment comment;
                String str;
                if (CommentReplyViewHolder.this.f66410b != null && CommentReplyViewHolder.this.f66409a != null) {
                    String str2 = "";
                    String str3 = "";
                    if (view.getId() == R.id.del) {
                        if (CommentReplyViewHolder.this.f66410b.getRelationLabel() != null) {
                            str = CommentReplyViewHolder.this.f66410b.getRelationLabel().getUserId();
                        } else {
                            str = "";
                        }
                        str2 = str;
                        str3 = CommentReplyViewHolder.this.f66410b.getUser().getSecUid();
                    } else {
                        if (!C9376b.m18558a((Collection<T>) CommentReplyViewHolder.this.f66410b.getReplyComments())) {
                            comment = (Comment) CommentReplyViewHolder.this.f66410b.getReplyComments().get(0);
                        } else {
                            comment = null;
                        }
                        if (comment != null) {
                            if (comment.getRelationLabel() != null) {
                                str2 = comment.getRelationLabel().getUserId();
                            } else {
                                str2 = "";
                            }
                            str3 = comment.getUser().getSecUid();
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        CommentReplyViewHolder.this.f66409a.mo51261b(str2, str3);
                    }
                }
            }
        };
        ButterKnife.bind((Object) this, view);
        this.f66409a = aVar;
        m60942d();
        if (this.mBuryView != null) {
            if (MTCommentsNegativeFeedbackExperiment.m60925c()) {
                this.mDiggCountView.setGravity(8388613);
                C25237a a = new C25236i((ConstraintLayout) this.mBgView).mo51495a();
                if (a != null) {
                    a.mo51496a(R.id.d9h, 6);
                    a.mo51501e(R.id.b02, R.id.z0);
                    a.mo51500d(R.id.ee4, R.id.b02);
                    a.mo51500d(R.id.d9h, R.id.b02);
                    a.mo51498b(R.id.b02, (int) C9432q.m18687b(C11010c.m22280a(), 12.0f));
                    a.mo51498b(R.id.ee4, (int) C9432q.m18687b(C11010c.m22280a(), 48.0f));
                    a.mo51498b(R.id.d9h, (int) C9432q.m18687b(C11010c.m22280a(), 2.0f));
                    a.mo51497a();
                } else {
                    return;
                }
            } else {
                this.mDiggCountView.setGravity(8388611);
            }
        }
        if (this.mTvPromptContent != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.mTvPromptContent.getResources().getString(R.string.fs5));
            sb.append(" ");
            String sb2 = sb.toString();
            int length = sb2.length();
            SpannableString spannableString = new SpannableString(sb2);
            Resources resources = this.mTvPromptContent.getResources();
            if (C47842ed.m103485a(view.getContext())) {
                i = R.drawable.cio;
            } else {
                i = R.drawable.cin;
            }
            Drawable drawable = resources.getDrawable(i);
            FontMetrics fontMetrics = this.mTvPromptContent.getPaint().getFontMetrics();
            int ceil = ((int) Math.ceil((double) (fontMetrics.descent - fontMetrics.top))) + 2;
            drawable.setBounds(0, (int) C9432q.m18687b(view.getContext(), 1.0f), (drawable.getIntrinsicWidth() * ceil) / drawable.getIntrinsicHeight(), ceil);
            spannableString.setSpan(new ImageSpan(drawable, 0), length - 1, length, 18);
            this.mTvPromptContent.setText(spannableString.subSequence(0, length));
        }
    }

    /* renamed from: a */
    private void m60940a(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        int i2;
        int i3;
        int i4;
        int i5;
        Resources resources;
        TextView textView;
        int i6;
        boolean z5;
        int i7;
        if (this.mTvLikedByCreator != null && !z4) {
            if (!z3 || TextUtils.equals(this.f66416h, Comment.getAuthorUid(this.f66410b))) {
                z5 = false;
            } else {
                z5 = true;
            }
            DmtTextView dmtTextView = this.mTvLikedByCreator;
            if (z5) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            dmtTextView.setVisibility(i7);
            if (m60945g() || C25112e.m61020a()) {
                this.mTvLikedByCreator.setBackgroundResource(R.drawable.chu);
                this.mTvLikedByCreator.setTextColor(C0726c.m2098c(this.mTvLikedByCreator.getContext(), R.color.pk));
            }
        }
        if (z2) {
            this.mDiggView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                public final void run() {
                    CommentReplyViewHolder.this.mDiggView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
        this.mDiggCountView.setText(C33095b.m76068a((long) i));
        TextView textView2 = this.mDiggCountView;
        if (i == 0) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        textView2.setVisibility(i2);
        if (this.mBuryView != null) {
            boolean b = MTCommentsNegativeFeedbackExperiment.m60924b();
            if (b) {
                i3 = R.drawable.cij;
            } else {
                i3 = R.drawable.cik;
            }
            if (b) {
                i4 = R.drawable.cil;
            } else {
                i4 = R.drawable.cim;
            }
        } else {
            if (m60945g() || C25112e.m61020a()) {
                i6 = R.drawable.a2r;
            } else {
                i6 = R.drawable.a2q;
            }
            i4 = R.drawable.a2p;
        }
        if (z) {
            this.mDiggView.setSelected(true);
            this.mDiggView.setImageDrawable(this.mDiggView.getResources().getDrawable(i4));
            textView = this.mDiggCountView;
            resources = this.mDiggCountView.getResources();
            i5 = R.color.ja;
        } else {
            this.mDiggView.setSelected(false);
            this.mDiggView.setImageDrawable(this.mDiggView.getResources().getDrawable(i3));
            textView = this.mDiggCountView;
            resources = this.mDiggCountView.getResources();
            if (m60945g() || C25112e.m61020a()) {
                i5 = R.color.a1a;
            } else {
                i5 = R.color.jl;
            }
        }
        textView.setTextColor(resources.getColor(i5));
    }
}
