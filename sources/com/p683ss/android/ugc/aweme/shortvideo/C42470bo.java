package com.p683ss.android.ugc.aweme.shortvideo;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bo */
public final class C42470bo implements C44334o<C42421al> {

    /* renamed from: a */
    C44334o<C42421al> f107406a;

    /* renamed from: b */
    private Handler f107407b = new Handler(Looper.getMainLooper());

    public final void onError(C43856fy fyVar) {
        this.f107407b.post(new C42473br(this, fyVar));
    }

    public final void onSynthetiseSuccess(String str) {
        this.f107407b.post(new C42474bs(this, str));
    }

    public C42470bo(C44334o<C42421al> oVar) {
        this.f107406a = oVar;
    }

    public final void onSuccess(C42421al alVar, boolean z) {
        this.f107407b.post(new C42472bq(this, alVar, z));
    }

    public final void onProgressUpdate(int i, boolean z) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f107406a.onProgressUpdate(i, z);
        } else {
            this.f107407b.post(new C42471bp(this, i, z));
        }
    }
}
