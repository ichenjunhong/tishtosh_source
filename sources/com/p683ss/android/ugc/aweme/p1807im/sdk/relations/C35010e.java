package com.p683ss.android.ugc.aweme.p1807im.sdk.relations;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.p702im.core.p706c.C11190e;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33220b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.C34831b.C34832a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model.C34979a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.MTRelationMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35057a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35116j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ShareNestedLayout;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.e */
public class C35010e extends C35057a<MTRelationMemberListViewModel> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f90072a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35010e.class), "mLastSelectedMember", "getMLastSelectedMember()Ljava/util/List;"))};

    /* renamed from: b */
    public BaseContent f90073b;

    /* renamed from: c */
    public C23371a<Boolean> f90074c = new C35013b(this);

    /* renamed from: d */
    public final SharePackage f90075d;

    /* renamed from: u */
    private int f90076u = -1;

    /* renamed from: v */
    private LinkedHashSet<IMContact> f90077v = ((LinkedHashSet) this.f90080y);

    /* renamed from: w */
    private final C52668f f90078w = C52732g.m112285a(C35014c.f90085a);

    /* renamed from: x */
    private final Activity f90079x;

    /* renamed from: y */
    private final Set<IMContact> f90080y;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.e$a */
    static final class C35011a<T> implements C0199s<IMContact> {

        /* renamed from: a */
        final /* synthetic */ C35010e f90081a;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.e$a$a */
        static final class C35012a implements C33242d {

            /* renamed from: a */
            final /* synthetic */ C35011a f90082a;

            /* renamed from: b */
            final /* synthetic */ IMContact f90083b;

            C35012a(C35011a aVar, IMContact iMContact) {
                this.f90082a = aVar;
                this.f90083b = iMContact;
            }

            public final void sendMsg() {
                String uuid = UUID.randomUUID().toString();
                C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
                C35106c.m79332a(C52575l.m112101c(this.f90083b), "", this.f90082a.f90081a.f90075d, this.f90082a.f90081a.f90073b, uuid);
                C35190af.m79456a(this.f90082a.f90081a.f90075d, "1", "", C52575l.m112101c(this.f90083b));
                C35190af.m79442a().mo73320a(this.f90082a.f90081a.f90075d, this.f90083b, false);
                if (this.f90082a.f90081a.f90075d != null) {
                    SharePackage sharePackage = this.f90082a.f90081a.f90075d;
                    if (sharePackage == null) {
                        C52711k.m112234a();
                    }
                    C35116j.m79348a(uuid, sharePackage, C52575l.m112101c(this.f90083b));
                }
            }
        }

        C35011a(C35010e eVar) {
            this.f90081a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            IMContact iMContact = (IMContact) obj;
            if (iMContact != null) {
                new C33220b(this.f90081a.getContext(), new C35012a(this, iMContact)).sendMsg();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.e$b */
    static final class C35013b<T> implements C23371a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C35010e f90084a;

        C35013b(C35010e eVar) {
            this.f90084a = eVar;
        }

        public final /* synthetic */ void run(Object obj) {
            Boolean bool = (Boolean) obj;
            this.f90084a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.e$c */
    static final class C35014c extends C52712l implements C52670a<List<IMContact>> {

        /* renamed from: a */
        public static final C35014c f90085a = new C35014c();

        C35014c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.e$d */
    static final class C35015d<T> implements C23371a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C35010e f90086a;

        C35015d(C35010e eVar) {
            this.f90086a = eVar;
        }

        public final /* synthetic */ void run(Object obj) {
            Boolean bool = (Boolean) obj;
            C23371a<Boolean> aVar = this.f90086a.f90074c;
            if (aVar != null) {
                aVar.run(bool);
            }
            ((MTRelationMemberListViewModel) this.f90086a.mo73191j()).mo73187s();
            C52711k.m112236a((Object) bool, "onShare");
            if (bool.booleanValue()) {
                this.f90086a.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.e$e */
    static final class C35016e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35010e f90087a;

        /* renamed from: b */
        final /* synthetic */ int f90088b;

        C35016e(C35010e eVar, int i) {
            this.f90087a = eVar;
            this.f90088b = i;
        }

        public final void run() {
            C34831b bVar = this.f90087a.f90217n;
            if (bVar != null) {
                bVar.mo72950a(0, this.f90088b);
            }
            this.f90087a.mo73118a(true);
        }
    }

    /* renamed from: m */
    private final List<IMContact> m79141m() {
        return (List) this.f90078w.getValue();
    }

    /* renamed from: b */
    public final int mo73119b() {
        return R.layout.bgl;
    }

    /* renamed from: f */
    public final boolean mo73125f() {
        return false;
    }

    /* renamed from: c */
    public final void mo73121c() {
        super.mo73121c();
        this.f90076u = 3;
    }

    /* renamed from: g */
    public final void mo73126g() {
        super.mo73126g();
        C34831b bVar = this.f90217n;
        if (bVar != null) {
            bVar.mo72954b();
        }
    }

    /* renamed from: e */
    public final void mo73124e() {
        super.mo73124e();
        if (this.f90076u != -1) {
            ((MTRelationMemberListViewModel) mo73191j()).mo73178a(this.f90076u);
        }
        LinkedHashSet<IMContact> linkedHashSet = this.f90077v;
        if (linkedHashSet != null) {
            ((MTRelationMemberListViewModel) mo73191j()).mo73163b(C52575l.m112138e((Iterable<? extends T>) linkedHashSet));
        }
        ((MTRelationMemberListViewModel) mo73191j()).f90201r.observe(this, new C35011a(this));
    }

    /* renamed from: d */
    public final void mo73123d() {
        super.mo73123d();
        Activity activity = this.f90079x;
        if (activity == null) {
            C52711k.m112234a();
        }
        C23371a<Boolean> aVar = this.f90074c;
        ShareNestedLayout shareNestedLayout = (ShareNestedLayout) findViewById(R.id.cnh);
        C52711k.m112236a((Object) shareNestedLayout, "share_panel_root_layout");
        ViewGroup viewGroup = shareNestedLayout;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bl1);
        C52711k.m112236a((Object) recyclerView, "member_list");
        ViewGroup viewGroup2 = recyclerView;
        SharePackage sharePackage = this.f90075d;
        BaseContent baseContent = this.f90073b;
        LinkedHashSet<IMContact> linkedHashSet = this.f90077v;
        MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) findViewById(R.id.ek6);
        C52711k.m112236a((Object) measureLinearLayout, "ll_meausre_keyboard");
        C34831b bVar = new C34831b(activity, aVar, viewGroup, viewGroup2, sharePackage, baseContent, linkedHashSet, false, measureLinearLayout);
        this.f90217n = bVar;
    }

    /* renamed from: a */
    public final /* synthetic */ BaseMemberListViewModel mo73116a(C0184k kVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        MTRelationMemberListViewModel mTRelationMemberListViewModel = new MTRelationMemberListViewModel();
        mTRelationMemberListViewModel.f90193j = this.f90219p;
        mTRelationMemberListViewModel.f90178c = this.f90075d;
        mTRelationMemberListViewModel.f90179d = this.f90073b;
        return mTRelationMemberListViewModel;
    }

    /* renamed from: b */
    public final void mo73120b(List<? extends IMContact> list) {
        boolean z;
        super.mo73120b(list);
        C34831b bVar = this.f90217n;
        if (bVar != null) {
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bVar = null;
            }
            if (bVar != null) {
                bVar.mo72955c();
            }
        }
    }

    /* renamed from: a */
    public final void mo73118a(boolean z) {
        int i;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bl1);
        C52711k.m112236a((Object) recyclerView, "member_list");
        LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (z) {
                i = C34832a.m78901a();
            } else {
                i = 0;
            }
            marginLayoutParams.bottomMargin = i;
            RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.bl1);
            C52711k.m112236a((Object) recyclerView2, "member_list");
            recyclerView2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a */
    public final void mo73117a(List<? extends IMContact> list) {
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
        super.mo73117a(list);
        C34831b bVar = this.f90217n;
        if (bVar != null) {
            Collection collection2 = list;
            if (collection2 == null || collection2.isEmpty()) {
                z3 = true;
            }
            if (z3) {
                bVar = null;
            }
            if (bVar != null) {
                bVar.mo72955c();
            }
        }
    }

    /* renamed from: c */
    public final void mo73122c(List<? extends IMContact> list) {
        int i;
        if (list != null) {
            List arrayList = new ArrayList();
            Collection collection = list;
            arrayList.addAll(collection);
            Iterable iterable = arrayList;
            Collection arrayList2 = new ArrayList();
            for (Object next : iterable) {
                if (!m79141m().contains((IMContact) next)) {
                    arrayList2.add(next);
                }
            }
            for (IMContact iMContact : (List) arrayList2) {
                SharePackage sharePackage = this.f90075d;
                if (sharePackage != null) {
                    C35190af.m79442a().mo73320a(sharePackage, iMContact, false);
                }
            }
            m79141m().clear();
            m79141m().addAll(collection);
        }
        if (((MTRelationMemberListViewModel) mo73191j()).mo73181m()) {
            super.mo73122c(list);
        } else if (list != null) {
            for (IMContact iMContact2 : list) {
                C35106c.m79325a(getContext(), iMContact2, ((MTRelationMemberListViewModel) mo73191j()).f90178c, ((MTRelationMemberListViewModel) mo73191j()).f90179d, (C23371a<Boolean>) new C35015d<Boolean>(this));
                BaseContent baseContent = ((MTRelationMemberListViewModel) mo73191j()).f90179d;
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
        LinkedHashSet linkedHashSet = new LinkedHashSet(list);
        C34831b bVar = this.f90217n;
        if (bVar != null) {
            bVar.mo72951a(linkedHashSet);
        }
        if (!C9376b.m18558a((Collection<T>) linkedHashSet)) {
            if (!this.f90211h || this.f90214k <= 0) {
                i = this.f90213j;
            } else {
                i = this.f90212i;
            }
            if (!this.f90215l || C9376b.m18558a((Collection<T>) this.f90077v)) {
                C34831b bVar2 = this.f90217n;
                if (bVar2 != null) {
                    bVar2.mo72950a(0, i);
                }
            } else {
                mo73118a(false);
                mo73189h().postDelayed(new C35016e(this, i), 500);
            }
            if (C9376b.m18558a((Collection<T>) this.f90077v)) {
                mo73118a(true);
            }
            if (this.f90215l) {
                this.f90216m = this.f90211h;
                this.f90215l = false;
            }
        }
    }

    public C35010e(Activity activity, SharePackage sharePackage, Set<IMContact> set, int i) {
        C52711k.m112240b(activity, "activity");
        super(activity, i);
        this.f90079x = activity;
        this.f90075d = sharePackage;
        this.f90080y = set;
    }
}
