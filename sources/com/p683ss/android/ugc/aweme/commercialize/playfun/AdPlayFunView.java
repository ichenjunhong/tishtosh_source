package com.p683ss.android.ugc.aweme.commercialize.playfun;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12200n;
import com.bytedance.lighten.p766a.p769c.C12168c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.playfun.p1577a.C26166g;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26325a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26325a.C26326a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26348d;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26357e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView */
public final class AdPlayFunView extends FrameLayout implements OnTouchListener {

    /* renamed from: a */
    public SmartImageView f69055a;

    /* renamed from: b */
    public DmtTextView f69056b;

    /* renamed from: c */
    public C26173f f69057c;

    /* renamed from: d */
    public DataCenter f69058d;

    /* renamed from: e */
    public boolean f69059e;

    /* renamed from: f */
    public Aweme f69060f;

    /* renamed from: g */
    public AwemePlayFunModel f69061g;

    /* renamed from: h */
    public final C26153b f69062h;

    /* renamed from: i */
    private C26171d f69063i;

    /* renamed from: j */
    private View f69064j;

    /* renamed from: k */
    private final C26152a f69065k;

    /* renamed from: l */
    private final GestureDetector f69066l;

    /* renamed from: m */
    private final OnLayoutChangeListener f69067m;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView$a */
    public static final class C26152a extends SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ AdPlayFunView f69068a;

        C26152a(AdPlayFunView adPlayFunView) {
            this.f69068a = adPlayFunView;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return AdPlayFunView.m63413a(this.f69068a).mo53802b();
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            String str;
            long j;
            AdPlayFunView adPlayFunView = this.f69068a;
            Aweme aweme = adPlayFunView.f69060f;
            if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                Aweme aweme2 = adPlayFunView.f69060f;
                if (aweme2 == null) {
                    C52711k.m112234a();
                }
                AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                if (awemeRawAd == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) awemeRawAd, "aweme!!.awemeRawAd!!");
                C26173f fVar = adPlayFunView.f69057c;
                if (fVar == null) {
                    C52711k.m112237a("stateContext");
                }
                if (C52711k.m112239a((Object) fVar.f69113b, (Object) "EggShowState")) {
                    str = "egg";
                } else {
                    str = "hanging";
                }
                Context context = adPlayFunView.getContext();
                Aweme aweme3 = adPlayFunView.f69060f;
                C26088l.m63322b(context, "click", aweme3, C26088l.m63377o(context, aweme3, str));
                C26326a f = new C26326a().mo54021a(adPlayFunView.f69060f).mo54030c(awemeRawAd.getOpenUrl()).mo54039g(awemeRawAd.getMicroAppUrl()).mo54022a(new C36961a().mo76225e(C26357e.m63795a(awemeRawAd.getOpenUrl())).mo76221a()).mo54035e(awemeRawAd.getWebUrl()).mo54037f(awemeRawAd.getWebTitle());
                Long creativeId = awemeRawAd.getCreativeId();
                long j2 = 0;
                if (creativeId != null) {
                    j = creativeId.longValue();
                } else {
                    j = 0;
                }
                C26326a b = f.mo54020a(j).mo54027b(awemeRawAd.getLogExtra());
                Long groupId = awemeRawAd.getGroupId();
                if (groupId != null) {
                    j2 = groupId.longValue();
                }
                C26325a aVar = b.mo54026b(j2).mo54040h("result_ad").mo54041i("fancy").f69476a;
                Context context2 = adPlayFunView.getContext();
                C52711k.m112236a((Object) context2, "context");
                C26348d.m63784a(context2, aVar).mo54089a();
            }
            return AdPlayFunView.m63413a(this.f69068a).mo53802b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView$b */
    public static final class C26153b extends C12168c {

        /* renamed from: a */
        final /* synthetic */ AdPlayFunView f69069a;

        /* renamed from: b */
        final /* synthetic */ Context f69070b;

        C26153b(AdPlayFunView adPlayFunView, Context context) {
            this.f69069a = adPlayFunView;
            this.f69070b = context;
        }

        /* renamed from: a */
        public final void mo23095a(Uri uri, View view, Throwable th) {
            if (view != null) {
                this.f69069a.setVisibility(8);
                if (this.f69069a.f69060f != null) {
                    Context context = this.f69070b;
                    Aweme aweme = this.f69069a.f69060f;
                    C26088l.m63322b(context, "othershow_fail", aweme, C26088l.m63377o(context, aweme, ""));
                    C26169c.f69100a.mo53793a(this.f69069a.f69060f, false, "display", null, null);
                }
            }
        }

        /* renamed from: a */
        public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
            if (view != null) {
                if (C26512f.m64109K(this.f69069a.f69060f) && this.f69069a.f69059e) {
                    C26173f a = AdPlayFunView.m63413a(this.f69069a);
                    a.f69113b = "IdleState";
                    C26172e eVar = (C26172e) a.f69120i.get(a.f69113b);
                    if (eVar != null) {
                        eVar.mo53778a();
                    }
                }
                C26169c.f69100a.mo53793a(this.f69069a.f69060f, true, "display", null, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView$c */
    static final class C26154c implements OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ AdPlayFunView f69071a;

        C26154c(AdPlayFunView adPlayFunView) {
            this.f69071a = adPlayFunView;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C26173f a = AdPlayFunView.m63413a(this.f69071a);
            if (C52711k.m112239a((Object) a.f69113b, (Object) "WidgetShowState")) {
                Object obj = a.f69120i.get("WidgetShowState");
                if (!(obj instanceof C26166g)) {
                    obj = null;
                }
                C26166g gVar = (C26166g) obj;
                if (gVar != null && gVar.f69111b.f69119h) {
                    gVar.f69084c = C26155a.m63418a(gVar.f69111b.f69116e, gVar.f69111b.mo53803c().y);
                    Animator animator = gVar.f69084c;
                    if (animator != null) {
                        animator.start();
                    }
                }
            }
        }
    }

    public AdPlayFunView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdPlayFunView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C26173f fVar = this.f69057c;
        if (fVar == null) {
            C52711k.m112237a("stateContext");
        }
        fVar.mo53798a();
        View view = this.f69064j;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f69067m);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent != null) {
            this.f69064j = ((ViewGroup) parent).findViewById(R.id.id);
            View view = this.f69064j;
            if (view != null) {
                view.addOnLayoutChangeListener(this.f69067m);
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        float f;
        super.onFinishInflate();
        C26171d dVar = new C26171d();
        int a = C9432q.m18670a(getContext());
        int b = C9432q.m18688b(getContext());
        float f2 = (float) a;
        dVar.f69106a = (int) (0.587f * f2);
        if (a > 720 || b > 1280) {
            f = 0.2065f;
        } else {
            dVar.f69106a = (int) (((float) dVar.f69106a) * 0.68f);
            f = 0.30042f;
        }
        float f3 = 0.247f;
        if (a >= 1080 && b >= 2340) {
            f3 = 0.26049998f;
        }
        dVar.f69108c = f * f2;
        dVar.f69107b = f3 * ((float) b);
        dVar.f69109d = C9432q.m18687b(getContext(), 86.0f) / ((float) dVar.f69106a);
        this.f69063i = dVar;
        C26171d dVar2 = this.f69063i;
        if (dVar2 == null) {
            C52711k.m112237a("playFunParam");
        }
        this.f69057c = new C26173f(this, dVar2);
        View findViewById = findViewById(R.id.dx6);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.ad_play_fun_egg_image)");
        this.f69055a = (SmartImageView) findViewById;
        View findViewById2 = findViewById(R.id.dx7);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.ad_play_fun_egg_title)");
        this.f69056b = (DmtTextView) findViewById2;
        SmartImageView smartImageView = this.f69055a;
        if (smartImageView == null) {
            C52711k.m112237a("eggImageView");
        }
        OnTouchListener onTouchListener = this;
        smartImageView.setOnTouchListener(onTouchListener);
        DmtTextView dmtTextView = this.f69056b;
        if (dmtTextView == null) {
            C52711k.m112237a("eggTitleView");
        }
        dmtTextView.setOnTouchListener(onTouchListener);
        SmartImageView smartImageView2 = this.f69055a;
        if (smartImageView2 == null) {
            C52711k.m112237a("eggImageView");
        }
        LayoutParams layoutParams = smartImageView2.getLayoutParams();
        C26171d dVar3 = this.f69063i;
        if (dVar3 == null) {
            C52711k.m112237a("playFunParam");
        }
        layoutParams.width = dVar3.f69106a;
        layoutParams.height = layoutParams.width;
        SmartImageView smartImageView3 = this.f69055a;
        if (smartImageView3 == null) {
            C52711k.m112237a("eggImageView");
        }
        smartImageView3.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static final /* synthetic */ C26173f m63413a(AdPlayFunView adPlayFunView) {
        C26173f fVar = adPlayFunView.f69057c;
        if (fVar == null) {
            C52711k.m112237a("stateContext");
        }
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53768a(com.p683ss.android.ugc.aweme.feed.model.Aweme r2) {
        /*
            r1 = this;
            r1.f69060f = r2
            if (r2 == 0) goto L_0x000f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x000f
            com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel r2 = r2.getPlayFunModel()
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            r1.f69061g = r2
            com.ss.android.ugc.aweme.commercialize.playfun.f r2 = r1.f69057c
            if (r2 != 0) goto L_0x001b
            java.lang.String r0 = "stateContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x001b:
            com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel r0 = r1.f69061g
            r2.f69114c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView.mo53768a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: a */
    public final void mo53769a(boolean z) {
        C26173f fVar = this.f69057c;
        if (fVar == null) {
            C52711k.m112237a("stateContext");
        }
        fVar.f69119h = z;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f69066l.onTouchEvent(motionEvent);
    }

    public AdPlayFunView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f69065k = new C26152a(this);
        this.f69066l = new GestureDetector(context, this.f69065k);
        this.f69067m = new C26154c(this);
        this.f69062h = new C26153b(this, context);
    }

    public /* synthetic */ AdPlayFunView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
