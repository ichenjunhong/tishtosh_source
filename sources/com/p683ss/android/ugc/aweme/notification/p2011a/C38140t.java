package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.p683ss.android.ugc.aweme.notification.utils.C38455d;
import com.p683ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.a.t */
public final class C38140t extends C38135o implements OnClickListener {

    /* renamed from: d */
    private RelativeLayout f97127d;

    /* renamed from: e */
    private AvatarImageWithVerify f97128e;

    /* renamed from: f */
    private TextView f97129f;

    /* renamed from: g */
    private NotificationFollowUserBtn f97130g;

    /* renamed from: h */
    private FriendNotice f97131h;

    /* renamed from: i */
    private Context f97132i;

    /* renamed from: j */
    private C31980a f97133j;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo78097c() {
        return R.id.bsw;
    }

    public C38140t(View view) {
        super(view);
        this.f97132i = view.getContext();
        this.f97127d = (RelativeLayout) view.findViewById(R.id.bsw);
        this.f97128e = (AvatarImageWithVerify) view.findViewById(R.id.bst);
        this.f97129f = (TextView) view.findViewById(R.id.bsc);
        this.f97130g = (NotificationFollowUserBtn) view.findViewById(R.id.bs3);
        this.f97130g.getLayoutParams().width = C38432d.m85744a(this.f97110c);
        C38432d.m85745a((View) this.f97127d);
        C38432d.m85745a((View) this.f97128e);
        C38446k.m85764a(this.f97130g);
        this.f97127d.setOnClickListener(this);
        this.f97128e.setOnClickListener(this);
        this.f97128e.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
        this.f97133j = new C31980a(this.f97130g, null);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C38141u.m85249a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97132i, (int) R.string.cg1).mo19066a();
            return;
        }
        int id = view.getId();
        if (id == R.id.bsw || id == R.id.bsv || id == R.id.bs3) {
            m85236a("friend", getLayoutPosition());
            C41302w.m91042a().mo83861a(C41311y.m91065a(this.f97131h.getOpenUrl()).mo83870a("enter_from", "message").mo83871a());
            return;
        }
        if (id == R.id.bst) {
            C41302w.m91042a().mo83861a(C41311y.m91065a(this.f97131h.getOpenUrl()).mo83870a("enter_from", "message").mo83871a());
        }
    }

    /* renamed from: a */
    public final void mo78112a(MusNotice musNotice, boolean z) {
        UserVerify userVerify;
        if (musNotice != null && musNotice.getFriendNotice() != null) {
            this.f97131h = musNotice.getFriendNotice();
            User user = this.f97131h.getUser();
            if (user != null) {
                userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            } else {
                userVerify = null;
            }
            this.f97128e.setUserData(userVerify);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String a = C38455d.m85778a(this.f97131h.getUser());
            if (a != null) {
                spannableStringBuilder.append(a);
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append(this.f97132i.getString(R.string.cb9));
            mo78107a(spannableStringBuilder, (BaseNotice) musNotice);
            this.f97129f.setText(spannableStringBuilder);
            this.f97130g.setFollowStatus(this.f97131h.getUser().getFollowStatus());
            if (this.f97133j != null) {
                this.f97133j.mo65173a(this.f97131h.getUser());
            }
        }
    }
}
