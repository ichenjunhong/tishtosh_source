package com.p683ss.android.ugc.aweme.comment;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22713c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1373d.C23064c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity.C23419a;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23722i;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.comment.abtest.MTCommentUsernamePromptExperiment;
import com.p683ss.android.ugc.aweme.comment.abtest.MTReplyWithVideoSettings;
import com.p683ss.android.ugc.aweme.comment.api.C25137a;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25066c;
import com.p683ss.android.ugc.aweme.comment.p1517b.C25145b;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25148b;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25166c;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25166c.C25167a;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25169e;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25169e.C25170a;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25188n;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25195t;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25196u;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25208b;
import com.p683ss.android.ugc.aweme.comment.p1525j.C25212a;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25225e;
import com.p683ss.android.ugc.aweme.comment.p1527l.C25251a;
import com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g;
import com.p683ss.android.ugc.aweme.comment.p1528ui.KeyboardDialogFragment;
import com.p683ss.android.ugc.aweme.comment.p1528ui.KeyboardDialogFragment.C25326a;
import com.p683ss.android.ugc.aweme.comment.p1528ui.KeyboardDialogFragment.C25327b;
import com.p683ss.android.ugc.aweme.comment.p1528ui.KeyboardDialogFragment.C25328c;
import com.p683ss.android.ugc.aweme.comment.services.C25281a;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.comment.services.C25285d;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25770d;
import com.p683ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl;
import com.p683ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28220g;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29299b;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.p683ss.android.ugc.aweme.feed.model.EditHint;
import com.p683ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p683ss.android.ugc.aweme.forward.p1775c.C32385a;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.p683ss.android.ugc.aweme.setting.C41626j;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.comment.f */
public final class C25156f implements C23419a, C25145b, C25196u, C25251a, C25326a, C25327b, C25328c {

    /* renamed from: a */
    public Fragment f66585a;

    /* renamed from: b */
    public C25285d f66586b;

    /* renamed from: c */
    public HashSet<User> f66587c = new HashSet<>();

    /* renamed from: d */
    public C25188n f66588d;

    /* renamed from: e */
    public C25195t f66589e;

    /* renamed from: f */
    public int f66590f;

    /* renamed from: g */
    boolean f66591g;

    /* renamed from: h */
    String f66592h;

    /* renamed from: i */
    public C25161a f66593i;

    /* renamed from: j */
    public C29366a f66594j;

    /* renamed from: k */
    int f66595k = 0;

    /* renamed from: l */
    public View f66596l;

    /* renamed from: m */
    public View f66597m;

    /* renamed from: n */
    public View f66598n;

    /* renamed from: o */
    public DataCenter f66599o;

    /* renamed from: p */
    public List<EditText> f66600p = new CopyOnWriteArrayList();

    /* renamed from: q */
    private MentionEditText f66601q;

    /* renamed from: r */
    private String f66602r;

    /* renamed from: s */
    private boolean f66603s;

    /* renamed from: t */
    private boolean f66604t = true;

    /* renamed from: u */
    private int f66605u;

    /* renamed from: v */
    private OnClickListener f66606v;

    /* renamed from: w */
    private boolean f66607w = false;

    /* renamed from: x */
    private C25056a f66608x;

    /* renamed from: y */
    private boolean f66609y;

    /* renamed from: z */
    private List<Object> f66610z = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.ugc.aweme.comment.f$a */
    public interface C25161a {
        /* renamed from: a */
        int mo51319a();
    }

    /* renamed from: b */
    private static int m61117b(boolean z) {
        if (z) {
            return 60;
        }
        return NormalGiftView.MASK_TRANSLATE_VALUE;
    }

    /* renamed from: l */
    public final void mo51309l() {
        mo51303e();
    }

    /* renamed from: a */
    public final void mo51242a(MentionEditText mentionEditText, View view, View view2, String str, String str2) {
        this.f66592h = str2;
        this.f66601q = mentionEditText;
        mo51292b((EditText) this.f66601q);
        if (this.f66585a != null && this.f66601q != null) {
            if (this.f66585a.getContext() != null) {
                this.f66601q.setMentionTextColor(C0726c.m2098c(this.f66585a.getContext(), R.color.a0z));
            }
            this.f66606v = new C25172g(this, str2, str);
            this.f66601q.setOnClickListener(this.f66606v);
            this.f66601q.setFocusable(false);
            this.f66601q.setFocusableInTouchMode(false);
            this.f66601q.setInputType(0);
            if (view != null) {
                if (C22713c.m55949a().mo47103a()) {
                    view.setVisibility(8);
                }
                view.setOnClickListener(new C25198h(this, str2, str, mentionEditText));
            }
            if (view2 != null) {
                if (C22713c.m55949a().mo47103a()) {
                    view2.setVisibility(8);
                }
                view2.setOnClickListener(new C25206i(this, str2, str, mentionEditText));
            }
            mo51279a();
        }
    }

    /* renamed from: a */
    public final void mo51243a(String str, Aweme aweme, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Comment comment, final C25148b bVar) {
        if (mo51314s() && this.f66586b.mo51787h() != null) {
            this.f66586b.mo51787h();
            final ArrayList arrayList = new ArrayList();
            if (MTReplyWithVideoSettings.isEnable() && comment != null && this.f66604t && z4) {
                arrayList.add(this.f66585a.getString(R.string.fw4));
            }
            if (!z3) {
                IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
                IMainServiceHelper provideIMainServiceHelper_Monster = MainServiceHelperImpl.provideIMainServiceHelper_Monster();
                boolean z6 = false;
                if (provideIMainServiceHelper_Monster != null && (provideIMainServiceHelper_Monster.isChatFunOfflineUnder16() || provideIMainServiceHelper_Monster.shouldRedictToTipsPage())) {
                    z6 = true;
                }
                if (SharePrefCache.inst().getImCommentForwardEnabled() && provideIMService_Monster != null && !provideIMService_Monster.isImReduction() && !z6) {
                    arrayList.add(this.f66585a.getString(R.string.apt));
                }
                arrayList.add(this.f66585a.getString(R.string.aiq));
                if (z5) {
                    arrayList.add(this.f66585a.getString(R.string.a9p));
                } else {
                    arrayList.add(this.f66585a.getString(R.string.a98));
                }
                arrayList.add(this.f66585a.getString(R.string.d75));
            } else {
                arrayList.add(this.f66585a.getString(R.string.aiq));
            }
            if (z4 || z3) {
                arrayList.add(this.f66585a.getString(R.string.ao2));
            }
            C26891a aVar = new C26891a(this.f66585a.getActivity());
            aVar.mo54844a((CharSequence[]) arrayList.toArray(new String[arrayList.size()]), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (C25156f.this.f66585a != null) {
                        dialogInterface.dismiss();
                        String str = (String) arrayList.get(i);
                        if (TextUtils.equals(str, C25156f.this.f66585a.getString(R.string.a9a))) {
                            bVar.mo51263a();
                        } else if (TextUtils.equals(str, C25156f.this.f66585a.getString(R.string.d6x))) {
                            if (C22713c.m55949a().mo47103a()) {
                                C10691a.m21548c(C11010c.m22280a(), (int) R.string.dw4).mo19066a();
                            } else {
                                bVar.mo51265c();
                            }
                        } else if (TextUtils.equals(str, C25156f.this.f66585a.getString(R.string.d75))) {
                            bVar.mo51267e();
                        } else if (TextUtils.equals(str, C25156f.this.f66585a.getString(R.string.ao2))) {
                            bVar.mo51264b();
                        } else if (TextUtils.equals(str, C25156f.this.f66585a.getString(R.string.b5x))) {
                            if (C22713c.m55949a().mo47103a()) {
                                C10691a.m21548c(C11010c.m22280a(), (int) R.string.dw5).mo19066a();
                            } else {
                                bVar.mo51266d();
                            }
                        } else if (TextUtils.equals(str, C25156f.this.f66585a.getString(R.string.apt))) {
                            if (C22713c.m55949a().mo47103a()) {
                                C10691a.m21548c(C11010c.m22280a(), (int) R.string.dw1).mo19066a();
                            } else {
                                bVar.mo51269g();
                            }
                        } else if (TextUtils.equals(str, C25156f.this.f66585a.getString(R.string.aiq))) {
                            bVar.mo51268f();
                        } else if (TextUtils.equals(str, C25156f.this.f66585a.getString(R.string.a9p))) {
                            bVar.mo51271i();
                        } else if (TextUtils.equals(str, C25156f.this.f66585a.getString(R.string.a98))) {
                            bVar.mo51272j();
                        } else if (TextUtils.equals(str, C25156f.this.f66585a.getString(R.string.e1y))) {
                            bVar.mo51273k();
                        } else if (TextUtils.equals(str, C25156f.this.f66585a.getString(R.string.ci6))) {
                            bVar.mo51274l();
                        } else {
                            if (TextUtils.equals(str, C25156f.this.f66585a.getString(R.string.fw4))) {
                                bVar.mo51275m();
                            }
                        }
                    }
                }
            });
            aVar.f70743a.mo3760a((OnCancelListener) new OnCancelListener() {
                public final void onCancel(DialogInterface dialogInterface) {
                    bVar.mo51270h();
                }
            });
            aVar.mo54845b();
        }
    }

    /* renamed from: a */
    public final void mo51287a(CharSequence charSequence, boolean z) {
        if (mo51314s()) {
            mo51282a(KeyboardDialogFragment.m61570a(charSequence, mo51315t(), true, this.f66586b.mo51790k(), mo51307i(), z), true);
            m61119u();
        }
    }

    /* renamed from: a */
    public final void mo51241a(User user) {
        if (mo51314s()) {
            int t = mo51315t();
            KeyboardDialogFragment a = KeyboardDialogFragment.m61569a(this.f66586b.mo51790k(), mo51307i());
            Bundle arguments = a.getArguments();
            if (arguments != null) {
                arguments.putSerializable("user", user);
                arguments.putInt("maxLength", t);
                arguments.putBoolean("showAt", true);
            }
            mo51282a(a, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo51282a(KeyboardDialogFragment keyboardDialogFragment, boolean z) {
        if (z) {
            m61123y();
        }
        keyboardDialogFragment.f66967c = this;
        keyboardDialogFragment.f66966b = this;
        keyboardDialogFragment.f66968d = this;
        m61121w();
        m61122x();
        m61124z();
        keyboardDialogFragment.f66977m = m61115A();
        keyboardDialogFragment.mo51846a(this);
        mo51313q();
        keyboardDialogFragment.f66981q = this.f66608x;
        keyboardDialogFragment.mo51847a(this.f66594j);
        if (!(this.f66585a instanceof C25367g) || !((C25367g) this.f66585a).mo51926o()) {
            keyboardDialogFragment.f66985u = false;
        } else {
            keyboardDialogFragment.f66985u = true;
        }
        try {
            keyboardDialogFragment.show(this.f66585a.getChildFragmentManager(), "input");
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    public final void mo51289a(String str) {
        String str2;
        String str3;
        if (!(!mo51314s() || this.f66585a.getActivity() == null || this.f66586b == null || this.f66586b.mo51788i() == null)) {
            Comment i = this.f66586b.mo51788i();
            User user = i.getUser();
            if (user != null) {
                String j = this.f66586b.mo51789j();
                String str4 = "";
                if (i.getCommentType() == 2) {
                    str3 = i.getReplyId();
                    str2 = i.getCid();
                } else {
                    str2 = str4;
                    str3 = i.getCid();
                }
                C25281a a = C25282a.m61494a();
                FragmentActivity activity = this.f66585a.getActivity();
                String uid = user.getUid();
                String e = C47915gg.m103656e(user);
                UrlModel avatarThumb = user.getAvatarThumb();
                String text = i.getText();
                String cid = i.getCid();
                String awemeId = i.getAwemeId();
                int a2 = C23064c.m56602a(j);
                CommentVideoModel commentVideoModel = r6;
                CommentVideoModel commentVideoModel2 = new CommentVideoModel(uid, e, avatarThumb, text, cid, awemeId, str3, str2, a2, str, 0, 0);
                a.openRecordFromComment(activity, commentVideoModel);
                if (this.f66585a instanceof C25367g) {
                    ((C25367g) this.f66585a).mo51919b(true);
                    ((C25367g) this.f66585a).mo51915a(i, str);
                }
                mo51249j();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51283a(com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a r13) {
        /*
            r12 = this;
            com.ss.android.ugc.aweme.views.mention.MentionEditText r0 = r12.f66601q
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.views.mention.MentionEditText r0 = r12.f66601q
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0014
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            boolean r3 = r12.f66603s
            if (r3 != 0) goto L_0x0021
            if (r0 == 0) goto L_0x0021
            if (r13 != 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            com.ss.android.ugc.aweme.comment.services.d r3 = r12.f66586b
            r3.mo51786f(r0)
            boolean r3 = r12.mo51314s()
            r4 = 0
            if (r3 == 0) goto L_0x0084
            android.support.v4.app.Fragment r3 = r12.f66585a
            android.support.v4.app.k r3 = r3.getChildFragmentManager()
            java.lang.String r5 = "input"
            android.support.v4.app.Fragment r3 = r3.mo2224a(r5)
            com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment r3 = (com.p683ss.android.ugc.aweme.comment.p1528ui.KeyboardDialogFragment) r3
            if (r3 == 0) goto L_0x0084
            com.ss.android.ugc.aweme.views.mention.MentionEditText r5 = r3.mEditText
            if (r5 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.views.mention.MentionEditText r3 = r3.mEditText
            com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSpan[] r3 = r3.getMentionText()
            goto L_0x004a
        L_0x0049:
            r3 = r4
        L_0x004a:
            if (r3 == 0) goto L_0x007f
            int r5 = r3.length
            if (r5 != 0) goto L_0x0050
            goto L_0x007f
        L_0x0050:
            java.util.HashSet<com.ss.android.ugc.aweme.profile.model.User> r5 = r12.f66587c
            java.util.Iterator r5 = r5.iterator()
        L_0x0056:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0084
            java.lang.Object r6 = r5.next()
            com.ss.android.ugc.aweme.profile.model.User r6 = (com.p683ss.android.ugc.aweme.profile.model.User) r6
            int r7 = r3.length
            r8 = 0
            r9 = 0
        L_0x0065:
            if (r8 >= r7) goto L_0x0079
            r10 = r3[r8]
            java.lang.String r11 = r6.getUid()
            java.lang.String r10 = r10.f121329a
            boolean r10 = android.text.TextUtils.equals(r11, r10)
            if (r10 == 0) goto L_0x0076
            r9 = 1
        L_0x0076:
            int r8 = r8 + 1
            goto L_0x0065
        L_0x0079:
            if (r9 != 0) goto L_0x0056
            r5.remove()
            goto L_0x0056
        L_0x007f:
            java.util.HashSet<com.ss.android.ugc.aweme.profile.model.User> r1 = r12.f66587c
            r1.clear()
        L_0x0084:
            if (r0 == 0) goto L_0x008d
            r12.mo51250o()
            r12.mo51293b(r4)
            goto L_0x0090
        L_0x008d:
            r12.mo51293b(r13)
        L_0x0090:
            android.view.View r13 = r12.f66597m
            if (r13 == 0) goto L_0x00a8
            android.view.View r13 = r12.f66597m
            int r13 = r13.getVisibility()
            if (r13 != 0) goto L_0x00a8
            android.view.View r13 = r12.f66597m
            r0 = 8
            r13.setVisibility(r0)
            android.view.View r13 = r12.f66598n
            r13.setVisibility(r2)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.C25156f.mo51283a(com.ss.android.ugc.aweme.emoji.f.a):void");
    }

    /* renamed from: a */
    public final void mo51288a(final Exception exc, Comment comment) {
        if (mo51314s() && C23794bh.m58389c().mo50264a(exc)) {
            C23794bh.m58389c().mo50263a(this.f66585a.getChildFragmentManager(), (C23459a) exc, new C24493b() {
                /* renamed from: b */
                public final void mo45354b() {
                    int i;
                    Context context = C25156f.this.f66585a.getContext();
                    Exception exc = exc;
                    if (C25156f.this.f66590f == 3) {
                        i = R.string.b65;
                    } else {
                        i = R.string.a8l;
                    }
                    C25137a.m61051a(context, exc, i);
                }

                /* renamed from: a */
                public final void mo45353a() {
                    if (C25156f.this.f66590f == 3) {
                        C25195t tVar = C25156f.this.f66589e;
                        if (tVar.f66771b != null) {
                            tVar.mo44934a_(tVar.f66771b.toArray());
                        }
                        return;
                    }
                    C25188n nVar = C25156f.this.f66588d;
                    if (nVar.f66755a != null) {
                        nVar.mo44934a_(nVar.f66755a.toArray());
                    }
                }
            });
        }
        if (this.f66586b != null) {
            this.f66586b.mo51780a(exc, this.f66590f, comment);
        }
    }

    /* renamed from: a */
    public final void mo51284a(ForwardDetail forwardDetail) {
        C32385a aVar = new C32385a(1);
        aVar.f84276a = forwardDetail;
        aVar.f84280e = this.f66605u;
        if (this.f66586b != null) {
            Aweme h = this.f66586b.mo51787h();
            aVar.f84278c = h;
            if (h != null) {
                aVar.f84277b = h.getAid();
            }
            C28220g.f74083b.mo56651a(this.f66586b.mo51787h(), 3);
        }
        if (this.f66586b == null || this.f66586b.mo51792m()) {
            C47718bf.m103288a(aVar);
        } else {
            this.f66586b.onEvent(aVar);
        }
        if (forwardDetail.getComment() != null) {
            C47718bf.m103288a(new C25066c(forwardDetail.getLabelInfo(), forwardDetail.getComment().getAwemeId()));
        }
    }

    /* renamed from: a */
    public final void mo51290a(String str, CharSequence charSequence, String str2, int i, LogPbBean logPbBean) {
        m61116a(false, str, charSequence, str2, i, logPbBean);
    }

    /* renamed from: a */
    public final void mo51240a(Comment comment, String str) {
        UrlModel urlModel;
        if (this.f66586b.mo51787h().getAwemeType() == 2) {
            List imageInfos = this.f66586b.mo51787h().getImageInfos();
            urlModel = !C9376b.m18558a((Collection<T>) imageInfos) ? ((ImageInfo) imageInfos.get(0)).getLabelThumb() : null;
        } else {
            urlModel = this.f66586b.mo51787h().getVideo().getCover();
        }
        UrlModel urlModel2 = urlModel;
        if (urlModel2 != null) {
            C25282a.m61494a().commentReplyToIM(this.f66585a.getContext(), comment, urlModel2, this.f66586b.mo51787h().getAid(), this.f66586b.mo51787h().getAwemeType(), this.f66586b.mo51787h().getAuthorUid(), str);
        }
    }

    /* renamed from: a */
    public final void mo51286a(CharSequence charSequence, List<TextExtraStruct> list, C29366a aVar, boolean z) {
        int i;
        String str;
        String str2;
        String str3;
        C25195t tVar;
        if (mo51314s()) {
            if (!C25272n.m61469a(this.f66585a.getContext())) {
                C9432q.m18672a(this.f66585a.getContext(), (int) R.string.cg1);
            } else if (C41626j.m91502b(this.f66586b.mo51787h())) {
                C41626j.m91499a(this.f66585a.getContext(), R.string.a81, this.f66585a.getString(R.string.a9r));
            } else if (!C41626j.m91501a(this.f66586b.mo51787h())) {
                C41626j.m91499a(this.f66585a.getContext(), R.string.a8y, this.f66585a.getString(R.string.a8x));
            } else if (charSequence.length() > m61117b(z)) {
                C10691a.m21548c(this.f66585a.getContext(), (int) R.string.rc).mo19066a();
            } else {
                if (aVar != null) {
                    C29299b.m69093a(aVar);
                }
                int i2 = 2;
                if (z) {
                    this.f66590f = 3;
                } else if (this.f66586b.mo51788i() != null) {
                    this.f66590f = 2;
                } else {
                    this.f66590f = 1;
                }
                this.f66586b.mo51779a(this.f66590f, C29408b.m69341a(charSequence.toString()), charSequence.toString(), "", "");
                this.f66609y = false;
                if (z) {
                    Aweme h = this.f66586b.mo51787h();
                    String v = m61120v();
                    if (h == null || h.getAwemeType() != 13) {
                        str = null;
                        i = 1;
                    } else {
                        str = h.getAid();
                        v = h.getForwardItem() != null ? h.getForwardItem().getAid() : h.getForwardItemId();
                        i = 2;
                    }
                    Comment i3 = this.f66586b.mo51788i();
                    if (i3 == null) {
                        this.f66589e.f66770a = this.f66604t ? 1 : 0;
                        str3 = null;
                        str2 = null;
                    } else {
                        if (i3.getCommentType() == 2) {
                            String replyId = i3.getReplyId();
                            String cid = i3.getCid();
                            tVar = this.f66589e;
                            String str4 = replyId;
                            str2 = cid;
                            str3 = str4;
                        } else {
                            str3 = i3.getCid();
                            tVar = this.f66589e;
                            if (this.f66604t) {
                                str2 = null;
                            } else {
                                str2 = null;
                                i2 = 0;
                            }
                        }
                        tVar.f66770a = i2;
                    }
                    String j = this.f66586b == null ? "" : this.f66586b.mo51789j();
                    C25167a aVar2 = new C25167a();
                    aVar2.f66680j = str;
                    aVar2.f66679i = i;
                    C25167a aVar3 = (C25167a) ((C25167a) ((C25167a) ((C25167a) ((C25167a) ((C25167a) ((C25167a) ((C25167a) aVar2.mo51323a(v)).mo51325b(charSequence.toString())).mo51326c(str3)).mo51324a(list)).mo51327d(str2)).mo51322a(aVar)).mo51321a(C23064c.m56602a(j))).mo51328e(C30228f.m70983g());
                    C25195t tVar2 = this.f66589e;
                    C25166c cVar = new C25166c(null);
                    cVar.f66620a = aVar3.f66629a;
                    cVar.f66621b = aVar3.f66630b;
                    cVar.f66622c = aVar3.f66631c;
                    cVar.f66623d = aVar3.f66632d;
                    cVar.f66624e = aVar3.f66633e;
                    cVar.f66677j = aVar3.f66679i;
                    cVar.f66678k = aVar3.f66680j;
                    cVar.f66625f = aVar3.f66634f;
                    cVar.f66626g = aVar3.f66635g;
                    cVar.f66627h = aVar3.f66636h;
                    tVar2.mo51449a(cVar);
                } else {
                    C25170a aVar4 = (C25170a) ((C25170a) ((C25170a) ((C25170a) ((C25170a) ((C25170a) new C25170a().mo51323a(m61120v())).mo51325b(charSequence.toString())).mo51324a(list)).mo51322a(aVar)).mo51321a(C23064c.m56602a(this.f66586b == null ? "" : this.f66586b.mo51789j()))).mo51328e(C30228f.m70983g());
                    if (this.f66586b == null || this.f66586b.mo51788i() == null) {
                        this.f66588d.f66756b = this.f66604t ? 1 : 0;
                    } else {
                        Comment i4 = this.f66586b.mo51788i();
                        if (i4.getCommentType() == 2) {
                            this.f66588d.f66756b = 2;
                            aVar4 = (C25170a) ((C25170a) aVar4.mo51326c(i4.getReplyId())).mo51327d(i4.getCid());
                        } else {
                            C25188n nVar = this.f66588d;
                            if (!this.f66604t) {
                                i2 = 0;
                            }
                            nVar.f66756b = i2;
                            aVar4 = (C25170a) aVar4.mo51326c(i4.getCid());
                        }
                    }
                    C25188n nVar2 = this.f66588d;
                    C25169e eVar = new C25169e(null);
                    eVar.f66620a = aVar4.f66629a;
                    eVar.f66621b = aVar4.f66630b;
                    eVar.f66622c = aVar4.f66631c;
                    eVar.f66623d = aVar4.f66632d;
                    eVar.f66624e = aVar4.f66633e;
                    eVar.f66625f = aVar4.f66634f;
                    eVar.f66626g = aVar4.f66635g;
                    eVar.f66627h = aVar4.f66636h;
                    eVar.f66684j = aVar4.f66685i;
                    nVar2.mo51444a(eVar);
                }
                if (list != null && list.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (TextExtraStruct userId : list) {
                        arrayList.add(userId.getUserId());
                    }
                    Aweme h2 = this.f66586b.mo51787h();
                    C26890h.m65011a("send_comment_at", C23089d.m56640a().mo47828a("to_user_id", (Object) arrayList).mo47829a("group_id", h2.getAid()).mo47829a("author_id", h2.getAuthorUid()).mo47829a("enter_from", this.f66592h).f61491a);
                    this.f66608x.f66379c.clear();
                }
                mo51293b((C29366a) null);
                this.f66609y = false;
            }
        }
    }

    /* renamed from: c */
    public final void mo51246c() {
        m61118b(0);
    }

    /* renamed from: d */
    public final void mo51247d() {
        m61118b(1);
    }

    /* renamed from: k */
    public final void mo51308k() {
        mo51289a("comment_click");
    }

    /* renamed from: p */
    public final void mo51312p() {
        mo51250o();
        mo51293b((C29366a) null);
    }

    /* renamed from: q */
    public final void mo51313q() {
        this.f66608x = new C25056a();
    }

    /* renamed from: A */
    private Aweme m61115A() {
        if (this.f66586b == null) {
            return null;
        }
        return this.f66586b.mo51787h();
    }

    /* renamed from: z */
    private boolean m61124z() {
        if (this.f66586b == null) {
            return false;
        }
        this.f66586b.mo51787h();
        return false;
    }

    /* renamed from: m */
    public final int mo51310m() {
        if (this.f66593i != null) {
            return this.f66593i.mo51319a();
        }
        return 0;
    }

    /* renamed from: n */
    public final void mo51311n() {
        this.f66586b.mo51784e(this.f66591g);
        this.f66591g = false;
    }

    /* renamed from: r */
    public final void mo51251r() {
        this.f66585a = null;
        this.f66588d.aq_();
        this.f66588d.mo46991S_();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public boolean mo51314s() {
        if (this.f66585a == null || !this.f66585a.isAdded()) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    private void m61119u() {
        if (this.f66599o != null) {
            this.f66599o.mo48228a("comment_dialog_state", (Object) Integer.valueOf(6));
        }
    }

    /* renamed from: v */
    private String m61120v() {
        if (this.f66586b == null || this.f66586b.mo51787h() == null) {
            return "";
        }
        return this.f66586b.mo51787h().getAid();
    }

    /* renamed from: w */
    private boolean m61121w() {
        Aweme h = this.f66586b.mo51787h();
        if (h == null || !h.getAwemeControl().canForward()) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    private boolean m61122x() {
        Aweme h = this.f66586b.mo51787h();
        if (h == null || !h.getAwemeControl().canComment()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo51303e() {
        C26890h.m65011a("click_emoji_entrance", C23089d.m56640a().mo47829a("enter_from", this.f66592h).f61491a);
    }

    /* renamed from: g */
    public final boolean mo51306g() {
        Aweme h = this.f66586b.mo51787h();
        if (h == null || (!h.isAwemeFromXiGua() && !h.isAwemeFromDongCheDi())) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void mo51248h() {
        if (mo51314s()) {
            mo51279a();
            mo51287a((CharSequence) this.f66602r, false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo51307i() {
        if (this.f66586b.mo51787h() == null || !C31190f.m72840h(this.f66586b.mo51787h())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void mo51249j() {
        if (mo51314s()) {
            KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) this.f66585a.getChildFragmentManager().mo2224a("input");
            if (keyboardDialogFragment != null) {
                try {
                    keyboardDialogFragment.dismiss();
                } catch (IllegalStateException unused) {
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo51250o() {
        if (this.f66601q != null) {
            this.f66601q.setText("");
            this.f66601q.setHint(this.f66602r);
            mo51281a((EditText) this.f66601q);
        }
        this.f66587c.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public int mo51315t() {
        boolean z;
        if (this.f66586b.mo51790k() == 4) {
            z = true;
        } else {
            z = false;
        }
        return m61117b(z);
    }

    /* renamed from: y */
    private boolean m61123y() {
        if (this.f66586b == null) {
            return false;
        }
        Aweme h = this.f66586b.mo51787h();
        if (h == null) {
            return false;
        }
        List<AwemeLabelModel> videoLabels = h.getVideoLabels();
        if (videoLabels == null) {
            return false;
        }
        for (AwemeLabelModel awemeLabelModel : videoLabels) {
            if (awemeLabelModel != null && awemeLabelModel.getLabelType() == 100) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo51305f() {
        boolean z;
        boolean z2;
        Aweme h = this.f66586b.mo51787h();
        if (h == null || !h.isCmtSwt()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C10691a.m21548c(C11010c.m22280a(), (int) R.string.dd).mo19066a();
            return true;
        }
        Aweme h2 = this.f66586b.mo51787h();
        if (h2 == null || h2.getVideoControl() == null || h2.getVideoControl().timerStatus != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            Context context = null;
            if (this.f66585a != null) {
                context = this.f66585a.getContext();
            }
            if (context == null) {
                context = C11010c.m22280a();
            }
            C10691a.m21548c(context, (int) R.string.fba).mo19066a();
            return true;
        } else if (!this.f66586b.mo51791l() || C41626j.m91502b(this.f66586b.mo51787h()) || !C41626j.m91501a(this.f66586b.mo51787h()) || C47950q.m103755d(this.f66586b.mo51787h()) || C22713c.m55949a().mo47103a()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo51279a() {
        boolean z;
        if (mo51314s()) {
            if (this.f66586b != null) {
                String str = null;
                if (this.f66586b != null && this.f66586b.mo51787h() != null && this.f66586b.getClass().equals(C25367g.class)) {
                    String aid = this.f66586b.mo51787h().getAid();
                    String appLanguage = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage();
                    if ("in".equals(appLanguage)) {
                        appLanguage = "id";
                    }
                    if (C25945k.m62930u().booleanValue()) {
                        ICommerceEggService createICommerceEggServicebyMonsterPlugin = CommerceEggServiceImpl.createICommerceEggServicebyMonsterPlugin();
                        if (createICommerceEggServicebyMonsterPlugin != null) {
                            str = createICommerceEggServicebyMonsterPlugin.getCommentEggHint(appLanguage);
                        }
                    } else if (C25945k.m62929t().booleanValue()) {
                        CharSequence charSequence = appLanguage;
                        if (charSequence == null || charSequence.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            List<? extends EditHint> list = C25770d.f68144c;
                            if (list != null) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    EditHint editHint = (EditHint) it.next();
                                    if (TextUtils.equals(charSequence, editHint.getLanguage())) {
                                        str = editHint.getHint();
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        str = C23794bh.m58402p().mo51277a(aid, appLanguage);
                    }
                }
                if (C41626j.m91502b(this.f66586b.mo51787h())) {
                    this.f66602r = this.f66585a.getResources().getString(R.string.a9r);
                } else if (!C41626j.m91501a(this.f66586b.mo51787h())) {
                    this.f66602r = this.f66585a.getResources().getString(R.string.a8x);
                } else if (str != null) {
                    this.f66602r = str;
                } else {
                    int k = this.f66586b.mo51790k();
                    if (k != 2) {
                        switch (k) {
                            case 4:
                                this.f66602r = this.f66585a.getResources().getString(R.string.b5y);
                                break;
                            case 5:
                            case 6:
                                this.f66602r = this.f66585a.getResources().getString(R.string.gvy);
                                break;
                            case 7:
                                this.f66602r = this.f66585a.getResources().getString(R.string.e4);
                                break;
                            default:
                                this.f66602r = this.f66585a.getResources().getString(R.string.a8s);
                                break;
                        }
                    } else {
                        this.f66602r = this.f66585a.getResources().getString(R.string.a8s);
                    }
                }
            } else {
                this.f66602r = this.f66585a.getResources().getString(R.string.a8s);
            }
            if (this.f66601q != null) {
                this.f66601q.setHint(this.f66602r);
            }
            if (!mo51306g() || this.f66596l == null) {
                if (this.f66596l != null) {
                    this.f66596l.setVisibility(8);
                }
                return;
            }
            this.f66596l.setVisibility(0);
            this.f66596l.setOnClickListener(new C25211j(this));
        }
    }

    /* renamed from: b */
    public final boolean mo51245b() {
        if (this.f66595k == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo51304e(Comment comment) {
        mo51298c(comment);
    }

    /* renamed from: a */
    public final void mo51291a(boolean z) {
        this.f66586b.mo51785e_(z);
    }

    /* renamed from: b */
    private void m61118b(int i) {
        this.f66595k = i;
        if (this.f66601q != null) {
        }
    }

    /* renamed from: a */
    public final void mo51238a(int i) {
        boolean z;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        this.f66604t = z;
    }

    /* renamed from: c */
    public final void mo51299c(User user) {
        this.f66587c.add(user);
    }

    /* renamed from: a */
    public final void mo51285a(CharSequence charSequence) {
        if (this.f66601q != null) {
            this.f66601q.setHint(charSequence);
        }
    }

    /* renamed from: b */
    public final void mo51292b(EditText editText) {
        if (editText != null && !this.f66600p.contains(editText)) {
            if (this.f66601q != null) {
                editText.setText(this.f66601q.getText());
            }
            this.f66600p.add(editText);
        }
    }

    /* renamed from: c */
    public final void mo51298c(Comment comment) {
        mo51293b((C29366a) null);
        mo51249j();
        if (this.f66586b != null) {
            this.f66586b.mo51783c(comment);
        }
    }

    /* renamed from: d */
    public final void mo51302d(String str) {
        C26890h.m65011a("show_emoji_board", C23089d.m56640a().mo47829a("enter_from", this.f66592h).mo47829a("tab_name", str).f61491a);
    }

    /* renamed from: b */
    public final void mo51293b(C29366a aVar) {
        if (this.f66594j != aVar) {
            this.f66594j = aVar;
            Iterator it = this.f66610z.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0029, code lost:
        if (r2 == null) goto L_0x002b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51244b(com.p683ss.android.ugc.aweme.comment.model.Comment r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x003d
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r0 = com.p683ss.android.ugc.aweme.comment.C25273o.f66858a
            java.lang.String r1 = r13.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r2 = com.p683ss.android.ugc.aweme.comment.C25273o.f66858a
            java.lang.String r3 = r13.getFakeId()
            java.lang.Object r2 = r2.get(r3)
            r3 = r2
            com.ss.android.ugc.aweme.comment.o$a r3 = (com.p683ss.android.ugc.aweme.comment.C25273o.C25274a) r3
            if (r3 == 0) goto L_0x002b
            r4 = 3
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 62
            r11 = 0
            com.ss.android.ugc.aweme.comment.o$a r2 = com.p683ss.android.ugc.aweme.comment.C25273o.C25274a.m61489a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r2 != 0) goto L_0x003a
        L_0x002b:
            com.ss.android.ugc.aweme.comment.o$a r2 = new com.ss.android.ugc.aweme.comment.o$a
            r4 = 3
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 62
            r11 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x003a:
            r0.put(r1, r2)
        L_0x003d:
            r0 = 0
            if (r13 != 0) goto L_0x0041
            goto L_0x0051
        L_0x0041:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r1 = com.p683ss.android.ugc.aweme.comment.C25273o.f66858a
            java.lang.String r2 = r13.getFakeId()
            java.lang.Object r1 = r1.get(r2)
            com.ss.android.ugc.aweme.comment.o$a r1 = (com.p683ss.android.ugc.aweme.comment.C25273o.C25274a) r1
            if (r1 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.comment.f.a r0 = r1.f66863d
        L_0x0051:
            if (r0 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.comment.o r1 = com.p683ss.android.ugc.aweme.comment.C25273o.f66859b
            int r13 = r1.mo51554i(r13)
            r1 = 3
            r2 = 0
            r3 = 1
            if (r13 != r1) goto L_0x0068
            com.ss.android.ugc.aweme.comment.g.t r13 = r12.f66589e
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r0
            r13.mo44934a_(r1)
            return
        L_0x0068:
            com.ss.android.ugc.aweme.comment.g.n r13 = r12.f66588d
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r0
            r13.mo44934a_(r1)
            return
        L_0x0072:
            com.ss.android.ugc.aweme.comment.o r0 = com.p683ss.android.ugc.aweme.comment.C25273o.f66859b
            r0.mo51548c(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.C25156f.mo51244b(com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    /* renamed from: c */
    public final void mo51300c(String str) {
        if (this.f66586b.mo51787h() != null) {
            Aweme h = this.f66586b.mo51787h();
            String str2 = this.f66592h;
            C23089d a = C23089d.m56640a().mo47829a("enter_method", str).mo47829a("group_id", h.getAid()).mo47829a("author_id", h.getAuthorUid());
            if (C23198ae.m56860d(str2)) {
                a.mo47829a("log_pb", C29981aa.m70153a().mo60161a(h.getRequestId()));
                C26890h.m65014b("search_comment_at", C23198ae.m56851a(a.f61491a));
                return;
            }
            C26890h.m65011a("search_comment_at", a.f61491a);
        }
    }

    /* renamed from: b */
    public final void mo51294b(User user) {
        Context context;
        IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
        IMUser fromUser = IMUser.fromUser(user);
        if (this.f66585a != null) {
            context = this.f66585a.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            context = C11010c.m22280a();
        }
        Aweme A = m61115A();
        if (A != null) {
            provideIMService_Monster.shareSingleMsg(context, fromUser, C41979aq.m91946a().parseAweme(context, A, 0, this.f66592h, "comment_at"), new C25217k(this, A, provideIMService_Monster, fromUser));
        }
    }

    /* renamed from: d */
    public final void mo51301d(Comment comment) {
        if (this.f66586b != null) {
            if (comment != null) {
                C25212a a = C25212a.m61315a();
                Comment b = a.mo51474b(comment.getCid());
                if (b != null) {
                    comment.setText(C25225e.m61343d(b));
                    comment.setTextExtra(b.getTextExtra());
                }
                List<Comment> replyComments = comment.getReplyComments();
                if (!C9376b.m18558a((Collection<T>) replyComments)) {
                    for (Comment comment2 : replyComments) {
                        Comment b2 = a.mo51474b(comment2.getCid());
                        if (b2 != null) {
                            comment2.setText(C25225e.m61343d(b2));
                            comment2.setTextExtra(b2.getTextExtra());
                        }
                    }
                }
            }
            this.f66586b.mo51781b(comment);
            C28220g.f74083b.mo56651a(this.f66586b.mo51787h(), 2);
        }
        if (comment != null) {
            C47718bf.m103288a(new C25066c(comment.getLabelInfo(), comment.getAwemeId()));
            if (MTCommentUsernamePromptExperiment.m60920a() && (this.f66585a instanceof C25367g)) {
                ((C25367g) this.f66585a).f67065A = comment.getCid();
            }
        }
        if (this.f66585a.getActivity() != null) {
            C40733z.f103767a.showRemindUserCompleteProfileDialog(this.f66585a.getActivity(), this.f66592h, "comment", new C25250l(this));
        }
    }

    /* renamed from: b */
    public final void mo51296b(String str) {
        if (this.f66586b != null) {
            this.f66586b.mo51782b(str);
        }
    }

    /* renamed from: a */
    public final void mo51281a(EditText editText) {
        if (editText != null && this.f66600p.contains(editText) && !this.f66607w) {
            this.f66607w = true;
            for (EditText editText2 : this.f66600p) {
                if (editText2 != editText && !C23722i.m58215a(editText2.getText(), editText.getText())) {
                    editText2.setText(editText.getText());
                }
            }
            this.f66607w = false;
        }
    }

    /* renamed from: a */
    public final void mo51239a(Comment comment) {
        StringBuilder sb = new StringBuilder();
        sb.append(C11010c.m22280a().getResources().getString(R.string.air, new Object[]{C47915gg.m103650b(comment.getUser())}));
        sb.append(comment.getText());
        String sb2 = sb.toString();
        ClipboardManager clipboardManager = (ClipboardManager) C11010c.m22280a().getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("copy_label", sb2));
        }
    }

    /* renamed from: b */
    public final void mo51295b(Exception exc, Comment comment) {
        mo51288a(exc, comment);
    }

    public C25156f(Fragment fragment, int i, C25285d dVar) {
        if (fragment == null || dVar == null) {
            throw new RuntimeException("CommentInputManager 传一个空fragment/service，脑子有问题！");
        }
        this.f66585a = fragment;
        this.f66586b = dVar;
        this.f66588d = new C25188n();
        this.f66588d.mo54800a(this);
        this.f66589e = new C25195t();
        this.f66589e.mo54800a(this);
        this.f66605u = i;
        this.f66602r = this.f66585a.getResources().getString(R.string.a8s);
        this.f66608x = new C25056a();
    }

    /* renamed from: a */
    public final void mo48560a(int i, int i2, Intent intent) {
        final User user;
        if (mo51314s() && i == 111) {
            this.f66603s = false;
            KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) this.f66585a.getChildFragmentManager().mo2224a("input");
            if (keyboardDialogFragment != null) {
                keyboardDialogFragment.f66974j = true;
            }
            if (intent != null) {
                user = (User) intent.getSerializableExtra("extra_data");
            } else {
                user = null;
            }
            if (user != null) {
                this.f66587c.add(user);
                if (keyboardDialogFragment == null) {
                    new Handler().post(new Runnable() {
                        public final void run() {
                            if (C25156f.this.f66587c.isEmpty()) {
                                C25156f fVar = C25156f.this;
                                User user = user;
                                if (fVar.mo51314s()) {
                                    int t = fVar.mo51315t();
                                    KeyboardDialogFragment a = KeyboardDialogFragment.m61569a(fVar.f66586b.mo51790k(), fVar.mo51307i());
                                    Bundle arguments = a.getArguments();
                                    if (arguments != null) {
                                        arguments.putSerializable("atUser", user);
                                        arguments.putInt("maxLength", t);
                                        arguments.putBoolean("showAt", true);
                                    }
                                    fVar.mo51282a(a, true);
                                }
                                return;
                            }
                            C25156f fVar2 = C25156f.this;
                            HashSet<User> hashSet = C25156f.this.f66587c;
                            if (fVar2.mo51314s()) {
                                int t2 = fVar2.mo51315t();
                                KeyboardDialogFragment a2 = KeyboardDialogFragment.m61569a(fVar2.f66586b.mo51790k(), fVar2.mo51307i());
                                Bundle arguments2 = a2.getArguments();
                                if (arguments2 != null) {
                                    arguments2.putSerializable("atUserSet", hashSet);
                                    arguments2.putInt("maxLength", t2);
                                    arguments2.putBoolean("showAt", true);
                                }
                                fVar2.mo51282a(a2, true);
                            }
                        }
                    });
                } else if (!keyboardDialogFragment.mo51852a(C47915gg.m103650b(user), user.getUid()) && this.f66585a.getContext() != null) {
                    C9432q.m18672a(this.f66585a.getContext(), (int) R.string.hm);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51280a(int i, int i2, int i3, String str, String str2) {
        Aweme h = this.f66586b.mo51787h();
        String str3 = this.f66592h;
        C23089d a = C23089d.m56640a().mo47826a("input_text_length", i).mo47826a("user_text_length", i2).mo47826a("rank", i3).mo47829a("search_keyword", str).mo47829a("to_user_id", str2).mo47829a("group_id", h.getAid()).mo47829a("author_id", h.getAuthorUid());
        if (C23198ae.m56860d(str3)) {
            a.mo47829a("log_pb", C29981aa.m70153a().mo60161a(h.getRequestId()));
            C26890h.m65014b("add_comment_at", C23198ae.m56851a(a.f61491a));
            return;
        }
        C26890h.m65011a("add_comment_at", a.f61491a);
    }

    /* renamed from: b */
    public final void mo51297b(String str, CharSequence charSequence, String str2, int i, LogPbBean logPbBean) {
        if (TextUtils.equals(str, "recommend") || TextUtils.equals(str, "search")) {
            m61116a(true, str, charSequence, str2, i, logPbBean);
        }
    }

    /* renamed from: a */
    private void m61116a(boolean z, String str, CharSequence charSequence, String str2, int i, LogPbBean logPbBean) {
        String str3 = "";
        String str4 = "";
        String str5 = "";
        if (charSequence != null) {
            str5 = charSequence.toString();
        }
        String str6 = str5;
        Aweme h = this.f66586b.mo51787h();
        if (h != null) {
            str4 = h.getAuthorUid();
            str3 = h.getAid();
        }
        String str7 = str3;
        String str8 = str4;
        if (z) {
            C25208b.m61302b(str, str7, str8, str6, str2, i, logPbBean);
        } else {
            C25208b.m61301a(str, str7, str8, str6, str2, i, logPbBean);
        }
    }
}
