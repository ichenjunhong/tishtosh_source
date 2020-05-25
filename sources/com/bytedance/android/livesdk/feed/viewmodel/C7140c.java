package com.bytedance.android.livesdk.feed.viewmodel;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository.C7069a;

/* renamed from: com.bytedance.android.livesdk.feed.viewmodel.c */
final /* synthetic */ class C7140c implements C0199s {

    /* renamed from: a */
    private final BaseFeedDataViewModel f19417a;

    C7140c(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f19417a = baseFeedDataViewModel;
    }

    public final void onChanged(Object obj) {
        BaseFeedDataViewModel baseFeedDataViewModel = this.f19417a;
        if (((C7069a) obj) == C7069a.SUCCESS) {
            Integer num = (Integer) baseFeedDataViewModel.f19380s.getValue();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            baseFeedDataViewModel.f19380s.setValue(Integer.valueOf(num.intValue() + 1));
        }
    }
}
