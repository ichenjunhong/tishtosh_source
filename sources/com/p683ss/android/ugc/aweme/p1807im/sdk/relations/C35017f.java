package com.p683ss.android.ugc.aweme.p1807im.sdk.relations;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import android.support.p030v4.view.p042b.C1027f;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p706c.C11190e;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.GroupListActivity.C34177a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.C35025i.C35027b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model.C34979a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.MTRelationMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35078c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.C35117b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.C35142b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.f */
public final class C35017f extends C35078c<MTRelationMemberListViewModel> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f90089a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35017f.class), "mLastSelectedMember", "getMLastSelectedMember()Ljava/util/List;"))};

    /* renamed from: b */
    public SharePackage f90090b;

    /* renamed from: c */
    public BaseContent f90091c;

    /* renamed from: d */
    public C23371a<Boolean> f90092d;

    /* renamed from: e */
    private int f90093e = -1;

    /* renamed from: j */
    private LinkedHashSet<IMContact> f90094j;

    /* renamed from: q */
    private boolean f90095q;

    /* renamed from: r */
    private final C52668f f90096r = C52732g.m112285a(C35020c.f90101a);

    /* renamed from: s */
    private C35025i f90097s;

    /* renamed from: t */
    private HashMap f90098t;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.f$a */
    static final class C35018a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35017f f90099a;

        C35018a(C35017f fVar) {
            this.f90099a = fVar;
        }

        public final void onClick(View view) {
            int i;
            boolean z;
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f90099a.getActivity();
            if (activity != null) {
                if (((MTRelationMemberListViewModel) this.f90099a.mo73210s()).mo73181m()) {
                    i = 3;
                } else {
                    i = 2;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("key_select_mode", i);
                bundle.putParcelable("share_package", this.f90099a.f90090b);
                bundle.putSerializable("share_content", this.f90099a.f90091c);
                Iterable o = ((MTRelationMemberListViewModel) this.f90099a.mo73210s()).mo73183o();
                Collection arrayList = new ArrayList();
                for (Object next : o) {
                    IMContact iMContact = (IMContact) next;
                    if (!(iMContact instanceof IMConversation) || ((IMConversation) iMContact).getConversationType() != C11170a.f30116b) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                List list = (List) arrayList;
                if (((MTRelationMemberListViewModel) this.f90099a.mo73210s()).mo73184p() > list.size()) {
                    bundle.putInt("key_number_limit", 10 - (((MTRelationMemberListViewModel) this.f90099a.mo73210s()).mo73184p() - list.size()));
                }
                bundle.putSerializable("key_selected_contact", new LinkedHashSet(list));
                C52711k.m112236a((Object) activity, "this");
                C34177a.m77999a(activity, 3, bundle, this.f90099a.f90092d, 224);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.f$b */
    static final class C35019b extends C52712l implements C52671b<MTRelationMemberListViewModel, MTRelationMemberListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C35017f f90100a;

        C35019b(C35017f fVar) {
            this.f90100a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MTRelationMemberListViewModel mTRelationMemberListViewModel = (MTRelationMemberListViewModel) obj;
            C52711k.m112240b(mTRelationMemberListViewModel, "$receiver");
            mTRelationMemberListViewModel.f90193j = this.f90100a.f90254n;
            mTRelationMemberListViewModel.f90178c = this.f90100a.f90090b;
            mTRelationMemberListViewModel.f90179d = this.f90100a.f90091c;
            return mTRelationMemberListViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.f$c */
    static final class C35020c extends C52712l implements C52670a<List<IMContact>> {

        /* renamed from: a */
        public static final C35020c f90101a = new C35020c();

        C35020c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.f$d */
    static final class C35021d<T> implements C23371a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C35017f f90102a;

        C35021d(C35017f fVar) {
            this.f90102a = fVar;
        }

        public final /* synthetic */ void run(Object obj) {
            Boolean bool = (Boolean) obj;
            C23371a<Boolean> aVar = this.f90102a.f90092d;
            if (aVar != null) {
                aVar.run(bool);
            }
            ((MTRelationMemberListViewModel) this.f90102a.mo73210s()).mo73187s();
            C52711k.m112236a((Object) bool, "onShare");
            if (bool.booleanValue()) {
                FragmentActivity activity = this.f90102a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.f$e */
    static final class C35022e<T> implements C23371a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C35017f f90103a;

        C35022e(C35017f fVar) {
            this.f90103a = fVar;
        }

        public final /* synthetic */ void run(Object obj) {
            Boolean bool = (Boolean) obj;
            C23371a<Boolean> aVar = this.f90103a.f90092d;
            if (aVar != null) {
                aVar.run(bool);
            }
            C52711k.m112236a((Object) bool, "it");
            if (bool.booleanValue()) {
                FragmentActivity activity = this.f90103a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    /* renamed from: w */
    private final List<IMContact> m79153w() {
        return (List) this.f90096r.getValue();
    }

    /* renamed from: a */
    public final View mo72190a(int i) {
        if (this.f90098t == null) {
            this.f90098t = new HashMap();
        }
        View view = (View) this.f90098t.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f90098t.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: h */
    public final void mo72197h() {
        if (this.f90098t != null) {
            this.f90098t.clear();
        }
    }

    /* renamed from: j */
    public final int mo72210j() {
        return R.layout.bcr;
    }

    /* renamed from: k */
    public final boolean mo72211k() {
        return true;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo72197h();
    }

    /* renamed from: o */
    public final void mo72217o() {
        super.mo72217o();
        C35025i iVar = this.f90097s;
        if (iVar != null) {
            iVar.f90120d.setVisibility(8);
            C35142b bVar = iVar.f90119c;
            if (bVar != null) {
                bVar.mo73262c();
            }
        }
    }

    public final void onPause() {
        super.onPause();
        C35025i iVar = this.f90097s;
        if (iVar != null) {
            C35142b bVar = iVar.f90119c;
            if (bVar != null) {
                bVar.mo73261b();
            }
        }
    }

    public final void onResume() {
        super.onResume();
        C35025i iVar = this.f90097s;
        if (iVar != null) {
            C35142b bVar = iVar.f90119c;
            if (bVar != null) {
                bVar.mo73259a();
            }
        }
    }

    /* renamed from: q */
    public final void mo72245q() {
        super.mo72245q();
        C23371a<Boolean> aVar = this.f90092d;
        if (aVar != null) {
            aVar.run(Boolean.valueOf(false));
        }
    }

    /* renamed from: e */
    public final void mo72194e() {
        super.mo72194e();
        if (this.f90093e != -1) {
            ((MTRelationMemberListViewModel) mo73210s()).mo73178a(this.f90093e);
        }
        LinkedHashSet<IMContact> linkedHashSet = this.f90094j;
        if (linkedHashSet != null) {
            ((MTRelationMemberListViewModel) mo73210s()).mo73163b(C52575l.m112138e((Iterable<? extends T>) linkedHashSet));
        }
    }

    /* renamed from: g */
    public final String mo72196g() {
        if (!((MTRelationMemberListViewModel) mo73210s()).mo73181m()) {
            String string = C11010c.m22280a().getResources().getString(R.string.bn4);
            C52711k.m112236a((Object) string, "AppContextManager.getApp…m_select_single_relation)");
            return string;
        }
        String string2 = C11010c.m22280a().getResources().getString(R.string.bn2);
        C52711k.m112236a((Object) string2, "AppContextManager.getApp…select_multiple_relation)");
        return string2;
    }

    /* renamed from: i */
    public final void mo72209i() {
        super.mo72209i();
        View inflate = View.inflate(getContext(), R.layout.bd7, null);
        inflate.setOnClickListener(new C35018a(this));
        C52711k.m112236a((Object) inflate, "headerView");
        inflate.setBackground(C10678c.m21505e(getContext()));
        mo73208a(inflate);
    }

    /* renamed from: m */
    public final void mo72213m() {
        super.mo72213m();
        if (((MTRelationMemberListViewModel) mo73210s()).mo73181m()) {
            C35106c.m79327a(getContext(), ((MTRelationMemberListViewModel) mo73210s()).mo73183o(), ((MTRelationMemberListViewModel) mo73210s()).f90178c, ((MTRelationMemberListViewModel) mo73210s()).f90179d, (C23371a<Boolean>) new C35022e<Boolean>(this));
        }
    }

    public final void bk_() {
        super.bk_();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f90093e = arguments.getInt("key_select_mode", -1);
            Serializable serializable = arguments.getSerializable("key_selected_contact");
            if (!(serializable instanceof LinkedHashSet)) {
                serializable = null;
            }
            this.f90094j = (LinkedHashSet) serializable;
            this.f90095q = arguments.getBoolean("key_share_create_group_select", false);
            Parcelable parcelable = arguments.getParcelable("share_package");
            if (!(parcelable instanceof SharePackage)) {
                parcelable = null;
            }
            this.f90090b = (SharePackage) parcelable;
            SharePackage sharePackage = this.f90090b;
            if (sharePackage != null) {
                C35190af.m79442a().mo73320a(sharePackage, (IMContact) null, true);
            }
            Serializable serializable2 = arguments.getSerializable("share_content");
            if (!(serializable2 instanceof BaseContent)) {
                serializable2 = null;
            }
            this.f90091c = (BaseContent) serializable2;
            BaseContent.wrapForward(this.f90091c, arguments.getLong("forward_origin_msgid"));
            if (arguments != null) {
                return;
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: l */
    public final void mo72212l() {
        super.mo72212l();
        if (this.f90097s != null) {
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) mo72190a((int) R.id.d10);
            C52711k.m112236a((Object) imTextTitleBar, "title_bar");
            DmtTextView rightTexView = imTextTitleBar.getRightTexView();
            C52711k.m112236a((Object) rightTexView, "title_bar.rightTexView");
            rightTexView.setVisibility(8);
            return;
        }
        if (((MTRelationMemberListViewModel) mo73210s()).mo73181m()) {
            if (((MTRelationMemberListViewModel) mo73210s()).mo73184p() != 0) {
                ((ImTextTitleBar) mo72190a((int) R.id.d10)).setRightText(C11010c.m22280a().getResources().getString(R.string.bn7, new Object[]{Integer.valueOf(((MTRelationMemberListViewModel) mo73210s()).mo73184p())}));
                ImTextTitleBar imTextTitleBar2 = (ImTextTitleBar) mo72190a((int) R.id.d10);
                C52711k.m112236a((Object) imTextTitleBar2, "title_bar");
                View rightView = imTextTitleBar2.getRightView();
                C52711k.m112236a((Object) rightView, "title_bar.rightView");
                rightView.setEnabled(true);
                ImTextTitleBar imTextTitleBar3 = (ImTextTitleBar) mo72190a((int) R.id.d10);
                C52711k.m112236a((Object) imTextTitleBar3, "title_bar");
                DmtTextView rightTexView2 = imTextTitleBar3.getRightTexView();
                C52711k.m112236a((Object) rightTexView2, "title_bar.rightTexView");
                TextPaint paint = rightTexView2.getPaint();
                C52711k.m112236a((Object) paint, "title_bar.rightTexView.paint");
                paint.setFakeBoldText(true);
                ((ImTextTitleBar) mo72190a((int) R.id.d10)).setRightTextColor(C11010c.m22280a().getResources().getColor(R.color.a3c));
            } else {
                ((ImTextTitleBar) mo72190a((int) R.id.d10)).setRightText(C11010c.m22280a().getResources().getString(R.string.bn5));
                ImTextTitleBar imTextTitleBar4 = (ImTextTitleBar) mo72190a((int) R.id.d10);
                C52711k.m112236a((Object) imTextTitleBar4, "title_bar");
                View rightView2 = imTextTitleBar4.getRightView();
                C52711k.m112236a((Object) rightView2, "title_bar.rightView");
                rightView2.setEnabled(false);
                ImTextTitleBar imTextTitleBar5 = (ImTextTitleBar) mo72190a((int) R.id.d10);
                C52711k.m112236a((Object) imTextTitleBar5, "title_bar");
                DmtTextView rightTexView3 = imTextTitleBar5.getRightTexView();
                C52711k.m112236a((Object) rightTexView3, "title_bar.rightTexView");
                TextPaint paint2 = rightTexView3.getPaint();
                C52711k.m112236a((Object) paint2, "title_bar.rightTexView.paint");
                paint2.setFakeBoldText(false);
                ((ImTextTitleBar) mo72190a((int) R.id.d10)).setRightTextColor(C11010c.m22280a().getResources().getColor(R.color.a3e));
            }
        }
    }

    /* renamed from: c */
    public final void mo72244c(List<? extends IMContact> list) {
        boolean z;
        super.mo72244c(list);
        C35025i iVar = this.f90097s;
        if (iVar != null) {
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                iVar = null;
            }
            if (iVar != null) {
                iVar.mo73131b();
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ BaseMemberListViewModel mo72191a(C0184k kVar) {
        C0209x xVar;
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52671b bVar = new C35019b(this);
        Class<MTRelationMemberListViewModel> cls = MTRelationMemberListViewModel.class;
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

    /* renamed from: b */
    public final void mo72215b(List<? extends IMContact> list) {
        boolean z;
        boolean z2;
        Collection collection = list;
        boolean z3 = false;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C35284t a = C35284t.m79782a();
            C52711k.m112236a((Object) a, "IMSPUtils.get()");
            String B = a.mo73376B();
            CharSequence charSequence = B;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                list = C52575l.m112139e(collection);
                list.add(new C34979a(B));
            }
        }
        super.mo72215b(list);
        C35025i iVar = this.f90097s;
        if (iVar != null) {
            Collection collection2 = list;
            if (collection2 == null || collection2.isEmpty()) {
                z3 = true;
            }
            if (z3) {
                iVar = null;
            }
            if (iVar != null) {
                iVar.mo73131b();
            }
        }
    }

    /* renamed from: a */
    public final void mo72192a(List<? extends IMContact> list) {
        boolean z;
        if (list != null) {
            List arrayList = new ArrayList();
            Collection collection = list;
            arrayList.addAll(collection);
            Iterable iterable = arrayList;
            Collection arrayList2 = new ArrayList();
            for (Object next : iterable) {
                if (!m79153w().contains((IMContact) next)) {
                    arrayList2.add(next);
                }
            }
            for (IMContact iMContact : (List) arrayList2) {
                SharePackage sharePackage = this.f90090b;
                if (sharePackage != null) {
                    C35190af.m79442a().mo73320a(sharePackage, iMContact, false);
                }
            }
            m79153w().clear();
            m79153w().addAll(collection);
        }
        if (((MTRelationMemberListViewModel) mo73210s()).mo73181m()) {
            super.mo72192a(list);
        } else if (list != null) {
            for (IMContact iMContact2 : list) {
                C35106c.m79325a(getContext(), iMContact2, ((MTRelationMemberListViewModel) mo73210s()).f90178c, ((MTRelationMemberListViewModel) mo73210s()).f90179d, (C23371a<Boolean>) new C35021d<Boolean>(this));
                BaseContent baseContent = ((MTRelationMemberListViewModel) mo73210s()).f90179d;
                if (baseContent != null) {
                    String a = C35197am.m79555a(baseContent.generateSharePackage().f106895d);
                    if (!TextUtils.isEmpty(a)) {
                        if (iMContact2 instanceof IMUser) {
                            IMUser iMUser = (IMUser) iMContact2;
                            String uid = iMUser.getUid();
                            C52711k.m112236a((Object) uid, "it.uid");
                            String a2 = C11190e.m22687a(Long.parseLong(uid));
                            C35190af.m79442a();
                            C35190af.m79465a(a, a2, iMUser.getUid(), baseContent);
                        } else if (iMContact2 instanceof IMConversation) {
                            C35190af.m79442a();
                            C35190af.m79465a(a, ((IMConversation) iMContact2).getConversationId(), "", baseContent);
                        }
                    }
                }
            }
        }
        C35025i iVar = this.f90097s;
        if (iVar != null) {
            LinkedHashSet<IMContact> linkedHashSet = new LinkedHashSet<>(list);
            iVar.f90118b = linkedHashSet;
            C35117b bVar = iVar.f90117a;
            if (bVar != null) {
                bVar.mo73233a((Set<IMContact>) linkedHashSet);
            }
            iVar.mo73130a();
            if (linkedHashSet.isEmpty() || iVar.f90120d.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                iVar = null;
            }
            C35025i iVar2 = iVar;
            if (iVar2 != null) {
                iVar2.f90120d.setTranslationY(C35025i.f90114f);
                iVar2.mo73132c();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(iVar2.f90120d, "translationY", new float[]{C35025i.f90114f, 0.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(iVar2.f90120d, "alpha", new float[]{0.4f, 1.0f});
                C52711k.m112236a((Object) ofFloat, "translationAnimator");
                ofFloat.setDuration(220);
                ofFloat.setInterpolator(C1027f.m2954a(0.14f, 1.0f, 0.34f, 1.0f));
                C52711k.m112236a((Object) ofFloat2, "alphaAnimator");
                ofFloat2.setDuration(80);
                ofFloat2.setInterpolator(new LinearInterpolator());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.addListener(new C35027b(iVar2));
                animatorSet.start();
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i == 224 && intent != null) {
            Serializable serializableExtra = intent.getSerializableExtra("key_selected_contact");
            if (serializableExtra == null) {
                return;
            }
            if (serializableExtra != null) {
                MTRelationMemberListViewModel mTRelationMemberListViewModel = (MTRelationMemberListViewModel) mo73210s();
                List<IMContact> e = C52575l.m112138e((Iterable<? extends T>) (LinkedHashSet) serializableExtra);
                C52711k.m112240b(e, "groupList");
                Iterable o = mTRelationMemberListViewModel.mo73183o();
                Collection arrayList = new ArrayList();
                for (Object next : o) {
                    IMContact iMContact = (IMContact) next;
                    if (!(iMContact instanceof IMConversation) || e.contains(iMContact)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        arrayList.add(next);
                    }
                }
                List e2 = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
                for (IMContact iMContact2 : e) {
                    if (!e2.contains(iMContact2)) {
                        e2.add(iMContact2);
                    }
                }
                mTRelationMemberListViewModel.f90199p.postValue(e2);
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.collections.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact> /* = java.util.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact> */");
            }
        }
    }
}
