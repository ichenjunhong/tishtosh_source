package com.p683ss.android.ugc.aweme.anchor;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.anchor.C22583a.C22584a;
import com.p683ss.android.ugc.aweme.anchor.api.model.AnchorCell;
import com.p683ss.android.ugc.aweme.anchor.p1342a.C22589e;
import com.p683ss.android.ugc.aweme.anchor.p1344b.C22600a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1346a.C22612c;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1346a.C22612c.C22613a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26528m;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52857u;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;
import p2663f.p2664a.p2665a.C53037e;

/* renamed from: com.ss.android.ugc.aweme.anchor.d */
public final class C22655d extends C22583a implements C26877c<AnchorCell>, C30462o {

    /* renamed from: f */
    public static final C22656a f60824f = new C22656a(null);

    /* renamed from: d */
    C22657b f60825d;

    /* renamed from: e */
    public C53037e f60826e;

    /* renamed from: g */
    private C26876b<C22668e> f60827g;

    /* renamed from: h */
    private C22668e f60828h;

    /* renamed from: i */
    private C53037e f60829i;

    /* renamed from: j */
    private HashMap f60830j;

    /* renamed from: com.ss.android.ugc.aweme.anchor.d$a */
    public static final class C22656a {
        private C22656a() {
        }

        public /* synthetic */ C22656a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.d$b */
    public final class C22657b {

        /* renamed from: a */
        final Keva f60831a = Keva.getRepo(this.f60832b);

        /* renamed from: b */
        public final String f60832b;

        /* renamed from: c */
        final /* synthetic */ C22655d f60833c;

        /* renamed from: a */
        public final String[] mo47033a() {
            String[] stringArray = this.f60831a.getStringArray(this.f60832b, new String[0]);
            C52711k.m112236a((Object) stringArray, "keva.getStringArray(name, arrayOf())");
            return stringArray;
        }

        /* renamed from: a */
        public final void mo47032a(String str) {
            C52711k.m112240b(str, "history");
            String[] strArr = {str};
            String[] stringArray = this.f60831a.getStringArray(this.f60832b, new String[0]);
            C52711k.m112236a((Object) stringArray, "keva.getStringArray(name, arrayOf())");
            Object[] array = C52575l.m112129b((Iterable<? extends T>) C52568f.m112087h(C52568f.m112070a((Object[]) strArr, (Object[]) stringArray)), 10).toArray(new String[0]);
            if (array != null) {
                this.f60831a.storeStringArray(this.f60832b, (String[]) array);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public C22657b(C22655d dVar, String str) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
            this.f60833c = dVar;
            this.f60832b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.d$c */
    public static final class C22658c implements C22600a<String> {

        /* renamed from: a */
        final /* synthetic */ C53037e f60834a;

        /* renamed from: b */
        final /* synthetic */ C22655d f60835b;

        C22658c(C53037e eVar, C22655d dVar) {
            this.f60834a = eVar;
            this.f60835b = dVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo46995a(View view, Object obj) {
            String str = (String) obj;
            C52711k.m112240b(view, "view");
            C52711k.m112240b(str, "item");
            C22655d dVar = this.f60835b;
            CharSequence charSequence = str;
            ((EditText) dVar.mo46973a((int) R.id.cj3)).setText(charSequence);
            ((EditText) dVar.mo46973a((int) R.id.cj3)).setSelection(charSequence.length());
            dVar.mo47030d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.d$d */
    public static final class C22659d implements C22613a {

        /* renamed from: a */
        final /* synthetic */ C53037e f60836a;

        /* renamed from: b */
        final /* synthetic */ C22655d f60837b;

        /* renamed from: a */
        public final void mo46999a(String str) {
            List list;
            C52711k.m112240b(str, "keyWord");
            C53037e eVar = this.f60836a;
            C22655d dVar = this.f60837b;
            C22657b bVar = dVar.f60825d;
            if (bVar != null) {
                C52711k.m112240b(str, "history");
                String[] stringArray = bVar.f60831a.getStringArray(bVar.f60832b, new String[0]);
                C52711k.m112236a((Object) stringArray, "keva\n                   …ingArray(name, arrayOf())");
                Collection arrayList = new ArrayList();
                for (String str2 : stringArray) {
                    if (!TextUtils.equals(str2, str)) {
                        arrayList.add(str2);
                    }
                }
                Object[] array = ((List) arrayList).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    bVar.f60831a.storeStringArray(bVar.f60832b, strArr);
                    if (strArr != null) {
                        if (strArr.length <= 2) {
                            DmtTextView dmtTextView = (DmtTextView) dVar.mo46973a((int) R.id.tq);
                            C52711k.m112236a((Object) dmtTextView, "clear_all_histories");
                            dmtTextView.setVisibility(8);
                        }
                        list = C52568f.m112085f(strArr);
                        eVar.mo10432a(list);
                        this.f60836a.notifyDataSetChanged();
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            list = new ArrayList();
            eVar.mo10432a(list);
            this.f60836a.notifyDataSetChanged();
        }

        C22659d(C53037e eVar, C22655d dVar) {
            this.f60836a = eVar;
            this.f60837b = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.d$e */
    static final class C22660e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22655d f60838a;

        C22660e(C22655d dVar) {
            this.f60838a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f60838a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.d$f */
    public static final class C22661f implements OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ C22655d f60839a;

        C22661f(C22655d dVar) {
            this.f60839a = dVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3 && i != 4 && (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                return false;
            }
            this.f60839a.mo47030d();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.d$g */
    public static final class C22662g implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C22655d f60840a;

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
        }

        C22662g(C22655d dVar) {
            this.f60840a = dVar;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            C52711k.m112240b(editable, "s");
            if (editable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ImageView imageView = (ImageView) this.f60840a.mo46973a((int) R.id.cj2);
                C52711k.m112236a((Object) imageView, "search_delete");
                imageView.setVisibility(4);
                return;
            }
            ImageView imageView2 = (ImageView) this.f60840a.mo46973a((int) R.id.cj2);
            C52711k.m112236a((Object) imageView2, "search_delete");
            imageView2.setVisibility(0);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
            RecyclerView recyclerView = (RecyclerView) this.f60840a.mo46973a((int) R.id.caa);
            C52711k.m112236a((Object) recyclerView, "recycler_search_history");
            recyclerView.setVisibility(0);
            C22655d dVar = this.f60840a;
            DmtTextView dmtTextView = (DmtTextView) dVar.mo46973a((int) R.id.dkv);
            C52711k.m112236a((Object) dmtTextView, "txt_search_result_empty");
            dmtTextView.setVisibility(8);
            DmtTextView dmtTextView2 = (DmtTextView) dVar.mo46973a((int) R.id.dku);
            C52711k.m112236a((Object) dmtTextView2, "txt_search_no_context");
            dmtTextView2.setVisibility(8);
            RecyclerView recyclerView2 = (RecyclerView) dVar.mo46973a((int) R.id.cab);
            C52711k.m112236a((Object) recyclerView2, "recycler_search_result");
            recyclerView2.setVisibility(8);
            DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) dVar.mo46973a((int) R.id.bhl);
            C52711k.m112236a((Object) dmtLoadingLayout, "loading_list");
            dmtLoadingLayout.setVisibility(8);
            this.f60840a.mo47027c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.d$h */
    static final class C22663h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22655d f60841a;

        C22663h(C22655d dVar) {
            this.f60841a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((EditText) this.f60841a.mo46973a((int) R.id.cj3)).setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.d$i */
    static final class C22664i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22655d f60842a;

        C22664i(C22655d dVar) {
            this.f60842a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22655d dVar = this.f60842a;
            C22657b bVar = dVar.f60825d;
            if (bVar != null) {
                bVar.f60831a.erase(bVar.f60832b);
            }
            DmtTextView dmtTextView = (DmtTextView) dVar.mo46973a((int) R.id.tq);
            C52711k.m112236a((Object) dmtTextView, "clear_all_histories");
            dmtTextView.setVisibility(0);
            C53037e a = C22655d.m55841a(this.f60842a);
            if (a != null) {
                List<?> list = a.f131517a;
                if (list != null) {
                    list.clear();
                }
            }
            C53037e a2 = C22655d.m55841a(this.f60842a);
            if (a2 != null) {
                a2.notifyDataSetChanged();
            }
            DmtTextView dmtTextView2 = (DmtTextView) this.f60842a.mo46973a((int) R.id.tq);
            C52711k.m112236a((Object) dmtTextView2, "clear_all_histories");
            dmtTextView2.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final View mo46973a(int i) {
        if (this.f60830j == null) {
            this.f60830j = new HashMap();
        }
        View view = (View) this.f60830j.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f60830j.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo47019a(boolean z) {
    }

    public final void aS_() {
    }

    public final boolean aW_() {
        return false;
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: b */
    public final void mo46974b() {
        if (this.f60830j != null) {
            this.f60830j.clear();
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
    }

    /* renamed from: b */
    public final void mo47026b(List<AnchorCell> list, boolean z) {
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<AnchorCell> list, boolean z) {
    }

    /* renamed from: e */
    public final void mo47031e() {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo46974b();
    }

    public final void onDestroy() {
        C26876b<C22668e> bVar = this.f60827g;
        if (bVar != null) {
            bVar.mo46991S_();
            bVar.aq_();
        }
        super.onDestroy();
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo46973a((int) R.id.bhl);
        C52711k.m112236a((Object) dmtLoadingLayout, "loading_list");
        dmtLoadingLayout.setVisibility(0);
    }

    public final void aU_() {
        C26876b<C22668e> bVar = this.f60827g;
        if (bVar != null) {
            bVar.mo44934a_(Integer.valueOf(4));
        }
    }

    public final void aJ_() {
        DmtTextView dmtTextView = (DmtTextView) mo46973a((int) R.id.dkv);
        C52711k.m112236a((Object) dmtTextView, "txt_search_result_empty");
        dmtTextView.setVisibility(0);
        DmtTextView dmtTextView2 = (DmtTextView) mo46973a((int) R.id.dku);
        C52711k.m112236a((Object) dmtTextView2, "txt_search_no_context");
        dmtTextView2.setVisibility(0);
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo46973a((int) R.id.bhl);
        C52711k.m112236a((Object) dmtLoadingLayout, "loading_list");
        dmtLoadingLayout.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) mo46973a((int) R.id.cab);
        C52711k.m112236a((Object) recyclerView, "recycler_search_result");
        recyclerView.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo47027c() {
        C22657b bVar = this.f60825d;
        if (bVar != null) {
            String[] a = bVar.mo47033a();
            if (a != null) {
                List f = C52568f.m112085f(a);
                C53037e eVar = this.f60826e;
                if (eVar == null) {
                    C52711k.m112237a("mHistoryAdapter");
                }
                if (eVar != null) {
                    eVar.mo10432a(f);
                }
                C53037e eVar2 = this.f60826e;
                if (eVar2 == null) {
                    C52711k.m112237a("mHistoryAdapter");
                }
                if (eVar2 != null) {
                    eVar2.notifyDataSetChanged();
                }
                if (f.size() > 2) {
                    DmtTextView dmtTextView = (DmtTextView) mo46973a((int) R.id.tq);
                    C52711k.m112236a((Object) dmtTextView, "clear_all_histories");
                    dmtTextView.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo47030d() {
        C26876b<C22668e> bVar = this.f60827g;
        if (bVar != null) {
            EditText editText = (EditText) mo46973a((int) R.id.cj3);
            C52711k.m112236a((Object) editText, "search_edit");
            String obj = editText.getText().toString();
            if (obj != null) {
                String obj2 = C52830p.m112447b(obj).toString();
                if (!TextUtils.isEmpty(obj2)) {
                    bVar.mo44934a_(Integer.valueOf(1), obj2);
                    RecyclerView recyclerView = (RecyclerView) mo46973a((int) R.id.caa);
                    C52711k.m112236a((Object) recyclerView, "recycler_search_history");
                    recyclerView.setVisibility(8);
                    DmtTextView dmtTextView = (DmtTextView) mo46973a((int) R.id.tq);
                    C52711k.m112236a((Object) dmtTextView, "clear_all_histories");
                    dmtTextView.setVisibility(8);
                    C26528m.m64185b(getContext(), (EditText) mo46973a((int) R.id.cj3));
                    C22657b bVar2 = this.f60825d;
                    if (bVar2 != null) {
                        bVar2.mo47032a(obj2);
                    }
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C53037e m55841a(C22655d dVar) {
        C53037e eVar = dVar.f60826e;
        if (eVar == null) {
            C52711k.m112237a("mHistoryAdapter");
        }
        return eVar;
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            EditText editText = (EditText) mo46973a((int) R.id.cj3);
            C52711k.m112236a((Object) editText, "search_edit");
            editText.getText().clear();
            C26528m.m64185b(getContext(), (EditText) mo46973a((int) R.id.cj3));
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        C53037e eVar;
        super.onActivityCreated(bundle);
        C53037e eVar2 = new C53037e();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C22612c cVar = new C22612c((C22678i) activity);
            cVar.f60754a = new C22658c(eVar2, this);
            cVar.f60768d = new C22659d(eVar2, this);
            eVar2.mo110580a(String.class, cVar);
            this.f60826e = eVar2;
            C22589e adapterFactory = C22584a.m55780a().adapterFactory((C22678i) getActivity());
            String str = null;
            if (adapterFactory != null) {
                eVar = new C53037e();
                adapterFactory.mo46975a(eVar, adapterFactory.f60729a, "search_result");
            } else {
                eVar = null;
            }
            this.f60829i = eVar;
            this.f60827g = new C26876b<>();
            StringBuilder sb = new StringBuilder("anchor_search_history");
            sb.append(C22584a.m55780a().name());
            this.f60825d = new C22657b(this, sb.toString());
            this.f60828h = new C22668e(C22584a.m55780a().getTYPE());
            C26876b<C22668e> bVar = this.f60827g;
            if (bVar != null) {
                bVar.mo54800a(this);
            }
            C26876b<C22668e> bVar2 = this.f60827g;
            if (bVar2 != null) {
                bVar2.mo54799a(this.f60828h);
            }
            ((DmtTextView) mo46973a((int) R.id.qh)).setOnClickListener(new C22660e(this));
            EditText editText = (EditText) mo46973a((int) R.id.cj3);
            C52711k.m112236a((Object) editText, "search_edit");
            Context context = getContext();
            if (context != null) {
                str = context.getString(C22584a.m55780a().anchorInfo().mo47015b());
            }
            editText.setHint(str);
            EditText editText2 = (EditText) mo46973a((int) R.id.cj3);
            C52711k.m112236a((Object) editText2, "search_edit");
            editText2.setImeOptions(3);
            EditText editText3 = (EditText) mo46973a((int) R.id.cj3);
            C52711k.m112236a((Object) editText3, "search_edit");
            editText3.setInputType(1);
            ((EditText) mo46973a((int) R.id.cj3)).setOnEditorActionListener(new C22661f(this));
            ((EditText) mo46973a((int) R.id.cj3)).addTextChangedListener(new C22662g(this));
            EditText editText4 = (EditText) mo46973a((int) R.id.cj3);
            C52711k.m112236a((Object) editText4, "search_edit");
            editText4.setFocusable(true);
            EditText editText5 = (EditText) mo46973a((int) R.id.cj3);
            C52711k.m112236a((Object) editText5, "search_edit");
            editText5.setFocusableInTouchMode(true);
            ((EditText) mo46973a((int) R.id.cj3)).requestFocus();
            C26528m.m64181a(getContext(), (View) (EditText) mo46973a((int) R.id.cj3));
            ((ImageView) mo46973a((int) R.id.cj2)).setOnClickListener(new C22663h(this));
            ((DmtTextView) mo46973a((int) R.id.tq)).setOnClickListener(new C22664i(this));
            RecyclerView recyclerView = (RecyclerView) mo46973a((int) R.id.cab);
            C52711k.m112236a((Object) recyclerView, "recycler_search_result");
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            RecyclerView recyclerView2 = (RecyclerView) mo46973a((int) R.id.cab);
            C52711k.m112236a((Object) recyclerView2, "recycler_search_result");
            recyclerView2.setAdapter(this.f60829i);
            RecyclerView recyclerView3 = (RecyclerView) mo46973a((int) R.id.caa);
            C52711k.m112236a((Object) recyclerView3, "recycler_search_history");
            recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
            RecyclerView recyclerView4 = (RecyclerView) mo46973a((int) R.id.caa);
            C52711k.m112236a((Object) recyclerView4, "recycler_search_history");
            C53037e eVar3 = this.f60826e;
            if (eVar3 == null) {
                C52711k.m112237a("mHistoryAdapter");
            }
            recyclerView4.setAdapter(eVar3);
            mo47027c();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.anchor.IFragmentNavigation");
    }

    /* renamed from: a */
    public final void mo47018a(List<AnchorCell> list, boolean z) {
        DmtTextView dmtTextView = (DmtTextView) mo46973a((int) R.id.dkv);
        C52711k.m112236a((Object) dmtTextView, "txt_search_result_empty");
        dmtTextView.setVisibility(8);
        DmtTextView dmtTextView2 = (DmtTextView) mo46973a((int) R.id.dku);
        C52711k.m112236a((Object) dmtTextView2, "txt_search_no_context");
        dmtTextView2.setVisibility(8);
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo46973a((int) R.id.bhl);
        C52711k.m112236a((Object) dmtLoadingLayout, "loading_list");
        dmtLoadingLayout.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) mo46973a((int) R.id.cab);
        C52711k.m112236a((Object) recyclerView, "recycler_search_result");
        boolean z2 = false;
        recyclerView.setVisibility(0);
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        }
        if (!z2) {
            C53037e eVar = this.f60829i;
            if (eVar != null) {
                eVar.mo10432a(list);
            }
            C53037e eVar2 = this.f60829i;
            if (eVar2 != null) {
                eVar2.notifyDataSetChanged();
            }
            C22584a.m55780a().anchorMob().mo47042b(list, z);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.ax0, viewGroup, false);
    }
}
