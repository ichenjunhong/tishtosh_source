package com.p683ss.android.ugc.aweme.discover.p1635a;

import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.a.b */
public final class C27715b {

    /* renamed from: a */
    public static final C27715b f72744a = new C27715b();

    /* renamed from: com.ss.android.ugc.aweme.discover.a.b$a */
    static final class C27716a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RemoteImageView f72745a;

        /* renamed from: b */
        final /* synthetic */ UrlModel f72746b;

        C27716a(RemoteImageView remoteImageView, UrlModel urlModel) {
            this.f72745a = remoteImageView;
            this.f72746b = urlModel;
        }

        public final void run() {
            if (this.f72745a.getMeasuredHeight() <= 0 || this.f72745a.getMeasuredWidth() <= 0) {
                C23515d.m57669a(this.f72745a, this.f72746b);
            } else {
                C23515d.m57670a(this.f72745a, this.f72746b, this.f72745a.getMeasuredWidth(), this.f72745a.getMeasuredHeight());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.b$b */
    public static final class C27717b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RemoteImageView f72747a;

        /* renamed from: b */
        final /* synthetic */ String f72748b;

        public C27717b(RemoteImageView remoteImageView, String str) {
            this.f72747a = remoteImageView;
            this.f72748b = str;
        }

        public final void run() {
            if (this.f72747a.getMeasuredHeight() <= 0 || this.f72747a.getMeasuredWidth() <= 0) {
                C23515d.m57677a(this.f72747a, this.f72748b);
            } else {
                C23515d.m57686b(this.f72747a, this.f72748b, this.f72747a.getMeasuredWidth(), this.f72747a.getMeasuredHeight());
            }
        }
    }

    private C27715b() {
    }

    /* renamed from: a */
    public static final void m66364a(RemoteImageView remoteImageView, UrlModel urlModel) {
        C52711k.m112240b(remoteImageView, "draweeView");
        remoteImageView.post(new C27716a(remoteImageView, urlModel));
    }
}
