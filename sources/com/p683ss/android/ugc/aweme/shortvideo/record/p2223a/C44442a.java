package com.p683ss.android.ugc.aweme.shortvideo.record.p2223a;

import android.animation.ValueAnimator;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.view.MotionEvent;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20382b;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.asve.recorder.view.C20569g;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45017b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a.a */
public final class C44442a {

    /* renamed from: a */
    AppCompatActivity f112428a;

    /* renamed from: b */
    public final C45017b f112429b;

    /* renamed from: c */
    public ASCameraView f112430c;

    /* renamed from: d */
    C44448f f112431d;

    /* renamed from: e */
    public ValueAnimator f112432e;

    /* renamed from: f */
    boolean f112433f;

    /* renamed from: g */
    public C43866a f112434g = new C43866a() {

        /* renamed from: a */
        boolean f112436a;

        /* renamed from: b */
        boolean f112437b;

        /* renamed from: a */
        public final boolean mo87821a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return true;
        }

        /* renamed from: e */
        public final boolean mo88487e(MotionEvent motionEvent) {
            return true;
        }

        /* renamed from: a */
        public final boolean mo87820a(MotionEvent motionEvent) {
            C44442a.this.f112429b.mo91322a(motionEvent.getX(), motionEvent.getY());
            return true;
        }

        /* renamed from: b */
        public final void mo88486b(C20382b bVar) {
            if (this.f112436a) {
                this.f112436a = false;
                this.f112437b = true;
                C44442a.this.mo90327a().mo43579b();
                C44442a.this.f112429b.mo91396f(true);
            }
        }

        /* renamed from: a */
        public final boolean mo88484a(C20382b bVar) {
            if (!this.f112436a) {
                return false;
            }
            C44442a.this.mo90327a().mo43581c(bVar.f55897i.x, bVar.f55897i.y);
            return true;
        }

        /* renamed from: a */
        public final boolean mo88485a(C20382b bVar, float f, float f2) {
            boolean z;
            C44442a aVar = C44442a.this;
            if (!((ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) aVar.f112428a).mo359a(ShortVideoContextViewModel.class)).mo86391c() || ((ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) aVar.f112428a).mo359a(ShortVideoContextViewModel.class)).mo86387a()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f112436a = C44442a.this.mo90327a().mo43580b(f, f2);
                if (this.f112436a) {
                    C44442a aVar2 = C44442a.this;
                    if (aVar2.f112431d != null) {
                        aVar2.f112431d.mo90332a(false);
                    }
                    C44442a.this.f112429b.mo91396f(false);
                }
            }
            return this.f112436a;
        }

        /* renamed from: b */
        public final boolean mo87828b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!this.f112437b) {
                return false;
            }
            this.f112437b = false;
            return true;
        }
    };

    /* renamed from: h */
    private C20569g f112435h;

    /* renamed from: a */
    public final C20569g mo90327a() {
        if (this.f112435h == null) {
            this.f112435h = this.f112430c.getGestureDispatcher();
        }
        return this.f112435h;
    }

    public C44442a(AppCompatActivity appCompatActivity, ASCameraView aSCameraView, C45017b bVar) {
        this.f112428a = appCompatActivity;
        this.f112429b = bVar;
        this.f112430c = aSCameraView;
        ((ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) this.f112428a).mo359a(ShortVideoContextViewModel.class)).mo86398g().observe(this.f112428a, new C44444b(this));
        bVar.f114030h.mo7345a(this.f112434g);
    }
}
