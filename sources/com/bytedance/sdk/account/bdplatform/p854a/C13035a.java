package com.bytedance.sdk.account.bdplatform.p854a;

import com.bytedance.sdk.account.bdplatform.p855b.C13042a;
import com.bytedance.sdk.account.bdplatform.p855b.C13043b;
import com.bytedance.sdk.account.bdplatform.p855b.C13048e;
import com.bytedance.sdk.account.p849b.p852c.C13029c.C13030a;
import com.bytedance.sdk.account.p849b.p852c.C13029c.C13031b;

/* renamed from: com.bytedance.sdk.account.bdplatform.a.a */
public interface C13035a {

    /* renamed from: com.bytedance.sdk.account.bdplatform.a.a$a */
    public interface C13036a {
        /* renamed from: a */
        C13042a mo24681a(C13030a aVar, String str);

        /* renamed from: a */
        C13043b mo24682a(C13030a aVar);

        /* renamed from: b */
        C13048e mo24683b(C13030a aVar);
    }

    /* renamed from: com.bytedance.sdk.account.bdplatform.a.a$b */
    public interface C13037b {
        /* renamed from: a */
        void mo24684a();

        /* renamed from: a */
        boolean mo24685a(int i, String str);

        /* renamed from: a */
        boolean mo24686a(C13030a aVar);

        /* renamed from: b */
        boolean mo24687b(C13030a aVar);
    }

    /* renamed from: com.bytedance.sdk.account.bdplatform.a.a$c */
    public interface C13038c {
        void dismissLoadingDialog();

        String getAuthLoadingText();

        String getInitLoadingText();

        void onAuthLogin(C13043b bVar);

        void onCancel(C13031b bVar);

        void onError(C13031b bVar);

        void onLogEvent(String str, String str2, int i, String str3);

        void onNeedLogin();

        void onSuccess(C13031b bVar);

        void showLoadingDialog(String str);

        void updateLoginStatus();
    }
}
