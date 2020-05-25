package com.p683ss.android.ugc.aweme.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.p683ss.android.ugc.aweme.sdk.bean.C41338c;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.sdk.IWalletService */
public interface IWalletService {

    /* renamed from: com.ss.android.ugc.aweme.sdk.IWalletService$a */
    public interface C41320a {
        void onFail(Exception exc);

        void onSuccess(JSONObject jSONObject);
    }

    void auth(Context context, String str, String str2, C41320a aVar);

    Map<String, C10762d> buildJavaMethods(WeakReference<Context> weakReference, C10757a aVar);

    void cashOut(Context context, String str);

    void clearWallet();

    long getAvailableCurrency();

    void init(WeakReference<Context> weakReference, C10757a aVar);

    void onWxIntent(Context context, Intent intent);

    void openWallet(Activity activity);

    void openWallet(Activity activity, String str);

    boolean pay(String str, JSONObject jSONObject, C41320a aVar);

    void setSetting(C41338c cVar);

    C0013i<Long> syncWallet();

    void syncWallet(long j);
}
