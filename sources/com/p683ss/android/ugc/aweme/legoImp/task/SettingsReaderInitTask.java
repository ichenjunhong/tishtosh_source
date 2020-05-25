package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.app.C23098h;
import com.p683ss.android.ugc.aweme.app.C23098h.C23099a;
import com.p683ss.android.ugc.aweme.app.C23098h.C23100b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32808a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p683ss.android.ugc.aweme.keva.C35808e;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask;
import com.p683ss.android.ugc.aweme.setting.C41549aq;
import com.p683ss.android.ugc.aweme.setting.C41549aq.C41551a;
import com.p683ss.android.ugc.aweme.setting.C41609h;
import com.p683ss.android.ugc.aweme.settings.C41913b;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SettingsReaderInitTask */
public class SettingsReaderInitTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        C32458a.m75144a("SettingsReaderInitTask");
        SettingsManagerProxy inst = SettingsManagerProxy.inst();
        synchronized (C32816h.f85429a) {
            C32816h a = C32816h.m75714a();
            a.f85435c = false;
            if (inst == null) {
                throw new IllegalStateException("iesSettingsProxyWrap is null!");
            } else if (a.f85434b == null) {
                a.f85434b = inst;
                C32816h.f85429a.notifyAll();
            } else if (C32816h.m75714a().f85435c) {
                throw new IllegalStateException("duplicate init be found in {@link SettingsReader}");
            }
        }
        SettingsManagerProxy.inst().registerSettingsWatcher(C32808a.m75701a(), false);
        SettingsManagerProxy.inst().registerSettingsWatcher(C35808e.f91974a, false);
        SettingsManagerProxy.inst().registerSettingsWatcher(C41913b.f106071a, false);
        C23098h hVar = C23098h.f61512f;
        if (C18920g.m46048a(C11010c.m22280a())) {
            try {
                C2201v.m6601a((C2205y<T>) C23099a.f61515a).mo6529b(C1667a.m5940a()).mo6514a(C2168a.m6521b()).mo6314a((C1674ab<? super T>) new C23100b<Object>());
            } catch (Exception unused) {
            }
        }
        SettingsManagerProxy.inst().registerSettingsWatcher(PosterSRProcessorInitTask.watcher(), true);
        C41549aq.m91378a().mo85331a((C41551a) new C41609h());
    }
}
