package com.p683ss.android.ugc.aweme.services.storage;

import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.services.storage.IAVStorageService */
public interface IAVStorageService {
    void checkStorageClean();

    Set<String> getPrefixWhiteList();

    boolean isMonitorEnabled();

    void setMonitorLocalSwitch(boolean z);
}
