package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.commercialize.log.C26052as;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32772s;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.utils.C38455d;
import com.p683ss.android.ugc.aweme.p2108r.p2110b.C41052b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47903fw;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.a.j */
public final class C38127j extends C38114b implements OnClickListener {

    /* renamed from: c */
    private ConstraintLayout f97073c;

    /* renamed from: d */
    private AvatarImageWithVerify f97074d;

    /* renamed from: e */
    private TextView f97075e;

    /* renamed from: f */
    private TextView f97076f;

    /* renamed from: g */
    private TextView f97077g;

    /* renamed from: h */
    private Button f97078h;

    /* renamed from: i */
    private C32772s f97079i = C32616c.f84865a.getFollowPresenter();

    /* renamed from: j */
    private FriendNotice f97080j;

    /* renamed from: k */
    private Activity f97081k;

    /* renamed from: l */
    private View f97082l;

    /* renamed from: m */
    private String f97083m;

    /* renamed from: a */
    public final void mo78082a(boolean z) {
        super.mo78082a(z);
        if (z) {
            this.f97082l.setVisibility(8);
            C41052b.m90722a(this.f97073c);
            return;
        }
        this.f97082l.setVisibility(0);
        C41052b.m90723a(this.f97073c, R.drawable.cm0, R.color.ana);
    }

    /* renamed from: b */
    private void m85226b(int i) {
        if (i == 0) {
            this.f97078h.setText(R.string.b3w);
            this.f97078h.setBackgroundResource(R.drawable.cjl);
            this.f97078h.setTextColor(C11010c.m22280a().getResources().getColor(R.color.a1k));
        } else if (i == 1) {
            this.f97078h.setText(R.string.b55);
            this.f97078h.setBackgroundResource(R.drawable.cji);
            this.f97078h.setTextColor(C11010c.m22280a().getResources().getColor(R.color.a1o));
        } else if (i == 2) {
            this.f97078h.setText(R.string.as8);
            this.f97078h.setBackgroundResource(R.drawable.cji);
            this.f97078h.setTextColor(C11010c.m22280a().getResources().getColor(R.color.a1o));
        } else if (i == 4) {
            this.f97078h.setText(R.string.b4y);
            this.f97078h.setBackgroundResource(R.drawable.cji);
            this.f97078h.setTextColor(C11010c.m22280a().getResources().getColor(R.color.a1o));
        }
        this.f97080j.getUser().setFollowStatus(i);
    }

    public final void onClick(View view) {
        int i;
        String str;
        ClickInstrumentation.onClick(view);
        if (!mo78092b()) {
            super.onClick(view);
            int id = view.getId();
            if (id == R.id.bt4 || id == R.id.bt1 || id == R.id.bt3) {
                mo78085a(this.f97081k, this.f97080j.getUser().getUid(), this.f97080j.getUser().getSecUid());
                C26890h.m65011a("official_message_inner_message", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("account_type", "friend_recommend").mo47829a("content_id", this.f97083m).mo47829a("rec_reason", this.f97080j.getContent()).f61491a);
                return;
            }
            if (id == R.id.bt2) {
                int i2 = 0;
                if (this.f97080j.getUser().getFollowStatus() != 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                int i3 = i ^ 1;
                if (i != 0) {
                    C26890h.m65011a("follow_cancel", C23089d.m56640a().mo47829a("to_user_id", this.f97080j.getUser().getUid()).mo47829a("enter_from", "friend_recommend").mo47829a("previous_page", "message").f61491a);
                } else {
                    C26890h.m65011a("follow", C23089d.m56640a().mo47829a("enter_from", "friend_recommend").mo47829a("previous_page", "message").mo47829a("to_user_id", this.f97080j.getUser().getUid()).mo47829a("request_id", C20854a.m53167g().getCurUserId()).f61491a);
                    if (C38455d.m85781a(this.f97080j.getUser(), false)) {
                        i2 = 4;
                    } else {
                        i2 = 1;
                    }
                }
                C47718bf.m103288a(new C24530d(i2, this.f97080j.getUser()));
                this.f97079i.mo66349a(new C39970a().mo81871a(this.f97080j.getUser().getUid()).mo81869a(i3).mo81877d(this.f97080j.getUser().getFollowerStatus()).mo81872a());
                MobClick mobClick = new MobClick();
                if (i != 0) {
                    str = "follow_cancel";
                } else {
                    str = "follow";
                }
                C26890h.onEvent(mobClick.setEventName(str).setLabelName("message").setValue(this.f97080j.getUser().getUid()));
                if (i == 0) {
                    C26052as.m63104a().logFollowUserEventI18n("message", this.f97080j.getUser().getUid());
                }
                m85226b(i2);
            }
        }
    }

    public C38127j(View view, Activity activity) {
        super(view);
        this.f97081k = activity;
        this.f97073c = (ConstraintLayout) view.findViewById(R.id.bt4);
        this.f97074d = (AvatarImageWithVerify) view.findViewById(R.id.bt1);
        this.f97075e = (TextView) view.findViewById(R.id.bt3);
        this.f97076f = (TextView) view.findViewById(R.id.bt5);
        this.f97077g = (TextView) view.findViewById(R.id.bt0);
        this.f97078h = (Button) view.findViewById(R.id.bt2);
        this.f97082l = view.findViewById(R.id.bt6);
        C38446k.m85764a(this.f97074d);
        C38446k.m85764a(this.f97075e);
        this.f97078h.setOnClickListener(this);
        this.f97073c.setOnClickListener(this);
        this.f97075e.setOnClickListener(this);
        this.f97074d.setOnClickListener(this);
        this.f97074d.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
    }

    /* renamed from: a */
    public final void mo78081a(BaseNotice baseNotice, boolean z, String str) {
        UserVerify userVerify;
        if (baseNotice != null && baseNotice.getFriendNotice() != null && baseNotice.getFriendNotice().getUser() != null) {
            super.mo78081a(baseNotice, z, str);
            mo78082a(z);
            this.f97080j = baseNotice.getFriendNotice();
            this.f97083m = baseNotice.getNid();
            this.f97076f.setText(C47903fw.m103624a(this.f97081k, baseNotice.getCreateTime() * 1000));
            User user = this.f97080j.getUser();
            if (user != null) {
                userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            } else {
                userVerify = null;
            }
            this.f97074d.setUserData(userVerify);
            this.f97075e.setText(this.f97080j.getUser().getNickname());
            this.f97074d.mo48964b();
            C47916gh.m103674a(this.f97074d.getContext(), userVerify, this.f97075e);
            m85226b(this.f97080j.getUser().getFollowStatus());
            this.f97077g.setText(this.f97080j.getContent());
            C26890h.m65011a("official_message_inner_message", C23089d.m56640a().mo47829a("action_type", "show").mo47829a("account_type", "friend_recommend").mo47829a("content_id", this.f97083m).mo47829a("rec_reason", this.f97080j.getContent()).f61491a);
        }
    }
}
