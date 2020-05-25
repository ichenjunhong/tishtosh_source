package com.p683ss.android.ugc.aweme.requestcombine.p2114a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35862d;
import com.p683ss.android.ugc.aweme.main.C36553cd;
import com.p683ss.android.ugc.aweme.p1390av.C23298a;
import com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p683ss.android.ugc.aweme.requesttask.p2116a.C41238b;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.h */
public final class C41225h extends C41216a {

    /* renamed from: a */
    private BaseCombineMode f104671a;

    /* renamed from: b */
    public final BaseCombineMode mo83712b() {
        return this.f104671a;
    }

    /* renamed from: a */
    public final String mo83708a() {
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        if (a.isLogin()) {
            return "/aweme/v1/notice/count/";
        }
        return null;
    }

    /* renamed from: a */
    public final void mo83710a(C35862d dVar) {
        C52711k.m112240b(dVar, "transaction");
        dVar.mo74519a(new C41238b());
    }

    /* renamed from: a */
    public final Map<String, String> mo83709a(Context context) {
        C52711k.m112240b(context, "context");
        HashMap hashMap = new HashMap();
        hashMap.put("source", "1");
        C23298a a = C23298a.m57308a();
        C52711k.m112236a((Object) a, "StoryAbManager.getInstance()");
        int i = 1;
        boolean z = !a.mo48343b();
        if (!C36553cd.m82451g()) {
            C36553cd.m82448d();
            i = 0;
        }
        hashMap.put("second_tab_type", String.valueOf(z ? 1 : 0));
        hashMap.put("follow_tab_position", String.valueOf(i));
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83711a(com.p683ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r10 = r10.getData()
            if (r10 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.NoticeCountCombineModel r10 = r10.getNoticeCountModel()
            goto L_0x000e
        L_0x000d:
            r10 = 0
        L_0x000e:
            r0 = 0
            if (r10 == 0) goto L_0x008e
            com.ss.android.ugc.aweme.notice.api.bean.NoticeList r1 = r10.getNoticeList()
            if (r1 == 0) goto L_0x008e
            int r1 = r1.status_code
            if (r1 == 0) goto L_0x001c
            goto L_0x008e
        L_0x001c:
            r1 = r10
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r1 = (com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r1
            r9.f104671a = r1
            int r1 = r10.getHttpCode()
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 1
            if (r1 != r2) goto L_0x005d
            com.ss.android.ugc.aweme.notice.api.bean.NoticeList r1 = r10.getNoticeList()
            java.util.List r1 = r1.getItems()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            android.os.Message r4 = android.os.Message.obtain()
            com.ss.android.ugc.aweme.notice.api.bean.NoticeList r5 = r10.getNoticeList()
            r4.obj = r5
            r4.what = r0
            java.lang.String r5 = "msg"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r5 = "msg"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)
            com.ss.android.ugc.aweme.notice.api.d r5 = com.p683ss.android.ugc.aweme.notice.api.C38046d.f96822b
            com.ss.android.ugc.aweme.notice.api.b.b r5 = r5.mo77574b()
            r5.mo77491a(r4)
            r4.recycle()
            r4 = r1
            r1 = 1
            goto L_0x005f
        L_0x005d:
            r1 = 0
            r4 = 1
        L_0x005f:
            java.lang.String r5 = "homepage_follow_monitor"
            com.ss.android.ugc.aweme.app.f.d r6 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r7 = "error_type"
            java.lang.String r8 = "combine_yellow_dot"
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
            java.lang.String r7 = "is_success"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.ss.android.ugc.aweme.app.f.d r1 = r6.mo47828a(r7, r1)
            java.lang.String r6 = "is_empty"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47828a(r6, r4)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r5, r1)
            int r10 = r10.getHttpCode()
            if (r10 != r2) goto L_0x008d
            return r3
        L_0x008d:
            return r0
        L_0x008e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41225h.mo83711a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
