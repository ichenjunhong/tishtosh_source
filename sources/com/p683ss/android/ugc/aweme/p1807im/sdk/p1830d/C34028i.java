package com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.i */
public final class C34028i {

    /* renamed from: a */
    public static Handler f87976a;

    /* renamed from: b */
    public static List<String> f87977b;

    /* renamed from: c */
    public static final C34028i f87978c = new C34028i();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.i$a */
    public static final class C34029a extends Handler {
        public final void handleMessage(Message message) {
            C52711k.m112240b(message, "msg");
            super.handleMessage(message);
            if (message.what == 220) {
                C34028i.m77785a();
            }
        }
    }

    private C34028i() {
    }

    /* renamed from: a */
    public static final void m77785a() {
        Integer num;
        List<String> list = f87977b;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        if (num != null && num.intValue() > 0) {
            C11182d.m22641a().mo20674c(f87977b);
            List<String> list2 = f87977b;
            if (list2 == null) {
                C52711k.m112234a();
            }
            list2.clear();
            Handler handler = f87976a;
            if (handler != null) {
                handler.removeMessages(220);
            }
        }
    }

    /* renamed from: a */
    public static final void m77786a(String str) {
        C52711k.m112240b(str, "sessionId");
        List<String> list = f87977b;
        if (list != null && !list.contains(str)) {
            List<String> list2 = f87977b;
            if (list2 == null) {
                C52711k.m112234a();
            }
            if (list2.isEmpty()) {
                Handler handler = f87976a;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(220, 5000);
                }
            }
            List<String> list3 = f87977b;
            if (list3 == null) {
                C52711k.m112234a();
            }
            list3.add(str);
            List<String> list4 = f87977b;
            if (list4 == null) {
                C52711k.m112234a();
            }
            if (list4.size() == 25) {
                m77785a();
            }
        }
    }

    /* renamed from: a */
    public static final void m77787a(List<? extends C35456b> list) {
        if (list != null && (!list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (C35456b bVar : list) {
                if (bVar.mo72634b() == 0) {
                    IMUser a = C34010e.m77748a().mo71956a(String.valueOf(C11190e.m22685a(bVar.bm_())), false);
                    if (a != null && TextUtils.isEmpty(a.getSecUid())) {
                        arrayList.add(bVar.bm_());
                    }
                    if (arrayList.size() == 25) {
                        break;
                    }
                }
            }
            List list2 = arrayList;
            if (!list2.isEmpty()) {
                C11182d.m22641a().mo20674c(list2);
            }
        }
    }
}
