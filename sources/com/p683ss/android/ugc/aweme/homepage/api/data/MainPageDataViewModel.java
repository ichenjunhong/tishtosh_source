package com.p683ss.android.ugc.aweme.homepage.api.data;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.Fragment;
import android.view.View;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel */
public final class MainPageDataViewModel extends C0209x {

    /* renamed from: c */
    public static final C32966a f85660c = new C32966a(null);

    /* renamed from: a */
    public View f85661a;

    /* renamed from: b */
    public String f85662b = "homepage_hot";

    /* renamed from: com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel$a */
    public static final class C32966a {

        /* renamed from: com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel$a$a */
        public static final class C32967a implements C0212b {
            C32967a() {
            }

            /* renamed from: a */
            public final <T extends C0209x> T mo361a(Class<T> cls) {
                C52711k.m112240b(cls, "modelClass");
                return (C0209x) new MainPageDataViewModel();
            }
        }

        private C32966a() {
        }

        public /* synthetic */ C32966a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public static final MainPageDataViewModel m75871a(Fragment fragment) {
        C52711k.m112240b(fragment, "fragment");
        C0209x a = C0214z.m439a(fragment, (C0212b) new C32967a()).mo359a(MainPageDataViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(fr…ataViewModel::class.java)");
        return (MainPageDataViewModel) a;
    }
}
