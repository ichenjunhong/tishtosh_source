package com.p683ss.android.ugc.aweme.music.adapter;

import android.app.Activity;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1324c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.IAccountService.C20837d;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29690d;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29691e;
import com.p683ss.android.ugc.aweme.music.C37389j;
import com.p683ss.android.ugc.aweme.music.OriginMusicViewHolder;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.m */
public final class C37307m extends C26844j {

    /* renamed from: a */
    public C29691e f95215a;

    /* renamed from: b */
    int f95216b = -1;

    /* renamed from: c */
    public List<MusicModel> f95217c = new ArrayList();

    /* renamed from: d */
    public String f95218d;

    /* renamed from: e */
    public int f95219e;

    /* renamed from: f */
    public String f95220f;

    /* renamed from: g */
    private RecyclerView f95221g;

    /* renamed from: h */
    private C29690d f95222h = new C29690d() {
        /* renamed from: a */
        public final void mo59931a(C1352v vVar, View view, MusicModel musicModel) {
            String str;
            if (musicModel != null && view != null && view.getContext() != null) {
                if (view.getId() == R.id.cdm) {
                    if (MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(musicModel, view.getContext(), true)) {
                        if (!C20854a.m53167g().isLogin() && AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().needLoginBeforeRecord()) {
                            C20854a.m53162b().showLoginAndRegisterView(new C20837d().mo44381a((Activity) view.getContext()).mo44380a());
                            C26890h.onEvent(MobClick.obtain().setEventName("login_notify").setLabelName("click_music_shoot"));
                        } else if (C37307m.this.f95215a != null) {
                            C37307m.this.f95215a.mo59959a(musicModel, vVar.getLayoutPosition());
                            MobClick value = MobClick.obtain().setEventName("shoot").setLabelName("single_song").setValue(musicModel.getMusicId());
                            C23088c cVar = new C23088c();
                            String str2 = "enter_from";
                            if (TextUtils.equals(C20854a.m53167g().getCurUserId(), C37307m.this.f95218d)) {
                                str = "personal_homepage";
                            } else {
                                str = "others_homepage";
                            }
                            C26890h.onEvent(value.setJsonObject(cVar.mo47824a(str2, str).mo47825b()));
                            C26890h.m65011a("shoot", C23089d.m56640a().mo47829a("shoot_way", "single_song").mo47829a("music_id", musicModel.getMusicId()).f61491a);
                        }
                    }
                } else if (view.getId() == R.id.bgn) {
                    C26890h.m65011a("play_music", C23089d.m56640a().mo47829a("enter_from", "personal_homepage_list").mo47829a("previous_page", C37307m.this.f95220f).mo47829a("music_id", musicModel.getMusicId()).mo47829a("enter_method", "personal_list").f61491a);
                    if (!C37310n.m83612a(view.getContext())) {
                        C10691a.m21542b(view.getContext(), (int) R.string.cg1).mo19066a();
                    } else if (C37307m.this.f95216b == vVar.getAdapterPosition()) {
                        if (C37307m.this.f95215a != null) {
                            C37307m.this.mo76606a();
                        }
                    } else if (C37307m.this.f95215a != null) {
                        C37307m.this.mo76606a();
                        C37307m.this.f95215a.mo59958a(musicModel);
                        ((OriginMusicViewHolder) vVar).mo76543b(true);
                        C37307m.this.f95216b = vVar.getAdapterPosition();
                    }
                }
            }
        }
    };

    /* renamed from: c */
    public final int mo48636c() {
        return this.f95217c.size();
    }

    /* renamed from: a */
    public final void mo76606a() {
        if (this.f95216b != -1) {
            C1352v f = this.f95221g.mo4847f(this.f95216b);
            if (f instanceof OriginMusicViewHolder) {
                ((OriginMusicViewHolder) f).mo76543b(false);
            }
            this.f95216b = -1;
        }
        this.f95215a.mo59960b(null);
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        return super.mo48641a(i);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f95221g = recyclerView;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f95221g = null;
    }

    /* renamed from: a */
    public final void mo76607a(List<MusicModel> list) {
        this.f95217c.clear();
        this.f95217c.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        return new OriginMusicViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bpj, viewGroup, false), this.f95222h, this.f95220f);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        boolean z;
        String str;
        if (vVar instanceof OriginMusicViewHolder) {
            OriginMusicViewHolder originMusicViewHolder = (OriginMusicViewHolder) vVar;
            MusicModel musicModel = (MusicModel) this.f95217c.get(i);
            if (i == this.f95216b) {
                z = true;
            } else {
                z = false;
            }
            if (musicModel != null) {
                originMusicViewHolder.f95017a = musicModel;
                originMusicViewHolder.musicItemll.setBackground(C0726c.m2091a(originMusicViewHolder.musicItemll.getContext(), (int) R.drawable.ik));
                if (!TextUtils.isEmpty(originMusicViewHolder.f95017a.getName())) {
                    str = originMusicViewHolder.f95017a.getName();
                } else {
                    str = "";
                }
                originMusicViewHolder.mTagView.setVisibility(8);
                originMusicViewHolder.mNameView.setText(str);
                originMusicViewHolder.f95017a.getMusic().isOriginMusic();
                originMusicViewHolder.mNameView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                originMusicViewHolder.mIvMusicCollect.setOnClickListener(new C37389j(originMusicViewHolder));
                originMusicViewHolder.txtUserCount.setText(originMusicViewHolder.f95019c.getString(R.string.cmd, new Object[]{Integer.valueOf(originMusicViewHolder.f95017a.getUserCount())}));
                int i2 = 4;
                if (C10181b.m20511a().mo18172a(RemoveMusic15sCapExperiment.class, true, "remove_15s_cap_music", 31744, true)) {
                    originMusicViewHolder.mDurationView.setText(MusicService.createIMusicServicebyMonsterPlugin().formatVideoDuration(originMusicViewHolder.f95017a.getPresenterDuration()));
                    TextView textView = originMusicViewHolder.mDurationView;
                    if (originMusicViewHolder.f95017a.getPresenterDuration() > 0) {
                        i2 = 0;
                    }
                    textView.setVisibility(i2);
                } else {
                    originMusicViewHolder.mDurationView.setText(MusicService.createIMusicServicebyMonsterPlugin().formatVideoDuration(originMusicViewHolder.f95017a.getDuration()));
                    TextView textView2 = originMusicViewHolder.mDurationView;
                    if (originMusicViewHolder.f95017a.getDuration() > 0) {
                        i2 = 0;
                    }
                    textView2.setVisibility(i2);
                }
                if (!TextUtils.isEmpty(originMusicViewHolder.f95017a.getPicPremium())) {
                    C23515d.m57677a(originMusicViewHolder.mCoverView, originMusicViewHolder.f95017a.getPicPremium());
                } else if (!TextUtils.isEmpty(originMusicViewHolder.f95017a.getPicBig())) {
                    C23515d.m57677a(originMusicViewHolder.mCoverView, originMusicViewHolder.f95017a.getPicBig());
                } else {
                    C23515d.m57668a(originMusicViewHolder.mCoverView, (int) R.drawable.dng);
                }
                originMusicViewHolder.mo76542a(z);
                if (originMusicViewHolder.f95017a.getCollectionType() != null) {
                    originMusicViewHolder.f95018b = CollectionType.COLLECTED.equals(originMusicViewHolder.f95017a.getCollectionType());
                }
                originMusicViewHolder.mo76541a();
            }
        }
    }

    public C37307m(C29691e eVar, String str, String str2) {
        this.f95215a = eVar;
        this.f95218d = str;
        this.f95220f = str2;
        registerAdapterDataObserver(new C1324c() {
            /* renamed from: a */
            public final void mo4984a() {
                C37307m.this.f95219e = C37307m.this.getItemCount();
                C37307m.this.mo76606a();
            }

            /* renamed from: b */
            public final void mo4988b(int i, int i2) {
                C37307m.this.f95219e = C37307m.this.getItemCount();
                C37307m.this.mo76606a();
            }

            /* renamed from: c */
            public final void mo4989c(int i, int i2) {
                C37307m.this.f95219e = C37307m.this.getItemCount();
                C37307m.this.mo76606a();
            }

            /* renamed from: a */
            public final void mo4985a(int i, int i2) {
                C37307m.this.f95219e = C37307m.this.getItemCount();
                C37307m.this.mo76606a();
            }

            /* renamed from: a */
            public final void mo4986a(int i, int i2, int i3) {
                C37307m.this.f95219e = C37307m.this.getItemCount();
                C37307m.this.mo76606a();
            }

            /* renamed from: a */
            public final void mo4987a(int i, int i2, Object obj) {
                C37307m.this.f95219e = C37307m.this.getItemCount();
                C37307m.this.mo76606a();
            }
        });
    }
}
