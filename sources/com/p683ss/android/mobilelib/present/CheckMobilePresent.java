package com.p683ss.android.mobilelib.present;

import android.content.Context;
import android.os.Message;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.mobilelib.MobileApi.SendCodeQueryObj;
import com.p683ss.android.mobilelib.model.MobileStateModel;
import com.p683ss.android.mobilelib.view.CheckMobileView;

/* renamed from: com.ss.android.mobilelib.present.CheckMobilePresent */
public abstract class CheckMobilePresent extends CommonPresent {
    private CheckMobileView mCheckMobileView;
    protected final MobileStateModel mMobileStateModel = MobileStateModel.INSTANCE;
    private int mScenario;

    public void setMobile(String str) {
        this.mMobileStateModel.setMobile(str);
    }

    public void handleMsg(Message message) {
        if (isValid()) {
            afterHandleRequest();
            if (!(message.obj instanceof SendCodeQueryObj)) {
                super.handleMsg(message);
            } else if (message.what == 10) {
                this.mMobileStateModel.setRetryTime(((SendCodeQueryObj) message.obj).mResendTime);
                this.mMobileStateModel.setLastSendTime(System.currentTimeMillis());
                this.mMobileStateModel.setMobile(((SendCodeQueryObj) message.obj).mMobile);
                this.mCheckMobileView.onCheckMobileSuccess();
            } else {
                super.handleMsg(message);
                this.mCheckMobileView.onCheckMobileFail();
            }
        }
    }

    public void checkMobile(String str, String str2) {
        if (!isValid() || C9431p.m18664a(str)) {
            return;
        }
        if (!C9431p.m18665a(str, this.mMobileStateModel.getMobile()) || this.mMobileStateModel.getRetryTime() < 0) {
            setMobile(str);
            beforeHandleRequest();
            this.mMobileApi.sendCode(this.mWeakHandler, str, str2, this.mScenario);
            return;
        }
        this.mCheckMobileView.onCheckMobileSuccess();
    }

    public CheckMobilePresent(Context context, CheckMobileView checkMobileView, int i) {
        super(context, checkMobileView);
        this.mScenario = i;
        this.mCheckMobileView = checkMobileView;
    }
}
