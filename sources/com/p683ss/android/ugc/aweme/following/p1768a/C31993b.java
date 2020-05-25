package com.p683ss.android.ugc.aweme.following.p1768a;

import android.os.Message;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.following.api.C32005a;
import com.p683ss.android.ugc.aweme.following.api.FollowerApi;
import com.p683ss.android.ugc.aweme.p1793g.C32801b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.following.a.b */
public class C31993b extends C26875a<User, C31995c> {

    /* renamed from: c */
    private static final String f83507c = "b";

    /* renamed from: a */
    public C31995c f83508a;

    /* renamed from: b */
    public FollowerApi f83509b = ((FollowerApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(FollowerApi.class));

    /* renamed from: d */
    private String f83510d;

    /* renamed from: e */
    private String f83511e;

    /* renamed from: f */
    private int f83512f;

    /* renamed from: g */
    private C31999f f83513g;

    /* renamed from: h */
    private boolean f83514h = true;

    /* renamed from: i */
    private C32000g f83515i;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public /* bridge */ /* synthetic */ Object getData() {
        return this.f83508a;
    }

    public List<User> getItems() {
        if (this.f83508a == null) {
            return null;
        }
        return this.f83508a.f83518a;
    }

    public boolean isHasMore() {
        if (this.f83508a == null || !this.f83508a.f83520c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m74387a(final C32005a aVar) {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return C31993b.this.f83509b.fetchFollowingList(aVar.f83567a, aVar.f83568b, aVar.f83570d, aVar.f83569c, aVar.f83572f, aVar.f83573g, aVar.f83575i, aVar.f83576j).get();
            }
        }, 0);
    }

    public void loadMoreList(Object... objArr) {
        long j;
        this.f83513g = new C31999f();
        this.f83513g.f83553b++;
        this.f83515i = null;
        C32005a a = m74385a(false);
        if (this.f83508a == null) {
            j = 0;
        } else {
            j = this.f83508a.f83522e;
        }
        a.f83570d = j;
        m74387a(a);
    }

    public void refreshList(Object... objArr) {
        this.f83512f = 0;
        this.f83514h = true;
        this.f83515i = new C32000g();
        this.f83515i.f83556b++;
        this.f83513g = null;
        C32005a a = m74385a(true);
        a.f83570d = 0;
        m74387a(a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (com.p683ss.android.ugc.aweme.setting.C41589c.m91438j() == false) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p683ss.android.ugc.aweme.following.api.C32005a m74385a(boolean r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.following.api.a r0 = new com.ss.android.ugc.aweme.following.api.a
            r0.<init>()
            r1 = 20
            r0.f83569c = r1
            java.lang.String r1 = r4.f83510d
            r0.f83567a = r1
            java.lang.String r1 = r4.f83511e
            r0.f83568b = r1
            r1 = 1
            r2 = 2
            if (r5 == 0) goto L_0x001e
            com.p683ss.android.ugc.aweme.setting.C41589c.m91432a()
            boolean r3 = com.p683ss.android.ugc.aweme.setting.C41589c.m91438j()
            if (r3 != 0) goto L_0x0024
        L_0x001e:
            if (r5 != 0) goto L_0x0026
            boolean r3 = r4.f83514h
            if (r3 == 0) goto L_0x0026
        L_0x0024:
            r3 = 2
            goto L_0x0027
        L_0x0026:
            r3 = 1
        L_0x0027:
            r0.f83573g = r3
            if (r5 == 0) goto L_0x002d
            r5 = 0
            goto L_0x002f
        L_0x002d:
            int r5 = r4.f83512f
        L_0x002f:
            r0.f83572f = r5
            com.ss.android.ugc.aweme.IAccountUserService r5 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            boolean r5 = r5.isUidContactPermisioned()
            if (r5 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r1 = 2
        L_0x003d:
            r0.f83575i = r1
            int r5 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103733b()
            r0.f83576j = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1768a.C31993b.m74385a(boolean):com.ss.android.ugc.aweme.following.api.a");
    }

    public void handleMsg(Message message) {
        this.mIsLoading = false;
        if (message.obj instanceof Exception) {
            if (this.mNotifyListeners != null) {
                for (C26874f c_ : this.mNotifyListeners) {
                    c_.mo44840c_((Exception) message.obj);
                }
            }
            this.f83513g = null;
            this.f83515i = null;
            return;
        }
        handleData((C31995c) message.obj);
        C41589c.m91432a();
        C41589c.m91438j();
        this.f83513g = null;
        this.f83515i = null;
        if (this.mNotifyListeners != null) {
            for (C26874f b : this.mNotifyListeners) {
                b.mo44838b();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C31995c cVar) {
        boolean z;
        boolean z2;
        super.handleData(cVar);
        boolean z3 = false;
        if (cVar == null) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            this.f83512f = cVar.f83524g;
            this.f83514h = cVar.f83525h;
            int i = this.mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    int size = this.f83508a.f83518a.size();
                    C32801b.m75681a(this.f83508a.f83518a, cVar.f83518a);
                    int size2 = this.f83508a.f83518a.size() - size;
                    if (this.f83513g != null) {
                        this.f83513g.f83552a += size2;
                        C31999f fVar = this.f83513g;
                        if (!cVar.f83520c || !this.f83508a.f83520c) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        fVar.f83554c = z2;
                    }
                    this.f83508a.f83521d = cVar.f83521d;
                    this.f83508a.f83522e = cVar.f83522e;
                    C31995c cVar2 = this.f83508a;
                    if (cVar.f83520c && this.f83508a.f83520c) {
                        z3 = true;
                    }
                    cVar2.f83520c = z3;
                }
            } else if (this.f83515i == null || this.f83515i.f83556b <= 1 || this.f83508a == null) {
                this.f83508a = cVar;
            } else {
                int size3 = this.f83508a.f83518a.size();
                C32801b.m75681a(this.f83508a.f83518a, cVar.f83518a);
                int size4 = this.f83508a.f83518a.size() - size3;
                this.f83515i.f83555a += size4;
                this.f83515i.f83557c = cVar.f83520c;
                this.f83508a.f83521d = cVar.f83521d;
                this.f83508a.f83522e = cVar.f83522e;
                C31995c cVar3 = this.f83508a;
                if (cVar.f83520c && this.f83508a.f83520c) {
                    z3 = true;
                }
                cVar3.f83520c = z3;
            }
        } else {
            if (this.f83508a != null) {
                this.f83508a.f83520c = false;
            }
        }
    }

    public C31993b(String str, String str2) {
        this.f83510d = str;
        this.f83511e = str2;
    }
}
