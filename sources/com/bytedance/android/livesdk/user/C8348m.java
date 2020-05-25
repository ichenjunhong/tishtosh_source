package com.bytedance.android.livesdk.user;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface.OnClickListener;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.C3009i.C3010a;
import com.bytedance.android.live.base.model.user.C3013l;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p222a.C3809a;
import com.bytedance.android.live.core.p222a.C3812c;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3893g;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.uikit.dialog.C4220b;
import com.bytedance.android.live.uikit.dialog.C4220b.C4221a;
import com.bytedance.android.livesdk.chatroom.event.C5206y;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p420u.C8316b;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.p453c.C8798a;
import com.bytedance.android.livesdkapi.p449g.C8745a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C1673aa;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C2149h;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p091i.C2153b;
import p064c.p065a.p093k.C2168a;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.user.m */
public final class C8348m implements C8333e {

    /* renamed from: a */
    public C3009i f22711a = new C8340j();

    /* renamed from: b */
    IHostUser f22712b;

    /* renamed from: c */
    public final C2153b<C3013l> f22713c = new C2153b<>();

    /* renamed from: d */
    final C2180b<C3009i> f22714d = C2180b.m6534l();

    /* renamed from: e */
    final C2180b<C8686a> f22715e = C2180b.m6534l();

    /* renamed from: f */
    public C2180b<C3009i> f22716f;

    /* renamed from: g */
    private C3809a<Long, C3009i> f22717g = new C3812c();

    /* renamed from: h */
    private UserApi f22718h;

    /* renamed from: i */
    private FollowApi f22719i;

    /* renamed from: j */
    private C8798a f22720j = new C8798a() {
        /* renamed from: a */
        public final void mo14555a(final C3009i iVar) {
            if (C8348m.this.f22716f != null) {
                C8348m.this.f22711a = iVar;
                C8348m.this.mo14535e().mo6159b((C1683ag<? super T>) new C1683ag<C3009i>() {
                    public final void onError(Throwable th) {
                    }

                    public final void onSubscribe(C1690c cVar) {
                    }

                    public final /* synthetic */ void onSuccess(Object obj) {
                        C3009i iVar = (C3009i) obj;
                        if (C8348m.this.f22716f != null) {
                            C8348m.this.f22716f.onNext(iVar);
                            C8348m.this.f22716f.onComplete();
                            C8348m.this.f22716f = null;
                        }
                        C5206y yVar = new C5206y();
                        yVar.f13929a = true;
                        yVar.f13930b = iVar;
                        C4495a.m10823a().mo10301a((Object) yVar);
                        C8348m.this.f22713c.onNext(new C3013l(C3010a.Login, iVar));
                        C8348m.this.mo14554b(iVar);
                    }
                });
            }
        }
    };

    /* renamed from: a */
    public final C3009i mo14521a() {
        return this.f22711a;
    }

    /* renamed from: d */
    public final C2149h<C3013l> mo14533d() {
        return this.f22713c;
    }

    /* renamed from: g */
    public final C2201v<C8686a> mo14537g() {
        return this.f22715e;
    }

    /* renamed from: a */
    public final void mo14524a(C3009i iVar) {
        if (iVar != null) {
            this.f22717g.mo9182a(Long.valueOf(iVar.getId()), iVar);
        }
    }

    /* renamed from: a */
    public final boolean mo14528a(C8336h hVar) {
        return this.f22712b.interceptOperation(hVar.getFunc());
    }

    /* renamed from: a */
    public final void mo14525a(C8686a aVar) {
        C3009i iVar = (C3009i) this.f22717g.mo9183b(Long.valueOf(aVar.f23732a));
        if (iVar != null) {
            iVar.setFollowStatus(aVar.mo15140a());
        }
        this.f22715e.onNext(aVar);
    }

    /* renamed from: a */
    public final void mo14527a(boolean z) {
        this.f22712b.markAsOutOfDate(true);
    }

    /* renamed from: a */
    public final void mo14523a(int i) {
        this.f22712b.setRoomAttrsAdminFlag(i);
    }

    /* renamed from: a */
    public final void mo14526a(String str, OnClickListener onClickListener, Context context, String str2, String str3, long j, boolean z) {
        Context context2 = context;
        String str4 = "";
        String str5 = "";
        if (context2 != null) {
            C4221a aVar = new C4221a(context2, R.style.ya);
            String str6 = str;
            C4221a b = aVar.mo9689a((CharSequence) str).mo9694b(R.string.e45, C8354n.f22730a);
            C8355o oVar = new C8355o(str2, j, str3, false, str4, str5, onClickListener);
            b.mo9685a((int) R.string.exh, (OnClickListener) oVar);
            C4220b a = aVar.mo9692a();
            a.show();
            C3893g.m9841a(a);
        }
    }

    /* renamed from: b */
    public final long mo14529b() {
        return this.f22711a.getId();
    }

    /* renamed from: f */
    public final C2201v<C3009i> mo14536f() {
        return this.f22714d.mo6522a((C1715j<? super T>) new C8324ad<Object>(this));
    }

    /* renamed from: c */
    public final boolean mo14532c() {
        if (this.f22711a.getId() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final C1680ad<C3009i> mo14535e() {
        long curUserId = this.f22712b.getCurUserId();
        return this.f22718h.queryUser(curUserId, 2, mo14522a(curUserId)).mo6155b(C2168a.m6521b()).mo6157b(C8321aa.f22662a).mo6148a(C1667a.m5940a()).mo6156b((C1710e<? super T>) new C8322ab<Object>(this));
    }

    /* renamed from: a */
    public final C2201v<C8686a> mo14519a(C8341k kVar) {
        return m16545a((T) kVar);
    }

    /* renamed from: a */
    private <T extends C8319a> C2201v<C8686a> m16545a(T t) {
        return C2201v.m6601a((C2205y<T>) new C8359s<T>(this, (C8341k) t, t));
    }

    /* renamed from: c */
    public final C2201v<C3009i> mo14531c(long j) {
        return this.f22714d.mo6522a((C1715j<? super T>) new C8323ac<Object>(j));
    }

    /* renamed from: d */
    public final C2201v<C8686a> mo14534d(long j) {
        return this.f22715e.mo6522a((C1715j<? super T>) new C8356p<Object>(j));
    }

    /* renamed from: a */
    public final C2201v<C8686a> mo14517a(C8325b bVar) {
        return mo14553a(1, bVar.f22660a, bVar.f22669e);
    }

    /* renamed from: a */
    public final C1680ad<User> mo14515a(HashMap<String, String> hashMap) {
        return this.f22718h.queryUser(hashMap).mo6155b(C2168a.m6521b()).mo6157b(C8365y.f22756a).mo6156b((C1710e<? super T>) new C8366z<Object>(this)).mo6148a(C1667a.m5940a());
    }

    /* renamed from: b */
    public final C1680ad<User> mo14530b(long j) {
        return this.f22718h.queryUser(j, 2, mo14522a(j)).mo6155b(C2168a.m6521b()).mo6157b(C8363w.f22754a).mo6156b((C1710e<? super T>) new C8364x<Object>(this)).mo6148a(C1667a.m5940a());
    }

    public C8348m(IHostUser iHostUser) {
        if (iHostUser != null) {
            this.f22712b = iHostUser;
            mo14554b(iHostUser.getCurUser());
            this.f22718h = (UserApi) C4514j.m10883j().mo10321b().mo9550a(UserApi.class);
            this.f22719i = (FollowApi) C4514j.m10883j().mo10321b().mo9550a(FollowApi.class);
            iHostUser.registerCurrentUserUpdateListener(new C8357q(this, iHostUser));
            iHostUser.registerFollowStatusListener(new C8358r(this));
            mo14535e().mo6159b((C1683ag<? super T>) new C8335g<Object>());
        }
    }

    /* renamed from: b */
    public final void mo14554b(C3009i iVar) {
        if (iVar != null) {
            this.f22711a = iVar;
            this.f22713c.onNext(new C3013l(C3010a.Update, iVar));
            this.f22717g.mo9182a(Long.valueOf(iVar.getId()), iVar);
            this.f22714d.onNext(iVar);
            return;
        }
        this.f22711a = new C8340j();
    }

    /* renamed from: a */
    public final C2201v<C8686a> mo14518a(C8329d dVar) {
        return mo14553a(1, dVar.f22660a, dVar.f22669e);
    }

    /* renamed from: a */
    public final C2201v<C8686a> mo14520a(C8344l lVar) {
        return m16545a((T) lVar);
    }

    /* renamed from: a */
    public final String mo14522a(long j) {
        C3009i iVar = (C3009i) this.f22717g.mo9183b(Long.valueOf(j));
        if (iVar != null) {
            return iVar.getSecUid();
        }
        return null;
    }

    /* renamed from: a */
    public final C2201v<C3009i> mo14516a(Context context, C8337i iVar) {
        if (context.getResources().getConfiguration().orientation == 2) {
            C4495a.m10823a().mo10301a((Object) new C8745a(1, "login"));
        }
        FragmentActivity fragmentActivity = null;
        if (context instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) context;
        } else if (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) contextWrapper.getBaseContext();
            }
        }
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (fragmentActivity2 != null) {
            this.f22712b.login(fragmentActivity2, this.f22720j, iVar.f22687a, iVar.f22688b, iVar.f22689c, iVar.f22690d, iVar.f22691e, iVar.f22692f);
            this.f22716f = C2180b.m6534l();
            return this.f22716f.mo6514a(C1667a.m5940a());
        }
        throw new IllegalArgumentException("Argument \"context\" cannot be transformed to FragmentActivity in UserCenter.login() method. ");
    }

    /* renamed from: a */
    public final C2201v<C8686a> mo14553a(int i, long j, long j2) {
        C2201v vVar;
        if (i == 1) {
            vVar = this.f22719i.follow(i, j, j2, mo14521a().getSecUid(), mo14522a(j));
        } else {
            vVar = this.f22719i.unfollow(i, mo14521a().getSecUid(), j, mo14522a(j), j2);
        }
        C2201v<C8686a> d = vVar.mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6541d((C1711f<? super T, ? extends R>) new C8360t<Object,Object>(j));
        C8316b bVar = (C8316b) C4514j.m10883j().mo10326g().mo10305a(C8316b.class);
        if (bVar != null) {
            d = bVar.mo14494a(d);
        } else {
            C3831a.m9716d("UserCenter", "IObservableService is null!");
        }
        int i2 = i;
        long j3 = j;
        long j4 = j2;
        C8361u uVar = new C8361u(this, i2, j3, j4);
        C8362v vVar2 = new C8362v(this, i2, j3, j4);
        d.mo6505a((C1710e<? super T>) uVar, (C1710e<? super Throwable>) vVar2);
        C8316b bVar2 = (C8316b) C4514j.m10883j().mo10326g().mo10305a(C8316b.class);
        if (bVar2 != null) {
            return bVar2.mo14494a(d);
        }
        C3831a.m9716d("UserCenter", "IObservableService is null!");
        return d;
    }
}
