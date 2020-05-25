package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b.C46485a;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b.C46487b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2326d.C46503c;
import com.p683ss.android.ugc.tools.utils.C50201e;
import com.p683ss.android.vesdk.C50784u;
import com.p683ss.android.vesdk.VEImageDetectUtils.IDetectImageResultListener;
import java.util.ArrayList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b */
public final class C46481b implements IDetectImageResultListener {

    /* renamed from: n */
    public static final C46482a f117281n = new C46482a(null);

    /* renamed from: a */
    public C52682m<? super String, ? super String, Integer> f117282a;

    /* renamed from: b */
    final HandlerThread f117283b = new HandlerThread("pixaloop_work");

    /* renamed from: c */
    public Handler f117284c;

    /* renamed from: d */
    String f117285d;

    /* renamed from: e */
    int f117286e;

    /* renamed from: f */
    int f117287f;

    /* renamed from: g */
    boolean f117288g = true;

    /* renamed from: h */
    public C46503c f117289h;

    /* renamed from: i */
    final ArrayList<C46487b> f117290i = new ArrayList<>();

    /* renamed from: j */
    public String f117291j;

    /* renamed from: k */
    String f117292k;

    /* renamed from: l */
    public C50784u f117293l = new C50784u();

    /* renamed from: m */
    public int f117294m;

    /* renamed from: o */
    private Handler f117295o;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b$a */
    public static final class C46482a {
        private C46482a() {
        }

        public /* synthetic */ C46482a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b$b */
    public static final class C46483b extends Handler {

        /* renamed from: a */
        final /* synthetic */ C46481b f117296a;

        public final void handleMessage(Message message) {
            C52711k.m112240b(message, "msg");
            if (message.what == 1001) {
                Message obtain = Message.obtain();
                obtain.obj = C46476a.f117261d.mo93214d();
                obtain.what = 1001;
                Handler handler = this.f117296a.f117284c;
                if (handler == null) {
                    C52711k.m112234a();
                }
                handler.sendMessage(obtain);
                return;
            }
            if (message.what == 1004) {
                Bundle data = message.getData();
                ArrayList stringArrayList = data.getStringArrayList("img_list");
                ArrayList stringArrayList2 = data.getStringArrayList("alg_list");
                List list = stringArrayList;
                if (!C50201e.m108355a(list)) {
                    List list2 = stringArrayList2;
                    if (!C50201e.m108355a(list2)) {
                        C50784u uVar = this.f117296a.f117293l;
                        String str = this.f117296a.f117291j;
                        if (str == null) {
                            C52711k.m112234a();
                        }
                        if (stringArrayList == null) {
                            C52711k.m112234a();
                        }
                        if (stringArrayList2 == null) {
                            C52711k.m112234a();
                        }
                        uVar.mo99488a(str, list, list2, this.f117296a);
                    }
                }
            }
        }

        C46483b(C46481b bVar, Looper looper) {
            this.f117296a = bVar;
            super(looper);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b$c */
    public static final class C46484c extends Handler {

        /* renamed from: a */
        final /* synthetic */ C46481b f117297a;

        public final void handleMessage(Message message) {
            boolean z;
            boolean z2;
            C52711k.m112240b(message, "msg");
            if (message.what == 1001) {
                ArrayList arrayList = new ArrayList();
                if (message.obj != null) {
                    Object obj = message.obj;
                    if (obj != null) {
                        arrayList = (ArrayList) obj;
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                    }
                }
                C46503c cVar = this.f117297a.f117289h;
                if (cVar != null) {
                    cVar.mo93211a((List<String>) arrayList);
                }
            } else if (message.what == 1002) {
                Object obj2 = message.obj;
                if (obj2 != null) {
                    C46487b bVar = (C46487b) obj2;
                    if (this.f117297a.f117291j != null && !(!C52711k.m112239a((Object) this.f117297a.f117291j, (Object) bVar.f117307d))) {
                        C46481b bVar2 = this.f117297a;
                        if (bVar2.f117287f <= bVar2.f117286e) {
                            bVar2.f117287f++;
                            if (C52711k.m112239a((Object) C46485a.f117298d, (Object) bVar2.f117285d)) {
                                if (!bVar2.f117288g) {
                                    if (bVar == null) {
                                        C52711k.m112234a();
                                    }
                                    if (!bVar.f117306c) {
                                        z2 = false;
                                        bVar2.f117288g = z2;
                                    }
                                }
                                z2 = true;
                                bVar2.f117288g = z2;
                            } else {
                                if (bVar2.f117288g) {
                                    if (bVar == null) {
                                        C52711k.m112234a();
                                    }
                                    if (bVar.f117306c) {
                                        z = true;
                                        bVar2.f117288g = z;
                                    }
                                }
                                z = false;
                                bVar2.f117288g = z;
                            }
                            if (bVar2.f117287f == bVar2.f117286e) {
                                if (bVar == null) {
                                    C52711k.m112234a();
                                }
                                bVar.f117306c = bVar2.f117288g;
                                C46503c cVar2 = bVar2.f117289h;
                                if (cVar2 != null) {
                                    cVar2.mo93210a(bVar);
                                }
                                if (bVar.f117306c) {
                                    bVar2.f117290i.add(bVar);
                                }
                                bVar2.f117287f = 0;
                                bVar2.f117288g = true;
                                if (!TextUtils.isEmpty(bVar.f117304a) && C52711k.m112239a((Object) bVar.f117304a, (Object) bVar2.f117292k)) {
                                    bVar2.mo93223a();
                                }
                            }
                        }
                        bVar2.f117294m++;
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.data.PixaloopData");
                }
            }
        }

        C46484c(C46481b bVar, Looper looper) {
            this.f117297a = bVar;
            super(looper);
        }
    }

    /* renamed from: b */
    public final void mo93227b() {
        Handler handler = this.f117295o;
        if (handler == null) {
            C52711k.m112237a("workHandler");
        }
        handler.sendEmptyMessage(1001);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo93223a() {
        C46503c cVar = this.f117289h;
        if (cVar != null) {
            cVar.mo93212b(this.f117290i);
        }
        this.f117290i.clear();
    }

    /* renamed from: c */
    public final void mo93228c() {
        this.f117292k = null;
        this.f117286e = 0;
        this.f117288g = true;
        this.f117287f = 0;
        this.f117290i.clear();
    }

    public C46481b() {
        this.f117283b.start();
        this.f117295o = new C46483b(this, this.f117283b.getLooper());
        this.f117284c = new C46484c(this, Looper.getMainLooper());
    }

    /* renamed from: a */
    public final void mo93224a(long j) {
        this.f117293l.mo99486a();
    }

    /* renamed from: a */
    public final void mo93225a(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
        C52682m<? super String, ? super String, Integer> mVar = this.f117282a;
        if (mVar != null) {
            mVar.invoke(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo93226a(List<String> list, C46487b bVar) {
        C46485a aVar;
        C52711k.m112240b(list, "imgList");
        this.f117294m = 0;
        if (bVar != null) {
            aVar = bVar.f117310g;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            mo93223a();
        } else if (!C50201e.m108355a(list) || !C50201e.m108355a(bVar.mo93233b())) {
            mo93228c();
            Handler handler = this.f117284c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Handler handler2 = this.f117295o;
            if (handler2 == null) {
                C52711k.m112237a("workHandler");
            }
            handler2.removeCallbacksAndMessages(null);
            this.f117292k = (String) list.get(list.size() - 1);
            this.f117291j = bVar.f117307d;
            this.f117286e = bVar.mo93233b().size();
            this.f117285d = bVar.f117310g.f117302c;
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("img_list", (ArrayList) list);
            String str = "alg_list";
            List b = bVar.mo93233b();
            if (b != null) {
                bundle.putStringArrayList(str, (ArrayList) b);
                C52711k.m112236a((Object) obtain, "message");
                obtain.setData(bundle);
                obtain.what = 1004;
                Handler handler3 = this.f117295o;
                if (handler3 == null) {
                    C52711k.m112237a("workHandler");
                }
                handler3.sendMessage(obtain);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        } else {
            mo93223a();
        }
    }

    public final void onDetectResult(String str, String str2, String str3, boolean z) {
        C52711k.m112240b(str, "stickerId");
        C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(str3, "scanAlgorithm");
        if (this.f117291j != null && !(!C52711k.m112239a((Object) this.f117291j, (Object) str))) {
            Message obtain = Message.obtain();
            C46487b bVar = new C46487b(str2, str3, z);
            bVar.f117307d = str;
            obtain.obj = bVar;
            obtain.what = BaseNotice.CHECK_PROFILE;
            if (this.f117284c != null) {
                Handler handler = this.f117284c;
                if (handler == null) {
                    C52711k.m112234a();
                }
                handler.sendMessage(obtain);
            }
        }
    }
}
