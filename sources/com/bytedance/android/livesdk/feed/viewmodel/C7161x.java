package com.bytedance.android.livesdk.feed.viewmodel;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.feed.C6957i.C6958a;
import com.bytedance.common.utility.p522b.C9376b;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.viewmodel.x */
final /* synthetic */ class C7161x implements C6958a {

    /* renamed from: a */
    private final LiveFeedViewModel f19438a;

    C7161x(LiveFeedViewModel liveFeedViewModel) {
        this.f19438a = liveFeedViewModel;
    }

    /* renamed from: a */
    public final void mo13148a(String str) {
        int i;
        LiveFeedViewModel liveFeedViewModel = this.f19438a;
        if (!TextUtils.isEmpty(liveFeedViewModel.f19402d)) {
            Object obj = null;
            try {
                obj = Uri.parse(liveFeedViewModel.f19402d).getQueryParameter("style");
            } catch (Exception unused) {
            }
            if ("5".equals(obj)) {
                List f = liveFeedViewModel.f19399a.mo12983f();
                if (!C9376b.m18558a((Collection<T>) f)) {
                    int i2 = 0;
                    boolean z = true;
                    while (i2 < f.size()) {
                        if (((FeedItem) f.get(i2)).type == 6) {
                            if (i2 % 2 == 1) {
                                if (z) {
                                    if (i2 < f.size() - 1) {
                                        i = i2 + 1;
                                        Collections.swap(f, i2, i);
                                    } else {
                                        Collections.swap(f, i2, i2 - 1);
                                    }
                                }
                                z = !z;
                            } else {
                                if (!z) {
                                    if (i2 < f.size() - 1) {
                                        i = i2 + 1;
                                        Collections.swap(f, i2, i);
                                    } else {
                                        Collections.swap(f, i2, i2 - 1);
                                    }
                                }
                                z = !z;
                            }
                            i2 = i;
                            z = !z;
                        }
                        i2++;
                    }
                }
            }
        }
    }
}
