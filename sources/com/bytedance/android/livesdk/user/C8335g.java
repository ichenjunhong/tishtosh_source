package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p226e.C3838a;
import p064c.p065a.C1674ab;
import p064c.p065a.C1683ag;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.user.g */
public class C8335g<T> implements C1674ab<T>, C1683ag<T> {
    public void onComplete() {
    }

    public void onNext(T t) {
    }

    public void onSubscribe(C1690c cVar) {
    }

    public void onSuccess(T t) {
    }

    public void onError(Throwable th) {
        C3831a.m9714b("LiveEmptyObserver", th);
        if (th instanceof C3838a) {
            StringBuilder sb = new StringBuilder("ApiServerException thrown, url: ");
            sb.append(((C3838a) th).getUrl());
            C3831a.m9716d("LiveEmptyObserver", sb.toString());
        }
    }
}
