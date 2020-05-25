package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.live.core.p230g.C3897k;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.api.DoodleGiftApi;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.api.TaskGiftApi;
import com.bytedance.android.livesdk.gift.C7648t;
import com.bytedance.android.livesdk.gift.C7649u;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.domain.api.PropApi;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.model.C7515n;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.panel.p380a.C7525b;
import com.bytedance.android.livesdk.gift.panel.p380a.C7526c;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p388k.C7709b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.p619a.C10175a;
import com.bytedance.ies.p619a.C10176b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.panel.n */
public final class C7547n extends C10176b<C7549a> {

    /* renamed from: a */
    Room f20706a;

    /* renamed from: b */
    boolean f20707b;

    /* renamed from: c */
    private int f20708c;

    /* renamed from: d */
    private long f20709d;

    /* renamed from: e */
    private String f20710e;

    /* renamed from: com.bytedance.android.livesdk.gift.panel.n$a */
    public interface C7549a extends C10175a {
        /* renamed from: a */
        void mo13927a();

        /* renamed from: a */
        void mo13928a(int i, C7525b bVar);

        /* renamed from: a */
        void mo13929a(C7514m mVar);

        /* renamed from: a */
        void mo13930a(C7515n nVar);

        /* renamed from: a */
        void mo13931a(Exception exc);

        /* renamed from: b */
        void mo13932b(C7514m mVar);

        /* renamed from: b */
        void mo13933b(Exception exc);

        /* renamed from: c */
        void mo13934c(Exception exc);

        /* renamed from: d */
        void mo13935d(Exception exc);
    }

    /* renamed from: a */
    private void m15541a(long j) {
        long j2 = j;
        if (!this.f20707b && GiftManager.inst().findGiftById(j2) != null) {
            this.f20707b = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            C2201v a = ((TaskGiftApi) C4157e.m10322a().mo9550a(TaskGiftApi.class)).sendTaskGift(j, 1, this.f20706a.getId()).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
            C7532af afVar = new C7532af(this, j, uptimeMillis);
            a.mo6506a((C1710e<? super T>) afVar, (C1710e<? super Throwable>) new C7552q<Object>(this, j2), (C1706a) new C7553r(this));
        }
    }

    /* renamed from: a */
    private void m15543a(C7525b bVar) {
        if (!this.f20707b) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < bVar.f20670a.size(); i++) {
                C7648t tVar = (C7648t) bVar.f20670a.get(i);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("id", tVar.f21073c);
                    jSONObject2.put("x", tVar.f21071a);
                    jSONObject2.put("y", tVar.f21072b);
                    jSONArray.put(jSONObject2);
                } catch (Exception unused) {
                }
            }
            try {
                jSONObject.put("points", jSONArray);
                jSONObject.put("origin_width", bVar.f20671b);
                jSONObject.put("origin_height", bVar.f20672c);
            } catch (Exception unused2) {
            }
            this.f20707b = true;
            ((DoodleGiftApi) C4157e.m10322a().mo9550a(DoodleGiftApi.class)).sendDoodleGift(998, this.f20706a.getId(), jSONObject.toString(), this.f20709d).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6506a((C1710e<? super T>) new C7554s<Object>(this, bVar, SystemClock.uptimeMillis()), (C1710e<? super Throwable>) new C7555t<Object>(this), (C1706a) new C7556u(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13939a(C7514m mVar) {
        boolean z;
        if (mo8518c() != null && mVar.f20622n != 2) {
            C7505d findGiftById = GiftManager.inst().findGiftById(mVar.f20613e);
            if (findGiftById.f20544e == 10) {
                ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10090a(mVar.f20627s);
            } else {
                ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10091a(mVar.f20611c);
            }
            if (mVar.f20620l > 0) {
                mVar.f20629u = C7649u.m15656a().mo14010a(mVar.f20620l);
                if (mVar.f20629u != null) {
                    mVar.f20613e = mVar.f20629u.gift.f20543d;
                    if (!C9414h.m18630a(mVar.f20623o)) {
                        Iterator it = mVar.f20623o.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((Prop) it.next()).f20511id == mVar.f20620l) {
                                    z = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        Prop newInstance = Prop.newInstance(mVar.f20629u);
                        newInstance.count -= this.f20708c;
                        if (mVar.f20623o == null) {
                            mVar.f20623o = new ArrayList();
                        }
                        mVar.f20623o.add(newInstance);
                    }
                }
            }
            ((C7549a) mo8518c()).mo13929a(mVar);
            if (this.f20706a != null && this.f20706a.isStar()) {
                if (findGiftById != null && findGiftById.f20539H) {
                    C4495a.m10823a().mo10301a((Object) new C7709b(1, "cny_send_gift", new JSONObject()));
                }
                if (!(mVar == null || mVar.f20629u == null || mVar.f20629u.gift == null || !mVar.f20629u.gift.f20539H)) {
                    C4495a.m10823a().mo10301a((Object) new C7709b(1, "cny_send_gift", new JSONObject()));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13940a(C7526c cVar) {
        if (cVar != null) {
            switch (cVar.f20674a) {
                case GIFT:
                    C7505d findGiftById = GiftManager.inst().findGiftById(cVar.f20675b);
                    if (findGiftById == null || findGiftById.f20562w <= 0 || findGiftById.f20544e != 10) {
                        m15542a(cVar.f20675b, cVar.f20676c);
                        return;
                    } else {
                        m15544b(cVar.f20675b, cVar.f20676c);
                        return;
                    }
                case PROP:
                    m15545c(cVar.f20675b, cVar.f20676c);
                    return;
                case TASK_GIFT:
                    m15541a(cVar.f20675b);
                    return;
                case DOODLE_GIFT:
                    m15543a(cVar.f20678e);
                    return;
                case GIFT_AD:
                    m15546d(cVar.f20675b, cVar.f20676c);
                    break;
            }
        }
    }

    /* renamed from: d */
    private void m15546d(long j, int i) {
        long j2 = j;
        if (!this.f20707b && GiftManager.inst().findGiftById(j2) != null) {
            this.f20707b = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            C2201v a = ((GiftRetrofitApi) C4157e.m10322a().mo9550a(GiftRetrofitApi.class)).send(j, this.f20706a.getId(), this.f20709d, i).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
            long j3 = j2;
            C7557v vVar = new C7557v(this, j, uptimeMillis);
            a.mo6506a((C1710e<? super T>) vVar, (C1710e<? super Throwable>) new C7558w<Object>(this, j3), (C1706a) new C7622y(this));
        }
    }

    /* renamed from: a */
    private void m15542a(long j, int i) {
        if (!this.f20707b) {
            C7505d findGiftById = GiftManager.inst().findGiftById(j);
            if (findGiftById != null) {
                if (((IHostContext) C4116c.m10249a(IHostContext.class)).isLocalTest() || ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10093b((long) findGiftById.f20545f)) {
                    this.f20707b = true;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C2201v a = ((GiftRetrofitApi) C4157e.m10322a().mo9550a(GiftRetrofitApi.class)).send(j, this.f20706a.getId(), this.f20709d, i).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
                    long j2 = j;
                    C7505d dVar = findGiftById;
                    C7550o oVar = new C7550o(this, j2, uptimeMillis, dVar, i);
                    C7551p pVar = new C7551p(this, j2, dVar, i);
                    a.mo6506a((C1710e<? super T>) oVar, (C1710e<? super Throwable>) pVar, (C1706a) new C7621x(this));
                    return;
                }
                C4575an.m10981a((int) R.string.f0x);
            }
        }
    }

    /* renamed from: b */
    private void m15544b(long j, int i) {
        long j2 = j;
        if (!this.f20707b) {
            C7505d findGiftById = GiftManager.inst().findGiftById(j2);
            if (findGiftById != null) {
                if (((IHostContext) C4116c.m10249a(IHostContext.class)).isLocalTest() || ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10095c(findGiftById.f20562w)) {
                    this.f20707b = true;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C2201v a = ((GiftRetrofitApi) C4157e.m10322a().mo9550a(GiftRetrofitApi.class)).sendGoldenGift(j, this.f20706a.getId(), this.f20709d, i).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
                    long j3 = j2;
                    C7623z zVar = new C7623z(this, j, uptimeMillis);
                    a.mo6506a((C1710e<? super T>) zVar, (C1710e<? super Throwable>) new C7527aa<Object>(this, j3), (C1706a) new C7528ab(this));
                    return;
                }
                C4575an.m10981a((int) R.string.f0x);
            }
        }
    }

    /* renamed from: c */
    private void m15545c(long j, int i) {
        int i2;
        if (!this.f20707b) {
            Prop a = C7649u.m15656a().mo14010a(j);
            if (a != null) {
                if (a.count <= 0) {
                    C4575an.m10981a((int) R.string.epg);
                    if (mo8518c() != null) {
                        ((C7549a) mo8518c()).mo13927a();
                    }
                    return;
                }
                if (a.gift != null && a.gift.f20539H) {
                    if (a.count < 10) {
                        C4575an.m10987a(C3897k.m9852a(C3922z.m9903a((int) R.string.hqy), Integer.valueOf(10)));
                        return;
                    } else if (i < 10) {
                        i2 = 10;
                        this.f20708c = i2;
                        this.f20707b = true;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        C2201v a2 = ((PropApi) C4157e.m10322a().mo9550a(PropApi.class)).sendProp(j, this.f20706a.getId(), i2, this.f20709d, a.isAwemeFreeGift).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
                        C7529ac acVar = new C7529ac(this, j, uptimeMillis);
                        a2.mo6506a((C1710e<? super T>) acVar, (C1710e<? super Throwable>) new C7530ad<Object>(this, j), (C1706a) new C7531ae(this));
                    }
                }
                i2 = i;
                this.f20708c = i2;
                this.f20707b = true;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                C2201v a22 = ((PropApi) C4157e.m10322a().mo9550a(PropApi.class)).sendProp(j, this.f20706a.getId(), i2, this.f20709d, a.isAwemeFreeGift).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
                C7529ac acVar2 = new C7529ac(this, j, uptimeMillis2);
                a22.mo6506a((C1710e<? super T>) acVar2, (C1710e<? super Throwable>) new C7530ad<Object>(this, j), (C1706a) new C7531ae(this));
            }
        }
    }

    public C7547n(Room room, long j, String str) {
        this.f20706a = room;
        this.f20709d = j;
        this.f20710e = str;
    }
}
