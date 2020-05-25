package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.commercialize.log.C26052as;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38252c;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38252c.C38253a;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.ConcurrentHashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.b */
public final class C38370b extends C38383h implements OnClickListener {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f97634d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38370b.class), "mRoot", "getMRoot()Landroid/support/constraint/ConstraintLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38370b.class), "mAiHead", "getMAiHead()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38370b.class), "mTvName", "getMTvName()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38370b.class), "mTvContent", "getMTvContent()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38370b.class), "mFollow", "getMFollow()Lcom/ss/android/ugc/aweme/notification/view/NotificationFollowUserBtn;"))};

    /* renamed from: e */
    public C31980a f97635e;

    /* renamed from: f */
    public User f97636f;

    /* renamed from: g */
    public final String f97637g;

    /* renamed from: m */
    private final C52668f f97638m;

    /* renamed from: n */
    private final C52668f f97639n;

    /* renamed from: o */
    private final C52668f f97640o;

    /* renamed from: p */
    private final C52668f f97641p;

    /* renamed from: q */
    private final C52668f f97642q;

    /* renamed from: r */
    private final ConcurrentHashMap<String, Boolean> f97643r = new ConcurrentHashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.b$a */
    static final class C38372a extends C52712l implements C52670a<AvatarImageWithVerify> {

        /* renamed from: a */
        final /* synthetic */ View f97645a;

        C38372a(View view) {
            this.f97645a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (AvatarImageWithVerify) this.f97645a.findViewById(R.id.bt7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.b$b */
    static final class C38373b extends C52712l implements C52670a<NotificationFollowUserBtn> {

        /* renamed from: a */
        final /* synthetic */ View f97646a;

        C38373b(View view) {
            this.f97646a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (NotificationFollowUserBtn) this.f97646a.findViewById(R.id.bsz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.b$c */
    static final class C38374c extends C52712l implements C52670a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ View f97647a;

        C38374c(View view) {
            this.f97647a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ConstraintLayout) this.f97647a.findViewById(R.id.bu1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.b$d */
    static final class C38375d extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f97648a;

        C38375d(View view) {
            this.f97648a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f97648a.findViewById(R.id.bsc);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.b$e */
    static final class C38376e extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f97649a;

        C38376e(View view) {
            this.f97649a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f97649a.findViewById(R.id.bto);
        }
    }

    /* renamed from: i */
    private final ConstraintLayout m85663i() {
        return (ConstraintLayout) this.f97638m.getValue();
    }

    /* renamed from: d */
    public final AvatarImageWithVerify mo78297d() {
        return (AvatarImageWithVerify) this.f97639n.getValue();
    }

    /* renamed from: e */
    public final DmtTextView mo78298e() {
        return (DmtTextView) this.f97640o.getValue();
    }

    /* renamed from: f */
    public final DmtTextView mo78299f() {
        return (DmtTextView) this.f97641p.getValue();
    }

    /* renamed from: g */
    public final NotificationFollowUserBtn mo78300g() {
        return (NotificationFollowUserBtn) this.f97642q.getValue();
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C52711k.m112240b(view, "v");
        if (!C38377c.m85670a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        User user = this.f97636f;
        if (user != null) {
            int id = view.getId();
            if (id == R.id.bsz || id == R.id.ns) {
                C31980a aVar = this.f97635e;
                if (aVar != null) {
                    aVar.mo65174a(user.getUid(), user.getSecUid(), user.getFollowStatus(), user.getFollowerStatus());
                }
            } else {
                if (id == R.id.bu1) {
                    String uid = user.getUid();
                    C52711k.m112236a((Object) uid, "uid");
                    String secUid = user.getSecUid();
                    C52711k.m112236a((Object) secUid, "secUid");
                    C38383h.m85681a((C38383h) this, uid, secUid, (BaseNotice) null, false, this.f97637g, 12, (Object) null);
                    C38253a aVar2 = C38252c.f97362e;
                    C38253a.m85449a(getAdapterPosition(), "click");
                }
            }
        }
    }

    public C38370b(View view) {
        String str;
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f97638m = C52732g.m112285a(new C38374c(view));
        this.f97639n = C52732g.m112285a(new C38372a(view));
        this.f97640o = C52732g.m112285a(new C38376e(view));
        this.f97641p = C52732g.m112285a(new C38375d(view));
        this.f97642q = C52732g.m112285a(new C38373b(view));
        if (MTNotificationTabMergeExperiment.m85061a()) {
            str = "notification_page";
        } else {
            str = "message_like";
        }
        this.f97637g = str;
        ConstraintLayout i = m85663i();
        C52711k.m112236a((Object) i, "mRoot");
        C38415g.m85729b(i);
        C38432d.m85745a((View) mo78300g());
        OnClickListener onClickListener = this;
        m85663i().setOnClickListener(onClickListener);
        mo78300g().setOnClickListener(onClickListener);
        this.f97635e = new C31980a(mo78300g(), new C31988e(this) {

            /* renamed from: a */
            final /* synthetic */ C38370b f97644a;

            /* renamed from: a */
            public final String mo56221a() {
                return this.f97644a.f97637g;
            }

            {
                this.f97644a = r1;
            }

            /* renamed from: a */
            public final void mo49741a(int i, User user) {
                String str;
                super.mo49741a(i, user);
                if (user != null) {
                    if (i == 0) {
                        str = "follow_cancel";
                    } else {
                        str = "follow";
                    }
                    C26052as.m63104a().logFollowUserEvent(str, this.f97644a.f97637g, user.getUid());
                }
            }
        });
    }
}
