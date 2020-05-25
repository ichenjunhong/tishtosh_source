package com.p683ss.android.ugc.aweme.profile.presenter;

import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.p1270c.C20940a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1373d.C23064c;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32772s;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.userservice.C47588a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.i */
public final class C39971i extends C20940a<C26832a<FollowStatus>, C39979m> implements C32772s {

    /* renamed from: a */
    public int f101909a = -1;

    /* renamed from: b */
    public String f101910b;

    public C39971i() {
        mo54799a(new C26832a<FollowStatus>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 10) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                C39971i.this.f101910b = objArr[0];
                C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
                    public final Object call() throws Exception {
                        FollowStatus followStatus;
                        Aweme aweme = (Aweme) objArr[5];
                        String str = (String) objArr[6];
                        C39971i.this.f101909a = ((Integer) objArr[1]).intValue();
                        try {
                            String str2 = (String) objArr[3];
                            if (objArr.length >= 10) {
                                followStatus = C47588a.m103036c().mo94910a((String) objArr[0], (String) objArr[8], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), C23064c.m56602a(str2), (String) objArr[4], ((Integer) objArr[7]).intValue(), C30228f.m70983g());
                                if (followStatus != null) {
                                    followStatus.followerStatus = ((Integer) objArr[9]).intValue();
                                }
                            } else {
                                followStatus = C47588a.m103036c().mo94910a((String) objArr[0], C47865ew.m103536a().mo95083c((String) objArr[0]), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), C23064c.m56602a(str2), (String) objArr[4], ((Integer) objArr[7]).intValue(), C30228f.m70983g());
                            }
                            C399721.m88781a(((Integer) objArr[1]).intValue(), aweme, str, followStatus);
                            return followStatus;
                        } catch (C23459a e) {
                            if (e.getErrorCode() == 2149 && C26503d.m64065h(aweme)) {
                                C399721.m88781a(((Integer) objArr[1]).intValue(), aweme, str, new FollowStatus((String) objArr[0], 0, e.getErrorCode()));
                            }
                            throw e;
                        }
                    }
                }, 0);
                return true;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
                if (r5.equals("homepage") != false) goto L_0x0030;
             */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static void m88781a(int r3, com.p683ss.android.ugc.aweme.feed.model.Aweme r4, java.lang.String r5, com.p683ss.android.ugc.aweme.profile.model.FollowStatus r6) {
                /*
                    if (r5 == 0) goto L_0x004d
                    r0 = 1
                    if (r3 != r0) goto L_0x004d
                    boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64065h(r4)
                    if (r3 != 0) goto L_0x000c
                    goto L_0x004d
                L_0x000c:
                    r3 = -1
                    int r1 = r5.hashCode()
                    r2 = -485371922(0xffffffffe311cfee, float:-2.6897608E21)
                    if (r1 == r2) goto L_0x0026
                    r0 = 3138974(0x2fe59e, float:4.39864E-39)
                    if (r1 == r0) goto L_0x001c
                    goto L_0x002f
                L_0x001c:
                    java.lang.String r0 = "feed"
                    boolean r5 = r5.equals(r0)
                    if (r5 == 0) goto L_0x002f
                    r0 = 0
                    goto L_0x0030
                L_0x0026:
                    java.lang.String r1 = "homepage"
                    boolean r5 = r5.equals(r1)
                    if (r5 == 0) goto L_0x002f
                    goto L_0x0030
                L_0x002f:
                    r0 = -1
                L_0x0030:
                    switch(r0) {
                        case 0: goto L_0x0040;
                        case 1: goto L_0x0034;
                        default: goto L_0x0033;
                    }
                L_0x0033:
                    goto L_0x004c
                L_0x0034:
                    com.ss.android.ugc.aweme.commercialize.feed.an r3 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
                    android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                    r3.mo53133b(r5, r4, r6)
                    goto L_0x004c
                L_0x0040:
                    com.ss.android.ugc.aweme.commercialize.feed.an r3 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
                    android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                    r3.mo53120a(r5, r4, r6)
                    return
                L_0x004c:
                    return
                L_0x004d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.presenter.C39971i.C399721.m88781a(int, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, com.ss.android.ugc.aweme.profile.model.FollowStatus):void");
            }
        });
    }

    /* renamed from: b */
    public final void mo44838b() {
        FollowStatus followStatus;
        if (this.f70700f == null) {
            followStatus = null;
        } else {
            followStatus = (FollowStatus) this.f70700f.getData();
        }
        if (followStatus != null && followStatus.followStatus == 1) {
            MainServiceImpl.createIMainServicebyMonsterPlugin().trackAppsFlyerEvent("mus_af_follow", followStatus.userId);
        }
        if (followStatus != null) {
            if (this.f70701g != null) {
                ((C39979m) this.f70701g).onFollowSuccess(followStatus);
                C47718bf.m103288a(followStatus);
                C47588a.m103036c().mo94911b().postValue(followStatus);
            }
            User user = new User();
            user.setUid(followStatus.userId);
            user.setSecUid(followStatus.secUserId);
            user.setFollowStatus(followStatus.followStatus);
            user.setFollowerStatus(followStatus.followerStatus);
            C23794bh.m58394h().mo70342a(user);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo66348a(C39979m mVar) {
        super.mo54800a(mVar);
    }

    /* renamed from: a_ */
    public final boolean mo44934a_(Object... objArr) {
        return super.mo44934a_(objArr);
    }

    /* renamed from: a */
    public final boolean mo66349a(C39969h hVar) {
        if (hVar != null) {
            if (super.mo44934a_(hVar.f101898a, Integer.valueOf(hVar.f101900c), Integer.valueOf(hVar.f101901d), hVar.f101903f, hVar.f101904g, hVar.f101905h, hVar.f101906i, Integer.valueOf(hVar.f101902e), hVar.f101899b, Integer.valueOf(hVar.f101907j))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70701g != null) {
            if (C22971a.m56489a(exc) != null) {
                if (this.f101909a == 1) {
                    C31300c.m73020d().mo64183a("follow_user", String.valueOf(C22971a.m56489a(exc).getErrorCode()));
                } else if (this.f101909a == 0) {
                    C31300c.m73020d().mo64183a("unfollow_user", String.valueOf(C22971a.m56489a(exc).getErrorCode()));
                }
            }
            ((C39979m) this.f70701g).onFollowFail(exc);
            String str = this.f101910b;
            FollowStatus followStatus = new FollowStatus();
            followStatus.userId = str;
            followStatus.followStatus = 0;
            followStatus.isFollowSucess = false;
            C47718bf.m103288a(followStatus);
            C47588a.m103036c().mo94911b().postValue(followStatus);
        }
    }
}
