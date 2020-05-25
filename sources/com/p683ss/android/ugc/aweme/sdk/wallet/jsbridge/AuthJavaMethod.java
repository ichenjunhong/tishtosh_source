package com.p683ss.android.ugc.aweme.sdk.wallet.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.sdk.webview.p1210b.C19746f;
import com.p683ss.android.ugc.aweme.sdk.IWalletService;
import com.p683ss.android.ugc.aweme.sdk.IWalletService.C41320a;
import com.p683ss.android.ugc.aweme.sdk.Wallet.DEFAULT;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.wallet.jsbridge.AuthJavaMethod */
public class AuthJavaMethod extends C19746f {
    public C10757a jsBridge;

    public AuthJavaMethod(WeakReference<Context> weakReference, C10757a aVar) {
        super(weakReference);
        this.jsBridge = aVar;
    }

    public void call(final C10766h hVar, final JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2;
        if (hVar.f28947d.has("args")) {
            jSONObject2 = hVar.f28947d.getJSONObject("args");
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            hVar.f28951h = false;
            String string = hVar.f28947d.getString("type");
            if (!TextUtils.isEmpty(string)) {
                IWalletService provideWalletService_Monster = DEFAULT.provideWalletService_Monster();
                if (this.mContextRef.get() != null) {
                    provideWalletService_Monster.auth((Context) this.mContextRef.get(), string, jSONObject2.optString("info_str"), new C41320a() {
                        public void onFail(Exception exc) {
                        }

                        public void onSuccess(JSONObject jSONObject) {
                            AuthJavaMethod.this.jsBridge.mo19455a(hVar.f28945b, jSONObject);
                        }
                    });
                }
            }
        }
    }
}
