package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.music.C37218a;
import com.p683ss.android.ugc.aweme.music.C37372e;
import com.p683ss.android.ugc.aweme.music.model.MusicCategory;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.p683ss.android.ugc.aweme.music.p1977e.C37377b;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37589c.C37590a;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37613h.C37614a;
import com.p683ss.android.ugc.aweme.music.service.C37435b;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.p2425e.C48545a;
import com.p683ss.android.ugc.p2425e.C48554c;
import com.p683ss.android.ugc.p2425e.C48557d;
import com.p683ss.android.ugc.p2425e.p2426a.C48549d;
import com.p683ss.android.ugc.p2425e.p2427b.C48552a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.aw */
public class C37518aw implements C37218a {

    /* renamed from: a */
    private int f95716a = -1;

    /* renamed from: e */
    protected C37625m f95717e;

    /* renamed from: f */
    protected int f95718f;

    /* renamed from: g */
    public ProgressDialog f95719g;

    /* renamed from: h */
    public C48554c f95720h;

    /* renamed from: i */
    protected C37372e f95721i;

    /* renamed from: j */
    public C37523a f95722j;

    /* renamed from: k */
    public String f95723k;

    /* renamed from: l */
    public MusicCategory f95724l;

    /* renamed from: m */
    public int f95725m;

    /* renamed from: n */
    public boolean f95726n;

    /* renamed from: o */
    public MusicModel f95727o;

    /* renamed from: p */
    public int f95728p;

    /* renamed from: q */
    protected CountDownTimer f95729q;

    /* renamed from: r */
    public boolean f95730r;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.aw$a */
    public interface C37523a {
        /* renamed from: a */
        void mo50709a();
    }

    /* renamed from: b */
    protected static String m83917b(int i, int i2) {
        if (i2 == 0) {
            switch (i) {
                case 0:
                    return "edit_page_list";
                case 1:
                    return "edit_page_favourite";
                case 2:
                    return "edit_page_search";
                case 3:
                    return "edit_page_banner";
                case 5:
                case 6:
                    return "edit_page_local";
                case 7:
                    return "single_song";
                case 8:
                    return "edit_page_fm";
                case 9:
                    return "sticker_rec";
                case 10:
                    return "challenge_rec";
            }
        } else if (i2 == 2) {
            switch (i) {
                case 0:
                    return "shoot_page_list";
                case 1:
                    return "shoot_page_favourite";
                case 2:
                    return "shoot_page_search";
                case 3:
                    return "shoot_page_banner";
                case 5:
                case 6:
                    return "shoot_page_local";
                case 8:
                    return "shoot_page_fm";
                case 9:
                    return "sticker_rec";
                case 10:
                    return "challenge_rec";
            }
        }
        return "";
    }

    /* renamed from: g */
    private static String m83921g(int i) {
        switch (i) {
            case 0:
            case 1:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                return "change_music_page";
            case 2:
                return "search_music";
            case 3:
                return "change_music_page_detail";
            case 7:
                return "personal_homepage";
            default:
                return "";
        }
    }

    /* renamed from: h */
    private static String m83922h(int i) {
        if (i == 0) {
            return "music_library_hot";
        }
        if (i == 1) {
            return "music_library_mine";
        }
        if (i == 2) {
            return "music_library_search";
        }
        if (i == 3) {
            return "music_library_list";
        }
        return null;
    }

    /* renamed from: a */
    public void mo50911a() {
        mo50914b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo50914b() {
        if (this.f95729q != null) {
            this.f95729q.cancel();
        }
        this.f95720h.mo96057b();
    }

    /* renamed from: c */
    public void mo50915c() {
        this.f95720h.mo96053a((C48549d) new C48549d() {
            /* renamed from: a */
            public final void mo50923a(int i, int i2) {
                if (C37518aw.this.f95727o != null) {
                    C37518aw.this.mo77062c(C37518aw.this.f95727o, C37518aw.this.f95728p, C37518aw.this.f95730r);
                }
                C37518aw.this.mo77056a("play_music");
                if (C37518aw.this.f95726n && C37518aw.this.f95720h != null) {
                    C37518aw.this.mo50914b();
                }
                if (!(C37518aw.this.f95717e == null || C37518aw.this.f95717e.mo50819g() == null || i2 == 0)) {
                    C37518aw.this.f95717e.mo50819g().setDuration(i2);
                }
            }
        });
    }

    /* renamed from: e */
    public final void mo77064e() {
        if (this.f95719g != null) {
            this.f95719g.dismiss();
            this.f95719g = null;
        }
    }

    /* renamed from: f */
    private String m83918f() {
        if (this.f95724l == null || this.f95724l.categoryId == null) {
            return "";
        }
        return this.f95724l.categoryId;
    }

    /* renamed from: g */
    private String m83920g() {
        if (this.f95724l == null || this.f95724l.categoryName == null) {
            return "";
        }
        return this.f95724l.categoryName;
    }

    /* renamed from: d */
    public void mo50916d() {
        if (this.f95729q != null) {
            this.f95729q.cancel();
        }
        if (this.f95717e != null) {
            this.f95717e = null;
        }
        if (this.f95722j != null) {
            this.f95722j = null;
        }
        this.f95721i.mo76655a(this.f95716a);
        this.f95720h.mo96050a();
    }

    /* renamed from: a */
    public final C37518aw mo77053a(int i) {
        this.f95718f = i;
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void mo77065e(int i) {
        if (this.f95729q != null) {
            this.f95729q.cancel();
        }
        this.f95721i.mo76655a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo77028a(MusicModel musicModel) {
        AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().setCurMusic(musicModel);
    }

    public C37518aw(C37625m mVar) {
        this.f95717e = mVar;
        this.f95720h = new C48554c();
        C37372e eVar = new C37372e(this.f95717e.mo50821i(), true, true, true, "music_choose_page");
        this.f95721i = eVar;
        this.f95721i.f95347a = 1;
    }

    /* renamed from: f */
    private void m83919f(int i) {
        if (this.f95717e != null) {
            int d = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin().getABService().mo74142d();
            if (d == 0) {
                this.f95719g = C45547d.m99208b(this.f95717e.mo50821i(), this.f95717e.mo50821i().getString(R.string.dnt));
            } else if (d == 1) {
                this.f95719g = C37613h.m84062a(this.f95717e.mo50821i(), C37614a.VISIBLE, new C37524ax(this, i));
            } else if (d == 2) {
                this.f95719g = C37613h.m84062a(this.f95717e.mo50821i(), C37614a.VISIBLE_AFTER_5S, new C37525ay(this, i));
            } else if (d == 3) {
                this.f95719g = C37589c.m84030a(this.f95717e.mo50821i(), C37590a.VISIBLE, new C37526az(this, i), this.f95717e.mo50821i().getString(R.string.dnt));
            } else {
                if (d == 4) {
                    this.f95719g = C37589c.m84030a(this.f95717e.mo50821i(), C37590a.VISIBLE_AFTER_5S, new C37532ba(this, i), this.f95717e.mo50821i().getString(R.string.dnt));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo77056a(String str) {
        String str2;
        if (this.f95727o != null) {
            if (this.f95728p == 2) {
                C23089d a = C23089d.m56640a();
                a.mo47829a("music_id", this.f95727o.getMusicId()).mo47829a("enter_from", "search_music").mo47829a("search_keyword", C37378c.m83693a()).mo47829a("log_pb", new C17971f().mo34889b(this.f95727o.getLogPb()));
                C26890h.m65012a(str, C37539bh.m83960a(a.f61491a));
                return;
            }
            C23089d a2 = C23089d.m56640a().mo47829a("music_id", this.f95727o.getMusicId());
            String str3 = "enter_from";
            int i = this.f95728p;
            if (i == 0) {
                str2 = "song_choose_page";
            } else if (i == 1) {
                str2 = "collection_music";
            } else if (i == 2) {
                str2 = "song_choose_page";
            } else if (i == 3) {
                str2 = "song_category";
            } else {
                str2 = "";
            }
            C23089d a3 = a2.mo47829a(str3, str2).mo47829a("enter_method", "click_play_music");
            String str4 = "previous_page";
            String str5 = "";
            if (this.f95718f != 1) {
                if (this.f95718f == 0) {
                    str5 = "video_edit_page";
                } else if (this.f95718f == 2) {
                    str5 = "video_shoot_page";
                }
            }
            C26890h.m65011a(str, a3.mo47829a(str4, str5).mo47829a("category_id", m83918f()).mo47829a("category_name", m83920g()).f61491a);
        }
    }

    /* renamed from: b */
    public final void mo77059b(MusicModel musicModel, int i) {
        mo76545b(musicModel, i, true);
    }

    /* renamed from: a */
    public final void mo77055a(MusicModel musicModel, int i) {
        mo50913a(musicModel, i, true);
    }

    /* renamed from: c */
    public final void mo77061c(MusicModel musicModel, int i) {
        String g = m83921g(i);
        String str = "";
        if (this.f95718f == 0) {
            str = "video_edit_page";
        } else if (this.f95718f == 2) {
            str = "video_shoot_page";
        }
        C23089d a = C23089d.m56640a();
        C23089d a2 = a.mo47829a("enter_from", g).mo47829a("music_id", musicModel.getMusicId()).mo47829a("category_id", m83918f()).mo47829a("category_name", m83920g()).mo47826a("order", this.f95725m + 1);
        String str2 = "previous_page";
        if (TextUtils.equals("personal_homepage", g)) {
            str = "";
        }
        a2.mo47829a(str2, str);
        if (C24963c.m60732d()) {
            a.mo47829a("is_commercial", "1");
        }
        C26890h.m65012a("add_music", C37539bh.m83960a(a.f61491a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo77029a(MusicModel musicModel, Context context) {
        return C37378c.m83700a(musicModel, context, true);
    }

    /* renamed from: a */
    public void mo50913a(MusicModel musicModel, int i, boolean z) {
        if (!(musicModel == null || this.f95717e == null)) {
            Activity i2 = this.f95717e.mo50821i();
            if (i2 != null) {
                if (!C37535bd.m83957a(i2)) {
                    C10691a.m21542b((Context) i2, (int) R.string.cg1).mo19066a();
                    return;
                }
                this.f95728p = i;
                if (mo77029a(musicModel, (Context) i2)) {
                    this.f95727o = musicModel;
                    this.f95730r = z;
                    this.f95720h.mo96057b();
                    String localPath = musicModel.getLocalPath();
                    C48552a aVar = new C48552a();
                    if (musicModel.getMusicType() == MusicType.ONLINE) {
                        aVar.f121993c = 4;
                        String a = C48557d.m105031a().mo96061a(localPath);
                        aVar.f121994d = musicModel.getRealAuditionDuration();
                        if (TextUtils.isEmpty(a) || !C48016e.m103944b(a) || new File(a).length() <= 0) {
                            aVar.f121992b = musicModel.getUrl().getUrlList();
                            this.f95720h.mo96055a(aVar, z);
                            if (this.f95722j != null) {
                                this.f95722j.mo50709a();
                            }
                        } else {
                            aVar.f121991a = a;
                            this.f95720h.mo96055a(aVar, z);
                            if (this.f95722j != null) {
                                this.f95722j.mo50709a();
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo77062c(MusicModel musicModel, int i, boolean z) {
        if (this.f95729q != null) {
            this.f95729q.cancel();
        }
        if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
            long realAuditionDuration = (long) musicModel.getRealAuditionDuration();
            if (realAuditionDuration <= 0) {
                StringBuilder sb = new StringBuilder("MusicDownloadPlayHelper: audition_duration is zero, music id: ");
                sb.append(musicModel.getMusicId());
                C47625i.m103103a(sb.toString());
                return;
            }
            C375202 r1 = new CountDownTimer(realAuditionDuration, 1000, z, musicModel, i) {

                /* renamed from: a */
                final /* synthetic */ boolean f95732a;

                /* renamed from: b */
                final /* synthetic */ MusicModel f95733b;

                /* renamed from: c */
                final /* synthetic */ int f95734c;

                public final void onTick(long j) {
                }

                public final void onFinish() {
                    C37518aw.this.f95720h.mo96057b();
                    if (this.f95732a) {
                        C37518aw.this.mo50913a(this.f95733b, this.f95734c, true);
                    }
                }

                {
                    this.f95732a = r6;
                    this.f95733b = r7;
                    this.f95734c = r8;
                }
            };
            this.f95729q = r1;
            this.f95729q.start();
        }
    }

    /* renamed from: b */
    public final void mo76545b(final MusicModel musicModel, final int i, boolean z) {
        if (this.f95717e != null && musicModel != null) {
            this.f95727o = musicModel;
            this.f95726n = false;
            C23088c cVar = new C23088c();
            if (i == 2) {
                cVar.mo47824a("source", "search");
            }
            if (this.f95718f != 1) {
                String str = "";
                String str2 = "";
                if (this.f95718f == 0) {
                    str = "mid_page";
                    str2 = "video_edit_page";
                } else if (this.f95718f == 2) {
                    str = "shoot_page";
                    str2 = "video_shoot_page";
                }
                cVar.mo47824a("enter_from", m83922h(i));
                if (musicModel.getMusicType() == MusicType.ONLINE) {
                    if (!C9431p.m18664a(musicModel.getMusicId())) {
                        C26890h.onEvent(MobClick.obtain().setEventName("music_add").setLabelName(str).setValue(musicModel.getMusicId()).setJsonObject(cVar.mo47825b()));
                        String g = m83921g(i);
                        if (C24964d.m60741b() || C37249a.m83510a() == 0 || TextUtils.equals("personal_homepage", g)) {
                            C23089d a = C23089d.m56640a();
                            C23089d a2 = a.mo47829a("enter_from", g).mo47829a("music_id", musicModel.getMusicId()).mo47829a("category_id", m83918f()).mo47829a("category_name", m83920g()).mo47826a("order", this.f95725m + 1);
                            String str3 = "previous_page";
                            if (TextUtils.equals("personal_homepage", g)) {
                                str2 = "";
                            }
                            a2.mo47829a(str3, str2);
                            if (TextUtils.equals(g, "search_music")) {
                                a.mo47829a("search_keyword", C37378c.m83693a());
                                a.mo47829a("log_pb", new C17971f().mo34889b(musicModel.getLogPb()));
                                if (C24963c.m60732d()) {
                                    a.mo47829a("is_commercial", "1");
                                }
                                C26890h.m65012a("add_music", C37539bh.m83960a(a.f61491a));
                            } else {
                                if (C24963c.m60732d()) {
                                    a.mo47829a("is_commercial", "1");
                                }
                                C26890h.m65011a("add_music", a.f61491a);
                            }
                        }
                    }
                } else if (!C9431p.m18664a(musicModel.getSongId())) {
                    C26890h.onEvent(MobClick.obtain().setEventName("music_add").setLabelName(str).setValue(musicModel.getSongId()).setJsonObject(cVar.mo47825b()));
                }
            } else if (!C9431p.m18664a(musicModel.getMusicId())) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("song_position", this.f95723k);
                    if (i == 2) {
                        jSONObject.put("search_keyword", musicModel.getSearchKeyWords());
                    }
                } catch (JSONException unused) {
                }
                C26890h.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("popular_song").setValue(musicModel.getMusicId()).setJsonObject(jSONObject));
            }
            if (musicModel.getMusicType() == MusicType.LOCAL) {
                AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().infoService().mp3Legal(musicModel.getLocalPath(), new IGetInfoCallback<Integer>() {
                    public final /* synthetic */ void finish(Object obj) {
                        if (((Integer) obj).intValue() == 0) {
                            C37518aw.this.mo77057a(musicModel.getLocalPath(), musicModel, C37518aw.m83917b(i, C37518aw.this.f95718f));
                            C37518aw.this.mo77061c(musicModel, i);
                            return;
                        }
                        Activity i = C37518aw.this.f95717e.mo50821i();
                        if (i != null) {
                            C10691a.m21548c((Context) i, (int) R.string.c0u).mo19066a();
                        }
                    }
                });
                return;
            }
            mo50914b();
            Activity i2 = this.f95717e.mo50821i();
            if (i2 == null || !mo77029a(musicModel, (Context) i2)) {
                this.f95717e.mo50813a(musicModel, new Exception(i2.getString(R.string.ce6)));
                return;
            }
            if (musicModel.getMusicType().equals(MusicType.ONLINE)) {
                if (z) {
                    int a3 = this.f95721i.mo76654a();
                    this.f95716a = a3;
                    m83919f(a3);
                }
                m83916a(musicModel, m83917b(i, this.f95718f), this.f95716a, i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77057a(String str, MusicModel musicModel, String str2) {
        if (this.f95717e != null) {
            this.f95726n = true;
            if (this.f95717e.mo50821i() != null) {
                mo50914b();
                C37377b.m83689a().pause();
                mo77028a(musicModel);
                if (this.f95719g != null) {
                    this.f95719g.dismiss();
                }
                this.f95717e.mo50816a(str, musicModel, str2);
            }
        }
    }

    /* renamed from: a */
    private void m83916a(MusicModel musicModel, String str, int i, int i2) {
        C0013i a = C0013i.m16a((Callable<TResult>) new C37533bb<TResult>(musicModel));
        C37534bc bcVar = new C37534bc(this, musicModel, str, i, i2);
        a.mo20a((C0011g<TResult, TContinuationResult>) bcVar, C0013i.f25b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo77054a(final MusicModel musicModel, final String str, int i, int i2, C0013i iVar) throws Exception {
        if (iVar.mo31c() || iVar.mo33d()) {
            mo77064e();
        } else {
            this.f95721i.mo76656a(musicModel, new C37435b() {
                /* renamed from: a */
                public final void mo55350a() {
                }

                /* renamed from: b */
                public final void mo55354b() {
                }

                /* renamed from: a */
                public final void mo55351a(int i) {
                    if (!(C37518aw.this.f95717e == null || !C37518aw.this.f95717e.mo50822j() || C37518aw.this.f95717e.mo50821i() == null || C37518aw.this.f95719g == null)) {
                        C37518aw.this.f95719g.setProgress(i);
                    }
                }

                /* renamed from: a */
                public final void mo55352a(C48545a aVar) {
                    C37518aw.this.mo77064e();
                    if (C37518aw.this.f95717e != null && C37518aw.this.f95717e.mo50822j() && C37518aw.this.f95717e.mo50821i() != null) {
                        C37518aw.this.f95717e.mo50813a(musicModel, aVar);
                        C26890h.onEvent(MobClick.obtain().setEventName("music_download_end").setLabelName("perf_monitor").setExtValueString(musicModel.getMusicId()).setJsonObject(new C26898j().mo54849a("is_success", "0").mo54849a("sdk_type", String.valueOf(MusicService.createIMusicServicebyMonsterPlugin().getDownloadStrategy())).mo54850a()));
                    }
                }

                /* renamed from: a */
                public final void mo55353a(String str, MusicWaveBean musicWaveBean) {
                    musicModel.setMusicWaveBean(musicWaveBean);
                    C37518aw.this.mo77057a(str, musicModel, str);
                    C26890h.onEvent(MobClick.obtain().setEventName("music_download_end").setLabelName("perf_monitor").setExtValueString(musicModel.getMusicId()).setJsonObject(new C26898j().mo54849a("is_success", "1").mo54849a("downloadStrategy", String.valueOf(MusicService.createIMusicServicebyMonsterPlugin().getDownloadStrategy())).mo54850a()));
                }
            }, i, true);
        }
        return null;
    }
}
