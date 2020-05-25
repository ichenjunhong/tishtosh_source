package com.p683ss.android.ugc.aweme.discover.mob.helpers;

import android.arch.lifecycle.C0209x;
import com.p683ss.android.ugc.aweme.discover.mob.C28389ai;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28374b;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28375c;
import com.p683ss.android.ugc.aweme.discover.model.SearchSugEntity;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.helpers.SearchSugMobHelper */
public final class SearchSugMobHelper extends C0209x {

    /* renamed from: e */
    public static final C28403a f74607e = new C28403a(null);

    /* renamed from: a */
    public LogPbBean f74608a;

    /* renamed from: b */
    public String f74609b;

    /* renamed from: c */
    public String f74610c;

    /* renamed from: d */
    public C52670a<Integer> f74611d;

    /* renamed from: com.ss.android.ugc.aweme.discover.mob.helpers.SearchSugMobHelper$a */
    public static final class C28403a {
        private C28403a() {
        }

        public /* synthetic */ C28403a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo56835a(List<? extends SearchSugEntity> list) {
        int i;
        if (list != null) {
            int i2 = 0;
            for (Object next : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C52575l.m112100b();
                }
                SearchSugEntity searchSugEntity = (SearchSugEntity) next;
                if (searchSugEntity.isHistoryType()) {
                    String str = "history";
                    Integer valueOf = Integer.valueOf(i2);
                    C52711k.m112240b(searchSugEntity, "searchSugEntity");
                    C28375c cVar = (C28375c) ((C28375c) new C28375c().mo56789a(this.f74610c)).mo56790b("sug");
                    C52670a<Integer> aVar = this.f74611d;
                    if (aVar != null) {
                        Integer num = (Integer) aVar.invoke();
                        if (num != null) {
                            i = num.intValue();
                            ((C28375c) ((C28375c) ((C28375c) ((C28375c) ((C28375c) ((C28375c) cVar.mo56791c(C28389ai.m67368a(i))).mo56792d(str)).mo56793e(this.f74609b)).mo56794f(searchSugEntity.content)).mo56795g(searchSugEntity.mWord.getId())).mo56788a(valueOf)).mo48076e();
                        }
                    }
                    i = C28608ca.f75134b;
                    ((C28375c) ((C28375c) ((C28375c) ((C28375c) ((C28375c) ((C28375c) cVar.mo56791c(C28389ai.m67368a(i))).mo56792d(str)).mo56793e(this.f74609b)).mo56794f(searchSugEntity.content)).mo56795g(searchSugEntity.mWord.getId())).mo56788a(valueOf)).mo48076e();
                }
                i2 = i3;
            }
        }
    }

    /* renamed from: a */
    public final void mo56834a(String str, Integer num, String str2, SearchSugEntity searchSugEntity) {
        int i;
        C52711k.m112240b(searchSugEntity, "searchSugEntity");
        C28374b bVar = (C28374b) ((C28374b) new C28374b().mo56789a(this.f74610c)).mo56790b("sug");
        C52670a<Integer> aVar = this.f74611d;
        if (aVar != null) {
            Integer num2 = (Integer) aVar.invoke();
            if (num2 != null) {
                i = num2.intValue();
                ((C28374b) ((C28374b) ((C28374b) ((C28374b) ((C28374b) ((C28374b) bVar.mo56791c(C28389ai.m67368a(i))).mo56792d(str)).mo56796h(str2).mo56793e(this.f74609b)).mo56794f(searchSugEntity.content)).mo56795g(searchSugEntity.mWord.getId())).mo56788a(num)).mo48076e();
            }
        }
        i = C28608ca.f75134b;
        ((C28374b) ((C28374b) ((C28374b) ((C28374b) ((C28374b) ((C28374b) bVar.mo56791c(C28389ai.m67368a(i))).mo56792d(str)).mo56796h(str2).mo56793e(this.f74609b)).mo56794f(searchSugEntity.content)).mo56795g(searchSugEntity.mWord.getId())).mo56788a(num)).mo48076e();
    }
}
