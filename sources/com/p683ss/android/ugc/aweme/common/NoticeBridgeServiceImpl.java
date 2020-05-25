package com.p683ss.android.ugc.aweme.common;

import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IAddFriendsActivity;
import com.p683ss.android.ugc.aweme.notice.api.services.NoticeBridgeService;

/* renamed from: com.ss.android.ugc.aweme.common.NoticeBridgeServiceImpl */
public class NoticeBridgeServiceImpl implements NoticeBridgeService {
    public Intent getAddFriendsActivityIntent(Context context, int i, int i2, String str, String str2) {
        return IAddFriendsActivity.m75443a(context, i, i2, str);
    }
}
