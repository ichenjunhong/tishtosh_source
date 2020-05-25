package com.p683ss.android.ugc.aweme.mobile;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendFriendActivity;
import com.p683ss.android.ugc.aweme.mobile.p1965a.C37136b.C37137a;
import com.p683ss.android.ugc.aweme.mobile.p1965a.C37138c;
import com.p683ss.android.ugc.aweme.p2396w.C48222b;
import com.p683ss.android.ugc.aweme.profile.C39718ad;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39948a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39954ad;
import com.p683ss.android.ugc.aweme.profile.presenter.C39978l;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47876fb;
import com.ss.android.ugc.trill.R;
import java.util.GregorianCalendar;

/* renamed from: com.ss.android.ugc.aweme.mobile.EditProfileActivityV2 */
public class EditProfileActivityV2 extends AmeSSActivity implements C9382a, C39978l, C39985s {

    /* renamed from: a */
    public Dialog f94773a;

    /* renamed from: b */
    C39718ad f94774b;

    /* renamed from: c */
    public C39948a f94775c;

    /* renamed from: d */
    boolean f94776d;

    /* renamed from: e */
    boolean f94777e;

    /* renamed from: f */
    public C9381g f94778f;

    /* renamed from: g */
    private C37138c f94779g = new C37138c("profile");

    /* renamed from: h */
    private C39954ad f94780h;

    /* renamed from: i */
    private GregorianCalendar f94781i;

    /* renamed from: j */
    private DatePickerDialog f94782j;
    SmartImageView mAvatar;
    Button mBtnEnterAweme;
    EditText mUsernameEdit;
    TextView txtExtra;

    /* renamed from: a */
    public final void mo54362a(boolean z) {
    }

    public void onBackPressed() {
        mo76397b();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mobile.EditProfileActivityV2", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mobile.EditProfileActivityV2", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mobile.EditProfileActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
        if (isViewValid()) {
            dismissProgressDialog();
            if (!TextUtils.isEmpty(str)) {
                C10691a.m21545b((Context) AwemeApplication.m56199a(), str).mo19066a();
                if (z) {
                    if (C20902b.m53242a().getCurUser().isNeedRecommend()) {
                        C37137a.m83368a((Activity) this).mo76413a(RecommendFriendActivity.class).mo76414a();
                    }
                    finish();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo76396a() {
        if (TextUtils.isEmpty(this.mUsernameEdit.getText().toString().trim()) || !this.f94776d) {
            this.mBtnEnterAweme.setEnabled(false);
        } else {
            this.mBtnEnterAweme.setEnabled(true);
        }
    }

    /* renamed from: b */
    public final void mo76397b() {
        this.f94779g.mo76415a(this, "finish_no_name");
        this.f94779g.mo76415a(this, "default_name");
        if (C20902b.m53242a().getCurUser().isNeedRecommend()) {
            C37137a.m83368a((Activity) this).mo76413a(RecommendFriendActivity.class).mo76414a();
        }
        finish();
    }

    /* renamed from: c */
    public final void mo76398c() {
        if (isActive()) {
            if (this.f94773a == null) {
                C10643a aVar = new C10643a(this);
                aVar.mo18885a((int) R.string.c0j).mo18900b((int) R.string.wf, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        EditProfileActivityV2.this.f94773a.dismiss();
                    }
                }).mo18886a((int) R.string.ahk, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        EditProfileActivityV2.this.showProgressDialog(EditProfileActivityV2.this.getString(R.string.c0i));
                        C20902b.m53242a().queryUser(EditProfileActivityV2.this.f94778f);
                        EditProfileActivityV2.this.f94773a.dismiss();
                    }
                });
                this.f94773a = aVar.mo18897a().mo18882b();
            }
            this.f94773a.show();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("avatarset", this.f94776d);
    }

    public void handleMsg(Message message) {
        if (!(message.obj instanceof Exception)) {
            if (message.obj instanceof User) {
                C20902b.m53242a().setCurUser((User) message.obj);
            }
            if (isViewValid()) {
                dismissProgressDialog();
            }
        }
    }

    /* renamed from: a */
    public final void mo50430a(AvatarUri avatarUri) {
        if (isViewValid()) {
            this.f94775c.mo81848e();
            if (this.f94780h == null || avatarUri == null) {
                C10691a.m21542b((Context) this, (int) R.string.cq).mo19066a();
                return;
            }
            this.f94774b.f101359d = avatarUri.uri;
            this.f94780h.mo81853a(this.f94774b.mo80822a());
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r10v13, types: [android.view.ContextThemeWrapper] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void editBirthday(android.view.View r10) {
        /*
            r9 = this;
            boolean r10 = r9.isViewValid()
            if (r10 != 0) goto L_0x0007
            return
        L_0x0007:
            android.widget.EditText r10 = r9.mUsernameEdit
            com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils.m58184c(r10)
            com.ss.android.ugc.aweme.IAccountUserService r10 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            com.ss.android.ugc.aweme.profile.model.User r10 = r10.getCurUser()
            if (r10 != 0) goto L_0x0017
            return
        L_0x0017:
            java.util.GregorianCalendar r0 = r9.f94781i
            if (r0 != 0) goto L_0x0028
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            java.lang.String r1 = "GMT"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.<init>(r1)
            r9.f94781i = r0
        L_0x0028:
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            java.lang.String r1 = "GMT"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.<init>(r1)
            r9.f94781i = r0
            java.lang.String r0 = r10.getBirthday()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = -1
            if (r0 == 0) goto L_0x0043
            r3 = r1
            goto L_0x004b
        L_0x0043:
            java.lang.String r10 = r10.getBirthday()
            long r3 = com.p683ss.android.ugc.aweme.utils.C47903fw.m103623a(r10)
        L_0x004b:
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 == 0) goto L_0x0059
            java.util.GregorianCalendar r10 = r9.f94781i
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            r10.setTimeInMillis(r3)
            goto L_0x0063
        L_0x0059:
            java.util.GregorianCalendar r10 = r9.f94781i
            r0 = 788889600000(0xb7ad7c0000, double:3.897632497214E-312)
            r10.setTimeInMillis(r0)
        L_0x0063:
            android.app.DatePickerDialog r10 = r9.f94782j
            if (r10 != 0) goto L_0x00d6
            java.lang.String r10 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r10 = r10.equalsIgnoreCase(r0)
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x0085
            int r10 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r10 < r2) goto L_0x0081
            int r10 = android.os.Build.VERSION.SDK_INT
            r2 = 22
            if (r10 > r2) goto L_0x0081
            r10 = 1
            goto L_0x0082
        L_0x0081:
            r10 = 0
        L_0x0082:
            if (r10 == 0) goto L_0x0085
            r0 = 1
        L_0x0085:
            if (r0 == 0) goto L_0x0091
            android.view.ContextThemeWrapper r10 = new android.view.ContextThemeWrapper
            r0 = 16973939(0x1030073, float:2.4061222E-38)
            r10.<init>(r9, r0)
            r3 = r10
            goto L_0x0092
        L_0x0091:
            r3 = r9
        L_0x0092:
            android.app.DatePickerDialog r10 = new android.app.DatePickerDialog
            r4 = 2132607235(0x7f1d0103, float:2.0869405E38)
            r5 = 0
            java.util.GregorianCalendar r0 = r9.f94781i
            int r6 = r0.get(r1)
            java.util.GregorianCalendar r0 = r9.f94781i
            r1 = 2
            int r7 = r0.get(r1)
            java.util.GregorianCalendar r0 = r9.f94781i
            r1 = 5
            int r8 = r0.get(r1)
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.f94782j = r10
            android.app.DatePickerDialog r10 = r9.f94782j
            r0 = -2
            r1 = 2132542491(0x7f1c041b, float:2.0738088E38)
            java.lang.String r1 = r9.getString(r1)
            com.ss.android.ugc.aweme.mobile.EditProfileActivityV2$5 r2 = new com.ss.android.ugc.aweme.mobile.EditProfileActivityV2$5
            r2.<init>()
            r10.setButton(r0, r1, r2)
            android.app.DatePickerDialog r10 = r9.f94782j
            r0 = -1
            r1 = 2132542496(0x7f1c0420, float:2.0738099E38)
            java.lang.String r1 = r9.getString(r1)
            com.ss.android.ugc.aweme.mobile.EditProfileActivityV2$6 r2 = new com.ss.android.ugc.aweme.mobile.EditProfileActivityV2$6
            r2.<init>()
            r10.setButton(r0, r1, r2)
        L_0x00d6:
            android.app.DatePickerDialog r10 = r9.f94782j
            r10.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mobile.EditProfileActivityV2.editBirthday(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo50431a(Exception exc) {
        if (isViewValid() && this.f94775c != null) {
            this.f94775c.mo81848e();
            if ((exc instanceof C23459a) && ((C23459a) exc).getErrorCode() == 20022) {
                C18898c.m46009a(this, "profile_image_setting", "review_failure");
            }
            C22971a.m56494a(this, exc, R.string.cq);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mobile.EditProfileActivityV2", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b3);
        if (bundle != null) {
            this.f94776d = bundle.getBoolean("avatarset", false);
        }
        this.f94778f = new C9381g(Looper.getMainLooper(), this);
        this.f94774b = new C39718ad();
        this.mBtnEnterAweme.setOnClickListener(new View.OnClickListener() {
            /* JADX WARNING: Removed duplicated region for block: B:34:0x00cd  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r5) {
                /*
                    r4 = this;
                    com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r5)
                    com.ss.android.ugc.aweme.mobile.EditProfileActivityV2 r5 = com.p683ss.android.ugc.aweme.mobile.EditProfileActivityV2.this
                    com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
                    boolean r0 = r0.hasUpdated()
                    if (r0 == 0) goto L_0x00d9
                    android.widget.EditText r0 = r5.mUsernameEdit
                    android.text.Editable r0 = r0.getText()
                    java.lang.String r0 = r0.toString()
                    java.lang.String r0 = r0.trim()
                    boolean r1 = r5.f94776d
                    if (r1 != 0) goto L_0x0033
                    boolean r1 = android.text.TextUtils.isEmpty(r0)
                    if (r1 == 0) goto L_0x0033
                    r0 = 2132548824(0x7f1c1cd8, float:2.0750933E38)
                    com.bytedance.ies.dmt.ui.d.a r5 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r5, r0)
                    r5.mo19066a()
                    goto L_0x00dc
                L_0x0033:
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x0045
                    r0 = 2132548838(0x7f1c1ce6, float:2.0750962E38)
                    com.bytedance.ies.dmt.ui.d.a r5 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r5, r0)
                    r5.mo19066a()
                    goto L_0x00dc
                L_0x0045:
                    boolean r0 = r5.f94776d
                    if (r0 != 0) goto L_0x0055
                    r0 = 2132548823(0x7f1c1cd7, float:2.0750931E38)
                    com.bytedance.ies.dmt.ui.d.a r5 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r5, r0)
                    r5.mo19066a()
                    goto L_0x00dc
                L_0x0055:
                    android.widget.EditText r0 = r5.mUsernameEdit
                    com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils.m58184c(r0)
                    boolean r0 = com.p683ss.android.ugc.aweme.mobile.C37132a.m83364a(r5)
                    if (r0 != 0) goto L_0x006c
                    r0 = 2132546921(0x7f1c1569, float:2.0747074E38)
                    com.bytedance.ies.dmt.ui.d.a r5 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r5, r0)
                    r5.mo19066a()
                    goto L_0x00dc
                L_0x006c:
                    r0 = 2132546547(0x7f1c13f3, float:2.0746315E38)
                    java.lang.String r0 = r5.getString(r0)
                    r5.showProgressDialog(r0)
                    android.widget.EditText r0 = r5.mUsernameEdit
                    android.text.Editable r0 = r0.getText()
                    java.lang.String r0 = r0.toString()
                    boolean r1 = android.text.TextUtils.isEmpty(r0)
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L_0x0097
                    r0 = 2132546999(0x7f1c15b7, float:2.0747232E38)
                    com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r5, r0)
                    r0.mo19066a()
                    r5.dismissProgressDialog()
                L_0x0095:
                    r0 = 0
                    goto L_0x00b5
                L_0x0097:
                    com.ss.android.ugc.aweme.IAccountUserService r1 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
                    com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
                    java.lang.String r1 = r1.getNickname()
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x00ae
                    com.ss.android.ugc.aweme.profile.ad r1 = r5.f94774b
                    r1.f101356a = r0
                    goto L_0x0095
                L_0x00ae:
                    com.ss.android.ugc.aweme.profile.ad r0 = r5.f94774b
                    java.lang.String r1 = ""
                    r0.f101356a = r1
                    r0 = 1
                L_0x00b5:
                    com.ss.android.ugc.aweme.profile.presenter.a r1 = r5.f94775c
                    if (r1 == 0) goto L_0x00c4
                    boolean r1 = r5.f94777e
                    if (r1 == 0) goto L_0x00c4
                    com.ss.android.ugc.aweme.profile.presenter.a r1 = r5.f94775c
                    r1.mo81847d()
                    r1 = 0
                    goto L_0x00c5
                L_0x00c4:
                    r1 = 1
                L_0x00c5:
                    if (r1 == 0) goto L_0x00ca
                    if (r0 == 0) goto L_0x00ca
                    goto L_0x00cb
                L_0x00ca:
                    r2 = 0
                L_0x00cb:
                    if (r2 == 0) goto L_0x00d0
                    r5.dismissProgressDialog()
                L_0x00d0:
                    com.ss.android.ugc.aweme.profile.b.g r5 = new com.ss.android.ugc.aweme.profile.b.g
                    r5.<init>()
                    com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r5)
                    return
                L_0x00d9:
                    r5.mo76398c()
                L_0x00dc:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mobile.EditProfileActivityV2.C371231.onClick(android.view.View):void");
            }
        });
        if (this.f94776d && C20902b.m53242a().hasUpdated()) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.h9);
            C12203q.m24645a((Object) C23608p.m57874a(C20902b.m53242a().getCurUser().getAvatarMedium())).mo23125b(C47788ct.m103417a(102)).mo23111a(dimensionPixelOffset, dimensionPixelOffset).mo23118a("EditProfileActivityV2").mo23116a((C12197k) this.mAvatar).mo23121a();
        }
        this.mAvatar.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C20902b.m53242a().hasUpdated()) {
                    EditProfileActivityV2.this.mo76398c();
                } else {
                    EditProfileActivityV2.this.f94775c.mo81843a(0);
                }
            }
        });
        this.f94780h = new C39954ad();
        this.f94780h.mo81850a((C39985s) this);
        if (!C20902b.m53242a().hasUpdated()) {
            C20902b.m53242a().queryUser(this.f94778f);
            showProgressDialog(getString(R.string.c0i));
        }
        this.f94775c = new C39948a();
        this.f94775c.f101827c = this;
        this.f94775c.mo80925b(this, null);
        this.txtExtra.setText(getString(R.string.dm9));
        this.txtExtra.setVisibility(0);
        this.txtExtra.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                EditProfileActivityV2.this.mo76397b();
            }
        });
        this.mUsernameEdit.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                EditProfileActivityV2.this.mo76396a();
            }
        });
        this.mBtnEnterAweme.setOnTouchListener(new C48222b(1.2f, 200, null));
        mo76396a();
        showImeOnce(this.mUsernameEdit);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mobile.EditProfileActivityV2", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo50432a(String str) {
        this.f94777e = true;
        StringBuilder sb = new StringBuilder("file://");
        sb.append(str);
        Uri parse = Uri.parse(sb.toString());
        C13771c.m27875c().mo26191b(parse);
        int a = (int) C47876fb.m103570a(this, 1, getResources().getDimension(R.dimen.h9));
        C12203q.m24646a(parse.toString()).mo23111a(a, a).mo23118a("EditProfileActivityV2").mo23116a((C12197k) this.mAvatar).mo23121a();
        mo76396a();
    }

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
        if (isViewValid()) {
            dismissProgressDialog();
            if (i == 112) {
                if (C20902b.m53242a().getCurUser().isNeedRecommend()) {
                    C37137a.m83368a((Activity) this).mo76413a(RecommendFriendActivity.class).mo76414a();
                }
                finish();
            } else if (i == 0) {
                this.f94779g.mo76415a(this, "register_finish");
                setResult(-1);
                finish();
            } else if (i == 4) {
                if (this.f94775c != null) {
                    this.f94775c.mo81848e();
                }
                this.f94776d = true;
                C10691a.m21533a((Context) this, (int) R.string.cr).mo19066a();
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.h9);
                C12203q.m24645a((Object) C23608p.m57874a(C20902b.m53242a().getCurUser().getAvatarMedium())).mo23125b(C47788ct.m103417a(102)).mo23111a(dimensionPixelOffset, dimensionPixelOffset).mo23118a("EditProfileActivityV2").mo23116a((C12197k) this.mAvatar).mo23121a();
                mo76396a();
            } else {
                C10691a.m21533a((Context) this, (int) R.string.cp).mo19066a();
            }
        }
    }

    /* renamed from: a */
    public final void mo54360a(Exception exc, int i) {
        if (isViewValid() && this.f94780h != null) {
            dismissProgressDialog();
            if (i == 112) {
                mo76398c();
                return;
            }
            if (this.f94775c != null) {
                this.f94775c.mo81848e();
                if ((exc instanceof C23459a) && ((C23459a) exc).getErrorCode() == 20022) {
                    C18898c.m46009a(this, "profile_image_setting", "review_failure");
                }
            }
            C22971a.m56494a(this, exc, R.string.czy);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f94775c == null || !this.f94775c.mo80923a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }
}
