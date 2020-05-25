package com.p683ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.C2442f;
import com.airbnb.lottie.C2475k;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.fresco.animation.p947a.C13857a;
import com.facebook.fresco.animation.p952c.C13877a;
import com.facebook.fresco.animation.p952c.C13882b;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.agilelogger.C18778a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26515i;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26515i.C26517a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.ItemLikeEggData;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.C18974c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.splash.C45699k.C45702a;
import com.p683ss.android.ugc.aweme.util.C47625i;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout */
public final class CommerceLikeLayout extends FrameLayout {

    /* renamed from: d */
    public static final C26616a f70108d = new C26616a(null);

    /* renamed from: a */
    public ItemLikeEggData f70109a;

    /* renamed from: b */
    public final AtomicBoolean f70110b;

    /* renamed from: c */
    public C2408e f70111c;

    /* renamed from: e */
    private AnimationImageView f70112e;

    /* renamed from: f */
    private AnimationImageView f70113f;

    /* renamed from: g */
    private SimpleDraweeView f70114g;

    /* renamed from: h */
    private String f70115h;

    /* renamed from: i */
    private Aweme f70116i;

    /* renamed from: j */
    private long f70117j;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout$a */
    public static final class C26616a {
        private C26616a() {
        }

        public /* synthetic */ C26616a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout$b */
    public static final class C26617b extends C13790c<C14045f> {

        /* renamed from: a */
        final /* synthetic */ CommerceLikeLayout f70118a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout$b$a */
        public static final class C26618a implements C13882b {

            /* renamed from: a */
            final /* synthetic */ C26617b f70119a;

            /* renamed from: a */
            public final void mo26041a(C13877a aVar, int i) {
                C52711k.m112240b(aVar, "drawable");
            }

            /* renamed from: c */
            public final void mo26043c(C13877a aVar) {
                C52711k.m112240b(aVar, "drawable");
            }

            C26618a(C26617b bVar) {
                this.f70119a = bVar;
            }

            /* renamed from: a */
            public final void mo26040a(C13877a aVar) {
                C52711k.m112240b(aVar, "drawable");
                this.f70119a.f70118a.mo54400b();
            }

            /* renamed from: b */
            public final void mo26042b(C13877a aVar) {
                C52711k.m112240b(aVar, "drawable");
                aVar.setAlpha(0);
            }
        }

        C26617b(CommerceLikeLayout commerceLikeLayout) {
            this.f70118a = commerceLikeLayout;
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            if (animatable != null) {
                try {
                    if (animatable instanceof C13877a) {
                        C13877a aVar = (C13877a) animatable;
                        aVar.mo26024a((C13857a) new C45702a(aVar.f36202d, 1));
                        aVar.mo26025a((C13882b) new C26618a(this));
                        animatable.start();
                    }
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("frescoOpenGifSplashError: e = ");
                    sb.append(th);
                    C47625i.m103103a(sb.toString());
                    C32458a.m75148a(th);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout$c */
    public static final class C26619c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AnimationImageView f70120a;

        C26619c(AnimationImageView animationImageView) {
            this.f70120a = animationImageView;
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f70120a.setLayerType(0, null);
            this.f70120a.setVisibility(8);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f70120a.setLayerType(0, null);
            this.f70120a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout$d */
    static final class C26620d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ CommerceLikeLayout f70121a;

        /* renamed from: b */
        final /* synthetic */ String f70122b;

        C26620d(CommerceLikeLayout commerceLikeLayout, String str) {
            this.f70121a = commerceLikeLayout;
            this.f70122b = str;
        }

        public final /* synthetic */ Object call() {
            if (TextUtils.isEmpty(this.f70122b)) {
                this.f70121a.f70110b.set(false);
            } else if (C26515i.m64159a(Uri.parse(this.f70122b))) {
                this.f70121a.f70110b.set(true);
            } else {
                C26515i.m64158a(this.f70122b, (C26517a) new C26517a(this) {

                    /* renamed from: a */
                    final /* synthetic */ C26620d f70123a;

                    public final void onFailureImpl() {
                        this.f70123a.f70121a.f70110b.set(false);
                    }

                    public final void onNewResultImpl() {
                        this.f70123a.f70121a.f70110b.set(true);
                    }

                    {
                        this.f70123a = r1;
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout$e */
    static final class C26622e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommerceLikeLayout f70124a;

        C26622e(CommerceLikeLayout commerceLikeLayout) {
            this.f70124a = commerceLikeLayout;
        }

        public final void run() {
            String str;
            try {
                StringBuilder sb = new StringBuilder("CommerceLikeLayout:setCommerceDigg url = ");
                ItemLikeEggData itemLikeEggData = this.f70124a.f70109a;
                String str2 = null;
                if (itemLikeEggData != null) {
                    str = itemLikeEggData.getMaterialUrl();
                } else {
                    str = null;
                }
                sb.append(str);
                C32458a.m75144a(sb.toString());
                Context context = this.f70124a.getContext();
                ItemLikeEggData itemLikeEggData2 = this.f70124a.f70109a;
                if (itemLikeEggData2 != null) {
                    str2 = itemLikeEggData2.getMaterialUrl();
                }
                final C2475k b = C2442f.m7139b(context, str2);
                C52711k.m112236a((Object) b, "task");
                if (b.f7661b == null && b.f7660a != null) {
                    C18842a.m45934b(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C26622e f70125a;

                        {
                            this.f70125a = r1;
                        }

                        public final void run() {
                            this.f70125a.f70124a.f70110b.set(true);
                            CommerceLikeLayout commerceLikeLayout = this.f70125a.f70124a;
                            C2475k kVar = b;
                            C52711k.m112236a((Object) kVar, "task");
                            commerceLikeLayout.f70111c = (C2408e) kVar.f7660a;
                        }
                    });
                }
            } catch (Exception e) {
                C32458a.m75148a((Throwable) new C18974c(e));
            }
        }
    }

    public CommerceLikeLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommerceLikeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C13790c<C14045f> getControllerListener() {
        return new C26617b<>(this);
    }

    /* renamed from: d */
    private final void m64438d() {
        if (this.f70114g != null) {
            SimpleDraweeView simpleDraweeView = this.f70114g;
            if (simpleDraweeView != null) {
                simpleDraweeView.setVisibility(8);
            }
            this.f70114g = null;
        }
    }

    /* renamed from: c */
    private final void m64437c() {
        AnimationImageView animationImageView = this.f70112e;
        if (animationImageView != null) {
            animationImageView.mo6661f();
        }
        AnimationImageView animationImageView2 = this.f70113f;
        if (animationImageView2 != null) {
            animationImageView2.mo6661f();
        }
        this.f70112e = null;
        this.f70113f = null;
    }

    private final LayoutParams getImageLayout() {
        Resources resources = getResources();
        C52711k.m112236a((Object) resources, "resources");
        double d = (double) resources.getDisplayMetrics().widthPixels;
        Double.isNaN(d);
        double d2 = d * 0.64d;
        Resources resources2 = getResources();
        C52711k.m112236a((Object) resources2, "resources");
        double d3 = (double) resources2.getDisplayMetrics().heightPixels;
        Double.isNaN(d3);
        LayoutParams layoutParams = new LayoutParams((int) d2, (int) (d3 * 0.64d));
        layoutParams.gravity = 17;
        return layoutParams;
    }

    /* renamed from: b */
    public final void mo54400b() {
        String str;
        String str2 = "show_egg_ad";
        C23089d a = C23089d.m56640a().mo47829a("enter_from", this.f70115h);
        String str3 = "group_id";
        Aweme aweme = this.f70116i;
        String str4 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C23089d a2 = a.mo47829a(str3, str);
        String str5 = "author_id";
        Aweme aweme2 = this.f70116i;
        if (aweme2 != null) {
            User author = aweme2.getAuthor();
            if (author != null) {
                str4 = author.getUid();
            }
        }
        C26890h.m65011a(str2, a2.mo47829a(str5, str4).f61491a);
    }

    /* renamed from: e */
    private final void m64439e() {
        String str;
        ItemLikeEggData itemLikeEggData = this.f70109a;
        Animatable animatable = null;
        if (itemLikeEggData != null) {
            str = itemLikeEggData.getMaterialUrl();
        } else {
            str = null;
        }
        if (C23515d.m57680a(Uri.parse(str))) {
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            m64435b(context);
            if (this.f70114g != null) {
                SimpleDraweeView simpleDraweeView = this.f70114g;
                if (simpleDraweeView != null) {
                    C13842a controller = simpleDraweeView.getController();
                    if (controller != null) {
                        animatable = controller.mo25749i();
                    }
                }
                if (animatable != null && !animatable.isRunning()) {
                    animatable.start();
                }
            }
        } else {
            m64441g();
        }
    }

    /* renamed from: g */
    private final void m64441g() {
        String str;
        String str2 = "show_egg_ad_fail";
        C23089d a = C23089d.m56640a().mo47829a("fail_type", "load_fail").mo47829a("enter_from", this.f70115h);
        String str3 = "group_id";
        Aweme aweme = this.f70116i;
        String str4 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C23089d a2 = a.mo47829a(str3, str);
        String str5 = "author_id";
        Aweme aweme2 = this.f70116i;
        if (aweme2 != null) {
            User author = aweme2.getAuthor();
            if (author != null) {
                str4 = author.getUid();
            }
        }
        C26890h.m65011a(str2, a2.mo47829a(str5, str4).f61491a);
    }

    /* renamed from: a */
    public final void mo54398a() {
        String str;
        removeAllViews();
        if (m64434a(this.f70109a)) {
            ItemLikeEggData itemLikeEggData = this.f70109a;
            if (itemLikeEggData != null) {
                str = itemLikeEggData.getFileType();
            } else {
                str = null;
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 102340) {
                    if (hashCode != 120609) {
                        if (hashCode == 3645340 && str.equals("webp")) {
                            m64438d();
                        }
                    } else if (str.equals("zip")) {
                        m64437c();
                    }
                } else if (str.equals("gif")) {
                    m64438d();
                }
            }
        }
        this.f70110b.set(false);
    }

    /* renamed from: f */
    private final void m64440f() {
        boolean z;
        CommerceLikeLayout commerceLikeLayout;
        if (this.f70111c != null) {
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            m64432a(context);
            if (this.f70117j == 0 || System.currentTimeMillis() - this.f70117j > 800) {
                if (this.f70112e == null || this.f70113f == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    commerceLikeLayout = this;
                } else {
                    commerceLikeLayout = null;
                }
                if (commerceLikeLayout != null) {
                    AnimationImageView animationImageView = this.f70112e;
                    if (animationImageView == null) {
                        C52711k.m112234a();
                    }
                    if (!animationImageView.mo6660e()) {
                        AnimationImageView animationImageView2 = this.f70112e;
                        if (animationImageView2 != null) {
                            animationImageView2.setVisibility(0);
                        }
                        AnimationImageView animationImageView3 = this.f70112e;
                        if (animationImageView3 != null) {
                            C2408e eVar = this.f70111c;
                            if (eVar == null) {
                                C52711k.m112234a();
                            }
                            animationImageView3.setComposition(eVar);
                        }
                        AnimationImageView animationImageView4 = this.f70112e;
                        if (animationImageView4 != null) {
                            animationImageView4.mo6654b();
                        }
                        mo54400b();
                        this.f70117j = System.currentTimeMillis();
                    } else {
                        AnimationImageView animationImageView5 = this.f70113f;
                        if (animationImageView5 == null) {
                            C52711k.m112234a();
                        }
                        if (!animationImageView5.mo6660e()) {
                            AnimationImageView animationImageView6 = this.f70113f;
                            if (animationImageView6 != null) {
                                animationImageView6.setVisibility(0);
                            }
                            AnimationImageView animationImageView7 = this.f70113f;
                            if (animationImageView7 != null) {
                                C2408e eVar2 = this.f70111c;
                                if (eVar2 == null) {
                                    C52711k.m112234a();
                                }
                                animationImageView7.setComposition(eVar2);
                            }
                            AnimationImageView animationImageView8 = this.f70113f;
                            if (animationImageView8 != null) {
                                animationImageView8.mo6654b();
                            }
                            mo54400b();
                            this.f70117j = System.currentTimeMillis();
                        }
                    }
                }
            }
        } else {
            m64441g();
        }
    }

    /* renamed from: a */
    private void m64433a(String str) {
        C0013i.m16a((Callable<TResult>) new C26620d<TResult>(this, str));
    }

    /* renamed from: a */
    private static boolean m64434a(ItemLikeEggData itemLikeEggData) {
        if (itemLikeEggData != null && !TextUtils.isEmpty(itemLikeEggData.getFileType()) && !TextUtils.isEmpty(itemLikeEggData.getMaterialUrl())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static AnimationImageView m64436c(Context context) {
        AnimationImageView animationImageView = new AnimationImageView(context);
        animationImageView.setScaleType(ScaleType.CENTER_CROP);
        animationImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        animationImageView.mo6652a((AnimatorListener) new C26619c(animationImageView));
        return animationImageView;
    }

    /* renamed from: a */
    private final void m64432a(Context context) {
        if (this.f70112e == null) {
            this.f70112e = m64436c(context);
            addView(this.f70112e);
        }
        if (this.f70113f == null) {
            this.f70113f = m64436c(context);
            addView(this.f70113f);
        }
    }

    /* renamed from: b */
    private final void m64435b(Context context) {
        String str;
        if (this.f70114g == null) {
            SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
            C13833a a = new C13834b(getResources()).mo25930e(C13818b.f36063c).mo25912a();
            C13773e a2 = C13771c.m27870a();
            ItemLikeEggData itemLikeEggData = this.f70109a;
            if (itemLikeEggData != null) {
                str = itemLikeEggData.getMaterialUrl();
            } else {
                str = null;
            }
            simpleDraweeView.setController(((C13773e) ((C13773e) a2.mo25723a(str).mo25751a((C13791d<? super INFO>) getControllerListener())).mo25762c(true)).mo25763d());
            simpleDraweeView.setLayoutParams(getImageLayout());
            simpleDraweeView.setHierarchy(a);
            this.f70114g = simpleDraweeView;
            addView(this.f70114g);
        }
    }

    public final void setCommerceDigg(Aweme aweme) {
        ItemLikeEggData itemLikeEggData;
        ItemLikeEggData itemLikeEggData2;
        String str;
        String str2 = null;
        if (aweme != null) {
            itemLikeEggData = aweme.getCommerceAdLikeDigg();
        } else {
            itemLikeEggData = null;
        }
        if (m64434a(itemLikeEggData)) {
            this.f70116i = aweme;
            if (aweme != null) {
                itemLikeEggData2 = aweme.getCommerceAdLikeDigg();
            } else {
                itemLikeEggData2 = null;
            }
            this.f70109a = itemLikeEggData2;
            ItemLikeEggData itemLikeEggData3 = this.f70109a;
            if (itemLikeEggData3 != null) {
                str = itemLikeEggData3.getFileType();
            } else {
                str = null;
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 102340) {
                    if (hashCode != 120609) {
                        if (hashCode == 3645340 && str.equals("webp")) {
                            ItemLikeEggData itemLikeEggData4 = this.f70109a;
                            if (itemLikeEggData4 != null) {
                                str2 = itemLikeEggData4.getMaterialUrl();
                            }
                            m64433a(str2);
                            return;
                        }
                    } else if (str.equals("zip")) {
                        C18842a.m45932a(new C26622e(this));
                        return;
                    }
                } else if (str.equals("gif")) {
                    ItemLikeEggData itemLikeEggData5 = this.f70109a;
                    if (itemLikeEggData5 != null) {
                        str2 = itemLikeEggData5.getMaterialUrl();
                    }
                    m64433a(str2);
                    return;
                }
            }
            this.f70110b.set(false);
        }
    }

    /* renamed from: a */
    public final void mo54399a(String str, String str2) {
        CharSequence charSequence;
        C52711k.m112240b(str, "enterFrom");
        if (m64434a(this.f70109a) && this.f70110b.get()) {
            Aweme aweme = this.f70116i;
            String str3 = null;
            if (aweme != null) {
                charSequence = aweme.getAid();
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(charSequence, str2)) {
                String str4 = "CommerceLikeLayout";
                StringBuilder sb = new StringBuilder("点赞视频与彩蛋所属视频不同; 点赞视频ID : ");
                sb.append(str2);
                sb.append(" 彩蛋所属视频ID : ");
                Aweme aweme2 = this.f70116i;
                if (aweme2 != null) {
                    str3 = aweme2.getAid();
                }
                sb.append(str3);
                C18778a.m45854e(str4, sb.toString());
                return;
            }
            this.f70115h = str;
            ItemLikeEggData itemLikeEggData = this.f70109a;
            if (itemLikeEggData == null) {
                C52711k.m112234a();
            }
            String fileType = itemLikeEggData.getFileType();
            if (fileType != null) {
                int hashCode = fileType.hashCode();
                if (hashCode != 102340) {
                    if (hashCode != 120609) {
                        if (hashCode == 3645340 && fileType.equals("webp")) {
                            m64439e();
                        }
                    } else if (fileType.equals("zip")) {
                        m64440f();
                    }
                } else if (fileType.equals("gif")) {
                    m64439e();
                }
            }
        }
    }

    public CommerceLikeLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f70110b = new AtomicBoolean(false);
    }

    public /* synthetic */ CommerceLikeLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
