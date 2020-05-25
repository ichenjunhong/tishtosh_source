package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.widget.ImageView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33440v;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33445y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.CircleProgressTextView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.al */
public final class C33750al {

    /* renamed from: a */
    public C11207p f87540a;

    /* renamed from: b */
    public CircleProgressTextView f87541b;

    /* renamed from: c */
    private ImageView f87542c;

    /* renamed from: d */
    private C33445y f87543d;

    /* renamed from: e */
    private OnAttachStateChangeListener f87544e;

    /* renamed from: b */
    private void m77289b() {
        if (this.f87543d == null) {
            this.f87543d = new C33445y() {
                /* renamed from: a */
                public final void mo70782a() {
                    C33750al.this.f87541b.setProgress(1.0d);
                }

                /* renamed from: a */
                public final void mo70783a(double d) {
                    C33750al.this.f87541b.setProgress(d);
                }

                /* renamed from: a */
                public final void mo70784a(String str) {
                    C33750al.this.f87541b.setProgress(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
                }

                /* renamed from: a */
                public final void mo70785a(Throwable th) {
                    C33750al.this.f87541b.setProgress(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
                }

                /* renamed from: a */
                public final void mo70787a(String str, UrlModel urlModel) {
                    C33750al.this.f87541b.setProgress(1.0d);
                }
            };
        }
        C33440v.m76638a().mo70845a(this.f87540a, this.f87543d);
    }

    /* renamed from: a */
    public final void mo71805a() {
        if (this.f87540a != null) {
            int msgStatus = this.f87540a.getMsgStatus();
            if (msgStatus != 5) {
                switch (msgStatus) {
                    case 0:
                        this.f87541b.setVisibility(0);
                        this.f87542c.setVisibility(8);
                        this.f87541b.setProgress(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
                        m77289b();
                        return;
                    case 1:
                        C33440v.m76638a().mo70849b(this.f87540a);
                        this.f87541b.setVisibility(8);
                        this.f87542c.setVisibility(8);
                        return;
                    case 2:
                        break;
                    case 3:
                        C33440v.m76638a().mo70849b(this.f87540a);
                        this.f87542c.setVisibility(0);
                        this.f87541b.setVisibility(8);
                        return;
                }
            }
            C33440v.m76638a().mo70849b(this.f87540a);
            this.f87541b.setVisibility(8);
            this.f87542c.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo71806a(C11207p pVar) {
        this.f87540a = pVar;
        mo71805a();
    }

    public C33750al(CircleProgressTextView circleProgressTextView, ImageView imageView) {
        this.f87541b = circleProgressTextView;
        this.f87542c = imageView;
        if (this.f87544e == null) {
            this.f87544e = new OnAttachStateChangeListener() {
                public final void onViewAttachedToWindow(View view) {
                    C33750al.this.mo71805a();
                }

                public final void onViewDetachedFromWindow(View view) {
                    C33440v.m76638a().mo70849b(C33750al.this.f87540a);
                }
            };
        }
        this.f87541b.removeOnAttachStateChangeListener(this.f87544e);
        this.f87541b.addOnAttachStateChangeListener(this.f87544e);
    }
}
