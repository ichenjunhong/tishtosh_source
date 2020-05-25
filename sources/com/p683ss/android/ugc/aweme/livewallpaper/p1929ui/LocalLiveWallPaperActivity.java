package com.p683ss.android.ugc.aweme.livewallpaper.p1929ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p683ss.android.ugc.aweme.livewallpaper.p1926a.C36185a;
import com.p683ss.android.ugc.aweme.livewallpaper.p1926a.C36185a.C36186a;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36205c;
import com.p683ss.android.ugc.aweme.profile.adapter.C39739a;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity */
public class LocalLiveWallPaperActivity extends AmeSSActivity {

    /* renamed from: a */
    private C36185a f92800a;

    /* renamed from: b */
    private boolean f92801b;
    ViewGroup mLayoutEmpty;
    TextView mTitle;
    RecyclerView mWallPapersRecyclerView;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onResume", true);
        super.onResume();
        List<LiveWallPaperBean> c = C36205c.m81710a().mo74961c();
        if (C9376b.m18558a((Collection<T>) c)) {
            this.mLayoutEmpty.setVisibility(0);
        } else {
            if (!this.f92801b) {
                this.f92801b = true;
                if (!C9376b.m18558a((Collection<T>) c)) {
                    for (LiveWallPaperBean id : c) {
                        C26890h.m65011a("wall_paper_show", C23089d.m56640a().mo47829a("group_id", id.getId()).mo47829a("enter_from", "paper_set").f61491a);
                    }
                }
            }
            this.mLayoutEmpty.setVisibility(8);
        }
        C36185a aVar = this.f92800a;
        aVar.f92649a.clear();
        if (!C9376b.m18558a((Collection<T>) c)) {
            aVar.f92649a.addAll(c);
        }
        aVar.notifyDataSetChanged();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onResume", false);
    }

    public void exit(View view) {
        finish();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.cd);
        this.mTitle.setText(getString(R.string.c0r));
        this.mWallPapersRecyclerView.setLayoutManager(new WrapGridLayoutManager((Context) this, 3, 1, false));
        this.mWallPapersRecyclerView.setHasFixedSize(true);
        this.f92800a = new C36185a();
        this.f92800a.f92650b = new C36186a() {
            /* renamed from: a */
            public final void mo74933a(LiveWallPaperBean liveWallPaperBean) {
                Intent intent = new Intent(LocalLiveWallPaperActivity.this, LiveWallPaperPreviewActivity.class);
                intent.putExtra("live_wall_paper", liveWallPaperBean);
                LocalLiveWallPaperActivity.this.startActivity(intent);
            }
        };
        this.mWallPapersRecyclerView.mo4798a((C1331h) new C39739a((int) C9432q.m18687b((Context) this, 1.0f)));
        this.mWallPapersRecyclerView.setAdapter(this.f92800a);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onCreate", false);
    }
}
