package com.p683ss.android.ugc.aweme.sticker.panel.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p019b.C0260c;
import android.support.p019b.C0304o;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.shortvideo.widget.p2262a.C45593a;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2296e.C46022c;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2305a.C46128d;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46747d;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46747d.C46749a;
import com.p683ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;
import com.p683ss.android.ugc.tools.utils.KeyboardUtils;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView.C50243a;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.search.a */
public final class C46258a implements OnEditorActionListener {

    /* renamed from: m */
    public static final C46260a f116712m = new C46260a(null);

    /* renamed from: a */
    public final float f116713a = C20141b.m49696a((Context) this.f116721i, 272.0f);

    /* renamed from: b */
    public View f116714b;

    /* renamed from: c */
    public ImageView f116715c;

    /* renamed from: d */
    public EditText f116716d;

    /* renamed from: e */
    public AVStatusView f116717e;

    /* renamed from: f */
    RecyclerView f116718f;

    /* renamed from: g */
    public C46128d f116719g;

    /* renamed from: h */
    int f116720h = -1;

    /* renamed from: i */
    public final AppCompatActivity f116721i;

    /* renamed from: j */
    public final C46354l f116722j;

    /* renamed from: k */
    public final C45889c f116723k;

    /* renamed from: l */
    public final C46275c f116724l;

    /* renamed from: n */
    private final float f116725n = C20141b.m49696a((Context) this.f116721i, 52.0f);

    /* renamed from: o */
    private View f116726o;

    /* renamed from: p */
    private View f116727p;

    /* renamed from: q */
    private View f116728q;

    /* renamed from: r */
    private ImageView f116729r;

    /* renamed from: s */
    private TextView f116730s;

    /* renamed from: t */
    private final View f116731t;

    /* renamed from: u */
    private final C45814b f116732u;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.search.a$a */
    public static final class C46260a {
        private C46260a() {
        }

        public /* synthetic */ C46260a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.search.a$b */
    public static final class C46261b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C46258a f116734a;

        C46261b(C46258a aVar) {
            this.f116734a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C46258a.m100444b(this.f116734a).setVisibility(8);
            C46258a.m100444b(this.f116734a).setTranslationY(this.f116734a.f116713a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.search.a$c */
    static final class C46262c implements OnClickListener {

        /* renamed from: a */
        public static final C46262c f116735a = new C46262c();

        C46262c() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.search.a$d */
    static final class C46263d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46258a f116736a;

        C46263d(C46258a aVar) {
            this.f116736a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f116736a.mo92957a(this.f116736a.mo92955a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.search.a$e */
    static final class C46264e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46258a f116737a;

        C46264e(C46258a aVar) {
            this.f116737a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            KeyboardUtils.m108324a(C46258a.m100443a(this.f116737a), this.f116737a.f116721i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.search.a$f */
    static final class C46265f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46258a f116738a;

        C46265f(C46258a aVar) {
            this.f116738a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f116738a.mo92957a(this.f116738a.mo92955a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.search.a$g */
    static final class C46266g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46258a f116739a;

        C46266g(C46258a aVar) {
            this.f116739a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C46258a.m100443a(this.f116739a).setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.search.a$h */
    public static final class C46267h implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C46258a f116740a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C46267h(C46258a aVar) {
            this.f116740a = aVar;
        }

        public final void afterTextChanged(Editable editable) {
            int i;
            C52711k.m112240b(editable, "s");
            String obj = editable.toString();
            ImageView imageView = this.f116740a.f116715c;
            if (imageView == null) {
                C52711k.m112237a("clearText");
            }
            if (TextUtils.isEmpty(obj)) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.search.a$i */
    static final class C46268i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46258a f116741a;

        C46268i(C46258a aVar) {
            this.f116741a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f116741a.f116723k.mo92487b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.search.a$j */
    static final class C46269j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46258a f116742a;

        C46269j(C46258a aVar) {
            this.f116742a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f116742a.f116719g.f116409a != -1) {
                ((SearchStickerViewModel) C0214z.m440a((FragmentActivity) this.f116742a.f116721i).mo359a(SearchStickerViewModel.class)).f116710a.setValue(this.f116742a.f116722j.mo92985c());
            }
            C46258a aVar = this.f116742a;
            ((SearchStickerViewModel) C0214z.m440a((FragmentActivity) aVar.f116721i).mo359a(SearchStickerViewModel.class)).f116711b.setValue(Boolean.valueOf(false));
            EditText editText = aVar.f116716d;
            if (editText == null) {
                C52711k.m112237a("searchEditText");
            }
            KeyboardUtils.m108325b(editText, aVar.f116721i);
            View view2 = aVar.f116714b;
            if (view2 == null) {
                C52711k.m112237a("curView");
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f, 0.0f});
            C52711k.m112236a((Object) ofFloat, "animator");
            ofFloat.setDuration(250);
            ofFloat.start();
            ofFloat.addListener(new C46261b(aVar));
            aVar.f116724l.mo92766b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.search.a$k */
    static final class C46270k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46258a f116743a;

        C46270k(C46258a aVar) {
            this.f116743a = aVar;
        }

        public final void run() {
            C46258a.m100444b(this.f116743a).setTranslationY(this.f116743a.f116713a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.search.a$l */
    static final class C46271l<T> implements C0199s<C37721a<SearchEffectResponse>> {

        /* renamed from: a */
        final /* synthetic */ C46258a f116744a;

        /* renamed from: b */
        final /* synthetic */ String f116745b;

        C46271l(C46258a aVar, String str) {
            this.f116744a = aVar;
            this.f116745b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r10) {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.mvp.b.a r10 = (com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a) r10
                if (r10 != 0) goto L_0x0005
                return
            L_0x0005:
                com.ss.android.ugc.aweme.mvp.b.a$a r0 = r10.f96126b
                if (r0 != 0) goto L_0x000a
                return
            L_0x000a:
                int[] r1 = com.p683ss.android.ugc.aweme.sticker.panel.search.C46274b.f116748a
                int r0 = r0.ordinal()
                r0 = r1[r0]
                r1 = 0
                switch(r0) {
                    case 1: goto L_0x00d2;
                    case 2: goto L_0x00c3;
                    case 3: goto L_0x0018;
                    default: goto L_0x0016;
                }
            L_0x0016:
                goto L_0x00ef
            L_0x0018:
                com.ss.android.ugc.aweme.sticker.panel.search.a r0 = r9.f116744a
                M r10 = r10.f96125a
                com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponse r10 = (com.p683ss.android.ugc.effectmanager.effect.model.SearchEffectResponse) r10
                java.lang.String r2 = r9.f116745b
                if (r10 != 0) goto L_0x0023
                return
            L_0x0023:
                java.util.List r3 = r10.getEffects()
                int r3 = r3.size()
                if (r3 != 0) goto L_0x0041
                com.ss.android.ugc.tools.view.widget.AVStatusView r10 = r0.f116717e
                if (r10 != 0) goto L_0x0036
                java.lang.String r3 = "statusView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r3)
            L_0x0036:
                r10.mo98096b(r1)
                com.ss.android.ugc.aweme.sticker.g.c r10 = r0.f116723k
                java.lang.String r0 = "normal_search"
                r10.mo92488b(r0, r2)
                return
            L_0x0041:
                com.ss.android.ugc.tools.view.widget.AVStatusView r2 = r0.f116717e
                if (r2 != 0) goto L_0x004a
                java.lang.String r3 = "statusView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r3)
            L_0x004a:
                r2.mo98093a()
                android.support.v7.widget.RecyclerView r2 = r0.f116718f
                if (r2 != 0) goto L_0x0056
                java.lang.String r3 = "recyclerView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r3)
            L_0x0056:
                r2.setVisibility(r1)
                com.ss.android.ugc.aweme.sticker.presenter.l r2 = r0.f116722j
                com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.mo92985c()
                java.util.List r3 = r10.getEffects()
                java.lang.String r4 = "response.effects"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                r4 = -1
                if (r2 == 0) goto L_0x0099
                r5 = r3
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
                r6 = 0
            L_0x0073:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x0099
                java.lang.Object r7 = r5.next()
                com.ss.android.ugc.effectmanager.effect.model.Effect r7 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r7
                java.lang.String r7 = r7.getEffectId()
                java.lang.String r8 = r2.getEffectId()
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r8)
                if (r7 == 0) goto L_0x0096
                r3.remove(r6)
                r3.add(r1, r2)
                r0.f116720h = r1
                goto L_0x009b
            L_0x0096:
                int r6 = r6 + 1
                goto L_0x0073
            L_0x0099:
                r0.f116720h = r4
            L_0x009b:
                com.ss.android.ugc.aweme.sticker.panel.defaultpanel.a.d r2 = r0.f116719g
                java.util.List r10 = r10.getEffects()
                r3 = 0
                java.util.List r10 = com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46036g.m100020a(r10, r3)
                r2.mo64318a(r10)
                android.support.v7.widget.RecyclerView r10 = r0.f116718f
                if (r10 != 0) goto L_0x00b2
                java.lang.String r2 = "recyclerView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x00b2:
                r10.mo4814b(r1)
                int r10 = r0.f116720h
                if (r10 == r4) goto L_0x00ef
                com.ss.android.ugc.aweme.sticker.panel.defaultpanel.a.d r10 = r0.f116719g
                r10.f116409a = r1
                com.ss.android.ugc.aweme.sticker.panel.search.c r10 = r0.f116724l
                r10.mo92767c()
                goto L_0x00ef
            L_0x00c3:
                com.ss.android.ugc.aweme.sticker.panel.search.a r10 = r9.f116744a
                com.ss.android.ugc.tools.view.widget.AVStatusView r10 = r10.f116717e
                if (r10 != 0) goto L_0x00ce
                java.lang.String r0 = "statusView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x00ce:
                r10.mo98094a(r1)
                return
            L_0x00d2:
                com.ss.android.ugc.aweme.sticker.panel.search.a r10 = r9.f116744a
                android.support.v7.widget.RecyclerView r0 = r10.f116718f
                if (r0 != 0) goto L_0x00dd
                java.lang.String r1 = "recyclerView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x00dd:
                r1 = 8
                r0.setVisibility(r1)
                com.ss.android.ugc.tools.view.widget.AVStatusView r10 = r10.f116717e
                if (r10 != 0) goto L_0x00eb
                java.lang.String r0 = "statusView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x00eb:
                r10.mo98095b()
                return
            L_0x00ef:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.search.C46258a.C46271l.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.search.a$m */
    public static final class C46272m implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C46258a f116746a;

        public C46272m(C46258a aVar) {
            this.f116746a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View b = C46258a.m100444b(this.f116746a);
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                b.setTranslationY(((Float) animatedValue).floatValue() * this.f116746a.f116713a);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.search.a$n */
    public static final class C46273n extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C46258a f116747a;

        public C46273n(C46258a aVar) {
            this.f116747a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            KeyboardUtils.m108324a(C46258a.m100443a(this.f116747a), this.f116747a.f116721i);
        }
    }

    /* renamed from: a */
    public final String mo92955a() {
        EditText editText = this.f116716d;
        if (editText == null) {
            C52711k.m112237a("searchEditText");
        }
        return editText.getText().toString();
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m100443a(C46258a aVar) {
        EditText editText = aVar.f116716d;
        if (editText == null) {
            C52711k.m112237a("searchEditText");
        }
        return editText;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m100444b(C46258a aVar) {
        View view = aVar.f116714b;
        if (view == null) {
            C52711k.m112237a("curView");
        }
        return view;
    }

    /* renamed from: a */
    public final void mo92957a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f116723k.mo92486a("normal_search", str);
            EditText editText = this.f116716d;
            if (editText == null) {
                C52711k.m112237a("searchEditText");
            }
            KeyboardUtils.m108325b(editText, this.f116721i);
            this.f116722j.mo92973a().mo92528a(new C46022c(str, 0, 0, null));
            this.f116722j.mo92973a().mo92537i().mo92546g().observe(this.f116721i, new C46271l(this, str));
        }
    }

    /* renamed from: a */
    public final void mo92956a(int i, boolean z) {
        View view = this.f116714b;
        if (view == null) {
            C52711k.m112237a("curView");
        }
        LayoutParams layoutParams = view.getLayoutParams();
        C52711k.m112236a((Object) layoutParams, "curView.layoutParams");
        if (z) {
            layoutParams.height = (int) (this.f116725n + ((float) i));
        } else {
            layoutParams.height = (int) this.f116713a;
        }
        C0260c cVar = new C0260c();
        View view2 = this.f116714b;
        if (view2 == null) {
            C52711k.m112237a("curView");
        }
        cVar.mo603b(view2);
        cVar.mo588a((TimeInterpolator) new C45593a(0.15f, 0.12f, 1.0f, 0.0f));
        cVar.mo587a(250);
        View view3 = this.f116714b;
        if (view3 == null) {
            C52711k.m112237a("curView");
        }
        if (view3 != null) {
            C0304o.m646a((ViewGroup) view3, cVar);
            View view4 = this.f116714b;
            if (view4 == null) {
                C52711k.m112237a("curView");
            }
            view4.setLayoutParams(layoutParams);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        mo92957a(mo92955a());
        return true;
    }

    public C46258a(AppCompatActivity appCompatActivity, View view, C46354l lVar, C45814b bVar, C45889c cVar, C46275c cVar2) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(view, "rootView");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(bVar, "selectedController");
        C52711k.m112240b(cVar, "stickerMobHelper");
        C52711k.m112240b(cVar2, "listener");
        this.f116721i = appCompatActivity;
        this.f116731t = view;
        this.f116722j = lVar;
        this.f116732u = bVar;
        this.f116723k = cVar;
        this.f116724l = cVar2;
        View findViewById = this.f116731t.findViewById(R.id.cuh);
        if (findViewById != null) {
            View inflate = ((ViewStub) findViewById).inflate();
            C52711k.m112236a((Object) inflate, "(rootView.findViewById(R…r) as ViewStub).inflate()");
            this.f116714b = inflate;
            View view2 = this.f116714b;
            if (view2 == null) {
                C52711k.m112237a("curView");
            }
            View findViewById2 = view2.findViewById(R.id.dfd);
            C52711k.m112236a((Object) findViewById2, "curView.findViewById(R.id.tv_search_action)");
            this.f116730s = (TextView) findViewById2;
            View view3 = this.f116714b;
            if (view3 == null) {
                C52711k.m112237a("curView");
            }
            View findViewById3 = view3.findViewById(R.id.cdx);
            C52711k.m112236a((Object) findViewById3, "curView.findViewById(R.id.rl_search_container)");
            this.f116728q = findViewById3;
            View view4 = this.f116714b;
            if (view4 == null) {
                C52711k.m112237a("curView");
            }
            View findViewById4 = view4.findViewById(R.id.cio);
            C52711k.m112236a((Object) findViewById4, "curView.findViewById(R.id.search_back)");
            this.f116729r = (ImageView) findViewById4;
            View view5 = this.f116714b;
            if (view5 == null) {
                C52711k.m112237a("curView");
            }
            View findViewById5 = view5.findViewById(R.id.nh);
            C52711k.m112236a((Object) findViewById5, "curView.findViewById(R.id.btn_clear)");
            this.f116715c = (ImageView) findViewById5;
            View view6 = this.f116714b;
            if (view6 == null) {
                C52711k.m112237a("curView");
            }
            View findViewById6 = view6.findViewById(R.id.csv);
            C52711k.m112236a((Object) findViewById6, "curView.findViewById(R.id.status_view)");
            this.f116717e = (AVStatusView) findViewById6;
            View view7 = this.f116714b;
            if (view7 == null) {
                C52711k.m112237a("curView");
            }
            View findViewById7 = view7.findViewById(R.id.dfb);
            C52711k.m112236a((Object) findViewById7, "curView.findViewById(R.id.tv_search)");
            this.f116716d = (EditText) findViewById7;
            View view8 = this.f116714b;
            if (view8 == null) {
                C52711k.m112237a("curView");
            }
            View findViewById8 = view8.findViewById(R.id.cjv);
            C52711k.m112236a((Object) findViewById8, "curView.findViewById(R.id.search_sticker_list)");
            this.f116718f = (RecyclerView) findViewById8;
            View inflate2 = LayoutInflater.from(this.f116721i).inflate(R.layout.gc, null, false);
            C52711k.m112236a((Object) inflate2, "LayoutInflater.from(acti…error_retry, null, false)");
            this.f116726o = inflate2;
            View view9 = this.f116726o;
            if (view9 == null) {
                C52711k.m112237a("errorView");
            }
            View findViewById9 = view9.findViewById(R.id.ab_);
            C52711k.m112236a((Object) findViewById9, "errorView.findViewById(R.id.error_retry_button)");
            this.f116727p = findViewById9;
            View view10 = this.f116726o;
            if (view10 == null) {
                C52711k.m112237a("errorView");
            }
            view10.setOnClickListener(C46262c.f116735a);
            View view11 = this.f116727p;
            if (view11 == null) {
                C52711k.m112237a("retryView");
            }
            view11.setOnClickListener(new C46263d(this));
            View view12 = this.f116728q;
            if (view12 == null) {
                C52711k.m112237a("searchContainer");
            }
            view12.setOnClickListener(new C46264e(this));
            AVStatusView aVStatusView = this.f116717e;
            if (aVStatusView == null) {
                C52711k.m112237a("statusView");
            }
            C50243a a = C50243a.m108469a((Context) this.f116721i);
            View view13 = this.f116726o;
            if (view13 == null) {
                C52711k.m112237a("errorView");
            }
            aVStatusView.setBuilder(a.mo98107b(view13).mo98102a((int) R.string.amc).mo98106b(1));
            TextView textView = this.f116730s;
            if (textView == null) {
                C52711k.m112237a("searchTextView");
            }
            textView.setOnClickListener(new C46265f(this));
            ImageView imageView = this.f116715c;
            if (imageView == null) {
                C52711k.m112237a("clearText");
            }
            imageView.setOnClickListener(new C46266g(this));
            EditText editText = this.f116716d;
            if (editText == null) {
                C52711k.m112237a("searchEditText");
            }
            editText.addTextChangedListener(new C46267h(this));
            EditText editText2 = this.f116716d;
            if (editText2 == null) {
                C52711k.m112237a("searchEditText");
            }
            editText2.setOnEditorActionListener(this);
            EditText editText3 = this.f116716d;
            if (editText3 == null) {
                C52711k.m112237a("searchEditText");
            }
            editText3.setOnClickListener(new C46268i(this));
            ImageView imageView2 = this.f116729r;
            if (imageView2 == null) {
                C52711k.m112237a("back");
            }
            imageView2.setOnClickListener(new C46269j(this));
            View view14 = this.f116714b;
            if (view14 == null) {
                C52711k.m112237a("curView");
            }
            view14.post(new C46270k(this));
            new C46747d(this.f116721i).mo93878a(new C46749a(this) {

                /* renamed from: a */
                final /* synthetic */ C46258a f116733a;

                /* renamed from: c */
                public final void mo73972c(int i) {
                }

                {
                    this.f116733a = r1;
                }

                /* renamed from: a */
                public final void mo73970a(int i) {
                    this.f116733a.mo92956a(i, true);
                }

                /* renamed from: b */
                public final void mo73971b(int i) {
                    this.f116733a.mo92956a(i, false);
                }
            });
            GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this.f116721i, 5, 1, false);
            RecyclerView recyclerView = this.f116718f;
            if (recyclerView == null) {
                C52711k.m112237a("recyclerView");
            }
            recyclerView.setLayoutManager(gridLayoutManager);
            RecyclerView recyclerView2 = this.f116718f;
            if (recyclerView2 == null) {
                C52711k.m112237a("recyclerView");
            }
            recyclerView2.setItemViewCacheSize(5);
            this.f116719g = new C46128d(this.f116721i, this.f116722j, this.f116732u, this.f116723k);
            this.f116719g.mo97992c(false);
            RecyclerView recyclerView3 = this.f116718f;
            if (recyclerView3 == null) {
                C52711k.m112237a("recyclerView");
            }
            recyclerView3.setAdapter(this.f116719g);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewStub");
    }
}
