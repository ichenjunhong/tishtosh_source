package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.unread;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.main.service.IUnReadVideoService;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.unread.UnReadVideoSessionViewModel */
public final class UnReadVideoSessionViewModel extends C0209x {

    /* renamed from: c */
    public static final C34672a f89329c = new C34672a(null);

    /* renamed from: a */
    public Map<String, Integer> f89330a = new LinkedHashMap();

    /* renamed from: b */
    public List<String> f89331b = new ArrayList();

    /* renamed from: d */
    private final IUnReadVideoService f89332d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.unread.UnReadVideoSessionViewModel$a */
    public static final class C34672a {
        private C34672a() {
        }

        public /* synthetic */ C34672a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static UnReadVideoSessionViewModel m78655a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo360a("session", UnReadVideoSessionViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ionViewModel::class.java)");
            return (UnReadVideoSessionViewModel) a;
        }
    }

    public UnReadVideoSessionViewModel() {
        IUnReadVideoService iUnReadVideoService;
        Object a = C27991b.m66756a(IUnReadVideoService.class);
        if (a != null) {
            iUnReadVideoService = (IUnReadVideoService) a;
        } else {
            iUnReadVideoService = (IUnReadVideoService) C20302a.m50070a(IUnReadVideoService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
        }
        C52711k.m112236a((Object) iUnReadVideoService, "ServiceManager.get().get…VideoService::class.java)");
        this.f89332d = iUnReadVideoService;
    }
}
