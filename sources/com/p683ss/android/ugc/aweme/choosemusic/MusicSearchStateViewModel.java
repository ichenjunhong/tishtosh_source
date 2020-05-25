package com.p683ss.android.ugc.aweme.choosemusic;

import android.arch.lifecycle.C0209x;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24866v;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel */
public final class MusicSearchStateViewModel extends C0209x {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f65629a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MusicSearchStateViewModel.class), "searchStateLiveData", "getSearchStateLiveData()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MusicSearchStateViewModel.class), "searchKeyword", "getSearchKeyword()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MusicSearchStateViewModel.class), "openSearchParam", "getOpenSearchParam()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MusicSearchStateViewModel.class), "dismissKeyboard", "getDismissKeyboard()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MusicSearchStateViewModel.class), "dismissKeyboardOnActionDown", "getDismissKeyboardOnActionDown()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;"))};

    /* renamed from: b */
    public static final C24797a f65630b = new C24797a(null);

    /* renamed from: c */
    private final C52668f f65631c = C52732g.m112285a(C24802f.f65640a);

    /* renamed from: d */
    private final C52668f f65632d = C52732g.m112285a(C24801e.f65639a);

    /* renamed from: e */
    private final C52668f f65633e = C52732g.m112285a(C24800d.f65638a);

    /* renamed from: f */
    private final C52668f f65634f = C52732g.m112285a(C24798b.f65636a);

    /* renamed from: g */
    private final C52668f f65635g = C52732g.m112285a(C24799c.f65637a);

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel$a */
    public static final class C24797a {
        private C24797a() {
        }

        public /* synthetic */ C24797a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel$b */
    static final class C24798b extends C52712l implements C52670a<C23275b<Boolean>> {

        /* renamed from: a */
        public static final C24798b f65636a = new C24798b();

        C24798b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel$c */
    static final class C24799c extends C52712l implements C52670a<C23275b<Boolean>> {

        /* renamed from: a */
        public static final C24799c f65637a = new C24799c();

        C24799c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel$d */
    static final class C24800d extends C52712l implements C52670a<C23275b<C24866v>> {

        /* renamed from: a */
        public static final C24800d f65638a = new C24800d();

        C24800d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel$e */
    static final class C24801e extends C52712l implements C52670a<C23275b<String>> {

        /* renamed from: a */
        public static final C24801e f65639a = new C24801e();

        C24801e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel$f */
    static final class C24802f extends C52712l implements C52670a<C23275b<Integer>> {

        /* renamed from: a */
        public static final C24802f f65640a = new C24802f();

        C24802f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: a */
    public final C23275b<Integer> mo50677a() {
        return (C23275b) this.f65631c.getValue();
    }

    /* renamed from: b */
    public final C23275b<String> mo50678b() {
        return (C23275b) this.f65632d.getValue();
    }

    /* renamed from: c */
    public final C23275b<C24866v> mo50679c() {
        return (C23275b) this.f65633e.getValue();
    }

    /* renamed from: d */
    public final C23275b<Boolean> mo50680d() {
        return (C23275b) this.f65634f.getValue();
    }

    /* renamed from: e */
    public final C23275b<Boolean> mo50681e() {
        return (C23275b) this.f65635g.getValue();
    }

    /* renamed from: f */
    public final int mo50682f() {
        Integer num = (Integer) mo50677a().getValue();
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }
}
