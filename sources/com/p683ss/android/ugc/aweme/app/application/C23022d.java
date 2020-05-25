package com.p683ss.android.ugc.aweme.app.application;

import android.app.Application;
import com.p683ss.android.ugc.aweme.app.application.p1369b.C23019a;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.task.GetGoogleAIdTask;
import com.p683ss.android.ugc.aweme.legoImp.task.HackActivityThreadH;
import com.p683ss.android.ugc.aweme.legoImp.task.InitDebugBox;
import com.p683ss.android.ugc.aweme.legoImp.task.InitLinkSelector;
import com.p683ss.android.ugc.aweme.legoImp.task.LegacyTask;
import com.p683ss.android.ugc.aweme.legoImp.task.SetupDebugLevel;
import com.p683ss.android.ugc.aweme.legoImp.task.SetupMainServiceForJsb;

/* renamed from: com.ss.android.ugc.aweme.app.application.d */
public final class C23022d implements C23019a {
    /* renamed from: a */
    public final void mo47757a(Application application) {
    }

    /* renamed from: b */
    public final void mo47758b(Application application) {
        C35857a.m81001b().mo74526a(new LegacyTask()).mo74526a(new InitLinkSelector()).mo74526a(new SetupMainServiceForJsb()).mo74526a(new InitDebugBox()).mo74526a(new GetGoogleAIdTask()).mo74526a(new HackActivityThreadH()).mo74526a(new SetupDebugLevel()).mo74527a();
    }
}
