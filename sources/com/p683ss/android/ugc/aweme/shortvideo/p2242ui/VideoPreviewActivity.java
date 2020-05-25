package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.net.Uri;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.medialib.FFMpegManager;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.p683ss.android.ugc.aweme.utils.ZoomAnimationUtils.ZoomInfo;
import com.ss.android.ugc.trill.R;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity */
public class VideoPreviewActivity extends AmeActivity {

    /* renamed from: a */
    static int f113716a = 250;

    /* renamed from: b */
    long f113717b;

    /* renamed from: c */
    Timer f113718c;

    /* renamed from: d */
    public MediaPlayer f113719d;

    /* renamed from: e */
    public String f113720e;

    /* renamed from: f */
    FrameLayout f113721f;

    /* renamed from: g */
    private ZoomInfo f113722g;

    /* renamed from: h */
    private int f113723h;

    /* renamed from: i */
    private int f113724i;

    /* renamed from: j */
    private TextureView f113725j;

    /* renamed from: k */
    private View f113726k;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo91156a() {
        if (this.f113719d != null) {
            if (this.f113719d.isPlaying()) {
                this.f113719d.stop();
            }
            this.f113719d.release();
            this.f113719d = null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        mo91156a();
        if (this.f113718c != null) {
            this.f113718c.cancel();
            this.f113718c = null;
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f113719d != null && this.f113719d.isPlaying()) {
            this.f113719d.pause();
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity", "onResume", true);
        super.onResume();
        if (this.f113719d != null && !this.f113719d.isPlaying()) {
            this.f113719d.start();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity", "onResume", false);
    }

    public void onBackPressed() {
        ZoomAnimationUtils.m103151a(this.f113726k, new ColorDrawable(getResources().getColor(17170444)), NormalGiftView.ALPHA_255, 0);
        ZoomInfo zoomInfo = this.f113722g;
        TextureView textureView = this.f113725j;
        C449203 r3 = new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                VideoPreviewActivity videoPreviewActivity = VideoPreviewActivity.this;
                if (videoPreviewActivity.f113719d != null && videoPreviewActivity.f113719d.isPlaying()) {
                    videoPreviewActivity.f113719d.pause();
                }
                videoPreviewActivity.finish();
            }
        };
        int i = zoomInfo.f120131c;
        int i2 = zoomInfo.f120132d;
        int width = textureView.getWidth();
        int height = textureView.getHeight();
        int i3 = zoomInfo.f120129a;
        int i4 = zoomInfo.f120130b;
        float f = ((float) i) / ((float) width);
        float f2 = ((float) i2) / ((float) height);
        int[] iArr = new int[2];
        textureView.getLocationOnScreen(iArr);
        int i5 = i3 - iArr[0];
        int i6 = i4 - iArr[1];
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        textureView.setVisibility(0);
        ViewPropertyAnimator animate = textureView.animate();
        animate.setDuration(300).scaleX(f).scaleY(f2).translationX((float) i5).translationY((float) i6);
        animate.setListener(r3);
        animate.start();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dg);
        this.f113720e = getIntent().getStringExtra("file_path");
        this.f113722g = (ZoomInfo) getIntent().getParcelableExtra("extra_zoom_info");
        this.f113718c = new Timer("video_preview_player_timer");
        int[] a = FFMpegManager.m46826a().mo39233a(this.f113720e);
        if (a[0] == 0) {
            this.f113717b = (long) a[1];
            this.f113723h = a[2];
            this.f113724i = a[3];
            FFMpegManager.m46826a().mo39234b();
        } else {
            C9432q.m18672a((Context) this, (int) R.string.cn4);
            FFMpegManager.m46826a().mo39234b();
            finish();
        }
        this.f113725j = (TextureView) findViewById(R.id.cva);
        this.f113725j.setSurfaceTextureListener(new SurfaceTextureListener() {
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                VideoPreviewActivity.this.mo91156a();
                return true;
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                Uri parse = Uri.parse(VideoPreviewActivity.this.f113720e);
                VideoPreviewActivity.this.f113719d = MediaPlayer.create(VideoPreviewActivity.this, parse);
                if (VideoPreviewActivity.this.f113719d == null) {
                    C9432q.m18672a((Context) VideoPreviewActivity.this, (int) R.string.cph);
                    VideoPreviewActivity.this.finish();
                    return;
                }
                VideoPreviewActivity videoPreviewActivity = VideoPreviewActivity.this;
                if (((long) videoPreviewActivity.f113719d.getDuration()) - videoPreviewActivity.f113717b > ((long) VideoPreviewActivity.f113716a)) {
                    videoPreviewActivity.f113719d.setLooping(false);
                    videoPreviewActivity.f113718c.schedule(new TimerTask() {
                        public final void run() {
                            if (VideoPreviewActivity.this.f113719d != null) {
                                try {
                                    VideoPreviewActivity.this.f113719d.seekTo(0);
                                } catch (IllegalStateException e) {
                                    C47625i.m103103a(e.toString());
                                }
                            }
                        }
                    }, videoPreviewActivity.f113717b, videoPreviewActivity.f113717b);
                } else {
                    videoPreviewActivity.f113719d.setLooping(true);
                }
                VideoPreviewActivity.this.f113719d.setAudioStreamType(3);
                VideoPreviewActivity.this.f113719d.setSurface(new Surface(surfaceTexture));
                VideoPreviewActivity.this.f113719d.start();
                VideoPreviewActivity.this.f113719d.setOnCompletionListener(new OnCompletionListener() {
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                    }
                });
                VideoPreviewActivity.this.f113719d.setOnErrorListener(new OnErrorListener() {
                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        if (VideoPreviewActivity.this.f113719d != null) {
                            VideoPreviewActivity.this.f113719d.release();
                            VideoPreviewActivity.this.f113719d = null;
                        }
                        return false;
                    }
                });
            }
        });
        C22452a.m55494a(this.f113725j, this.f113723h, this.f113724i);
        this.f113721f = (FrameLayout) findViewById(R.id.ajo);
        this.f113721f.setOnClickListener(new C45000ay(this));
        this.f113726k = findViewById(16908290);
        ZoomInfo zoomInfo = this.f113722g;
        TextureView textureView = this.f113725j;
        textureView.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener(textureView, zoomInfo, null) {

            /* renamed from: a */
            final /* synthetic */ View f120124a;

            /* renamed from: b */
            final /* synthetic */ ZoomInfo f120125b;

            /* renamed from: c */
            final /* synthetic */ AnimatorListener f120126c;

            public final boolean onPreDraw() {
                this.f120124a.getViewTreeObserver().removeOnPreDrawListener(this);
                int i = this.f120125b.f120131c;
                int i2 = this.f120125b.f120132d;
                float width = ((float) this.f120124a.getWidth()) / ((float) i);
                float height = ((float) this.f120124a.getHeight()) / ((float) i2);
                int[] iArr = new int[2];
                this.f120124a.getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i4 = this.f120125b.f120129a - i3;
                int i5 = this.f120125b.f120130b - iArr[1];
                this.f120124a.setPivotX(0.0f);
                this.f120124a.setPivotY(0.0f);
                this.f120124a.setAlpha(0.0f);
                this.f120124a.setTranslationX((float) i4);
                this.f120124a.setTranslationY((float) i5);
                if (width == 0.0f || height == 0.0f) {
                    return false;
                }
                this.f120124a.setScaleX(1.0f / width);
                this.f120124a.setScaleY(1.0f / height);
                this.f120124a.setVisibility(0);
                ViewPropertyAnimator animate = this.f120124a.animate();
                animate.setDuration(300).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationX(0.0f).translationY(0.0f);
                animate.setInterpolator(new AccelerateDecelerateInterpolator());
                if (this.f120126c != null) {
                    animate.setListener(this.f120126c);
                }
                animate.start();
                return true;
            }

            {
                this.f120124a = r1;
                this.f120125b = r2;
                this.f120126c = r3;
            }
        });
        ZoomAnimationUtils.m103151a(this.f113726k, new ColorDrawable(getResources().getColor(17170444)), 0, NormalGiftView.ALPHA_255);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity", "onCreate", false);
    }
}
