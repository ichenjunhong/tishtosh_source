package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicDetailFragment_ViewBinding */
public class MusicDetailFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicDetailFragment f95585a;

    /* renamed from: b */
    private View f95586b;

    /* renamed from: c */
    private View f95587c;

    /* renamed from: d */
    private View f95588d;

    /* renamed from: e */
    private View f95589e;

    /* renamed from: f */
    private View f95590f;

    /* renamed from: g */
    private View f95591g;

    /* renamed from: h */
    private View f95592h;

    public void unbind() {
        MusicDetailFragment musicDetailFragment = this.f95585a;
        if (musicDetailFragment != null) {
            this.f95585a = null;
            musicDetailFragment.mMusicName = null;
            musicDetailFragment.mNickName = null;
            musicDetailFragment.mPlaceHolder = null;
            musicDetailFragment.mMusicCover = null;
            musicDetailFragment.mTitleLayout = null;
            musicDetailFragment.mHeadLayout = null;
            musicDetailFragment.mMusicUsedCount = null;
            musicDetailFragment.mBgCover = null;
            musicDetailFragment.ivMusicCollect = null;
            musicDetailFragment.mMusicCollectLayout = null;
            musicDetailFragment.mMusicCollectionText = null;
            musicDetailFragment.mMusicianEntry = null;
            musicDetailFragment.ivPlay = null;
            musicDetailFragment.ivStop = null;
            musicDetailFragment.ivLoading = null;
            musicDetailFragment.recyclerTag = null;
            musicDetailFragment.tagMask = null;
            musicDetailFragment.tagLayout = null;
            musicDetailFragment.txtElse = null;
            musicDetailFragment.mMusicTitle = null;
            musicDetailFragment.mStatusView = null;
            musicDetailFragment.ivShareBtn = null;
            musicDetailFragment.mVsSoundMatch = null;
            musicDetailFragment.mVsMusicOwner = null;
            musicDetailFragment.mVsThirdMusic = null;
            musicDetailFragment.mVsThirdMusicNewStyle = null;
            musicDetailFragment.mVsSimilarMusic = null;
            musicDetailFragment.mRecordButton = null;
            musicDetailFragment.mCommerceToast = null;
            musicDetailFragment.space = null;
            this.f95586b.setOnClickListener(null);
            this.f95586b = null;
            this.f95587c.setOnClickListener(null);
            this.f95587c = null;
            this.f95588d.setOnClickListener(null);
            this.f95588d = null;
            this.f95589e.setOnClickListener(null);
            this.f95589e = null;
            this.f95590f.setOnClickListener(null);
            this.f95590f = null;
            this.f95591g.setOnClickListener(null);
            this.f95591g = null;
            this.f95592h.setOnClickListener(null);
            this.f95592h = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicDetailFragment_ViewBinding(final MusicDetailFragment musicDetailFragment, View view) {
        this.f95585a = musicDetailFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.boa, "field 'mMusicName' and method 'click'");
        musicDetailFragment.mMusicName = (ViewGroup) Utils.castView(findRequiredView, R.id.boa, "field 'mMusicName'", ViewGroup.class);
        this.f95586b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDetailFragment.click(view);
            }
        });
        musicDetailFragment.mNickName = (TextView) Utils.findRequiredViewAsType(view, R.id.dcr, "field 'mNickName'", TextView.class);
        musicDetailFragment.mPlaceHolder = (TextView) Utils.findRequiredViewAsType(view, R.id.ddp, "field 'mPlaceHolder'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.bo2, "field 'mMusicCover' and method 'click'");
        musicDetailFragment.mMusicCover = (SmartImageView) Utils.castView(findRequiredView2, R.id.bo2, "field 'mMusicCover'", SmartImageView.class);
        this.f95587c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDetailFragment.click(view);
            }
        });
        musicDetailFragment.mTitleLayout = Utils.findRequiredView(view, R.id.d1b, "field 'mTitleLayout'");
        musicDetailFragment.mHeadLayout = Utils.findRequiredView(view, R.id.ans, "field 'mHeadLayout'");
        musicDetailFragment.mMusicUsedCount = (TextView) Utils.findRequiredViewAsType(view, R.id.dm1, "field 'mMusicUsedCount'", TextView.class);
        musicDetailFragment.mBgCover = (SmartImageView) Utils.findRequiredViewAsType(view, R.id.k5, "field 'mBgCover'", SmartImageView.class);
        musicDetailFragment.ivMusicCollect = (CheckableImageView) Utils.findRequiredViewAsType(view, R.id.bo0, "field 'ivMusicCollect'", CheckableImageView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.bfz, "field 'mMusicCollectLayout' and method 'click'");
        musicDetailFragment.mMusicCollectLayout = findRequiredView3;
        this.f95588d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDetailFragment.click(view);
            }
        });
        musicDetailFragment.mMusicCollectionText = (TextView) Utils.findRequiredViewAsType(view, R.id.dcd, "field 'mMusicCollectionText'", TextView.class);
        musicDetailFragment.mMusicianEntry = (ImageView) Utils.findRequiredViewAsType(view, R.id.b2p, "field 'mMusicianEntry'", ImageView.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.bok, "field 'ivPlay' and method 'click'");
        musicDetailFragment.ivPlay = (ImageView) Utils.castView(findRequiredView4, R.id.bok, "field 'ivPlay'", ImageView.class);
        this.f95589e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDetailFragment.click(view);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.boq, "field 'ivStop' and method 'click'");
        musicDetailFragment.ivStop = (ImageView) Utils.castView(findRequiredView5, R.id.boq, "field 'ivStop'", ImageView.class);
        this.f95590f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDetailFragment.click(view);
            }
        });
        musicDetailFragment.ivLoading = (ImageView) Utils.findOptionalViewAsType(view, R.id.emd, "field 'ivLoading'", ImageView.class);
        musicDetailFragment.recyclerTag = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cxi, "field 'recyclerTag'", RecyclerView.class);
        musicDetailFragment.tagMask = Utils.findRequiredView(view, R.id.cxd, "field 'tagMask'");
        musicDetailFragment.tagLayout = Utils.findRequiredView(view, R.id.a50, "field 'tagLayout'");
        musicDetailFragment.txtElse = (TextView) Utils.findRequiredViewAsType(view, R.id.a_e, "field 'txtElse'", TextView.class);
        musicDetailFragment.mMusicTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.bot, "field 'mMusicTitle'", TextView.class);
        musicDetailFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        View findRequiredView6 = Utils.findRequiredView(view, R.id.cmr, "field 'ivShareBtn' and method 'click'");
        musicDetailFragment.ivShareBtn = (ImageView) Utils.castView(findRequiredView6, R.id.cmr, "field 'ivShareBtn'", ImageView.class);
        this.f95591g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDetailFragment.click(view);
            }
        });
        musicDetailFragment.mVsSoundMatch = (ViewStub) Utils.findRequiredViewAsType(view, R.id.f81, "field 'mVsSoundMatch'", ViewStub.class);
        musicDetailFragment.mVsMusicOwner = (ViewStub) Utils.findRequiredViewAsType(view, R.id.dt1, "field 'mVsMusicOwner'", ViewStub.class);
        musicDetailFragment.mVsThirdMusic = (ViewStub) Utils.findRequiredViewAsType(view, R.id.dt6, "field 'mVsThirdMusic'", ViewStub.class);
        musicDetailFragment.mVsThirdMusicNewStyle = (ViewStub) Utils.findRequiredViewAsType(view, R.id.dt7, "field 'mVsThirdMusicNewStyle'", ViewStub.class);
        musicDetailFragment.mVsSimilarMusic = (ViewStub) Utils.findRequiredViewAsType(view, R.id.f80, "field 'mVsSimilarMusic'", ViewStub.class);
        musicDetailFragment.mRecordButton = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.csh, "field 'mRecordButton'", ViewGroup.class);
        musicDetailFragment.mCommerceToast = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e3_, "field 'mCommerceToast'", DmtTextView.class);
        musicDetailFragment.space = Utils.findRequiredView(view, R.id.cqc, "field 'space'");
        View findRequiredView7 = Utils.findRequiredView(view, R.id.ik, "method 'click'");
        this.f95592h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDetailFragment.click(view);
            }
        });
    }
}
