package com.p683ss.android.ugc.aweme.awemeservice.api;

import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p064c.p065a.C2201v;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.api.IAwemeService */
public interface IAwemeService {
    void clearCache();

    Aweme getAwemeById(String str);

    C11536c<String, Aweme> getAwemeCache();

    Aweme getProfileSelfSeeAweme(String str);

    Aweme getProfileSelfSeeAweme(String str, int i);

    Aweme getRawAdAwemeByAdId(String str);

    Aweme getRawAdAwemeById(String str);

    void increaseCommentCount(String str);

    C2201v<C11575f<Aweme>> observeAwemeById(String str);

    C2201v<List<C52847n<String, Aweme>>> observeAwemes();

    void setFeedCount(long j);

    Aweme updateAweme(Aweme aweme);

    void updateCollectStatus(String str, int i);

    void updateCommentCount(String str, long j);

    void updateCommentSetting(Aweme aweme, int i);

    void updatePreventDownloadType(Aweme aweme, int i);

    Aweme updateProfileSelfSeeAweme(Aweme aweme, int i);

    Aweme updateRawAdAweme(Aweme aweme);

    void updateUserDigg(String str, int i);
}
