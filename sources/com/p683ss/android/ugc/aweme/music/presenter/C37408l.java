package com.p683ss.android.ugc.aweme.music.presenter;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.l */
public final class C37408l extends C26851b<C26832a<BaseResponse>, C37397c> {

    /* renamed from: a */
    public int f95419a;

    /* renamed from: b */
    public int f95420b;

    /* renamed from: c */
    private Context f95421c;

    /* renamed from: b */
    public final void mo44838b() {
        int d = C37249a.m83513d();
        int i = this.f95420b;
        int i2 = R.string.hx;
        int i3 = R.string.wm;
        if (i == 4) {
            if (this.f95419a == 0 && this.f95421c != null) {
                Context context = this.f95421c;
                if (d != 2) {
                    i2 = R.string.wm;
                }
                C10691a.m21533a(context, i2).mo19066a();
            }
        } else if ((this.f95420b == 1 || this.f95420b == 2) && this.f95421c != null) {
            if (d != 2) {
                Context context2 = this.f95421c;
                if (this.f95419a == 1) {
                    i3 = R.string.a4d;
                }
                C10691a.m21533a(context2, i3).mo19066a();
            } else {
                Context context3 = this.f95421c;
                if (this.f95419a == 1) {
                    i2 = R.string.hy;
                }
                C10691a.m21533a(context3, i2).mo19066a();
            }
        }
        if (!(this.f70701g == null || this.f70700f == null)) {
            this.f70700f.getData();
        }
        if (!Keva.getRepo("collect").getBoolean("first_favourite_success", false) && this.f95419a == 1) {
            Keva.getRepo("collect").storeBoolean("first_favourite_success", true);
        }
    }

    public C37408l(Context context) {
        this.f95421c = context;
        mo54799a(new C26832a<BaseResponse>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 3) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                C0013i iVar;
                C37408l.this.f95420b = objArr[0].intValue();
                String str = objArr[1];
                C37408l.this.f95419a = objArr[2].intValue();
                if (C37408l.this.f95420b != 1) {
                    iVar = null;
                } else {
                    iVar = ChooseMusicApi.m60386a().collectMusic(str, C37408l.this.f95419a);
                }
                if (iVar == null) {
                    return false;
                }
                iVar.mo20a((C0011g<TResult, TContinuationResult>) new C0011g<BaseResponse, Void>() {
                    public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                        if (iVar.mo33d() || iVar.mo31c()) {
                            C37408l.this.mo44840c_(iVar.mo35f());
                        } else {
                            C37408l.this.mo44838b();
                        }
                        return null;
                    }
                }, C0013i.f25b);
                return true;
            }
        });
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        int i;
        int i2;
        if (this.f95421c != null) {
            if (C37249a.m83513d() != 2) {
                Context context = this.f95421c;
                if (this.f95419a == 1) {
                    i2 = R.string.a48;
                } else {
                    i2 = R.string.wl;
                }
                C10691a.m21542b(context, i2).mo19066a();
            } else {
                Context context2 = this.f95421c;
                if (this.f95419a == 1) {
                    i = R.string.i3;
                } else {
                    i = R.string.hw;
                }
                C10691a.m21542b(context2, i).mo19066a();
            }
        }
        if (this.f70701g != null) {
            ((C37397c) this.f70701g).mo50814a(exc);
        }
    }
}
