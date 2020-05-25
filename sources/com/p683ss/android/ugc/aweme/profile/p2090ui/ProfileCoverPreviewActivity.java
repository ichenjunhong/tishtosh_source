package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.support.p043v7.app.C1160b;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.StatedButton;
import com.p683ss.android.ugc.aweme.profile.presenter.C39964g;
import com.p683ss.android.ugc.aweme.profile.presenter.C39964g.C39966b;
import com.p683ss.android.ugc.aweme.profile.util.ChangeCoverDialogUseStyleSetting;
import com.ss.android.ugc.trill.R;
import com.zhihu.matisse.C45331a;
import java.io.File;
import java.util.List;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity */
public class ProfileCoverPreviewActivity extends AmeSSActivity {

    /* renamed from: a */
    private UrlModel f102353a;

    /* renamed from: b */
    private boolean f102354b;

    /* renamed from: c */
    private C39964g f102355c;
    TextView mChangeBtn;
    RemoteImageView mCoverImage;
    StatedButton mDownloadBtn;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.ew, R.anim.ex);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo82261a(C0013i iVar) throws Exception {
        C10691a.m21533a((Context) this, (int) R.string.d_h).mo19066a();
        this.mDownloadBtn.mo82723c();
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r0 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSaveInstanceState(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onSaveInstanceState(r3)
            com.ss.android.ugc.aweme.profile.presenter.g r0 = r2.f102355c
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.profile.presenter.g r0 = r2.f102355c
            if (r3 == 0) goto L_0x001d
            java.lang.String r1 = "profile_cover_file"
            java.io.File r0 = r0.f101892d
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r0.getAbsolutePath()
            if (r0 != 0) goto L_0x0019
        L_0x0017:
            java.lang.String r0 = ""
        L_0x0019:
            r3.putString(r1, r0)
            return
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileCoverPreviewActivity.onSaveInstanceState(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005e, code lost:
        if (r5 == null) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity"
            java.lang.String r1 = "onCreate"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onCreate(r5)
            r0 = 2132213871(0x7f17006f, float:2.0071568E38)
            r4.setContentView(r0)
            butterknife.ButterKnife.bind(r4)
            r0 = 2131034203(0x7f05005b, float:1.7678917E38)
            r1 = 2131034204(0x7f05005c, float:1.7678919E38)
            r4.overridePendingTransition(r0, r1)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "header_cover_url"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = (com.p683ss.android.ugc.aweme.base.model.UrlModel) r0
            r4.f102353a = r0
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "is_self"
            r3 = 0
            boolean r0 = r0.getBooleanExtra(r1, r3)
            r4.f102354b = r0
            android.widget.TextView r0 = r4.mChangeBtn
            boolean r1 = r4.f102354b
            if (r1 == 0) goto L_0x0040
            r1 = 0
            goto L_0x0042
        L_0x0040:
            r1 = 8
        L_0x0042:
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r4.mCoverImage
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r4.f102353a
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r0, r1)
            com.ss.android.ugc.aweme.profile.presenter.g r0 = new com.ss.android.ugc.aweme.profile.presenter.g
            r1 = 0
            r0.<init>(r4, r1, r2)
            r4.f102355c = r0
            com.ss.android.ugc.aweme.profile.presenter.g r0 = r4.f102355c
            if (r5 == 0) goto L_0x0060
            java.lang.String r1 = "profile_cover_file"
            java.lang.String r5 = r5.getString(r1)
            if (r5 != 0) goto L_0x0062
        L_0x0060:
            java.lang.String r5 = ""
        L_0x0062:
            r1 = r5
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x006f
            int r1 = r1.length()
            if (r1 != 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r2 = 0
        L_0x006f:
            if (r2 != 0) goto L_0x0078
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            r0.f101892d = r1
        L_0x0078:
            java.lang.String r5 = "com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity"
            java.lang.String r0 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r5, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileCoverPreviewActivity.onCreate(android.os.Bundle):void");
    }

    public void onViewClicked(View view) {
        C1161a aVar;
        int id = view.getId();
        if (id == R.id.azj) {
            view.announceForAccessibility(getText(R.string.pc));
            finish();
        } else if (id == R.id.d7p) {
            C39964g gVar = this.f102355c;
            if (gVar.f101890b == null) {
                boolean enabled = ChangeCoverDialogUseStyleSetting.enabled();
                if (enabled) {
                    C32458a.m75141a(3, "ChangeCoverPresenter", "use style in changeCover dialog");
                }
                if (enabled) {
                    Activity activity = gVar.f101889a;
                    if (activity == null) {
                        C52711k.m112234a();
                    }
                    aVar = new C1161a(activity, R.style.ts);
                } else {
                    Activity activity2 = gVar.f101889a;
                    if (activity2 == null) {
                        C52711k.m112234a();
                    }
                    aVar = new C1161a(activity2);
                }
                aVar.mo3767a((CharSequence[]) gVar.f101891c, (OnClickListener) new C39966b(gVar));
                gVar.f101890b = aVar.mo3772b();
            }
            C26890h.m65011a("replace_profile_info", new C23089d().mo47829a("enter_method", "click_cover").f61491a);
            C1160b bVar = gVar.f101890b;
            if (bVar == null) {
                C52711k.m112234a();
            }
            bVar.show();
        } else {
            if (id == R.id.b05) {
                String a = C23515d.m57664a(this.f102353a);
                if (!TextUtils.isEmpty(a)) {
                    C23361b.m57419a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C40298cj(this, a));
                    return;
                }
                C10691a.m21542b((Context) this, (int) R.string.d_5).mo19066a();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        super.onActivityResult(i, i2, intent);
        C39964g gVar = this.f102355c;
        if (!(gVar.f101889a == null || i2 == 0)) {
            if (i == C39964g.f101886g) {
                if (intent != null) {
                    List a = C45331a.m98818a(intent);
                    if (a == null || a.isEmpty()) {
                        uri = intent.getData();
                    } else {
                        uri = (Uri) a.get(0);
                    }
                    String a2 = C19547d.m47839a((Context) gVar.f101889a, uri);
                    if (C9431p.m18664a(a2)) {
                        Activity activity = gVar.f101889a;
                        if (activity == null) {
                            C52711k.m112234a();
                        }
                        C9432q.m18673a((Context) activity, 2131952652, (int) R.string.coz);
                        return;
                    }
                    gVar.f101892d = new File(a2);
                    File file = gVar.f101892d;
                    if (file == null) {
                        C52711k.m112234a();
                    }
                    if (!file.exists()) {
                        Activity activity2 = gVar.f101889a;
                        if (activity2 == null) {
                            C52711k.m112234a();
                        }
                        C9432q.m18673a((Context) activity2, 2131952652, (int) R.string.coz);
                        return;
                    }
                    Context context = gVar.f101889a;
                    File file2 = gVar.f101892d;
                    if (file2 == null) {
                        C52711k.m112234a();
                    }
                    ProfileCoverCropActivity.m89243a(context, file2.getAbsolutePath(), 2);
                    if (gVar.f101894f) {
                        Activity activity3 = gVar.f101889a;
                        if (activity3 == null) {
                            C52711k.m112234a();
                        }
                        activity3.finish();
                    }
                }
            } else if (i == C39964g.f101887h) {
                if (gVar.f101892d == null) {
                    if (intent != null) {
                        String a3 = C19547d.m47839a((Context) gVar.f101889a, intent.getData());
                        if (C9431p.m18664a(a3)) {
                            Activity activity4 = gVar.f101889a;
                            if (activity4 == null) {
                                C52711k.m112234a();
                            }
                            C9432q.m18673a((Context) activity4, 2131952652, (int) R.string.coz);
                            return;
                        }
                        gVar.f101892d = new File(a3);
                    }
                }
                File file3 = gVar.f101892d;
                if (file3 == null) {
                    C52711k.m112234a();
                }
                if (!file3.exists()) {
                    Activity activity5 = gVar.f101889a;
                    if (activity5 == null) {
                        C52711k.m112234a();
                    }
                    C9432q.m18673a((Context) activity5, 2131952652, (int) R.string.coz);
                    return;
                }
                Activity activity6 = gVar.f101889a;
                if (activity6 == null) {
                    C52711k.m112234a();
                }
                Context context2 = activity6;
                File file4 = gVar.f101892d;
                if (file4 == null) {
                    C52711k.m112234a();
                }
                ProfileCoverCropActivity.m89243a(context2, file4.getAbsolutePath(), 1);
                if (gVar.f101894f) {
                    Activity activity7 = gVar.f101889a;
                    if (activity7 == null) {
                        C52711k.m112234a();
                    }
                    activity7.finish();
                }
            }
        }
    }
}
