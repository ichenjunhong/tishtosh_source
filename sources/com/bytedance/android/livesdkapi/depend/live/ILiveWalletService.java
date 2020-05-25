package com.bytedance.android.livesdkapi.depend.live;

import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.live.base.C2952b;

public interface ILiveWalletService extends C2952b {
    C0649f createRechargeDialogFragment(FragmentActivity fragmentActivity, C8664n nVar, Bundle bundle);

    Fragment getFirstChargeRewardFragment(int i, int i2);
}
