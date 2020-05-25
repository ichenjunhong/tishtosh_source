package com.p683ss.android.ugc.aweme.choosemusic.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.widget.Space;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.C23579a;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.base.widget.p1423b.C23749a;
import com.p683ss.android.ugc.aweme.choosemusic.fragment.C24923c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.music.adapter.C37292h.C37299a;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity */
public class ChooseMusicActivity extends AmeSSActivity {

    /* renamed from: a */
    public DmtTextView f65661a;

    /* renamed from: b */
    public boolean f65662b;

    /* renamed from: c */
    public ViewPagerBottomSheetBehavior f65663c;

    /* renamed from: d */
    int f65664d;

    /* renamed from: e */
    private TextView f65665e;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        mo50683a();
        super.onBackPressed();
    }

    public void finish() {
        super.finish();
        KeyboardUtils.m58184c(this.f65661a);
        overridePendingTransition(0, R.anim.r);
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("music_homepage");
    }

    /* renamed from: b */
    private static boolean m60346b() {
        boolean z;
        boolean z2 = false;
        try {
            z = C32816h.m75716b().getEnableLocalMusicEntrance().booleanValue();
        } catch (C10174a unused) {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (C37249a.m83512c() == 0) {
            z2 = true;
        }
        return z2;
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
        AVExternalServiceImpl.getAVServiceImpl_Monster().provideAVPerformance().leave(this, "music_select");
    }

    /* renamed from: a */
    public final void mo50683a() {
        if (this.f65662b) {
            AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().setCurMusic(null);
            Intent intent = new Intent();
            intent.putExtra("is_cancel_current_choose_music", true);
            setResult(-1, intent);
        }
    }

    public void onPause() {
        super.onPause();
        AVExternalServiceImpl.getAVServiceImpl_Monster().provideAVPerformance().pause(this, "music_select", getIntent().getStringExtra("creation_id"), getIntent().getStringExtra("shoot_way"));
    }

    public void onCreate(Bundle bundle) {
        int i;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onCreate", true);
        super.onCreate(bundle);
        AVExternalServiceImpl.getAVServiceImpl_Monster().provideAVPerformance().enter(this, "music_select");
        superOverridePendingTransition(R.anim.q, 0);
        setContentView((int) R.layout.am);
        this.f65661a = (DmtTextView) findViewById(R.id.dhb);
        this.f65661a.setText(getIntent().getStringExtra("title"));
        this.f65661a.setFontType(C10751d.f28903b);
        this.f65665e = (TextView) findViewById(R.id.df2);
        TextView textView = this.f65665e;
        if (m60346b()) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        this.f65665e.setOnClickListener(C23749a.m58284a(new C24812b(this)));
        findViewById(R.id.ik).setOnClickListener(new C24811a(this));
        Bundle bundleExtra = getIntent().getBundleExtra("arguments");
        if (bundleExtra != null && bundleExtra.getBoolean("has_lyric", false)) {
            findViewById(R.id.f08).setBackgroundColor(Color.parseColor("#D8000000"));
            ((ImageView) findViewById(R.id.ik)).setImageResource(R.drawable.d5l);
            this.f65661a.setTextColor(Color.parseColor("#ffffff"));
            findViewById(R.id.ajf).setBackgroundColor(Color.parseColor("#D8000000"));
        }
        ((Space) findViewById(R.id.cqc)).setMinimumHeight(C23724k.m58225c());
        this.f65663c = ViewPagerBottomSheetBehavior.m57784a(findViewById(R.id.a4q));
        this.f65663c.f62717k = new C23579a() {
            /* renamed from: a */
            public final void mo48772a(View view, float f) {
            }

            /* renamed from: a */
            public final void mo48773a(View view, int i) {
                if (i == 5) {
                    ChooseMusicActivity.this.mo50683a();
                    ChooseMusicActivity chooseMusicActivity = ChooseMusicActivity.this;
                    chooseMusicActivity.finish();
                    chooseMusicActivity.overridePendingTransition(0, 0);
                }
            }
        };
        this.f65663c.f62710d = true;
        this.f65663c.mo48761a(C23724k.m58221a(this) + C23724k.m58228d(this));
        C0654k supportFragmentManager = getSupportFragmentManager();
        if (((C24923c) supportFragmentManager.mo2222a((int) R.id.ajf)) == null) {
            this.f65664d = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().setMusicChooseType(this.f65664d);
            String stringExtra = getIntent().getStringExtra("challenge");
            String stringExtra2 = getIntent().getStringExtra("creation_id");
            String stringExtra3 = getIntent().getStringExtra("shoot_way");
            MusicModel musicModel = (MusicModel) getIntent().getSerializableExtra("music_model");
            boolean booleanExtra = getIntent().getBooleanExtra("music_allow_clear", false);
            C0679r a = supportFragmentManager.mo2225a();
            int i2 = this.f65664d;
            C37299a aVar = C37299a.BtnConfirm;
            C24923c cVar = new C24923c();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
            bundle2.putSerializable("challenge", stringExtra);
            bundle2.putSerializable("music_model", musicModel);
            bundle2.putSerializable("music_style", aVar);
            bundle2.putBoolean("music_allow_clear", booleanExtra);
            bundle2.putString("creation_id", stringExtra2);
            bundle2.putString("shoot_way", stringExtra3);
            if (bundleExtra != null) {
                bundle2.putAll(bundleExtra);
            }
            cVar.setArguments(bundle2);
            a.mo2175a((int) R.id.ajf, (Fragment) cVar).mo2189b();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }
}
