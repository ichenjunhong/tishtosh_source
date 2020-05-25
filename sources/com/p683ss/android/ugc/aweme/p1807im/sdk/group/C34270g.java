package com.p683ss.android.ugc.aweme.p1807im.sdk.group;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11206o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34214b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35078c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.g */
public final class C34270g extends C35078c<GroupMemberListViewModel> {

    /* renamed from: a */
    public String f88489a;

    /* renamed from: b */
    private HashMap f88490b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.g$a */
    static final class C34271a extends C52712l implements C52671b<GroupMemberListViewModel, GroupMemberListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C34270g f88491a;

        C34271a(C34270g gVar) {
            this.f88491a = gVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GroupMemberListViewModel groupMemberListViewModel = (GroupMemberListViewModel) obj;
            C52711k.m112240b(groupMemberListViewModel, "$receiver");
            groupMemberListViewModel.f90193j = this.f88491a.f90254n;
            groupMemberListViewModel.f88727a = this.f88491a.f88489a;
            return groupMemberListViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.g$b */
    public static final class C34272b implements C11162b<List<? extends C11206o>> {

        /* renamed from: a */
        final /* synthetic */ C34270g f88492a;

        C34272b(C34270g gVar) {
            this.f88492a = gVar;
        }

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
            this.f88492a.mo73212u();
            if (this.f88492a.getContext() != null) {
                Context context = this.f88492a.getContext();
                if (context == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) context, "context!!");
                C34214b.m78054a(context, kVar);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo20506a(Object obj) {
            List list = (List) obj;
            this.f88492a.mo73212u();
            FragmentActivity activity = this.f88492a.getActivity();
            if (activity != null) {
                activity.setResult(221);
            }
            FragmentActivity activity2 = this.f88492a.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.g$c */
    static final class C34273c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34270g f88493a;

        /* renamed from: b */
        final /* synthetic */ List f88494b;

        C34273c(C34270g gVar, List list) {
            this.f88493a = gVar;
            this.f88494b = list;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C34214b.m78055a(this.f88493a.getContext(), this.f88493a.f88489a, new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C34273c f88495a;

                {
                    this.f88495a = r1;
                }

                public final void run() {
                    boolean z;
                    C34270g gVar = this.f88495a.f88493a;
                    List list = this.f88495a.f88494b;
                    gVar.mo73211t();
                    String str = ",";
                    StringBuilder sb = new StringBuilder();
                    Iterable<IMContact> iterable = list;
                    Iterator it = iterable.iterator();
                    while (true) {
                        boolean z2 = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        IMContact iMContact = (IMContact) it.next();
                        if (iMContact instanceof IMUser) {
                            IMUser iMUser = (IMUser) iMContact;
                            CharSequence uid = iMUser.getUid();
                            if (uid == null || uid.length() == 0) {
                                z2 = true;
                            }
                            if (!z2) {
                                sb.append(iMUser.getUid());
                                sb.append(str);
                            }
                        }
                    }
                    String sb2 = sb.toString();
                    CharSequence charSequence = sb2;
                    if (charSequence == null || charSequence.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        int length = sb2.length() - 1;
                        if (sb2 != null) {
                            String substring = sb2.substring(0, length);
                            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            C35190af.m79442a();
                            C35190af.m79503e(gVar.f88489a, substring);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    C34237d a = C34238a.m78110a();
                    String str2 = gVar.f88489a;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (IMContact iMContact2 : iterable) {
                        if (iMContact2 != null) {
                            arrayList.add((IMUser) iMContact2);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                        }
                    }
                    a.mo72227a(str2, (List) arrayList, (C11162b<List<C11206o>>) new C34272b<List<C11206o>>(gVar));
                }
            });
        }
    }

    /* renamed from: a */
    public final int mo72189a(boolean z) {
        return R.drawable.c_p;
    }

    /* renamed from: a */
    public final View mo72190a(int i) {
        if (this.f88490b == null) {
            this.f88490b = new HashMap();
        }
        View view = (View) this.f88490b.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f88490b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: h */
    public final void mo72197h() {
        if (this.f88490b != null) {
            this.f88490b.clear();
        }
    }

    /* renamed from: k */
    public final boolean mo72211k() {
        return false;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo72197h();
    }

    /* renamed from: e */
    public final void mo72194e() {
        super.mo72194e();
        ((GroupMemberListViewModel) mo73210s()).mo73178a(3);
    }

    /* renamed from: g */
    public final String mo72196g() {
        String string = C11010c.m22280a().getResources().getString(R.string.boq);
        C52711k.m112236a((Object) string, "AppContextManager.getApp…itle_delete_group_member)");
        return string;
    }

    public final void bk_() {
        super.bk_();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f90254n = arguments.getInt("key_member_list_type");
            this.f88489a = arguments.getString("session_id");
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
        List list = (List) ((GroupMemberListViewModel) mo73210s()).f90199p.getValue();
        if (list != null) {
            C52711k.m112236a((Object) list, "this");
            if (getContext() != null) {
                new C10643a(getContext()).mo18899b((int) R.string.bjt).mo18911e(R.style.mp).mo18900b((int) R.string.bf_, (OnClickListener) null).mo18886a((int) R.string.bg2, (OnClickListener) new C34273c(this, list)).mo18897a().mo18882b();
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ BaseMemberListViewModel mo72191a(C0184k kVar) {
        C0209x xVar;
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52671b aVar = new C34271a(this);
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
}
