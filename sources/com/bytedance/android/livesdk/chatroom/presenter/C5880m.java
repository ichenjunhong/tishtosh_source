package com.bytedance.android.livesdk.chatroom.presenter;

import android.content.Context;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.C4962a;
import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.model.C5727ap;
import com.bytedance.android.livesdk.chatroom.model.DecorationTextAuditResult;
import com.bytedance.android.livesdk.chatroom.p306bl.C5028t;
import com.bytedance.android.livesdk.chatroom.p306bl.C5029u;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.message.model.C7861cb;
import com.bytedance.android.livesdk.message.model.C8014x;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4605o;
import com.bytedance.android.livesdkapi.depend.model.live.C8721u;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.google.gson.p1077b.C17956a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.m */
public class C5880m extends C5868cl<C5883a> implements C9382a, OnMessageListener {

    /* renamed from: d */
    private static final String f15392d = "m";

    /* renamed from: a */
    public long f15393a;

    /* renamed from: b */
    public boolean f15394b;

    /* renamed from: c */
    C4962a f15395c;

    /* renamed from: e */
    private C9381g f15396e = new C9381g(this);

    /* renamed from: f */
    private boolean f15397f;

    /* renamed from: g */
    private long f15398g;

    /* renamed from: h */
    private String f15399h;

    /* renamed from: i */
    private String f15400i;

    /* renamed from: j */
    private int f15401j = ((Integer) C6718b.f18316M.mo9431a()).intValue();

    /* renamed from: k */
    private int f15402k;

    /* renamed from: l */
    private boolean f15403l = true;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.m$a */
    public interface C5883a extends C6463ay {
        /* renamed from: a */
        void mo11767a();

        /* renamed from: a */
        void mo11768a(C5727ap apVar);

        /* renamed from: a */
        void mo11769a(String str);

        /* renamed from: a */
        void mo11770a(List<C8721u> list);

        /* renamed from: b */
        void mo11771b(String str);

        /* renamed from: b */
        void mo11772b(List<C8721u> list);

        /* renamed from: c */
        void mo11773c();

        /* renamed from: d */
        int[] mo11774d();
    }

    /* renamed from: b */
    public final boolean mo11766b() {
        if (this.f15402k < this.f15401j) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private List<C8721u> m12805d() {
        long longValue = ((Long) C4525b.f12337aF.mo10345a()).longValue();
        if (longValue != this.f15398g || longValue == 0) {
            C4525b.f12337aF.mo10346a(Long.valueOf(0));
            C4525b.f12338aG.mo10346a("");
            C4525b.f12335aD.mo10346a("");
            C4525b.f12336aE.mo10346a(Integer.valueOf(31));
            return null;
        }
        String str = (String) C4525b.f12338aG.mo10345a();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            List<C8721u> list = (List) C4514j.m10883j().mo10320a().mo34885a(str, new C17956a<List<C8721u>>() {
            }.f49843c);
            if (!C9414h.m18630a(list)) {
                int[] d = ((C5883a) mo8518c()).mo11774d();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C8721u uVar = (C8721u) it.next();
                    if (uVar.f23950k != d[0] || uVar.f23951l != d[1]) {
                        it.remove();
                    }
                }
            }
            return list;
        } catch (Exception unused) {
            C4525b.f12338aG.mo10346a("");
            return null;
        }
    }

    /* renamed from: a */
    private static C8721u m12802a(List<C8721u> list) {
        if (list != null && list.size() > 0) {
            for (C8721u uVar : list) {
                if (uVar.f23953n == 1) {
                    return uVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    static String m12803a(int i) {
        Context context = TTLiveSDKContext.getHostService().mo10308a().context();
        if (context == null) {
            return "";
        }
        String string = context.getString(i);
        if (TextUtils.isEmpty(string)) {
            string = "";
        }
        return string;
    }

    public void onMessage(IMessage iMessage) {
        C7859c cVar = (C7859c) iMessage;
        switch (cVar.getMessageType()) {
            case REMIND:
                C7861cb cbVar = (C7861cb) iMessage;
                if (cbVar.f21739b == 1 && mo8518c() != null) {
                    this.f15399h = "";
                    C4525b.f12336aE.mo10346a(Integer.valueOf(31));
                    C4525b.f12335aD.mo10346a("");
                    ((C5883a) mo8518c()).mo11773c();
                    ((C5883a) mo8518c()).mo11769a(cbVar.f21738a);
                    return;
                }
            case MODIFY_DECORATION:
                if (mo8518c() != null) {
                    ((C5883a) mo8518c()).mo11770a(((C8014x) iMessage).mo14170a());
                    break;
                } else {
                    return;
                }
        }
    }

    /* renamed from: a */
    public final String mo11762a(C8721u uVar) {
        if (!TextUtils.isEmpty(this.f15399h)) {
            return this.f15399h;
        }
        if (uVar != null) {
            return uVar.f23943d;
        }
        return "";
    }

    public void handleMsg(Message message) {
        if (message != null && mo8518c() != null) {
            if (26 == message.what) {
                this.f15394b = false;
            }
            if (26 == message.what) {
                if (message.obj instanceof DecorationTextAuditResult) {
                    DecorationTextAuditResult decorationTextAuditResult = (DecorationTextAuditResult) message.obj;
                    if (!(mo8518c() == null || decorationTextAuditResult == null)) {
                        if (31 == decorationTextAuditResult.getAuditStatus()) {
                            this.f15399h = "";
                            C4525b.f12336aE.mo10346a(Integer.valueOf(31));
                            C4525b.f12335aD.mo10346a("");
                            ((C5883a) mo8518c()).mo11773c();
                            String auditNotPassWarnText = decorationTextAuditResult.getAuditNotPassWarnText();
                            if (TextUtils.isEmpty(auditNotPassWarnText)) {
                                auditNotPassWarnText = m12803a((int) R.string.e9_);
                            }
                            ((C5883a) mo8518c()).mo11769a(auditNotPassWarnText);
                            this.f15403l = true;
                        } else {
                            if (this.f15403l) {
                                this.f15402k++;
                                this.f15399h = this.f15400i;
                                ((C5883a) mo8518c()).mo11771b(this.f15399h);
                                ((C5883a) mo8518c()).mo11767a();
                            } else {
                                this.f15403l = true;
                            }
                            C4525b.f12336aE.mo10346a(Integer.valueOf(decorationTextAuditResult.getAuditStatus()));
                            C4525b.f12335aD.mo10346a(this.f15399h);
                        }
                    }
                } else if (message.obj instanceof C2949a) {
                    ((C5883a) mo8518c()).mo11769a(((C2949a) message.obj).getPrompt());
                } else {
                    ((C5883a) mo8518c()).mo11769a(m12803a((int) R.string.e9a));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11763a(C5727ap apVar) {
        if (mo8518c() != null) {
            ((C5883a) mo8518c()).mo11768a(apVar);
            this.f15399h = (String) C4525b.f12335aD.mo10345a();
            List d = m12805d();
            if (apVar != null) {
                C8721u a = m12802a(apVar.f15078a);
                C8721u a2 = m12802a(apVar.f15079b);
                C8721u a3 = m12802a(apVar.f15080c);
                if (!(a == null && a2 == null && a3 == null)) {
                    if (d == null) {
                        d = new ArrayList();
                    }
                    if (a != null && !m12804a(d, a)) {
                        d.add(a);
                    }
                    if (a2 != null && !m12804a(d, a2)) {
                        d.add(a2);
                    }
                    if (a3 != null && !m12804a(d, a3)) {
                        d.add(a3);
                    }
                }
            }
            if (d != null && d.size() > 0) {
                ((C5883a) mo8518c()).mo11772b(d);
            }
            if (!TextUtils.isEmpty(this.f15399h) && ((Integer) C4525b.f12336aE.mo10345a()).intValue() != 33) {
                this.f15403l = false;
                mo11765a(this.f15399h);
            }
        }
    }

    /* renamed from: a */
    public final void mo8520a(C5883a aVar) {
        super.mo8520a(aVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.MODIFY_DECORATION.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.REMIND.getIntType(), this);
        }
        if (this.f15397f) {
            this.f15395c.f13304a = SystemClock.uptimeMillis();
            ((DecorationApi) C4157e.m10322a().mo9550a(DecorationApi.class)).getRoomDecorationList().mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5885o<Object>(this), (C1710e<? super Throwable>) new C5886p<Object>(this));
        }
    }

    /* renamed from: a */
    public final void mo11765a(String str) {
        if (mo11766b() && !TextUtils.isEmpty(str) && !this.f15394b) {
            this.f15400i = str;
            this.f15394b = true;
            C9381g gVar = this.f15396e;
            ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).sendDecorationText(new C4605o().mo10399a("room_id", String.valueOf(this.f15393a)).mo10399a("user_id", String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b())).mo10399a("deco_text", String.valueOf(str)).f12568a).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5028t<Object>(gVar), (C1710e<? super Throwable>) new C5029u<Object>(gVar));
        }
    }

    /* renamed from: a */
    private static boolean m12804a(List<C8721u> list, C8721u uVar) {
        if (!(uVar == null || list == null || list.size() <= 0)) {
            for (C8721u uVar2 : list) {
                if (uVar.f23947h == uVar2.f23947h) {
                    return true;
                }
            }
        }
        return false;
    }

    public C5880m(long j, long j2, boolean z) {
        this.f15393a = j;
        this.f15398g = j2;
        this.f15397f = z;
        this.f15395c = new C4962a();
    }
}
