package com.twitter.sdk.android.tweetui;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.ugc.trill.R;
import com.twitter.sdk.android.core.internal.scribe.C52144aa;
import com.twitter.sdk.android.tweetui.internal.C52296f;
import com.twitter.sdk.android.tweetui.internal.C52296f.C52297a;
import com.twitter.sdk.android.tweetui.internal.VideoView;
import java.io.Serializable;

public class PlayerActivity extends Activity {

    /* renamed from: a */
    static final C52313s f130118a = new C52314t(C52312r.m111747a());

    /* renamed from: b */
    C52270g f130119b;

    /* renamed from: com.twitter.sdk.android.tweetui.PlayerActivity$a */
    public static class C52261a implements Serializable {
        public final String callToActionText;
        public final String callToActionUrl;
        public final boolean looping;
        public final boolean showVideoControls;
        public final String url;

        public C52261a(String str, boolean z, boolean z2, String str2, String str3) {
            this.url = str;
            this.looping = z;
            this.showVideoControls = z2;
            this.callToActionText = str2;
            this.callToActionUrl = str3;
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, R.anim.d4);
    }

    public void onDestroy() {
        VideoView videoView = this.f130119b.f130144a;
        if (videoView.f130200f != null) {
            videoView.f130200f.stop();
            videoView.f130200f.release();
            videoView.f130200f = null;
            videoView.f130197c = 0;
            videoView.f130198d = 0;
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C52270g gVar = this.f130119b;
        gVar.f130150g = gVar.f130144a.mo109074c();
        gVar.f130149f = gVar.f130144a.getCurrentPosition();
        gVar.f130144a.mo109073b();
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C52270g gVar = this.f130119b;
        if (gVar.f130149f != 0) {
            gVar.f130144a.mo109072a(gVar.f130149f);
        }
        if (gVar.f130150g) {
            gVar.f130144a.mo109071a();
            gVar.f130145b.f130191f.sendEmptyMessage(1001);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ast);
        C52261a aVar = (C52261a) getIntent().getSerializableExtra("PLAYER_ITEM");
        this.f130119b = new C52270g(findViewById(16908290), new C52297a() {
            /* renamed from: a */
            public final void mo109009a() {
                PlayerActivity.this.finish();
                PlayerActivity.this.overridePendingTransition(0, R.anim.d4);
            }
        });
        C52270g gVar = this.f130119b;
        try {
            if (!(aVar.callToActionText == null || aVar.callToActionUrl == null)) {
                gVar.f130147d.setVisibility(0);
                gVar.f130147d.setText(aVar.callToActionText);
                gVar.f130147d.setOnClickListener(new C52303k(gVar, aVar.callToActionUrl));
                gVar.f130148e.setOnClickListener(new C52304l(gVar));
            }
            boolean z = aVar.looping;
            boolean z2 = aVar.showVideoControls;
            if (!z || z2) {
                gVar.f130144a.setMediaController(gVar.f130145b);
            } else {
                gVar.f130145b.setVisibility(4);
                gVar.f130144a.setOnClickListener(new C52302j(gVar));
            }
            gVar.f130144a.setOnTouchListener(C52296f.m111732a(gVar.f130144a, gVar.f130151h));
            gVar.f130144a.setOnPreparedListener(new C52271h(gVar));
            gVar.f130144a.setOnInfoListener(new C52272i(gVar));
            Uri parse = Uri.parse(aVar.url);
            VideoView videoView = gVar.f130144a;
            boolean z3 = aVar.looping;
            videoView.f130196b = parse;
            videoView.f130212r = z3;
            videoView.f130211q = 0;
            videoView.mo109079d();
            videoView.requestLayout();
            videoView.invalidate();
            gVar.f130144a.requestFocus();
        } catch (Exception unused) {
        }
        f130118a.mo109124a((C52144aa) getIntent().getSerializableExtra("SCRIBE_ITEM"));
    }
}
