package com.p683ss.android.ugc.aweme.sdk.wallet.module.withdraw;

import android.app.Activity;
import android.content.Context;
import com.alipay.sdk.app.AuthTask;
import com.p683ss.android.ugc.aweme.sdk.IWalletService.C41320a;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.sdk.wallet.module.withdraw.AliPayAuth */
public class AliPayAuth implements IAuth {
    private int checkAuthResult(String str) throws Exception {
        return AliPayApiImpl.checkBindResult(1, 0, str).status_code;
    }

    static final /* synthetic */ Void lambda$auth$1$AliPayAuth(C41320a aVar, C0013i iVar) throws Exception {
        if (iVar.mo26b()) {
            aVar.onSuccess((JSONObject) iVar.mo34e());
        } else {
            aVar.onFail(iVar.mo35f());
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ JSONObject lambda$auth$0$AliPayAuth(Activity activity, String str) throws Exception {
        int checkAuthResult = checkAuthResult(new AuthTask(activity).auth(str, true));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("auth_result", checkAuthResult);
        return jSONObject;
    }

    public void auth(Context context, String str, C41320a aVar) {
        Activity activity;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity == null) {
            aVar.onFail(new Exception("context is null"));
        } else {
            C0013i.m16a((Callable<TResult>) new AliPayAuth$$Lambda$0<TResult>(this, activity, str)).mo19a((C0011g<TResult, TContinuationResult>) new AliPayAuth$$Lambda$1<TResult,TContinuationResult>(aVar));
        }
    }
}
