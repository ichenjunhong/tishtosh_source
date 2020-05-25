package com.p683ss.android.ugc.aweme.commercialize.feed;

import android.arch.p011c.p014b.C0141e;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.p1162e.C19142c;
import com.p683ss.android.ugc.aweme.antiaddic.p1353a.C22689a;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.commercialize.dao.C25726a;
import com.p683ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26217c;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.IFeedItemList;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.a */
public class C25862a implements C25878aj {

    /* renamed from: c */
    private static final String f68394c = "a";

    /* renamed from: e */
    private static volatile C25862a f68395e;

    /* renamed from: f */
    private static C19142c<ShowAdDataBase> f68396f = new C19142c<ShowAdDataBase>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo22768a() {
            return (ShowAdDataBase) C0141e.m302a(C11010c.m22280a(), ShowAdDataBase.class, "showAd.db").mo250a().mo252b();
        }
    };

    /* renamed from: a */
    List<String> f68397a = new ArrayList();

    /* renamed from: b */
    private C22689a f68398b = new C22689a(0) {
        /* renamed from: a */
        public final C23051bf<Long> mo47077a() {
            return SharePrefCache.inst().getLastFilterTime();
        }
    };

    /* renamed from: d */
    private IFeedItemList f68399d;

    private C25862a() {
    }

    /* renamed from: a */
    public static C25862a m62591a() {
        if (f68395e == null) {
            synchronized (C41589c.class) {
                if (f68395e == null) {
                    f68395e = new C25862a();
                }
            }
        }
        return f68395e;
    }

    /* renamed from: b */
    static final /* synthetic */ Object m62593b() throws Exception {
        try {
            ShowAdDataBase showAdDataBase = (ShowAdDataBase) f68396f.mo39084b();
            if (showAdDataBase != null) {
                showAdDataBase.mo52916g().mo52920a();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Object m62592a(java.lang.String r2) throws java.lang.Exception {
        /*
            com.ss.android.e.c<com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase> r0 = f68396f     // Catch:{  }
            java.lang.Object r0 = r0.mo39084b()     // Catch:{  }
            com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase r0 = (com.p683ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase) r0     // Catch:{  }
            if (r0 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.commercialize.dao.b r0 = r0.mo52916g()     // Catch:{  }
            com.ss.android.ugc.aweme.commercialize.dao.a r1 = new com.ss.android.ugc.aweme.commercialize.dao.a     // Catch:{ Exception -> 0x0016 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0016 }
            r0.mo52921a(r1)     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.feed.C25862a.m62592a(java.lang.String):java.lang.Object");
    }

    /* renamed from: b */
    private static boolean m62594b(String str) {
        try {
            ShowAdDataBase showAdDataBase = (ShowAdDataBase) f68396f.mo39084b();
            if (showAdDataBase != null) {
                List a = showAdDataBase.mo52916g().mo52919a(str);
                if (C9376b.m18558a((Collection<T>) a)) {
                    return false;
                }
                return a.contains(new C25726a(str));
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final void mo53108a(IFeedItemList iFeedItemList) {
        int i;
        if (iFeedItemList != null && !C9376b.m18558a((Collection<T>) iFeedItemList.getItems())) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f68398b.mo47079b(currentTimeMillis)) {
                    this.f68397a.clear();
                    C0013i.m18a(C25888c.f68417a, (Executor) C0013i.f24a);
                }
                this.f68398b.mo47078a(currentTimeMillis);
                Iterator it = iFeedItemList.getItems().iterator();
                Context a = C11010c.m22280a();
                while (it.hasNext()) {
                    Aweme aweme = (Aweme) it.next();
                    if (aweme != null && aweme.isAd()) {
                        boolean z = false;
                        if (aweme.isAd()) {
                            String aid = aweme.getAid();
                            if (!TextUtils.isEmpty(aid)) {
                                if (!aweme.getAwemeRawAd().isDiableAdShowFilter()) {
                                    z = this.f68397a.contains(aid) ? true : m62594b(aid);
                                }
                            }
                        }
                        if (z) {
                            it.remove();
                            if (C26512f.m64080w(aweme)) {
                                C26088l.m63288a(a, aweme, C26217c.m63502a().mo53857a("8", (String) null));
                            }
                            C26088l.m63278a(a, aweme, 1);
                        } else if (this.f68399d != null && !aweme.getAwemeRawAd().isDiableAdShowFilter()) {
                            String aid2 = aweme.getAid();
                            for (Aweme aweme2 : this.f68399d.getItems()) {
                                if (aweme2 != null && TextUtils.equals(aid2, aweme2.getAid())) {
                                    it.remove();
                                    if (C26512f.m64080w(aweme)) {
                                        C26088l.m63288a(a, aweme, C26217c.m63502a().mo53857a("8", (String) null));
                                    }
                                    if (aweme2.isAd()) {
                                        i = 1;
                                    } else {
                                        i = 2;
                                    }
                                    C26088l.m63278a(a, aweme, i);
                                }
                            }
                        }
                    }
                }
                this.f68399d = iFeedItemList;
            } catch (Exception unused) {
            }
        }
    }
}
