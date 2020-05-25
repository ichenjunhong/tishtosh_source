package com.p683ss.android.ugc.aweme.property;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40763b;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.property.d */
public final class C40777d extends C1322a<C40779b> {

    /* renamed from: d */
    public static final C40784f f103889d = new C40784f(null);

    /* renamed from: a */
    public C52671b<? super String, C52860x> f103890a;

    /* renamed from: b */
    C40803n f103891b;

    /* renamed from: c */
    C40829x f103892c;

    /* renamed from: com.ss.android.ugc.aweme.property.d$a */
    public static final class C40778a extends C40779b {
        public C40778a(ViewGroup viewGroup) {
            C52711k.m112240b(viewGroup, "parent");
            Context context = viewGroup.getContext();
            C52711k.m112236a((Object) context, "parent.context");
            AVABEffectInHouseView aVABEffectInHouseView = new AVABEffectInHouseView(context, null, 0, 6, null);
            super(aVABEffectInHouseView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.d$b */
    public static class C40779b extends C1352v {

        /* renamed from: a */
        public final View f103893a;

        public C40779b(View view) {
            C52711k.m112240b(view, "itemView");
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            linearLayout.setOrientation(1);
            super(linearLayout);
            this.f103893a = view;
            View view2 = this.itemView;
            if (view2 != null) {
                ((ViewGroup) view2).addView(view);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.d$c */
    public static final class C40780c extends C40779b {
        public C40780c(ViewGroup viewGroup) {
            C52711k.m112240b(viewGroup, "parent");
            super(new AVABRangeView(viewGroup.getContext()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.d$d */
    public static final class C40781d extends C40779b {
        public C40781d(ViewGroup viewGroup) {
            C52711k.m112240b(viewGroup, "parent");
            super(new AVABStateView(viewGroup.getContext()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.d$e */
    public static final class C40782e extends C40779b {

        /* renamed from: com.ss.android.ugc.aweme.property.d$e$a */
        static final class C40783a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C40788g f103894a;

            C40783a(C40788g gVar) {
                this.f103894a = gVar;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C52671b<View, C52860x> bVar = this.f103894a.f103906g;
                C52711k.m112236a((Object) view, "it");
                bVar.invoke(view);
            }
        }

        public C40782e(Context context) {
            C52711k.m112240b(context, "context");
            TextView textView = new TextView(context);
            int a = C23728o.m58241a(16.0d);
            textView.setBackgroundColor(-1);
            textView.setTextColor(-16777216);
            textView.setTextSize(1, 15.0f);
            textView.setPadding(a, 0, a, a);
            super(textView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.d$f */
    public static final class C40784f {
        private C40784f() {
        }

        public /* synthetic */ C40784f(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.d$g */
    static final class C40785g implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C40777d f103895a;

        /* renamed from: b */
        final /* synthetic */ C40776c f103896b;

        C40785g(C40777d dVar, C40776c cVar) {
            this.f103895a = dVar;
            this.f103896b = cVar;
        }

        public final boolean onLongClick(View view) {
            C52671b<? super String, C52860x> bVar = this.f103895a.f103890a;
            if (bVar == null) {
                C52711k.m112237a("showDetailMsg");
            }
            bVar.invoke(this.f103896b.f103886d);
            return true;
        }
    }

    public final int getItemCount() {
        return this.f103891b.f103931a;
    }

    public final int getItemViewType(int i) {
        C40776c a = this.f103891b.mo83125a(i);
        if (a instanceof C40788g) {
            return 3;
        }
        if (a instanceof C40775b) {
            return 2;
        }
        C40763b type = a.f103887e.type();
        if (type != null && C40786e.f103897a[type.ordinal()] == 1) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    private final void m90206a(View view, C40776c cVar) {
        view.setOnLongClickListener(new C40785g(this, cVar));
    }

    public C40777d(C40803n nVar, C40829x xVar) {
        C52711k.m112240b(nVar, "showedAbItemsData");
        C52711k.m112240b(xVar, "languageType");
        this.f103891b = nVar;
        this.f103892c = xVar;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C40779b bVar;
        C52711k.m112240b(viewGroup, "parent");
        switch (i) {
            case 0:
                bVar = new C40780c(viewGroup);
                break;
            case 1:
                bVar = new C40781d(viewGroup);
                break;
            case 2:
                bVar = new C40778a(viewGroup);
                break;
            case 3:
                Context context = viewGroup.getContext();
                C52711k.m112236a((Object) context, "parent.context");
                bVar = new C40782e(context);
                break;
            default:
                throw new AssertionError();
        }
        return bVar;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C40779b bVar = (C40779b) vVar;
        C52711k.m112240b(bVar, "holder");
        C40776c a = this.f103891b.mo83125a(i);
        String b = a.mo83094b();
        String str = a.f103885c;
        if (a instanceof C40788g) {
            C40782e eVar = (C40782e) bVar;
            C40788g gVar = (C40788g) a;
            C52711k.m112240b(gVar, "itemBean");
            View view = eVar.f103893a;
            if (view != null) {
                TextView textView = (TextView) view;
                textView.setText(gVar.f103905a);
                textView.setOnClickListener(new C40783a(gVar));
            } else {
                throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
            }
        } else if (a instanceof C40775b) {
            C40778a aVar = (C40778a) bVar;
            C40775b bVar2 = (C40775b) a;
            C52711k.m112240b(bVar2, "itemBean");
            View view2 = aVar.f103893a;
            if (view2 != null) {
                ((AVABEffectInHouseView) view2).setABDetailItem(bVar2);
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.property.AVABEffectInHouseView");
            }
        } else {
            C40763b type = a.f103887e.type();
            if (type != null && C40786e.f103898b[type.ordinal()] == 1) {
                View view3 = bVar.f103893a;
                if (view3 != null) {
                    AVABStateView aVABStateView = (AVABStateView) view3;
                    aVABStateView.mo83047a(a.f103887e, b);
                    if (this.f103892c == C40829x.EngAndChi) {
                        aVABStateView.setSubText(str);
                    } else {
                        aVABStateView.setSubText("");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.property.AVABStateView");
                }
            } else {
                View view4 = bVar.f103893a;
                if (view4 != null) {
                    AVABRangeView aVABRangeView = (AVABRangeView) view4;
                    aVABRangeView.mo83040a(a.f103887e, b);
                    if (this.f103892c == C40829x.EngAndChi) {
                        aVABRangeView.setSubText(str);
                    } else {
                        aVABRangeView.setSubText("");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.property.AVABRangeView");
                }
            }
        }
        m90206a(bVar.f103893a, a);
    }
}
