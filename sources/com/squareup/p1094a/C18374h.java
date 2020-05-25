package com.squareup.p1094a;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.a.h */
final class C18374h implements OnPreDrawListener {

    /* renamed from: a */
    final C18412z f50737a;

    /* renamed from: b */
    final WeakReference<ImageView> f50738b;

    /* renamed from: c */
    C18371e f50739c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36822a() {
        this.f50739c = null;
        ImageView imageView = (ImageView) this.f50738b.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public final boolean onPreDraw() {
        ImageView imageView = (ImageView) this.f50738b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width <= 0 || height <= 0) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        C18412z zVar = this.f50737a;
        zVar.f50875c = false;
        zVar.mo36882a(width, height).mo36886a(imageView, this.f50739c);
        return true;
    }

    C18374h(C18412z zVar, ImageView imageView, C18371e eVar) {
        this.f50737a = zVar;
        this.f50738b = new WeakReference<>(imageView);
        this.f50739c = eVar;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }
}
