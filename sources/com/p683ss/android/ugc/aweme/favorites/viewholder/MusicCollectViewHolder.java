package com.p683ss.android.ugc.aweme.favorites.viewholder;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29690d;
import com.p683ss.android.ugc.aweme.favorites.p1704d.C29692a;
import com.p683ss.android.ugc.aweme.favorites.p1704d.C29692a.C29693a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.MusicCollectViewHolder */
public class MusicCollectViewHolder extends C1352v implements OnClickListener, C29693a {

    /* renamed from: a */
    public Music f77715a;

    /* renamed from: b */
    private C29690d f77716b;

    /* renamed from: c */
    private Context f77717c;
    public RemoteImageView mCoverView;
    public TextView mMusicDuration;
    public TextView mNameView;
    RelativeLayout mOkView;
    public ImageView mOriginalTag;
    ImageView mPlayView;
    public ProgressBar mProgressBarView;
    RelativeLayout mRightView;
    public TextView mSingerView;
    LinearLayout mTopView;
    LinearLayout musicItemll;

    /* renamed from: a */
    public final void mo59961a() {
        if (this.f77715a != null) {
            C29692a.m69741b(1, this.f77715a.getMid());
        }
    }

    /* renamed from: a */
    public final void mo60007a(boolean z) {
        mo60008b(z);
    }

    /* renamed from: b */
    public void mo60008b(boolean z) {
        if (z) {
            this.mOkView.setVisibility(0);
            this.mPlayView.setImageResource(R.drawable.dwp);
            this.mProgressBarView.setVisibility(8);
            return;
        }
        this.mOkView.setVisibility(8);
        this.mProgressBarView.setVisibility(8);
        this.mPlayView.setVisibility(0);
        this.mPlayView.setImageResource(R.drawable.dwq);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.bo5) {
            Context context = view.getContext();
            Music music = this.f77715a;
            String str = "collection_music";
            String str2 = "";
            if (music != null && music.getMusicStatus() == 0) {
                String offlineDesc = music.getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = context.getString(R.string.ce6);
                }
                C10691a.m21551c(context, offlineDesc).mo19066a();
            } else if (music != null) {
                if (!C37378c.m83700a(music.convertToMusicModel(), context, true)) {
                    C26890h.m65011a("enter_music_detail_failed", new C23089d().mo47829a("group_id", "").mo47829a("author_id", "").mo47829a("music_id", music.getMid()).mo47829a("enter_from", str).f61491a);
                } else {
                    String uuid = UUID.randomUUID().toString();
                    String mid = music.getMid();
                    C23089d a = C23089d.m56640a();
                    if (!TextUtils.isEmpty(str2)) {
                        a.mo47829a("tab_name", str2);
                    }
                    C26890h.m65011a("enter_music_detail", a.mo47829a("music_id", mid).mo47829a("enter_from", str).mo47829a("process_id", uuid).mo47829a("enter_method", "click_collection_music").f61491a);
                    SmartRouter.buildRoute(C11010c.m22280a(), "aweme://music/detail/").withParam("id", music.getMid()).withParam("process_id", uuid).open();
                }
            }
        }
        if (!(this.f77716b == null || this.f77715a == null)) {
            this.f77716b.mo59931a(this, view, this.f77715a.convertToMusicModel());
        }
        if (this.f77715a != null) {
            String mid2 = this.f77715a.getMid();
            String str3 = "collection_music";
            String str4 = "";
            C23089d a2 = C23089d.m56640a();
            if (!TextUtils.isEmpty(str4)) {
                a2.mo47829a("tab_name", str4);
            }
            C26890h.m65011a("click_personal_collection", a2.mo47829a("enter_from", str3).mo47829a(C42311c.f106865i, "music").mo47829a("music_id", mid2).f61491a);
        }
    }

    public MusicCollectViewHolder(View view, C29690d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f77717c = view.getContext();
        this.f77716b = dVar;
    }
}
