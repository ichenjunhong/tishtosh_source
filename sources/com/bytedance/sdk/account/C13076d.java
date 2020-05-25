package com.bytedance.sdk.account;

import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13112k;

/* renamed from: com.bytedance.sdk.account.d */
public abstract class C13076d<T extends C12993e<K>, K extends C13112k> extends C13023b<T> {
    public abstract void onError(T t, int i);

    public abstract void onSuccess(T t);

    public final String getCaptchaInfo(T t) {
        if (t == null || t.f34007h == null) {
            return null;
        }
        return t.f34007h.f34277j;
    }

    public final boolean needShowPicCaptcha(T t) {
        if (t == null || t.f34007h == null) {
            return false;
        }
        return t.f34007h.mo24770c();
    }

    public final boolean needShowCaptcha(T t) {
        if (t == null || t.f34007h == null) {
            return false;
        }
        T t2 = t.f34007h;
        if (t2.f34275h <= 1100 || t2.f34275h >= 1199) {
            return false;
        }
        return true;
    }

    public final boolean needShowSecureCaptcha(T t) {
        if (t == null || t.f34007h == null) {
            return false;
        }
        T t2 = t.f34007h;
        if (t2.f34275h == 1104 || t2.f34275h == 1105) {
            return true;
        }
        return false;
    }
}
