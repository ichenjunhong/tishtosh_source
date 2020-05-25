package com.p683ss.android.ugc.aweme.p1807im.sdk.group.view;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0497a;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.view.View;
import android.view.Window;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34191d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupFollowMemberViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupFollowGuideDialog */
public final class GroupFollowGuideDialog extends BaseBottomShareDialog {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f88545g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupFollowGuideDialog.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/im/sdk/group/adapter/GroupFollowMemberListAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupFollowGuideDialog.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupFollowMemberViewModel;"))};

    /* renamed from: h */
    public List<? extends IMUser> f88546h;

    /* renamed from: i */
    public final String f88547i;

    /* renamed from: j */
    private final C52668f f88548j = C52732g.m112285a(new C34296c(this));

    /* renamed from: k */
    private final C52668f f88549k = C52732g.m112285a(new C34297d(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupFollowGuideDialog$a */
    public static final class C34294a extends C0497a {

        /* renamed from: a */
        final /* synthetic */ GroupFollowGuideDialog f88550a;

        /* renamed from: b */
        final /* synthetic */ int f88551b;

        /* renamed from: a */
        public final void mo1315a(View view, float f) {
            C52711k.m112240b(view, "p0");
        }

        C34294a(GroupFollowGuideDialog groupFollowGuideDialog, int i) {
            this.f88550a = groupFollowGuideDialog;
            this.f88551b = i;
        }

        /* renamed from: a */
        public final void mo1316a(View view, int i) {
            C52711k.m112240b(view, "p0");
            if (i == 5) {
                this.f88550a.dismiss();
                BottomSheetBehavior a = BottomSheetBehavior.m1227a(view);
                C52711k.m112236a((Object) a, "BottomSheetBehavior.from(p0)");
                a.mo1301b(4);
                return;
            }
            if (i == 1) {
                RecyclerView recyclerView = (RecyclerView) this.f88550a.findViewById(R.id.e9q);
                C52711k.m112236a((Object) recyclerView, "follow_list");
                C1332i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager == null) {
                    throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                } else if (((LinearLayoutManager) layoutManager).mo4750k() != 0) {
                    BottomSheetBehavior a2 = BottomSheetBehavior.m1227a(view);
                    C52711k.m112236a((Object) a2, "BottomSheetBehavior.from(p0)");
                    a2.mo1301b(4);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupFollowGuideDialog$b */
    static final class C34295b<T> implements C0199s<List<? extends IMContact>> {

        /* renamed from: a */
        final /* synthetic */ GroupFollowGuideDialog f88552a;

        C34295b(GroupFollowGuideDialog groupFollowGuideDialog) {
            this.f88552a = groupFollowGuideDialog;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            List list = (List) obj;
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            Integer num = null;
            if (z) {
                this.f88552a.dismiss();
            } else {
                C34191d d = this.f88552a.mo72323d();
                Iterable<IMContact> iterable = list;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (IMContact iMContact : iterable) {
                    if (iMContact != null) {
                        arrayList.add((IMUser) iMContact);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                    }
                }
                d.mo70601a((List) arrayList, null);
            }
            StringBuilder sb = new StringBuilder(" list size: ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            }
            sb.append(num);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupFollowGuideDialog$c */
    static final class C34296c extends C52712l implements C52670a<C34191d> {

        /* renamed from: a */
        final /* synthetic */ GroupFollowGuideDialog f88553a;

        C34296c(GroupFollowGuideDialog groupFollowGuideDialog) {
            this.f88553a = groupFollowGuideDialog;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C34191d(this.f88553a.f88524e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupFollowGuideDialog$d */
    static final class C34297d extends C52712l implements C52670a<GroupFollowMemberViewModel> {

        /* renamed from: a */
        final /* synthetic */ GroupFollowGuideDialog f88554a;

        C34297d(GroupFollowGuideDialog groupFollowGuideDialog) {
            this.f88554a = groupFollowGuideDialog;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C0209x xVar;
            GroupFollowGuideDialog groupFollowGuideDialog = this.f88554a;
            C0184k kVar = this.f88554a.f88524e;
            Class<GroupFollowMemberViewModel> cls = GroupFollowMemberViewModel.class;
            C52671b r3 = new C52671b<GroupFollowMemberViewModel, GroupFollowMemberViewModel>(this) {

                /* renamed from: a */
                final /* synthetic */ C34297d f88555a;

                {
                    this.f88555a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    GroupFollowMemberViewModel groupFollowMemberViewModel = (GroupFollowMemberViewModel) obj;
                    C52711k.m112240b(groupFollowMemberViewModel, "$receiver");
                    groupFollowMemberViewModel.f88677a = this.f88555a.f88554a.f88547i;
                    return groupFollowMemberViewModel;
                }
            };
            if (kVar instanceof Fragment) {
                C0210y a = C0214z.m439a((Fragment) kVar, (C0212b) groupFollowGuideDialog.mo72311a());
                String name = cls.getName();
                C52711k.m112236a((Object) name, "viewModelClass.java.name");
                xVar = a.mo360a(name, cls);
                C52711k.m112236a((Object) xVar, "this");
                r3.invoke(xVar);
            } else if (kVar instanceof FragmentActivity) {
                C0210y a2 = C0214z.m441a((FragmentActivity) kVar, (C0212b) groupFollowGuideDialog.mo72311a());
                String name2 = cls.getName();
                C52711k.m112236a((Object) name2, "viewModelClass.java.name");
                xVar = a2.mo360a(name2, cls);
                C52711k.m112236a((Object) xVar, "this");
                r3.invoke(xVar);
            } else {
                throw new IllegalAccessException("owner must be either FragmentActivity or Fragment");
            }
            C52711k.m112236a((Object) xVar, "when (lifecycleOwner) {\n…)\n            }\n        }");
            return (GroupFollowMemberViewModel) xVar;
        }
    }

    /* renamed from: e */
    private final GroupFollowMemberViewModel m78196e() {
        return (GroupFollowMemberViewModel) this.f88549k.getValue();
    }

    /* renamed from: b */
    public final int mo42942b() {
        return R.layout.bch;
    }

    /* renamed from: d */
    public final C34191d mo72323d() {
        return (C34191d) this.f88548j.getValue();
    }

    public final void dismiss() {
        super.dismiss();
        C35284t.m79782a().mo73396a(this.f88547i, m78196e().mo72359e());
    }

    public final void show() {
        super.show();
        C35190af.m79537s(this.f88547i);
        C35284t a = C35284t.m79782a();
        C52711k.m112236a((Object) a, "IMSPUtils.get()");
        a.mo73433k(System.currentTimeMillis());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo72312c() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.e9q);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f88523d));
        recyclerView.setAdapter(mo72323d());
        recyclerView.setNestedScrollingEnabled(false);
    }

    public final void onStart() {
        super.onStart();
        int b = (C9432q.m18688b(this.f88523d) + C9432q.m18695e(this.f88523d)) / 2;
        Resources resources = this.f88523d.getResources();
        int dimensionPixelSize = b + resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, dimensionPixelSize);
            window.setGravity(80);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            View findViewById = window2.findViewById(R.id.a4q);
            if (findViewById != null) {
                BottomSheetBehavior a = BottomSheetBehavior.m1227a(findViewById);
                C52711k.m112236a((Object) a, "behavior");
                a.mo1296a(dimensionPixelSize);
                a.f1646q = new C34294a(this, dimensionPixelSize);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m78196e().f90194k.observe(this.f88524e, new C34295b(this));
        C0198r<List<IMContact>> rVar = m78196e().f90194k;
        List<? extends IMUser> list = this.f88546h;
        if (list == null) {
            list = C52575l.m112097a();
        }
        rVar.postValue(list);
    }

    public GroupFollowGuideDialog(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "conversationId");
        super(context);
        this.f88547i = str;
    }
}
