package com.p683ss.android.ugc.aweme.services.storage;

import com.p683ss.android.ugc.aweme.p1445bp.C23872a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.Set;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.services.storage.StorageServiceImpl */
public final class StorageServiceImpl implements IAVStorageService {
    public final void checkStorageClean() {
        if (C23872a.m58583a().getBoolean("key_is_effect_storage_cleaning", false)) {
            C50203g.m108363d("av storage clean not finished last time!!!! effect resources maybe not intact");
            C0013i.m16a((Callable<TResult>) StorageServiceImpl$checkStorageClean$1.INSTANCE);
        }
    }

    public final Set<String> getPrefixWhiteList() {
        return C39629l.m88232a().mo58577h().mo49488b().mo49536a();
    }

    public final boolean isMonitorEnabled() {
        return C39629l.m88232a().mo58577h().mo49486a().mo49529a();
    }

    public final void setMonitorLocalSwitch(boolean z) {
        C39629l.m88232a().mo58577h().mo49486a().mo49528a(z);
    }
}
