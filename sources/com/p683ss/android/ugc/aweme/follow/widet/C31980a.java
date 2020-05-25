package com.p683ss.android.ugc.aweme.follow.widet;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.C32259b;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32772s;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.p1807im.C33180c;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39979m;
import com.p683ss.android.ugc.aweme.userservice.C47588a;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.follow.widet.a */
public final class C31980a implements C0199s<FollowStatus> {

    /* renamed from: a */
    public FragmentActivity f83486a;

    /* renamed from: b */
    public C31986c f83487b;

    /* renamed from: c */
    public C31984a f83488c;

    /* renamed from: d */
    public C31985b f83489d;

    /* renamed from: e */
    public C31987d f83490e;

    /* renamed from: f */
    private C32259b f83491f;

    /* renamed from: g */
    private User f83492g;

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$a */
    public interface C31984a {
        /* renamed from: a */
        void mo56224a(FollowStatus followStatus);
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$b */
    public interface C31985b {
        /* renamed from: a */
        void mo65177a(FollowStatus followStatus);

        /* renamed from: a */
        void mo65178a(Exception exc);
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$c */
    public interface C31986c {
        /* renamed from: a */
        String mo56221a();

        /* renamed from: a */
        void mo49741a(int i, User user);

        /* renamed from: b */
        String mo56222b();

        /* renamed from: c */
        int mo56223c();
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$d */
    public interface C31987d {
        /* renamed from: a */
        void mo56300a();
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$e */
    public static class C31988e implements C31986c {
        /* renamed from: a */
        public String mo56221a() {
            return "";
        }

        /* renamed from: a */
        public void mo49741a(int i, User user) {
        }

        /* renamed from: b */
        public String mo56222b() {
            return "";
        }

        /* renamed from: c */
        public int mo56223c() {
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo65175b(User user) {
        boolean z;
        C33180c h = C23794bh.m58394h();
        FragmentActivity fragmentActivity = this.f83486a;
        if (user.getFollowStatus() == 2) {
            z = true;
        } else {
            z = false;
        }
        h.mo70340a(fragmentActivity, 2, z, new C31989b(this, user));
    }

    public final /* synthetic */ void onChanged(Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        if (followStatus != null && TextUtils.equals(followStatus.userId, this.f83492g.getUid())) {
            this.f83492g.setFollowStatus(followStatus.followStatus);
            C32259b bVar = this.f83491f;
            int i = followStatus.followStatus;
            int i2 = 1;
            if (this.f83492g.getFollowerStatus() != 1) {
                i2 = 0;
            }
            bVar.mo65360a(i, i2);
            if (this.f83488c != null) {
                this.f83488c.mo56224a(followStatus);
            }
            if (this.f83489d != null) {
                this.f83489d.mo65177a(followStatus);
            }
        }
    }

    /* renamed from: a */
    public final void mo65173a(final User user) {
        if (this.f83492g != null) {
            C47588a.m103036c().mo94911b().removeObserver(this);
        }
        this.f83492g = user;
        int followStatus = user.getFollowStatus();
        int i = 0;
        if (TextUtils.equals(user.getUid(), C20854a.m53167g().getCurUserId())) {
            C32259b bVar = this.f83491f;
            if (this.f83492g.getFollowerStatus() == 1) {
                i = 1;
            }
            bVar.mo65360a(3, i);
            return;
        }
        C32259b bVar2 = this.f83491f;
        if (this.f83492g.getFollowerStatus() == 1) {
            i = 1;
        }
        bVar2.mo65360a(followStatus, i);
        C47588a.m103036c().mo94911b().observe(this.f83491f.getLifeCycleOwner(), this);
        this.f83491f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C32800a.m75680a(view, 300)) {
                    if (!C31991d.m74384a(C11010c.m22280a())) {
                        C10691a.m21542b(C11010c.m22280a(), (int) R.string.cg1).mo19066a();
                        return;
                    }
                    if (!C20854a.m53167g().isLogin()) {
                        C27965f.m66721a((Activity) C31980a.this.f83486a, C31980a.this.f83487b.mo56221a(), C31980a.this.f83487b.mo56222b(), C47661ab.m103163a().mo94972a("login_title", C31980a.this.f83486a.getResources().getString(R.string.b3y)).f120139a, (C23505g) new C31990c(this, user));
                    } else {
                        C31980a.this.mo65175b(user);
                    }
                    if (C31980a.this.f83490e != null) {
                        C31980a.this.f83490e.mo56300a();
                    }
                }
            }
        });
    }

    public C31980a(C32259b bVar, C31986c cVar) {
        this.f83491f = bVar;
        this.f83486a = (FragmentActivity) C23729p.m58248a(bVar.getContext());
        this.f83487b = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo65172a(int i, User user) {
        int i2;
        if (user.getFollowStatus() == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.f83487b != null) {
            this.f83487b.mo49741a(i2, user);
        }
        mo65174a(user.getUid(), user.getSecUid(), i2, user.getFollowerStatus());
    }

    /* renamed from: a */
    public final void mo65174a(String str, String str2, int i, int i2) {
        String str3;
        int i3;
        final C32772s followPresenter = C32616c.f84865a.getFollowPresenter();
        C39970a a = new C39970a().mo81871a(str).mo81874b(str2).mo81869a(i);
        if (this.f83487b == null) {
            str3 = "";
        } else {
            str3 = this.f83487b.mo56221a();
        }
        C39970a c = a.mo81876c(str3);
        if (this.f83487b == null) {
            i3 = 0;
        } else {
            i3 = this.f83487b.mo56223c();
        }
        followPresenter.mo66349a(c.mo81873b(i3).mo81877d(i2).mo81872a());
        this.f83491f.getLifeCycleOwner().getLifecycle().mo324a(new FollowUserBlock$2(this, followPresenter));
        followPresenter.mo66348a((C39979m) new C39979m() {
            public final void onFollowSuccess(FollowStatus followStatus) {
            }

            public final void onFollowFail(final Exception exc) {
                if (C23794bh.m58389c().mo50264a(exc)) {
                    C23794bh.m58389c().mo50263a(C31980a.this.f83486a.getSupportFragmentManager(), (C23459a) exc, new C24493b() {
                        /* renamed from: a */
                        public final void mo45353a() {
                            followPresenter.mo66351c();
                        }

                        /* renamed from: b */
                        public final void mo45354b() {
                            C22971a.m56494a(C31980a.this.f83486a, exc, R.string.b47);
                        }
                    });
                } else {
                    C22971a.m56494a(C31980a.this.f83486a, exc, R.string.b47);
                }
                if (C31980a.this.f83489d != null) {
                    C31980a.this.f83489d.mo65178a(exc);
                }
            }
        });
    }
}
