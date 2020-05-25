package com.p683ss.android.ugc.aweme.familiar.service;

import android.content.Context;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.familiar.service.IFamiliarDependentService */
public interface IFamiliarDependentService {
    boolean canShowProfileGuide();

    void enterProfileDetail(Context context, User user, String str);

    void enterProfileDetailFromRecommendCard(Context context, User user, String str, String str2);

    boolean isTeenagerModeOn();
}
