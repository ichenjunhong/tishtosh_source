package com.p683ss.android.ugc.aweme.mediaplayer;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0200t;
import android.graphics.SurfaceTexture;
import android.view.TextureView.SurfaceTextureListener;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule */
public class MediaPlayerModule implements C0183j, SurfaceTextureListener {

    /* renamed from: a */
    public String f93928a;

    /* renamed from: b */
    public C36756a f93929b;

    /* renamed from: c */
    public boolean f93930c;

    /* renamed from: d */
    public boolean f93931d;

    /* renamed from: e */
    boolean f93932e;

    /* renamed from: f */
    C36763h f93933f;

    /* renamed from: g */
    public SurfaceTextureListener f93934g;

    /* renamed from: h */
    public C0198r<C36764i> f93935h = new C0198r<>();

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
        mo75864b();
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        mo75863a();
    }

    /* renamed from: b */
    public void mo75864b() {
        this.f93929b.mo75874a();
        this.f93935h.postValue(C36764i.m82737a(true));
    }

    /* renamed from: a */
    public void mo75863a() {
        if (!this.f93930c && !this.f93931d) {
            this.f93929b.mo75880b();
            this.f93935h.postValue(C36764i.m82738b(true));
        }
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.f93929b.mo75874a();
        this.f93929b.mo75883c();
        this.f93929b.mo75884d();
        this.f93935h.postValue(new C36764i(6, true));
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f93934g != null) {
            this.f93934g.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
        this.f93929b.mo75883c();
        this.f93935h.postValue(new C36764i(5, true));
        if (this.f93934g != null) {
            return this.f93934g.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return false;
    }

    public MediaPlayerModule(C36756a aVar, C36763h hVar) {
        this.f93929b = aVar;
        this.f93933f = hVar;
        this.f93935h.observeForever(new C36758c(this));
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f93934g != null) {
            this.f93934g.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f93934g != null) {
            this.f93934g.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
        C0013i.m16a((Callable<TResult>) new C36759d<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C36760e<TResult,TContinuationResult>(this), C0013i.f25b).mo19a((C0011g<TResult, TContinuationResult>) new C36761f<TResult,TContinuationResult>(this, surfaceTexture)).mo20a((C0011g<TResult, TContinuationResult>) new C36762g<TResult,TContinuationResult>(this), C0013i.f25b);
    }
}
