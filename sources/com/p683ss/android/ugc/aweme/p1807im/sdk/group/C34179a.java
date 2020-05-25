package com.p683ss.android.ugc.aweme.p1807im.sdk.group;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35078c;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a */
public final class C34179a extends C35078c<GroupMemberListViewModel> {

    /* renamed from: a */
    public String f88315a;

    /* renamed from: b */
    private HashMap f88316b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a$a */
    static final class C34180a extends C52712l implements C52671b<GroupMemberListViewModel, GroupMemberListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C34179a f88317a;

        C34180a(C34179a aVar) {
            this.f88317a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GroupMemberListViewModel groupMemberListViewModel = (GroupMemberListViewModel) obj;
            C52711k.m112240b(groupMemberListViewModel, "$receiver");
            groupMemberListViewModel.f90193j = this.f88317a.f90254n;
            groupMemberListViewModel.f88727a = this.f88317a.f88315a;
            return groupMemberListViewModel;
        }
    }

    /* renamed from: a */
    public final int mo72189a(boolean z) {
        return R.drawable.az4;
    }

    /* renamed from: a */
    public final View mo72190a(int i) {
        if (this.f88316b == null) {
            this.f88316b = new HashMap();
        }
        View view = (View) this.f88316b.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f88316b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: f */
    public final boolean mo72195f() {
        return false;
    }

    /* renamed from: h */
    public final void mo72197h() {
        if (this.f88316b != null) {
            this.f88316b.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo72197h();
    }

    /* renamed from: e */
    public final void mo72194e() {
        super.mo72194e();
        ((GroupMemberListViewModel) mo73210s()).mo73178a(2);
    }

    /* renamed from: g */
    public final String mo72196g() {
        String string = C11010c.m22280a().getResources().getString(R.string.bop);
        C52711k.m112236a((Object) string, "AppContextManager.getApp…im_title_at_group_member)");
        return string;
    }

    public final void bk_() {
        super.bk_();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f88315a = arguments.getString("session_id");
            if (arguments != null) {
                return;
            }
        }
        C34179a aVar = this;
        FragmentActivity activity = aVar.getActivity();
        if (activity != null) {
            activity.setResult(223);
        }
        FragmentActivity activity2 = aVar.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ BaseMemberListViewModel mo72191a(C0184k kVar) {
        C0209x xVar;
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52671b aVar = new C34180a(this);
        Class<GroupMemberListViewModel> cls = GroupMemberListViewModel.class;
        if (kVar instanceof Fragment) {
            C0210y a = C0214z.m439a((Fragment) kVar, (C0212b) mo72311a());
            String name = cls.getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            xVar = a.mo360a(name, cls);
            C52711k.m112236a((Object) xVar, "this");
            aVar.invoke(xVar);
        } else if (kVar instanceof FragmentActivity) {
            C0210y a2 = C0214z.m441a((FragmentActivity) kVar, (C0212b) mo72311a());
            String name2 = cls.getName();
            C52711k.m112236a((Object) name2, "viewModelClass.java.name");
            xVar = a2.mo360a(name2, cls);
            C52711k.m112236a((Object) xVar, "this");
            aVar.invoke(xVar);
        } else {
            throw new IllegalAccessException("owner must be either FragmentActivity or Fragment");
        }
        C52711k.m112236a((Object) xVar, "when (lifecycleOwner) {\n…)\n            }\n        }");
        return (GroupMemberListViewModel) xVar;
    }

    /* renamed from: a */
    public final void mo72192a(List<? extends IMContact> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Intent intent = new Intent();
            String str = "key_at_member";
            Object e = C52575l.m112137e(list);
            if (e != null) {
                intent.putExtra(str, (IMUser) e);
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.setResult(223, intent);
                }
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            }
        }
    }
}
