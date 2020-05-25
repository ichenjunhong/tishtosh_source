package com.p683ss.android.ugc.aweme.livewallpaper.p1929ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ListAdapter;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.livewallpaper.C36180a;
import com.p683ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36205c;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36205c.C36209a;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36212f;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40275bw;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40275bw.C40276a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity */
public class LiveWallPaperPreviewActivity extends AmeSSActivity implements Callback {

    /* renamed from: a */
    public LiveWallPaperBean f92784a;

    /* renamed from: b */
    private C36180a f92785b;
    SurfaceView mPreviewSurface;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    public void onDestroy() {
        super.onDestroy();
        C36205c.m81710a().mo74958a("paper_set");
    }

    public void onClickMore() {
        C26891a aVar = new C26891a(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C40276a(getResources().getString(R.string.ao2), false));
        arrayList.add(new C40276a(getResources().getString(R.string.wf), false));
        final C40275bw bwVar = new C40275bw(this, arrayList);
        aVar.mo54843a((ListAdapter) bwVar, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                if (LiveWallPaperPreviewActivity.this.getResources().getString(R.string.ao2).equals((String) bwVar.f102814a.get(i))) {
                    new C10643a(LiveWallPaperPreviewActivity.this).mo18902b(LiveWallPaperPreviewActivity.this.getResources().getString(R.string.aob)).mo18893a(LiveWallPaperPreviewActivity.this.getResources().getString(R.string.ah2), (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C36205c a = C36205c.m81710a();
                            String id = LiveWallPaperPreviewActivity.this.f92784a.getId();
                            if (!C9376b.m18558a((Collection<T>) a.f92684a) && !TextUtils.isEmpty(id)) {
                                Iterator it = a.f92684a.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    LiveWallPaperBean liveWallPaperBean = (LiveWallPaperBean) it.next();
                                    if (id.equals(liveWallPaperBean.getId())) {
                                        a.mo74957a(liveWallPaperBean);
                                        it.remove();
                                        if (a.f92686c != null) {
                                            a.f92686c.mo48503b(a.f92685b.mo34889b(a.f92684a));
                                        }
                                    }
                                }
                            }
                            LiveWallPaperPreviewActivity.this.finish();
                        }
                    }).mo18903b(LiveWallPaperPreviewActivity.this.getResources().getString(R.string.wf), (OnClickListener) null).mo18897a().mo18882b();
                }
            }
        });
        try {
            aVar.mo54845b();
        } catch (NotFoundException e) {
            C32458a.m75148a((Throwable) e);
        }
    }

    public void setLiveWallPaper() {
        if (!C36212f.m81740a((Activity) this, this.f92784a.getId())) {
            C36205c.m81710a().mo74959a("paper_set", new C36209a() {
                /* renamed from: a */
                public final void mo74955a(boolean z, String str) {
                    if (z) {
                        C10691a.m21533a(LiveWallPaperPreviewActivity.this.getApplicationContext(), (int) R.string.ddt).mo19066a();
                        C36212f.m81734a(0, "");
                        LiveWallPaperPreviewActivity.this.finish();
                    } else {
                        C36212f.m81734a(1, str);
                    }
                    C36212f.m81738a(LiveWallPaperPreviewActivity.this.f92784a.getId(), "paper_set", z);
                }
            });
            this.f92784a.setSource("paper_set");
            C36205c a = C36205c.m81710a();
            LiveWallPaperBean liveWallPaperBean = this.f92784a;
            a.f92687d.setId(liveWallPaperBean.getId());
            a.f92687d.setThumbnailPath(liveWallPaperBean.getThumbnailPath());
            a.f92687d.setVideoPath(liveWallPaperBean.getVideoPath());
            a.f92687d.setWidth(liveWallPaperBean.getWidth());
            a.f92687d.setHeight(liveWallPaperBean.getHeight());
            a.f92687d.setSource(liveWallPaperBean.getSource());
            C36205c.m81710a().mo74956a((Activity) this);
            C26890h.m65011a("wall_paper_click", C23089d.m56640a().mo47829a("group_id", this.f92784a.getId()).mo47829a("enter_from", "paper_set").f61491a);
        }
    }

    public void exit(View view) {
        finish();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f92785b.mo74924a(surfaceHolder);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f92785b.mo74926a(surfaceHolder, this.f92784a.getVideoPath(), this.f92784a.getWidth(), this.f92784a.getHeight(), true);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f92784a = (LiveWallPaperBean) getIntent().getParcelableExtra("live_wall_paper");
        if (this.f92784a == null) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", false);
            return;
        }
        setContentView((int) R.layout.cb);
        C26894c.m65022a(findViewById(R.id.csm));
        this.mPreviewSurface.getHolder().addCallback(this);
        this.f92785b = new C36180a(null);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && C36212f.m81741a((Context) this, getPackageName())) {
            C10691a.m21533a(getApplicationContext(), (int) R.string.ddt).mo19066a();
            C36212f.m81738a(this.f92784a.getId(), "paper_set", true);
            C36212f.m81734a(0, "");
            finish();
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f92785b.mo74925a(surfaceHolder, i, i2, i3);
    }
}
