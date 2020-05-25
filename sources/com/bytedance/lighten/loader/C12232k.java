package com.bytedance.lighten.loader;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.bytedance.lighten.p766a.C12207s;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.p940f.C13837e;
import com.facebook.drawee.p942h.C13843b;
import com.facebook.drawee.view.C13848b;

/* renamed from: com.bytedance.lighten.loader.k */
final class C12232k {

    /* renamed from: com.bytedance.lighten.loader.k$a */
    static class C12233a implements OnAttachStateChangeListener, OnTouchListener {

        /* renamed from: a */
        C13848b<C13843b> f32325a;

        public C12233a(C13848b<C13843b> bVar) {
            this.f32325a = bVar;
        }

        public final void onViewAttachedToWindow(View view) {
            if (this.f32325a != null) {
                this.f32325a.mo25982b();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (this.f32325a != null) {
                this.f32325a.mo25983c();
            }
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f32325a == null || !this.f32325a.mo25981a(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    static C13833a m24702a(ImageView imageView, C12207s sVar) {
        if (imageView == null || sVar == null) {
            return null;
        }
        C13837e eVar = new C13837e();
        if (sVar.f32217v != null) {
            eVar = C12240p.m24709a(eVar, sVar.f32217v);
        }
        C13834b a = new C13834b(imageView.getResources()).mo25929e(sVar.f32214s).mo25918a(eVar);
        if (sVar.f32216u != null) {
            a.mo25930e(C12261v.m24734a(sVar.f32216u));
        }
        if (sVar.f32209n > 0) {
            a.mo25920b(sVar.f32209n);
            if (sVar.f32211p != null) {
                a.mo25917a(C12261v.m24734a(sVar.f32211p));
            }
        } else if (sVar.f32210o != null) {
            a.mo25916a(sVar.f32210o);
        }
        if (sVar.f32212q > 0) {
            a.mo25926d(sVar.f32212q);
            if (sVar.f32213r != null) {
                a.mo25925c(C12261v.m24734a(sVar.f32213r));
            }
        }
        if (sVar.f32192K > 0) {
            a.mo25923c(sVar.f32192K);
            if (sVar.f32193L != null) {
                a.mo25922b(C12261v.m24734a(sVar.f32193L));
            }
        }
        if (sVar.f32208m > 0) {
            a.mo25913a(sVar.f32208m);
        }
        return a.mo25912a();
    }
}
