package com.p683ss.android.ugc.aweme.services.external;

import android.content.Context;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IDraftService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IEditService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IPublishPageService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IRecordService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IStoryService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.ITestActivityService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IVideo2GifUIService;

/* renamed from: com.ss.android.ugc.aweme.services.external.IUIService */
public interface IUIService {
    IVideo2GifUIService abilityUiService();

    IDraftService draftService();

    IEditService editService();

    IPublishPageService publishService();

    IRecordService recordService();

    ITestActivityService schemaTestService();

    void startSuperEntraceActivity(Context context);

    IStoryService storyService();
}
