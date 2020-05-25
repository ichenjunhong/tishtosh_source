package com.p683ss.android.ugc.trill.setting;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.setting.p2148ui.ChooseOneOfMultiItemView;
import com.p683ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.trill.setting.c */
public final class C50395c extends C23526a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f126362a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50395c.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/trill/language/viewmodel/ContentPreferenceViewModel;"))};

    /* renamed from: b */
    private final C52668f f126363b = C52732g.m112285a(new C50401f(this));

    /* renamed from: c */
    private HashMap f126364c;

    /* renamed from: com.ss.android.ugc.trill.setting.c$a */
    static final class C50396a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50395c f126365a;

        C50396a(C50395c cVar) {
            this.f126365a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f126365a.getActivity();
            if (activity != null) {
                C0654k supportFragmentManager = activity.getSupportFragmentManager();
                if (supportFragmentManager != null) {
                    supportFragmentManager.mo2235c();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.c$b */
    static final class C50397b<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C50395c f126366a;

        C50397b(C50395c cVar) {
            this.f126366a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 1) {
                ((ChooseOneOfMultiItemView) this.f126366a.mo98297a(R.id.dxo)).setSelect(true);
                ((ChooseOneOfMultiItemView) this.f126366a.mo98297a(R.id.enn)).setSelect(false);
                ((ChooseOneOfMultiItemView) this.f126366a.mo98297a(R.id.eno)).setSelect(false);
            } else if (num != null && num.intValue() == 2) {
                ((ChooseOneOfMultiItemView) this.f126366a.mo98297a(R.id.dxo)).setSelect(false);
                ((ChooseOneOfMultiItemView) this.f126366a.mo98297a(R.id.enn)).setSelect(true);
                ((ChooseOneOfMultiItemView) this.f126366a.mo98297a(R.id.eno)).setSelect(false);
            } else {
                if (num != null && num.intValue() == 3) {
                    ((ChooseOneOfMultiItemView) this.f126366a.mo98297a(R.id.dxo)).setSelect(false);
                    ((ChooseOneOfMultiItemView) this.f126366a.mo98297a(R.id.enn)).setSelect(false);
                    ((ChooseOneOfMultiItemView) this.f126366a.mo98297a(R.id.eno)).setSelect(true);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.c$c */
    static final class C50398c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50395c f126367a;

        C50398c(C50395c cVar) {
            this.f126367a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (view == null) {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView");
            } else if (!((ChooseOneOfMultiItemView) view).getSelect()) {
                this.f126367a.mo98298a().mo98269a(1);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.c$d */
    static final class C50399d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50395c f126368a;

        C50399d(C50395c cVar) {
            this.f126368a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (view == null) {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView");
            } else if (!((ChooseOneOfMultiItemView) view).getSelect()) {
                this.f126368a.mo98298a().mo98269a(2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.c$e */
    static final class C50400e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50395c f126369a;

        C50400e(C50395c cVar) {
            this.f126369a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (view == null) {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView");
            } else if (!((ChooseOneOfMultiItemView) view).getSelect()) {
                this.f126369a.mo98298a().mo98269a(3);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.c$f */
    static final class C50401f extends C52712l implements C52670a<ContentPreferenceViewModel> {

        /* renamed from: a */
        final /* synthetic */ C50395c f126370a;

        C50401f(C50395c cVar) {
            this.f126370a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FragmentActivity activity = this.f126370a.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            return (ContentPreferenceViewModel) C0214z.m440a(activity).mo359a(ContentPreferenceViewModel.class);
        }
    }

    /* renamed from: a */
    public final View mo98297a(int i) {
        if (this.f126364c == null) {
            this.f126364c = new HashMap();
        }
        View view = (View) this.f126364c.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f126364c.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final ContentPreferenceViewModel mo98298a() {
        return (ContentPreferenceViewModel) this.f126363b.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f126364c != null) {
            this.f126364c.clear();
        }
    }

    public final void onDetach() {
        Integer num;
        super.onDetach();
        ContentPreferenceViewModel a = mo98298a();
        C0198r c = a.mo98274c();
        if (a.mo98272b().mo83165b() == 0) {
            num = C40869c.m90390u();
        } else {
            num = Integer.valueOf(a.mo98272b().mo83165b());
        }
        c.setValue(num);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        C52711k.m112240b(view, "view");
        ((TextView) view.findViewById(R.id.title)).setText(R.string.hfz);
        ((ImageView) view.findViewById(R.id.ik)).setOnClickListener(new C50396a(this));
        mo98298a().mo98274c().observe(this, new C50397b(this));
        ((ChooseOneOfMultiItemView) mo98297a(R.id.dxo)).setOnClickListener(new C50398c(this));
        ((ChooseOneOfMultiItemView) mo98297a(R.id.enn)).setOnClickListener(new C50399d(this));
        ((ChooseOneOfMultiItemView) mo98297a(R.id.eno)).setOnClickListener(new C50400e(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bat, viewGroup, false);
    }
}
