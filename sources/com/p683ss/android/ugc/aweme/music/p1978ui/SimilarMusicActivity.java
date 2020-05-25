package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseActivity;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicActivity */
public final class SimilarMusicActivity extends JediBaseActivity {

    /* renamed from: b */
    public static final C37487a f95669b = new C37487a(null);

    /* renamed from: c */
    private ImmersionBar f95670c;

    /* renamed from: d */
    private HashMap f95671d;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicActivity$a */
    public static final class C37487a {
        private C37487a() {
        }

        public /* synthetic */ C37487a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final View mo48631a(int i) {
        if (this.f95671d == null) {
            this.f95671d = new HashMap();
        }
        View view = (View) this.f95671d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f95671d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.SimilarMusicActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.SimilarMusicActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.SimilarMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar immersionBar = this.f95670c;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public final void setStatusBarColor() {
        this.f95670c = ImmersionBar.with((Activity) this);
        ImmersionBar immersionBar = this.f95670c;
        if (immersionBar != null) {
            ImmersionBar statusBarDarkFont = immersionBar.statusBarDarkFont(true);
            if (statusBarDarkFont != null) {
                ImmersionBar statusBarColor = statusBarDarkFont.statusBarColor((int) R.color.a0_);
                if (statusBarColor != null) {
                    statusBarColor.init();
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.SimilarMusicActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.blg);
        String stringExtra = getIntent().getStringExtra("music_id");
        String stringExtra2 = getIntent().getStringExtra("music_title");
        String stringExtra3 = getIntent().getStringExtra("anthor_id");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        String stringExtra4 = getIntent().getStringExtra("enter_type");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        C52711k.m112236a((Object) stringExtra, "musicId");
        C52711k.m112236a((Object) stringExtra2, "musicTitle");
        C52711k.m112240b(stringExtra, "musicId");
        C52711k.m112240b(stringExtra2, "musicTitle");
        C52711k.m112240b(stringExtra3, "eventType");
        C52711k.m112240b(stringExtra4, "authorId");
        C37560bq bqVar = new C37560bq();
        Bundle bundle2 = new Bundle();
        bundle2.putString("music_id", stringExtra);
        bundle2.putString("music_title", stringExtra2);
        bundle2.putString("anthor_id", stringExtra4);
        bundle2.putString("enter_type", stringExtra3);
        bqVar.setArguments(bundle2);
        getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, (Fragment) bqVar).mo2189b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.SimilarMusicActivity", "onCreate", false);
    }
}
