package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.app.services.C23180z;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.music.adapter.C37292h.C37299a;
import com.p683ss.android.ugc.aweme.music.model.MusicCategory;
import com.p683ss.android.ugc.aweme.music.model.MusicList;
import com.p683ss.android.ugc.aweme.music.p1975c.C37350c;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1978ui.MusicListFragment.C37471a;
import com.p683ss.android.ugc.aweme.music.p1978ui.MusicListFragment.C37472b;
import com.p683ss.android.ugc.aweme.music.presenter.C37399e;
import com.p683ss.android.ugc.aweme.music.presenter.C37428v;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicListActivity */
public class MusicListActivity extends AmeSSActivity implements C37399e, C37472b {

    /* renamed from: a */
    String f95607a;

    /* renamed from: b */
    String f95608b;

    /* renamed from: c */
    public C37428v f95609c;

    /* renamed from: d */
    boolean f95610d = true;

    /* renamed from: e */
    public MusicListFragment f95611e;

    /* renamed from: f */
    private int f95612f;

    /* renamed from: g */
    private Challenge f95613g;
    TextTitleBar mTitleBar;

    /* renamed from: a */
    public final void mo76909a() {
        this.f95610d = false;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("music_category");
    }

    public void finish() {
        C47718bf.m103289b(new C37350c(null));
        C23180z.m56776a().mo47889a(this);
        super.finish();
    }

    /* renamed from: a */
    public final void mo76910a(MusicList musicList) {
        if (musicList != null) {
            if (this.f95611e.f95620c != null) {
                if (this.f95609c.f95459c) {
                    this.f95611e.f95620c.ao_();
                } else {
                    this.f95611e.f95620c.an_();
                }
            }
            if (musicList.items != null) {
                this.f95611e.mo77000a(musicList.items, 3);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.cv);
        this.f95607a = getIntent().getStringExtra("mc_id");
        this.f95608b = getIntent().getStringExtra("title_name");
        this.f95612f = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        if (this.f95607a == null) {
            this.f95607a = "860";
        }
        if (this.f95608b == null) {
            this.f95608b = getString(R.string.cm_);
        }
        this.f95613g = (Challenge) getIntent().getSerializableExtra("challenge");
        this.mTitleBar.setTitle((CharSequence) this.f95608b);
        this.mTitleBar.setColorMode(0);
        ImageView imageView = (ImageView) this.mTitleBar.findViewById(R.id.ik);
        if (C10675b.m21497b()) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.c_h));
        }
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: a */
            public final void mo19166a(View view) {
                MusicListActivity.this.finish();
            }

            /* renamed from: b */
            public final void mo19167b(View view) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                SmartRouter.buildRoute((Context) MusicListActivity.this, "//webview").withParam("hide_status_bar", true).withParam("hide_more", true).withParam(bundle).withParam("url", "https://aweme.snssdk.com/magic/runtime/?id=845").open();
                C26890h.onEvent(MobClick.obtain().setEventName("upload_music").setLabelName("song_category").setValue(MusicListActivity.this.f95607a));
            }
        });
        this.mTitleBar.setColorMode(0);
        this.mTitleBar.mo19149b(false);
        this.f95609c = new C37428v(this);
        this.f95611e = (MusicListFragment) getSupportFragmentManager().mo2222a((int) R.id.zr);
        if (this.f95611e == null) {
            int i = this.f95612f;
            C37299a aVar = C37299a.BtnConfirmAndShoot;
            MusicListFragment musicListFragment = new MusicListFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
            bundle2.putSerializable("music_style", aVar);
            musicListFragment.setArguments(bundle2);
            this.f95611e = musicListFragment;
            C0679r a = getSupportFragmentManager().mo2225a();
            a.mo2176a(R.id.zr, this.f95611e, "album_list_tag");
            a.mo2195c();
        }
        this.f95611e.f95622e = this;
        if (!TextUtils.isEmpty(this.f95607a)) {
            this.f95609c.mo76932a(this.f95607a, 0, 30);
            this.f95611e.f95624k = true;
            this.f95611e.f95626m = new C37471a() {
                /* renamed from: a */
                public final void mo50864a() {
                    if (MusicListActivity.this.f95609c.f95459c) {
                        if (MusicListActivity.this.f95611e.f95620c != null) {
                            MusicListActivity.this.f95611e.f95620c.am_();
                        }
                        MusicListActivity.this.f95609c.mo76931a(MusicListActivity.this.f95607a);
                    }
                }
            };
            this.f95611e.f95618a = new MusicCategory(this.f95608b, this.f95607a);
        }
        "860".equals(this.f95607a);
        this.mTitleBar.getEndText().setVisibility(8);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicListActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo50854a(MusicListFragment musicListFragment, String str, MusicModel musicModel, String str2) {
        if (musicListFragment.mo77006m() == 0 || musicListFragment.mo77006m() == 2) {
            Intent intent = new Intent();
            intent.putExtra(LeakCanaryFileProvider.f132050j, str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
            setResult(-1, intent);
            finish();
            return;
        }
        C37378c.m83698a(musicModel);
        Builder builder = new Builder();
        builder.musicModel(musicModel).shootWay("song_category");
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C37536be(this, builder, musicModel));
    }
}
