package com.p683ss.android.ugc.aweme.p1706fe.method.upload;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.VideoView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity */
public final class PreviewUploadActivity extends AmeSSActivity {

    /* renamed from: a */
    public String f78118a;

    /* renamed from: b */
    private HashMap f78119b;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity$a */
    static final class C29935a implements OnPreparedListener {

        /* renamed from: a */
        final /* synthetic */ PreviewUploadActivity f78120a;

        C29935a(PreviewUploadActivity previewUploadActivity) {
            this.f78120a = previewUploadActivity;
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            DmtTextView dmtTextView = (DmtTextView) this.f78120a.mo60125a(R.id.dlu);
            C52711k.m112236a((Object) dmtTextView, "upload_confirm");
            dmtTextView.setVisibility(0);
            DmtTextView dmtTextView2 = (DmtTextView) this.f78120a.mo60125a(R.id.dlt);
            C52711k.m112236a((Object) dmtTextView2, "upload_cancel");
            dmtTextView2.setVisibility(0);
            C52711k.m112236a((Object) mediaPlayer, "it");
            mediaPlayer.setLooping(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity$b */
    static final class C29936b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewUploadActivity f78121a;

        C29936b(PreviewUploadActivity previewUploadActivity) {
            this.f78121a = previewUploadActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Intent intent = new Intent();
            intent.putExtra("filePath", this.f78121a.f78118a);
            this.f78121a.setResult(-1, intent);
            this.f78121a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity$c */
    static final class C29937c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewUploadActivity f78122a;

        C29937c(PreviewUploadActivity previewUploadActivity) {
            this.f78122a = previewUploadActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Intent intent = new Intent();
            intent.putExtra("filePath", this.f78122a.f78118a);
            this.f78122a.setResult(0, intent);
            this.f78122a.finish();
        }
    }

    /* renamed from: a */
    public final View mo60125a(int i) {
        if (this.f78119b == null) {
            this.f78119b = new HashMap();
        }
        View view = (View) this.f78119b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f78119b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (((VideoView) mo60125a(R.id.dqi)) != null) {
            ((VideoView) mo60125a(R.id.dqi)).suspend();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onResume", true);
        super.onResume();
        if (((VideoView) mo60125a(R.id.dqi)) != null) {
            VideoView videoView = (VideoView) mo60125a(R.id.dqi);
            C52711k.m112236a((Object) videoView, "video_view");
            if (!videoView.isPlaying()) {
                ((VideoView) mo60125a(R.id.dqi)).start();
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onResume", false);
    }

    public final void onStop() {
        super.onStop();
        if (((VideoView) mo60125a(R.id.dqi)) != null) {
            VideoView videoView = (VideoView) mo60125a(R.id.dqi);
            C52711k.m112236a((Object) videoView, "video_view");
            if (videoView.isPlaying()) {
                ((VideoView) mo60125a(R.id.dqi)).pause();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b7z);
        this.f78118a = getIntent().getStringExtra("filePath");
        if (this.f78118a != null) {
            VideoView videoView = (VideoView) mo60125a(R.id.dqi);
            videoView.setVisibility(0);
            videoView.setVideoPath(this.f78118a);
            videoView.setOnPreparedListener(new C29935a(this));
        }
        FrameLayout frameLayout = (FrameLayout) mo60125a(R.id.dlw);
        Window window = getWindow();
        C52711k.m112236a((Object) window, "window");
        frameLayout.setBackgroundColor(window.getNavigationBarColor());
        ((DmtTextView) mo60125a(R.id.dlu)).setOnClickListener(new C29936b(this));
        ((DmtTextView) mo60125a(R.id.dlt)).setOnClickListener(new C29937c(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onCreate", false);
    }
}
