package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1819b;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.widget.ImageView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EncryptedVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a.C33376a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.CircleProgressTextView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.b.i */
public final class C33407i {

    /* renamed from: a */
    public C11207p f86609a;

    /* renamed from: b */
    public CircleProgressTextView f86610b;

    /* renamed from: c */
    private ImageView f86611c;

    /* renamed from: d */
    private ImageView f86612d;

    /* renamed from: e */
    private C33396a f86613e;

    /* renamed from: f */
    private OnAttachStateChangeListener f86614f;

    /* renamed from: b */
    private void m76576b() {
        C33403g.f86598a.mo70791b(this.f86609a);
        this.f86612d.setVisibility(0);
        this.f86610b.setVisibility(8);
    }

    /* renamed from: c */
    private void m76577c() {
        if (this.f86613e == null) {
            this.f86613e = new C33396a() {
                /* renamed from: a */
                public final void mo70782a() {
                    C33407i.this.f86610b.setProgress(1.0d);
                }

                /* renamed from: a */
                public final void mo70783a(double d) {
                    C33407i.this.f86610b.setProgress(d);
                }

                /* renamed from: a */
                public final void mo70784a(String str) {
                    C33407i.this.f86610b.setProgress(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
                }

                /* renamed from: a */
                public final void mo70785a(Throwable th) {
                    C33407i.this.f86610b.setProgress(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
                }

                /* renamed from: a */
                public final void mo70780a(String str, EncryptedVideoContent encryptedVideoContent, C33376a aVar) {
                    C33407i.this.f86610b.setProgress(1.0d);
                }
            };
        }
        C33403g.f86598a.mo70790a(this.f86609a, this.f86613e);
    }

    /* renamed from: a */
    public final void mo70812a() {
        if (this.f86609a != null) {
            int msgStatus = this.f86609a.getMsgStatus();
            if (msgStatus != 5) {
                switch (msgStatus) {
                    case 0:
                        this.f86610b.setVisibility(0);
                        this.f86612d.setVisibility(8);
                        this.f86611c.setVisibility(8);
                        this.f86610b.setProgress(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
                        m76577c();
                        return;
                    case 1:
                        this.f86611c.setVisibility(8);
                        m76576b();
                        return;
                    case 2:
                        break;
                    case 3:
                        this.f86611c.setVisibility(0);
                        m76576b();
                        return;
                }
            }
            this.f86611c.setVisibility(8);
            m76576b();
        }
    }

    /* renamed from: a */
    public final void mo70813a(C11207p pVar) {
        this.f86609a = pVar;
        mo70812a();
    }

    public C33407i(CircleProgressTextView circleProgressTextView, ImageView imageView, ImageView imageView2) {
        this.f86612d = imageView;
        this.f86610b = circleProgressTextView;
        this.f86611c = imageView2;
        if (this.f86614f == null) {
            this.f86614f = new OnAttachStateChangeListener() {
                public final void onViewAttachedToWindow(View view) {
                    C33407i.this.mo70812a();
                }

                public final void onViewDetachedFromWindow(View view) {
                    C33403g.f86598a.mo70791b(C33407i.this.f86609a);
                }
            };
        }
        this.f86610b.removeOnAttachStateChangeListener(this.f86614f);
        this.f86610b.addOnAttachStateChangeListener(this.f86614f);
    }
}
