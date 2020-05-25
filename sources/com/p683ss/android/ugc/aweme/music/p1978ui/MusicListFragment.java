package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24995p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.music.adapter.C37288d;
import com.p683ss.android.ugc.aweme.music.adapter.C37292h;
import com.p683ss.android.ugc.aweme.music.adapter.C37292h.C37299a;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37283j;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.model.MusicCategory;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p683ss.android.ugc.aweme.music.p1975c.C37350c;
import com.p683ss.android.ugc.aweme.music.p1975c.C37351d;
import com.p683ss.android.ugc.aweme.music.p1975c.C37353f;
import com.p683ss.android.ugc.aweme.music.p1977e.C37377b;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.presenter.C37397c;
import com.p683ss.android.ugc.aweme.music.presenter.C37401g;
import com.p683ss.android.ugc.aweme.music.presenter.C37408l;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicListFragment */
public class MusicListFragment extends C23526a implements C26846a, C37288d, C37306l<C37353f>, C37397c, C37401g, C37625m {

    /* renamed from: n */
    private static final String f95617n = "com.ss.android.ugc.aweme.music.ui.MusicListFragment";

    /* renamed from: a */
    public MusicCategory f95618a;

    /* renamed from: b */
    public C0198r<RecyclerView> f95619b = new C0198r<>();

    /* renamed from: c */
    public C37292h f95620c;

    /* renamed from: d */
    public C37518aw f95621d;

    /* renamed from: e */
    public C37472b f95622e;

    /* renamed from: j */
    public int f95623j;

    /* renamed from: k */
    public boolean f95624k = true;

    /* renamed from: l */
    protected C24995p f95625l;

    /* renamed from: m */
    public C37471a f95626m;
    public RecyclerView mListView;
    DmtStatusView mStatusView;

    /* renamed from: o */
    private String f95627o = "popular_song";

    /* renamed from: p */
    private String f95628p;

    /* renamed from: q */
    private int f95629q;

    /* renamed from: r */
    private C37408l f95630r;

    /* renamed from: s */
    private C37299a f95631s;

    /* renamed from: t */
    private List<MusicModel> f95632t = new ArrayList();

    /* renamed from: u */
    private List<Music> f95633u = new ArrayList();

    /* renamed from: v */
    private boolean f95634v = false;

    /* renamed from: w */
    private boolean f95635w = false;

    /* renamed from: x */
    private MusicModel f95636x;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.MusicListFragment$a */
    public interface C37471a {
        /* renamed from: a */
        void mo50864a();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.MusicListFragment$b */
    public interface C37472b {
        /* renamed from: a */
        void mo50854a(MusicListFragment musicListFragment, String str, MusicModel musicModel, String str2);
    }

    /* renamed from: Y_ */
    public boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public void mo50812a(MusicCollectionItem musicCollectionItem) {
    }

    /* renamed from: a */
    public final void mo50813a(MusicModel musicModel, Exception exc) {
    }

    /* renamed from: g */
    public final MusicModel mo50819g() {
        return this.f95636x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo77003h() {
        return R.layout.ok;
    }

    /* renamed from: m */
    public final int mo77006m() {
        return this.f95629q;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo77001a(Map<String, List<C37283j>> map, int i) {
        if (isViewValid()) {
            if (map == null) {
                C10691a.m21542b(getContext(), (int) R.string.cfw).mo19066a();
                if (mo47031e()) {
                    this.mStatusView.mo19214h();
                }
                return;
            }
            if (this.mListView != null) {
                this.mListView.setVisibility(0);
            }
            this.mStatusView.mo19209d();
            if (this.f95620c != null) {
                this.f95620c.mo76599a(map, i);
            }
            this.f95623j = i;
        }
    }

    public final void ar_() {
        if (!this.f95635w) {
            mo77005l();
        }
    }

    /* renamed from: i */
    public final Activity mo50821i() {
        return getActivity();
    }

    /* renamed from: j */
    public final boolean mo50822j() {
        return isViewValid();
    }

    /* renamed from: e */
    private boolean mo47031e() {
        if (this.f95623j != 2) {
            return true;
        }
        return false;
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("music_library_list");
    }

    /* renamed from: k */
    public final void mo77004k() {
        if (this.f95621d != null) {
            this.f95621d.mo50911a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo77005l() {
        if (this.f95626m != null) {
            this.f95626m.mo50864a();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo77004k();
        this.f95621d.mo50916d();
    }

    public void onResume() {
        super.onResume();
        this.f95621d.f95726n = false;
    }

    public void onPause() {
        super.onPause();
        if (this.f95620c != null) {
            this.f95620c.mo76601f();
        }
        if (this.f95621d != null) {
            this.f95621d.mo50911a();
        }
        C37377b.m83689a().pause();
        this.f95621d.f95726n = true;
    }

    /* renamed from: b */
    public final void mo76913b(MusicModel musicModel) {
        mo77004k();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public final void mo76911a(MusicModel musicModel) {
        this.f95636x = musicModel;
        if (this.f95624k) {
            this.f95621d.f95724l = this.f95618a;
            this.f95621d.mo77055a(musicModel, this.f95623j);
            return;
        }
        this.f95621d.mo77059b(musicModel, this.f95623j);
    }

    @C53771m(mo112976b = true)
    public void onMobMusicTypeEvent(C37350c cVar) {
        String str = cVar.f95310a;
        if (str == null) {
            this.f95627o = this.f95628p;
        } else if (this.f95628p == null) {
            this.f95627o = str;
            this.f95628p = this.f95627o;
        } else {
            this.f95628p = this.f95627o;
            this.f95627o = str;
        }
    }

    @C53771m(mo112976b = true)
    public void onMusicCollectEvent(C37351d dVar) {
        MusicModel musicModel = dVar.f95312b;
        if (musicModel != null) {
            Music a = C37378c.m83692a(this.f95633u, musicModel.getMusicId());
            if (a != null) {
                a.setCollectStatus(dVar.f95311a);
                int indexOf = this.f95633u.indexOf(a);
                C37292h hVar = this.f95620c;
                if (hVar != null) {
                    hVar.notifyItemChanged(indexOf);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo50814a(Exception exc) {
        C32458a.m75148a((Throwable) exc);
    }

    /* renamed from: a */
    public void mo50815a(C37353f fVar) {
        String str;
        String str2;
        String str3 = fVar.f95315b;
        MusicModel musicModel = fVar.f95314a;
        if (musicModel != null) {
            FragmentActivity activity = getActivity();
            if (activity == null || !"upload_local_music".equals(str3)) {
                String str4 = null;
                String tag = getTag();
                String str5 = "";
                if (tag != null) {
                    if (tag.equals("album_list_tag")) {
                        str4 = "album";
                    } else if (tag.equals("search_result_list_tag")) {
                        str4 = "search_music";
                    }
                }
                if ("follow_type".equals(str3)) {
                    str5 = "favourite_song";
                    this.f95630r.mo44934a_(Integer.valueOf(1), musicModel.getMusicId(), Integer.valueOf(1));
                } else if ("unfollow_type".equals(str3)) {
                    str5 = "cancel_favourite_song";
                    this.f95630r.mo44934a_(Integer.valueOf(1), musicModel.getMusicId(), Integer.valueOf(0));
                }
                if (str4 != null && !TextUtils.isEmpty(str5)) {
                    if (TextUtils.equals(str4, "search_music")) {
                        C23089d a = C23089d.m56640a();
                        a.mo47829a("music_id", musicModel.getMusicId()).mo47829a("enter_from", "search_music").mo47829a("search_keyword", C37378c.m83693a()).mo47829a("log_pb", new C17971f().mo34889b(musicModel.getLogPb()));
                        if (C24963c.m60732d()) {
                            a.mo47829a("is_commercial", "1");
                        }
                        C26890h.m65012a(str5, C37539bh.m83960a(a.f61491a));
                        return;
                    }
                    C23089d a2 = C23089d.m56640a();
                    a2.mo47829a("enter_from", str4).mo47829a("music_id", musicModel.getMusicId());
                    if (C24963c.m60732d()) {
                        a2.mo47829a("is_commercial", "1");
                    }
                    C26890h.m65011a(str5, a2.f61491a);
                }
                return;
            }
            Intent intent = new Intent();
            String str6 = "local_music_name";
            if (fVar.f95314a == null) {
                str = "";
            } else {
                str = fVar.f95314a.getName();
            }
            intent.putExtra(str6, str);
            String str7 = "local_music_path";
            if (fVar.f95314a == null) {
                str2 = "";
            } else {
                str2 = fVar.f95314a.getLocalPath();
            }
            intent.putExtra(str7, str2);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo76998a(int i, int i2) {
        mo77005l();
    }

    /* renamed from: a */
    public final void mo76912a(MusicModel musicModel, int i) {
        this.f95621d.f95723k = this.f95627o;
        this.f95621d.f95725m = i;
        this.f95621d.f95724l = this.f95618a;
        this.f95621d.mo77059b(musicModel, this.f95623j);
    }

    /* renamed from: b */
    public final void mo77002b(List<MusicModel> list, int i) {
        if (isViewValid() && this.f95620c != null) {
            this.f95620c.mo76597a(list, 2);
            this.f95623j = 2;
            this.mListView.setVisibility(0);
            if (mo47031e()) {
                if (C9414h.m18630a(list)) {
                    this.mStatusView.mo19213g();
                } else {
                    this.mStatusView.mo19209d();
                }
            }
            this.f95620c.notifyDataSetChanged();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f95619b.setValue(this.mListView);
        C37292h hVar = new C37292h(this, this, this, this.f95629q, this.f95634v);
        this.f95620c = hVar;
        this.f95620c.f95193o = this.f95631s;
        this.mListView.setVisibility(8);
        this.f95620c.mo54798c(true);
        this.f95620c.f70682s = getResources().getColor(R.color.in);
        this.f95620c.f70684u = "music_list";
        this.f95621d.mo50915c();
        this.f95621d.mo77053a(this.f95629q);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo4731b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.f95620c.mo54788a((C26846a) this);
        this.mListView.setAdapter(this.f95620c);
        this.f95635w = true;
        this.f95625l = new C24995p(new C37537bf(this), 10);
        this.f95625l.mo50986a(this.mListView);
        this.f95630r = new C37408l(getActivity());
        this.f95630r.mo54800a(this);
        this.mStatusView.setBuilder(C10719a.m21676a((Context) getActivity()).mo19232b(new C10723a(getActivity()).mo19280b((int) R.string.f5o).mo19282c(R.string.f5k).f28711a).mo19229a(new C10723a(getActivity()).mo19280b((int) R.string.bx4).mo19281b(getActivity().getString(R.string.f5x)).f28711a).mo19233c(0));
        if (!mo47031e()) {
            this.mStatusView.mo19209d();
        } else if (C37538bg.m83959a(getActivity())) {
            this.mStatusView.mo19212f();
        } else {
            this.mStatusView.mo19214h();
        }
    }

    /* renamed from: a */
    public final void mo77000a(List<Music> list, int i) {
        if (isViewValid()) {
            if (list == null) {
                C10691a.m21542b(getContext(), (int) R.string.cfw).mo19066a();
                if (mo47031e()) {
                    this.mStatusView.mo19214h();
                }
            } else if (list.isEmpty()) {
                this.mStatusView.mo19213g();
            } else {
                this.f95633u = list;
                if (this.mListView != null) {
                    this.mListView.setVisibility(0);
                }
                this.mStatusView.mo19209d();
                this.f95632t.clear();
                this.f95633u = list;
                for (Music music : list) {
                    if (music != null) {
                        MusicModel convertToMusicModel = music.convertToMusicModel();
                        convertToMusicModel.setDataType(1);
                        this.f95632t.add(convertToMusicModel);
                    }
                }
                if (this.f95620c != null) {
                    this.f95620c.mo76597a(this.f95632t, i);
                }
                this.f95623j = i;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo77003h(), viewGroup, false);
        this.f95621d = new C37518aw(this);
        if (getArguments() != null) {
            this.f95629q = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
            this.f95631s = (C37299a) getArguments().getSerializable("music_style");
            if (getArguments().containsKey("show_local_music")) {
                this.f95634v = getArguments().getBoolean("show_local_music", false);
            }
        } else {
            this.f95629q = 0;
        }
        return inflate;
    }

    /* renamed from: a */
    public final void mo50816a(String str, MusicModel musicModel, String str2) {
        if (this.f95626m != null) {
            this.f95622e.mo50854a(this, str, musicModel, str2);
        }
    }
}
