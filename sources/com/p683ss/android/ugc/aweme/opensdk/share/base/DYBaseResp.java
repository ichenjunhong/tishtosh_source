package com.p683ss.android.ugc.aweme.opensdk.share.base;

import android.os.Bundle;
import com.bytedance.sdk.account.p849b.p852c.C13028b;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.base.DYBaseResp */
public abstract class DYBaseResp extends C13028b {
    public int errorCode;
    public String errorMsg;
    public Bundle extras;

    public boolean checkArgs() {
        return true;
    }

    public abstract int getType();

    public boolean isSuccess() {
        if (this.errorCode == 20000) {
            return true;
        }
        return false;
    }

    public void fromBundle(Bundle bundle) {
        this.errorCode = bundle.getInt("_aweme_open_sdk_params_error_code");
        this.errorMsg = bundle.getString("_aweme_open_sdk_params_error_msg");
        this.extras = bundle.getBundle("_bytedance_params_extra");
    }

    public void toBundle(Bundle bundle) {
        bundle.putInt("_aweme_open_sdk_params_error_code", this.errorCode);
        bundle.putString("_aweme_open_sdk_params_error_msg", this.errorMsg);
        bundle.putInt("_aweme_open_sdk_params_type", getType());
        bundle.putBundle("_bytedance_params_extra", this.extras);
    }
}
