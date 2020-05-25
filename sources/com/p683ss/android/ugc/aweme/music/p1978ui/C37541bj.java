package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.app.services.C23162j;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24995p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.adapter.C37288d;
import com.p683ss.android.ugc.aweme.music.adapter.C37292h;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37274a;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37276c;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37278e;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37279f;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37280g;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37282i;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37283j;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37286m;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.model.MusicCategory;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.p683ss.android.ugc.aweme.music.p1975c.C37348a;
import com.p683ss.android.ugc.aweme.music.p1975c.C37350c;
import com.p683ss.android.ugc.aweme.music.p1975c.C37351d;
import com.p683ss.android.ugc.aweme.music.p1975c.C37353f;
import com.p683ss.android.ugc.aweme.music.p1975c.C37356i;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1978ui.MusicListFragment.C37471a;
import com.p683ss.android.ugc.aweme.music.p1978ui.MusicListFragment.C37472b;
import com.p683ss.android.ugc.aweme.music.presenter.C37398d;
import com.p683ss.android.ugc.aweme.music.presenter.C37411m;
import com.p683ss.android.ugc.aweme.music.presenter.C37413n;
import com.p683ss.android.ugc.aweme.music.presenter.C37426u;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53771m;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.music.ui.bj */
public class C37541bj extends MusicListFragment implements C26877c<Music>, C37288d, C37398d, C37472b {

    /* renamed from: B */
    private static final String f95767B = "com.ss.android.ugc.aweme.music.ui.bj";

    /* renamed from: A */
    C0013i<Music> f95768A;

    /* renamed from: C */
    private C26876b<C37426u> f95769C;

    /* renamed from: D */
    private C26876b<C37411m> f95770D;

    /* renamed from: E */
    private boolean f95771E;

    /* renamed from: F */
    private boolean f95772F;

    /* renamed from: G */
    private C37413n f95773G;

    /* renamed from: H */
    private int f95774H;

    /* renamed from: I */
    private List<Music> f95775I = new ArrayList();

    /* renamed from: J */
    private List<C37283j> f95776J = new ArrayList();

    /* renamed from: K */
    private List<C37283j> f95777K = new ArrayList();

    /* renamed from: L */
    private List<C37283j> f95778L = new ArrayList();

    /* renamed from: M */
    private GridLayoutManager f95779M;

    /* renamed from: n */
    public int f95780n;

    /* renamed from: o */
    public String f95781o;

    /* renamed from: p */
    MusicTabView f95782p;

    /* renamed from: q */
    public List<C37283j> f95783q = new ArrayList();

    /* renamed from: r */
    public List<MusicModel> f95784r = new ArrayList();

    /* renamed from: s */
    public boolean f95785s = false;

    /* renamed from: t */
    public Map<String, List<C37283j>> f95786t = new LinkedHashMap();

    /* renamed from: u */
    public boolean f95787u = false;

    /* renamed from: v */
    int f95788v = -1;

    /* renamed from: w */
    public int f95789w = -1;

    /* renamed from: x */
    boolean f95790x = false;

    /* renamed from: y */
    public Music f95791y;

    /* renamed from: z */
    C0013i<Challenge> f95792z;

    /* renamed from: R_ */
    public final void mo47017R_() {
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<Music> list, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final int mo77003h() {
        return R.layout.qa;
    }

    /* renamed from: a */
    public final void mo47018a(List<Music> list, boolean z) {
        m83966a(true);
        if (isViewValid()) {
            m83967d(list, z);
        }
    }

    /* renamed from: a */
    public final void mo76907a(List<MusicCollectionItem> list) {
        if (isViewValid()) {
            C37292h hVar = this.f95620c;
            if (hVar != null) {
                this.f95778L.clear();
                if (!C9376b.m18558a((Collection<T>) list)) {
                    this.f95778L.addAll(list);
                }
                this.f95786t.put("collection", this.f95778L);
                boolean z = list == null || list.size() <= 8;
                if (!C9376b.m18558a((Collection<T>) list)) {
                    hVar.mo76598a(list, z);
                }
                C0013i s = m83968s();
                if (s.mo26b() && !s.mo33d()) {
                    Challenge challenge = null;
                    if (s.mo34e() != null) {
                        challenge = (Challenge) s.mo34e();
                    }
                    mo77073a(challenge);
                }
                m83971v();
            }
        }
    }

    /* renamed from: t */
    private boolean m83969t() {
        if (this.f95780n == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private C0013i<Challenge> m83968s() {
        if (this.f95792z == null) {
            if (this.f95781o != null) {
                this.f95792z = C0013i.m16a((Callable<TResult>) new Callable<Challenge>() {
                    public final /* synthetic */ Object call() throws Exception {
                        return C23162j.m56760b().mo47876a(C37541bj.this.f95781o, 0, false);
                    }
                });
            } else {
                this.f95792z = C0013i.m14a(null);
            }
        }
        return this.f95792z;
    }

    /* renamed from: x */
    private static boolean m83973x() {
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

    /* renamed from: e */
    public final void mo47031e() {
        if (isViewValid() && this.f95620c != null) {
            this.f95620c.am_();
        }
    }

    /* renamed from: n */
    public final C26876b<C37411m> mo77075n() {
        if (this.f95770D == null) {
            this.f95770D = new C26876b<>();
            this.f95770D.mo54800a(this);
            this.f95770D.mo54799a(new C37411m());
        }
        return this.f95770D;
    }

    /* renamed from: o */
    public final C26876b<C37426u> mo77076o() {
        if (this.f95769C == null) {
            this.f95769C = new C26876b<>();
            this.f95769C.mo54800a(this);
            this.f95769C.mo54799a(new C37426u());
        }
        return this.f95769C;
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f95773G != null) {
            this.f95773G.mo46991S_();
        }
        if (this.f95770D != null) {
            this.f95770D.mo46991S_();
        }
        if (this.f95769C != null) {
            this.f95769C.mo46991S_();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final void mo77079p() {
        m83970u();
        m83963a((Activity) getActivity()).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<List<MusicModel>, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C0013i<List<MusicModel>> iVar) throws Exception {
                C37541bj.this.f95785s = true;
                if (C37541bj.this.getActivity() == null) {
                    C37541bj.this.mo77081r();
                    return null;
                } else if (iVar.mo33d()) {
                    C37541bj.this.mo77081r();
                    return null;
                } else {
                    if (!iVar.mo26b()) {
                        C37541bj.this.mo77081r();
                    } else if (C37541bj.this.f95780n != 2) {
                        return null;
                    } else {
                        C37541bj.this.f95784r = (List) iVar.mo34e();
                        C37541bj.this.mo77080q();
                    }
                    return null;
                }
            }
        }, C0013i.f25b);
    }

    /* renamed from: u */
    private void m83970u() {
        this.f95783q.clear();
        this.f95783q.add(new C37280g());
        this.f95783q.add(new C37286m());
        this.f95783q.add(new C37276c());
        this.f95786t.put("tab_data", this.f95783q);
        mo77001a(this.f95786t, 6);
    }

    /* renamed from: v */
    private void m83971v() {
        mo77004k();
        m83972w();
        if (!this.f95771E) {
            mo77076o().mo44934a_(Integer.valueOf(1));
            return;
        }
        m83967d(((C37426u) this.f95769C.mo54803n()).getItems(), ((C37426u) this.f95769C.mo54803n()).isHasMore());
    }

    /* renamed from: w */
    private void m83972w() {
        for (Music music : this.f95775I) {
            if (((C37411m) mo77075n().mo54803n()).getItems().contains(music) && music.getCollectStatus() != 1) {
                mo77075n().mo54839a((Object) music);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo77005l() {
        boolean z;
        if (this.f95780n == 0) {
            z = ((C37426u) mo77076o().mo54803n()).isHasMore();
        } else if (this.f95780n == 1) {
            z = ((C37411m) mo77075n().mo54803n()).isHasMore();
        } else {
            z = false;
        }
        if (z) {
            super.mo77005l();
        }
    }

    /* renamed from: r */
    public final void mo77081r() {
        this.f95783q.clear();
        this.f95783q.add(new C37280g());
        this.f95783q.add(new C37286m());
        this.f95783q.add(new C37276c());
        this.f95786t.put("tab_data", this.f95783q);
        mo77001a(this.f95786t, 6);
    }

    public final void aJ_() {
        m83966a(true);
        C37292h hVar = this.f95620c;
        m83967d(new ArrayList(), false);
        if (hVar != null) {
            if (this.f95780n == 1) {
                this.f95776J.clear();
                this.f95776J.add(new C37282i());
                this.f95786t.put("favorite_empty_data", this.f95776J);
                mo77001a(this.f95786t, 1);
                hVar.mo54792d(R.string.dle);
                return;
            }
            if (C24954a.m60699b()) {
                hVar.mo54792d(R.string.fx2);
            } else {
                hVar.mo54792d(R.string.an1);
            }
            hVar.an_();
        }
    }

    /* renamed from: q */
    public final void mo77080q() {
        this.f95783q.clear();
        C37292h hVar = this.f95620c;
        this.f95783q.add(new C37280g());
        if (C9376b.m18558a((Collection<T>) this.f95784r)) {
            this.f95783q.add(new C37286m());
            this.f95783q.add(new C37278e());
            hVar.ao_();
        } else {
            this.f95783q.add(new C37286m());
            this.f95783q.add(new C37279f());
            this.f95783q.addAll(this.f95784r);
            if (hVar != null) {
                hVar.mo54792d(R.string.an1);
            }
        }
        this.f95786t.put("tab_data", this.f95783q);
        mo77001a(this.f95786t, 6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStop() {
        /*
            r7 = this;
            super.onStop()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.mo50819g()
            com.ss.android.ugc.aweme.music.adapter.h r1 = r7.f95620c
            if (r1 == 0) goto L_0x0084
            r1 = 0
            r2 = 0
        L_0x000d:
            android.support.v7.widget.RecyclerView r3 = r7.mListView
            int r3 = r3.getChildCount()
            if (r2 >= r3) goto L_0x0084
            android.support.v7.widget.RecyclerView r3 = r7.mListView
            android.view.View r3 = r3.getChildAt(r2)
            android.support.v7.widget.RecyclerView r4 = r7.mListView
            android.support.v7.widget.RecyclerView$v r3 = r4.mo4812b(r3)
            boolean r4 = r3 instanceof com.p683ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder
            if (r4 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder r3 = (com.p683ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder) r3
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r4 = r3.f95118a
            if (r4 == 0) goto L_0x0081
            android.widget.ImageView r4 = r3.mPlayView
            if (r4 == 0) goto L_0x0081
            if (r0 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r4 = r3.f95118a
            if (r4 == 0) goto L_0x0076
            if (r0 != 0) goto L_0x0038
            goto L_0x0076
        L_0x0038:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r5 = r4.getMusicType()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r6 = r0.getMusicType()
            if (r5 == r6) goto L_0x0043
            goto L_0x0076
        L_0x0043:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r5 = r4.getMusicType()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r6 = com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType.ONLINE
            if (r5 != r6) goto L_0x0069
            java.lang.String r5 = r4.getMusicId()
            java.lang.String r6 = r0.getMusicId()
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 == 0) goto L_0x0076
            java.lang.String r4 = r4.getUri()
            java.lang.String r5 = r0.getUri()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x0076
            r4 = 1
            goto L_0x0077
        L_0x0069:
            java.lang.String r4 = r4.getLocalPath()
            java.lang.String r5 = r0.getLocalPath()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            goto L_0x0077
        L_0x0076:
            r4 = 0
        L_0x0077:
            if (r4 == 0) goto L_0x0081
            android.widget.ImageView r3 = r3.mPlayView
            r4 = 2131953358(0x7f1306ce, float:1.9543185E38)
            r3.setImageResource(r4)
        L_0x0081:
            int r2 = r2 + 1
            goto L_0x000d
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.music.p1978ui.C37541bj.onStop():void");
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f95622e = this;
    }

    /* renamed from: a */
    private void m83964a(int i) {
        if (i != -1) {
            this.f95779M.mo4721a(i, 0);
        }
    }

    /* renamed from: a */
    private void m83966a(boolean z) {
        if (this.f95780n == 0) {
            this.f95771E = z;
            return;
        }
        if (this.f95780n == 1) {
            this.f95772F = z;
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        m83966a(false);
        if (this.f95780n == 1 && this.mStatusView != null) {
            this.mListView.setVisibility(4);
            this.mStatusView.mo19214h();
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        if (isViewValid() && this.f95620c != null) {
            this.f95620c.co_();
        }
    }

    /* renamed from: d */
    public final void mo76908d(Exception exc) {
        if (getContext() != null) {
            C10691a.m21542b(getContext(), (int) R.string.dnk).mo19066a();
        }
    }

    @C53771m
    public void onCheckLoginStateEvent(C37348a aVar) {
        if (aVar != null && aVar.f95308a) {
            getString(R.string.b17);
            C27965f.m66724a((Fragment) this, "", "click_my_music", (Bundle) null);
        }
    }

    /* renamed from: a */
    private static C0013i<List<MusicModel>> m83963a(Activity activity) {
        C0027j jVar = new C0027j();
        C32458a.m75150b("Local Sound", "Start Load Local Sound");
        ArrayList arrayList = new ArrayList();
        try {
            jVar.getClass();
            C37378c.m83697a((Context) activity, (List<MusicModel>) arrayList, (IGetInfoCallback<List<MusicModel>>) new C37552bl<List<MusicModel>>(jVar));
        } catch (Exception e) {
            C32458a.m75150b("Local Sound", "Scan Music throw a Exception");
            C32458a.m75148a((Throwable) e);
        }
        return jVar.f77a;
    }

    /* renamed from: b */
    public final void mo77074b(List<Music> list) {
        if (!C9414h.m18630a(list)) {
            C37292h hVar = this.f95620c;
            this.f95777K.clear();
            if (hVar != null) {
                for (Music music : list) {
                    if (music != null) {
                        MusicModel convertToMusicModel = music.convertToMusicModel();
                        convertToMusicModel.setChallengeUserCount(music.getUserCount());
                        convertToMusicModel.setChallengeMusic(true);
                        convertToMusicModel.setDataType(0);
                        this.f95777K.add(convertToMusicModel);
                    }
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        Music music;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("challenge")) {
            this.f95781o = arguments.getString("challenge");
        }
        if (arguments != null) {
            i = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            i = 0;
        }
        this.f95774H = i;
        if (arguments != null) {
            music = (Music) arguments.getSerializable("sticker_music");
        } else {
            music = null;
        }
        this.f95791y = music;
    }

    /* renamed from: a */
    private void m83965a(C37292h hVar) {
        if (this.f95787u && this.f95790x) {
            int i = -1;
            if (this.f95780n == 1) {
                i = hVar.f95190l;
            } else if (this.f95780n == 0) {
                i = Math.max(hVar.f95190l, this.f95788v);
            } else if (this.f95780n == 2) {
                i = Math.max(hVar.f95190l, this.f95789w);
            }
            m83964a(i);
        }
        this.f95790x = false;
    }

    /* renamed from: a */
    public final void mo77073a(Challenge challenge) {
        if (challenge != null) {
            C37292h hVar = this.f95620c;
            this.f95777K.clear();
            this.f95777K.add(new C37274a());
            if (hVar != null) {
                hVar.f95182d = challenge;
                if (!(challenge.getConnectMusics() == null || challenge.getConnectMusics().size() == 0)) {
                    for (Music music : challenge.getConnectMusics()) {
                        MusicModel convertToMusicModel = music.convertToMusicModel();
                        convertToMusicModel.setChallengeUserCount(music.getUserCount());
                        convertToMusicModel.setChallengeMusic(true);
                        convertToMusicModel.setDataType(0);
                        this.f95777K.add(convertToMusicModel);
                    }
                }
            }
        }
    }

    @C53771m
    public void onMusicCollectEvent(C37351d dVar) {
        if (isViewValid()) {
            MusicModel musicModel = dVar.f95312b;
            if (musicModel != null) {
                Music music = musicModel.getMusic();
                if (music != null) {
                    int i = dVar.f95311a;
                    music.setCollectStatus(i);
                    if (m83968s().mo26b() && !m83968s().mo33d()) {
                        Challenge challenge = null;
                        if (m83968s().mo34e() != null) {
                            challenge = (Challenge) m83968s().mo34e();
                        }
                        if (!(challenge == null || challenge.getConnectMusics() == null)) {
                            Music a = C37378c.m83692a(challenge.getConnectMusics(), music.getMid());
                            if (!(challenge == null || challenge.getConnectMusics() == null || a == null)) {
                                a.setCollectStatus(i);
                                mo77073a(challenge);
                            }
                        }
                    }
                    List items = ((C37411m) mo77075n().mo54803n()).getItems();
                    Music a2 = C37378c.m83692a(items, music.getMid());
                    int indexOf = items.indexOf(music);
                    int a3 = this.f95620c.mo76596a();
                    if (i == 1) {
                        if (a2 == null) {
                            music.setCollectStatus(i);
                            items.add(0, music);
                        } else {
                            a2.setCollectStatus(i);
                        }
                        if (!m83969t()) {
                            this.f95620c.notifyDataSetChanged();
                        }
                    } else if (a2 != null) {
                        a2.setCollectStatus(i);
                        if (!m83969t()) {
                            this.f95775I.add(a2);
                        } else {
                            mo77075n().mo54839a((Object) a2);
                        }
                        this.f95620c.notifyItemChanged(a3 + indexOf);
                    }
                    List items2 = ((C37426u) mo77076o().mo54803n()).getItems();
                    Music a4 = C37378c.m83692a(items2, music.getMid());
                    int indexOf2 = items2.indexOf(music);
                    int a5 = this.f95620c.mo76596a();
                    if (a4 != null) {
                        a4.setCollectStatus(i);
                        if (m83969t()) {
                            this.f95620c.notifyItemChanged(a5 + indexOf2);
                        }
                    }
                }
            }
        }
    }

    @C53771m
    public void onSwitchMusicFragmentEvent(C37356i iVar) {
        this.f95786t.put("favorite_empty_data", new ArrayList());
        this.f95780n = iVar.f95318a;
        this.f95782p.mo77026a(this.f95780n);
        this.f95790x = true;
        this.f95620c.ao_();
        if (this.f95620c != null) {
            this.f95620c.mo76601f();
        }
        if (this.f95625l != null) {
            C24995p pVar = this.f95625l;
            pVar.f66170a = 0;
            pVar.f66174e = 0;
            pVar.f66175f = 0;
        }
        if (iVar.f95318a == 0) {
            this.f95618a = new MusicCategory("music_library_hot");
            mo77076o().mo54800a(this);
            mo77075n().mo54800a(null);
            m83971v();
            return;
        }
        if (iVar.f95318a == 1) {
            this.f95618a = new MusicCategory("favourite_song");
            mo77076o().mo54800a(null);
            mo77075n().mo54800a(this);
            mo77004k();
            if (!AccountService.createIAccountServicebyMonsterPlugin().userService().isLogin()) {
                aJ_();
            } else {
                m83970u();
                mo77075n().mo44934a_(Integer.valueOf(1));
            }
        } else if (iVar.f95318a == 2) {
            this.f95618a = new MusicCategory("local_music");
            mo77076o().mo54800a(null);
            mo77075n().mo54800a(null);
            if (this.f95785s) {
                mo77080q();
            } else if (C0726c.m2090a((Context) getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                mo77079p();
            } else {
                C23361b.m57419a(getActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C23364b() {
                    /* renamed from: a */
                    public final void mo40906a(String[] strArr, int[] iArr) {
                        if (iArr[0] == 0) {
                            C37541bj.this.mo77079p();
                            return;
                        }
                        C37292h hVar = C37541bj.this.f95620c;
                        C37541bj.this.f95783q.clear();
                        C37541bj.this.f95783q.add(new C37280g());
                        C37541bj.this.f95783q.add(new C37286m());
                        C37541bj.this.f95783q.add(new C37278e());
                        hVar.ao_();
                        C37541bj.this.f95786t.put("tab_data", C37541bj.this.f95783q);
                        C37541bj.this.mo77001a(C37541bj.this.f95786t, 6);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo50815a(C37353f fVar) {
        String str;
        String str2;
        String str3;
        super.mo50815a(fVar);
        MusicModel musicModel = fVar.f95314a;
        String str4 = fVar.f95315b;
        switch (this.f95780n) {
            case 0:
                str = "songchart";
                break;
            case 1:
                str = "favorite_song";
                break;
            case 2:
                str = "save_local";
                break;
            default:
                str = null;
                break;
        }
        if (str != null) {
            if ("follow_type".equals(str4)) {
                C23089d a = C23089d.m56640a();
                C23089d a2 = a.mo47829a("enter_from", str);
                String str5 = "music_id";
                if (musicModel != null) {
                    str3 = musicModel.getMusicId();
                } else {
                    str3 = "";
                }
                a2.mo47829a(str5, str3);
                if (C24963c.m60732d()) {
                    a.mo47829a("is_commercial", "1");
                }
                C26890h.m65011a("favourite_song", a.f61491a);
            } else if ("unfollow_type".equals(str4)) {
                C23089d a3 = C23089d.m56640a();
                C23089d a4 = a3.mo47829a("enter_from", str);
                String str6 = "music_id";
                if (musicModel != null) {
                    str2 = musicModel.getMusicId();
                } else {
                    str2 = "";
                }
                a4.mo47829a(str6, str2);
                if (C24963c.m60732d()) {
                    a3.mo47829a("is_commercial", "1");
                }
                C26890h.m65011a("cancel_favourite_song", a3.f61491a);
            }
        }
    }

    /* renamed from: a */
    public final void mo50812a(MusicCollectionItem musicCollectionItem) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, MusicListActivity.class);
            intent.putExtra("mc_id", musicCollectionItem.mcId);
            intent.putExtra("title_name", musicCollectionItem.mcName);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.f95774H);
            intent.putExtra("translation_type", 3);
            C47718bf.m103289b(new C37350c("song_category"));
            startActivityForResult(intent, 1);
            C24963c.m60724a(musicCollectionItem.mcName, "click_category_list", "", "change_music_page", musicCollectionItem.mcId);
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<Music> list, boolean z) {
        if (isViewValid()) {
            m83967d(list, z);
        }
    }

    /* renamed from: d */
    private void m83967d(List<Music> list, boolean z) {
        this.f95783q.clear();
        this.f95783q.add(new C37280g());
        this.f95783q.add(new C37286m());
        if (m83969t()) {
            this.f95783q.addAll(this.f95777K);
        }
        this.f95783q = C37378c.m83695a(list, this.f95783q);
        this.f95786t.put("tab_data", this.f95783q);
        mo77000a(list, m83969t() ^ true ? 1 : 0);
        C37292h hVar = this.f95620c;
        hVar.f70682s = getResources().getColor(R.color.in);
        if (hVar != null) {
            mo77001a(this.f95786t, m83969t() ^ true ? 1 : 0);
            if (!z) {
                hVar.an_();
                hVar.mo54792d(R.string.an1);
            } else {
                hVar.ao_();
            }
            m83965a(hVar);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f95773G == null) {
            this.f95773G = new C37413n();
            this.f95773G.mo54800a(this);
        }
        this.f95773G.mo44934a_(new Object[0]);
        this.f95779M = new WrapGridLayoutManager(getContext(), 4);
        this.mListView.setLayoutManager(this.f95779M);
        this.f95779M.f4526g = new C1302b() {
            /* renamed from: a */
            public final int mo4690a(int i) {
                return C37541bj.this.f95620c.mo76600b(i);
            }
        };
        this.f95782p = new MusicTabView(view.findViewById(R.id.b_9), m83973x());
        this.f95782p.mo77026a(0);
        this.mListView.mo4801a((C1340m) new C1340m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                int f = RecyclerView.m4275f(recyclerView.getChildAt(0));
                if (C37541bj.this.f95787u) {
                    if (C37541bj.this.f95780n == 0) {
                        C37541bj.this.f95788v = f;
                    } else if (C37541bj.this.f95780n == 2) {
                        C37541bj.this.f95789w = f;
                    }
                }
            }
        });
        this.mListView.mo4798a((C1331h) new C1331h() {
            public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
                boolean z;
                super.onDrawOver(canvas, recyclerView, sVar);
                int f = RecyclerView.m4275f(recyclerView.getChildAt(0));
                if (f != -1) {
                    int i = C37541bj.this.f95620c.f95190l;
                    if (i == -1 || f < i) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        C37541bj bjVar = C37541bj.this;
                        bjVar.f95782p.f95664b.setVisibility(0);
                        bjVar.f95787u = true;
                        return;
                    }
                    C37541bj bjVar2 = C37541bj.this;
                    bjVar2.f95782p.f95664b.setVisibility(8);
                    bjVar2.f95787u = false;
                }
            }
        });
        this.f95786t.put("collection", new ArrayList());
        this.f95786t.put("showless_data", new ArrayList());
        this.f95786t.put("tab_data", new ArrayList());
        this.f95786t.put("favorite_empty_data", new ArrayList());
        this.f95626m = new C37471a() {
            /* renamed from: a */
            public final void mo50864a() {
                if (C37541bj.this.isViewValid()) {
                    if (C37541bj.this.f95780n == 0) {
                        C37541bj.this.mo77076o().mo44934a_(Integer.valueOf(4));
                    } else if (C37541bj.this.f95780n == 1) {
                        C37541bj.this.mo77075n().mo44934a_(Integer.valueOf(4));
                    }
                }
            }
        };
        m83968s().mo20a((C0011g<TResult, TContinuationResult>) new C0011g<Challenge, Void>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                Challenge challenge;
                if (!iVar.mo33d()) {
                    if (iVar.mo34e() != null) {
                        challenge = (Challenge) iVar.mo34e();
                    } else {
                        challenge = null;
                    }
                    C37541bj.this.mo77073a(challenge);
                }
                return null;
            }
        }, C0013i.f25b);
        if (this.f95768A == null) {
            if (this.f95791y != null) {
                if (TextUtils.isEmpty(this.f95791y.getMid())) {
                    C37378c.m83703b();
                }
                this.f95768A = C0013i.m16a((Callable<TResult>) new C37551bk<TResult>(this));
            } else {
                this.f95768A = C0013i.m14a(null);
            }
        }
        this.f95768A.mo20a((C0011g<TResult, TContinuationResult>) new C0011g<Music, Void>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                if (!iVar.mo33d()) {
                    Music music = C37541bj.this.f95791y;
                    if (iVar.mo34e() != null) {
                        music = (Music) iVar.mo34e();
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(music);
                    C37541bj.this.mo77074b((List<Music>) arrayList);
                }
                return null;
            }
        }, C0013i.f25b);
        this.f95618a = new MusicCategory("music_library_hot");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ad  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50854a(com.p683ss.android.ugc.aweme.music.p1978ui.MusicListFragment r7, java.lang.String r8, com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel r9, java.lang.String r10) {
        /*
            r6 = this;
            android.support.v4.app.FragmentActivity r7 = r6.getActivity()
            java.lang.String r0 = r6.f95781o
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0029
            a.i r0 = r6.m83968s()
            boolean r1 = r0.mo26b()
            if (r1 == 0) goto L_0x0029
            boolean r1 = r0.mo33d()
            if (r1 != 0) goto L_0x0029
            java.lang.Object r1 = r0.mo34e()
            if (r1 == 0) goto L_0x0029
            java.lang.Object r0 = r0.mo34e()
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = (com.p683ss.android.ugc.aweme.discover.model.Challenge) r0
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            int r1 = r6.mo77006m()
            if (r1 == 0) goto L_0x00ab
            int r1 = r6.mo77006m()
            r2 = 2
            if (r1 != r2) goto L_0x0038
            goto L_0x00ab
        L_0x0038:
            android.os.Bundle r1 = r6.getArguments()
            java.lang.String r3 = "shoot_way"
            java.lang.String r1 = r1.getString(r3)
            if (r1 != 0) goto L_0x004f
            boolean r1 = r6.m83969t()
            if (r1 == 0) goto L_0x004d
            java.lang.String r1 = "popular_song"
            goto L_0x004f
        L_0x004d:
            java.lang.String r1 = "collection_music"
        L_0x004f:
            int r3 = r6.f95780n
            if (r3 == r2) goto L_0x0078
            java.lang.String r2 = "shoot"
            com.ss.android.ugc.aweme.app.f.d r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r4 = "shoot_way"
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r1)
            java.lang.String r4 = "music_id"
            java.lang.String r5 = r9.getMusicId()
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "group_id"
            java.lang.String r5 = com.p683ss.android.ugc.aweme.p1382aq.C23208an.m56933a()
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r3)
        L_0x0078:
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r2 = new com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder
            r2.<init>()
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r1 = r2.shootWay(r1)
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r1 = r1.creationId(r3)
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r8 = r1.musicPath(r8)
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r8 = r8.musicModel(r9)
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r8 = r8.musicOrigin(r10)
            r8.challenge(r0)
            com.ss.android.ugc.aweme.services.IExternalService r8 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r8 = (com.p683ss.android.ugc.aweme.services.IExternalService) r8
            com.ss.android.ugc.aweme.music.ui.bm r9 = new com.ss.android.ugc.aweme.music.ui.bm
            r9.<init>(r7, r2)
            r8.asyncService(r9)
            return
        L_0x00ab:
            if (r0 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.services.IExternalService r1 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r1 = (com.p683ss.android.ugc.aweme.services.IExternalService) r1
            com.ss.android.ugc.aweme.services.video.IAVPublishService r1 = r1.publishService()
            r1.addChallenge(r0)
        L_0x00ba:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "path"
            r0.putExtra(r1, r8)
            java.lang.String r8 = "music_model"
            r0.putExtra(r8, r9)
            java.lang.String r8 = "music_origin"
            r0.putExtra(r8, r10)
            r8 = -1
            r7.setResult(r8, r0)
            r7.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.music.p1978ui.C37541bj.mo50854a(com.ss.android.ugc.aweme.music.ui.MusicListFragment, java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.String):void");
    }
}
