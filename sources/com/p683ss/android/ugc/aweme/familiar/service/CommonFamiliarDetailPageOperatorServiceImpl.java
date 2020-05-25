package com.p683ss.android.ugc.aweme.familiar.service;

import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al;
import com.p683ss.android.ugc.aweme.detail.operators.C27422am;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.unread.C47492a;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.familiar.service.CommonFamiliarDetailPageOperatorServiceImpl */
public abstract class CommonFamiliarDetailPageOperatorServiceImpl implements IDetailPageOperatorService {

    /* renamed from: com.ss.android.ugc.aweme.familiar.service.CommonFamiliarDetailPageOperatorServiceImpl$a */
    public static final class C29646a implements C27422am {
        C29646a() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            return new C47492a(aVar);
        }
    }

    public HashMap<String, C27422am> getOperatorMap() {
        HashMap<String, C27422am> hashMap = new HashMap<>();
        hashMap.put("from_unread", new C29646a());
        return hashMap;
    }
}
