package com.p683ss.android.ugc.aweme.feed.unread;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30782az;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.unread.UnReadFeedSunRoofViewModel */
public final class UnReadFeedSunRoofViewModel extends C0209x implements C30782az {

    /* renamed from: g */
    public static final C31151a f81543g = new C31151a(null);

    /* renamed from: a */
    public boolean f81544a;

    /* renamed from: b */
    public Map<String, Integer> f81545b = new LinkedHashMap();

    /* renamed from: c */
    public List<User> f81546c = new ArrayList();

    /* renamed from: d */
    public List<String> f81547d = new ArrayList();

    /* renamed from: e */
    final C0198r<Boolean> f81548e = new C0198r<>();

    /* renamed from: f */
    public long f81549f;

    /* renamed from: h */
    private final C0198r<C31169c> f81550h = new C0198r<>();

    /* renamed from: com.ss.android.ugc.aweme.feed.unread.UnReadFeedSunRoofViewModel$a */
    public static final class C31151a {
        private C31151a() {
        }

        public /* synthetic */ C31151a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static UnReadFeedSunRoofViewModel m72790a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo360a("SunRoof", UnReadFeedSunRoofViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…oofViewModel::class.java)");
            return (UnReadFeedSunRoofViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.unread.UnReadFeedSunRoofViewModel$b */
    static final class C31152b<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ UnReadFeedSunRoofViewModel f81551a;

        /* renamed from: b */
        final /* synthetic */ C52686q f81552b;

        C31152b(UnReadFeedSunRoofViewModel unReadFeedSunRoofViewModel, C52686q qVar) {
            this.f81551a = unReadFeedSunRoofViewModel;
            this.f81552b = qVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C52686q qVar = this.f81552b;
            if (qVar != null) {
                if (bool == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) bool, "it!!");
                qVar.invoke(bool, Boolean.valueOf(this.f81551a.f81544a), this.f81551a.f81546c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.unread.UnReadFeedSunRoofViewModel$c */
    static final class C31153c<T> implements C0199s<C31169c> {

        /* renamed from: a */
        final /* synthetic */ C52682m f81553a;

        C31153c(C52682m mVar) {
            this.f81553a = mVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            C31169c cVar = (C31169c) obj;
            C52682m mVar = this.f81553a;
            if (mVar != null) {
                boolean z2 = false;
                if (cVar != null) {
                    z = cVar.f81583a;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                if (cVar != null) {
                    z2 = cVar.f81584b;
                }
                mVar.invoke(valueOf, Boolean.valueOf(z2));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.unread.UnReadFeedSunRoofViewModel$d */
    static final class C31154d<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C31154d f81554a = new C31154d();

        C31154d() {
        }

        public final /* synthetic */ Object call() {
            return UnReadSunRoofApi.f81559a.mo63991a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.unread.UnReadFeedSunRoofViewModel$e */
    static final class C31155e<TTaskResult, TContinuationResult> implements C0011g<C31168b, C52860x> {

        /* renamed from: a */
        final /* synthetic */ UnReadFeedSunRoofViewModel f81555a;

        /* renamed from: b */
        final /* synthetic */ boolean f81556b;

        /* renamed from: c */
        final /* synthetic */ C52682m f81557c;

        C31155e(UnReadFeedSunRoofViewModel unReadFeedSunRoofViewModel, boolean z, C52682m mVar) {
            this.f81555a = unReadFeedSunRoofViewModel;
            this.f81556b = z;
            this.f81557c = mVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "it");
            boolean z = false;
            if (iVar.mo31c() || iVar.mo33d()) {
                this.f81555a.f81544a = false;
                if (this.f81556b) {
                    C52682m mVar = this.f81557c;
                    if (mVar != null) {
                        mVar.invoke(Boolean.valueOf(false), null);
                    }
                }
            } else {
                C31168b bVar = (C31168b) iVar.mo34e();
                if (bVar == null || bVar.status_code != 0) {
                    this.f81555a.f81544a = false;
                    if (this.f81556b) {
                        C52682m mVar2 = this.f81557c;
                        if (mVar2 != null) {
                            mVar2.invoke(Boolean.valueOf(false), null);
                        }
                    }
                } else {
                    this.f81555a.f81549f = System.currentTimeMillis();
                    this.f81555a.f81544a = true;
                    Collection collection = bVar.f81582a;
                    if (collection == null || collection.isEmpty()) {
                        z = true;
                    }
                    if (!z) {
                        this.f81555a.f81546c = bVar.f81582a;
                        UnReadFeedSunRoofViewModel unReadFeedSunRoofViewModel = this.f81555a;
                        Iterable<User> iterable = bVar.f81582a;
                        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                        for (User uid : iterable) {
                            arrayList.add(uid.getUid());
                        }
                        unReadFeedSunRoofViewModel.f81547d = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
                        for (User user : bVar.f81582a) {
                            Map<String, Integer> map = this.f81555a.f81545b;
                            String uid2 = user.getUid();
                            C52711k.m112236a((Object) uid2, "user.uid");
                            map.put(uid2, Integer.valueOf(user.getUnReadVideoCount()));
                            user.getUid();
                            user.getUnReadVideoCount();
                        }
                        if (this.f81556b) {
                            C52682m mVar3 = this.f81557c;
                            if (mVar3 != null) {
                                mVar3.invoke(Boolean.valueOf(true), bVar.f81582a);
                            }
                        }
                    } else if (this.f81556b) {
                        C52682m mVar4 = this.f81557c;
                        if (mVar4 != null) {
                            mVar4.invoke(Boolean.valueOf(true), null);
                        }
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo63988a(C31169c cVar) {
        C52711k.m112240b(cVar, "state");
        this.f81550h.setValue(cVar);
    }

    /* renamed from: a */
    public final void mo63497a(boolean z) {
        this.f81548e.setValue(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo63496a(C0184k kVar, C52682m<? super Boolean, ? super Boolean, C52860x> mVar) {
        if (kVar != null) {
            this.f81550h.observe(kVar, new C31153c(mVar));
        }
    }

    /* renamed from: a */
    public final void mo63498a(boolean z, C52682m<? super Boolean, ? super List<? extends User>, C52860x> mVar) {
        boolean z2;
        if (System.currentTimeMillis() - this.f81549f > C10193n.m20607a().mo18201a(UnReadSunRoofRequestInterval.class, "unread_video_sun_roof", C10181b.m20511a().mo18175c().getUnreadVideoSunRoof(), 300) * 1000) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C0013i.m16a((Callable<TResult>) C31154d.f81554a).mo20a((C0011g<TResult, TContinuationResult>) new C31155e<TResult,TContinuationResult>(this, true, mVar), C0013i.f25b);
        }
    }
}
