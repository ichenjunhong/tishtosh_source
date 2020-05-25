package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.C23769bd;
import com.p683ss.android.ugc.aweme.ILegacyService;
import com.p683ss.android.ugc.aweme.LegacyServiceImpl;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartRoundImageView;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25242m;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38132n;
import com.p683ss.android.ugc.aweme.notification.util.C38443j;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.utils.C38454c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.p */
public final class C38399p extends C38383h implements OnClickListener {

    /* renamed from: d */
    private final View f97721d;

    /* renamed from: e */
    private final View f97722e;

    /* renamed from: f */
    private final AvatarImageWithVerify f97723f;

    /* renamed from: g */
    private final AvatarImageView f97724g;

    /* renamed from: m */
    private final AvatarImageView f97725m;

    /* renamed from: n */
    private final View f97726n;

    /* renamed from: o */
    private final TextView f97727o;

    /* renamed from: p */
    private final TextView f97728p;

    /* renamed from: q */
    private final SmartRoundImageView f97729q;

    /* renamed from: r */
    private final View f97730r;

    /* renamed from: s */
    private final TextView f97731s;

    /* renamed from: t */
    private DiggNotice f97732t;

    /* renamed from: u */
    private boolean f97733u = true;

    /* renamed from: v */
    private BaseNotice f97734v;

    /* renamed from: w */
    private String f97735w;

    /* renamed from: x */
    private String f97736x;

    public C38399p(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97721d = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97722e = findViewById2;
        View findViewById3 = view.findViewById(R.id.bt8);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.…notification_head_single)");
        this.f97723f = (AvatarImageWithVerify) findViewById3;
        View findViewById4 = view.findViewById(R.id.bt9);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.….notification_head_user1)");
        this.f97724g = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bt_);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.….notification_head_user2)");
        this.f97725m = (AvatarImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.cbi);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.reply_divider)");
        this.f97726n = findViewById6;
        View findViewById7 = view.findViewById(R.id.bto);
        C52711k.m112236a((Object) findViewById7, "itemView.findViewById(R.id.notification_name)");
        this.f97727o = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById8, "itemView.findViewById(R.id.notification_content)");
        this.f97728p = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.bsd);
        C52711k.m112236a((Object) findViewById9, "itemView.findViewById(R.id.notification_cover)");
        this.f97729q = (SmartRoundImageView) findViewById9;
        View findViewById10 = view.findViewById(R.id.btz);
        C52711k.m112236a((Object) findViewById10, "itemView.findViewById(R.…fication_reply_container)");
        this.f97730r = findViewById10;
        View findViewById11 = view.findViewById(R.id.bu0);
        C52711k.m112236a((Object) findViewById11, "itemView.findViewById(R.…tification_reply_content)");
        this.f97731s = (TextView) findViewById11;
        C38415g.m85729b(this.f97721d);
        C38446k.m85764a(this.f97722e);
        C38446k.m85764a(this.f97729q);
        OnClickListener onClickListener = this;
        this.f97721d.setOnClickListener(onClickListener);
        this.f97722e.setOnClickListener(onClickListener);
        this.f97723f.setOnClickListener(onClickListener);
        this.f97723f.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
        this.f97729q.setOnClickListener(onClickListener);
        ((C13833a) this.f97729q.getHierarchy()).mo25902b((int) R.color.c8);
        C38415g.m85728a((View) this.f97729q);
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.ss.android.ugc.aweme.base.model.UrlModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78306b(int r9) {
        /*
            r8 = this;
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r0 = r8.f97734v
            if (r0 == 0) goto L_0x0012
            java.lang.String r1 = "from_where"
            int r0 = r0.getType()
            r9.putInt(r1, r0)
        L_0x0012:
            com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice r0 = r8.f97732t
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00b1
            int r3 = r0.getMergeCount()
            if (r3 <= 0) goto L_0x00b1
            java.lang.String r4 = "username"
            java.util.List r5 = r0.getUsers()
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r7 = "it.users[0]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
            com.ss.android.ugc.aweme.profile.model.User r5 = (com.p683ss.android.ugc.aweme.profile.model.User) r5
            java.lang.String r5 = com.p683ss.android.ugc.aweme.notification.newstyle.C38415g.m85724a(r5)
            r9.putString(r4, r5)
            java.util.List r4 = r0.getUsers()
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r5 = "it.users[0]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.profile.model.User r4 = (com.p683ss.android.ugc.aweme.profile.model.User) r4
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getAvatarThumb()
            r5 = 2
            if (r3 < r5) goto L_0x0084
            int r0 = r0.getDiggType()
            if (r0 == r2) goto L_0x0054
            goto L_0x005b
        L_0x0054:
            r0 = 2132547159(0x7f1c1657, float:2.0747556E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x005b:
            if (r1 == 0) goto L_0x0083
            r1.intValue()
            android.content.Context r0 = r8.f97110c
            java.lang.String r5 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r5)
            android.content.res.Resources r0 = r0.getResources()
            int r1 = r1.intValue()
            java.lang.Object[] r5 = new java.lang.Object[r2]
            int r3 = r3 - r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r6] = r3
            java.lang.String r0 = r0.getString(r1, r5)
            java.lang.String r1 = "content"
            r9.putString(r1, r0)
        L_0x0081:
            r1 = r4
            goto L_0x00b1
        L_0x0083:
            return
        L_0x0084:
            int r0 = r0.getDiggType()
            if (r0 == r2) goto L_0x008b
            goto L_0x0092
        L_0x008b:
            r0 = 2132547146(0x7f1c164a, float:2.074753E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0092:
            if (r1 == 0) goto L_0x00b0
            r1.intValue()
            android.content.Context r0 = r8.f97110c
            java.lang.String r3 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            android.content.res.Resources r0 = r0.getResources()
            int r1 = r1.intValue()
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "content"
            r9.putString(r1, r0)
            goto L_0x0081
        L_0x00b0:
            return
        L_0x00b1:
            java.lang.String r0 = "avatar_thumb"
            java.io.Serializable r1 = (java.io.Serializable) r1
            r9.putSerializable(r0, r1)
            r8.f97677j = r9
            r8.f97676i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38399p.mo78306b(int):void");
    }

    public final void onClick(View view) {
        boolean z;
        Integer num;
        long j;
        long j2;
        ClickInstrumentation.onClick(view);
        if (!C38400q.m85711a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        DiggNotice diggNotice = this.f97732t;
        if (diggNotice != null) {
            mo78108a("click", "like", this.f97734v, this.f97735w, this.f97736x);
            ILegacyService createILegacyServicebyMonsterPlugin = LegacyServiceImpl.createILegacyServicebyMonsterPlugin();
            C52711k.m112236a((Object) createILegacyServicebyMonsterPlugin, "ServiceManager.get().get…egacyService::class.java)");
            C23769bd ugAllService = createILegacyServicebyMonsterPlugin.getUgAllService();
            BaseNotice baseNotice = this.f97734v;
            if (baseNotice == null || baseNotice.timeLineType != 0) {
                z = false;
            } else {
                z = true;
            }
            ugAllService.mo49244b(z);
            if (this.f97676i) {
                C38443j.m85761a(this.f97677j, getAdapterPosition());
            }
            String str = null;
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == R.id.bsd) {
                if (diggNotice.getUsers().size() > 1) {
                    C38443j.m85761a((Bundle) null, 0);
                }
                if (diggNotice.getDiggType() == 5 || diggNotice.getDiggType() == 6) {
                    C38454c.m85777a(this.f97110c, diggNotice.getForwardId(), "message", diggNotice.getCid(), C38132n.m85230a(diggNotice));
                } else {
                    Aweme aweme = diggNotice.getAweme();
                    C52711k.m112236a((Object) aweme, "aweme");
                    String aid = aweme.getAid();
                    C52711k.m112236a((Object) aid, "aweme.aid");
                    DiggNotice diggNotice2 = this.f97732t;
                    if (diggNotice2 != null) {
                        str = diggNotice2.getCid();
                    }
                    mo78305a(aid, str);
                }
            } else if (num != null && num.intValue() == R.id.bt8) {
                C38443j.m85761a((Bundle) null, 0);
                List users = diggNotice.getUsers();
                if (users != null) {
                    User user = (User) C52575l.m112140f(users);
                    if (user != null) {
                        String uid = user.getUid();
                        if (uid != null) {
                            List users2 = diggNotice.getUsers();
                            if (users2 != null) {
                                User user2 = (User) C52575l.m112140f(users2);
                                if (user2 != null) {
                                    String secUid = user2.getSecUid();
                                    if (secUid != null) {
                                        C38383h.m85681a((C38383h) this, uid, secUid, this.f97734v, false, (String) null, 24, (Object) null);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (num != null && num.intValue() == R.id.bt7) {
                if (!C38415g.m85732d() || diggNotice.getDiggType() == 0) {
                    C38443j.m85761a((Bundle) null, 0);
                    List users3 = diggNotice.getUsers();
                    if (users3 != null) {
                        User user3 = (User) C52575l.m112140f(users3);
                        if (user3 != null) {
                            String uid2 = user3.getUid();
                            if (uid2 != null) {
                                List users4 = diggNotice.getUsers();
                                if (users4 != null) {
                                    User user4 = (User) C52575l.m112140f(users4);
                                    if (user4 != null) {
                                        String secUid2 = user4.getSecUid();
                                        if (secUid2 != null) {
                                            C38383h.m85681a((C38383h) this, uid2, secUid2, this.f97734v, false, (String) null, 24, (Object) null);
                                        }
                                    }
                                }
                                return;
                            }
                        }
                    }
                    return;
                }
                Context context = view.getContext();
                C52711k.m112236a((Object) context, "v.context");
                Aweme aweme2 = diggNotice.getAweme();
                Comment comment = diggNotice.getComment();
                int diggType = diggNotice.getDiggType();
                BaseNotice baseNotice2 = this.f97734v;
                if (baseNotice2 != null) {
                    j2 = baseNotice2.getLastReadTime();
                } else {
                    j2 = 0;
                }
                m85708a(context, aweme2, comment, diggType, j2);
            } else if (num != null && num.intValue() == R.id.bu1) {
                if (diggNotice.getDiggType() == 5 || diggNotice.getDiggType() == 6) {
                    C38454c.m85777a(this.f97110c, diggNotice.getForwardId(), "message", diggNotice.getCid(), C38132n.m85230a(diggNotice));
                } else if (!C38415g.m85732d() || diggNotice.getUsers().size() <= 1 || diggNotice.getDiggType() == 0) {
                    Aweme aweme3 = diggNotice.getAweme();
                    C52711k.m112236a((Object) aweme3, "aweme");
                    String aid2 = aweme3.getAid();
                    C52711k.m112236a((Object) aid2, "aweme.aid");
                    mo78305a(aid2, diggNotice.getCid());
                } else {
                    Context context2 = view.getContext();
                    C52711k.m112236a((Object) context2, "v.context");
                    Aweme aweme4 = diggNotice.getAweme();
                    Comment comment2 = diggNotice.getComment();
                    int diggType2 = diggNotice.getDiggType();
                    BaseNotice baseNotice3 = this.f97734v;
                    if (baseNotice3 != null) {
                        j = baseNotice3.getLastReadTime();
                    } else {
                        j = 0;
                    }
                    m85708a(context2, aweme4, comment2, diggType2, j);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m85708a(android.content.Context r14, com.p683ss.android.ugc.aweme.feed.model.Aweme r15, com.p683ss.android.ugc.aweme.comment.model.Comment r16, int r17, long r18) {
        /*
            r13 = this;
            r1 = 0
            r2 = 3
            r7 = r17
            if (r7 != r2) goto L_0x0010
            if (r16 == 0) goto L_0x000e
            java.lang.String r3 = r16.getCid()
        L_0x000c:
            r5 = r3
            goto L_0x0017
        L_0x000e:
            r5 = r1
            goto L_0x0017
        L_0x0010:
            if (r15 == 0) goto L_0x000e
            java.lang.String r3 = r15.getAid()
            goto L_0x000c
        L_0x0017:
            if (r15 == 0) goto L_0x0020
            java.lang.String r3 = r15.getAid()
            r12 = r13
            r4 = r3
            goto L_0x0022
        L_0x0020:
            r12 = r13
            r4 = r1
        L_0x0022:
            boolean r6 = r12.f97733u
            java.lang.String r10 = com.p683ss.android.ugc.aweme.notification.newstyle.p2027d.C38328b.m85623a(r16)
            if (r15 == 0) goto L_0x0034
            com.ss.android.ugc.aweme.feed.model.Video r0 = r15.getVideo()
            if (r0 == 0) goto L_0x0034
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.getOriginCover()
        L_0x0034:
            r11 = r1
            r3 = r14
            r7 = r17
            r8 = r18
            com.p683ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity.C38223a.m85414a(r3, r4, r5, r6, r7, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38399p.m85708a(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.comment.model.Comment, int, long):void");
    }

    /* renamed from: a */
    public final void mo78313a(BaseNotice baseNotice, boolean z, boolean z2, String str, String str2) {
        String str3;
        C52711k.m112240b(baseNotice, "notice");
        C52711k.m112240b(str2, "enterFrom");
        if (baseNotice.getDiggNotice() != null) {
            this.f97734v = baseNotice;
            this.f97735w = str;
            this.f97736x = str2;
            mo78108a("show", "like", baseNotice, str, str2);
            this.f97733u = z2;
            this.f97732t = baseNotice.getDiggNotice();
            DiggNotice diggNotice = this.f97732t;
            if (diggNotice != null) {
                int size = diggNotice.getUsers().size();
                if (size > 0) {
                    mo78304a(this.f97727o, diggNotice.getUsers(), 1, diggNotice.getMergeCount(), this.f97734v, z2, str, str2);
                    if (size == 1) {
                        this.f97723f.setVisibility(0);
                        this.f97724g.setVisibility(8);
                        this.f97725m.setVisibility(8);
                        UserVerify userVerify = new UserVerify(((User) diggNotice.getUsers().get(0)).getAvatarThumb(), ((User) diggNotice.getUsers().get(0)).getCustomVerify(), ((User) diggNotice.getUsers().get(0)).getEnterpriseVerifyReason(), Integer.valueOf(((User) diggNotice.getUsers().get(0)).getVerificationType()), ((User) diggNotice.getUsers().get(0)).getWeiboVerify());
                        this.f97723f.setUserData(userVerify);
                        this.f97722e.setVisibility(8);
                        this.f97723f.mo48964b();
                    } else {
                        this.f97722e.setVisibility(0);
                        this.f97723f.setVisibility(8);
                        this.f97724g.setVisibility(0);
                        this.f97725m.setVisibility(0);
                        RemoteImageView remoteImageView = this.f97724g;
                        Object obj = diggNotice.getUsers().get(0);
                        C52711k.m112236a(obj, "it.users[0]");
                        C23515d.m57669a(remoteImageView, ((User) obj).getAvatarThumb());
                        RemoteImageView remoteImageView2 = this.f97725m;
                        Object obj2 = diggNotice.getUsers().get(1);
                        C52711k.m112236a(obj2, "it.users[1]");
                        C23515d.m57669a(remoteImageView2, ((User) obj2).getAvatarThumb());
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int diggType = diggNotice.getDiggType();
                    if (diggType == 3 || diggType == 6) {
                        spannableStringBuilder.append(this.f97110c.getString(R.string.ck9));
                        Comment comment = diggNotice.getComment();
                        if (comment != null) {
                            NoticeCommentHelperService a = C25242m.m61365a();
                            if (comment.getUser() != null) {
                                StringBuilder sb = new StringBuilder();
                                User user = comment.getUser();
                                C52711k.m112236a((Object) user, "user");
                                sb.append(C38415g.m85724a(user));
                                sb.append(": ");
                                sb.append(a.getDisplayText(comment, false));
                                str3 = sb.toString();
                            } else {
                                str3 = a.getDisplayText(comment, false);
                            }
                            CharSequence charSequence = str3;
                            if (!TextUtils.isEmpty(charSequence)) {
                                this.f97730r.setVisibility(0);
                                this.f97731s.setText(charSequence);
                                C29408b.m69342a(this.f97731s);
                            } else {
                                this.f97730r.setVisibility(8);
                            }
                        }
                    } else {
                        spannableStringBuilder.append(this.f97110c.getString(R.string.ck_));
                        this.f97730r.setVisibility(8);
                    }
                    mo78107a(spannableStringBuilder, baseNotice);
                    this.f97728p.setText(spannableStringBuilder);
                    Aweme aweme = diggNotice.getAweme();
                    C52711k.m112236a((Object) aweme, "it.aweme");
                    Video video = aweme.getVideo();
                    C52711k.m112236a((Object) video, "it.aweme.video");
                    C12203q.m24645a((Object) C23608p.m57874a(video.getOriginCover())).mo23125b(C47788ct.m103417a(500)).mo23118a("Notice").mo23116a((C12197k) this.f97729q).mo23121a();
                }
            }
        }
    }
}
