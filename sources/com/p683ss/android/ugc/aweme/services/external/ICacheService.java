package com.p683ss.android.ugc.aweme.services.external;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.services.external.ICacheService */
public interface ICacheService {
    String cacheDir();

    void clearDraftEffectCache();

    void clearEffectCache();

    void clearFilterCache();

    void clearMvCache();

    String compatMusDraftDir();

    ArrayList<String> draftEffectList();

    Collection<String> draftWhiteList();

    String effectCacheDir();

    String filterDir();

    File getExternalFaceCacheDir();

    File getLrcExternalCacheDir();

    String musicDir();

    String mvRootDir();

    String oldDraftDir();

    Collection<String> originSoundFile();

    File[] outputFile();

    File[] rawDuetFile();

    File[] rawVideoFile();

    String rootDir();

    String shareDir();

    String stickerDir();

    File[] synthesisFile();

    File[] tempDuetFile();

    Collection<String> tempVideoFile();

    File[] voiceFile();

    Collection<String> whiteList();
}
