package com.p683ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.C2240a;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.C43193b;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.DmtBubbleTextView.C43172a;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView.C43173a;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicLayout */
public final class DmtCutMusicLayout extends LinearLayout {

    /* renamed from: a */
    private DmtCutMusicScrollView f109157a;

    /* renamed from: b */
    private DmtBubbleTextView f109158b;

    /* renamed from: c */
    private final int f109159c;

    /* renamed from: d */
    private String f109160d;

    public DmtCutMusicLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public DmtCutMusicLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo87753a() {
        mo87754a(0.0f);
        setTimeBubble(0);
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f109157a;
        if (dmtCutMusicScrollView == null) {
            C52711k.m112237a("cutMusicScrollView");
        }
        dmtCutMusicScrollView.setScrollDx(0.0f);
    }

    /* renamed from: a */
    public final void mo87754a(float f) {
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f109157a;
        if (dmtCutMusicScrollView == null) {
            C52711k.m112237a("cutMusicScrollView");
        }
        dmtCutMusicScrollView.mo87761a(f);
    }

    public final void setAudioWaveViewData(C43203d dVar) {
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f109157a;
        if (dmtCutMusicScrollView == null) {
            C52711k.m112237a("cutMusicScrollView");
        }
        dmtCutMusicScrollView.setAudioWaveViewData(dVar);
    }

    public final void setBubbleText(String str) {
        DmtBubbleTextView dmtBubbleTextView = this.f109158b;
        if (dmtBubbleTextView == null) {
            C52711k.m112237a("bubbleTextView");
        }
        dmtBubbleTextView.setText(str);
    }

    public final void setBubbleTextViewAttrite(C43172a aVar) {
        C52711k.m112240b(aVar, "attrite");
        DmtBubbleTextView dmtBubbleTextView = this.f109158b;
        if (dmtBubbleTextView == null) {
            C52711k.m112237a("bubbleTextView");
        }
        dmtBubbleTextView.setAttribute(aVar);
    }

    public final void setScrollListener(C43173a aVar) {
        C52711k.m112240b(aVar, "scrollListener");
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f109157a;
        if (dmtCutMusicScrollView == null) {
            C52711k.m112237a("cutMusicScrollView");
        }
        dmtCutMusicScrollView.setScrollListener(aVar);
    }

    public final void setTimeBubble(int i) {
        String str = this.f109160d;
        if (str == null) {
            C52711k.m112237a("bubbleText");
        }
        String a = C2240a.m6772a(str, Arrays.copyOf(new Object[]{C43193b.m94754a((long) i)}, 1));
        C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
        setBubbleText(a);
    }

    /* renamed from: a */
    public final void mo87755a(float f, boolean z) {
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f109157a;
        if (dmtCutMusicScrollView == null) {
            C52711k.m112237a("cutMusicScrollView");
        }
        dmtCutMusicScrollView.mo87762a(f, z);
    }

    public DmtCutMusicLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843173}, i, 0);
        this.f109159c = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        setOrientation(1);
        DmtCutMusicScrollView dmtCutMusicScrollView = new DmtCutMusicScrollView(context, null, 0, 6, null);
        this.f109157a = dmtCutMusicScrollView;
        this.f109158b = new DmtBubbleTextView(context, null, 2, null);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.bottomMargin = (int) C9432q.m18687b(context, 8.0f);
        layoutParams.leftMargin = (int) C9432q.m18687b(context, 8.0f);
        layoutParams.gravity = 3;
        DmtBubbleTextView dmtBubbleTextView = this.f109158b;
        if (dmtBubbleTextView == null) {
            C52711k.m112237a("bubbleTextView");
        }
        dmtBubbleTextView.setLayoutParams(layoutParams);
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        DmtCutMusicScrollView dmtCutMusicScrollView2 = this.f109157a;
        if (dmtCutMusicScrollView2 == null) {
            C52711k.m112237a("cutMusicScrollView");
        }
        dmtCutMusicScrollView2.setLayoutParams(layoutParams2);
        DmtBubbleTextView dmtBubbleTextView2 = this.f109158b;
        if (dmtBubbleTextView2 == null) {
            C52711k.m112237a("bubbleTextView");
        }
        addView(dmtBubbleTextView2);
        DmtCutMusicScrollView dmtCutMusicScrollView3 = this.f109157a;
        if (dmtCutMusicScrollView3 == null) {
            C52711k.m112237a("cutMusicScrollView");
        }
        addView(dmtCutMusicScrollView3);
        DmtCutMusicScrollView dmtCutMusicScrollView4 = this.f109157a;
        if (dmtCutMusicScrollView4 == null) {
            C52711k.m112237a("cutMusicScrollView");
        }
        dmtCutMusicScrollView4.setWaveColor(this.f109159c);
        String string = getResources().getString(R.string.anj);
        C52711k.m112236a((Object) string, "resources.getString(R.string.cut_music_start_hint)");
        this.f109160d = string;
    }

    public /* synthetic */ DmtCutMusicLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
