package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.FollowUserBtn;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32772s;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.p2108r.p2110b.C41052b;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47903fw;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.a.h */
public final class C38125h extends C38114b implements OnClickListener {

    /* renamed from: c */
    C32772s f97061c = C32616c.f84865a.getFollowPresenter();

    /* renamed from: d */
    FollowNotice f97062d;

    /* renamed from: e */
    Activity f97063e;

    /* renamed from: f */
    private ConstraintLayout f97064f;

    /* renamed from: g */
    private AvatarImageWithVerify f97065g;

    /* renamed from: h */
    private TextView f97066h;

    /* renamed from: i */
    private TextView f97067i;

    /* renamed from: j */
    private FollowUserBtn f97068j;

    /* renamed from: k */
    private View f97069k;

    /* renamed from: l */
    private BaseNotice f97070l;

    /* renamed from: m */
    private String f97071m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo78083a() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo78102b(int i) {
        this.f97068j.setFollowStatus(i);
        this.f97062d.getUser().setFollowStatus(i);
    }

    /* renamed from: a */
    public final void mo78082a(boolean z) {
        super.mo78082a(z);
        if (z) {
            this.f97069k.setVisibility(8);
            C41052b.m90722a(this.f97064f);
            return;
        }
        this.f97069k.setVisibility(0);
        C41052b.m90723a(this.f97064f, R.drawable.cm0, R.color.ana);
    }

    public final void onClick(View view) {
        boolean z;
        ClickInstrumentation.onClick(view);
        if (!mo78092b()) {
            String str = "click";
            String str2 = "fans";
            int adapterPosition = getAdapterPosition();
            BaseNotice baseNotice = this.f97070l;
            if (this.f97069k.getVisibility() == 8) {
                z = true;
            } else {
                z = false;
            }
            mo78086a(str, str2, adapterPosition, baseNotice, z, this.f97071m);
            super.onClick(view);
            int id = view.getId();
            if (id == R.id.bsw || id == R.id.bst || id == R.id.bsv) {
                mo78085a(this.f97063e, this.f97062d.getUser().getUid(), this.f97062d.getUser().getSecUid());
                m85185a(this.f97062d.getUser().getUid(), "message_fans", "click_head");
                C38415g.m85727a(this.f97063e, "fans", getLayoutPosition());
            }
        }
    }

    public C38125h(View view, Activity activity) {
        super(view);
        this.f97063e = activity;
        this.f97064f = (ConstraintLayout) view.findViewById(R.id.bsw);
        this.f97065g = (AvatarImageWithVerify) view.findViewById(R.id.bst);
        this.f97066h = (TextView) view.findViewById(R.id.bsv);
        this.f97067i = (TextView) view.findViewById(R.id.bsx);
        this.f97068j = (FollowUserBtn) view.findViewById(R.id.bsu);
        this.f97069k = view.findViewById(R.id.bsy);
        C38446k.m85764a(this.f97065g);
        C38446k.m85764a(this.f97066h);
        this.f97068j.setOnClickListener(new C38126i(this));
        this.f97064f.setOnClickListener(this);
        this.f97066h.setOnClickListener(this);
        this.f97065g.setOnClickListener(this);
        this.f97065g.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
    }

    /* renamed from: a */
    public final void mo78081a(BaseNotice baseNotice, boolean z, String str) {
        UserVerify userVerify;
        if (baseNotice != null && baseNotice.getFollowNotice() != null) {
            super.mo78081a(baseNotice, z, str);
            mo78082a(z);
            this.f97070l = baseNotice;
            this.f97071m = str;
            mo78086a("show", "fans", getAdapterPosition(), baseNotice, z, str);
            this.f97062d = baseNotice.getFollowNotice();
            this.f97067i.setText(C47903fw.m103626c(this.f97063e, baseNotice.getCreateTime() * 1000));
            if (this.f97062d.getUser() != null) {
                userVerify = new UserVerify(this.f97062d.getUser().getAvatarThumb(), this.f97062d.getUser().getCustomVerify(), this.f97062d.getUser().getEnterpriseVerifyReason(), Integer.valueOf(this.f97062d.getUser().getVerificationType()), this.f97062d.getUser().getWeiboVerify());
            } else {
                userVerify = null;
            }
            this.f97065g.setUserData(userVerify);
            this.f97066h.setText(this.f97062d.getUser().getNickname());
            mo78102b(this.f97062d.getUser().getFollowStatus());
            this.f97065g.mo48964b();
            C47916gh.m103674a(this.f97065g.getContext(), userVerify, this.f97066h);
        }
    }
}
