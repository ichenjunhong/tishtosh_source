package com.p683ss.android.ugc.aweme.p1807im;

import com.p683ss.android.ugc.aweme.p1807im.C33206p.C33207a;

/* renamed from: com.ss.android.ugc.aweme.im.NotificationManagerServiceiImpl */
public final class NotificationManagerServiceiImpl implements INotificationManagerService {
    public final void setImInnerPushOpen(Integer num) {
        C33207a.m76310a().mo70458a(num);
    }

    public final void setLiveInnerPushOpen(Integer num) {
        C33206p a = C33207a.m76310a();
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            z = false;
        }
        a.f86199b = z;
    }
}
