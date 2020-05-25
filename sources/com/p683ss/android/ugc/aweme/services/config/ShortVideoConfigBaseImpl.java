package com.p683ss.android.ugc.aweme.services.config;

import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.services.IShortVideoConfig;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44986ar;
import com.p683ss.android.ugc.aweme.tools.C47325p;
import com.p683ss.android.ugc.aweme.utils.C47919gk;

/* renamed from: com.ss.android.ugc.aweme.services.config.ShortVideoConfigBaseImpl */
public abstract class ShortVideoConfigBaseImpl implements IShortVideoConfig {
    public long maxDuetVideoTime() {
        return 60500;
    }

    public long maxRecordingTime() {
        return 15000;
    }

    public long maxStitchVideoTime() {
        return 60000;
    }

    public boolean isHookLibrary() {
        return C47919gk.m103683a();
    }

    public boolean isRecording() {
        if (!C39618d.m88212a() || C44986ar.m98333a()) {
            return false;
        }
        return true;
    }

    public boolean getUsingOnline() {
        if (!C47325p.f119463a) {
            C47325p.f119463a = true;
            C47325p.f119464b = C35807d.m80935a(C39629l.m88232a().mo58588s().mo74157c(), "effect_setting", 0).getBoolean("key_effect_channle", false);
        }
        return C47325p.f119464b;
    }

    public void enableHookLibrary(boolean z) {
        C47919gk gkVar = C47919gk.f120511c;
        C47919gk.f120509a.storeBoolean("key_ve_hook_switch", z);
        if (z) {
            C47919gk.m103685c();
        }
    }

    public void setUsingOnline(boolean z) {
        C47325p.f119464b = z;
        C35807d.m80935a(C39629l.m88232a().mo58588s().mo74157c(), "effect_setting", 0).edit().putBoolean("key_effect_channle", z).apply();
    }
}
