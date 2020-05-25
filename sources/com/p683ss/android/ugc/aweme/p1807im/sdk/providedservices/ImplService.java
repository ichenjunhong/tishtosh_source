package com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.R$drawable;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.C35009d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34791a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34807e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34811f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.C35413o;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.ImplService */
public class ImplService implements IImplService {
    public boolean enableExpressionTab() {
        return true;
    }

    public boolean enableMediaRecord() {
        return false;
    }

    public boolean enableSendEmoji() {
        return true;
    }

    public boolean enableSendVoice() {
        return false;
    }

    public Class getEmojiRClass() {
        return R$drawable.class;
    }

    public boolean isMtCase() {
        return true;
    }

    public boolean needAwemeMsgShowFollow() {
        return true;
    }

    public boolean needSessionListShowMore() {
        return false;
    }

    public static IImplService createIImplServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IImplService.class);
        if (a != null) {
            return (IImplService) a;
        }
        if (C27991b.f73485ap == null) {
            synchronized (IImplService.class) {
                if (C27991b.f73485ap == null) {
                    C27991b.f73485ap = new ImplService();
                }
            }
        }
        return (ImplService) C27991b.f73485ap;
    }

    public boolean isUserVerified(IMUser iMUser) {
        if (!TextUtils.isEmpty(iMUser.getCustomVerify())) {
            return true;
        }
        return false;
    }

    public void setTitleStyle(TextView textView) {
        textView.getPaint().setFakeBoldText(true);
    }

    private static void setLightStatusBar(Activity activity) {
        if (VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | VideoCacheReadBuffersizeExperiment.DEFAULT);
        }
    }

    public C1331h getItemDecoration(Context context) {
        return new C35413o(context.getResources().getColor(R.color.a3x), (int) C9432q.m18687b(context, 0.5f), (int) C9432q.m18687b(context, 15.0f));
    }

    public void setupStatusBar(Activity activity) {
        setStatusBarColor(activity, activity.getResources().getColor(R.color.s7));
        setLightStatusBar(activity);
    }

    public C34791a getRelationListAdapter(boolean z) {
        if (!DefaultIMService.provideIMService_Monster().getAbInterface().mo70321b()) {
            return new C35009d();
        }
        if (z) {
            return new C34807e();
        }
        return new C34811f();
    }

    public void setupStatusBarWithHolder(Activity activity, View view) {
        view.setVisibility(8);
        setupStatusBar(activity);
    }

    private static void setStatusBarColor(Activity activity, int i) {
        if (VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i);
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            C11065a.m22392a(activity, i);
        }
    }
}
