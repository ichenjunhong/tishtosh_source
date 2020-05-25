package com.p683ss.android.ugc.aweme.share.gif.p2158ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.share.gif.C42016a;
import com.p683ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity */
public class VideoShare2GifEditActivity extends AmeActivity {

    /* renamed from: a */
    boolean f106401a = true;

    /* renamed from: b */
    VideoShare2GifEditContext f106402b;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.arz);
    }

    public void resolveUiClickEvent(View view) {
        if (view.getId() == R.id.ij) {
            C26890h.m65011a("gif_quit_editing", (Map<String, String>) new HashMap<String,String>());
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ew);
        ButterKnife.bind((Activity) this);
        this.f106402b = (VideoShare2GifEditContext) getIntent().getParcelableExtra("extra_data");
        if (this.f106402b == null || !C48016e.m103944b(this.f106402b.f106354a)) {
            finish();
        }
        findViewById(R.id.bqm).setOnClickListener(new C47687av() {
            /* renamed from: a */
            public final void mo59929a(View view) {
                VideoShare2GifEditActivity videoShare2GifEditActivity = VideoShare2GifEditActivity.this;
                if (videoShare2GifEditActivity.f106401a && videoShare2GifEditActivity.f106402b != null && !TextUtils.isEmpty(videoShare2GifEditActivity.f106402b.f106354a)) {
                    videoShare2GifEditActivity.f106401a = false;
                    videoShare2GifEditActivity.f106402b.f106359f = C42016a.m91990b();
                    VideoShare2GifEditContext videoShare2GifEditContext = videoShare2GifEditActivity.f106402b;
                    String str = videoShare2GifEditActivity.f106402b.f106355b;
                    C52711k.m112240b(str, "fileName");
                    String str2 = C42016a.f106372a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(".gif");
                    String path = new File(str2, sb.toString()).getPath();
                    C52711k.m112236a((Object) path, "File(path, \"$fileName.gif\").path");
                    videoShare2GifEditContext.f106358e = path;
                    C45547d b = C45547d.m99208b(videoShare2GifEditActivity, videoShare2GifEditActivity.getResources().getString(R.string.b85));
                    b.setIndeterminate(false);
                    AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().transformService().video2gif(videoShare2GifEditActivity.f106402b, new C42030b(b), new C42031c(videoShare2GifEditActivity, b));
                }
            }
        });
        if (getSupportFragmentManager().mo2222a((int) R.id.agt) == null) {
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C42029a(this));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            finish();
        }
    }

    /* renamed from: a */
    public static void m91996a(Context context, String str, String str2, boolean z, String str3, String str4, String str5) {
        Intent intent = new Intent(context, VideoShare2GifEditActivity.class);
        VideoShare2GifEditContext videoShare2GifEditContext = new VideoShare2GifEditContext();
        videoShare2GifEditContext.f106355b = str;
        videoShare2GifEditContext.f106371r = str5;
        videoShare2GifEditContext.f106370q = str4;
        videoShare2GifEditContext.f106369p = str2;
        videoShare2GifEditContext.f106354a = str3;
        videoShare2GifEditContext.f106356c = z;
        intent.putExtra("extra_data", videoShare2GifEditContext);
        context.startActivity(intent);
    }
}
