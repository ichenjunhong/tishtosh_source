package com.p683ss.android.ugc.aweme.shortvideo.record;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a */
public final class C44436a {

    /* renamed from: a */
    public WeakReference<Activity> f112421a;

    /* renamed from: b */
    public volatile long f112422b = -1;

    /* renamed from: c */
    public final C44441b f112423c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a$a */
    class C44438a implements AudioRecorderInterface {

        /* renamed from: b */
        private Dialog f112425b;

        /* renamed from: a */
        private static JSONObject m97262a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("audio", false);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public final void lackPermission() {
            C47625i.m103103a("lackPermission() called");
            C23569o.m57776a("checkPermission", 1, m97262a());
            Activity activity = (Activity) C44436a.this.f112421a.get();
            if (this.f112425b == null && activity != null) {
                this.f112425b = new C10643a(activity).mo18899b((int) R.string.kb).mo18900b((int) R.string.wf, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Activity activity = (Activity) C44436a.this.f112421a.get();
                        if (activity != null) {
                            activity.finish();
                        }
                    }
                }).mo18886a((int) R.string.ah4, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Activity activity = (Activity) C44436a.this.f112421a.get();
                        if (activity != null) {
                            C39618d.f101145I.mo58605c().mo49441d(activity);
                            activity.finish();
                        }
                    }
                }).mo18897a().mo18882b();
            }
            if (!this.f112425b.isShowing() && activity != null) {
                C23729p.m58256a(this.f112425b);
                this.f112425b.show();
            }
        }

        private C44438a() {
        }

        public final int closeWavFile(boolean z) {
            C47625i.m103103a("closeWavFile() called");
            return 0;
        }

        public final void recordStatus(boolean z) {
            if (!z && C44436a.this.f112422b == -1) {
                C44436a.this.f112422b = System.currentTimeMillis();
            }
        }

        public final int addPCMData(byte[] bArr, int i) {
            if (C44436a.this.f112422b == -1) {
                C44436a.this.f112422b = System.currentTimeMillis();
            }
            return 0;
        }

        public final int initWavFile(int i, int i2, double d) {
            C44436a.this.f112422b = -1;
            StringBuilder sb = new StringBuilder("initWavFile() called with: sampleRate = [");
            sb.append(i);
            sb.append("], channels = [");
            sb.append(i2);
            sb.append("], speed = [");
            sb.append(d);
            sb.append("]");
            C47625i.m103103a(sb.toString());
            return 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a$b */
    public interface C44441b {
    }

    /* renamed from: a */
    public final AudioRecorderInterface mo90324a() {
        return new C44438a();
    }

    public C44436a(Activity activity, C44441b bVar) {
        this.f112421a = new WeakReference<>(activity);
        this.f112423c = bVar;
    }
}
