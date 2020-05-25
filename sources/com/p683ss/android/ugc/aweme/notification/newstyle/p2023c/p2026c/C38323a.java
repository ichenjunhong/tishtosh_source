package com.p683ss.android.ugc.aweme.notification.newstyle.p2023c.p2026c;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.commercialize.log.C26052as;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c.c.a */
public final class C38323a extends C1352v implements OnClickListener, C9382a {

    /* renamed from: a */
    private Activity f97542a;

    /* renamed from: b */
    private User f97543b;

    /* renamed from: c */
    private C9381g f97544c = new C9381g(this);

    /* renamed from: d */
    private AvatarImageWithVerify f97545d;

    /* renamed from: e */
    private TextView f97546e;

    /* renamed from: f */
    private TextView f97547f;

    /* renamed from: g */
    private ImageView f97548g;

    /* renamed from: h */
    private ImageView f97549h;

    /* renamed from: i */
    private ViewGroup f97550i;

    /* renamed from: j */
    private C38324a f97551j;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c.c.a$a */
    public interface C38324a {
        /* renamed from: a */
        void mo78231a(User user, int i, int i2);
    }

    public final void handleMsg(Message message) {
    }

    /* renamed from: a */
    public final void mo78277a(User user) {
        String str;
        if (user != null) {
            this.f97543b = user;
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.f97545d.setUserData(userVerify);
            this.f97546e.setText(this.f97543b.getNickname());
            this.f97545d.mo48964b();
            C47916gh.m103675a(this.itemView.getContext(), this.f97543b.getCustomVerify(), this.f97543b.getEnterpriseVerifyReason(), this.f97546e);
            TextView textView = this.f97547f;
            StringBuilder sb = new StringBuilder("@");
            if (TextUtils.isEmpty(this.f97543b.getUniqueId())) {
                str = user.getShortId();
            } else {
                str = user.getUniqueId();
            }
            sb.append(str);
            textView.setText(sb.toString());
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C38325b.m85621a(C11010c.m22280a())) {
            C10691a.m21542b((Context) this.f97542a, (int) R.string.cg1).mo19066a();
            return;
        }
        int id = view.getId();
        if (id == R.id.avb) {
            if (this.f97551j != null) {
                this.f97551j.mo78231a(this.f97543b, getAdapterPosition(), 1);
            }
            C23566n.m57766a().mo48750a(this.f97544c, new Callable(this.f97543b.getUid()) {

                /* renamed from: a */
                final /* synthetic */ String f97268a;

                public final Object call() throws Exception {
                    try {
                        return FollowRequestApiManager.f97267a.approveRequest(this.f97268a).get();
                    } catch (ExecutionException e) {
                        throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
                    }
                }

                {
                    this.f97268a = r1;
                }
            }, 1);
            C26052as.m63104a().sendFollowApproveEvent("message", this.f97543b.getUid());
        } else if (id == R.id.ax2) {
            if (this.f97551j != null) {
                this.f97551j.mo78231a(this.f97543b, getAdapterPosition(), 2);
            }
            C23566n.m57766a().mo48750a(this.f97544c, new Callable(this.f97543b.getUid()) {

                /* renamed from: a */
                final /* synthetic */ String f97269a;

                public final Object call() throws Exception {
                    try {
                        return FollowRequestApiManager.f97267a.rejectRequest(this.f97269a).get();
                    } catch (ExecutionException e) {
                        throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
                    }
                }

                {
                    this.f97269a = r1;
                }
            }, 2);
            C26052as.m63104a().sendFollowRefuseEvent("message", this.f97543b.getUid());
        } else if (id == R.id.avl) {
            C41302w a = C41302w.m91042a();
            Activity activity = this.f97542a;
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(this.f97543b.getUid());
            a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83870a("sec_user_id", this.f97543b.getSecUid()).mo83871a());
            C26052as.m63104a().sendEnterPersonalDetailEvent("message", this.f97543b.getUid(), "click_head");
        } else if (id == R.id.aw5 || id == R.id.avn) {
            C41302w a2 = C41302w.m91042a();
            Activity activity2 = this.f97542a;
            StringBuilder sb2 = new StringBuilder("aweme://user/profile/");
            sb2.append(this.f97543b.getUid());
            a2.mo83858a(activity2, C41311y.m91065a(sb2.toString()).mo83870a("sec_user_id", this.f97543b.getSecUid()).mo83871a());
            C26052as.m63104a().sendEnterPersonalDetailEvent("message", this.f97543b.getUid(), "click_name");
        } else {
            if (id == R.id.ax3) {
                C41302w a3 = C41302w.m91042a();
                Activity activity3 = this.f97542a;
                StringBuilder sb3 = new StringBuilder("aweme://user/profile/");
                sb3.append(this.f97543b.getUid());
                a3.mo83858a(activity3, C41311y.m91065a(sb3.toString()).mo83870a("sec_user_id", this.f97543b.getSecUid()).mo83871a());
                C26052as.m63104a().sendEnterPersonalDetailEvent("message", this.f97543b.getUid(), "click_card");
            }
        }
    }

    public C38323a(View view, Activity activity, C38324a aVar) {
        super(view);
        this.f97542a = activity;
        this.f97550i = (ViewGroup) view.findViewById(R.id.ax3);
        this.f97545d = (AvatarImageWithVerify) view.findViewById(R.id.avl);
        this.f97546e = (TextView) view.findViewById(R.id.aw5);
        this.f97547f = (TextView) view.findViewById(R.id.avn);
        this.f97548g = (ImageView) view.findViewById(R.id.avb);
        this.f97549h = (ImageView) view.findViewById(R.id.ax2);
        this.f97551j = aVar;
        C38446k.m85764a(this.f97550i);
        C38446k.m85764a(this.f97548g);
        C38446k.m85764a(this.f97549h);
        this.f97545d.setOnClickListener(this);
        this.f97546e.setOnClickListener(this);
        this.f97547f.setOnClickListener(this);
        this.f97550i.setOnClickListener(this);
        this.f97548g.setOnClickListener(this);
        this.f97549h.setOnClickListener(this);
    }
}
