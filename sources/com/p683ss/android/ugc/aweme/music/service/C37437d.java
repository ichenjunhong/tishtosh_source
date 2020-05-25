package com.p683ss.android.ugc.aweme.music.service;

import android.app.Activity;
import android.app.ProgressDialog;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.experiment.LoadingDialogExperiment;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37589c;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37589c.C37590a;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37613h;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37613h.C37614a;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37646v;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37646v.C37650a;
import com.p683ss.android.ugc.aweme.music.service.IMusicRecordService.C37432a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23208an;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.ss.android.ugc.trill.R;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.music.service.d */
public final class C37437d implements IMusicRecordService {

    /* renamed from: a */
    public boolean f95478a = true;

    /* renamed from: b */
    public long f95479b;

    /* renamed from: c */
    public ProgressDialog f95480c;

    /* renamed from: d */
    public C37646v f95481d;

    public final void startRecord(C0184k kVar, final Activity activity, MusicModel musicModel, final C37432a aVar) {
        if (C23794bh.m58390d().mo47103a()) {
            C10691a.m21548c((Context) activity, (int) R.string.dw2).mo19066a();
        } else if (C20854a.m53167g().getCurUser().isLive()) {
            C10691a.m21548c((Context) activity, (int) R.string.btm).mo19066a();
        } else if (AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().checkIsAlreadyPublished(activity)) {
            if (musicModel == null || MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(musicModel, activity, true)) {
                this.f95481d = new C37646v(activity, new C37650a() {
                    /* renamed from: b */
                    public final void mo76951b() {
                    }

                    public final boolean by_() {
                        return C37437d.this.f95478a;
                    }

                    public final void bz_() {
                        if (C37437d.this.f95480c != null) {
                            C37437d.this.f95480c.dismiss();
                        }
                    }

                    public final void bx_() {
                        C27965f.m66720a(activity, "single_song", "click_music_shoot", C47661ab.m103163a().mo94972a("login_title", C11010c.m22280a().getString(R.string.dij)).f120139a);
                    }

                    /* renamed from: e_ */
                    public final void mo76955e_(int i) {
                        if (C37437d.this.f95480c != null) {
                            C37437d.this.f95480c.setProgress(i);
                            if (i >= 98 && C37437d.this.f95480c != null) {
                                C37437d.this.f95480c.setCancelable(true);
                            }
                        }
                    }

                    /* renamed from: a */
                    public final void mo76949a(MusicModel musicModel) {
                        int a = C10181b.m20511a().mo18168a(LoadingDialogExperiment.class, true, "loading_dialog_optimize_type", 31744, 0);
                        if (a == 0) {
                            C37437d.this.f95480c = C45547d.m99208b(activity, activity.getString(R.string.cds));
                        } else if (a == 1) {
                            C37437d.this.f95480c = C37613h.m84062a(activity, C37614a.VISIBLE, new C37440f(this));
                        } else if (a == 2) {
                            C37437d.this.f95480c = C37613h.m84062a(activity, C37614a.VISIBLE_AFTER_5S, new C37441g(this));
                        } else if (a == 3) {
                            C37437d.this.f95480c = C37589c.m84030a(activity, C37590a.VISIBLE, new C37442h(this), activity.getString(R.string.cds));
                        } else {
                            if (a == 4) {
                                C37437d.this.f95480c = C37589c.m84030a(activity, C37590a.VISIBLE_AFTER_5S, new C37443i(this), activity.getString(R.string.cds));
                            }
                        }
                    }

                    /* renamed from: a */
                    public final void mo76950a(String str, MusicModel musicModel) {
                        if (C37437d.this.f95480c != null) {
                            C37437d.this.f95480c.dismiss();
                        }
                        C23208an.m56934a("single_song");
                        long currentTimeMillis = System.currentTimeMillis() - C37437d.this.f95479b;
                        if (!AVExternalServiceImpl.getAVServiceImpl_Monster().configService().shortVideoConfig().isRecording() || activity == null) {
                            IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
                            C37439e eVar = new C37439e(this, str, currentTimeMillis, activity, musicModel);
                            aVServiceImpl_Monster.asyncService(eVar);
                            return;
                        }
                        AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().addMusic(musicModel);
                        Intent intent = new Intent();
                        intent.putExtra(LeakCanaryFileProvider.f132050j, str);
                        intent.putExtra("music_model", musicModel);
                        intent.putExtra("music_origin", 0);
                        activity.setResult(-1, intent);
                        activity.finish();
                    }
                });
                kVar.getLifecycle().mo324a(new MusicRecordService$2(this));
                this.f95481d.mo77153a(musicModel, true);
            }
        }
    }
}
