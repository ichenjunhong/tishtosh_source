package com.bytedance.android.live.misc;

import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.i18n.C4132a;
import com.bytedance.android.live.linkpk.C4133a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.init.I18nInitTask;
import com.bytedance.android.livesdk.init.InternalServiceInitTask;
import com.bytedance.android.livesdk.init.MonitorInitTask;
import com.bytedance.android.livesdk.init.ProtoDecoderInjectTask;
import com.bytedance.android.livesdk.init.TTCjInitTask;
import com.bytedance.android.livesdk.init.TaskManagerInitTask;
import com.bytedance.android.livesdk.init.WebPrefetchTask;
import com.bytedance.android.livesdk.module.BrowserService;
import com.bytedance.android.livesdk.module.I18nServices;
import com.bytedance.android.livesdk.module.LinkPkService;
import com.bytedance.android.livesdk.module.RoomService;
import com.bytedance.android.livesdk.module.UserService;
import com.bytedance.android.livesdk.p392l.C7736c;
import com.bytedance.android.livesdk.schema.LiveActionHandlerImpl;
import com.bytedance.android.livesdk.schema.interfaces.C8260a;
import com.bytedance.android.livesdkapi.depend.live.C8661k;

public class LiveService$$livesdk {
    public static void registerService() {
        C4116c.m10251a(C3805a.class, new BrowserService());
        C4116c.m10251a(C4133a.class, new LinkPkService());
        C4116c.m10251a(C4193l.class, new RoomService());
        C4116c.m10251a(C8661k.class, new RoomService());
        C4116c.m10251a(C4282a.class, new UserService());
        C4116c.m10251a(C4132a.class, new I18nServices());
        C4116c.m10251a(C8260a.class, new LiveActionHandlerImpl());
        C7736c.m15763a().mo14082a(2, new InternalServiceInitTask());
        C7736c.m15763a().mo14082a(5, new TTCjInitTask());
        C7736c.m15763a().mo14082a(3, new MonitorInitTask());
        C7736c.m15763a().mo14082a(7, new ProtoDecoderInjectTask());
        C7736c.m15763a().mo14082a(6, new WebPrefetchTask());
        C7736c.m15763a().mo14082a(1, new I18nInitTask());
        C7736c.m15763a().mo14082a(4, new TaskManagerInitTask());
    }
}
