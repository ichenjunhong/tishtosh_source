package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.AudioContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33414f.C33416a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35208au;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.a */
public final class C33374a extends C33411d {

    /* renamed from: d */
    private static C35208au<C33374a> f86543d = new C35208au<C33374a>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo70757a() {
            return new C33374a();
        }
    };

    /* renamed from: a */
    protected Thread f86544a = new C33391aa("download_thread", this.f86545b, this.f86546c);

    /* renamed from: b */
    private Queue<C33392ab> f86545b = new LinkedBlockingQueue();

    /* renamed from: c */
    private Map<String, C33392ab> f86546c = new HashMap();

    /* renamed from: a */
    public static C33374a m76531a() {
        return (C33374a) f86543d.mo73326b();
    }

    /* renamed from: b */
    public final boolean mo70755b() {
        File c = m76533c();
        if (!c.exists()) {
            return false;
        }
        C48016e.m103942b(c);
        return true;
    }

    public C33374a() {
        this.f86544a.start();
    }

    /* renamed from: c */
    public static File m76533c() {
        StringBuilder sb = new StringBuilder(C48016e.m103941b(C11010c.m22280a()).toString());
        sb.append("/");
        sb.append(C35265e.m79730b());
        sb.append("/im/audio/download/");
        return new File(sb.toString());
    }

    /* renamed from: d */
    public final void mo70756d() {
        super.mo70756d();
        if (this.f86546c != null) {
            for (Entry value : this.f86546c.entrySet()) {
                C33413e eVar = (C33413e) value.getValue();
                if (eVar != null) {
                    eVar.mo70819a((C33416a) null);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo70754a(C11207p pVar) {
        BaseContent content = C33888y.content(pVar);
        if (content == null) {
            return false;
        }
        C33413e a = m76532a(pVar, content);
        if (a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.mo70818a());
            sb.append("/");
            sb.append(a.mo70824c("download"));
            File file = new File(sb.toString());
            if (file.exists()) {
                file.delete();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private C33413e m76532a(C11207p pVar, BaseContent baseContent) {
        if (baseContent instanceof AudioContent) {
            return new C33426o(this.f86621f, this.f86620e, (AudioContent) baseContent, pVar);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo70753a(String str, C11207p pVar, C33416a aVar) {
        if (pVar != null) {
            BaseContent content = C33888y.content(pVar);
            if (content != null) {
                if (content instanceof AudioContent) {
                    UrlModel url = ((AudioContent) content).getUrl();
                    if (url == null || url.getUrlList() == null || url.getUrlList().isEmpty()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("tag", "AudioMsgDownloadProcessor");
                        StringBuilder sb = new StringBuilder(" audioContent url parse is null , message id is ");
                        sb.append(pVar.getMsgId());
                        sb.append(", conversation id : ");
                        sb.append(pVar.getConversationId());
                        sb.append(" , ");
                        sb.append(pVar.getContent());
                        String sb2 = sb.toString();
                        hashMap.put("error", sb2);
                        C35265e.m79731b("audio_message_download_error", hashMap);
                        StringBuilder sb3 = new StringBuilder("log_message_audio_error");
                        sb3.append(sb2);
                        C32458a.m75144a(sb3.toString());
                        return;
                    }
                }
                C33413e a = m76532a(pVar, content);
                if (a != null) {
                    a.mo70819a(aVar);
                    this.f86545b.offer(a);
                    synchronized (this.f86545b) {
                        this.f86545b.notify();
                    }
                }
            }
        }
    }
}
