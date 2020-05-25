package com.p683ss.android.ugc.aweme.music.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.music.adapter.C37292h.C37299a;
import com.p683ss.android.ugc.aweme.music.p1975c.C37353f;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder */
public class MusicUnitViewHolder extends C1352v {

    /* renamed from: c */
    private static int f95117c;

    /* renamed from: a */
    public MusicModel f95118a;

    /* renamed from: b */
    boolean f95119b;

    /* renamed from: d */
    private Context f95120d;
    View divider;

    /* renamed from: e */
    private C37289e f95121e;

    /* renamed from: f */
    private Context f95122f;

    /* renamed from: g */
    private int f95123g;

    /* renamed from: h */
    private String f95124h;

    /* renamed from: i */
    private C37306l<C37353f> f95125i;
    LinearLayout ivCollectFrame;
    ImageView ivDetail;
    CheckableImageView ivMusicCollect;
    ImageView ivOriginMusicMark;

    /* renamed from: j */
    private int f95126j;
    RemoteImageView mCoverView;
    TextView mDurationView;
    TextView mNameView;
    LinearLayout mOkView;
    public ImageView mPlayView;
    ProgressBar mProgressBarView;
    RelativeLayout mRightView;
    TextView mSingerView;
    LinearLayout mTopView;
    LinearLayout musicDetailContainer;
    LinearLayout musicItemll;

    /* renamed from: a */
    private static String m83516a(int i) {
        return i == 0 ? "popular_song" : i == 3 ? "song_category" : i == 2 ? "search_result" : "";
    }

    /* renamed from: b */
    private static String m83518b(int i) {
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
    public final void mo76583a() {
        int i;
        CheckableImageView checkableImageView = this.ivMusicCollect;
        if (this.f95119b) {
            i = R.drawable.a1c;
        } else {
            i = R.drawable.a1d;
        }
        checkableImageView.setImageResource(i);
    }

    /* renamed from: a */
    public final void mo76585a(boolean z) {
        m83519b(z);
    }

    /* renamed from: c */
    private void m83520c(boolean z) {
        this.musicItemll.setClickable(false);
        m83517a(0, 200, 1, 0, 0, -f95117c, 0, (int) C9432q.m18687b(this.f95120d, 30.0f), true);
    }

    /* renamed from: d */
    private void m83521d(boolean z) {
        this.musicItemll.setClickable(false);
        int i = -f95117c;
        int b = (int) C9432q.m18687b(this.f95120d, 30.0f);
        this.mOkView.setVisibility(0);
        if (C47918gj.m103682a(C11010c.m22280a())) {
            ((MarginLayoutParams) this.ivCollectFrame.getLayoutParams()).leftMargin = -f95117c;
        } else {
            ((MarginLayoutParams) this.ivCollectFrame.getLayoutParams()).rightMargin = -f95117c;
        }
        m83517a(100, 200, 0, 1, i, 0, b, 0, false);
    }

    /* renamed from: b */
    private void m83519b(boolean z) {
        if (z) {
            m83521d(true);
            if (this.f95118a.getMusicType() == MusicType.LOCAL) {
                this.mPlayView.setImageResource(R.drawable.aa1);
                this.mProgressBarView.setVisibility(8);
            } else if (this.f95118a.getMusicType() == MusicType.ONLINE) {
                if (z) {
                    this.mPlayView.setVisibility(0);
                    this.mPlayView.setImageResource(R.drawable.aa1);
                    this.mProgressBarView.setVisibility(8);
                    return;
                }
                this.mPlayView.setVisibility(8);
                this.mProgressBarView.setVisibility(0);
            } else if (z) {
                this.mPlayView.setVisibility(0);
                this.mPlayView.setImageResource(R.drawable.aa1);
                this.mProgressBarView.setVisibility(8);
            } else {
                this.mPlayView.setVisibility(8);
                this.mProgressBarView.setVisibility(0);
            }
        } else {
            if (this.mOkView.getVisibility() == 0) {
                m83520c(true);
            }
            this.mProgressBarView.setVisibility(8);
            this.mPlayView.setVisibility(0);
            this.mPlayView.setImageResource(R.drawable.a_c);
        }
    }

    public void onClick(View view) {
        String str;
        String str2;
        int id = view.getId();
        if (id == R.id.v0) {
            if (!AccountService.createIAccountServicebyMonsterPlugin().userService().isLogin()) {
                C27965f.m66719a(C11016e.m22312g(), m83516a(this.f95123g), "click_favorite_music");
                return;
            } else if (this.f95118a != null && C37378c.m83700a(this.f95118a, this.f95122f, true)) {
                if (this.f95125i != null) {
                    C37306l<C37353f> lVar = this.f95125i;
                    MusicModel musicModel = this.f95118a;
                    if (this.f95119b) {
                        str2 = "unfollow_type";
                    } else {
                        str2 = "follow_type";
                    }
                    lVar.mo50815a(new C37353f(musicModel, str2));
                }
                this.f95119b = !this.f95119b;
                MobClick obtain = MobClick.obtain();
                if (this.f95119b) {
                    str = "collection_music";
                } else {
                    str = "collection_music_cancel";
                }
                MobClick extValueLong = obtain.setEventName(str).setLabelName(m83518b(this.f95123g)).setValue(String.valueOf(this.f95118a.getMusicId())).setExtValueLong(0);
                if (!TextUtils.isEmpty(this.f95124h)) {
                    extValueLong.setJsonObject(C23088c.m56631a().mo47824a("search_keyword", this.f95124h).mo47825b());
                }
                C26890h.onEvent(extValueLong);
                this.ivMusicCollect.mo76959b();
            }
        } else if (id == R.id.bo6) {
            if (this.f95118a != null && this.f95118a.getMusicStatus() == 0 && this.f95118a.getMusic() != null) {
                String offlineDesc = this.f95118a.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = this.f95122f.getString(R.string.ce6);
                }
                C10691a.m21551c(view.getContext(), offlineDesc).mo19066a();
                return;
            } else if (this.f95118a != null) {
                if (C37378c.m83700a(this.f95118a, this.itemView.getContext(), true)) {
                    C41302w a = C41302w.m91042a();
                    StringBuilder sb = new StringBuilder("aweme://music/detail/");
                    sb.append(this.f95118a.getMusicId());
                    a.mo83861a(sb.toString());
                    MobClick value = MobClick.obtain().setEventName("music_detail").setLabelName(m83518b(this.f95123g)).setValue(this.f95118a.getMusicId());
                    if (!TextUtils.isEmpty(this.f95124h)) {
                        value.setJsonObject(C23088c.m56631a().mo47824a("search_keyword", this.f95124h).mo47825b());
                    }
                    C26890h.onEvent(value);
                } else {
                    return;
                }
            }
        }
        if (this.f95121e != null) {
            this.f95121e.mo51050a(this, view, this.f95118a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76584a(com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel r8, java.lang.String r9, boolean r10, int r11) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            r7.f95118a = r8
            r7.f95123g = r11
            r7.f95124h = r9
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$CollectionType r0 = r8.getCollectionType()
            if (r0 == 0) goto L_0x001b
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$CollectionType r0 = com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType.COLLECTED
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$CollectionType r1 = r8.getCollectionType()
            boolean r0 = r0.equals(r1)
            r7.f95119b = r0
        L_0x001b:
            r7.mo76583a()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.f95118a
            java.lang.String r0 = r0.getName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x006c
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x006c
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.f95118a
            java.lang.String r0 = r0.getName()
            int r0 = r0.indexOf(r9)
            if (r0 <= 0) goto L_0x006c
            android.text.SpannableString r3 = new android.text.SpannableString
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r4 = r7.f95118a
            java.lang.String r4 = r4.getName()
            r3.<init>(r4)
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            android.view.View r5 = r7.itemView
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131821876(0x7f110534, float:1.9276508E38)
            int r5 = r5.getColor(r6)
            r4.<init>(r5)
            int r9 = r9.length()
            int r9 = r9 + r0
            r5 = 17
            r3.setSpan(r4, r0, r9, r5)
            android.widget.TextView r9 = r7.mNameView
            r9.setText(r3)
            r9 = 1
            goto L_0x006d
        L_0x006c:
            r9 = 0
        L_0x006d:
            if (r9 != 0) goto L_0x009b
            android.widget.TextView r9 = r7.mNameView
            android.view.View r0 = r7.itemView
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131821862(0x7f110526, float:1.927648E38)
            int r0 = r0.getColor(r3)
            r9.setTextColor(r0)
            android.widget.TextView r9 = r7.mNameView
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.f95118a
            java.lang.String r0 = r0.getName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0096
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.f95118a
            java.lang.String r0 = r0.getName()
            goto L_0x0098
        L_0x0096:
            java.lang.String r0 = ""
        L_0x0098:
            r9.setText(r0)
        L_0x009b:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r9 = r7.f95118a
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r9 = r9.getMusicType()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r0 = com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType.LOCAL
            r3 = 8
            if (r9 != r0) goto L_0x00b3
            android.widget.TextView r9 = r7.mDurationView
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.f95118a
            java.lang.String r0 = r0.getLocalMusicDuration()
            r9.setText(r0)
            goto L_0x00d5
        L_0x00b3:
            android.widget.TextView r9 = r7.mDurationView
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.f95118a
            int r0 = r0.getPresenterDuration()
            java.lang.String r0 = com.p683ss.android.ugc.aweme.music.p1977e.C37378c.m83694a(r0)
            r9.setText(r0)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r9 = r7.f95118a
            int r9 = r9.getDuration()
            if (r9 <= 0) goto L_0x00d0
            android.widget.TextView r9 = r7.mDurationView
            r9.setVisibility(r2)
            goto L_0x00d5
        L_0x00d0:
            android.widget.TextView r9 = r7.mDurationView
            r9.setVisibility(r3)
        L_0x00d5:
            android.widget.TextView r9 = r7.mSingerView
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.f95118a
            java.lang.String r0 = r0.getSinger()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00f1
            android.view.View r0 = r7.itemView
            android.content.res.Resources r0 = r0.getResources()
            r4 = 2132551643(0x7f1c27db, float:2.075665E38)
            java.lang.String r0 = r0.getString(r4)
            goto L_0x00f7
        L_0x00f1:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.f95118a
            java.lang.String r0 = r0.getSinger()
        L_0x00f7:
            r9.setText(r0)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r9 = r7.f95118a
            java.lang.String r9 = r9.getPicPremium()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0112
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r9 = r7.mCoverView
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.f95118a
            java.lang.String r0 = r0.getPicPremium()
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r9, r0)
            goto L_0x0132
        L_0x0112:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r9 = r7.f95118a
            java.lang.String r9 = r9.getPicBig()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r9 = r7.mCoverView
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.f95118a
            java.lang.String r0 = r0.getPicBig()
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r9, r0)
            goto L_0x0132
        L_0x012a:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r9 = r7.mCoverView
            r0 = 2131953215(0x7f13063f, float:1.9542895E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r9, r0)
        L_0x0132:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r9 = r7.f95118a
            boolean r9 = r9.isOriginal()
            r0 = 0
            if (r9 == 0) goto L_0x0184
            android.widget.ImageView r9 = r7.ivOriginMusicMark
            r9.setVisibility(r3)
            android.view.View r9 = r7.itemView
            android.content.Context r9 = r9.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r4 = 2131953365(0x7f1306d5, float:1.9543199E38)
            android.graphics.drawable.Drawable r9 = r9.getDrawable(r4)
            android.view.View r4 = r7.itemView
            android.content.Context r4 = r4.getContext()
            r5 = 1098907648(0x41800000, float:16.0)
            float r4 = com.bytedance.common.utility.C9432q.m18687b(r4, r5)
            int r4 = (int) r4
            android.view.View r6 = r7.itemView
            android.content.Context r6 = r6.getContext()
            float r5 = com.bytedance.common.utility.C9432q.m18687b(r6, r5)
            int r5 = (int) r5
            r9.setBounds(r2, r2, r4, r5)
            android.widget.TextView r4 = r7.mNameView
            r4.setCompoundDrawables(r9, r0, r0, r0)
            android.widget.TextView r9 = r7.mNameView
            android.view.View r0 = r7.itemView
            android.content.Context r0 = r0.getContext()
            r4 = 1073741824(0x40000000, float:2.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r4)
            int r0 = (int) r0
            r9.setCompoundDrawablePadding(r0)
            goto L_0x018e
        L_0x0184:
            android.widget.TextView r9 = r7.mNameView
            r9.setCompoundDrawables(r0, r0, r0, r0)
            android.widget.ImageView r9 = r7.ivOriginMusicMark
            r9.setVisibility(r3)
        L_0x018e:
            r7.m83519b(r10)
            boolean r9 = r8.isChallengeMusic()
            if (r9 == 0) goto L_0x019c
            android.widget.LinearLayout r9 = r7.musicDetailContainer
            r9.setVisibility(r3)
        L_0x019c:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r9 = r8.getMusicType()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r10 = com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType.LOCAL
            if (r9 != r10) goto L_0x01aa
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r9 = r7.ivMusicCollect
            r9.setVisibility(r3)
            goto L_0x01af
        L_0x01aa:
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r9 = r7.ivMusicCollect
            r9.setVisibility(r2)
        L_0x01af:
            android.widget.LinearLayout r9 = r7.musicDetailContainer
            int r10 = r7.f95126j
            if (r10 != r1) goto L_0x01b6
            r3 = 0
        L_0x01b6:
            r9.setVisibility(r3)
            android.widget.LinearLayout r9 = r7.musicDetailContainer
            int r10 = r7.f95126j
            if (r10 != r1) goto L_0x01c0
            goto L_0x01c1
        L_0x01c0:
            r1 = 0
        L_0x01c1:
            r9.setEnabled(r1)
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r9 = r7.ivMusicCollect
            com.ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder$1 r10 = new com.ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder$1
            r10.<init>()
            r9.setOnStateChangeListener(r10)
            java.lang.String r2 = m83516a(r11)
            android.widget.LinearLayout r9 = r7.mTopView
            android.content.Context r0 = r9.getContext()
            java.lang.String r1 = "show_music"
            java.lang.String r3 = r8.getMusicId()
            r4 = 0
            com.p683ss.android.ugc.aweme.common.C26890h.m65005a(r0, r1, r2, r3, r4)
            java.lang.String r8 = "client_show"
            com.ss.android.ugc.aweme.app.f.d r9 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r10 = "enter_from"
            java.lang.String r11 = "popular_song"
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.lang.String r10 = "music_id"
            java.lang.String r11 = "123321"
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.lang.String r10 = "content"
            java.lang.String r11 = "music"
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.util.Map<java.lang.String, java.lang.String> r9 = r9.f61491a
            com.p683ss.android.ugc.aweme.common.C26883g.m64995a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder.mo76584a(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.String, boolean, int):void");
    }

    public MusicUnitViewHolder(View view, C37289e eVar, int i, C37299a aVar, C37306l<C37353f> lVar) {
        super(view);
        this.f95120d = view.getContext();
        this.f95121e = eVar;
        this.f95125i = lVar;
        ButterKnife.bind((Object) this, view);
        this.f95122f = view.getContext();
        this.f95126j = i;
        aVar.ordinal();
        if (f95117c <= 0) {
            this.mOkView.measure(MeasureSpec.makeMeasureSpec(536870911, DynamicTabYellowPointVersion.DEFAULT), MeasureSpec.makeMeasureSpec(536870911, DynamicTabYellowPointVersion.DEFAULT));
            f95117c = (int) (((float) this.mOkView.getMeasuredWidth()) + C9432q.m18687b(this.f95120d, 8.0f));
        }
    }

    /* renamed from: a */
    private void m83517a(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, final boolean z) {
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{i4, i5}).setDuration(200);
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (C47918gj.m103682a(C11010c.m22280a())) {
                    ((MarginLayoutParams) MusicUnitViewHolder.this.ivCollectFrame.getLayoutParams()).leftMargin = intValue;
                } else {
                    ((MarginLayoutParams) MusicUnitViewHolder.this.ivCollectFrame.getLayoutParams()).rightMargin = intValue;
                }
                MusicUnitViewHolder.this.ivCollectFrame.requestLayout();
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                MusicUnitViewHolder.this.musicItemll.setClickable(true);
                if (z) {
                    MusicUnitViewHolder.this.mOkView.setVisibility(8);
                    if (C47918gj.m103682a(C11010c.m22280a())) {
                        ((MarginLayoutParams) MusicUnitViewHolder.this.ivCollectFrame.getLayoutParams()).leftMargin = 0;
                        return;
                    }
                    ((MarginLayoutParams) MusicUnitViewHolder.this.ivCollectFrame.getLayoutParams()).rightMargin = 0;
                }
            }
        });
        AlphaAnimation alphaAnimation = new AlphaAnimation((float) i2, (float) i3);
        TranslateAnimation translateAnimation = new TranslateAnimation((float) i6, (float) i7, 0.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setFillAfter(true);
        animationSet.setDuration(100);
        animationSet.setStartOffset(j);
        this.mOkView.startAnimation(animationSet);
        duration.start();
    }
}
