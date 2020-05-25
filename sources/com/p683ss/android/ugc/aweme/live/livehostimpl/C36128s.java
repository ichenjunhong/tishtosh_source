package com.p683ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.depend.p440h.C8636a;
import com.bytedance.android.livesdkapi.depend.p440h.C8637b;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.p453c.C8798a;
import com.bytedance.android.livesdkapi.host.p453c.C8799b;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.p1411c.C23484c;
import com.p683ss.android.ugc.aweme.base.p1411c.C23489h;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.s */
public final class C36128s implements IHostUser {

    /* renamed from: a */
    private C36131b f92532a;

    /* renamed from: b */
    private C36130a f92533b;

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.s$a */
    public static final class C36130a {

        /* renamed from: a */
        public C8636a f92534a;

        private C36130a() {
        }

        @C53771m
        public final void onEvent(C24530d dVar) {
            if (this.f92534a != null && (dVar.f64952b instanceof User)) {
                C8686a aVar = new C8686a();
                aVar.f23736e = dVar.f64951a;
                String uid = ((User) dVar.f64952b).getUid();
                if (uid != null) {
                    aVar.f23732a = Long.parseLong(uid);
                }
                this.f92534a.mo14560a(aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.s$b */
    public static final class C36131b implements C8637b {

        /* renamed from: a */
        public C8637b f92535a;

        private C36131b() {
        }

        @C53771m
        public final void onEvent(C23489h hVar) {
            mo14559a(false);
        }

        /* renamed from: a */
        public final void mo14559a(boolean z) {
            if (this.f92535a != null) {
                this.f92535a.mo14559a(z);
            }
        }

        @C53771m
        public final void onEvent(C23484c cVar) {
            mo14559a(BaseUserService.getBaseUserService_Monster().isLogin());
        }
    }

    public final boolean interceptOperation(String str) {
        return false;
    }

    public final void markAsOutOfDate(boolean z) {
    }

    public final void setRoomAttrsAdminFlag(int i) {
    }

    public final void updateUser(C3009i iVar) {
    }

    public final C3009i getCurUser() {
        return C36113h.m81505a(BaseUserService.getBaseUserService_Monster().getCurrentUser());
    }

    public final long getCurUserId() {
        return Long.parseLong(BaseUserService.getBaseUserService_Monster().getCurrentUserID());
    }

    public final boolean isLogin() {
        return BaseUserService.getBaseUserService_Monster().isLogin();
    }

    public final void unRegisterCurrentUserUpdateListener(C8637b bVar) {
        if (this.f92532a != null) {
            C36131b bVar2 = this.f92532a;
            C47718bf.m103291d(bVar2);
            bVar2.f92535a = null;
        }
    }

    public final void unRegisterFollowStatusListener(C8636a aVar) {
        if (this.f92533b != null) {
            C36130a aVar2 = this.f92533b;
            C47718bf.m103291d(aVar2);
            aVar2.f92534a = null;
        }
    }

    public final void registerCurrentUserUpdateListener(C8637b bVar) {
        if (this.f92532a == null) {
            this.f92532a = new C36131b();
        }
        this.f92532a.f92535a = bVar;
        C47718bf.m103290c(this.f92532a);
    }

    public final void registerFollowStatusListener(C8636a aVar) {
        if (this.f92533b == null) {
            this.f92533b = new C36130a();
        }
        this.f92533b.f92534a = aVar;
        C47718bf.m103290c(this.f92533b);
    }

    public final void onFollowStatusChanged(int i, long j) {
        FollowStatus followStatus = new FollowStatus();
        followStatus.userId = String.valueOf(j);
        followStatus.followStatus = i;
        C47718bf.m103288a(followStatus);
    }

    public final void unFollowWithConfirm(Activity activity, int i, long j, C8799b bVar) {
        bVar.mo14556a();
    }

    public final void login(FragmentActivity fragmentActivity, C8798a aVar, String str, String str2, int i, String str3, String str4, String str5) {
        C27965f.m66721a((Activity) fragmentActivity, str4, "live_room", (Bundle) null, (C23505g) new C36132t(aVar));
    }
}
