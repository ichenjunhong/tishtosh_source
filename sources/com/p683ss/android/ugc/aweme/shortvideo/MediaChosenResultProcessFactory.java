package com.p683ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.photo.C38678i;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44106ao;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44108ap;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44146j;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44149m;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2212b.C44013c;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.C46447a;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.C46491c;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2367a.C47225a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.MediaChosenResultProcessFactory */
public class MediaChosenResultProcessFactory implements IMediaChosenResultProcessFactory {
    public C44013c getCutSameVideoImageMixedController(Activity activity) {
        return null;
    }

    public static IMediaChosenResultProcessFactory createIMediaChosenResultProcessFactorybyMonsterPlugin() {
        Object a = C27991b.m66756a(IMediaChosenResultProcessFactory.class);
        if (a != null) {
            return (IMediaChosenResultProcessFactory) a;
        }
        if (C27991b.f73478ai == null) {
            synchronized (IMediaChosenResultProcessFactory.class) {
                if (C27991b.f73478ai == null) {
                    C27991b.f73478ai = new MediaChosenResultProcessFactory();
                }
            }
        }
        return (MediaChosenResultProcessFactory) C27991b.f73478ai;
    }

    public C44149m create(FragmentActivity fragmentActivity, int i, long j, long j2) {
        switch (i) {
            case 1:
                return new C47225a(fragmentActivity);
            case 2:
                C44108ap apVar = new C44108ap(fragmentActivity, j, j2);
                return apVar;
            case 3:
                return new C38678i(fragmentActivity);
            case 4:
                return new C44106ao(fragmentActivity);
            case 7:
                return new C46491c(fragmentActivity);
            case 8:
                return new C46447a(fragmentActivity);
            case 9:
                return new C44146j(fragmentActivity);
            default:
                return new C47225a(fragmentActivity);
        }
    }
}
