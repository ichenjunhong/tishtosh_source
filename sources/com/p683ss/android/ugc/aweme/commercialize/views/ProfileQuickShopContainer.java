package com.p683ss.android.ugc.aweme.commercialize.views;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.QuickShopLoadingPage;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47881fd;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52668f;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer */
public final class ProfileQuickShopContainer extends FrameLayout implements C0183j {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f70171a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ProfileQuickShopContainer.class), "mRootView", "getMRootView()Landroid/widget/FrameLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ProfileQuickShopContainer.class), "mWebView", "getMWebView()Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ProfileQuickShopContainer.class), "mCloseBtn", "getMCloseBtn()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ProfileQuickShopContainer.class), "mShareBtn", "getMShareBtn()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ProfileQuickShopContainer.class), "mLoadingView", "getMLoadingView()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ProfileQuickShopContainer.class), "mLoadingBgView", "getMLoadingBgView()Lcom/bytedance/lighten/loader/SmartImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ProfileQuickShopContainer.class), "mLoadingStatusView", "getMLoadingStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ProfileQuickShopContainer.class), "mLoadingTextView", "getMLoadingTextView()Lcom/bytedance/lighten/loader/SmartImageView;"))};

    /* renamed from: c */
    public static final C26639a f70172c = new C26639a(null);

    /* renamed from: b */
    public ValueAnimator f70173b;

    /* renamed from: d */
    private final C52668f f70174d;

    /* renamed from: e */
    private final C52668f f70175e;

    /* renamed from: f */
    private final C52668f f70176f;

    /* renamed from: g */
    private final C52668f f70177g;

    /* renamed from: h */
    private final C52668f f70178h;

    /* renamed from: i */
    private final C52668f f70179i;

    /* renamed from: j */
    private final C52668f f70180j;

    /* renamed from: k */
    private final C52668f f70181k;

    /* renamed from: l */
    private CommercializeWebViewHelper f70182l;

    /* renamed from: m */
    private User f70183m;

    /* renamed from: n */
    private AnimatorSet f70184n;

    /* renamed from: o */
    private ValueAnimator f70185o;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$a */
    public static final class C26639a {
        private C26639a() {
        }

        public /* synthetic */ C26639a(C52707g gVar) {
            this();
        }
    }

    private final ImageView getMCloseBtn() {
        return (ImageView) this.f70176f.getValue();
    }

    private final SmartImageView getMLoadingBgView() {
        return (SmartImageView) this.f70179i.getValue();
    }

    private final SmartImageView getMLoadingTextView() {
        return (SmartImageView) this.f70181k.getValue();
    }

    private final ImageView getMShareBtn() {
        return (ImageView) this.f70177g.getValue();
    }

    public final CommercializeWebViewHelper getCommercializeWebViewHelper() {
        return this.f70182l;
    }

    public final DmtStatusView getMLoadingStatusView() {
        return (DmtStatusView) this.f70180j.getValue();
    }

    public final View getMLoadingView() {
        return (View) this.f70178h.getValue();
    }

    public final FrameLayout getMRootView() {
        return (FrameLayout) this.f70174d.getValue();
    }

    public final CrossPlatformWebView getMWebView() {
        return (CrossPlatformWebView) this.f70175e.getValue();
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void onCreate() {
        C47718bf.m103290c(this);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C47718bf.m103291d(this);
    }

    private final int getScreenHeight() {
        return C23724k.m58221a(getContext());
    }

    private final String getLoadingBackgroundUrl() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            QuickShopLoadingPage quickShopLoadingPage = b.getQuickShopLoadingPage();
            if (quickShopLoadingPage != null) {
                return quickShopLoadingPage.getBackgroundUrl();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private final String getLoadingTextPicUrl() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            QuickShopLoadingPage quickShopLoadingPage = b.getQuickShopLoadingPage();
            if (quickShopLoadingPage != null) {
                return quickShopLoadingPage.getTextPicUrl();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getUrl() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.f70183m
            if (r0 == 0) goto L_0x000f
            com.ss.android.ugc.aweme.profile.model.QuickShopInfo r0 = r0.getQuickShopInfo()
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = r0.getQuickShopUrl()
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0028
            java.lang.String r1 = "sslocal://showcaseh5"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x0028
            java.lang.String r1 = "url="
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x0028
            r1 = 1
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            if (r1 == 0) goto L_0x0035
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = "url"
            java.lang.String r0 = r0.getQueryParameter(r1)
        L_0x0035:
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = ""
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer.getUrl():java.lang.String");
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f70184n;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.f70184n;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            AnimatorSet animatorSet3 = this.f70184n;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            this.f70184n = null;
        }
        ValueAnimator valueAnimator = this.f70185o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.f70185o;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
            }
            ValueAnimator valueAnimator3 = this.f70185o;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            this.f70185o = null;
        }
        ValueAnimator valueAnimator4 = this.f70173b;
        if (valueAnimator4 != null && valueAnimator4.isRunning()) {
            ValueAnimator valueAnimator5 = this.f70173b;
            if (valueAnimator5 != null) {
                valueAnimator5.removeAllListeners();
            }
            ValueAnimator valueAnimator6 = this.f70173b;
            if (valueAnimator6 != null) {
                valueAnimator6.cancel();
            }
            this.f70173b = null;
        }
    }

    public final void setCommercializeWebViewHelper(CommercializeWebViewHelper commercializeWebViewHelper) {
        this.f70182l = commercializeWebViewHelper;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    @C53771m
    public final void onEvent(C35471h hVar) {
        C52711k.m112240b(hVar, "event");
        if (TextUtils.equals("web", hVar.itemType)) {
            C47881fd.m103578a(getContext(), getMRootView(), hVar);
        }
    }
}
