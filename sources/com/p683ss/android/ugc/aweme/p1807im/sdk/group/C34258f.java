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
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11206o;
import com.bytedance.p702im.core.proto.GroupRole;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.C33994c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.ListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34214b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.C34370b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupMemberFansViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34799b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35078c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.f */
public final class C34258f extends C35078c<GroupMemberFansViewModel> implements C26846a {

    /* renamed from: b */
    public static final C34259a f88475b = new C34259a(null);

    /* renamed from: a */
    public String f88476a;

    /* renamed from: c */
    private HashMap f88477c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.f$a */
    public static final class C34259a {
        private C34259a() {
        }

        public /* synthetic */ C34259a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m78168a(String str) {
            boolean z;
            String str2;
            boolean z2;
            boolean z3;
            CharSequence charSequence = str;
            boolean z4 = true;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
            CharSequence b = C35265e.m79730b();
            C33367a aVar = null;
            if (b != null) {
                str2 = b.toString();
            } else {
                str2 = null;
            }
            CharSequence charSequence2 = str2;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return false;
            }
            List b2 = C34238a.m78110a().mo72231b(str);
            if (b2 != null) {
                Iterable iterable = b2;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    C33367a aVar2 = (C33367a) next;
                    long parseLong = Long.parseLong(str2);
                    C11206o member = aVar2.getMember();
                    if (member == null || parseLong != member.getUid()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        arrayList.add(next);
                    }
                }
                List list = (List) arrayList;
                if (list.size() != 1) {
                    z4 = false;
                }
                if (!z4) {
                    list = null;
                }
                if (list != null) {
                    aVar = (C33367a) list.get(0);
                }
            }
            if (aVar != null) {
                C11206o member2 = aVar.getMember();
                if (member2 != null && member2.getRole() == GroupRole.OWNER.getValue()) {
                    try {
                        IESSettingsProxy b3 = C32816h.m75716b();
                        C52711k.m112236a((Object) b3, "SettingsReader.get()");
                        Boolean enableGroupMemberByFollowers = b3.getEnableGroupMemberByFollowers();
                        C52711k.m112236a((Object) enableGroupMemberByFollowers, "SettingsReader.get().enableGroupMemberByFollowers");
                        return enableGroupMemberByFollowers.booleanValue();
                    } catch (C10174a unused) {
                        return false;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.f$b */
    static final class C34260b extends C52712l implements C52671b<GroupMemberFansViewModel, GroupMemberFansViewModel> {

        /* renamed from: a */
        final /* synthetic */ C34258f f88478a;

        C34260b(C34258f fVar) {
            this.f88478a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GroupMemberFansViewModel groupMemberFansViewModel = (GroupMemberFansViewModel) obj;
            C52711k.m112240b(groupMemberFansViewModel, "$receiver");
            groupMemberFansViewModel.f90193j = this.f88478a.f90254n;
            groupMemberFansViewModel.f88692b = this.f88478a.f88476a;
            return groupMemberFansViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.f$c */
    static final class C34261c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34258f f88479a;

        C34261c(C34258f fVar) {
            this.f88479a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            FragmentActivity activity = this.f88479a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.f$d */
    static final class C34262d implements OnClickListener {

        /* renamed from: a */
        public static final C34262d f88480a = new C34262d();

        C34262d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.f$e */
    static final class C34263e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34258f f88481a;

        C34263e(C34258f fVar) {
            this.f88481a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f88481a.mo73211t();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.f$f */
    static final class C34264f extends C52712l implements C52682m<List<IMContact>, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34258f f88482a;

        C34264f(C34258f fVar) {
            this.f88482a = fVar;
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
            this.f88482a.mo73212u();
            C34799b r = this.f88482a.mo73209r();
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
                this.f88482a.mo72217o();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.f$g */
    static final class C34265g extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34258f f88483a;

        C34265g(C34258f fVar) {
            this.f88483a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f88483a.mo73212u();
            this.f88483a.mo72217o();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.f$h */
    static final class C34266h extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34258f f88484a;

        C34266h(C34258f fVar) {
            this.f88484a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f88484a.mo73209r().am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.f$i */
    static final class C34267i extends C52712l implements C52682m<List<IMContact>, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34258f f88485a;

        C34267i(C34258f fVar) {
            this.f88485a = fVar;
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
            C34799b r = this.f88485a.mo73209r();
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

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.f$j */
    static final class C34268j extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34258f f88486a;

        C34268j(C34258f fVar) {
            this.f88486a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f88486a.mo73209r().an_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.f$k */
    static final class C34269k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f88487a;

        /* renamed from: b */
        final /* synthetic */ C34258f f88488b;

        C34269k(List list, C34258f fVar) {
            this.f88487a = list;
            this.f88488b = fVar;
        }

        public final void run() {
            boolean z;
            List list;
            C35190af.m79442a();
            C35190af.m79458a(this.f88488b.f88476a, this.f88487a.size());
            C34258f fVar = this.f88488b;
            List<IMContact> list2 = this.f88487a;
            C52711k.m112236a((Object) list2, "this");
            Collection collection = list2;
            boolean z2 = false;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                list = null;
            } else {
                list = new ArrayList();
                for (IMContact iMContact : list2) {
                    if (iMContact instanceof IMUser) {
                        String uid = ((IMUser) iMContact).getUid();
                        C52711k.m112236a((Object) uid, "it.uid");
                        list.add(uid);
                    }
                }
            }
            if (list != null) {
                Collection collection2 = list;
                if (collection2 == null || collection2.isEmpty()) {
                    z2 = true;
                }
                if (z2) {
                    list = null;
                }
                if (list != null) {
                    C34238a.m78110a();
                    String str = fVar.f88476a;
                    if (str == null) {
                        C52711k.m112234a();
                    }
                    C34237d.m78092c(str, list);
                    C10691a.m21533a(fVar.getContext(), (int) R.string.a0z).mo19066a();
                    FragmentActivity activity = fVar.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
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
        if (this.f88477c == null) {
            this.f88477c = new HashMap();
        }
        View view = (View) this.f88477c.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f88477c.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: h */
    public final void mo72197h() {
        if (this.f88477c != null) {
            this.f88477c.clear();
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

    /* renamed from: i */
    public final void mo72209i() {
        mo73209r().mo54788a((C26846a) this);
        super.mo72209i();
    }

    public final void bk_() {
        String str;
        super.bk_();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("session_id");
        } else {
            str = null;
        }
        this.f88476a = str;
    }

    /* renamed from: g */
    public final String mo72196g() {
        String string = C11010c.m22280a().getString(R.string.a12);
        C52711k.m112236a((Object) string, "AppContextManager.getApp…ing.chat_group_fans_cell)");
        return string;
    }

    /* renamed from: o */
    public final void mo72217o() {
        super.mo72217o();
        mo73209r().ao_();
        mo73209r().mo54785f();
    }

    /* renamed from: q */
    public final void mo72245q() {
        if (!bl_()) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: m */
    public final void mo72213m() {
        List list = (List) ((GroupMemberFansViewModel) mo73210s()).f90199p.getValue();
        if (list != null) {
            C34214b.m78055a(getContext(), this.f88476a, new C34269k(list, this));
        }
    }

    public final void ar_() {
        boolean z;
        GroupMemberFansViewModel groupMemberFansViewModel = (GroupMemberFansViewModel) mo73210s();
        Integer num = (Integer) groupMemberFansViewModel.f90198o.getValue();
        boolean z2 = false;
        if (num != null && num.intValue() == 0) {
            C26876b l = groupMemberFansViewModel.mo72364l();
            if (l != null) {
                l.mo44934a_(Integer.valueOf(4));
            }
        } else {
            C34370b bVar = groupMemberFansViewModel.f88695f;
            if (bVar.f88735a.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && bVar.f88736b > 0) {
                z2 = true;
            }
            if (!z2) {
                bVar = null;
            }
            if (bVar != null) {
                groupMemberFansViewModel.mo71931k();
                groupMemberFansViewModel.mo72363a(bVar.f88735a, bVar.f88736b);
                return;
            }
            StringBuilder sb = new StringBuilder("loadMoreSearchFollowers param invalid: ");
            sb.append(groupMemberFansViewModel.f88695f.f88735a);
            sb.append(", ");
            sb.append(groupMemberFansViewModel.f88695f.f88736b);
        }
    }

    public final boolean bl_() {
        boolean z;
        Collection collection = (Collection) ((GroupMemberFansViewModel) mo73210s()).f90199p.getValue();
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        new C10643a(getContext()).mo18899b((int) R.string.ft4).mo18886a((int) R.string.ft5, (OnClickListener) new C34261c(this)).mo18900b((int) R.string.wf, (OnClickListener) C34262d.f88480a).mo18897a().mo18883c();
        return true;
    }

    /* renamed from: e */
    public final void mo72194e() {
        super.mo72194e();
        ((GroupMemberFansViewModel) mo73210s()).mo73178a(3);
        ListViewModel.m77692a((GroupMemberFansViewModel) mo73210s(), this, C33994c.m77707a(new C34263e(this), new C34264f(this), new C34265g(this)), C33994c.m77707a(new C34266h(this), new C34267i(this), new C34268j(this)), null, 8, null);
    }

    /* renamed from: l */
    public final void mo72212l() {
        super.mo72212l();
        ((ImTextTitleBar) mo72190a((int) R.id.d10)).setTitle(mo72196g());
        ((ImTextTitleBar) mo72190a((int) R.id.d10)).setLeftIcon(mo72189a(true));
        int p = ((GroupMemberFansViewModel) mo73210s()).mo73184p();
        if (p > 0) {
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) mo72190a((int) R.id.d10);
            StringBuilder sb = new StringBuilder();
            Context context = getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "context!!");
            sb.append(context.getResources().getString(R.string.a13));
            sb.append('(');
            sb.append(p);
            sb.append(')');
            imTextTitleBar.setRightText(sb.toString());
            return;
        }
        ((ImTextTitleBar) mo72190a((int) R.id.d10)).setRightText((int) R.string.a13);
    }

    /* renamed from: b */
    public final void mo72215b(List<? extends IMContact> list) {
        View view = this.f90252l;
        if (view != null) {
            mo73209r().mo72932c(view);
        }
    }

    /* renamed from: c */
    public final void mo72244c(List<? extends IMContact> list) {
        if (this.f90252l != null) {
            mo73209r().mo72933n();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ BaseMemberListViewModel mo72191a(C0184k kVar) {
        C0209x xVar;
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52671b bVar = new C34260b(this);
        Class<GroupMemberFansViewModel> cls = GroupMemberFansViewModel.class;
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
        return (GroupMemberFansViewModel) xVar;
    }
}
