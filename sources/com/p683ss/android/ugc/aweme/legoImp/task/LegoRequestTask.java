package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.task.C22164a;
import com.p683ss.android.ugc.aweme.experiment.UseNewAppAlertExperiment;
import com.p683ss.android.ugc.aweme.friends.p1791e.C32580a;
import com.p683ss.android.ugc.aweme.friends.p1791e.C32581b;
import com.p683ss.android.ugc.aweme.journey.C35778r;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTTutorialVideoExperiment;
import com.p683ss.android.ugc.aweme.p1332ag.C22542a;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41249a;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41252c;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41259i;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41261j;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41263l;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41264m;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41265n;
import com.p683ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.p683ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;
import com.p683ss.android.ugc.aweme.requesttask.p2116a.C41237a;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LegoRequestTask */
public class LegoRequestTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        C35857a.m81005d().mo74519a(new C41261j()).mo74519a(new C41237a()).mo74519a(new C41264m()).mo74519a(new C41265n()).mo74519a(new C41263l()).mo74519a(new C41249a()).mo74519a(new C22542a()).mo74519a(new C35778r()).mo74519a(new C22164a()).mo74519a(new C32580a()).mo74519a(new C32581b()).mo74520a();
        if (C10181b.m20511a().mo18168a(UseNewAppAlertExperiment.class, true, "use_new_app_alert", 31744, 0) == 1) {
            C35857a.m81005d().mo74519a(new C41252c()).mo74520a();
        }
        C35857a.m81001b().mo74526a(new GeckoHighPriorityCheckInRequest()).mo74526a(new GeckoCheckInRequest()).mo74526a(new FetchFriendsRelationTask()).mo74526a(new InitServiceSettingTask()).mo74527a();
        if (C20902b.m53242a().isLogin() && !C47915gg.m103651b() && C10181b.m20511a().mo18172a(MTTutorialVideoExperiment.class, true, "mt_tutorial_video", 31744, false)) {
            C35857a.m81005d().mo74519a(new C41259i()).mo74520a();
        }
    }
}
