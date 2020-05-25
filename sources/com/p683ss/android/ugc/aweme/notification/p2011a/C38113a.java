package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartRoundImageView;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.p2108r.p2110b.C41052b;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47903fw;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.a.a */
public final class C38113a extends C38114b implements OnClickListener {

    /* renamed from: c */
    private Activity f96991c;

    /* renamed from: d */
    private AvatarImageWithVerify f96992d;

    /* renamed from: e */
    private SmartRoundImageView f96993e;

    /* renamed from: f */
    private TextView f96994f;

    /* renamed from: g */
    private TextView f96995g;

    /* renamed from: h */
    private TextView f96996h;

    /* renamed from: i */
    private TextView f96997i;

    /* renamed from: j */
    private ConstraintLayout f96998j;

    /* renamed from: k */
    private AtMe f96999k;

    /* renamed from: l */
    private View f97000l;

    /* renamed from: m */
    private BaseNotice f97001m;

    /* renamed from: n */
    private String f97002n;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo78083a() {
        return true;
    }

    /* renamed from: a */
    public final void mo78082a(boolean z) {
        super.mo78082a(z);
        if (z) {
            this.f97000l.setVisibility(8);
            C41052b.m90722a(this.f96998j);
            return;
        }
        this.f97000l.setVisibility(0);
        C41052b.m90723a(this.f96998j, R.drawable.cm0, R.color.ana);
    }

    public final void onClick(View view) {
        boolean z;
        ClickInstrumentation.onClick(view);
        if (!mo78092b()) {
            String str = "click";
            String str2 = "at";
            int adapterPosition = getAdapterPosition();
            BaseNotice baseNotice = this.f97001m;
            if (this.f97000l.getVisibility() == 8) {
                z = true;
            } else {
                z = false;
            }
            mo78086a(str, str2, adapterPosition, baseNotice, z, this.f97002n);
            super.onClick(view);
            int id = view.getId();
            if (id == R.id.btr || id == R.id.bts) {
                mo78085a(this.f96991c, this.f96999k.getUser().getUid(), this.f96999k.getUser().getSecUid());
                m85185a(this.f96999k.getUser().getUid(), "message_at", "click_head");
                return;
            }
            if (id == R.id.btt || id == R.id.btw) {
                C41302w.m91042a().mo83858a(this.f96991c, C41311y.m91065a(this.f96999k.getSchemaUrl()).mo83870a("refer", "message").mo83871a());
                if (!TextUtils.isEmpty(m85181a(this.f96999k.getSchemaUrl()))) {
                    C38415g.m85725a(this.f96991c);
                }
            }
        }
    }

    public C38113a(View view, Activity activity) {
        super(view);
        this.f96991c = activity;
        this.f96992d = (AvatarImageWithVerify) view.findViewById(R.id.btr);
        this.f96993e = (SmartRoundImageView) view.findViewById(R.id.btw);
        this.f96994f = (TextView) view.findViewById(R.id.bts);
        this.f96995g = (TextView) view.findViewById(R.id.btp);
        this.f96996h = (TextView) view.findViewById(R.id.btu);
        this.f96998j = (ConstraintLayout) view.findViewById(R.id.btt);
        this.f97000l = view.findViewById(R.id.btv);
        this.f96997i = (TextView) view.findViewById(R.id.btq);
        C38446k.m85764a(this.f96994f);
        C38446k.m85764a(this.f96993e);
        C38446k.m85764a(this.f96992d);
        this.f96993e.setOnClickListener(this);
        this.f96992d.setOnClickListener(this);
        this.f96994f.setOnClickListener(this);
        this.f96998j.setOnClickListener(this);
        ((C13833a) this.f96993e.getHierarchy()).mo25902b((int) R.color.c8);
        this.f96992d.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
    }

    /* renamed from: a */
    public final void mo78081a(BaseNotice baseNotice, boolean z, String str) {
        UserVerify userVerify;
        if (baseNotice != null && baseNotice.getAtMe() != null) {
            super.mo78081a(baseNotice, z, str);
            mo78082a(z);
            this.f97001m = baseNotice;
            this.f97002n = str;
            mo78086a("show", "at", getAdapterPosition(), baseNotice, z, str);
            this.f96999k = baseNotice.getAtMe();
            if (this.f96999k.getUser() != null) {
                userVerify = new UserVerify(this.f96999k.getUser().getAvatarThumb(), this.f96999k.getUser().getCustomVerify(), this.f96999k.getUser().getEnterpriseVerifyReason(), Integer.valueOf(this.f96999k.getUser().getVerificationType()), this.f96999k.getUser().getWeiboVerify());
            } else {
                userVerify = null;
            }
            this.f96992d.setUserData(userVerify);
            C12203q.m24645a((Object) C23608p.m57874a(this.f96999k.getImageUrl())).mo23125b(C47788ct.m103417a(500)).mo23118a("Notice").mo23116a((C12197k) this.f96993e).mo23121a();
            this.f96994f.setText(this.f96999k.getUser().getNickname());
            this.f96996h.setText(C47903fw.m103626c(this.f96991c, baseNotice.getCreateTime() * 1000));
            if (C9431p.m18664a(this.f96999k.getTitle())) {
                this.f96995g.setVisibility(0);
                this.f96995g.setText(this.f96999k.getContent());
                this.f96997i.setText(R.string.bkm);
            } else if (this.f96999k.getSubType() == 7 || this.f96999k.getSubType() == 8) {
                this.f96995g.setVisibility(8);
                this.f96997i.setText(this.f96999k.getTitle());
            } else {
                this.f96995g.setVisibility(8);
                this.f96997i.setText(R.string.bkn);
            }
            C29408b.m69342a(this.f96995g);
            this.f96992d.mo48964b();
            C47916gh.m103674a(this.f96992d.getContext(), userVerify, this.f96994f);
        }
    }
}
