package com.bytedance.lighten.loader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.lighten.p766a.C12187e;
import com.bytedance.lighten.p766a.C12187e.C12190b;
import com.bytedance.lighten.p766a.C12196j;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12207s;
import com.bytedance.lighten.p766a.C12210u;
import com.bytedance.lighten.p766a.p769c.C12166a;
import com.bytedance.lighten.p766a.p769c.C12175j;
import com.bytedance.lighten.p766a.p770d.C12184b;
import com.facebook.common.p924h.C13715a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p939e.C13815p;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p975o.C14229b;
import java.lang.ref.WeakReference;

public class SmartImageView extends SimpleDraweeView implements C12196j, C12197k {

    /* renamed from: a */
    private WeakReference<C12166a> f32278a;

    /* renamed from: b */
    public C12223c f32279b;

    /* renamed from: c */
    private C12207s f32280c;

    /* renamed from: d */
    private String f32281d;

    /* renamed from: e */
    private C13715a<Bitmap> f32282e;

    /* renamed from: f */
    private boolean f32283f;

    /* renamed from: g */
    private boolean f32284g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23132a() {
    }

    /* access modifiers changed from: 0000 */
    public String getAnimPreviewFrameCacheKey() {
        return this.f32281d;
    }

    public C12196j getSmartHierarchy() {
        return this;
    }

    /* renamed from: c */
    public final void mo23138c() {
        if (getController() != null) {
            Animatable i = getController().mo25749i();
            if (i != null && i.isRunning()) {
                i.stop();
                if (!(this.f32278a == null || this.f32278a.get() == null)) {
                    this.f32278a.get();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo23137b() {
        if (getController() != null && this.f32279b != null && this.f32283f && this.f32279b.f32301b && this.f32284g) {
            Animatable i = getController().mo25749i();
            if (i != null && !i.isRunning()) {
                i.start();
                if (!(this.f32278a == null || this.f32278a.get() == null)) {
                    ((C12166a) this.f32278a.get()).mo23084a();
                }
            }
        }
    }

    public void setAttached(boolean z) {
        this.f32283f = z;
    }

    public void setUserVisibleHint(boolean z) {
        this.f32284g = z;
    }

    public SmartImageView(Context context) {
        super(context);
        mo23132a();
    }

    public void setAnimationListener(C12166a aVar) {
        this.f32278a = new WeakReference<>(aVar);
    }

    public void setActualImageScaleType(C12210u uVar) {
        if (uVar != null) {
            ((C13833a) getHierarchy()).mo25898a(C12261v.m24734a(uVar));
        }
    }

    public void setImageDisplayListener(C12175j jVar) {
        if (this.f32279b != null) {
            this.f32279b.f32300a = jVar;
        }
    }

    public void setPlaceholderImage(int i) {
        if (i > 0) {
            ((C13833a) getHierarchy()).mo25902b(i);
        }
    }

    public void setPlaceholderImage(Drawable drawable) {
        ((C13833a) getHierarchy()).mo25904b(drawable);
    }

    private void setController(C14229b bVar) {
        boolean z;
        C13773e eVar = (C13773e) ((C13773e) C13771c.m27870a().mo25759b(getController())).mo25762c(this.f32280c.f32198c);
        if (this.f32280c.f32192K > 0) {
            z = true;
        } else {
            z = false;
        }
        final C13773e eVar2 = (C13773e) ((C13773e) eVar.mo25754a(z)).mo25757b(bVar);
        if (!TextUtils.isEmpty(this.f32280c.f32182A)) {
            eVar2.mo25753a((Object) this.f32280c.f32182A);
        }
        if (this.f32279b != null) {
            this.f32279b.mo23158a(this.f32280c);
            eVar2.mo25751a((C13791d<? super INFO>) this.f32279b);
        } else {
            this.f32279b = new C12223c();
            this.f32279b.mo23158a(this.f32280c);
            eVar2.mo25751a((C13791d<? super INFO>) this.f32279b);
        }
        C12184b.m24629a().execute(new Runnable() {
            public final void run() {
                SmartImageView.this.setController(eVar2.mo25763d());
            }
        });
    }

    public void setCircleOptions(C12187e eVar) {
        C13837e eVar2;
        if (eVar != null) {
            if (((C13833a) getHierarchy()).f36079a != null) {
                eVar2 = ((C13833a) getHierarchy()).f36079a;
            } else {
                eVar2 = new C13837e();
            }
            if (eVar.f32106g != null) {
                C12190b bVar = eVar.f32106g;
                eVar2.mo25933a(bVar.f32116a, bVar.f32117b, bVar.f32118c, bVar.f32119d);
            }
            eVar2.mo25937a(eVar.f32103d);
            eVar2.mo25932a(eVar.f32104e);
            eVar2.mo25939c(eVar.f32100a);
            eVar2.mo25938b(eVar.f32101b);
            eVar2.mo25934a(eVar.f32102c);
            eVar2.mo25940d(eVar.f32105f);
            eVar2.mo25936a(C12264x.m24735a(eVar.f32107h));
            ((C13833a) getHierarchy()).mo25899a(eVar2);
        }
    }

    private void setController(C14229b[] bVarArr) {
        boolean z;
        if (bVarArr.length != 0) {
            C13773e eVar = (C13773e) ((C13773e) C13771c.m27870a().mo25759b(getController())).mo25762c(this.f32280c.f32198c);
            if (this.f32280c.f32192K > 0) {
                z = true;
            } else {
                z = false;
            }
            final C13773e eVar2 = (C13773e) ((C13773e) ((C13773e) eVar.mo25754a(z)).mo25753a((Object) this.f32280c.f32182A)).mo25755a((REQUEST[]) bVarArr);
            if (!TextUtils.isEmpty(this.f32280c.f32182A)) {
                eVar2.mo25753a((Object) this.f32280c.f32182A);
            }
            if (this.f32279b != null) {
                this.f32279b.mo23158a(this.f32280c);
                eVar2.mo25751a((C13791d<? super INFO>) this.f32279b);
            } else {
                this.f32279b = new C12223c();
                this.f32279b.mo23158a(this.f32280c);
                eVar2.mo25751a((C13791d<? super INFO>) this.f32279b);
            }
            C12184b.m24629a().execute(new Runnable() {
                public final void run() {
                    SmartImageView.this.setController(eVar2.mo25763d());
                }
            });
        }
    }

    /* renamed from: a */
    public void mo23133a(C12207s sVar) {
        this.f32280c = sVar;
        if (sVar.f32190I) {
            if (sVar.f32194M == null || sVar.f32194M.mo23067a()) {
                this.f32281d = sVar.f32196a.toString();
            } else {
                this.f32281d = (String) sVar.f32194M.f32092a.get(0);
            }
            ((C13833a) getHierarchy()).mo25911d((Drawable) null);
            this.f32282e = C12217a.m24686b().mo23151a(this.f32281d);
            if (this.f32282e != null && this.f32282e.mo25635d()) {
                Bitmap bitmap = (Bitmap) this.f32282e.mo25630a();
                if (!bitmap.isRecycled()) {
                    ((C13833a) getHierarchy()).mo25911d((Drawable) new C13815p(new BitmapDrawable(bitmap), C13818b.f36067g));
                } else {
                    ((C13833a) getHierarchy()).mo25911d((Drawable) null);
                }
            }
        }
        if (sVar.f32194M == null || sVar.f32194M.mo23067a()) {
            setController(C12240p.m24710a(sVar, sVar.f32196a));
        } else {
            setController(C12240p.m24716b(sVar));
        }
    }

    public SmartImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo23132a();
    }

    public SmartImageView(Context context, C13833a aVar) {
        super(context, aVar);
        setHierarchy(aVar);
        mo23132a();
    }

    public SmartImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo23132a();
    }
}
