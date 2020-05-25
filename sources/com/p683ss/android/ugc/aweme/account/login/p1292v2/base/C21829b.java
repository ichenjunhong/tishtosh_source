package com.p683ss.android.ugc.aweme.account.login.p1292v2.base;

import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p859d.C13081d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.C21851a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import java.util.ArrayList;
import java.util.Collection;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b */
public abstract class C21829b extends C23526a implements C21841f {

    /* renamed from: l */
    static final /* synthetic */ C52767h[] f59109l = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21829b.class), "step", "getStep()Lcom/ss/android/ugc/aweme/account/login/v2/base/Step;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21829b.class), "childPage", "getChildPage()Lcom/ss/android/ugc/aweme/account/login/v2/base/Step;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21829b.class), "enterFrom", "getEnterFrom()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21829b.class), "enterMethod", "getEnterMethod()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21829b.class), "enterType", "getEnterType()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21829b.class), "lastPage", "getLastPage()Lcom/ss/android/ugc/aweme/account/login/v2/base/Step;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21829b.class), "passportApi", "getPassportApi()Lcom/bytedance/sdk/account/api/IBDAccountAPI;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21829b.class), "scene", "getScene()Lcom/ss/android/ugc/aweme/account/login/v2/base/Scene;"))};

    /* renamed from: a */
    private final C52668f f59110a = C52732g.m112285a(new C21837h(this));

    /* renamed from: b */
    private final C52668f f59111b = C52732g.m112285a(new C21830a(this));

    /* renamed from: c */
    private final C52668f f59112c = C52732g.m112285a(new C21831b(this));

    /* renamed from: d */
    private final C52668f f59113d = C52732g.m112285a(new C21832c(this));

    /* renamed from: e */
    private final C52668f f59114e = C52732g.m112285a(new C21833d(this));

    /* renamed from: j */
    private final C52668f f59115j = C52732g.m112285a(new C21834e(this));

    /* renamed from: k */
    private final C52668f f59116k = C52732g.m112285a(new C21835f(this));

    /* renamed from: m */
    public long f59117m = System.currentTimeMillis();

    /* renamed from: n */
    private final C52668f f59118n = C52732g.m112285a(new C21836g(this));

    /* renamed from: o */
    private ArrayList<C12989a<? extends C12990b>> f59119o;

    /* renamed from: p */
    private HashMap f59120p;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$a */
    static final class C21830a extends C52712l implements C52670a<C21850i> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59121a;

        C21830a(C21829b bVar) {
            this.f59121a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            Bundle arguments = this.f59121a.getArguments();
            if (arguments != null) {
                i = arguments.getInt("child_page", C21850i.NONE.getValue());
            } else {
                i = C21850i.NONE.getValue();
            }
            return C21851a.m54529a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$b */
    static final class C21831b extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59122a;

        C21831b(C21829b bVar) {
            this.f59122a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f59122a.getArguments();
            if (arguments != null) {
                String string = arguments.getString("enter_from");
                if (string != null) {
                    return string;
                }
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$c */
    static final class C21832c extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59123a;

        C21832c(C21829b bVar) {
            this.f59123a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f59123a.getArguments();
            if (arguments != null) {
                String string = arguments.getString("enter_method");
                if (string != null) {
                    return string;
                }
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$d */
    static final class C21833d extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59124a;

        C21833d(C21829b bVar) {
            this.f59124a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f59124a.getArguments();
            if (arguments != null) {
                String string = arguments.getString("enter_type");
                if (string != null) {
                    return string;
                }
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$e */
    static final class C21834e extends C52712l implements C52670a<C21850i> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59125a;

        C21834e(C21829b bVar) {
            this.f59125a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            Bundle arguments = this.f59125a.getArguments();
            if (arguments != null) {
                i = arguments.getInt("previous_page", C21850i.NONE.getValue());
            } else {
                i = C21850i.NONE.getValue();
            }
            return C21851a.m54529a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$f */
    static final class C21835f extends C52712l implements C52670a<C13011d> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59126a;

        C21835f(C21829b bVar) {
            this.f59126a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C13081d.m26312a(this.f59126a.getContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$g */
    static final class C21836g extends C52712l implements C52670a<C21848h> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59127a;

        C21836g(C21829b bVar) {
            this.f59127a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            Bundle arguments = this.f59127a.getArguments();
            if (arguments != null) {
                i = arguments.getInt("current_scene", C21848h.NONE.getValue());
            } else {
                i = C21848h.NONE.getValue();
            }
            C21848h hVar = (C21848h) C21848h.VALUES_MAP.get(Integer.valueOf(i));
            if (hVar == null) {
                return C21848h.SIGN_UP;
            }
            return hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$h */
    static final class C21837h extends C52712l implements C52670a<C21850i> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59128a;

        C21837h(C21829b bVar) {
            this.f59128a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            Bundle arguments = this.f59128a.getArguments();
            if (arguments != null) {
                i = arguments.getInt("current_page", C21850i.NONE.getValue());
            } else {
                i = C21850i.NONE.getValue();
            }
            return C21851a.m54529a(i);
        }
    }

    /* renamed from: r */
    public static String m54483r() {
        return "";
    }

    /* renamed from: a */
    public View mo44862a(int i) {
        if (this.f59120p == null) {
            this.f59120p = new HashMap();
        }
        View view = (View) this.f59120p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59120p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public abstract void mo45582a(int i, String str);

    /* renamed from: b */
    public abstract void mo45963b(int i);

    /* renamed from: f */
    public abstract boolean mo44865f();

    /* renamed from: g */
    public void mo44866g() {
        if (this.f59120p != null) {
            this.f59120p.clear();
        }
    }

    /* renamed from: k */
    public final C21850i mo45965k() {
        return (C21850i) this.f59110a.getValue();
    }

    /* renamed from: l */
    public final String mo45966l() {
        return (String) this.f59112c.getValue();
    }

    /* renamed from: m */
    public final String mo45967m() {
        return (String) this.f59113d.getValue();
    }

    /* renamed from: n */
    public final String mo45968n() {
        return (String) this.f59114e.getValue();
    }

    /* renamed from: o */
    public final C13011d mo45969o() {
        return (C13011d) this.f59116k.getValue();
    }

    /* renamed from: p */
    public final C21848h mo45970p() {
        return (C21848h) this.f59118n.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo45971q() {
    }

    /* renamed from: b */
    public final String mo45072b() {
        return mo45967m();
    }

    /* renamed from: c */
    public final String mo45073c() {
        return mo45968n();
    }

    /* renamed from: d */
    public final Bundle mo45075d() {
        return getArguments();
    }

    /* renamed from: a */
    public final String mo45068a() {
        return mo45966l();
    }

    public void onResume() {
        super.onResume();
        this.f59117m = System.currentTimeMillis();
    }

    public void onDestroyView() {
        if (!C9376b.m18558a((Collection<T>) this.f59119o)) {
            ArrayList<C12989a<? extends C12990b>> arrayList = this.f59119o;
            if (arrayList == null) {
                C52711k.m112234a();
            }
            for (int size = arrayList.size() - 1; size <= 0; size++) {
                ArrayList<C12989a<? extends C12990b>> arrayList2 = this.f59119o;
                if (arrayList2 == null) {
                    C52711k.m112234a();
                }
                Object obj = arrayList2.get(size);
                C52711k.m112236a(obj, "callBackList!![i]");
                C12989a aVar = (C12989a) obj;
                if (!aVar.cancel) {
                    aVar.cancel();
                }
                ArrayList<C12989a<? extends C12990b>> arrayList3 = this.f59119o;
                if (arrayList3 == null) {
                    C52711k.m112234a();
                }
                arrayList3.remove(size);
            }
        }
        super.onDestroyView();
        mo44866g();
    }

    /* renamed from: a */
    public final void mo45961a(Bundle bundle) {
        C52711k.m112240b(bundle, "bundle");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((ActionResultModel) C0214z.m440a(activity).mo359a(ActionResultModel.class)).f59091b.postValue(bundle);
        }
    }

    /* renamed from: b */
    public final void mo45964b(Bundle bundle) {
        C52711k.m112240b(bundle, "bundle");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((ActionResultModel) C0214z.m440a(activity).mo359a(ActionResultModel.class)).f59092c.postValue(bundle);
        }
    }

    /* renamed from: a */
    public final <T extends C12990b> void mo45962a(C12989a<T> aVar) {
        C52711k.m112240b(aVar, "callBack");
        if (this.f59119o == null) {
            this.f59119o = new ArrayList<>();
        }
        ArrayList<C12989a<? extends C12990b>> arrayList = this.f59119o;
        if (arrayList == null) {
            C52711k.m112234a();
        }
        arrayList.add(aVar);
    }
}
