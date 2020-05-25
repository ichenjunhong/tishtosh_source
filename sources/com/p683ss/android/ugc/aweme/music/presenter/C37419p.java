package com.p683ss.android.ugc.aweme.music.presenter;

import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29686a;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29689c;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30471a;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30478c.C30479a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.model.MusicDetail;
import com.p683ss.android.ugc.aweme.music.p1975c.C37351d;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37584bs;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37646v;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView.C37446a;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.p2425e.C48554c;
import com.p683ss.android.ugc.p2425e.p2426a.C48549d;
import com.p683ss.android.ugc.p2425e.p2427b.C48552a;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.p */
public final class C37419p extends C37416o<C37425t> implements C29689c, C37446a {

    /* renamed from: a */
    public MusicModel f95434a;

    /* renamed from: b */
    public Music f95435b;

    /* renamed from: c */
    public String f95436c;

    /* renamed from: d */
    public String f95437d;

    /* renamed from: e */
    public String f95438e;

    /* renamed from: h */
    public C48554c f95439h = new C48554c();

    /* renamed from: i */
    public CountDownTimer f95440i;

    /* renamed from: j */
    public C37646v f95441j;

    /* renamed from: k */
    public boolean f95442k = false;

    /* renamed from: l */
    public C0198r<Boolean> f95443l = new C0198r<>();

    /* renamed from: m */
    boolean f95444m;

    /* renamed from: n */
    public boolean f95445n = true;

    /* renamed from: o */
    public String f95446o;

    /* renamed from: p */
    public String f95447p;

    /* renamed from: q */
    private C29686a f95448q = new C29686a();

    /* renamed from: a */
    public final void mo50574a() {
    }

    /* renamed from: h */
    private void m83744h() {
        this.f95442k = !this.f95442k;
    }

    /* renamed from: S_ */
    public final void mo46991S_() {
        super.mo46991S_();
        if (this.f95440i != null) {
            this.f95440i.cancel();
        }
        this.f95439h.mo96050a();
    }

    /* renamed from: e */
    public final void mo76921e() {
        if (this.f95440i != null) {
            this.f95440i.cancel();
        }
        this.f95444m = false;
        this.f95439h.mo96057b();
        ((C37425t) this.f70701g).mo76928a(m83743a(this.f95435b));
    }

    /* renamed from: g */
    public String mo76923g() {
        if (!TextUtils.isEmpty(this.f95447p)) {
            ArrayList a = m83741a(this.f95447p);
            if (!a.isEmpty()) {
                return (String) a.get(0);
            }
        }
        return null;
    }

    public C37419p() {
        this.f95448q.mo54800a(this);
        this.f95448q.f77596c = "single_song";
        this.f95443l.setValue(Boolean.valueOf(false));
    }

    /* renamed from: b */
    public final void mo44838b() {
        if (!(this.f70701g == null || this.f70700f == null)) {
            MusicDetail musicDetail = (MusicDetail) this.f70700f.getData();
            if (musicDetail == null) {
                super.mo44840c_(new RuntimeException("music detail should not be null"));
                return;
            }
            Music music = musicDetail.music;
            if (music == null) {
                super.mo44840c_(new RuntimeException("music should not be null"));
                return;
            }
            this.f95435b = music;
            this.f95434a = this.f95435b.convertToMusicModel();
            if (this.f95434a.getCollectionType() != null) {
                this.f95442k = CollectionType.COLLECTED.equals(this.f95434a.getCollectionType());
                this.f95443l.setValue(Boolean.valueOf(this.f95442k));
            }
            if (C37584bs.m84028a(C11010c.m22280a())) {
                this.f95441j.mo77152a(this.f95434a, mo76923g(), true, true);
            }
            super.mo44838b();
        }
    }

    /* renamed from: f */
    public final void mo76922f() {
        String str;
        this.f95444m = true;
        if (this.f95434a != null) {
            C48552a aVar = new C48552a();
            if (this.f95434a.getMusicType() == MusicType.ONLINE) {
                aVar.f121993c = 4;
            }
            if (C10181b.m20511a().mo18172a(RemoveMusic15sCapExperiment.class, true, "remove_15s_cap_music", 31744, true)) {
                aVar.f121994d = this.f95434a.getAuditionDuration().intValue();
            } else {
                aVar.f121994d = this.f95434a.getDuration();
            }
            if (this.f95434a.isPlayUrlValid()) {
                aVar.f121992b = this.f95434a.getUrl().getUrlList();
            }
            ((C37425t) this.f70701g).mo76926a();
            this.f95439h.mo96054a(aVar);
            this.f95439h.mo96053a((C48549d) new C37423r(this));
            MobClick labelName = MobClick.obtain().setEventName("music_play").setLabelName("single_song");
            C26898j jVar = new C26898j();
            String str2 = "song_id";
            if (this.f95434a != null) {
                str = this.f95434a.getMusicId();
            } else {
                str = "";
            }
            C26890h.onEvent(labelName.setJsonObject(jVar.mo54849a(str2, str).mo54850a()));
        }
    }

    /* renamed from: a */
    public final void mo50575a(int i) {
        if (i == 1) {
            this.f95443l.setValue(Boolean.valueOf(this.f95442k));
        }
    }

    /* renamed from: a */
    public static boolean m83743a(Music music) {
        if (music == null) {
            return false;
        }
        if (music.getMusicStatus() == 0 || music.getSource() == 78) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static ArrayList<String> m83741a(String str) {
        String[] split;
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : str.split(",")) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo76919a(Context context) {
        if (this.f95434a != null) {
            if (!MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(this.f95434a, context, true)) {
                C26890h.m65011a("user_music_failed", C23089d.m56640a().mo47829a("previous_page", "single_song").mo47829a("action_type", "save").mo47829a("music_id", this.f95434a.getMusicId()).mo47829a("enter_from", this.f95437d).f61491a);
                return;
            }
            this.f95448q.mo44934a_(Integer.valueOf(1), this.f95434a.getMusicId(), Integer.valueOf(true ^ this.f95442k ? 1 : 0));
            m83744h();
        }
    }

    /* renamed from: a */
    public final void mo50568a(BaseResponse baseResponse) {
        if (this.f95442k) {
            this.f95434a.setCollectionType(CollectionType.COLLECTED);
            this.f95435b.setCollectStatus(1);
            C37351d dVar = new C37351d(1, this.f95434a);
            dVar.f95313c = "music_detail";
            C47718bf.m103288a(dVar);
            if (this.f70701g != null) {
                ((C37425t) this.f70701g).bA_();
            }
            C26890h.onEvent(MobClick.obtain().setEventName("collection_music_cancel").setLabelName("single_song").setValue(String.valueOf(this.f95434a.getMusicId())).setExtValueLong(0));
            return;
        }
        this.f95434a.setCollectionType(CollectionType.NOT_COLLECTED);
        this.f95435b.setCollectStatus(0);
        C37351d dVar2 = new C37351d(0, this.f95434a);
        dVar2.f95313c = "music_detail";
        C47718bf.m103288a(dVar2);
        C26890h.onEvent(MobClick.obtain().setEventName("collection_music").setLabelName("single_song").setValue(String.valueOf(this.f95434a.getMusicId())).setExtValueLong(0));
    }

    /* renamed from: a */
    public final void mo50570a(Exception exc) {
        m83744h();
        this.f95443l.setValue(Boolean.valueOf(this.f95442k));
    }

    /* renamed from: a */
    public final void mo76920a(String str, String str2) {
        if (this.f95434a != null && !TextUtils.isEmpty(str)) {
            if (!TextUtils.equals(str, "qr_code")) {
                C26890h.m65011a("share_music", C23089d.m56640a().mo47829a("music_id", this.f95434a.getMusicId()).mo47829a("platform", str).mo47829a("process_id", str2).mo47829a("share_mode", "normal_share").f61491a);
            }
            C41979aq.m91947b().addShareRecord(str, 2);
        }
    }

    /* renamed from: a */
    public static void m83742a(String str, boolean z, SharePackage sharePackage, Context context, Music music) {
        if (z && music != null) {
            C26851b bVar = new C26851b();
            bVar.mo54799a(new C30471a());
            bVar.mo44934a_(new C30479a().mo60897a(music.getMid()).mo60896a(1).mo60899b(-1).mo60902d(2).mo60900b(str).mo60898a());
        }
    }
}
