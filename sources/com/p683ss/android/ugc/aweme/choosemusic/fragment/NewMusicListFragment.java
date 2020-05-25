package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.arch.lifecycle.C0214z;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel;
import com.p683ss.android.ugc.aweme.choosemusic.abtest.RefreshSearchViewHolderExperiment;
import com.p683ss.android.ugc.aweme.choosemusic.adapter.C24816b;
import com.p683ss.android.ugc.aweme.choosemusic.adapter.C24828k;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1504c.C24840c;
import com.p683ss.android.ugc.aweme.choosemusic.p1504c.C24841d;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24867w;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24870z;
import com.p683ss.android.ugc.aweme.choosemusic.p1507f.p1508a.C24874a;
import com.p683ss.android.ugc.aweme.choosemusic.p1507f.p1510c.C24879a.C24880a;
import com.p683ss.android.ugc.aweme.choosemusic.p1507f.p1510c.C24881b;
import com.p683ss.android.ugc.aweme.choosemusic.p1507f.p1511d.C24885a;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24955a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24995p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.music.adapter.C37288d;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p683ss.android.ugc.aweme.music.p1975c.C37350c;
import com.p683ss.android.ugc.aweme.music.p1975c.C37351d;
import com.p683ss.android.ugc.aweme.music.p1977e.C37377b;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37518aw.C37523a;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37625m;
import com.p683ss.android.ugc.aweme.music.presenter.C37397c;
import com.p683ss.android.ugc.aweme.music.presenter.C37408l;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment */
public class NewMusicListFragment extends C23526a implements C24833b, C24880a, C26846a, C37288d, C37306l<C24806c>, C37397c, C37625m {

    /* renamed from: u */
    private static final String f65850u = "com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment";

    /* renamed from: A */
    private boolean f65851A = true;

    /* renamed from: B */
    private boolean f65852B = false;

    /* renamed from: C */
    private MusicModel f65853C;

    /* renamed from: a */
    C24881b f65854a;

    /* renamed from: b */
    public C24816b f65855b;

    /* renamed from: c */
    C24874a f65856c;

    /* renamed from: d */
    MusicSearchStateViewModel f65857d;

    /* renamed from: e */
    C24995p f65858e;

    /* renamed from: j */
    protected C24955a f65859j;

    /* renamed from: k */
    public C24888b f65860k;

    /* renamed from: l */
    public int f65861l;

    /* renamed from: m */
    List<MusicModel> f65862m = new ArrayList();
    View mBackgroundView;
    public RecyclerView mListView;
    DmtStatusView mStatusView;

    /* renamed from: n */
    String f65863n;

    /* renamed from: o */
    String f65864o;

    /* renamed from: p */
    boolean f65865p = false;

    /* renamed from: q */
    String f65866q = "";

    /* renamed from: r */
    public C24889c f65867r;

    /* renamed from: s */
    public C24887a f65868s;

    /* renamed from: t */
    public OnClickListener f65869t;

    /* renamed from: v */
    private String f65870v = "popular_song";

    /* renamed from: w */
    private String f65871w;

    /* renamed from: x */
    private int f65872x;

    /* renamed from: y */
    private C37408l f65873y;

    /* renamed from: z */
    private C24828k f65874z;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment$a */
    public interface C24887a {
        /* renamed from: a */
        void mo50830a();
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment$b */
    public interface C24888b {
        /* renamed from: a */
        void mo50831a(int i, String str, MusicModel musicModel, String str2);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment$c */
    public interface C24889c {
        /* renamed from: a */
        void mo50832a();
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo50812a(MusicCollectionItem musicCollectionItem) {
    }

    /* renamed from: a */
    public final void mo50813a(MusicModel musicModel, Exception exc) {
    }

    /* renamed from: g */
    public final MusicModel mo50819g() {
        return this.f65853C;
    }

    /* renamed from: i */
    public final Activity mo50821i() {
        return getActivity();
    }

    /* renamed from: j */
    public final boolean mo50822j() {
        return isViewValid();
    }

    public final void ar_() {
        if (this.f65868s != null) {
            this.f65868s.mo50830a();
        }
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("music_library_list");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo50825m() {
        if (this.f65858e != null) {
            this.f65858e.f66176g = false;
        }
    }

    /* renamed from: n */
    public final void mo50826n() {
        if (this.f65855b != null) {
            this.f65855b.mo50699b();
        }
    }

    /* renamed from: o */
    public final void mo50827o() {
        if (this.f65859j != null) {
            this.f65859j.mo50911a();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.mListView != null) {
            this.mListView.setAdapter(null);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f65859j != null) {
            this.f65859j.f95726n = false;
        }
    }

    /* renamed from: f */
    public final void mo50818f() {
        if (isViewValid()) {
            this.mStatusView.mo19209d();
            this.mListView.setVisibility(0);
        }
    }

    /* renamed from: h */
    public final void mo50820h() {
        if (isViewValid()) {
            this.mStatusView.mo19212f();
            this.mListView.setVisibility(4);
        }
    }

    /* renamed from: l */
    public final void mo50824l() {
        if (isViewValid()) {
            this.mStatusView.mo19214h();
            this.mListView.setVisibility(4);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo50827o();
        this.f65859j.mo50916d();
        if (this.f65854a != null) {
            this.f65854a.aq_();
            this.f65854a.mo46991S_();
        }
    }

    /* renamed from: p */
    public final void mo50802p() {
        if (isViewValid() && getContext() != null) {
            C10691a.m21542b(getContext(), (int) R.string.cg1).mo19066a();
        }
    }

    /* renamed from: k */
    public final void mo50823k() {
        if (isViewValid()) {
            C26890h.m65011a("music_search_feedback_show", C23089d.m56640a().mo47829a("enter_from", "video_shoot_page").f61491a);
            this.mStatusView.mo19213g();
            this.mListView.setVisibility(4);
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f65855b != null) {
            this.f65855b.mo50699b();
        }
        if (this.f65859j != null) {
            this.f65859j.mo50911a();
            this.f65859j.f95726n = true;
        }
        C37377b.m83689a().pause();
    }

    /* renamed from: q */
    private View m60449q() {
        try {
            this.f65865p = C32816h.m75716b().getShowMusicFeedbackEntrance().booleanValue();
        } catch (Exception unused) {
        }
        MtEmptyView a = MtEmptyView.m21697a(getContext());
        if (C24954a.m60699b()) {
            a.setStatus(new C10723a(getContext()).mo19280b((int) R.string.fx4).mo19282c(R.string.fx2).mo19277a((int) R.drawable.ar0).f28711a);
        } else {
            a.setStatus(new C10723a(getContext()).mo19280b((int) R.string.f5w).mo19282c(R.string.f5x).mo19277a((int) R.drawable.ar0).f28711a);
        }
        return a;
    }

    /* renamed from: e */
    public final void mo50817e() {
        List list;
        this.mStatusView.mo19209d();
        mo50826n();
        mo50825m();
        if (this.f65852B) {
            list = C24840c.m60407c().mo50744b();
        } else {
            list = C24841d.m60410c().mo50744b();
        }
        if (list == null || list.size() <= 0) {
            this.mListView.setVisibility(8);
            return;
        }
        this.mListView.setVisibility(0);
        if (this.f65874z == null) {
            this.f65874z = new C24828k(this.f65852B);
        }
        this.mListView.setAdapter(this.f65874z);
        this.f65874z.mo50711a(list);
    }

    /* renamed from: a */
    public final void mo50731a(C37523a aVar) {
        this.f65859j.f95722j = aVar;
    }

    /* renamed from: b */
    public final void mo50734b(MusicModel musicModel) {
        this.f65859j.f95723k = this.f65870v;
        this.f65859j.mo77059b(musicModel, this.f65861l);
    }

    /* renamed from: a */
    public final void mo50732a(MusicModel musicModel) {
        mo50827o();
    }

    @C53771m(mo112976b = true)
    public void onMobMusicTypeEvent(C37350c cVar) {
        String str = cVar.f95310a;
        if (str == null) {
            this.f65870v = this.f65871w;
        } else if (this.f65871w == null) {
            this.f65870v = str;
            this.f65871w = this.f65870v;
        } else {
            this.f65871w = this.f65870v;
            this.f65870v = str;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f65857d = (MusicSearchStateViewModel) C0214z.m440a(getActivity()).mo359a(MusicSearchStateViewModel.class);
        this.f65857d.mo50677a().observe(this, new C24909aa(this));
        this.f65857d.mo50678b().observe(this, new C24910ab(this));
    }

    @C53771m(mo112976b = true)
    public void onMusicCollectEvent(C37351d dVar) {
        CollectionType collectionType;
        if (C10181b.m20511a().mo18172a(RefreshSearchViewHolderExperiment.class, true, "refresh_music_search_view_holder", 31744, false)) {
            MusicModel musicModel = dVar.f95312b;
            if (musicModel != null && !C9376b.m18558a((Collection<T>) this.f65862m)) {
                MusicModel a = C24964d.m60736a(this.f65862m, musicModel.getMusicId());
                if (a != null) {
                    if (dVar.f95311a == 1) {
                        collectionType = CollectionType.COLLECTED;
                    } else {
                        collectionType = CollectionType.NOT_COLLECTED;
                    }
                    a.setCollectionType(collectionType);
                    int indexOf = this.f65862m.indexOf(a);
                    C24816b bVar = this.f65855b;
                    if (bVar != null && indexOf >= 0 && indexOf < this.f65862m.size()) {
                        bVar.notifyItemChanged(indexOf);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo50814a(Exception exc) {
        C32458a.m75148a((Throwable) exc);
    }

    /* renamed from: a */
    public final void mo50801a(C24867w wVar) {
        if (isViewValid() && wVar != null && this.f65857d.mo50682f() == 2) {
            if (!C9376b.m18558a((Collection<T>) wVar.f65803a)) {
                this.f65864o = wVar.f65804b;
                C26890h.m65011a("search_sug", C24885a.m60440a().mo50806a("action_type", "show").mo50806a("sug_keyword", this.f65863n).mo50806a("search_keyword", this.f65863n).mo50806a("log_pb", C29981aa.m70153a().mo60161a(this.f65864o)).mo50806a("search_type", "video_music").mo50806a("creation_id", C24963c.m60714a()).f65839a);
                String str = "{}";
                if (wVar.f65806d != null && !TextUtils.isEmpty(wVar.f65806d.getInfo())) {
                    str = wVar.f65806d.getInfo();
                }
                String str2 = "";
                if (wVar.f65805c != null && !TextUtils.isEmpty(wVar.f65805c.getImprId())) {
                    str2 = wVar.f65805c.getImprId();
                }
                Map<String, String> map = C24885a.m60440a().mo50806a("raw_query", this.f65863n).mo50806a("info", str).mo50806a("impr_id", str2).mo50806a("search_position", "video_music").f65839a;
                for (C24870z zVar : wVar.f65803a) {
                    if (zVar != null) {
                        zVar.setExtraParam(map);
                    }
                }
                C26890h.m65011a("trending_show", C24885a.m60440a().mo50807a(map).mo50805a("words_num", wVar.f65803a.size()).mo50806a("words_source", "sug").mo50806a("creation_id", C24963c.m60714a()).f65839a);
            }
            Collection collection = wVar.f65803a;
            if (isViewValid() && this.mListView.getAdapter() == this.f65856c) {
                C24874a aVar = this.f65856c;
                if (collection == null) {
                    collection = new ArrayList();
                }
                if (aVar.f65820a == null) {
                    aVar.f65820a = new ArrayList();
                }
                aVar.f65820a.clear();
                aVar.f65820a.addAll(collection);
                aVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo50815a(Object obj) {
        String str;
        String str2;
        C24806c cVar = (C24806c) obj;
        String str3 = cVar.f65657b;
        MusicModel musicModel = cVar.f65656a;
        if (musicModel != null) {
            FragmentActivity activity = getActivity();
            if (activity != null && "upload_local_music".equals(str3)) {
                Intent intent = new Intent();
                String str4 = "local_music_name";
                if (cVar.f65656a == null) {
                    str = "";
                } else {
                    str = cVar.f65656a.getName();
                }
                intent.putExtra(str4, str);
                String str5 = "local_music_path";
                if (cVar.f65656a == null) {
                    str2 = "";
                } else {
                    str2 = cVar.f65656a.getLocalPath();
                }
                intent.putExtra(str5, str2);
                activity.setResult(-1, intent);
                activity.finish();
            } else if ("follow_type".equals(str3)) {
                this.f65873y.mo44934a_(Integer.valueOf(1), musicModel.getMusicId(), Integer.valueOf(1));
            } else if ("unfollow_type".equals(str3)) {
                this.f65873y.mo44934a_(Integer.valueOf(1), musicModel.getMusicId(), Integer.valueOf(0));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo50811a(int i, int i2) {
        ar_();
    }

    /* renamed from: a */
    public final void mo50733a(MusicModel musicModel, C24803a aVar) {
        this.f65853C = musicModel;
        if (this.f65851A) {
            this.f65859j.f66059c = aVar;
            this.f65859j.mo77055a(musicModel, this.f65861l);
            return;
        }
        this.f65859j.mo77059b(musicModel, this.f65861l);
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        this.f65855b = new C24816b(this, this, true, this.f65852B);
        this.f65855b.f65703i = this.f65872x;
        this.mListView.setVisibility(8);
        this.f65855b.mo54798c(true);
        this.f65855b.f70682s = getResources().getColor(R.color.jl);
        this.f65855b.f70684u = "music_list";
        C24816b bVar = this.f65855b;
        if (this.f65852B) {
            str = "lyricsticker_song_search";
        } else {
            str = "search_music";
        }
        bVar.f65700f = new C24803a(str, "", "", C24963c.m60726b());
        this.f65855b.f65695a = this;
        this.f65859j.mo50915c();
        this.f65859j.f95722j = new C24911ac(this);
        this.f65859j.mo77053a(this.f65872x);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo4731b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.f65855b.mo54788a((C26846a) this);
        this.f65858e = new C24995p(new C24912ad(this), 10);
        this.f65858e.f66176g = false;
        this.f65858e.mo50986a(this.mListView);
        this.f65873y = new C37408l(getActivity());
        this.f65873y.mo54800a(this);
        this.mStatusView.setBuilder(C10719a.m21676a(getContext()).mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new C24913ae(this)).mo19231b(m60449q()).mo19233c(this.f65852B ? 1 : 0));
        this.mBackgroundView.setOnClickListener(new C24914af(this));
        mo50817e();
        this.f65854a = new C24881b();
        this.f65854a.mo54800a(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.baq, viewGroup, false);
        this.f65859j = new C24955a(this);
        if (getArguments() != null) {
            this.f65872x = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
            this.f65852B = getArguments().getBoolean("has_lyric", false);
        } else {
            this.f65872x = 0;
        }
        return inflate;
    }

    /* renamed from: a */
    public final void mo50816a(String str, MusicModel musicModel, String str2) {
        if (this.f65868s != null) {
            this.f65860k.mo50831a(this.f65872x, str, musicModel, str2);
        }
    }
}
