package com.p683ss.android.ugc.aweme.photomovie;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.C0636b;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.photomovie.edit.C38748a;
import com.p683ss.android.ugc.aweme.photomovie.edit.C38752b;
import com.p683ss.android.ugc.aweme.photomovie.edit.C38753c;
import com.p683ss.android.ugc.aweme.photomovie.edit.cover.PhotoMovieCoverModule;
import com.p683ss.android.ugc.aweme.photomovie.edit.cover.PhotoMovieCoverModule.C38763a;
import com.p683ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerModule;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity */
public class PhotoMovieChooseCoverActivity extends AmeActivity {

    /* renamed from: a */
    public PhotoMoviePlayerModule f98491a;

    /* renamed from: b */
    private Handler f98492b;

    /* renamed from: c */
    private TextureView f98493c;

    /* renamed from: d */
    private FrameLayout f98494d;

    /* renamed from: e */
    private FrameLayout f98495e;

    /* renamed from: f */
    private PhotoMovieCoverModule f98496f;

    /* renamed from: g */
    private C38752b f98497g;

    public void onBackPressed() {
        C0636b.m1715a(this);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.q, R.anim.r);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f98492b.removeCallbacksAndMessages(null);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity", "onCreate", true);
        super.onCreate(bundle);
        C0636b.m1720b(this);
        setContentView((int) R.layout.ag1);
        this.f98493c = (TextureView) findViewById(R.id.bxs);
        this.f98494d = (FrameLayout) findViewById(R.id.b_7);
        this.f98495e = (FrameLayout) findViewById(R.id.b73);
        this.f98492b = new Handler();
        this.f98491a = new PhotoMoviePlayerModule(this, this.f98494d, (PhotoMovieContext) getIntent().getParcelableExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE));
        this.f98491a.f98705a.f98711d = true;
        this.f98497g = new C38753c(this.f98491a, new C38748a() {
            /* renamed from: a */
            public final boolean mo78655a() {
                return true;
            }
        });
        PhotoMovieCoverModule photoMovieCoverModule = new PhotoMovieCoverModule(this, this, this.f98495e, this.f98491a, this.f98497g, new C38763a() {
            /* renamed from: b */
            public final void mo78657b() {
                PhotoMovieChooseCoverActivity.this.finish();
            }

            /* renamed from: a */
            public final void mo78656a() {
                Intent intent = new Intent();
                intent.putExtra("KEY_VIDEO_COVER_CHOOSE_RESULT", PhotoMovieChooseCoverActivity.this.f98491a.mo78753a());
                PhotoMovieChooseCoverActivity.this.setResult(-1, intent);
                PhotoMovieChooseCoverActivity.this.finish();
            }
        });
        this.f98496f = photoMovieCoverModule;
        this.f98497g.mo78706a(this.f98496f);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity", "onCreate", false);
    }
}
