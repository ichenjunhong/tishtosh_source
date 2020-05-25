package com.p683ss.android.ugc.aweme.shortvideo.cutmusic;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import butterknife.ButterKnife;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43188c.C43189a;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.C43193b;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView.C43173a;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView.C43179a;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView.C43180b;
import com.p683ss.android.ugc.aweme.utils.C47902fv;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.a */
public final class C43186a implements C43179a, C43180b, C43188c {

    /* renamed from: a */
    private View f109198a;

    /* renamed from: b */
    private FrameLayout f109199b;

    /* renamed from: c */
    private MusicDragView f109200c;

    /* renamed from: d */
    private C43189a f109201d;

    /* renamed from: e */
    private C43203d f109202e;

    /* renamed from: a */
    public final boolean mo87788a() {
        if (this.f109198a == null) {
            return false;
        }
        this.f109199b.removeView(this.f109198a);
        this.f109198a = null;
        return true;
    }

    /* renamed from: a */
    public final void mo87787a(C43203d dVar) {
        this.f109202e = dVar;
    }

    /* renamed from: b */
    public final void mo87776b(int i) {
        this.f109201d.mo87794h_(i);
    }

    /* renamed from: c */
    public final void mo87775c(int i) {
        mo87788a();
        this.f109201d.mo87795i_(i);
    }

    /* renamed from: a */
    public final void mo87785a(int i) {
        if (this.f109200c != null) {
            MusicDragView musicDragView = this.f109200c;
            if (musicDragView.cutMusicLayout != null && musicDragView.cutMusicLayout.getVisibility() == 0) {
                musicDragView.cutMusicLayout.mo87755a((((float) i) * 1.0f) / ((float) musicDragView.f109175e), false);
            }
        }
    }

    public C43186a(FrameLayout frameLayout, C43189a aVar) {
        this.f109199b = frameLayout;
        this.f109201d = aVar;
    }

    /* renamed from: a */
    public final void mo87786a(int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        this.f109198a = LayoutInflater.from(this.f109199b.getContext()).inflate(R.layout.ag6, this.f109199b, false);
        this.f109199b.addView(this.f109198a);
        View view = this.f109198a;
        MusicDragView musicDragView = new MusicDragView();
        musicDragView.f109173c = i4;
        musicDragView.f109174d = i6;
        musicDragView.f109175e = i5;
        musicDragView.f109172b = view;
        ButterKnife.bind((Object) musicDragView, musicDragView.f109172b);
        musicDragView.mTextViewTotalTime.setText(C47902fv.m103621a(musicDragView.f109175e));
        musicDragView.mTextViewTimeStart.setText(musicDragView.mTimeString);
        musicDragView.f109171a = new ImageView(musicDragView.f109172b.getContext());
        musicDragView.f109171a.setImageResource(R.drawable.a1n);
        musicDragView.f109171a.setScaleType(ScaleType.FIT_XY);
        musicDragView.slideContainer.addView(musicDragView.f109171a);
        musicDragView.f109171a.setX(musicDragView.mKTVView.getX() - ((float) (musicDragView.f109171a.getWidth() / 2)));
        musicDragView.mKTVView.setLength(musicDragView.mo87771a());
        musicDragView.f109171a.setOnTouchListener(musicDragView);
        musicDragView.cutMusicLayout.setBubbleTextViewAttrite(C43193b.m94752a(musicDragView.cutMusicLayout.getContext()));
        musicDragView.cutMusicLayout.setScrollListener(new C43173a() {
            /* renamed from: b */
            public final void mo87769b(float f) {
                MusicDragView.this.cutMusicLayout.setTimeBubble((int) (f * ((float) MusicDragView.this.f109175e)));
            }

            /* renamed from: a */
            public final void mo87768a(float f) {
                MusicDragView.this.f109174d = (int) (f * ((float) MusicDragView.this.f109175e));
                if (MusicDragView.this.f109178h != null) {
                    MusicDragView.this.f109178h.mo87776b(MusicDragView.this.f109174d);
                }
            }
        });
        musicDragView.cutMusicLayout.mo87754a((((float) musicDragView.f109174d) * 1.0f) / ((float) musicDragView.f109175e));
        musicDragView.cutMusicLayout.setTimeBubble(musicDragView.f109174d);
        musicDragView.f109172b.bringToFront();
        if (musicDragView.f109175e > musicDragView.f109173c && musicDragView.f109175e < musicDragView.f109173c + 1000) {
            musicDragView.f109176f = true;
        }
        musicDragView.getClass();
        view.post(new C43190d(musicDragView));
        if (musicDragView.f109178h != null) {
            musicDragView.f109178h.mo87776b(i6);
        }
        musicDragView.f109177g = this;
        musicDragView.f109178h = this;
        this.f109200c = musicDragView;
        if (this.f109202e != null) {
            MusicDragView musicDragView2 = this.f109200c;
            C43203d a = C43191e.m94742a(this.f109202e);
            C43191e.m94739a().mo87799a(a, (long) i4, (long) i5);
            C43191e.m94745b(a);
            if (a == null || musicDragView2.cutMusicLayout == null) {
                musicDragView2.mo87772a(true);
            } else {
                musicDragView2.mo87772a(false);
                musicDragView2.cutMusicLayout.setAudioWaveViewData(a);
            }
        }
        this.f109198a.setAlpha(0.0f);
        this.f109198a.animate().alpha(1.0f).setDuration(200).start();
    }
}
