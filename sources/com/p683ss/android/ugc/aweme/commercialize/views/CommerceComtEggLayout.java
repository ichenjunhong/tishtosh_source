package com.p683ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
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
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.comment.list.ICommerceComtEggLayout;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.CommentEggDataManager;
import com.p683ss.android.ugc.aweme.feed.model.ItemCommentEggData;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.splash.C45699k.C45702a;
import com.p683ss.android.ugc.aweme.util.C47625i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout */
public final class CommerceComtEggLayout extends ICommerceComtEggLayout {

    /* renamed from: d */
    public static final C26609a f70092d = new C26609a(null);

    /* renamed from: a */
    public long f70093a;

    /* renamed from: b */
    Aweme f70094b;

    /* renamed from: c */
    public final Runnable f70095c;

    /* renamed from: e */
    private SimpleDraweeView f70096e;

    /* renamed from: f */
    private final Runnable f70097f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout$a */
    public static final class C26609a {
        private C26609a() {
        }

        public /* synthetic */ C26609a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout$b */
    static final class C26610b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommerceComtEggLayout f70098a;

        C26610b(CommerceComtEggLayout commerceComtEggLayout) {
            this.f70098a = commerceComtEggLayout;
        }

        public final void run() {
            this.f70098a.mo51531a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout$c */
    public static final class C26611c extends C13790c<C14045f> {

        /* renamed from: a */
        final /* synthetic */ CommerceComtEggLayout f70099a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout$c$a */
        public static final class C26612a implements C13882b {

            /* renamed from: a */
            final /* synthetic */ C26611c f70100a;

            /* renamed from: a */
            public final void mo26040a(C13877a aVar) {
                C52711k.m112240b(aVar, "drawable");
            }

            /* renamed from: a */
            public final void mo26041a(C13877a aVar, int i) {
                C52711k.m112240b(aVar, "drawable");
            }

            /* renamed from: c */
            public final void mo26043c(C13877a aVar) {
                C52711k.m112240b(aVar, "drawable");
            }

            C26612a(C26611c cVar) {
                this.f70100a = cVar;
            }

            /* renamed from: b */
            public final void mo26042b(C13877a aVar) {
                C52711k.m112240b(aVar, "drawable");
                aVar.setAlpha(0);
                this.f70100a.f70099a.getHandler().removeCallbacks(this.f70100a.f70099a.f70095c);
                this.f70100a.f70099a.mo51531a();
            }
        }

        C26611c(CommerceComtEggLayout commerceComtEggLayout) {
            this.f70099a = commerceComtEggLayout;
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            if (animatable != null) {
                try {
                    if (animatable instanceof C13877a) {
                        C13877a aVar = (C13877a) animatable;
                        aVar.mo26024a((C13857a) new C45702a(aVar.f36202d, 1));
                        aVar.mo26025a((C13882b) new C26612a(this));
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

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout$d */
    static final class C26613d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommerceComtEggLayout f70101a;

        C26613d(CommerceComtEggLayout commerceComtEggLayout) {
            this.f70101a = commerceComtEggLayout;
        }

        public final void run() {
            this.f70101a.mo51531a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout$e */
    public static final class C26614e implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ CommerceComtEggLayout f70102a;

        C26614e(CommerceComtEggLayout commerceComtEggLayout) {
            this.f70102a = commerceComtEggLayout;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f70102a.mo51531a();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout$f */
    static final class C26615f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommerceComtEggLayout f70103a;

        /* renamed from: b */
        final /* synthetic */ Context f70104b;

        /* renamed from: c */
        final /* synthetic */ ItemCommentEggData f70105c;

        /* renamed from: d */
        final /* synthetic */ String f70106d;

        /* renamed from: e */
        final /* synthetic */ String f70107e;

        C26615f(CommerceComtEggLayout commerceComtEggLayout, Context context, ItemCommentEggData itemCommentEggData, String str, String str2) {
            this.f70103a = commerceComtEggLayout;
            this.f70104b = context;
            this.f70105c = itemCommentEggData;
            this.f70106d = str;
            this.f70107e = str2;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (!C26540w.m64226a(this.f70104b, this.f70105c.getOpenUrl(), false)) {
                C26540w.m64222a(this.f70104b, this.f70105c.getWebUrl(), "");
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f70103a.f70093a);
            CommerceComtEggLayout commerceComtEggLayout = this.f70103a;
            String str2 = this.f70106d;
            String str3 = this.f70107e;
            String eggId = this.f70105c.getEggId();
            C52711k.m112236a((Object) eggId, "eggData.eggId");
            String str4 = "click_egg_ad";
            C23089d a = C23089d.m56640a().mo47829a("egg_ad_id", eggId).mo47829a("comment_text", str3).mo47829a("scene_id", "1003").mo47829a("enter_from", str2);
            String str5 = "group_id";
            Aweme aweme = commerceComtEggLayout.f70094b;
            String str6 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            C23089d a2 = a.mo47829a(str5, str);
            String str7 = "author_id";
            Aweme aweme2 = commerceComtEggLayout.f70094b;
            if (aweme2 != null) {
                User author = aweme2.getAuthor();
                if (author != null) {
                    str6 = author.getUid();
                }
            }
            C26890h.m65011a(str4, a2.mo47829a(str7, str6).mo47826a("duration", currentTimeMillis).f61491a);
        }
    }

    public CommerceComtEggLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommerceComtEggLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final LayoutParams getImageLayout() {
        double measuredWidth = (double) getMeasuredWidth();
        Double.isNaN(measuredWidth);
        int i = (int) (measuredWidth * 0.64d);
        LayoutParams layoutParams = new LayoutParams(i, i);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    /* renamed from: a */
    public final void mo51531a() {
        removeAllViews();
        setVisibility(4);
        this.f70093a = 0;
        this.f70094b = null;
        if (this.f70096e != null) {
            SimpleDraweeView simpleDraweeView = this.f70096e;
            if (simpleDraweeView != null) {
                simpleDraweeView.setVisibility(8);
            }
            this.f70096e = null;
        }
    }

    public CommerceComtEggLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f70095c = new C26610b(this);
        this.f70097f = new C26613d(this);
    }

    /* renamed from: a */
    public final void mo51532a(String str, Aweme aweme, String str2) {
        String str3;
        String str4;
        Animatable animatable;
        C52711k.m112240b(str, "commetText");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str2, "enterFrom");
        ItemCommentEggData eggData = CommentEggDataManager.getEggData(aweme.getAid(), str);
        if (eggData != null) {
            mo51531a();
            this.f70094b = aweme;
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            if (this.f70096e == null) {
                SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
                C13833a a = new C13834b(getResources()).mo25930e(C13818b.f36063c).mo25912a();
                if (TextUtils.equals(eggData.getFileType(), "gif") || TextUtils.equals(eggData.getFileType(), "webp")) {
                    simpleDraweeView.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25723a(eggData.getMaterialUrl()).mo25751a((C13791d<? super INFO>) new C26611c<Object>(this))).mo25762c(true)).mo25763d());
                } else {
                    simpleDraweeView.setImageURI(eggData.getMaterialUrl());
                }
                simpleDraweeView.setLayoutParams(getImageLayout());
                simpleDraweeView.setHierarchy(a);
                this.f70096e = simpleDraweeView;
                SimpleDraweeView simpleDraweeView2 = this.f70096e;
                if (simpleDraweeView2 != null) {
                    View view = simpleDraweeView2;
                    if (view != null && (!TextUtils.isEmpty(eggData.getWebUrl()) || !TextUtils.isEmpty(eggData.getOpenUrl()))) {
                        C26615f fVar = new C26615f(this, context, eggData, str2, str);
                        view.setOnClickListener(fVar);
                    }
                    addView(this.f70096e);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.View");
                }
            }
            String str5 = null;
            if (this.f70096e != null) {
                setVisibility(0);
                setOnTouchListener(new C26614e(this));
                bringToFront();
                if (TextUtils.equals(eggData.getFileType(), "gif") || TextUtils.equals(eggData.getFileType(), "webp")) {
                    SimpleDraweeView simpleDraweeView3 = this.f70096e;
                    if (simpleDraweeView3 != null) {
                        C13842a controller = simpleDraweeView3.getController();
                        if (controller != null) {
                            animatable = controller.mo25749i();
                            if (animatable != null && !animatable.isRunning()) {
                                animatable.start();
                            }
                            getHandler().postDelayed(this.f70095c, 5000);
                        }
                    }
                    animatable = null;
                    animatable.start();
                    getHandler().postDelayed(this.f70095c, 5000);
                } else {
                    getHandler().postDelayed(this.f70097f, 3000);
                }
                this.f70093a = System.currentTimeMillis();
                String eggId = eggData.getEggId();
                C52711k.m112236a((Object) eggId, "eggData.eggId");
                String str6 = "show_egg_ad";
                C23089d a2 = C23089d.m56640a().mo47829a("egg_ad_id", eggId).mo47829a("comment_text", str).mo47829a("scene_id", "1003").mo47829a("enter_from", str2);
                String str7 = "group_id";
                Aweme aweme2 = this.f70094b;
                if (aweme2 != null) {
                    str4 = aweme2.getAid();
                } else {
                    str4 = null;
                }
                C23089d a3 = a2.mo47829a(str7, str4);
                String str8 = "author_id";
                Aweme aweme3 = this.f70094b;
                if (aweme3 != null) {
                    User author = aweme3.getAuthor();
                    if (author != null) {
                        str5 = author.getUid();
                    }
                }
                C26890h.m65011a(str6, a3.mo47829a(str8, str5).f61491a);
                return;
            }
            String str9 = "load_fail";
            String eggId2 = eggData.getEggId();
            C52711k.m112236a((Object) eggId2, "eggData.eggId");
            String str10 = "show_egg_ad_fail";
            C23089d a4 = C23089d.m56640a().mo47829a("egg_ad_id", eggId2).mo47829a("comment_text", str).mo47829a("scene_id", "1003").mo47829a("enter_from", str2);
            String str11 = "group_id";
            Aweme aweme4 = this.f70094b;
            if (aweme4 != null) {
                str3 = aweme4.getAid();
            } else {
                str3 = null;
            }
            C23089d a5 = a4.mo47829a(str11, str3);
            String str12 = "author_id";
            Aweme aweme5 = this.f70094b;
            if (aweme5 != null) {
                User author2 = aweme5.getAuthor();
                if (author2 != null) {
                    str5 = author2.getUid();
                }
            }
            C26890h.m65011a(str10, a5.mo47829a(str12, str5).mo47829a("fail_type", str9).f61491a);
        }
    }

    public /* synthetic */ CommerceComtEggLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
