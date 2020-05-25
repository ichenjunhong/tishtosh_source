package com.p683ss.android.ugc.aweme.comment.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.p030v4.content.C0726c;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.ugc.aweme.app.C22835a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.comment.api.C25141d;
import com.p683ss.android.ugc.aweme.comment.list.C25266o;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentLikeUsersStruct;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25225e;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45549f;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48160d;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48162f;
import com.ss.android.ugc.trill.R;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.m */
public final class C25122m extends C25141d implements OnClickListener {

    /* renamed from: g */
    public static final C25123a f66549g = new C25123a(null);

    /* renamed from: a */
    final Context f66550a;

    /* renamed from: b */
    final Activity f66551b;

    /* renamed from: c */
    public String f66552c;

    /* renamed from: d */
    public int f66553d;

    /* renamed from: e */
    public String f66554e;

    /* renamed from: f */
    public final C25147a f66555f;

    /* renamed from: i */
    private final SmartAvatarImageView f66556i;

    /* renamed from: j */
    private final DmtTextView f66557j;

    /* renamed from: k */
    private final MentionTextView f66558k;

    /* renamed from: l */
    private final ViewGroup f66559l;

    /* renamed from: m */
    private final View f66560m;

    /* renamed from: n */
    private final C25266o f66561n;

    /* renamed from: o */
    private final int f66562o;

    /* renamed from: p */
    private User f66563p;

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.m$a */
    public static final class C25123a {
        private C25123a() {
        }

        public /* synthetic */ C25123a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.m$b */
    static final class C25124b implements C48162f {

        /* renamed from: a */
        final /* synthetic */ C25122m f66564a;

        /* renamed from: b */
        final /* synthetic */ Comment f66565b;

        C25124b(C25122m mVar, Comment comment) {
            this.f66564a = mVar;
            this.f66565b = comment;
        }

        /* renamed from: a */
        public final void mo51166a(View view, TextExtraStruct textExtraStruct) {
            Integer num;
            String str;
            String str2;
            String str3;
            C25122m mVar = this.f66564a;
            Comment comment = this.f66565b;
            String str4 = null;
            if (textExtraStruct != null) {
                num = Integer.valueOf(textExtraStruct.getType());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                SmartRouter.buildRoute((Context) mVar.f66551b, "//challenge/detail").withParam("aweme_id", comment.getAwemeId()).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_from", mVar.f66552c).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0).withParam("extra_challenge_is_hashtag", true).open();
                return;
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(C11010c.m22280a(), "aweme://user/profile/");
            String str5 = "uid";
            if (textExtraStruct != null) {
                str = textExtraStruct.getUserId();
            } else {
                str = null;
            }
            SmartRoute withParam = buildRoute.withParam(str5, str);
            String str6 = C22835a.f61196a;
            if (textExtraStruct != null) {
                str2 = textExtraStruct.getSecUid();
            } else {
                str2 = null;
            }
            withParam.withParam(str6, str2).open();
            Context context = mVar.f66550a;
            String str7 = LeakCanaryFileProvider.f132049i;
            String str8 = "comment_at";
            if (textExtraStruct != null) {
                str3 = textExtraStruct.getUserId();
            } else {
                str3 = null;
            }
            C26890h.m65005a(context, str7, str8, str3, 0);
            String str9 = "enter_personal_detail";
            C23089d a = C23089d.m56640a();
            String str10 = "enter_from";
            String str11 = mVar.f66552c;
            if (str11 == null) {
                str11 = "";
            }
            C23089d a2 = a.mo47829a(str10, str11);
            String str12 = "to_user_id";
            if (textExtraStruct != null) {
                str4 = textExtraStruct.getUserId();
            }
            C26890h.m65011a(str9, a2.mo47829a(str12, str4).mo47829a("group_id", comment.getAwemeId()).mo47829a("author_id", mVar.f66554e).mo47829a("enter_method", "comment_at").f61491a);
            C30578o.m71566a(C29988ad.PROFILE);
        }
    }

    /* renamed from: a */
    private static boolean m61027a() {
        return C25112e.m61020a();
    }

    public final void onClick(View view) {
        Integer num;
        CharSequence charSequence;
        String str;
        ClickInstrumentation.onClick(view);
        String str2 = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (((num != null && num.intValue() == R.id.hi) || (num != null && num.intValue() == R.id.title)) && !C32800a.m75679a(view)) {
            User user = this.f66563p;
            if (user != null) {
                charSequence = user.getUid();
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                C25147a aVar = this.f66555f;
                if (aVar != null) {
                    User user2 = this.f66563p;
                    if (user2 != null) {
                        str = user2.getUid();
                    } else {
                        str = null;
                    }
                    User user3 = this.f66563p;
                    if (user3 != null) {
                        str2 = user3.getSecUid();
                    }
                    aVar.mo51258a(str, str2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51206a(CommentLikeUsersStruct commentLikeUsersStruct) {
        C52711k.m112240b(commentLikeUsersStruct, "comment");
        this.f66563p = commentLikeUsersStruct.getUser();
        User user = this.f66563p;
        if (user != null) {
            C12203q.m24645a((Object) C23608p.m57874a(user.getAvatarThumb())).mo23125b(C47788ct.m103417a(100)).mo23111a(this.f66562o, this.f66562o).mo23127c(true).mo23116a((C12197k) this.f66556i).mo23121a();
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                this.f66557j.setText(user.getRemarkName());
            } else {
                this.f66557j.setText(user.getNickname());
            }
        }
        Comment comment = commentLikeUsersStruct;
        MentionTextView mentionTextView = this.f66558k;
        CharSequence a = C25225e.m61337a(comment, false, false, 3, null);
        if (!TextUtils.isEmpty(a)) {
            mentionTextView.setText(a);
            mentionTextView.setVisibility(0);
            C29408b.m69342a((TextView) mentionTextView);
        } else {
            mentionTextView.setVisibility(8);
        }
        C25225e.m61344e(comment);
        Context context = this.f66550a;
        C52711k.m112236a((Object) context, "mContext");
        mentionTextView.setSpanColor(context.getResources().getColor(R.color.a0z));
        mentionTextView.setOnSpanClickListener(new C25124b(this, comment));
        mentionTextView.mo95551a(C25225e.m61340b(comment), (C48160d) new C45549f(C25282a.m61494a().isChallengeToHashTag()));
        mentionTextView.setMovementMethod(LinkMovementMethod.getInstance());
        commentLikeUsersStruct.getAweme();
    }

    public C25122m(View view, C25147a aVar) {
        int i;
        C52711k.m112240b(view, "view");
        super(view);
        this.f66555f = aVar;
        this.f66550a = view.getContext();
        Context context = view.getContext();
        if (context != null) {
            this.f66551b = (Activity) context;
            View findViewById = view.findViewById(R.id.hi);
            C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.avatar)");
            this.f66556i = (SmartAvatarImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.title);
            C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.title)");
            this.f66557j = (DmtTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.ze);
            C52711k.m112236a((Object) findViewById3, "view.findViewById(R.id.content)");
            this.f66558k = (MentionTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.cxc);
            C52711k.m112236a((Object) findViewById4, "view.findViewById(R.id.tag_layout)");
            this.f66559l = (ViewGroup) findViewById4;
            View findViewById5 = view.findViewById(R.id.a6h);
            C52711k.m112236a((Object) findViewById5, "view.findViewById(R.id.divider)");
            this.f66560m = findViewById5;
            this.f66561n = C25282a.m61494a().createCommentVideoTagView(this.f66559l);
            this.f66562o = (int) C9432q.m18687b(this.f66550a, 32.0f);
            C13833a aVar2 = (C13833a) this.f66556i.getHierarchy();
            C52711k.m112236a((Object) aVar2, "mAvatarIv.hierarchy");
            C13837e eVar = aVar2.f36079a;
            if (eVar != null) {
                eVar.mo25939c((float) C23728o.m58241a(0.5d));
                Resources resources = this.f66556i.getResources();
                if (m61027a()) {
                    i = R.color.axa;
                } else {
                    i = R.color.j5;
                }
                eVar.mo25938b(resources.getColor(i));
            }
            OnClickListener onClickListener = this;
            this.f66556i.setOnClickListener(onClickListener);
            this.f66557j.setOnClickListener(onClickListener);
            TextPaint paint = this.f66557j.getPaint();
            C52711k.m112236a((Object) paint, "mNameTv.paint");
            paint.setFakeBoldText(true);
            if (m61027a()) {
                this.f66557j.setTextColor(this.f66557j.getResources().getColor(R.color.a1o));
                this.f66558k.setTextColor(this.f66558k.getResources().getColor(R.color.a1l));
                this.f66560m.setBackgroundColor(C0726c.m2098c(this.f66560m.getContext(), R.color.av0));
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.app.Activity");
    }
}
