package com.p683ss.android.ugc.aweme.choosemusic.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.Space;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.C23579a;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.base.widget.p1423b.C23749a;
import com.p683ss.android.ugc.aweme.choosemusic.fragment.OnlineMusicFragment;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.music.adapter.C37292h.C37299a;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.OnlineMusicFragmentActivity */
public class OnlineMusicFragmentActivity extends AmeSSActivity {

    /* renamed from: a */
    public TextView f65667a;

    /* renamed from: b */
    public TextView f65668b;

    /* renamed from: c */
    Space f65669c;

    /* renamed from: d */
    public boolean f65670d;

    /* renamed from: e */
    int f65671e;

    /* renamed from: f */
    private ViewPagerBottomSheetBehavior f65672f;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.OnlineMusicFragmentActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.OnlineMusicFragmentActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.OnlineMusicFragmentActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        KeyboardUtils.m58184c(this.f65667a);
        overridePendingTransition(0, R.anim.ad);
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("music_homepage");
    }

    /* renamed from: b */
    private static boolean m60350b() {
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
        if (C37249a.m83512c() != 0) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: a */
    public final void mo50686a() {
        if (this.f65670d) {
            AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().setCurMusic(null);
            Intent intent = new Intent();
            intent.putExtra("is_cancel_current_choose_music", true);
            setResult(-1, intent);
        }
    }

    public void onBackPressed() {
        if (this.f65672f != null) {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.f65672f;
            if (5 != viewPagerBottomSheetBehavior.f62712f) {
                if (viewPagerBottomSheetBehavior.f62715i != null) {
                    View view = (View) viewPagerBottomSheetBehavior.f62715i.get();
                    if (view != null) {
                        ViewParent parent = view.getParent();
                        if (parent == null || !parent.isLayoutRequested() || !C1056u.m3018B(view)) {
                            viewPagerBottomSheetBehavior.mo48763a(view, 5);
                        } else {
                            view.post(new Runnable(view, 5) {

                                /* renamed from: a */
                                final /* synthetic */ View f62730a;

                                /* renamed from: b */
                                final /* synthetic */ int f62731b;

                                public final void run() {
                                    ViewPagerBottomSheetBehavior.this.mo48763a(this.f62730a, this.f62731b);
                                }

                                {
                                    this.f62730a = r2;
                                    this.f62731b = r3;
                                }
                            });
                        }
                    }
                } else if (viewPagerBottomSheetBehavior.f62710d) {
                    viewPagerBottomSheetBehavior.f62712f = 5;
                }
            }
            return;
        }
        mo50686a();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.OnlineMusicFragmentActivity", "onCreate", true);
        super.onCreate(bundle);
        superOverridePendingTransition(R.anim.q, 0);
        setContentView((int) R.layout.er);
        this.f65667a = (TextView) findViewById(R.id.dhb);
        this.f65667a.setText(getIntent().getStringExtra("title"));
        findViewById(R.id.d70).setOnClickListener(C23749a.m58284a(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                KeyboardUtils.m58184c(OnlineMusicFragmentActivity.this.f65667a);
                OnlineMusicFragmentActivity.this.mo50686a();
                OnlineMusicFragmentActivity.this.finish();
            }
        }));
        int i = 8;
        findViewById(R.id.d70).setVisibility(8);
        this.f65668b = (TextView) findViewById(R.id.dbj);
        TextView textView = this.f65668b;
        if (m60350b()) {
            i = 0;
        }
        textView.setVisibility(i);
        this.f65668b.setOnClickListener(C23749a.m58284a(new C24813c(this)));
        this.f65669c = (Space) findViewById(R.id.cqc);
        this.f65669c.setMinimumHeight(C23724k.m58225c());
        this.f65672f = ViewPagerBottomSheetBehavior.m57784a(findViewById(R.id.a4q));
        this.f65672f.f62717k = new C23579a() {
            /* renamed from: a */
            public final void mo48772a(View view, float f) {
            }

            /* renamed from: a */
            public final void mo48773a(View view, int i) {
                if (i == 5) {
                    OnlineMusicFragmentActivity.this.mo50686a();
                    OnlineMusicFragmentActivity.this.finish();
                }
            }
        };
        this.f65672f.f62710d = true;
        this.f65672f.mo48761a(C23724k.m58221a(this) + C23724k.m58228d(this));
        this.f65672f.f62711e = true;
        C0654k supportFragmentManager = getSupportFragmentManager();
        if (((OnlineMusicFragment) supportFragmentManager.mo2222a((int) R.id.ajf)) == null) {
            this.f65671e = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
            String stringExtra = getIntent().getStringExtra("challenge");
            MusicModel musicModel = (MusicModel) getIntent().getSerializableExtra("music_model");
            boolean booleanExtra = getIntent().getBooleanExtra("music_allow_clear", false);
            String stringExtra2 = getIntent().getStringExtra("creation_id");
            String stringExtra3 = getIntent().getStringExtra("shoot_way");
            Bundle bundleExtra = getIntent().getBundleExtra("arguments");
            C0679r a = supportFragmentManager.mo2225a();
            int i2 = this.f65671e;
            C37299a aVar = C37299a.BtnConfirm;
            String stringExtra4 = getIntent().getStringExtra("enter_from");
            OnlineMusicFragment onlineMusicFragment = new OnlineMusicFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
            bundle2.putSerializable("challenge", stringExtra);
            bundle2.putSerializable("music_model", musicModel);
            bundle2.putSerializable("music_style", aVar);
            bundle2.putSerializable("music_allow_clear", Boolean.valueOf(booleanExtra));
            bundle2.putSerializable("enter_from", stringExtra4);
            bundle2.putString("creation_id", stringExtra2);
            bundle2.putString("shoot_way", stringExtra3);
            if (bundleExtra != null) {
                bundle2.putAll(bundleExtra);
            }
            onlineMusicFragment.setArguments(bundle2);
            a.mo2175a((int) R.id.ajf, (Fragment) onlineMusicFragment).mo2189b();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.OnlineMusicFragmentActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }
}
