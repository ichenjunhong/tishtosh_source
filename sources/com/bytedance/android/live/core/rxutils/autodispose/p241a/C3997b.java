package com.bytedance.android.live.core.rxutils.autodispose.p241a;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.bytedance.android.live.core.rxutils.autodispose.C4003ad;
import com.bytedance.android.live.core.rxutils.autodispose.p241a.p242a.C3995a;
import p064c.p065a.C1705d;
import p064c.p065a.C2142f;
import p064c.p065a.p066a.C1664a;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.a.b */
final class C3997b implements C2142f {

    /* renamed from: a */
    private final View f11138a;

    /* renamed from: com.bytedance.android.live.core.rxutils.autodispose.a.b$a */
    static final class C3998a extends C1664a implements OnAttachStateChangeListener {

        /* renamed from: a */
        private final View f11139a;

        /* renamed from: b */
        private final C1705d f11140b;

        public final void onViewAttachedToWindow(View view) {
        }

        /* renamed from: a */
        public final void mo6125a() {
            this.f11139a.removeOnAttachStateChangeListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
            if (!isDisposed()) {
                this.f11140b.onComplete();
            }
        }

        C3998a(View view, C1705d dVar) {
            this.f11139a = view;
            this.f11140b = dVar;
        }
    }

    C3997b(View view) {
        this.f11138a = view;
    }

    /* renamed from: a */
    public final void mo6175a(C1705d dVar) {
        boolean z;
        C3998a aVar = new C3998a(this.f11138a, dVar);
        dVar.onSubscribe(aVar);
        if (!C3995a.m10113a()) {
            dVar.onError(new IllegalStateException("Views can only be bound to on the main thread!"));
            return;
        }
        if ((VERSION.SDK_INT < 19 || !this.f11138a.isAttachedToWindow()) && this.f11138a.getWindowToken() == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            dVar.onError(new C4003ad("View is not attached!"));
            return;
        }
        this.f11138a.addOnAttachStateChangeListener(aVar);
        if (aVar.isDisposed()) {
            this.f11138a.removeOnAttachStateChangeListener(aVar);
        }
    }
}
