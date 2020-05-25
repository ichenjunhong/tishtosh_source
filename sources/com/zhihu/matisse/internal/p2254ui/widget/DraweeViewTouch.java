package com.zhihu.matisse.internal.p2254ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.common.p924h.C13715a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.drawee.view.C13848b;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14043d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.p929d.C13745c;
import p2674it.sephiroth.android.library.imagezoom.ImageViewTouch;

/* renamed from: com.zhihu.matisse.internal.ui.widget.DraweeViewTouch */
public class DraweeViewTouch extends ImageViewTouch {

    /* renamed from: A */
    private C13848b f130825A;

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f130825A.mo25982b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f130825A.mo25983c();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.f130825A.mo25982b();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f130825A.mo25983c();
    }

    public DraweeViewTouch(Context context) {
        super(context);
        m112024a(context);
    }

    /* renamed from: a */
    private void m112024a(Context context) {
        if (this.f130825A == null) {
            this.f130825A = C13848b.m28154a(new C13834b(getResources()).mo25912a(), context);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f130825A.mo25985e() || !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setImageRequest(C14229b bVar) {
        final C13745c a = C13771c.m27875c().mo26182a(bVar, (Object) null);
        this.f130825A.mo25979a((C13842a) ((C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25759b(this.f130825A.f36129c)).mo25757b(bVar)).mo25751a((C13791d<? super INFO>) new C13790c<C14045f>() {
            public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                C13715a aVar;
                Throwable th;
                super.onFinalImageSet(str, (C14045f) obj, animatable);
                try {
                    aVar = (C13715a) a.mo25674d();
                    if (aVar != null) {
                        try {
                            C14042c cVar = (C14042c) aVar.mo25630a();
                            if (cVar instanceof C14043d) {
                                Bitmap d = ((C14043d) cVar).mo26257d();
                                if (d != null) {
                                    DraweeViewTouch.this.setImageBitmap(d);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            a.mo25677g();
                            C13715a.m27752c(aVar);
                            throw th;
                        }
                    }
                    a.mo25677g();
                    C13715a.m27752c(aVar);
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    aVar = null;
                    th = th4;
                    a.mo25677g();
                    C13715a.m27752c(aVar);
                    throw th;
                }
            }
        })).mo25763d());
    }

    public DraweeViewTouch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m112024a(context);
    }

    public DraweeViewTouch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m112024a(context);
    }
}
