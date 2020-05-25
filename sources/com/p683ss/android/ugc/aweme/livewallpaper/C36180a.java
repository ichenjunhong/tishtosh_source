package com.p683ss.android.ugc.aweme.livewallpaper;

import android.graphics.Rect;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.livewallpaper.egl.C36223j;
import com.p683ss.android.ugc.aweme.livewallpaper.egl.C36225k;
import com.p683ss.android.ugc.aweme.video.C48016e;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.a */
public final class C36180a {

    /* renamed from: a */
    MediaPlayer f92637a;

    /* renamed from: b */
    public String f92638b;

    /* renamed from: c */
    private C36184a f92639c;

    /* renamed from: d */
    private C36225k f92640d;

    /* renamed from: e */
    private C36223j f92641e;

    /* renamed from: f */
    private SurfaceHolder f92642f;

    /* renamed from: g */
    private Surface f92643g;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.a$a */
    public interface C36184a {
        /* renamed from: a */
        void mo74904a(boolean z, String str, String str2);
    }

    public C36180a(C36184a aVar) {
        this.f92639c = aVar;
    }

    /* renamed from: a */
    public final void mo74924a(SurfaceHolder surfaceHolder) {
        if (this.f92637a != null) {
            this.f92637a.release();
            this.f92637a = null;
        }
        if (this.f92643g != null) {
            this.f92643g.release();
            this.f92643g = null;
        }
        if (this.f92641e != null) {
            this.f92641e.mo75000e();
        }
        if (this.f92640d != null) {
            this.f92640d.release();
        }
        this.f92642f = null;
    }

    /* renamed from: a */
    public final void mo74928a(boolean z, String str) {
        if (this.f92639c != null) {
            this.f92639c.mo74904a(z, this.f92638b, str);
        }
    }

    /* renamed from: a */
    public final void mo74925a(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f92642f = surfaceHolder;
        if (this.f92641e != null) {
            this.f92641e.mo74994a(i2, i3);
        }
    }

    /* renamed from: a */
    public final void mo74927a(String str, int i, int i2, boolean z) {
        if (!C48016e.m103944b(str)) {
            mo74928a(false, "onRefresh video is not exists");
        } else if (this.f92642f != null) {
            Surface surface = this.f92642f.getSurface();
            Rect surfaceFrame = this.f92642f.getSurfaceFrame();
            int height = surfaceFrame.height();
            int width = surfaceFrame.width();
            Pair<Float, Float> a = m81675a(width, height, i, i2, true);
            if (this.f92637a != null) {
                this.f92637a.release();
                this.f92637a = null;
            }
            if (this.f92643g != null) {
                this.f92643g.release();
                this.f92643g = null;
            }
            if (this.f92641e != null) {
                this.f92641e.mo75000e();
            }
            if (this.f92640d != null) {
                this.f92640d.release();
            }
            this.f92641e = new C36223j(surface, null);
            this.f92641e.f92723k = a;
            this.f92641e.mo75001f();
            this.f92640d = this.f92641e.mo75002g();
            if (this.f92640d != null) {
                this.f92640d.setDefaultBufferSize(width, height);
                surface = new Surface(this.f92640d);
            }
            this.f92643g = surface;
            this.f92637a = new MediaPlayer();
            try {
                this.f92637a.setSurface(surface);
                this.f92637a.setDataSource(str);
                this.f92637a.setLooping(true);
                this.f92637a.setVolume(0.0f, 0.0f);
                this.f92637a.prepare();
                this.f92637a.start();
                this.f92637a.setOnInfoListener(new OnInfoListener() {
                    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                        if (i == 3) {
                            C36180a.this.mo74928a(true, "");
                        }
                        return false;
                    }
                });
                this.f92637a.setOnErrorListener(new OnErrorListener() {
                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        C36180a aVar = C36180a.this;
                        StringBuilder sb = new StringBuilder("media play error what = ");
                        sb.append(i);
                        sb.append(" extra = ");
                        sb.append(i2);
                        aVar.mo74928a(false, sb.toString());
                        return false;
                    }
                });
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("media play exception ");
                sb.append(e.getMessage());
                mo74928a(false, sb.toString());
                C32458a.m75148a((Throwable) new Exception("WallPaperPlayerEngine", e));
            }
        }
    }

    /* renamed from: a */
    private static Pair<Float, Float> m81675a(int i, int i2, int i3, int i4, boolean z) {
        float f;
        float f2;
        float f3 = 1.0f;
        if (i4 <= 0 || i3 <= 0 || i2 <= 0 || i <= 0) {
            return new Pair<>(Float.valueOf(1.0f), Float.valueOf(1.0f));
        }
        float f4 = ((float) i3) / ((float) i4);
        float f5 = ((float) i) / ((float) i2);
        if (!z) {
            if (f4 > f5) {
                f2 = f5 / f4;
            } else {
                f = f4 / f5;
                return new Pair<>(Float.valueOf(f), Float.valueOf(f3));
            }
        } else if (f4 < f5) {
            f2 = f5 / f4;
        } else {
            f = f4 / f5;
            return new Pair<>(Float.valueOf(f), Float.valueOf(f3));
        }
        f3 = f2;
        f = 1.0f;
        return new Pair<>(Float.valueOf(f), Float.valueOf(f3));
    }

    /* renamed from: a */
    public final void mo74926a(SurfaceHolder surfaceHolder, String str, int i, int i2, boolean z) {
        this.f92642f = surfaceHolder;
        if (this.f92642f != null) {
            Surface surface = this.f92642f.getSurface();
            Rect surfaceFrame = this.f92642f.getSurfaceFrame();
            int height = surfaceFrame.height();
            int width = surfaceFrame.width();
            Pair<Float, Float> a = m81675a(width, height, i, i2, true);
            if (this.f92637a != null) {
                this.f92637a.release();
                this.f92637a = null;
            }
            if (this.f92643g != null) {
                this.f92643g.release();
                this.f92643g = null;
            }
            if (this.f92641e != null) {
                this.f92641e.mo75000e();
            }
            if (this.f92640d != null) {
                this.f92640d.release();
            }
            this.f92641e = new C36223j(surface, null);
            this.f92641e.f92723k = a;
            this.f92641e.mo75001f();
            this.f92640d = this.f92641e.mo75002g();
            if (this.f92640d != null) {
                this.f92640d.setDefaultBufferSize(width, height);
                surface = new Surface(this.f92640d);
            }
            this.f92643g = surface;
            this.f92637a = new MediaPlayer();
            try {
                this.f92637a.setSurface(surface);
                this.f92637a.setDataSource(str);
                this.f92637a.setLooping(true);
                this.f92637a.setVolume(0.0f, 0.0f);
                this.f92637a.prepare();
                this.f92637a.start();
                this.f92637a.setOnErrorListener(new OnErrorListener() {
                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        C36180a aVar = C36180a.this;
                        StringBuilder sb = new StringBuilder("onSurfaceCreated media play error what = ");
                        sb.append(i);
                        sb.append(" extra = ");
                        sb.append(i2);
                        aVar.mo74928a(false, sb.toString());
                        return false;
                    }
                });
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("onSurfaceCreated media play exception ");
                sb.append(e.getMessage());
                mo74928a(false, sb.toString());
            }
        }
    }
}
