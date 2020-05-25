package com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c.C31316a;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c.C31316a.C31317a;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c.C31316a.C31318b;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c.C31316a.C31318b.C31319a;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c.C31316a.C31318b.C31320b;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c.C31316a.C31318b.C31321c;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c.C31316a.C31322c;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52775l;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i */
public final class C31336i extends C31312f {

    /* renamed from: b */
    public static final C31337a f82094b = new C31337a(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$a */
    public static final class C31337a {
        private C31337a() {
        }

        public /* synthetic */ C31337a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo64209a() {
        return "abnor_upload";
    }

    /* renamed from: c */
    public final String mo64212c() {
        AwemeToolFeedbackECode awemeToolFeedbackECode;
        List a = mo64213a(4, 2);
        String str = "上传";
        int size = a.size();
        Iterable iterable = a;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (C52711k.m112239a((Object) ((C31315c) next).f82073f, (Object) C31322c.f82081b)) {
                arrayList.add(next);
            }
        }
        int size2 = ((List) arrayList).size();
        Collection arrayList2 = new ArrayList();
        for (Object next2 : iterable) {
            if (C52711k.m112239a((Object) ((C31315c) next2).f82073f, (Object) C31317a.f82076b)) {
                arrayList2.add(next2);
            }
        }
        int size3 = ((List) arrayList2).size();
        Collection arrayList3 = new ArrayList();
        for (Object next3 : iterable) {
            if (((C31315c) next3).f82073f instanceof C31318b) {
                arrayList3.add(next3);
            }
        }
        Iterable<C31315c> iterable2 = (List) arrayList3;
        Collection arrayList4 = new ArrayList(C52575l.m112104a(iterable2, 10));
        for (C31315c cVar : iterable2) {
            C31316a aVar = cVar.f82073f;
            if (aVar != null) {
                C31318b bVar = (C31318b) aVar;
                if (bVar instanceof C31319a) {
                    C31319a aVar2 = (C31319a) bVar;
                    awemeToolFeedbackECode = new AwemeToolFeedbackECode(aVar2.f82077b, aVar2.f82078c);
                } else if (bVar instanceof C31321c) {
                    awemeToolFeedbackECode = new AwemeToolFeedbackECode("LO", ((C31321c) bVar).f82080b);
                } else if (bVar instanceof C31320b) {
                    awemeToolFeedbackECode = new AwemeToolFeedbackECode(((C31320b) bVar).f82079b, "EX");
                } else {
                    throw new C52775l();
                }
                arrayList4.add(awemeToolFeedbackECode);
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.PublishBaseStrategy.OncePublish.Type.Failed");
            }
        }
        AwemeToolFeedbackInfo awemeToolFeedbackInfo = new AwemeToolFeedbackInfo(str, size, size2, size3, (List) arrayList4);
        String a2 = C47760cd.m103385a(C52575l.m112092a(awemeToolFeedbackInfo));
        C52711k.m112236a((Object) a2, "GsonUtil.toJson(listOf(uploadInfo))");
        return a2;
    }
}
