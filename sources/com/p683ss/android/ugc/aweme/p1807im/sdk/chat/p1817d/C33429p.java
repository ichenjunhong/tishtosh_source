package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11178a;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.AudioContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35275m;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.squareup.okhttp.OkHttpClient;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.p */
public final class C33429p extends C33425n {

    /* renamed from: b */
    public static int f86654b;

    /* renamed from: c */
    public AudioContent f86655c;

    /* renamed from: d */
    public C11207p f86656d;

    /* renamed from: e */
    public String f86657e;

    /* renamed from: h */
    private C9381g f86658h;

    /* renamed from: b */
    private static String m76630b(Throwable th) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(th.toString());
        sb.append("\n");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length > 5) {
            i = 6;
        } else {
            i = stackTrace.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(stackTrace[i2]);
            sb3.append("\n");
            sb2.append(sb3.toString());
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public final void mo70784a(String str) {
        this.f86656d.setMsgStatus(3);
        f86654b++;
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "MessageAudioUploadItem");
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("onFailed : ");
            sb.append(str);
            hashMap.put("error", sb.toString());
        }
        C35265e.m79726a("audio_message_send", hashMap);
        C35265e.m79731b("message_upload_audio_error", hashMap);
        C35190af.m79442a().mo73319a(this.f86656d);
        this.f86658h.post(new Runnable() {
            public final void run() {
                C35197am.m79561b(C33429p.this.f86656d);
            }
        });
        super.mo70784a(str);
        mo70776b();
    }

    /* renamed from: a */
    public final void mo70785a(Throwable th) {
        this.f86656d.setMsgStatus(3);
        f86654b++;
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "MessageAudioUploadItem");
        if (th != null) {
            StringBuilder sb = new StringBuilder("onError : ");
            sb.append(m76630b(th));
            hashMap.put("error", sb.toString());
        }
        C35265e.m79726a("audio_message_send", hashMap);
        C35265e.m79731b("message_upload_audio_error", hashMap);
        C35190af.m79442a().mo73319a(this.f86656d);
        this.f86658h.post(new Runnable() {
            public final void run() {
                C35197am.m79561b(C33429p.this.f86656d);
            }
        });
        super.mo70785a(th);
        mo70776b();
    }

    /* renamed from: a */
    public final void mo70831a(final String str, final UrlModel urlModel) {
        super.mo70831a(str, urlModel);
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "MessageAudioUploadItem");
        hashMap.put("message", str);
        C35265e.m79726a("audio_message_send", hashMap);
        this.f86658h.post(new Runnable() {
            public final void run() {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append(C33429p.this.f86657e);
                sb.append("/");
                sb.append(C33429p.this.f86655c.getMd5());
                sb.append(".m4a");
                String sb2 = sb.toString();
                List attachments = C33429p.this.f86656d.getAttachments();
                if (attachments != null) {
                    C11178a aVar = (C11178a) attachments.get(0);
                    if (!sb2.equals(aVar.getLocalPath())) {
                        File file = new File(C33429p.this.f86657e);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        C35275m.m79757a(str, sb2);
                        File file2 = new File(str);
                        if (file2.exists()) {
                            file2.delete();
                        }
                        aVar.setLocalPath(sb2);
                    }
                }
                C33429p.this.f86655c.setUrl(urlModel);
                HashMap hashMap = new HashMap();
                hashMap.put("tag", "MessageAudioUploadItem");
                if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
                    StringBuilder sb3 = new StringBuilder(" audio upload success, url is null ");
                    if (C33429p.this.f86656d != null) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(C33429p.this.f86656d.getMsgId());
                        sb4.append(", ");
                        sb4.append(C33429p.this.f86656d.getConversationId());
                        str = sb4.toString();
                    } else {
                        str = "";
                    }
                    sb3.append(str);
                    String sb5 = sb3.toString();
                    hashMap.put("error", sb5);
                    StringBuilder sb6 = new StringBuilder("log_message_audio_error");
                    sb6.append(sb5);
                    C32458a.m75144a(sb6.toString());
                    C35265e.m79726a("audio_message_send", hashMap);
                    C35265e.m79731b("message_upload_audio_error", hashMap);
                }
                C33429p.this.f86656d.setContent(C35277o.m79761a(C33429p.this.f86655c));
                C33429p.this.f86656d.setMsgStatus(1);
                C35197am.m79563c(C33429p.this.f86656d);
            }
        });
        mo70776b();
    }

    public C33429p(OkHttpClient okHttpClient, C9381g gVar, AudioContent audioContent, C11207p pVar) {
        String str;
        super(okHttpClient);
        this.f86658h = gVar;
        this.f86655c = audioContent;
        this.f86656d = pVar;
        this.f86585f = m76551a(pVar);
        List attachments = this.f86656d.getAttachments();
        if (attachments == null || attachments.size() <= 0) {
            str = null;
        } else {
            str = ((C11178a) attachments.get(0)).getLocalPath();
        }
        this.f86644a = str;
        StringBuilder sb = new StringBuilder(C48016e.m103941b(C11010c.m22280a()).toString());
        sb.append("/");
        sb.append(C35265e.m79730b());
        sb.append("/im/audio/download/");
        sb.append(this.f86656d.getConversationShortId());
        this.f86657e = sb.toString();
    }
}
