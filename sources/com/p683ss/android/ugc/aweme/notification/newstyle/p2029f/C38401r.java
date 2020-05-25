package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.router.SmartRouter;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartRoundImageView;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25242m;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.notification.util.C38443j;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.r */
public final class C38401r extends C38383h implements OnClickListener {

    /* renamed from: d */
    public static final C38402a f97737d = new C38402a(null);

    /* renamed from: e */
    private final View f97738e;

    /* renamed from: f */
    private final AvatarImageWithVerify f97739f;

    /* renamed from: g */
    private final TextView f97740g;

    /* renamed from: m */
    private final TextView f97741m;

    /* renamed from: n */
    private final SmartRoundImageView f97742n;

    /* renamed from: o */
    private final SmartRoundImageView f97743o;

    /* renamed from: p */
    private final View f97744p;

    /* renamed from: q */
    private final TextView f97745q;

    /* renamed from: r */
    private BaseNotice f97746r;

    /* renamed from: s */
    private String f97747s;

    /* renamed from: t */
    private String f97748t;

    /* renamed from: u */
    private AtMe f97749u;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.r$a */
    public static final class C38402a {
        private C38402a() {
        }

        public /* synthetic */ C38402a(C52707g gVar) {
            this();
        }
    }

    public C38401r(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97738e = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97739f = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.bto);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f97740g = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f97741m = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bsf);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.…notification_cover_right)");
        this.f97742n = (SmartRoundImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bse);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.…otification_cover_bottom)");
        this.f97743o = (SmartRoundImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.btz);
        C52711k.m112236a((Object) findViewById7, "itemView.findViewById(R.…fication_reply_container)");
        this.f97744p = findViewById7;
        View findViewById8 = view.findViewById(R.id.bu0);
        C52711k.m112236a((Object) findViewById8, "itemView.findViewById(R.…tification_reply_content)");
        this.f97745q = (TextView) findViewById8;
        C38415g.m85729b(this.f97738e);
        C38446k.m85764a(this.f97739f);
        C38446k.m85764a(this.f97742n);
        C38446k.m85764a(this.f97743o);
        OnClickListener onClickListener = this;
        this.f97738e.setOnClickListener(onClickListener);
        this.f97739f.setOnClickListener(onClickListener);
        this.f97739f.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
        this.f97742n.setOnClickListener(onClickListener);
        this.f97743o.setOnClickListener(onClickListener);
        ((C13833a) this.f97742n.getHierarchy()).mo25902b((int) R.color.c8);
        ((C13833a) this.f97743o.getHierarchy()).mo25902b((int) R.color.c8);
        C38415g.m85728a((View) this.f97742n);
    }

    /* renamed from: b */
    public final void mo78306b(int i) {
        String str;
        Bundle bundle = new Bundle();
        bundle.putInt("from_where", i);
        bundle.putString("username", this.f97740g.getText().toString());
        AtMe atMe = this.f97749u;
        if (atMe != null) {
            User user = atMe.getUser();
            C52711k.m112236a((Object) user, "it.user");
            UrlModel avatarThumb = user.getAvatarThumb();
            int subType = atMe.getSubType();
            if (subType != 7) {
                switch (subType) {
                    case 1:
                        Context context = this.f97110c;
                        C52711k.m112236a((Object) context, "context");
                        str = context.getResources().getString(R.string.bkn);
                        break;
                    case 2:
                        Context context2 = this.f97110c;
                        C52711k.m112236a((Object) context2, "context");
                        str = context2.getResources().getString(R.string.bkm);
                        break;
                    default:
                        str = null;
                        break;
                }
            } else {
                Context context3 = this.f97110c;
                C52711k.m112236a((Object) context3, "context");
                str = context3.getResources().getString(R.string.ckf);
            }
            if (str != null) {
                bundle.putString(C42311c.f106865i, str);
                bundle.putSerializable("avatar_thumb", avatarThumb);
            } else {
                return;
            }
        }
        this.f97677j = bundle;
        this.f97676i = true;
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C38403s.m85714a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        AtMe atMe = this.f97749u;
        if (atMe != null) {
            mo78108a("click", "at", this.f97746r, this.f97747s, this.f97748t);
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == R.id.bt7) {
                User user = atMe.getUser();
                C52711k.m112236a((Object) user, "it.user");
                String uid = user.getUid();
                C52711k.m112236a((Object) uid, "it.user.uid");
                User user2 = atMe.getUser();
                C52711k.m112236a((Object) user2, "it.user");
                String secUid = user2.getSecUid();
                C52711k.m112236a((Object) secUid, "it.user.secUid");
                C38383h.m85681a((C38383h) this, uid, secUid, this.f97746r, false, (String) null, 24, (Object) null);
            } else {
                if ((num != null && num.intValue() == R.id.bu1) || ((num != null && num.intValue() == R.id.bsf) || (num != null && num.intValue() == R.id.bse))) {
                    if (this.f97676i) {
                        C38443j.m85761a(this.f97677j, getAdapterPosition());
                    }
                    SmartRouter.buildRoute(C11010c.m22280a(), atMe.getSchemaUrl()).withParam("refer", "message").open();
                    if (!TextUtils.isEmpty(m85181a(atMe.getSchemaUrl()))) {
                        C38415g gVar = C38415g.f97773a;
                        Context context = this.f97110c;
                        C52711k.m112236a((Object) context, "getContext()");
                        gVar.mo78318a(context);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo78314a(BaseNotice baseNotice, boolean z, String str, String str2) {
        boolean z2;
        CharSequence charSequence;
        C52711k.m112240b(baseNotice, "notice");
        C52711k.m112240b(str2, "enterFrom");
        if (baseNotice.getAtMe() != null) {
            this.f97746r = baseNotice;
            this.f97747s = str;
            this.f97748t = str2;
            mo78108a("show", "at", baseNotice, str, str2);
            this.f97749u = baseNotice.getAtMe();
            AtMe atMe = this.f97749u;
            if (atMe != null) {
                UserVerify userVerify = new UserVerify(atMe.getUser().getAvatarThumb(), atMe.getUser().getCustomVerify(), atMe.getUser().getEnterpriseVerifyReason(), Integer.valueOf(atMe.getUser().getVerificationType()), atMe.getUser().getWeiboVerify());
                this.f97739f.setUserData(userVerify);
                this.f97739f.mo48964b();
                TextView textView = this.f97740g;
                User user = atMe.getUser();
                C52711k.m112236a((Object) user, "it.user");
                mo78303a(textView, user, this.f97746r, str, str2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (atMe.getSubType() == 2) {
                    this.f97742n.setVisibility(0);
                    this.f97743o.setVisibility(8);
                    TextView textView2 = this.f97741m;
                    Context context = this.f97110c;
                    C52711k.m112236a((Object) context, "getContext()");
                    textView2.setTextColor(context.getResources().getColor(R.color.a17));
                    Comment comment = atMe.getComment();
                    if (comment != null) {
                        CharSequence cid = comment.getCid();
                        if (cid == null || cid.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            this.f97744p.setVisibility(0);
                            NoticeCommentHelperService a = C25242m.m61365a();
                            TextView textView3 = this.f97745q;
                            if (comment.getUser() != null) {
                                StringBuilder sb = new StringBuilder();
                                User user2 = comment.getUser();
                                C52711k.m112236a((Object) user2, "user");
                                sb.append(C38415g.m85724a(user2));
                                sb.append(": ");
                                sb.append(a.getDisplayText(comment, false));
                                charSequence = sb.toString();
                            } else {
                                charSequence = a.getDisplayText(comment, false);
                            }
                            textView3.setText(charSequence);
                            C29408b.m69342a(this.f97745q);
                        }
                    }
                    C12203q.m24645a((Object) C23608p.m57874a(atMe.getImageUrl())).mo23125b(C47788ct.m103417a(500)).mo23118a("Notice").mo23116a((C12197k) this.f97742n).mo23121a();
                    spannableStringBuilder.append(this.f97110c.getString(R.string.cki)).append(" ").append(atMe.getContent());
                } else {
                    this.f97742n.setVisibility(8);
                    this.f97743o.setVisibility(0);
                    this.f97744p.setVisibility(8);
                    TextView textView4 = this.f97741m;
                    Context context2 = this.f97110c;
                    C52711k.m112236a((Object) context2, "getContext()");
                    textView4.setTextColor(context2.getResources().getColor(R.color.a1a));
                    C12203q.m24645a((Object) C23608p.m57874a(atMe.getImageUrl())).mo23125b(C47788ct.m103417a(500)).mo23118a("Notice").mo23116a((C12197k) this.f97743o).mo23121a();
                    if (!TextUtils.isEmpty(atMe.getTitle()) && (atMe.getSubType() == 7 || atMe.getSubType() == 8)) {
                        spannableStringBuilder.append(atMe.getTitle());
                    } else if (atMe.getSubType() == 7) {
                        spannableStringBuilder.append(this.f97110c.getString(R.string.ckf));
                    } else {
                        spannableStringBuilder.append(this.f97110c.getString(R.string.cke));
                    }
                }
                C38389i.m85696a(this.f97741m, spannableStringBuilder, baseNotice, 7, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 148.0f)));
                C29408b.m69342a(this.f97741m);
            }
        }
    }
}
