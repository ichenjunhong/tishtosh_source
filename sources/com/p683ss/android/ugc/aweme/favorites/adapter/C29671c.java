package com.p683ss.android.ugc.aweme.favorites.adapter;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29690d;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29691e;
import com.p683ss.android.ugc.aweme.favorites.viewholder.MusicCollectViewHolder;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.c */
public final class C29671c extends C26840g<Music> {

    /* renamed from: a */
    public C29691e f77561a;

    /* renamed from: b */
    public int f77562b = -1;

    /* renamed from: c */
    private RecyclerView f77563c;

    /* renamed from: d */
    private C29690d f77564d = new C29690d() {
        /* JADX WARNING: type inference failed for: r5v19, types: [android.content.Context] */
        /* JADX WARNING: type inference failed for: r5v20, types: [android.content.Context] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo59931a(final android.support.p043v7.widget.RecyclerView.C1352v r4, android.view.View r5, final com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel r6) {
            /*
                r3 = this;
                if (r6 == 0) goto L_0x00bd
                if (r5 == 0) goto L_0x00bd
                android.content.Context r0 = r5.getContext()
                if (r0 != 0) goto L_0x000c
                goto L_0x00bd
            L_0x000c:
                android.content.Context r0 = r5.getContext()
                boolean r0 = com.p683ss.android.ugc.aweme.favorites.adapter.C29674d.m69714a(r0)
                if (r0 != 0) goto L_0x0025
                android.content.Context r4 = r5.getContext()
                r5 = 2132546921(0x7f1c1569, float:2.0747074E38)
                com.bytedance.ies.dmt.ui.d.a r4 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r4, r5)
                r4.mo19066a()
                return
            L_0x0025:
                int r0 = r5.getId()
                r1 = 2132022329(0x7f141439, float:1.9683075E38)
                r2 = 1
                if (r0 != r1) goto L_0x0064
                com.ss.android.ugc.aweme.music.service.IMusicService r0 = com.p683ss.android.ugc.aweme.component.music.MusicService.createIMusicServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.music.service.IMusicService r0 = (com.p683ss.android.ugc.aweme.music.service.IMusicService) r0
                android.content.Context r5 = r5.getContext()
                boolean r5 = r0.checkValidMusic(r6, r5, r2)
                if (r5 != 0) goto L_0x0040
                return
            L_0x0040:
                android.app.Activity r5 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
                if (r5 == 0) goto L_0x004d
                boolean r0 = r5.isFinishing()
                if (r0 != 0) goto L_0x004d
                goto L_0x0051
            L_0x004d:
                android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            L_0x0051:
                com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin()
                com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = (com.p683ss.android.ugc.aweme.services.IAVServiceProxy) r0
                com.ss.android.ugc.aweme.port.in.bg r0 = r0.getShortVideoPluginService()
                com.ss.android.ugc.aweme.favorites.adapter.c$1$1 r1 = new com.ss.android.ugc.aweme.favorites.adapter.c$1$1
                r1.<init>(r4, r6)
                r0.mo80676a(r5, r2, r1)
                return
            L_0x0064:
                r5 = 2132020843(0x7f140e6b, float:1.968006E38)
                if (r0 != r5) goto L_0x00bc
                com.ss.android.ugc.aweme.favorites.adapter.c r5 = com.p683ss.android.ugc.aweme.favorites.adapter.C29671c.this
                int r5 = r5.f77562b
                int r0 = r4.getAdapterPosition()
                if (r5 != r0) goto L_0x007f
                com.ss.android.ugc.aweme.favorites.adapter.c r4 = com.p683ss.android.ugc.aweme.favorites.adapter.C29671c.this
                com.ss.android.ugc.aweme.favorites.c.e r4 = r4.f77561a
                if (r4 == 0) goto L_0x009f
                com.ss.android.ugc.aweme.favorites.adapter.c r4 = com.p683ss.android.ugc.aweme.favorites.adapter.C29671c.this
                r4.mo59930g()
                goto L_0x009f
            L_0x007f:
                com.ss.android.ugc.aweme.favorites.adapter.c r5 = com.p683ss.android.ugc.aweme.favorites.adapter.C29671c.this
                com.ss.android.ugc.aweme.favorites.c.e r5 = r5.f77561a
                if (r5 == 0) goto L_0x009f
                com.ss.android.ugc.aweme.favorites.adapter.c r5 = com.p683ss.android.ugc.aweme.favorites.adapter.C29671c.this
                r5.mo59930g()
                com.ss.android.ugc.aweme.favorites.adapter.c r5 = com.p683ss.android.ugc.aweme.favorites.adapter.C29671c.this
                com.ss.android.ugc.aweme.favorites.c.e r5 = r5.f77561a
                r5.mo59958a(r6)
                r5 = r4
                com.ss.android.ugc.aweme.favorites.viewholder.MusicCollectViewHolder r5 = (com.p683ss.android.ugc.aweme.favorites.viewholder.MusicCollectViewHolder) r5
                r5.mo60007a(r2)
                com.ss.android.ugc.aweme.favorites.adapter.c r5 = com.p683ss.android.ugc.aweme.favorites.adapter.C29671c.this
                int r4 = r4.getAdapterPosition()
                r5.f77562b = r4
            L_0x009f:
                java.lang.String r4 = "click_music"
                com.ss.android.ugc.aweme.app.f.d r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r0 = "enter_from"
                java.lang.String r1 = "collection_music"
                com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r0, r1)
                java.lang.String r0 = "music_id"
                java.lang.String r6 = r6.getMusicId()
                com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r0, r6)
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r5)
            L_0x00bc:
                return
            L_0x00bd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.favorites.adapter.C29671c.C296721.mo59931a(android.support.v7.widget.RecyclerView$v, android.view.View, com.ss.android.ugc.aweme.shortvideo.model.MusicModel):void");
        }
    };

    /* renamed from: g */
    public final void mo59930g() {
        if (this.f77562b != -1) {
            C1352v f = this.f77563c.mo4847f(this.f77562b);
            if (f instanceof MusicCollectViewHolder) {
                ((MusicCollectViewHolder) f).mo60007a(false);
            }
            this.f77562b = -1;
        }
        this.f77561a.mo59960b(null);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f77563c = recyclerView;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f77563c = null;
    }

    public C29671c(C29691e eVar) {
        this.f77561a = eVar;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        return new MusicCollectViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bub, viewGroup, false), this.f77564d);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        boolean z;
        String str;
        Music music = (Music) mo50673a().get(i);
        MusicCollectViewHolder musicCollectViewHolder = (MusicCollectViewHolder) vVar;
        if (i == this.f77562b) {
            z = true;
        } else {
            z = false;
        }
        if (music != null) {
            musicCollectViewHolder.f77715a = music;
            if (music.getCoverMedium() != null && music.getCoverMedium().getUrlList() != null && music.getCoverMedium().getUrlList().size() > 0) {
                C23515d.m57677a(musicCollectViewHolder.mCoverView, (String) musicCollectViewHolder.f77715a.getCoverMedium().getUrlList().get(0));
            } else if (music.getCoverThumb() != null && music.getCoverThumb().getUrlList() != null && music.getCoverThumb().getUrlList().size() > 0) {
                C23515d.m57677a(musicCollectViewHolder.mCoverView, (String) musicCollectViewHolder.f77715a.getCoverThumb().getUrlList().get(0));
            } else if (music.getCoverLarge() == null || music.getCoverLarge().getUrlList() == null || music.getCoverLarge().getUrlList().size() <= 0) {
                C23515d.m57668a(musicCollectViewHolder.mCoverView, (int) R.drawable.dwz);
            } else {
                C23515d.m57677a(musicCollectViewHolder.mCoverView, (String) musicCollectViewHolder.f77715a.getCoverLarge().getUrlList().get(0));
            }
            TextView textView = musicCollectViewHolder.mSingerView;
            if (TextUtils.isEmpty(musicCollectViewHolder.f77715a.getAuthorName())) {
                str = musicCollectViewHolder.itemView.getResources().getString(R.string.f76);
            } else {
                str = musicCollectViewHolder.f77715a.getAuthorName();
            }
            textView.setText(str);
            musicCollectViewHolder.mNameView.setText(musicCollectViewHolder.f77715a.getMusicName());
            if (TextUtils.isEmpty(musicCollectViewHolder.f77715a.getMusicName()) || !music.isOriginMusic()) {
                musicCollectViewHolder.mOriginalTag.setVisibility(8);
            } else {
                musicCollectViewHolder.mOriginalTag.setVisibility(0);
            }
            MusicService.createIMusicServicebyMonsterPlugin().attachPartnerTag(musicCollectViewHolder.mNameView, music, true);
            if (C10181b.m20511a().mo18172a(RemoveMusic15sCapExperiment.class, true, "remove_15s_cap_music", 31744, true)) {
                musicCollectViewHolder.mMusicDuration.setText(C37378c.m83694a(musicCollectViewHolder.f77715a.getPresenterDuration() * 1000));
            } else {
                musicCollectViewHolder.mMusicDuration.setText(C37378c.m83694a(musicCollectViewHolder.f77715a.getDuration() * 1000));
            }
            musicCollectViewHolder.mProgressBarView.setVisibility(8);
            musicCollectViewHolder.mo60008b(z);
            musicCollectViewHolder.mo59961a();
        }
    }
}
