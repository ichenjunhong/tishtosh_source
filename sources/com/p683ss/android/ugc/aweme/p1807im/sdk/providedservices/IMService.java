package com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p723j.C11511a;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.agilelogger.C18778a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.login.C27962e;
import com.p683ss.android.ugc.aweme.p1632di.C27622bi;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33220b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImFeedShareIconOverturnTypeExperiment;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.BaseChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.CommandShareContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.CommentContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SharePoiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.TextContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33374a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33440v;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33445y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.selectmsg.C33707b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.selectmsg.SelectChatMsgActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate.C34169a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.GroupCommandInviteDialog;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34550g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.UserStruct;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34604d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34632m;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.SessionListActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34595h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34597i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger.C34684c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger.C34684c.C34687b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy.C34755a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy.C34768c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1812c.C33299a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1812c.C33299a.C33303a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1812c.C33299a.C33304b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34008d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.C34015a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34018h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34030j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1845j.C34392c.C34393a.C34394a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1848l.C34400c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.C35024h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.RelationSelectActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34983g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.p1886a.C34970a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1884e.C34958a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34839a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.C35125c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35102b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35102b.C35103a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35102b.C35103a.C35104a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35102b.C35103a.C35105b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c.C35109a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35110d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj.C35241a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35263c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35268h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35281r;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.C35405k.C35409a;
import com.p683ss.android.ugc.aweme.p1807im.service.C35421a;
import com.p683ss.android.ugc.aweme.p1807im.service.C35428b;
import com.p683ss.android.ugc.aweme.p1807im.service.C35445g;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35464a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35466c;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35467d;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35469f;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35470g;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35472i;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35423b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1900b.C35429a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1901c.C35431a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1903e.C35437a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35446a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35447b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35448c;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35449d;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35450e;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35451f;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.websocket.p2539b.p2542c.C50829b;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.greenrobot.eventbus.C53755c;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.IMService */
public class IMService implements IIMService {
    private static IIMService inst;
    private C35428b abInterface;
    private C35429a inputMenuCustomizer;
    private int xplanStyle;

    public static IIMService provideIMService_Monster() {
        if (C27991b.f73420D == null) {
            synchronized (IIMService.class) {
                if (C27991b.f73420D == null) {
                    C27991b.f73420D = C27622bi.m66302a();
                }
            }
        }
        return (IIMService) C27991b.f73420D;
    }

    public C35428b getAbInterface() {
        return this.abInterface;
    }

    public C35445g getIMErrorMonitor() {
        return C35281r.f90615b;
    }

    public C35429a getInputMenuCustomizer() {
        return this.inputMenuCustomizer;
    }

    public Class getSessionListActivityClass() {
        return SessionListActivity.class;
    }

    public boolean isImReduction() {
        return false;
    }

    public static IIMService get() {
        return DefaultIMService.provideIMService_Monster();
    }

    public boolean canShowLiveNotification() {
        return C34755a.f89518g.mo72830j();
    }

    public void clearIMNotification() {
        C34755a.f89518g.f89521b.clear();
    }

    public void ensureIMState() {
        C34018h.m77779b().mo71970a();
    }

    public void forceRefreshSessionList() {
        C34032k.m77795a().mo71988e();
    }

    public File getAudioDownloadCachePath() {
        C33374a.m76531a();
        return C33374a.m76533c();
    }

    public C35446a getExperimentService() {
        return ImServiceProvider.INSTANCE.getExperimentService();
    }

    public C35447b getFamiliarService() {
        return ImServiceProvider.INSTANCE.getFamiliarService();
    }

    public C50829b getImParser() {
        return new C34400c();
    }

    public C35448c getMixBusinessService() {
        return ImServiceProvider.INSTANCE.getMixBusinessService();
    }

    public C35449d getNotificationService() {
        return ImServiceProvider.INSTANCE.getNotificationService();
    }

    public C35450e getRelationService() {
        return ImServiceProvider.INSTANCE.getRelationService();
    }

    public C35451f getShareService() {
        return ImServiceProvider.INSTANCE.getShareService();
    }

    public boolean isXPlanOpen() {
        return isXPlanB();
    }

    public void loadWcdbLibrary() {
        C11511a.m23578a("wcdb");
    }

    public boolean needShowNoticeDot() {
        return C34604d.m78558a();
    }

    public void showLiveNotification() {
        C34755a.f89518g.mo72829h();
    }

    public void tabChangeToNotification() {
        C34755a.f89518g.mo72831k();
    }

    public boolean clearAudioDownloadCache() {
        return C33374a.m76531a().mo70755b();
    }

    public List<IMUser> getAllFollowIMUsers() {
        C34010e.m77748a();
        return C34387b.m78292a().mo72394c(C34387b.m78304h());
    }

    public List<IMUser> getAllFriends() {
        C34010e.m77748a();
        return C34387b.m78292a().mo72394c(C34387b.m78300d());
    }

    public boolean isAssociativeEmojiEnabled() {
        return C35284t.m79782a().mo73447w();
    }

    public boolean isNeedToContinuePlayInAct() {
        return C34004b.m77717a().mo71949f().isNeedToContinuePlayInAct();
    }

    public boolean isNotificationMessageQueueEmpty() {
        return C34755a.f89518g.f89521b.isEmpty();
    }

    public boolean isXPlanB() {
        if (this.xplanStyle <= 0 || this.xplanStyle >= 1001) {
            return false;
        }
        return true;
    }

    public void onBlockUserSuccessEvent() {
        C47718bf.m103288a(new C35431a());
    }

    public void refreshLoginState() {
        C35281r.f90615b.mo73374c("refresh login");
        C34004b.m77717a().mo71947d();
    }

    public void resetLoginState() {
        C35281r.f90615b.mo73374c("switch account");
        C34004b.m77717a().mo71948e();
    }

    public static IIMService inst() {
        if (inst == null) {
            inst = get();
            StringBuilder sb = new StringBuilder("IMService.inst: IMService not initialized: ");
            sb.append(inst);
            C32458a.m75144a(sb.toString());
        }
        return inst;
    }

    public boolean canFetchFollowListIdle() {
        if (C35284t.m79782a().mo73380F() > 0) {
            return true;
        }
        return false;
    }

    public C35437a getRelationSelectFragment() {
        C35024h hVar = new C35024h();
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_no_title", Boolean.valueOf(true));
        hVar.setArguments(bundle);
        return hVar;
    }

    public C35437a getSessionListFragment() {
        int i;
        if (C34004b.m77717a().mo71949f() != null) {
            i = C34004b.m77717a().mo71949f().getXPlanStyle();
        } else {
            i = 0;
        }
        this.xplanStyle = i;
        return new C34632m();
    }

    public void hideIMNotification() {
        C34755a aVar = C34755a.f89518g;
        C34768c cVar = aVar.f89523d;
        if (cVar != null && cVar.f89556a) {
            cVar.dismiss(null);
        }
        aVar.f89523d = null;
    }

    public void hideLiveNotification() {
        C34755a aVar = C34755a.f89518g;
        C34768c cVar = aVar.f89523d;
        if (cVar != null && cVar.f89556a) {
            C34768c cVar2 = aVar.f89523d;
            if (cVar2 != null && cVar2.mo72838a()) {
                cVar.dismiss(null);
                aVar.f89523d = null;
            }
        }
    }

    public boolean isInMainFeed() {
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        C35460j f = a.mo71949f();
        if (f == null || !f.isInMainFeed()) {
            return false;
        }
        return true;
    }

    public static IIMService createIIMServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IIMService.class);
        if (a != null) {
            return (IIMService) a;
        }
        if (C27991b.f73455aL == null) {
            synchronized (IIMService.class) {
                if (C27991b.f73455aL == null) {
                    C27991b.f73455aL = new IMService();
                }
            }
        }
        return (IMService) C27991b.f73455aL;
    }

    public void fetchFollowList() {
        if (C35265e.m79727a()) {
            if (C34971b.f89988d.mo73068a(C34970a.COLDUP_FULL)) {
                C34971b.m79104a(C34971b.f89988d, C34970a.COLDUP_FULL, false, null, 6, null);
                return;
            }
            C34971b.m79104a(C34971b.f89988d, C34970a.COLDUP_DIFF, false, null, 6, null);
        }
    }

    public List<IMUser> getRecentIMUsers() {
        C34010e a = C34010e.m77748a();
        ArrayList arrayList = new ArrayList();
        List<C11180b> b = C11182d.m22641a().mo20667b();
        if (b != null) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                C11180b bVar = (C11180b) it.next();
                C11207p lastMessage = bVar.getLastMessage();
                long a2 = C11190e.m22685a(bVar.getConversationId());
                if (bVar.getConversationType() != C11170a.f30115a || lastMessage == null || lastMessage.getMsgType() == 15 || a2 <= 0) {
                    it.remove();
                }
            }
            if (b.size() > 10) {
                b = b.subList(0, 10);
            }
            for (C11180b conversationId : b) {
                String valueOf = String.valueOf(C11190e.m22685a(conversationId.getConversationId()));
                IMUser a3 = a.mo71955a(valueOf, C34030j.m77789b(valueOf), true, (C34015a) null);
                if (a3 != null) {
                    a3.setType(1);
                    arrayList.add(a3);
                }
            }
        }
        return arrayList;
    }

    public void setAbInterface(C35428b bVar) {
        this.abInterface = bVar;
    }

    public void setInputMenuCustomizer(C35429a aVar) {
        this.inputMenuCustomizer = aVar;
    }

    public void cleanUpdateTagCount(String str) {
        C34169a.m77980a().mo72159b(str);
    }

    public void deleteIMUser(String str) {
        C34010e.m77748a().mo71966c(str);
    }

    public String getIMContactConversationId(IMContact iMContact) {
        return C34008d.m77743a(iMContact);
    }

    public boolean isXInstalled(Context context) {
        return C35243bl.m79710a(context);
    }

    public void updateNoticeSession(C35456b bVar) {
        C34032k.m77795a().mo71981a(bVar);
    }

    public void addGroupByPassword(String str) {
        C0013i.m18a((Callable<TResult>) new IMService$$Lambda$4<TResult>(str), C0013i.f25b);
    }

    public void cleanFeedUpdateCount(String str) {
        if (!TextUtils.isEmpty(str)) {
            C34169a.m77980a().mo72159b(str);
        }
    }

    public boolean exitUser(String str) {
        if (C34010e.m77748a().mo71964b(str) != null) {
            return true;
        }
        return false;
    }

    public IMUser getIMUserByUid(String str) {
        return C34010e.m77748a().mo71964b(str);
    }

    public C35456b getNoticeSession(String str) {
        return (C35456b) C34032k.m77795a().f87987d.get(str);
    }

    public int getUpdateTagCount(String str) {
        return C34169a.m77980a().mo72157a(str);
    }

    public void onFlipChatMsgBind(Bundle bundle) {
        if (bundle != null) {
            C35284t.m79782a().mo73404b(false);
            onFlipChatLastMsgUpdate(bundle);
        }
    }

    public void onFlipChatUnreadCountUpdate(Bundle bundle) {
        if (bundle != null) {
            onFlipChatUnreadConfigUpdate(bundle);
            C34032k.m77795a().mo71979a(bundle);
        }
    }

    public void openSessionListActivity(Context context) {
        context.startActivity(new Intent(context, SessionListActivity.class));
    }

    public void setNeedToContinuePlayInAct(boolean z) {
        C34004b.m77717a().mo71949f().setNeedToContinueToPlay(z);
    }

    static final /* synthetic */ Void lambda$addGroupByPassword$5$IMService(String str) throws Exception {
        Activity g = C11016e.m22312g();
        if (g == null || TextUtils.isEmpty(str)) {
            return null;
        }
        new GroupCommandInviteDialog(g, str).show();
        return null;
    }

    public void deleteNoticeSession(C35456b bVar) {
        C34032k a = C34032k.m77795a();
        a.f87987d.remove(bVar.bm_());
        a.f87992i.sendEmptyMessage(2);
    }

    public void enableAssociativeEmoji(boolean z) {
        C35284t.m79782a().f90620a.edit().putBoolean("enable_associative_emoji", z).commit();
    }

    public String getConversationId(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        C34004b.m77717a().mo71950g();
        return C11190e.m22687a(Long.valueOf(str).longValue());
    }

    public void showIMNotification(Boolean bool) {
        if (bool.booleanValue()) {
            C34755a.f89518g.mo72828g();
        } else {
            C34755a.f89518g.mo72826e();
        }
    }

    public void updateContactName(IMUser iMUser) {
        if (iMUser != null) {
            IMUser a = C34010e.m77748a().mo71955a(iMUser.getUid(), iMUser.getSecUid(), true, (C34015a) null);
            if (a != null) {
                iMUser.setContactName(a.getContactName());
            }
        }
    }

    public void updateIMUser(final IMUser iMUser) {
        if (iMUser == null) {
            C32458a.m75144a("IMService.updateSimpleUser user = null");
            return;
        }
        if (iMUser.isBlock()) {
            iMUser.setFollowStatus(0);
        }
        C18842a.m45932a(new Runnable() {
            public void run() {
                if (iMUser.getAvatarThumb() == null) {
                    UserStruct userStruct = null;
                    try {
                        userStruct = (UserStruct) C35286u.m79865a().queryUser(iMUser.getUid(), iMUser.getSecUid()).get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                    if (!(userStruct == null || userStruct.getUser() == null)) {
                        userStruct.getUser().setFollowStatus(iMUser.getFollowStatus());
                        IMUser fromUser = IMUser.fromUser(userStruct.getUser());
                        IMService.this.updateContactName(fromUser);
                        C34010e.m77748a().mo71959a(fromUser);
                    }
                    return;
                }
                IMService.this.updateContactName(iMUser);
                C34010e.m77748a().mo71959a(iMUser);
            }
        });
    }

    private static boolean isExistHistoryMsg(IMUser iMUser) {
        C11180b a = C11182d.m22641a().mo20658a(C11190e.m22687a(Long.parseLong(iMUser.getUid())));
        if (a == null) {
            return false;
        }
        if (a.getLastMessage() == null && iMUser.getFollowStatus() == 0 && (iMUser.getType() == 4 || iMUser.getType() == -1)) {
            return false;
        }
        return true;
    }

    private void onFlipChatUnreadConfigUpdate(Bundle bundle) {
        long j = bundle.getLong("flip_chat_msg_last_unread_time");
        long j2 = bundle.getLong("flip_chat_msg_last_unread_dot_time");
        if (j <= C35284t.m79782a().mo73424h()) {
            bundle.putLong("flip_chat_msg_unread_count", 0);
        }
        if (j2 <= C35284t.m79782a().mo73427i()) {
            bundle.putLong("flip_chat_msg_unread_dot_count", 0);
        }
    }

    public void cacheRecentShareContact(IMContact iMContact) {
        C52711k.m112240b(iMContact, "contact");
        if (C10181b.m20511a().mo18168a(ImFeedShareIconOverturnTypeExperiment.class, true, "im_feed_share_icon_type", 31744, 0) == 2) {
            C35102b.f90275b.mo73222a(iMContact);
            return;
        }
        C35102b bVar = C35102b.f90275b;
        bVar.mo73223a("");
        bVar.mo73225b("");
    }

    public String getIMContactUserId(IMContact iMContact) {
        C52711k.m112240b(iMContact, "contact");
        if (iMContact instanceof IMUser) {
            return ((IMUser) iMContact).getUid();
        }
        if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            if (iMConversation.getConversationType() == C11170a.f30115a) {
                return String.valueOf(C11190e.m22685a(iMConversation.getConversationId()));
            }
        }
        return null;
    }

    public void onFlipChatMsgUnbind(boolean z) {
        updateFlipChatConfig(false, "", 0);
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            C0013i.m18a((Callable<TResult>) new Callable<Void>() {
                public Void call() {
                    C34032k.m77795a().mo71990g();
                    return null;
                }
            }, C0013i.f25b);
        } else {
            C34032k.m77795a().mo71990g();
        }
        if (z) {
            C35286u.m79867a(2);
        }
    }

    public void updateIMUserFollowStatus(IMUser iMUser) {
        IMUser a = C34010e.m77748a().mo71955a(iMUser.getUid(), iMUser.getSecUid(), true, (C34015a) null);
        if (a != null) {
            a.setFollowStatus(iMUser.getFollowStatus());
            a.setBlock(iMUser.isBlock());
            iMUser = a;
        }
        updateIMUser(iMUser);
    }

    public void onFlipChatConversationListFinish(Bundle bundle) {
        if (bundle != null) {
            long j = bundle.getLong("flip_chat_msg_last_unread_time");
            long j2 = bundle.getLong("flip_chat_msg_last_unread_dot_time");
            if (j > C35284t.m79782a().mo73424h()) {
                C35284t.m79782a().mo73402b(j);
            }
            if (j2 > C35284t.m79782a().mo73427i()) {
                C35284t.m79782a().mo73406c(j2);
            }
            bundle.putLong("flip_chat_msg_unread_count", 0);
            bundle.putLong("flip_chat_msg_unread_dot_count", 0);
            C34032k.m77795a().mo71979a(bundle);
        }
    }

    public void onFlipChatLastMsgUpdate(Bundle bundle) {
        if (bundle != null) {
            long j = bundle.getLong("flip_chat_msg_update_time");
            StringBuilder sb = new StringBuilder("onFlipChatLastMsgUpdate-updateTime=");
            sb.append(j);
            C18778a.m45854e("im_flip_chat", sb.toString());
            StringBuilder sb2 = new StringBuilder("onFlipChatLastMsgUpdate-spTime=");
            sb2.append(C35284t.m79782a().mo73421g());
            C18778a.m45854e("im_flip_chat", sb2.toString());
            String string = bundle.getString("flip_chat_msg_src_content");
            if (j > C35284t.m79782a().mo73421g() && !TextUtils.isEmpty(string)) {
                C35284t.m79782a().mo73393a(j);
                C35284t.m79782a().mo73404b(false);
            }
            onFlipChatUnreadConfigUpdate(bundle);
            C34032k.m77795a().mo71979a(bundle);
        }
    }

    public void startRelationListActivity(Context context, String str) {
        RelationSelectActivity.m78823a(context, str);
    }

    public void openX(Context context, int i) {
        C35243bl.m79704a(context, i, (Object) null);
    }

    public boolean startChat(Context context, IMUser iMUser) {
        return startChat(context, iMUser, 0);
    }

    static final /* synthetic */ void lambda$showShareDialog$2$IMService(C23371a aVar, String str) {
        if (aVar != null) {
            aVar.run(Boolean.valueOf(false));
        }
    }

    public List<IMUser> searchFollowIMUser(List<IMUser> list, String str) {
        return C34010e.m77748a().mo71957a(list, str);
    }

    public void addSessionListFragmentHeader(Fragment fragment, View view) {
        if (fragment instanceof C34632m) {
            C34632m mVar = (C34632m) fragment;
            if (!view.equals(mVar.f89218a)) {
                mVar.f89218a = view;
            }
            if (mVar.f89219b != null) {
                mVar.f89219b.mo72696c(view);
            }
        }
    }

    public Dialog commentReply(Context context, C35467d dVar) {
        C33304b bVar = new C33304b(context);
        bVar.f86374b = dVar;
        bVar.f86376d = new C33303a(context, dVar) {

            /* renamed from: a */
            final /* synthetic */ Context f86377a;

            /* renamed from: b */
            final /* synthetic */ C35467d f86378b;

            /* renamed from: a */
            public final void mo70637a(final String str) {
                new C33220b(this.f86377a, new C33242d() {
                    public final void sendMsg() {
                        ArrayList arrayList = new ArrayList(2);
                        arrayList.add(CommentContent.obtain(C333072.this.f86378b));
                        arrayList.add(TextContent.obtain(str));
                        C35237bj.m79649a().mo73347b(C333072.this.f86378b.f91142h.getUid(), (List<BaseContent>) arrayList);
                        C10691a.m21549c(C333072.this.f86377a, (int) R.string.bna, 1).mo19066a();
                    }
                }).sendMsg();
            }

            {
                this.f86377a = r1;
                this.f86378b = r2;
            }
        };
        bVar.f86375c = new C33303a() {
            /* renamed from: a */
            public final void mo70637a(String str) {
            }
        };
        C33299a aVar = new C33299a(bVar);
        aVar.show();
        return aVar;
    }

    public void markSessionInMsgHelperRead(int i, int i2) {
        C35284t.m79782a().mo73392a(Math.max(0, C35284t.m79782a().mo73400b() - i2));
        C34032k.m77795a().mo71988e();
    }

    public void onFlipChatPushMsgUpdate(String str, long j) {
        if (!TextUtils.isEmpty(str) && j > 0) {
            updateFlipChatConfig(true, str, j);
            Bundle bundle = new Bundle();
            bundle.putLong("flip_chat_msg_unread_count", 0);
            bundle.putLong("flip_chat_msg_unread_dot_count", 0);
            bundle.putString("flip_chat_msg_content", str);
            bundle.putLong("flip_chat_msg_update_time", j);
            C34032k.m77795a().mo71979a(bundle);
        }
    }

    public boolean startChat(final Context context, final IMContact iMContact) {
        if (iMContact == null) {
            C32458a.m75144a("IMService.startChat contact = null");
            return false;
        } else if (!BaseUserService.getBaseUserService_Monster().isLogin()) {
            C27962e.m66716a((Activity) context);
            return false;
        } else {
            C34008d.m77745a(context, iMContact, (C52670a<C52860x>) new C52670a<C52860x>() {
                public C52860x invoke() {
                    IMUser a = C34010e.m77749a(iMContact);
                    if (a != null) {
                        ChatRoomActivity.m76450a(context, a, 6);
                        String a2 = C11190e.m22687a(Long.valueOf(a.getUid()).longValue());
                        C35190af.m79442a();
                        C35190af.m79468a(a2, a.getUid(), "private", "share_toast", "", ChatRoomActivity.m76444a());
                    }
                    return null;
                }
            });
            return true;
        }
    }

    public void wrapperIMShareText(Context context, TextView textView) {
        String str;
        textView.setVisibility(0);
        C35469f fVar = C34004b.m77717a().mo71949f().getIMSetting().f91147e;
        if (fVar != null) {
            str = fVar.f91181u;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = C34004b.m77717a().mo71949f().getFriendToFamiliarStr(R.string.bq5, R.string.gji, R.string.gjj);
        }
        textView.setText(str);
    }

    public void commandShareVideo(final Context context, final C35466c cVar) {
        final IMUser iMUser;
        CommandShareContent obtain = CommandShareContent.obtain(cVar);
        if (cVar.f91134f != null) {
            iMUser = cVar.f91134f;
        } else {
            iMUser = C34010e.m77748a().mo71964b(cVar.f91132d);
        }
        if (iMUser == null || isExistHistoryMsg(iMUser)) {
            if (iMUser != null) {
                C35237bj.m79649a().mo73340a(iMUser.getUid(), (BaseContent) obtain);
            }
            C41302w a = C41302w.m91042a();
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(cVar.f91129a);
            a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("from_uid", cVar.f91132d).mo83871a());
            return;
        }
        C35237bj.m79649a().mo73341a(iMUser.getUid(), (BaseContent) obtain, (C35241a) new C35241a() {
            public void onSendFailure(C11202k kVar) {
            }

            public void onSendSuccess(C11207p pVar) {
            }

            public void onSend(C11180b bVar, List<C11207p> list) {
                ChatRoomActivity.m76453a(context, iMUser, 1, cVar.f91132d, null, null);
                C35190af.m79442a();
                C35190af.m79468a(bVar.getConversationId(), iMUser.getUid(), "private", "token", "", ChatRoomActivity.m76444a());
            }
        });
    }

    public void onNewNoticeArrived(int i, final Bundle bundle) {
        long j;
        if (i == 1) {
            C34684c.m78664a().mo72745a(new C34687b() {
                public void onFetch(C34597i iVar) {
                    if (iVar != null) {
                        C34595h a = C34595h.m78547a(iVar);
                        a.f91119j = bundle.getInt("unread_count");
                        C34032k.m77795a().mo71981a((C35456b) a);
                        return;
                    }
                    C34032k.m77795a().mo71982a("stranger_1");
                }
            });
        } else if (i == 3) {
            C34595h hVar = new C34595h();
            long j2 = bundle.getLong("last_create_time");
            String string = bundle.getString("from_user_name");
            String string2 = bundle.getString("from_user_content");
            int i2 = bundle.getInt("from_user_msg_type");
            int i3 = bundle.getInt("unread_count");
            boolean z = bundle.getBoolean("is_recalled");
            String string3 = bundle.getString("from_user_id");
            if (TextUtils.isEmpty(string3)) {
                j = 0;
            } else {
                j = Long.parseLong(string3);
            }
            hVar.f91117h = C33888y.content(i2, string2, z, j).getMsgHint();
            hVar.mo73751a(j2);
            hVar.f91119j = i3;
            hVar.f91116g = string;
            C34032k.m77795a().mo71981a((C35456b) hVar);
        } else {
            if (i == 4) {
                C53755c.m114319a().mo112960d(new C34550g());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void wrapperSendMessageSyncXIcon(com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView r6, int r7) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.im.sdk.d.b r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            com.ss.android.ugc.aweme.im.service.j r0 = r0.mo71949f()
            boolean r0 = r0.enableIM()
            r1 = 8
            if (r0 != 0) goto L_0x0014
            r6.setVisibility(r1)
            return
        L_0x0014:
            boolean r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl.m79709a()
            r2 = 13
            r3 = 0
            if (r0 == 0) goto L_0x0084
            r6.setVisibility(r3)
            com.ss.android.ugc.aweme.im.sdk.d.b r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            com.ss.android.ugc.aweme.im.service.j r0 = r0.mo71949f()
            com.ss.android.ugc.aweme.im.service.model.e r0 = r0.getIMSetting()
            com.ss.android.ugc.aweme.im.service.model.f r0 = r0.f91147e
            r3 = 2131954112(0x7f1309c0, float:1.9544714E38)
            r4 = 0
            if (r7 == r2) goto L_0x0067
            switch(r7) {
                case 2: goto L_0x005a;
                case 3: goto L_0x004d;
                case 4: goto L_0x0039;
                default: goto L_0x0037;
            }
        L_0x0037:
            r7 = r4
            goto L_0x007b
        L_0x0039:
            boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl.m79712b()
            if (r7 == 0) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.im.service.model.g r7 = r0.f91175o
            goto L_0x0045
        L_0x0044:
            r7 = r4
        L_0x0045:
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl.m79708a(r6, r3)
            goto L_0x007b
        L_0x0049:
            r6.setVisibility(r1)
            goto L_0x0037
        L_0x004d:
            if (r0 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.im.service.model.g r7 = r0.f91167g
            goto L_0x0053
        L_0x0052:
            r7 = r4
        L_0x0053:
            r0 = 2131954175(0x7f1309ff, float:1.9544842E38)
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl.m79708a(r6, r0)
            goto L_0x007b
        L_0x005a:
            if (r0 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.im.service.model.g r7 = r0.f91166f
            goto L_0x0060
        L_0x005f:
            r7 = r4
        L_0x0060:
            r0 = 2131954176(0x7f130a00, float:1.9544844E38)
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl.m79708a(r6, r0)
            goto L_0x007b
        L_0x0067:
            boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl.m79712b()
            if (r7 == 0) goto L_0x0077
            if (r0 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.im.service.model.g r7 = r0.f91185y
            goto L_0x0073
        L_0x0072:
            r7 = r4
        L_0x0073:
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl.m79708a(r6, r3)
            goto L_0x007b
        L_0x0077:
            r6.setVisibility(r1)
            goto L_0x0037
        L_0x007b:
            if (r7 != 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r7.f91187a
        L_0x0080:
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r6, r4)
            return
        L_0x0084:
            r0 = 4
            if (r7 == r0) goto L_0x008a
            if (r7 == r2) goto L_0x008a
            goto L_0x0093
        L_0x008a:
            r6.setVisibility(r3)
            r7 = 2131954282(0x7f130a6a, float:1.9545059E38)
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl.m79708a(r6, r7)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices.IMService.wrapperSendMessageSyncXIcon(com.ss.android.ugc.aweme.base.ui.RemoteImageView, int):void");
    }

    public void wrapperSyncXBlockWithDialog(Context context, boolean z, OnClickListener onClickListener) {
        C35243bl.m79707a(context, z, onClickListener);
    }

    public void wrapperIMShareIcon(Context context, RemoteImageView remoteImageView, int i) {
        C35125c.m79356a((Runnable) new IMService$$Lambda$2(context, remoteImageView, i));
    }

    public void wrapperShareToX(Activity activity, Bundle bundle, int i) {
        if (bundle != null) {
            C35243bl.m79701a(activity, bundle.get("share_package"), i);
        }
    }

    public boolean startChat(Context context, IMUser iMUser, int i) {
        if (iMUser == null) {
            C32458a.m75144a("IMService.startChat user = null");
            return false;
        } else if (BaseUserService.getBaseUserService_Monster().isLogin()) {
            return ChatRoomActivity.m76450a(context, iMUser, i);
        } else {
            C27962e.m66716a((Activity) context);
            return false;
        }
    }

    public void enterChooseContact(Context context, Bundle bundle, C23371a<Boolean> aVar) {
        if (!BaseUserService.getBaseUserService_Monster().isLogin()) {
            C27962e.m66716a((Activity) context);
            return;
        }
        if (bundle != null) {
            int i = bundle.getInt("key_share_type", -1);
            if (i == 8) {
                wrapperShareToX(C11016e.m22312g(), bundle, i);
                return;
            }
        }
        RelationSelectActivity.m78822a(context, bundle, aVar);
    }

    public boolean startChatWithAdLog(Context context, IMUser iMUser, C35464a aVar) {
        if (iMUser == null) {
            C32458a.m75144a("IMService.startChat user = null");
            return false;
        } else if (!BaseUserService.getBaseUserService_Monster().isLogin()) {
            C27962e.m66716a((Activity) context);
            return false;
        } else {
            ChatRoomActivity.m76452a(context, iMUser, 0, aVar, null);
            return true;
        }
    }

    private void updateFlipChatConfig(boolean z, String str, long j) {
        C35284t.m79782a().mo73393a(0);
        C35284t.m79782a().mo73404b(false);
        C35284t.m79782a().mo73402b(0);
        C35284t.m79782a().mo73406c(0);
        C35284t.m79782a().f90620a.edit().putBoolean("flip_chat_push_click_show_state", z).commit();
        C35284t.m79782a().f90620a.edit().putString("flip_chat_push_click_show_desc", str).commit();
        C35284t.m79782a().f90620a.edit().putLong("flip_chat_push_click_show_time", j).commit();
    }

    public void initialize(Application application, C35421a aVar, C35460j jVar) {
        String str;
        int i;
        inst = this;
        if (aVar != null) {
            C35268h.f90601b = aVar.f91096e;
            C35268h.f90600a = aVar.f91093b;
            C35268h.f90604e = aVar.f91095d;
            C35268h.f90603d = aVar.f91094c;
        }
        StringBuilder sb = new StringBuilder("checkDomainInit: ");
        if (aVar != null) {
            str = aVar.f91096e;
        } else {
            str = null;
        }
        sb.append(str);
        if (aVar == null) {
            C35263c.m79719a();
            C35263c.m79720a(2);
        } else {
            String str2 = aVar.f91096e;
            C52711k.m112236a((Object) str2, "config.apiHost");
            if (!C35263c.m79722b(str2)) {
                C35263c.m79719a();
                C35263c.m79720a(1);
            }
        }
        if (jVar != null) {
            i = jVar.getXPlanStyle();
        } else {
            i = 0;
        }
        this.xplanStyle = i;
        C34004b.m77717a().mo71946a(application, aVar, jVar);
    }

    public boolean startChatWithExt(Context context, IMUser iMUser, Serializable serializable) {
        if (iMUser == null) {
            C32458a.m75144a("IMService.startChat user = null");
            return false;
        } else if (!BaseUserService.getBaseUserService_Monster().isLogin()) {
            C27962e.m66716a((Activity) context);
            return false;
        } else {
            ChatRoomActivity.m76452a(context, iMUser, 0, null, serializable);
            return true;
        }
    }

    static final /* synthetic */ void lambda$wrapperIMShareIcon$3$IMService(Context context, RemoteImageView remoteImageView, int i) {
        boolean z = true;
        if (C35125c.m79355a() != 1) {
            z = false;
        }
        remoteImageView.setVisibility(0);
        C35469f fVar = C34004b.m77717a().mo71949f().getIMSetting().f91147e;
        C35470g gVar = null;
        switch (i) {
            case 0:
            case 2:
                if (fVar != null) {
                    gVar = fVar.f91177q;
                }
                if (gVar == null || gVar.f91187a == null) {
                    remoteImageView.setImageDrawable(context.getResources().getDrawable(R.drawable.b0_));
                    break;
                } else {
                    C35243bl.m79711b(remoteImageView, R.drawable.b0_);
                    C23515d.m57669a(remoteImageView, gVar.f91187a);
                    return;
                }
            case 1:
            case 4:
                boolean isXPlanRedPacketOpen = C34004b.m77717a().mo71949f().isXPlanRedPacketOpen();
                if (fVar != null) {
                    if (!z || !C35243bl.m79712b() || !isXPlanRedPacketOpen) {
                        gVar = fVar.f91177q;
                    } else {
                        gVar = fVar.f91179s;
                    }
                }
                if (gVar == null || gVar.f91187a == null) {
                    remoteImageView.setImageDrawable(context.getResources().getDrawable(R.drawable.b0_));
                    return;
                }
                C35243bl.m79711b(remoteImageView, R.drawable.b0_);
                C23515d.m57669a(remoteImageView, gVar.f91187a);
                return;
            case 3:
                if (fVar != null) {
                    gVar = fVar.f91178r;
                }
                if (gVar == null || gVar.f91187a == null) {
                    remoteImageView.setImageDrawable(context.getResources().getDrawable(R.drawable.b0a));
                    return;
                }
                C35243bl.m79711b(remoteImageView, R.drawable.b0a);
                C23515d.m57669a(remoteImageView, gVar.f91187a);
                return;
        }
    }

    public void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable) {
        C35243bl.m79705a(context, i, z, runnable);
    }

    public void wrapperSyncXStory(Activity activity, C35472i iVar, int i, C35423b bVar) {
        C35243bl.m79702a(activity, (Object) iVar, i, bVar);
    }

    public String convertSearchKeyword(String str, String str2, String str3, String str4) {
        return C34839a.m78903a(str, str2, str3, str4);
    }

    public void shareSingleMsg(Context context, IMContact iMContact, SharePackage sharePackage, C23371a<Boolean> aVar) {
        if (sharePackage != null) {
            new C33220b(context, new C35110d(iMContact, sharePackage, aVar)).sendMsg();
        }
    }

    public void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i, Serializable serializable) {
        final int i2 = i;
        final Activity activity2 = activity;
        final IMUser iMUser2 = iMUser;
        final Serializable serializable2 = serializable;
        C347795 r0 = new Runnable() {
            public void run() {
                if (i2 == 2) {
                    IMService.this.startChatWithExt(activity2, iMUser2, 5, serializable2);
                } else if (i2 == 3) {
                    IMService.this.startChatWithExt(activity2, iMUser2, 10, serializable2);
                } else {
                    IMService.this.startChatWithExt(activity2, iMUser2, serializable2);
                }
            }
        };
        C35243bl.m79700a(activity, iMUser, i, (Runnable) r0);
    }

    public void showShareDialog(Activity activity, SharePackage sharePackage, IMUser iMUser, C23371a<Boolean> aVar) {
        IMUser[] iMUserArr = {iMUser};
        IMService$$Lambda$0 iMService$$Lambda$0 = new IMService$$Lambda$0(activity, sharePackage, iMUser, aVar);
        IMService$$Lambda$1 iMService$$Lambda$1 = new IMService$$Lambda$1(aVar);
        C35409a aVar2 = new C35409a(activity);
        aVar2.f91017c = iMUserArr;
        aVar2.f91016b = null;
        aVar2.mo73687a(sharePackage).mo73686a((C35109a) iMService$$Lambda$1).mo73692b((C35109a) iMService$$Lambda$0).mo73685a(416).mo73691b(335).mo73688a("").mo73690a().show();
    }

    public boolean startChatWithExt(Context context, IMUser iMUser, int i, Serializable serializable) {
        if (iMUser == null) {
            C32458a.m75144a("IMService.startChat user = null");
            return false;
        } else if (!BaseUserService.getBaseUserService_Monster().isLogin()) {
            C27962e.m66716a((Activity) context);
            return false;
        } else {
            ChatRoomActivity.m76452a(context, iMUser, i, null, serializable);
            return true;
        }
    }

    public void storyMessageReply(Context context, Bundle bundle, Runnable runnable, Runnable runnable2) {
        if (bundle != null) {
            SharePackage sharePackage = (SharePackage) bundle.get("share_package");
            if (sharePackage != null) {
                C52711k.m112240b(context, "context");
                C52711k.m112240b(sharePackage, "sharePackage");
                new C33220b(context, new C34394a(sharePackage, context, runnable, runnable2)).sendMsg();
            }
        }
    }

    static final /* synthetic */ void lambda$null$0$IMService(SharePackage sharePackage, IMUser iMUser, String str, C23371a aVar) {
        BaseContent b = C35106c.m79334b(sharePackage);
        if (TextUtils.equals(sharePackage.f106895d, "poi")) {
            SharePoiContent sharePoiContent = (SharePoiContent) b;
            if (sharePoiContent != null) {
                String uri = sharePoiContent.getMapUrl().getUri();
                if (uri.startsWith("file://")) {
                    C33440v.m76638a().mo70846a(uri.substring(7), (C33445y) new C33445y(sharePoiContent, iMUser, str) {

                        /* renamed from: a */
                        final /* synthetic */ SharePoiContent f90283a;

                        /* renamed from: b */
                        final /* synthetic */ IMUser f90284b;

                        /* renamed from: c */
                        final /* synthetic */ String f90285c;

                        /* renamed from: a */
                        public final void mo70782a() {
                        }

                        /* renamed from: a */
                        public final void mo70783a(double d) {
                        }

                        /* renamed from: a */
                        public final void mo70785a(Throwable th) {
                        }

                        /* renamed from: a */
                        public final void mo70784a(String str) {
                            C35106c.m79328a(this.f90284b, this.f90285c, (BaseContent) this.f90283a);
                        }

                        /* renamed from: a */
                        public final void mo70787a(String str, UrlModel urlModel) {
                            this.f90283a.setMapUrl(urlModel);
                            C35106c.m79328a(this.f90284b, this.f90285c, (BaseContent) this.f90283a);
                        }

                        {
                            this.f90283a = r1;
                            this.f90284b = r2;
                            this.f90285c = r3;
                        }
                    });
                } else {
                    C35106c.m79328a(iMUser, str, b);
                }
            }
        } else {
            C35106c.m79328a(iMUser, str, b);
        }
        if (aVar != null) {
            aVar.run(Boolean.valueOf(true));
        }
    }

    public boolean startChat(Context context, IMContact iMContact, String str, String str2) {
        if (iMContact == null) {
            C32458a.m75144a("IMService.startChat contact = null");
            return false;
        } else if (!BaseUserService.getBaseUserService_Monster().isLogin()) {
            C27962e.m66716a((Activity) context);
            return false;
        } else {
            final IMContact iMContact2 = iMContact;
            final Context context2 = context;
            final String str3 = str2;
            final String str4 = str;
            C347762 r1 = new C52670a<C52860x>() {
                public C52860x invoke() {
                    IMUser a = C34010e.m77749a(iMContact2);
                    if (a != null) {
                        ChatRoomActivity.m76450a(context2, a, 6);
                        String a2 = C11190e.m22687a(Long.parseLong(a.getUid()));
                        C35190af.m79442a();
                        C35190af.m79468a(a2, a.getUid(), "private", str3, str4, ChatRoomActivity.m76444a());
                    }
                    return null;
                }
            };
            C34008d.m77747a(context, iMContact, str, str2, r1);
            return true;
        }
    }

    public boolean startChatWithAdLog(Context context, IMUser iMUser, C35464a aVar, Serializable serializable) {
        if (iMUser == null) {
            C32458a.m75144a("IMService.startChat user = null");
            return false;
        } else if (!BaseUserService.getBaseUserService_Monster().isLogin()) {
            C27962e.m66716a((Activity) context);
            return false;
        } else {
            ChatRoomActivity.m76452a(context, iMUser, 5, aVar, serializable);
            return true;
        }
    }

    public boolean startChatFromPush(Context context, String str, String str2, String str3, boolean z) {
        C52711k.m112240b(context, "context");
        return false;
    }

    public void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable, C35423b bVar) {
        C35243bl.m79706a(context, i, z, runnable, bVar);
    }

    public void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i, C35464a aVar, Serializable serializable) {
        final Activity activity2 = activity;
        final IMUser iMUser2 = iMUser;
        final C35464a aVar2 = aVar;
        final Serializable serializable2 = serializable;
        C347806 r0 = new Runnable() {
            public void run() {
                ChatRoomActivity.m76452a(activity2, iMUser2, 5, aVar2, serializable2);
            }
        };
        C35243bl.m79700a(activity, iMUser, i, (Runnable) r0);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$wrapperVideoShareBtnImIconAndText$4$IMService(RemoteImageView remoteImageView, C23371a aVar, Context context, int i, Boolean bool) {
        if (bool.booleanValue()) {
            C52711k.m112240b(remoteImageView, "imageView");
            C13837e eVar = new C13837e();
            eVar.mo25937a(true);
            C13833a aVar2 = (C13833a) remoteImageView.getHierarchy();
            C52711k.m112236a((Object) aVar2, "imageView.hierarchy");
            aVar2.mo25899a(eVar);
            C13833a aVar3 = (C13833a) remoteImageView.getHierarchy();
            C52711k.m112236a((Object) aVar3, "imageView.hierarchy");
            aVar3.mo25898a(C13818b.f36066f);
            remoteImageView.setPadding(4, 4, 4, 4);
            C23515d.m57677a(remoteImageView, C35102b.f90275b.mo73221a());
            if (aVar != null) {
                aVar.run("");
            }
        } else {
            wrapperIMShareIcon(context, remoteImageView, i);
        }
    }

    public void startSelectChatMsg(Context context, String str, IMUser iMUser, int i, String str2) {
        Integer num;
        int i2;
        if (i == 1) {
            Bundle bundle = new Bundle();
            bundle.putInt("select_msg_type", i);
            if (TextUtils.isEmpty(str2)) {
                C33707b.m77192a(str);
            }
            if (!TextUtils.isEmpty(str)) {
                if (iMUser != null) {
                    bundle.putSerializable("simple_uesr", iMUser);
                }
                HashMap<String, Integer> hashMap = C33707b.f87418b;
                if (hashMap != null) {
                    num = (Integer) hashMap.get(str);
                } else {
                    num = null;
                }
                if (num == null) {
                    i2 = 0;
                } else {
                    i2 = num.intValue();
                }
                C52711k.m112240b(context, "context");
                BaseChatRoomActivity.m76446a(context, str, i2, bundle, SelectChatMsgActivity.class);
            }
        }
    }

    public void wrapperVideoShareBtnImIconAndText(boolean z, Context context, RemoteImageView remoteImageView, TextView textView, int i, C23371a<String> aVar) {
        if (C35103a.m79323a()) {
            IMService$$Lambda$3 iMService$$Lambda$3 = new IMService$$Lambda$3(this, remoteImageView, aVar, context, i);
            C52711k.m112240b(iMService$$Lambda$3, "callback");
            new C34983g(new C34958a(1, z)).m78958a(new C35104a(iMService$$Lambda$3), new C35105b(iMService$$Lambda$3), C34876e.f89837a, C34877f.f89838a).mo72991f();
            return;
        }
        wrapperIMShareIcon(context, remoteImageView, i);
    }
}
