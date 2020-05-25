package com.p683ss.android.medialib.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p683ss.android.medialib.image.C19340b.C19343b;

/* renamed from: com.ss.android.medialib.image.ImageRenderView */
public class ImageRenderView extends GLTextureView {

    /* renamed from: l */
    public C19340b f53431l;

    /* renamed from: com.ss.android.medialib.image.ImageRenderView$a */
    public interface C19338a {
        /* renamed from: a */
        void mo39872a(boolean z);
    }

    /* renamed from: d */
    private void m47228d() {
        setEGLContextClientVersion(2);
        this.f53431l = new C19340b();
        setRenderer(this.f53431l);
        setRenderMode(0);
    }

    /* renamed from: b */
    public final void mo39816b() {
        super.mo39816b();
        C193361 r0 = new Runnable() {
            public final void run() {
                ImageRenderView.this.f53431l.mo39874a();
            }
        };
        C19331i iVar = this.f53373c;
        synchronized (GLTextureView.f53371b) {
            iVar.f53409h.add(r0);
            GLTextureView.f53371b.notifyAll();
        }
    }

    public ImageRenderView(Context context) {
        super(context);
        m47228d();
    }

    public void setDrawFrameCallback(C19343b bVar) {
        this.f53431l.f53450d = bVar;
    }

    /* renamed from: a */
    public final float mo39863a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1.0f;
        }
        return this.f53431l.mo39873a(str);
    }

    public void setImage(Bitmap bitmap) {
        if (bitmap != null) {
            this.f53431l.mo39875a(bitmap);
            mo39815a();
        }
    }

    public void setImage(String str) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile != null) {
            this.f53431l.mo39875a(decodeFile);
            mo39815a();
        }
    }

    public void setIntensity(float f) {
        C19340b bVar = this.f53431l;
        if (bVar.f53447a.mo39577a()) {
            bVar.f53447a.mo39575a(bVar.f53451e.f53463a, bVar.f53451e.f53466d, bVar.f53451e.f53467e, f);
        }
        bVar.f53451e.f53464b = f;
        bVar.f53451e.f53465c = f;
        mo39815a();
    }

    public ImageRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m47228d();
    }

    /* renamed from: b */
    public final void mo39865b(String str, float f) {
        C19340b bVar = this.f53431l;
        if (bVar.f53447a.mo39577a()) {
            bVar.f53447a.mo39575a(str, str, 1.0f, f);
        }
        bVar.f53451e.f53463a = str;
        bVar.f53451e.f53466d = "";
        bVar.f53451e.f53464b = f;
        bVar.f53451e.f53465c = f;
        bVar.f53451e.f53467e = 1.0f;
        bVar.f53451e.f53468f = false;
        mo39815a();
    }

    /* renamed from: a */
    public final void mo39864a(String str, float f) {
        if (f < 0.0f) {
            f = -1.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        C19340b bVar = this.f53431l;
        if (bVar.f53447a.mo39577a()) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            bVar.f53447a.mo39574a(str, f);
        }
        bVar.f53451e.f53463a = str;
        bVar.f53451e.f53466d = "";
        bVar.f53451e.f53464b = f;
        bVar.f53451e.f53465c = f;
        bVar.f53451e.f53467e = 1.0f;
        bVar.f53451e.f53468f = true;
        mo39815a();
    }
}
