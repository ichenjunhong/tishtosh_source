package com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar */
public final class VideoSeekBar extends LinearLayout {

    /* renamed from: a */
    public static final C31117a f81450a = new C31117a(null);

    /* renamed from: b */
    private OnTouchDraftSeekBar f81451b;

    /* renamed from: c */
    private SeekBar f81452c;

    /* renamed from: d */
    private ImageView f81453d;

    /* renamed from: e */
    private Float f81454e;

    /* renamed from: f */
    private C31119c f81455f;

    /* renamed from: g */
    private C31118b f81456g;

    /* renamed from: h */
    private int f81457h;

    /* renamed from: i */
    private int f81458i;

    /* renamed from: j */
    private float f81459j;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$a */
    public static final class C31117a {
        private C31117a() {
        }

        public /* synthetic */ C31117a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$b */
    public interface C31118b {
        /* renamed from: a */
        void mo63940a(MotionEvent motionEvent);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$c */
    public interface C31119c {
        /* renamed from: a */
        void mo63941a(SeekBar seekBar);

        /* renamed from: a */
        void mo63942a(SeekBar seekBar, int i, boolean z);

        /* renamed from: b */
        void mo63943b(SeekBar seekBar);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$d */
    public static final class C31120d implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ VideoSeekBar f81460a;

        C31120d(VideoSeekBar videoSeekBar) {
            this.f81460a = videoSeekBar;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            C31119c mOnSeekBarChangeListener = this.f81460a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.mo63941a(seekBar);
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            C31119c mOnSeekBarChangeListener = this.f81460a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.mo63943b(seekBar);
            }
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C31119c mOnSeekBarChangeListener = this.f81460a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.mo63942a(seekBar, i, z);
            }
        }
    }

    public final ImageView getCoverThumbImg() {
        return this.f81453d;
    }

    public final float getMFourDp() {
        return this.f81459j;
    }

    public final C31118b getMOnDispatchTouchEventListener() {
        return this.f81456g;
    }

    public final C31119c getMOnSeekBarChangeListener() {
        return this.f81455f;
    }

    public final Float getMProgress() {
        return this.f81454e;
    }

    public final int getMScreenWidth() {
        return this.f81458i;
    }

    public final int getTwoProgress() {
        return this.f81457h;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void setMFourDp(float f) {
        this.f81459j = f;
    }

    public final void setMOnDispatchTouchEventListener(C31118b bVar) {
        this.f81456g = bVar;
    }

    public final void setMOnSeekBarChangeListener(C31119c cVar) {
        this.f81455f = cVar;
    }

    public final void setMProgress(Float f) {
        this.f81454e = f;
    }

    public final void setMScreenWidth(int i) {
        this.f81458i = i;
    }

    public final void setTwoProgress(int i) {
        this.f81457h = i;
    }

    public VideoSeekBar(Context context) {
        this(context, null);
    }

    public final void setOnDispatchTouchEventListener(C31118b bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f81456g = bVar;
    }

    public final void setOnSeekBarChangeListener(C31119c cVar) {
        C52711k.m112240b(cVar, "listener");
        this.f81455f = cVar;
    }

    public final void setPauseStatus(boolean z) {
        OnTouchDraftSeekBar onTouchDraftSeekBar = this.f81451b;
        if (onTouchDraftSeekBar != null) {
            onTouchDraftSeekBar.setPauseStatus(z);
        }
    }

    public final void setSecondaryProgress(int i) {
        OnTouchDraftSeekBar onTouchDraftSeekBar = this.f81451b;
        if (onTouchDraftSeekBar != null) {
            onTouchDraftSeekBar.setSecondaryProgress(i);
        }
    }

    public final void setThumb(Drawable drawable) {
        OnTouchDraftSeekBar onTouchDraftSeekBar = this.f81451b;
        if (onTouchDraftSeekBar != null) {
            onTouchDraftSeekBar.setThumb(drawable);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        C31118b bVar = this.f81456g;
        if (bVar != null) {
            bVar.mo63940a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setProgress(float f) {
        LayoutParams layoutParams;
        this.f81454e = Float.valueOf(f);
        if (VERSION.SDK_INT >= 24) {
            OnTouchDraftSeekBar onTouchDraftSeekBar = this.f81451b;
            if (onTouchDraftSeekBar != null) {
                onTouchDraftSeekBar.setProgress((int) (f * 100.0f), false);
            }
        } else {
            OnTouchDraftSeekBar onTouchDraftSeekBar2 = this.f81451b;
            if (onTouchDraftSeekBar2 != null) {
                onTouchDraftSeekBar2.setProgress((int) (f * 100.0f));
            }
        }
        SeekBar seekBar = this.f81452c;
        if (seekBar != null) {
            seekBar.setProgress(this.f81457h);
        }
        float f2 = this.f81459j + ((((float) this.f81458i) - (this.f81459j * 2.0f)) * (f / 100.0f));
        ImageView imageView = this.f81453d;
        if (imageView != null) {
            layoutParams = imageView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (VERSION.SDK_INT > 16) {
                layoutParams2.setMarginStart(((int) f2) - ((int) this.f81459j));
            }
            layoutParams2.leftMargin = ((int) f2) - ((int) this.f81459j);
            ImageView imageView2 = this.f81453d;
            if (imageView2 != null) {
                imageView2.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public VideoSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|(1:11)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0077 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x007b A[Catch:{ Throwable -> 0x00a6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VideoSeekBar(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r3.<init>(r4, r5, r6)
            int r5 = com.bytedance.common.utility.C9432q.m18670a(r4)     // Catch:{ Throwable -> 0x00a6 }
            r3.f81458i = r5     // Catch:{ Throwable -> 0x00a6 }
            r5 = 1082130432(0x40800000, float:4.0)
            float r6 = com.bytedance.common.utility.C9432q.m18687b(r4, r5)     // Catch:{ Throwable -> 0x00a6 }
            r3.f81459j = r6     // Catch:{ Throwable -> 0x00a6 }
            r6 = 1176256512(0x461c4000, float:10000.0)
            float r0 = r3.f81459j     // Catch:{ Throwable -> 0x00a6 }
            int r1 = r3.f81458i     // Catch:{ Throwable -> 0x00a6 }
            float r1 = (float) r1     // Catch:{ Throwable -> 0x00a6 }
            float r0 = r0 / r1
            float r0 = r0 * r6
            int r6 = (int) r0     // Catch:{ Throwable -> 0x00a6 }
            r3.f81457h = r6     // Catch:{ Throwable -> 0x00a6 }
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r4)     // Catch:{ Throwable -> 0x00a6 }
            r0 = 2132214351(0x7f17024f, float:2.0072541E38)
            r1 = r3
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch:{ Throwable -> 0x00a6 }
            r2 = 1
            android.view.View r6 = r6.inflate(r0, r1, r2)     // Catch:{ Throwable -> 0x00a6 }
            r3.bringToFront()     // Catch:{ Throwable -> 0x00a6 }
            r0 = 2132022616(0x7f141558, float:1.9683657E38)
            android.view.View r0 = r6.findViewById(r0)     // Catch:{ Throwable -> 0x00a6 }
            com.ss.android.ugc.aweme.feed.ui.seekbar.OnTouchDraftSeekBar r0 = (com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.OnTouchDraftSeekBar) r0     // Catch:{ Throwable -> 0x00a6 }
            r3.f81451b = r0     // Catch:{ Throwable -> 0x00a6 }
            r0 = 2132022618(0x7f14155a, float:1.968366E38)
            android.view.View r0 = r6.findViewById(r0)     // Catch:{ Throwable -> 0x00a6 }
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0     // Catch:{ Throwable -> 0x00a6 }
            r3.f81452c = r0     // Catch:{ Throwable -> 0x00a6 }
            r0 = 2132022617(0x7f141559, float:1.9683659E38)
            android.view.View r6 = r6.findViewById(r0)     // Catch:{ Throwable -> 0x00a6 }
            android.widget.ImageView r6 = (android.widget.ImageView) r6     // Catch:{ Throwable -> 0x00a6 }
            r3.f81453d = r6     // Catch:{ Throwable -> 0x00a6 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x00a6 }
            r0 = 21
            if (r6 >= r0) goto L_0x0096
            java.lang.Class<android.widget.ProgressBar> r6 = android.widget.ProgressBar.class
            java.lang.String r0 = "mMaxHeight"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r0)     // Catch:{ Throwable -> 0x0077 }
            java.lang.String r0 = "declaredField"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)     // Catch:{ Throwable -> 0x0077 }
            r6.setAccessible(r2)     // Catch:{ Throwable -> 0x0077 }
            com.ss.android.ugc.aweme.feed.ui.seekbar.OnTouchDraftSeekBar r0 = r3.f81451b     // Catch:{ Throwable -> 0x0077 }
            r1 = 1090519040(0x41000000, float:8.0)
            float r1 = com.bytedance.common.utility.C9432q.m18687b(r4, r1)     // Catch:{ Throwable -> 0x0077 }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ Throwable -> 0x0077 }
            r6.set(r0, r1)     // Catch:{ Throwable -> 0x0077 }
        L_0x0077:
            com.ss.android.ugc.aweme.feed.ui.seekbar.OnTouchDraftSeekBar r6 = r3.f81451b     // Catch:{ Throwable -> 0x00a6 }
            if (r6 == 0) goto L_0x0096
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r4, r5)     // Catch:{ Throwable -> 0x00a6 }
            int r0 = (int) r0     // Catch:{ Throwable -> 0x00a6 }
            r1 = 1077936128(0x40400000, float:3.0)
            float r1 = com.bytedance.common.utility.C9432q.m18687b(r4, r1)     // Catch:{ Throwable -> 0x00a6 }
            int r1 = (int) r1     // Catch:{ Throwable -> 0x00a6 }
            float r5 = com.bytedance.common.utility.C9432q.m18687b(r4, r5)     // Catch:{ Throwable -> 0x00a6 }
            int r5 = (int) r5     // Catch:{ Throwable -> 0x00a6 }
            r2 = 1088421888(0x40e00000, float:7.0)
            float r4 = com.bytedance.common.utility.C9432q.m18687b(r4, r2)     // Catch:{ Throwable -> 0x00a6 }
            int r4 = (int) r4     // Catch:{ Throwable -> 0x00a6 }
            r6.setPadding(r0, r1, r5, r4)     // Catch:{ Throwable -> 0x00a6 }
        L_0x0096:
            com.ss.android.ugc.aweme.feed.ui.seekbar.OnTouchDraftSeekBar r4 = r3.f81451b     // Catch:{ Throwable -> 0x00a6 }
            if (r4 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$d r5 = new com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$d     // Catch:{ Throwable -> 0x00a6 }
            r5.<init>(r3)     // Catch:{ Throwable -> 0x00a6 }
            android.widget.SeekBar$OnSeekBarChangeListener r5 = (android.widget.SeekBar.OnSeekBarChangeListener) r5     // Catch:{ Throwable -> 0x00a6 }
            r4.setCustomOnSeekBarChangeListener(r5)     // Catch:{ Throwable -> 0x00a6 }
            goto L_0x00aa
        L_0x00a5:
            return
        L_0x00a6:
            r4 = move-exception
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r4)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.VideoSeekBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
