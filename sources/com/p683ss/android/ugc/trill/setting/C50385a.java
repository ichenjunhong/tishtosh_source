package com.p683ss.android.ugc.trill.setting;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.widget.setting.Divider;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p683ss.android.ugc.trill.language.C50337c;
import com.p683ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.trill.setting.a */
public final class C50385a extends C23526a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f126346a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50385a.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/trill/language/viewmodel/ContentPreferenceViewModel;"))};

    /* renamed from: b */
    public C50337c f126347b;

    /* renamed from: c */
    public C50386a f126348c;

    /* renamed from: d */
    private final C52668f f126349d = C52732g.m112285a(new C50391f(this));

    /* renamed from: e */
    private HashMap f126350e;

    /* renamed from: com.ss.android.ugc.trill.setting.a$a */
    public interface C50386a {
        /* renamed from: c */
        void mo98282c();

        /* renamed from: d */
        void mo98283d();
    }

    /* renamed from: com.ss.android.ugc.trill.setting.a$b */
    static final class C50387b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50385a f126351a;

        C50387b(C50385a aVar) {
            this.f126351a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f126351a.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            activity.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.a$c */
    static final class C50388c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50385a f126352a;

        C50388c(C50385a aVar) {
            this.f126352a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f126352a.f126348c != null) {
                C50386a aVar = this.f126352a.f126348c;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                aVar.mo98282c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.a$d */
    static final class C50389d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50385a f126353a;

        C50389d(C50385a aVar) {
            this.f126353a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C50386a aVar = this.f126353a.f126348c;
            if (aVar != null) {
                aVar.mo98283d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.a$e */
    static final class C50390e<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C50385a f126354a;

        C50390e(C50385a aVar) {
            this.f126354a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 1) {
                ((CommonItemView) this.f126354a.mo98292a(R.id.f7v)).setRightText(this.f126354a.getString(R.string.hg0));
            } else if (num != null && num.intValue() == 2) {
                ((CommonItemView) this.f126354a.mo98292a(R.id.f7v)).setRightText(this.f126354a.getString(R.string.hg3));
            } else {
                if (num != null && num.intValue() == 3) {
                    ((CommonItemView) this.f126354a.mo98292a(R.id.f7v)).setRightText(this.f126354a.getString(R.string.ge_));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.a$f */
    static final class C50391f extends C52712l implements C52670a<ContentPreferenceViewModel> {

        /* renamed from: a */
        final /* synthetic */ C50385a f126355a;

        C50391f(C50385a aVar) {
            this.f126355a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FragmentActivity activity = this.f126355a.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            return (ContentPreferenceViewModel) C0214z.m440a(activity).mo359a(ContentPreferenceViewModel.class);
        }
    }

    /* renamed from: a */
    public final View mo98292a(int i) {
        if (this.f126350e == null) {
            this.f126350e = new HashMap();
        }
        View view = (View) this.f126350e.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f126350e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f126350e != null) {
            this.f126350e.clear();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        C52711k.m112240b(view, "view");
        ((TextView) view.findViewById(R.id.title)).setText(R.string.hfy);
        ((ImageView) view.findViewById(R.id.ik)).setOnClickListener(new C50387b(this));
        View a = mo98292a(R.id.d1b);
        if (a == null) {
            C52711k.m112234a();
        }
        a.setBackgroundColor(getResources().getColor(R.color.a2j));
        CommonItemView commonItemView = (CommonItemView) mo98292a(R.id.dk);
        if (commonItemView == null) {
            C52711k.m112234a();
        }
        commonItemView.setRightIconRes(0);
        RecyclerView recyclerView = (RecyclerView) mo98292a(R.id.f133582do);
        if (recyclerView == null) {
            C52711k.m112234a();
        }
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        this.f126347b = new C50337c(getActivity());
        RecyclerView recyclerView2 = (RecyclerView) mo98292a(R.id.f133582do);
        if (recyclerView2 == null) {
            C52711k.m112234a();
        }
        C50337c cVar = this.f126347b;
        if (cVar == null) {
            C52711k.m112237a("mAdapter");
        }
        recyclerView2.setAdapter(cVar);
        ((CommonItemView) mo98292a(R.id.dk)).setOnClickListener(new C50388c(this));
        if (!C40869c.m90382l() || TimeLockRuler.isInTeenagerModeNewVersion()) {
            Divider divider = (Divider) mo98292a(R.id.a6e);
            C52711k.m112236a((Object) divider, "div");
            divider.setVisibility(8);
            CommonItemView commonItemView2 = (CommonItemView) mo98292a(R.id.f7v);
            C52711k.m112236a((Object) commonItemView2, "vpa_account_item");
            commonItemView2.setVisibility(8);
            return;
        }
        Divider divider2 = (Divider) mo98292a(R.id.a6e);
        C52711k.m112236a((Object) divider2, "div");
        divider2.setVisibility(0);
        CommonItemView commonItemView3 = (CommonItemView) mo98292a(R.id.f7v);
        C52711k.m112236a((Object) commonItemView3, "vpa_account_item");
        commonItemView3.setVisibility(0);
        ((CommonItemView) mo98292a(R.id.f7v)).setOnClickListener(new C50389d(this));
        ((ContentPreferenceViewModel) this.f126349d.getValue()).mo98274c().observe(this, new C50390e(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bai, viewGroup, false);
    }
}
