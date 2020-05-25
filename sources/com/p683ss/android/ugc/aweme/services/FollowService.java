package com.p683ss.android.ugc.aweme.services;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.framework.services.IFollowService;
import com.p683ss.android.ugc.aweme.framework.services.IFollowService.IFollowCallback;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39971i;
import com.p683ss.android.ugc.aweme.profile.presenter.C39979m;

/* renamed from: com.ss.android.ugc.aweme.services.FollowService */
public class FollowService implements IFollowService {
    public static IFollowService createIFollowServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IFollowService.class);
        if (a != null) {
            return (IFollowService) a;
        }
        if (C27991b.f73461aR == null) {
            synchronized (IFollowService.class) {
                if (C27991b.f73461aR == null) {
                    C27991b.f73461aR = new FollowService();
                }
            }
        }
        return (FollowService) C27991b.f73461aR;
    }

    public void sendRequest(String str, String str2, int i, IFollowCallback iFollowCallback) {
        sendRequest(str, str2, i, 0, iFollowCallback);
    }

    public void sendRequest(String str, String str2, int i, int i2, final IFollowCallback iFollowCallback) {
        C39971i iVar = new C39971i();
        iVar.mo66349a(new C39970a().mo81871a(str).mo81874b(str2).mo81869a(i).mo81873b(i2).mo81872a());
        iVar.mo54800a(new C39979m() {
            public void onFollowFail(Exception exc) {
                if (iFollowCallback != null) {
                    iFollowCallback.onFollowFailed(exc);
                }
            }

            public void onFollowSuccess(FollowStatus followStatus) {
                if (iFollowCallback != null) {
                    iFollowCallback.onFollowSuccess();
                }
            }
        });
    }
}
