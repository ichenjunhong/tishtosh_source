package com.bytedance.android.livesdk.viewmodel;

import android.arch.lifecycle.C0209x;
import com.bytedance.android.live.core.rxutils.C4067n;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.api.LotteryApi;
import com.bytedance.android.livesdk.chatroom.model.C5764s;
import com.bytedance.android.livesdk.chatroom.model.C5765t;
import com.bytedance.android.livesdk.chatroom.model.C5766u;
import com.bytedance.android.livesdk.p399o.C8064d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

public final class LotteryViewModel extends C0209x {

    /* renamed from: a */
    public final C8422f f22841a = new C8422f();

    /* renamed from: b */
    public final C1689b f22842b = new C1689b();

    /* renamed from: c */
    private final C1689b f22843c = new C1689b();

    /* renamed from: com.bytedance.android.livesdk.viewmodel.LotteryViewModel$a */
    public static final class C8402a<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C8402a f22845a = new C8402a();

        C8402a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C4177d dVar = (C4177d) obj;
            C52711k.m112240b(dVar, "it");
            C5765t tVar = (C5765t) dVar.data;
            boolean z = false;
            if (tVar != null) {
                List<Object> list = tVar.f15161b;
                if (list != null && !list.isEmpty()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.LotteryViewModel$b */
    public static final class C8403b<T, R> implements C1711f<Throwable, Boolean> {

        /* renamed from: a */
        public static final C8403b f22846a = new C8403b();

        C8403b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112240b(th, "t");
            C8064d.m16005b();
            C8064d.m9718a(6, th.getStackTrace());
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.LotteryViewModel$c */
    static final class C8404c<T> implements C1710e<C4177d<C5764s>> {

        /* renamed from: a */
        final /* synthetic */ LotteryViewModel f22847a;

        /* renamed from: b */
        final /* synthetic */ long f22848b;

        C8404c(LotteryViewModel lotteryViewModel, long j) {
            this.f22847a = lotteryViewModel;
            this.f22848b = j;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4177d dVar = (C4177d) obj;
            if (dVar != null) {
                C5764s sVar = (C5764s) dVar.data;
                if (sVar != null) {
                    C5766u uVar = sVar.f15156b;
                    if (uVar != null && uVar.f15167f == 1) {
                        long a = C8423g.m16626a(uVar.f15174m);
                        C8422f fVar = this.f22847a.f22841a;
                        StartLottery startLottery = new StartLottery(uVar.f15162a, uVar.f15166e, uVar.f15164c, this.f22848b, a);
                        fVar.mo14653a((ILotteryAction) startLottery);
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.LotteryViewModel$d */
    static final class C8405d<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ LotteryViewModel f22849a;

        /* renamed from: b */
        final /* synthetic */ int f22850b;

        /* renamed from: c */
        final /* synthetic */ long f22851c;

        /* renamed from: d */
        final /* synthetic */ long f22852d;

        C8405d(LotteryViewModel lotteryViewModel, int i, long j, long j2) {
            this.f22849a = lotteryViewModel;
            this.f22850b = i;
            this.f22851c = j;
            this.f22852d = j2;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C8064d.m16005b();
            C52711k.m112236a((Object) th, "t");
            C8064d.m9718a(6, th.getStackTrace());
            if (this.f22850b > 0) {
                LotteryViewModel lotteryViewModel = this.f22849a;
                C1690c f = C2201v.m6592a(1, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C1710e<Long>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C8405d f22853a;

                    {
                        this.f22853a = r1;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        Long l = (Long) obj;
                        this.f22853a.f22849a.mo14618a(this.f22853a.f22851c, this.f22853a.f22852d, this.f22853a.f22850b - 1);
                    }
                });
                C52711k.m112236a((Object) f, "Observable.timer(INIT_LO…                        }");
                lotteryViewModel.mo14619a(f);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.LotteryViewModel$e */
    static final class C8407e<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ LotteryViewModel f22854a;

        C8407e(LotteryViewModel lotteryViewModel) {
            this.f22854a = lotteryViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            this.f22854a.f22841a.mo14653a((ILotteryAction) new FinishLottery());
        }
    }

    public final void onCleared() {
        this.f22842b.dispose();
        this.f22843c.dispose();
        C8064d.m16005b();
        C8064d.m9719a("ttlive_lottery", "viewModel cleared");
    }

    /* renamed from: a */
    public final boolean mo14619a(C1690c cVar) {
        return this.f22842b.mo6181a(cVar);
    }

    public LotteryViewModel(long j, long j2) {
        C1690c f = C4067n.m10192a(this.f22841a.mo14654b()).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C1710e<C52847n<? extends ILotteryState, ? extends ILotteryState>>(this) {

            /* renamed from: a */
            final /* synthetic */ LotteryViewModel f22844a;

            {
                this.f22844a = r1;
            }

            public final /* synthetic */ void accept(Object obj) {
                C52847n nVar = (C52847n) obj;
                ILotteryState iLotteryState = (ILotteryState) nVar.component1();
                ILotteryState iLotteryState2 = (ILotteryState) nVar.component2();
                if (iLotteryState != null) {
                    this.f22844a.f22842b.mo6180a();
                }
                LotteryViewModel lotteryViewModel = this.f22844a;
                if (iLotteryState2 instanceof LotteryWaiting) {
                    C1690c f = C2201v.m6592a((((LotteryWaiting) iLotteryState2).getLocalDrawTime() * 1000) - System.currentTimeMillis(), TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C8407e<Object>(lotteryViewModel));
                    C52711k.m112236a((Object) f, "Observable.timer(localDr…mutate(FinishLottery()) }");
                    lotteryViewModel.mo14619a(f);
                }
            }
        });
        C52711k.m112236a((Object) f, "dataModel.stateChanged()…tateChanged(to)\n        }");
        this.f22843c.mo6181a(f);
        mo14618a(j, j2, 15);
    }

    /* renamed from: a */
    public final void mo14618a(long j, long j2, int i) {
        C8064d.m16005b();
        StringBuilder sb = new StringBuilder("handleInit roomId=");
        sb.append(j);
        sb.append(" userId=");
        sb.append(j2);
        sb.append(" retriesLeft=");
        sb.append(i);
        C8064d.m9720b("ttlive_lottery", sb.toString());
        C2201v a = ((LotteryApi) C4157e.m10322a().mo9550a(LotteryApi.class)).checkUserRightWithRoomId(j).mo6514a(C1667a.m5940a());
        C1710e cVar = new C8404c(this, j2);
        C8405d dVar = new C8405d(this, i, j, j2);
        C1690c a2 = a.mo6505a(cVar, (C1710e<? super Throwable>) dVar);
        C52711k.m112236a((Object) a2, "LiveClient.get().getServ…     }\n                })");
        mo14619a(a2);
    }
}
