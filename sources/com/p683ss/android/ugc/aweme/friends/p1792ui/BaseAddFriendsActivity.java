package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.os.Bundle;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p683ss.android.ugc.aweme.friends.invite.C32583a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.BaseAddFriendsActivity */
public abstract class BaseAddFriendsActivity extends AmeSlideSSActivity {

    /* renamed from: b */
    private C32583a f84880b;
    protected NormalTitleBar mTitleBar;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo66145a(boolean z);

    public void onDestroy() {
        super.onDestroy();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.bb0);
        this.mTitleBar.setTitle((int) R.string.b34);
        this.mTitleBar.setTitleColor(getResources().getColor(R.color.a1k));
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                BaseAddFriendsActivity.this.finish();
            }
        });
        this.f84880b = new C32583a(this);
        C32583a aVar = this.f84880b;
        User curUser = C20854a.m53167g().getCurUser();
        if (curUser != null && aVar.f84809a != curUser) {
            aVar.f84809a = curUser;
            String string = aVar.f84811c.getString(R.string.ip);
            aVar.f84810b.mo65914a(aVar.f84809a, aVar.f84811c.getString(R.string.bt8, new Object[]{string}), aVar.f84811c.getString(R.string.bt6, new Object[]{string}));
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1 && iArr.length > 0 && iArr[0] == 0) {
            mo66145a(true);
        } else {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }
}
