package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.p673f.p674a.C10756a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.p1411c.C23488g;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.CookieWatchTask */
public final class CookieWatchTask implements LegoTask {
    public static final C35935a Companion = new C35935a(null);

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.CookieWatchTask$a */
    public static final class C35935a {
        private C35935a() {
        }

        public /* synthetic */ C35935a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.CookieWatchTask$b */
    public static final class C35936b implements C10756a {
        C35936b() {
        }
    }

    @C53771m(mo112975a = ThreadMode.ASYNC)
    public final void onUserLoginStateChange(C23488g gVar) {
        C52711k.m112240b(gVar, "event");
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BACKGROUND;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        C47718bf.m103290c(this);
        JSONObject jSONObject = new JSONObject();
        String str = "userId";
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        String curUserId = g.getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        jSONObject.put(str, curUserId);
        String str2 = "deviceId";
        String serverDeviceId = AppLog.getServerDeviceId();
        if (serverDeviceId == null) {
            serverDeviceId = "";
        }
        jSONObject.put(str2, serverDeviceId);
        String str3 = C42311c.f106863g;
        StringBuilder sb = new StringBuilder();
        sb.append(C11010c.m22283d());
        sb.append("; ");
        sb.append(C11010c.m22294o());
        String sb2 = sb.toString();
        if (sb2 == null) {
            sb2 = "";
        }
        jSONObject.put(str3, sb2);
        jSONObject.put("TTNetVersion", "TTNetVersion:3154e555 2020-03-04 QuicVersion:8fc8a2f3 2020-03-02");
        C52711k.m112236a((Object) jSONObject.toString(), "JSONObject().apply {\n   …ION)\n        }.toString()");
        C10756a bVar = new C35936b();
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bVar, "cookieProxy");
    }
}
