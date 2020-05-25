package com.p683ss.android.ugc.aweme.homepage.api.data;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel */
public final class HomePageDataViewModel extends C0209x {

    /* renamed from: n */
    public static final C32964a f85646n = new C32964a(null);

    /* renamed from: a */
    public boolean f85647a;

    /* renamed from: b */
    public final C32968a f85648b = new C32968a();

    /* renamed from: c */
    public final Lock f85649c = new ReentrantLock();

    /* renamed from: d */
    public boolean f85650d;

    /* renamed from: e */
    public String f85651e;

    /* renamed from: f */
    public Aweme f85652f;

    /* renamed from: g */
    public C0198r<String> f85653g = new C0198r<>();

    /* renamed from: h */
    public C0198r<String> f85654h = new C0198r<>();

    /* renamed from: i */
    public String f85655i;

    /* renamed from: j */
    public Aweme f85656j;

    /* renamed from: k */
    public boolean f85657k;

    /* renamed from: l */
    public int f85658l = 1;

    /* renamed from: m */
    public int f85659m = -1;

    /* renamed from: com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel$a */
    public static final class C32964a {

        /* renamed from: com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel$a$a */
        public static final class C32965a implements C0212b {
            C32965a() {
            }

            /* renamed from: a */
            public final <T extends C0209x> T mo361a(Class<T> cls) {
                C52711k.m112240b(cls, "modelClass");
                return (C0209x) new HomePageDataViewModel();
            }
        }

        private C32964a() {
        }

        public /* synthetic */ C32964a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static HomePageDataViewModel m75869a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m441a(fragmentActivity, (C0212b) new C32965a()).mo359a(HomePageDataViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ataViewModel::class.java)");
            return (HomePageDataViewModel) a;
        }
    }

    /* renamed from: a */
    public static final HomePageDataViewModel m75866a(FragmentActivity fragmentActivity) {
        return C32964a.m75869a(fragmentActivity);
    }

    /* renamed from: a */
    public final String mo69848a() {
        return (String) this.f85653g.getValue();
    }

    /* renamed from: a */
    public final void mo69849a(String str) {
        this.f85653g.setValue(str);
    }
}
