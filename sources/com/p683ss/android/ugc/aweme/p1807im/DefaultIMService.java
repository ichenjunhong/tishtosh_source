package com.p683ss.android.ugc.aweme.p1807im;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1632di.C27622bi;
import com.p683ss.android.ugc.aweme.p1807im.service.C35421a;
import com.p683ss.android.ugc.aweme.p1807im.service.C35428b;
import com.p683ss.android.ugc.aweme.p1807im.service.C35445g;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35464a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35466c;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35467d;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35472i;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35423b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1900b.C35429a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1903e.C35437a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35446a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35447b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35448c;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35449d;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35450e;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35451f;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.websocket.p2539b.p2542c.C50829b;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.DefaultIMService */
public final class DefaultIMService implements IIMService {
    private static DefaultIMService sInstance;

    private DefaultIMService() {
    }

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

    public final void addGroupByPassword(String str) {
    }

    public final void addSessionListFragmentHeader(Fragment fragment, View view) {
    }

    public final void cacheRecentShareContact(IMContact iMContact) {
    }

    public final boolean canFetchFollowListIdle() {
        return false;
    }

    public final boolean canShowLiveNotification() {
        return false;
    }

    public final void cleanFeedUpdateCount(String str) {
    }

    public final void cleanUpdateTagCount(String str) {
    }

    public final boolean clearAudioDownloadCache() {
        return false;
    }

    public final void clearIMNotification() {
    }

    public final void commandShareVideo(Context context, C35466c cVar) {
    }

    public final Dialog commentReply(Context context, C35467d dVar) {
        return null;
    }

    public final String convertSearchKeyword(String str, String str2, String str3, String str4) {
        return null;
    }

    public final void deleteIMUser(String str) {
    }

    public final void deleteNoticeSession(C35456b bVar) {
    }

    public final void enableAssociativeEmoji(boolean z) {
    }

    public final void ensureIMState() {
    }

    public final void enterChooseContact(Context context, Bundle bundle, C23371a<Boolean> aVar) {
    }

    public final boolean exitUser(String str) {
        return false;
    }

    public final void fetchFollowList() {
    }

    public final void forceRefreshSessionList() {
    }

    public final C35428b getAbInterface() {
        return null;
    }

    public final List<IMUser> getAllFollowIMUsers() {
        return null;
    }

    public final List<IMUser> getAllFriends() {
        return null;
    }

    public final File getAudioDownloadCachePath() {
        return null;
    }

    public final String getConversationId(String str) {
        return "";
    }

    public final C35446a getExperimentService() {
        return null;
    }

    public final C35447b getFamiliarService() {
        return null;
    }

    public final String getIMContactConversationId(IMContact iMContact) {
        return null;
    }

    public final String getIMContactUserId(IMContact iMContact) {
        return null;
    }

    public final C35445g getIMErrorMonitor() {
        return null;
    }

    public final IMUser getIMUserByUid(String str) {
        return null;
    }

    public final C50829b getImParser() {
        return null;
    }

    public final C35429a getInputMenuCustomizer() {
        return null;
    }

    public final C35448c getMixBusinessService() {
        return null;
    }

    public final C35456b getNoticeSession(String str) {
        return null;
    }

    public final C35449d getNotificationService() {
        return null;
    }

    public final List<IMUser> getRecentIMUsers() {
        return null;
    }

    public final C35437a getRelationSelectFragment() {
        return null;
    }

    public final C35450e getRelationService() {
        return null;
    }

    public final Class getSessionListActivityClass() {
        return null;
    }

    public final C35437a getSessionListFragment() {
        return null;
    }

    public final C35451f getShareService() {
        return null;
    }

    public final int getUpdateTagCount(String str) {
        return 0;
    }

    public final void hideIMNotification() {
    }

    public final void hideLiveNotification() {
    }

    public final void initialize(Application application, C35421a aVar, C35460j jVar) {
    }

    public final boolean isAssociativeEmojiEnabled() {
        return true;
    }

    public final boolean isImReduction() {
        return false;
    }

    public final boolean isInMainFeed() {
        return false;
    }

    public final boolean isNeedToContinuePlayInAct() {
        return false;
    }

    public final boolean isNotificationMessageQueueEmpty() {
        return true;
    }

    public final boolean isXInstalled(Context context) {
        return false;
    }

    public final boolean isXPlanB() {
        return false;
    }

    public final boolean isXPlanOpen() {
        return false;
    }

    public final void loadWcdbLibrary() {
    }

    public final void markSessionInMsgHelperRead(int i, int i2) {
    }

    public final boolean needShowNoticeDot() {
        return false;
    }

    public final void onBlockUserSuccessEvent() {
    }

    public final void onFlipChatConversationListFinish(Bundle bundle) {
    }

    public final void onFlipChatLastMsgUpdate(Bundle bundle) {
    }

    public final void onFlipChatMsgBind(Bundle bundle) {
    }

    public final void onFlipChatMsgUnbind(boolean z) {
    }

    public final void onFlipChatPushMsgUpdate(String str, long j) {
    }

    public final void onFlipChatUnreadCountUpdate(Bundle bundle) {
    }

    public final void onNewNoticeArrived(int i, Bundle bundle) {
    }

    public final void openSessionListActivity(Context context) {
    }

    public final void openX(Context context, int i) {
    }

    public final void refreshLoginState() {
    }

    public final void resetLoginState() {
    }

    public final List<IMUser> searchFollowIMUser(List<IMUser> list, String str) {
        return null;
    }

    public final void setAbInterface(C35428b bVar) {
    }

    public final void setInputMenuCustomizer(C35429a aVar) {
    }

    public final void setNeedToContinuePlayInAct(boolean z) {
    }

    public final void shareSingleMsg(Context context, IMContact iMContact, SharePackage sharePackage, C23371a<Boolean> aVar) {
    }

    public final void showIMNotification(Boolean bool) {
    }

    public final void showLiveNotification() {
    }

    public final void showShareDialog(Activity activity, SharePackage sharePackage, IMUser iMUser, C23371a<Boolean> aVar) {
    }

    public final boolean startChat(Context context, IMContact iMContact) {
        return false;
    }

    public final boolean startChat(Context context, IMContact iMContact, String str, String str2) {
        return false;
    }

    public final boolean startChat(Context context, IMUser iMUser) {
        return false;
    }

    public final boolean startChat(Context context, IMUser iMUser, int i) {
        return false;
    }

    public final boolean startChatFromPush(Context context, String str, String str2, String str3, boolean z) {
        return false;
    }

    public final boolean startChatWithAdLog(Context context, IMUser iMUser, C35464a aVar) {
        return false;
    }

    public final boolean startChatWithAdLog(Context context, IMUser iMUser, C35464a aVar, Serializable serializable) {
        return false;
    }

    public final boolean startChatWithExt(Context context, IMUser iMUser, int i, Serializable serializable) {
        return false;
    }

    public final boolean startChatWithExt(Context context, IMUser iMUser, Serializable serializable) {
        return false;
    }

    public final void startRelationListActivity(Context context, String str) {
    }

    public final void startSelectChatMsg(Context context, String str, IMUser iMUser, int i, String str2) {
    }

    public final void tabChangeToNotification() {
    }

    public final void updateIMUser(IMUser iMUser) {
    }

    public final void updateIMUserFollowStatus(IMUser iMUser) {
    }

    public final void updateNoticeSession(C35456b bVar) {
    }

    public final void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i, C35464a aVar, Serializable serializable) {
    }

    public final void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i, Serializable serializable) {
    }

    public final void wrapperIMShareIcon(Context context, RemoteImageView remoteImageView, int i) {
    }

    public final void wrapperIMShareText(Context context, TextView textView) {
    }

    public final void wrapperSendMessageSyncXIcon(RemoteImageView remoteImageView, int i) {
    }

    public final void wrapperShareToX(Activity activity, Bundle bundle, int i) {
    }

    public final void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable, C35423b bVar) {
    }

    public final void wrapperSyncXStory(Activity activity, C35472i iVar, int i, C35423b bVar) {
    }

    public final void wrapperVideoShareBtnImIconAndText(boolean z, Context context, RemoteImageView remoteImageView, TextView textView, int i, C23371a<String> aVar) {
    }

    public static DefaultIMService inst() {
        if (sInstance == null) {
            synchronized (DefaultIMService.class) {
                if (sInstance == null) {
                    sInstance = new DefaultIMService();
                }
            }
        }
        return sInstance;
    }

    public final void wrapperSyncXBlockWithDialog(Context context, boolean z, OnClickListener onClickListener) {
        new C10643a(context).mo18899b((int) R.string.bf7).mo18886a((int) R.string.ah2, onClickListener).mo18900b((int) R.string.wf, onClickListener).mo18897a().mo18882b();
    }

    public final void storyMessageReply(Context context, Bundle bundle, Runnable runnable, Runnable runnable2) {
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public final void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
