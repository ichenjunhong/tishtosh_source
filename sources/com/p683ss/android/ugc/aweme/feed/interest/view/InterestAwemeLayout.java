package com.p683ss.android.ugc.aweme.feed.interest.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0190o.C0191a;
import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.p042b.C1027f;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.lighten.loader.SmartImageView;
import com.google.gson.C17971f;
import com.google.gson.C17978g;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.FeedRefreshViewModel.C29491a;
import com.p683ss.android.ugc.aweme.experiment.InterestSelectExperiment;
import com.p683ss.android.ugc.aweme.feed.interest.C30408a;
import com.p683ss.android.ugc.aweme.feed.interest.C30410b;
import com.p683ss.android.ugc.aweme.feed.interest.InterestApi;
import com.p683ss.android.ugc.aweme.feed.interest.InterestApi.C30407a;
import com.p683ss.android.ugc.aweme.feed.interest.p1726b.C30411a;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30340i;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.journey.C35777q;
import com.p683ss.android.ugc.aweme.journey.C35791v;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45427bj;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.widget.flowlayout.C48393a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.p2692b.C53694b;
import p064c.p065a.C2149h;
import p064c.p065a.C2200u;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p077e.p081d.C2029z;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout */
public final class InterestAwemeLayout extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f79494a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(InterestAwemeLayout.class), "api", "getApi()Lcom/ss/android/ugc/aweme/feed/interest/InterestApi;"))};

    /* renamed from: b */
    DataCenter f79495b;

    /* renamed from: c */
    final C1689b f79496c;

    /* renamed from: d */
    public final LinearLayout f79497d;

    /* renamed from: e */
    public final ViewGroup f79498e;

    /* renamed from: f */
    public final List<C52847n<Integer, C35777q>> f79499f;

    /* renamed from: g */
    public boolean f79500g;

    /* renamed from: h */
    private final C52668f f79501h;

    /* renamed from: i */
    private boolean f79502i;

    /* renamed from: j */
    private HashMap f79503j;

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout$a */
    static final class C30413a extends C52712l implements C52670a<InterestApi> {

        /* renamed from: a */
        public static final C30413a f79504a = new C30413a();

        C30413a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C30407a.m71331a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout$b */
    public static final class C30414b extends C48393a<C35777q> {

        /* renamed from: a */
        public final int f79505a = (C23728o.m58241a(54.0d) * -1);

        /* renamed from: b */
        final /* synthetic */ InterestAwemeLayout f79506b;

        /* renamed from: c */
        final /* synthetic */ C35791v f79507c;

        /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout$b$a */
        static final class C30415a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ LayoutParams f79508a;

            /* renamed from: b */
            final /* synthetic */ LinearLayout f79509b;

            C30415a(LayoutParams layoutParams, LinearLayout linearLayout) {
                this.f79508a = layoutParams;
                this.f79509b = linearLayout;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LayoutParams layoutParams = this.f79508a;
                C52711k.m112236a((Object) valueAnimator, "valueAnimator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    layoutParams.bottomMargin = ((Integer) animatedValue).intValue();
                    this.f79509b.requestLayout();
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Int");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout$b$b */
        static final class C30416b extends C52712l implements C52671b<C52847n<? extends Integer, ? extends C35777q>, Boolean> {

            /* renamed from: a */
            final /* synthetic */ int f79510a;

            C30416b(int i) {
                this.f79510a = i;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                boolean z;
                C52847n nVar = (C52847n) obj;
                C52711k.m112240b(nVar, "it");
                if (((Number) nVar.getFirst()).intValue() == this.f79510a) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: a */
        public final void mo60843a(int i, View view) {
            super.mo60843a(i, view);
            if (view != null) {
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.edk);
                if (frameLayout != null) {
                    frameLayout.setBackgroundResource(R.drawable.cws);
                }
            }
            if (this.f79506b.getSelectItems().size() == 0) {
                LinearLayout linearLayout = (LinearLayout) this.f79506b.mo60827a((int) R.id.eao);
                if (linearLayout != null) {
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    if (layoutParams != null) {
                        m71339a((LayoutParams) layoutParams, linearLayout, this.f79505a, 0);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                }
            }
            C35777q qVar = (C35777q) mo95861a(i);
            this.f79506b.getSelectItems().add(C52856t.m112465a(Integer.valueOf(i), qVar));
            C30410b bVar = C30410b.f79484a;
            C26890h.m65011a("click_interest_lable", new C23089d().mo47829a("enter_from", "homepage_hot").mo47829a("lable_name", qVar.f91888b).mo47829a("user_id", C30410b.m71333a()).f61491a);
            if (view != null) {
                TextView textView = (TextView) view.findViewById(R.id.edj);
                if (textView != null) {
                    textView.setTextColor(Color.parseColor("#161823"));
                }
            }
        }

        /* renamed from: b */
        public final void mo60844b(int i, View view) {
            super.mo60844b(i, view);
            if (view != null) {
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.edk);
                if (frameLayout != null) {
                    frameLayout.setBackgroundResource(R.drawable.cwt);
                }
            }
            if (view != null) {
                TextView textView = (TextView) view.findViewById(R.id.edj);
                if (textView != null) {
                    textView.setTextColor(Color.parseColor("#FFFFFF"));
                }
            }
            C35777q qVar = (C35777q) mo95861a(i);
            C52575l.m112110a(this.f79506b.getSelectItems(), (C52671b) new C30416b(i));
            C30410b bVar = C30410b.f79484a;
            C26890h.m65011a("cancel_interest_lable", new C23089d().mo47829a("enter_from", "homepage_hot").mo47829a("lable_name", qVar.f91888b).mo47829a("user_id", C30410b.m71333a()).f61491a);
            if (this.f79506b.getSelectItems().size() == 0) {
                LinearLayout linearLayout = (LinearLayout) this.f79506b.mo60827a((int) R.id.eao);
                if (linearLayout != null) {
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    if (layoutParams != null) {
                        m71339a((LayoutParams) layoutParams, linearLayout, 0, this.f79505a);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            }
        }

        public C30414b(InterestAwemeLayout interestAwemeLayout, C35791v vVar, List list) {
            this.f79506b = interestAwemeLayout;
            this.f79507c = vVar;
            super(list);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
            if (r4 == null) goto L_0x001c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ android.view.View mo56339a(com.p683ss.android.ugc.aweme.widget.flowlayout.FlowLayout r3, int r4, java.lang.Object r5) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.journey.q r5 = (com.p683ss.android.ugc.aweme.journey.C35777q) r5
                com.ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout r4 = r2.f79506b
                android.content.Context r4 = r4.getContext()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                r0 = 2132214534(0x7f170306, float:2.0072913E38)
                r1 = 0
                android.view.View r3 = r4.inflate(r0, r3, r1)
                if (r5 == 0) goto L_0x001c
                java.lang.String r4 = r5.f91888b
                if (r4 != 0) goto L_0x001e
            L_0x001c:
                java.lang.String r4 = ""
            L_0x001e:
                r5 = 2132019832(0x7f140a78, float:1.967801E38)
                android.view.View r0 = r3.findViewById(r5)
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.String r1 = "item_interest_aweme"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                r1 = 0
                r0.setBackground(r1)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                java.lang.String r0 = "item_interest_aweme"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r5.setText(r4)
                java.lang.String r4 = "LayoutInflater.from(cont… = text\n                }"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout.C30414b.mo56339a(com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout, int, java.lang.Object):android.view.View");
        }

        /* renamed from: a */
        private static void m71339a(LayoutParams layoutParams, LinearLayout linearLayout, int i, int i2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
            ofInt.addUpdateListener(new C30415a(layoutParams, linearLayout));
            C52711k.m112236a((Object) ofInt, "animator");
            ofInt.setInterpolator(C1027f.m2954a(0.25f, 0.1f, 0.25f, 1.0f));
            ofInt.setDuration(300);
            ofInt.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout$c */
    public static final class C30417c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InterestAwemeLayout f79511a;

        public C30417c(InterestAwemeLayout interestAwemeLayout) {
            this.f79511a = interestAwemeLayout;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C32800a.m75679a(view)) {
                Context context = this.f79511a.getContext();
                if (!C30430a.m71349a(context)) {
                    C10691a.m21542b(context, (int) R.string.cg1).mo19066a();
                    return;
                }
                InterestAwemeLayout interestAwemeLayout = this.f79511a;
                if (interestAwemeLayout.f79499f.size() != 0) {
                    interestAwemeLayout.f79500g = true;
                    Iterable<C52847n> iterable = interestAwemeLayout.f79499f;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (C52847n second : iterable) {
                        arrayList.add((C35777q) second.getSecond());
                    }
                    List list = (List) arrayList;
                    C30410b bVar = C30410b.f79484a;
                    String str = ((C35777q) list.get(list.size() - 1)).f91888b;
                    C26890h.m65011a("choose_interest_lable", new C23089d().mo47829a("enter_from", "homepage_hot").mo47829a("user_id", C30410b.m71333a()).f61491a);
                    DataCenter dataCenter = interestAwemeLayout.f79495b;
                    if (dataCenter != null) {
                        dataCenter.mo48228a("interest_submit_action", (Object) Integer.valueOf(44));
                    }
                    interestAwemeLayout.mo60829a(true);
                    Context context2 = interestAwemeLayout.getContext();
                    if (context2 != null) {
                        FragmentActivity fragmentActivity = (FragmentActivity) context2;
                        C1689b bVar2 = interestAwemeLayout.f79496c;
                        C1690c a = C2201v.m6614b(list).mo6539d(250, TimeUnit.MILLISECONDS).mo6529b(C2168a.m6521b()).mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) new C30422h<Object,Object>(interestAwemeLayout, fragmentActivity)).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C30423i<Object>(interestAwemeLayout), (C1710e<? super Throwable>) new C30424j<Object>(interestAwemeLayout));
                        C52711k.m112236a((Object) a, "Observable.just(submitDa…r:$e\")\n                })");
                        C52711k.m112240b(bVar2, "$receiver");
                        C52711k.m112240b(a, "disposable");
                        bVar2.mo6181a(a);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout$d */
    static final class C30418d<T> implements C1710e<C2200u<C30411a>> {

        /* renamed from: a */
        public static final C30418d f79512a = new C30418d();

        C30418d() {
        }

        public final /* synthetic */ void accept(Object obj) {
            C2200u uVar = (C2200u) obj;
            String a = C30408a.m71332a();
            StringBuilder sb = new StringBuilder("submitInterestList status:");
            C52711k.m112236a((Object) uVar, "it");
            sb.append(uVar.mo6501b());
            sb.append(',');
            sb.append(uVar.mo6500a());
            C32458a.m75141a(4, a, sb.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout$e */
    static final class C30419e<T> implements C1710e<C1690c> {

        /* renamed from: a */
        final /* synthetic */ String f79513a;

        /* renamed from: b */
        final /* synthetic */ FragmentActivity f79514b;

        C30419e(String str, FragmentActivity fragmentActivity) {
            this.f79513a = str;
            this.f79514b = fragmentActivity;
        }

        public final /* synthetic */ void accept(Object obj) {
            C1690c cVar = (C1690c) obj;
            InterestSelectExperiment.m69601a(this.f79513a);
            ((C0198r) C29491a.m69593a(this.f79514b).f77247c.getValue()).postValue("interest_select");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout$f */
    static final class C30420f<T> implements C1710e<C2200u<Boolean>> {

        /* renamed from: a */
        public static final C30420f f79515a = new C30420f();

        C30420f() {
        }

        public final /* synthetic */ void accept(Object obj) {
            C2200u uVar = (C2200u) obj;
            String a = C30408a.m71332a();
            StringBuilder sb = new StringBuilder("refresh status:");
            C52711k.m112236a((Object) uVar, "it");
            sb.append(uVar.mo6501b());
            sb.append(',');
            sb.append(uVar.mo6500a());
            C32458a.m75141a(4, a, sb.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout$g */
    public static final class C30421g implements C1707b<C30411a, Boolean, C30411a> {
        C30421g() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo6200a(Object obj, Object obj2) {
            C30411a aVar = (C30411a) obj;
            ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "t1");
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout$h */
    static final class C30422h<T, R> implements C1711f<T, C2206z<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ InterestAwemeLayout f79516a;

        /* renamed from: b */
        final /* synthetic */ FragmentActivity f79517b;

        C30422h(InterestAwemeLayout interestAwemeLayout, FragmentActivity fragmentActivity) {
            this.f79516a = interestAwemeLayout;
            this.f79517b = fragmentActivity;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C52711k.m112240b(list, "it");
            C17971f d = new C17978g().mo34899c().mo34900d();
            C35791v vVar = new C35791v(list, Integer.valueOf(0), Integer.valueOf(0), null, null, 24, null);
            String b = d.mo34889b(vVar);
            String a = C30408a.m71332a();
            StringBuilder sb = new StringBuilder("submitreq:");
            sb.append(b);
            C32458a.m75141a(4, a, sb.toString());
            InterestAwemeLayout interestAwemeLayout = this.f79516a;
            FragmentActivity fragmentActivity = this.f79517b;
            return C2201v.m6603a((C2206z<? extends T1>) interestAwemeLayout.getApi().submitInterestList(b).mo6530b((C1710e<? super C2200u<T>>) C30418d.f79512a), (C2206z<? extends T2>) C2150a.m6486a((C2201v<T>) new C2029z<T>(C2149h.m6453a((C53694b<? extends T>) new C0191a<Object>(fragmentActivity, C29491a.m69593a(fragmentActivity).mo59600a())))).mo6543e((C1710e<? super C1690c>) new C30419e<Object>(b, fragmentActivity)).mo6530b((C1710e<? super C2200u<T>>) C30420f.f79515a), (C1707b<? super T1, ? super T2, ? extends R>) new C30421g<Object,Object,Object>());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout$i */
    static final class C30423i<T> implements C1710e<C30411a> {

        /* renamed from: a */
        final /* synthetic */ InterestAwemeLayout f79518a;

        C30423i(InterestAwemeLayout interestAwemeLayout) {
            this.f79518a = interestAwemeLayout;
        }

        public final /* synthetic */ void accept(Object obj) {
            C30411a aVar = (C30411a) obj;
            Integer statusCode = aVar.getStatusCode();
            if (statusCode == null || statusCode.intValue() != 0) {
                String a = C30408a.m71332a();
                StringBuilder sb = new StringBuilder("statusCode:");
                sb.append(aVar.getStatusCode());
                sb.append(",msg:");
                sb.append(aVar.getStatusMsg());
                C32458a.m75141a(6, a, sb.toString());
                C52711k.m112236a((Object) aVar, "it");
                throw aVar;
            }
            this.f79518a.setSuccess(true);
            if (this.f79518a.getContext() != null) {
                C10691a.m21537a(this.f79518a.getContext(), "已根据你的选择更新了内容").mo19066a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout$j */
    static final class C30424j<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ InterestAwemeLayout f79519a;

        C30424j(InterestAwemeLayout interestAwemeLayout) {
            this.f79519a = interestAwemeLayout;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f79519a.mo60828a();
            String a = C30408a.m71332a();
            StringBuilder sb = new StringBuilder("submit error:");
            sb.append(th);
            C32458a.m75141a(6, a, sb.toString());
        }
    }

    /* renamed from: a */
    public final View mo60827a(int i) {
        if (this.f79503j == null) {
            this.f79503j = new HashMap();
        }
        View view = (View) this.f79503j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79503j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final InterestApi getApi() {
        return (InterestApi) this.f79501h.getValue();
    }

    public final DataCenter getDataCenter() {
        return this.f79495b;
    }

    public final C1689b getDsp() {
        return this.f79496c;
    }

    public final LinearLayout getInitStateView() {
        return this.f79497d;
    }

    public final ViewGroup getLoadingStateView() {
        return this.f79498e;
    }

    public final List<C52847n<Integer, C35777q>> getSelectItems() {
        return this.f79499f;
    }

    public final boolean getSubmit() {
        return this.f79500g;
    }

    public final boolean getSuccess() {
        return this.f79502i;
    }

    /* renamed from: a */
    public final void mo60828a() {
        C32458a.m75150b(InterestSelectExperiment.m69599a(), "call stopLoadingAnimation");
        mo60829a(false);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f79502i) {
            mo60828a();
        }
        this.f79496c.mo6180a();
    }

    public final void setDataCenter(DataCenter dataCenter) {
        this.f79495b = dataCenter;
    }

    public final void setSubmit(boolean z) {
        this.f79500g = z;
    }

    public final void setSuccess(boolean z) {
        this.f79502i = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo60829a(boolean z) {
        C47718bf.m103288a(new C30340i(z, 1, 2, getContext().hashCode()));
    }

    /* renamed from: b */
    public final void mo60830b(boolean z) {
        if (z) {
            C45427bj.m98998a(this.f79497d, this.f79497d.getAlpha(), 0.0f);
            this.f79498e.setAlpha(1.0f);
            this.f79498e.setVisibility(0);
            ViewGroup viewGroup = this.f79498e;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                C52711k.m112236a((Object) childAt, "getChildAt(i)");
                childAt.setVisibility(0);
            }
            ((DmtStatusView) this.f79498e.findViewById(R.id.csv)).mo19212f();
            SmartImageView smartImageView = (SmartImageView) this.f79498e.findViewById(R.id.ed4);
            C45427bj.m98998a(smartImageView, smartImageView.getAlpha(), 1.0f);
            return;
        }
        C45427bj.m98998a(this.f79497d, this.f79497d.getAlpha(), 1.0f);
        C45427bj.m98998a(this.f79498e, this.f79498e.getAlpha(), 0.0f);
    }

    public InterestAwemeLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f79496c = new C1689b();
        ViewGroup viewGroup = this;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_d, viewGroup);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(context).inflate(l, this)");
        this.f79497d = (LinearLayout) inflate.findViewById(R.id.ejy);
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_e, viewGroup);
        C52711k.m112236a((Object) inflate2, "LayoutInflater.from(context).inflate(l, this)");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate2.findViewById(R.id.ed5);
        ((DmtStatusView) constraintLayout.findViewById(R.id.csv)).setBuilder(C10719a.m21676a(context));
        if (constraintLayout != null) {
            this.f79498e = constraintLayout;
            this.f79499f = new ArrayList();
            this.f79501h = C52732g.m112285a(C30413a.f79504a);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public /* synthetic */ InterestAwemeLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
