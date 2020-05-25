package com.p683ss.android.ugc.aweme.tools.music;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.service.C37434a;
import com.p683ss.android.ugc.aweme.music.service.C37435b;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24430a;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24431b;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24432c;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24434d;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24434d.C24435a;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24437f;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24441j;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39531b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39532c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39533d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39534e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39535f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39536g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39537h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39538i;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39539j;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39540k;
import com.p683ss.android.ugc.aweme.port.p2082in.C39568at;
import com.p683ss.android.ugc.aweme.port.p2082in.C39569au;
import com.p683ss.android.ugc.aweme.port.p2082in.C39569au.C39570a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39569au.C39571b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39633p.C39634a;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.services.IMainService;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.services.music.IMusicService;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager;
import com.p683ss.android.ugc.aweme.tools.music.aichoosemusic.C47156b;
import com.p683ss.android.ugc.aweme.tools.music.lrc.C47207b;
import com.p683ss.android.ugc.aweme.tools.music.lrc.C47207b.C47215c;
import com.p683ss.android.ugc.aweme.tools.music.p2361a.C47105a;
import com.p683ss.android.ugc.aweme.tools.music.p2361a.C47126b.C47127a;
import com.p683ss.android.ugc.aweme.tools.music.p2362b.C47160a;
import com.p683ss.android.ugc.aweme.tools.music.p2362b.C47160a.C47161a;
import com.p683ss.android.ugc.aweme.tools.music.p2362b.C47163b;
import com.p683ss.android.ugc.aweme.tools.music.p2363c.C47164a;
import com.p683ss.android.ugc.aweme.tools.music.p2364d.C47165a;
import com.p683ss.android.ugc.aweme.tools.music.p2364d.C47193e;
import com.p683ss.android.ugc.aweme.tools.music.p2364d.p2365a.C47166a;
import com.p683ss.android.ugc.aweme.tools.music.p2364d.p2365a.C47172b.C47173a;
import com.p683ss.android.ugc.aweme.tools.music.p2366e.C47195a;
import com.p683ss.android.ugc.aweme.tools.music.p2366e.C47197b;
import com.p683ss.android.ugc.aweme.tools.music.p2366e.C47197b.C47198a;
import com.p683ss.android.ugc.aweme.tools.music.p2366e.C47200d.C47201a;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47807de;
import com.p683ss.android.ugc.p2425e.C48545a;
import com.p683ss.android.vesdk.VEUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.tools.music.a */
public final class C47094a implements C39529ab {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f118904b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47094a.class), "muscicPanelType", "getMuscicPanelType()I"))};

    /* renamed from: c */
    public final C39569au f118905c;

    /* renamed from: d */
    private final C52668f f118906d = C52732g.m112285a(C47104h.f118923a);

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$a */
    static final class C47095a extends C52712l implements C52671b<Fragment, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C47094a f118907a;

        /* renamed from: b */
        final /* synthetic */ int f118908b;

        /* renamed from: c */
        final /* synthetic */ C24432c f118909c;

        C47095a(C47094a aVar, int i, C24432c cVar) {
            this.f118907a = aVar;
            this.f118908b = i;
            this.f118909c = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Fragment fragment = (Fragment) obj;
            C52711k.m112240b(fragment, "it");
            this.f118907a.f118905c.mo74295a(fragment, this.f118908b, this.f118909c.f64811a, this.f118909c.f64812b, null, this.f118909c.f64813c, this.f118909c.f64814d, this.f118909c.f64815e, this.f118909c.f64816f);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$b */
    public static final class C47096b implements C39535f {

        /* renamed from: a */
        public C39570a f118910a;

        /* renamed from: b */
        final /* synthetic */ C47094a f118911b;

        /* renamed from: c */
        final /* synthetic */ C39536g f118912c;

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a$b$a */
        public static final class C47097a implements C39571b {

            /* renamed from: a */
            final /* synthetic */ C47096b f118913a;

            C47097a(C47096b bVar) {
                this.f118913a = bVar;
            }

            /* renamed from: a */
            public final void mo80659a(Exception exc, String str) {
                C52711k.m112240b(exc, "e");
                C52711k.m112240b(str, "failMsg");
                this.f118913a.f118912c.mo80631a(exc, str);
            }

            /* renamed from: a */
            public final void mo80660a(List<C42482c> list, String str) {
                C52711k.m112240b(list, "musicList");
                C52711k.m112240b(str, "filePath");
                this.f118913a.f118912c.mo80632a(list, str);
            }
        }

        /* renamed from: a */
        public final boolean mo80630a(Object... objArr) {
            C52711k.m112240b(objArr, "params");
            return this.f118910a.mo74303a(Arrays.copyOf(objArr, 0));
        }

        C47096b(C47094a aVar, C39536g gVar) {
            this.f118911b = aVar;
            this.f118912c = gVar;
            C39570a a = aVar.f118905c.mo74292a((C39571b) new C47097a(this));
            C52711k.m112236a((Object) a, "proxy.createMusicChoices…         }\n            })");
            this.f118910a = a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$c */
    public static final class C47098c implements C37435b {

        /* renamed from: a */
        final /* synthetic */ C39634a f118914a;

        /* renamed from: b */
        final /* synthetic */ C42482c f118915b;

        /* renamed from: a */
        public final void mo55350a() {
        }

        /* renamed from: b */
        public final void mo55354b() {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
            C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
            createIAVServiceProxybyMonsterPlugin.getMusicService().mo74293a(this.f118915b.getMusicId(), "draft_page").mo77052a();
        }

        /* renamed from: a */
        public final void mo55351a(int i) {
            this.f118914a.mo80710a(i);
        }

        /* renamed from: a */
        public final void mo55352a(C48545a aVar) {
            C52711k.m112240b(aVar, "error");
            this.f118914a.mo80711a(Integer.valueOf(aVar.getErrorCode()), aVar.getErrorMsg());
        }

        C47098c(C39634a aVar, C42482c cVar) {
            this.f118914a = aVar;
            this.f118915b = cVar;
        }

        /* renamed from: a */
        public final void mo55353a(String str, MusicWaveBean musicWaveBean) {
            C52711k.m112240b(str, "musicFile");
            this.f118914a.mo80712a(str, musicWaveBean);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$d */
    static final class C47099d implements C47215c {

        /* renamed from: a */
        final /* synthetic */ C39539j f118916a;

        C47099d(C39539j jVar) {
            this.f118916a = jVar;
        }

        /* renamed from: a */
        public final void mo94374a(int i, String str, JSONArray jSONArray) {
            this.f118916a.mo80645a(i, str, jSONArray);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$e */
    public static final class C47100e implements C37434a {

        /* renamed from: a */
        final /* synthetic */ C39534e f118917a;

        C47100e(C39534e eVar) {
            this.f118917a = eVar;
        }

        /* renamed from: a */
        public final void mo76947a(Exception exc) {
            C52711k.m112240b(exc, "e");
            this.f118917a.mo80628a(exc);
        }

        /* renamed from: a */
        public final void mo76948a(String str, MusicModel musicModel) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(musicModel, "music");
            C39534e eVar = this.f118917a;
            new C47197b();
            C42482c a = C47197b.m102454a(musicModel);
            if (a == null) {
                C52711k.m112234a();
            }
            eVar.mo80629a(str, a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$f */
    public static final class C47101f implements C47161a {

        /* renamed from: a */
        final /* synthetic */ C47094a f118918a;

        /* renamed from: b */
        final /* synthetic */ C52671b f118919b;

        /* renamed from: c */
        final /* synthetic */ C52670a f118920c;

        /* renamed from: a */
        public final void mo94375a(int i, Intent intent) {
            Boolean bool;
            String str;
            Serializable serializable;
            String str2;
            C42482c cVar;
            Music music;
            if (i == -1) {
                MusicModel musicModel = null;
                if (intent != null) {
                    bool = Boolean.valueOf(intent.getBooleanExtra("is_cancel_current_choose_music", false));
                } else {
                    bool = null;
                }
                if (intent != null) {
                    str = intent.getStringExtra(LeakCanaryFileProvider.f132050j);
                } else {
                    str = null;
                }
                if (intent != null) {
                    serializable = intent.getSerializableExtra("music_model");
                } else {
                    serializable = null;
                }
                MusicModel musicModel2 = (MusicModel) serializable;
                if (intent != null) {
                    str2 = intent.getStringExtra("music_origin");
                } else {
                    str2 = null;
                }
                if (musicModel2 != null) {
                    int b = this.f118918a.mo80578b(str);
                    if (musicModel2.getMusicType() == MusicType.LOCAL) {
                        if (musicModel2 != null) {
                            musicModel2.setLocalPath(str);
                        }
                        if (musicModel2 != null) {
                            music = musicModel2.convertToMusic();
                        } else {
                            music = null;
                        }
                        UrlModel urlModel = new UrlModel();
                        urlModel.setUri(str);
                        ArrayList arrayList = new ArrayList();
                        if (str != null) {
                            arrayList.add(str);
                        }
                        urlModel.setUrlList(arrayList);
                        if (music != null) {
                            music.setPlayUrl(urlModel);
                        }
                        new C47197b();
                        if (music != null) {
                            musicModel = music.convertToMusicModel();
                        }
                        cVar = C47197b.m102454a(musicModel);
                    } else {
                        new C47197b();
                        cVar = C47197b.m102454a(musicModel2);
                    }
                    if (cVar != null) {
                        cVar.duration = b;
                    }
                    C52671b bVar = this.f118919b;
                    if (bVar != null) {
                        bVar.invoke(C24435a.m59809a(bool, str2, cVar, str));
                    }
                } else {
                    C52671b bVar2 = this.f118919b;
                    if (bVar2 != null) {
                        bVar2.invoke(C24435a.m59809a(bool, str2, null, str));
                    }
                }
            } else {
                C52670a aVar = this.f118920c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        C47101f(C47094a aVar, C52671b bVar, C52670a aVar2) {
            this.f118918a = aVar;
            this.f118919b = bVar;
            this.f118920c = aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$g */
    public static final class C47102g implements C39537h {

        /* renamed from: a */
        final /* synthetic */ C24437f f118921a;

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a$g$a */
        static final class C47103a implements C47164a {

            /* renamed from: a */
            final /* synthetic */ C24431b f118922a;

            C47103a(C24431b bVar) {
                this.f118922a = bVar;
            }

            /* renamed from: a */
            public final void mo94376a(MusicModel musicModel, boolean z) {
                C24431b bVar = this.f118922a;
                new C47197b();
                bVar.mo50188a(C47197b.m102454a(musicModel), z);
            }
        }

        C47102g(C24437f fVar) {
            this.f118921a = fVar;
        }

        /* renamed from: a */
        public final C39537h mo80633a(C24431b bVar) {
            C52711k.m112240b(bVar, "listener");
            C47127a.m102336a().mo94394a(this.f118921a);
            C47127a.m102336a().mo94395a((C47164a) new C47103a(bVar));
            return this;
        }

        /* renamed from: a */
        public final C39537h mo80634a(List<String> list) {
            C47127a.m102336a().mo94394a(this.f118921a);
            C47127a.m102336a().mo94396a(list);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$h */
    static final class C47104h extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C47104h f118923a = new C47104h();

        C47104h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(1);
        }
    }

    /* renamed from: i */
    private final int m102240i() {
        return ((Number) this.f118906d.getValue()).intValue();
    }

    /* renamed from: a */
    public final List<C42482c> mo80571a(List<? extends MusicModel> list) {
        return C47198a.m102457a(list);
    }

    /* renamed from: a */
    public final void mo80572a(Activity activity, int i, C24432c cVar, C52671b<? super C24434d, C52860x> bVar, C52670a<C52860x> aVar) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(cVar, "requestBean");
        C47160a aVar2 = new C47160a((FragmentActivity) activity);
        C52671b aVar3 = new C47095a(this, i, cVar);
        C47161a fVar = new C47101f(this, bVar, aVar);
        C52711k.m112240b(aVar3, "runnable");
        C52711k.m112240b(fVar, "callback");
        C47163b bVar2 = aVar2.f119067a;
        if (bVar2 == null) {
            C52711k.m112237a("mAvoidOnResultFragment");
        }
        C52711k.m112240b(aVar3, "runnable");
        C52711k.m112240b(fVar, "callback");
        List list = (List) bVar2.f119068a.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList();
        }
        list.add(list.size(), fVar);
        bVar2.f119068a.put(Integer.valueOf(i), list);
        aVar3.invoke(bVar2);
    }

    /* renamed from: a */
    public final void mo80708a(String str, C39568at atVar) {
        C52711k.m112240b(str, "musicId");
        C52711k.m112240b(atVar, "listener");
        this.f118905c.mo74296a(str, atVar);
    }

    /* renamed from: a */
    public final void mo80707a(Context context, C42482c cVar, int i, boolean z, C39634a aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(cVar, "musicModel");
        C52711k.m112240b(aVar, "listener");
        MusicService.createIMusicServicebyMonsterPlugin().downloadMusic(context, C47198a.m102456a(cVar), z, i, new C47098c(aVar, cVar));
    }

    /* renamed from: a */
    public final boolean mo80709a(C42482c cVar, Context context, boolean z) {
        C52711k.m112240b(cVar, "musicModel");
        C52711k.m112240b(context, "ameActivity");
        return this.f118905c.mo74298a(cVar, context, z);
    }

    /* renamed from: a */
    public final String mo80705a(String str) {
        String a = this.f118905c.mo74294a(str);
        C52711k.m112236a((Object) a, "proxy.getRhythmMusicFilePath(musicPath)");
        return a;
    }

    /* renamed from: a */
    public final boolean mo80577a(int i) {
        return this.f118905c.mo74297a(i);
    }

    /* renamed from: a */
    public final void mo80573a(Context context, String str, int i, boolean z, ProgressDialog progressDialog, C39534e eVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "musicId");
        C52711k.m112240b(progressDialog, "progressDialog");
        C52711k.m112240b(eVar, "callback");
        MusicService.createIMusicServicebyMonsterPlugin().fetchMusicDetail(context, str, 0, z, progressDialog, new C47100e(eVar));
    }

    /* renamed from: a */
    public final void mo80706a() {
        MusicService.createIMusicServicebyMonsterPlugin().releaseMusicDownloadTasks();
    }

    /* renamed from: a */
    public final void mo80575a(String str, int i, C39539j jVar) {
        C52711k.m112240b(str, "lrcUrl");
        C52711k.m112240b(jVar, "callback");
        C47207b.m102463a().mo94449a(str, i, (C47215c) new C47099d(jVar));
    }

    /* renamed from: a */
    public final void mo80576a(boolean z) {
        C47156b.m102385a(true);
    }

    /* renamed from: a */
    public final Object mo80569a(C43203d dVar) {
        if (dVar == null) {
            return null;
        }
        MusicWaveBean musicWaveBean = new MusicWaveBean();
        musicWaveBean.setMusicWavePointArray(dVar.getMusicWavePointArray());
        return musicWaveBean;
    }

    /* renamed from: a */
    public final List<C42482c> mo80570a(int i, String str) {
        MusicList musicList;
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin();
        if (createIMainServicebyMonsterPlugin != null) {
            IMusicService musicService = createIMainServicebyMonsterPlugin.musicService();
            if (musicService != null) {
                musicList = musicService.getStickPointMusicList(0, 20, i, str);
                if (musicList != null || C9190h.m18253a(musicList.musicList)) {
                    return null;
                }
                return C47198a.m102457a(C47201a.m102459a(musicList.musicList));
            }
        }
        musicList = null;
        if (musicList != null) {
        }
        return null;
    }

    /* renamed from: a */
    public final void mo80574a(C39540k kVar) {
        C52711k.m112240b(kVar, "callback");
        C47173a.m102427a().f119097a = kVar;
    }

    /* renamed from: b */
    public final File mo80579b() {
        return C47207b.m102465b();
    }

    /* renamed from: c */
    public final void mo80580c() {
        C47173a.m102427a().mo94420b();
    }

    /* renamed from: d */
    public final void mo80582d() {
        C47173a.m102427a().mo94421c();
    }

    /* renamed from: e */
    public final boolean mo80583e() {
        return C47156b.m102386a();
    }

    /* renamed from: f */
    public final void mo80584f() {
        C47173a.m102427a().mo94418a();
    }

    /* renamed from: g */
    public final C39531b mo80585g() {
        return AIChooseMusicManager.f118992f;
    }

    /* renamed from: h */
    public final List<MusicModel> mo80586h() {
        return AIChooseMusicManager.f118992f.mo94402l();
    }

    public C47094a() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
        C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
        this.f118905c = createIAVServiceProxybyMonsterPlugin.getMusicService();
    }

    /* renamed from: a */
    public final UrlModel mo80559a(Object obj) {
        return this.f118905c.mo74291a(obj);
    }

    /* renamed from: a */
    public final C39535f mo80562a(C39536g gVar) {
        C52711k.m112240b(gVar, "view");
        return new C47096b(this, gVar);
    }

    /* renamed from: c */
    public final void mo80581c(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C47165a.m102398b();
        } else {
            C47165a.m102397a(str);
        }
    }

    /* renamed from: a */
    public final C39533d mo80561a(C24441j jVar) {
        C52711k.m112240b(jVar, "onItemClickListener");
        return new C47166a(m102240i(), jVar);
    }

    /* renamed from: b */
    public final int mo80578b(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int[] iArr = new int[10];
        if (str == null) {
            C52711k.m112234a();
        }
        int audioFileInfo = VEUtils.getAudioFileInfo(str, iArr);
        if (audioFileInfo == 0) {
            i = iArr[3];
        } else {
            StringBuilder sb = new StringBuilder("MusicUtil#getMusicDuration#VEUtils.getAudioFileInfo(path, audioInfo) ret is ");
            sb.append(audioFileInfo);
            C47625i.m103103a(sb.toString());
            i = C47807de.m103442a(str);
        }
        return i;
    }

    /* renamed from: a */
    public final C39537h mo80563a(C24437f fVar) {
        C47127a.m102336a().mo94394a(fVar);
        return new C47102g(fVar);
    }

    /* renamed from: a */
    public final AVChallenge mo80565a(Challenge challenge) {
        if (challenge == null) {
            return null;
        }
        new C47195a();
        return C47195a.m102452a(challenge);
    }

    /* renamed from: a */
    public final C42482c mo80566a(MusicModel musicModel) {
        new C47197b();
        return C47197b.m102454a(musicModel);
    }

    /* renamed from: a */
    public final C43203d mo80568a(Serializable serializable) {
        if (serializable == null) {
            return null;
        }
        if (serializable instanceof MusicWaveBean) {
            C43203d dVar = new C43203d();
            dVar.setMusicWavePointArray(((MusicWaveBean) serializable).getMusicWavePointArray());
            return dVar;
        } else if (serializable instanceof C43203d) {
            return (C43203d) serializable;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final C39538i mo80564a(List<C42482c> list, C24441j jVar) {
        C52711k.m112240b(jVar, "itemListener");
        if (C9190h.m18253a(list)) {
            return new C47193e(m102240i(), new ArrayList(), jVar);
        }
        List arrayList = new ArrayList();
        if (list == null) {
            C52711k.m112234a();
        }
        for (C42482c a : list) {
            arrayList.add(C47198a.m102456a(a));
        }
        return new C47193e(m102240i(), arrayList, jVar);
    }

    /* renamed from: a */
    public final C39532c mo80560a(AppCompatActivity appCompatActivity, C20347c cVar, C24430a aVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(aVar, "AIMusicConfig");
        return new C47105a(appCompatActivity, cVar, aVar, m102240i());
    }

    /* renamed from: a */
    public final C42482c mo80567a(String str, boolean z, int i, int i2) {
        MusicModel musicModel;
        new C47197b();
        Music fetchMusicByIdAndLyricType = MusicService.createIMusicServicebyMonsterPlugin().fetchMusicByIdAndLyricType(str, true, 10, 0);
        if (fetchMusicByIdAndLyricType != null) {
            musicModel = fetchMusicByIdAndLyricType.convertToMusicModel();
        } else {
            musicModel = null;
        }
        return C47197b.m102454a(musicModel);
    }
}
