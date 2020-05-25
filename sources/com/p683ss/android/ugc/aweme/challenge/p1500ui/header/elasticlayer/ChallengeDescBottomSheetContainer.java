package com.p683ss.android.ugc.aweme.challenge.p1500ui.header.elasticlayer;

import android.content.Context;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0497a;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.elasticlayer.ChallengeDescBottomSheetContainer */
public final class ChallengeDescBottomSheetContainer extends CoordinatorLayout {

    /* renamed from: h */
    BottomSheetBehavior<ChallengeDescBottomSheetContainer> f65327h;

    /* renamed from: i */
    private boolean f65328i;

    /* renamed from: j */
    private C24683b f65329j;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.elasticlayer.ChallengeDescBottomSheetContainer$a */
    public static final class C24682a extends C0497a {

        /* renamed from: a */
        final /* synthetic */ BottomSheetBehavior f65330a;

        /* renamed from: b */
        final /* synthetic */ ChallengeDescBottomSheetContainer f65331b;

        C24682a(BottomSheetBehavior bottomSheetBehavior, ChallengeDescBottomSheetContainer challengeDescBottomSheetContainer) {
            this.f65330a = bottomSheetBehavior;
            this.f65331b = challengeDescBottomSheetContainer;
        }

        /* renamed from: a */
        public final void mo1315a(View view, float f) {
            C52711k.m112240b(view, "bottomSheet");
            C24683b callback = this.f65331b.getCallback();
            if (callback != null) {
                callback.mo50563a(view, f);
            }
        }

        /* renamed from: a */
        public final void mo1316a(View view, int i) {
            C52711k.m112240b(view, "bottomSheet");
            if (i != 1) {
                switch (i) {
                    case 3:
                        C24683b callback = this.f65331b.getCallback();
                        if (callback != null) {
                            callback.mo50562a();
                        }
                        return;
                    case 4:
                        C24683b callback2 = this.f65331b.getCallback();
                        if (callback2 != null) {
                            callback2.mo50564b();
                            return;
                        }
                        break;
                }
            } else {
                if (!this.f65331b.getHideable()) {
                    this.f65330a.mo1301b(3);
                }
                if (this.f65331b.getCallback() == null) {
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.elasticlayer.ChallengeDescBottomSheetContainer$b */
    public interface C24683b {
        /* renamed from: a */
        void mo50562a();

        /* renamed from: a */
        void mo50563a(View view, float f);

        /* renamed from: b */
        void mo50564b();
    }

    public ChallengeDescBottomSheetContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public ChallengeDescBottomSheetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final BottomSheetBehavior<ChallengeDescBottomSheetContainer> getBehavior() {
        return this.f65327h;
    }

    public final C24683b getCallback() {
        return this.f65329j;
    }

    public final boolean getHideable() {
        return this.f65328i;
    }

    public final void setCallback(C24683b bVar) {
        this.f65329j = bVar;
    }

    public final void setHideable(boolean z) {
        this.f65328i = z;
    }

    public final void setBehavior(BottomSheetBehavior<ChallengeDescBottomSheetContainer> bottomSheetBehavior) {
        C52711k.m112240b(bottomSheetBehavior, "<set-?>");
        this.f65327h = bottomSheetBehavior;
    }

    public ChallengeDescBottomSheetContainer(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f65328i = true;
        BottomSheetBehavior<ChallengeDescBottomSheetContainer> bottomSheetBehavior = new BottomSheetBehavior<>();
        bottomSheetBehavior.f1646q = new C24682a(bottomSheetBehavior, this);
        this.f65328i = true;
        bottomSheetBehavior.mo1296a(0);
        this.f65327h = bottomSheetBehavior;
    }

    public /* synthetic */ ChallengeDescBottomSheetContainer(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
