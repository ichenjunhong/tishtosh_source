package com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage;

import android.content.Context;
import android.view.MotionEvent;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.a */
public final class C26777a {

    /* renamed from: j */
    public static final C26778a f70522j = new C26778a(null);

    /* renamed from: a */
    public int f70523a;

    /* renamed from: b */
    public int f70524b;

    /* renamed from: c */
    public int f70525c;

    /* renamed from: d */
    public int f70526d;

    /* renamed from: e */
    public boolean f70527e;

    /* renamed from: f */
    public int f70528f;

    /* renamed from: g */
    public final Context f70529g;

    /* renamed from: h */
    public final AdPopUpWebBottomSheetContainer f70530h;

    /* renamed from: i */
    public int f70531i;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.a$a */
    public static final class C26778a {
        private C26778a() {
        }

        public /* synthetic */ C26778a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo54665a(AwemeRawAd awemeRawAd) {
        int i;
        if (awemeRawAd != null) {
            i = awemeRawAd.getWebviewType();
        } else {
            i = 0;
        }
        if (i == 1 && this.f70531i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo54666b(AwemeRawAd awemeRawAd) {
        int i;
        if (awemeRawAd != null) {
            i = awemeRawAd.getProfileWithWebview();
        } else {
            i = 0;
        }
        if (i == 1 && (this.f70528f == 7 || this.f70528f == 8 || this.f70531i == 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo54663a(int i) {
        this.f70523a = 0;
        this.f70524b = 0;
        this.f70527e = false;
        this.f70531i = i;
        switch (i) {
            case 1:
                return;
            case 2:
                this.f70523a = C23724k.m58221a(this.f70529g) - C23724k.m58225c();
                return;
            case 3:
                double a = (double) C23724k.m58221a(this.f70529g);
                Double.isNaN(a);
                this.f70523a = (int) (a * 0.7316341829085458d);
                this.f70524b = C23724k.m58221a(this.f70529g) - C23724k.m58225c();
                break;
        }
    }

    /* renamed from: a */
    public final void mo54664a(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        switch (this.f70531i) {
            case 1:
                return;
            case 2:
                this.f70523a = C23724k.m58221a(this.f70529g) - C23724k.m58225c();
                return;
            case 3:
                C52711k.m112240b(motionEvent, "event");
                if (!this.f70527e) {
                    switch (motionEvent.getAction()) {
                        case 0:
                            this.f70525c = (int) motionEvent.getX();
                            this.f70526d = (int) motionEvent.getY();
                            return;
                        case 1:
                            if (Math.abs(motionEvent.getX() - ((float) this.f70525c)) < 100.0f && Math.abs(motionEvent.getY() - ((float) this.f70526d)) < 100.0f) {
                                this.f70530h.mo54229a();
                                this.f70527e = true;
                                break;
                            }
                    }
                }
                break;
        }
    }

    private C26777a(Context context, AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(adPopUpWebBottomSheetContainer, "bottomSheetContainer");
        this.f70529g = context;
        this.f70530h = adPopUpWebBottomSheetContainer;
        this.f70531i = i;
        mo54663a(this.f70531i);
    }

    public /* synthetic */ C26777a(Context context, AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer, int i, int i2, C52707g gVar) {
        this(context, adPopUpWebBottomSheetContainer, 2);
    }
}
