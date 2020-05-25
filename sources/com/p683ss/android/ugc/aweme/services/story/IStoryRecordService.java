package com.p683ss.android.ugc.aweme.services.story;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.KeyEvent;

/* renamed from: com.ss.android.ugc.aweme.services.story.IStoryRecordService */
public interface IStoryRecordService {

    /* renamed from: com.ss.android.ugc.aweme.services.story.IStoryRecordService$IStoryRecordFragment */
    public interface IStoryRecordFragment {
        Fragment asFragment();

        boolean keyDown(int i, KeyEvent keyEvent);
    }

    IStoryRecordFragment convertFragment(Fragment fragment);

    IStoryRecordFragment create(Bundle bundle);

    boolean isStoryRecording();
}
