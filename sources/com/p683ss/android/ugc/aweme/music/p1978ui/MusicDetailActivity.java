package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.push.C40884a;
import com.p683ss.android.ugc.aweme.utils.C47859eq;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicDetailActivity */
public class MusicDetailActivity extends AmeSlideSSActivity {

    /* renamed from: b */
    private String f95517b;

    /* renamed from: c */
    private String f95518c;

    /* renamed from: d */
    private ImmersionBar f95519d;

    /* renamed from: e */
    private String f95520e;

    /* renamed from: f */
    private String f95521f;

    /* renamed from: g */
    private String f95522g;

    /* renamed from: h */
    private String f95523h;

    /* renamed from: c */
    public final int mo48563c() {
        return 0;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        C40884a.m90455a(this);
    }

    public Resources getResources() {
        C47859eq.m103530a(this, this.mFirstResumed);
        return super.getResources();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f95519d != null) {
            this.f95519d.destroy();
        }
    }

    public void setStatusBarColor() {
        C11065a.m22394b(this);
        this.f95519d = ImmersionBar.with((Activity) this);
        if (this.f95519d != null) {
            this.f95519d.statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
        }
    }

    public Analysis getAnalysis() {
        long j;
        long j2 = 0;
        try {
            j = Long.parseLong(this.f95520e);
            try {
                j2 = Long.parseLong(this.f95517b);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j = 0;
        }
        return new Analysis().setLabelName("single_song").setExt_value(j).setValue(j2);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", true);
        if (C47859eq.m103531b(this)) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", false);
            return;
        }
        super.onResume();
        C47859eq.m103529a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", false);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bks);
        findViewById(R.id.yw).setBackgroundColor(getResources().getColor(R.color.a3i));
        C23794bh.m58390d().mo47101a((Activity) this);
        View findViewById = findViewById(R.id.csm);
        if (findViewById != null) {
            C26894c.m65022a(findViewById);
            C23729p.m58269c((Activity) this);
        }
        this.f95522g = getIntent().getStringExtra("partnerName");
        this.f95523h = getIntent().getStringExtra("partnerMusicId");
        this.f95520e = getIntent().getStringExtra("id");
        this.f95521f = getIntent().getStringExtra("process_id");
        this.f95517b = getIntent().getStringExtra("aweme_id");
        this.f95518c = getIntent().getStringExtra("extra_music_from");
        String stringExtra = getIntent().getStringExtra("sticker_id");
        String stringExtra2 = getIntent().getStringExtra("from_token");
        int intExtra = getIntent().getIntExtra("click_reason", 0);
        if (!TextUtils.isEmpty(this.f95520e) || !TextUtils.isEmpty(this.f95523h)) {
            if (TextUtils.isEmpty(this.f95521f)) {
                this.f95521f = "";
            }
            C0654k supportFragmentManager = getSupportFragmentManager();
            C0679r a = supportFragmentManager.mo2225a();
            Fragment a2 = supportFragmentManager.mo2224a("music_detail_fragment_tag");
            if (a2 == 0) {
                String str = this.f95520e;
                String str2 = this.f95517b;
                String str3 = this.f95518c;
                String str4 = this.f95523h;
                String str5 = this.f95522g;
                String str6 = this.f95521f;
                Bundle bundle2 = new Bundle(3);
                bundle2.putString("id", str);
                bundle2.putString("partnerName", str5);
                bundle2.putString("partnerMusicId", str4);
                bundle2.putString("aweme_id", str2);
                bundle2.putString("sticker_id", stringExtra);
                bundle2.putString("extra_music_from", str3);
                bundle2.putInt("click_reason", intExtra);
                bundle2.putString("from_token", stringExtra2);
                bundle2.putString("process_id", str6);
                MusicDetailFragment musicDetailFragment = new MusicDetailFragment();
                musicDetailFragment.setArguments(bundle2);
                a2 = musicDetailFragment;
            }
            a2.setUserVisibleHint(true);
            a.mo2192b(R.id.yw, a2, "music_detail_fragment_tag");
            a.mo2189b();
        } else {
            finish();
        }
        C23794bh.m58380F().mo7199a(4);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m83801a(Context context, String str, String str2) {
        Intent intent = new Intent(context, MusicDetailActivity.class);
        intent.putExtra("id", str);
        intent.putExtra("extra_music_from", str2);
        context.startActivity(intent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
