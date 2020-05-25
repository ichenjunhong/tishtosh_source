package com.p683ss.android.ugc.aweme.discover.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28488aq;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity */
public final class MusicianMusicListActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C27744a f72814a = new C27744a(null);

    /* renamed from: b */
    private ImmersionBar f72815b;

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity$a */
    public static final class C27744a {
        private C27744a() {
        }

        public /* synthetic */ C27744a(C52707g gVar) {
            this();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar immersionBar = this.f72815b;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public final void setStatusBarColor() {
        this.f72815b = ImmersionBar.with((Activity) this).fitsSystemWindows(true).statusBarDarkFont(true);
        ImmersionBar immersionBar = this.f72815b;
        if (immersionBar != null) {
            immersionBar.init();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.brr);
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("param_music_author");
            if (stringExtra != null) {
                int intExtra = getIntent().getIntExtra("param_holder_postion", 0);
                C52711k.m112240b(stringExtra, "author");
                C28488aq aqVar = new C28488aq();
                Bundle bundle2 = new Bundle();
                bundle2.putString("param_music_author", stringExtra);
                bundle2.putInt("param_holder_postion", intExtra);
                aqVar.setArguments(bundle2);
                getSupportFragmentManager().mo2225a().mo2192b(R.id.ajf, aqVar, "container").mo2195c();
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity", "onCreate", false);
    }
}
