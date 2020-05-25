package com.p683ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.u */
public final class C27470u {

    /* renamed from: a */
    private static HashMap<String, C27422am> f72251a = new HashMap<>();

    /* renamed from: a */
    public static C27419al m66074a(C30669b bVar, C26875a aVar, JediViewModel jediViewModel) {
        String from = bVar.getFrom();
        if (f72251a.size() == 0) {
            for (IDetailPageOperatorService operatorMap : ServiceManager.get().getServices(IDetailPageOperatorService.class)) {
                HashMap operatorMap2 = operatorMap.getOperatorMap();
                if (operatorMap2 != null) {
                    f72251a.putAll(operatorMap2);
                }
            }
        }
        if (!TextUtils.isEmpty(from)) {
            if (f72251a.containsKey(from)) {
                C27422am amVar = (C27422am) f72251a.get(from);
                if (amVar != null) {
                    C27419al a = amVar.mo50285a(bVar, aVar, jediViewModel);
                    if (a != null) {
                        return a;
                    }
                    return new C27446j();
                }
            } else {
                C27419al a2 = BusinessComponentServiceUtils.getDetailPageOperatorProvider().mo55882a(from, bVar, aVar, jediViewModel);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        if (!TextUtils.isEmpty(bVar.getIds()) || !TextUtils.isEmpty(bVar.getPushParams())) {
            return new C27428c(bVar.getIds());
        }
        return new C27446j();
    }
}
