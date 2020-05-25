package com.p683ss.android.p1103ad.splash.core.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ad.splash.core.video.SSRenderSurfaceView */
public class SSRenderSurfaceView extends SSSurfaceView implements Callback {

    /* renamed from: c */
    private static ArrayList<C18706g> f51627c = new ArrayList<>();

    /* renamed from: a */
    private C18675a f51628a;

    /* renamed from: b */
    private C18706g f51629b;

    public View getView() {
        return this;
    }

    /* renamed from: a */
    private void m45454a() {
        this.f51629b = new C18706g(this);
        f51627c.add(this.f51629b);
    }

    public SSRenderSurfaceView(Context context) {
        super(context);
        m45454a();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f51628a != null) {
            this.f51628a.mo38193a(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.f51628a != null) {
            this.f51628a.mo38195b(surfaceHolder);
        }
    }

    /* renamed from: a */
    public final void mo38187a(C18675a aVar) {
        this.f51628a = aVar;
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator it = f51627c.iterator();
        while (it.hasNext()) {
            C18706g gVar = (C18706g) it.next();
            if (((Callback) gVar.f51746a.get()) == null) {
                holder.removeCallback(gVar);
                it.remove();
            }
        }
        holder.addCallback(this.f51629b);
    }

    public SSRenderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m45454a();
    }

    public SSRenderSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m45454a();
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.f51628a != null) {
            this.f51628a.mo38194a(surfaceHolder, i, i2, i3);
        }
    }
}
