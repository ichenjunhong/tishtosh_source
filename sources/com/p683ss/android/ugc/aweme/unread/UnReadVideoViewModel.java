package com.p683ss.android.ugc.aweme.unread;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.unread.UnReadVideoViewModel */
public final class UnReadVideoViewModel extends C0209x {

    /* renamed from: b */
    public static final C47491a f119785b = new C47491a(null);

    /* renamed from: a */
    public List<String> f119786a = new ArrayList();

    /* renamed from: c */
    private Map<String, Integer> f119787c = new LinkedHashMap();

    /* renamed from: com.ss.android.ugc.aweme.unread.UnReadVideoViewModel$a */
    public static final class C47491a {
        private C47491a() {
        }

        public /* synthetic */ C47491a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static UnReadVideoViewModel m102890a(Fragment fragment, String str) {
            C52711k.m112240b(fragment, "fragment");
            C52711k.m112240b(str, "tag");
            C0209x a = C0214z.m438a(fragment).mo360a(str, UnReadVideoViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(fr…deoViewModel::class.java)");
            return (UnReadVideoViewModel) a;
        }

        /* renamed from: a */
        public static UnReadVideoViewModel m102889a(C0184k kVar, String str) {
            C52711k.m112240b(kVar, "owner");
            C52711k.m112240b(str, "tag");
            if (kVar instanceof Fragment) {
                C0209x a = C0214z.m438a((Fragment) kVar).mo360a(str, UnReadVideoViewModel.class);
                C52711k.m112236a((Object) a, "ViewModelProviders.of(ow…deoViewModel::class.java)");
                return (UnReadVideoViewModel) a;
            }
            C0209x a2 = C0214z.m440a((FragmentActivity) kVar).mo360a(str, UnReadVideoViewModel.class);
            C52711k.m112236a((Object) a2, "ViewModelProviders.of(ow…deoViewModel::class.java)");
            return (UnReadVideoViewModel) a2;
        }
    }

    public final void onCleared() {
        super.onCleared();
    }

    /* renamed from: a */
    public final void mo94779a(List<? extends User> list, boolean z) {
        if (!z) {
            this.f119787c.clear();
            this.f119786a.clear();
        }
        if (list != null) {
            for (User user : list) {
                if (user.getUnReadVideoInfo() != null) {
                    user.getUid();
                    user.getUnReadVideoCount();
                    if (user.getUnReadVideoCount() > 0) {
                        Map<String, Integer> map = this.f119787c;
                        String uid = user.getUid();
                        C52711k.m112236a((Object) uid, "user.uid");
                        map.put(uid, Integer.valueOf(user.getUnReadVideoCount()));
                        List<String> list2 = this.f119786a;
                        String uid2 = user.getUid();
                        C52711k.m112236a((Object) uid2, "user.uid");
                        list2.add(uid2);
                    }
                }
            }
        }
    }
}
