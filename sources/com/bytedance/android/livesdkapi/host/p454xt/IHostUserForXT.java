package com.bytedance.android.livesdkapi.host.p454xt;

import android.app.Activity;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.livesdkapi.depend.p440h.C8636a;
import com.bytedance.android.livesdkapi.depend.p440h.C8637b;
import com.bytedance.android.livesdkapi.host.p451a.C8788k;
import com.bytedance.android.livesdkapi.host.p453c.C8798a;
import com.bytedance.android.livesdkapi.host.p453c.C8799b;

/* renamed from: com.bytedance.android.livesdkapi.host.xt.IHostUserForXT */
public interface IHostUserForXT extends C2952b, C8788k {
    public static final int FROM_FOLLOW = 1;
    public static final int FROM_LIVE_COMMENT_PROMOTION = 18;
    public static final int FROM_REDPACKET = 5;
    public static final int MESSAGE_NICKNAME_DUPLICATE = 20014;
    public static final int MESSAGE_NICKNAME_DUPLICATE_2 = 20041;

    C3009i getCurUser();

    long getCurUserId();

    boolean isLogin();

    void login(FragmentActivity fragmentActivity, C8798a aVar, String str, String str2, int i, String str3, String str4, String str5);

    void registerCurrentUserUpdateListener(C8637b bVar);

    void registerFollowStatusListener(C8636a aVar);

    void unFollowWithConfirm(Activity activity, int i, long j, C8799b bVar);

    void unRegisterCurrentUserUpdateListener(C8637b bVar);

    void unRegisterFollowStatusListener(C8636a aVar);

    void updateUser(C3009i iVar);
}
