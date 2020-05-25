package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseExtra;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseExtra.MessageContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseExtra.StatusMessage;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.IMSendMsgErrorFeedback;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.service.C35445g;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.r */
public final class C35281r implements C35445g {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f90614a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35281r.class), "traceStack", "getTraceStack()Ljava/util/LinkedList;"))};

    /* renamed from: b */
    public static final C35281r f90615b = new C35281r();

    /* renamed from: c */
    private static final C52668f f90616c = C52732g.m112285a(C35282a.f90617a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.r$a */
    static final class C35282a extends C52712l implements C52670a<LinkedList<String>> {

        /* renamed from: a */
        public static final C35282a f90617a = new C35282a();

        C35282a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LinkedList();
        }
    }

    private C35281r() {
    }

    /* renamed from: a */
    private final LinkedList<String> m79770a() {
        return (LinkedList) f90616c.getValue();
    }

    /* renamed from: a */
    public final void mo73371a(String str) {
        C52711k.m112240b(str, "event");
        m79774d(str);
    }

    /* renamed from: b */
    public final void mo73373b(String str) {
        C52711k.m112240b(str, "status");
        StringBuilder sb = new StringBuilder("ws status changed: ");
        sb.append(str);
        m79774d(sb.toString());
    }

    /* renamed from: e */
    private static BaseExtra m79775e(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return (BaseExtra) C35277o.m79760a(str, BaseExtra.class);
        } catch (Throwable th) {
            C32458a.m75148a(th);
            return null;
        }
    }

    /* renamed from: c */
    public final void mo73374c(String str) {
        C52711k.m112240b(str, "event");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": last=");
        C35284t a = C35284t.m79782a();
        C52711k.m112236a((Object) a, "IMSPUtils.get()");
        sb.append(a.mo73430j());
        sb.append(", cur=");
        sb.append(C35265e.m79730b());
        m79774d(sb.toString());
    }

    /* renamed from: a */
    private void m79771a(int i) {
        boolean z;
        C35281r rVar;
        List<String> e;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            rVar = this;
        } else {
            rVar = null;
        }
        C35281r rVar2 = rVar;
        if (rVar2 != null) {
            synchronized (rVar2) {
                e = C52575l.m112139e((Collection<? extends T>) f90615b.m79770a());
            }
            StringBuilder sb = new StringBuilder();
            for (String append : e) {
                sb.append(append);
                sb.append("\n");
                if (sb.length() > 800) {
                    C32458a.m75144a(sb.toString());
                    sb = new StringBuilder();
                }
            }
            C32458a.m75144a(sb.toString());
        }
    }

    /* renamed from: d */
    private final void m79774d(String str) {
        synchronized (this) {
            if (f90615b.m79770a().size() >= 100) {
                f90615b.m79770a().remove(0);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            sb.append(":  ");
            sb.append(str);
            String sb2 = sb.toString();
            LinkedList a = f90615b.m79770a();
            StringBuilder sb3 = new StringBuilder("IMErrorMonitor ");
            sb3.append(sb2);
            a.add(sb3.toString());
        }
    }

    /* renamed from: a */
    private static void m79773a(String str, String str2) {
        StringBuilder sb = new StringBuilder("IMErrorMonitor feedbackAwemeIm ");
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        C32458a.m75144a(sb.toString());
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        C35460j f = a.mo71949f();
        if (f != null) {
            f.feedbackIm(str, str2);
        }
    }

    /* renamed from: a */
    public static final void m79772a(C11207p pVar, C11202k kVar) {
        String str;
        if (pVar != null) {
            StringBuilder sb = new StringBuilder("Message{");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(pVar.getConversationId());
            sb2.append(", ");
            sb2.append(pVar.getConversationShortId());
            sb2.append(", ");
            sb2.append(pVar.getMsgId());
            sb2.append(", ");
            sb2.append(pVar.getMsgType());
            sb.append(sb2.toString());
            sb.append('}');
            String sb3 = sb.toString();
            boolean z = true;
            int i = 0;
            if (kVar == null) {
                C35281r rVar = f90615b;
                BaseExtra e = m79775e(pVar.getLocalExtValue("s:send_response_check_msg"));
                if (e != null) {
                    int statusCode = e.getStatusCode();
                    if (!(statusCode == 7178 || statusCode == 7181 || statusCode == 7284 || statusCode == 7523 || statusCode == 7530)) {
                        switch (statusCode) {
                            case 7274:
                            case 7275:
                                break;
                        }
                    }
                    IMSendMsgErrorFeedback iMSendMsgErrorFeedback = new IMSendMsgErrorFeedback();
                    iMSendMsgErrorFeedback.setMsgType(pVar.getMsgType());
                    iMSendMsgErrorFeedback.setErrorCode(e.getStatusCode());
                    StatusMessage statusMsg = e.getStatusMsg();
                    C52711k.m112236a((Object) statusMsg, "checkExtra.statusMsg");
                    MessageContent msgContent = statusMsg.getMsgContent();
                    C52711k.m112236a((Object) msgContent, "checkExtra.statusMsg.msgContent");
                    iMSendMsgErrorFeedback.setErrorDesc(msgContent.getTips());
                    CharSequence errorDesc = iMSendMsgErrorFeedback.getErrorDesc();
                    if (!(errorDesc == null || errorDesc.length() == 0)) {
                        z = false;
                    }
                    if (z) {
                        iMSendMsgErrorFeedback.setErrorDesc("消息自见");
                    }
                    iMSendMsgErrorFeedback.setLogId(pVar.getLocalExtValue("s:log_id"));
                    m79773a("message_self_visiable", iMSendMsgErrorFeedback.toJsonString());
                    i = e.getStatusCode();
                }
                StringBuilder sb4 = new StringBuilder("IMErrorMonitor ");
                sb4.append(sb3);
                sb4.append(" send success: ");
                sb4.append(i);
                C32458a.m75144a(sb4.toString());
                return;
            }
            StringBuilder sb5 = new StringBuilder("IMErrorMonitor ");
            sb5.append(sb3);
            sb5.append(" send failed: ");
            StringBuilder sb6 = new StringBuilder("IMError{");
            sb6.append(kVar.f30203a);
            sb6.append(", {");
            sb6.append(kVar.f30204b);
            sb6.append(", ");
            sb6.append(kVar.f30205c);
            sb6.append("}, {");
            sb6.append(kVar.f30206d);
            sb6.append(", ");
            sb6.append(kVar.f30207e);
            sb6.append("}, ");
            sb6.append(kVar.f30208f);
            sb6.append('}');
            sb5.append(sb6.toString());
            C32458a.m75144a(sb5.toString());
            int i2 = kVar.f30203a;
            String str2 = kVar.f30205c;
            if (i2 == 0) {
                CharSequence charSequence = kVar.f30207e;
                if (!(charSequence == null || charSequence.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    BaseExtra e2 = m79775e(kVar.f30207e);
                    if (e2 != null) {
                        i = e2.getStatusCode();
                    }
                    if (e2 != null) {
                        StatusMessage statusMsg2 = e2.getStatusMsg();
                        if (statusMsg2 != null) {
                            MessageContent msgContent2 = statusMsg2.getMsgContent();
                            if (msgContent2 != null) {
                                str = msgContent2.getTips();
                                str2 = str;
                                i2 = i;
                            }
                        }
                    }
                    str = null;
                    str2 = str;
                    i2 = i;
                }
            }
            if (i2 == 0 && kVar.f30206d != 0) {
                i2 = (int) kVar.f30206d;
                str2 = "IM Business server error";
            }
            if (i2 != 0) {
                if (i2 == 2) {
                    f90615b.m79771a(i2);
                }
                if (i2 == -1000) {
                    StringBuilder sb7 = new StringBuilder("Network State: ");
                    sb7.append(C35283s.m79780a(C11010c.m22280a()));
                    str2 = sb7.toString();
                }
                IMSendMsgErrorFeedback iMSendMsgErrorFeedback2 = new IMSendMsgErrorFeedback();
                iMSendMsgErrorFeedback2.setMsgType(pVar.getMsgType());
                iMSendMsgErrorFeedback2.setErrorCode(i2);
                iMSendMsgErrorFeedback2.setErrorDesc(str2);
                iMSendMsgErrorFeedback2.setLogId(kVar.f30208f);
                m79773a("message_send_fail", iMSendMsgErrorFeedback2.toJsonString());
            }
        }
    }

    /* renamed from: a */
    public final void mo73372a(String str, String str2, int i, int i2) {
        StringBuilder sb = new StringBuilder("fetch token: reason=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", local=");
        sb.append(str);
        sb.append(", token=");
        sb.append(str2);
        m79774d(sb.toString());
    }
}
