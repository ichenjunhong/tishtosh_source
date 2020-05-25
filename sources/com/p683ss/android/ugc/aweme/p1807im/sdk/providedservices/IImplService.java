package com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices;

import android.app.Activity;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34791a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.IImplService */
public interface IImplService {
    boolean enableExpressionTab();

    boolean enableMediaRecord();

    boolean enableSendEmoji();

    boolean enableSendVoice();

    Class getEmojiRClass();

    C1331h getItemDecoration(Context context);

    C34791a getRelationListAdapter(boolean z);

    boolean isMtCase();

    boolean isUserVerified(IMUser iMUser);

    boolean needAwemeMsgShowFollow();

    boolean needSessionListShowMore();

    void setTitleStyle(TextView textView);

    void setupStatusBar(Activity activity);

    void setupStatusBarWithHolder(Activity activity, View view);
}
