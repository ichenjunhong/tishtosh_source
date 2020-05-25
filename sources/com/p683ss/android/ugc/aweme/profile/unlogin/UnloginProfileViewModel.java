package com.p683ss.android.ugc.aweme.profile.unlogin;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileViewModel */
public final class UnloginProfileViewModel extends JediBaseViewModel<UnloginProfileState> {

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileViewModel$a */
    static final class C40479a extends C52712l implements C52671b<UnloginProfileState, UnloginProfileState> {

        /* renamed from: a */
        public static final C40479a f103341a = new C40479a();

        C40479a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            UnloginProfileState unloginProfileState = (UnloginProfileState) obj;
            C52711k.m112240b(unloginProfileState, "$receiver");
            return unloginProfileState.copy(C40486d.EMPTY, C52575l.m112097a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileViewModel$b */
    static final class C40480b<TTaskResult, TContinuationResult> implements C0011g<C40483a, C52860x> {

        /* renamed from: a */
        final /* synthetic */ UnloginProfileViewModel f103342a;

        /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileViewModel$b$a */
        static final class C40481a extends C52712l implements C52671b<UnloginProfileState, UnloginProfileState> {

            /* renamed from: a */
            final /* synthetic */ List f103343a;

            C40481a(List list) {
                this.f103343a = list;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                C40486d dVar;
                UnloginProfileState unloginProfileState = (UnloginProfileState) obj;
                C52711k.m112240b(unloginProfileState, "$receiver");
                List list = this.f103343a;
                if (this.f103343a.isEmpty()) {
                    dVar = C40486d.EMPTY;
                } else {
                    dVar = C40486d.NOT_EMPTY;
                }
                return unloginProfileState.copy(dVar, list);
            }
        }

        C40480b(UnloginProfileViewModel unloginProfileViewModel) {
            this.f103342a = unloginProfileViewModel;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "it");
            if (!iVar.mo33d()) {
                this.f103342a.mo22530c(new C40481a(((C40483a) iVar.mo34e()).f103345a));
            }
            this.f103342a.mo82780e();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileViewModel$c */
    static final class C40482c extends C52712l implements C52671b<UnloginProfileState, C52860x> {

        /* renamed from: a */
        public static final C40482c f103344a = new C40482c();

        C40482c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            UnloginProfileState unloginProfileState = (UnloginProfileState) obj;
            C52711k.m112240b(unloginProfileState, "it");
            C40505l.f103378a.mo82790a(unloginProfileState.getAwemeList());
            return C52860x.f131107a;
        }
    }

    /* renamed from: e */
    public final void mo82780e() {
        mo22527b(C40482c.f103344a);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new UnloginProfileState(null, null, 3, null);
    }
}
