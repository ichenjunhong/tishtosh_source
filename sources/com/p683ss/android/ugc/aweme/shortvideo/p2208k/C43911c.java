package com.p683ss.android.ugc.aweme.shortvideo.p2208k;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23725l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.detail.api.DetailApi;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.net.C37809s;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23208an;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.DuetConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IRecordService.UICallback;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.StickerDownloadConfig;
import com.p683ss.android.ugc.aweme.share.C41941ab;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43237b;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.p2222a.C44413c;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.p2222a.C44414d;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.p2222a.C44415e;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47935p;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.k.c */
public final class C43911c {

    /* renamed from: a */
    public String f111192a;

    /* renamed from: b */
    public int f111193b;

    /* renamed from: c */
    public C45547d f111194c;

    /* renamed from: d */
    protected Activity f111195d;

    /* renamed from: e */
    public C43919a f111196e = new C43920b();

    /* renamed from: f */
    public List<String> f111197f;

    /* renamed from: g */
    public Aweme f111198g;

    /* renamed from: h */
    public int f111199h;

    /* renamed from: i */
    public Runnable f111200i = new Runnable() {
        public final void run() {
            if (C43911c.this.f111194c != null) {
                C45547d dVar = C43911c.this.f111194c;
                int i = 100;
                if (C43911c.this.f111193b < 100) {
                    i = C43911c.this.f111193b;
                }
                dVar.setProgress(i);
            }
        }
    };

    /* renamed from: j */
    private String f111201j;

    /* renamed from: k */
    private String f111202k;

    /* renamed from: l */
    private String f111203l = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().cacheDir();

    /* renamed from: m */
    private Handler f111204m = new Handler(Looper.getMainLooper());

    /* renamed from: n */
    private String f111205n = "";

    /* renamed from: o */
    private UICallback f111206o = new UICallback() {
        public final void postFail() {
        }

        public final void preSuccess() {
            C43911c.this.mo89468b();
        }

        public final void postSuccess() {
            C43911c.this.f111196e.mo47315a(C43911c.this.f111198g.getAid());
        }

        public final void preFail(int i) {
            C43911c.this.mo89469c();
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.c$a */
    public interface C43919a {
        /* renamed from: a */
        void mo47314a();

        /* renamed from: a */
        void mo47315a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.c$b */
    class C43920b implements C43919a {
        /* renamed from: a */
        public final void mo47314a() {
        }

        /* renamed from: a */
        public final void mo47315a(String str) {
        }

        C43920b() {
        }
    }

    /* renamed from: g */
    private void m96445g() {
        C18842a.m45934b(new Runnable() {
            public final void run() {
                if (C43911c.this.f111195d != null) {
                    C9432q.m18689b((Context) C43911c.this.f111195d, (int) R.string.hr, 0);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo89468b() {
        if (this.f111194c != null) {
            try {
                this.f111194c.dismiss();
            } catch (Exception unused) {
            }
            this.f111194c = null;
        }
    }

    /* renamed from: c */
    public final void mo89469c() {
        C18842a.m45934b(new Runnable() {
            public final void run() {
                if (C43911c.this.f111195d != null) {
                    C43911c.this.mo89468b();
                    C10691a.m21542b((Context) C43911c.this.f111195d, (int) R.string.at3).mo19066a();
                    C43911c.this.f111196e.mo47314a();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo89464a() {
        C18842a.m45934b(new C43926i(this));
        C18842a.m45932a(new C43927j(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo89470d() {
        mo89468b();
        this.f111194c = C45547d.m99208b(this.f111195d, this.f111195d.getResources().getString(R.string.dj9));
        this.f111194c.setIndeterminate(true);
    }

    /* renamed from: f */
    private void m96444f() {
        if (!C47935p.m103709b(this.f111198g)) {
            if (!C35837h.m80977b() || this.f111198g.getAuthor() == null || !this.f111198g.getAuthor().isPreventDownload()) {
                mo89468b();
                if (this.f111195d != null) {
                    C10691a.m21542b(this.f111195d.getApplicationContext(), (int) R.string.ga0).mo19066a();
                }
            } else if (this.f111195d != null) {
                mo89468b();
                C10691a.m21548c(this.f111195d.getApplicationContext(), (int) R.string.au_).mo19066a();
                this.f111196e.mo47314a();
                return;
            }
            return;
        }
        VideoUrlModel playAddrH264 = this.f111198g.getVideo().getPlayAddrH264();
        if (playAddrH264 == null || C9376b.m18558a((Collection<T>) playAddrH264.getUrlList())) {
            this.f111196e.mo47314a();
            return;
        }
        if (AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().duetSupportChangeLayout()) {
            C0013i.m16a(C43924g.f111222a);
        }
        this.f111197f = C44414d.m97221a(playAddrH264.getUrlList(), this.f111198g);
        String a = C9395d.m18571a(playAddrH264.getBitRatedRatioUri());
        StringBuilder sb = new StringBuilder();
        sb.append(this.f111203l);
        sb.append(a);
        sb.append(".mp4");
        this.f111192a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f111203l);
        sb2.append("temp_");
        sb2.append(a);
        sb2.append(".mp4");
        this.f111201j = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f111203l);
        sb3.append("temp_");
        sb3.append(a);
        sb3.append(".wav");
        this.f111202k = sb3.toString();
        if (C48016e.m103944b(this.f111192a)) {
            mo89464a();
            return;
        }
        if (!C48016e.m103944b(this.f111192a)) {
            C48016e.m103935a(this.f111203l, false);
        }
        Aweme aweme = this.f111198g;
        String str = this.f111203l;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(a);
        sb4.append(".mp4");
        C44415e.m97222a(aweme.getAid(), this.f111197f, str, sb4.toString(), new C44413c(this.f111197f, "duet") {
            /* renamed from: a */
            public final void mo89476a(String str, String str2) {
                super.mo89476a(str, str2);
                if (new File(str2).length() == 0) {
                    StringBuilder sb = new StringBuilder("WaterMarkComposer download file size == 0: ");
                    sb.append(C43911c.this.f111197f);
                    C32458a.m75148a((Throwable) new Exception(sb.toString()));
                    C43911c.this.mo89469c();
                    return;
                }
                C43911c.this.f111192a = str2;
                C43911c.this.mo89464a();
            }

            /* renamed from: a */
            public final void mo89475a(Exception exc, String str, Integer num) {
                super.mo89475a(exc, str, num);
                C43911c.this.mo89469c();
            }

            /* renamed from: a */
            public final void mo89474a(int i, long j, long j2) {
                super.mo89474a(i, j, j2);
                if (C43911c.this.f111195d != null) {
                    C43911c.this.f111199h = i;
                    C43911c.this.f111193b = i;
                    C18842a.m45934b(C43911c.this.f111200i);
                }
            }
        });
        this.f111199h = 0;
        this.f111204m.postDelayed(new C43923f(this), 60000);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo89471e() {
        String str;
        String str2;
        if (this.f111195d != null) {
            String uuid = UUID.randomUUID().toString();
            boolean duetSupportChangeLayout = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().duetSupportChangeLayout();
            Builder creationId = new Builder().creationId(uuid);
            if (duetSupportChangeLayout) {
                str = "duet";
            } else {
                str = "split";
            }
            Builder groupId = creationId.shootWay(str).enterFrom(this.f111205n).groupId(this.f111198g.getAid());
            if (duetSupportChangeLayout) {
                str2 = "duet";
            } else {
                str2 = "split";
            }
            Builder musicOrigin = groupId.musicOrigin(str2);
            DuetConfig duetConfig = new DuetConfig(this.f111192a, this.f111201j, this.f111202k, this.f111198g.getAuthor(), this.f111198g.getAid(), 1000);
            if (this.f111198g != null && this.f111198g.hasStickerID()) {
                musicOrigin.stickers(C41941ab.m91890a(this.f111198g.getStickerIDs()));
            }
            if (!(this.f111198g == null || this.f111198g.getMusic() == null)) {
                musicOrigin.musicModel(this.f111198g.getMusic().convertToMusicModel());
            }
            if (!(this.f111198g == null || this.f111198g.getGameInfo() == null)) {
                duetConfig.setDuetGameScore(Integer.valueOf(this.f111198g.getGameInfo().getGameScore()));
                duetConfig.setMStickerDownloadConfig(new StickerDownloadConfig(m96443a(this.f111198g), C35837h.m80980e(), C37809s.m84409a().mo77268b()));
            }
            RecordConfig build = musicOrigin.build();
            C23089d a = C23089d.m56640a().mo47829a("creation_id", build.getCreationId()).mo47829a("shoot_way", build.getShootway()).mo47829a("group_id", build.getGroupId());
            if (duetSupportChangeLayout) {
                a.mo47829a("duet_layout", "new_left");
            }
            C26890h.m65011a("shoot", a.f61491a);
            duetConfig.setOutputDir(this.f111203l);
            if (!(this.f111198g == null || this.f111198g.getFromRawChallenge() == null || !this.f111198g.getFromRawChallenge().isCommerce())) {
                duetConfig.setDuetChallenge(this.f111198g.getFromRawChallenge().getChallengeName());
            }
            C23208an.m56934a(build.getEnterFrom());
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C43925h(this, build, duetConfig));
            return;
        }
        mo89469c();
    }

    /* renamed from: a */
    private static String m96443a(Aweme aweme) {
        if (aweme.getStickerIDs() == null || aweme.getStickerIDs().isEmpty()) {
            return "-1";
        }
        try {
            return aweme.getStickerIDs().split(",")[0];
        } catch (NumberFormatException unused) {
            C47625i.m103103a("id format error");
            return "-1";
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo89463a(Activity activity, C0013i iVar) throws Exception {
        if (iVar.mo33d() || iVar.mo31c()) {
            m96444f();
        } else if (!((C43237b) iVar.mo34e()).f109339a) {
            String str = ((C43237b) iVar.mo34e()).f109342d;
            if (TextUtils.isEmpty(str)) {
                str = activity.getResources().getString(R.string.fju);
            }
            if (this.f111195d != null) {
                C10691a.m21551c((Context) this.f111195d, str).mo19066a();
                mo89468b();
                this.f111196e.mo47314a();
            }
        } else {
            m96444f();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89465a(com.p683ss.android.ugc.aweme.feed.model.Aweme r7, android.app.Activity r8, java.lang.String r9) {
        /*
            r6 = this;
            r6.f111195d = r8
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.p683ss.android.ugc.aweme.services.IExternalService) r0
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
            boolean r0 = r0.isPublishable()
            if (r0 != 0) goto L_0x001b
            r6.m96445g()
            com.ss.android.ugc.aweme.shortvideo.k.c$a r7 = r6.f111196e
            r7.mo47314a()
            return
        L_0x001b:
            r6.f111198g = r7
            r6.f111205n = r9
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r6.f111198g
            if (r9 == 0) goto L_0x00c7
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r6.f111198g
            com.ss.android.ugc.aweme.profile.model.User r9 = r9.getAuthor()
            if (r9 == 0) goto L_0x00c7
            boolean r9 = com.p683ss.android.ugc.aweme.video.C48016e.m103957g()
            r0 = 1
            r1 = 0
            if (r9 != 0) goto L_0x0041
            android.app.Activity r9 = r6.f111195d
            r2 = 2132548602(0x7f1c1bfa, float:2.0750483E38)
            com.bytedance.ies.dmt.ui.d.a r9 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r9, r2)
            r9.mo19066a()
        L_0x003f:
            r9 = 0
            goto L_0x005a
        L_0x0041:
            long r2 = com.p683ss.android.ugc.aweme.video.C48016e.m103958h()
            r4 = 20971520(0x1400000, double:1.03613076E-316)
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x0059
            android.app.Activity r9 = r6.f111195d
            r2 = 2132548603(0x7f1c1bfb, float:2.0750485E38)
            com.bytedance.ies.dmt.ui.d.a r9 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r9, r2)
            r9.mo19066a()
            goto L_0x003f
        L_0x0059:
            r9 = 1
        L_0x005a:
            if (r9 == 0) goto L_0x00c7
            android.content.Context r9 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            boolean r9 = com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43928k.m96462a(r9)
            if (r9 == 0) goto L_0x00c7
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r6.f111198g
            com.ss.android.ugc.aweme.music.model.Music r9 = r9.getMusic()
            boolean r9 = com.p683ss.android.ugc.aweme.music.p1978ui.C37609f.m84056a(r9)
            if (r9 == 0) goto L_0x008d
            android.app.Activity r9 = r6.f111195d
            if (r9 == 0) goto L_0x008c
            android.app.Activity r9 = r6.f111195d
            r2 = 2132549108(0x7f1c1df4, float:2.075151E38)
            r3 = 2
            android.app.Activity r4 = r6.f111195d
            r5 = 1098907648(0x41800000, float:16.0)
            float r4 = com.bytedance.common.utility.C9432q.m18687b(r4, r5)
            int r4 = (int) r4
            com.bytedance.ies.dmt.ui.d.a r9 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21536a(r9, r2, r0, r3, r4)
            r9.mo19066a()
        L_0x008c:
            r0 = 0
        L_0x008d:
            if (r0 != 0) goto L_0x0090
            goto L_0x00c7
        L_0x0090:
            com.ss.android.ugc.aweme.shortvideo.view.d r9 = r6.f111194c
            if (r9 != 0) goto L_0x00a9
            android.app.Activity r9 = r6.f111195d
            android.app.Activity r0 = r6.f111195d
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2132544233(0x7f1c0ae9, float:2.0741622E38)
            java.lang.String r0 = r0.getString(r2)
            com.ss.android.ugc.aweme.shortvideo.view.d r9 = com.p683ss.android.ugc.aweme.shortvideo.view.C45547d.m99208b(r9, r0)
            r6.f111194c = r9
        L_0x00a9:
            com.ss.android.ugc.aweme.shortvideo.view.d r9 = r6.f111194c
            r9.setIndeterminate(r1)
            com.ss.android.ugc.aweme.shortvideo.view.d r9 = r6.f111194c
            r9.setProgress(r1)
            com.ss.android.ugc.aweme.shortvideo.k.d r9 = new com.ss.android.ugc.aweme.shortvideo.k.d
            r9.<init>(r7)
            a.i r7 = p001a.C0013i.m16a(r9)
            com.ss.android.ugc.aweme.shortvideo.k.e r9 = new com.ss.android.ugc.aweme.shortvideo.k.e
            r9.<init>(r6, r8)
            java.util.concurrent.Executor r8 = p001a.C0013i.f25b
            r7.mo20a(r9, r8)
            return
        L_0x00c7:
            com.ss.android.ugc.aweme.shortvideo.k.c$a r7 = r6.f111196e
            r7.mo47314a()
            r6.mo89468b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43911c.mo89465a(com.ss.android.ugc.aweme.feed.model.Aweme, android.app.Activity, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo89467a(final String str, Activity activity, final String str2) {
        this.f111195d = activity;
        if (!AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishable()) {
            m96445g();
            this.f111196e.mo47314a();
        } else if (C23725l.m58233a(str)) {
            this.f111196e.mo47314a();
        } else {
            this.f111195d = activity;
            this.f111205n = str2;
            if (this.f111194c == null && this.f111195d != null) {
                this.f111194c = C45547d.m99208b(this.f111195d, this.f111195d.getResources().getString(R.string.au9));
                this.f111194c.setIndeterminate(true);
            }
            C18842a.m45932a(new Runnable() {
                public final void run() {
                    try {
                        final Aweme a = DetailApi.m65845a(str, "");
                        C18842a.m45934b(new Runnable() {
                            public final void run() {
                                if (C43911c.this.f111195d != null) {
                                    if (a == null) {
                                        C43911c.this.mo89468b();
                                    } else if (a.getStatus() != null && a.getStatus().isPrivate()) {
                                        C10691a.m21548c(C43911c.this.f111195d.getApplicationContext(), (int) R.string.bey).mo19066a();
                                        C43911c.this.mo89468b();
                                        C43911c.this.f111196e.mo47314a();
                                    } else if (a.getStatus() == null || !a.getStatus().isDelete()) {
                                        C43911c.this.mo89465a(a, C43911c.this.f111195d, str2);
                                    } else {
                                        C10691a.m21548c(C43911c.this.f111195d.getApplicationContext(), (int) R.string.bex).mo19066a();
                                        C43911c.this.mo89468b();
                                        C43911c.this.f111196e.mo47314a();
                                    }
                                }
                            }
                        });
                    } catch (Exception unused) {
                        C43911c.this.mo89469c();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89466a(RecordConfig recordConfig, DuetConfig duetConfig, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startDuet(this.f111195d, recordConfig, duetConfig, this.f111206o);
    }
}
