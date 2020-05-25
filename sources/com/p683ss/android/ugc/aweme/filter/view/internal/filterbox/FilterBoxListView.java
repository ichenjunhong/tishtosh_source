package com.p683ss.android.ugc.aweme.filter.view.internal.filterbox;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p043v7.p048c.p049a.C1204c;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31489b;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.ugc.tools.utils.C50204h;
import com.p683ss.android.ugc.tools.view.p2513f.C50235a;
import com.p683ss.android.ugc.tools.view.p2513f.C50237c;
import com.p683ss.android.ugc.tools.view.widget.AVAbstractLoadingLayout;
import com.p683ss.android.ugc.tools.view.widget.AVLoadingLayout;
import com.p683ss.android.ugc.tools.view.widget.CircleImageView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView */
public final class FilterBoxListView extends AVAbstractLoadingLayout {

    /* renamed from: a */
    List<? extends C52847n<? extends EffectCategoryModel, ? extends List<C31657c>>> f82647a;

    /* renamed from: b */
    public C31646c f82648b;

    /* renamed from: c */
    public Drawable f82649c;

    /* renamed from: d */
    public Drawable f82650d;

    /* renamed from: e */
    public C52671b<? super Context, ? extends ContextWrapper> f82651e = new C31648e(this);

    /* renamed from: k */
    private final AVDmtPanelRecyleView f82652k;

    /* renamed from: l */
    private final AVDmtPanelRecyleView f82653l;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$a */
    public final class C31636a extends C1204c<C31657c, C31638a> {

        /* renamed from: b */
        private ContextWrapper f82655b;

        /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$a$a */
        public final class C31638a extends C1352v {

            /* renamed from: a */
            public final TextView f82656a;

            /* renamed from: b */
            public final int f82657b;

            /* renamed from: c */
            final /* synthetic */ C31636a f82658c;

            /* renamed from: d */
            private final CircleImageView f82659d;

            /* renamed from: e */
            private final ImageView f82660e;

            /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$a$a$a */
            static final class C31641a extends C52712l implements C52670a<C52860x> {

                /* renamed from: a */
                final /* synthetic */ C31638a f82664a;

                C31641a(C31638a aVar) {
                    this.f82664a = aVar;
                    super(0);
                }

                public final /* synthetic */ Object invoke() {
                    Object obj;
                    boolean z;
                    if (this.f82664a.getAdapterPosition() >= 0) {
                        C31657c cVar = (C31657c) this.f82664a.f82658c.mo3924a(this.f82664a.getAdapterPosition());
                        FilterBoxListView filterBoxListView = FilterBoxListView.this;
                        C31489b bVar = cVar.f82693a;
                        C52711k.m112240b(bVar, "filter");
                        List<? extends C52847n<? extends EffectCategoryModel, ? extends List<C31657c>>> list = filterBoxListView.f82647a;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                Object obj2 = null;
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                Iterator it2 = ((Iterable) ((C52847n) obj).getSecond()).iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Object next = it2.next();
                                    if (C52711k.m112239a((Object) ((C31657c) next).f82693a.f82392a.f82405b, (Object) bVar.f82392a.f82405b)) {
                                        obj2 = next;
                                        break;
                                    }
                                }
                                if (obj2 != null) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                                if (z) {
                                    break;
                                }
                            }
                            C52847n nVar = (C52847n) obj;
                            if (nVar != null) {
                                EffectCategoryModel effectCategoryModel = (EffectCategoryModel) nVar.getFirst();
                                if (effectCategoryModel != null) {
                                    if (cVar.f82693a.f82394c) {
                                        C31646c cVar2 = FilterBoxListView.this.f82648b;
                                        if (cVar2 != null) {
                                            cVar2.mo64363a(effectCategoryModel, cVar.f82693a);
                                        }
                                    } else {
                                        cVar.f82694b = !cVar.f82694b;
                                        C31638a aVar = this.f82664a;
                                        C52711k.m112236a((Object) cVar, "item");
                                        aVar.mo64555a(cVar);
                                        if (cVar.f82694b) {
                                            C31646c cVar3 = FilterBoxListView.this.f82648b;
                                            if (cVar3 != null) {
                                                cVar3.mo64364b(effectCategoryModel, cVar.f82693a);
                                            }
                                        } else {
                                            C31646c cVar4 = FilterBoxListView.this.f82648b;
                                            if (cVar4 != null) {
                                                cVar4.mo64365c(effectCategoryModel, cVar.f82693a);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        NoSuchElementException noSuchElementException = new NoSuchElementException();
                        StringBuilder sb = new StringBuilder("filter.name=");
                        sb.append(bVar.f82392a.f82405b);
                        sb.append(", category.names=");
                        List<? extends C52847n<? extends EffectCategoryModel, ? extends List<C31657c>>> list2 = filterBoxListView.f82647a;
                        if (list2 == null) {
                            C52711k.m112234a();
                        }
                        Iterable<C31657c> b = C31483a.m73319b(list2);
                        Collection arrayList = new ArrayList(C52575l.m112104a(b, 10));
                        for (C31657c cVar5 : b) {
                            arrayList.add(cVar5.f82693a.f82392a.f82405b);
                        }
                        sb.append((List) arrayList);
                        C50203g.m108361b(sb.toString());
                        throw noSuchElementException;
                    }
                    return C52860x.f131107a;
                }
            }

            /* renamed from: a */
            public final void mo64555a(C31657c cVar) {
                Drawable drawable;
                float f;
                C52711k.m112240b(cVar, "filterBean");
                C50181a.m108292a((SimpleDraweeView) this.f82659d, String.valueOf(cVar.f82693a.f82392a.f82409f));
                this.f82656a.setText(cVar.f82693a.f82392a.f82405b);
                ImageView imageView = this.f82660e;
                if (cVar.f82694b) {
                    drawable = FilterBoxListView.this.f82650d;
                } else {
                    drawable = FilterBoxListView.this.f82649c;
                }
                imageView.setImageDrawable(drawable);
                if (cVar.f82693a.f82394c) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                imageView.setAlpha(f);
            }

            public C31638a(C31636a aVar, final LinearLayout linearLayout) {
                C52711k.m112240b(linearLayout, "itemView");
                this.f82658c = aVar;
                super(linearLayout);
                View childAt = linearLayout.getChildAt(0);
                if (childAt != null) {
                    this.f82659d = (CircleImageView) childAt;
                    View childAt2 = linearLayout.getChildAt(1);
                    if (childAt2 != null) {
                        this.f82656a = (TextView) childAt2;
                        View childAt3 = linearLayout.getChildAt(2);
                        if (childAt3 != null) {
                            this.f82660e = (ImageView) childAt3;
                            this.f82657b = C46788b.f118235d.mo94007a(false, false, false, false, true);
                            final C52670a aVar2 = new C31641a(this);
                            linearLayout.setOnClickListener(new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    aVar2.invoke();
                                }
                            });
                            linearLayout.setOnTouchListener(new OnTouchListener(this) {

                                /* renamed from: a */
                                final /* synthetic */ C31638a f82662a;

                                {
                                    this.f82662a = r1;
                                }

                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    C52711k.m112236a((Object) motionEvent, "event");
                                    if (motionEvent.getAction() == 1) {
                                        ObjectAnimator ofInt = ObjectAnimator.ofInt(linearLayout, "backgroundColor", new int[]{this.f82662a.f82657b, 16777215});
                                        C52711k.m112236a((Object) ofInt, "animator");
                                        ofInt.setDuration(500);
                                        ofInt.setEvaluator(new ArgbEvaluator());
                                        ofInt.start();
                                    }
                                    return false;
                                }
                            });
                            return;
                        }
                        throw new C52857u("null cannot be cast to non-null type android.widget.ImageView");
                    }
                    throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.tools.view.widget.CircleImageView");
            }
        }

        public C31636a() {
            super(new C1212c<C31657c>() {
                /* renamed from: a */
                public final /* synthetic */ boolean mo3932a(Object obj, Object obj2) {
                    C31657c cVar = (C31657c) obj;
                    C31657c cVar2 = (C31657c) obj2;
                    C52711k.m112240b(cVar, "p0");
                    C52711k.m112240b(cVar2, "p1");
                    return C52711k.m112239a((Object) cVar.f82693a.f82392a.f82405b, (Object) cVar2.f82693a.f82392a.f82405b);
                }

                /* renamed from: b */
                public final /* synthetic */ boolean mo3933b(Object obj, Object obj2) {
                    C31657c cVar = (C31657c) obj;
                    C31657c cVar2 = (C31657c) obj2;
                    C52711k.m112240b(cVar, "p0");
                    C52711k.m112240b(cVar2, "p1");
                    return C52711k.m112239a((Object) cVar.f82693a.f82392a.f82405b, (Object) cVar2.f82693a.f82392a.f82405b);
                }
            });
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            C31638a aVar = (C31638a) vVar;
            C52711k.m112240b(aVar, "viewHolder");
            Object a = mo3924a(i);
            C52711k.m112236a(a, "getItem(position)");
            aVar.mo64555a((C31657c) a);
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            C52711k.m112240b(viewGroup, "parent");
            if (this.f82655b == null) {
                C52671b<? super Context, ? extends ContextWrapper> bVar = FilterBoxListView.this.f82651e;
                Context context = viewGroup.getContext();
                C52711k.m112236a((Object) context, "parent.context");
                this.f82655b = (ContextWrapper) bVar.invoke(context);
            }
            ContextWrapper contextWrapper = this.f82655b;
            if (contextWrapper == null) {
                C52711k.m112234a();
            }
            View inflate = LayoutInflater.from(contextWrapper).inflate(R.layout.fb, viewGroup, false);
            if (inflate != null) {
                return new C31638a(this, (LinearLayout) inflate);
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$b */
    public final class C31642b extends C1204c<EffectCategoryModel, C31644a> {

        /* renamed from: a */
        public String f82665a;

        /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$b$a */
        public final class C31644a extends C1352v {

            /* renamed from: a */
            public final TextView f82667a;

            /* renamed from: b */
            final /* synthetic */ C31642b f82668b;

            public C31644a(C31642b bVar, FrameLayout frameLayout) {
                C52711k.m112240b(frameLayout, "itemView");
                this.f82668b = bVar;
                super(frameLayout);
                View childAt = frameLayout.getChildAt(0);
                if (childAt != null) {
                    this.f82667a = (TextView) childAt;
                    frameLayout.setOnFocusChangeListener(new OnFocusChangeListener(this) {

                        /* renamed from: a */
                        final /* synthetic */ C31644a f82669a;

                        {
                            this.f82669a = r1;
                        }

                        public final void onFocusChange(View view, boolean z) {
                            if (z && this.f82669a.getAdapterPosition() >= 0) {
                                EffectCategoryModel effectCategoryModel = (EffectCategoryModel) this.f82669a.f82668b.mo3924a(this.f82669a.getAdapterPosition());
                                FilterBoxListView filterBoxListView = FilterBoxListView.this;
                                C52711k.m112236a((Object) effectCategoryModel, "item");
                                C52711k.m112240b(effectCategoryModel, "item");
                                filterBoxListView.mo64549a(effectCategoryModel);
                                this.f82669a.f82668b.f82665a = effectCategoryModel.getName();
                                this.f82669a.f82668b.notifyDataSetChanged();
                            }
                        }
                    });
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
            }
        }

        public C31642b() {
            super(new C1212c<EffectCategoryModel>() {
                /* renamed from: a */
                public final /* synthetic */ boolean mo3932a(Object obj, Object obj2) {
                    EffectCategoryModel effectCategoryModel = (EffectCategoryModel) obj;
                    EffectCategoryModel effectCategoryModel2 = (EffectCategoryModel) obj2;
                    C52711k.m112240b(effectCategoryModel, "p0");
                    C52711k.m112240b(effectCategoryModel2, "p1");
                    return C52711k.m112239a((Object) effectCategoryModel.getName(), (Object) effectCategoryModel2.getName());
                }

                /* renamed from: b */
                public final /* synthetic */ boolean mo3933b(Object obj, Object obj2) {
                    EffectCategoryModel effectCategoryModel = (EffectCategoryModel) obj;
                    EffectCategoryModel effectCategoryModel2 = (EffectCategoryModel) obj2;
                    C52711k.m112240b(effectCategoryModel, "p0");
                    C52711k.m112240b(effectCategoryModel2, "p1");
                    return C52711k.m112239a((Object) effectCategoryModel.getName(), (Object) effectCategoryModel2.getName());
                }
            });
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            C52711k.m112240b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fc, viewGroup, false);
            if (inflate != null) {
                return new C31644a(this, (FrameLayout) inflate);
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            boolean z;
            float f;
            C31644a aVar = (C31644a) vVar;
            C52711k.m112240b(aVar, "viewHolder");
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) mo3924a(i);
            if (this.f82665a == null) {
                C52711k.m112236a((Object) effectCategoryModel, "item");
                this.f82665a = effectCategoryModel.getName();
                z = true;
            } else {
                String str = this.f82665a;
                C52711k.m112236a((Object) effectCategoryModel, "item");
                z = C52711k.m112239a((Object) str, (Object) effectCategoryModel.getName());
            }
            C52711k.m112240b(effectCategoryModel, "item");
            aVar.f82667a.setText(effectCategoryModel.getName());
            TextView textView = aVar.f82667a;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            textView.setAlpha(f);
            if (z) {
                aVar.f82667a.setTypeface(aVar.f82667a.getTypeface(), 1);
                return;
            }
            Typeface a = C50237c.m108425a(C50235a.MEDIUM.getFONT_NAME());
            if (a != null) {
                aVar.f82667a.setTypeface(a);
            } else {
                aVar.f82667a.setTypeface(aVar.f82667a.getTypeface(), 0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$c */
    public interface C31646c {
        /* renamed from: a */
        void mo64363a(EffectCategoryModel effectCategoryModel, C31489b bVar);

        /* renamed from: b */
        void mo64364b(EffectCategoryModel effectCategoryModel, C31489b bVar);

        /* renamed from: c */
        void mo64365c(EffectCategoryModel effectCategoryModel, C31489b bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$d */
    public final class C31647d extends C1331h {

        /* renamed from: b */
        private final int f82671b;

        public C31647d(int i) {
            this.f82671b = i;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
            C52711k.m112240b(rect, "outRect");
            C52711k.m112240b(view, "view");
            C52711k.m112240b(recyclerView, "parent");
            C52711k.m112240b(sVar, "state");
            if (RecyclerView.m4275f(view) == 0) {
                rect.top = this.f82671b;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$e */
    static final class C31648e extends C52712l implements C52671b<Context, ContextWrapper> {

        /* renamed from: a */
        final /* synthetic */ FilterBoxListView f82672a;

        C31648e(FilterBoxListView filterBoxListView) {
            this.f82672a = filterBoxListView;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((Context) obj, "it");
            return new ContextWrapper(this.f82672a.getContext());
        }
    }

    public final void setCallback(C31646c cVar) {
        this.f82648b = cVar;
    }

    public final void setThemeProvider(C52671b<? super Context, ? extends ContextWrapper> bVar) {
        C52711k.m112240b(bVar, "themeWrapperProvider");
        this.f82651e = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo64549a(EffectCategoryModel effectCategoryModel) {
        List list;
        C1322a adapter = this.f82653l.getAdapter();
        if (adapter != null) {
            C31636a aVar = (C31636a) adapter;
            if (effectCategoryModel == null) {
                list = C52575l.m112097a();
            } else {
                List<? extends C52847n<? extends EffectCategoryModel, ? extends List<C31657c>>> list2 = this.f82647a;
                if (list2 != null) {
                    list = C31483a.m73317a(list2, effectCategoryModel);
                } else {
                    list = null;
                }
                if (list == null) {
                    C52711k.m112234a();
                }
            }
            aVar.mo3925a(list);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.DetailAdapter");
    }

    public final void setCategoryMap(List<? extends C52847n<? extends EffectCategoryModel, ? extends List<C31489b>>> list) {
        C52711k.m112240b(list, "categoryMap");
        setState(0);
        Iterable<C52847n> iterable = list;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (C52847n nVar : iterable) {
            Object first = nVar.getFirst();
            Iterable<C31489b> iterable2 = (Iterable) nVar.getSecond();
            Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable2, 10));
            for (C31489b cVar : iterable2) {
                arrayList2.add(new C31657c(cVar, false, 2, null));
            }
            arrayList.add(C52856t.m112465a(first, (List) arrayList2));
        }
        this.f82647a = (List) arrayList;
        C31642b bVar = new C31642b();
        this.f82652k.setAdapter(bVar);
        bVar.mo3925a(C31483a.m73316a(list));
        mo64549a((EffectCategoryModel) C52575l.m112140f(C31483a.m73316a(list)));
    }

    public FilterBoxListView(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
        Context context2 = getContext();
        C52711k.m112236a((Object) context2, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView = new AVDmtPanelRecyleView(context2, null, 0, 6, null);
        aVDmtPanelRecyleView.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView.getContext(), 1, false));
        aVDmtPanelRecyleView.setAdapter(new C31642b());
        Context context3 = aVDmtPanelRecyleView.getContext();
        C52711k.m112236a((Object) context3, "context");
        aVDmtPanelRecyleView.mo4798a((C1331h) new C31647d((int) C50204h.m108364a(context3, 8.0f)));
        this.f82652k = aVDmtPanelRecyleView;
        this.f82652k.setSecondPanel(true);
        Context context4 = getContext();
        C52711k.m112236a((Object) context4, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = new AVDmtPanelRecyleView(context4, null, 0, 6, null);
        aVDmtPanelRecyleView2.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView2.getContext(), 1, false));
        aVDmtPanelRecyleView2.setAdapter(new C31636a());
        Context context5 = aVDmtPanelRecyleView2.getContext();
        C52711k.m112236a((Object) context5, "context");
        aVDmtPanelRecyleView2.mo4798a((C1331h) new C31647d((int) C50204h.m108364a(context5, 8.0f)));
        this.f82653l = aVDmtPanelRecyleView2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(this.f82652k, new LayoutParams(0, -1, 1.0f));
        linearLayout.addView(this.f82653l, new LayoutParams(0, -1, 2.0f));
        addView(linearLayout);
        setState(1);
        int b = C46788b.f118235d.mo94011b(false);
        Context context6 = getContext();
        C52711k.m112236a((Object) context6, "context");
        this.f82649c = C46788b.m101632a(context6.getResources().getDrawable(R.drawable.a2e), b);
        Context context7 = getContext();
        C52711k.m112236a((Object) context7, "context");
        this.f82650d = context7.getResources().getDrawable(R.drawable.a1y);
    }

    /* renamed from: a */
    public final void mo64548a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        super.mo64548a(i, i2);
        int i6 = 0;
        if (this.f125852f != null) {
            View view = this.f125852f;
            C52711k.m112236a((Object) view, "mContentView");
            if (i2 == 0) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            view.setVisibility(i5);
        }
        View view2 = this.f125853g;
        C52711k.m112236a((Object) view2, "mLoadingView");
        if (i2 == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        View view3 = this.f125855i;
        C52711k.m112236a((Object) view3, "mErrorView");
        if (i2 == 2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view3.setVisibility(i4);
        View view4 = this.f125854h;
        C52711k.m112236a((Object) view4, "mEmptyView");
        if (i2 != 3) {
            i6 = 8;
        }
        view4.setVisibility(i6);
    }

    public FilterBoxListView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet);
        Context context2 = getContext();
        C52711k.m112236a((Object) context2, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView = new AVDmtPanelRecyleView(context2, null, 0, 6, null);
        aVDmtPanelRecyleView.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView.getContext(), 1, false));
        aVDmtPanelRecyleView.setAdapter(new C31642b());
        Context context3 = aVDmtPanelRecyleView.getContext();
        C52711k.m112236a((Object) context3, "context");
        aVDmtPanelRecyleView.mo4798a((C1331h) new C31647d((int) C50204h.m108364a(context3, 8.0f)));
        this.f82652k = aVDmtPanelRecyleView;
        this.f82652k.setSecondPanel(true);
        Context context4 = getContext();
        C52711k.m112236a((Object) context4, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = new AVDmtPanelRecyleView(context4, null, 0, 6, null);
        aVDmtPanelRecyleView2.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView2.getContext(), 1, false));
        aVDmtPanelRecyleView2.setAdapter(new C31636a());
        Context context5 = aVDmtPanelRecyleView2.getContext();
        C52711k.m112236a((Object) context5, "context");
        aVDmtPanelRecyleView2.mo4798a((C1331h) new C31647d((int) C50204h.m108364a(context5, 8.0f)));
        this.f82653l = aVDmtPanelRecyleView2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(this.f82652k, new LayoutParams(0, -1, 1.0f));
        linearLayout.addView(this.f82653l, new LayoutParams(0, -1, 2.0f));
        addView(linearLayout);
        setState(1);
        int b = C46788b.f118235d.mo94011b(false);
        Context context6 = getContext();
        C52711k.m112236a((Object) context6, "context");
        this.f82649c = C46788b.m101632a(context6.getResources().getDrawable(R.drawable.a2e), b);
        Context context7 = getContext();
        C52711k.m112236a((Object) context7, "context");
        this.f82650d = context7.getResources().getDrawable(R.drawable.a1y);
    }

    /* renamed from: a */
    public final View mo64547a(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        return new AVLoadingLayout(context, attributeSet, i);
    }

    /* renamed from: b */
    public final View mo64550b(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        return new Space(context);
    }

    /* renamed from: c */
    public final View mo64551c(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        return new Space(context);
    }

    public FilterBoxListView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet, i);
        Context context2 = getContext();
        C52711k.m112236a((Object) context2, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView = new AVDmtPanelRecyleView(context2, null, 0, 6, null);
        aVDmtPanelRecyleView.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView.getContext(), 1, false));
        aVDmtPanelRecyleView.setAdapter(new C31642b());
        Context context3 = aVDmtPanelRecyleView.getContext();
        C52711k.m112236a((Object) context3, "context");
        aVDmtPanelRecyleView.mo4798a((C1331h) new C31647d((int) C50204h.m108364a(context3, 8.0f)));
        this.f82652k = aVDmtPanelRecyleView;
        this.f82652k.setSecondPanel(true);
        Context context4 = getContext();
        C52711k.m112236a((Object) context4, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = new AVDmtPanelRecyleView(context4, null, 0, 6, null);
        aVDmtPanelRecyleView2.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView2.getContext(), 1, false));
        aVDmtPanelRecyleView2.setAdapter(new C31636a());
        Context context5 = aVDmtPanelRecyleView2.getContext();
        C52711k.m112236a((Object) context5, "context");
        aVDmtPanelRecyleView2.mo4798a((C1331h) new C31647d((int) C50204h.m108364a(context5, 8.0f)));
        this.f82653l = aVDmtPanelRecyleView2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(this.f82652k, new LayoutParams(0, -1, 1.0f));
        linearLayout.addView(this.f82653l, new LayoutParams(0, -1, 2.0f));
        addView(linearLayout);
        setState(1);
        int b = C46788b.f118235d.mo94011b(false);
        Context context6 = getContext();
        C52711k.m112236a((Object) context6, "context");
        this.f82649c = C46788b.m101632a(context6.getResources().getDrawable(R.drawable.a2e), b);
        Context context7 = getContext();
        C52711k.m112236a((Object) context7, "context");
        this.f82650d = context7.getResources().getDrawable(R.drawable.a1y);
    }
}
