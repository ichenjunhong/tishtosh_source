package com.p683ss.android.ugc.aweme.p1807im.service;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
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
import java.io.File;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.service.IIMService */
public interface IIMService {
    void addGroupByPassword(String str);

    void addSessionListFragmentHeader(Fragment fragment, View view);

    void cacheRecentShareContact(IMContact iMContact);

    boolean canFetchFollowListIdle();

    boolean canShowLiveNotification();

    void cleanFeedUpdateCount(String str);

    void cleanUpdateTagCount(String str);

    boolean clearAudioDownloadCache();

    void clearIMNotification();

    void commandShareVideo(Context context, C35466c cVar);

    Dialog commentReply(Context context, C35467d dVar);

    String convertSearchKeyword(String str, String str2, String str3, String str4);

    void deleteIMUser(String str);

    void deleteNoticeSession(C35456b bVar);

    void enableAssociativeEmoji(boolean z);

    void ensureIMState();

    void enterChooseContact(Context context, Bundle bundle, C23371a<Boolean> aVar);

    boolean exitUser(String str);

    void fetchFollowList();

    void forceRefreshSessionList();

    C35428b getAbInterface();

    List<IMUser> getAllFollowIMUsers();

    List<IMUser> getAllFriends();

    File getAudioDownloadCachePath();

    String getConversationId(String str);

    C35446a getExperimentService();

    C35447b getFamiliarService();

    String getIMContactConversationId(IMContact iMContact);

    String getIMContactUserId(IMContact iMContact);

    C35445g getIMErrorMonitor();

    IMUser getIMUserByUid(String str);

    C50829b getImParser();

    C35429a getInputMenuCustomizer();

    C35448c getMixBusinessService();

    C35456b getNoticeSession(String str);

    C35449d getNotificationService();

    List<IMUser> getRecentIMUsers();

    C35437a getRelationSelectFragment();

    C35450e getRelationService();

    Class getSessionListActivityClass();

    C35437a getSessionListFragment();

    C35451f getShareService();

    int getUpdateTagCount(String str);

    void hideIMNotification();

    void hideLiveNotification();

    void initialize(Application application, C35421a aVar, C35460j jVar);

    boolean isAssociativeEmojiEnabled();

    boolean isImReduction();

    boolean isInMainFeed();

    boolean isNeedToContinuePlayInAct();

    boolean isNotificationMessageQueueEmpty();

    boolean isXInstalled(Context context);

    boolean isXPlanB();

    boolean isXPlanOpen();

    void loadWcdbLibrary();

    void markSessionInMsgHelperRead(int i, int i2);

    boolean needShowNoticeDot();

    void onBlockUserSuccessEvent();

    void onFlipChatConversationListFinish(Bundle bundle);

    void onFlipChatLastMsgUpdate(Bundle bundle);

    void onFlipChatMsgBind(Bundle bundle);

    void onFlipChatMsgUnbind(boolean z);

    void onFlipChatPushMsgUpdate(String str, long j);

    void onFlipChatUnreadCountUpdate(Bundle bundle);

    void onNewNoticeArrived(int i, Bundle bundle);

    void openSessionListActivity(Context context);

    void openX(Context context, int i);

    void refreshLoginState();

    void resetLoginState();

    List<IMUser> searchFollowIMUser(List<IMUser> list, String str);

    void setAbInterface(C35428b bVar);

    void setInputMenuCustomizer(C35429a aVar);

    void setNeedToContinuePlayInAct(boolean z);

    void shareSingleMsg(Context context, IMContact iMContact, SharePackage sharePackage, C23371a<Boolean> aVar);

    void showIMNotification(Boolean bool);

    void showLiveNotification();

    void showShareDialog(Activity activity, SharePackage sharePackage, IMUser iMUser, C23371a<Boolean> aVar);

    boolean startChat(Context context, IMContact iMContact);

    boolean startChat(Context context, IMContact iMContact, String str, String str2);

    boolean startChat(Context context, IMUser iMUser);

    boolean startChat(Context context, IMUser iMUser, int i);

    boolean startChatFromPush(Context context, String str, String str2, String str3, boolean z);

    boolean startChatWithAdLog(Context context, IMUser iMUser, C35464a aVar);

    boolean startChatWithAdLog(Context context, IMUser iMUser, C35464a aVar, Serializable serializable);

    boolean startChatWithExt(Context context, IMUser iMUser, int i, Serializable serializable);

    boolean startChatWithExt(Context context, IMUser iMUser, Serializable serializable);

    void startRelationListActivity(Context context, String str);

    void startSelectChatMsg(Context context, String str, IMUser iMUser, int i, String str2);

    void storyMessageReply(Context context, Bundle bundle, Runnable runnable, Runnable runnable2);

    void tabChangeToNotification();

    void updateIMUser(IMUser iMUser);

    void updateIMUserFollowStatus(IMUser iMUser);

    void updateNoticeSession(C35456b bVar);

    void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i, C35464a aVar, Serializable serializable);

    void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i, Serializable serializable);

    void wrapperIMShareIcon(Context context, RemoteImageView remoteImageView, int i);

    void wrapperIMShareText(Context context, TextView textView);

    void wrapperSendMessageSyncXIcon(RemoteImageView remoteImageView, int i);

    void wrapperShareToX(Activity activity, Bundle bundle, int i);

    void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable);

    void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable, C35423b bVar);

    void wrapperSyncXBlockWithDialog(Context context, boolean z, OnClickListener onClickListener);

    void wrapperSyncXStory(Activity activity, C35472i iVar, int i, C35423b bVar);

    void wrapperVideoShareBtnImIconAndText(boolean z, Context context, RemoteImageView remoteImageView, TextView textView, int i, C23371a<String> aVar);
}
