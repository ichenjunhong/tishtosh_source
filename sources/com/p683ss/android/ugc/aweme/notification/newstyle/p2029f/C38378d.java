package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartRoundImageView;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.d */
public final class C38378d extends C38383h implements OnClickListener {

    /* renamed from: d */
    private final View f97650d;

    /* renamed from: e */
    private final AvatarImageWithVerify f97651e;

    /* renamed from: f */
    private final TextView f97652f;

    /* renamed from: g */
    private final TextView f97653g;

    /* renamed from: m */
    private final SmartRoundImageView f97654m;

    /* renamed from: n */
    private CommentNotice f97655n;

    /* renamed from: o */
    private BaseNotice f97656o;

    /* renamed from: p */
    private String f97657p;

    /* renamed from: q */
    private String f97658q;

    /* renamed from: d */
    private final String m85671d() {
        Integer num;
        CommentNotice commentNotice = this.f97655n;
        if (commentNotice != null) {
            num = Integer.valueOf(commentNotice.getCommentType());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 17) {
            return "video_reply_comment";
        }
        if (num != null && num.intValue() == 18) {
            return "video_reply_reply";
        }
        if (num != null && num.intValue() == 19) {
            return "video_reply_like";
        }
        return "";
    }

    public C38378d(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97650d = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97651e = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.bto);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f97652f = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f97653g = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bsd);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.notification_cover)");
        this.f97654m = (SmartRoundImageView) findViewById5;
        C38415g.m85729b(this.f97650d);
        C38446k.m85764a(this.f97651e);
        C38446k.m85764a(this.f97654m);
        OnClickListener onClickListener = this;
        this.f97654m.setOnClickListener(onClickListener);
        this.f97650d.setOnClickListener(onClickListener);
        this.f97651e.setOnClickListener(onClickListener);
        this.f97651e.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
        ((C13833a) this.f97654m.getHierarchy()).mo25902b((int) R.color.c8);
    }

    public final void onClick(View view) {
        int i;
        CommentNotice commentNotice;
        ClickInstrumentation.onClick(view);
        if (!C38379e.m85673a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        CommentNotice commentNotice2 = this.f97655n;
        if (commentNotice2 != null) {
            String str = "click";
            String d = m85671d();
            BaseNotice baseNotice = this.f97656o;
            if (baseNotice != null) {
                i = baseNotice.clientOrder;
            } else {
                i = -1;
            }
            BaseNotice baseNotice2 = this.f97656o;
            BaseNotice baseNotice3 = this.f97656o;
            Integer num = null;
            if (baseNotice3 != null) {
                commentNotice = baseNotice3.getCommentNotice();
            } else {
                commentNotice = null;
            }
            mo78088a(str, d, i, baseNotice2, true, m85180a(commentNotice), this.f97658q, this.f97657p);
            if (view != null) {
                num = Integer.valueOf(view.getId());
            }
            if (num != null && num.intValue() == R.id.bt7) {
                Comment comment = commentNotice2.getComment();
                C52711k.m112236a((Object) comment, "it.comment");
                User user = comment.getUser();
                C52711k.m112236a((Object) user, "it.comment.user");
                String uid = user.getUid();
                C52711k.m112236a((Object) uid, "it.comment.user.uid");
                Comment comment2 = commentNotice2.getComment();
                C52711k.m112236a((Object) comment2, "it.comment");
                User user2 = comment2.getUser();
                C52711k.m112236a((Object) user2, "it.comment.user");
                String secUid = user2.getSecUid();
                C52711k.m112236a((Object) secUid, "it.comment.user.secUid");
                C38383h.m85681a((C38383h) this, uid, secUid, this.f97656o, false, (String) null, 24, (Object) null);
            } else {
                if ((num != null && num.intValue() == R.id.bu1) || (num != null && num.intValue() == R.id.bsd)) {
                    Comment comment3 = commentNotice2.getComment();
                    C52711k.m112236a((Object) comment3, "it.comment");
                    Aweme aliasAweme = comment3.getAliasAweme();
                    C52711k.m112236a((Object) aliasAweme, "it.comment.aliasAweme");
                    String aid = aliasAweme.getAid();
                    C52711k.m112236a((Object) aid, "it.comment.aliasAweme.aid");
                    mo78305a(aid, "");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo78301a(BaseNotice baseNotice, boolean z, String str, String str2) {
        Integer num;
        String str3;
        C52711k.m112240b(baseNotice, "notice");
        C52711k.m112240b(str2, "enterFrom");
        if (baseNotice.getCommentNotice() != null) {
            CommentNotice commentNotice = baseNotice.getCommentNotice();
            C52711k.m112236a((Object) commentNotice, "notice.commentNotice");
            if (commentNotice.isReplyWithVideo()) {
                CommentNotice commentNotice2 = baseNotice.getCommentNotice();
                C52711k.m112236a((Object) commentNotice2, "notice.commentNotice");
                if (commentNotice2.getComment() != null) {
                    CommentNotice commentNotice3 = baseNotice.getCommentNotice();
                    C52711k.m112236a((Object) commentNotice3, "notice.commentNotice");
                    Comment comment = commentNotice3.getComment();
                    C52711k.m112236a((Object) comment, "notice.commentNotice.comment");
                    if (comment.getAliasAweme() != null) {
                        this.f97657p = str;
                        this.f97656o = baseNotice;
                        this.f97658q = str2;
                        this.f97655n = baseNotice.getCommentNotice();
                        mo78088a("show", m85671d(), baseNotice.clientOrder, baseNotice, true, m85180a(baseNotice.getCommentNotice()), str2, str);
                        CommentNotice commentNotice4 = this.f97655n;
                        if (commentNotice4 != null) {
                            Comment comment2 = commentNotice4.getComment();
                            C52711k.m112236a((Object) comment2, "it.comment");
                            User user = comment2.getUser();
                            C52711k.m112236a((Object) user, "user");
                            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
                            this.f97651e.setUserData(userVerify);
                            this.f97651e.mo48964b();
                            TextView textView = this.f97652f;
                            Comment comment3 = commentNotice4.getComment();
                            C52711k.m112236a((Object) comment3, "it.comment");
                            User user2 = comment3.getUser();
                            C52711k.m112236a((Object) user2, "it.comment.user");
                            mo78303a(textView, user2, this.f97656o, str, str2);
                            Comment comment4 = commentNotice4.getComment();
                            C52711k.m112236a((Object) comment4, "it.comment");
                            Aweme aliasAweme = comment4.getAliasAweme();
                            C52711k.m112236a((Object) aliasAweme, "it.comment.aliasAweme");
                            if (aliasAweme.getVideo() != null) {
                                Comment comment5 = commentNotice4.getComment();
                                C52711k.m112236a((Object) comment5, "it.comment");
                                Aweme aliasAweme2 = comment5.getAliasAweme();
                                C52711k.m112236a((Object) aliasAweme2, "it.comment.aliasAweme");
                                Video video = aliasAweme2.getVideo();
                                C52711k.m112236a((Object) video, "it.comment.aliasAweme.video");
                                C12203q.m24645a((Object) C23608p.m57874a(video.getOriginCover())).mo23125b(C47788ct.m103417a(500)).mo23118a("Notice").mo23116a((C12197k) this.f97654m).mo23121a();
                            }
                            CommentNotice commentNotice5 = this.f97655n;
                            if (commentNotice5 != null) {
                                num = Integer.valueOf(commentNotice5.getCommentType());
                            } else {
                                num = null;
                            }
                            if (num != null && num.intValue() == 17) {
                                Context context = this.f97110c;
                                C52711k.m112236a((Object) context, "context");
                                str3 = context.getResources().getString(R.string.gwn);
                                C52711k.m112236a((Object) str3, "context.resources.getStr…_your_comment_with_video)");
                            } else if (num != null && num.intValue() == 18) {
                                Context context2 = this.f97110c;
                                C52711k.m112236a((Object) context2, "context");
                                str3 = context2.getResources().getString(R.string.gwm);
                                C52711k.m112236a((Object) str3, "context.resources.getStr…plied_comment_with_video)");
                            } else if (num != null && num.intValue() == 19) {
                                Context context3 = this.f97110c;
                                C52711k.m112236a((Object) context3, "context");
                                str3 = context3.getResources().getString(R.string.gwl);
                                C52711k.m112236a((Object) str3, "context.resources.getStr…liked_comment_with_video)");
                            } else {
                                str3 = "";
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                            mo78107a(spannableStringBuilder, baseNotice);
                            this.f97653g.setText(spannableStringBuilder);
                        }
                    }
                }
            }
        }
    }
}
