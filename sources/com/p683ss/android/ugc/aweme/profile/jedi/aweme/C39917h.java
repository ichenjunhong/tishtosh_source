package com.p683ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C18083m;
import com.google.gson.C18091u;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.p683ss.android.ugc.aweme.utils.GsonProvider;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.p071d.C1710e;
import p2628d.p2629a.C52575l;
import p2628d.p2638e.C52659i;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52808d;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.h */
public final class C39917h {

    /* renamed from: a */
    static int f101771a = -1;

    /* renamed from: b */
    public static final C39917h f101772b = new C39917h();

    /* renamed from: c */
    private static Map<String, FeedItemList> f101773c = new LinkedHashMap();

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.h$a */
    static final class C39918a<T> implements C1710e<FeedItemList> {

        /* renamed from: a */
        final /* synthetic */ FeedItemList f101774a;

        /* renamed from: b */
        final /* synthetic */ String f101775b;

        /* renamed from: c */
        final /* synthetic */ int f101776c;

        C39918a(FeedItemList feedItemList, String str, int i) {
            this.f101774a = feedItemList;
            this.f101775b = str;
            this.f101776c = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            FeedItemList feedItemList = (FeedItemList) obj;
            C39917h.m88673a(this.f101774a, this.f101775b, this.f101776c);
        }
    }

    private C39917h() {
    }

    /* renamed from: c */
    private static String m88675c(String str) {
        C52711k.m112240b(str, "uid");
        C40026s sVar = C40026s.f101964a;
        StringBuilder sb = new StringBuilder("/aweme/v1/aweme/post/");
        sb.append(str);
        return sVar.hexDigest(sb.toString());
    }

    /* renamed from: b */
    private File m88674b(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        File file = null;
        if (z) {
            return null;
        }
        File cacheDir = C11010c.m22280a().getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        if (cacheDir.exists()) {
            file = cacheDir;
        }
        if (file != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            sb.append(File.separator);
            sb.append("aweme_publish");
            new File(sb.toString()).mkdirs();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cacheDir.getPath());
        sb2.append(File.separator);
        sb2.append(m88675c(str));
        return new File(sb2.toString());
    }

    /* renamed from: a */
    public final FeedItemList mo81058a(String str) {
        boolean z;
        String a;
        FeedItemList feedItemList = (FeedItemList) f101773c.get(str);
        if (feedItemList != null) {
            return feedItemList;
        }
        CharSequence charSequence = str;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        File b = m88674b(str);
        if (b == null || !b.exists()) {
            return null;
        }
        synchronized (this) {
            a = C52659i.m112200a(b, C52808d.f131043a);
        }
        if (a.length() == 0) {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        try {
            GsonProvider a2 = C47759cc.m103382a();
            C52711k.m112236a((Object) a2, "GsonProvider.get()");
            FeedItemList feedItemList2 = (FeedItemList) a2.getGson().mo34884a(a, FeedItemList.class);
            FeedItemList feedItemList3 = (FeedItemList) f101773c.get(str);
            if (feedItemList3 != null) {
                return feedItemList3;
            }
            if (str != null) {
                Map<String, FeedItemList> map = f101773c;
                C52711k.m112236a((Object) feedItemList2, "lastCacheFeedItemList");
                map.put(str, feedItemList2);
            }
            return feedItemList2;
        } catch (C18091u unused) {
            return null;
        } catch (C18083m e) {
            C32458a.m75145a(a, (Exception) e);
            return null;
        } catch (UnsupportedOperationException e2) {
            C32458a.m75148a((Throwable) e2);
            return null;
        }
    }

    /* renamed from: a */
    public static void m88673a(FeedItemList feedItemList, String str, int i) {
        C52711k.m112240b(feedItemList, "feedItemList");
        if (f101771a != feedItemList.size() && str != null) {
            File b = f101772b.m88674b(str);
            if (b != null) {
                FeedItemList clone = feedItemList.clone();
                List items = clone.getItems();
                C52711k.m112236a((Object) items, "items");
                clone.items = C52575l.m112129b((Iterable<? extends T>) items, i);
                Map<String, FeedItemList> map = f101773c;
                C52711k.m112236a((Object) clone, "saveFeedItemList");
                map.put(str, clone);
                f101771a = clone.size();
                GsonProvider a = C47759cc.m103382a();
                C52711k.m112236a((Object) a, "GsonProvider.get()");
                String b2 = a.getGson().mo34889b(clone);
                C52711k.m112236a((Object) b2, "GsonProvider.get().gson.toJson(saveFeedItemList)");
                C52659i.m112202a(b, b2, null, 2, null);
            }
        }
    }
}
