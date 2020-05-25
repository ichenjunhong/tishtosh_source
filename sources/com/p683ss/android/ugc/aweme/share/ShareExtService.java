package com.p683ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.p043v7.app.AppCompatActivity;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.setting.C41526ag;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import java.util.Comparator;
import p064c.p065a.C2193n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.share.ShareExtService */
public interface ShareExtService {

    /* renamed from: com.ss.android.ugc.aweme.share.ShareExtService$a */
    public static final class C41924a {
    }

    void addShareRecord(String str, int i);

    Drawable channelDrawable(Activity activity, String str);

    Comparator<C42307b> channelServerOrder();

    boolean checkDownloadPermission(Activity activity);

    void checkDownloadStoragePermission(Activity activity, C52670a<C52860x> aVar);

    boolean checkShareAllowStatus(Aweme aweme, Context context);

    void copyContentToClipBoard(Context context, String str, String str2);

    C42357g getCopyAwemeAction(Aweme aweme, String str, boolean z, int i);

    C42357g getDislikeAction(Aweme aweme, String str, String str2);

    C42357g getDownloadAction(Activity activity, Aweme aweme, String str, String str2);

    Drawable getFirstShareIcon(Activity activity);

    String[] getGifImageShareList();

    String getLaseSavedCommand(Context context);

    String getMostUseShareChannel();

    C41526ag getShareSetting();

    String getShortenUrl(ShareInfo shareInfo, String str);

    boolean isDownloadAction(C42357g gVar);

    C42307b keyToChannel(String str, Activity activity);

    void markLocalCommand(Context context, String str);

    void monitorIllegalUrl(String str);

    void monitorMuteAudioFailedForUpload(Integer num);

    void monitorWaterMarkStatus(String str, String str2, String str3, String str4, String str5, int i);

    void requestFeedSelfsee(Context context, String str);

    C2193n<String> shortUrl(String str);

    void syncToToutiao(AppCompatActivity appCompatActivity, boolean z, int i, Intent intent);
}
