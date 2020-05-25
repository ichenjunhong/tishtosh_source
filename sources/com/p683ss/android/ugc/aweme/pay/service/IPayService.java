package com.p683ss.android.ugc.aweme.pay.service;

import android.content.Context;
import com.p683ss.android.ugc.aweme.pay.service.p2043a.C38567a;
import com.p683ss.android.ugc.aweme.pay.service.p2043a.C38569b;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.pay.service.IPayService */
public interface IPayService {
    void initWalletSDKContext(String str);

    C38567a newPayTransaction(WeakReference<Context> weakReference, C38569b bVar);
}
