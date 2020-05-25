package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.newmedia.p1195a.C19540c;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.audio.AudioUtils;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.base.p1420ui.ScrollableViewPager;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai;
import com.p683ss.android.ugc.aweme.feed.preload.C30679e;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36353b;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.main.MainFragment;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.p1963ml.C37105d;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl;
import com.p683ss.android.ugc.aweme.qrcode.C41000d;
import com.p683ss.android.ugc.aweme.userservice.C47588a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceTask */
public class PreloadInstanceTask implements LegoTask {
    private void preloadInstance(Object obj) {
    }

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        preloadInstance(Double.valueOf(AudioUtils.m57293a()));
        preloadInstance(context.getSystemService("audio"));
        preloadInstance(context.getSystemService("activity"));
        preloadInstance(C30679e.m71957a());
        preloadInstance(C19540c.m47819a(context));
        preloadInstance(Boolean.valueOf(MainActivity.appsFlyerisInit));
        preloadInstance(Boolean.valueOf(DetailActivity.f72254d));
        preloadInstance(Boolean.valueOf(CrossPlatformActivity.f71477b));
        preloadInstance(C38046d.f96822b);
        preloadInstance(C37105d.m83336a());
        try {
            preloadInstance(new ScrollableViewPager(context));
            preloadInstance(new SwipeRefreshLayout(context));
            preloadInstance(new DmtTextView(context));
            preloadInstance(new MainFragment());
            preloadInstance(new C30753ai());
            preloadInstance(C23718g.m58207b());
        } catch (Throwable unused) {
        }
        preloadInstance(C41000d.m90627a());
        preloadInstance(C18642g.m45250w());
        C25945k.m62923n();
        C47588a.m103036c();
        ProfileDependentComponentImpl.createIProfileDependentComponentServicebyMonsterPlugin();
        C23794bh.m58404r().mo92586a();
        C23794bh.m58393g();
        preloadInstance(Boolean.valueOf(PosterSRProcessorInitTask.NEED_POSTER_PROCESS));
        preloadInstance(new C23279d());
        preloadInstance(Boolean.valueOf(true));
        preloadInstance(Boolean.valueOf(C36353b.m82038a(null)));
        preloadInstance(C40733z.f103767a);
    }
}
