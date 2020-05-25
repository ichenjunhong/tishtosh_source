package com.p683ss.android.ugc.aweme.services;

import android.content.Context;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.services.antispam.IAntiSpamService;

/* renamed from: com.ss.android.ugc.aweme.services.AntiSpamService */
public class AntiSpamService implements IAntiSpamService {
    public void upload(Context context, String str) {
    }

    public static IAntiSpamService createIAntiSpamServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IAntiSpamService.class);
        if (a != null) {
            return (IAntiSpamService) a;
        }
        if (C27991b.f73456aM == null) {
            synchronized (IAntiSpamService.class) {
                if (C27991b.f73456aM == null) {
                    C27991b.f73456aM = new AntiSpamService();
                }
            }
        }
        return (AntiSpamService) C27991b.f73456aM;
    }
}
