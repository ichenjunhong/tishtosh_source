package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.music.C37372e;
import com.p683ss.android.ugc.aweme.music.service.C37435b;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg.C39598a;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.p2425e.C48545a;
import com.p683ss.android.ugc.p2425e.C48554c;
import com.ss.android.ugc.trill.R;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.music.ui.v */
public final class C37646v {

    /* renamed from: a */
    public Activity f95995a;

    /* renamed from: b */
    public C37650a f95996b;

    /* renamed from: c */
    public Effect f95997c;

    /* renamed from: d */
    private C48554c f95998d = new C48554c();

    /* renamed from: e */
    private C37372e f95999e;

    /* renamed from: f */
    private C37554bn f96000f;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.v$a */
    public interface C37650a {
        /* renamed from: a */
        void mo76949a(MusicModel musicModel);

        /* renamed from: a */
        void mo76950a(String str, MusicModel musicModel);

        /* renamed from: b */
        void mo76951b();

        void bx_();

        boolean by_();

        void bz_();

        /* renamed from: e_ */
        void mo76955e_(int i);
    }

    /* renamed from: a */
    public final void mo77150a() {
        if (this.f95999e != null && this.f96000f == null) {
            this.f95999e.mo76655a(-1);
        }
        if (this.f96000f != null) {
            this.f96000f.mo77120b();
        }
    }

    /* renamed from: b */
    public final void mo77154b() {
        this.f95995a = null;
        if (this.f95999e != null) {
            this.f95999e.mo76655a(-1);
        }
        if (this.f96000f != null) {
            this.f96000f.mo77117a();
        }
        if (this.f95996b != null) {
            this.f95996b = null;
        }
    }

    /* renamed from: a */
    public final void mo77153a(MusicModel musicModel, boolean z) {
        mo77151a(musicModel, null, z);
    }

    public C37646v(Activity activity, C37650a aVar) {
        this.f95995a = activity;
        C37372e eVar = new C37372e(this.f95995a, true, true, true, "music_detail_page");
        this.f95999e = eVar;
        this.f95999e.f95347a = 2;
        this.f95996b = aVar;
    }

    /* renamed from: a */
    public static void m84122a(String str, long j) {
        double d;
        long length = new File(str).length();
        if (j == 0) {
            d = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        } else {
            d = (double) (length / j);
        }
        C9951d.m19997a("aweme_music_detail_download_success_rate", C23088c.m56631a().mo47823a("duration", Long.valueOf(j)).mo47820a("speed", Double.valueOf(d)).mo47823a("size", Long.valueOf(length)).mo47824a("fileName", str).mo47825b());
    }

    /* renamed from: a */
    public final void mo77151a(final MusicModel musicModel, final String str, final boolean z) {
        this.f95998d.mo96057b();
        if (this.f95995a != null) {
            IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
            if (aVServiceImpl_Monster == null || !aVServiceImpl_Monster.configService().avsettingsConfig().needLoginBeforeRecord()) {
                AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin().getShortVideoPluginService().mo80676a(C11010c.m22280a(), true, new C39598a() {
                    public final void onSuccess() {
                        C37646v vVar = C37646v.this;
                        MusicModel musicModel = musicModel;
                        String str = str;
                        boolean z = z;
                        if (!C37499ae.m83907a(vVar.f95995a)) {
                            C10691a.m21542b((Context) vVar.f95995a, (int) R.string.cg1).mo19066a();
                        } else {
                            vVar.mo77152a(musicModel, str, false, z);
                        }
                    }
                });
            } else {
                this.f95996b.bx_();
            }
        }
    }

    /* renamed from: a */
    public final void mo77152a(final MusicModel musicModel, String str, boolean z, boolean z2) {
        if (musicModel != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            if (C37584bs.m84027a()) {
                C376482 r7 = new C37620j() {
                    /* renamed from: b */
                    public final void mo77134b(C37643s sVar) {
                        if (C37646v.this.f95995a != null) {
                            C37646v.this.f95995a.runOnUiThread(new C37685y(this));
                        }
                    }

                    /* renamed from: a */
                    public final void mo77132a(C37643s sVar) {
                        String str = sVar.f95988a;
                        MusicWaveBean musicWaveBean = sVar.f95989b;
                        C37646v.this.f95997c = sVar.f95992e;
                        if (C37646v.this.f95996b.by_()) {
                            if (C37646v.this.f95995a != null) {
                                C37646v.this.f95995a.runOnUiThread(new C37684x(this, musicModel, musicWaveBean, str));
                            }
                            C37646v.m84122a(str, System.currentTimeMillis() - currentTimeMillis);
                        }
                    }

                    /* renamed from: a */
                    public final void mo77133a(Effect effect) {
                        if (C37646v.this.f95995a != null) {
                            C37646v.this.f95995a.runOnUiThread(new C37683w(this));
                            C37646v.this.f95996b.mo76949a(musicModel);
                        }
                    }

                    /* renamed from: a */
                    public final void mo77131a(int i, Effect effect, Long l) {
                        if (C37646v.this.f95995a != null) {
                            C37646v.this.f95995a.runOnUiThread(new C37686z(this, i));
                        }
                    }
                };
                if (this.f96000f == null) {
                    this.f96000f = new C37554bn(this.f95995a, str, musicModel, this.f95999e);
                }
                C37554bn bnVar = this.f96000f;
                if (z) {
                    r7 = null;
                }
                bnVar.mo77118a(r7);
                return;
            }
            this.f95999e.mo76656a(musicModel, new C37435b() {
                /* renamed from: a */
                public final void mo55350a() {
                }

                /* renamed from: b */
                public final void mo55354b() {
                    if (C37646v.this.f95995a != null) {
                        C37646v.this.f95995a.runOnUiThread(new C37495aa(this));
                        C37646v.this.f95996b.mo76949a(musicModel);
                    }
                }

                /* renamed from: a */
                public final void mo55351a(int i) {
                    if (C37646v.this.f95995a != null) {
                        C37646v.this.f95995a.runOnUiThread(new C37497ac(this, i));
                    }
                }

                /* renamed from: a */
                public final void mo55352a(C48545a aVar) {
                    if (C37646v.this.f95995a != null) {
                        C37646v.this.f95995a.runOnUiThread(new C37498ad(this));
                    }
                }

                /* renamed from: a */
                public final void mo55353a(String str, MusicWaveBean musicWaveBean) {
                    if (C37646v.this.f95996b.by_()) {
                        if (C37646v.this.f95995a != null) {
                            C37646v.this.f95995a.runOnUiThread(new C37496ab(this, musicModel, musicWaveBean, str));
                        }
                        C37646v.m84122a(str, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            }, -1, z2);
        }
    }
}
