package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.LayoutInflater;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.model.C5746e;
import com.bytedance.android.livesdk.chatroom.p301a.p302a.C4965a;
import com.bytedance.android.livesdk.chatroom.p301a.p303b.C4969a;
import com.bytedance.android.livesdk.chatroom.p301a.p304c.C4974a;
import com.bytedance.android.livesdk.message.model.C7869cj;
import com.bytedance.android.livesdk.message.model.C8016y;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4605o;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p279af.p281b.C4586c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.ugc.live.barrage.p2602a.C51596a;
import com.p683ss.ugc.live.barrage.p2603b.C51607a;
import com.p683ss.ugc.live.barrage.p2603b.C51607a.C51609a;
import com.p683ss.ugc.live.barrage.p2603b.C51613b;
import com.p683ss.ugc.live.barrage.p2603b.C51614c;
import com.p683ss.ugc.live.barrage.view.BarrageLayout;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

public class BarrageWidget extends LiveRecyclableWidget implements C0199s<KVData>, C6463ay, OnMessageListener {

    /* renamed from: h */
    private static final TypedArray f16772h;

    /* renamed from: i */
    private static final Bitmap[] f16773i;

    /* renamed from: a */
    final List<Bitmap> f16774a = new ArrayList();

    /* renamed from: b */
    public int f16775b = 0;

    /* renamed from: c */
    public boolean f16776c = false;

    /* renamed from: d */
    public String f16777d;

    /* renamed from: e */
    public Room f16778e;

    /* renamed from: f */
    boolean f16779f;

    /* renamed from: g */
    public String f16780g = null;

    /* renamed from: j */
    private final Random f16781j = new Random();

    /* renamed from: k */
    private final List<C7869cj> f16782k = new CopyOnWriteArrayList();

    /* renamed from: l */
    private IMessageManager f16783l;

    /* renamed from: m */
    private C51607a f16784m;

    /* renamed from: n */
    private C4969a f16785n;

    /* renamed from: o */
    private BarrageLayout f16786o;

    /* renamed from: p */
    private BarrageLayout f16787p;

    /* renamed from: q */
    private Runnable f16788q = new Runnable() {
        public final void run() {
            if (BarrageWidget.this.isViewValid()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("live_source", BarrageWidget.this.f16777d);
                    jSONObject.put("request_id", BarrageWidget.this.f16778e.getRequestId());
                    jSONObject.put("log_pb", BarrageWidget.this.f16778e.getLog_pb());
                    jSONObject.put("source", BarrageWidget.this.f16778e.getUserFrom());
                } catch (JSONException unused) {
                }
                C8049c.m15979a().mo14203a("like", new C8059j().mo14214b("live_interact"), Room.class);
                if (BarrageWidget.this.f16778e != null && !BarrageWidget.this.f16778e.isOfficial()) {
                    long id = BarrageWidget.this.f16778e.getId();
                    int i = BarrageWidget.this.f16775b;
                    String labels = BarrageWidget.this.f16778e.getLabels();
                    ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).digg(new C4605o().mo10399a("room_id", String.valueOf(id)).mo10399a("count", String.valueOf(i)).mo10399a("duration", "2000").mo10399a("common_label_list", String.valueOf(labels)).mo10399a("icon", BarrageWidget.this.f16780g).f12568a).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a(C4064k.m10188c(), C4064k.m10187b());
                }
                BarrageWidget.this.f16780g = null;
                BarrageWidget.this.f16775b = 0;
                BarrageWidget.this.f16776c = false;
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.BarrageWidget$3 */
    static /* synthetic */ class C62443 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16791a = new int[C8629a.values().length];

        static {
            try {
                f16791a[C8629a.DIGG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    interface BarrageResourceApi {
        @C12706h(mo23876a = "/webcast/room/digg/icon/list/")
        C2201v<C4177d<C5746e>> fetchResource(@C12724z(mo23894a = "room_id") long j);
    }

    public int getLayoutId() {
        return R.layout.anc;
    }

    /* renamed from: b */
    public final String mo8502b() {
        return getClass().getName();
    }

    static {
        TypedArray obtainTypedArray = C3922z.m9901a().obtainTypedArray(R.array.af);
        f16772h = obtainTypedArray;
        f16773i = new Bitmap[obtainTypedArray.length()];
    }

    public void onClear() {
        Bitmap[] bitmapArr;
        super.onClear();
        for (Bitmap bitmap : f16773i) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    /* renamed from: a */
    public final void mo12304a() {
        int i;
        if (isViewValid() && this.f16787p != null && this.f16784m != null && this.f16784m.mo10736b() < 10 && !this.f16782k.isEmpty()) {
            C7869cj cjVar = (C7869cj) this.f16782k.remove(0);
            boolean a = C4206c.m10426a(this.context);
            LayoutInflater from = LayoutInflater.from(this.context);
            if (a) {
                i = R.layout.ana;
            } else {
                i = R.layout.an_;
            }
            this.f16784m.mo105547a((C51596a) new C4974a(from.inflate(i, null), cjVar, this).f13345b, cjVar.mo14160a());
        }
    }

    public void onUnload() {
        this.dataCenter.removeObserver(this);
        if (this.f16783l != null) {
            this.f16783l.removeMessageListener(this);
        }
        if (this.f16787p != null) {
            this.f16787p.mo105556a();
        }
        if (this.f16787p != null) {
            this.f16786o.mo105556a();
        }
        this.f16775b = 0;
        this.f16776c = false;
        this.f16782k.clear();
        this.f16779f = false;
        for (Bitmap bitmap : this.f16774a) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        this.f16774a.clear();
    }

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C3831a.m9707a(mo8502b(), th.toString());
    }

    public void onLoad(Object... objArr) {
        this.f16783l = (IMessageManager) this.dataCenter.get("data_message_manager");
        if (this.f16783l != null) {
            this.f16783l.addMessageListener(C8629a.DIGG.getIntType(), this);
        }
        this.dataCenter.observe("data_screen_message", this);
        this.dataCenter.observe("data_xt_landscape_tab_change", this);
        ((C4585b) ((BarrageResourceApi) C4514j.m10883j().mo10321b().mo9550a(BarrageResourceApi.class)).fetchResource(this.f16778e.getId()).mo6529b(C2168a.m6521b()).mo6525a((C2203w<T, ? extends R>) C4586c.m11025a())).mo10390a(2).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C6465b<Object>(this), C6492c.f17795a);
    }

    public void onMessage(IMessage iMessage) {
        if (isViewValid() && (iMessage instanceof C8016y)) {
            C8016y yVar = (C8016y) iMessage;
            C3009i a = TTLiveSDKContext.getHostService().mo10315h().mo14521a();
            boolean z = false;
            if (!(a == null || yVar.f21942d == null || a.getId() != yVar.f21942d.getId())) {
                z = true;
            }
            if (!z && C62443.f16791a[yVar.getMessageType().ordinal()] == 1) {
                mo12305a(true);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo12305a(boolean z) {
        if (((Boolean) C4638d.m11114a().f12651b).booleanValue() || !isViewValid()) {
            return false;
        }
        if (this.f16785n.mo10736b() < 24) {
            Bitmap bitmap = null;
            if (this.f16779f && !C9414h.m18630a(this.f16774a)) {
                bitmap = (Bitmap) this.f16774a.get(this.f16781j.nextInt(this.f16774a.size()));
            } else if (f16772h.length() > 0) {
                int nextInt = this.f16781j.nextInt(f16772h.length());
                if (f16773i[nextInt] == null || f16773i[nextInt].isRecycled()) {
                    f16773i[nextInt] = BitmapFactory.decodeResource(this.context.getResources(), f16772h.getResourceId(nextInt, 0));
                }
                Bitmap bitmap2 = f16773i[nextInt];
                if (!z && this.f16780g == null) {
                    this.f16780g = String.valueOf(nextInt);
                }
                bitmap = bitmap2;
            }
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f16785n.mo105547a((C51596a) new C4965a(bitmap, this.f16781j.nextDouble()), false);
            }
        }
        if (z || !TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
            return false;
        }
        this.f16775b++;
        if (!this.f16776c) {
            this.f16776c = true;
            this.contentView.postDelayed(this.f16788q, 2000);
        }
        return true;
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -2104158356) {
                if (hashCode == -369217431 && key.equals("data_screen_message")) {
                    c = 0;
                }
            } else if (key.equals("data_xt_landscape_tab_change")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    C7869cj cjVar = (C7869cj) kVData.getData();
                    if (this.f16782k.size() >= 200) {
                        Iterator it = this.f16782k.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C7869cj cjVar2 = (C7869cj) it.next();
                                if (!cjVar2.mo14160a()) {
                                    this.f16782k.remove(cjVar2);
                                }
                            }
                        }
                    }
                    if (this.f16782k.size() >= 200) {
                        this.f16782k.remove(this.f16782k.size() - 1);
                    }
                    if (cjVar.mo14160a()) {
                        this.f16782k.add(0, cjVar);
                    } else {
                        this.f16782k.add(cjVar);
                    }
                    mo12304a();
                    return;
                case 1:
                    if (((Integer) kVData.getData()).intValue() == 0) {
                        C9432q.m18691b(this.contentView, 0);
                        break;
                    } else {
                        C9432q.m18691b(this.contentView, 8);
                        return;
                    }
            }
        }
    }

    public void onInit(Object... objArr) {
        String str;
        this.f16778e = (Room) this.dataCenter.get("data_room");
        if (C35807d.m80935a(this.context, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.f16777d = str;
        this.f16787p = (BarrageLayout) this.contentView.findViewById(R.id.je);
        if (C4206c.m10426a(this.context)) {
            this.f16784m = new C51613b(this.f16787p, C3922z.m9913d(R.dimen.qh), 2, 7000);
        } else {
            this.f16784m = new C51614c(this.f16787p, C3922z.m9913d(R.dimen.qh), 2, 7000);
        }
        this.f16784m.mo105548a((C51609a) new C51609a() {
            /* renamed from: a */
            public final void mo12308a(C51596a aVar) {
                BarrageWidget.this.mo12304a();
            }
        });
        this.f16787p.mo105557a(this.f16784m);
        this.f16786o = (BarrageLayout) this.contentView.findViewById(R.id.a5s);
        this.f16785n = new C4969a(this.f16786o, 1400);
        this.f16786o.mo105557a(this.f16785n);
        for (int i = 0; i < 10; i++) {
            Path path = new Path();
            path.moveTo((float) C3922z.m9899a(94.0f), (float) C3922z.m9899a(150.0f));
            float f = (float) (((i - 5) * 8) + 94);
            path.quadTo((float) C3922z.m9899a(f), (float) C3922z.m9899a(150.0f), (float) C3922z.m9899a(f), (float) C3922z.m9899a(40.0f));
            this.f16785n.mo10733a(path);
        }
    }
}
