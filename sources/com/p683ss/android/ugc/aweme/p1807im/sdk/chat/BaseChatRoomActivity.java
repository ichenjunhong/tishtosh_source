package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.p702im.core.p706c.C11190e;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.login.C27962e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33519b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33453a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34213a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35464a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.UUID;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatRoomActivity */
public class BaseChatRoomActivity extends AmeActivity {

    /* renamed from: a */
    public C33353ab f86422a;

    /* renamed from: b */
    private C33447e f86423b;

    public void onDestroy() {
        super.onDestroy();
        C35190af.f90475b = "";
    }

    /* renamed from: a */
    public static String m76444a() {
        String uuid = UUID.randomUUID().toString();
        C35190af.f90475b = uuid;
        return uuid;
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("chat");
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.q7);
    }

    public void onBackPressed() {
        if (this.f86423b != null) {
            this.f86423b.mo70854a();
        }
        super.onBackPressed();
    }

    public void finish() {
        if (this.f86423b != null) {
            this.f86423b.mo70855e();
        }
        super.finish();
        C33353ab abVar = this.f86422a;
        C52711k.m112240b(this, "activity");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo70675b() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f86422a = (C33353ab) extras.get("key_session_info");
            if (this.f86422a == null) {
                String string = extras.getString("session_id", "");
                int i = extras.getInt("chat_type", 0);
                int i2 = extras.getInt("key_enter_from", 0);
                if (i == 3) {
                    C34279d dVar = (C34279d) extras.getSerializable("key_group_create_error");
                    C33677l lVar = new C33677l();
                    lVar.setGroupCheckMessage(dVar);
                    this.f86422a = lVar;
                } else {
                    String string2 = extras.getString("from_user_id", "");
                    IMUser iMUser = (IMUser) extras.getSerializable("simple_uesr");
                    C35464a aVar = (C35464a) extras.getSerializable("im_ad_log");
                    Serializable serializable = extras.getSerializable("chat_ext");
                    if (iMUser != null && iMUser.isFake()) {
                        IMUser a = C34010e.m77748a().mo71952a(iMUser.getUid());
                        if (a != null) {
                            iMUser = a;
                        }
                    }
                    C33354ac acVar = new C33354ac();
                    acVar.setShareUserId(string2);
                    acVar.setChatExt(serializable);
                    acVar.setImAdLog(aVar);
                    acVar.setFromUser(iMUser);
                    this.f86422a = acVar;
                    C33682n.m77130a(iMUser, string, Integer.valueOf(i2), "BaseChatRoomActivity");
                    if (TextUtils.isEmpty(string) && iMUser != null) {
                        string = C11190e.m22687a(Long.parseLong(iMUser.getUid()));
                    }
                }
                int i3 = 4;
                if (i2 == 12) {
                    if (string != null) {
                        C33453a.f86701a = string;
                    }
                } else if (!C33453a.m76678a(string)) {
                    i3 = i;
                }
                this.f86422a.setConversationId(string);
                this.f86422a.setEnterFrom(i2);
                this.f86422a.setChatType(i3);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f86422a != null) {
            bundle.putSerializable("key_session_info", this.f86422a);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        mo70675b();
        m76445a(!intent.getBooleanExtra("back_to_chat_room", false));
    }

    /* renamed from: a */
    private void m76445a(boolean z) {
        C0654k supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2224a("chat_room_fragment");
        if (a == null || z) {
            a = new C33447e();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_session_info", this.f86422a);
            a.setArguments(bundle);
        }
        this.f86423b = (C33447e) a;
        supportFragmentManager.mo2225a().mo2192b(R.id.ajf, a, "chat_room_fragment").mo2195c();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            getIntent().putExtras(bundle);
        }
        setContentView((int) R.layout.bbv);
        C34004b.m77718b().setupStatusBar(this);
        C34004b.m77717a().mo71950g();
        getWindow().getDecorView().setBackgroundResource(R.drawable.d5x);
        mo70675b();
        m76445a(false);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f86423b != null) {
            C33447e eVar = this.f86423b;
            if (eVar.f86686a != null) {
                BaseChatPanel baseChatPanel = eVar.f86686a;
                baseChatPanel.f86395n = z;
                if (z) {
                    if (baseChatPanel.f86398q.getSelectMsgType() == 1) {
                        C33519b bVar = baseChatPanel.f86391j;
                        if (bVar == null) {
                            C52711k.m112237a("mInputView");
                        }
                        bVar.mo70584b(8);
                        return;
                    }
                    C33519b bVar2 = baseChatPanel.f86391j;
                    if (bVar2 == null) {
                        C52711k.m112237a("mInputView");
                    }
                    bVar2.mo70584b(0);
                }
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f86423b != null) {
            this.f86423b.onActivityResult(i, i2, intent);
        }
    }

    /* renamed from: a */
    public static boolean m76446a(Context context, String str, int i, Bundle bundle, Class<? extends BaseChatRoomActivity> cls) {
        if (!BaseUserService.getBaseUserService_Monster().isLogin()) {
            C27962e.m66716a((Activity) context);
            return false;
        } else if (C34004b.m77717a().mo71949f().isEnableShowTeenageTip()) {
            return false;
        } else {
            if (i != 3 || !C34213a.m78052a(str)) {
                Intent intent = new Intent(context, cls);
                intent.putExtra("session_id", str);
                intent.putExtra("chat_type", i);
                if (i != 3) {
                    IMUser b = C34010e.m77748a().mo71964b(String.valueOf(C11190e.m22685a(str)));
                    if (b == null) {
                        C32458a.m75144a("ChatRoomActivity.start user = null");
                        return false;
                    }
                    try {
                        Long.parseLong(b.getUid());
                        intent.putExtra("simple_uesr", b);
                    } catch (Exception unused) {
                        StringBuilder sb = new StringBuilder("ChatRoomActivity.start uid is invalid: ");
                        sb.append(b.getUid());
                        C32458a.m75144a(sb.toString());
                        return false;
                    }
                }
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                intent.addFlags(268435456);
                context.startActivity(intent);
                return true;
            }
            C10691a.m21542b(context, (int) R.string.bhv).mo19066a();
            return false;
        }
    }
}
