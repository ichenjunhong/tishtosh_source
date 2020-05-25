package com.p683ss.android.ugc.aweme.tools.draft;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.view.C1056u;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26838e;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39633p.C39634a;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordPermissionActivity;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.ss.android.ugc.trill.R;
import java.util.UUID;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.d */
public final class C46984d extends C26838e<C29059c> {

    /* renamed from: a */
    public boolean f118687a;

    /* renamed from: b */
    public Context f118688b;

    /* renamed from: c */
    private TextView f118689c;

    /* renamed from: d */
    private TextView f118690d;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.d$a */
    abstract class C46986a implements C39634a {

        /* renamed from: e */
        ProgressDialog f118695e;

        /* renamed from: a */
        public final void mo80710a(int i) {
            this.f118695e.setProgress(i);
        }

        C46986a(ProgressDialog progressDialog) {
            this.f118695e = progressDialog;
        }

        /* renamed from: a */
        public void mo80712a(String str, MusicWaveBean musicWaveBean) {
            C46984d.this.dismiss(this.f118695e);
        }

        /* renamed from: a */
        public final void mo80711a(Integer num, String str) {
            C9432q.m18676a(this.f118695e.getContext(), C46984d.this.f118688b.getString(R.string.at2));
            C46984d.this.dismiss(this.f118695e);
        }
    }

    /* renamed from: c */
    public final void mo50308c() {
    }

    public final void dismiss(ProgressDialog progressDialog) {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    C46984d(View view) {
        super(view);
        this.f118689c = (TextView) C1056u.m3051d(view, R.id.dcg);
        this.f118690d = (TextView) C1056u.m3051d(view, R.id.d6l);
        this.f118688b = view.getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54774a(C29059c cVar, int i) {
        if (cVar != null && cVar.f76147e != null) {
            this.f70665k = cVar;
            if (this.f118687a) {
                this.f118690d.setVisibility(4);
            } else {
                this.f118690d.setVisibility(0);
            }
            this.f118689c.setText(cVar.f76147e.getName());
            this.f118690d.setOnClickListener(new C46992e(this, cVar));
        }
    }

    /* renamed from: a */
    public static void m102036a(Context context, C43203d dVar, String str, String str2, int i) {
        String uuid = UUID.randomUUID().toString();
        C26890h.m65011a("shoot", C23089d.m56640a().mo47829a("creation_id", uuid).mo47829a("shoot_way", "draft_again").mo47829a("music_id", str).f61491a);
        StringBuilder sb = new StringBuilder("toVideoActivity() called with: context = [ ], path = [");
        sb.append(str2);
        sb.append("], musicStart = [");
        sb.append(i);
        sb.append("]");
        C47625i.m103103a(sb.toString());
        Intent intent = new Intent();
        intent.putExtra(LeakCanaryFileProvider.f132050j, str2);
        intent.putExtra("music_start", i);
        intent.putExtra("record_from", 1);
        intent.putExtra("translation_type", 3);
        intent.putExtra("shoot_way", "draft_again");
        intent.putExtra("creation_id", uuid);
        if (dVar != null) {
            intent.putExtra("music_wave_data", dVar);
        }
        C43214dh.m94817a().mo87857g();
        C43214dh.m94817a().mo87853c();
        C43214dh.m94817a().mo87854d();
        intent.setClass(context, VideoRecordPermissionActivity.class);
        context.startActivity(intent);
    }
}
