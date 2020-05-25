package com.p683ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.p1382aq.C23208an;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46055e;
import com.p683ss.android.ugc.aweme.tools.draft.p2356b.C46973a;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.p2425e.C48557d;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.e */
final /* synthetic */ class C46992e implements OnClickListener {

    /* renamed from: a */
    private final C46984d f118699a;

    /* renamed from: b */
    private final C29059c f118700b;

    C46992e(C46984d dVar, C29059c cVar) {
        this.f118699a = dVar;
        this.f118700b = cVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C46984d dVar = this.f118699a;
        C29059c cVar = this.f118700b;
        if (C43214dh.m94817a().mo87852a(view.getContext()) && C39630m.m88234a().mo58604b().mo80709a(cVar.f76147e, dVar.f118688b, true)) {
            C42482c clone = cVar.f76147e.clone();
            if (clone != null) {
                clone.setMusicPriority(99);
                C43214dh.m94817a().mo50200a(clone);
                String path = clone.getPath();
                Context context = dVar.itemView.getContext();
                int i = cVar.f76154l;
                StringBuilder sb = new StringBuilder("toVideoRecord() called with: path = [");
                sb.append(path);
                sb.append("], context = [], musicModel = [");
                sb.append(clone);
                sb.append("], start = [");
                sb.append(i);
                sb.append("]");
                C47625i.m103103a(sb.toString());
                try {
                    new JSONObject().put("route", "1");
                } catch (JSONException unused) {
                }
                C23208an.m56934a("draft_page");
                if (!clone.getPath().startsWith(WebKitApi.SCHEME_HTTP)) {
                    C46984d.m102036a(context, null, clone.getMusicId(), clone.getPath(), i);
                    return;
                }
                C48557d.m105031a().mo96061a(clone.getPath());
                C469851 r0 = new C46986a(C46973a.m102022a(context, C46996f.f118706a), clone, context, i) {

                    /* renamed from: a */
                    final /* synthetic */ C42482c f118691a;

                    /* renamed from: b */
                    final /* synthetic */ Context f118692b;

                    /* renamed from: c */
                    final /* synthetic */ int f118693c;

                    /* renamed from: a */
                    public final void mo80712a(String str, MusicWaveBean musicWaveBean) {
                        super.mo80712a(str, musicWaveBean);
                        C46055e.m100053a(this.f118691a.getMusicId(), str);
                        C46984d.m102036a(this.f118692b, C39630m.m88234a().mo58604b().mo80568a((Serializable) musicWaveBean), this.f118691a.getMusicId(), str, this.f118693c);
                    }

                    {
                        this.f118691a = r3;
                        this.f118692b = r4;
                        this.f118693c = r5;
                    }
                };
                if (context == null || clone.getMusicStatus() != 0) {
                    C39618d.f101168i.mo80707a(context, clone, 5, true, r0);
                } else {
                    String offlineDesc = clone.getOfflineDesc();
                    if (TextUtils.isEmpty(offlineDesc)) {
                        offlineDesc = context.getApplicationContext().getString(R.string.ce4);
                    }
                    C9432q.m18676a(context, offlineDesc);
                }
            }
        }
    }
}
