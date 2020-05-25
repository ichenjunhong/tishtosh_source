package com.p683ss.android.ugc.aweme.photomovie;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.C0636b;
import android.support.p030v4.view.C1056u;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.p1484bx.C24446a;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext.C38719a;
import com.p683ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerPresenter;
import com.p683ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerPresenter.C38793a;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity */
public class PhotoMoviePreViewActivity extends AmeActivity implements OnClickListener, C38793a {

    /* renamed from: a */
    public Handler f98536a;

    /* renamed from: b */
    public TextureView f98537b;

    /* renamed from: c */
    public ImageView f98538c;

    /* renamed from: d */
    public int f98539d;

    /* renamed from: e */
    public int f98540e;

    public void onBackPressed() {
        C0636b.m1715a(this);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo78682a() {
        if (isViewValid()) {
            this.f98537b.bringToFront();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f98536a.removeCallbacksAndMessages(null);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C0636b.m1715a(this);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity", "onCreate", true);
        super.onCreate(bundle);
        C0636b.m1720b(this);
        setContentView((int) R.layout.afz);
        if (VERSION.SDK_INT >= 21) {
            AutoTransition autoTransition = new AutoTransition();
            getWindow().setSharedElementEnterTransition(autoTransition);
            AutoTransition autoTransition2 = new AutoTransition();
            getWindow().setSharedElementReturnTransition(autoTransition2);
            autoTransition.addListener(new C24446a() {
                public final void onTransitionEnd(Transition transition) {
                    PhotoMoviePreViewActivity.this.f98537b.setAlpha(1.0f);
                }

                public final void onTransitionStart(Transition transition) {
                    PhotoMoviePreViewActivity.this.f98537b.setAlpha(0.0f);
                }
            });
            autoTransition2.addListener(new C24446a() {
                public final void onTransitionStart(Transition transition) {
                    PhotoMoviePreViewActivity.this.f98537b.setAlpha(0.0f);
                }
            });
        }
        findViewById(R.id.ik).setOnClickListener(this);
        this.f98537b = (TextureView) findViewById(R.id.c4b);
        this.f98537b.setOnClickListener(this);
        this.f98536a = new Handler();
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) getIntent().getParcelableExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE);
        this.f98538c = (ImageView) findViewById(R.id.c49);
        C1056u.m3036a((View) this.f98538c, "transition_img_name");
        mo78683a(720, 960);
        photoMovieContext.getPhotoMovieCover(new C38719a() {
            /* renamed from: a */
            public final void mo58818a(final Bitmap bitmap, final int i, final int i2) {
                PhotoMoviePreViewActivity.this.f98536a.post(new Runnable() {
                    public final void run() {
                        if (bitmap != null) {
                            PhotoMoviePreViewActivity.this.f98539d = i;
                            PhotoMoviePreViewActivity.this.f98540e = i2;
                            PhotoMoviePreViewActivity.this.f98538c.setImageBitmap(bitmap);
                            PhotoMoviePreViewActivity.this.mo78683a(PhotoMoviePreViewActivity.this.f98539d, PhotoMoviePreViewActivity.this.f98540e);
                            PhotoMoviePreViewActivity.this.f98538c.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                                public final boolean onPreDraw() {
                                    PhotoMoviePreViewActivity.this.f98538c.getViewTreeObserver().removeOnPreDrawListener(this);
                                    C0636b.m1721c(PhotoMoviePreViewActivity.this);
                                    return true;
                                }
                            });
                            return;
                        }
                        C0636b.m1721c(PhotoMoviePreViewActivity.this);
                    }
                });
            }
        });
        new PhotoMoviePlayerPresenter(this, this.f98537b, photoMovieContext).f98710c = this;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo78683a(int i, int i2) {
        if (i != 0 && i2 != 0) {
            int b = C23724k.m58224b(this);
            LayoutParams layoutParams = this.f98538c.getLayoutParams();
            int i3 = (int) (((((float) b) * 1.0f) * ((float) i2)) / ((float) i));
            layoutParams.width = b;
            layoutParams.height = i3;
            this.f98538c.setLayoutParams(layoutParams);
        }
    }
}
