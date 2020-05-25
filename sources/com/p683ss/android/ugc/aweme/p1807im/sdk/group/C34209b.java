package com.p683ss.android.ugc.aweme.p1807im.sdk.group;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11202k;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.GroupListActivity.C34177a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34278c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.MTRelationMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35078c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35094d.C35095a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b */
public final class C34209b extends C35078c<MTRelationMemberListViewModel> {

    /* renamed from: c */
    public static final C34210a f88379c = new C34210a(null);

    /* renamed from: a */
    public String f88380a = "";

    /* renamed from: b */
    public volatile boolean f88381b;

    /* renamed from: d */
    private HashMap f88382d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b$a */
    public static final class C34210a {
        private C34210a() {
        }

        public /* synthetic */ C34210a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b$b */
    static final class C34211b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34209b f88383a;

        C34211b(C34209b bVar) {
            this.f88383a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Map hashMap = new HashMap();
            hashMap.put("enter_method", this.f88383a.f88380a);
            C35190af.m79472a("my_groups_click", hashMap);
            FragmentActivity activity = this.f88383a.getActivity();
            if (activity != null) {
                C52711k.m112236a((Object) activity, "this");
                Activity activity2 = activity;
                Bundle bundle = new Bundle();
                bundle.putString("key_enter_method", this.f88383a.f88380a);
                C34177a.m77999a(activity2, 2, bundle, null, 224);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b$c */
    static final class C34212c extends C52712l implements C52682m<C11180b, C11202k, C52860x> {

        /* renamed from: a */
        final /* synthetic */ List f88384a;

        /* renamed from: b */
        final /* synthetic */ C34209b f88385b;

        C34212c(List list, C34209b bVar) {
            this.f88384a = list;
            this.f88385b = bVar;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d6, code lost:
            if (r12 == null) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0106, code lost:
            if (r12 == null) goto L_0x0108;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
            /*
                r11 = this;
                com.bytedance.im.core.c.b r12 = (com.bytedance.p702im.core.p706c.C11180b) r12
                com.bytedance.im.core.c.k r13 = (com.bytedance.p702im.core.p706c.C11202k) r13
                com.ss.android.ugc.aweme.im.sdk.group.b r0 = r11.f88385b
                r0.mo73212u()
                r0 = 0
                if (r12 == 0) goto L_0x00d8
                com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a.m78110a()
                com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.m78090b(r12)
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                if (r13 == 0) goto L_0x001c
                java.lang.String r2 = r13.f30207e
                goto L_0x001d
            L_0x001c:
                r2 = r0
            L_0x001d:
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.model.d> r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d.class
                java.lang.Object r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o.m79760a(r2, r3)
                com.ss.android.ugc.aweme.im.sdk.group.model.d r2 = (com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d) r2
                java.lang.Integer r3 = r2.getStatusCode()
                if (r3 != 0) goto L_0x002c
                goto L_0x0032
            L_0x002c:
                int r3 = r3.intValue()
                if (r3 == 0) goto L_0x0039
            L_0x0032:
                java.lang.String r3 = "key_group_create_error"
                java.io.Serializable r2 = (java.io.Serializable) r2
                r1.putSerializable(r3, r2)
            L_0x0039:
                java.lang.String r2 = "key_enter_from"
                r3 = 9
                r1.putInt(r2, r3)
                java.lang.String r2 = r12.getConversationId()
                java.lang.String r3 = "success"
                com.ss.android.ugc.aweme.im.sdk.group.b r4 = r11.f88385b
                java.lang.String r4 = r4.f88380a
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79510f(r2, r3, r4)
                r2 = 4
                java.lang.String r3 = "GroupCreateFragment"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "onTitlebarRightClick callback: success start->"
                r4.<init>(r5)
                java.lang.String r5 = r12.getConversationId()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r2, r3, r4)
                com.ss.android.ugc.aweme.im.sdk.group.b r2 = r11.f88385b
                android.content.Context r2 = r2.getContext()
                java.lang.String r3 = r12.getConversationId()
                r4 = 3
                com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity.m76454a(r2, r3, r4, r1)
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
                java.lang.String r5 = r12.getConversationId()
                java.lang.String r6 = ""
                java.lang.String r7 = "group"
                java.lang.String r8 = "create_group"
                java.lang.String r9 = ""
                java.lang.String r10 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity.m76444a()
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79468a(r5, r6, r7, r8, r9, r10)
                com.ss.android.ugc.aweme.im.sdk.group.b r1 = r11.f88385b
                java.lang.String r1 = r1.f88380a
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.String r2 = "cell"
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 != 0) goto L_0x00b8
                com.ss.android.ugc.aweme.im.sdk.group.b r1 = r11.f88385b
                java.lang.String r1 = r1.f88380a
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.String r2 = "cell_onsite"
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 == 0) goto L_0x00aa
                goto L_0x00b8
            L_0x00aa:
                com.ss.android.ugc.aweme.im.sdk.utils.t r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
                java.lang.String r2 = "IMSPUtils.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                r2 = 2
                r1.mo73428i(r2)
                goto L_0x00cb
            L_0x00b8:
                com.ss.android.ugc.aweme.im.sdk.utils.t r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
                java.lang.String r2 = "IMSPUtils.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                r1.mo73428i(r4)
                com.ss.android.ugc.aweme.im.sdk.d.k r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k.m77795a()
                r1.mo71988e()
            L_0x00cb:
                com.ss.android.ugc.aweme.im.sdk.group.b r1 = r11.f88385b
                android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                if (r1 == 0) goto L_0x00d6
                r1.finish()
            L_0x00d6:
                if (r12 != 0) goto L_0x012b
            L_0x00d8:
                if (r13 == 0) goto L_0x00dd
                java.lang.String r12 = r13.f30207e
                goto L_0x00de
            L_0x00dd:
                r12 = r0
            L_0x00de:
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.model.d> r13 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d.class
                java.lang.Object r12 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o.m79760a(r12, r13)
                com.ss.android.ugc.aweme.im.sdk.group.model.d r12 = (com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d) r12
                r13 = 2132545332(0x7f1c0f34, float:2.074385E38)
                if (r12 == 0) goto L_0x0108
                com.ss.android.ugc.aweme.im.sdk.group.b r1 = r11.f88385b
                android.content.Context r1 = r1.getContext()
                java.lang.String r2 = r12.getStatusMsg()
                if (r2 != 0) goto L_0x00ff
                android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                java.lang.String r2 = r2.getString(r13)
            L_0x00ff:
                com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21537a(r1, r2)
                r1.mo19066a()
                if (r12 != 0) goto L_0x011d
            L_0x0108:
                com.ss.android.ugc.aweme.im.sdk.group.b r12 = r11.f88385b
                android.content.Context r12 = r12.getContext()
                android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                java.lang.String r13 = r1.getString(r13)
                com.bytedance.ies.dmt.ui.d.a r12 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21537a(r12, r13)
                r12.mo19066a()
            L_0x011d:
                java.lang.String r12 = "failure"
                com.ss.android.ugc.aweme.im.sdk.group.b r13 = r11.f88385b
                java.lang.String r13 = r13.f88380a
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79510f(r0, r12, r13)
                com.ss.android.ugc.aweme.im.sdk.group.b r12 = r11.f88385b
                r13 = 0
                r12.f88381b = r13
            L_0x012b:
                d.x r12 = p2628d.C52860x.f131107a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34209b.C34212c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final int mo72189a(boolean z) {
        return R.drawable.az4;
    }

    /* renamed from: a */
    public final View mo72190a(int i) {
        if (this.f88382d == null) {
            this.f88382d = new HashMap();
        }
        View view = (View) this.f88382d.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f88382d.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: h */
    public final void mo72197h() {
        if (this.f88382d != null) {
            this.f88382d.clear();
        }
    }

    /* renamed from: j */
    public final int mo72210j() {
        return R.layout.bcr;
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

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0 == null) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bk_() {
        /*
            r3 = this;
            super.bk_()
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L_0x0013
            java.lang.String r1 = "key_enter_method"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            java.lang.String r0 = ""
        L_0x0015:
            r3.f88380a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34209b.bk_():void");
    }

    /* renamed from: g */
    public final String mo72196g() {
        if (C33229c.f86227e.mo70568a()) {
            String string = C11010c.m22280a().getString(R.string.fsw);
            C52711k.m112236a((Object) string, "AppContextManager.getApp…at_creat_multiple_choice)");
            return string;
        }
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        String friendToFamiliarStr = a.mo71949f().getFriendToFamiliarStr(R.string.bos, R.string.gje, R.string.gjf);
        C52711k.m112236a((Object) friendToFamiliarStr, "AwemeImManager.instance(…tle_select_follow_fellow)");
        return friendToFamiliarStr;
    }

    /* renamed from: i */
    public final void mo72209i() {
        super.mo72209i();
        View inflate = View.inflate(getContext(), R.layout.bd7, null);
        inflate.setOnClickListener(new C34211b(this));
        C52711k.m112236a((Object) inflate, "headerView");
        inflate.setBackground(C10678c.m21505e(getContext()));
        mo73208a(inflate);
    }

    /* renamed from: l */
    public final void mo72212l() {
        super.mo72212l();
        if (((MTRelationMemberListViewModel) mo73210s()).mo73181m() && ((MTRelationMemberListViewModel) mo73210s()).mo73184p() > 1) {
            ((ImTextTitleBar) mo72190a((int) R.id.d10)).setRightText(C11010c.m22280a().getResources().getString(R.string.bga, new Object[]{Integer.valueOf(((MTRelationMemberListViewModel) mo73210s()).mo73184p())}));
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) mo72190a((int) R.id.d10);
            C52711k.m112236a((Object) imTextTitleBar, "title_bar");
            View rightView = imTextTitleBar.getRightView();
            C52711k.m112236a((Object) rightView, "title_bar.rightView");
            rightView.setEnabled(true);
            ImTextTitleBar imTextTitleBar2 = (ImTextTitleBar) mo72190a((int) R.id.d10);
            C52711k.m112236a((Object) imTextTitleBar2, "title_bar");
            DmtTextView rightTexView = imTextTitleBar2.getRightTexView();
            C52711k.m112236a((Object) rightTexView, "title_bar.rightTexView");
            TextPaint paint = rightTexView.getPaint();
            C52711k.m112236a((Object) paint, "title_bar.rightTexView.paint");
            paint.setFakeBoldText(true);
            ((ImTextTitleBar) mo72190a((int) R.id.d10)).setRightTextColor(C11010c.m22280a().getResources().getColor(R.color.a3c));
        }
    }

    /* renamed from: m */
    public final void mo72213m() {
        super.mo72213m();
        StringBuilder sb = new StringBuilder("onTitlebarRightClick call:");
        sb.append(this.f88381b);
        C32458a.m75141a(4, "GroupCreateFragment", sb.toString());
        if (this.f88381b) {
            C32458a.m75141a(4, "GroupCreateFragment", "onTitlebarRightClick isRequesting now,just return!");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isFinishing()) {
            this.f88381b = true;
            List list = (List) ((MTRelationMemberListViewModel) mo73210s()).f90199p.getValue();
            if (list != null) {
                if (list.size() == 1) {
                    ((MTRelationMemberListViewModel) mo73210s()).f90199p.getValue();
                    if (list.get(0) instanceof IMUser) {
                        Object obj = list.get(0);
                        if (obj != null) {
                            IMUser iMUser = (IMUser) obj;
                            Map hashMap = new HashMap();
                            hashMap.put("enter_method", this.f88380a);
                            C35190af.m79472a("create_private_chat_click", hashMap);
                            ChatRoomActivity.m76450a(getContext(), iMUser, 4);
                            C35190af.m79442a();
                            String uid = iMUser.getUid();
                            C52711k.m112236a((Object) uid, "user.uid");
                            C35190af.m79468a(C11190e.m22687a(Long.parseLong(uid)), iMUser.getUid(), "private", "click_contact", "contact_list", ChatRoomActivity.m76444a());
                            this.f88381b = false;
                            FragmentActivity activity2 = getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                            }
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                        }
                    }
                } else {
                    mo73211t();
                    C35190af.m79530l(this.f88380a);
                    C34237d a = C34238a.m78110a();
                    C52711k.m112236a((Object) list, "this");
                    Iterable<IMContact> iterable = list;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (IMContact iMContact : iterable) {
                        if (iMContact != null) {
                            arrayList.add((IMUser) iMContact);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                        }
                    }
                    a.mo72230a((List) arrayList, (Map<String, String>) C34278c.m78179a(6, 0), false, (C52682m<? super C11180b, ? super C11202k, C52860x>) new C34212c<Object,Object,C52860x>(list, this));
                }
                return;
            }
            return;
        }
        C32458a.m75141a(4, "GroupCreateFragment", "onTitlebarRightClick isFinishing now,just return!");
    }

    /* renamed from: a */
    public final /* synthetic */ BaseMemberListViewModel mo72191a(C0184k kVar) {
        C0209x xVar;
        C52711k.m112240b(kVar, "lifecycleOwner");
        Class<MTRelationMemberListViewModel> cls = MTRelationMemberListViewModel.class;
        C52671b bVar = C35095a.INSTANCE;
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
        return (MTRelationMemberListViewModel) xVar;
    }
}
