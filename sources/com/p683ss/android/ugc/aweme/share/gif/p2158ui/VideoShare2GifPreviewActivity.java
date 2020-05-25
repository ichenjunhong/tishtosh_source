package com.p683ss.android.ugc.aweme.share.gif.p2158ui;

import android.app.Activity;
import android.arch.lifecycle.C0183j;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p683ss.android.ugc.aweme.share.improve.C42044a;
import com.p683ss.android.ugc.aweme.share.seconditem.ShareItemView;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.utils.C47856en;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity */
public class VideoShare2GifPreviewActivity extends AmeActivity implements C0183j {

    /* renamed from: a */
    VideoShare2GifEditContext f106408a;

    /* renamed from: b */
    boolean f106409b;
    RemoteImageView gifImageView;
    LinearLayout llShareContainer;
    DmtTextView tvShareTitle;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.arz);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onResume", true);
        super.onResume();
        if (this.f106409b) {
            setResult(-1);
            finish();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onResume", false);
    }

    /* renamed from: a */
    private void m91998a() {
        String[] gifImageShareList = C41979aq.m91947b().getGifImageShareList();
        if (gifImageShareList != null && gifImageShareList.length > 0) {
            for (String str : gifImageShareList) {
                if (!TextUtils.isEmpty(str)) {
                    C42307b a = C42044a.m92009a(str, this);
                    if (a != null) {
                        ShareItemView a2 = ShareItemView.m92667a(this, a.mo86137c(), C0726c.m2091a((Context) this, a.mo86131a()), new C42033e(this, a, str));
                        a2.setTextColor(R.color.a19);
                        if (a.mo86141a(this)) {
                            this.llShareContainer.addView(a2);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void handleUiClickEvent(View view) {
        if (view.getId() == R.id.d70) {
            C26890h.m65011a("gif_re_edit", (Map<String, String>) new HashMap<String,String>());
            setResult(0);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ev);
        ButterKnife.bind((Activity) this);
        this.f106408a = (VideoShare2GifEditContext) getIntent().getParcelableExtra("extra_data");
        if (this.f106408a == null) {
            finish();
        }
        if (VERSION.SDK_INT >= 21) {
            this.gifImageView.setClipToOutline(true);
            this.gifImageView.setOutlineProvider(new C47856en(C23728o.m58241a(4.0d)));
        }
        if (!TextUtils.isEmpty(this.f106408a.f106358e) && this.f106408a.f106363j > 0 && this.f106408a.f106362i > 0) {
            LayoutParams layoutParams = this.gifImageView.getLayoutParams();
            layoutParams.width = this.f106408a.f106362i;
            layoutParams.height = this.f106408a.f106363j;
            this.gifImageView.setLayoutParams(layoutParams);
            Uri fromFile = Uri.fromFile(new File(this.f106408a.f106358e));
            C13771c.m27875c().mo26191b(fromFile);
            C23515d.m57678a(this.gifImageView, fromFile.toString(), this.f106408a.f106362i, this.f106408a.f106363j);
        }
        this.tvShareTitle.setFontType(C10751d.f28903b);
        m91998a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onCreate", false);
    }
}
