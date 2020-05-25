package com.p683ss.android.ugc.aweme.photo;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.p030v4.p038f.C0781c;
import android.util.AttributeSet;
import com.p683ss.android.medialib.image.ImageRenderView;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.tools.p2504a.C50181a;

/* renamed from: com.ss.android.ugc.aweme.photo.PhotoView */
public class PhotoView extends ImageRenderView implements C0183j {

    /* renamed from: m */
    private PhotoContext f98320m;

    /* renamed from: n */
    private int f98321n;

    /* renamed from: o */
    private int f98322o;

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void pause() {
        mo39816b();
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_RESUME)
    public void resume() {
        mo39817c();
    }

    public PhotoView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo78581a(PhotoContext photoContext) {
        this.f98320m = photoContext;
        if (C39618d.f101152P.mo83103a(C40790a.EnableFilterIntensityJust)) {
            mo39864a(C31460h.m73281a(C39618d.f101144H.mo58584o().mo64333c().mo64346b(this.f98320m.mFilterIndex)), this.f98320m.mFilterRate);
        } else {
            mo39865b(C31460h.m73281a(C39618d.f101144H.mo58584o().mo64333c().mo64346b(this.f98320m.mFilterIndex)), this.f98320m.mFilterRate);
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo78580a(C0184k kVar, PhotoContext photoContext) {
        kVar.getLifecycle().mo324a(this);
        this.f98320m = photoContext;
        if (this.f98320m != null) {
            C50181a.m108296a(C38657e.m85995a(this.f98320m.getPhotoUri()), this.f98321n, this.f98322o, (C0781c<Bitmap>) new C0781c<Bitmap>() {
                public final /* synthetic */ void accept(Object obj) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                        PhotoView.this.setImage(bitmap);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f98321n = getWidth();
        this.f98322o = getHeight();
    }
}
