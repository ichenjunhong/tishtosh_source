package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.os.Handler;
import com.bytedance.p702im.core.p706c.C11207p;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1824a.C33593a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1826c.p1827a.C33599c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34147d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34149f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34276a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34547d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34551h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34554k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.ShareStateResponse;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.StrangerMessage;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.StrangerMessageList;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.StrangerMsgSession;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.StrangerSessionList;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34030j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1845j.C34392c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1845j.p1846a.C34390a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.u */
public final class C35286u {

    /* renamed from: a */
    public static ImApi f90624a;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.u$a */
    public interface C35302a {
        /* renamed from: a */
        void mo71736a(int i, Exception exc);

        /* renamed from: a */
        void mo71737a(int i, Object obj);
    }

    /* renamed from: a */
    public static ImApi m79865a() {
        return f90624a;
    }

    /* renamed from: a */
    public static void m79870a(Handler handler, final CharSequence charSequence, final String str, int i) {
        C23566n.m57766a().mo48750a(handler, new Callable() {
            public final Object call() throws Exception {
                try {
                    if (IMUser.isInvalidUser(charSequence.toString())) {
                        return null;
                    }
                    return C35286u.f90624a.queryUser(charSequence.toString(), str).get();
                } catch (ExecutionException e) {
                    throw C35202ap.m79581a(e);
                }
            }
        }, i);
    }

    /* renamed from: a */
    public static void m79871a(Handler handler, final CharSequence charSequence, final String str, final int i, int i2) {
        C23566n.m57766a().mo48750a(handler, new Callable() {
            public final Object call() throws Exception {
                try {
                    return C35286u.f90624a.block(charSequence.toString(), str, i).get();
                } catch (ExecutionException e) {
                    throw C35202ap.m79581a(e);
                }
            }
        }, i2);
    }

    /* renamed from: a */
    public static void m79869a(Handler handler, final long j, final String str, int i) {
        C23566n.m57766a().mo48750a(handler, new Callable() {
            public final Object call() throws Exception {
                try {
                    StrangerMessageList strangerMessageList = (StrangerMessageList) C35286u.f90624a.fetchStrangerMsgList(j, str).get();
                    if (strangerMessageList != null) {
                        List<StrangerMessage> list = strangerMessageList.getmDatas();
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (StrangerMessage a : list) {
                                    C35286u.m79873a(a);
                                }
                            }
                        }
                    }
                    return strangerMessageList;
                } catch (ExecutionException e) {
                    throw C35202ap.m79581a(e);
                }
            }
        }, 0);
    }

    /* renamed from: a */
    private static void m79874a(StrangerSessionList strangerSessionList) {
        if (strangerSessionList != null) {
            List<StrangerMsgSession> lastMsg = strangerSessionList.getLastMsg();
            if (lastMsg != null && !lastMsg.isEmpty()) {
                for (StrangerMsgSession strangerMsgSession : lastMsg) {
                    if (strangerMsgSession != null) {
                        m79873a(strangerMsgSession.getLastMsg());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static void m79873a(StrangerMessage strangerMessage) {
        if (strangerMessage != null) {
            IMUser toUser = strangerMessage.getToUser();
            IMUser fromUser = strangerMessage.getFromUser();
            C34030j.m77788a(toUser);
            C34030j.m77788a(fromUser);
        }
    }

    /* renamed from: a */
    public static void m79872a(final C23371a<C34551h> aVar) {
        f90624a.fetchSessionListBannerConfig().mo19a((C0011g<TResult, TContinuationResult>) new C0011g<C34551h, C34551h>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                return m79880a(iVar);
            }

            /* renamed from: a */
            private static C34551h m79880a(C0013i<C34551h> iVar) throws Exception {
                if (!iVar.mo26b() || iVar.mo34e() == null) {
                    return null;
                }
                C34551h hVar = (C34551h) iVar.mo34e();
                if (hVar != null) {
                    C35284t a = C35284t.m79782a();
                    try {
                        a.f90620a.edit().putString("banner_config_v2", C35277o.m79761a(hVar)).commit();
                    } catch (Exception unused) {
                    }
                }
                return hVar;
            }
        }).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<C34551h, Void>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                if (aVar != null) {
                    aVar.run(iVar.mo34e());
                }
                return null;
            }
        }, C0013i.f25b);
    }

    /* renamed from: a */
    public static void m79876a(String str, int i, String str2, String str3, C33593a<C33599c> aVar) {
        f90624a.searchEmojis(str, i, str2, str3).mo20a((C0011g<TResult, TContinuationResult>) new C35303v<TResult,TContinuationResult>(aVar, i), C0013i.f25b);
    }

    /* renamed from: a */
    public static void m79875a(String str, int i, String str2, C0011g<C34149f, Void> gVar) {
        f90624a.groupShareVerification(str, i, str2).mo20a(gVar, C0013i.f25b);
    }

    /* renamed from: a */
    public static void m79877a(String str, String str2, C35302a aVar) {
        f90624a.queryAweme(str, str2).mo20a((C0011g<TResult, TContinuationResult>) new C35304w<TResult,TContinuationResult>(aVar), C0013i.f25b);
    }

    static {
        C35263c.m79721a(C35268h.f90601b);
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        if (createIRetrofitServicebyMonsterPlugin != null) {
            f90624a = (ImApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(C35268h.f90601b).create(ImApi.class);
        }
    }

    /* renamed from: a */
    public static void m79867a(int i) {
        f90624a.updateRCellState(i);
    }

    /* renamed from: a */
    public static C0013i<Boolean> m79861a(final boolean z) {
        return C0013i.m22b((Callable<TResult>) new Callable<Boolean>() {
            public final /* synthetic */ Object call() throws Exception {
                return Boolean.valueOf(z);
            }
        });
    }

    /* renamed from: b */
    public static void m79878b(final C23371a<List<C29366a>> aVar) {
        C0013i<TResult> iVar;
        List<C0013i> asList = Arrays.asList(new C0013i[]{f90624a.fetchGreetEmoji().mo19a((C0011g<TResult, TContinuationResult>) new C0011g<C34547d, List<C29366a>>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                return m79881a(iVar);
            }

            /* renamed from: a */
            private static List<C29366a> m79881a(C0013i<C34547d> iVar) {
                if (!iVar.mo26b() || iVar.mo34e() == null) {
                    return C35284t.m79782a().mo73444t();
                }
                List<C29366a> emojiList = ((C34547d) iVar.mo34e()).getEmojiList();
                if (emojiList != null && !emojiList.isEmpty()) {
                    C35284t a = C35284t.m79782a();
                    if (!(emojiList == null || emojiList.size() == 0)) {
                        try {
                            HashSet hashSet = new HashSet();
                            for (int i = 0; i < emojiList.size(); i++) {
                                hashSet.add(C35277o.m79761a(emojiList.get(i)));
                            }
                            a.f90620a.edit().putStringSet("group_greet_msg", hashSet).commit();
                        } catch (Exception unused) {
                        }
                    }
                }
                return emojiList;
            }
        }), C0013i.m12a(1000).mo19a((C0011g<TResult, TContinuationResult>) new C0011g<Void, List<C29366a>>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                return C35284t.m79782a().mo73444t();
            }
        })});
        if (asList.size() == 0) {
            iVar = C0013i.m14a(null);
        } else {
            C0027j jVar = new C0027j();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (C0013i a : asList) {
                a.mo19a((C0011g<TResult, TContinuationResult>) new C0011g<Object, Void>(atomicBoolean, jVar) {

                    /* renamed from: a */
                    final /* synthetic */ AtomicBoolean f75a;

                    /* renamed from: b */
                    final /* synthetic */ C0027j f76b;

                    public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                        if (this.f75a.compareAndSet(false, true)) {
                            this.f76b.mo47b(iVar);
                        } else {
                            iVar.mo35f();
                        }
                        return null;
                    }

                    {
                        this.f75a = r1;
                        this.f76b = r2;
                    }
                });
            }
            iVar = jVar.f77a;
        }
        iVar.mo20a((C0011g<TResult, TContinuationResult>) new C0011g<C0013i<?>, Object>() {
            public final Object then(C0013i<C0013i<?>> iVar) {
                if (iVar.mo34e() != null) {
                    try {
                        List list = (List) ((C0013i) iVar.mo34e()).mo34e();
                        if (aVar != null) {
                            aVar.run(list);
                        }
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
        }, C0013i.f25b);
    }

    /* renamed from: a */
    public static C0013i<List<IMUser>> m79859a(String str, C0011g<C34554k, List<IMUser>> gVar) {
        return f90624a.fetchUserInfo(str).mo20a(gVar, (Executor) C0013i.f24a);
    }

    /* renamed from: b */
    public static void m79879b(String str, C0011g<ShareStateResponse, C0013i<Object>> gVar) {
        f90624a.getShareUserCanSendMsg(str).mo23b(gVar);
    }

    /* renamed from: a */
    public static C0013i<Boolean> m79860a(String str, final C11207p pVar) {
        return f90624a.getStoryDetail(str).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) new C0011g<C34390a, C0013i<Boolean>>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                if (iVar == null || !iVar.mo26b() || iVar.mo34e() == null) {
                    pVar.setTag(220224, "story_state_net_error");
                    return C35286u.m79861a(false);
                }
                pVar.setTag(220224, "story_state_checked");
                if (((C34390a) iVar.mo34e()).f88754c != null) {
                    return C35286u.m79861a(false);
                }
                C34392c.m78321a(pVar);
                return C35286u.m79861a(true);
            }
        });
    }

    /* renamed from: a */
    public static C2201v<C34276a> m79862a(String str, int i) {
        return f90624a.searchFollowers(str, i, 15, "");
    }

    /* renamed from: a */
    static final /* synthetic */ Void m79866a(C35302a aVar, C0013i iVar) throws Exception {
        Object obj;
        try {
            obj = (Aweme) C35277o.m79759a().mo34884a(((C18085o) iVar.mo34e()).mo35025e("aweme_detail").toString(), Aweme.class);
        } catch (Exception e) {
            if (aVar != null) {
                aVar.mo71736a(-1, e);
            }
            obj = null;
        }
        if (aVar != null) {
            if (obj != null) {
                aVar.mo71737a(0, obj);
            } else {
                aVar.mo71736a(-1, (Exception) null);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static StrangerSessionList m79864a(long j, long j2, boolean z) throws Exception {
        StrangerSessionList strangerSessionList = (StrangerSessionList) f90624a.fetchStrangerSessionList(j, j2, z).get();
        m79874a(strangerSessionList);
        return strangerSessionList;
    }

    /* renamed from: a */
    public static void m79868a(int i, int i2, String str, C0011g<C34147d, Void> gVar) {
        f90624a.getGroupShareInfo(12, 2, str).mo20a(gVar, C0013i.f25b);
    }

    /* renamed from: a */
    public static C2201v<Object> m79863a(List<IMUser> list, int i, int i2, int i3, int i4, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i5 = 0; i5 < list.size(); i5++) {
            sb.append(((IMUser) list.get(i5)).getUid());
            sb2.append(((IMUser) list.get(i5)).getSecUid());
            if (i5 < list.size() - 1) {
                sb.append(",");
                sb2.append(",");
            }
        }
        return f90624a.followUsers(sb.toString(), sb2.toString(), 1, 0, -1, i4, str);
    }
}
