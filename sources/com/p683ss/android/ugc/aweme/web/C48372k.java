package com.p683ss.android.ugc.aweme.web;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.local_test.LocalTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.web.k */
public final class C48372k {

    /* renamed from: a */
    public static final List<String> f121668a;

    static {
        ArrayList arrayList = new ArrayList();
        IAmeJsMessageHandlerService createIAmeJsMessageHandlerServicebyMonsterPlugin = AmeJsMessageHandlerServiceImpl.createIAmeJsMessageHandlerServicebyMonsterPlugin();
        if (createIAmeJsMessageHandlerServicebyMonsterPlugin != null && !C9376b.m18558a((Collection<T>) createIAmeJsMessageHandlerServicebyMonsterPlugin.getSafeHosts())) {
            arrayList.addAll(createIAmeJsMessageHandlerServicebyMonsterPlugin.getSafeHosts());
        }
        arrayList.add("snssdk.com");
        arrayList.add("toutiao.com");
        arrayList.add("neihanshequ.com");
        arrayList.add("youdianyisi.com");
        arrayList.add("admin.bytedance.com");
        arrayList.add("wallet.amemv.com");
        arrayList.add("iesdouyin.com");
        arrayList.add("douyincdn.com");
        arrayList.add("douyinact.com");
        arrayList.add("douyin.com");
        arrayList.add("chengzijianzhan.com");
        arrayList.add("ad.toutiao.com");
        arrayList.add("ixigua.com");
        arrayList.add("s0.ipstatp.com");
        arrayList.add("s.ipstatp.com");
        arrayList.add("m.toutiaocdn.cn");
        arrayList.add("m.toutiaocdn.com");
        arrayList.add("m.toutiaocdn.net");
        arrayList.add("m.zjurl.cn");
        arrayList.add("douyinvideo.net");
        arrayList.add("lb.jinritemai.com");
        arrayList.add("tosv.byted.org");
        arrayList.add("amemv.com");
        arrayList.add("juliangyinqing.com");
        arrayList.add("xgfe.snssdk.com");
        arrayList.add("activity.ixigua.com");
        arrayList.add("a3.pstatp.com");
        arrayList.add("s3b.pstatp.com");
        arrayList.add("s3a.bytecdn.cn");
        arrayList.add("s3a.pstatp.com");
        arrayList.add("s.pstatp.com");
        arrayList.add("s3.bytecdn.cn");
        arrayList.add("s3.pstatp.com");
        arrayList.add("s3b.bytecdn.cn");
        arrayList.add("s9.pstatp.com");
        List jsbSafeHost = LocalTest.m81850a().getJsbSafeHost();
        if (jsbSafeHost != null) {
            arrayList.addAll(jsbSafeHost);
        }
        List list = (List) C23183v.m56778a().mo47899J().mo47782d();
        if (list != null && list.size() > 0) {
            HashSet hashSet = new HashSet(arrayList);
            hashSet.addAll(list);
            arrayList = new ArrayList(hashSet);
        }
        f121668a = arrayList;
    }
}
