package com.p683ss.android.ugc.aweme.port.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0654k.C0655a;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.p683ss.android.ugc.aweme.services.video.IAVPublishService.OnPublishCallback;
import com.p683ss.android.ugc.aweme.shortvideo.C43212df;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44371e;

/* renamed from: com.ss.android.ugc.aweme.port.internal.l */
public final class C39663l extends C0655a {

    /* renamed from: a */
    private final FragmentActivity f101233a;

    /* renamed from: b */
    private final C44371e f101234b;

    /* renamed from: c */
    private final ServiceConnectionImpl f101235c;

    /* renamed from: d */
    private final OnPublishCallback f101236d;

    public final void onFragmentDetached(C0654k kVar, Fragment fragment) {
        super.onFragmentDetached(kVar, fragment);
        if (fragment instanceof C43212df) {
            this.f101233a.getSupportFragmentManager().mo2228a((C0655a) this);
            if (this.f101234b != null) {
                this.f101234b.mo80720b((C44334o) fragment);
            }
            if (this.f101236d != null) {
                this.f101236d.onStopPublish();
            }
            try {
                if (this.f101235c != null) {
                    this.f101233a.unbindService(this.f101235c);
                }
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void onFragmentAttached(C0654k kVar, Fragment fragment, Context context) {
        super.onFragmentAttached(kVar, fragment, context);
        if ((fragment instanceof C43212df) && this.f101234b != null) {
            this.f101234b.mo80718a((C44334o) fragment);
        }
    }

    public final void onFragmentViewCreated(C0654k kVar, Fragment fragment, View view, Bundle bundle) {
        super.onFragmentViewCreated(kVar, fragment, view, bundle);
    }

    public C39663l(FragmentActivity fragmentActivity, ServiceConnectionImpl serviceConnectionImpl, C44371e eVar, OnPublishCallback onPublishCallback) {
        this.f101233a = fragmentActivity;
        this.f101234b = eVar;
        this.f101235c = serviceConnectionImpl;
        this.f101236d = onPublishCallback;
    }
}
