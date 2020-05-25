package com.p683ss.android.ugc.aweme.music;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29690d;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView.C37446a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.music.OriginMusicViewHolder */
public class OriginMusicViewHolder extends C1352v {

    /* renamed from: a */
    public MusicModel f95017a;

    /* renamed from: b */
    public boolean f95018b;

    /* renamed from: c */
    public Context f95019c;

    /* renamed from: d */
    String f95020d;

    /* renamed from: e */
    private C29690d f95021e;
    @BindView(2131494207)
    ImageView ivDetail;
    @BindView(2131494585)
    public RemoteImageView mCoverView;
    @BindView(2131495058)
    public TextView mDurationView;
    @BindView(2131493924)
    public CheckableImageView mIvMusicCollect;
    @BindView(2131495100)
    public TextView mNameView;
    @BindView(2131494532)
    RelativeLayout mOkView;
    @BindView(2131493949)
    ImageView mPlayView;
    @BindView(2131494307)
    ProgressBar mProgressBarView;
    @BindView(2131494534)
    ConstraintLayout mRightView;
    @BindView(2131494884)
    public TextView mTagView;
    @BindView(2131494100)
    LinearLayout mTopView;
    @BindView(2131495222)
    TextView mTvConfirm;
    @BindView(2131494209)
    public LinearLayout musicItemll;
    @BindView(2131495156)
    public TextView txtUserCount;

    /* renamed from: a */
    public final void mo76541a() {
        int i;
        CheckableImageView checkableImageView = this.mIvMusicCollect;
        if (this.f95018b) {
            i = R.drawable.dnb;
        } else {
            i = R.drawable.dpv;
        }
        checkableImageView.setImageResource(i);
    }

    /* renamed from: b */
    public final void mo76543b(boolean z) {
        mo76542a(z);
    }

    /* renamed from: a */
    public void mo76542a(boolean z) {
        if (z) {
            this.mOkView.setVisibility(0);
            this.mPlayView.setVisibility(0);
            this.mPlayView.setImageResource(R.drawable.doo);
            this.mProgressBarView.setVisibility(8);
            C26890h.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("personal_homepage_list").setValue(this.f95017a.getMusicId()));
            return;
        }
        this.mOkView.setVisibility(8);
        this.mProgressBarView.setVisibility(8);
        this.mPlayView.setVisibility(0);
        this.mPlayView.setImageResource(R.drawable.dop);
    }

    @OnClick({2131494532, 2131494100, 2131494207})
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.bo5) {
            if (this.f95017a != null && this.f95017a.getMusicStatus() == 0 && this.f95017a.getMusic() != null) {
                String offlineDesc = this.f95017a.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = this.f95019c.getString(R.string.ce6);
                }
                C10691a.m21551c(view.getContext(), offlineDesc).mo19066a();
                return;
            } else if (this.f95017a != null) {
                C26890h.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("personal_homepage_list").setValue(this.f95017a.getMusicId()));
                String uuid = UUID.randomUUID().toString();
                C26890h.m65011a("enter_music_detail", C23089d.m56640a().mo47829a("enter_from", "personal_homepage_list").mo47829a("group_id", "").mo47829a("music_id", this.f95017a.getMusicId()).mo47829a("previous_page", this.f95020d).mo47829a("process_id", uuid).mo47829a("enter_method", "personal_list").f61491a);
                if (!MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(this.f95017a, this.itemView.getContext(), true)) {
                    C26890h.m65011a("enter_music_detail_failed", new C23089d().mo47829a("group_id", "").mo47829a("author_id", "").mo47829a("music_id", this.f95017a.getMusicId()).mo47829a("enter_from", "personal_homepage_list").f61491a);
                    return;
                }
                C41302w a = C41302w.m91042a();
                StringBuilder sb = new StringBuilder("aweme://music/detail/");
                sb.append(this.f95017a.getMusicId());
                a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("process_id", uuid).mo83871a());
            }
        } else if (id == R.id.cdm) {
            this.mPlayView.setImageResource(R.drawable.dop);
        }
        if (this.f95021e != null) {
            this.f95021e.mo59931a(this, view, this.f95017a);
        }
    }

    public OriginMusicViewHolder(View view, C29690d dVar, String str) {
        super(view);
        this.f95021e = dVar;
        this.f95020d = str;
        ButterKnife.bind((Object) this, view);
        this.f95019c = view.getContext();
        this.mIvMusicCollect.setOnStateChangeListener(new C37446a() {
            /* renamed from: a */
            public final void mo50574a() {
            }

            /* renamed from: a */
            public final void mo50575a(int i) {
                if (i == 1) {
                    OriginMusicViewHolder.this.mo76541a();
                }
            }
        });
        this.mIvMusicCollect.setVisibility(0);
    }
}
