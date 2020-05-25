package com.p683ss.android.ugc.aweme.profile.viewmodel;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.Fragment;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11896i;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p064c.p065a.p069b.C1690c;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel */
public final class ProfileViewModel extends JediViewModel<ProfileState> {

    /* renamed from: d */
    public static final C40598a f103557d = new C40598a(null);

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$a */
    public static final class C40598a {

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$a$a */
        public static final class C40599a implements C0212b {
            C40599a() {
            }

            /* renamed from: a */
            public final <T extends C0209x> T mo361a(Class<T> cls) {
                C52711k.m112240b(cls, "modelClass");
                return (C0209x) new ProfileViewModel();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$a$b */
        static final class C40600b extends C52712l implements C52671b<ProfileState, ProfileState> {

            /* renamed from: a */
            public static final C40600b f103558a = new C40600b();

            C40600b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ProfileState profileState = (ProfileState) obj;
                C52711k.m112240b(profileState, "$receiver");
                return profileState;
            }
        }

        private C40598a() {
        }

        public /* synthetic */ C40598a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static ProfileViewModel m90039a(Fragment fragment) {
            C52711k.m112240b(fragment, "fragment");
            C0209x a = C0214z.m439a(fragment, (C0212b) new C40599a()).mo360a(ProfileViewModel.class.getName(), ProfileViewModel.class);
            ProfileViewModel profileViewModel = (ProfileViewModel) a;
            profileViewModel.mo22526a((C52671b<? super S, ? extends S>) C40600b.f103558a);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(fr…eturn@initialize this } }");
            return profileViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$b */
    static final class C40601b extends C52712l implements C52671b<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52671b f103559a;

        C40601b(C52671b bVar) {
            this.f103559a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.f103559a.invoke(Boolean.valueOf(((Boolean) obj).booleanValue()));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$c */
    static final class C40602c extends C52712l implements C52671b<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52671b f103560a;

        C40602c(C52671b bVar) {
            this.f103560a = bVar;
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            this.f103560a.invoke((Boolean) obj);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$d */
    static final class C40603d extends C52712l implements C52671b<User, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52671b f103561a;

        C40603d(C52671b bVar) {
            this.f103561a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            User user = (User) obj;
            C52671b bVar = this.f103561a;
            C52711k.m112240b(bVar, "$this$nullable");
            if (user != null) {
                bVar.invoke(user);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$e */
    public static final class C40604e extends C52712l implements C52671b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ int f103562a;

        public C40604e(int i) {
            this.f103562a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ProfileState profileState = (ProfileState) obj;
            ProfileState profileState2 = profileState;
            C52711k.m112240b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, this.f103562a, false, null, null, null, null, null, null, null, false, false, false, null, false, null, 2097087, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$f */
    public static final class C40605f extends C52712l implements C52671b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ int f103563a;

        public C40605f(int i) {
            this.f103563a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ProfileState profileState = (ProfileState) obj;
            ProfileState profileState2 = profileState;
            C52711k.m112240b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, false, false, false, Integer.valueOf(this.f103563a), false, null, 1835007, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$g */
    public static final class C40606g extends C52712l implements C52671b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ String f103564a;

        public C40606g(String str) {
            this.f103564a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ProfileState profileState = (ProfileState) obj;
            ProfileState profileState2 = profileState;
            C52711k.m112240b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, this.f103564a, null, null, null, false, false, false, null, false, null, 2095103, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$h */
    public static final class C40607h extends C52712l implements C52671b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ String f103565a;

        public C40607h(String str) {
            this.f103565a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ProfileState profileState = (ProfileState) obj;
            ProfileState profileState2 = profileState;
            C52711k.m112240b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, this.f103565a, null, null, null, null, false, false, false, null, false, null, 2096127, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$i */
    public static final class C40608i extends C52712l implements C52671b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ boolean f103566a;

        public C40608i(boolean z) {
            this.f103566a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ProfileState profileState = (ProfileState) obj;
            ProfileState profileState2 = profileState;
            C52711k.m112240b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, false, false, false, null, this.f103566a, null, 1572863, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$j */
    static final class C40609j extends C52712l implements C52671b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ boolean f103567a;

        C40609j(boolean z) {
            this.f103567a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ProfileState profileState = (ProfileState) obj;
            ProfileState profileState2 = profileState;
            C52711k.m112240b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, Boolean.valueOf(this.f103567a), null, false, false, false, null, false, null, 2088959, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$k */
    static final class C40610k extends C52712l implements C52671b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ boolean f103568a;

        C40610k(boolean z) {
            this.f103568a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ProfileState profileState = (ProfileState) obj;
            ProfileState profileState2 = profileState;
            C52711k.m112240b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, Boolean.valueOf(this.f103568a), false, false, false, null, false, null, 2080767, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$l */
    static final class C40611l extends C52712l implements C52671b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ boolean f103569a;

        C40611l(boolean z) {
            this.f103569a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ProfileState profileState = (ProfileState) obj;
            ProfileState profileState2 = profileState;
            C52711k.m112240b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, Boolean.valueOf(this.f103569a), null, null, false, false, false, null, false, null, 2093055, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$m */
    static final class C40612m extends C52712l implements C52671b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ User f103570a;

        C40612m(User user) {
            this.f103570a = user;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ProfileState profileState = (ProfileState) obj;
            ProfileState profileState2 = profileState;
            C52711k.m112240b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, this.f103570a, null, null, 0, 0, false, null, null, null, null, null, null, null, false, false, false, null, false, null, 2097147, null);
        }
    }

    /* renamed from: a */
    public static final ProfileViewModel m90030a(Fragment fragment) {
        return C40598a.m90039a(fragment);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        ProfileState profileState = new ProfileState(null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, false, false, false, null, false, null, 2097151, null);
        return profileState;
    }

    /* renamed from: a */
    public final void mo82943a(User user) {
        C52711k.m112240b(user, "u");
        mo22530c(new C40612m(user));
    }

    /* renamed from: b */
    public final void mo82945b(boolean z) {
        mo22530c(new C40609j(z));
    }

    /* renamed from: c */
    public final void mo82946c(boolean z) {
        mo22530c(new C40610k(z));
    }

    /* renamed from: a */
    public final void mo82944a(boolean z) {
        mo22530c(new C40611l(false));
    }

    /* renamed from: g */
    public final C1690c mo82947g(C52671b<? super User, C52860x> bVar) {
        C52711k.m112240b(bVar, "subscriber");
        return mo22524a(C40617e.f103575a, C11896i.m24255a(), (C52671b<? super A, C52860x>) new C40603d<Object,C52860x>(bVar));
    }

    /* renamed from: h */
    public final C1690c mo82948h(C52671b<? super Boolean, C52860x> bVar) {
        C52711k.m112240b(bVar, "subscriber");
        return mo22524a(C40615c.f103573a, C11896i.m24255a(), (C52671b<? super A, C52860x>) new C40601b<Object,C52860x>(bVar));
    }

    /* renamed from: i */
    public final C1690c mo82949i(C52671b<? super Boolean, C52860x> bVar) {
        C52711k.m112240b(bVar, "subscriber");
        return mo22524a(C40616d.f103574a, C11896i.m24255a(), (C52671b<? super A, C52860x>) new C40602c<Object,C52860x>(bVar));
    }
}
