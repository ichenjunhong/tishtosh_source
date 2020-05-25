package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.p030v4.app.Fragment;
import com.bytedance.android.livesdk.p416t.C8302f;
import com.bytedance.android.livesdk.p416t.p418b.C8288d;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.p1076a.C17952c;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bg */
public final class C4875bg extends C10779d<JSONObject, C4880a> {

    /* renamed from: a */
    public C1690c f13134a;

    /* renamed from: b */
    public Fragment f13135b;

    /* renamed from: c */
    public ProgressDialog f13136c;

    /* renamed from: d */
    C10783f f13137d;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bg$a */
    static final class C4880a {
        @C17952c(mo34828a = "code")

        /* renamed from: a */
        int f13147a;
        @C17952c(mo34828a = "uri")

        /* renamed from: b */
        String f13148b;
        @C17952c(mo34828a = "url")

        /* renamed from: c */
        String f13149c;

        private C4880a(int i, String str, String str2) {
            this.f13147a = i;
            this.f13148b = str;
            this.f13149c = str2;
        }
    }

    /* renamed from: a */
    public final void mo10634a() {
        if (this.f13136c != null) {
            this.f13136c.dismiss();
            this.f13136c = null;
        }
        finishWithFailure();
    }

    public final void onTerminate() {
        if (this.f13134a != null) {
            this.f13134a.dispose();
        }
        this.f13135b = null;
        this.f13137d = null;
    }

    public C4875bg(Fragment fragment) {
        this.f13135b = fragment;
    }

    public final /* synthetic */ void invoke(Object obj, final C10783f fVar) throws Exception {
        final JSONObject jSONObject = (JSONObject) obj;
        this.f13137d = fVar;
        int optInt = jSONObject.optInt("action_type", 0);
        if (optInt == 0) {
            C8302f.m16453a((Activity) fVar.f28972a).mo14484a(new C8288d() {
                /* renamed from: b */
                public final void mo9069b(String... strArr) {
                    C9432q.m18673a(fVar.f28972a, (int) R.drawable.bpe, (int) R.string.e7c);
                    C4875bg.this.finishWithFailure();
                }

                /* renamed from: a */
                public final void mo9068a(String... strArr) {
                    int optInt = jSONObject.optInt("duration_limit", 10);
                    Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    intent.putExtra("android.intent.extra.durationLimit", optInt);
                    intent.putExtra("android.intent.extra.videoQuality", 1);
                    if (C4875bg.this.f13135b.getActivity() == null) {
                        C4875bg.this.finishWithFailure();
                    } else {
                        C4875bg.this.f13135b.startActivityForResult(intent, 9001);
                    }
                }
            }, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
            return;
        }
        if (optInt == 1) {
            C8302f.m16453a((Activity) fVar.f28972a).mo14484a(new C8288d() {
                /* renamed from: b */
                public final void mo9069b(String... strArr) {
                    C9432q.m18673a(fVar.f28972a, (int) R.drawable.bpe, (int) R.string.e7c);
                    C4875bg.this.finishWithFailure();
                }

                /* renamed from: a */
                public final void mo9068a(String... strArr) {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("video/*");
                    if (C4875bg.this.f13135b.getActivity() == null) {
                        C4875bg.this.finishWithFailure();
                    } else {
                        C4875bg.this.f13135b.startActivityForResult(intent, 9002);
                    }
                }
            }, "android.permission.READ_EXTERNAL_STORAGE");
        }
    }
}
