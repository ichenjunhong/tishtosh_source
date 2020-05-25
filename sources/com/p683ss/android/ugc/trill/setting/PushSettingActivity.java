package com.p683ss.android.ugc.trill.setting;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.base.activity.AmePresenterActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.bogut.library.p2414a.C48497b;
import com.ss.android.ugc.trill.R;

@C48497b(mo95985a = C50405d.class)
/* renamed from: com.ss.android.ugc.trill.setting.PushSettingActivity */
public class PushSettingActivity extends AmePresenterActivity<C50405d> implements OnClickListener {

    /* renamed from: a */
    ImmersionBar f126343a;
    protected CommonItemView mCommentMeItem;
    protected CommonItemView mFollowMeItem;
    protected CommonItemView mLikeMeItem;
    protected ButtonTitleBar mTitleBar;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f126343a != null) {
            this.f126343a.destroy();
        }
    }

    public void setStatusBarColor() {
        if (this.f126343a == null) {
            this.f126343a = ImmersionBar.with((Activity) this);
        }
        this.f126343a.statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    /* renamed from: b */
    public final void mo98287b() {
        this.mLikeMeItem.setChecked(!this.mLikeMeItem.mo19040c());
        C20902b.m53242a().updateShieldDiggNotice(this.mLikeMeItem.mo19040c() ^ true ? 1 : 0);
        m108675a("like", this.mLikeMeItem.mo19040c());
    }

    /* renamed from: c */
    public final void mo98288c() {
        this.mFollowMeItem.setChecked(!this.mFollowMeItem.mo19040c());
        C20902b.m53242a().updateShieldFollowNotice(this.mFollowMeItem.mo19040c() ^ true ? 1 : 0);
        m108675a("follow", this.mFollowMeItem.mo19040c());
    }

    /* renamed from: d */
    public final void mo98289d() {
        this.mCommentMeItem.setChecked(!this.mCommentMeItem.mo19040c());
        C20902b.m53242a().updateShieldCommentNotice(this.mCommentMeItem.mo19040c() ^ true ? 1 : 0);
        m108675a("comment_page", this.mCommentMeItem.mo19040c());
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.ban) {
            ((C50405d) mo48546a()).mo98307a(view.getId(), this.mLikeMeItem.mo19040c());
        } else if (id == R.id.aia) {
            ((C50405d) mo48546a()).mo98307a(view.getId(), this.mFollowMeItem.mo19040c());
        } else {
            if (id == R.id.xd) {
                ((C50405d) mo48546a()).mo98307a(view.getId(), this.mCommentMeItem.mo19040c());
            }
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dp);
        this.mTitleBar.setTitle((CharSequence) getString(R.string.d22));
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                PushSettingActivity.this.finish();
            }
        });
        this.mLikeMeItem.setOnClickListener(this);
        this.mFollowMeItem.setOnClickListener(this);
        this.mCommentMeItem.setOnClickListener(this);
        User curUser = C20902b.m53242a().getCurUser();
        CommonItemView commonItemView = this.mLikeMeItem;
        if (curUser.getShieldDiggNotice() != 1) {
            z = true;
        } else {
            z = false;
        }
        commonItemView.setChecked(z);
        CommonItemView commonItemView2 = this.mFollowMeItem;
        if (curUser.getShieldFollowNotice() != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        commonItemView2.setChecked(z2);
        CommonItemView commonItemView3 = this.mCommentMeItem;
        if (curUser.getShieldCommentNotice() == 1) {
            z3 = false;
        }
        commonItemView3.setChecked(z3);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static void m108675a(String str, boolean z) {
        String str2;
        C26898j jVar = new C26898j();
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        jVar.mo54849a("to_status", str2);
        C26890h.onEvent(MobClick.obtain().setEventName("notification_switch").setLabelName(str).setJsonObject(jVar.mo54850a()));
    }
}
