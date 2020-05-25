package com.p683ss.android.ugc.aweme.journey;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.google.gson.C17971f;
import com.google.gson.C17978g;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1417h.C23540d;
import com.p683ss.android.ugc.aweme.base.utils.C23727n;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.i18n.language.p1806b.C33122m;
import com.p683ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager;
import com.p683ss.android.ugc.aweme.language.C35834e;
import com.p683ss.android.ugc.aweme.language.I18nManagerService;
import com.p683ss.android.ugc.aweme.main.C36634ec;
import com.p683ss.android.ugc.aweme.user.C47549c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52725c;

/* renamed from: com.ss.android.ugc.aweme.journey.d */
public final class C35725d extends C23526a {

    /* renamed from: a */
    public int f91712a = 1;

    /* renamed from: b */
    public C35767m f91713b;

    /* renamed from: c */
    public List<C35777q> f91714c;

    /* renamed from: d */
    public long f91715d = System.currentTimeMillis();

    /* renamed from: e */
    public long f91716e = System.currentTimeMillis();

    /* renamed from: j */
    public long f91717j;

    /* renamed from: k */
    public boolean f91718k;

    /* renamed from: l */
    public boolean f91719l;

    /* renamed from: m */
    public Runnable f91720m;

    /* renamed from: n */
    public boolean f91721n;

    /* renamed from: o */
    public final String f91722o = "done";

    /* renamed from: p */
    public final String f91723p = "male";

    /* renamed from: q */
    public final String f91724q = "female";

    /* renamed from: r */
    public final String f91725r = "prefer not to say";

    /* renamed from: s */
    public final String f91726s = "others";

    /* renamed from: t */
    public TextView f91727t;

    /* renamed from: u */
    public RecyclerView f91728u;

    /* renamed from: v */
    private final String f91729v = "show_gender_selection";

    /* renamed from: w */
    private final String f91730w = "exit_gender_selection";

    /* renamed from: x */
    private final String f91731x = "gender";

    /* renamed from: y */
    private final String f91732y = "exit_method";

    /* renamed from: z */
    private HashMap f91733z;

    /* renamed from: com.ss.android.ugc.aweme.journey.d$a */
    static final class C35726a extends C52712l implements C52671b<C35834e, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35725d f91734a;

        C35726a(C35725d dVar) {
            this.f91734a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            C35834e eVar = (C35834e) obj;
            C35725d dVar = this.f91734a;
            if (eVar != null) {
                z = true;
            } else {
                z = false;
            }
            dVar.mo74334a(z);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$b */
    static final class C35727b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35725d f91735a;

        C35727b(C35725d dVar) {
            this.f91735a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f91735a.f91718k = true;
            C1322a adapter = this.f91735a.mo74331a().getAdapter();
            if (adapter != null) {
                C35834e eVar = ((C35716a) adapter).f91689a;
                if (eVar == null) {
                    C52711k.m112234a();
                }
                C35725d dVar = this.f91735a;
                String g = eVar.mo70127g();
                C52711k.m112236a((Object) g, "selectItem.isO639");
                dVar.mo74337b(false, g);
                FragmentActivity activity = this.f91735a.getActivity();
                if (activity != null) {
                    NewUserJourneyActivity newUserJourneyActivity = (NewUserJourneyActivity) activity;
                    newUserJourneyActivity.f91684c = eVar;
                    newUserJourneyActivity.m80702a((Boolean) null);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.NewUserJourneyActivity");
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.ChooseAppLanguageAdapter");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$c */
    static final class C35728c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35725d f91736a;

        C35728c(C35725d dVar) {
            this.f91736a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f91736a.f91718k = true;
            this.f91736a.mo74337b(false, "cancel");
            C47718bf.m103288a(new C35790u(null, 1, null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$d */
    static final class C35729d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35725d f91737a;

        /* renamed from: b */
        final /* synthetic */ C35719b f91738b;

        /* renamed from: c */
        final /* synthetic */ C36634ec f91739c;

        C35729d(C35725d dVar, C35719b bVar, C36634ec ecVar) {
            this.f91737a = dVar;
            this.f91738b = bVar;
            this.f91739c = ecVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52711k.m112236a((Object) view, "it");
            if (!C35747e.m80715a(view.getContext())) {
                C10691a.m21542b(view.getContext(), (int) R.string.cg1).mo19066a();
                return;
            }
            this.f91737a.f91718k = true;
            if (!this.f91738b.f91697a.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                for (Number intValue : this.f91738b.f91697a) {
                    int intValue2 = intValue.intValue();
                    C35767m mVar = this.f91737a.f91713b;
                    if (mVar == null) {
                        C52711k.m112234a();
                    }
                    List<C35765k> list = mVar.f91862a;
                    if (list == null) {
                        C52711k.m112234a();
                    }
                    sb.append(((C35765k) list.get(intValue2)).f91857a);
                    if (i != this.f91738b.f91697a.size() - 1) {
                        sb.append(",");
                    }
                    i++;
                }
                String sb2 = sb.toString();
                C52711k.m112236a((Object) sb2, "languageList.toString()");
                this.f91737a.mo74335a(false, sb2);
                this.f91739c.mo75723a(sb2);
            }
            C47718bf.m103288a(new C35790u(Boolean.valueOf(false)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$e */
    static final class C35730e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35725d f91740a;

        C35730e(C35725d dVar) {
            this.f91740a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f91740a.f91718k = true;
            this.f91740a.mo74335a(false, "cancel");
            C47718bf.m103288a(new C35790u(Boolean.valueOf(true)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$f */
    static final class C35731f extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35725d f91741a;

        C35731f(C35725d dVar) {
            this.f91741a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (intValue == 1) {
                this.f91741a.mo74334a(true);
            } else if (intValue == 0) {
                this.f91741a.mo74334a(false);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$g */
    static final class C35732g extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35725d f91742a;

        C35732g(C35725d dVar) {
            this.f91742a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            C35725d dVar = this.f91742a;
            if (num != null) {
                z = true;
            } else {
                z = false;
            }
            dVar.mo74334a(z);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$h */
    static final class C35733h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35725d f91743a;

        C35733h(C35725d dVar) {
            this.f91743a = dVar;
        }

        public final void onClick(View view) {
            int i;
            String str;
            ClickInstrumentation.onClick(view);
            C52711k.m112236a((Object) view, "it");
            if (!C35748f.m80716a(view.getContext())) {
                C10691a.m21542b(view.getContext(), (int) R.string.cg1).mo19066a();
                return;
            }
            this.f91743a.f91718k = true;
            C1322a adapter = this.f91743a.mo74331a().getAdapter();
            Integer num = null;
            if (!(adapter instanceof C35722c)) {
                adapter = null;
            }
            C35722c cVar = (C35722c) adapter;
            if (cVar != null) {
                num = cVar.f91704a;
            }
            if (num != null) {
                if (num.intValue() == 0) {
                    i = 2;
                } else if (num.intValue() == 1) {
                    i = 1;
                } else if (num.intValue() == 2) {
                    i = 3;
                } else {
                    num.intValue();
                    i = 0;
                }
                C35764j.m80900a().uploadGender(Integer.valueOf(i)).mo6529b(C2168a.m6521b()).mo6505a((C1710e<? super T>) C357341.f91744a, (C1710e<? super Throwable>) C357352.f91745a);
                if (num.intValue() == 0) {
                    str = this.f91743a.f91724q;
                } else if (num.intValue() == 1) {
                    str = this.f91743a.f91723p;
                } else if (num.intValue() == 2) {
                    str = this.f91743a.f91726s;
                } else {
                    str = this.f91743a.f91725r;
                }
                this.f91743a.mo74336b(this.f91743a.f91722o, str);
            }
            C47718bf.m103288a(new C35790u(Boolean.valueOf(false)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$i */
    static final class C35736i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35725d f91746a;

        C35736i(C35725d dVar) {
            this.f91746a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f91746a.f91718k = true;
            this.f91746a.mo74336b("skip", "");
            C47718bf.m103288a(new C35790u(Boolean.valueOf(true)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$j */
    public static final class C35737j extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C35725d f91747a;

        /* renamed from: b */
        final /* synthetic */ C52725c f91748b;

        /* renamed from: c */
        final /* synthetic */ C52725c f91749c;

        C35737j(C35725d dVar, C52725c cVar, C52725c cVar2) {
            this.f91747a = dVar;
            this.f91748b = cVar;
            this.f91749c = cVar2;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3;
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.f91748b.element += i2;
            if (i2 != 0 && this.f91747a.isViewValid()) {
                if (this.f91749c.element != -1) {
                    i3 = this.f91749c.element;
                } else {
                    this.f91749c.element = this.f91747a.mo74331a().computeVerticalScrollRange();
                    i3 = this.f91749c.element;
                }
                int height = this.f91747a.mo74331a().getHeight();
                int i4 = this.f91748b.element;
                int i5 = i3 - height;
                View a = this.f91747a.mo74332a((int) R.id.eu1);
                C52711k.m112236a((Object) a, "scroll_bar");
                float height2 = (((((float) i4) * 1.0f) / ((float) i5)) * ((float) (height - a.getHeight()))) + ((float) this.f91747a.mo74331a().getTop());
                View a2 = this.f91747a.mo74332a((int) R.id.eu1);
                C52711k.m112236a((Object) a2, "scroll_bar");
                a2.setY(height2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$k */
    static final class C35738k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35725d f91750a;

        /* renamed from: b */
        final /* synthetic */ C52670a f91751b;

        C35738k(C35725d dVar, C52670a aVar) {
            this.f91750a = dVar;
            this.f91751b = aVar;
        }

        public final void run() {
            if (this.f91750a.isViewValid() && this.f91750a.mo74331a().getAdapter() != null) {
                this.f91751b.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$l */
    static final class C35739l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35725d f91752a;

        /* renamed from: b */
        final /* synthetic */ C52671b f91753b;

        /* renamed from: c */
        final /* synthetic */ C52670a f91754c;

        C35739l(C35725d dVar, C52671b bVar, C52670a aVar) {
            this.f91752a = dVar;
            this.f91753b = bVar;
            this.f91754c = aVar;
        }

        public final void run() {
            if (this.f91752a.f91714c == null) {
                C35725d dVar = this.f91752a;
                Context context = this.f91752a.mo74331a().getContext();
                C52711k.m112236a((Object) context, "infoListView.context");
                dVar.f91714c = C35762i.m80899a(context);
                this.f91752a.f91719l = true;
            }
            this.f91752a.f91715d = System.currentTimeMillis();
            RecyclerView a = this.f91752a.mo74331a();
            List<C35777q> list = this.f91752a.f91714c;
            if (list == null) {
                C52711k.m112234a();
            }
            a.setAdapter(new C35759h(list, this.f91753b));
            this.f91752a.mo74331a().setVisibility(0);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f91752a.mo74332a((int) R.id.csv);
            C52711k.m112236a((Object) dmtStatusView, "status_view");
            dmtStatusView.setVisibility(8);
            C26890h.m65011a("show_interest_selection", new C23089d().mo47826a("is_default_interests_list", this.f91752a.f91719l ? 1 : 0).f61491a);
            this.f91752a.f91721n = true;
            C23727n.m58240b(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C35739l f91755a;

                {
                    this.f91755a = r1;
                }

                public final void run() {
                    if (this.f91755a.f91752a.isViewValid()) {
                        this.f91755a.f91754c.invoke();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$m */
    static final class C35741m implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35725d f91756a;

        C35741m(C35725d dVar) {
            this.f91756a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52711k.m112236a((Object) view, "it");
            if (!C35758g.m80898a(view.getContext())) {
                C10691a.m21542b(view.getContext(), (int) R.string.cg1).mo19066a();
                return;
            }
            this.f91756a.f91718k = true;
            C1322a adapter = this.f91756a.mo74331a().getAdapter();
            if (adapter != null) {
                List<Number> e = C52575l.m112138e((Iterable<? extends T>) ((C35759h) adapter).f91846a);
                JSONArray jSONArray = new JSONArray();
                LinkedList linkedList = new LinkedList();
                int i = 0;
                for (Number intValue : e) {
                    int intValue2 = intValue.intValue();
                    List<C35777q> list = this.f91756a.f91714c;
                    if (list == null) {
                        C52711k.m112234a();
                    }
                    C35777q qVar = (C35777q) list.get(intValue2);
                    C35777q qVar2 = r9;
                    C35777q qVar3 = new C35777q(qVar.f91887a, null, null, null, null, 24, null);
                    JSONObject jSONObject = new JSONObject();
                    i++;
                    jSONObject.put("select_rank", i).put("show_rank", intValue2 + 1).put("interest", qVar.f91887a);
                    jSONArray.put(jSONObject);
                    linkedList.add(qVar2);
                }
                C17971f d = new C17978g().mo34899c().mo34900d();
                C35791v vVar = new C35791v(linkedList, Integer.valueOf(C35781s.f91909n.mo74446j()), Integer.valueOf(C35781s.f91908m), Integer.valueOf((int) (((System.currentTimeMillis() - this.f91756a.f91715d) + this.f91756a.f91717j) / 1000)), null, 16, null);
                C35781s.f91901f = d.mo34889b(vVar);
                C35764j.m80900a().uploadInterest(C35781s.f91901f).mo6529b(C2168a.m6521b()).mo6505a((C1710e<? super T>) C357421.f91757a, (C1710e<? super Throwable>) C357432.f91758a);
                String jSONArray2 = jSONArray.toString();
                C52711k.m112236a((Object) jSONArray2, "mobJsonArray.toString()");
                this.f91756a.mo74333a("done", jSONArray2);
                C47718bf.m103288a(new C35790u(Boolean.valueOf(false)));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.InterestAdapter");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$n */
    static final class C35744n implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35725d f91759a;

        C35744n(C35725d dVar) {
            this.f91759a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f91759a.f91718k = true;
            this.f91759a.mo74333a("skip", "");
            C47718bf.m103288a(new C35790u(Boolean.valueOf(true)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$o */
    static final class C35745o extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35725d f91760a;

        C35745o(C35725d dVar) {
            this.f91760a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int computeVerticalScrollRange = this.f91760a.mo74331a().computeVerticalScrollRange();
            int height = this.f91760a.mo74331a().getHeight();
            if (computeVerticalScrollRange > height) {
                View a = this.f91760a.mo74332a((int) R.id.eu1);
                C52711k.m112236a((Object) a, "scroll_bar");
                a.getLayoutParams().height = (int) ((((float) this.f91760a.mo74331a().getHeight()) * (((float) height) + 0.0f)) / ((float) computeVerticalScrollRange));
                View a2 = this.f91760a.mo74332a((int) R.id.eu1);
                C52711k.m112236a((Object) a2, "scroll_bar");
                View a3 = this.f91760a.mo74332a((int) R.id.eu1);
                C52711k.m112236a((Object) a3, "scroll_bar");
                a2.setLayoutParams(a3.getLayoutParams());
                View a4 = this.f91760a.mo74332a((int) R.id.eu1);
                C52711k.m112236a((Object) a4, "scroll_bar");
                a4.setVisibility(0);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$p */
    static final class C35746p extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35725d f91761a;

        C35746p(C35725d dVar) {
            this.f91761a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (intValue == 1) {
                this.f91761a.mo74334a(true);
            } else if (intValue == 0) {
                this.f91761a.mo74334a(false);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final View mo74332a(int i) {
        if (this.f91733z == null) {
            this.f91733z = new HashMap();
        }
        View view = (View) this.f91733z.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f91733z.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final RecyclerView mo74331a() {
        RecyclerView recyclerView = this.f91728u;
        if (recyclerView == null) {
            C52711k.m112237a("infoListView");
        }
        return recyclerView;
    }

    public final void onResume() {
        super.onResume();
        this.f91715d = System.currentTimeMillis();
        this.f91716e = this.f91715d;
    }

    public final void onDestroyView() {
        if (this.f91720m != null) {
            C23727n.m58237a().removeCallbacks(this.f91720m);
        }
        super.onDestroyView();
        if (this.f91733z != null) {
            this.f91733z.clear();
        }
    }

    public final void onStop() {
        this.f91717j += System.currentTimeMillis() - this.f91715d;
        if (!this.f91721n && this.f91712a == 1) {
            C26890h.m65011a("show_interest_selection", new C23089d().mo47826a("is_default_interests_list", 1).f61491a);
            this.f91721n = true;
        }
        if (!this.f91718k) {
            switch (this.f91712a) {
                case 1:
                    mo74333a("background", "");
                    break;
                case 2:
                    mo74335a(true, "");
                    break;
                case 3:
                    mo74337b(true, "");
                    break;
                case 4:
                    mo74336b("background", "");
                    break;
            }
        }
        super.onStop();
    }

    /* renamed from: a */
    public final void mo74334a(boolean z) {
        TextView textView = this.f91727t;
        if (textView == null) {
            C52711k.m112237a("doneView");
        }
        textView.setEnabled(z);
        if (z) {
            TextView textView2 = this.f91727t;
            if (textView2 == null) {
                C52711k.m112237a("doneView");
            }
            textView2.setTextColor(getResources().getColor(R.color.it));
            return;
        }
        TextView textView3 = this.f91727t;
        if (textView3 == null) {
            C52711k.m112237a("doneView");
        }
        textView3.setTextColor(getResources().getColor(R.color.axr));
    }

    /* renamed from: b */
    public final void mo74336b(String str, String str2) {
        C26890h.m65011a(this.f91730w, new C23089d().mo47829a(this.f91732y, str).mo47829a(this.f91731x, str2).mo47827a("stay_time", System.currentTimeMillis() - this.f91716e).f61491a);
    }

    /* renamed from: b */
    public final void mo74337b(boolean z, String str) {
        if (!z) {
            C26890h.m65011a("choose_language_popup", new C23089d().mo47829a("enter_from", "new_user_journey").mo47829a("language_type", str).f61491a);
        }
        C26890h.m65011a("language_popup_duration", new C23089d().mo47829a("enter_from", "new_user_journey").mo47827a("duration", System.currentTimeMillis() - this.f91716e).f61491a);
    }

    /* renamed from: a */
    public final void mo74333a(String str, String str2) {
        C23089d a = C23089d.m56640a().mo47827a("stay_time", System.currentTimeMillis() - this.f91716e);
        if (!TextUtils.isEmpty(str2)) {
            a.mo47829a("interests_list", str2);
        }
        if (isViewValid()) {
            RecyclerView recyclerView = this.f91728u;
            if (recyclerView == null) {
                C52711k.m112237a("infoListView");
            }
            if (recyclerView.getAdapter() != null) {
                StringBuilder sb = new StringBuilder();
                RecyclerView recyclerView2 = this.f91728u;
                if (recyclerView2 == null) {
                    C52711k.m112237a("infoListView");
                }
                C1332i layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    int m = ((FlexboxLayoutManager) layoutManager).mo74378m();
                    RecyclerView recyclerView3 = this.f91728u;
                    if (recyclerView3 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    C1322a adapter = recyclerView3.getAdapter();
                    if (adapter != null) {
                        C35759h hVar = (C35759h) adapter;
                        int i = 0;
                        if (m >= 0) {
                            while (true) {
                                sb.append(((C35777q) hVar.f91847b.get(i)).f91887a);
                                if (i != m) {
                                    sb.append(",");
                                }
                                if (i == m) {
                                    break;
                                }
                                i++;
                            }
                        }
                        a.mo47829a("interests_show_list", sb.toString());
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.InterestAdapter");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager");
                }
            }
        }
        C26890h.m65011a("exit_interest_selection", a.mo47829a("exit_method", str).f61491a);
    }

    /* renamed from: a */
    public final void mo74335a(boolean z, String str) {
        if (!z) {
            C26890h.m65011a("choose_content_language_popup", C23089d.m56640a().mo47829a("enter_from", "new_user_journey").mo47829a("language_type", str).f61491a);
        }
        C26890h.m65011a("popup_duration", C23089d.m56640a().mo47829a("enter_from", "new_user_journey").mo47827a("duration", System.currentTimeMillis() - this.f91716e).f61491a);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        CharSequence charSequence;
        String str;
        String str2;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        DmtTextView dmtTextView = (DmtTextView) mo74332a((int) R.id.e5r);
        C52711k.m112236a((Object) dmtTextView, "done");
        this.f91727t = dmtTextView;
        RecyclerView recyclerView = (RecyclerView) mo74332a((int) R.id.etf);
        C52711k.m112236a((Object) recyclerView, "rv");
        this.f91728u = recyclerView;
        RecyclerView recyclerView2 = this.f91728u;
        if (recyclerView2 == null) {
            C52711k.m112237a("infoListView");
        }
        String str3 = null;
        recyclerView2.setItemAnimator(null);
        switch (this.f91712a) {
            case 1:
                DmtTextView dmtTextView2 = (DmtTextView) mo74332a((int) R.id.title);
                C52711k.m112236a((Object) dmtTextView2, "title");
                dmtTextView2.setText(getString(R.string.gv_));
                DmtTextView dmtTextView3 = (DmtTextView) mo74332a((int) R.id.ck1);
                C52711k.m112236a((Object) dmtTextView3, "second_title");
                dmtTextView3.setText(getString(R.string.gue));
                View a = mo74332a((int) R.id.etn);
                C52711k.m112236a((Object) a, "rv_mask");
                a.setVisibility(0);
                RecyclerView recyclerView3 = this.f91728u;
                if (recyclerView3 == null) {
                    C52711k.m112237a("infoListView");
                }
                LayoutParams layoutParams = recyclerView3.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    RecyclerView recyclerView4 = this.f91728u;
                    if (recyclerView4 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    marginLayoutParams.topMargin = (int) C9432q.m18687b(recyclerView4.getContext(), 40.0f);
                    int i = marginLayoutParams.leftMargin;
                    RecyclerView recyclerView5 = this.f91728u;
                    if (recyclerView5 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    marginLayoutParams.leftMargin = i - ((int) C9432q.m18687b(recyclerView5.getContext(), 8.0f));
                    marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
                    C52725c cVar = new C52725c();
                    cVar.element = -1;
                    C52725c cVar2 = new C52725c();
                    cVar2.element = 0;
                    RecyclerView recyclerView6 = this.f91728u;
                    if (recyclerView6 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    recyclerView6.mo4801a((C1340m) new C35737j(this, cVar2, cVar));
                    C52670a oVar = new C35745o(this);
                    RecyclerView recyclerView7 = this.f91728u;
                    if (recyclerView7 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    recyclerView7.post(new C35738k(this, oVar));
                    RecyclerView recyclerView8 = this.f91728u;
                    if (recyclerView8 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    RecyclerView recyclerView9 = this.f91728u;
                    if (recyclerView9 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    recyclerView8.setLayoutManager(new FlexboxLayoutManager(recyclerView9.getContext()));
                    C52671b pVar = new C35746p(this);
                    if (this.f91714c != null) {
                        RecyclerView recyclerView10 = this.f91728u;
                        if (recyclerView10 == null) {
                            C52711k.m112237a("infoListView");
                        }
                        List<C35777q> list = this.f91714c;
                        if (list == null) {
                            C52711k.m112234a();
                        }
                        recyclerView10.setAdapter(new C35759h(list, pVar));
                        C26890h.m65011a("show_interest_selection", new C23089d().mo47826a("is_default_interests_list", this.f91719l ? 1 : 0).f61491a);
                        this.f91721n = true;
                    } else {
                        DmtStatusView dmtStatusView = (DmtStatusView) mo74332a((int) R.id.csv);
                        DmtStatusView dmtStatusView2 = (DmtStatusView) mo74332a((int) R.id.csv);
                        C52711k.m112236a((Object) dmtStatusView2, "status_view");
                        dmtStatusView.setBuilder(C10719a.m21676a(dmtStatusView2.getContext()));
                        dmtStatusView.mo19212f();
                        dmtStatusView.setVisibility(0);
                        RecyclerView recyclerView11 = this.f91728u;
                        if (recyclerView11 == null) {
                            C52711k.m112237a("infoListView");
                        }
                        recyclerView11.setVisibility(8);
                        this.f91720m = new C35739l(this, pVar, oVar);
                        C23727n.m58239a(this.f91720m, 2000);
                    }
                    TextView textView = this.f91727t;
                    if (textView == null) {
                        C52711k.m112237a("doneView");
                    }
                    textView.setOnClickListener(new C35741m(this));
                    ((DmtTextView) mo74332a((int) R.id.cp4)).setOnClickListener(new C35744n(this));
                    break;
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            case 2:
                DmtTextView dmtTextView4 = (DmtTextView) mo74332a((int) R.id.title);
                C52711k.m112236a((Object) dmtTextView4, "title");
                C35767m mVar = this.f91713b;
                if (mVar == null) {
                    C52711k.m112234a();
                }
                C35766l lVar = mVar.f91863b;
                if (lVar != null) {
                    charSequence = lVar.f91860a;
                } else {
                    charSequence = null;
                }
                dmtTextView4.setText(charSequence);
                DmtTextView dmtTextView5 = (DmtTextView) mo74332a((int) R.id.ck1);
                C52711k.m112236a((Object) dmtTextView5, "second_title");
                C35767m mVar2 = this.f91713b;
                if (mVar2 == null) {
                    C52711k.m112234a();
                }
                C35766l lVar2 = mVar2.f91863b;
                if (lVar2 != null) {
                    str3 = lVar2.f91861b;
                }
                dmtTextView5.setText(str3);
                RecyclerView recyclerView12 = this.f91728u;
                if (recyclerView12 == null) {
                    C52711k.m112237a("infoListView");
                }
                LayoutParams layoutParams2 = recyclerView12.getLayoutParams();
                if (layoutParams2 != null) {
                    MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
                    RecyclerView recyclerView13 = this.f91728u;
                    if (recyclerView13 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    marginLayoutParams2.topMargin = (int) C9432q.m18687b(recyclerView13.getContext(), 24.0f);
                    int i2 = marginLayoutParams2.leftMargin;
                    RecyclerView recyclerView14 = this.f91728u;
                    if (recyclerView14 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    marginLayoutParams2.leftMargin = i2 - ((int) C9432q.m18687b(recyclerView14.getContext(), 4.0f));
                    marginLayoutParams2.rightMargin = marginLayoutParams2.leftMargin;
                    C36634ec ecVar = new C36634ec();
                    C35767m mVar3 = this.f91713b;
                    if (mVar3 == null) {
                        C52711k.m112234a();
                    }
                    List<C35765k> list2 = mVar3.f91862a;
                    if (list2 == null) {
                        C52711k.m112234a();
                    }
                    C35719b bVar = new C35719b(list2, new C35731f(this));
                    RecyclerView recyclerView15 = this.f91728u;
                    if (recyclerView15 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    RecyclerView recyclerView16 = this.f91728u;
                    if (recyclerView16 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    recyclerView15.setLayoutManager(new GridLayoutManager(recyclerView16.getContext(), 2));
                    RecyclerView recyclerView17 = this.f91728u;
                    if (recyclerView17 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    recyclerView17.setAdapter(bVar);
                    TextView textView2 = this.f91727t;
                    if (textView2 == null) {
                        C52711k.m112237a("doneView");
                    }
                    textView2.setOnClickListener(new C35729d(this, bVar, ecVar));
                    ((DmtTextView) mo74332a((int) R.id.cp4)).setOnClickListener(new C35730e(this));
                    ecVar.mo75724a(true);
                    String str4 = "show_content_language_popup";
                    C23089d a2 = C23089d.m56640a().mo47829a("enter_from", "new_user_journey");
                    String str5 = "is_login";
                    C52711k.m112236a((Object) C47549c.m102974a(), "UserManager.inst()");
                    if (C47549c.m102978c()) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    C26890h.m65011a(str4, a2.mo47829a(str5, str).f61491a);
                    break;
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            case 3:
                DmtTextView dmtTextView6 = (DmtTextView) mo74332a((int) R.id.title);
                C52711k.m112236a((Object) dmtTextView6, "title");
                dmtTextView6.setText(getString(R.string.gu3));
                DmtTextView dmtTextView7 = (DmtTextView) mo74332a((int) R.id.ck1);
                C52711k.m112236a((Object) dmtTextView7, "second_title");
                dmtTextView7.setVisibility(8);
                RecyclerView recyclerView18 = this.f91728u;
                if (recyclerView18 == null) {
                    C52711k.m112237a("infoListView");
                }
                LayoutParams layoutParams3 = recyclerView18.getLayoutParams();
                if (layoutParams3 != null) {
                    MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) layoutParams3;
                    RecyclerView recyclerView19 = this.f91728u;
                    if (recyclerView19 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    marginLayoutParams3.topMargin = (int) C9432q.m18687b(recyclerView19.getContext(), 40.0f);
                    int i3 = marginLayoutParams3.leftMargin;
                    RecyclerView recyclerView20 = this.f91728u;
                    if (recyclerView20 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    marginLayoutParams3.leftMargin = i3 - ((int) C9432q.m18687b(recyclerView20.getContext(), 8.0f));
                    marginLayoutParams3.rightMargin = marginLayoutParams3.leftMargin;
                    RecyclerView recyclerView21 = this.f91728u;
                    if (recyclerView21 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    RecyclerView recyclerView22 = this.f91728u;
                    if (recyclerView22 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    recyclerView21.setLayoutManager(new LinearLayoutManager(recyclerView22.getContext()));
                    String[] strArr = {"ms-MY", "zh-Hant-TW", "en"};
                    ArrayList arrayList = new ArrayList();
                    I18nManagerService createI18nManagerServicebyMonsterPlugin = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin();
                    C52711k.m112236a((Object) createI18nManagerServicebyMonsterPlugin, "ServiceManager.get().get…nagerService::class.java)");
                    Map localeMap = createI18nManagerServicebyMonsterPlugin.getLocaleMap();
                    for (int i4 = 0; i4 < 3; i4++) {
                        Object obj = localeMap.get(strArr[i4]);
                        if (obj == null) {
                            C52711k.m112234a();
                        }
                        arrayList.add(obj);
                    }
                    RecyclerView recyclerView23 = this.f91728u;
                    if (recyclerView23 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    recyclerView23.setAdapter(new C35716a(arrayList, new C35726a(this)));
                    TextView textView3 = this.f91727t;
                    if (textView3 == null) {
                        C52711k.m112237a("doneView");
                    }
                    textView3.setOnClickListener(new C35727b(this));
                    ((DmtTextView) mo74332a((int) R.id.cp4)).setOnClickListener(new C35728c(this));
                    RecyclerView recyclerView24 = this.f91728u;
                    if (recyclerView24 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    ((C33122m) C23540d.m57713a(recyclerView24.getContext(), C33122m.class)).mo48499a(3);
                    String str6 = "show_language_popup";
                    C23089d a3 = new C23089d().mo47829a("enter_from", "new_user_journey");
                    String str7 = "is_login";
                    C52711k.m112236a((Object) C47549c.m102974a(), "UserManager.inst()");
                    if (C47549c.m102978c()) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    C26890h.m65011a(str6, a3.mo47829a(str7, str2).f61491a);
                    break;
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            case 4:
                DmtTextView dmtTextView8 = (DmtTextView) mo74332a((int) R.id.title);
                C52711k.m112236a((Object) dmtTextView8, "title");
                dmtTextView8.setText(getString(R.string.h4_));
                DmtTextView dmtTextView9 = (DmtTextView) mo74332a((int) R.id.ck1);
                C52711k.m112236a((Object) dmtTextView9, "second_title");
                dmtTextView9.setText(getString(R.string.gu4));
                RecyclerView recyclerView25 = this.f91728u;
                if (recyclerView25 == null) {
                    C52711k.m112237a("infoListView");
                }
                LayoutParams layoutParams4 = recyclerView25.getLayoutParams();
                if (layoutParams4 != null) {
                    MarginLayoutParams marginLayoutParams4 = (MarginLayoutParams) layoutParams4;
                    RecyclerView recyclerView26 = this.f91728u;
                    if (recyclerView26 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    marginLayoutParams4.topMargin = (int) C9432q.m18687b(recyclerView26.getContext(), 24.0f);
                    int i5 = marginLayoutParams4.leftMargin;
                    RecyclerView recyclerView27 = this.f91728u;
                    if (recyclerView27 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    marginLayoutParams4.leftMargin = i5 - ((int) C9432q.m18687b(recyclerView27.getContext(), 8.0f));
                    marginLayoutParams4.rightMargin = marginLayoutParams4.leftMargin;
                    new C36634ec();
                    RecyclerView recyclerView28 = this.f91728u;
                    if (recyclerView28 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    RecyclerView recyclerView29 = this.f91728u;
                    if (recyclerView29 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    recyclerView28.setLayoutManager(new LinearLayoutManager(recyclerView29.getContext()));
                    String string = getString(R.string.h4b);
                    C52711k.m112236a((Object) string, "getString(R.string.pro_account_gender_option_1)");
                    String string2 = getString(R.string.h4c);
                    C52711k.m112236a((Object) string2, "getString(R.string.pro_account_gender_option_2)");
                    String string3 = getString(R.string.h4d);
                    C52711k.m112236a((Object) string3, "getString(R.string.pro_account_gender_option_3)");
                    String string4 = getString(R.string.h4e);
                    C52711k.m112236a((Object) string4, "getString(R.string.pro_account_gender_option_4)");
                    List b = C52575l.m112099b((Object[]) new String[]{string, string2, string3, string4});
                    RecyclerView recyclerView30 = this.f91728u;
                    if (recyclerView30 == null) {
                        C52711k.m112237a("infoListView");
                    }
                    recyclerView30.setAdapter(new C35722c(b, new C35732g(this)));
                    TextView textView4 = this.f91727t;
                    if (textView4 == null) {
                        C52711k.m112237a("doneView");
                    }
                    textView4.setOnClickListener(new C35733h(this));
                    ((DmtTextView) mo74332a((int) R.id.cp4)).setOnClickListener(new C35736i(this));
                    C26890h.m65011a(this.f91729v, C23089d.m56640a().f61491a);
                    break;
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
        }
        if (this.f91712a == C35781s.f91907l) {
            TextView textView5 = this.f91727t;
            if (textView5 == null) {
                C52711k.m112237a("doneView");
            }
            textView5.setText(getString(R.string.gu5));
        } else {
            TextView textView6 = this.f91727t;
            if (textView6 == null) {
                C52711k.m112237a("doneView");
            }
            textView6.setText(getString(R.string.gve));
        }
        mo74334a(false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bao, viewGroup, false);
    }
}
