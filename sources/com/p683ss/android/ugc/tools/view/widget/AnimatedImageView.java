package com.p683ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.C12217a;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p970j.C14040a;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.tools.view.widget.AnimatedImageView */
public class AnimatedImageView extends SimpleDraweeView {

    /* renamed from: a */
    WeakReference<C50284h> f125956a;

    /* renamed from: b */
    public C50245a f125957b;

    /* renamed from: c */
    public boolean f125958c;

    /* renamed from: d */
    public boolean f125959d;

    /* renamed from: e */
    boolean f125960e;

    /* renamed from: f */
    protected C13791d<C14045f> f125961f = new C13790c<C14045f>() {
        public final void onRelease(String str) {
            super.onRelease(str);
            AnimatedImageView.this.f125959d = false;
        }

        public final void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
            AnimatedImageView.this.f125959d = false;
        }

        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
            super.onIntermediateImageSet(str, (C14045f) obj);
            AnimatedImageView.this.f125959d = false;
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            String url = AnimatedImageView.this.getUrl();
            if (!TextUtils.isEmpty(url) && C12217a.m24686b().mo23151a(url) == null && (fVar instanceof C14040a)) {
                C12217a.m24686b().mo23153a(url, (C14040a) fVar);
            }
            if (animatable != null) {
                AnimatedImageView.this.f125959d = true;
                if (AnimatedImageView.this.f125958c) {
                    AnimatedImageView animatedImageView = AnimatedImageView.this;
                    if (animatedImageView.getController() != null && animatedImageView.f125958c && animatedImageView.f125959d && animatedImageView.f125960e) {
                        Animatable i = animatedImageView.getController().mo25749i();
                        if (i != null && !i.isRunning()) {
                            i.start();
                            if (!(animatedImageView.f125956a == null || animatedImageView.f125956a.get() == null)) {
                                animatedImageView.f125956a.get();
                            }
                        }
                    }
                }
            } else {
                AnimatedImageView.this.f125959d = false;
            }
        }
    };

    /* renamed from: g */
    private UrlModel f125962g;

    /* renamed from: com.ss.android.ugc.tools.view.widget.AnimatedImageView$a */
    public interface C50245a {
    }

    public C13791d<C14045f> getControllerListener() {
        return this.f125961f;
    }

    public String getUrl() {
        if (this.f125962g == null || this.f125962g.getUrlList() == null || this.f125962g.getUrlList().size() == 0) {
            return "";
        }
        return (String) this.f125962g.getUrlList().get(0);
    }

    public void setAttached(boolean z) {
        this.f125958c = z;
    }

    public void setImageLoadFinishListener(C50245a aVar) {
        this.f125957b = aVar;
    }

    public void setUserVisibleHint(boolean z) {
        this.f125960e = z;
    }

    public void setAnimationListener(C50284h hVar) {
        this.f125956a = new WeakReference<>(hVar);
    }

    public AnimatedImageView(Context context) {
        super(context);
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnimatedImageView(Context context, C13833a aVar) {
        super(context, aVar);
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
