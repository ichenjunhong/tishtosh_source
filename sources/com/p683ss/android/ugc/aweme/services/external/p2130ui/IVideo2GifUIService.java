package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.p683ss.android.ugc.aweme.services.videochoose.IVideoChoose.Callback;
import com.p683ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.IVideo2GifUIService */
public interface IVideo2GifUIService {
    IVideoChoose toMusVideoChooseFragment(FragmentActivity fragmentActivity, Fragment fragment, Callback callback, Integer num);

    Fragment video2GifFragment(VideoShare2GifEditContext videoShare2GifEditContext);
}
