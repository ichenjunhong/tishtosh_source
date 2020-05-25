package com.p683ss.android.mobilelib.present;

import android.content.Context;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.mobilelib.MobileApi;
import com.p683ss.android.mobilelib.MobileApi.MobileQueryObj;
import com.p683ss.android.mobilelib.MobileApi.RefreshCaptchaQueryObj;
import com.p683ss.android.mobilelib.view.CommonView;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.mobilelib.present.CommonPresent */
public abstract class CommonPresent implements C9382a {
    private CommonView mCommonView;
    private WeakReference<Context> mContextRef;
    protected MobileApi mMobileApi;
    private boolean mValid;
    protected C9381g mWeakHandler = new C9381g(this);

    public boolean isValid() {
        return this.mValid;
    }

    public abstract void onCompleteCaptcha(String str, int i);

    /* access modifiers changed from: protected */
    public void afterHandleRequest() {
        if (this.mCommonView != null) {
            this.mCommonView.afterHandleRequest();
        }
    }

    /* access modifiers changed from: protected */
    public void beforeHandleRequest() {
        if (this.mCommonView != null) {
            this.mCommonView.beforeHandleRequest();
        }
    }

    public void destroy() {
        this.mValid = false;
        this.mMobileApi = null;
        this.mWeakHandler = null;
        this.mCommonView = null;
    }

    public Context getContext() {
        if (this.mContextRef == null) {
            return null;
        }
        return (Context) this.mContextRef.get();
    }

    public void refreshCaptcha(int i) {
        beforeHandleRequest();
        this.mMobileApi.refreshCaptcha(this.mWeakHandler, i);
    }

    public void handleMsg(Message message) {
        if (this.mValid && message.obj != null) {
            afterHandleRequest();
            if (message.what == 10) {
                if (message.obj instanceof RefreshCaptchaQueryObj) {
                    RefreshCaptchaQueryObj refreshCaptchaQueryObj = (RefreshCaptchaQueryObj) message.obj;
                    this.mCommonView.showCaptchaView(refreshCaptchaQueryObj.mNewCaptcha, "", refreshCaptchaQueryObj.mScenario);
                }
            } else if (message.what == 11 && (message.obj instanceof MobileQueryObj)) {
                MobileQueryObj mobileQueryObj = (MobileQueryObj) message.obj;
                if (mobileQueryObj.isNeedShowCaptcha()) {
                    this.mCommonView.showCaptchaView(mobileQueryObj.mErrorCaptcha, mobileQueryObj.mErrorMsg, mobileQueryObj.mScenario);
                    this.mCommonView.showErrorMessage(mobileQueryObj.mErrorMsg, mobileQueryObj.mError, true);
                    return;
                }
                this.mCommonView.showErrorMessage(mobileQueryObj.mErrorMsg, mobileQueryObj.mError, mobileQueryObj instanceof RefreshCaptchaQueryObj);
            }
        }
    }

    public CommonPresent(Context context, CommonView commonView) {
        this.mMobileApi = new MobileApi(context);
        this.mContextRef = new WeakReference<>(context);
        this.mCommonView = commonView;
        this.mValid = true;
    }
}
