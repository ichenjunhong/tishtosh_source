package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11178a;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.AudioContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.squareup.okhttp.OkHttpClient;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.o */
public final class C33426o extends C33413e {

    /* renamed from: d */
    public AudioContent f86647d;

    /* renamed from: e */
    public C11207p f86648e;

    /* renamed from: h */
    private C9381g f86649h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo70818a() {
        if (TextUtils.isEmpty(this.f86625b)) {
            StringBuilder sb = new StringBuilder(C48016e.m103941b(C11010c.m22280a()).toString());
            sb.append("/");
            sb.append(C35265e.m79730b());
            sb.append("/im/audio/download/");
            sb.append(this.f86648e.getConversationShortId());
            this.f86625b = sb.toString();
        }
        return this.f86625b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo70824c(String str) {
        if (this.f86647d != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f86647d.getMd5());
            sb.append(".m4a");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".m4a");
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo70823b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(this.f86647d.getMd5());
        sb.append(".m4a");
        String sb2 = sb.toString();
        if (!this.f86648e.isSelf()) {
            return sb2;
        }
        List attachments = this.f86648e.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            C11178a aVar = (C11178a) attachments.get(0);
            if (this.f86648e.getMsgStatus() == 3) {
                return aVar.getLocalPath();
            }
        }
        return sb2;
    }

    /* renamed from: a */
    public final void mo70821a(Throwable th) {
        String str;
        super.mo70821a(th);
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "MessageAudioDownloadItem");
        if (th != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f86625b);
            sb.append(mo70824c("download"));
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(th.toString());
            sb3.append(", message id is ");
            if (this.f86648e != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f86648e.getMsgId());
                sb4.append(" ; ");
                sb4.append(this.f86648e.getConversationId());
                str = sb4.toString();
            } else {
                str = "";
            }
            sb3.append(str);
            sb3.append(" , ");
            sb3.append(sb2);
            String sb5 = sb3.toString();
            hashMap.put("error", sb5);
            StringBuilder sb6 = new StringBuilder("log_message_audio_error");
            sb6.append(sb5);
            C32458a.m75144a(sb6.toString());
        }
        C35265e.m79726a("audio_message_download", hashMap);
        C35265e.m79731b("audio_message_download_error", hashMap);
        if (!this.f86648e.isSelf()) {
            this.f86648e.setMsgStatus(3);
        }
        this.f86649h.post(new Runnable() {
            public final void run() {
                C35197am.m79561b(C33426o.this.f86648e);
            }
        });
        mo70776b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo70822a(String str) {
        File file;
        if (this.f86648e.getMsgStatus() == 2) {
            file = new File(this.f86625b, mo70824c(str));
        } else {
            file = new File(str);
        }
        if (file.exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo70820a(final String str, final UrlModel urlModel) {
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "MessageAudioDownloadItem");
        hashMap.put("message", str);
        C35265e.m79726a("audio_message_download", hashMap);
        this.f86648e.setContent(C35277o.m79761a(this.f86647d));
        this.f86649h.post(new Runnable() {
            public final void run() {
                if (!C33426o.this.f86648e.isSelf()) {
                    C33426o.this.f86648e.setMsgStatus(2);
                }
                C35197am.m79561b(C33426o.this.f86648e);
                if (C33426o.this.f86626c != null) {
                    C33426o.this.f86626c.mo70820a(str, urlModel);
                }
            }
        });
        mo70776b();
    }

    public C33426o(OkHttpClient okHttpClient, C9381g gVar, AudioContent audioContent, C11207p pVar) {
        String str;
        super(okHttpClient);
        this.f86649h = gVar;
        this.f86647d = audioContent;
        this.f86648e = pVar;
        this.f86624a = audioContent.getUrl();
        C11207p pVar2 = this.f86648e;
        if (pVar2 == null) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder("DownloadItem");
            sb.append(pVar2.getIndex());
            sb.append("_");
            sb.append(pVar2.getUuid());
            str = sb.toString();
        }
        this.f86585f = str;
    }
}
