package com.bytedance.p702im.core.internal.p710a.p712b;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.utils.C11501n;
import com.bytedance.p702im.core.internal.utils.C11501n.C11502a;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p706c.p707a.C11179a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.b.b */
public class C11270b implements C11502a {

    /* renamed from: b */
    private static C11270b f30355b;

    /* renamed from: a */
    public C11501n f30356a;

    /* renamed from: com.bytedance.im.core.internal.a.b.b$a */
    public class C11272a {

        /* renamed from: a */
        public List<C11179a> f30357a;

        /* renamed from: b */
        List<String> f30358b;

        /* renamed from: c */
        String f30359c;

        /* renamed from: d */
        int f30360d;

        private C11272a() {
        }
    }

    /* renamed from: b */
    public static boolean m22892b() {
        C11165c.m22588a();
        return false;
    }

    /* renamed from: c */
    public static boolean m22893c() {
        C11165c.m22588a();
        return false;
    }

    /* renamed from: a */
    public static C11270b m22889a() {
        if (f30355b == null) {
            synchronized (C11270b.class) {
                f30355b = new C11270b();
            }
        }
        return f30355b;
    }

    public C11270b() {
        Looper looper = C11165c.m22588a().mo20513b().f30134I;
        if (looper != null) {
            this.f30356a = new C11501n(looper, this);
            return;
        }
        HandlerThread handlerThread = new HandlerThread("FTS-MANGER-QUEUE");
        handlerThread.start();
        this.f30356a = new C11501n(handlerThread.getLooper(), this);
    }

    /* renamed from: a */
    public static List<C11179a> m22890a(Object obj) {
        C11165c.m22588a();
        return null;
    }

    /* renamed from: a */
    public final void mo20961a(Message message) {
        if (message.obj instanceof C11272a) {
            C11272a aVar = (C11272a) message.obj;
            switch (message.what) {
                case BaseNotice.HASHTAG /*101*/:
                    C11273c.m22900a().mo20966a(aVar.f30357a);
                    return;
                case 102:
                    C11273c a = C11273c.m22900a();
                    List<C11179a> list = aVar.f30357a;
                    if (list != null && !list.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        for (C11179a aVar2 : list) {
                            if (aVar2 != null && !TextUtils.isEmpty(aVar2.mo20560a())) {
                                sb.append(",\"");
                                sb.append(aVar2.mo20560a());
                                sb.append('\"');
                            }
                        }
                        String sb2 = sb.toString();
                        if (sb2.length() > 0) {
                            StringBuilder sb3 = new StringBuilder("(");
                            sb3.append(sb2.substring(1));
                            sb3.append(")");
                            String sb4 = sb3.toString();
                            C11266d.m22878a();
                            StringBuilder sb5 = new StringBuilder("delete from fts_entity where ");
                            sb5.append(C11269a.COLUMN_ID.key);
                            sb5.append(" in ");
                            sb5.append(sb4);
                            if (C11266d.m22883c(sb5.toString())) {
                                a.mo20966a(list);
                            }
                        }
                    }
                    return;
                case 103:
                    C11273c.m22900a();
                    C11273c.m22905b(aVar.f30357a);
                    return;
                case 104:
                    C11273c.m22900a();
                    C11273c.m22903a(aVar.f30358b, aVar.f30359c);
                    return;
                case 105:
                    C11273c.m22900a();
                    C11273c.m22904a(aVar.f30358b, aVar.f30359c, aVar.f30360d);
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo20962a(String str, String str2) {
        if (m22893c() && !TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            mo20964a((List<String>) arrayList, str2);
        }
    }

    /* renamed from: a */
    public final void mo20964a(List<String> list, String str) {
        if (m22893c() && list != null && !list.isEmpty()) {
            C11272a aVar = new C11272a();
            aVar.f30358b = list;
            aVar.f30359c = str;
            Message message = new Message();
            message.what = 104;
            message.obj = aVar;
            this.f30356a.sendMessage(message);
        }
    }

    /* renamed from: a */
    public final void mo20965a(boolean z, Object obj) {
        if (m22893c() && obj != null) {
            C11272a aVar = new C11272a();
            aVar.f30357a = m22890a(obj);
            if (aVar.f30357a != null && !aVar.f30357a.isEmpty()) {
                Message message = new Message();
                if (z) {
                    message.what = BaseNotice.HASHTAG;
                } else {
                    message.what = 102;
                }
                message.obj = aVar;
                this.f30356a.sendMessage(message);
            }
        }
    }

    /* renamed from: a */
    private void m22891a(List<String> list, String str, int i) {
        if (m22893c() && !list.isEmpty()) {
            C11272a aVar = new C11272a();
            aVar.f30358b = list;
            aVar.f30359c = str;
            aVar.f30360d = i;
            Message message = new Message();
            message.what = 105;
            message.obj = aVar;
            this.f30356a.sendMessage(message);
        }
    }

    /* renamed from: a */
    public final void mo20963a(String str, String str2, int i) {
        if (m22893c() && !TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            m22891a((List<String>) arrayList, str2, i);
        }
    }
}
