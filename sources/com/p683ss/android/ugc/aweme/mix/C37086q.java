package com.p683ss.android.ugc.aweme.mix;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p683ss.android.ugc.aweme.feed.utils.C31214w;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.mix.q */
public final class C37086q implements C37023e {
    /* renamed from: a */
    public final boolean mo76332a() {
        return C31214w.m72900a();
    }

    /* renamed from: b */
    public final boolean mo76335b() {
        return C31214w.m72900a();
    }

    /* renamed from: a */
    public final boolean mo76333a(Aweme aweme, int i, String str) {
        if (!C31214w.m72900a() || aweme == null || !aweme.isMixAweme()) {
            return false;
        }
        if (i == 1 && (aweme.isHotSearchAweme() || aweme.isHotVideoAweme() || aweme.getHotListStruct() != null)) {
            return false;
        }
        if (i == 2 || i == 1) {
            if (aweme.isProhibited() && C23198ae.m56880p(aweme)) {
                return false;
            }
            AwemeStatus status = aweme.getStatus();
            if (status != null && status.isInReviewing()) {
                return false;
            }
            AwemeStarAtlas starAtlasInfo = aweme.getStarAtlasInfo();
            if (starAtlasInfo != null && C23198ae.m56880p(aweme)) {
                int reviewStatus = starAtlasInfo.getReviewStatus();
                if (reviewStatus == 1 || reviewStatus == 2 || reviewStatus == 3 || reviewStatus == 4) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo76336b(Aweme aweme, int i, String str) {
        if (!C31214w.m72900a() || aweme == null || !aweme.isMixAweme() || "compilation_detail".equals(str)) {
            return false;
        }
        if ("general_search".equals(str) && C31214w.m72901a(aweme)) {
            return false;
        }
        if (i == 1 && C31214w.m72901a(aweme)) {
            return false;
        }
        if (i == 2 || i == 1) {
            if (aweme.isProhibited() && C23198ae.m56880p(aweme)) {
                return false;
            }
            AwemeStatus status = aweme.getStatus();
            if (status != null && status.isInReviewing()) {
                return false;
            }
            AwemeStarAtlas starAtlasInfo = aweme.getStarAtlasInfo();
            if (starAtlasInfo != null && C23198ae.m56880p(aweme)) {
                int reviewStatus = starAtlasInfo.getReviewStatus();
                if (reviewStatus == 1 || reviewStatus == 2 || reviewStatus == 3 || reviewStatus == 4) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo76331a(Context context, Aweme aweme, TextView textView) {
        String str;
        boolean z;
        int i;
        if (C31214w.m72900a() && aweme.getMixInfo() != null && aweme.getMixInfo().statis != null) {
            if (TextUtils.isEmpty(aweme.getDesc())) {
                aweme.setDesc(" ");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (textView.getText() == null || TextUtils.isEmpty(textView.getText().toString().trim())) {
                str = context.getResources().getString(R.string.c6u, new Object[]{String.valueOf(aweme.getMixInfo().statis.currentEpisode)});
                z = false;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getResources().getString(R.string.c6u, new Object[]{String.valueOf(aweme.getMixInfo().statis.currentEpisode)}));
                sb.append(" | ");
                str = sb.toString();
                z = true;
            }
            spannableStringBuilder.append(str);
            spannableStringBuilder.append(textView.getText());
            spannableStringBuilder.setSpan(new C37097z(), 0, str.length(), 34);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getResources().getColor(R.color.at0));
            if (z) {
                i = str.length() - 3;
            } else {
                i = str.length();
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, i, 34);
            if (z) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.asw)), str.length() - 2, str.length() - 1, 34);
            }
            C31214w.m72898a(textView, (CharSequence) spannableStringBuilder);
            textView.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final int mo76334b(Context context, Aweme aweme, TextView textView) {
        String str;
        if (!C31214w.m72900a() || aweme.getMixInfo() == null || aweme.getMixInfo().statis == null) {
            return 0;
        }
        if (TextUtils.isEmpty(aweme.getDesc())) {
            aweme.setDesc("");
        }
        if (textView.getText() == null || TextUtils.isEmpty(textView.getText().toString().trim())) {
            str = context.getResources().getString(R.string.c6u, new Object[]{String.valueOf(aweme.getMixInfo().statis.currentEpisode)});
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getResources().getString(R.string.c6u, new Object[]{String.valueOf(aweme.getMixInfo().statis.currentEpisode)}));
            sb.append(" | ");
            str = sb.toString();
        }
        return str.length();
    }

    /* renamed from: a */
    public final void mo76330a(Context context, Aweme aweme, View view, TextView textView, String str, int i) {
        if (!C31214w.m72900a() || aweme == null || !aweme.isMixAweme() || C31214w.m72901a(aweme)) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (textView != null) {
                textView.setText("");
            }
        } else {
            if (view != null) {
                view.setVisibility(0);
                view.setOnClickListener(new OnClickListener(context, aweme, str) {

                    /* renamed from: a */
                    final /* synthetic */ Context f81660a;

                    /* renamed from: b */
                    final /* synthetic */ Aweme f81661b;

                    /* renamed from: c */
                    final /* synthetic */ String f81662c;

                    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
                        if (r2 == null) goto L_0x0047;
                     */
                    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
                    /* JADX WARNING: Removed duplicated region for block: B:9:0x0041  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void onClick(android.view.View r13) {
                        /*
                            r12 = this;
                            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r13)
                            android.content.Context r0 = r12.f81660a
                            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r12.f81661b
                            com.ss.android.ugc.aweme.feed.model.Aweme r13 = r12.f81661b
                            com.ss.android.ugc.aweme.feed.model.MixStruct r13 = r13.getMixInfo()
                            java.lang.String r1 = r13.mixId
                            java.lang.String r4 = r12.f81662c
                            java.lang.String r5 = "video"
                            com.ss.android.ugc.aweme.mix.MixDetailActivity$a r13 = com.p683ss.android.ugc.aweme.mix.MixDetailActivity.f94482a
                            java.lang.String r13 = "context"
                            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r13)
                            java.lang.String r13 = "mixId"
                            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r13)
                            java.lang.String r13 = "eventType"
                            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r13)
                            java.lang.String r13 = "enterMethod"
                            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r13)
                            r13 = 0
                            if (r9 == 0) goto L_0x003e
                            com.ss.android.ugc.aweme.feed.model.MixStruct r2 = r9.getMixInfo()
                            if (r2 == 0) goto L_0x003e
                            com.ss.android.ugc.aweme.feed.model.MixStatisStruct r2 = r2.statis
                            if (r2 == 0) goto L_0x003e
                            long r2 = r2.currentEpisode
                            java.lang.Long r2 = java.lang.Long.valueOf(r2)
                            r8 = r2
                            goto L_0x003f
                        L_0x003e:
                            r8 = r13
                        L_0x003f:
                            if (r9 == 0) goto L_0x0047
                            java.lang.String r2 = r9.getAuthorUid()
                            if (r2 != 0) goto L_0x0049
                        L_0x0047:
                            java.lang.String r2 = ""
                        L_0x0049:
                            java.lang.String r3 = ""
                            android.os.Bundle r6 = new android.os.Bundle
                            r6.<init>()
                            if (r8 == 0) goto L_0x005a
                            long r10 = r8.longValue()
                            java.lang.String r13 = java.lang.String.valueOf(r10)
                        L_0x005a:
                            r7 = r13
                            com.p683ss.android.ugc.aweme.mix.MixDetailActivity.C36988a.m83211a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.utils.C31214w.C312151.onClick(android.view.View):void");
                    }

                    {
                        this.f81660a = r1;
                        this.f81661b = r2;
                        this.f81662c = r3;
                    }
                });
            }
            if (textView != null) {
                textView.setText(aweme.getMixInfo().mixName);
            }
        }
    }
}
