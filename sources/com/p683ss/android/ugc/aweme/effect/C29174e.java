package com.p683ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.p051e.C1208c;
import android.support.p043v7.p051e.C1208c.C1211b;
import android.support.p043v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p683ss.android.ugc.aweme.effect.p1671b.C29126a;
import com.p683ss.android.ugc.aweme.effect.p1671b.p1672a.C29137b;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.port.internal.C39654d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView.C50243a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effect.e */
public abstract class C29174e extends Fragment implements C29137b, C29227x {

    /* renamed from: g */
    public static final C29175a f76445g = new C29175a(null);

    /* renamed from: a */
    public String f76446a;

    /* renamed from: b */
    public List<? extends Effect> f76447b;

    /* renamed from: c */
    public LinearLayoutManager f76448c;

    /* renamed from: d */
    public List<? extends EffectModel> f76449d = C52575l.m112097a();

    /* renamed from: e */
    public C29126a f76450e;

    /* renamed from: f */
    public final ArrayList<EffectPointModel> f76451f = new ArrayList<>();

    /* renamed from: h */
    private AVStatusView f76452h;

    /* renamed from: i */
    private HashMap f76453i;

    /* renamed from: com.ss.android.ugc.aweme.effect.e$a */
    public static final class C29175a {
        private C29175a() {
        }

        public /* synthetic */ C29175a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public abstract void mo59053a(C1211b bVar, List<? extends EffectModel> list);

    /* renamed from: b */
    public View mo59056b(int i) {
        if (this.f76453i == null) {
            this.f76453i = new HashMap();
        }
        View view = (View) this.f76453i.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f76453i.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo59059e() {
        if (this.f76453i != null) {
            this.f76453i.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo59059e();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: c */
    public final List<EffectPointModel> mo59057c() {
        return this.f76451f;
    }

    /* renamed from: a */
    public final List<Effect> mo59051a() {
        List<? extends Effect> list = this.f76447b;
        if (list == null) {
            C52711k.m112237a("mEffectList");
        }
        return list;
    }

    /* renamed from: b */
    public final LinearLayoutManager mo59055b() {
        LinearLayoutManager linearLayoutManager = this.f76448c;
        if (linearLayoutManager == null) {
            C52711k.m112237a("mLinearLayoutManager");
        }
        return linearLayoutManager;
    }

    public void onDestroy() {
        super.onDestroy();
        C29126a aVar = this.f76450e;
        if (aVar != null) {
            aVar.f76359c.remove(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo59058d() {
        boolean z;
        mo59116a(true);
        List<? extends Effect> list = this.f76447b;
        if (list == null) {
            C52711k.m112237a("mEffectList");
        }
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C52575l.m112100b();
            }
            Effect effect = (Effect) next;
            String str = this.f76446a;
            if (str == null) {
                C52711k.m112237a("mCategory");
            }
            EffectModel a = C29207l.m68788a(i, effect, str);
            C52711k.m112236a((Object) a, "EffectDataProvider.cover…index, effect, mCategory)");
            List<? extends EffectModel> list2 = this.f76449d;
            List e = C52575l.m112139e((Collection<? extends T>) this.f76449d);
            e.add(a);
            C1211b a2 = C1208c.m3655a(new C29213r(list2, e), true);
            C52711k.m112236a((Object) a2, "DiffUtil\n               …(oldList, newList), true)");
            mo59053a(a2, e);
            AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) mo59056b(R.id.cal);
            if (aVDmtPanelRecyleView != null) {
                if (aVDmtPanelRecyleView.getVisibility() == 8) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    aVDmtPanelRecyleView = null;
                }
                if (aVDmtPanelRecyleView != null) {
                    mo59116a(false);
                }
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public final void mo59054a(List<? extends EffectModel> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f76449d = list;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C0209x a = C0214z.m440a(activity).mo359a(EditEffectVideoModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(fr…ctVideoModel::class.java)");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a;
            if (!editEffectVideoModel.mo58844b()) {
                C39654d f = C39629l.m88232a().mo58575f();
                C52711k.m112236a((Object) activity, "fragmentActivity");
                editEffectVideoModel.mo58843a(f.mo58629a(activity));
            }
        }
    }

    /* renamed from: a */
    private void mo59116a(boolean z) {
        if (z) {
            LinearLayout linearLayout = (LinearLayout) mo59056b(R.id.bh_);
            C52711k.m112236a((Object) linearLayout, "loading_area");
            linearLayout.setVisibility(0);
            AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) mo59056b(R.id.cal);
            C52711k.m112236a((Object) aVDmtPanelRecyleView, "recyerview");
            aVDmtPanelRecyleView.setVisibility(8);
            AVStatusView aVStatusView = this.f76452h;
            if (aVStatusView == null) {
                C52711k.m112237a("mStatusView");
            }
            aVStatusView.mo98095b();
            return;
        }
        AVStatusView aVStatusView2 = this.f76452h;
        if (aVStatusView2 == null) {
            C52711k.m112237a("mStatusView");
        }
        aVStatusView2.mo98093a();
        LinearLayout linearLayout2 = (LinearLayout) mo59056b(R.id.bh_);
        C52711k.m112236a((Object) linearLayout2, "loading_area");
        linearLayout2.setVisibility(8);
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = (AVDmtPanelRecyleView) mo59056b(R.id.cal);
        C52711k.m112236a((Object) aVDmtPanelRecyleView2, "recyerview");
        aVDmtPanelRecyleView2.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59052a(int i) {
        C39629l.m88232a().mo58588s();
        if (C39629l.m88232a().mo58575f().mo58632c() >= 0) {
            int i2 = i + 1;
            List<? extends Effect> list = this.f76447b;
            if (list == null) {
                C52711k.m112237a("mEffectList");
            }
            int size = list.size();
            while (true) {
                if (i2 < size) {
                    if (this.f76450e == null) {
                        break;
                    }
                    C29252f a = C29126a.m68614a();
                    if (a == null) {
                        break;
                    }
                    List<? extends Effect> list2 = this.f76447b;
                    if (list2 == null) {
                        C52711k.m112237a("mEffectList");
                    }
                    if (!a.mo59142a((Effect) list2.get(i2))) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 != -1) {
                C29126a aVar = this.f76450e;
                if (aVar != null) {
                    List<? extends Effect> list3 = this.f76447b;
                    if (list3 == null) {
                        C52711k.m112237a("mEffectList");
                    }
                    aVar.mo58997a((Effect) list3.get(i2));
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("effect_list");
            if (parcelableArrayList == null) {
                C52711k.m112234a();
            }
            this.f76447b = parcelableArrayList;
            String string = arguments.getString("effect_category");
            if (string == null) {
                C52711k.m112234a();
            }
            this.f76446a = string;
        }
        this.f76451f.clear();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C0209x a = C0214z.m440a(activity).mo359a(EditEffectVideoModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(fr…ctVideoModel::class.java)");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a;
            ArrayList<EffectPointModel> arrayList = this.f76451f;
            Iterable h = editEffectVideoModel.mo58842a().mo59098h();
            Collection arrayList2 = new ArrayList();
            for (Object next : h) {
                EffectPointModel effectPointModel = (EffectPointModel) next;
                String str = this.f76446a;
                if (str == null) {
                    C52711k.m112237a("mCategory");
                }
                if (C52711k.m112239a((Object) str, (Object) effectPointModel.getCategory())) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll((List) arrayList2);
        }
        C29126a aVar = this.f76450e;
        if (aVar != null) {
            aVar.mo58996a((C29137b) this);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        linearLayoutManager.mo4731b(0);
        this.f76448c = linearLayoutManager;
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) mo59056b(R.id.cal);
        C52711k.m112236a((Object) aVDmtPanelRecyleView, "recyerview");
        LinearLayoutManager linearLayoutManager2 = this.f76448c;
        if (linearLayoutManager2 == null) {
            C52711k.m112237a("mLinearLayoutManager");
        }
        aVDmtPanelRecyleView.setLayoutManager(linearLayoutManager2);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.nm, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.bhp);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.loading_status)");
        this.f76452h = (AVStatusView) findViewById;
        AVStatusView aVStatusView = this.f76452h;
        if (aVStatusView == null) {
            C52711k.m112237a("mStatusView");
        }
        aVStatusView.setBuilder(C50243a.m108469a(getContext()).mo98106b(1));
        return inflate;
    }
}
