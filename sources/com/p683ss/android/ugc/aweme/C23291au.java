package com.p683ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sdk.account.p844a.p846b.C13003d;
import com.p683ss.android.ugc.aweme.IAccountService.C20836c;
import com.p683ss.android.ugc.aweme.account.bean.C20938e;
import com.p683ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import java.util.List;
import p064c.p065a.C1680ad;

/* renamed from: com.ss.android.ugc.aweme.au */
public interface C23291au {
    C1680ad<OneLoginPhoneBean> canShowOneKeyBindHalfScreen(String str);

    List<C20938e> getAllSupportedLoginPlatform();

    String getLoginMobEnterMethod();

    void loginByPlatform(C20836c cVar, C20938e eVar);

    void logout(String str, String str2);

    void openCountryListActivity(Activity activity, C23857bl blVar);

    void openPrivacyPolicy(Activity activity);

    void showLoginAndRegisterView(C20836c cVar);

    void switchAccount(String str, Bundle bundle, C13003d dVar);
}
