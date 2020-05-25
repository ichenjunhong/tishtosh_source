package com.p683ss.android.ugc.aweme.p1807im.sdk.group;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.C33994c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.ListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.SearchHeadListView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34799b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35078c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35280q;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c */
public final class C34215c extends C35078c<GroupListViewModel> implements C26846a {

    /* renamed from: a */
    public final String f88388a = "GroupListFragment";

    /* renamed from: b */
    public SharePackage f88389b;

    /* renamed from: c */
    public BaseContent f88390c;

    /* renamed from: d */
    public int f88391d = 10;

    /* renamed from: e */
    public C23371a<Boolean> f88392e;

    /* renamed from: j */
    public String f88393j = "";

    /* renamed from: q */
    private int f88394q = -1;

    /* renamed from: r */
    private LinkedHashSet<IMContact> f88395r;

    /* renamed from: s */
    private HashMap f88396s;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c$a */
    static final class C34216a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34215c f88397a;

        C34216a(C34215c cVar) {
            this.f88397a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Map hashMap = new HashMap();
            hashMap.put("enter_method", this.f88397a.f88393j);
            C35190af.m79472a("create_group_from_list_click", hashMap);
            FragmentActivity activity = this.f88397a.getActivity();
            if (activity != null) {
                activity.setResult(224);
            }
            FragmentActivity activity2 = this.f88397a.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c$b */
    static final class C34217b extends C52712l implements C52671b<GroupListViewModel, GroupListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C34215c f88398a;

        C34217b(C34215c cVar) {
            this.f88398a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GroupListViewModel groupListViewModel = (GroupListViewModel) obj;
            C52711k.m112240b(groupListViewModel, "$receiver");
            groupListViewModel.f90193j = this.f88398a.f90254n;
            groupListViewModel.f88684f = this.f88398a.f88389b;
            groupListViewModel.f88685g = this.f88398a.f88390c;
            groupListViewModel.f88686h = this.f88398a.f88391d;
            return groupListViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c$c */
    static final class C34218c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34215c f88399a;

        C34218c(C34215c cVar) {
            this.f88399a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f88399a.mo73211t();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c$d */
    static final class C34219d extends C52712l implements C52682m<List<IMContact>, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34215c f88400a;

        C34219d(C34215c cVar) {
            this.f88400a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object obj3;
            boolean z;
            C34799b bVar;
            List list = (List) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            StringBuilder sb = new StringBuilder("refresh onSuccess: ");
            C34799b bVar2 = null;
            if (list != null) {
                obj3 = Integer.valueOf(list.size());
            } else {
                obj3 = null;
            }
            sb.append(obj3);
            sb.append(", ");
            sb.append(booleanValue);
            this.f88400a.mo73212u();
            C34799b r = this.f88400a.mo73209r();
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                bVar = r;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.mo50303a(list);
                bVar.mo54798c(true);
                if (booleanValue) {
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    bVar2.ao_();
                } else {
                    bVar.an_();
                }
            } else {
                r.mo54798c(false);
                this.f88400a.mo72217o();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c$e */
    static final class C34220e extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34215c f88401a;

        C34220e(C34215c cVar) {
            this.f88401a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f88401a.mo73212u();
            this.f88401a.mo72217o();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c$f */
    static final class C34221f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34215c f88402a;

        C34221f(C34215c cVar) {
            this.f88402a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f88402a.mo73209r().am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c$g */
    static final class C34222g extends C52712l implements C52682m<List<IMContact>, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34215c f88403a;

        C34222g(C34215c cVar) {
            this.f88403a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object obj3;
            boolean z;
            C34799b bVar;
            List list = (List) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            StringBuilder sb = new StringBuilder("loadMore: ");
            C34799b bVar2 = null;
            if (list != null) {
                obj3 = Integer.valueOf(list.size());
            } else {
                obj3 = null;
            }
            sb.append(obj3);
            sb.append(", ");
            sb.append(booleanValue);
            C34799b r = this.f88403a.mo73209r();
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                bVar = r;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.mo50304b(list);
            }
            if (booleanValue) {
                bVar2 = r;
            }
            if (bVar2 != null) {
                bVar2.ao_();
            } else {
                r.an_();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c$h */
    static final class C34223h extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34215c f88404a;

        C34223h(C34215c cVar) {
            this.f88404a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f88404a.mo73209r().an_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c$i */
    static final class C34224i<T> implements C23371a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C34215c f88405a;

        C34224i(C34215c cVar) {
            this.f88405a = cVar;
        }

        public final /* synthetic */ void run(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f88405a.f90254n == 3) {
                C23371a<Boolean> aVar = this.f88405a.f88392e;
                if (aVar != null) {
                    aVar.run(bool);
                }
                ((GroupListViewModel) this.f88405a.mo73210s()).mo73187s();
                C52711k.m112236a((Object) bool, "onShare");
                if (bool.booleanValue()) {
                    BaseContent baseContent = ((GroupListViewModel) this.f88405a.mo73210s()).f88685g;
                    if (baseContent != null) {
                        ChatRoomActivity.m76449a(this.f88405a.getContext());
                        if (baseContent != null) {
                            return;
                        }
                    }
                    Boolean.valueOf(C41302w.m91042a().mo83861a("aweme://main"));
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo72189a(boolean z) {
        return R.drawable.c_p;
    }

    /* renamed from: a */
    public final View mo72190a(int i) {
        if (this.f88396s == null) {
            this.f88396s = new HashMap();
        }
        View view = (View) this.f88396s.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f88396s.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: h */
    public final void mo72197h() {
        if (this.f88396s != null) {
            this.f88396s.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo72197h();
    }

    /* renamed from: f */
    public final boolean mo72195f() {
        if (this.f90254n == 3 && this.f88394q == 3) {
            return true;
        }
        return false;
    }

    public final void ar_() {
        GroupListViewModel groupListViewModel = (GroupListViewModel) mo73210s();
        if (groupListViewModel.f88680a == 1) {
            groupListViewModel.mo72360a(groupListViewModel.f88681b);
        }
    }

    /* renamed from: g */
    public final String mo72196g() {
        String string = C11010c.m22280a().getResources().getString(R.string.bmz);
        C52711k.m112236a((Object) string, "AppContextManager.getApp…R.string.im_select_group)");
        return string;
    }

    /* renamed from: k */
    public final boolean mo72211k() {
        if (this.f90254n == 2 || (this.f90254n == 3 && this.f88394q == 2)) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final void mo72217o() {
        super.mo72217o();
        mo73209r().ao_();
        mo73209r().mo54785f();
    }

    /* renamed from: i */
    public final void mo72209i() {
        super.mo72209i();
        SearchHeadListView searchHeadListView = (SearchHeadListView) mo72190a((int) R.id.cjb);
        C52711k.m112236a((Object) searchHeadListView, "search_head_list");
        searchHeadListView.setVisibility(8);
        mo73209r().mo54788a((C26846a) this);
    }

    /* renamed from: l */
    public final void mo72212l() {
        super.mo72212l();
        if (this.f90254n == 2) {
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) mo72190a((int) R.id.d10);
            C52711k.m112236a((Object) imTextTitleBar, "title_bar");
            View rightView = imTextTitleBar.getRightView();
            C52711k.m112236a((Object) rightView, "title_bar.rightView");
            rightView.setVisibility(8);
        }
    }

    /* renamed from: n */
    public final View mo72216n() {
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        C10723a c = new C10723a(getContext()).mo19280b((int) R.string.bic).mo19282c(R.string.bi3);
        C35280q.m79768a(c);
        if (this.f90254n == 2) {
            c.mo19278a(C10720a.SOLID, R.string.bhb, new C34216a(this));
        }
        dmtDefaultView.setStatus(c.f28711a);
        return dmtDefaultView;
    }

    public final void bk_() {
        super.bk_();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f88394q = arguments.getInt("key_select_mode", -1);
            Serializable serializable = arguments.getSerializable("key_selected_contact");
            if (!(serializable instanceof LinkedHashSet)) {
                serializable = null;
            }
            this.f88395r = (LinkedHashSet) serializable;
            this.f88391d = arguments.getInt("key_number_limit", 10);
            Parcelable parcelable = arguments.getParcelable("share_package");
            if (!(parcelable instanceof SharePackage)) {
                parcelable = null;
            }
            this.f88389b = (SharePackage) parcelable;
            Serializable serializable2 = arguments.getSerializable("share_content");
            if (!(serializable2 instanceof BaseContent)) {
                serializable2 = null;
            }
            this.f88390c = (BaseContent) serializable2;
            BaseContent.wrapForward(this.f88390c, arguments.getLong("forward_origin_msgid"));
            String string = arguments.getString("key_enter_method", "");
            C52711k.m112236a((Object) string, "this.getString(Constants.KEY_ENTER_METHOD, \"\")");
            this.f88393j = string;
            if (arguments != null) {
                return;
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: m */
    public final void mo72213m() {
        super.mo72213m();
        if (((GroupListViewModel) mo73210s()).mo73181m() && this.f90254n == 3) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_selected_contact", new LinkedHashSet(((GroupListViewModel) mo73210s()).mo73183o()));
            intent.putExtras(bundle);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setResult(224, intent);
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    /* renamed from: e */
    public final void mo72194e() {
        super.mo72194e();
        if (this.f88394q != -1) {
            ((GroupListViewModel) mo73210s()).mo73178a(this.f88394q);
        }
        LinkedHashSet<IMContact> linkedHashSet = this.f88395r;
        if (linkedHashSet != null) {
            GroupListViewModel groupListViewModel = (GroupListViewModel) mo73210s();
            List<IMContact> e = C52575l.m112138e((Iterable<? extends T>) linkedHashSet);
            C52711k.m112240b(e, "contactList");
            List e2 = C52575l.m112139e((Collection<? extends T>) groupListViewModel.mo73183o());
            for (IMContact iMContact : e) {
                if (e2.contains(iMContact)) {
                    e2.remove(iMContact);
                } else {
                    e2.add(iMContact);
                }
            }
            groupListViewModel.f90199p.postValue(e2);
        }
        ListViewModel.m77692a((GroupListViewModel) mo73210s(), this, C33994c.m77707a(new C34218c(this), new C34219d(this), new C34220e(this)), C33994c.m77707a(new C34221f(this), new C34222g(this), new C34223h(this)), null, 8, null);
    }

    /* renamed from: b */
    public final void mo72215b(List<? extends IMContact> list) {
        super.mo72215b(list);
        SearchHeadListView searchHeadListView = (SearchHeadListView) mo72190a((int) R.id.cjb);
        C52711k.m112236a((Object) searchHeadListView, "search_head_list");
        searchHeadListView.setVisibility(8);
    }

    /* renamed from: a */
    public final /* synthetic */ BaseMemberListViewModel mo72191a(C0184k kVar) {
        C0209x xVar;
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52671b bVar = new C34217b(this);
        Class<GroupListViewModel> cls = GroupListViewModel.class;
        if (kVar instanceof Fragment) {
            C0210y a = C0214z.m439a((Fragment) kVar, (C0212b) mo72311a());
            String name = cls.getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            xVar = a.mo360a(name, cls);
            C52711k.m112236a((Object) xVar, "this");
            bVar.invoke(xVar);
        } else if (kVar instanceof FragmentActivity) {
            C0210y a2 = C0214z.m441a((FragmentActivity) kVar, (C0212b) mo72311a());
            String name2 = cls.getName();
            C52711k.m112236a((Object) name2, "viewModelClass.java.name");
            xVar = a2.mo360a(name2, cls);
            C52711k.m112236a((Object) xVar, "this");
            bVar.invoke(xVar);
        } else {
            throw new IllegalAccessException("owner must be either FragmentActivity or Fragment");
        }
        C52711k.m112236a((Object) xVar, "when (lifecycleOwner) {\n…)\n            }\n        }");
        return (GroupListViewModel) xVar;
    }

    /* renamed from: a */
    public final void mo72192a(List<? extends IMContact> list) {
        if (((GroupListViewModel) mo73210s()).mo73181m()) {
            super.mo72192a(list);
        } else if (list != null) {
            for (IMContact a : list) {
                C35106c.m79325a(getContext(), a, ((GroupListViewModel) mo73210s()).f88684f, ((GroupListViewModel) mo73210s()).f88685g, (C23371a<Boolean>) new C34224i<Boolean>(this));
            }
        }
    }
}
