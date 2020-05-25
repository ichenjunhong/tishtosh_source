package com.p683ss.android.ugc.aweme.port.internal;

import android.graphics.Bitmap;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44371e;

/* renamed from: com.ss.android.ugc.aweme.port.internal.h */
final /* synthetic */ class C39659h implements Runnable {

    /* renamed from: a */
    private final MainActivityCallback f101226a;

    /* renamed from: b */
    private final FragmentActivity f101227b;

    /* renamed from: c */
    private final String f101228c;

    C39659h(MainActivityCallback mainActivityCallback, FragmentActivity fragmentActivity, String str) {
        this.f101226a = mainActivityCallback;
        this.f101227b = fragmentActivity;
        this.f101228c = str;
    }

    public final void run() {
        MainActivityCallback mainActivityCallback = this.f101226a;
        FragmentActivity fragmentActivity = this.f101227b;
        String str = this.f101228c;
        fragmentActivity.getLifecycle().mo324a(mainActivityCallback);
        mainActivityCallback.f101207a = new C44371e(str) {

            /* renamed from: a */
            final /* synthetic */ String f101212a;

            /* renamed from: a */
            public final Object mo80717a() {
                return MainActivityCallback.this.f101210d.f112320i;
            }

            /* renamed from: b */
            public final int mo80719b() {
                return MainActivityCallback.this.f101210d.f112318g;
            }

            /* renamed from: d */
            public final String mo80722d() {
                return MainActivityCallback.this.f101210d.f112313b;
            }

            /* renamed from: c */
            public final Bitmap mo80721c() {
                return MainActivityCallback.this.f101209c.getCover(MainActivityCallback.this.f101210d);
            }

            /* renamed from: a */
            public final void mo80718a(C44334o oVar) {
                MainActivityCallback.this.f101209c.addPublishCallback(oVar, this.f101212a);
            }

            /* renamed from: b */
            public final void mo80720b(C44334o oVar) {
                MainActivityCallback.this.f101209c.removePublishCallback(oVar);
            }

            {
                this.f101212a = r2;
            }
        };
        mainActivityCallback.f101207a.mo80718a(mainActivityCallback);
        mainActivityCallback.f101208b = new C39651a(fragmentActivity);
        C39651a.m88325a();
        if (fragmentActivity instanceof MainActivity) {
            ((MainActivity) fragmentActivity).onPublishServiceConnected(mainActivityCallback.f101207a, null, mainActivityCallback.f101207a.mo80717a());
        }
    }
}
