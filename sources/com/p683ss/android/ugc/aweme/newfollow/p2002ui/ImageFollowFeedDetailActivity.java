package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity */
public class ImageFollowFeedDetailActivity extends AbsFollowFeedDetailActivity<RemoteImageView> implements OnClickListener {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo77340f() {
        return R.layout.ba;
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo77345k() {
        this.mDragView.mo54900a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final /* synthetic */ View mo77344j() {
        this.f96488a = new RemoteImageView(this);
        ((RemoteImageView) this.f96488a).setOnClickListener(this);
        Aweme n = mo77348n();
        if (n != null) {
            List imageInfos = n.getImageInfos();
            if (imageInfos != null && !imageInfos.isEmpty()) {
                ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
                if (imageInfo != null) {
                    C23515d.m57669a((RemoteImageView) this.f96488a, imageInfo.getLabelLarge());
                }
            }
        }
        return (RemoteImageView) this.f96488a;
    }
}
