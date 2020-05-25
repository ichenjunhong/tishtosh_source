package com.p683ss.android.ugc.aweme.tools.draft;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29061d;
import com.p683ss.android.ugc.aweme.p1388at.C23288a;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1451a.C23893a;
import com.p683ss.android.ugc.aweme.port.internal.C39666o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab;
import com.p683ss.android.ugc.aweme.port.p2082in.C39568at;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.port.p2082in.C39633p.C39634a;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43219dm;
import com.p683ss.android.ugc.aweme.shortvideo.C43220dn;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43447bb;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43684d;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45318u;
import com.p683ss.android.ugc.aweme.tools.draft.p2356b.C46973a;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.p2425e.C48557d;
import com.p683ss.android.vesdk.VEUtils;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.u */
public final class C47019u {

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.u$a */
    static class C47022a implements C39634a {

        /* renamed from: f */
        ProgressDialog f118765f;

        /* renamed from: g */
        Context f118766g;

        /* renamed from: a */
        public final void mo80710a(int i) {
            C18842a.m45934b(new C47024w(this, i));
        }

        /* renamed from: a */
        public void mo80712a(String str, MusicWaveBean musicWaveBean) {
            C47019u.dismiss(this.f118765f);
        }

        C47022a(ProgressDialog progressDialog, WeakReference<Context> weakReference) {
            this.f118765f = progressDialog;
            this.f118766g = (Context) weakReference.get();
        }

        /* renamed from: a */
        public final void mo80711a(Integer num, String str) {
            if (this.f118766g != null) {
                C10691a.m21545b(this.f118766g, this.f118766g.getString(R.string.at2)).mo19066a();
            }
            C47019u.dismiss(this.f118765f);
        }
    }

    public static void dismiss(ProgressDialog progressDialog) {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* renamed from: a */
    private static int m102110a(C29059c cVar) {
        if (cVar.f76137O == 2) {
            return 0;
        }
        return C29061d.m68492a(cVar);
    }

    /* renamed from: b */
    private static String m102114b(C29059c cVar) {
        if (cVar == null) {
            return "";
        }
        if (cVar.mo58743T()) {
            return "mv";
        }
        if (cVar.mo58789az() && cVar.mo58788ay().isHighlight()) {
            return "live_highlight";
        }
        if (!cVar.mo58789az() || !cVar.mo58788ay().isRecord()) {
            return "video";
        }
        return "live_record";
    }

    /* renamed from: c */
    private static void m102115c(C29059c cVar) {
        C39666o oVar = (C39666o) C26888e.m65000a(C39629l.m88233b(), C39666o.class);
        if (!TextUtils.isEmpty(oVar.mo48454b()) && oVar.mo48454b().equals(C47017s.m102092a(cVar))) {
            oVar.mo48449a((String) null);
            C39630m.m88234a().mo58613k().mo74310a(false);
        }
    }

    /* renamed from: a */
    private static void m102112a(Context context, C42482c cVar, ProgressDialog progressDialog, C47022a aVar) {
        if (context == null || cVar.getMusicStatus() != 0) {
            C39630m.m88234a().mo58604b().mo80707a(context, cVar, 0, false, aVar);
            return;
        }
        String offlineDesc = cVar.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getApplicationContext().getString(R.string.ce4);
        }
        C10691a.m21545b(context, offlineDesc).mo19066a();
        dismiss(progressDialog);
    }

    /* renamed from: a */
    public static void m102111a(Context context, C29059c cVar, int i, long j) {
        Context context2 = context;
        C29059c cVar2 = cVar;
        if (C43214dh.m94817a().mo87852a(context) && cVar2 != null) {
            int a = m102110a(cVar);
            C23569o.m57776a("aweme_draft_invalid", a, (JSONObject) null);
            C23088c a2 = C23088c.m56631a().mo47824a("validity", String.valueOf(a)).mo47819a("is_fast_import", Boolean.valueOf(cVar.mo58767ad())).mo47824a("videoPath", C29061d.m68497b(cVar));
            if (!cVar.mo58743T()) {
                if (!(a == 0 || a == -2)) {
                    C10691a.m21542b(context, (int) R.string.bsv).mo19066a();
                    C23569o.m57776a("aweme_draft_load_fail_rate", 1, a2.mo47825b());
                    return;
                }
            } else if (cVar.mo58741R() != null) {
                String str = cVar.mo58741R().mvResUnzipPath;
                if (!C48016e.m103944b(str)) {
                    C10691a.m21548c(context, (int) R.string.bsv).mo19066a();
                    return;
                } else if (VEUtils.checkMVResourceIntegrity(str) != 0) {
                    C10691a.m21548c(context, (int) R.string.bsv).mo19066a();
                    return;
                } else {
                    ArrayList<C23288a> arrayList = cVar.mo58741R().maskFileData;
                    if (!C9376b.m18558a((Collection<T>) arrayList)) {
                        for (C23288a aVar : arrayList) {
                            if (!C9376b.m18558a((Collection<T>) aVar.getMaskFiles())) {
                                if (TextUtils.isEmpty(aVar.getPhotonPath())) {
                                }
                            }
                            C10691a.m21548c(context, (int) R.string.bsv).mo19066a();
                            return;
                        }
                    }
                }
            }
            if (cVar.mo58745V()) {
                C43684d.m95972a();
            }
            C23569o.m57776a("aweme_draft_load_fail_rate", 0, a2.mo47825b());
            ProgressDialog a3 = C46973a.m102022a(context, C47023v.f118767a);
            C42482c cVar3 = cVar2.f76147e;
            if (cVar3 == null || cVar.mo58726C() == 1) {
                dismiss(a3);
                m102113a(cVar, a3, context, i, j);
            } else if (TextUtils.isEmpty(cVar3.getMusicId()) || !TextUtils.isEmpty(cVar3.getName())) {
                StringBuilder sb = new StringBuilder("editDraft() musicModel path = [");
                sb.append(C39618d.f101161b.mo34889b(cVar3));
                sb.append("]");
                C47625i.m103103a(sb.toString());
                if (!((cVar2.f76139Q == null && cVar.mo58729F() == null) || cVar2.f76149g == null)) {
                    File file = new File(cVar2.f76149g);
                    if (file.exists() && file.length() > 0) {
                        m102113a(cVar, a3, context, i, j);
                        return;
                    }
                }
                if (cVar3.getPath() == null) {
                    C10691a.m21545b(context, context.getApplicationContext().getString(R.string.ce4)).mo19066a();
                    dismiss(a3);
                    return;
                } else if (cVar3.getPath().startsWith(WebKitApi.SCHEME_HTTP)) {
                    C48557d.m105031a().mo96061a(cVar3.getPath());
                    final C29059c cVar4 = cVar;
                    final ProgressDialog progressDialog = a3;
                    final Context context3 = context;
                    final int i2 = i;
                    final long j2 = j;
                    C470212 r0 = new C47022a(a3, new WeakReference(context)) {
                        /* renamed from: a */
                        public final void mo80712a(String str, MusicWaveBean musicWaveBean) {
                            super.mo80712a(str, musicWaveBean);
                            try {
                                cVar4.f76149g = str;
                            } catch (Exception unused) {
                            }
                            C47019u.m102113a(cVar4, progressDialog, context3, i2, j2);
                        }
                    };
                    m102112a(context, cVar3, a3, (C47022a) r0);
                } else {
                    cVar2.f76149g = cVar3.getPath();
                    m102113a(cVar, a3, context, i, j);
                    return;
                }
            } else {
                C39529ab abVar = C39618d.f101168i;
                String musicId = cVar3.getMusicId();
                final C29059c cVar5 = cVar;
                final ProgressDialog progressDialog2 = a3;
                final Context context4 = context;
                final int i3 = i;
                final long j3 = j;
                C470201 r02 = new C39568at() {
                    /* renamed from: a */
                    public final void mo80658a(Exception exc) {
                        C47019u.m102113a(cVar5, progressDialog2, context4, i3, j3);
                    }

                    /* renamed from: a */
                    public final void mo80657a(C42482c cVar) {
                        if (cVar != null) {
                            cVar5.f76147e = cVar;
                        }
                        C47019u.m102113a(cVar5, progressDialog2, context4, i3, j3);
                    }
                };
                abVar.mo80708a(musicId, r02);
            }
            StringBuilder sb2 = new StringBuilder("editDraft() called with: view = [");
            sb2.append(cVar);
            sb2.append("]");
            C47625i.m103103a(sb2.toString());
        }
    }

    /* renamed from: a */
    public static void m102113a(C29059c cVar, ProgressDialog progressDialog, Context context, int i, long j) {
        String str;
        cVar.mo58791b(new SecureRandom().nextInt(Integer.MAX_VALUE));
        cVar.f76160r = i;
        dismiss(progressDialog);
        m102115c(cVar);
        C42438az a = C42438az.m93209a().mo86526a("creation_id", cVar.mo58817z()).mo86526a("shoot_way", cVar.mo58728E()).mo86523a("draft_id", cVar.mo58724A()).mo86524a("last_save_time", cVar.f76129G).mo86524a("edit_time", System.currentTimeMillis());
        C45318u.m98798b(cVar.mo58817z());
        if (cVar.f76137O == 2) {
            a.mo86526a("content_type", "slideshow").mo86526a("content_source", "upload");
        } else {
            C42438az a2 = a.mo86526a("content_type", m102114b(cVar));
            String str2 = "content_source";
            if (cVar.mo58743T() || cVar.mo58813v() == 1 || cVar.mo58813v() == 0) {
                str = "upload";
            } else {
                str = "shoot";
            }
            a2.mo86526a(str2, str);
        }
        C26890h.m65011a("edit_draft", a.f107329a);
        if (cVar.f76137O != 2) {
            Intent intent = new Intent();
            intent.putExtra("shoot_way", "edit_draft");
            intent.putExtra("translation_type", 3);
            new C43447bb("AwemeDraftViewHolder");
            intent.putExtra("args", C43447bb.m95224a(cVar));
            C47625i.m103103a("GoPublishActivity from draft");
            intent.putExtra("fromDraft", 1);
            intent.putExtra("draft_to_edit_from", i);
            intent.putExtra("edit_publish_session_end_together", true);
            intent.putExtra("draft_to_edit_start_time", j);
            intent.putExtra("draft_modify_time", cVar.f76129G);
            C23893a aVar = new C23893a();
            aVar.mo49499a(cVar);
            intent.putExtra("draft_file_size", aVar.mo49498a());
            C43220dn.m94842a(new C43219dm("edit_draft", cVar.mo58817z(), "fromDraft"));
            C44403a.m97196a().mo48301a(context, intent);
            C43214dh.m94817a().mo50200a(cVar.f76147e);
        } else if (!((Activity) context).isFinishing()) {
            new C47025x(context, cVar).mo94314a();
        }
    }
}
