package com.p683ss.android.ugc.aweme.followrequest.p1771a;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.support.p043v7.widget.RecyclerView.C1352v;
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
import com.p683ss.android.ugc.aweme.followrequest.C32373c;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.followrequest.a.c */
public final class C32365c extends C1352v implements OnClickListener, C9382a {

    /* renamed from: a */
    Activity f84242a;

    /* renamed from: b */
    User f84243b;

    /* renamed from: c */
    AvatarImageWithVerify f84244c;

    /* renamed from: d */
    TextView f84245d;

    /* renamed from: e */
    TextView f84246e;

    /* renamed from: f */
    private C9381g f84247f = new C9381g(this);

    /* renamed from: g */
    private ImageView f84248g;

    /* renamed from: h */
    private ImageView f84249h;

    /* renamed from: i */
    private ViewGroup f84250i;

    /* renamed from: j */
    private C32366a f84251j;

    /* renamed from: com.ss.android.ugc.aweme.followrequest.a.c$a */
    public interface C32366a {
        /* renamed from: a */
        void mo65493a(User user, int i, int i2);
    }

    public final void handleMsg(Message message) {
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C32367d.m74703a(C11010c.m22280a())) {
            C10691a.m21542b((Context) this.f84242a, (int) R.string.cg1).mo19066a();
            return;
        }
        int id = view.getId();
        if (id == R.id.avb) {
            if (this.f84251j != null) {
                this.f84251j.mo65493a(this.f84243b, getAdapterPosition(), 1);
            }
            C23566n.m57766a().mo48750a(this.f84247f, new Callable(this.f84243b.getUid()) {

                /* renamed from: a */
                final /* synthetic */ String f84254a;

                public final Object call() throws Exception {
                    try {
                        return FollowRequestApiManager.f84253b.approveRequest(this.f84254a).get();
                    } catch (ExecutionException e) {
                        throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
                    }
                }

                {
                    this.f84254a = r1;
                }
            }, 1);
            C23196ad.m56841a("follow_approve").mo47957b("enter_from", "message").mo47957b("to_user_id", this.f84243b.getUid()).mo48076e();
        } else if (id == R.id.ax2) {
            if (this.f84251j != null) {
                this.f84251j.mo65493a(this.f84243b, getAdapterPosition(), 2);
            }
            C23566n.m57766a().mo48750a(this.f84247f, new Callable(this.f84243b.getUid()) {

                /* renamed from: a */
                final /* synthetic */ String f84255a;

                public final Object call() throws Exception {
                    try {
                        return FollowRequestApiManager.f84253b.rejectRequest(this.f84255a).get();
                    } catch (ExecutionException e) {
                        throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
                    }
                }

                {
                    this.f84255a = r1;
                }
            }, 2);
            C23196ad.m56841a("follow_refuse").mo47957b("enter_from", "message").mo47957b("to_user_id", this.f84243b.getUid()).mo47958g().mo48076e();
        } else if (id == R.id.avl) {
            C41302w a = C41302w.m91042a();
            Activity activity = this.f84242a;
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(this.f84243b.getUid());
            a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83870a("sec_user_id", this.f84243b.getSecUid()).mo83871a());
            C32373c.m74718a("message", this.f84243b.getUid(), "click_head");
        } else if (id == R.id.aw5 || id == R.id.avn) {
            C41302w a2 = C41302w.m91042a();
            Activity activity2 = this.f84242a;
            StringBuilder sb2 = new StringBuilder("aweme://user/profile/");
            sb2.append(this.f84243b.getUid());
            a2.mo83858a(activity2, C41311y.m91065a(sb2.toString()).mo83870a("sec_user_id", this.f84243b.getSecUid()).mo83871a());
            C32373c.m74718a("message", this.f84243b.getUid(), "click_name");
        } else {
            if (id == R.id.ax3) {
                C41302w a3 = C41302w.m91042a();
                Activity activity3 = this.f84242a;
                StringBuilder sb3 = new StringBuilder("aweme://user/profile/");
                sb3.append(this.f84243b.getUid());
                a3.mo83858a(activity3, C41311y.m91065a(sb3.toString()).mo83870a("sec_user_id", this.f84243b.getSecUid()).mo83871a());
                C32373c.m74718a("message", this.f84243b.getUid(), "click_card");
            }
        }
    }

    public C32365c(View view, Activity activity, C32366a aVar) {
        super(view);
        this.f84242a = activity;
        this.f84250i = (ViewGroup) view.findViewById(R.id.ax3);
        this.f84244c = (AvatarImageWithVerify) view.findViewById(R.id.avl);
        this.f84245d = (TextView) view.findViewById(R.id.aw5);
        this.f84246e = (TextView) view.findViewById(R.id.avn);
        this.f84248g = (ImageView) view.findViewById(R.id.avb);
        this.f84249h = (ImageView) view.findViewById(R.id.ax2);
        this.f84251j = aVar;
        C38446k.m85764a(this.f84250i);
        C38446k.m85764a(this.f84248g);
        C38446k.m85764a(this.f84249h);
        this.f84244c.setOnClickListener(this);
        this.f84245d.setOnClickListener(this);
        this.f84246e.setOnClickListener(this);
        this.f84250i.setOnClickListener(this);
        this.f84248g.setOnClickListener(this);
        this.f84249h.setOnClickListener(this);
    }
}
