package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.Layout;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.SafeHandler;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24637c;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24621a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.detail.C27336g;
import com.p683ss.android.ugc.aweme.detail.C27365i;
import com.p683ss.android.ugc.aweme.discover.mob.C28423z;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.experiment.LoadingDialogExperiment;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29689c;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.movie.view.C37195c;
import com.p683ss.android.ugc.aweme.music.adapter.C37301j;
import com.p683ss.android.ugc.aweme.music.adapter.C37311o;
import com.p683ss.android.ugc.aweme.music.adapter.C37313p;
import com.p683ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.model.MusicDetail;
import com.p683ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.p683ss.android.ugc.aweme.music.p1970a.C37219a;
import com.p683ss.android.ugc.aweme.music.p1975c.C37352e;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37589c.C37590a;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37613h.C37614a;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37646v.C37650a;
import com.p683ss.android.ugc.aweme.music.presenter.C37419p;
import com.p683ss.android.ugc.aweme.music.presenter.C37422q;
import com.p683ss.android.ugc.aweme.music.presenter.C37425t;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23208an;
import com.p683ss.android.ugc.aweme.p1382aq.C23238h;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.poi.widget.C39481c;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40320dc;
import com.p683ss.android.ugc.aweme.sec.SecApiImpl;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.ReshootConfig;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42153d;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42356f;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47881fd;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import leakcanary.internal.LeakCanaryFileProvider;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicDetailFragment */
public class MusicDetailFragment extends C24637c implements C24621a, C29689c, C37425t, C37650a {

    /* renamed from: J */
    float f95524J;

    /* renamed from: K */
    boolean f95525K;

    /* renamed from: L */
    private ViewGroup f95526L;

    /* renamed from: M */
    private ViewGroup f95527M;

    /* renamed from: O */
    private ViewGroup f95528O;

    /* renamed from: P */
    private RecyclerView f95529P;

    /* renamed from: Q */
    private RecyclerView f95530Q;

    /* renamed from: R */
    private RecyclerView f95531R;

    /* renamed from: S */
    private C37313p f95532S;

    /* renamed from: T */
    private C37301j f95533T;

    /* renamed from: U */
    private C37311o f95534U;

    /* renamed from: V */
    private boolean f95535V;

    /* renamed from: W */
    private boolean f95536W;

    /* renamed from: X */
    private String f95537X;

    /* renamed from: Y */
    private String f95538Y;

    /* renamed from: Z */
    private String f95539Z;

    /* renamed from: aa */
    private DetailAwemeListFragment f95540aa;

    /* renamed from: ab */
    private DetailAwemeListFragment f95541ab;

    /* renamed from: ac */
    private MusicDetail f95542ac;

    /* renamed from: ad */
    private int f95543ad;

    /* renamed from: ae */
    private String f95544ae;

    /* renamed from: af */
    private String f95545af;

    /* renamed from: ag */
    private String f95546ag;

    /* renamed from: ah */
    private long f95547ah;

    /* renamed from: ai */
    private Handler f95548ai;

    /* renamed from: aj */
    private long f95549aj;

    /* renamed from: d */
    MusicCollectGuidePopupWindow f95550d;

    /* renamed from: e */
    ViewGroup f95551e;
    ImageView ivLoading;
    CheckableImageView ivMusicCollect;
    ImageView ivPlay;
    ImageView ivShareBtn;
    ImageView ivStop;

    /* renamed from: j */
    C37419p f95552j;

    /* renamed from: k */
    public String f95553k;

    /* renamed from: l */
    ProgressDialog f95554l;

    /* renamed from: m */
    C37646v f95555m;
    SmartImageView mBgCover;
    DmtTextView mCommerceToast;
    View mHeadLayout;
    View mMusicCollectLayout;
    TextView mMusicCollectionText;
    SmartImageView mMusicCover;
    ViewGroup mMusicName;
    TextView mMusicTitle;
    TextView mMusicUsedCount;
    public ImageView mMusicianEntry;
    TextView mNickName;
    TextView mPlaceHolder;
    ViewGroup mRecordButton;
    DmtStatusView mStatusView;
    View mTitleLayout;
    ViewStub mVsMusicOwner;
    ViewStub mVsSimilarMusic;
    ViewStub mVsSoundMatch;
    ViewStub mVsThirdMusic;
    ViewStub mVsThirdMusicNewStyle;

    /* renamed from: n */
    C39481c f95556n;

    /* renamed from: o */
    String f95557o = "musician";

    /* renamed from: p */
    String f95558p = "spotlight";

    /* renamed from: q */
    public String f95559q = "";

    /* renamed from: r */
    float f95560r;
    RecyclerView recyclerTag;
    View space;
    View tagLayout;
    View tagMask;
    TextView txtElse;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$a */
    class C37460a extends ClickableSpan {

        /* renamed from: a */
        private MusicOwnerInfo f95581a;

        C37460a() {
        }

        public void onClick(View view) {
            if (!C32800a.m75679a(view)) {
                MusicDetailFragment.this.mo76975a(this.f95581a);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(MusicDetailFragment.this.getResources().getColor(R.color.a1a));
            textPaint.setUnderlineText(false);
        }

        C37460a(MusicOwnerInfo musicOwnerInfo) {
            this.f95581a = musicOwnerInfo;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$b */
    class C37461b implements OnTouchListener {

        /* renamed from: a */
        long f95583a;

        C37461b() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f95583a = System.currentTimeMillis();
                    break;
                case 1:
                    if (System.currentTimeMillis() - this.f95583a > 300) {
                        return true;
                    }
                    TextView textView = (TextView) view;
                    CharSequence text = textView.getText();
                    if (text instanceof SpannedString) {
                        int x = (int) motionEvent.getX();
                        int totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
                        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
                        Layout layout = textView.getLayout();
                        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) totalPaddingLeft);
                        C37460a[] aVarArr = (C37460a[]) ((SpannedString) text).getSpans(offsetForHorizontal, offsetForHorizontal, C37460a.class);
                        if (aVarArr.length != 0) {
                            aVarArr[0].onClick(textView);
                            return true;
                        }
                    }
                    break;
            }
            return true;
        }
    }

    /* renamed from: a */
    public final String mo50606a(int i) {
        return i == 0 ? "single_song" : i == 1 ? "single_song_fresh" : "";
    }

    /* renamed from: a */
    public final void mo50568a(BaseResponse baseResponse) {
    }

    /* renamed from: g */
    public final String mo50499g() {
        return "single_song";
    }

    /* renamed from: n */
    public final int mo50618n() {
        return R.layout.blh;
    }

    /* renamed from: o */
    public final String mo50619o() {
        return this.f95553k;
    }

    /* renamed from: a */
    public final void mo50609a(Bundle bundle) {
        if (bundle != null) {
            this.f95553k = bundle.getString("id");
            this.f95537X = bundle.getString("extra_music_from");
            this.f72041G = bundle.getString("sticker_id");
            this.f95543ad = bundle.getInt("click_reason");
            this.f95544ae = bundle.getString("aweme_id");
            this.f95545af = bundle.getString("from_token");
            this.f95538Y = bundle.getString("partnerMusicId");
            this.f95539Z = bundle.getString("partnerName");
            this.f95559q = bundle.getString("process_id");
        }
    }

    /* renamed from: a */
    public final void mo76928a(boolean z) {
        if (this.ivPlay != null) {
            this.ivPlay.setVisibility(0);
        }
        if (this.ivStop != null) {
            this.ivStop.setVisibility(8);
        }
        if (this.ivLoading != null) {
            this.ivLoading.clearAnimation();
            this.ivLoading.setVisibility(8);
        }
        if (z) {
            mo50498e();
            if (this.ivMusicCollect != null) {
                this.ivMusicCollect.setVisibility(8);
            }
            this.ivPlay.setVisibility(8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:192:0x07c9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74299a(com.p683ss.android.ugc.aweme.music.model.MusicDetail r20) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            boolean r0 = r19.isViewValid()
            if (r0 == 0) goto L_0x0824
            if (r7 != 0) goto L_0x000e
            goto L_0x0824
        L_0x000e:
            java.lang.String r0 = r6.f95553k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0028
            com.ss.android.ugc.aweme.music.model.Music r0 = r7.music
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r6.f95553k
            com.ss.android.ugc.aweme.music.model.Music r1 = r7.music
            java.lang.String r1 = r1.getMid()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0059
        L_0x0028:
            com.ss.android.ugc.aweme.music.model.Music r0 = r7.music
            java.lang.String r0 = r0.getMid()
            r6.f95553k = r0
            java.util.List r0 = r6.f72039E
            if (r0 == 0) goto L_0x0059
            java.util.List r0 = r6.f72039E
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0059
            java.util.List r0 = r6.f72039E
            java.util.Iterator r0 = r0.iterator()
        L_0x0042:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0059
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.detail.g r1 = (com.p683ss.android.ugc.aweme.detail.C27336g) r1
            r2 = r1
            com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment r2 = (com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment) r2
            java.lang.String r3 = r6.f95553k
            r2.f65141b = r3
            r1.mo50473n()
            goto L_0x0042
        L_0x0059:
            r0 = 17
            r1 = 2131822155(0x7f11064b, float:1.9277073E38)
            r2 = 33
            r3 = 1
            r10 = 0
            if (r7 == 0) goto L_0x04c9
            com.ss.android.ugc.aweme.music.model.Music r4 = r7.music
            if (r4 != 0) goto L_0x006a
            goto L_0x04c9
        L_0x006a:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r4 = r6.mStatusView
            r4.mo19208c(r3)
            r6.f95542ac = r7
            com.ss.android.ugc.aweme.music.model.Music r4 = r7.music
            boolean r5 = r4.isOriginMusic()
            r6.m83811c(r5)
            android.widget.ImageView r11 = r6.mMusicianEntry
            com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$7 r12 = new com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$7
            r12.<init>()
            r11.setOnClickListener(r12)
            java.util.List r11 = r4.getMusicOwnerInfos()
            java.util.List r11 = m83803a(r11)
            int r12 = r11.size()
            r13 = 0
            if (r12 <= 0) goto L_0x00df
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            java.lang.Object r14 = r11.get(r10)
            com.ss.android.ugc.aweme.music.model.MusicOwnerInfo r14 = (com.p683ss.android.ugc.aweme.music.model.MusicOwnerInfo) r14
            java.lang.String r15 = r14.getNickName()
            r12.append(r15)
            com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$a r15 = new com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$a
            r15.<init>(r14)
            int r14 = r12.length()
            r12.setSpan(r15, r10, r14, r2)
            r14 = 1
        L_0x00b2:
            int r15 = r11.size()
            if (r14 >= r15) goto L_0x00e0
            java.lang.String r15 = ", "
            r12.append(r15)
            int r15 = r12.length()
            java.lang.Object r16 = r11.get(r14)
            r9 = r16
            com.ss.android.ugc.aweme.music.model.MusicOwnerInfo r9 = (com.p683ss.android.ugc.aweme.music.model.MusicOwnerInfo) r9
            java.lang.String r8 = r9.getNickName()
            r12.append(r8)
            com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$a r8 = new com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$a
            r8.<init>(r9)
            int r9 = r12.length()
            r12.setSpan(r8, r15, r9, r2)
            int r14 = r14 + 1
            goto L_0x00b2
        L_0x00df:
            r12 = r13
        L_0x00e0:
            r8 = 2131954673(0x7f130bf1, float:1.9545852E38)
            if (r5 == 0) goto L_0x0196
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = r4.getMusicName()
            r9.append(r14)
            java.lang.String r14 = " "
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            r5.<init>(r9)
            android.widget.TextView r9 = r6.mMusicTitle
            r9.setText(r5)
            android.widget.TextView r5 = r6.mMusicTitle
            android.content.res.Resources r9 = r19.getResources()
            int r9 = r9.getColor(r1)
            r5.setHighlightColor(r9)
            android.widget.TextView r5 = r6.mMusicTitle
            android.text.method.MovementMethod r9 = android.text.method.LinkMovementMethod.getInstance()
            r5.setMovementMethod(r9)
            if (r12 == 0) goto L_0x016c
            int r5 = r11.size()
            java.lang.String r9 = r4.getOwnerId()
            boolean r9 = m83806a(r11, r9)
            if (r9 != 0) goto L_0x0148
            java.lang.String r9 = ", "
            r12.append(r9)
            int r9 = r12.length()
            java.lang.String r11 = r4.getAuthorName()
            r12.append(r11)
            com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$6 r11 = new com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$6
            r11.<init>(r4)
            int r14 = r12.length()
            r12.setSpan(r11, r9, r14, r2)
            int r5 = r5 + 1
        L_0x0148:
            android.widget.TextView r9 = r6.mNickName
            r9.setText(r12)
            android.widget.TextView r9 = r6.mNickName
            com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$b r11 = new com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$b
            r11.<init>()
            r9.setOnTouchListener(r11)
            if (r5 != r3) goto L_0x0166
            android.widget.TextView r5 = r6.mNickName
            android.content.res.Resources r9 = r19.getResources()
            android.graphics.drawable.Drawable r8 = r9.getDrawable(r8)
            r5.setCompoundDrawablesWithIntrinsicBounds(r13, r13, r8, r13)
        L_0x0166:
            android.view.ViewGroup r5 = r6.mMusicName
            r5.setClickable(r10)
            goto L_0x0187
        L_0x016c:
            android.widget.TextView r5 = r6.mNickName
            java.lang.String r9 = r4.getAuthorName()
            r5.setText(r9)
            android.widget.TextView r5 = r6.mNickName
            android.content.res.Resources r9 = r19.getResources()
            android.graphics.drawable.Drawable r8 = r9.getDrawable(r8)
            r5.setCompoundDrawablesWithIntrinsicBounds(r13, r13, r8, r13)
            android.view.ViewGroup r5 = r6.mMusicName
            r5.setClickable(r3)
        L_0x0187:
            android.widget.TextView r5 = r6.mPlaceHolder
            r8 = 2132547236(0x7f1c16a4, float:2.0747712E38)
            r5.setText(r8)
            android.view.ViewGroup r5 = r6.mMusicName
            r5.setVisibility(r10)
            goto L_0x0321
        L_0x0196:
            java.lang.String r5 = r4.getOwnerId()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r5 = r5 ^ r3
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>()
            if (r5 == 0) goto L_0x01ff
            boolean r14 = r4.isMatchMetadata()
            if (r14 != 0) goto L_0x01ff
            java.lang.String r11 = r4.getMusicName()
            java.lang.String r12 = "@"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L_0x01bc
            java.lang.String r11 = r11.substring(r3)
        L_0x01bc:
            r9.append(r11)
            android.widget.TextView r11 = r6.mNickName
            java.lang.String r12 = r4.getOwnerNickName()
            r11.setText(r12)
            android.widget.TextView r11 = r6.mPlaceHolder
            r12 = 2132547234(0x7f1c16a2, float:2.0747708E38)
            r11.setText(r12)
            android.view.ViewGroup r11 = r6.mMusicName
            r11.setVisibility(r10)
            android.view.ViewGroup r11 = r6.mMusicName
            r11.setClickable(r3)
            android.widget.TextView r11 = r6.mMusicTitle
            android.content.res.Resources r12 = r19.getResources()
            int r12 = r12.getColor(r1)
            r11.setHighlightColor(r12)
            android.widget.TextView r11 = r6.mMusicTitle
            android.text.method.MovementMethod r12 = android.text.method.LinkMovementMethod.getInstance()
            r11.setMovementMethod(r12)
            android.widget.TextView r11 = r6.mNickName
            android.content.res.Resources r12 = r19.getResources()
            android.graphics.drawable.Drawable r8 = r12.getDrawable(r8)
            r11.setCompoundDrawablesWithIntrinsicBounds(r13, r13, r8, r13)
            goto L_0x0278
        L_0x01ff:
            java.lang.String r14 = r4.getMusicName()
            boolean r15 = android.text.TextUtils.isEmpty(r14)
            if (r15 == 0) goto L_0x0229
            if (r4 == 0) goto L_0x022c
            java.lang.String r14 = "music_name_empty"
            java.lang.String r15 = ""
            com.ss.android.ugc.aweme.app.f.c r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r2 = "music_id"
            long r17 = r4.getId()
            java.lang.Long r10 = java.lang.Long.valueOf(r17)
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47823a(r2, r10)
            org.json.JSONObject r1 = r1.mo47825b()
            com.p683ss.android.ugc.aweme.base.C23569o.m57783b(r14, r15, r1)
            goto L_0x022c
        L_0x0229:
            r9.append(r14)
        L_0x022c:
            android.widget.TextView r1 = r6.mMusicTitle
            r1.setClickable(r3)
            if (r12 == 0) goto L_0x0269
            android.widget.TextView r1 = r6.mNickName
            r1.setText(r12)
            android.widget.TextView r1 = r6.mNickName
            com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$b r2 = new com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$b
            r2.<init>()
            r1.setOnTouchListener(r2)
            int r1 = r11.size()
            if (r1 != r3) goto L_0x0272
            android.content.res.Resources r1 = r19.getResources()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r8)
            int r2 = android.os.Build.VERSION.SDK_INT
            r8 = 19
            if (r2 < r8) goto L_0x0259
            r1.setAutoMirrored(r3)
        L_0x0259:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r0) goto L_0x0263
            android.widget.TextView r2 = r6.mNickName
            r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r13, r13, r1, r13)
            goto L_0x0272
        L_0x0263:
            android.widget.TextView r2 = r6.mNickName
            r2.setCompoundDrawablesWithIntrinsicBounds(r13, r13, r1, r13)
            goto L_0x0272
        L_0x0269:
            android.widget.TextView r1 = r6.mNickName
            java.lang.String r2 = r4.getAuthorName()
            r1.setText(r2)
        L_0x0272:
            android.view.ViewGroup r1 = r6.mMusicName
            r2 = 0
            r1.setVisibility(r2)
        L_0x0278:
            boolean r1 = m83804a(r4)
            if (r5 == 0) goto L_0x0317
            if (r1 != 0) goto L_0x0317
            com.ss.android.ugc.aweme.music.model.MusicDetail r1 = r6.f95542ac
            if (r1 == 0) goto L_0x0317
            com.ss.android.ugc.aweme.music.model.MusicDetail r1 = r6.f95542ac
            com.ss.android.ugc.aweme.music.model.Music r1 = r1.music
            if (r1 == 0) goto L_0x0317
            com.ss.android.ugc.aweme.music.model.MusicDetail r1 = r6.f95542ac
            com.ss.android.ugc.aweme.music.model.Music r1 = r1.music
            boolean r1 = r1.isMatchMetadata()
            if (r1 == 0) goto L_0x0296
            goto L_0x0317
        L_0x0296:
            java.lang.String r1 = r4.getOwnerId()
            com.ss.android.ugc.aweme.music.model.MusicDetail r2 = r6.f95542ac
            if (r2 == 0) goto L_0x0317
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r1)
            if (r2 != 0) goto L_0x0317
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r2 = r2.getCurUserId()
            boolean r1 = com.bytedance.common.utility.C9431p.m18665a(r1, r2)
            if (r1 == 0) goto L_0x0317
            android.content.Context r1 = r19.getContext()
            r2 = 2131954676(0x7f130bf4, float:1.9545858E38)
            android.graphics.drawable.Drawable r1 = android.support.p043v7.p044a.p045a.C1124a.m3315b(r1, r2)
            int r2 = r1.getIntrinsicWidth()
            int r5 = r1.getIntrinsicHeight()
            r8 = 0
            r1.setBounds(r8, r8, r2, r5)
            com.bytedance.ies.dmt.ui.common.a r2 = new com.bytedance.ies.dmt.ui.common.a
            r2.<init>(r1)
            java.lang.String r1 = " T"
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r1)
            int r5 = r13.length()
            int r1 = r1.length()
            int r5 = r5 - r1
            int r5 = r5 + r3
            int r1 = r13.length()
            r13.setSpan(r2, r5, r1, r0)
            int r1 = r13.getSpanStart(r2)
            int r2 = r13.getSpanEnd(r2)
            com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$8 r5 = new com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$8
            r5.<init>(r4)
            r8 = 34
            r13.setSpan(r5, r1, r2, r8)
            com.ss.android.ugc.aweme.common.MobClick r1 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r2 = "original_title_show"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r2)
            java.lang.String r2 = "original_music"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r2)
            long r10 = r4.getId()
            java.lang.String r2 = java.lang.String.valueOf(r10)
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setValue(r2)
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r1)
        L_0x0317:
            if (r13 == 0) goto L_0x031c
            r9.append(r13)
        L_0x031c:
            android.widget.TextView r1 = r6.mMusicTitle
            r1.setText(r9)
        L_0x0321:
            android.widget.TextView r1 = r6.f72047v
            java.lang.String r2 = r4.getMusicName()
            r1.setText(r2)
            int r1 = r4.getUserCount()
            long r1 = (long) r1
            java.lang.String r1 = com.p683ss.android.ugc.aweme.i18n.C33095b.m76068a(r1)
            android.widget.TextView r2 = r6.mMusicUsedCount
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = " "
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r2.setText(r1)
            java.util.List<com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic> r1 = r7.relatedChallengeMusicList
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r1 == 0) goto L_0x0359
            android.view.View r1 = r6.tagLayout
            r2 = 8
            r1.setVisibility(r2)
            goto L_0x03ca
        L_0x0359:
            r19.m83810c(r20)
            android.widget.TextView r1 = r6.txtElse
            r2 = 0
            r1.setVisibility(r2)
            android.view.View r1 = r6.tagLayout
            r1.setVisibility(r2)
            com.ss.android.ugc.aweme.music.adapter.MusicDetailRelatedAdapter r1 = new com.ss.android.ugc.aweme.music.adapter.MusicDetailRelatedAdapter
            java.util.List<com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic> r2 = r7.relatedChallengeMusicList
            android.content.Context r5 = r19.getContext()
            r1.<init>(r2, r5)
            java.lang.String r2 = "music_page"
            r1.f95112d = r2
            java.lang.String r2 = r6.f95553k
            r1.f95110b = r2
            android.support.v7.widget.RecyclerView r2 = r6.recyclerTag
            com.ss.android.ugc.aweme.views.f r5 = new com.ss.android.ugc.aweme.views.f
            android.content.res.Resources r8 = r19.getResources()
            r9 = 2131821851(0x7f11051b, float:1.9276457E38)
            int r9 = r8.getColor(r9)
            android.support.v4.app.FragmentActivity r8 = r19.getActivity()
            r10 = 1082130432(0x40800000, float:4.0)
            float r8 = com.bytedance.common.utility.C9432q.m18687b(r8, r10)
            int r10 = (int) r8
            r11 = 0
            android.support.v4.app.FragmentActivity r8 = r19.getActivity()
            r12 = 0
            float r13 = com.bytedance.common.utility.C9432q.m18687b(r8, r12)
            android.support.v4.app.FragmentActivity r8 = r19.getActivity()
            float r14 = com.bytedance.common.utility.C9432q.m18687b(r8, r12)
            r15 = 0
            r8 = r5
            r12 = r13
            r13 = r14
            r14 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r2.mo4798a(r5)
            android.support.v7.widget.RecyclerView r2 = r6.recyclerTag
            r2.setHasFixedSize(r3)
            android.support.v7.widget.RecyclerView r2 = r6.recyclerTag
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r5 = new com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
            android.support.v4.app.FragmentActivity r8 = r19.getActivity()
            r9 = 0
            r5.<init>(r8, r9, r9)
            r2.setLayoutManager(r5)
            android.support.v7.widget.RecyclerView r2 = r6.recyclerTag
            r2.setAdapter(r1)
        L_0x03ca:
            android.support.v7.widget.RecyclerView r1 = r6.recyclerTag
            int r1 = r1.getHeight()
            android.view.View r2 = r6.tagMask
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            r2.height = r1
            android.view.View r1 = r6.tagMask
            r1.setLayoutParams(r2)
            com.bytedance.lighten.loader.SmartImageView r1 = r6.mMusicCover
            if (r1 == 0) goto L_0x0408
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r4.getCoverMedium()
            com.ss.android.ugc.aweme.base.k r1 = com.p683ss.android.ugc.aweme.base.C23608p.m57874a(r1)
            com.bytedance.lighten.a.t r1 = com.bytedance.lighten.p766a.C12203q.m24645a(r1)
            r2 = 302(0x12e, float:4.23E-43)
            int[] r2 = com.p683ss.android.ugc.aweme.utils.C47788ct.m103417a(r2)
            com.bytedance.lighten.a.t r1 = r1.mo23125b(r2)
            java.lang.String r2 = "MusicDetailFragment"
            com.bytedance.lighten.a.t r1 = r1.mo23118a(r2)
            com.bytedance.lighten.loader.SmartImageView r2 = r6.mMusicCover
            com.bytedance.lighten.a.t r1 = r1.mo23116a(r2)
            r1.mo23121a()
        L_0x0408:
            com.bytedance.lighten.loader.SmartImageView r1 = r6.mBgCover
            r2 = 8
            r1.setVisibility(r2)
            boolean r1 = com.p683ss.android.ugc.aweme.music.p1978ui.C37609f.m84056a(r4)
            if (r1 != 0) goto L_0x044d
            com.ss.android.ugc.aweme.base.h.g r1 = com.p683ss.android.ugc.aweme.base.p1417h.C23542f.m57722g()
            java.lang.String r2 = "is_need_show_collect_guide"
            boolean r1 = r1.mo48705a(r2, r3)
            if (r1 == 0) goto L_0x044d
            com.ss.android.ugc.aweme.music.ui.MusicCollectGuidePopupWindow r1 = r6.f95550d
            if (r1 != 0) goto L_0x0430
            com.ss.android.ugc.aweme.music.ui.MusicCollectGuidePopupWindow r1 = new com.ss.android.ugc.aweme.music.ui.MusicCollectGuidePopupWindow
            android.content.Context r2 = r19.getContext()
            r1.<init>(r2)
            r6.f95550d = r1
        L_0x0430:
            android.arch.lifecycle.h r1 = r19.getLifecycle()
            com.ss.android.ugc.aweme.music.ui.MusicCollectGuidePopupWindow r2 = r6.f95550d
            r1.mo324a(r2)
            android.view.View r1 = r6.mMusicCollectLayout
            com.ss.android.ugc.aweme.music.ui.ar r2 = new com.ss.android.ugc.aweme.music.ui.ar
            r2.<init>(r6)
            r1.post(r2)
            com.ss.android.ugc.aweme.base.h.g r1 = com.p683ss.android.ugc.aweme.base.p1417h.C23542f.m57722g()
            java.lang.String r2 = "is_need_show_collect_guide"
            r5 = 0
            r1.mo48710b(r2, r5)
        L_0x044d:
            boolean r1 = com.p683ss.android.ugc.aweme.music.presenter.C37419p.m83743a(r4)
            if (r1 == 0) goto L_0x0469
            r19.mo50498e()
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r1 = r6.ivMusicCollect
            if (r1 == 0) goto L_0x0462
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r1 = r6.ivMusicCollect
            r2 = 8
            r1.setVisibility(r2)
            goto L_0x0464
        L_0x0462:
            r2 = 8
        L_0x0464:
            android.widget.ImageView r1 = r6.ivPlay
            r1.setVisibility(r2)
        L_0x0469:
            com.ss.android.ugc.aweme.framework.services.IUserService r1 = com.p683ss.android.ugc.aweme.services.BaseUserService.getBaseUserService_Monster()
            com.ss.android.ugc.aweme.framework.services.IUserService r1 = (com.p683ss.android.ugc.aweme.framework.services.IUserService) r1
            if (r1 == 0) goto L_0x0486
            com.ss.android.ugc.aweme.profile.model.User r2 = r1.getCurrentUser()
            if (r2 == 0) goto L_0x0486
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurrentUser()
            boolean r1 = r1.isHideShootButton()
            if (r1 == 0) goto L_0x0486
            r19.mo50498e()
            r1 = 0
            goto L_0x0487
        L_0x0486:
            r1 = 1
        L_0x0487:
            java.lang.String r2 = r6.f95553k
            java.lang.String r4 = r6.f95559q
            java.lang.String r5 = r6.f95544ae
            java.lang.String r8 = "shoot_show"
            com.ss.android.ugc.aweme.app.f.d r9 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r10 = "enter_from"
            java.lang.String r11 = "single_song"
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.lang.String r10 = "enter_method"
            java.lang.String r11 = "single_song"
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.lang.String r10 = "music_id"
            com.ss.android.ugc.aweme.app.f.d r2 = r9.mo47829a(r10, r2)
            java.lang.String r9 = "group_id"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r9, r5)
            java.lang.String r5 = "shoot_way"
            java.lang.String r9 = "single_song"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r5, r9)
            java.lang.String r5 = "process_id"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r5, r4)
            java.lang.String r4 = "is_show"
            com.ss.android.ugc.aweme.app.f.d r1 = r2.mo47826a(r4, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r8, r1)
            goto L_0x04cf
        L_0x04c9:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r6.mStatusView
            r2 = 0
            r1.mo19208c(r2)
        L_0x04cf:
            if (r7 == 0) goto L_0x058d
            com.ss.android.ugc.aweme.music.model.Music r1 = r7.music
            if (r1 == 0) goto L_0x058d
            com.ss.android.ugc.aweme.music.model.Music r1 = r7.music
            java.util.List r1 = r1.getMusicOwnerInfos()
            if (r1 != 0) goto L_0x04df
            goto L_0x058d
        L_0x04df:
            com.ss.android.ugc.aweme.music.model.Music r1 = r7.music
            java.util.List r1 = r1.getMusicOwnerInfos()
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r2 == 0) goto L_0x04f0
            r19.m83813i()
            goto L_0x0590
        L_0x04f0:
            java.util.List r1 = m83803a(r1)
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r2 == 0) goto L_0x04ff
            r19.m83813i()
            goto L_0x0590
        L_0x04ff:
            android.view.ViewGroup r2 = r6.f95527M
            if (r2 != 0) goto L_0x050d
            android.view.ViewStub r2 = r6.mVsMusicOwner
            android.view.View r2 = r2.inflate()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r6.f95527M = r2
        L_0x050d:
            android.support.v7.widget.RecyclerView r2 = r6.f95530Q
            if (r2 != 0) goto L_0x057d
            android.view.ViewGroup r2 = r6.f95527M
            r4 = 2132021176(0x7f140fb8, float:1.9680736E38)
            android.view.View r2 = r2.findViewById(r4)
            android.support.v7.widget.RecyclerView r2 = (android.support.p043v7.widget.RecyclerView) r2
            r6.f95530Q = r2
            com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$1 r2 = new com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$1
            android.content.Context r4 = r19.getContext()
            r2.<init>(r4)
            android.support.v7.widget.RecyclerView r4 = r6.f95530Q
            r4.setLayoutManager(r2)
            android.support.v7.widget.RecyclerView r2 = r6.f95530Q
            com.ss.android.ugc.aweme.views.f r4 = new com.ss.android.ugc.aweme.views.f
            android.content.res.Resources r5 = r19.getResources()
            r8 = 2131821786(0x7f1104da, float:1.9276325E38)
            int r9 = r5.getColor(r8)
            android.support.v4.app.FragmentActivity r5 = r19.getActivity()
            r8 = 1056964608(0x3f000000, float:0.5)
            float r5 = com.bytedance.common.utility.C9432q.m18687b(r5, r8)
            int r10 = (int) r5
            r11 = 1
            android.support.v4.app.FragmentActivity r5 = r19.getActivity()
            r8 = 1098907648(0x41800000, float:16.0)
            float r12 = com.bytedance.common.utility.C9432q.m18687b(r5, r8)
            android.support.v4.app.FragmentActivity r5 = r19.getActivity()
            float r13 = com.bytedance.common.utility.C9432q.m18687b(r5, r8)
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            r2.mo4798a(r4)
            com.ss.android.ugc.aweme.music.adapter.j r2 = new com.ss.android.ugc.aweme.music.adapter.j
            r2.<init>()
            r6.f95533T = r2
            com.ss.android.ugc.aweme.music.adapter.j r2 = r6.f95533T
            com.ss.android.ugc.aweme.music.ui.al r4 = new com.ss.android.ugc.aweme.music.ui.al
            r4.<init>(r6, r1)
            r2.f95205a = r4
            com.ss.android.ugc.aweme.music.adapter.j r2 = r6.f95533T
            r4 = 0
            r2.mo54798c(r4)
            android.support.v7.widget.RecyclerView r2 = r6.f95530Q
            com.ss.android.ugc.aweme.music.adapter.j r4 = r6.f95533T
            r2.setAdapter(r4)
        L_0x057d:
            com.ss.android.ugc.aweme.music.adapter.j r2 = r6.f95533T
            if (r2 == 0) goto L_0x0586
            com.ss.android.ugc.aweme.music.adapter.j r2 = r6.f95533T
            r2.mo50303a(r1)
        L_0x0586:
            android.view.ViewGroup r1 = r6.f95527M
            r2 = 0
            r1.setVisibility(r2)
            goto L_0x0590
        L_0x058d:
            r19.m83813i()
        L_0x0590:
            if (r7 == 0) goto L_0x065f
            com.ss.android.ugc.aweme.music.model.Music r1 = r7.music
            if (r1 == 0) goto L_0x065f
            com.ss.android.ugc.aweme.music.model.Music r1 = r7.music
            boolean r1 = r1.isOriginMusic()
            if (r1 != 0) goto L_0x065f
            com.ss.android.ugc.aweme.music.model.Music r1 = r7.music
            java.util.List r1 = r1.getMusicOwnerInfos()
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r1 == 0) goto L_0x065f
            java.util.List<com.ss.android.ugc.aweme.music.model.SimilarMusicInfo> r1 = r7.mSimilarMusicList
            if (r1 != 0) goto L_0x05b0
            goto L_0x065f
        L_0x05b0:
            java.util.List<com.ss.android.ugc.aweme.music.model.SimilarMusicInfo> r1 = r7.mSimilarMusicList
            if (r1 == 0) goto L_0x065b
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r2 != 0) goto L_0x065b
            int r2 = r1.size()
            r4 = 3
            if (r2 == r4) goto L_0x05c3
            goto L_0x065b
        L_0x05c3:
            com.ss.android.ugc.aweme.music.model.Music r2 = r7.music
            android.view.ViewGroup r4 = r6.f95551e
            if (r4 != 0) goto L_0x05dd
            android.view.ViewStub r4 = r6.mVsSimilarMusic
            android.view.View r4 = r4.inflate()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r6.f95551e = r4
            android.view.ViewGroup r4 = r6.f95551e
            com.ss.android.ugc.aweme.music.ui.am r5 = new com.ss.android.ugc.aweme.music.ui.am
            r5.<init>(r6, r2)
            r4.setOnClickListener(r5)
        L_0x05dd:
            android.support.v7.widget.RecyclerView r4 = r6.f95531R
            if (r4 != 0) goto L_0x0624
            android.view.ViewGroup r4 = r6.f95551e
            r5 = 2132022817(0x7f141621, float:1.9684064E38)
            android.view.View r4 = r4.findViewById(r5)
            android.support.v7.widget.RecyclerView r4 = (android.support.p043v7.widget.RecyclerView) r4
            r6.f95531R = r4
            android.support.v7.widget.RecyclerView r4 = r6.f95531R
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r5 = new com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
            android.content.Context r8 = r19.getContext()
            r9 = 0
            r5.<init>(r8, r9, r9)
            r4.setLayoutManager(r5)
            android.support.v7.widget.RecyclerView r4 = r6.f95531R
            com.ss.android.ugc.aweme.music.ui.bp r5 = new com.ss.android.ugc.aweme.music.ui.bp
            r5.<init>()
            r4.mo4798a(r5)
            com.ss.android.ugc.aweme.music.adapter.o r4 = new com.ss.android.ugc.aweme.music.adapter.o
            r4.<init>()
            r6.f95534U = r4
            com.ss.android.ugc.aweme.music.adapter.o r4 = r6.f95534U
            r4.mo54798c(r9)
            android.support.v7.widget.RecyclerView r4 = r6.f95531R
            com.ss.android.ugc.aweme.music.adapter.o r5 = r6.f95534U
            r4.setAdapter(r5)
            android.support.v7.widget.RecyclerView r4 = r6.f95531R
            com.ss.android.ugc.aweme.music.ui.an r5 = new com.ss.android.ugc.aweme.music.ui.an
            r5.<init>(r6)
            r4.setOnTouchListener(r5)
        L_0x0624:
            com.ss.android.ugc.aweme.music.adapter.o r4 = r6.f95534U
            if (r4 == 0) goto L_0x062d
            com.ss.android.ugc.aweme.music.adapter.o r4 = r6.f95534U
            r4.mo50303a(r1)
        L_0x062d:
            android.view.ViewGroup r1 = r6.f95551e
            r4 = 0
            r1.setVisibility(r4)
            java.lang.String r1 = "show_similar_song_entrance"
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "enter_from"
            java.lang.String r8 = "single_song"
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r8)
            java.lang.String r5 = "music_id"
            java.lang.String r8 = r2.getMid()
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r8)
            java.lang.String r5 = "author_id"
            java.lang.String r2 = r2.getOwnerId()
            com.ss.android.ugc.aweme.app.f.d r2 = r4.mo47829a(r5, r2)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r2)
            goto L_0x0662
        L_0x065b:
            r19.m83814j()
            goto L_0x0662
        L_0x065f:
            r19.m83814j()
        L_0x0662:
            if (r7 == 0) goto L_0x07b3
            com.ss.android.ugc.aweme.music.model.Music r1 = r7.music
            if (r1 == 0) goto L_0x07b3
            com.ss.android.ugc.aweme.music.model.Music r1 = r7.music
            java.lang.String r1 = r1.getMusicName()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x07b3
            com.ss.android.ugc.aweme.music.model.Music r1 = r7.music
            java.lang.String r1 = r1.getMatchedSoundId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0682
            goto L_0x07b3
        L_0x0682:
            com.ss.android.ugc.aweme.music.model.Music r1 = r7.music
            java.lang.String r5 = r1.getMatchedSoundId()
            android.support.v4.app.FragmentActivity r2 = r19.getActivity()
            android.view.ViewGroup r1 = r6.f95528O
            if (r1 != 0) goto L_0x07b0
            if (r2 == 0) goto L_0x07b0
            java.lang.String r1 = r6.f95553k
            java.lang.String r4 = r6.f95559q
            java.lang.String r8 = "show_music_feedback_entrance"
            com.ss.android.ugc.aweme.app.f.d r9 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r10 = "enter_from"
            java.lang.String r11 = "single_song"
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
            java.lang.String r10 = "music_id"
            com.ss.android.ugc.aweme.app.f.d r1 = r9.mo47829a(r10, r1)
            java.lang.String r9 = "process_id"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r9, r4)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r8, r1)
            com.ss.android.ugc.aweme.music.model.Music r1 = r7.music
            java.lang.String r4 = r1.getMusicName()
            android.view.ViewStub r1 = r6.mVsSoundMatch
            android.view.View r1 = r1.inflate()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.f95528O = r1
            android.view.ViewGroup r1 = r6.f95528O
            r8 = 2132024107(0x7f141b2b, float:1.968668E38)
            android.view.View r1 = r1.findViewById(r8)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.content.res.Resources r1 = r19.getResources()
            r9 = 2132549238(0x7f1c1e76, float:2.0751773E38)
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r11 = 0
            r10[r11] = r4
            java.lang.String r1 = r1.getString(r9, r10)
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r1)
            int r10 = r1.lastIndexOf(r4)
            int r11 = r4.length()
            int r11 = r11 + r10
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0724
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x0724
            if (r10 < 0) goto L_0x0724
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r3)
            r12 = 34
            r9.setSpan(r1, r10, r11, r12)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            android.content.res.Resources r13 = r19.getResources()
            r14 = 2131820635(0x7f11005b, float:1.927399E38)
            int r13 = r13.getColor(r14)
            r1.<init>(r13)
            r13 = 33
            r9.setSpan(r1, r10, r11, r13)
            com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$2 r1 = new com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$2
            r1.<init>(r5)
            r9.setSpan(r1, r10, r11, r12)
        L_0x0724:
            android.content.res.Resources r1 = r19.getResources()
            r10 = 2131822155(0x7f11064b, float:1.9277073E38)
            int r1 = r1.getColor(r10)
            r8.setHighlightColor(r1)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r8.setMovementMethod(r1)
            r8.setText(r9)
            com.bytedance.ies.abmock.n r1 = com.bytedance.ies.abmock.C10193n.m20607a()
            java.lang.Class<com.ss.android.ugc.aweme.music.ab.SoundMatchUrlSetting> r9 = com.p683ss.android.ugc.aweme.music.p1971ab.SoundMatchUrlSetting.class
            java.lang.String r10 = "sound_match_feedback_url"
            com.bytedance.ies.abmock.b r11 = com.bytedance.ies.abmock.C10181b.m20511a()
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r11 = r11.mo18175c()
            java.lang.String r11 = r11.getSoundMatchFeedbackUrl()
            java.lang.String r12 = ""
            java.lang.String r9 = r1.mo18203a(r9, r10, r11, r12)
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x07b0
            r1 = 2131954685(0x7f130bfd, float:1.9545876E38)
            android.graphics.drawable.Drawable r1 = android.support.p043v7.p044a.p045a.C1124a.m3315b(r2, r1)
            int r10 = r1.getIntrinsicWidth()
            int r11 = r1.getIntrinsicHeight()
            r12 = 0
            r1.setBounds(r12, r12, r10, r11)
            com.bytedance.ies.dmt.ui.common.a r10 = new com.bytedance.ies.dmt.ui.common.a
            r10.<init>(r1)
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>()
            java.lang.CharSequence r1 = r8.getText()
            r11.append(r1)
            java.lang.String r1 = " T"
            r11.append(r1)
            int r12 = r11.length()
            int r1 = r1.length()
            int r12 = r12 - r1
            int r12 = r12 + r3
            int r1 = r11.length()
            r11.setSpan(r10, r12, r1, r0)
            int r12 = r11.getSpanStart(r10)
            int r10 = r11.getSpanEnd(r10)
            com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$3 r13 = new com.ss.android.ugc.aweme.music.ui.MusicDetailFragment$3
            r0 = r13
            r1 = r19
            r3 = r4
            r4 = r9
            r0.<init>(r2, r3, r4, r5)
            r0 = 34
            r11.setSpan(r13, r12, r10, r0)
            r8.setText(r11)
        L_0x07b0:
            r1 = 8
            goto L_0x07be
        L_0x07b3:
            android.view.ViewGroup r0 = r6.f95528O
            if (r0 == 0) goto L_0x07b0
            android.view.ViewGroup r0 = r6.f95528O
            r1 = 8
            r0.setVisibility(r1)
        L_0x07be:
            r19.m83807b(r20)
            com.ss.android.ugc.aweme.music.model.Music r0 = r7.music
            boolean r0 = com.p683ss.android.ugc.aweme.music.p1978ui.C37609f.m84056a(r0)
            if (r0 == 0) goto L_0x0823
            android.widget.ImageView r0 = r6.ivShareBtn
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r6.mMusicianEntry
            r0.setVisibility(r1)
            android.view.View r0 = r6.mMusicCollectLayout
            r0.setVisibility(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r6.mCommerceToast
            r2 = 0
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r6.ivPlay
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r6.ivStop
            r0.setVisibility(r1)
            android.view.View r0 = r6.space
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup r1 = r6.f95526L
            if (r1 == 0) goto L_0x07fa
            android.view.ViewGroup r1 = r6.f95526L
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L_0x0806
        L_0x07fa:
            android.view.ViewGroup r1 = r6.f95527M
            if (r1 == 0) goto L_0x080f
            android.view.ViewGroup r1 = r6.f95527M
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x080f
        L_0x0806:
            r1 = 4620693217682128896(0x4020000000000000, double:8.0)
            int r1 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r1)
            r0.height = r1
            goto L_0x0817
        L_0x080f:
            r1 = 4616189618054758400(0x4010000000000000, double:4.0)
            int r1 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r1)
            r0.height = r1
        L_0x0817:
            android.view.View r1 = r6.space
            r1.setLayoutParams(r0)
            android.view.ViewGroup r0 = r6.mRecordButton
            r1 = 8
            r0.setVisibility(r1)
        L_0x0823:
            return
        L_0x0824:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.music.p1978ui.MusicDetailFragment.mo74299a(com.ss.android.ugc.aweme.music.model.MusicDetail):void");
    }

    /* renamed from: a */
    public final void mo76975a(MusicOwnerInfo musicOwnerInfo) {
        if (musicOwnerInfo != null && musicOwnerInfo.getUid() != null && musicOwnerInfo.getSecUid() != null) {
            if (musicOwnerInfo.getEnterType() == 1) {
                C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_method", "click_musician_profile").mo47829a("to_user_id", musicOwnerInfo.getUid()).mo47829a("type", this.f95558p).mo47829a("enter_from", "single_song").f61491a);
            } else {
                C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_method", "click_profile").mo47829a("to_user_id", musicOwnerInfo.getUid()).mo47829a("type", this.f95557o).mo47829a("enter_from", "single_song").f61491a);
            }
            SmartRouter.buildRoute(C11010c.m22280a(), "aweme://user/profile/").withParam("uid", musicOwnerInfo.getUid()).withParam("sec_user_id", musicOwnerInfo.getSecUid()).open();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo76974a(ExternalMusicInfo externalMusicInfo) {
        if (!TextUtils.isEmpty(externalMusicInfo.getExternalAppLink()) && !TextUtils.isEmpty(externalMusicInfo.getExternalDeepLink())) {
            if (Keva.getRepo("anchor_data_keva").getInt("is_resso_installed_key", -1) == -1) {
                Keva.getRepo("anchor_data_keva").storeInt("is_resso_installed_key", m83805a("com.moonvideo.android.resso") ? 1 : 0);
            }
            if (!m83805a("com.moonvideo.android.resso")) {
                SmartRouter.buildRoute(getContext(), "aweme://webview/").withParam("url", externalMusicInfo.getJumpUrl()).withParam("enter_from", "single_song").open();
            } else if (VERSION.SDK_INT >= 23) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(externalMusicInfo.getExternalAppLink()));
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.addCategory("android.intent.category.DEFAULT");
                startActivity(intent);
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(externalMusicInfo.getExternalDeepLink()));
                intent2.addCategory("android.intent.category.BROWSABLE");
                intent2.addCategory("android.intent.category.DEFAULT");
                intent2.setPackage("com.moonvideo.android.resso");
                startActivity(intent2);
            }
        } else if (externalMusicInfo != null && !TextUtils.isEmpty(externalMusicInfo.getJumpUrl())) {
            SmartRouter.buildRoute(getContext(), "aweme://webview/").withParam("url", externalMusicInfo.getJumpUrl()).withParam("hide_nav_bar", false).withParam("use_webview_title", true).withParam("bundle_forbidden_jump", true).open();
        }
        C26890h.m65011a("click_listen_complete_entrance", C23089d.m56640a().mo47829a("enter_from", "single_song").mo47829a("music_id", this.f95553k).f61491a);
    }

    /* renamed from: a */
    public final void mo76927a(CharSequence charSequence) {
        if (this.mMusicTitle != null) {
            this.mMusicTitle.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo50570a(Exception exc) {
        C32458a.m75148a((Throwable) exc);
        if (getActivity() != null) {
            C22971a.m56493a((Context) getActivity(), (Throwable) exc);
        }
    }

    /* renamed from: a */
    public final void mo55747a(int i, boolean z) {
        super.mo55747a(i, z);
        if (System.currentTimeMillis() - this.f95549aj >= 1000) {
            if (z) {
                if (i == 0) {
                    C26890h.m65004a((Context) getActivity(), "slide_right", "single_song", 0, 0);
                } else if (i == 1) {
                    C26890h.m65004a((Context) getActivity(), "slide_left", "single_song", 0, 0);
                }
            }
            this.f95549aj = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public final boolean mo50482b(int i) {
        if (i == 0) {
            this.f95535V = true;
        } else if (i == 1) {
            this.f95536W = true;
        }
        if (this.f95540aa == null) {
            this.f95535V = true;
        }
        if (this.f95541ab == null) {
            this.f95536W = true;
        }
        if (this.f95535V && this.f95536W) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b8i, null);
            ((TextView) inflate.findViewById(R.id.dkn)).setText("");
            DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.tf));
            dmtTextView.setTextColor(getResources().getColor(R.color.a19));
            dmtTextView.setText(R.string.c0e);
            if (this.f95540aa != null) {
                this.f95540aa.mo50457a(inflate, (View) dmtTextView);
            }
            if (this.f95541ab != null) {
                this.f95541ab.mo50457a(inflate, (View) dmtTextView);
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo76949a(MusicModel musicModel) {
        C26890h.m65011a("download_music", C23089d.m56640a().mo47829a("music_id", musicModel.getMusicId()).mo47829a("enter_from", "single_song").mo47829a("enter_method", "click_shoot").f61491a);
    }

    /* renamed from: a */
    public final void mo76950a(String str, MusicModel musicModel) {
        C23208an.m56934a(mo50499g());
        boolean isRecording = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().shortVideoConfig().isRecording();
        FragmentActivity activity = getActivity();
        long currentTimeMillis = System.currentTimeMillis() - this.f95547ah;
        if (!isRecording || activity == null) {
            if (TextUtils.isEmpty(this.f95546ag)) {
                this.f95546ag = UUID.randomUUID().toString();
            }
            IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
            C37514as asVar = new C37514as(this, str, currentTimeMillis, activity, musicModel);
            aVServiceImpl_Monster.asyncService(asVar);
            return;
        }
        AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().addMusic(musicModel);
        Intent intent = new Intent();
        intent.putExtra(LeakCanaryFileProvider.f132050j, str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", 0);
        activity.setResult(-1, intent);
        activity.finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo76976a(String str, long j, Activity activity, MusicModel musicModel, AsyncAVService asyncAVService, long j2) {
        Builder translationType = new Builder().creationId(this.f95546ag).musicPath(str).startRecordTime(this.f95547ah).decompressTime(j2).musicDownloadDuration(j).reshootConfig(new ReshootConfig(true, Boolean.valueOf(true))).shootWay("single_song").translationType(3);
        C37419p pVar = this.f95552j;
        Builder musicOrigin = translationType.musicWithSticker(pVar.f95441j != null ? pVar.f95441j.f95997c : null).musicOrigin("single_song");
        if (!TextUtils.isEmpty(this.f72041G)) {
            musicOrigin.stickers(C37419p.m83741a(this.f72041G));
            ArrayList a = C37419p.m83741a(this.f72041G);
            if (!a.isEmpty()) {
                musicOrigin.musicSticker((String) a.get(0));
            }
        }
        asyncAVService.uiService().recordService().startRecord(activity, musicOrigin.build(), musicModel, true);
    }

    public final boolean by_() {
        return isAdded();
    }

    /* renamed from: i */
    private void m83813i() {
        if (this.f95527M != null) {
            this.f95527M.setVisibility(8);
        }
    }

    /* renamed from: j */
    private void m83814j() {
        if (this.f95551e != null) {
            this.f95551e.setVisibility(8);
        }
    }

    /* renamed from: k */
    private void m83815k() {
        if (this.f95526L != null) {
            this.f95526L.setVisibility(8);
        }
    }

    public final void bz_() {
        C18842a.m45934b(new Runnable() {
            public final void run() {
                if (MusicDetailFragment.this.f95554l != null && MusicDetailFragment.this.f95554l.isShowing()) {
                    MusicDetailFragment.this.f95554l.setProgress(100);
                }
                MusicDetailFragment.this.mo76980f();
            }
        });
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f95552j != null) {
            this.f95552j.mo46991S_();
        }
    }

    /* renamed from: f */
    public final void mo76980f() {
        if (this.f95554l != null && this.f95554l.isShowing()) {
            this.f95554l.dismiss();
            this.f95554l = null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        mo76980f();
        this.f95552j.f95439h.mo96050a();
        this.f95555m.mo77154b();
    }

    public void onPause() {
        super.onPause();
        C37419p pVar = this.f95552j;
        pVar.mo76921e();
        if (pVar.f95440i != null) {
            pVar.f95440i.cancel();
        }
    }

    /* renamed from: q */
    public final void mo50624q() {
        super.mo50624q();
        this.f72047v.setAlpha(0.0f);
        this.f72050y.setBackgroundColor(getResources().getColor(R.color.b05));
    }

    public final void bx_() {
        C27965f.m66724a((Fragment) this, mo50606a(this.f72037C), "click_music_shoot", C47661ab.m103163a().mo94972a("login_title", C11010c.m22280a().getString(R.string.dij)).f120139a);
    }

    /* renamed from: h */
    private void m83812h() {
        if (!TextUtils.isEmpty(this.f95553k) || TextUtils.isEmpty(this.f95538Y)) {
            this.f95552j.mo44934a_(this.f95553k, Integer.valueOf(this.f95543ad), Integer.valueOf(0));
            return;
        }
        this.f95552j.mo44934a_(this.f95538Y, this.f95539Z, Integer.valueOf(1));
    }

    public final void bA_() {
        if (C23542f.m57722g().mo48705a("is_need_show_collect_succed_dialog", true)) {
            new C10643a(getActivity()).mo18899b((int) R.string.f8).mo18885a((int) R.string.f6).mo18886a((int) R.string.c_y, (OnClickListener) null).mo18910d(-3476230).mo18907c(R.drawable.div).mo18897a().mo18883c();
            C23542f.m57722g().mo48710b("is_need_show_collect_succed_dialog", false);
        }
    }

    /* renamed from: b */
    public final void mo76951b() {
        int a = C10181b.m20511a().mo18168a(LoadingDialogExperiment.class, true, "loading_dialog_optimize_type", 31744, 0);
        if (a == 0) {
            this.f95554l = C45547d.m99208b(getActivity(), getString(R.string.cds));
        } else if (a == 1) {
            this.f95554l = C37613h.m84062a(getActivity(), C37614a.VISIBLE, new C37502ah(this));
        } else if (a == 2) {
            this.f95554l = C37613h.m84062a(getActivity(), C37614a.VISIBLE_AFTER_5S, new C37503ai(this));
        } else if (a == 3) {
            this.f95554l = C37589c.m84030a(getActivity(), C37590a.VISIBLE, new C37504aj(this), getString(R.string.cds));
        } else if (a == 4) {
            this.f95554l = C37589c.m84030a(getActivity(), C37590a.VISIBLE_AFTER_5S, new C37505ak(this), getString(R.string.cds));
        }
        this.f95554l.setIndeterminate(false);
    }

    /* renamed from: r */
    public final C0677p mo50625r() {
        boolean z;
        this.f72039E = new ArrayList();
        this.f65201a = new ArrayList();
        C0654k childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder();
        sb.append(f72034s);
        sb.append(0);
        this.f95540aa = (DetailAwemeListFragment) childFragmentManager.mo2224a(sb.toString());
        if (this.f95540aa == null) {
            String str = this.f95553k;
            String str2 = this.f95537X;
            String str3 = this.f95559q;
            C37516au auVar = new C37516au();
            DetailAwemeListFragment detailAwemeListFragment = new DetailAwemeListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(C37195c.f94956x, 0);
            bundle.putString(C37195c.f94957y, "single_song");
            bundle.putString(C37195c.f94958z, str);
            bundle.putString(C37195c.f94954A, str2);
            bundle.putString("process_id", str3);
            detailAwemeListFragment.setArguments(bundle);
            detailAwemeListFragment.f65156u = auVar;
            this.f95540aa = detailAwemeListFragment;
        }
        DetailAwemeListFragment detailAwemeListFragment2 = this.f95540aa;
        if (this.f72037C == 0) {
            z = true;
        } else {
            z = false;
        }
        detailAwemeListFragment2.f65150o = z;
        this.f95540aa.f65147l = this;
        C0654k childFragmentManager2 = getChildFragmentManager();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f72034s);
        sb2.append(1);
        this.f95541ab = (DetailAwemeListFragment) childFragmentManager2.mo2224a(sb2.toString());
        this.f72039E.add(this.f95540aa);
        this.f65201a.add(Integer.valueOf(0));
        this.f95536W = true;
        ArrayList arrayList = new ArrayList();
        for (C23526a add : this.f72039E) {
            arrayList.add(add);
        }
        return new C40320dc(getChildFragmentManager(), arrayList, this.f65201a);
    }

    /* renamed from: a */
    public final void mo76926a() {
        if (this.ivPlay != null) {
            this.ivPlay.setVisibility(8);
        }
        if (this.ivStop != null) {
            this.ivStop.setVisibility(0);
        }
        if (this.ivLoading != null) {
            this.ivLoading.clearAnimation();
            this.ivLoading.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo76978c(View view) {
        m83809b(true);
    }

    /* renamed from: a */
    private boolean m83805a(String str) {
        try {
            getContext().getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d_ */
    public final void mo74300d_(Exception exc) {
        C32458a.m75148a((Throwable) exc);
        if (isViewValid()) {
            this.mStatusView.mo19204a(true);
        }
    }

    @C53771m
    public void onMusicFeedBackEvent(C37352e eVar) {
        C10691a.m21548c(getContext(), (int) R.string.hk7).mo19066a();
    }

    /* renamed from: a */
    private static boolean m83804a(Music music) {
        try {
            if (new JSONObject(music.getExtra()).getInt("has_edited") == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e_ */
    public final void mo76955e_(int i) {
        if (this.f95554l != null) {
            this.f95554l.setProgress(i);
            if (i >= 98 && this.f95554l != null) {
                this.f95554l.setCancelable(true);
            }
        }
    }

    @C53771m
    public void onAntiCrawlerEvent(C23481a aVar) {
        String str = aVar.f62554a;
        if (str != null && str.contains("/aweme/v1/music/detail/?")) {
            C47718bf.m103293f(aVar);
            m83809b(true);
        }
    }

    @C53771m
    public void onEvent(C35471h hVar) {
        if (TextUtils.equals("music", hVar.itemType)) {
            C47881fd.m103578a(getActivity(), this.mHeadLayout, hVar);
        }
    }

    /* renamed from: b */
    private void m83809b(boolean z) {
        if (this.mStatusView.mo19210d(true)) {
            m83812h();
            if (z) {
                for (C27336g n : this.f72039E) {
                    n.mo50473n();
                }
            }
        }
    }

    /* renamed from: c */
    private void m83811c(boolean z) {
        boolean z2;
        int i = 0;
        try {
            z2 = C32816h.m75716b().getOriginalMusicianEntry().booleanValue();
        } catch (C10174a unused) {
            z2 = false;
        }
        if (z2) {
            try {
                i = C32816h.m75716b().getMusicianShowType().intValue();
            } catch (C10174a unused2) {
            }
            if (i == 1 || z) {
                C18842a.m45934b(new Runnable() {
                    public final void run() {
                        ImageView imageView = MusicDetailFragment.this.mMusicianEntry;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                            imageView.setClickable(true);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private static List<MusicOwnerInfo> m83803a(List<MusicOwnerInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (!C9376b.m18558a((Collection<T>) list)) {
            for (MusicOwnerInfo musicOwnerInfo : list) {
                if (!TextUtils.isEmpty(musicOwnerInfo.getUid()) && !TextUtils.isEmpty(musicOwnerInfo.getSecUid()) && !TextUtils.isEmpty(musicOwnerInfo.getNickName()) && !TextUtils.isEmpty(musicOwnerInfo.getHandle())) {
                    arrayList.add(musicOwnerInfo);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m83807b(MusicDetail musicDetail) {
        if (musicDetail == null || musicDetail.music == null || musicDetail.music.getExternalMusicInfos() == null) {
            m83815k();
            return;
        }
        List<ExternalMusicInfo> externalMusicInfos = musicDetail.music.getExternalMusicInfos();
        if (C9376b.m18558a((Collection<T>) externalMusicInfos)) {
            m83815k();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!C9376b.m18558a((Collection<T>) externalMusicInfos)) {
            for (ExternalMusicInfo externalMusicInfo : externalMusicInfos) {
                if (!TextUtils.isEmpty(externalMusicInfo.getJumpUrl()) && !TextUtils.isEmpty(externalMusicInfo.getPartnerName()) && !C9376b.m18558a((Collection<T>) MusicService.createIMusicServicebyMonsterPlugin().getMusicCoverUrl(externalMusicInfo.getPartnerName()))) {
                    arrayList.add(externalMusicInfo);
                }
            }
        }
        if (C9376b.m18558a((Collection<T>) arrayList)) {
            m83815k();
        } else {
            m83808b((List<ExternalMusicInfo>) arrayList);
        }
    }

    /* renamed from: c */
    public final void mo55749c(int i) {
        super.mo55749c(i);
        if (i == 0) {
            C26890h.m65004a((Context) getActivity(), "click_hot", "single_song", 0, 0);
            return;
        }
        if (i == 1) {
            C26890h.m65004a((Context) getActivity(), "click_fresh", "single_song", 0, 0);
        }
    }

    @C53771m
    public void onVideoEvent(C30332aw awVar) {
        if (awVar.f79228a == 2) {
            String str = (String) awVar.f79229b;
            if (isViewValid() && this.f95542ac != null && !TextUtils.isEmpty(str)) {
                Aweme awemeById = C23324d.m57378a().getAwemeById(str);
                if (!(awemeById == null || awemeById.getMusic() == null || awemeById.getMusic().getId() != this.f95542ac.music.getId())) {
                    int userCount = this.f95542ac.music.getUserCount();
                    if (userCount > 0) {
                        this.f95542ac.music.setUserCount(userCount - 1);
                        mo74299a(this.f95542ac);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m83810c(MusicDetail musicDetail) {
        String str;
        int i;
        int i2;
        Music music = musicDetail.music;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        List<RelatedChallengeMusic> list = musicDetail.relatedChallengeMusicList;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            RelatedChallengeMusic relatedChallengeMusic = (RelatedChallengeMusic) list.get(i3);
            if (relatedChallengeMusic.categoryType == 1) {
                Music music2 = relatedChallengeMusic.music;
                if (music2 != null) {
                    sb.append(music2.getMid());
                    sb.append(",");
                }
            } else if (relatedChallengeMusic.categoryType == 2) {
                Challenge challenge = relatedChallengeMusic.challenge;
                if (music != null) {
                    sb2.append(challenge.getCid());
                    sb2.append(",");
                }
            }
        }
        String str2 = "0";
        if (TextUtils.equals(this.f95537X, "from_related_tag")) {
            str = this.f95553k;
            str2 = "1";
        } else {
            str = "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("level", str2);
            jSONObject.put("enter_from", str);
            JSONObject jSONObject2 = new JSONObject();
            String str3 = "music";
            String sb3 = sb.toString();
            if (sb.length() > 0) {
                i = sb.length() - 1;
            } else {
                i = 0;
            }
            jSONObject2.put(str3, sb3.substring(0, i));
            String str4 = "challenge";
            String sb4 = sb2.toString();
            if (sb2.length() > 0) {
                i2 = sb2.length() - 1;
            } else {
                i2 = 0;
            }
            jSONObject2.put(str4, sb4.substring(0, i2));
            jSONObject.put("related", jSONObject2);
        } catch (JSONException unused) {
        }
        C26890h.onEvent(MobClick.obtain().setEventName("extend_music").setLabelName("music").setValue(this.f95553k).setJsonObject(jSONObject));
    }

    /* renamed from: a */
    public final C27365i mo55746a(ViewGroup viewGroup) {
        return new C37219a(viewGroup.getContext(), viewGroup);
    }

    /* renamed from: b */
    private void m83808b(List<ExternalMusicInfo> list) {
        if (this.f95526L == null) {
            if (MusicService.createIMusicServicebyMonsterPlugin().getIsUseMusicPartnersNewStyle()) {
                this.f95526L = (ViewGroup) this.mVsThirdMusicNewStyle.inflate();
                Collections.reverse(list);
            } else {
                this.f95526L = (ViewGroup) this.mVsThirdMusic.inflate();
            }
        }
        if (this.f95529P == null) {
            TextView textView = (TextView) this.f95526L.findViewById(R.id.ddr);
            if (textView != null && !TextUtils.isEmpty(MusicService.createIMusicServicebyMonsterPlugin().getMusicCoverDisplayText())) {
                textView.setText(MusicService.createIMusicServicebyMonsterPlugin().getMusicCoverDisplayText());
            }
            this.f95529P = (RecyclerView) this.f95526L.findViewById(R.id.czq);
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getContext(), 0, false);
            if (MusicService.createIMusicServicebyMonsterPlugin().getIsUseMusicPartnersNewStyle()) {
                wrapLinearLayoutManager.mo4732b(true);
            } else {
                this.f95529P.mo4798a((C1331h) new C37585bt());
            }
            this.f95529P.setLayoutManager(wrapLinearLayoutManager);
            this.f95532S = new C37313p();
            this.f95532S.f95227a = new C37509ao(this, list);
            if (list.size() == 1) {
                this.f95526L.setClickable(true);
                this.f95526L.setOnClickListener(new C37510ap(this, list));
            }
            this.f95532S.mo54798c(false);
            this.f95529P.setAdapter(this.f95532S);
        }
        if (this.f95532S != null) {
            this.f95532S.mo50303a(list);
        }
        for (ExternalMusicInfo externalMusicInfo : list) {
            HashMap hashMap = new HashMap();
            hashMap.put("music_id", externalMusicInfo.getPartnerSongId());
            hashMap.put("music_from", externalMusicInfo.getPartnerName());
            hashMap.put("process_id", this.f95559q);
            C26890h.m65011a("show_copyright_music", (Map<String, String>) hashMap);
        }
        this.f95526L.setVisibility(0);
    }

    public void click(View view) {
        String str;
        String str2;
        String str3;
        int id = view.getId();
        if (id == R.id.ik) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            return;
        }
        List list = null;
        if (id == R.id.bfz) {
            if (this.ivMusicCollect != null) {
                this.ivMusicCollect.mo76959b();
            }
            C37419p pVar = this.f95552j;
            FragmentActivity activity2 = getActivity();
            pVar.f95445n = true;
            if (!pVar.f95442k) {
                String str4 = "favourite_song";
                C23089d a = C23089d.m56640a().mo47829a("enter_from", "single_song").mo47829a("process_id", pVar.f95446o);
                String str5 = "music_id";
                if (pVar.f95434a != null) {
                    str3 = pVar.f95434a.getMusicId();
                } else {
                    str3 = "";
                }
                C26890h.m65011a(str4, a.mo47829a(str5, str3).f61491a);
            } else {
                String str6 = "cancel_favourite_song";
                C23089d a2 = C23089d.m56640a().mo47829a("enter_from", "single_song").mo47829a("process_id", pVar.f95446o);
                String str7 = "music_id";
                if (pVar.f95434a != null) {
                    str2 = pVar.f95434a.getMusicId();
                } else {
                    str2 = "";
                }
                C26890h.m65011a(str6, a2.mo47829a(str7, str2).f61491a);
            }
            if ((TextUtils.equals(pVar.f95437d, "search_result") || TextUtils.equals(pVar.f95437d, "general_search")) && !pVar.f95442k) {
                C28423z y = C23794bh.m58411y();
                String str8 = "search_favourite";
                String str9 = "single_song";
                if (pVar.f95434a == null || TextUtils.isEmpty(pVar.f95434a.getMusicId())) {
                    str = "";
                } else {
                    str = pVar.f95434a.getMusicId();
                }
                y.mo56823a(str8, str9, str, TextUtils.equals(pVar.f95437d, "search_result"));
            }
            if (!C20854a.m53167g().isLogin()) {
                C27965f.m66721a((Activity) activity2, "single_song", "click_favorite_music", (Bundle) null, (C23505g) new C37422q(pVar, activity2));
            } else {
                pVar.mo76919a((Context) activity2);
            }
        } else if (id == R.id.cmr) {
            C37419p pVar2 = this.f95552j;
            FragmentActivity activity3 = getActivity();
            DetailAwemeListFragment detailAwemeListFragment = this.f95540aa;
            if (pVar2.f95435b != null) {
                if (!MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(pVar2.f95435b.convertToMusicModel(), activity3, true)) {
                    C26890h.m65011a("user_music_failed", C23089d.m56640a().mo47829a("previous_page", "music_hot").mo47829a("action_type", "share").mo47829a("music_id", pVar2.f95435b.getMid()).mo47829a("enter_from", pVar2.f95437d).f61491a);
                } else {
                    C26890h.m65005a(activity3.getApplicationContext(), "click_share_button", "music_hot", pVar2.f95435b.getMid(), 0);
                    new C23238h().mo48086d("music_hot").mo48088e("music_hot").mo48090g(pVar2.f95438e).mo48076e();
                }
            }
            if (pVar2.f95434a != null) {
                C26890h.m65011a("share_single_song", C23089d.m56640a().mo47829a("song_id", pVar2.f95434a.getMusicId()).mo47829a("enter_from", "single_song").mo47829a("process_id", pVar2.f95446o).f61491a);
            }
            SecApiImpl.createISecApibyMonsterPlugin().reportData("share");
            if (!(pVar2.f95435b == null || pVar2.f95435b.getShareInfo() == null)) {
                if (detailAwemeListFragment != null) {
                    list = detailAwemeListFragment.mo50480p();
                }
                C41979aq.m91946a().shareMusic(activity3, pVar2.f95435b, new C42356f() {
                    /* renamed from: a */
                    public final void mo49961a(C42357g gVar, SharePackage sharePackage, Context context) {
                        if (C42153d.m92523a(gVar)) {
                            C37419p.this.mo76920a(gVar.mo49954c(), C37419p.this.f95446o);
                            C37419p.m83742a(gVar.mo49954c(), true, sharePackage, context, C37419p.this.f95435b);
                        }
                    }

                    /* renamed from: a */
                    public final void mo49959a(C42307b bVar, boolean z, SharePackage sharePackage, Context context) {
                        C37419p.this.mo76920a(bVar.mo86136b(), C37419p.this.f95446o);
                        C37419p.m83742a(bVar.mo86136b(), z, sharePackage, context, C37419p.this.f95435b);
                    }
                }, list, pVar2.f95446o);
            }
        } else if (id == R.id.bok) {
            C37419p pVar3 = this.f95552j;
            FragmentActivity activity4 = getActivity();
            if (pVar3.f95435b == null || MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(pVar3.f95435b.convertToMusicModel(), activity4, true)) {
                pVar3.mo76922f();
                return;
            }
            C26890h.m65011a("user_music_failed", C23089d.m56640a().mo47829a("previous_page", "music_hot").mo47829a("action_type", "play").mo47829a("music_id", pVar3.f95435b.getMid()).mo47829a("enter_from", pVar3.f95437d).f61491a);
        } else if (id == R.id.boq) {
            this.f95552j.mo76921e();
        } else if (id == R.id.boa && !C32800a.m75679a(view)) {
            C37419p pVar4 = this.f95552j;
            Context requireContext = requireContext();
            if (!(pVar4.f95434a == null || pVar4.f95434a.getMusic() == null || TextUtils.isEmpty(pVar4.f95434a.getMusic().getOwnerId()))) {
                if (pVar4.f95435b != null && pVar4.f95435b.isOriginMusic()) {
                    C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_method", "click_name").mo47829a("to_user_id", pVar4.f95435b.getOwnerId()).mo47829a("enter_from", "single_song").f61491a);
                }
                SmartRouter.buildRoute(requireContext, "aweme://user/profile/").withParam("id", pVar4.f95435b.getOwnerId()).withParam("sec_user_id", pVar4.f95435b.getSecUid()).withParam("enter_from", "music_detail").open();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo76977b(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        this.f95546ag = UUID.randomUUID().toString();
        this.f95547ah = System.currentTimeMillis();
        C37419p pVar = this.f95552j;
        Context requireContext = requireContext();
        String str5 = this.f95546ag;
        if (pVar.f95435b == null || MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(pVar.f95435b.convertToMusicModel(), requireContext, true)) {
            String str6 = pVar.f95446o;
            if (C20854a.m53167g().getCurUser().isLive()) {
                C10691a.m21548c(requireContext, (int) R.string.btm).mo19066a();
            } else if (AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishing()) {
                C10691a.m21548c(requireContext, (int) R.string.hr).mo19066a();
            } else if (pVar.f95435b == null || TextUtils.isEmpty(pVar.f95435b.getOwnerBanShowInfo())) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("route", "1");
                    jSONObject.put("group_id", pVar.f95438e);
                } catch (JSONException unused) {
                }
                C23208an.m56934a("single_song");
                C23208an.m56935b("click_music_publish");
                C23089d a = C23089d.m56640a().mo47829a("creation_id", str5).mo47829a("shoot_way", "single_song").mo47829a("enter_from", "single_song").mo47829a("music_id", pVar.f95436c).mo47829a("process_id", str6).mo47829a("group_id", pVar.f95438e);
                if (C23198ae.m56870i(pVar.f95437d)) {
                    a.mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56872j(pVar.f95438e)));
                }
                if (!TextUtils.isEmpty(pVar.f95447p)) {
                    ArrayList a2 = C37419p.m83741a(pVar.f95447p);
                    if (!a2.isEmpty()) {
                        a.mo47829a("prop_id", (String) a2.get(0));
                    }
                }
                C26890h.m65011a("shoot", a.f61491a);
                if (TextUtils.equals("search_result", pVar.f95437d) || TextUtils.equals("general_search", pVar.f95437d) || TextUtils.equals("search_for_you_list", pVar.f95437d)) {
                    String str7 = "search_shoot";
                    C23089d a3 = C23089d.m56640a().mo47829a("creation_id", str5).mo47829a("shoot_way", "single_song").mo47829a("music_id", pVar.f95436c);
                    String str8 = "search_type";
                    if (TextUtils.equals("general_search", pVar.f95437d)) {
                        str2 = "general";
                    } else {
                        str2 = "music";
                    }
                    C23089d a4 = a3.mo47829a(str8, str2);
                    String str9 = "previous_page";
                    if (TextUtils.equals("general_search", pVar.f95437d)) {
                        str3 = "search_result";
                    } else {
                        str3 = pVar.f95437d;
                    }
                    C26890h.m65011a(str7, a4.mo47829a(str9, str3).f61491a);
                }
                if (pVar.f95435b == null || MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(pVar.f95435b.convertToMusicModel(), requireContext, true)) {
                    pVar.f95441j.mo77151a(pVar.f95434a, pVar.mo76923g(), true);
                    return;
                }
                String str10 = "user_music_failed";
                C23089d a5 = C23089d.m56640a();
                String str11 = "previous_page";
                if (TextUtils.equals("general_search", pVar.f95437d)) {
                    str = "search_result";
                } else {
                    str = pVar.f95437d;
                }
                C26890h.m65011a(str10, a5.mo47829a(str11, str).mo47829a("action_type", "shoot").mo47829a("music_id", pVar.f95436c).mo47829a("enter_from", pVar.f95437d).f61491a);
            } else {
                C10691a.m21545b(requireContext, pVar.f95435b.getOwnerBanShowInfo()).mo19066a();
            }
        } else {
            String str12 = "user_music_failed";
            C23089d a6 = C23089d.m56640a();
            String str13 = "previous_page";
            if (TextUtils.equals("general_search", pVar.f95437d)) {
                str4 = "search_result";
            } else {
                str4 = pVar.f95437d;
            }
            C26890h.m65011a(str12, a6.mo47829a(str13, str4).mo47829a("action_type", "shoot").mo47829a("music_id", pVar.f95436c).mo47829a("enter_from", pVar.f95437d).f61491a);
        }
    }

    /* renamed from: a */
    public final void mo50608a(int i, int i2) {
        super.mo50608a(i, i2);
    }

    /* renamed from: a */
    private static boolean m83806a(List<MusicOwnerInfo> list, String str) {
        if (list == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return false;
        }
        for (MusicOwnerInfo uid : list) {
            if (TextUtils.equals(uid.getUid(), str)) {
                return true;
            }
        }
        return false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!C37515at.m83914a(getActivity())) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
        }
        if (!TextUtils.isEmpty(this.f95553k) || !TextUtils.isEmpty(this.f95538Y)) {
            this.f95555m = new C37646v(getActivity(), this);
            this.f95548ai = new SafeHandler(this);
            this.f95552j = new C37419p();
            this.f95552j.mo54800a(this);
            C37419p pVar = this.f95552j;
            Bundle arguments = getArguments();
            if (arguments != null) {
                pVar.f95436c = arguments.getString("id");
                pVar.f95437d = arguments.getString("extra_music_from");
                pVar.f95438e = arguments.getString("aweme_id");
                pVar.f95446o = arguments.getString("process_id");
                pVar.f95447p = arguments.getString("sticker_id");
            }
            this.f95552j.f95441j = this.f95555m;
            this.ivMusicCollect.setOnStateChangeListener(this.f95552j);
            this.f95552j.f95443l.observe(this, new C37500af(this));
            this.mStatusView.setBuilder(C10719a.m21676a(getContext()).mo19232b(new C10723a(getContext()).mo19277a((int) R.drawable.dgk).mo19280b((int) R.string.f5o).mo19282c(R.string.f5k).mo19278a(C10720a.BORDER, R.string.f5u, new C37501ag(this)).f28711a));
            m83809b(false);
            BusinessComponentServiceUtils.getLabService().mo46903a();
            ((DmtTextView) view.findViewById(R.id.csf)).setText(getContext().getResources().getString(R.string.din));
            View findViewById = view.findViewById(R.id.csb);
            findViewById.setOnClickListener(new C37512aq(this));
            int c = C0726c.m2098c(getContext(), R.color.z_);
            C37557bo boVar = new C37557bo(C9432q.m18687b(getContext(), 4.0f), Blur.NORMAL, 0.0f, C9432q.m18687b(getContext(), 2.0f), C0726c.m2098c(getContext(), R.color.x));
            findViewById.setBackground(new C37586bu(c, boVar));
            return;
        }
        getActivity().finish();
    }

    /* renamed from: b */
    public final void mo50613b(int i, int i2) {
        boolean z;
        super.mo50613b(i, i2);
        if (this.f95556n != null && this.f95556n.isShowing()) {
            this.f95556n.dismiss();
        }
        if (this.f95550d != null) {
            MusicCollectGuidePopupWindow musicCollectGuidePopupWindow = this.f95550d;
            if (i > C23728o.m58241a(44.0d)) {
                musicCollectGuidePopupWindow.dismiss();
            }
        }
        float f = 0.0f;
        if (this.f95524J == 0.0f) {
            if (this.mMusicName.getVisibility() == 0) {
                this.f95524J = (float) (this.mMusicName.getBottom() - this.f72048w.getBottom());
            } else if (this.mMusicTitle.getVisibility() == 0) {
                this.f95524J = (float) (this.mMusicTitle.getBottom() - this.f72048w.getBottom());
            }
        }
        if (this.f95560r == 0.0f) {
            this.f95560r = (float) (this.mHeadLayout.getBottom() - this.f72048w.getBottom());
        }
        float f2 = (float) i;
        float f3 = (f2 - this.f95524J) / (this.f95560r - this.f95524J);
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        this.f72048w.setAlpha(f3);
        float f4 = f2 / this.f95560r;
        if (f4 >= 0.0f) {
            f = f4;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.f72047v.setAlpha(f);
        this.mHeadLayout.setAlpha(1.0f - (f2 / this.f95560r));
        this.f72047v.setTypeface(Typeface.DEFAULT_BOLD);
        ImageView imageView = this.mMusicianEntry;
        imageView.setAlpha(1.0f - f3);
        if (imageView.getAlpha() >= 0.5f) {
            z = true;
        } else {
            z = false;
        }
        imageView.setClickable(z);
        if (this.f95525K && f3 < 0.1f) {
            if (this.f72042H != null) {
                this.f72042H.mo55757c();
            }
            this.f95525K = false;
        }
    }

    /* renamed from: a */
    public final void mo50607a(float f, float f2) {
        mo55752v();
        if (Math.abs(f) < Math.abs(f2)) {
            if (f2 > 30.0f) {
                if (this.f72042H != null) {
                    this.f72042H.mo55758d();
                }
            } else if (f2 < -30.0f) {
                this.f95525K = true;
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1 && intent != null) {
            C37419p pVar = this.f95552j;
            String stringExtra = intent.getStringExtra("MUSIC_TITLE");
            if (pVar.f95435b != null) {
                pVar.f95435b.setMusicName(stringExtra);
            }
            if (pVar.f70701g != null) {
                ((C37425t) pVar.f70701g).mo76927a((CharSequence) stringExtra);
            }
        }
    }
}
