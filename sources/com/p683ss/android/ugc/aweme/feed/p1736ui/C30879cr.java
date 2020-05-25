package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45549f;
import com.p683ss.android.ugc.aweme.translation.C47352a;
import com.p683ss.android.ugc.aweme.translation.p2371a.C47354b;
import com.p683ss.android.ugc.aweme.translation.p2371a.C47356c;
import com.p683ss.android.ugc.aweme.translation.p2371a.C47357d;
import com.p683ss.android.ugc.aweme.translation.p2372b.C47358a;
import com.p683ss.android.ugc.aweme.translation.p2373ui.C47364a;
import com.p683ss.android.ugc.aweme.translation.p2373ui.TranslationStatusView;
import com.p683ss.android.ugc.aweme.translation.p2373ui.TranslationStatusView.C47362a;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48160d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cr */
public final class C30879cr implements C47362a, C47364a {

    /* renamed from: a */
    public TranslationStatusView f80859a;

    /* renamed from: b */
    public MentionTextView f80860b;

    /* renamed from: c */
    public Aweme f80861c;

    /* renamed from: d */
    public C47358a f80862d;

    /* renamed from: e */
    public Context f80863e;

    /* renamed from: f */
    public String f80864f;

    /* renamed from: g */
    public int f80865g;

    /* renamed from: h */
    public int f80866h = -1;

    /* renamed from: i */
    public TextView f80867i;

    /* renamed from: j */
    public int f80868j;

    /* renamed from: k */
    public int f80869k;

    /* renamed from: l */
    public boolean f80870l = false;

    /* renamed from: m */
    private List<String> f80871m = new ArrayList();

    /* renamed from: a */
    public static int m72325a() {
        return 4;
    }

    /* renamed from: a */
    public final void mo63628a(Exception exc) {
        this.f80859a.setStatus(0);
    }

    /* renamed from: a */
    public final void mo63629a(String str, int i) {
        this.f80864f = str;
        this.f80865g = i;
    }

    /* renamed from: a */
    public final void mo63621a(int i) {
        this.f80866h = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo63624a(MentionTextView mentionTextView) {
        this.f80867i.setVisibility(4);
        mentionTextView.post(new C30886cu(mentionTextView));
    }

    /* renamed from: a */
    public final void mo63623a(C47356c cVar) {
        String str;
        this.f80859a.setStatus(2);
        if (this.f80870l) {
            C26890h.m65011a("see_original_show", C23089d.m56640a().mo47829a("enter_from", this.f80864f).mo47829a("group_id", this.f80861c.getAid()).f61491a);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (cVar.f119513a == null) {
            str = "";
        } else {
            str = cVar.f119513a;
        }
        sb.append(str);
        sb.append(" ");
        if (this.f80861c.getTextExtra() != null) {
            for (int i = 0; i < this.f80861c.getTextExtra().size(); i++) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) this.f80861c.getTextExtra().get(i);
                String substring = this.f80861c.getDesc().substring(Math.min(Math.max(textExtraStruct.getStart(), 0), this.f80861c.getDesc().length()), Math.min(textExtraStruct.getEnd(), this.f80861c.getDesc().length()));
                TextExtraStruct clone = textExtraStruct.clone();
                clone.setStart(sb.length());
                clone.setEnd(clone.getStart() + substring.length());
                arrayList.add(clone);
                sb.append(substring);
                sb.append(" ");
            }
        }
        C47357d dVar = new C47357d();
        dVar.f119516b = 2;
        dVar.f119515a = sb.toString();
        dVar.f119517c = arrayList;
        C47352a.m102708a().mo94635a(this.f80861c.getAid(), dVar);
        mo63626a(this.f80860b, dVar.f119515a, dVar.f119517c, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x023c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x023d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63622a(com.p683ss.android.ugc.aweme.feed.model.Aweme r21) {
        /*
            r20 = this;
            r6 = r20
            r0 = r21
            r6.f80861c = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f80861c
            java.lang.String r2 = r0.getAid()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f80861c
            boolean r0 = r0.isAd()
            r1 = 8
            if (r0 != 0) goto L_0x027a
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x027a
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r0 == 0) goto L_0x0024
            goto L_0x027a
        L_0x0024:
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r6.f80859a
            r0.mo94642b()
            com.ss.android.ugc.aweme.translation.a r0 = com.p683ss.android.ugc.aweme.translation.C47352a.m102708a()
            com.ss.android.ugc.aweme.translation.a.d r7 = r0.mo94634a(r2)
            com.ss.android.ugc.aweme.language.I18nManagerService r0 = com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.language.I18nManagerService r0 = (com.p683ss.android.ugc.aweme.language.I18nManagerService) r0
            java.lang.String r5 = r0.getAppLanguage()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f80861c
            java.lang.String r0 = r0.getDescLanguage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = "un"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.f80861c
            java.lang.String r3 = r3.getDescLanguage()
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L_0x0056
            goto L_0x005e
        L_0x0056:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f80861c
            java.lang.String r0 = r0.getDescLanguage()
        L_0x005c:
            r4 = r0
            goto L_0x0074
        L_0x005e:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f80861c
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = ""
            goto L_0x005c
        L_0x0069:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f80861c
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getLanguage()
            goto L_0x005c
        L_0x0074:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f80861c
            java.lang.String r0 = r0.getDesc()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r8 = 0
            r9 = 1
            if (r3 == 0) goto L_0x0086
            java.lang.String r0 = ""
        L_0x0084:
            r3 = r0
            goto L_0x00ef
        L_0x0086:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.f80861c
            if (r3 != 0) goto L_0x008d
            java.lang.String r0 = ""
            goto L_0x0084
        L_0x008d:
            int r3 = r0.length()
            boolean[] r3 = new boolean[r3]
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r6.f80861c
            java.util.List r10 = r10.getTextExtra()
            if (r10 == 0) goto L_0x00cc
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r6.f80861c
            java.util.List r10 = r10.getTextExtra()
            java.util.Iterator r10 = r10.iterator()
        L_0x00a5:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00cc
            java.lang.Object r11 = r10.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r11 = (com.p683ss.android.ugc.aweme.model.TextExtraStruct) r11
            int r12 = r11.getStart()
            int r12 = java.lang.Math.max(r8, r12)
        L_0x00b9:
            int r13 = r0.length()
            int r14 = r11.getEnd()
            int r13 = java.lang.Math.min(r13, r14)
            if (r12 >= r13) goto L_0x00a5
            r3[r12] = r9
            int r12 = r12 + 1
            goto L_0x00b9
        L_0x00cc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = 0
        L_0x00d2:
            int r12 = r0.length()
            if (r11 >= r12) goto L_0x00e6
            boolean r12 = r3[r11]
            if (r12 != 0) goto L_0x00e3
            char r12 = r0.charAt(r11)
            r10.append(r12)
        L_0x00e3:
            int r11 = r11 + 1
            goto L_0x00d2
        L_0x00e6:
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = r0.trim()
            goto L_0x0084
        L_0x00ef:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r0 = r0.getUserAddLanguages()
            java.lang.Object r0 = r0.mo47782d()
            java.lang.String r0 = (java.lang.String) r0
            java.util.List<java.lang.String> r10 = r6.f80871m
            r10.clear()
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 != 0) goto L_0x0117
            java.util.List<java.lang.String> r10 = r6.f80871m
            java.lang.String r11 = ","
            java.lang.String[] r0 = r0.split(r11)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r10.addAll(r0)
        L_0x0117:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r10 = "aid:"
            r0.<init>(r10)
            r0.append(r2)
            java.lang.String r10 = ",status:"
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r6.f80861c
            java.util.List r10 = r10.getTextExtra()
            r11 = 2
            if (r10 == 0) goto L_0x0161
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r6.f80861c
            java.util.List r10 = r10.getTextExtra()
            java.util.Iterator r10 = r10.iterator()
        L_0x013d:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0161
            java.lang.Object r12 = r10.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r12 = (com.p683ss.android.ugc.aweme.model.TextExtraStruct) r12
            int r13 = r12.getType()
            if (r13 != 0) goto L_0x013d
            java.lang.String r13 = r12.getAwemeId()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x015f
            int r12 = r12.getSubtype()
            if (r11 != r12) goto L_0x013d
        L_0x015f:
            r10 = 1
            goto L_0x0162
        L_0x0161:
            r10 = 0
        L_0x0162:
            r12 = -1
            r13 = 3
            if (r10 == 0) goto L_0x0182
            r6.f80866h = r12
            java.lang.String r8 = "VideoDescTranslation"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r0 = "duet GONE"
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r13, r8, r0)
        L_0x017e:
            r8 = 8
            goto L_0x0235
        L_0x0182:
            if (r7 != 0) goto L_0x01fd
            boolean r10 = android.text.TextUtils.isEmpty(r3)
            if (r10 != 0) goto L_0x01e4
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            if (r10 != 0) goto L_0x01e4
            boolean r10 = android.text.TextUtils.equals(r5, r4)
            if (r10 != 0) goto L_0x01e4
            java.util.List<java.lang.String> r10 = r6.f80871m
            boolean r10 = r10.contains(r4)
            if (r10 != 0) goto L_0x01e4
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r6.f80861c
            java.lang.String r10 = r10.getAuthorUid()
            com.ss.android.ugc.aweme.IAccountUserService r11 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r11 = r11.getCurUserId()
            boolean r10 = android.text.TextUtils.equals(r10, r11)
            if (r10 == 0) goto L_0x01b3
            goto L_0x01e4
        L_0x01b3:
            java.lang.String r10 = "VideoDescTranslation"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            java.lang.String r0 = "not trans VISIBLE"
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r13, r10, r0)
            com.bytedance.ies.abmock.b r14 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.AutoTranslationExperiment> r15 = com.p683ss.android.ugc.aweme.feed.experiment.AutoTranslationExperiment.class
            r16 = 1
            java.lang.String r17 = "description_auto_translate"
            r18 = 31744(0x7c00, float:4.4483E-41)
            r19 = 0
            boolean r0 = r14.mo18172a(r15, r16, r17, r18, r19)
            if (r0 != 0) goto L_0x01e0
            r6.f80866h = r8
            goto L_0x0235
        L_0x01e0:
            r0 = -2
            r6.f80866h = r0
            goto L_0x0235
        L_0x01e4:
            r6.f80866h = r12
            java.lang.String r8 = "VideoDescTranslation"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r0 = "not trans but condition true,so GONE"
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r13, r8, r0)
            goto L_0x017e
        L_0x01fd:
            java.lang.String r10 = "VideoDescTranslation"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            java.lang.String r0 = "already trans VISIBLE"
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r13, r10, r0)
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r6.f80859a
            int r10 = r7.f119516b
            r0.setStatus(r10)
            int r0 = r7.f119516b
            r6.f80866h = r0
            int r0 = r7.f119516b
            if (r0 != r11) goto L_0x0235
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r6.f80860b
            java.lang.String r10 = r7.f119515a
            r0.setText(r10)
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r6.f80860b
            java.util.List<com.ss.android.ugc.aweme.model.TextExtraStruct> r10 = r7.f119517c
            com.ss.android.ugc.aweme.shortvideo.view.f r11 = new com.ss.android.ugc.aweme.shortvideo.view.f
            r11.<init>(r9)
            r0.mo95551a(r10, r11)
        L_0x0235:
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r6.f80859a
            r0.setVisibility(r8)
            if (r8 != r1) goto L_0x023d
            return
        L_0x023d:
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r6.f80859a
            com.ss.android.ugc.aweme.feed.ui.cs r1 = new com.ss.android.ugc.aweme.feed.ui.cs
            r1.<init>(r6)
            r0.setmUploadMobListener(r1)
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r8 = r6.f80859a
            com.ss.android.ugc.aweme.feed.ui.cr$1 r10 = new com.ss.android.ugc.aweme.feed.ui.cr$1
            r0 = r10
            r1 = r20
            r0.<init>(r2, r3, r4, r5)
            r8.setOnTranslationViewClickListener(r10)
            com.bytedance.ies.abmock.b r11 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.AutoTranslationExperiment> r12 = com.p683ss.android.ugc.aweme.feed.experiment.AutoTranslationExperiment.class
            r13 = 1
            java.lang.String r14 = "description_auto_translate"
            r15 = 31744(0x7c00, float:4.4483E-41)
            r16 = 0
            boolean r0 = r11.mo18172a(r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x0279
            if (r7 != 0) goto L_0x0279
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r6.f80859a
            r0.setStatus(r9)
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView$b r1 = r0.f119522d
            if (r1 == 0) goto L_0x0279
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView$b r1 = r0.f119522d
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f119519a
            r1.mo63631a(r0, r9)
        L_0x0279:
            return
        L_0x027a:
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r6.f80859a
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30879cr.mo63622a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: a */
    public final void mo63627a(CharSequence charSequence) {
        try {
            this.f80860b.setText(charSequence);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m72327a(SpannableStringBuilder spannableStringBuilder, final SpannableStringBuilder spannableStringBuilder2, final boolean z) {
        spannableStringBuilder.setSpan(new ClickableSpan() {
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(-1);
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                ValueAnimator valueAnimator;
                C30879cr.this.mo63627a((CharSequence) spannableStringBuilder2);
                C30879cr.this.f80867i.setVisibility(0);
                if (z) {
                    valueAnimator = ValueAnimator.ofInt(new int[]{C30879cr.this.f80869k, C30879cr.this.f80868j});
                } else {
                    valueAnimator = ValueAnimator.ofInt(new int[]{C30879cr.this.f80868j, C30879cr.this.f80869k});
                }
                valueAnimator.addUpdateListener(new C30887cv(this));
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                        if (z) {
                            C30879cr.this.f80867i.setText(R.string.b1n);
                        } else {
                            C30879cr.this.f80867i.setText(R.string.b1o);
                        }
                        C30879cr.this.f80867i.setVisibility(4);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (!z) {
                            C30879cr.this.f80860b.setLines(C30879cr.m72325a());
                        } else if (C30879cr.this.f80861c.getTransDescLines() != 0) {
                            C30879cr.this.f80860b.setLines(C30879cr.this.f80861c.getTransDescLines());
                        } else {
                            C30879cr.this.f80860b.post(new C30889cx(this));
                        }
                        C30879cr.this.f80867i.setVisibility(0);
                    }
                });
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, C30879cr.this.f80867i.getHeight()});
                ofInt.addUpdateListener(new C30888cw(this));
                ofInt.setDuration(100);
                ofInt.setStartDelay(150);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{valueAnimator, ofInt});
                animatorSet.start();
            }
        }, 0, spannableStringBuilder.length(), 33);
    }

    public C30879cr(Context context, TranslationStatusView translationStatusView, MentionTextView mentionTextView, TextView textView) {
        this.f80863e = context;
        this.f80862d = new C47358a(new C47354b(), this);
        this.f80859a = translationStatusView;
        this.f80860b = mentionTextView;
        this.f80867i = textView;
    }

    /* renamed from: a */
    private int m72326a(CharSequence charSequence, String str, int i, int i2) {
        try {
            float measureText = this.f80860b.getPaint().measureText(str);
            int i3 = i;
            while (i3 >= 3) {
                if (this.f80860b.getPaint().measureText(charSequence, i2 - i3, i2) < measureText) {
                    return i3 + 1;
                }
                i3--;
            }
            return i3 + 1;
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: a */
    public final void mo63626a(MentionTextView mentionTextView, String str, List<TextExtraStruct> list, int i) {
        final MentionTextView mentionTextView2 = mentionTextView;
        ObjectAnimator duration = ObjectAnimator.ofFloat(mentionTextView, "alpha", new float[]{0.0f}).setDuration(150);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(mentionTextView, "alpha", new float[]{0.0f, 1.0f}).setDuration(150);
        final String str2 = str;
        final List<TextExtraStruct> list2 = list;
        final int i2 = i;
        C308812 r0 = new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                int i;
                int i2;
                mentionTextView2.setMaxLines(12);
                if (C23794bh.m58393g().mo75754a(C30879cr.this.f80861c)) {
                    C30879cr.this.mo63627a((CharSequence) C23794bh.m58393g().mo75751a(C30879cr.this.f80863e, str2, C30879cr.this.f80861c, C30879cr.this.f80864f, C30879cr.this.f80865g));
                } else {
                    C30879cr.this.mo63627a((CharSequence) str2);
                }
                mentionTextView2.mo95551a(list2, (C48160d) new C45549f(true));
                C30879cr crVar = C30879cr.this;
                MentionTextView mentionTextView = mentionTextView2;
                int i3 = i2;
                int a = C30879cr.m72325a();
                if (i3 != 2) {
                    if (mentionTextView.getLineCount() == 0) {
                        i = a;
                    } else {
                        i = mentionTextView.getLineCount();
                    }
                    if (i > a) {
                        if (crVar.f80861c.getTransDesc() == null) {
                            crVar.mo63625a(mentionTextView, i, a, i3);
                        }
                        crVar.mo63627a(crVar.f80861c.getEllipsizeTransDesc());
                        mentionTextView.setLines(a);
                        mentionTextView.post(new C30885ct(crVar, mentionTextView, i));
                        crVar.f80867i.setVisibility(0);
                        crVar.f80867i.setText(R.string.b1o);
                        return;
                    }
                    crVar.mo63624a(mentionTextView);
                } else if (!crVar.f80861c.getDesc().equals(crVar.f80861c.getEllipsizeDesc())) {
                    crVar.f80867i.setVisibility(0);
                    crVar.f80867i.setText(R.string.b1o);
                    crVar.mo63627a(crVar.f80861c.getEllipsizeDesc());
                    mentionTextView.setLines(a);
                } else {
                    if (mentionTextView.getLineCount() == 0) {
                        i2 = a;
                    } else {
                        i2 = mentionTextView.getLineCount();
                    }
                    if (i2 > a) {
                        crVar.f80867i.setVisibility(0);
                        crVar.f80867i.setText(R.string.b1o);
                        crVar.mo63625a(mentionTextView, i2, a, i3);
                        crVar.mo63627a(crVar.f80861c.getEllipsizeDesc());
                        mentionTextView.setLines(a);
                    } else {
                        crVar.mo63624a(mentionTextView);
                    }
                }
            }
        };
        duration.addListener(r0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2});
        animatorSet.start();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0112 A[SYNTHETIC, Splitter:B:25:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0053  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63625a(com.p683ss.android.ugc.aweme.views.MentionTextView r17, int r18, int r19, int r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            java.lang.CharSequence r2 = r17.getText()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = " "
            r3.<init>(r4)
            android.content.Context r4 = r0.f80863e
            r5 = 2132544593(0x7f1c0c51, float:2.0742352E38)
            java.lang.String r4 = r4.getString(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r4 = r17.getHeight()
            r6 = 0
            r7 = 12
            r8 = r18
            if (r8 < r7) goto L_0x0042
            r7 = 11
            android.text.Layout r8 = r17.getLayout()
            if (r8 == 0) goto L_0x0043
            android.text.Layout r8 = r17.getLayout()
            r9 = 10
            int r8 = r8.getLineEnd(r9)
            java.lang.CharSequence r2 = r2.subSequence(r6, r8)
            r8 = 1
            goto L_0x0044
        L_0x0042:
            r7 = r8
        L_0x0043:
            r8 = 0
        L_0x0044:
            android.text.TextPaint r9 = r17.getPaint()
            float r3 = r9.measureText(r3)
            r9 = 0
            android.text.Layout r10 = r17.getLayout()
            if (r10 == 0) goto L_0x0073
            int r9 = r17.getWidth()
            float r9 = (float) r9
            android.text.TextPaint r10 = r17.getPaint()
            android.text.Layout r11 = r17.getLayout()
            int r12 = r7 + -1
            int r11 = r11.getLineStart(r12)
            android.text.Layout r13 = r17.getLayout()
            int r12 = r13.getLineEnd(r12)
            float r10 = r10.measureText(r2, r11, r12)
            float r9 = r9 - r10
        L_0x0073:
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x007e
            int r3 = r4 / r7
            int r4 = r4 + r3
            int r7 = r7 + 1
            r3 = 1
            goto L_0x007f
        L_0x007e:
            r3 = 0
        L_0x007f:
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r0.f80861c
            r9.setTransDescLines(r7)
            int r9 = r1 * r4
            int r9 = r9 / r7
            r0.f80869k = r9
            r0.f80868j = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "... "
            r4.<init>(r7)
            android.content.Context r7 = r0.f80863e
            r9 = 2132544594(0x7f1c0c52, float:2.0742354E38)
            java.lang.String r7 = r7.getString(r9)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            int r7 = r4.length()
            int r9 = r7 + 1
            android.text.Layout r10 = r17.getLayout()
            r11 = 2
            if (r10 == 0) goto L_0x00ba
            android.text.Layout r10 = r17.getLayout()
            int r12 = r1 + -1
            int r10 = r10.getLineEnd(r12)
            goto L_0x00bf
        L_0x00ba:
            int r10 = r2.length()
            int r10 = r10 / r11
        L_0x00bf:
            if (r10 < r9) goto L_0x00e6
            com.ss.android.ugc.aweme.services.IExternalService r12 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r12 = (com.p683ss.android.ugc.aweme.services.IExternalService) r12
            com.ss.android.ugc.aweme.services.video.IAVPublishService r12 = r12.publishService()
            int r9 = r10 - r9
            int r13 = r9 + 2
            java.lang.CharSequence r13 = r2.subSequence(r9, r13)
            java.lang.String r13 = r13.toString()
            boolean r12 = r12.containEmoji(r13)
            if (r12 == 0) goto L_0x00e6
            int r7 = java.lang.Math.max(r6, r9)
            java.lang.CharSequence r7 = r2.subSequence(r6, r7)
            goto L_0x00f3
        L_0x00e6:
            int r7 = r0.m72326a(r2, r4, r7, r10)
            int r10 = r10 - r7
            int r7 = java.lang.Math.max(r6, r10)
            java.lang.CharSequence r7 = r2.subSequence(r6, r7)
        L_0x00f3:
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            java.lang.String r7 = "..."
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r9.<init>(r7)
            r0.mo63627a(r9)
            int r7 = r17.getLineCount()
            if (r7 != r1) goto L_0x0196
            android.text.Layout r7 = r17.getLayout()     // Catch:{ Exception -> 0x018a }
            int r10 = r1 + -1
            int r7 = r7.getLineEnd(r10)     // Catch:{ Exception -> 0x018a }
            int r12 = r17.getWidth()     // Catch:{ Exception -> 0x018a }
            float r12 = (float) r12     // Catch:{ Exception -> 0x018a }
            android.text.TextPaint r13 = r17.getPaint()     // Catch:{ Exception -> 0x018a }
            java.lang.CharSequence r14 = r17.getText()     // Catch:{ Exception -> 0x018a }
            android.text.Layout r15 = r17.getLayout()     // Catch:{ Exception -> 0x018a }
            int r15 = r15.getLineStart(r10)     // Catch:{ Exception -> 0x018a }
            float r13 = r13.measureText(r14, r15, r7)     // Catch:{ Exception -> 0x018a }
            float r12 = r12 - r13
            android.text.TextPaint r13 = r17.getPaint()     // Catch:{ Exception -> 0x018a }
            float r13 = r13.measureText(r4)     // Catch:{ Exception -> 0x018a }
            r14 = r7
            r7 = r9
        L_0x0140:
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x0188
            int r12 = r4.length()     // Catch:{ Exception -> 0x0188 }
            int r14 = r14 - r12
            java.lang.CharSequence r12 = r7.subSequence(r6, r14)     // Catch:{ Exception -> 0x0188 }
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x018b }
            r7.<init>(r12)     // Catch:{ Exception -> 0x018b }
            java.lang.String r14 = "..."
            android.text.SpannableStringBuilder r7 = r7.append(r14)     // Catch:{ Exception -> 0x018b }
            r0.mo63627a(r7)     // Catch:{ Exception -> 0x018b }
            int r7 = r17.getLineCount()     // Catch:{ Exception -> 0x018b }
            if (r7 != r1) goto L_0x018b
            android.text.Layout r7 = r17.getLayout()     // Catch:{ Exception -> 0x018b }
            int r14 = r7.getLineEnd(r10)     // Catch:{ Exception -> 0x018b }
            int r7 = r17.getWidth()     // Catch:{ Exception -> 0x018b }
            float r7 = (float) r7     // Catch:{ Exception -> 0x018b }
            android.text.TextPaint r15 = r17.getPaint()     // Catch:{ Exception -> 0x018b }
            java.lang.CharSequence r6 = r17.getText()     // Catch:{ Exception -> 0x018b }
            android.text.Layout r5 = r17.getLayout()     // Catch:{ Exception -> 0x018b }
            int r5 = r5.getLineStart(r10)     // Catch:{ Exception -> 0x018b }
            float r5 = r15.measureText(r6, r5, r14)     // Catch:{ Exception -> 0x018b }
            float r5 = r7 - r5
            r7 = r12
            r6 = 0
            r12 = r5
            goto L_0x0140
        L_0x0188:
            r12 = r7
            goto L_0x018b
        L_0x018a:
            r12 = r9
        L_0x018b:
            boolean r1 = r12.equals(r9)
            if (r1 != 0) goto L_0x0196
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r12)
        L_0x0196:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            android.text.SpannableString r2 = android.text.SpannableString.valueOf(r2)
            r1.<init>(r2)
            if (r3 == 0) goto L_0x01a6
            java.lang.String r2 = "\n"
            r1.append(r2)
        L_0x01a6:
            if (r8 == 0) goto L_0x01ad
            java.lang.String r2 = "..."
            r1.append(r2)
        L_0x01ad:
            r2 = r20
            if (r2 != r11) goto L_0x01c4
            r2 = 1
            r0.m72327a(r9, r1, r2)
            r3 = 0
            r0.m72327a(r1, r9, r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f80861c
            r2.setEllipsizeDesc(r9)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f80861c
            r2.setProcessedDesc(r1)
            return
        L_0x01c4:
            r2 = 1
            r3 = 0
            r0.m72327a(r9, r1, r2)
            r0.m72327a(r1, r9, r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f80861c
            r2.setTransDesc(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f80861c
            r1.setEllipsizeTransDesc(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30879cr.mo63625a(com.ss.android.ugc.aweme.views.MentionTextView, int, int, int):void");
    }
}
