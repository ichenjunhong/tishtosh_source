package com.bytedance.sdk.account;

import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.p683ss.android.account.C18495c;

/* renamed from: com.bytedance.sdk.account.b */
public abstract class C13023b<T extends C12990b> extends C12989a<T> {
    public String getCaptchaInfo(T t) {
        return null;
    }

    public boolean needShowCaptcha(T t) {
        return false;
    }

    public boolean needShowPicCaptcha(T t) {
        return false;
    }

    public boolean needShowSecureCaptcha(T t) {
        return false;
    }

    public abstract void onError(T t, int i);

    public void onNeedCaptcha(T t, String str) {
    }

    public void onNeedSecureCaptcha(T t) {
    }

    public abstract void onSuccess(T t);

    public void onResponse(T t) {
        if (t.f33998a) {
            onSuccess(t);
        } else if (!needShowCaptcha(t)) {
            onError(t, t.f34000c);
        } else if (needShowPicCaptcha(t)) {
            onNeedCaptcha(t, getCaptchaInfo(t));
        } else {
            C18495c.m44742a();
            if (needShowSecureCaptcha(t)) {
                onNeedSecureCaptcha(t);
            } else {
                onError(t, t.f34000c);
            }
        }
    }
}
