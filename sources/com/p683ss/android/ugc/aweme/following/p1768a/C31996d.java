package com.p683ss.android.ugc.aweme.following.p1768a;

import android.os.Message;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.experiment.UserFollowingListSortTypeExperiment;
import com.p683ss.android.ugc.aweme.following.api.C32005a;
import com.p683ss.android.ugc.aweme.following.api.FollowingApi;
import com.p683ss.android.ugc.aweme.p1793g.C32801b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.following.a.d */
public class C31996d extends C26875a<User, C31998e> {

    /* renamed from: b */
    private static final String f83530b = "d";

    /* renamed from: a */
    public FollowingApi f83531a = ((FollowingApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(FollowingApi.class));

    /* renamed from: c */
    private C31998e f83532c;

    /* renamed from: d */
    private String f83533d;

    /* renamed from: e */
    private String f83534e;

    /* renamed from: f */
    private int f83535f;

    /* renamed from: g */
    private boolean f83536g;

    /* renamed from: h */
    private C31999f f83537h;

    /* renamed from: i */
    private boolean f83538i = true;

    /* renamed from: j */
    private C32000g f83539j;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public List<User> getItems() {
        if (this.f83532c == null) {
            return null;
        }
        return this.f83532c.f83542a;
    }

    public boolean isHasMore() {
        if (this.f83532c == null || !this.f83532c.f83544c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m74390a(final C32005a aVar) {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return C31996d.this.f83531a.fetchFollowingList(aVar.f83567a, aVar.f83568b, aVar.f83570d, aVar.f83569c, aVar.f83572f, aVar.f83573g, aVar.f83575i, aVar.f83576j).get();
            }
        }, 0);
    }

    /* renamed from: a */
    private C32005a m74388a(boolean z) {
        int i;
        int i2;
        C32005a aVar = new C32005a();
        aVar.f83569c = 20;
        aVar.f83567a = this.f83533d;
        aVar.f83568b = this.f83534e;
        aVar.f83571e = this.f83536g;
        if (z) {
            i = 0;
        } else {
            i = this.f83535f;
        }
        aVar.f83572f = i;
        aVar.f83573g = m74391b(z);
        if (C20854a.m53167g().isUidContactPermisioned()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        aVar.f83575i = i2;
        aVar.f83576j = C47945d.m103733b();
        return aVar;
    }

    /* renamed from: b */
    private int m74391b(boolean z) {
        if (this.f83536g) {
            return C10181b.m20511a().mo18168a(UserFollowingListSortTypeExperiment.class, true, "user_following_list_sort_type", 31744, 1);
        }
        if (z) {
            C41589c.m91432a();
            if (C41589c.m91438j()) {
                return 2;
            }
            return 1;
        } else if (this.f83538i) {
            return 2;
        } else {
            return 1;
        }
    }

    public void loadMoreList(Object... objArr) {
        long j;
        this.f83537h = new C31999f();
        this.f83537h.f83553b++;
        this.f83539j = null;
        C32005a a = m74388a(false);
        if (this.f83532c == null) {
            j = 0;
        } else {
            j = this.f83532c.f83546e;
        }
        a.f83570d = j;
        m74390a(a);
    }

    public void refreshList(Object... objArr) {
        this.f83535f = 0;
        this.f83538i = true;
        this.f83539j = new C32000g();
        this.f83539j.f83556b++;
        this.f83537h = null;
        C32005a a = m74388a(true);
        a.f83570d = 0;
        m74390a(a);
    }

    public void handleMsg(Message message) {
        this.mIsLoading = false;
        if (message.obj instanceof Exception) {
            if (this.mNotifyListeners != null) {
                for (C26874f c_ : this.mNotifyListeners) {
                    c_.mo44840c_((Exception) message.obj);
                }
            }
            this.f83537h = null;
            this.f83539j = null;
            return;
        }
        handleData((C31998e) message.obj);
        this.f83537h = null;
        this.f83539j = null;
        if (this.mNotifyListeners != null) {
            for (C26874f b : this.mNotifyListeners) {
                b.mo44838b();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C31998e eVar) {
        boolean z;
        boolean z2;
        super.handleData(eVar);
        boolean z3 = false;
        if (eVar == null) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            this.f83535f = eVar.f83547f;
            this.f83538i = eVar.f83548g;
            int i = this.mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    int size = this.f83532c.f83542a.size();
                    C32801b.m75681a(this.f83532c.f83542a, eVar.f83542a);
                    int size2 = this.f83532c.f83542a.size() - size;
                    if (this.f83537h != null) {
                        this.f83537h.f83552a += size2;
                        C31999f fVar = this.f83537h;
                        if (!eVar.f83544c || !this.f83532c.f83544c) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        fVar.f83554c = z2;
                    }
                    this.f83532c.f83545d = eVar.f83545d;
                    this.f83532c.f83546e = eVar.f83546e;
                    C31998e eVar2 = this.f83532c;
                    if (eVar.f83544c && this.f83532c.f83544c) {
                        z3 = true;
                    }
                    eVar2.f83544c = z3;
                }
            } else if (this.f83539j == null || this.f83539j.f83556b <= 1 || this.f83532c == null) {
                this.f83532c = eVar;
            } else {
                int size3 = this.f83532c.f83542a.size();
                C32801b.m75681a(this.f83532c.f83542a, eVar.f83542a);
                int size4 = this.f83532c.f83542a.size() - size3;
                this.f83539j.f83555a += size4;
                this.f83539j.f83557c = eVar.f83544c;
                this.f83532c.f83545d = eVar.f83545d;
                this.f83532c.f83546e = eVar.f83546e;
                C31998e eVar3 = this.f83532c;
                if (eVar.f83544c && this.f83532c.f83544c) {
                    z3 = true;
                }
                eVar3.f83544c = z3;
            }
        } else {
            if (this.f83532c != null) {
                this.f83532c.f83544c = false;
            }
        }
    }

    public C31996d(String str, String str2, boolean z) {
        this.f83533d = str;
        this.f83534e = str2;
        this.f83536g = z;
    }
}
