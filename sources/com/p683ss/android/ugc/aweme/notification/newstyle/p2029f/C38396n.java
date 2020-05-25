package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.commercialize.log.C26052as;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.C38443j;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.utils.C38455d;
import com.p683ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.n */
public final class C38396n extends C38383h implements OnClickListener {

    /* renamed from: d */
    public FollowNotice f97710d;

    /* renamed from: e */
    public BaseNotice f97711e;

    /* renamed from: f */
    public String f97712f;

    /* renamed from: g */
    public String f97713g;

    /* renamed from: m */
    private final View f97714m;

    /* renamed from: n */
    private final AvatarImageWithVerify f97715n;

    /* renamed from: o */
    private final TextView f97716o;

    /* renamed from: p */
    private final TextView f97717p;

    /* renamed from: q */
    private final NotificationFollowUserBtn f97718q;

    /* renamed from: r */
    private C31980a f97719r;

    /* renamed from: b */
    public final void mo78306b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("from_where", i);
        bundle.putString("username", this.f97716o.getText().toString());
        FollowNotice followNotice = this.f97710d;
        if (followNotice != null) {
            User user = followNotice.getUser();
            C52711k.m112236a((Object) user, "it.user");
            UrlModel avatarThumb = user.getAvatarThumb();
            bundle.putString(C42311c.f106865i, this.f97110c.getString(R.string.cjy));
            bundle.putSerializable("avatar_thumb", avatarThumb);
        }
        this.f97677j = bundle;
        this.f97676i = true;
    }

    public C38396n(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97714m = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97715n = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.bto);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f97716o = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f97717p = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bs3);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.notification_button)");
        this.f97718q = (NotificationFollowUserBtn) findViewById5;
        this.f97718q.getLayoutParams().width = C38432d.m85744a(this.f97110c);
        C38415g.m85729b(this.f97714m);
        C38446k.m85764a(this.f97715n);
        C38446k.m85764a(this.f97718q);
        OnClickListener onClickListener = this;
        this.f97718q.setOnClickListener(onClickListener);
        this.f97714m.setOnClickListener(onClickListener);
        this.f97715n.setOnClickListener(onClickListener);
        this.f97716o.setOnClickListener(onClickListener);
        this.f97715n.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
        this.f97719r = new C31980a(this.f97718q, new C31988e(this) {

            /* renamed from: a */
            final /* synthetic */ C38396n f97720a;

            /* renamed from: a */
            public final String mo56221a() {
                return C38383h.f97672l.mo78308a(this.f97720a.f97711e, false);
            }

            {
                this.f97720a = r1;
            }

            /* renamed from: a */
            public final void mo49741a(int i, User user) {
                String str;
                super.mo49741a(i, user);
                C47718bf.m103288a(new C24530d(i, user));
                this.f97720a.mo78108a("click", "fans", this.f97720a.f97711e, this.f97720a.f97712f, this.f97720a.f97713g);
                if (user != null) {
                    if (i == 0) {
                        str = "follow_cancel";
                    } else {
                        Context context = this.f97720a.f97110c;
                        C52711k.m112236a((Object) context, "context");
                        C38415g.m85726a(context, this.f97720a.f97710d);
                        str = "follow";
                    }
                    String str2 = "single";
                    if (user.getFollowerStatus() == 1) {
                        str2 = "mutual";
                    }
                    String str3 = str2;
                    C26890h.onEvent(new MobClick().setEventName(str).setLabelName("message").setValue(user.getUid()));
                    if (C52711k.m112239a((Object) str, (Object) "follow")) {
                        String uid = user.getUid();
                        C52711k.m112236a((Object) uid, "uid");
                        C26052as.m63104a().logFollowUserEvent("message", "message", "other_places", "follow_button", uid, str3);
                    } else {
                        C26890h.m65011a("follow_cancel", C23089d.m56640a().mo47829a("enter_from", "message").mo47829a("to_user_id", user.getUid()).mo47829a("scene_id", "1002").mo47829a("previous_page", "message").mo47829a("enter_method", "follow_button").mo47829a("previous_page_position", "other_places").mo47829a("request_id", user.getRequestId()).mo47829a("author_id", user.getUid()).f61491a);
                    }
                }
            }
        });
    }

    public final void onClick(View view) {
        Integer num;
        int i;
        ClickInstrumentation.onClick(view);
        if (!C38398o.m85707a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        FollowNotice followNotice = this.f97710d;
        if (followNotice != null) {
            User user = followNotice.getUser();
            if (user != null) {
                mo78108a("click", "fans", this.f97711e, this.f97712f, this.f97713g);
                if (view != null) {
                    num = Integer.valueOf(view.getId());
                } else {
                    num = null;
                }
                if ((num != null && num.intValue() == R.id.bu1) || (num != null && num.intValue() == R.id.bt7)) {
                    if (this.f97676i) {
                        C38443j.m85761a(this.f97677j, getAdapterPosition());
                    }
                    String uid = user.getUid();
                    C52711k.m112236a((Object) uid, "it.uid");
                    String secUid = user.getSecUid();
                    C52711k.m112236a((Object) secUid, "it.secUid");
                    C38383h.m85681a((C38383h) this, uid, secUid, this.f97711e, false, (String) null, 24, (Object) null);
                    Context context = this.f97110c;
                    C52711k.m112236a((Object) context, "context");
                    String str = "fans";
                    BaseNotice baseNotice = this.f97711e;
                    if (baseNotice != null) {
                        i = baseNotice.clientOrder;
                    } else {
                        i = -1;
                    }
                    C38415g.m85727a(context, str, i);
                } else if (num != null && num.intValue() == R.id.bs3) {
                    int i2 = 4;
                    if (C38455d.m85780a(user.getFollowStatus()) || user.getFollowStatus() == 4) {
                        i2 = 0;
                    } else if (!C38455d.m85781a(user, false)) {
                        i2 = 1;
                    }
                    C31980a aVar = this.f97719r;
                    if (aVar != null) {
                        aVar.mo65174a(user.getUid(), user.getSecUid(), i2, user.getFollowerStatus());
                    }
                    C47718bf.m103288a(new C24530d(i2, user));
                } else {
                    if (num != null && num.intValue() == R.id.bto && this.f97676i) {
                        C38443j.m85761a(this.f97677j, getAdapterPosition());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo78312a(BaseNotice baseNotice, boolean z, String str, String str2) {
        C52711k.m112240b(baseNotice, "notice");
        C52711k.m112240b(str2, "enterFrom");
        if (baseNotice.getFollowNotice() != null) {
            this.f97711e = baseNotice;
            this.f97712f = str;
            this.f97713g = str2;
            mo78108a("show", "fans", baseNotice, str, str2);
            this.f97710d = baseNotice.getFollowNotice();
            FollowNotice followNotice = this.f97710d;
            if (followNotice != null) {
                User user = followNotice.getUser();
                if (user != null) {
                    UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
                    this.f97715n.setUserData(userVerify);
                    this.f97715n.mo48964b();
                    mo78303a(this.f97716o, user, this.f97711e, str, str2);
                    this.f97718q.setFollowStatus(user.getFollowStatus());
                    C31980a aVar = this.f97719r;
                    if (aVar != null) {
                        aVar.mo65173a(user);
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.f97110c.getString(R.string.cjy));
            mo78107a(spannableStringBuilder, baseNotice);
            this.f97717p.setText(spannableStringBuilder);
        }
    }
}
