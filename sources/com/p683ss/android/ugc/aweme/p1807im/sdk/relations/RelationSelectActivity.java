package com.p683ss.android.ugc.aweme.p1807im.sdk.relations;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34209b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35097f;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity */
public class RelationSelectActivity extends AmeActivity {

    /* renamed from: b */
    private static C23371a<Boolean> f89595b;

    /* renamed from: a */
    private Fragment f89596a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void finish() {
        super.finish();
        if (this.f89596a instanceof C34209b) {
            overridePendingTransition(R.anim.ej, R.anim.el);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r6 = this;
            android.support.v4.app.Fragment r0 = r6.f89596a
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.relations.C35024h
            if (r0 == 0) goto L_0x0051
            android.support.v4.app.Fragment r0 = r6.f89596a
            com.ss.android.ugc.aweme.im.sdk.relations.h r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.relations.C35024h) r0
            com.ss.android.ugc.aweme.im.sdk.relations.j r1 = r0.f90105a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x004a
            android.support.v4.app.FragmentActivity r1 = r0.getActivity()
            if (r1 == 0) goto L_0x0041
            android.support.v4.app.FragmentActivity r1 = r0.getActivity()
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            int r1 = r1.getHeight()
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            android.support.v4.app.FragmentActivity r5 = r0.getActivity()
            android.view.Window r5 = r5.getWindow()
            android.view.View r5 = r5.getDecorView()
            r5.getWindowVisibleDisplayFrame(r4)
            int r4 = r4.bottom
            int r1 = r1 - r4
            if (r1 == 0) goto L_0x0041
            r1 = 1
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            if (r1 != 0) goto L_0x004a
            com.ss.android.ugc.aweme.im.sdk.relations.j r0 = r0.f90105a
            r0.mo73151k()
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            if (r2 != 0) goto L_0x0051
            super.onBackPressed()
            return
        L_0x0051:
            android.support.v4.app.Fragment r0 = r6.f89596a
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34209b
            if (r0 == 0) goto L_0x0065
            android.support.v4.app.Fragment r0 = r6.f89596a
            com.ss.android.ugc.aweme.im.sdk.group.b r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34209b) r0
            boolean r0 = r0.bl_()
            if (r0 != 0) goto L_0x0065
            super.onBackPressed()
            return
        L_0x0065:
            android.support.v4.app.Fragment r0 = r6.f89596a
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.relations.C35017f
            if (r0 == 0) goto L_0x0079
            android.support.v4.app.Fragment r0 = r6.f89596a
            com.ss.android.ugc.aweme.im.sdk.relations.f r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.relations.C35017f) r0
            boolean r0 = r0.bl_()
            if (r0 != 0) goto L_0x0079
            super.onBackPressed()
            return
        L_0x0079:
            android.support.v4.app.Fragment r0 = r6.f89596a
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34250e
            if (r0 == 0) goto L_0x008d
            android.support.v4.app.Fragment r0 = r6.f89596a
            com.ss.android.ugc.aweme.im.sdk.group.e r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34250e) r0
            boolean r0 = r0.bl_()
            if (r0 != 0) goto L_0x008d
            super.onBackPressed()
            return
        L_0x008d:
            android.support.v4.app.Fragment r0 = r6.f89596a
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34258f
            if (r0 == 0) goto L_0x00a0
            android.support.v4.app.Fragment r0 = r6.f89596a
            com.ss.android.ugc.aweme.im.sdk.group.f r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34258f) r0
            boolean r0 = r0.bl_()
            if (r0 != 0) goto L_0x00a0
            super.onBackPressed()
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.RelationSelectActivity.onBackPressed():void");
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bcb);
        C34004b.m77718b().setupStatusBar(this);
        DefaultIMService.provideIMService_Monster().getAbInterface();
        Intent intent = getIntent();
        if (intent == null || intent.getIntExtra("key_member_list_type", 0) != 4) {
            C0654k supportFragmentManager = getSupportFragmentManager();
            C0679r a = supportFragmentManager.mo2225a();
            this.f89596a = supportFragmentManager.mo2224a("relation_fragment_tag");
            if (this.f89596a == null) {
                this.f89596a = new C35024h();
                this.f89596a.setArguments(getIntent().getExtras());
            }
            if (this.f89596a instanceof C35024h) {
                ((C35024h) this.f89596a).f90106b = f89595b;
            }
            a.mo2192b(R.id.agz, this.f89596a, "relation_fragment_tag").mo2195c();
        } else {
            C0654k supportFragmentManager2 = getSupportFragmentManager();
            C0679r a2 = supportFragmentManager2.mo2225a();
            this.f89596a = supportFragmentManager2.mo2224a("member_fragment_tag");
            if (this.f89596a == null) {
                int intExtra = getIntent().getIntExtra("key_member_list_type", 0);
                new C35097f();
                this.f89596a = C35097f.m79312a(intExtra);
                this.f89596a.setArguments(getIntent().getExtras());
                if (this.f89596a instanceof C35017f) {
                    ((C35017f) this.f89596a).f90092d = f89595b;
                } else if (this.f89596a instanceof C34209b) {
                    overridePendingTransition(R.anim.ek, R.anim.ej);
                }
            }
            a2.mo2192b(R.id.agz, this.f89596a, "member_fragment_tag").mo2195c();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m78823a(Context context, String str) {
        Intent intent = new Intent(context, RelationSelectActivity.class);
        intent.putExtra("key_member_list_type", 0);
        Bundle bundle = new Bundle();
        bundle.putString("key_enter_method", str);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m78821a(Activity activity, Bundle bundle, int i) {
        Intent intent = new Intent(activity, RelationSelectActivity.class);
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f89596a != null) {
            this.f89596a.onActivityResult(i, i2, intent);
        }
    }

    /* renamed from: a */
    public static void m78822a(Context context, Bundle bundle, C23371a<Boolean> aVar) {
        Intent intent = new Intent(context, RelationSelectActivity.class);
        if (bundle != null) {
            intent.putExtra("key_member_list_type", 1);
            intent.putExtras(bundle);
        } else {
            intent.putExtra("key_member_list_type", 0);
        }
        f89595b = aVar;
        context.startActivity(intent);
    }
}
