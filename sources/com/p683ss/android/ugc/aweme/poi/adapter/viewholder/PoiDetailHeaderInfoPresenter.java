package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.C2240a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.C11079a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.poi.model.C39128l;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39049i;
import com.p683ss.android.ugc.aweme.poi.p2061d.C39061b;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39389l;
import com.p683ss.android.ugc.aweme.poi.utils.C39462r;
import com.p683ss.android.ugc.aweme.poi.widget.PoiLabelsLayout;
import com.p683ss.android.ugc.aweme.poi.widget.RatingBar;
import com.p683ss.android.ugc.aweme.poi.widget.TextAppendViewLayout;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter */
public class PoiDetailHeaderInfoPresenter {

    /* renamed from: a */
    public Context f99360a;

    /* renamed from: b */
    private C39389l f99361b;

    /* renamed from: c */
    private C39061b f99362c;

    /* renamed from: d */
    private PoiDetail f99363d;

    /* renamed from: e */
    private C39000b f99364e;

    /* renamed from: f */
    private C39128l f99365f;
    protected View mLocalLayout;
    protected TextAppendViewLayout mNewLineLayout;
    protected DmtTextView mPoiCollectContent;
    protected CheckableImageView mPoiCollectImg;
    protected View mPoiCollectLayout;
    protected PoiLabelsLayout mPoiDetails;
    protected TextView mPoiName;
    protected View mPoiNameLayout;
    protected DmtTextView mPoiOpenTimeTxt;
    protected TextView mPoiPrice;
    protected View mPoiRating;
    protected RatingBar mPoiRatingBar;
    protected View mPoiRatingLayout;
    protected DmtTextView mPoiRatingTxt;
    protected TextView mPoiSubType;
    protected TextView mPoiVisitor;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter$a */
    public interface C38999a {
        /* renamed from: a */
        void mo79150a(boolean z);

        /* renamed from: c */
        C39128l mo79151c();

        /* renamed from: d */
        CheckableImageView mo79152d();
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter$b */
    public interface C39000b {
        /* renamed from: a */
        void mo79153a(int i, float f);
    }

    /* renamed from: a */
    private boolean m86825a() {
        long j;
        PoiStruct poiStruct = this.f99363d.getPoiStruct();
        if (poiStruct == null) {
            return true;
        }
        String str = poiStruct.viewCount;
        if (TextUtils.isEmpty(str)) {
            this.mPoiVisitor.setVisibility(8);
            return true;
        }
        try {
            j = Long.parseLong(str);
        } catch (Exception unused) {
            j = 0;
        }
        if (j <= 0) {
            this.mPoiVisitor.setVisibility(8);
            return true;
        }
        this.mPoiVisitor.setText(C2240a.m6772a(this.f99360a.getResources().getString(R.string.p6), new Object[]{C33095b.m76068a(j)}));
        return false;
    }

    /* renamed from: a */
    public final void mo79147a(View view) {
        float f;
        int measuredHeight = this.mLocalLayout.getMeasuredHeight();
        int height = view.getHeight();
        float measuredHeight2 = ((float) this.mPoiNameLayout.getMeasuredHeight()) + C9432q.m18687b(this.f99360a, 16.0f);
        float b = C9432q.m18687b(this.f99360a, 52.0f);
        if (VERSION.SDK_INT >= 19) {
            b += (float) C11065a.m22390a(this.f99360a);
        }
        if (this.f99364e != null) {
            C39000b bVar = this.f99364e;
            int i = measuredHeight + height + 0;
            if (measuredHeight2 > b) {
                f = 0.0f;
            } else {
                f = b - measuredHeight2;
            }
            bVar.mo79153a(i, f);
        }
        this.mLocalLayout.setVisibility(8);
        view.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01af  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79148a(com.p683ss.android.ugc.aweme.poi.model.PoiDetail r9) {
        /*
            r8 = this;
            r8.f99363d = r9
            android.widget.TextView r0 = r8.mPoiName
            java.lang.String r1 = r9.getTitle()
            r0.setText(r1)
            com.ss.android.ugc.aweme.poi.widget.PoiLabelsLayout r0 = r8.mPoiDetails
            r1 = 3
            int[] r1 = new int[r1]
            r1 = {2, 1, 3} // fill-array
            r0.setChildsToHideInSequence(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.mPoiCollectContent
            r1 = 2132547536(0x7f1c17d0, float:2.074832E38)
            r0.setText(r1)
            android.content.Context r0 = r8.f99360a
            com.ss.android.ugc.aweme.poi.model.PoiDetail r1 = r8.f99363d
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0028
            goto L_0x0072
        L_0x0028:
            boolean r5 = r1.canClaim()
            if (r5 == 0) goto L_0x0049
            android.content.res.Resources r5 = r0.getResources()
            r6 = 2131230791(0x7f080047, float:1.8077645E38)
            java.lang.String[] r5 = r5.getStringArray(r6)
            android.content.res.Resources r6 = r0.getResources()
            r7 = 2132547663(0x7f1c184f, float:2.0748578E38)
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r5 = r1.getEnterpriseBusinessTime(r5, r6)
            goto L_0x004a
        L_0x0049:
            r5 = r2
        L_0x004a:
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r5)
            if (r6 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.poi.model.w r6 = r1.poiExtension
            if (r6 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.poi.model.w r1 = r1.poiExtension
            java.lang.String r5 = r1.open_time
        L_0x0058:
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r5)
            if (r1 == 0) goto L_0x005f
            goto L_0x0072
        L_0x005f:
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2132547664(0x7f1c1850, float:2.074858E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r5
            java.lang.String r2 = com.C2240a.m6772a(r0, r1)
        L_0x0072:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0082
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.mPoiOpenTimeTxt
            r0.setVisibility(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.mPoiOpenTimeTxt
            r0.setText(r2)
        L_0x0082:
            com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r8.f99363d
            java.lang.String r0 = r0.getI18nPrice()
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)
            r1 = 8
            if (r0 == 0) goto L_0x00be
            com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r8.f99363d
            java.lang.String r0 = r0.getPrice()
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r0)
            if (r2 == 0) goto L_0x00a3
            android.widget.TextView r0 = r8.mPoiPrice
            r0.setVisibility(r1)
            r0 = 1
            goto L_0x00ca
        L_0x00a3:
            android.widget.TextView r2 = r8.mPoiPrice
            android.content.Context r5 = r8.f99360a
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2132547543(0x7f1c17d7, float:2.0748335E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r4] = r0
            java.lang.String r0 = com.C2240a.m6772a(r5, r6)
            r2.setText(r0)
            goto L_0x00c9
        L_0x00be:
            android.widget.TextView r0 = r8.mPoiPrice
            com.ss.android.ugc.aweme.poi.model.PoiDetail r2 = r8.f99363d
            java.lang.String r2 = r2.getI18nPrice()
            r0.setText(r2)
        L_0x00c9:
            r0 = 0
        L_0x00ca:
            com.ss.android.ugc.aweme.poi.model.PoiDetail r2 = r8.f99363d
            java.lang.String r2 = r2.getSubType()
            boolean r5 = com.bytedance.common.utility.C9431p.m18664a(r2)
            if (r5 == 0) goto L_0x00dd
            android.widget.TextView r2 = r8.mPoiSubType
            r2.setVisibility(r1)
            r2 = 1
            goto L_0x00e3
        L_0x00dd:
            android.widget.TextView r5 = r8.mPoiSubType
            r5.setText(r2)
            r2 = 0
        L_0x00e3:
            boolean r5 = r8.m86825a()
            if (r0 == 0) goto L_0x00ef
            if (r2 == 0) goto L_0x00ef
            if (r5 == 0) goto L_0x00ef
            r0 = 1
            goto L_0x00f0
        L_0x00ef:
            r0 = 0
        L_0x00f0:
            com.ss.android.ugc.aweme.poi.model.PoiDetail r2 = r8.f99363d
            float r2 = r2.getRating()
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x00fd
            r3 = 0
            goto L_0x0127
        L_0x00fd:
            android.view.View r5 = r8.mPoiRating
            r5.setVisibility(r4)
            com.ss.android.ugc.aweme.poi.widget.RatingBar r5 = r8.mPoiRatingBar
            r5.setStar(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r8.mPoiRatingTxt
            android.content.Context r5 = r8.f99360a
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2132547636(0x7f1c1834, float:2.0748524E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.ss.android.ugc.aweme.poi.model.PoiDetail r7 = r8.f99363d
            java.lang.String r7 = r7.getRatingStr()
            r6[r4] = r7
            java.lang.String r5 = com.C2240a.m6772a(r5, r6)
            r2.setText(r5)
        L_0x0127:
            if (r3 != 0) goto L_0x0130
            if (r0 == 0) goto L_0x0130
            android.view.View r0 = r8.mPoiRatingLayout
            r0.setVisibility(r1)
        L_0x0130:
            android.view.View r0 = r8.mPoiCollectLayout
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x016e
            android.content.Context r0 = r8.f99360a
            r1 = 1098907648(0x41800000, float:16.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            int r0 = (int) r0
            android.view.View r1 = r8.mPoiCollectLayout
            r2 = 2131954755(0x7f130c43, float:1.9546018E38)
            r1.setBackgroundResource(r2)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r0, r0)
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r0 = r8.mPoiCollectImg
            r0.setLayoutParams(r1)
            com.ss.android.ugc.aweme.poi.ui.l r0 = r8.f99361b
            if (r0 == 0) goto L_0x016e
            com.ss.android.ugc.aweme.poi.ui.l r0 = r8.f99361b
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r1 = r8.mPoiCollectImg
            com.ss.android.ugc.aweme.poi.model.PoiDetail r1 = r8.f99363d
            if (r1 == 0) goto L_0x016e
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r1.getPoiStruct()
            r0.f100759c = r2
            boolean r1 = r1.isCollected()
            r0.f100758b = r1
            r0.mo80359c()
        L_0x016e:
            com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r8.f99363d
            if (r0 == 0) goto L_0x01a9
            com.ss.android.ugc.aweme.poi.d.b r0 = new com.ss.android.ugc.aweme.poi.d.b
            com.ss.android.ugc.aweme.poi.model.PoiDetail r1 = r8.f99363d
            com.ss.android.ugc.aweme.poi.widget.TextAppendViewLayout r2 = r8.mNewLineLayout
            r0.<init>(r1, r2)
            r8.f99362c = r0
            com.ss.android.ugc.aweme.poi.d.b r0 = r8.f99362c
            com.ss.android.ugc.aweme.poi.model.PoiDetail r1 = r0.f99614d
            com.ss.android.ugc.aweme.poi.model.ab r1 = r1.getCityWindow()
            if (r1 != 0) goto L_0x0188
            goto L_0x01a9
        L_0x0188:
            android.widget.LinearLayout r2 = r0.f99611a
            r2.setVisibility(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f99612b
            java.lang.String r3 = r1.getContent()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            java.lang.String r2 = "mini_g_city_show"
            r0.mo79221a(r2)
            android.widget.LinearLayout r2 = r0.f99611a
            com.ss.android.ugc.aweme.poi.d.b$a r3 = new com.ss.android.ugc.aweme.poi.d.b$a
            r3.<init>(r0, r1)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
        L_0x01a9:
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.poi.model.l r1 = r8.f99365f
            if (r1 == 0) goto L_0x01b3
            com.ss.android.ugc.aweme.poi.model.l r0 = r8.f99365f
            java.lang.String r0 = r0.from
        L_0x01b3:
            r7 = r0
            android.widget.TextView r1 = r8.mPoiName
            android.widget.TextView r0 = r8.mPoiName
            java.lang.CharSequence r2 = r0.getText()
            android.content.Context r3 = r8.f99360a
            r4 = 2132547550(0x7f1c17de, float:2.074835E38)
            java.lang.String r5 = "poi_name"
            r6 = r9
            com.p683ss.android.ugc.aweme.poi.utils.C39462r.m87771a(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.mo79148a(com.ss.android.ugc.aweme.poi.model.PoiDetail):void");
    }

    public PoiDetailHeaderInfoPresenter(C11079a aVar, C38999a aVar2, View view, C39389l lVar, C39000b bVar) {
        this.f99360a = view.getContext();
        this.f99364e = bVar;
        ButterKnife.bind((Object) this, view);
        if (!(lVar == null || aVar2 == null)) {
            this.f99361b = lVar;
            this.f99361b.mo80357a(aVar, this.mPoiCollectImg, aVar2.mo79152d());
            this.f99365f = aVar2.mo79151c();
            this.f99361b.f100763g = this.f99365f;
        }
        this.mPoiCollectImg.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                PoiDetailHeaderInfoPresenter.this.mPoiCollectImg.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int[] iArr = new int[2];
                PoiDetailHeaderInfoPresenter.this.mPoiCollectImg.getLocationOnScreen(iArr);
                C47718bf.m103288a(new C39049i(iArr[0] + (PoiDetailHeaderInfoPresenter.this.mPoiCollectImg.getWidth() / 4), (int) (((float) (iArr[1] + PoiDetailHeaderInfoPresenter.this.mPoiCollectImg.getHeight())) + C9432q.m18687b(PoiDetailHeaderInfoPresenter.this.f99360a, 8.0f))));
            }
        });
        if (!C39462r.m87772a()) {
            this.mPoiCollectLayout.setVisibility(8);
        }
    }
}
