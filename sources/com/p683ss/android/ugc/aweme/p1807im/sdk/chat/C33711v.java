package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.app.Activity;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C34002d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.CheckMessage;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.GroupNoticeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SystemContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SystemContent.Key;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SystemContent.LinkTypeExtra;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34332g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.BlockResponse;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34030j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1836g.C34173a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35187ac;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35200an;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35233bh;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u.C35302a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1907i.C35459a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.v */
public final class C33711v {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.v$a */
    public static class C33714a extends ClickableSpan implements C9382a {

        /* renamed from: a */
        public CharSequence f87454a;

        /* renamed from: b */
        public Key f87455b;

        /* renamed from: c */
        private int f87456c;

        /* renamed from: d */
        private C9381g f87457d;

        /* renamed from: a */
        private void m77223a() {
            if (this.f87457d == null) {
                this.f87457d = new C9381g(Looper.getMainLooper(), this);
            }
        }

        /* renamed from: a */
        private static String m77222a(String str) {
            return C34030j.f87981c.mo71975a(C34010e.m77748a().mo71964b(str), str);
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f87456c);
            textPaint.setUnderlineText(false);
        }

        public final void handleMsg(Message message) {
            if (message.what == 1) {
                m77224a(message.obj);
                return;
            }
            if (message.what == 0) {
                m77224a(message.obj);
            }
        }

        /* renamed from: a */
        private static void m77224a(Object obj) {
            Context a = C11010c.m22280a();
            if (obj instanceof C23459a) {
                C9432q.m18676a(a, ((C23459a) obj).getErrorMsg());
            } else if (obj instanceof Exception) {
                C9432q.m18672a(a, (int) R.string.bh3);
            } else {
                if (obj instanceof BlockResponse) {
                    BlockResponse blockResponse = (BlockResponse) obj;
                    if (blockResponse.getBlockStaus() == 1) {
                        C9432q.m18672a(a, (int) R.string.bf9);
                    } else if (blockResponse.getBlockStaus() == 0) {
                        C9432q.m18672a(a, (int) R.string.bp1);
                    }
                }
            }
        }

        public final void onClick(View view) {
            CharSequence charSequence;
            CharSequence charSequence2;
            m77223a();
            if (this.f87455b.getAction() == 1) {
                C35286u.m79871a((Handler) this.f87457d, this.f87454a, m77222a(this.f87454a.toString()), 1, 1);
            } else if (this.f87455b.getAction() == 2) {
                C35286u.m79871a((Handler) this.f87457d, this.f87454a, m77222a(this.f87454a.toString()), 0, 0);
            } else {
                if (this.f87455b.getAction() == 3) {
                    if (view.getTag() != null && (view.getTag() instanceof Bundle)) {
                        C11207p pVar = (C11207p) ((Bundle) view.getTag()).getSerializable("msg");
                        User curUser = C20854a.m53167g().getCurUser();
                        if (curUser != null && !TextUtils.isEmpty(curUser.getUid()) && pVar != null && pVar.getSender() > 0) {
                            String conversationId = pVar.getConversationId();
                            long conversationShortId = pVar.getConversationShortId();
                            if (!TextUtils.isEmpty(conversationId) || conversationShortId > 0) {
                                String str = "";
                                try {
                                    C18085o oVar = new C18085o();
                                    oVar.mo35020a("conversation_id", conversationId);
                                    oVar.mo35020a("unique_id", curUser.getUid());
                                    str = C35277o.m79761a(oVar);
                                } catch (Exception unused) {
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append(pVar.getSender());
                                C27013a.m65227a().report((Activity) view.getContext(), new Builder().appendQueryParameter("owner_id", curUser.getUid()).appendQueryParameter("report_type", "im").appendQueryParameter("extra", str).appendQueryParameter("object_id", sb.toString()));
                                C26890h.m65011a("im_warning_click", C23089d.m56640a().mo47829a("warning_type", "未成年防诱骗").mo47829a("from_user_id", ((Bundle) view.getTag()).getString("uid")).mo47829a("button_type", "report").f61491a);
                                HashMap hashMap = new HashMap();
                                hashMap.put("enter_from", "chat");
                                hashMap.put("enter_method", " click_notice");
                                hashMap.put("process_id", C35190af.f90475b);
                                hashMap.put("conversation_id", conversationId);
                                C26890h.m65011a("click_report", (Map<String, String>) hashMap);
                            }
                        }
                    }
                } else if (this.f87455b.getAction() == 4 || this.f87455b.getAction() == 6) {
                    if (LinkTypeExtra.isSafeWarningLink(this.f87455b)) {
                        C35190af.m79533o("click");
                    }
                    C41302w.m91042a().mo83861a(this.f87455b.getLink());
                } else if (this.f87455b.getAction() == 5) {
                    C35187ac.m79438a(view.getContext(), this.f87455b.getName());
                } else {
                    C11207p pVar2 = null;
                    if (this.f87455b.getAction() == 7) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("enter_from", "chat");
                        hashMap2.put("process_id", C35190af.f90475b);
                        C26890h.m65011a("click_feedback", (Map<String, String>) hashMap2);
                        if (view.getTag() != null && (view.getTag() instanceof Bundle)) {
                            final Bundle bundle = (Bundle) view.getTag();
                            if (bundle.getBoolean("feedback_switch", false)) {
                                C10691a.m21548c(C11010c.m22280a(), (int) R.string.g3u).mo19066a();
                                return;
                            }
                            C11207p pVar3 = (C11207p) bundle.getSerializable("msg");
                            SystemContent extContent = C33888y.content(pVar3).getExtContent();
                            if (extContent == null) {
                                try {
                                    extContent = CheckMessage.getContent((CheckMessage) C35277o.m79760a((String) pVar3.getLocalExt().get("s:send_response_check_msg"), CheckMessage.class));
                                } catch (Exception unused2) {
                                    extContent = null;
                                }
                            }
                            if (!(extContent == null || extContent.getTemplate() == null || extContent.getTemplate().length <= 0 || extContent.getTemplate()[0].getExtra() == null)) {
                                String content = pVar3.getContent();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(pVar3.getMsgType());
                                C1680ad.m5960a((C2206z<? extends T>) C35286u.f90624a.feedBackMsg(content, sb2.toString(), (String) extContent.getTemplate()[0].getExtra().get("scene"), Long.valueOf(pVar3.getMsgId()), Long.valueOf(pVar3.getConversationShortId()))).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6159b((C1683ag<? super T>) new C1683ag<BaseResponse>(new C35302a() {
                                    /* renamed from: a */
                                    public final void mo71736a(int i, Exception exc) {
                                    }

                                    /* renamed from: a */
                                    public final void mo71737a(int i, Object obj) {
                                        bundle.putBoolean("feedback_switch", true);
                                    }
                                }) {

                                    /* renamed from: a */
                                    final /* synthetic */ C35302a f90634a;

                                    public final void onError(Throwable th) {
                                    }

                                    public final void onSubscribe(C1690c cVar) {
                                    }

                                    {
                                        this.f90634a = r1;
                                    }

                                    public final /* synthetic */ void onSuccess(Object obj) {
                                        BaseResponse baseResponse = (BaseResponse) obj;
                                        C10691a.m21551c(C11010c.m22280a(), baseResponse.status_msg).mo19066a();
                                        if (this.f90634a != null) {
                                            this.f90634a.mo71737a(baseResponse.status_code, (Object) null);
                                        }
                                    }
                                });
                            }
                        }
                    } else if (this.f87455b.getAction() == 8) {
                        if (C35200an.f90490a.mo73323a(view)) {
                            C35459a.m80151c("MessageViewHelper", "double click");
                            return;
                        }
                        C34173a a = C34002d.m77716a();
                        FragmentActivity fragmentActivity = (FragmentActivity) view.getContext();
                        if (a == null || fragmentActivity == null) {
                            C35459a.m80151c("MessageViewHelper", "openRedPacketDetail service or activity null");
                        } else if (a.mo72175a(fragmentActivity).mo72181d() || !a.mo72175a(fragmentActivity).mo72182e()) {
                            C35459a.m80151c("MessageViewHelper", "openRedPacketDetail loading or view invalid");
                        } else {
                            if (this.f87455b.getExtra() == null || !this.f87455b.getExtra().containsKey("order_no")) {
                                charSequence = null;
                            } else {
                                charSequence = (String) this.f87455b.getExtra().get("order_no");
                            }
                            if (this.f87455b.getExtra() == null || !this.f87455b.getExtra().containsKey("sec_sender_uid")) {
                                charSequence2 = null;
                            } else {
                                charSequence2 = (String) this.f87455b.getExtra().get("sec_sender_uid");
                            }
                            if (view.getTag() != null && (view.getTag() instanceof Bundle)) {
                                pVar2 = (C11207p) ((Bundle) view.getTag()).getSerializable("msg");
                            }
                            if (TextUtils.isEmpty(charSequence) || pVar2 == null) {
                                C35459a.m80151c("MessageViewHelper", "openRedPacketDetail orderNumber invalid");
                            } else {
                                pVar2.getConversationId();
                                User c = C35265e.m79732c();
                                if (c != null) {
                                    TextUtils.equals(charSequence2, c.getSecUid());
                                }
                                view.getContext();
                                pVar2.getConversationId();
                            }
                        }
                    }
                }
            }
        }

        private C33714a(int i, String str) {
            this.f87456c = i;
            this.f87454a = str;
            if (this.f87454a == null) {
                this.f87454a = "0";
            }
            m77223a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.v$b */
    public static class C33716b extends ClickableSpan {

        /* renamed from: a */
        public String f87460a;

        /* renamed from: b */
        private int f87461b;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.v$b$a */
        public interface C33717a {
            /* renamed from: a */
            void mo71740a();

            /* renamed from: a */
            void mo71741a(View view);

            /* renamed from: b */
            void mo71742b(View view);
        }

        public final void onClick(View view) {
        }

        public C33716b(int i) {
            this.f87461b = i;
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f87461b);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.v$c */
    static class C33718c extends ClickableSpan {

        /* renamed from: a */
        public String f87462a;

        /* renamed from: b */
        private Context f87463b;

        /* renamed from: c */
        private int f87464c;

        /* renamed from: d */
        private int f87465d;

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f87464c);
        }

        public final void onClick(View view) {
            if (this.f87465d != 100121 || TextUtils.isEmpty(this.f87462a)) {
                if (!TextUtils.isEmpty(this.f87462a)) {
                    C35190af.m79442a();
                    C35190af.m79485b(this.f87462a, "chat", "click_name");
                    C35233bh.m79635a(this.f87462a);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("conversation_id", this.f87462a);
            C35190af.m79472a("group_name_quick_click", (Map<String, String>) hashMap);
            new C34332g(this.f87463b, this.f87462a).show();
        }

        public C33718c(Context context, int i, int i2) {
            this.f87463b = context;
            this.f87464c = i;
            this.f87465d = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.v$d */
    public static class C33719d extends ClickableSpan {

        /* renamed from: a */
        private Context f87466a;

        /* renamed from: b */
        private int f87467b;

        /* renamed from: c */
        private C11207p f87468c;

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f87467b);
        }

        public final void onClick(View view) {
            C35243bl.m79697a(C11016e.m22312g(), 7, (Object) this.f87468c);
        }

        private C33719d(Context context, int i, C11207p pVar) {
            this.f87466a = context;
            this.f87467b = i;
            this.f87468c = pVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.v$e */
    public static class C33720e extends ClickableSpan {

        /* renamed from: a */
        private int f87469a;

        public C33720e(int i) {
            this.f87469a = i;
        }

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f87469a);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C34004b.m77717a().mo71949f().updateApk(view.getContext());
            C26890h.m65012a("click_update_message", (JSONObject) null);
        }
    }

    /* renamed from: a */
    private static boolean m77220a(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8;
    }

    /* renamed from: a */
    public static void m77218a(SystemContent systemContent) {
        if (systemContent != null && systemContent.getTemplate() != null && systemContent.getTemplate().length > 0) {
            Key key = systemContent.getTemplate()[0];
            if (LinkTypeExtra.isSafeWarningLink(key)) {
                C35190af.m79533o("show");
            }
            if ((key.getAction() == 3 || key.getAction() == 7) && key.getExtra() != null) {
                String str = (String) key.getExtra().get("scene");
                HashMap hashMap = new HashMap();
                hashMap.put("notice_type", str);
                hashMap.put("process_id", C35190af.f90475b);
                C26890h.m65011a(" show_chat_notice", (Map<String, String>) hashMap);
            }
        }
    }

    /* renamed from: a */
    public static C33714a m77215a(int i, String str) {
        return new C33714a(i, str);
    }

    /* renamed from: a */
    public static void m77219a(SystemContent systemContent, TextView textView, String str) {
        Key[] strongTemplate = systemContent.getStrongTemplate();
        if (strongTemplate != null && strongTemplate.length > 0) {
            Context a = C11010c.m22280a();
            String strongTips = systemContent.getStrongTips();
            for (Key key : strongTemplate) {
                if (key != null && !TextUtils.isEmpty(key.getKey()) && !TextUtils.isEmpty(key.getName())) {
                    if (!m77220a(key.getAction())) {
                        if (!TextUtils.isEmpty(systemContent.getFallbackTips())) {
                            textView.setText(systemContent.getFallbackTips());
                        }
                        return;
                    }
                    strongTips = strongTips.replace(C2240a.m6772a("{{%s}}", new Object[]{key.getKey()}), key.getName());
                }
            }
            SpannableString spannableString = new SpannableString(strongTips);
            for (int i = 0; i < strongTemplate.length; i++) {
                Key key2 = strongTemplate[i];
                if (key2 != null && !TextUtils.isEmpty(key2.getKey()) && !TextUtils.isEmpty(key2.getName())) {
                    int indexOf = strongTips.indexOf(strongTemplate[i].getName());
                    if (indexOf >= 0) {
                        C33714a a2 = m77215a(C0726c.m2098c(a, R.color.azk), str);
                        a2.f87455b = key2;
                        spannableString.setSpan(a2, indexOf, key2.getName().length() + indexOf, 33);
                    }
                }
            }
            textView.setText(spannableString);
            Bundle bundle = new Bundle();
            bundle.putString("uid", str);
            textView.setTag(bundle);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setOnLongClickListener(C33887x.f87886a);
            textView.setVisibility(0);
        } else if (TextUtils.isEmpty(systemContent.getStrongTips())) {
            textView.setVisibility(8);
        } else {
            textView.setText(systemContent.getStrongTips());
            textView.setVisibility(0);
        }
    }

    /* renamed from: a */
    public static void m77217a(C11207p pVar, SystemContent systemContent, TextView textView, String str) {
        String str2;
        Key[] keyArr;
        textView.setVisibility(8);
        if (!TextUtils.isEmpty(systemContent.getGroupNoticeTips())) {
            try {
                GroupNoticeContent groupNoticeContent = (GroupNoticeContent) C35277o.m79760a(systemContent.getGroupNoticeTips(), GroupNoticeContent.class);
                if (groupNoticeContent != null && !TextUtils.isEmpty(groupNoticeContent.getNoticeText())) {
                    textView.setText(groupNoticeContent.getNoticeText());
                    textView.setVisibility(0);
                }
            } catch (Exception unused) {
            }
        } else {
            if (TextUtils.isEmpty(systemContent.getNewTips()) || systemContent.getNewTemplate() == null || systemContent.getNewTemplate().length <= 0) {
                keyArr = systemContent.getTemplate();
                str2 = systemContent.getTips();
            } else {
                keyArr = systemContent.getNewTemplate();
                str2 = systemContent.getNewTips();
            }
            if (keyArr != null && keyArr.length > 0) {
                Context a = C11010c.m22280a();
                String str3 = str2;
                for (Key key : keyArr) {
                    if (key != null && !TextUtils.isEmpty(key.getKey()) && !TextUtils.isEmpty(key.getName())) {
                        if (!m77220a(key.getAction())) {
                            if (!TextUtils.isEmpty(systemContent.getFallbackTips())) {
                                textView.setText(systemContent.getFallbackTips());
                                textView.setVisibility(0);
                            }
                            return;
                        }
                        str3 = str3.replace(C2240a.m6772a("{{%s}}", new Object[]{key.getKey()}), key.getName());
                    }
                }
                SpannableString spannableString = new SpannableString(str3);
                for (int i = 0; i < keyArr.length; i++) {
                    Key key2 = keyArr[i];
                    if (key2 != null && !TextUtils.isEmpty(key2.getKey()) && !TextUtils.isEmpty(key2.getName())) {
                        int indexOf = str3.indexOf(keyArr[i].getName());
                        if (indexOf >= 0) {
                            C33714a a2 = m77215a(C0726c.m2098c(a, R.color.av1), str);
                            a2.f87455b = key2;
                            spannableString.setSpan(a2, indexOf, key2.getName().length() + indexOf, 33);
                        }
                    }
                }
                textView.setText(spannableString);
                Bundle bundle = new Bundle();
                bundle.putSerializable("msg", pVar);
                textView.setTag(bundle);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setOnLongClickListener(C33886w.f87885a);
                textView.setHighlightColor(-16776961);
                textView.setVisibility(0);
            } else if (TextUtils.isEmpty(str2)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str2);
                textView.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public static void m77216a(Context context, TextView textView, String str, String str2, GroupNoticeContent groupNoticeContent, int i, String str3) {
        TextView textView2 = textView;
        GroupNoticeContent groupNoticeContent2 = groupNoticeContent;
        int i2 = i;
        int color = C11010c.m22280a().getResources().getColor(R.color.aqt);
        SpannableString spannableString = new SpannableString(str);
        if (TextUtils.isEmpty(str2) || !str.contains(str2)) {
            Context context2 = context;
        } else {
            Context context3 = context;
            C33718c cVar = new C33718c(context, color, i2);
            int indexOf = str.indexOf(str2);
            if (i2 == 100121) {
                cVar.f87462a = str3;
            }
            spannableString.setSpan(cVar, indexOf, str2.length() + indexOf, 33);
        }
        if (groupNoticeContent.isNormalOrder()) {
            SpannableString spannableString2 = spannableString;
            String str4 = str;
            GroupNoticeContent groupNoticeContent3 = groupNoticeContent;
            int i3 = i;
            int a = m77214a(context, spannableString2, str4, groupNoticeContent2.getActiveText(groupNoticeContent.isDefinedType()), groupNoticeContent.getActiveUsers(), groupNoticeContent3, i3, 0);
            m77214a(context, spannableString2, str4, groupNoticeContent2.getPassiveText(groupNoticeContent.isDefinedType()), groupNoticeContent.getPassiveUsers(), groupNoticeContent3, i3, a);
        } else {
            SpannableString spannableString3 = spannableString;
            String str5 = str;
            GroupNoticeContent groupNoticeContent4 = groupNoticeContent;
            int i4 = i;
            int a2 = m77214a(context, spannableString3, str5, groupNoticeContent2.getPassiveText(groupNoticeContent.isDefinedType()), groupNoticeContent.getPassiveUsers(), groupNoticeContent4, i4, 0);
            m77214a(context, spannableString3, str5, groupNoticeContent2.getActiveText(groupNoticeContent.isDefinedType()), groupNoticeContent.getActiveUsers(), groupNoticeContent4, i4, a2);
        }
        if (!TextUtils.isEmpty(spannableString)) {
            textView.setVisibility(0);
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* renamed from: a */
    private static int m77214a(Context context, SpannableString spannableString, String str, String str2, List<IMUser> list, GroupNoticeContent groupNoticeContent, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return i2;
        }
        int color = C11010c.m22280a().getResources().getColor(R.color.aqt);
        if (!TextUtils.isEmpty(str2)) {
            i2 = str.indexOf(str2, i2);
            if (i2 != -1) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    IMUser iMUser = (IMUser) list.get(i3);
                    if (!groupNoticeContent.isDefinedType() || !TextUtils.equals(iMUser.getUid(), C35265e.m79730b().toString())) {
                        String displayName = iMUser.getDisplayName();
                        C33718c cVar = new C33718c(context, color, i);
                        cVar.f87462a = iMUser.getUid();
                        spannableString.setSpan(cVar, i2, displayName.length() + i2, 17);
                        i2 += displayName.length() + 1;
                    }
                }
            }
        }
        return i2;
    }
}
