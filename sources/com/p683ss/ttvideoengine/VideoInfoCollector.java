package com.p683ss.ttvideoengine;

import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;

/* renamed from: com.ss.ttvideoengine.VideoInfoCollector */
public class VideoInfoCollector {
    private static final VideoInfoCollector ourInstance = new VideoInfoCollector();
    private HashMap<Long, TTVideoEngine> mActiveEngines = new HashMap<>();
    private long mWastedDataSize;

    public static VideoInfoCollector getInstance() {
        return ourInstance;
    }

    private VideoInfoCollector() {
    }

    public synchronized long getPlayWastDataSize() {
        long j;
        j = this.mWastedDataSize;
        this.mWastedDataSize = 0;
        try {
            for (TTVideoEngine longOption : this.mActiveEngines.values()) {
                long longOption2 = longOption.getLongOption(81);
                if (longOption2 > 0) {
                    j += longOption2;
                }
            }
            String str = "VideoInfoCollecor";
            StringBuilder sb = new StringBuilder("get play waste data size: ");
            sb.append(j);
            TTVideoEngineLog.m110644d(str, sb.toString());
        } catch (Exception unused) {
            return j;
        }
        return j;
    }

    public synchronized void unregistEngine(long j) {
        try {
            if (this.mActiveEngines.containsKey(Long.valueOf(j))) {
                long longOption = ((TTVideoEngine) this.mActiveEngines.get(Long.valueOf(j))).getLongOption(81);
                if (longOption > 0) {
                    this.mWastedDataSize += longOption;
                }
                this.mActiveEngines.remove(Long.valueOf(j));
                StringBuilder sb = new StringBuilder("delete engine: ");
                sb.append(j);
                sb.append(", waste data: ");
                sb.append(longOption);
                TTVideoEngineLog.m110644d("VideoInfoCollecor", sb.toString());
            }
        } catch (Exception unused) {
        }
    }

    public synchronized void registEngine(long j, TTVideoEngine tTVideoEngine) {
        if (!this.mActiveEngines.containsKey(Long.valueOf(j))) {
            this.mActiveEngines.put(Long.valueOf(j), tTVideoEngine);
            StringBuilder sb = new StringBuilder("new engine: ");
            sb.append(j);
            TTVideoEngineLog.m110644d("VideoInfoCollecor", sb.toString());
        }
    }
}
