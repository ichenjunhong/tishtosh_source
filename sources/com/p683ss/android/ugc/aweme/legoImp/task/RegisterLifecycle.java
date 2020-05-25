package com.p683ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0654k.C0655a;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.ugc.aweme.app.application.task.p1370a.C23025a;
import com.p683ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.p683ss.android.ugc.aweme.base.component.C23501c;
import com.p683ss.android.ugc.aweme.base.component.EventActivityComponent;
import com.p683ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1341an.C22574a.C22576a;
import com.p683ss.android.ugc.aweme.search.C41431k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.RegisterLifecycle */
public class RegisterLifecycle implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivityPaused(Activity activity) {
            }

            public final void onActivityResumed(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityStopped(Activity activity) {
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof AbsActivity) {
                    AbsActivity absActivity = (AbsActivity) activity;
                    absActivity.getLifecycle().mo324a(new AnalysisActivityComponent(absActivity));
                    absActivity.getLifecycle().mo324a(new EventActivityComponent(absActivity));
                }
                if (activity instanceof FragmentActivity) {
                    ((FragmentActivity) activity).getSupportFragmentManager().mo2229a((C0655a) new C23501c(), true);
                }
                if (!(activity instanceof MainActivity) && !AVExternalServiceImpl.getAVServiceImpl_Monster().classnameService().getVideoRecordActivityClass().isInstance(activity) && !(activity instanceof NewUserJourneyActivity) && !C41431k.f105004a.isSearchResultActivity(activity) && !C23025a.f61364a) {
                    C23025a.f61364a = true;
                    new C23025a().run();
                }
            }
        });
        application.registerActivityLifecycleCallbacks(new C22576a());
    }
}
