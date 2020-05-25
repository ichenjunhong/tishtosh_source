package com.p683ss.android.ugc.aweme.similarvideo.p2270ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.similarvideo.p2270ui.SimilarVideoFragment.C45654a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoActivity */
public class SimilarVideoActivity extends AmeSSActivity {

    /* renamed from: a */
    public static Aweme f115436a;

    /* renamed from: b */
    public static Activity f115437b;

    public void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.e8);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("aweme_to_similar")) {
            f115436a = (Aweme) intent.getSerializableExtra("aweme_to_similar");
        }
        View findViewById = findViewById(R.id.csm);
        if (VERSION.SDK_INT >= 19) {
            findViewById.getLayoutParams().height = C11065a.m22390a((Context) this);
        }
        findViewById(R.id.ayq).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SimilarVideoActivity.this.finish();
            }
        });
        SimilarVideoFragment similarVideoFragment = null;
        if (f115436a == null) {
            str = null;
        } else {
            str = f115436a.getAid();
        }
        if (str != null) {
            SimilarVideoFragment.f115440a = str;
            similarVideoFragment = new SimilarVideoFragment();
        }
        if (similarVideoFragment != null) {
            similarVideoFragment.f115441b = new C45654a() {
                /* renamed from: a */
                public final void mo92041a() {
                    if (SimilarVideoActivity.f115436a != null && SimilarVideoActivity.f115436a.getVideo() != null) {
                        C23515d.m57669a((RemoteImageView) SimilarVideoActivity.this.findViewById(R.id.cok), SimilarVideoActivity.f115436a.getVideo().getCover());
                    }
                }
            };
            C0679r a = getSupportFragmentManager().mo2225a();
            a.mo2192b(R.id.coj, similarVideoFragment, "similar_video_contain");
            a.mo2195c();
        }
    }
}
