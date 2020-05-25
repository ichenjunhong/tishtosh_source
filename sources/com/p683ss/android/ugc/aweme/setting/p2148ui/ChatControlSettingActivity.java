package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity */
public class ChatControlSettingActivity extends BaseControlSettingActivity implements C9382a {

    /* renamed from: d */
    private int f105639d;

    /* renamed from: e */
    private boolean f105640e;

    /* renamed from: f */
    private String f105641f;

    /* renamed from: g */
    private C9381g f105642g;

    /* renamed from: h */
    private int f105643h;

    /* renamed from: c */
    public final String mo85586c() {
        return "";
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: d */
    public final void mo85587d() {
        this.mEveryoneItem.setTag(Integer.valueOf(1));
        this.mFriendsItem.setTag(Integer.valueOf(2));
        this.mOffItem.setTag(Integer.valueOf(3));
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    /* renamed from: a */
    public final void mo85579a() {
        this.f105639d = getIntent().getIntExtra("chat_set", 2);
        int i = this.f105639d;
        if (-1 == i || i == 0) {
            i = 2;
        }
        this.f105639d = i;
        this.f105626a = this.f105639d;
        this.f105640e = getIntent().getBooleanExtra("from_parental_platform", false);
        this.f105641f = getIntent().getStringExtra("user_id");
        this.f105643h = getIntent().getIntExtra("chat_enabled", 0);
        this.f105642g = new C9381g(this);
    }

    /* renamed from: b */
    public final void mo85583b() {
        int i;
        if (this.f105640e) {
            if (this.f105643h == 2) {
                this.mEveryoneItem.getTvwLeft().setTextColor(getResources().getColor(R.color.nx));
                this.mFriendsItem.getTvwLeft().setTextColor(getResources().getColor(R.color.nx));
            }
            this.mTitle.setText(getString(R.string.gce));
            this.mOffItem.setLeftText(getString(R.string.clb));
        } else {
            this.mTitle.setText(C41878g.f106026a);
        }
        this.mEveryoneItem.setVisibility(0);
        if (1 == this.f105639d) {
            mo85581a(this.mEveryoneItem);
        }
        try {
            if (!C32816h.m75716b().getEnableTImChatEveryone().booleanValue()) {
                if (this.f105639d == 1) {
                    i = 2;
                } else {
                    i = this.f105639d;
                }
                this.f105639d = i;
                this.mEveryoneItem.setVisibility(8);
            }
        } catch (C10174a unused) {
        }
        if (3 == this.f105639d) {
            mo85581a(this.mOffItem);
        } else if (2 == this.f105639d) {
            mo85581a(this.mFriendsItem);
        }
        if (C33194e.m76265b() && !this.f105640e) {
            mo85582a((CharSequence) getString(R.string.de7));
        }
        C41878g.m91837a(this);
    }

    public void handleMsg(Message message) {
        Object obj = message.obj;
        if (obj instanceof C23459a) {
            mo55288l();
        } else if (obj instanceof Exception) {
            mo55288l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo85584b(int i) {
        if (this.f105640e) {
            HashMap hashMap = new HashMap();
            hashMap.put("chat_set", String.valueOf(i));
            C17832m a = ParentalPlatformApi.m55930a(this.f105641f, hashMap);
            if (a != null) {
                C17825i.m43739a(a, new C17824h<BaseResponse>() {
                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    }

                    public final void onFailure(Throwable th) {
                        C0013i.m18a((Callable<TResult>) new Callable<Object>() {
                            public final Object call() throws Exception {
                                ChatControlSettingActivity.this.mo55288l();
                                return null;
                            }
                        }, C0013i.f25b);
                    }
                });
            }
            return;
        }
        C23566n.m57766a().mo48750a(this.f105642g, new Callable(i) {

            /* renamed from: a */
            final /* synthetic */ int f105238a;

            public final Object call() throws Exception {
                try {
                    return BlackApiManager.f105237a.setChatAuthority(this.f105238a).get();
                } catch (ExecutionException e) {
                    throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
                }
            }

            {
                this.f105238a = r1;
            }
        }, 1);
    }

    public void onClick(View view) {
        if (view != null) {
            if (this.f105643h == 2 && (view.getId() == R.id.aci || view.getId() == R.id.ajw)) {
                C10691a.m21548c((Context) this, (int) R.string.fgm).mo19066a();
            } else {
                super.onClick(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo85580a(int i) {
        switch (i) {
            case 1:
                mo85581a(this.mEveryoneItem);
                return;
            case 2:
                mo85581a(this.mFriendsItem);
                return;
            case 3:
                mo85581a(this.mOffItem);
                break;
        }
    }

    /* renamed from: a */
    public static final void m91640a(Context context, int i, String str, int i2) {
        Intent intent = new Intent(context, ChatControlSettingActivity.class);
        intent.putExtra("chat_set", i);
        intent.putExtra("from_parental_platform", true);
        intent.putExtra("user_id", str);
        intent.putExtra("chat_enabled", i2);
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
