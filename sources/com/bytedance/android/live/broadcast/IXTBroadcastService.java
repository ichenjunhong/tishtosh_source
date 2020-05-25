package com.bytedance.android.live.broadcast;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8680c;

public interface IXTBroadcastService {
    LiveActivityProxy createXTBroadcastBeforeActivityProxy(FragmentActivity fragmentActivity);

    LiveActivityProxy createXTBroadcastResDownloadActivityProxy(FragmentActivity fragmentActivity);

    Fragment createXTMediaBroadcastFragment(C8680c cVar, Bundle bundle);

    LiveActivityProxy createXTMediaStartLiveProxy(FragmentActivity fragmentActivity);
}
