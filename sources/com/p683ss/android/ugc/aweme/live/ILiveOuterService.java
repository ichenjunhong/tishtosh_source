package com.p683ss.android.ugc.aweme.live;

import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8683f;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.ugc.aweme.live.feedpage.C36082a;
import com.p683ss.android.ugc.aweme.live.p1919b.C36059a;
import com.p683ss.android.ugc.aweme.live.p1921d.C36067b;
import com.p683ss.android.ugc.aweme.live.p1921d.C36068c;
import com.p683ss.android.ugc.aweme.p1803i.C33087a;
import com.p683ss.android.ugc.aweme.p1803i.C33088b;
import com.p683ss.android.ugc.aweme.p1803i.C33089c;
import com.p683ss.android.ugc.aweme.port.internal.C39655e;
import com.p683ss.android.ugc.aweme.story.live.C46639b;

/* renamed from: com.ss.android.ugc.aweme.live.ILiveOuterService */
public interface ILiveOuterService {
    void changeLiveHostConfigNetState(boolean z);

    C33088b generateLivPreview(AbsActivity absActivity);

    C36068c generateLivePlayHelper(Runnable runnable, C36067b bVar);

    C33087a getDebugHandler();

    C46639b getILiveAllService();

    C36065d getLive();

    C36059a getLiveCommonManager();

    C36071e getLiveFeedFactory();

    C36075f getLiveInitService();

    C39655e getLiveModule();

    C36095h getLiveOuterSettingService();

    C36098k getLiveServiceAdapter();

    C36082a getLiveStateManager();

    C33089c getLiveWatcherUtils();

    void monitorImageNetwork(Object obj);

    C8683f startLiveManager();

    void tryShowTakeLiveBubble(Fragment fragment, View view, boolean z);
}
