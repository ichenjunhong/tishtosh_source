package com.p683ss.android.ugc.aweme.feed.service;

import android.app.Activity;
import android.app.Dialog;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.commercialize.C25934i;
import com.p683ss.android.ugc.aweme.feed.C30180e;
import com.p683ss.android.ugc.aweme.feed.C30303h;
import com.p683ss.android.ugc.aweme.feed.C30685r;
import com.p683ss.android.ugc.aweme.feed.adapter.C30011ab;
import com.p683ss.android.ugc.aweme.feed.adapter.C30021al;
import com.p683ss.android.ugc.aweme.feed.adapter.C30070bi;
import com.p683ss.android.ugc.aweme.feed.adapter.C30082h;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30447d;
import com.p683ss.android.ugc.aweme.movie.view.C37212h;
import com.p683ss.android.ugc.aweme.recommend.C41116k;
import com.p683ss.android.ugc.aweme.recommend.RecommendUserDialogPauseWhenShowing;
import com.p683ss.android.ugc.aweme.sticker.prop.C46356a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.service.FeedComponentServiceImpl */
public class FeedComponentServiceImpl implements IFeedComponentService {
    private C30011ab feedAdapterService;
    private IMovieRecordService movieRecordService;
    private IStickerRecordService stickerRecordService;
    private C30021al videoViewHolderService;

    public C25934i getDownloadDepend() {
        return new C30685r();
    }

    public C30011ab getFeedAdapterService() {
        if (this.feedAdapterService == null) {
            this.feedAdapterService = new C30082h();
        }
        return this.feedAdapterService;
    }

    public IMovieRecordService getMovieRecordService() {
        if (this.movieRecordService == null) {
            this.movieRecordService = new C37212h();
        }
        return this.movieRecordService;
    }

    public Fragment getSpecialTopicFragment() {
        return I18nBridgeService.getBridgeService_Monster().getSpecialTopicFragment();
    }

    public IStickerRecordService getStickerRecordService() {
        if (this.stickerRecordService == null) {
            this.stickerRecordService = new C46356a();
        }
        return this.stickerRecordService;
    }

    public C30021al getVideoViewHolderService() {
        if (this.videoViewHolderService == null) {
            this.videoViewHolderService = new C30070bi();
        }
        return this.videoViewHolderService;
    }

    public static IFeedComponentService createIFeedComponentServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IFeedComponentService.class);
        if (a != null) {
            return (IFeedComponentService) a;
        }
        if (C27991b.f73484ao == null) {
            synchronized (IFeedComponentService.class) {
                if (C27991b.f73484ao == null) {
                    C27991b.f73484ao = new FeedComponentServiceImpl();
                }
            }
        }
        return (FeedComponentServiceImpl) C27991b.f73484ao;
    }

    public Boolean isPauseVideoByRecommendUserDialog(Activity activity) {
        boolean z;
        C52711k.m112240b(activity, "activity");
        boolean z2 = false;
        if (RecommendUserDialogPauseWhenShowing.m90740a()) {
            if (!(activity instanceof FragmentActivity)) {
                activity = null;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            if (fragmentActivity != null) {
                Fragment a = fragmentActivity.getSupportFragmentManager().mo2224a("RecommendUserDialogFragment");
                if (!(a instanceof C41116k)) {
                    a = null;
                }
                C41116k kVar = (C41116k) a;
                if (kVar != null) {
                    Dialog dialog = kVar.getDialog();
                    if (dialog != null) {
                        z = dialog.isShowing();
                    } else {
                        z = false;
                    }
                    if (z && kVar.f104494c) {
                        z2 = true;
                    }
                }
            }
        }
        return Boolean.valueOf(z2);
    }

    public C30180e newDialogController(String str, int i, C30313ae<C30332aw> aeVar, C30447d dVar) {
        return new C30303h(str, i, aeVar, dVar);
    }
}
