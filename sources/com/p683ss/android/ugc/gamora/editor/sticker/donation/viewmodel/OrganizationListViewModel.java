package com.p683ss.android.ugc.gamora.editor.sticker.donation.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.api.C49477a;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.api.C49478b;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49480a;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49481b;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49482c;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel */
public final class OrganizationListViewModel extends JediViewModel<OrganizationListState> {

    /* renamed from: g */
    public static final C49514a f124230g = new C49514a(null);

    /* renamed from: d */
    public int f124231d;

    /* renamed from: e */
    public int f124232e = 1;

    /* renamed from: f */
    public List<C49481b> f124233f = new ArrayList();

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel$a */
    public static final class C49514a {
        private C49514a() {
        }

        public /* synthetic */ C49514a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel$b */
    static final class C49515b extends C52712l implements C52671b<OrganizationListState, OrganizationListState> {

        /* renamed from: a */
        final /* synthetic */ OrganizationListViewModel f124234a;

        /* renamed from: b */
        final /* synthetic */ boolean f124235b;

        C49515b(OrganizationListViewModel organizationListViewModel, boolean z) {
            this.f124234a = organizationListViewModel;
            this.f124235b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            OrganizationListState organizationListState = (OrganizationListState) obj;
            C52711k.m112240b(organizationListState, "$receiver");
            List<C49481b> list = this.f124234a.f124233f;
            boolean z2 = this.f124235b;
            if (this.f124234a.f124232e == 1) {
                z = true;
            } else {
                z = false;
            }
            C49521a aVar = new C49521a(list, null, null, true, false, z2, z, 22, null);
            return organizationListState.copy(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel$c */
    static final class C49516c<T> implements C1710e<C49482c> {

        /* renamed from: a */
        final /* synthetic */ OrganizationListViewModel f124236a;

        /* renamed from: b */
        final /* synthetic */ boolean f124237b;

        C49516c(OrganizationListViewModel organizationListViewModel, boolean z) {
            this.f124236a = organizationListViewModel;
            this.f124237b = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            final C49482c cVar = (C49482c) obj;
            if (cVar.error_code == 0) {
                this.f124236a.f124231d = cVar.f124167a;
                this.f124236a.f124232e = cVar.f124168b;
                List<C49481b> list = cVar.f124171e;
                if (list != null) {
                    this.f124236a.f124233f.addAll(list);
                }
                this.f124236a.mo22530c(new C52671b<OrganizationListState, OrganizationListState>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C49516c f124238a;

                    {
                        this.f124238a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        boolean z;
                        OrganizationListState organizationListState = (OrganizationListState) obj;
                        C52711k.m112240b(organizationListState, "$receiver");
                        List<C49481b> list = this.f124238a.f124236a.f124233f;
                        String str = cVar.f124169c;
                        C49480a aVar = cVar.f124170d;
                        boolean z2 = this.f124238a.f124237b;
                        if (this.f124238a.f124236a.f124232e == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C49521a aVar2 = new C49521a(list, str, aVar, false, true, z2, z);
                        return organizationListState.copy(aVar2);
                    }
                });
                return;
            }
            this.f124236a.mo22530c(new C52671b<OrganizationListState, OrganizationListState>(this) {

                /* renamed from: a */
                final /* synthetic */ C49516c f124240a;

                {
                    this.f124240a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    boolean z;
                    OrganizationListState organizationListState = (OrganizationListState) obj;
                    C52711k.m112240b(organizationListState, "$receiver");
                    List<C49481b> list = this.f124240a.f124236a.f124233f;
                    boolean z2 = this.f124240a.f124237b;
                    if (this.f124240a.f124236a.f124232e == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C49521a aVar = new C49521a(list, null, null, false, false, z2, z, 22, null);
                    return organizationListState.copy(aVar);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel$d */
    static final class C49519d<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ OrganizationListViewModel f124241a;

        /* renamed from: b */
        final /* synthetic */ boolean f124242b;

        C49519d(OrganizationListViewModel organizationListViewModel, boolean z) {
            this.f124241a = organizationListViewModel;
            this.f124242b = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            C32458a.m75148a((Throwable) obj);
            this.f124241a.mo22530c(new C52671b<OrganizationListState, OrganizationListState>(this) {

                /* renamed from: a */
                final /* synthetic */ C49519d f124243a;

                {
                    this.f124243a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    boolean z;
                    OrganizationListState organizationListState = (OrganizationListState) obj;
                    C52711k.m112240b(organizationListState, "$receiver");
                    List<C49481b> list = this.f124243a.f124241a.f124233f;
                    boolean z2 = this.f124243a.f124242b;
                    if (this.f124243a.f124241a.f124232e == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C49521a aVar = new C49521a(list, null, null, false, false, z2, z, 22, null);
                    return organizationListState.copy(aVar);
                }
            });
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new OrganizationListState(null, 1, null);
    }

    /* renamed from: e */
    public final void mo97443e() {
        this.f124233f.clear();
        this.f124231d = 0;
        this.f124232e = 1;
        mo97442a(false);
    }

    /* renamed from: a */
    public final void mo97442a(boolean z) {
        mo22530c(new C49515b(this, z));
        C49477a.m106731a(new C49478b(this.f124231d, 11)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C49516c<Object>(this, z), (C1710e<? super Throwable>) new C49519d<Object>(this, z));
    }
}
