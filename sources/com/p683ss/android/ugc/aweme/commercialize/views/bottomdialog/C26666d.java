package com.p683ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnShowListener;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.model.C26106aa;
import com.p683ss.android.ugc.aweme.commercialize.model.C26107ab;
import com.p683ss.android.ugc.aweme.commercialize.views.bottomdialog.C26663c.C26664a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d */
public final class C26666d extends C26652a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f70269a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26666d.class), "mListContainer", "getMListContainer()Landroid/widget/LinearLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26666d.class), "mConfirmView", "getMConfirmView()Lcom/ss/android/ugc/aweme/commercialize/views/bottomdialog/AdBottomDialogConfirmView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26666d.class), "mCancelView", "getMCancelView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: f */
    public static final C26668b f70270f = new C26668b(null);

    /* renamed from: b */
    public final List<RecyclerView> f70271b = new ArrayList();

    /* renamed from: c */
    public final List<C26663c> f70272c = new ArrayList();

    /* renamed from: d */
    public C26667a f70273d;

    /* renamed from: e */
    public final C26107ab f70274e;

    /* renamed from: g */
    private final C52668f f70275g = C52732g.m112285a(new C26676j(this));

    /* renamed from: h */
    private final C52668f f70276h = C52732g.m112285a(new C26675i(this));

    /* renamed from: i */
    private final C52668f f70277i = C52732g.m112285a(new C26674h(this));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$a */
    public interface C26667a {
        /* renamed from: a */
        void mo54336a();

        /* renamed from: a */
        void mo54337a(List<Integer> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$b */
    public static final class C26668b {
        private C26668b() {
        }

        public /* synthetic */ C26668b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$c */
    public static final class C26669c implements C26664a {

        /* renamed from: a */
        final /* synthetic */ C26663c f70278a;

        /* renamed from: b */
        final /* synthetic */ C26666d f70279b;

        /* renamed from: c */
        final /* synthetic */ int f70280c;

        /* renamed from: a */
        public final void mo54489a(int i) {
            if (this.f70280c != this.f70279b.f70272c.size() - 1 || i == -1) {
                AdBottomDialogConfirmView b = this.f70279b.mo42942b();
                if (b != null) {
                    b.setClickable(false);
                }
                int i2 = this.f70279b.f70274e.f68914b;
                for (int i3 = this.f70280c + 1; i3 < i2; i3++) {
                    C26663c cVar = (C26663c) this.f70279b.f70272c.get(i3);
                    cVar.f70267c.clear();
                    cVar.f70265a = -1;
                    if (i3 != this.f70280c + 1 || i == -1) {
                        ((RecyclerView) this.f70279b.f70271b.get(i3)).setVisibility(4);
                    } else {
                        List<C26106aa> list = cVar.f70267c;
                        List<C26106aa> list2 = ((C26106aa) this.f70278a.f70267c.get(i)).f68912b;
                        if (list2 == null) {
                            list2 = C52575l.m112097a();
                        }
                        list.addAll(list2);
                        ((RecyclerView) this.f70279b.f70271b.get(i3)).setVisibility(0);
                    }
                    cVar.notifyDataSetChanged();
                }
                return;
            }
            AdBottomDialogConfirmView b2 = this.f70279b.mo42942b();
            if (b2 != null) {
                b2.setClickable(true);
            }
        }

        C26669c(C26663c cVar, C26666d dVar, int i) {
            this.f70278a = cVar;
            this.f70279b = dVar;
            this.f70280c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$d */
    static final class C26670d implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C26666d f70281a;

        C26670d(C26666d dVar) {
            this.f70281a = dVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            C26666d dVar = this.f70281a;
            C26663c cVar = (C26663c) dVar.f70272c.get(0);
            cVar.f70267c.addAll(dVar.f70274e.f68915c);
            cVar.notifyDataSetChanged();
            ((RecyclerView) dVar.f70271b.get(0)).setVisibility(0);
            C26666d dVar2 = this.f70281a;
            List<Integer> list = dVar2.f70274e.f68916d;
            if (list != null && (!list.isEmpty())) {
                int min = Math.min(list.size(), dVar2.f70272c.size());
                for (int i = 0; i < min; i++) {
                    if (((Number) list.get(i)).intValue() >= 0 && ((Number) list.get(i)).intValue() < ((C26663c) dVar2.f70272c.get(i)).f70267c.size()) {
                        ((C26663c) dVar2.f70272c.get(i)).mo54488a(((Number) list.get(i)).intValue());
                        ((RecyclerView) dVar2.f70271b.get(i)).mo4814b(((Number) list.get(i)).intValue());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$e */
    static final class C26671e implements OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C26666d f70282a;

        C26671e(C26666d dVar) {
            this.f70282a = dVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C26667a aVar = this.f70282a.f70273d;
            if (aVar != null) {
                aVar.mo54336a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$f */
    static final class C26672f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C26666d f70283a;

        C26672f(C26666d dVar) {
            this.f70283a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Iterable<C26663c> iterable = this.f70283a.f70272c;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (C26663c cVar : iterable) {
                arrayList.add(Integer.valueOf(cVar.f70265a));
            }
            List e = C52575l.m112138e((Iterable<? extends T>) (List) arrayList);
            C26667a aVar = this.f70283a.f70273d;
            if (aVar != null) {
                aVar.mo54337a(e);
            }
            this.f70283a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$g */
    static final class C26673g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C26666d f70284a;

        C26673g(C26666d dVar) {
            this.f70284a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26667a aVar = this.f70284a.f70273d;
            if (aVar != null) {
                aVar.mo54336a();
            }
            this.f70284a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$h */
    static final class C26674h extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C26666d f70285a;

        C26674h(C26666d dVar) {
            this.f70285a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f70285a.findViewById(R.id.q7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$i */
    static final class C26675i extends C52712l implements C52670a<AdBottomDialogConfirmView> {

        /* renamed from: a */
        final /* synthetic */ C26666d f70286a;

        C26675i(C26666d dVar) {
            this.f70286a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (AdBottomDialogConfirmView) this.f70286a.findViewById(R.id.yn);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$j */
    static final class C26676j extends C52712l implements C52670a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C26666d f70287a;

        C26676j(C26666d dVar) {
            this.f70287a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LinearLayout) this.f70287a.findViewById(R.id.enq);
        }
    }

    /* renamed from: c */
    private final LinearLayout m64480c() {
        return (LinearLayout) this.f70275g.getValue();
    }

    /* renamed from: a */
    public final int mo54484a() {
        return R.layout.b9a;
    }

    /* renamed from: b */
    public final AdBottomDialogConfirmView mo42942b() {
        return (AdBottomDialogConfirmView) this.f70276h.getValue();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AdBottomDialogConfirmView b = mo42942b();
        if (b != null) {
            b.setOnClickListener(new C26672f(this));
            b.setClickable(false);
        }
        DmtTextView dmtTextView = (DmtTextView) this.f70277i.getValue();
        if (dmtTextView != null) {
            dmtTextView.setOnClickListener(new C26673g(this));
        }
        int i = this.f70274e.f68914b;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                View view = new View(getContext());
                view.setBackgroundColor(Color.parseColor("#1e000000"));
                view.setLayoutParams(new LayoutParams(C23728o.m58241a(0.5d), -1));
                LinearLayout c = m64480c();
                if (c != null) {
                    c.addView(view);
                }
            }
            RecyclerView recyclerView = new RecyclerView(getContext());
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setVisibility(4);
            recyclerView.setLayoutParams(new LayoutParams(0, -1, 1.0f));
            List arrayList = new ArrayList();
            boolean z = true;
            if (this.f70274e.f68914b != 1) {
                z = false;
            }
            C26663c cVar = new C26663c(arrayList, z);
            cVar.f70266b = new C26669c(cVar, this, i2);
            recyclerView.setAdapter(cVar);
            LinearLayout c2 = m64480c();
            if (c2 != null) {
                c2.addView(recyclerView);
            }
            this.f70271b.add(recyclerView);
            this.f70272c.add(cVar);
        }
        setOnShowListener(new C26670d(this));
        setOnCancelListener(new C26671e(this));
    }

    public C26666d(Context context, C26107ab abVar) {
        C52711k.m112240b(abVar, "params");
        super(context);
        this.f70274e = abVar;
    }
}
