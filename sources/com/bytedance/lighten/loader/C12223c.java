package com.bytedance.lighten.loader;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.lighten.p766a.C12200n;
import com.bytedance.lighten.p766a.C12207s;
import com.bytedance.lighten.p766a.p769c.C12175j;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.imagepipeline.p970j.C14040a;
import com.facebook.imagepipeline.p970j.C14045f;

/* renamed from: com.bytedance.lighten.loader.c */
public final class C12223c extends C13790c<C14045f> {

    /* renamed from: a */
    public C12175j f32300a;

    /* renamed from: b */
    public boolean f32301b;

    /* renamed from: c */
    public boolean f32302c;

    /* renamed from: d */
    private SmartImageView f32303d;

    /* renamed from: e */
    private Uri f32304e;

    /* renamed from: f */
    private C14040a f32305f;

    /* renamed from: g */
    private C12207s f32306g;

    C12223c() {
    }

    public final void onRelease(String str) {
        super.onRelease(str);
        if (this.f32300a != null) {
            this.f32300a.mo23085a(this.f32304e);
        }
        this.f32301b = false;
        this.f32302c = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23158a(C12207s sVar) {
        this.f32306g = sVar;
        this.f32303d = (SmartImageView) sVar.f32185D;
        this.f32300a = sVar.f32187F;
        if (sVar.f32194M == null || sVar.f32194M.mo23067a()) {
            this.f32304e = sVar.f32196a;
        } else {
            this.f32304e = Uri.parse((String) sVar.f32194M.f32092a.get(0));
        }
    }

    public final void onSubmit(String str, Object obj) {
        if (this.f32300a != null) {
            this.f32300a.mo23086a(this.f32304e, (View) this.f32303d);
        }
    }

    public final void onFailure(String str, Throwable th) {
        if (this.f32300a != null) {
            this.f32300a.mo23095a(this.f32304e, this.f32303d, th);
        }
        this.f32301b = false;
    }

    public final void onIntermediateImageFailed(String str, Throwable th) {
        super.onIntermediateImageFailed(str, th);
        if (this.f32300a != null) {
            this.f32300a.mo23087a(this.f32304e, th);
        }
        this.f32301b = false;
        this.f32302c = false;
    }

    public final /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
        C14045f fVar = (C14045f) obj;
        super.onIntermediateImageSet(str, fVar);
        if (!(this.f32300a == null || fVar == null)) {
            new C12200n(fVar.getWidth(), fVar.getHeight());
        }
        this.f32301b = false;
        this.f32302c = false;
    }

    public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
        C14045f fVar = (C14045f) obj;
        boolean z = fVar instanceof C14040a;
        if (z) {
            this.f32305f = (C14040a) fVar;
        }
        boolean z2 = true;
        this.f32302c = true;
        if (animatable == null) {
            z2 = false;
        }
        this.f32301b = z2;
        if (this.f32300a != null) {
            if (fVar != null) {
                this.f32300a.mo23094a(this.f32304e, this.f32303d, new C12200n(fVar.getWidth(), fVar.getHeight()), animatable);
            } else {
                this.f32300a.mo23094a(this.f32304e, this.f32303d, null, animatable);
            }
        }
        if (this.f32305f != null && this.f32306g.f32190I && !TextUtils.isEmpty(this.f32303d.getAnimPreviewFrameCacheKey()) && C12217a.m24686b().mo23151a(this.f32303d.getAnimPreviewFrameCacheKey()) == null && z) {
            C12217a.m24686b().mo23153a(this.f32303d.getAnimPreviewFrameCacheKey(), this.f32305f);
        }
        if (this.f32301b && this.f32306g.f32198c) {
            this.f32303d.mo23137b();
        }
    }
}
