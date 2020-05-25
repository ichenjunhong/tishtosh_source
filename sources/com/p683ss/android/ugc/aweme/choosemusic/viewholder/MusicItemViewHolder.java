package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Color;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24989j;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.music.p1975c.C37351d;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView.C37446a;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1981c.C37597b;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47902fv;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder */
public class MusicItemViewHolder extends C1352v {

    /* renamed from: e */
    private static int f66227e;

    /* renamed from: a */
    public boolean f66228a;

    /* renamed from: b */
    protected Context f66229b;

    /* renamed from: c */
    public MusicModel f66230c;

    /* renamed from: d */
    public int f66231d;

    /* renamed from: f */
    private int f66232f;

    /* renamed from: g */
    private int f66233g;

    /* renamed from: h */
    private boolean f66234h;

    /* renamed from: i */
    private C24989j f66235i;

    /* renamed from: j */
    private C24803a f66236j;

    /* renamed from: k */
    private boolean f66237k;

    /* renamed from: l */
    private C37306l<C24806c> f66238l;

    /* renamed from: m */
    private int f66239m;
    CheckableImageView mIvMusicCollect;
    SmartImageView mIvMusicCover;
    ImageView mIvMusicDetail;
    ImageView mIvMusicMark;
    ImageView mIvPlayView;
    ImageView mIvUseToShoot;
    public ViewGroup mLlItemContainer;
    ViewGroup mLlTitltContainer;
    ViewGroup mLlUseToShoot;
    RecyclerView mMusicTagsContainer;
    ImageView mOriginalTag;
    ViewGroup mRLCoverContainer;
    ViewGroup mRlUseContainer;
    View mSpaceView;
    TextView mTvMusicDuration;
    TextView mTvMusicName;
    TextView mTvMusicSinger;
    TextView mTvUseToShoot;

    /* renamed from: a */
    private static int m60822a(int i) {
        switch (i) {
            case 0:
                return R.drawable.b1a;
            case 1:
                return R.drawable.b1e;
            case 2:
                return R.drawable.b1f;
            case 3:
                return R.drawable.b1g;
            case 4:
                return R.drawable.b1h;
            case 5:
                return R.drawable.b1i;
            case 6:
                return R.drawable.b1j;
            case 7:
                return R.drawable.b1k;
            case 8:
                return R.drawable.b1l;
            case 9:
                return R.drawable.b1b;
            case 10:
                return R.drawable.b1c;
            case 11:
                return R.drawable.b1d;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo51011a(String str, boolean z) {
        if (!TextUtils.isEmpty(this.f66230c.getName())) {
            this.mTvMusicName.setText(this.f66230c.getName());
            z = true;
        }
        if (!z) {
            this.mTvMusicName.setTextColor(this.f66229b.getResources().getColor(R.color.a2t));
            this.mTvMusicName.setText(!TextUtils.isEmpty(this.f66230c.getName()) ? this.f66230c.getName() : "");
        }
        if (TextUtils.isEmpty(this.f66230c.getName()) || (!this.f66230c.isOriginal() && !this.f66230c.isArtist())) {
            this.mOriginalTag.setVisibility(8);
        } else {
            this.mOriginalTag.setVisibility(0);
        }
        C37597b.f95893c.mo77114a(this.mTvMusicName, this.f66230c.getMusic(), true);
        this.mTvMusicSinger.setText(TextUtils.isEmpty(this.f66230c.getSinger()) ? this.f66229b.getString(R.string.f76) : this.f66230c.getSinger());
        m60824a(this.mIvMusicCover, this.f66230c);
        if (this.f66230c.getMusicType() == MusicType.LOCAL) {
            this.mTvMusicDuration.setText(this.f66230c.getLocalMusicDuration());
        } else {
            this.mTvMusicDuration.setText(C47902fv.m103621a(this.f66230c.getPresenterDuration()));
        }
        if (this.f66237k) {
            this.mTvMusicName.setTextColor(Color.parseColor("#e6ffffff"));
            this.mTvMusicSinger.setTextColor(Color.parseColor("#80ffffff"));
            this.mTvMusicDuration.setTextColor(Color.parseColor("#80ffffff"));
        }
    }

    /* renamed from: a */
    public final void mo51007a() {
        this.itemView.setPadding(0, 0, 0, 0);
    }

    /* renamed from: b */
    public final void mo51013b() {
        if (this.f66230c.getCollectionType() != null) {
            this.f66228a = CollectionType.COLLECTED.equals(this.f66230c.getCollectionType());
        }
        mo51015d();
    }

    /* renamed from: d */
    public final void mo51015d() {
        int i;
        CheckableImageView checkableImageView = this.mIvMusicCollect;
        if (this.f66228a) {
            i = R.drawable.a1c;
        } else if (this.f66237k) {
            i = R.drawable.d4o;
        } else {
            i = R.drawable.a1d;
        }
        checkableImageView.setImageResource(i);
    }

    /* renamed from: c */
    public final void mo51014c() {
        String str;
        if (this.f66230c != null) {
            if (this.f66228a || C37378c.m83700a(this.f66230c, this.f66229b, true)) {
                if (this.f66238l != null) {
                    C37306l<C24806c> lVar = this.f66238l;
                    MusicModel musicModel = this.f66230c;
                    if (this.f66228a) {
                        str = "unfollow_type";
                    } else {
                        str = "follow_type";
                    }
                    lVar.mo50815a(new C24806c(musicModel, str, this.f66233g, this.f66231d));
                }
                this.f66228a = !this.f66228a;
                this.mIvMusicCollect.mo76959b();
            }
        }
    }

    /* renamed from: d */
    private void m60830d(boolean z) {
        if (!z) {
            m60827b(true);
        } else {
            m60829c(true);
        }
    }

    public void onClick(View view) {
        if (this.f66235i != null) {
            this.f66235i.mo50703a(this, view, this.f66230c, this.f66232f);
        }
    }

    /* renamed from: b */
    private void m60827b(boolean z) {
        if (this.mLlUseToShoot.getVisibility() != 8) {
            if (z) {
                this.mLlItemContainer.setClickable(false);
                int i = -f66227e;
                int b = (int) C9432q.m18687b(this.f66229b, 30.0f);
                if (C47918gj.m103682a(this.f66229b)) {
                    b = -b;
                }
                m60823a(0, 200, 1, 0, 0, i, 0, b, true);
                return;
            }
            this.mLlUseToShoot.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m60829c(boolean z) {
        if (this.mLlUseToShoot.getVisibility() != 0) {
            if (z) {
                this.mLlItemContainer.setClickable(false);
                int i = -f66227e;
                int b = (int) C9432q.m18687b(this.f66229b, 30.0f);
                if (C47918gj.m103682a(this.f66229b)) {
                    b = -b;
                }
                int i2 = b;
                this.mLlUseToShoot.setVisibility(0);
                if (C47918gj.m103682a(this.f66229b)) {
                    ((MarginLayoutParams) this.mRlUseContainer.getLayoutParams()).leftMargin = -f66227e;
                } else {
                    ((MarginLayoutParams) this.mRlUseContainer.getLayoutParams()).rightMargin = -f66227e;
                }
                m60823a(100, 200, 0, 1, i, 0, i2, 0, false);
                return;
            }
            this.mLlUseToShoot.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m60826a(boolean z) {
        this.mIvPlayView.clearAnimation();
        if (!z) {
            this.mIvPlayView.setVisibility(0);
            this.mIvPlayView.setImageResource(R.drawable.a_c);
        } else if (this.f66230c != null) {
            if (this.f66230c.getMusicType() == MusicType.LOCAL) {
                this.mIvPlayView.setImageResource(R.drawable.aa1);
            } else {
                if (this.f66230c.getMusicType() == MusicType.ONLINE) {
                    this.mIvPlayView.setVisibility(0);
                    this.mIvPlayView.setImageResource(R.drawable.aa1);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51012a(boolean z, boolean z2) {
        m60828b(z, z2);
    }

    /* renamed from: a */
    protected static void m60824a(SmartImageView smartImageView, MusicModel musicModel) {
        smartImageView.post(new C25024d(musicModel, smartImageView));
    }

    /* renamed from: a */
    public final void mo51008a(C24989j jVar, C37306l<C24806c> lVar) {
        this.f66235i = jVar;
        this.f66238l = lVar;
    }

    public MusicItemViewHolder(View view, int i) {
        super(view);
        this.f66229b = view.getContext();
        this.f66239m = i;
        ButterKnife.bind((Object) this, view);
        this.mIvUseToShoot.setVisibility(0);
        if (f66227e <= 0) {
            this.mLlUseToShoot.measure(MeasureSpec.makeMeasureSpec(536870911, DynamicTabYellowPointVersion.DEFAULT), MeasureSpec.makeMeasureSpec(536870911, DynamicTabYellowPointVersion.DEFAULT));
            f66227e = (int) (((float) this.mLlUseToShoot.getMeasuredWidth()) + C9432q.m18687b(this.f66229b, 8.0f));
        }
        this.mIvMusicCollect.setOnStateChangeListener(new C37446a() {
            /* renamed from: a */
            public final void mo50574a() {
                MusicItemViewHolder musicItemViewHolder = MusicItemViewHolder.this;
                boolean z = musicItemViewHolder.f66228a;
                C47718bf.m103288a(new C37351d(z ? 1 : 0, musicItemViewHolder.f66230c));
            }

            /* renamed from: a */
            public final void mo50575a(int i) {
                if (i == 1) {
                    MusicItemViewHolder.this.mo51015d();
                }
            }
        });
    }

    /* renamed from: b */
    private void m60828b(boolean z, boolean z2) {
        if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.bc);
            loadAnimation.setInterpolator(new LinearInterpolator());
            this.mIvPlayView.setImageResource(R.drawable.apj);
            this.mIvPlayView.startAnimation(loadAnimation);
            return;
        }
        this.mIvPlayView.clearAnimation();
        m60826a(z2);
        m60830d(z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m60825a(com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel r1, java.lang.String r2, boolean r3, boolean r4, int r5) {
        /*
            r0 = this;
            r0.f66230c = r1
            r0.f66232f = r5
            r0.mo51013b()
            r4 = 0
            r0.mo51011a(r2, r4)
            r0.m60826a(r3)
            if (r3 == 0) goto L_0x0014
            r0.m60829c(r4)
            goto L_0x0017
        L_0x0014:
            r0.m60827b(r4)
        L_0x0017:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r1 = r1.getMusicType()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r2 = com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType.LOCAL
            r3 = 8
            if (r1 != r2) goto L_0x0029
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r1 = r0.mIvMusicCollect
            r1.setVisibility(r3)
            android.widget.ImageView r1 = r0.mIvMusicDetail
            goto L_0x0046
        L_0x0029:
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r1 = r0.mIvMusicCollect
            r1.setVisibility(r4)
            boolean r1 = com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d.m60739a()
            r2 = 1
            if (r1 == 0) goto L_0x003f
            int r1 = r0.f66239m
            if (r1 == r2) goto L_0x0040
            int r1 = r0.f66239m
            r5 = 2
            if (r1 != r5) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            android.widget.ImageView r1 = r0.mIvMusicDetail
            if (r2 == 0) goto L_0x0046
            r2 = 0
            goto L_0x0048
        L_0x0046:
            r2 = 8
        L_0x0048:
            r1.setVisibility(r2)
            boolean r1 = r0.f66234h
            if (r1 == 0) goto L_0x00a3
            int r1 = r0.f66231d
            r2 = 12
            if (r1 >= r2) goto L_0x00a3
            android.widget.ImageView r1 = r0.mIvMusicMark
            r1.setVisibility(r4)
            int r1 = r0.f66231d
            int r1 = m60822a(r1)
            if (r1 <= 0) goto L_0x00a8
            int r2 = r0.f66231d
            r4 = 3
            if (r2 >= r4) goto L_0x0082
            android.widget.ImageView r2 = r0.mIvMusicMark
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.widget.ImageView r4 = r0.mIvMusicMark
            android.content.Context r4 = r4.getContext()
            r5 = 0
            float r4 = com.bytedance.common.utility.C9432q.m18687b(r4, r5)
            int r4 = (int) r4
            r2.topMargin = r4
            int r4 = r2.topMargin
            r2.leftMargin = r4
            goto L_0x009d
        L_0x0082:
            android.widget.ImageView r2 = r0.mIvMusicMark
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.widget.ImageView r4 = r0.mIvMusicMark
            android.content.Context r4 = r4.getContext()
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = com.bytedance.common.utility.C9432q.m18687b(r4, r5)
            int r4 = (int) r4
            r2.topMargin = r4
            int r4 = r2.topMargin
            r2.leftMargin = r4
        L_0x009d:
            android.widget.ImageView r2 = r0.mIvMusicMark
            r2.setImageResource(r1)
            goto L_0x00a8
        L_0x00a3:
            android.widget.ImageView r1 = r0.mIvMusicMark
            r1.setVisibility(r3)
        L_0x00a8:
            java.lang.String r1 = "search_music"
            com.ss.android.ugc.aweme.choosemusic.a r2 = r0.f66236j
            java.lang.String r2 = r2.f65641a
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x0118
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r0.f66230c
            if (r1 == 0) goto L_0x00f7
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r0.f66230c
            com.ss.android.ugc.aweme.music.model.Music r1 = r1.getMusic()
            if (r1 == 0) goto L_0x00f7
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r0.f66230c
            com.ss.android.ugc.aweme.music.model.Music r1 = r1.getMusic()
            java.util.List r1 = r1.getMusicTags()
            if (r1 == 0) goto L_0x00f7
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r0.f66230c
            com.ss.android.ugc.aweme.music.model.Music r1 = r1.getMusic()
            java.util.List r1 = r1.getMusicTags()
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00f7
            com.ss.android.ugc.aweme.music.service.ISearchMusicDepentService r1 = com.p683ss.android.ugc.aweme.discover.adapter.music.SearchMusicDepentServiceImpl.createISearchMusicDepentServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.music.service.ISearchMusicDepentService r1 = (com.p683ss.android.ugc.aweme.music.service.ISearchMusicDepentService) r1
            android.support.v7.widget.RecyclerView r2 = r0.mMusicTagsContainer
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r3 = r0.f66230c
            com.ss.android.ugc.aweme.music.model.Music r3 = r3.getMusic()
            java.util.List r3 = r3.getMusicTags()
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder$2 r4 = new com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder$2
            r4.<init>()
            r1.showSearchMusicTags(r2, r3, r4)
            goto L_0x0105
        L_0x00f7:
            android.support.v7.widget.RecyclerView r1 = r0.mMusicTagsContainer
            if (r1 == 0) goto L_0x0105
            android.support.v7.widget.RecyclerView r1 = r0.mMusicTagsContainer
            r1.setVisibility(r3)
            android.support.v7.widget.RecyclerView r1 = r0.mMusicTagsContainer
            r1.removeAllViews()
        L_0x0105:
            com.ss.android.ugc.aweme.music.service.ISearchMusicDepentService r1 = com.p683ss.android.ugc.aweme.discover.adapter.music.SearchMusicDepentServiceImpl.createISearchMusicDepentServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.music.service.ISearchMusicDepentService r1 = (com.p683ss.android.ugc.aweme.music.service.ISearchMusicDepentService) r1
            com.ss.android.ugc.aweme.choosemusic.a r2 = r0.f66236j
            java.lang.String r2 = r2.f65641a
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r3 = r0.f66230c
            int r4 = r0.getAdapterPosition()
            r1.mobShowMusicCardEvent(r2, r3, r4)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder.m60825a(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.String, boolean, boolean, int):void");
    }

    /* renamed from: a */
    public final void mo51009a(MusicModel musicModel, String str, boolean z, boolean z2, boolean z3, int i, int i2, int i3, C24803a aVar) {
        mo51010a(musicModel, str, z, z2, false, 0, i2, i3, aVar, false);
    }

    /* renamed from: a */
    private void m60823a(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, final boolean z) {
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{i4, i5}).setDuration(200);
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (C47918gj.m103682a(MusicItemViewHolder.this.f66229b)) {
                    ((MarginLayoutParams) MusicItemViewHolder.this.mRlUseContainer.getLayoutParams()).leftMargin = intValue;
                } else {
                    ((MarginLayoutParams) MusicItemViewHolder.this.mRlUseContainer.getLayoutParams()).rightMargin = intValue;
                }
                MusicItemViewHolder.this.mRlUseContainer.requestLayout();
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                MusicItemViewHolder.this.mLlItemContainer.setClickable(true);
                if (z) {
                    MusicItemViewHolder.this.mLlUseToShoot.setVisibility(8);
                    if (C47918gj.m103682a(MusicItemViewHolder.this.f66229b)) {
                        ((MarginLayoutParams) MusicItemViewHolder.this.mRlUseContainer.getLayoutParams()).leftMargin = 0;
                        return;
                    }
                    ((MarginLayoutParams) MusicItemViewHolder.this.mRlUseContainer.getLayoutParams()).rightMargin = 0;
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
        this.mLlUseToShoot.startAnimation(animationSet);
        duration.start();
    }

    /* renamed from: a */
    public final void mo51010a(MusicModel musicModel, String str, boolean z, boolean z2, boolean z3, int i, int i2, int i3, C24803a aVar, boolean z4) {
        if (musicModel != null) {
            this.f66234h = z;
            this.f66231d = i3;
            this.f66233g = i2;
            this.f66236j = aVar;
            this.f66237k = z4;
            m60825a(musicModel, str, z2, z3, i);
        }
    }
}
