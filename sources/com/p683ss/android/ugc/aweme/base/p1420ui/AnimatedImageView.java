package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.C12217a;
import com.facebook.common.p924h.C13715a;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p939e.C13815p;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.imagepipeline.p970j.C14040a;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.p1421a.C23642a;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AnimatedImageView */
public class AnimatedImageView extends RemoteImageView {

    /* renamed from: a */
    public C23610a f62866a;

    /* renamed from: b */
    public boolean f62867b;

    /* renamed from: c */
    public boolean f62868c;

    /* renamed from: d */
    protected C13791d<C14045f> f62869d = new C13790c<C14045f>() {
        public final void onRelease(String str) {
            super.onRelease(str);
            AnimatedImageView.this.f62868c = false;
        }

        public final void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
            AnimatedImageView.this.f62868c = false;
        }

        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
            super.onIntermediateImageSet(str, (C14045f) obj);
            AnimatedImageView.this.f62868c = false;
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            String url = AnimatedImageView.this.getUrl();
            if (!TextUtils.isEmpty(url) && C12217a.m24686b().mo23151a(url) == null && (fVar instanceof C14040a)) {
                C12217a.m24686b().mo23153a(url, (C14040a) fVar);
            }
            if (animatable != null) {
                AnimatedImageView.this.f62868c = true;
                if (AnimatedImageView.this.f62867b) {
                    AnimatedImageView.this.mo48931b();
                }
            } else {
                AnimatedImageView.this.f62868c = false;
            }
        }
    };

    /* renamed from: e */
    private WeakReference<C23642a> f62870e;

    /* renamed from: f */
    private C13715a<Bitmap> f62871f;

    /* renamed from: g */
    private UrlModel f62872g;

    /* renamed from: h */
    private boolean f62873h;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AnimatedImageView$a */
    public interface C23610a {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo48929a() {
    }

    public C13791d<C14045f> getControllerListener() {
        return this.f62869d;
    }

    /* renamed from: b */
    public final void mo48931b() {
        if (getController() != null && this.f62867b && this.f62868c && this.f62873h) {
            Animatable i = getController().mo25749i();
            if (i != null && !i.isRunning()) {
                i.start();
                if (!(this.f62870e == null || this.f62870e.get() == null)) {
                    this.f62870e.get();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo48932c() {
        if (getController() != null) {
            Animatable i = getController().mo25749i();
            if (i != null && i.isRunning()) {
                i.stop();
                if (!(this.f62870e == null || this.f62870e.get() == null)) {
                    this.f62870e.get();
                }
            }
        }
    }

    public String getUrl() {
        if (this.f62872g == null || this.f62872g.getUrlList() == null || this.f62872g.getUrlList().size() == 0) {
            return "";
        }
        return (String) this.f62872g.getUrlList().get(0);
    }

    public void setAttached(boolean z) {
        this.f62867b = z;
    }

    public void setImageLoadFinishListener(C23610a aVar) {
        this.f62866a = aVar;
    }

    public void setUserVisibleHint(boolean z) {
        this.f62873h = z;
    }

    public void setAnimationListener(C23642a aVar) {
        this.f62870e = new WeakReference<>(aVar);
    }

    public AnimatedImageView(Context context) {
        super(context);
        mo48929a();
    }

    /* renamed from: a */
    public final void mo48930a(UrlModel urlModel) {
        if (urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            this.f62872g = urlModel;
            ((C13833a) getHierarchy()).mo25911d((Drawable) null);
            this.f62871f = C12217a.m24686b().mo23151a(getUrl());
            if (this.f62871f != null && this.f62871f.mo25635d()) {
                Bitmap bitmap = (Bitmap) this.f62871f.mo25630a();
                if (!bitmap.isRecycled()) {
                    ((C13833a) getHierarchy()).mo25911d((Drawable) new C13815p(new BitmapDrawable(bitmap), C13818b.f36067g));
                    return;
                }
                ((C13833a) getHierarchy()).mo25911d((Drawable) null);
            }
        }
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo48929a();
    }

    public AnimatedImageView(Context context, C13833a aVar) {
        super(context, aVar);
        mo48929a();
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo48929a();
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo48929a();
    }
}
