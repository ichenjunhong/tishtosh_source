package com.p683ss.android.ugc.aweme.music.adapter;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1324c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26836c;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.music.adapter.p1972a.C37261a;
import com.p683ss.android.ugc.aweme.music.adapter.p1972a.C37262b;
import com.p683ss.android.ugc.aweme.music.adapter.p1972a.C37263c;
import com.p683ss.android.ugc.aweme.music.adapter.p1972a.C37264d;
import com.p683ss.android.ugc.aweme.music.adapter.p1972a.C37265e;
import com.p683ss.android.ugc.aweme.music.adapter.p1972a.C37266f;
import com.p683ss.android.ugc.aweme.music.adapter.p1972a.C37267g;
import com.p683ss.android.ugc.aweme.music.adapter.p1972a.C37268h;
import com.p683ss.android.ugc.aweme.music.adapter.p1972a.C37269i;
import com.p683ss.android.ugc.aweme.music.adapter.p1972a.C37270j;
import com.p683ss.android.ugc.aweme.music.adapter.p1972a.C37271k;
import com.p683ss.android.ugc.aweme.music.adapter.p1972a.C37272l;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37279f;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37283j;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37284k;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37285l;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37286m;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p683ss.android.ugc.aweme.music.p1975c.C37353f;
import com.p683ss.android.ugc.aweme.music.p1977e.C37377b;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.presenter.C37401g;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.ss.android.ugc.trill.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.h */
public final class C37292h extends C26844j {

    /* renamed from: A */
    private int f95172A = 1;

    /* renamed from: B */
    private C26836c<List<C37283j>> f95173B;

    /* renamed from: C */
    private C37261a f95174C;

    /* renamed from: D */
    private boolean f95175D;

    /* renamed from: E */
    private C37289e f95176E = new C37289e() {
        /* renamed from: a */
        public final void mo51050a(C1352v vVar, View view, MusicModel musicModel) {
            String str;
            if (musicModel != null) {
                if (view.getId() == R.id.cdm) {
                    if (musicModel.getMusicType() == MusicType.LOCAL && C37292h.this.f95194p == 5) {
                        if (C37292h.this.f95192n != null) {
                            C37353f fVar = new C37353f(musicModel, "upload_local_music");
                            fVar.f95314a = musicModel;
                            C37292h.this.f95192n.mo50815a(fVar);
                        }
                    } else if (C37378c.m83700a(musicModel, view.getContext(), true)) {
                        if (!(C37292h.this.f95180b == null || vVar == null)) {
                            C37292h.this.f95180b.mo76912a(musicModel, vVar.getLayoutPosition() - C37292h.this.mo76596a());
                        }
                        if (musicModel.isChallengeMusic()) {
                            C26890h.m65011a("click_music", C23089d.m56640a().mo47829a("music_id", musicModel.getMusicId()).mo47829a("enter_from", "challenge_bonding").f61491a);
                        }
                    }
                } else if (view.getId() == R.id.bgn) {
                    if (!C37300i.m83594a(view.getContext())) {
                        C10691a.m21542b(view.getContext(), (int) R.string.cg1).mo19066a();
                    } else if (C37292h.this.f95189k != vVar.getAdapterPosition()) {
                        if (C37292h.this.f95180b != null) {
                            C37292h.this.mo76601f();
                            if (musicModel.getMusicType() == MusicType.LOCAL) {
                                C37292h hVar = C37292h.this;
                                MusicUnitViewHolder musicUnitViewHolder = (MusicUnitViewHolder) vVar;
                                MediaPlayer a = C37377b.m83689a();
                                try {
                                    a.reset();
                                    a.setDataSource(musicModel.getLocalPath());
                                    a.setAudioStreamType(3);
                                    a.prepareAsync();
                                    a.setOnPreparedListener(new OnPreparedListener(musicUnitViewHolder) {

                                        /* renamed from: a */
                                        final /* synthetic */ MusicUnitViewHolder f95199a;

                                        public final void onPrepared(MediaPlayer mediaPlayer) {
                                            mediaPlayer.start();
                                            this.f95199a.mo76585a(true);
                                        }

                                        {
                                            this.f95199a = r2;
                                        }
                                    });
                                    a.setOnErrorListener(new OnErrorListener() {
                                        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                                            C37377b.m83690b();
                                            return false;
                                        }
                                    });
                                } catch (IOException unused) {
                                }
                            } else {
                                C37292h.this.f95180b.mo76911a(musicModel);
                            }
                            ((MusicUnitViewHolder) vVar).mo76585a(true);
                            C37292h.this.f95189k = vVar.getAdapterPosition();
                        }
                        JSONObject jSONObject = null;
                        String searchKeyWords = musicModel.getSearchKeyWords();
                        musicModel.getName();
                        if (C37292h.this.f95194p == 2) {
                            jSONObject = C23088c.m56631a().mo47824a("search_keyword", searchKeyWords).mo47824a("song_position", "search_result").mo47825b();
                        }
                        if (!C9431p.m18664a(musicModel.getSongId())) {
                            C26890h.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("success").setValue(musicModel.getSongId()).setJsonObject(jSONObject));
                            C26890h.m65005a(view.getContext(), "music_play", "music_library_homepage", musicModel.getSongId(), 0);
                        } else if (!C9431p.m18664a(musicModel.getMusicId())) {
                            C26890h.m65005a(view.getContext(), "music_play", "music_library_homepage", musicModel.getMusicId(), 0);
                            C26890h.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("success").setValue(musicModel.getMusicId()).setJsonObject(jSONObject));
                        }
                        if (musicModel.getMusicType() != MusicType.LOCAL) {
                            switch (C37292h.this.f95194p) {
                                case 0:
                                    str = "songchart";
                                    break;
                                case 1:
                                    str = "favorite_song";
                                    break;
                                case 2:
                                    str = "search_music";
                                    break;
                                case 3:
                                    str = "album";
                                    break;
                                default:
                                    str = "";
                                    break;
                            }
                        } else {
                            str = "local_music";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            C26890h.m65011a("click_music", C23089d.m56640a().mo47829a("enter_from", str).mo47829a("music_id", musicModel.getMusicId()).f61491a);
                        }
                    } else if (C37292h.this.f95180b != null) {
                        C37292h.this.mo76601f();
                    }
                }
            }
        }
    };

    /* renamed from: F */
    private C37287c f95177F = new C37287c() {
        /* renamed from: a */
        public final void mo76595a(C1352v vVar) {
            C37292h.this.mo76598a(C37292h.this.f95186h, false);
            C37292h.this.f95185g.put("showless_data", new ArrayList());
            C37292h.this.mo76599a(C37292h.this.f95185g, C37292h.this.f95194p);
        }
    };

    /* renamed from: G */
    private C37273b f95178G = new C37273b() {
        /* renamed from: a */
        public final void mo76593a(C1352v vVar) {
            C37292h.this.mo76598a(C37292h.this.f95186h, true);
            C37292h.this.f95184f.clear();
            C37292h.this.f95184f.add(new C37285l());
            C37292h.this.f95185g.put("showless_data", C37292h.this.f95184f);
            C37292h.this.mo76599a(C37292h.this.f95185g, C37292h.this.f95194p);
        }

        /* renamed from: a */
        public final void mo76594a(C1352v vVar, MusicCollectionItem musicCollectionItem) {
            if (C37292h.this.f95181c != null) {
                C37292h.this.f95181c.mo50812a(musicCollectionItem);
            }
        }
    };

    /* renamed from: a */
    public String f95179a;

    /* renamed from: b */
    public C37401g f95180b;

    /* renamed from: c */
    public C37288d f95181c;

    /* renamed from: d */
    public Challenge f95182d;

    /* renamed from: e */
    public List<C37283j> f95183e = new ArrayList();

    /* renamed from: f */
    public List<C37283j> f95184f = new ArrayList();

    /* renamed from: g */
    public Map<String, List<C37283j>> f95185g;

    /* renamed from: h */
    public List<MusicCollectionItem> f95186h = new ArrayList();

    /* renamed from: i */
    public boolean f95187i = true;

    /* renamed from: j */
    int f95188j = 0;

    /* renamed from: k */
    int f95189k = -1;

    /* renamed from: l */
    public int f95190l = -1;

    /* renamed from: m */
    RecyclerView f95191m;

    /* renamed from: n */
    public C37306l<C37353f> f95192n;

    /* renamed from: o */
    public C37299a f95193o;

    /* renamed from: p */
    public int f95194p;

    /* renamed from: y */
    public C37271k f95195y;

    /* renamed from: z */
    private List<C37283j> f95196z = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.h$a */
    public enum C37299a {
        BtnConfirmAndShoot,
        BtnConfirm
    }

    /* renamed from: c */
    public final int mo48636c() {
        return this.f95183e.size();
    }

    /* renamed from: g */
    private C37299a m83572g() {
        if (this.f95193o != null) {
            return this.f95193o;
        }
        return C37299a.BtnConfirmAndShoot;
    }

    /* renamed from: j */
    private void m83573j() {
        int i = 0;
        for (C37283j jVar : this.f95183e) {
            if (jVar instanceof C37286m) {
                this.f95190l = i;
                return;
            }
            i++;
        }
    }

    /* renamed from: a */
    public final int mo76596a() {
        int i = 0;
        if (this.f95185g == null) {
            return 0;
        }
        List list = (List) this.f95185g.get("tab_data");
        if (!C9376b.m18558a((Collection<T>) list)) {
            i = list.size();
        }
        return (this.f95183e.size() - i) + 1;
    }

    /* renamed from: f */
    public final void mo76601f() {
        MediaPlayer a = C37377b.m83689a();
        if (this.f95189k != -1) {
            C1352v f = this.f95191m.mo4847f(this.f95189k);
            if (f instanceof MusicUnitViewHolder) {
                ((MusicUnitViewHolder) f).mo76585a(false);
            }
            this.f95189k = -1;
        }
        if (a != null && a.isPlaying()) {
            a.pause();
        }
        this.f95180b.mo76913b(null);
    }

    /* renamed from: b */
    public final int mo76600b(int i) {
        int a = mo48641a(i);
        if (a == 2 || a == 3) {
            return 1;
        }
        return 4;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        if (this.f95173B != null) {
            this.f95173B.mo54765a(recyclerView);
        }
        this.f95191m = recyclerView;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        if (this.f95173B != null) {
            this.f95173B.mo54768b(recyclerView);
        }
        this.f95191m = null;
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        if (this.f95183e.size() > i) {
            return this.f95173B.mo54760a(this.f95183e, i);
        }
        return super.mo48641a(i);
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        return this.f95173B.mo54761a(viewGroup, i);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        if (this.f95174C != null) {
            this.f95174C.f95149c = this.f95189k;
        }
        if (this.f95195y != null) {
            this.f95195y.f95163c = this.f95189k;
        }
        this.f95173B.mo54766a(this.f95183e, i, vVar);
    }

    /* renamed from: a */
    public final void mo76597a(List<MusicModel> list, int i) {
        this.f95183e.clear();
        if (!list.isEmpty() && i == 5) {
            this.f95183e.add(new C37279f());
        }
        this.f95183e.addAll(list);
        this.f95194p = i;
        if (this.f95195y != null) {
            this.f95195y.mo76592a(this.f95194p);
        }
        if (this.f95174C != null) {
            this.f95174C.mo76590a(this.f95194p);
        }
        m83573j();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo76598a(List<MusicCollectionItem> list, boolean z) {
        int i;
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        this.f95188j = i;
        this.f95186h = list;
        this.f95196z.clear();
        this.f95196z.addAll(list);
        if (!z) {
            this.f95196z = this.f95196z.subList(0, 7);
        }
        C37284k kVar = new C37284k();
        kVar.f95170a = this.f95188j - this.f95196z.size();
        if (this.f95188j - this.f95196z.size() > 0) {
            this.f95196z.add(kVar);
        }
    }

    /* renamed from: a */
    public final void mo76599a(Map<String, List<C37283j>> map, int i) {
        this.f95185g = map;
        map.put("collection", this.f95196z);
        ArrayList arrayList = new ArrayList();
        for (Entry value : map.entrySet()) {
            arrayList.addAll((Collection) value.getValue());
        }
        this.f95183e = arrayList;
        this.f95194p = i;
        if (this.f95195y != null) {
            this.f95195y.mo76592a(this.f95194p);
        }
        if (this.f95174C != null) {
            this.f95174C.mo76590a(this.f95194p);
        }
        m83573j();
        notifyDataSetChanged();
    }

    public C37292h(C37401g gVar, C37288d dVar, C37306l<C37353f> lVar, int i, boolean z) {
        this.f95180b = gVar;
        this.f95181c = dVar;
        this.f95192n = lVar;
        this.f95173B = new C26836c<>();
        this.f95172A = i;
        this.f95175D = z;
        this.f95173B.mo54763a((C26835b<T>) new C37262b<T>(this.f95182d));
        C37261a aVar = new C37261a(this.f95176E, this.f95194p, m83572g(), this.f95192n, this.f95172A);
        this.f95174C = aVar;
        this.f95173B.mo54763a((C26835b<T>) this.f95174C);
        this.f95173B.mo54763a((C26835b<T>) new C37263c<T>(this.f95178G));
        this.f95173B.mo54763a((C26835b<T>) new C37264d<T>(this.f95178G));
        this.f95173B.mo54763a((C26835b<T>) new C37272l<T>(this.f95177F));
        this.f95173B.mo54763a((C26835b<T>) new C37270j<T>(this.f95175D));
        this.f95173B.mo54763a((C26835b<T>) new C37265e<T>());
        C37271k kVar = new C37271k(this.f95176E, this.f95194p, m83572g(), this.f95192n, this.f95172A);
        this.f95195y = kVar;
        this.f95173B.mo54763a((C26835b<T>) this.f95195y);
        this.f95173B.mo54763a((C26835b<T>) new C37268h<T>());
        this.f95173B.mo54763a((C26835b<T>) new C37267g<T>());
        this.f95173B.mo54763a((C26835b<T>) new C37269i<T>(16.0f));
        this.f95173B.mo54763a((C26835b<T>) new C37266f<T>());
        registerAdapterDataObserver(new C1324c() {
            /* renamed from: a */
            public final void mo4984a() {
            }

            /* renamed from: a */
            public final void mo4985a(int i, int i2) {
                C37292h.this.mo76601f();
            }

            /* renamed from: b */
            public final void mo4988b(int i, int i2) {
                C37292h.this.mo76601f();
            }

            /* renamed from: c */
            public final void mo4989c(int i, int i2) {
                C37292h.this.mo76601f();
            }

            /* renamed from: a */
            public final void mo4986a(int i, int i2, int i3) {
                C37292h.this.mo76601f();
            }

            /* renamed from: a */
            public final void mo4987a(int i, int i2, Object obj) {
                C37292h.this.mo76601f();
            }
        });
    }
}
