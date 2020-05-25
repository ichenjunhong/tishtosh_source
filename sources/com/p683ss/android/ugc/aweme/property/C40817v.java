package com.p683ss.android.ugc.aweme.property;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.app.C1160b.C1161a;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p683ss.android.ugc.aweme.property.WaveSideBar.C40758a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.property.v */
public final class C40817v extends Fragment {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f103952a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C40817v.class), "uiHanlder", "getUiHanlder()Landroid/os/Handler;"))};

    /* renamed from: b */
    public RecyclerView f103953b;

    /* renamed from: c */
    public EditText f103954c;

    /* renamed from: d */
    public C40814s f103955d;

    /* renamed from: e */
    private WaveSideBar f103956e;

    /* renamed from: f */
    private final C52668f f103957f = C52732g.m112285a(C40827j.f103968a);

    /* renamed from: g */
    private HashMap f103958g;

    /* renamed from: com.ss.android.ugc.aweme.property.v$a */
    static final class C40818a<T> implements C0199s<C40803n> {

        /* renamed from: a */
        final /* synthetic */ C40777d f103959a;

        C40818a(C40777d dVar) {
            this.f103959a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C40803n nVar = (C40803n) obj;
            C40777d dVar = this.f103959a;
            if (nVar == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) nVar, "it!!");
            C52711k.m112240b(nVar, "data");
            dVar.f103891b = nVar;
            dVar.notifyDataSetChanged();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.v$b */
    static final class C40819b<T> implements C0199s<C40829x> {

        /* renamed from: a */
        final /* synthetic */ C40777d f103960a;

        C40819b(C40777d dVar) {
            this.f103960a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C40829x xVar = (C40829x) obj;
            C40777d dVar = this.f103960a;
            if (xVar == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) xVar, "it!!");
            C52711k.m112240b(xVar, "type");
            dVar.f103892c = xVar;
            dVar.notifyDataSetChanged();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.v$c */
    static final class C40820c extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C40817v f103961a;

        C40820c(C40817v vVar) {
            this.f103961a = vVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            Context context = this.f103961a.getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            new C1161a(context).mo3764a((CharSequence) "Item Detail Message").mo3770b((CharSequence) str).mo3771b((CharSequence) "ok", (OnClickListener) C40825h.f103966a).mo3772b().show();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.v$d */
    static final class C40821d<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C40817v f103962a;

        C40821d(C40817v vVar) {
            this.f103962a = vVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == -1) {
                C40828w.m90299a(Toast.makeText(this.f103962a.getActivity(), "没有对应项~", 0));
                return;
            }
            RecyclerView recyclerView = this.f103962a.f103953b;
            if (recyclerView == null) {
                C52711k.m112237a("recyclerView");
            }
            if (num == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) num, "it!!");
            recyclerView.mo4814b(num.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.v$e */
    public static final class C40822e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C40817v f103963a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C40822e(C40817v vVar) {
            this.f103963a = vVar;
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null) {
                if (C52830p.m112413c(editable.toString(), "\n", false, 2, null)) {
                    editable.delete(editable.length() - 1, editable.length());
                }
                C40817v.m90296a(this.f103963a).mo83147a(editable.toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.v$f */
    static final class C40823f<T> implements C0199s<String> {

        /* renamed from: a */
        final /* synthetic */ C40817v f103964a;

        C40823f(C40817v vVar) {
            this.f103964a = vVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            EditText editText = this.f103964a.f103954c;
            if (editText == null) {
                C52711k.m112237a("searchEditView");
            }
            editText.setHint(new SpannableString(str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.v$g */
    static final class C40824g implements C40758a {

        /* renamed from: a */
        final /* synthetic */ C40817v f103965a;

        C40824g(C40817v vVar) {
            this.f103965a = vVar;
        }

        /* renamed from: a */
        public final void mo83060a(String str) {
            C40814s a = C40817v.m90296a(this.f103965a);
            C52711k.m112236a((Object) str, "it");
            a.mo83149b(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.v$h */
    static final class C40825h implements OnClickListener {

        /* renamed from: a */
        public static final C40825h f103966a = new C40825h();

        C40825h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.v$i */
    static final class C40826i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40817v f103967a;

        C40826i(C40817v vVar) {
            this.f103967a = vVar;
        }

        public final void run() {
            C40817v.m90296a(this.f103967a).mo83146a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.v$j */
    static final class C40827j extends C52712l implements C52670a<Handler> {

        /* renamed from: a */
        public static final C40827j f103968a = new C40827j();

        C40827j() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f103958g != null) {
            this.f103958g.clear();
        }
    }

    public final void onResume() {
        FragmentInstrumentation.onResume(this);
        super.onResume();
        ((Handler) this.f103957f.getValue()).postDelayed(new C40826i(this), 1000);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public final void mo83156a(C40814s sVar) {
        C52711k.m112240b(sVar, "present");
        this.f103955d = sVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C40814s m90296a(C40817v vVar) {
        C40814s sVar = vVar.f103955d;
        if (sVar == null) {
            C52711k.m112237a("pagePresent");
        }
        return sVar;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        RecyclerView recyclerView = this.f103953b;
        if (recyclerView == null) {
            C52711k.m112237a("recyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        C40814s sVar = this.f103955d;
        if (sVar == null) {
            C52711k.m112237a("pagePresent");
        }
        Object value = sVar.mo83148b().getValue();
        if (value == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a(value, "pagePresent.showedItemsData.value!!");
        C40803n nVar = (C40803n) value;
        C40814s sVar2 = this.f103955d;
        if (sVar2 == null) {
            C52711k.m112237a("pagePresent");
        }
        Object value2 = sVar2.mo83152e().getValue();
        if (value2 == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a(value2, "pagePresent.currentLanguage.value!!");
        C40777d dVar = new C40777d(nVar, (C40829x) value2);
        C40814s sVar3 = this.f103955d;
        if (sVar3 == null) {
            C52711k.m112237a("pagePresent");
        }
        C0184k kVar = this;
        sVar3.mo83148b().observe(kVar, new C40818a(dVar));
        C40814s sVar4 = this.f103955d;
        if (sVar4 == null) {
            C52711k.m112237a("pagePresent");
        }
        sVar4.mo83152e().observe(kVar, new C40819b(dVar));
        C52671b<? super String, C52860x> cVar = new C40820c<>(this);
        C52711k.m112240b(cVar, "showDetailMsg");
        dVar.f103890a = cVar;
        RecyclerView recyclerView2 = this.f103953b;
        if (recyclerView2 == null) {
            C52711k.m112237a("recyclerView");
        }
        recyclerView2.setAdapter(dVar);
        C40814s sVar5 = this.f103955d;
        if (sVar5 == null) {
            C52711k.m112237a("pagePresent");
        }
        sVar5.mo83150c().observe(kVar, new C40821d(this));
        WaveSideBar waveSideBar = this.f103956e;
        if (waveSideBar == null) {
            C52711k.m112237a("waveSideBar");
        }
        waveSideBar.setOnSelectIndexItemListener(new C40824g(this));
        EditText editText = this.f103954c;
        if (editText == null) {
            C52711k.m112237a("searchEditView");
        }
        editText.addTextChangedListener(new C40822e(this));
        C40814s sVar6 = this.f103955d;
        if (sVar6 == null) {
            C52711k.m112237a("pagePresent");
        }
        sVar6.mo83151d().observe(kVar, new C40823f(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.me, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        View findViewById = inflate.findViewById(R.id.ca3);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.recyclerView)");
        this.f103953b = (RecyclerView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.coc);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.side_bar)");
        this.f103956e = (WaveSideBar) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.ci6);
        C52711k.m112236a((Object) findViewById3, "view.findViewById(R.id.searchEditView)");
        this.f103954c = (EditText) findViewById3;
        return inflate;
    }
}
