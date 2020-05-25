package com.p683ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.profile.C39833e;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.share.p2151c.C41996b;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d.C42350b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42356f;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42359h;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.ShareChannelBar;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.share.ShareService */
public interface ShareService {

    /* renamed from: com.ss.android.ugc.aweme.share.ShareService$a */
    public static final class C41925a {
    }

    boolean getMuteDownloadForJapanExperiment();

    void injectUniversalConfig(C42350b bVar, Activity activity, boolean z);

    C42205l obtainAvatarEditableShareDialog(User user, Activity activity, C39833e eVar);

    SharePackage parseAweme(Context context, Aweme aweme, int i, String str, String str2);

    C42307b provideAwemeShareChannel(String str, C42307b bVar);

    ShareChannelBar provideImShareChannelBar(Activity activity, ViewGroup viewGroup);

    C41996b shareAfterPublishDialog(Activity activity, Aweme aweme, int i);

    Dialog shareAweme(Activity activity, Fragment fragment, Aweme aweme, boolean z, C30313ae<C30332aw> aeVar, Bundle bundle);

    void shareChallenge(Activity activity, Challenge challenge, List<? extends Aweme> list, String str, boolean z, String str2, String str3);

    void shareMix(Activity activity, MixStruct mixStruct, List<? extends Aweme> list, String str, String str2);

    void shareMusic(Activity activity, Music music, C42356f fVar, List<? extends Aweme> list, String str);

    void sharePhotoAfterPublish(Activity activity, Aweme aweme, PhotoContext photoContext);

    C41996b sharePrivateAfterPublishDialog(Activity activity, Aweme aweme, int i);

    C42359h sharePrivateAweme(Activity activity, Fragment fragment, Aweme aweme, C30313ae<C30332aw> aeVar, Bundle bundle);

    void shareProfile(Handler handler, Activity activity, User user, List<? extends Aweme> list, boolean z);

    void shareSticker(Activity activity, C46069d dVar, String str, List<? extends Aweme> list, String str2);

    Dialog showMore(Activity activity, Fragment fragment, Aweme aweme, C30313ae<C30332aw> aeVar, Bundle bundle);

    PopupWindow showSharePanelGuide(Activity activity, View view, C1710e<Boolean> eVar);
}
