package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartRoundImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38090d;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.f */
public final class C38380f extends C38383h implements OnClickListener {

    /* renamed from: d */
    public static final C38381a f97659d = new C38381a(null);

    /* renamed from: e */
    private final View f97660e;

    /* renamed from: f */
    private final AvatarImageWithVerify f97661f;

    /* renamed from: g */
    private final TextView f97662g;

    /* renamed from: m */
    private final TextView f97663m;

    /* renamed from: n */
    private final View f97664n;

    /* renamed from: o */
    private final SmartRoundImageView f97665o;

    /* renamed from: p */
    private C38090d f97666p;

    /* renamed from: q */
    private BaseNotice f97667q;

    /* renamed from: r */
    private String f97668r;

    /* renamed from: s */
    private String f97669s;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.f$a */
    public static final class C38381a {
        private C38381a() {
        }

        public /* synthetic */ C38381a(C52707g gVar) {
            this();
        }
    }

    public C38380f(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97660e = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97661f = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.bto);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f97662g = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f97663m = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.btz);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.…fication_reply_container)");
        this.f97664n = findViewById5;
        View findViewById6 = view.findViewById(R.id.bsd);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.notification_cover)");
        this.f97665o = (SmartRoundImageView) findViewById6;
        C38415g.m85729b(this.f97660e);
        C38446k.m85764a(this.f97661f);
        C38446k.m85764a(this.f97665o);
        C38415g.m85728a((View) this.f97665o);
        OnClickListener onClickListener = this;
        this.f97665o.setOnClickListener(onClickListener);
        this.f97660e.setOnClickListener(onClickListener);
        this.f97661f.setOnClickListener(onClickListener);
        this.f97661f.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
        ((C13833a) this.f97665o.getHierarchy()).mo25902b((int) R.color.auf);
        this.f97664n.setVisibility(8);
    }

    public final void onClick(View view) {
        int i;
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C38382g.m85675a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        C38090d dVar = this.f97666p;
        if (dVar != null) {
            String str = "click";
            String str2 = "donation_sticker";
            BaseNotice baseNotice = this.f97667q;
            if (baseNotice != null) {
                i = baseNotice.clientOrder;
            } else {
                i = -1;
            }
            mo78088a(str, str2, i, this.f97667q, true, "", this.f97669s, this.f97668r);
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == R.id.bt7) {
                if (dVar.f96897b != null) {
                    User user = dVar.f96897b;
                    if (user == null) {
                        C52711k.m112234a();
                    }
                    String uid = user.getUid();
                    C52711k.m112236a((Object) uid, "it.user!!.uid");
                    User user2 = dVar.f96897b;
                    if (user2 == null) {
                        C52711k.m112234a();
                    }
                    String secUid = user2.getSecUid();
                    C52711k.m112236a((Object) secUid, "it.user!!.secUid");
                    C38383h.m85681a((C38383h) this, uid, secUid, this.f97667q, false, (String) null, 24, (Object) null);
                }
            } else if (((num != null && num.intValue() == R.id.bu1) || (num != null && num.intValue() == R.id.bsd)) && dVar.f96896a != null) {
                SmartRoute buildRoute = SmartRouter.buildRoute(C11010c.m22280a(), "aweme://aweme/detail/");
                String str3 = "id";
                Aweme aweme = dVar.f96896a;
                if (aweme == null) {
                    C52711k.m112234a();
                }
                buildRoute.withParam(str3, aweme.getAid()).withParam("refer", "message").withParam("enter_method", "notice_click").withParam("show_donation", true).open();
            }
        }
    }

    /* renamed from: a */
    public final void mo78302a(BaseNotice baseNotice, String str, String str2) {
        C52711k.m112240b(baseNotice, "notice");
        C52711k.m112240b(str2, "enterFrom");
        if (baseNotice.getDonationNotice() != null) {
            this.f97668r = str;
            this.f97667q = baseNotice;
            this.f97669s = str2;
            mo78088a("show", "donation_sticker", baseNotice.clientOrder, baseNotice, true, "", str2, str);
            this.f97666p = baseNotice.getDonationNotice();
            C38090d dVar = this.f97666p;
            if (dVar != null) {
                User user = dVar.f96897b;
                if (user != null) {
                    UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
                    this.f97661f.setUserData(userVerify);
                    this.f97661f.mo48964b();
                    mo78303a(this.f97662g, user, this.f97667q, str, str2);
                }
                Aweme aweme = dVar.f96896a;
                if (aweme != null) {
                    Video video = aweme.getVideo();
                    C52711k.m112236a((Object) video, "video");
                    C12203q.m24645a((Object) C23608p.m57874a(video.getOriginCover())).mo23125b(C47788ct.m103417a(500)).mo23118a("DONATION_NOTICE").mo23116a((C12197k) this.f97665o).mo23121a();
                }
                C38389i.m85696a(this.f97663m, new SpannableStringBuilder(this.f97110c.getString(R.string.g95)), baseNotice, 7, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 148.0f)));
            }
        }
    }
}
