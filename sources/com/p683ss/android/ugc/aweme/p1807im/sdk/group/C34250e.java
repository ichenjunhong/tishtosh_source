package com.p683ss.android.ugc.aweme.p1807im.sdk.group;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.p702im.core.p703a.p704a.C11163c;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11206o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34258f.C34259a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34278c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34214b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.RelationSelectActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.MTRelationMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35078c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.e */
public final class C34250e extends C35078c<MTRelationMemberListViewModel> {

    /* renamed from: c */
    public static final C34251a f88459c = new C34251a(null);

    /* renamed from: a */
    public String f88460a;

    /* renamed from: b */
    public List<? extends IMContact> f88461b;

    /* renamed from: d */
    private HashMap f88462d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.e$a */
    public static final class C34251a {
        private C34251a() {
        }

        public /* synthetic */ C34251a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.e$b */
    static final class C34252b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34250e f88463a;

        C34252b(C34250e eVar) {
            this.f88463a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Bundle bundle = new Bundle();
            bundle.putInt("key_member_list_type", 7);
            bundle.putString("session_id", this.f88463a.f88460a);
            RelationSelectActivity.m78821a((Activity) this.f88463a.getActivity(), bundle, 225);
            C35190af.m79442a();
            C35190af.m79508f(this.f88463a.f88460a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.e$c */
    public static final class C34253c implements C11163c<List<? extends C11206o>> {

        /* renamed from: a */
        final /* synthetic */ C34250e f88464a;

        /* renamed from: b */
        final /* synthetic */ List f88465b;

        /* renamed from: a */
        public final /* synthetic */ void mo20506a(Object obj) {
            List list = (List) obj;
            this.f88464a.mo73212u();
            this.f88464a.mo72238p();
        }

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
            this.f88464a.mo73212u();
            if (this.f88464a.getContext() != null) {
                Context context = this.f88464a.getContext();
                if (context == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) context, "context!!");
                C34214b.m78054a(context, kVar);
            }
        }

        C34253c(C34250e eVar, List list) {
            this.f88464a = eVar;
            this.f88465b = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
            if (r2.intValue() != 7504) goto L_0x0147;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo20509a(java.lang.Object r10, com.bytedance.p702im.core.p706c.C11202k r11) {
            /*
                r9 = this;
                java.util.List r10 = (java.util.List) r10
                com.ss.android.ugc.aweme.im.sdk.group.e r0 = r9.f88464a
                r0.mo73212u()
                if (r11 == 0) goto L_0x000c
                java.lang.String r11 = r11.f30207e
                goto L_0x000d
            L_0x000c:
                r11 = 0
            L_0x000d:
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.model.d> r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d.class
                java.lang.Object r11 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o.m79760a(r11, r0)
                com.ss.android.ugc.aweme.im.sdk.group.model.d r11 = (com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d) r11
                if (r11 == 0) goto L_0x014d
                java.lang.Integer r0 = r11.getStatusCode()
                if (r0 != 0) goto L_0x001e
                goto L_0x0026
            L_0x001e:
                int r0 = r0.intValue()
                if (r0 != 0) goto L_0x0026
                goto L_0x014d
            L_0x0026:
                com.ss.android.ugc.aweme.im.sdk.group.e r0 = r9.f88464a
                java.util.List r1 = r9.f88465b
                java.lang.Integer r2 = r11.getStatusCode()
                r3 = 0
                if (r2 != 0) goto L_0x0032
                goto L_0x004d
            L_0x0032:
                int r2 = r2.intValue()
                r4 = 7508(0x1d54, float:1.0521E-41)
                if (r2 != r4) goto L_0x004d
                java.lang.String r11 = "member_agree"
                r2 = 2132545393(0x7f1c0f71, float:2.0743974E38)
                java.lang.String r2 = r0.getString(r2)
                java.lang.String r4 = "getString(R.string.im_invitation_need_allow)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
                r0.mo72236a(r2, r1, r3, r11)
                goto L_0x0147
            L_0x004d:
                java.lang.Integer r2 = r11.getStatusCode()
                if (r2 != 0) goto L_0x0054
                goto L_0x005c
            L_0x0054:
                int r2 = r2.intValue()
                r4 = 7511(0x1d57, float:1.0525E-41)
                if (r2 == r4) goto L_0x006e
            L_0x005c:
                java.lang.Integer r2 = r11.getStatusCode()
                if (r2 != 0) goto L_0x0064
                goto L_0x0147
            L_0x0064:
                int r2 = r2.intValue()
                r4 = 7504(0x1d50, float:1.0515E-41)
                if (r2 == r4) goto L_0x006e
                goto L_0x0147
            L_0x006e:
                java.util.List r2 = r11.getInvalidMembers()
                if (r2 == 0) goto L_0x0147
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r5 = r2
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L_0x0080:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x00b6
                java.lang.Object r6 = r5.next()
                com.ss.android.ugc.aweme.im.service.model.IMUser r6 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser) r6
                com.ss.android.ugc.aweme.im.sdk.d.e r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                java.lang.String r8 = r6.getUid()
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r7.mo71964b(r8)
                if (r7 == 0) goto L_0x00a9
                java.lang.String r8 = r7.getDisplayName()
                r4.append(r8)
                java.lang.String r8 = "、"
                r4.append(r8)
                if (r7 == 0) goto L_0x00a9
                goto L_0x0080
            L_0x00a9:
                java.lang.String r6 = r6.getDisplayName()
                r4.append(r6)
                java.lang.String r6 = "、"
                r4.append(r6)
                goto L_0x0080
            L_0x00b6:
                r5 = r4
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                int r5 = r5.length()
                r6 = 1
                if (r5 <= 0) goto L_0x00c2
                r5 = 1
                goto L_0x00c3
            L_0x00c2:
                r5 = 0
            L_0x00c3:
                if (r5 == 0) goto L_0x00cd
                int r5 = r4.length()
                int r5 = r5 - r6
                r4.setLength(r5)
            L_0x00cd:
                int r5 = r2.size()
                if (r5 <= r6) goto L_0x00f6
                android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                android.content.res.Resources r5 = r5.getResources()
                r7 = 2132545351(0x7f1c0f47, float:2.074389E38)
                r8 = 2
                java.lang.Object[] r8 = new java.lang.Object[r8]
                java.lang.String r4 = r4.toString()
                r8[r3] = r4
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r8[r6] = r2
                java.lang.String r2 = r5.getString(r7, r8)
                goto L_0x010d
            L_0x00f6:
                android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                android.content.res.Resources r2 = r2.getResources()
                r5 = 2132545350(0x7f1c0f46, float:2.0743887E38)
                java.lang.Object[] r7 = new java.lang.Object[r6]
                java.lang.String r4 = r4.toString()
                r7[r3] = r4
                java.lang.String r2 = r2.getString(r5, r7)
            L_0x010d:
                java.util.List r4 = r11.getInvalidMembers()
                if (r4 != 0) goto L_0x0116
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0116:
                int r4 = r4.size()
                int r1 = r1.size()
                if (r4 != r1) goto L_0x0134
                java.lang.String r1 = "showMsg"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r1)
                java.util.List r11 = r11.getInvalidMembers()
                if (r11 != 0) goto L_0x012e
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x012e:
                java.lang.String r1 = "group_agree"
                r0.mo72236a(r2, r11, r3, r1)
                goto L_0x0147
            L_0x0134:
                java.lang.String r1 = "showMsg"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r1)
                java.util.List r11 = r11.getInvalidMembers()
                if (r11 != 0) goto L_0x0142
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0142:
                java.lang.String r1 = "group_agree"
                r0.mo72236a(r2, r11, r6, r1)
            L_0x0147:
                com.ss.android.ugc.aweme.im.sdk.group.e r11 = r9.f88464a
                r11.mo72237b_(r10)
                return
            L_0x014d:
                com.ss.android.ugc.aweme.im.sdk.group.e r10 = r9.f88464a
                r10.mo72238p()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34250e.C34253c.mo20509a(java.lang.Object, com.bytedance.im.core.c.k):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.e$d */
    static final class C34254d extends C52712l implements C52671b<MTRelationMemberListViewModel, MTRelationMemberListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C34250e f88466a;

        C34254d(C34250e eVar) {
            this.f88466a = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MTRelationMemberListViewModel mTRelationMemberListViewModel = (MTRelationMemberListViewModel) obj;
            C52711k.m112240b(mTRelationMemberListViewModel, "$receiver");
            mTRelationMemberListViewModel.f90193j = this.f88466a.f90254n;
            mTRelationMemberListViewModel.f90177b = this.f88466a.f88460a;
            List<? extends IMContact> list = this.f88466a.f88461b;
            if (list != null) {
                mTRelationMemberListViewModel.mo73162a(list);
            }
            return mTRelationMemberListViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.e$e */
    static final class C34255e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f88467a;

        /* renamed from: b */
        final /* synthetic */ C34250e f88468b;

        C34255e(List list, C34250e eVar) {
            this.f88467a = list;
            this.f88468b = eVar;
        }

        public final void run() {
            C35190af.m79442a();
            String str = this.f88468b.f88460a;
            Object value = ((MTRelationMemberListViewModel) this.f88468b.mo73210s()).f90199p.getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            C35190af.m79491c(str, String.valueOf(((List) value).size()));
            C34250e eVar = this.f88468b;
            List list = this.f88467a;
            C52711k.m112236a((Object) list, "this");
            eVar.mo73211t();
            C34278c cVar = C34278c.f88504a;
            HashMap a = C34278c.m78180a(C35265e.m79733d(), 6, null);
            C34237d a2 = C34238a.m78110a();
            String str2 = eVar.f88460a;
            Iterable<IMContact> iterable = list;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (IMContact iMContact : iterable) {
                if (iMContact != null) {
                    arrayList.add((IMUser) iMContact);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                }
            }
            a2.mo72228a(str2, (List) arrayList, (Map<String, String>) a, (C11163c<List<C11206o>>) new C34253c<List<C11206o>>(eVar, list));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.e$f */
    static final class C34256f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34250e f88469a;

        /* renamed from: b */
        final /* synthetic */ List f88470b;

        /* renamed from: c */
        final /* synthetic */ String f88471c;

        /* renamed from: d */
        final /* synthetic */ boolean f88472d;

        C34256f(C34250e eVar, List list, String str, boolean z) {
            this.f88469a = eVar;
            this.f88470b = list;
            this.f88471c = str;
            this.f88472d = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            boolean z;
            List list;
            boolean z2;
            List<IMContact> list2 = this.f88470b;
            Collection collection = list2;
            boolean z3 = false;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                list = null;
            } else {
                List arrayList = new ArrayList();
                for (IMContact iMContact : list2) {
                    if (iMContact instanceof IMUser) {
                        String uid = ((IMUser) iMContact).getUid();
                        C52711k.m112236a((Object) uid, "it.uid");
                        arrayList.add(uid);
                    }
                }
                list = arrayList;
            }
            CharSequence charSequence = this.f88469a.f88460a;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                Collection collection2 = list;
                if (collection2 == null || collection2.isEmpty()) {
                    z3 = true;
                }
                if (!z3) {
                    C34238a.m78110a();
                    String str = this.f88469a.f88460a;
                    if (str == null) {
                        C52711k.m112234a();
                    }
                    C34237d.m78092c(str, list);
                    C10691a.m21533a(this.f88469a.getContext(), (int) R.string.bik).mo19066a();
                    String str2 = "add";
                    String str3 = this.f88471c;
                    Iterable<IMContact> iterable = this.f88470b;
                    Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (IMContact iMContact2 : iterable) {
                        if (iMContact2 != null) {
                            arrayList2.add((IMUser) iMContact2);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                        }
                    }
                    C35190af.m79470a(str2, str3, (List) arrayList2, "confirm");
                    if (this.f88472d) {
                        FragmentActivity activity = this.f88469a.getActivity();
                        if (activity != null) {
                            activity.setResult(220);
                        }
                    }
                    FragmentActivity activity2 = this.f88469a.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.e$g */
    static final class C34257g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f88473a;

        /* renamed from: b */
        final /* synthetic */ List f88474b;

        C34257g(String str, List list) {
            this.f88473a = str;
            this.f88474b = list;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str = "add";
            String str2 = this.f88473a;
            Iterable<IMContact> iterable = this.f88474b;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (IMContact iMContact : iterable) {
                if (iMContact != null) {
                    arrayList.add((IMUser) iMContact);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                }
            }
            C35190af.m79470a(str, str2, (List) arrayList, "cancel");
        }
    }

    /* renamed from: a */
    public final int mo72189a(boolean z) {
        return R.drawable.c_p;
    }

    /* renamed from: a */
    public final View mo72190a(int i) {
        if (this.f88462d == null) {
            this.f88462d = new HashMap();
        }
        View view = (View) this.f88462d.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f88462d.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: h */
    public final void mo72197h() {
        if (this.f88462d != null) {
            this.f88462d.clear();
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
        ((MTRelationMemberListViewModel) mo73210s()).mo73178a(3);
    }

    /* renamed from: g */
    public final String mo72196g() {
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        String friendToFamiliarStr = a.mo71949f().getFriendToFamiliarStr(R.string.bos, R.string.gje, R.string.gjf);
        C52711k.m112236a((Object) friendToFamiliarStr, "AwemeImManager.instance(…tle_select_follow_fellow)");
        return friendToFamiliarStr;
    }

    /* renamed from: p */
    public final void mo72238p() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(220);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final void bk_() {
        super.bk_();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f88460a = arguments.getString("session_id");
            Serializable serializable = arguments.getSerializable("key_unselected_contact");
            if (!(serializable instanceof List)) {
                serializable = null;
            }
            this.f88461b = (List) serializable;
            if (arguments != null) {
                return;
            }
        }
        C34250e eVar = this;
        FragmentActivity activity = eVar.getActivity();
        if (activity != null) {
            activity.setResult(220);
        }
        FragmentActivity activity2 = eVar.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* renamed from: i */
    public final void mo72209i() {
        C34250e eVar;
        super.mo72209i();
        if (C34259a.m78168a(this.f88460a)) {
            eVar = this;
        } else {
            eVar = null;
        }
        C34250e eVar2 = eVar;
        if (eVar2 != null) {
            View inflate = View.inflate(eVar2.getContext(), R.layout.bcy, null);
            inflate.setOnClickListener(new C34252b(eVar2));
            C52711k.m112236a((Object) inflate, "headerView");
            inflate.setBackground(C10678c.m21505e(eVar2.getContext()));
            eVar2.mo73208a(inflate);
        }
    }

    /* renamed from: m */
    public final void mo72213m() {
        List list = (List) ((MTRelationMemberListViewModel) mo73210s()).f90199p.getValue();
        if (list != null) {
            C34214b.m78055a(getContext(), this.f88460a, new C34255e(list, this));
        }
    }

    /* renamed from: a */
    public final /* synthetic */ BaseMemberListViewModel mo72191a(C0184k kVar) {
        C0209x xVar;
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52671b dVar = new C34254d(this);
        Class<MTRelationMemberListViewModel> cls = MTRelationMemberListViewModel.class;
        if (kVar instanceof Fragment) {
            C0210y a = C0214z.m439a((Fragment) kVar, (C0212b) mo72311a());
            String name = cls.getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            xVar = a.mo360a(name, cls);
            C52711k.m112236a((Object) xVar, "this");
            dVar.invoke(xVar);
        } else if (kVar instanceof FragmentActivity) {
            C0210y a2 = C0214z.m441a((FragmentActivity) kVar, (C0212b) mo72311a());
            String name2 = cls.getName();
            C52711k.m112236a((Object) name2, "viewModelClass.java.name");
            xVar = a2.mo360a(name2, cls);
            C52711k.m112236a((Object) xVar, "this");
            dVar.invoke(xVar);
        } else {
            throw new IllegalAccessException("owner must be either FragmentActivity or Fragment");
        }
        C52711k.m112236a((Object) xVar, "when (lifecycleOwner) {\n…)\n            }\n        }");
        return (MTRelationMemberListViewModel) xVar;
    }

    /* renamed from: b_ */
    public final void mo72237b_(List<? extends C11206o> list) {
        List arrayList = new ArrayList();
        if (list != null) {
            for (C11206o uid : list) {
                IMUser b = C34010e.m77748a().mo71964b(String.valueOf(uid.getUid()));
                if (b != null) {
                    List<? extends IMContact> list2 = ((MTRelationMemberListViewModel) mo73210s()).f90180f;
                    if (list2 != null) {
                        ((ArrayList) list2).add(b);
                        arrayList.add(b);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.im.service.model.IMContact>");
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((MTRelationMemberListViewModel) mo73210s()).mo73163b(arrayList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo72236a(String str, List<? extends IMContact> list, boolean z, String str2) {
        if (getContext() != null) {
            Context context = getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            new C10643a(context).mo18902b(str).mo18911e(R.style.mp).mo18886a((int) R.string.bjo, (DialogInterface.OnClickListener) new C34256f(this, list, str2, z)).mo18900b((int) R.string.bf_, (DialogInterface.OnClickListener) new C34257g(str2, list)).mo18897a().mo18882b();
        }
    }
}
