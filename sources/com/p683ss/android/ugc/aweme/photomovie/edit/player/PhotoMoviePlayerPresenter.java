package com.p683ss.android.ugc.aweme.photomovie.edit.player;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.p683ss.android.medialib.photomovie.C19355a;
import com.p683ss.android.medialib.photomovie.PhotoMoviePlayer;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity;
import com.p683ss.android.ugc.aweme.photomovie.edit.cover.PhotoMovieCoverModule;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e;
import com.p683ss.android.ugc.aweme.utils.C47804db;
import com.p683ss.android.ugc.aweme.utils.C47926h;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerPresenter */
public class PhotoMoviePlayerPresenter implements C0183j, SurfaceTextureListener, C38794a {

    /* renamed from: a */
    public PhotoMoviePlayer f98708a;

    /* renamed from: b */
    public PhotoMovieContext f98709b;

    /* renamed from: c */
    public C38793a f98710c;

    /* renamed from: d */
    public boolean f98711d;

    /* renamed from: e */
    private final C0184k f98712e;

    /* renamed from: f */
    private SurfaceTexture f98713f;

    /* renamed from: g */
    private TextureView f98714g;

    /* renamed from: h */
    private int f98715h;

    /* renamed from: i */
    private int f98716i;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerPresenter$a */
    public interface C38793a {
        /* renamed from: a */
        void mo78682a();
    }

    /* renamed from: a */
    public final PhotoMovieContext mo78753a() {
        return this.f98709b;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    /* renamed from: b */
    public final long mo78763b() {
        return this.f98708a.mo40169d();
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
        this.f98708a.mo40158a();
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        PhotoMoviePlayer photoMoviePlayer = this.f98708a;
        photoMoviePlayer.nativeResume(photoMoviePlayer.f53514a);
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        C0013i.m16a((Callable<TResult>) new Callable<Object>() {
            public final Object call() throws Exception {
                PhotoMoviePlayerPresenter.this.f98708a.mo40168c();
                return null;
            }
        });
    }

    /* renamed from: c */
    private void m86183c() {
        String str;
        this.f98708a = new PhotoMoviePlayer(C39618d.f101160a);
        C19355a aVar = null;
        if (this.f98709b.mMusicPath == null || TextUtils.equals(this.f98709b.mMusicPath, "")) {
            str = null;
        } else {
            str = C47926h.m103696a(this.f98709b.mMusicPath, C47804db.AUDIO);
        }
        int i = 2500;
        this.f98709b.photoTime = 2500;
        this.f98709b.transTime = 500;
        if (C44300e.m97041c()) {
            if (this.f98709b.getImageCount() > 24) {
                i = (int) ((60.0f / ((float) this.f98709b.getImageCount())) * 1000.0f);
            }
            aVar = new C19355a(1, i, 500);
            this.f98709b.photoTime = i;
        }
        this.f98708a.mo40160a(C47926h.m103697a(this.f98709b.mImageList, C47804db.IMAGE), str, aVar);
        this.f98708a.mo40165a(true);
        this.f98708a.mo40161a(this.f98709b.mPlayType);
        this.f98708a.mo40164a(this.f98709b.mFilterPath);
    }

    /* renamed from: a */
    public final void mo78754a(int i) {
        this.f98709b.mPlayType = i;
        this.f98708a.mo40161a(this.f98709b.mPlayType);
    }

    /* renamed from: b */
    public final void mo78764b(int i) {
        this.f98708a.mo40167b(i);
    }

    /* renamed from: a */
    public final void mo78762a(long j) {
        this.f98708a.mo40163a(j);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f98712e instanceof PhotoMovieEditActivity) {
            PhotoMovieEditActivity photoMovieEditActivity = (PhotoMovieEditActivity) this.f98712e;
            if (photoMovieEditActivity.f98521f != null && photoMovieEditActivity.f98521f.f98620d) {
                Bitmap bitmap = this.f98714g.getBitmap();
                if (photoMovieEditActivity.f98521f != null) {
                    PhotoMovieCoverModule photoMovieCoverModule = photoMovieEditActivity.f98521f;
                    if (photoMovieCoverModule.f98618b != null) {
                        photoMovieCoverModule.f98618b.setVideoCoverFrameView(bitmap);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo78758a(String str) {
        this.f98708a.mo40164a(str);
        this.f98709b.mFilterPath = str;
    }

    /* renamed from: a */
    public final void mo78761a(int i, int i2) {
        this.f98708a.mo40162a(i, i2);
    }

    /* renamed from: a */
    public final void mo78757a(C42482c cVar, String str) {
        this.f98709b.mMusicPath = str;
        this.f98709b.mMusic = cVar;
        this.f98708a.mo40166b();
        this.f98708a.mo40168c();
        m86183c();
        this.f98708a.mo40159a(new Surface(this.f98713f), this.f98715h, this.f98716i);
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f98713f = surfaceTexture;
        this.f98715h = i;
        this.f98716i = i2;
        PhotoMoviePlayer photoMoviePlayer = this.f98708a;
        photoMoviePlayer.nativeOnSizeChanged(photoMoviePlayer.f53514a, i, i2);
    }

    public PhotoMoviePlayerPresenter(C0184k kVar, TextureView textureView, PhotoMovieContext photoMovieContext) {
        kVar.getLifecycle().mo324a(this);
        this.f98712e = kVar;
        this.f98709b = photoMovieContext;
        this.f98714g = textureView;
        C39629l.m88232a().mo58586q();
        m86183c();
        textureView.setSurfaceTextureListener(this);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f98713f == null) {
            this.f98713f = surfaceTexture;
            this.f98715h = i;
            this.f98716i = i2;
            this.f98708a.mo40159a(new Surface(this.f98713f), this.f98715h, this.f98716i);
            if (this.f98710c != null) {
                this.f98710c.mo78682a();
            }
            if (this.f98711d) {
                this.f98708a.mo40158a();
            }
        } else {
            this.f98714g.setSurfaceTexture(this.f98713f);
        }
    }
}
