package com.p683ss.android.ugc.aweme.comment.adapter;

import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.content.C0726c;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p975o.C14232c;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.comment.C25152e.C25154b;
import com.p683ss.android.ugc.aweme.comment.C25273o;
import com.p683ss.android.ugc.aweme.comment.abtest.MTCommentsNegativeFeedbackExperiment;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.comment.p1519d.C25151a;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25207a;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25218a;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25236i;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25236i.C25237a;
import com.p683ss.android.ugc.aweme.comment.p1528ui.C25392y;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.comment.widget.DynamicLabelTextView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29478h;
import com.p683ss.android.ugc.aweme.emoji.utils.C29482j;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.notification.util.C38446k.C38451a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.p683ss.android.ugc.aweme.utils.C47903fw;
import com.p683ss.android.ugc.aweme.views.RelationLabelTextView;
import com.ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentViewHolderNewStyle */
public class CommentViewHolderNewStyle extends CommentViewHolder {

    /* renamed from: j */
    public boolean f66462j;

    /* renamed from: k */
    C25154b f66463k;

    /* renamed from: l */
    public C25102a f66464l;

    /* renamed from: m */
    private String f66465m;
    View mBuryLayout;
    DmtTextView mCommentSplitView;
    TextView mCommentStyleView;
    protected TextView mCommentTimeView;
    TextView mDiggCountView;
    View mDiggLayout;
    ImageView mDiggView;
    protected RemoteImageView mGifEmojiView;
    DynamicLabelTextView mIronFanLabel;
    DmtTextView mPostStatus;
    DmtTextView mReplyCommentSplitView;
    TextView mReplyCommentStyleView;
    DmtTextView mTvLikedByCreator;
    TextView mTvPromptContent;
    protected RelationLabelTextView mTvRelationLabel;
    protected RelationLabelTextView mTvReplyCommentRelationLabel;

    /* renamed from: n */
    private C29482j f66466n;

    /* renamed from: o */
    private final int f66467o = ((int) C9432q.m18687b(C11010c.m22280a(), 100.0f));

    /* renamed from: p */
    private final int f66468p = ((int) C9432q.m18687b(C11010c.m22280a(), 180.0f));

    /* renamed from: q */
    private final int f66469q = ((int) C9432q.m18687b(C11010c.m22280a(), 12.0f));

    /* renamed from: r */
    private final int f66470r = ((int) C9432q.m18687b(C11010c.m22280a(), 8.0f));

    /* renamed from: s */
    private C25392y f66471s = new C25392y() {
        /* renamed from: a */
        public final void mo51134a(View view) {
            Comment comment;
            String str;
            if (CommentViewHolderNewStyle.this.f66445a != null && CommentViewHolderNewStyle.this.f66453i != null) {
                String str2 = "";
                String str3 = "";
                if (view.getId() == R.id.del) {
                    if (CommentViewHolderNewStyle.this.f66445a.getRelationLabel() != null) {
                        str = CommentViewHolderNewStyle.this.f66445a.getRelationLabel().getUserId();
                    } else {
                        str = "";
                    }
                    str2 = str;
                    str3 = CommentViewHolderNewStyle.this.f66445a.getUser().getSecUid();
                } else {
                    if (!C9376b.m18558a((Collection<T>) CommentViewHolderNewStyle.this.f66445a.getReplyComments())) {
                        comment = (Comment) CommentViewHolderNewStyle.this.f66445a.getReplyComments().get(0);
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
                    CommentViewHolderNewStyle.this.f66453i.mo51261b(str2, str3);
                }
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo51170j() {
        return C25112e.m61020a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51149a() {
        this.mCommentSplitView.setTypeface(this.mTitleView.getTypeface());
        this.mCommentSplitView.getPaint().setFakeBoldText(this.mTitleView.getPaint().isFakeBoldText());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51156b() {
        this.mReplyCommentSplitView.setTypeface(this.mReplyTitleView.getTypeface());
        this.mReplyCommentSplitView.getPaint().setFakeBoldText(this.mReplyTitleView.getPaint().isFakeBoldText());
    }

    /* renamed from: k */
    public final void mo51171k() {
        if (this.f66445a != null) {
            m60975a(this.f66445a.isUserDigged(), this.f66445a.getDiggCount(), false, this.f66445a.isAuthorDigged(), false);
        }
    }

    /* renamed from: d */
    public final void mo51160d() {
        if (this.f66445a != null) {
            int i = 4;
            if (C25273o.f66859b.mo51547a(this.f66445a)) {
                if (this.mCommentTimeView != null) {
                    this.mCommentTimeView.setVisibility(8);
                }
                this.mDiggCountView.setVisibility(4);
                this.mDiggLayout.setVisibility(4);
                this.mDiggView.setVisibility(4);
                if (this.mBuryView != null) {
                    this.mBuryLayout.setVisibility(4);
                    this.mBuryView.setVisibility(4);
                }
            } else {
                if (this.mCommentTimeView != null) {
                    if (this.f66445a.getEmoji() == null && this.mBuryView == null) {
                        this.mCommentTimeView.setVisibility(8);
                    } else {
                        this.mCommentTimeView.setVisibility(0);
                        this.mCommentTimeView.setText(C47903fw.m103625b(this.itemView.getContext(), ((long) this.f66445a.getCreateTime()) * 1000));
                    }
                }
                TextView textView = this.mDiggCountView;
                if (this.f66445a.getDiggCount() != 0) {
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
            C25273o.m61471a(this.f66445a, this.mPostStatus);
            mo51161e();
        }
    }

    /* renamed from: a */
    public final void mo51154a(String str) {
        this.f66465m = str;
    }

    public boolean onLongClick(View view) {
        if (this.f66445a != null && !this.f66462j) {
            C25110d.m61017a(view, this.f66445a.getEmoji(), this.f66453i);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo51169a(View view) {
        if (this.f66453i != null && C25273o.m61475b(this.f66445a)) {
            this.f66453i.mo51254a(this.f66445a);
        }
    }

    public void onClick(View view) {
        boolean z;
        int id = view.getId();
        int i = 1;
        if (id == R.id.b7f) {
            if (!C25273o.f66859b.mo51547a(this.f66445a) && this.f66445a.getCid() != null && this.mDiggLayout.getVisibility() == 0) {
                if (!C20854a.m53167g().isLogin()) {
                    C27965f.m66720a(C11016e.m22312g(), this.f66465m, "like_comment", C47661ab.m103163a().mo94972a("login_title", view.getContext().getString(R.string.bwi)).mo94972a("group_id", this.f66448d).mo94972a("log_pb", C23198ae.m56874k(this.f66448d)).f120139a);
                } else if (!(this.f66445a == null || this.f66453i == null)) {
                    if (C25151a.m61114a(this.f66445a)) {
                        boolean z2 = !this.f66445a.isUserDigged();
                        boolean isAuthorDigged = this.f66445a.isAuthorDigged();
                        if (!TextUtils.equals(this.f66449e, C20854a.m53167g().getCurUserId()) || TextUtils.equals(this.f66449e, Comment.getAuthorUid(this.f66445a))) {
                            z = isAuthorDigged;
                        } else {
                            if (z2) {
                                C25207a.m61295b(this.f66465m, this.f66448d, this.f66449e, this.f66445a.getCid());
                            }
                            z = z2;
                        }
                        if (this.mBuryView != null && !this.f66445a.isUserDigged() && this.f66445a.getUserBuried()) {
                            m60976a(false, false);
                        }
                        int diggCount = this.f66445a.getDiggCount();
                        if (!z2) {
                            i = -1;
                        }
                        m60975a(z2, diggCount + i, true, z, false);
                    }
                    this.f66453i.mo51255a(this.f66445a, getAdapterPosition());
                }
            }
        } else if (id == R.id.akl && this.f66462j) {
            C29478h.m69560a(this.mGifEmojiView, this.f66445a.getEmoji().getAnimateUrl(), this.f66466n);
        } else if (id == R.id.ei3) {
            if (!C25273o.f66859b.mo51547a(this.f66445a) && this.f66445a.getCid() != null && (this.mBuryLayout == null || this.mBuryLayout.getVisibility() == 0)) {
                if (!C20854a.m53167g().isLogin()) {
                    C27965f.m66720a(C11016e.m22312g(), this.f66465m, "dislike_comment", C47661ab.m103163a().mo94972a("group_id", this.f66448d).mo94972a("log_pb", C23198ae.m56874k(this.f66448d)).f120139a);
                } else if (!(this.f66445a == null || this.f66453i == null)) {
                    if (!this.f66445a.getUserBuried() && this.f66445a.isUserDigged()) {
                        m60975a(false, this.f66445a.getDiggCount() - 1, false, false, true);
                    }
                    m60976a(!this.f66445a.getUserBuried(), true);
                    this.f66453i.mo51260b(this.f66445a, getAdapterPosition());
                }
            }
        } else if (id == R.id.eda && C11016e.m22312g() != null) {
            C25282a.m61494a().switchToUsername(C11016e.m22312g());
            this.mInvalidUsernamePrompt.setVisibility(8);
            this.f66445a.setNeedShowPrompt(false);
            C26890h.onEventV3("click_modify_username_comment");
        }
    }

    /* renamed from: a */
    private void m60976a(boolean z, boolean z2) {
        if (this.mBuryView != null) {
            if (z2) {
                this.mBuryView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                    public final void run() {
                        CommentViewHolderNewStyle.this.mBuryView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
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

    /* renamed from: a */
    public final void mo51153a(Comment comment, Rect rect) {
        int i;
        super.mo51153a(comment, rect);
        if (this.f66445a != null && comment != null) {
            this.f66462j = false;
            this.mDiggLayout.setVisibility(0);
            this.mCommentStyleView.setVisibility(0);
            int diggCount = comment.getDiggCount();
            this.mDiggCountView.setText(C33095b.m76068a((long) diggCount));
            m60975a(comment.isUserDigged(), comment.getDiggCount(), false, comment.isAuthorDigged(), false);
            TextView textView = this.mDiggCountView;
            if (diggCount == 0) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
            if (this.mBuryView != null) {
                m60976a(comment.getUserBuried(), false);
            }
            if (this.mTvLikedByCreator != null && (this.mRootView instanceof ConstraintLayout)) {
                C25237a a = new C25236i((ConstraintLayout) this.mRootView).mo51495a();
                if (a != null) {
                    if (this.f66452h && this.mReplyContainer.getVisibility() == 0) {
                        if (this.mBuryView != null) {
                            a.mo51499c(R.id.bap, R.id.akl);
                        } else {
                            a.mo51499c(R.id.bap, R.id.xm);
                        }
                        a.mo51499c(R.id.d4a, R.id.cbg);
                        a.mo51499c(R.id.c3w, R.id.d4a);
                    } else if (this.mBuryView == null) {
                        a.mo51499c(R.id.d4a, R.id.xm);
                        a.mo51499c(R.id.bap, R.id.d4a);
                        a.mo51499c(R.id.c3w, R.id.cbg);
                    }
                    a.mo51497a();
                } else {
                    return;
                }
            }
            C25218a.m61325a(comment, this.mCommentSplitView);
            C25218a.m61326a(comment, this.mCommentStyleView, m60955h());
            this.mTvRelationLabel.mo95566a(comment.getRelationLabel());
            this.mTvRelationLabel.setBackgroundResource(R.drawable.ci9);
            this.mTvRelationLabel.setTextColor(this.mTvRelationLabel.getResources().getColor(R.color.a1k));
            if (this.mReplyContainer.getVisibility() == 0) {
                Comment comment2 = (Comment) comment.getReplyComments().get(0);
                C25218a.m61325a(comment2, this.mReplyCommentSplitView);
                C25218a.m61326a(comment2, this.mReplyCommentStyleView, m60955h());
                this.mTvReplyCommentRelationLabel.mo95566a(comment2.getRelationLabel());
                this.mTvReplyCommentRelationLabel.setBackgroundResource(R.drawable.ci9);
                this.mTvReplyCommentRelationLabel.setTextColor(this.mTvReplyCommentRelationLabel.getResources().getColor(R.color.a1k));
            }
            C25112e.m61019a(this.mTitleView.getContext(), this, comment);
            if (!(this.mGifEmojiView == null || this.mCommentTimeView == null)) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mCommentTimeView.getLayoutParams();
                if (this.f66445a.getEmoji() == null || mo51164i()) {
                    marginLayoutParams.topMargin = this.f66470r;
                    this.mGifEmojiView.setVisibility(8);
                } else {
                    this.mGifEmojiView.setVisibility(0);
                    marginLayoutParams.topMargin = this.f66469q;
                    C29366a emoji = this.f66445a.getEmoji();
                    if (this.mGifEmojiView != null) {
                        UrlModel animateUrl = emoji.getAnimateUrl();
                        LayoutParams layoutParams = this.mGifEmojiView.getLayoutParams();
                        int width = emoji.getWidth();
                        int height = emoji.getHeight();
                        if (animateUrl != null && (width == 0 || height == 0)) {
                            width = animateUrl.getWidth();
                            height = animateUrl.getHeight();
                        }
                        int i2 = this.f66467o;
                        if (width > 0 && height > 0) {
                            i2 = (width * this.f66467o) / height;
                            if (i2 > this.f66468p) {
                                i2 = this.f66468p;
                            }
                        }
                        layoutParams.width = i2;
                        if (this.f66466n == null) {
                            this.f66466n = new C29482j() {
                                public final void as_() {
                                }

                                public final void at_() {
                                    CommentViewHolderNewStyle.this.mGifEmojiView.setBackgroundResource(R.color.a2q);
                                    ((C13833a) CommentViewHolderNewStyle.this.mGifEmojiView.getHierarchy()).mo25898a(C13818b.f36066f);
                                    CommentViewHolderNewStyle.this.mGifEmojiView.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25759b(CommentViewHolderNewStyle.this.mGifEmojiView.getController())).mo25757b(C14232c.m29168a((int) R.drawable.cja).mo26451a(new ImageDecodeOptionsBuilder().setBitmapConfig(Config.ARGB_8888).mo26114a()).mo26449a())).mo25763d());
                                    CommentViewHolderNewStyle.this.f66462j = true;
                                }
                            };
                        }
                        C29478h.m69560a(this.mGifEmojiView, animateUrl, this.f66466n);
                    }
                }
                this.mCommentTimeView.setLayoutParams(marginLayoutParams);
            }
            if (!this.f66445a.isNeedShowPrompt() && this.mInvalidUsernamePrompt != null && this.mInvalidUsernamePrompt.getVisibility() == 0) {
                this.mInvalidUsernamePrompt.setVisibility(8);
            }
        }
    }

    public CommentViewHolderNewStyle(View view, C25147a aVar, String str) {
        int i;
        super(view, aVar);
        this.f66446b = str;
        this.mMenuItem.setVisibility(8);
        view.setOnLongClickListener(new C25088a());
        this.mTvRelationLabel.setOnTouchListener(this.f66471s);
        this.mTvReplyCommentRelationLabel.setOnTouchListener(this.f66471s);
        if (this.mPostStatus != null) {
            this.mPostStatus.setOnTouchListener(new C38451a());
            this.mPostStatus.setOnClickListener(new C25131r(this));
        }
        if (this.mBuryView != null) {
            if (MTCommentsNegativeFeedbackExperiment.m60925c()) {
                this.mDiggCountView.setGravity(8388613);
                C25237a a = new C25236i((ConstraintLayout) this.mRootView).mo51495a();
                if (a != null) {
                    a.mo51496a(R.id.d9h, 6);
                    a.mo51501e(R.id.b02, R.id.b9e);
                    a.mo51500d(R.id.ee4, R.id.b02);
                    a.mo51500d(R.id.d9h, R.id.b02);
                    a.mo51498b(R.id.b02, (int) C9432q.m18687b(C11010c.m22280a(), 16.0f));
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
    private void m60975a(boolean z, int i, boolean z2, boolean z3, boolean z4) {
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
            if (!z3 || TextUtils.equals(this.f66449e, Comment.getAuthorUid(this.f66445a))) {
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
            if (m60955h()) {
                this.mTvLikedByCreator.setBackgroundResource(R.drawable.chu);
                this.mTvLikedByCreator.setTextColor(C0726c.m2098c(this.mTvLikedByCreator.getContext(), R.color.pk));
            }
        }
        if (z2) {
            this.mDiggView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                public final void run() {
                    CommentViewHolderNewStyle.this.mDiggView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
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
            if (mo51170j()) {
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
            i5 = R.color.a3c;
        } else {
            this.mDiggView.setSelected(false);
            this.mDiggView.setImageDrawable(this.mDiggView.getResources().getDrawable(i3));
            textView = this.mDiggCountView;
            resources = this.mDiggCountView.getResources();
            if (mo51170j()) {
                i5 = R.color.a2o;
            } else {
                i5 = R.color.jl;
            }
        }
        textView.setTextColor(resources.getColor(i5));
    }
}
