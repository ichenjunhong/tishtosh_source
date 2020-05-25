package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.alibaba.fastjson.JSON;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p524d.C9396a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.ies.uikit.p698b.C11073c;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p718b.p719a.C11409r;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11500m;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11178a;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11207p.C11209a;
import com.bytedance.p702im.core.p706c.C11213r;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29358c;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29368b;
import com.p683ss.android.ugc.aweme.emoji.p1693i.C29410a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.framework.services.IFollowService.IFollowCallback;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C34002d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33220b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.C33486c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.C33509j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo.PhotoDetailActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.AudioContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.CommentContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.DouYinRedPacketContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EmojiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.GroupInviteContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.OnlyPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SayHelloContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SelfStoryReplyContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareAwemeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareCompilationContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareGoodContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareGoodWindowContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareLiveContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareMiniAppContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareMusicContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareRankingListContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareStickerContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareUserContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareWebContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryReplyContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SystemContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SystemContent.Key;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.TextContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.VideoUpdateTipsContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33374a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33394b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33440v;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1819b.C33403g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33453a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33460f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33464h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.selectmsg.C33706a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33729a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33746ai;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33805c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33838d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33842dd;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33845f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33849j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33871m;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like.C33857a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like.DmGuideExperiment;
import com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate.C34169a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate.C34172b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34280e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34305b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.UserStruct;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.C34707b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.C34707b.C34708a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.C34707b.C34709b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.DragViewInfo;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.MediaBrowserActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34030j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1836g.C34173a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1845j.C34389a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1845j.C34391b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1845j.C34392c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.RelationSelectActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35186ab;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35200an;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35201ao;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35204ar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35219ba;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35233bh;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35270j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.p1893a.C35182b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.VideoFilePlayerActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.C35403i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.DragView.IViewInfo;
import com.p683ss.android.ugc.aweme.p1807im.service.C35461k;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1907i.C35459a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.services.FollowService;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.story.api.C46628f;
import com.p683ss.android.ugc.aweme.story.api.model.C46634c;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.r */
public class C33689r extends C33349a implements C34389a {

    /* renamed from: A */
    private int f87356A;

    /* renamed from: B */
    private List<C33703c> f87357B = new ArrayList();

    /* renamed from: c */
    int f87358c;

    /* renamed from: d */
    public C11213r f87359d;

    /* renamed from: e */
    public List<C11207p> f87360e;

    /* renamed from: f */
    public C35403i f87361f;

    /* renamed from: g */
    public C11073c f87362g;

    /* renamed from: h */
    public C33486c f87363h;

    /* renamed from: i */
    public C11207p f87364i;

    /* renamed from: j */
    public C11207p f87365j;

    /* renamed from: k */
    public boolean f87366k = true;

    /* renamed from: l */
    public boolean f87367l = true;

    /* renamed from: m */
    public final C33353ab f87368m;

    /* renamed from: n */
    C0198r<List<C11207p>> f87369n;

    /* renamed from: o */
    public C33702b f87370o;

    /* renamed from: p */
    boolean f87371p = true;

    /* renamed from: q */
    private C33746ai f87372q;

    /* renamed from: r */
    private OnClickListener f87373r;

    /* renamed from: s */
    private C33706a f87374s;

    /* renamed from: t */
    private OnLongClickListener f87375t;

    /* renamed from: u */
    private C33509j f87376u;

    /* renamed from: v */
    private Handler f87377v;

    /* renamed from: w */
    private IMUser f87378w;

    /* renamed from: x */
    private boolean f87379x;

    /* renamed from: y */
    private C11207p f87380y;

    /* renamed from: z */
    private C11207p f87381z;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.r$a */
    class C33699a implements Runnable {

        /* renamed from: a */
        public C11207p f87409a;

        public final void run() {
            final String str;
            BaseContent content = C33888y.content(this.f87409a);
            final String str2 = null;
            if (content instanceof ShareUserContent) {
                ShareUserContent shareUserContent = (ShareUserContent) content;
                str2 = shareUserContent.getSecUid();
                str = shareUserContent.getUid();
            } else if (content instanceof ShareAwemeContent) {
                ShareAwemeContent shareAwemeContent = (ShareAwemeContent) content;
                str2 = shareAwemeContent.getSecUid();
                str = shareAwemeContent.getUser();
            } else if (content instanceof ShareLiveContent) {
                ShareLiveContent shareLiveContent = (ShareLiveContent) content;
                str2 = shareLiveContent.getRoomSecOwnerId();
                str = shareLiveContent.getRoomOwnerId();
            } else {
                str = null;
            }
            if (content != null && !TextUtils.isEmpty(str)) {
                C35190af.m79442a();
                C26890h.m65005a(C11010c.m22280a(), "follow", "chat", str, C11190e.m22685a(C33689r.this.f87368m.getConversationId()));
                C35190af.m79442a();
                long a = C11190e.m22685a(C33689r.this.f87368m.getConversationId());
                HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                hashMap.put("to_user_id", sb.toString());
                hashMap.put("previous_page", "message");
                hashMap.put("previous_page_position", "other_places");
                hashMap.put("enter_from", "chat");
                hashMap.put("enter_method", "follow_button");
                C26890h.m65011a("follow", (Map<String, String>) hashMap);
                FollowService.createIFollowServicebyMonsterPlugin().sendRequest(str, str2, 1, new IFollowCallback() {
                    public final void onFollowSuccess() {
                        if (C33689r.this.f86483b.indexOf(C33699a.this.f87409a) >= 0) {
                            BaseContent content = C33888y.content(C33699a.this.f87409a);
                            if (content instanceof ShareAwemeContent) {
                                ShareAwemeContent shareAwemeContent = (ShareAwemeContent) content;
                                IMUser iMUser = new IMUser();
                                iMUser.setNickName(shareAwemeContent.getContentName());
                                iMUser.setAvatarThumb(shareAwemeContent.getContentThumb());
                                iMUser.setSignature("");
                                iMUser.setUid(shareAwemeContent.getUser());
                                iMUser.setFollowStatus(1);
                                C34010e.m77748a().mo71959a(iMUser);
                            } else if (content instanceof ShareUserContent) {
                                ShareUserContent shareUserContent = (ShareUserContent) content;
                                IMUser iMUser2 = new IMUser();
                                iMUser2.setNickName(shareUserContent.getName());
                                iMUser2.setAvatarThumb(shareUserContent.getAvatar());
                                iMUser2.setSignature("");
                                iMUser2.setUid(shareUserContent.getUid());
                                iMUser2.setFollowStatus(1);
                                C34010e.m77748a().mo71959a(iMUser2);
                            } else if (content instanceof ShareLiveContent) {
                                ShareLiveContent shareLiveContent = (ShareLiveContent) content;
                                IMUser iMUser3 = new IMUser();
                                iMUser3.setNickName(shareLiveContent.getRoomOwnerName());
                                iMUser3.setAvatarThumb(shareLiveContent.getRoomOwnerAvatar());
                                iMUser3.setSignature("");
                                iMUser3.setUid(shareLiveContent.getRoomOwnerId());
                                iMUser3.setFollowStatus(1);
                                C34010e.m77748a().mo71959a(iMUser3);
                            }
                            C33689r.this.mo70698c();
                            C18842a.m45932a(new Runnable() {
                                public final void run() {
                                    UserStruct userStruct;
                                    try {
                                        userStruct = (UserStruct) C35286u.m79865a().queryUser(str, str2).get();
                                    } catch (InterruptedException | ExecutionException unused) {
                                        userStruct = null;
                                    }
                                    if (userStruct != null && userStruct.getUser() != null) {
                                        C34010e.m77748a().mo71959a(IMUser.fromUser(userStruct.getUser()));
                                    }
                                }
                            });
                            if (C33689r.this.f86482a != null) {
                                C9432q.m18672a(C33689r.this.f86482a.getContext(), (int) R.string.bhh);
                            }
                        }
                    }

                    public final void onFollowFailed(Exception exc) {
                        if (C33689r.this.f86482a != null) {
                            C9432q.m18672a(C33689r.this.f86482a.getContext(), (int) R.string.bot);
                        }
                    }
                });
            }
        }

        public C33699a(C11207p pVar) {
            this.f87409a = pVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.r$b */
    interface C33702b {
        /* renamed from: a */
        void mo70668a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.r$c */
    public interface C33703c {
        /* renamed from: a */
        void mo70733a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70857a(IMUser iMUser, C33353ab abVar, C33805c cVar, C11207p pVar, int i) {
    }

    /* renamed from: c */
    public final void mo70698c() {
        notifyDataSetChanged();
    }

    /* renamed from: h */
    public final void mo71717h() {
        this.f87367l = true;
    }

    /* renamed from: i */
    public final void mo71718i() {
        this.f87367l = false;
    }

    /* renamed from: a */
    public final void mo71711a(List<C11207p> list, int i) {
        Message obtainMessage;
        if (list != null && !list.isEmpty()) {
            boolean z = true;
            Message obtainMessage2 = this.f87377v.obtainMessage(1);
            C11207p pVar = (C11207p) list.get(0);
            switch (i) {
                case 0:
                case 1:
                    if (!this.f86483b.contains(pVar)) {
                        obtainMessage = this.f87377v.obtainMessage(5);
                    } else {
                        obtainMessage = this.f87377v.obtainMessage(2);
                    }
                    obtainMessage2 = obtainMessage;
                    if (this.f87368m.isFriendChat() && pVar.getMsgStatus() == 2) {
                        m77141b(0);
                        break;
                    }
                case 2:
                    if (!this.f87368m.isStrangerChat()) {
                        if (list.size() == 1 && !this.f86483b.contains(pVar)) {
                            obtainMessage2 = this.f87377v.obtainMessage(5);
                            m77141b(2);
                            m77138a(pVar);
                            break;
                        } else {
                            obtainMessage2 = this.f87377v.obtainMessage(2);
                            break;
                        }
                    } else {
                        obtainMessage2 = this.f87377v.obtainMessage(2);
                        m77141b(0);
                        this.f87368m.setChatType(0);
                        m77138a(pVar);
                        break;
                    }
                case 3:
                    if (this.f86483b.contains(pVar)) {
                        obtainMessage2 = this.f87377v.obtainMessage(7);
                        break;
                    }
                    break;
                case 4:
                    if (list.size() != this.f87359d.f30223c) {
                        z = false;
                    }
                    this.f87366k = z;
                    if (!m77143m()) {
                        m77141b(4);
                        break;
                    }
                    break;
                case 5:
                    this.f87366k = list.size() == this.f87359d.f30223c;
                    if (this.f87372q != null) {
                        C33746ai aiVar = this.f87372q;
                        Animation animation = aiVar.f87533u.getAnimation();
                        if (animation != null) {
                            animation.cancel();
                        }
                        aiVar.f87533u.clearAnimation();
                    }
                    if (this.f87356A > 0 && this.f87356A != this.f87359d.f30223c) {
                        this.f87359d.f30223c = this.f87356A;
                        this.f87356A = 0;
                    }
                    this.f87358c = 0;
                    if (!(this.f86483b.size() > 1 || this.f86482a == null || this.f86482a.getLayoutManager() == null)) {
                        this.f86482a.getLayoutManager().mo4741e(0);
                        break;
                    }
                case 6:
                    if (pVar.isRecalled()) {
                        obtainMessage2 = this.f87377v.obtainMessage(4);
                        break;
                    } else if (pVar.getMsgType() == 2 || pVar.getMsgType() == 17) {
                        obtainMessage2 = this.f87377v.obtainMessage(2);
                        break;
                    } else if (pVar.getMsgType() == 32) {
                        obtainMessage2 = this.f87377v.obtainMessage(1);
                        break;
                    } else {
                        return;
                    }
                    break;
                case 7:
                    obtainMessage2 = this.f87377v.obtainMessage(2);
                    break;
            }
            obtainMessage2.obj = list;
            this.f87377v.sendMessage(obtainMessage2);
        }
    }

    /* renamed from: a */
    public void mo70695a(Object obj, int i) {
        if (obj != null) {
            try {
                List list = (List) obj;
                int size = list.size();
                int i2 = 0;
                C11207p pVar = (C11207p) list.get(0);
                switch (i) {
                    case 0:
                        int indexOf = this.f86483b.indexOf(pVar);
                        if (indexOf != -1) {
                            while (i2 < list.size()) {
                                int i3 = i2 + indexOf;
                                if (i3 >= getItemCount()) {
                                    notifyItemRangeChanged(indexOf, size);
                                    break;
                                } else {
                                    this.f86483b.set(i3, pVar);
                                    i2++;
                                }
                            }
                            notifyItemRangeChanged(indexOf, size);
                        }
                        break;
                    case 1:
                        this.f86483b.addAll(0, list);
                        notifyItemRangeInserted(0, size);
                        C33849j e = C33849j.m77600e();
                        RecyclerView recyclerView = this.f86482a;
                        boolean z = true;
                        e.f87816e = true;
                        e.mo70736a(recyclerView, 0);
                        if (this.f86482a == null || !(this.f86482a.getLayoutManager() instanceof LinearLayoutManager) || ((LinearLayoutManager) this.f86482a.getLayoutManager()).mo4749j() > 10) {
                            z = false;
                        }
                        if (z && this.f86482a != null && (this.f86482a.getLayoutManager() instanceof LinearLayoutManager)) {
                            ((LinearLayoutManager) this.f86482a.getLayoutManager()).mo4721a(0, 0);
                            break;
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        int indexOf2 = this.f86483b.indexOf(pVar);
                        if (indexOf2 != -1) {
                            this.f86483b.removeAll(list);
                            notifyItemRangeRemoved(indexOf2, size);
                            break;
                        }
                        break;
                }
                this.f87363h.mo70906a(this.f86483b);
                super.mo70695a(obj, i);
            } catch (Exception e2) {
                C32458a.m75143a(e2);
            }
        }
    }

    /* renamed from: a */
    public final void mo71705a(C0198r<List<C11207p>> rVar) {
        this.f87369n = rVar;
        if (!(this.f87368m == null || this.f87368m.getSelectMsgList() == null || this.f87368m.getSelectMsgList().isEmpty() || this.f87369n == null)) {
            List list = (List) this.f87369n.getValue();
            if (list == null) {
                list = new ArrayList();
            }
            list.addAll(this.f87368m.getSelectMsgList());
            this.f87369n.setValue(list);
        }
    }

    /* renamed from: a */
    public final void mo71710a(List<C11207p> list) {
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f87360e.add(list.get(size));
            }
        }
        mo71713b();
    }

    /* renamed from: a */
    public C33805c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C33805c cVar;
        Context context = viewGroup.getContext();
        C33888y valueOf = C33888y.valueOf(i);
        View inflate = LayoutInflater.from(context).inflate(valueOf.getItemLayoutId(), viewGroup, false);
        if (this.f87368m == null || this.f87368m.getSelectMsgType() != 1) {
            cVar = valueOf.getViewHolder(inflate);
            cVar.f87710l = 0;
        } else {
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.addView(inflate);
            frameLayout.addView(LayoutInflater.from(context).inflate(R.layout.bdu, viewGroup, false));
            cVar = valueOf.getViewHolder(frameLayout);
            cVar.f87710l = this.f87368m.getSelectMsgType();
        }
        C33706a aVar = this.f87374s;
        if (cVar.f87701c != null) {
            cVar.f87701c.setOnCheckedChangeListener(new C33838d(cVar, aVar));
        }
        cVar.mo71840a(this.f87375t);
        cVar.mo71783a(this.f87373r);
        if (cVar instanceof C33729a) {
            C35190af.m79445a(12, C35243bl.m79710a(context) ? "open" : "install", "duoshan_banner_show");
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo71709a(String str, C11207p pVar, View view) {
        C46634c cVar = new C46634c();
        cVar.storyId = str;
        cVar.detailType = 1;
        Object a = C27991b.m66756a(C46628f.class);
        if (a != null) {
            C46628f fVar = (C46628f) a;
        } else {
            C46628f fVar2 = (C46628f) C20302a.m50070a(C46628f.class).mo42947a(new C20310d()).mo42946a().mo42948b();
        }
        C11016e.m22312g();
        if (pVar != null) {
            String uuid = pVar.getUuid();
            C52711k.m112240b(this, "storyMessageSetting");
            C52711k.m112240b(uuid, "msgUUID");
            C34391b.f88755a.put(this, uuid);
        }
    }

    /* renamed from: a */
    public final void mo71706a(Context context, C11207p pVar, IViewInfo iViewInfo) {
        if (context != null && pVar != null) {
            ArrayList<DragViewInfo> arrayList = new ArrayList<>();
            m77140a(arrayList, pVar.getIndex());
            arrayList.add(new DragViewInfo(pVar.getIndex(), iViewInfo));
            C34708a aVar = new C34708a();
            aVar.f89409a.f89405a = this.f87368m.getConversationId();
            aVar.f89409a.f89406b = pVar;
            C34709b.m78702a(new ArrayList(this.f86483b));
            aVar.f89409a.f89408d = arrayList;
            C34707b bVar = aVar.f89409a;
            C52711k.m112240b(context, "context");
            C52711k.m112240b(bVar, "param");
            Intent intent = new Intent(context, MediaBrowserActivity.class);
            intent.putExtra("MediaBrowserParam", bVar.mo72762a(new Bundle()));
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public final void mo71712a(boolean z, String str) {
        if (!z) {
            int size = this.f86483b.size();
            for (int i = 0; i < size; i++) {
                C11207p pVar = (C11207p) this.f86483b.get(i);
                if (TextUtils.equals(pVar.getUuid(), str)) {
                    C34392c.m78321a(pVar);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void onViewAttachedToWindow(C33805c cVar) {
        super.onViewAttachedToWindow(cVar);
    }

    /* renamed from: b */
    public final void mo71713b() {
        this.f87377v.sendMessage(this.f87377v.obtainMessage(1));
    }

    /* renamed from: g */
    public final void mo71716g() {
        if (this.f87380y != null) {
            this.f87380y.getLocalExt().remove("show_unread_message_tips");
        }
    }

    public int getItemCount() {
        if (this.f86483b != null) {
            return this.f86483b.size();
        }
        return 0;
    }

    /* renamed from: l */
    public final boolean mo71721l() {
        if (this.f87368m.getChatType() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo71715f() {
        if (this.f87358c == 1) {
            if (this.f87372q != null) {
                this.f87372q.mo71799g();
            }
            return;
        }
        this.f87358c = 1;
        this.f87359d.mo20833a();
    }

    /* renamed from: m */
    private boolean m77143m() {
        if (C35279p.m79763a() || this.f87368m.isGroupChat() || this.f87368m.isStrangerChat()) {
            return false;
        }
        IMUser singleChatFromUser = this.f87368m.getSingleChatFromUser();
        if (singleChatFromUser != null && singleChatFromUser.getFollowStatus() != 2 && this.f87379x && C35284t.m79782a().mo73443s()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo70692a() {
        mo70858d();
        notifyDataSetChanged();
        if (this.f87357B != null && !this.f87357B.isEmpty()) {
            for (C33703c a : this.f87357B) {
                a.mo70733a();
            }
        }
        super.mo70692a();
    }

    /* renamed from: j */
    public final void mo71719j() {
        this.f87367l = false;
        if (this.f87362g != null) {
            C11073c cVar = this.f87362g;
            if (!cVar.f29756e && !cVar.f29757f) {
                cVar.f29759h.removeCallbacks(cVar.f29760i);
                cVar.mo20076a();
                cVar.f29756e = true;
            }
        }
        C52711k.m112240b(this, "storyMessageSetting");
        if (C34391b.f88756b.contains(this)) {
            C34391b.f88756b.remove(this);
        }
        C34391b.m78320a(this);
    }

    /* renamed from: k */
    public final void mo71720k() {
        Context a = C11010c.m22280a();
        Key key = new Key();
        key.setKey("1");
        key.setName(a.getResources().getString(R.string.ft_));
        key.setAction(4);
        key.setLink("aweme://privacy/setting");
        m77139a(a.getResources().getString(R.string.ftd), new Key[]{key}, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo70858d() {
        boolean z;
        boolean z2;
        if (this.f87368m.isGroupChat()) {
            this.f86483b.clear();
            List b = this.f87359d.mo20837b();
            for (int i = 0; i < b.size(); i++) {
                C11207p pVar = (C11207p) b.get(i);
                if (pVar.getMsgType() != 1002) {
                    z2 = false;
                } else {
                    z2 = C35197am.m79568f(pVar);
                    if (z2) {
                        C11213r.m22769a(pVar, true);
                    }
                }
                if (!z2) {
                    this.f86483b.add(b.get(i));
                }
            }
        } else {
            if (this.f87381z != null && !this.f87359d.f30221a.contains(this.f87381z)) {
                this.f87359d.f30221a.add(0, this.f87381z);
                this.f87381z = null;
            }
            this.f86483b = this.f87359d.mo20837b();
            if (this.f87371p && this.f87368m.isSingleChat() && C35279p.m79763a()) {
                String conversationId = this.f87368m.getConversationId();
                List list = this.f86483b;
                String singleChatFromUserId = this.f87368m.getSingleChatFromUserId();
                C52711k.m112240b(list, "messageData");
                if (conversationId != null && singleChatFromUserId != null) {
                    if (list.isEmpty()) {
                        C32458a.m75141a(3, "MessageGenerator", "addBubbleTipsMessage not in exper ,just return for messageData isempty");
                    } else {
                        C11180b a = C11182d.m22641a().mo20658a(conversationId);
                        if (a != null) {
                            DmGuideExperiment dmGuideExperiment = DmGuideExperiment.INSTANCE;
                            if (dmGuideExperiment.mo71882a() == DmGuideExperiment.EXPERIMENT_1 || dmGuideExperiment.mo71882a() == DmGuideExperiment.EXPERIMENT_3) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                int i2 = C35182b.f90462a.getInt("bubble_guide_for_tt_like_times", 0);
                                if (i2 < 3) {
                                    C35182b.f90462a.storeInt("bubble_guide_for_tt_like_times", i2 + 1);
                                    C11207p a2 = new C11209a().mo20825a(a).mo20824a(1009).mo20826a(C35277o.m79761a(new C33857a(conversationId, R.string.asb))).mo20827a();
                                    C52711k.m112236a((Object) a2, "it");
                                    a2.setMsgStatus(2);
                                    Iterator it = list.iterator();
                                    int i3 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        int i4 = i3 + 1;
                                        if (i3 < 0) {
                                            C52575l.m112100b();
                                        }
                                        C11207p pVar2 = (C11207p) next;
                                        if (!pVar2.isSelf() && TextUtils.equals(singleChatFromUserId, String.valueOf(pVar2.getSender()))) {
                                            C52711k.m112236a((Object) a2, "msg");
                                            list.add(i3, a2);
                                            StringBuilder sb = new StringBuilder("addBubbleTipsMessage add msg ");
                                            sb.append(i3);
                                            sb.append(" for ");
                                            sb.append(a.getConversationId());
                                            C32458a.m75141a(4, "MessageGenerator", sb.toString());
                                            break;
                                        }
                                        i3 = i4;
                                    }
                                } else {
                                    StringBuilder sb2 = new StringBuilder("addBubbleTipsMessage just return for ");
                                    sb2.append(a.getConversationId());
                                    C32458a.m75141a(4, "MessageGenerator", sb2.toString());
                                }
                            } else {
                                StringBuilder sb3 = new StringBuilder("addBubbleTipsMessage not in exper ,just return for ");
                                sb3.append(a.getConversationId());
                                C32458a.m75141a(3, "MessageGenerator", sb3.toString());
                            }
                        }
                    }
                }
                this.f87371p = false;
            }
        }
        if (this.f87360e != null && !this.f87360e.isEmpty()) {
            this.f86483b.addAll(this.f87360e);
        }
        if (m77143m()) {
            m77139a(C11010c.m22280a().getString(R.string.bo3), (Key[]) null, true);
            C35284t a3 = C35284t.m79782a();
            a3.f90620a.edit().putLong("show_privacy_hint_time", System.currentTimeMillis()).commit();
            a3.f90620a.edit().putInt("show_privacy_hint_count", a3.f90620a.getInt("show_privacy_hint_count", 0) + 1).commit();
        }
        this.f87368m.getSingleChatFromUser();
        this.f87363h.mo70906a(this.f86483b);
    }

    /* renamed from: e */
    public final void mo71714e() {
        boolean z;
        C34172b bVar;
        long j;
        C35219ba.m79606a("djjQueryMsg");
        if (this.f86483b != null) {
            this.f86483b.clear();
        }
        boolean z2 = false;
        if (this.f87368m.getChatType() == 3 || !C34004b.m77717a().mo71949f().showNewStyle() || !(this.f87368m.getEnterFrom() == 3 || this.f87368m.getEnterFrom() == 4)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            IMUser singleChatFromUser = this.f87368m.getSingleChatFromUser();
            if (singleChatFromUser != null) {
                C34169a a = C34169a.m77980a();
                String uid = singleChatFromUser.getUid();
                if (a.f88291a.containsKey(uid)) {
                    bVar = (C34172b) a.f88291a.get(uid);
                } else {
                    bVar = null;
                }
                if (!(bVar == null || bVar.getTagCount() == 0)) {
                    C11180b a2 = C11182d.m22641a().mo20658a(this.f87359d.f30222b);
                    if (a2 != null) {
                        C11207p pVar = new C11207p();
                        pVar.setMsgType(14);
                        pVar.setUuid(UUID.randomUUID().toString());
                        C11207p lastMessage = a2.getLastMessage();
                        long j2 = 1;
                        if (lastMessage != null) {
                            j2 = 1 + lastMessage.getOrderIndex();
                        }
                        pVar.setOrderIndex(j2);
                        if (lastMessage != null) {
                            j = lastMessage.getIndex();
                        } else {
                            j = a2.getLastMessageIndex();
                        }
                        pVar.setIndex(j);
                        pVar.setConversationId(a2.getConversationId());
                        VideoUpdateTipsContent videoUpdateTipsContent = new VideoUpdateTipsContent();
                        videoUpdateTipsContent.setUid(bVar.getUid());
                        videoUpdateTipsContent.setCover(bVar.getCoverUrl());
                        videoUpdateTipsContent.setAid(bVar.getLastAid());
                        videoUpdateTipsContent.setPhoto(bVar.isPhoto());
                        int tagCount = bVar.getTagCount();
                        if (tagCount > 1) {
                            videoUpdateTipsContent.setTitle(C11010c.m22280a().getResources().getString(R.string.bp7, new Object[]{C34169a.m77981a(bVar.getTagCount())}));
                        } else if (tagCount == 1) {
                            videoUpdateTipsContent.setTitle(C11010c.m22280a().getResources().getString(R.string.bp8));
                        }
                        if (!TextUtils.isEmpty(bVar.getTitle()) || TextUtils.isEmpty(singleChatFromUser.getNickName())) {
                            videoUpdateTipsContent.setContent(bVar.getTitle());
                        } else {
                            videoUpdateTipsContent.setContent(C11010c.m22280a().getResources().getString(R.string.bpb, new Object[]{singleChatFromUser.getNickName()}));
                        }
                        pVar.setContent(C35277o.m79761a(videoUpdateTipsContent));
                        this.f87381z = pVar;
                        C34169a.m77980a().mo72159b(singleChatFromUser.getUid());
                    }
                }
            }
        }
        C11180b a3 = C11182d.m22641a().mo20658a(this.f87368m.getConversationId());
        if (a3 != null && a3.getUnreadCount() > 0) {
            z2 = true;
        }
        this.f87379x = z2;
        C11213r rVar = this.f87359d;
        C11500m.m23559a();
        if (!rVar.f30227g) {
            rVar.f30227g = true;
            C11457e.m23434a(new C11456d<List<C11207p>>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public List<C11207p> mo20683a() {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C11319r.m23086a();
                    List<C11207p> a = C11319r.m23087a(C11213r.this.f30222b, C11213r.this.f30223c, (int[]) null);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                        C11176d.m22637a("im_init_msg_duration", jSONObject, (JSONObject) null);
                    } catch (Exception unused) {
                    }
                    C11213r.this.f30221a.clear();
                    C11213r.this.f30221a.addAll(a);
                    return a;
                }
            }, new C11455c<List<C11207p>>() {
                /* renamed from: a */
                public final /* synthetic */ void mo20684a(Object obj) {
                    List list = (List) obj;
                    C11213r.this.f30227g = false;
                    if (list == null || list.size() < C11213r.this.f30223c) {
                        C11409r.m23292a();
                        C11409r.m23299a(C11213r.this.f30222b);
                    }
                    C11213r.this.mo20730c(list);
                }
            });
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo70693a(C33683o oVar) {
        super.mo70693a(oVar);
    }

    /* renamed from: b */
    public final void onViewDetachedFromWindow(C33805c cVar) {
        super.onViewDetachedFromWindow(cVar);
    }

    public /* bridge */ /* synthetic */ void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public /* bridge */ /* synthetic */ void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    /* renamed from: a */
    public final void mo71708a(C33703c cVar) {
        this.f87357B.add(cVar);
    }

    /* renamed from: a */
    public final void mo71704a(int i) {
        this.f87356A = this.f87359d.f30223c;
        this.f87359d.f30223c = i;
        mo71715f();
    }

    /* renamed from: a */
    public final void mo71707a(C33486c cVar) {
        this.f87363h = cVar;
        if (this.f87376u == null) {
            this.f87376u = new C33509j() {
                /* renamed from: c */
                public final void mo70952c() {
                    C33394b.m76552a().mo70779b();
                }

                /* renamed from: b */
                public final void mo70950b() {
                    C33689r.this.f87364i = null;
                    C33689r.this.mo71713b();
                }

                /* renamed from: a */
                public final void mo70947a() {
                    int i;
                    C33849j.m77600e().mo70739c();
                    C33394b a = C33394b.m76552a();
                    C33353ab abVar = C33689r.this.f87368m;
                    C11180b a2 = C11182d.m22641a().mo20658a(abVar.getConversationId());
                    C11207p lastMessage = a2.getLastMessage();
                    long j = 1;
                    if (lastMessage != null) {
                        j = 1 + lastMessage.getOrderIndex();
                    }
                    C11207p a3 = new C11209a().mo20825a(a2).mo20824a(17).mo20826a("FakeVoiceMessage").mo20827a();
                    a3.setOrderIndex(j);
                    a3.setSender(C35265e.m79733d());
                    if (abVar.getChatType() == 3) {
                        i = C11170a.f30116b;
                    } else {
                        i = C11170a.f30115a;
                    }
                    a3.setConversationType(i);
                    a.f86588a = a3;
                    C35197am.m79561b(a3);
                }

                /* renamed from: a */
                public final void mo70948a(C11207p pVar) {
                    C33689r.this.f87364i = pVar;
                    C33689r.this.mo71713b();
                }

                /* renamed from: b */
                public final void mo70951b(C11207p pVar) {
                    C33689r.this.f87365j = pVar;
                    C33849j.m77600e().mo70739c();
                }

                /* renamed from: a */
                public final void mo70949a(File file, long j) {
                    int i = 0;
                    if (file == null || !file.exists() || !file.isFile() || file.length() <= 0) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("tag", "MessageAdapter");
                        String str = "error";
                        if (file == null) {
                            i = 1;
                        } else if (!file.exists()) {
                            i = 2;
                        } else if (!file.isFile()) {
                            i = 3;
                        } else if (file.length() == 0) {
                            i = 4;
                        }
                        hashMap.put(str, String.valueOf(i));
                        C35265e.m79726a("audio_message_send", hashMap);
                        C33394b.m76552a().mo70779b();
                        return;
                    }
                    C33394b a = C33394b.m76552a();
                    String absolutePath = file.getAbsolutePath();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(absolutePath)) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("tag", "AudioMsgSender");
                        C35265e.m79726a("audio_message_send", hashMap2);
                        AudioContent audioContent = new AudioContent();
                        audioContent.setMd5(C9395d.m18571a(absolutePath));
                        audioContent.setDuration(j);
                        audioContent.setSendStartTime(Long.valueOf(currentTimeMillis));
                        a.f86588a.setContent(JSON.toJSONString(audioContent));
                        C11178a aVar = new C11178a();
                        aVar.setMsgUuid(a.f86588a.getUuid());
                        aVar.setLocalPath(absolutePath);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(aVar);
                        a.f86588a.setMsgStatus(0);
                        a.f86588a.setAttachments(arrayList);
                        StringBuilder sb = new StringBuilder();
                        sb.append(audioContent.getSendStartTime());
                        a.f86588a.addLocalExt("send_time", sb.toString());
                        C11207p pVar = a.f86588a;
                        C35197am.m79561b(pVar);
                        a.mo70816a(pVar);
                    }
                }
            };
        }
        C33509j jVar = this.f87376u;
        if (!cVar.f86775e.contains(jVar)) {
            cVar.f86775e.add(jVar);
        }
    }

    public int getItemViewType(int i) {
        return C33888y.valueOf((C11207p) this.f86483b.get(i)).getItemViewType();
    }

    /* renamed from: b */
    private static boolean m77142b(C11207p pVar) {
        if (pVar.isSelf()) {
            return false;
        }
        switch (pVar.getMsgType()) {
            case 14:
            case 1001:
            case BaseNotice.CHECK_PROFILE /*1002*/:
            case 1008:
            case 1009:
                return false;
            default:
                return true;
        }
    }

    public long getItemId(int i) {
        C11207p pVar = (C11207p) this.f86483b.get(i);
        long rowId = pVar.getRowId();
        if (rowId > 0) {
            return rowId;
        }
        long msgId = pVar.getMsgId();
        if (msgId == 0) {
            if (!TextUtils.isEmpty(pVar.getUuid())) {
                msgId = (long) pVar.getUuid().hashCode();
            } else {
                msgId = pVar.getCreatedAt();
            }
        }
        return msgId;
    }

    public C33689r(C33353ab abVar) {
        this.f87368m = abVar;
        this.f86483b = new ArrayList();
        this.f87360e = new ArrayList();
        this.f87377v = new C33351aa(this);
        C52711k.m112240b(this, "storyMessageSetting");
        if (!C34391b.f88756b.contains(this)) {
            C34391b.f88756b.add(this);
        }
        this.f87378w = IMUser.fromUser(BaseUserService.getBaseUserService_Monster().getCurrentUser());
        if (this.f87373r == null) {
            this.f87373r = new OnClickListener() {
                public final void onClick(View view) {
                    Aweme aweme;
                    String str;
                    float height;
                    float f;
                    String str2;
                    View view2 = view;
                    ClickInstrumentation.onClick(view);
                    if (view2.getTag(50331648) == null) {
                        C32458a.m75141a(5, "DmHelper", "when click item ,but no type found ,maybe this is a bug!");
                        return;
                    }
                    int intValue = ((Integer) view2.getTag(50331648)).intValue();
                    StringBuilder sb = new StringBuilder("item click:");
                    sb.append(intValue);
                    C32458a.m75141a(4, "DmHelper", sb.toString());
                    int i = 0;
                    if (intValue == 2 || intValue == 8) {
                        String str3 = (String) view2.getTag(67108864);
                        C11207p pVar = (C11207p) view2.getTag(134217728);
                        if (!TextUtils.isEmpty(str3) && pVar != null) {
                            Bundle bundle = (Bundle) view2.getTag(50331652);
                            long j = 0;
                            View view3 = (View) view2.getTag(50331653);
                            C35461k kVar = null;
                            if (bundle != null) {
                                j = bundle.getLong("position", -1);
                                aweme = (Aweme) bundle.getSerializable("currentAweme");
                            } else {
                                aweme = null;
                            }
                            if (!C34004b.m77717a().mo71949f().getIMSetting().f91154l) {
                                String valueOf = String.valueOf(pVar.getIndex());
                                C34004b.m77717a().mo71949f().setIMAwemeProvider(new C33678m(C33689r.this.f87368m.getConversationId(), pVar, C33689r.this.f86483b));
                                str = valueOf;
                            } else {
                                str = str3;
                            }
                            if (aweme == null || C34004b.m77717a().mo71949f() == null) {
                                C33849j.m77600e().mo70738b();
                                StringBuilder sb2 = new StringBuilder("aweme://aweme/detail/");
                                sb2.append(str);
                                C41311y a = C41311y.m91065a(sb2.toString());
                                a.mo83870a("refer", "chat");
                                a.mo83870a("video_from", "from_chat");
                                C41302w.m91042a().mo83861a(a.mo83871a());
                                return;
                            }
                            C33849j.m77600e();
                            pVar.getUuid();
                            if (C34004b.m77717a().mo71949f() != null) {
                                kVar = C34004b.m77717a().mo71949f().getPlayerProxy();
                            }
                            C34004b.m77717a().mo71949f().setSharePlayer(kVar, Long.valueOf(j));
                            if (kVar != null) {
                                kVar.mo70352a(false);
                            }
                            C34004b.m77717a().mo71949f().setNeedToContinueToPlay(true);
                            C23324d.m57378a().updateAweme(aweme);
                            Bundle bundle2 = new Bundle();
                            bundle2.putBoolean("key_from_chat_room_playing", true);
                            bundle2.putString("key_from_chat_room_real_aid", str3);
                            C33849j.m77600e();
                            C34004b.m77717a().mo71949f().enterDetailActivity(view.getContext(), str, "chat", "from_chat", aweme.getEnterpriseType(), 7000, "", view3, bundle2);
                            C33849j e = C33849j.m77600e();
                            pVar.getUuid();
                            C33464h.m76693a(new C33871m(e), 200);
                        }
                    } else if (intValue == 3) {
                        String str4 = (String) view2.getTag(67108864);
                        if (!TextUtils.isEmpty(str4)) {
                            if (C33689r.this.f87368m == null || !C33689r.this.f87368m.isAuthorSupporterChat() || C33453a.m76682e()) {
                                C34030j.f87981c.mo71978c(str4);
                                C33849j.m77600e().mo70738b();
                                C35233bh.m79635a(str4);
                                C35190af.m79442a();
                                C35190af.m79466a(str4, "", "pair", "click_head");
                                C35190af.m79442a();
                                C35190af.m79485b(str4, "chat", "click_head");
                            }
                        }
                    } else if (intValue == 4) {
                        ShareAwemeContent shareAwemeContent = (ShareAwemeContent) view2.getTag(100663296);
                        if (shareAwemeContent != null && !TextUtils.isEmpty(shareAwemeContent.getUser())) {
                            C35190af.m79442a();
                            C35190af.m79466a(shareAwemeContent.getUser(), shareAwemeContent.getItemId(), "others", "click_head");
                            C35190af.m79442a();
                            C35190af.m79485b(shareAwemeContent.getUser(), "chat", "click_head");
                            C35233bh.f90533a.mo73336a(shareAwemeContent.getUser(), shareAwemeContent.getSecUid());
                            C33849j.m77600e().mo70738b();
                        }
                    } else if (intValue == 5) {
                        C11207p pVar2 = (C11207p) view2.getTag(67108864);
                        if (pVar2 != null) {
                            C18842a.m45932a(new C33699a(pVar2));
                        }
                    } else if (intValue == 6) {
                        C11207p pVar3 = (C11207p) view2.getTag(67108864);
                        if (pVar3 != null && pVar3.isSelf()) {
                            if (C33689r.this.f87368m.getChatType() != 3) {
                                IMUser singleChatFromUser = C33689r.this.f87368m.getSingleChatFromUser();
                                if (pVar3.getMsgType() == 2 && (singleChatFromUser == null || singleChatFromUser.getFollowStatus() != 2)) {
                                    C9432q.m18672a(view.getContext(), (int) R.string.blm);
                                    return;
                                } else if (pVar3.getMsgType() == 30 && (singleChatFromUser == null || singleChatFromUser.getFollowStatus() != 2)) {
                                    C9432q.m18672a(view.getContext(), (int) R.string.bln);
                                    return;
                                }
                            }
                            C35270j.m79749a(view.getContext(), R.string.bjl, R.string.bf_, R.string.bml, new C33708t(this, pVar3));
                        }
                    } else if (intValue == 9 || intValue == 26 || intValue == 27) {
                        C11207p pVar4 = (C11207p) view2.getTag(67108864);
                        if (pVar4 != null) {
                            int[] iArr = new int[2];
                            view2.getLocationOnScreen(iArr);
                            BaseContent baseContent = (BaseContent) view2.getTag(100663296);
                            if (baseContent instanceof OnlyPictureContent) {
                                OnlyPictureContent onlyPictureContent = (OnlyPictureContent) baseContent;
                                if (onlyPictureContent.getWidth() == 0 || onlyPictureContent.getHeight() == 0) {
                                    height = ((float) view.getHeight()) / ((float) view.getWidth());
                                } else {
                                    height = ((float) onlyPictureContent.getHeight()) / ((float) onlyPictureContent.getWidth());
                                }
                            } else if (baseContent instanceof StoryPictureContent) {
                                StoryPictureContent storyPictureContent = (StoryPictureContent) baseContent;
                                if (storyPictureContent.getWidth() == 0 || storyPictureContent.getHeight() == 0) {
                                    height = ((float) view.getHeight()) / ((float) view.getWidth());
                                } else {
                                    height = ((float) storyPictureContent.getHeight()) / ((float) storyPictureContent.getWidth());
                                }
                            } else {
                                height = ((float) view.getHeight()) / ((float) view.getWidth());
                            }
                            IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], view.getHeight(), view.getWidth(), (float) view.getResources().getDimensionPixelSize(R.dimen.in), height);
                            if (!C35279p.m79763a()) {
                                C33689r.this.mo71706a(view.getContext(), pVar4, iViewInfo);
                            } else if (intValue == 26) {
                                PhotoDetailActivity.m77056a(view.getContext(), pVar4, 1, iViewInfo);
                            } else if (intValue == 27) {
                                PhotoDetailActivity.m77056a(view.getContext(), pVar4, 2, iViewInfo);
                            } else {
                                PhotoDetailActivity.m77056a(view.getContext(), pVar4, 0, iViewInfo);
                            }
                        }
                    } else if (intValue == 11) {
                        Object tag = view2.getTag(100663296);
                        if (tag instanceof VideoUpdateTipsContent) {
                            VideoUpdateTipsContent videoUpdateTipsContent = (VideoUpdateTipsContent) tag;
                            String uid = videoUpdateTipsContent.getUid();
                            String aid = videoUpdateTipsContent.getAid();
                            if (!TextUtils.isEmpty(uid) && !TextUtils.isEmpty(aid)) {
                                C41302w a2 = C41302w.m91042a();
                                Activity g = C11016e.m22312g();
                                StringBuilder sb3 = new StringBuilder("aweme://aweme/detail/");
                                sb3.append(aid);
                                a2.mo83858a(g, C41311y.m91065a(sb3.toString()).mo83870a("video_from", "from_profile_other").mo83868a("video_type", 0).mo83870a("userid", uid).mo83870a("refer", "update_tips").mo83871a());
                            }
                        }
                    } else if (intValue == 12) {
                        String str5 = (String) view2.getTag(67108864);
                        if (!TextUtils.isEmpty(str5)) {
                            C41302w a3 = C41302w.m91042a();
                            StringBuilder sb4 = new StringBuilder("aweme://aweme/detail/");
                            sb4.append(str5);
                            a3.mo83861a(C41311y.m91065a(sb4.toString()).mo83870a("refer", "chat").mo83870a("enter_method", "click_token").mo83870a("previous_page", "token").mo83870a("video_from", "from_chat").mo83871a());
                        }
                    } else if (intValue == 14) {
                        CommentContent commentContent = (CommentContent) view2.getTag(100663296);
                        if (commentContent != null) {
                            C41302w a4 = C41302w.m91042a();
                            Activity activity = (Activity) view.getContext();
                            StringBuilder sb5 = new StringBuilder("aweme://aweme/detail/");
                            sb5.append(commentContent.getAwemeId());
                            a4.mo83858a(activity, C41311y.m91065a(sb5.toString()).mo83870a("refer", "chat").mo83870a("video_from", "from_chat").mo83870a("cid", commentContent.getCommentId()).mo83871a());
                        }
                    } else if (intValue == 13) {
                        final C11207p pVar5 = (C11207p) view2.getTag(67108864);
                        if (pVar5 != null) {
                            SayHelloContent sayHelloContent = (SayHelloContent) C35277o.m79760a(pVar5.getContent(), SayHelloContent.class);
                            if (sayHelloContent != null) {
                                Object tag2 = view2.getTag(83886080);
                                final IMUser singleChatFromUser2 = C33689r.this.f87368m.getSingleChatFromUser();
                                if (singleChatFromUser2 != null) {
                                    if (tag2 == null) {
                                        C35190af.m79442a();
                                        C35190af.m79471a(singleChatFromUser2.getUid(), C33689r.this.f87368m.getConversationId(), sayHelloContent.getEmoji(), true);
                                        C11213r.m22771c(pVar5);
                                        C33689r.this.mo71713b();
                                    } else {
                                        final int intValue2 = ((Integer) tag2).intValue();
                                        final List emoji = sayHelloContent.getEmoji();
                                        if (emoji != null && intValue2 < emoji.size()) {
                                            Context context = view.getContext();
                                            C336911 r0 = new C33242d() {
                                                public final void sendMsg() {
                                                    C29366a aVar = (C29366a) emoji.get(intValue2);
                                                    String uid = singleChatFromUser2.getUid();
                                                    C11213r.m22771c(pVar5);
                                                    C35237bj.m79649a().mo73340a(uid, (BaseContent) EmojiContent.obtain(aVar));
                                                    C35190af.m79442a();
                                                    C35190af.m79492c(C33689r.this.f87368m.getConversationId(), uid, String.valueOf(aVar.getId()));
                                                }
                                            };
                                            new C33220b(context, r0).sendMsg();
                                        }
                                    }
                                }
                            }
                        }
                    } else if (intValue == 19) {
                        C11207p pVar6 = (C11207p) view2.getTag(67108864);
                        if (pVar6 != null) {
                            C33689r.this.f87365j = pVar6;
                            C33689r.this.f87363h.f86772b.mo70924a(pVar6);
                        }
                    } else if (intValue == 15) {
                        ShareRankingListContent shareRankingListContent = (ShareRankingListContent) view2.getTag(100663296);
                        int type = shareRankingListContent.getType();
                        if (type != 1801) {
                            if (type == 1802) {
                                i = 1;
                            } else if (type == 1803) {
                                i = 2;
                            } else if (type == 2301) {
                                i = 3;
                            }
                        }
                        if (!C34004b.m77717a().mo71949f().getIsHotSearchBillboardEnable()) {
                            C10691a.m21543b(view.getContext(), (int) R.string.e13, 1).mo19066a();
                            return;
                        }
                        C41302w.m91042a().mo83858a((Activity) view.getContext(), C41311y.m91065a("aweme://search/trending").mo83870a("type", String.valueOf(i)).mo83871a());
                        C35190af.m79442a();
                        C35190af.m79450a(shareRankingListContent, C33689r.this.f87368m.getSingleChatFromUserId(), C33689r.this.f87368m.getConversationId(), true);
                    } else if (intValue == 16) {
                        String str6 = (String) view2.getTag(67108864);
                        String str7 = (String) view2.getTag(50331649);
                        StringBuilder sb6 = new StringBuilder("snssdk1128://poi/?id=");
                        sb6.append(str6);
                        sb6.append("&enter_from");
                        sb6.append("=chat");
                        sb6.append("&to_user_id");
                        sb6.append("=");
                        sb6.append(str7);
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb6.toString()));
                        C35190af.m79442a();
                        String conversationId = C33689r.this.f87368m.getConversationId();
                        HashMap hashMap = new HashMap();
                        hashMap.put("poi_id", str6);
                        hashMap.put("to_user_id", str7);
                        hashMap.put("conversation_id", conversationId);
                        C26890h.m65011a("enter_poi_detail", (Map<String, String>) hashMap);
                        view.getContext().startActivity(intent);
                    } else if (intValue == 33) {
                        try {
                            Map map = (Map) view2.getTag(67108864);
                            String str8 = (String) map.get("poi_id");
                            String str9 = (String) map.get("activity_id");
                            String str10 = (String) map.get("coupon_id");
                            String str11 = (String) map.get("uid");
                            boolean equals = "1".equals(map.get("is_self"));
                            if (equals) {
                                str2 = str11;
                            } else {
                                str2 = C35265e.m79730b().toString();
                            }
                            if (equals) {
                                str11 = C35265e.m79730b().toString();
                            }
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("enter_from", "chat");
                            hashMap2.put("from_user_id", str11);
                            hashMap2.put("to_user_id", str2);
                            hashMap2.put("conversation_id", C33689r.this.f87368m.getConversationId());
                            hashMap2.put("poi_id", str8);
                            hashMap2.put("coupon_id", str10);
                            hashMap2.put("activity_id", str9);
                            C26890h.m65011a("click_receive_coupon_inner", (Map<String, String>) hashMap2);
                            StringBuilder sb7 = new StringBuilder("snssdk1128://poi/?id=");
                            sb7.append(str8);
                            sb7.append("&enter_from=chat&to_user_id=");
                            sb7.append(str2);
                            sb7.append("&from_user_id=");
                            sb7.append(str11);
                            sb7.append("&attached_activity_id=");
                            sb7.append(str9);
                            sb7.append("&coupon_id=");
                            sb7.append(str10);
                            sb7.append("&enter_method=click_poi_coupon");
                            view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb7.toString())));
                        } catch (Exception unused) {
                        }
                    } else if (intValue == 17) {
                        Object tag3 = view2.getTag(100663296);
                        if (tag3 instanceof ShareMusicContent) {
                            String uuid = UUID.randomUUID().toString();
                            ShareMusicContent shareMusicContent = (ShareMusicContent) tag3;
                            String musicId = shareMusicContent.getMusicId();
                            if (!TextUtils.isEmpty(musicId)) {
                                C41302w a5 = C41302w.m91042a();
                                Activity g2 = C11016e.m22312g();
                                StringBuilder sb8 = new StringBuilder("aweme://music/detail/");
                                sb8.append(musicId);
                                a5.mo83858a(g2, C41311y.m91065a(sb8.toString()).mo83870a("process_id", uuid).mo83871a());
                            }
                            C35190af.m79442a();
                            String musicId2 = shareMusicContent.getMusicId();
                            String singleChatFromUserId = C33689r.this.f87368m.getSingleChatFromUserId();
                            String conversationId2 = C33689r.this.f87368m.getConversationId();
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("to_user_id", singleChatFromUserId);
                            hashMap3.put("conversation_id", conversationId2);
                            hashMap3.put("enter_from", "chat");
                            hashMap3.put("music_id", musicId2);
                            hashMap3.put("process_id", uuid);
                            C26890h.m65011a("enter_music_detail", (Map<String, String>) hashMap3);
                        }
                    } else if (intValue == 18) {
                        Object tag4 = view2.getTag(67108864);
                        Object tag5 = view2.getTag(50331649);
                        if (tag4 != null && tag5 != null) {
                            String str12 = (String) tag4;
                            boolean booleanValue = ((Boolean) tag5).booleanValue();
                            String uuid2 = UUID.randomUUID().toString();
                            C41302w a6 = C41302w.m91042a();
                            StringBuilder sb9 = new StringBuilder("aweme://challenge/detail/");
                            sb9.append(str12);
                            a6.mo83861a(C41311y.m91065a(sb9.toString()).mo83870a("is_commerce", booleanValue ? "1" : "0").mo83870a("enter_from", "chat").mo83870a("process_id", uuid2).mo83871a());
                            C35190af.m79442a();
                            String singleChatFromUserId2 = C33689r.this.f87368m.getSingleChatFromUserId();
                            String conversationId3 = C33689r.this.f87368m.getConversationId();
                            HashMap hashMap4 = new HashMap();
                            hashMap4.put("to_user_id", singleChatFromUserId2);
                            hashMap4.put("conversation_id", conversationId3);
                            hashMap4.put("enter_from", "chat");
                            hashMap4.put("tag_id", str12);
                            if (C35279p.m79763a()) {
                                hashMap4.put("process_id", uuid2);
                            }
                            C26890h.m65011a("enter_tag_detail", (Map<String, String>) hashMap4);
                        }
                    } else if (intValue == 20) {
                        Object tag6 = view2.getTag(100663296);
                        if (tag6 instanceof ShareMiniAppContent) {
                            ShareMiniAppContent shareMiniAppContent = (ShareMiniAppContent) tag6;
                            C34004b.m77717a().mo71949f().jumpToMiniApp(view.getContext(), shareMiniAppContent.getQuery(), shareMiniAppContent.getAppId(), shareMiniAppContent.isGame(), shareMiniAppContent.getToken(), shareMiniAppContent.getExtraStr());
                        }
                    } else if (intValue == 21) {
                        Object tag7 = view2.getTag(100663296);
                        if (tag7 instanceof ShareUserContent) {
                            ShareUserContent shareUserContent = (ShareUserContent) tag7;
                            C35233bh.f90533a.mo73336a(shareUserContent.getUid(), shareUserContent.getSecUid());
                        }
                    } else if (intValue == 22) {
                        Object tag8 = view2.getTag(100663296);
                        if (tag8 instanceof ShareWebContent) {
                            ShareWebContent shareWebContent = (ShareWebContent) tag8;
                            if (!TextUtils.isEmpty(shareWebContent.getUrl())) {
                                C35204ar.m79584a(view.getContext(), shareWebContent.getUrl());
                                Object tag9 = view2.getTag(50331649);
                                if ((tag9 instanceof Boolean) && ((Boolean) tag9).booleanValue()) {
                                    C35190af.m79504e(view2.getTag(50331650).toString(), view2.getTag(50331650).toString(), "picture");
                                }
                            }
                        }
                    } else if (intValue == 23) {
                        ShareLiveContent shareLiveContent = (ShareLiveContent) view2.getTag(100663296);
                        C11207p pVar7 = (C11207p) view2.getTag(134217728);
                        Bundle bundle3 = new Bundle();
                        if (pVar7 != null) {
                            bundle3.putString("share_user_id", String.valueOf(pVar7.getSender()));
                        }
                        if (shareLiveContent != null) {
                            C34004b.m77717a().mo71949f().jumpToLivePage(view.getContext(), shareLiveContent.getRoomOwnerId(), shareLiveContent.getRoomSecOwnerId(), shareLiveContent.getRoomId(), bundle3);
                        }
                    } else if (intValue == 24) {
                        ShareLiveContent shareLiveContent2 = (ShareLiveContent) view2.getTag(100663296);
                        if (shareLiveContent2 != null) {
                            C35233bh.f90533a.mo73336a(shareLiveContent2.getRoomOwnerId(), shareLiveContent2.getRoomSecOwnerId());
                        }
                    } else if (intValue == 25) {
                        StoryReplyContent storyReplyContent = (StoryReplyContent) view2.getTag(100663296);
                        if (storyReplyContent != null) {
                            if (storyReplyContent.getStoryState()) {
                                C33689r.this.mo71709a(storyReplyContent.getStoryContent().getStoryId(), (C11207p) view2.getTag(67108864), (View) view2.getTag(117440512));
                            } else {
                                C10691a.m21543b(view.getContext(), (int) R.string.boa, 0).mo19066a();
                            }
                        }
                    } else if (intValue == 28 || intValue == 29) {
                        StoryVideoContent storyVideoContent = (StoryVideoContent) view2.getTag(100663296);
                        View view4 = (View) view2.getTag(67108864);
                        C11207p pVar8 = (C11207p) view2.getTag(134217728);
                        if (!(storyVideoContent == null || pVar8 == null || view4 == null)) {
                            C33689r rVar = C33689r.this;
                            if (storyVideoContent != null) {
                                Context context2 = view4.getContext();
                                int[] iArr2 = new int[2];
                                view4.getLocationOnScreen(iArr2);
                                if (storyVideoContent.getHeight() == 0 || storyVideoContent.getWidth() == 0) {
                                    f = ((float) view4.getHeight()) / ((float) view4.getWidth());
                                } else {
                                    f = ((float) storyVideoContent.getHeight()) / ((float) storyVideoContent.getWidth());
                                }
                                IViewInfo iViewInfo2 = new IViewInfo(iArr2[0], iArr2[1], view4.getHeight(), view4.getWidth(), (float) view4.getResources().getDimensionPixelSize(R.dimen.is), f);
                                if (!C35279p.m79763a()) {
                                    rVar.mo71706a(context2, pVar8, iViewInfo2);
                                } else {
                                    Intent intent2 = new Intent(context2, VideoFilePlayerActivity.class);
                                    intent2.putExtra("videoContent", storyVideoContent);
                                    intent2.putExtra("dragViewInfo", iViewInfo2);
                                    intent2.putExtra("localVideo", storyVideoContent.getLocalVideo());
                                    intent2.putExtra("localPoster", storyVideoContent.getLocalPoster());
                                    context2.startActivity(intent2);
                                }
                            }
                        }
                    } else if (intValue == 30) {
                        C11207p pVar9 = (C11207p) view2.getTag(67108864);
                        if (pVar9 != null) {
                            C35243bl.m79701a((Activity) view.getContext(), (Object) C34010e.m77748a().mo71964b(String.valueOf(C11190e.m22685a(pVar9.getConversationId()))), 12);
                        }
                    } else if (intValue == 32) {
                        SelfStoryReplyContent selfStoryReplyContent = (SelfStoryReplyContent) view2.getTag(100663296);
                        if (selfStoryReplyContent != null) {
                            if (selfStoryReplyContent.getStoryState()) {
                                C33689r.this.mo71709a(selfStoryReplyContent.getStoryContent().getStoryId(), (C11207p) view2.getTag(67108864), (View) view2.getTag(117440512));
                            } else {
                                C10691a.m21543b(view.getContext(), (int) R.string.boa, 0).mo19066a();
                            }
                        }
                    } else if (intValue == 34) {
                        ShareGoodContent shareGoodContent = (ShareGoodContent) view2.getTag(67108864);
                        StringBuilder sb10 = new StringBuilder("snssdk1128://goods/seeding/?promotion_id=");
                        sb10.append(shareGoodContent.getPromotionId());
                        sb10.append("&product_id=");
                        sb10.append(shareGoodContent.getProductId());
                        sb10.append("&target_uid=");
                        sb10.append(shareGoodContent.getUserId());
                        sb10.append("&sec_target_uid=");
                        sb10.append(shareGoodContent.getSecUserId());
                        sb10.append("&enter_method=");
                        sb10.append(shareGoodContent.getEnterMethod());
                        view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb10.toString())));
                    } else if (intValue == 35) {
                        ShareGoodWindowContent shareGoodWindowContent = (ShareGoodWindowContent) view2.getTag(67108864);
                        StringBuilder sb11 = new StringBuilder("snssdk1128://goods/shop/?uid=");
                        sb11.append(shareGoodWindowContent.getUserId());
                        sb11.append("&sec_uid=");
                        sb11.append(shareGoodWindowContent.getSecUserId());
                        sb11.append("&entrance_location=");
                        sb11.append(shareGoodWindowContent.getEntranceLocation());
                        view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb11.toString())));
                    } else if (intValue != 36) {
                        if (intValue == 37) {
                            C11207p pVar10 = (C11207p) view2.getTag(67108864);
                            if (pVar10 != null && pVar10.getMsgStatus() != 3) {
                                GroupInviteContent groupInviteContent = (GroupInviteContent) C35277o.m79760a(pVar10.getContent(), GroupInviteContent.class);
                                if (groupInviteContent != null && groupInviteContent.getGroupInviteCardInfo() != null) {
                                    HashMap hashMap5 = new HashMap();
                                    hashMap5.put("conversation_id", C33689r.this.f87368m.getConversationId());
                                    hashMap5.put("from_user_id", String.valueOf(pVar10.getSender()));
                                    C35190af.m79472a("group_chat_click_invite", (Map<String, String>) hashMap5);
                                    C34305b bVar = new C34305b(view.getContext(), groupInviteContent.getGroupInviteCardInfo().getTicket(), 4);
                                    C34280e groupInviteCardInfo = groupInviteContent.getGroupInviteCardInfo();
                                    C52711k.m112240b(groupInviteCardInfo, "groupInviteCardInfo");
                                    bVar.f88582h = groupInviteCardInfo;
                                    bVar.show();
                                }
                            }
                        } else if (intValue == 38) {
                            Object tag10 = view2.getTag(100663296);
                            if (tag10 instanceof ShareCompilationContent) {
                                ShareCompilationContent shareCompilationContent = (ShareCompilationContent) tag10;
                                SmartRouter.buildRoute(view.getContext(), "aweme://mix/detail").withParam("mix_id", shareCompilationContent.getCompilationId()).withParam("event_type", "chat").open();
                                C35190af.m79442a();
                                String compilationId = shareCompilationContent.getCompilationId();
                                String authorId = shareCompilationContent.getAuthorId();
                                HashMap hashMap6 = new HashMap();
                                hashMap6.put("enter_from", "chat");
                                hashMap6.put("enter_method", "chat_click");
                                hashMap6.put("compilation_id", compilationId);
                                hashMap6.put("author_id", authorId);
                                C26890h.m65011a("enter_compilation_detail", (Map<String, String>) hashMap6);
                            }
                        } else if (intValue == 39) {
                            Object tag11 = view2.getTag(100663296);
                            if (tag11 instanceof ShareStickerContent) {
                                ShareStickerContent shareStickerContent = (ShareStickerContent) tag11;
                                SmartRouter.buildRoute(view.getContext(), "aweme://stickers/detail/").withParam("id", shareStickerContent.getStickerId()).open();
                                C35190af.m79442a();
                                String stickerId = shareStickerContent.getStickerId();
                                HashMap hashMap7 = new HashMap();
                                hashMap7.put("enter_from", "chat");
                                hashMap7.put("prop_id", stickerId);
                                C26890h.m65011a("enter_prop_detail", (Map<String, String>) hashMap7);
                            }
                        } else if (intValue == 41) {
                            C11207p pVar11 = (C11207p) view2.getTag(67108864);
                            if (pVar11 != null) {
                                C33689r rVar2 = C33689r.this;
                                rVar2.f87359d.f30221a.remove(pVar11);
                                rVar2.mo71713b();
                                C34004b.m77717a().mo71949f().openNotificationSetting(view.getContext(), C33689r.this.f87368m.getSingleChatFromUserId());
                            }
                        } else if (intValue == 42) {
                            if (C35200an.f90490a.mo73323a(view2)) {
                                C32458a.m75144a("MessageAdapter start chat call failed: double click");
                            } else {
                                C33460f.m76690a(C33689r.this.f87368m.getSingleChatFromUser(), "msg");
                            }
                        } else if (intValue == 43) {
                            if (!C33689r.this.f87367l || C35200an.f90490a.mo73323a(view2)) {
                                StringBuilder sb12 = new StringBuilder("open redPacket double click or view invalid: ");
                                sb12.append(C33689r.this.f87367l);
                                C35459a.m80151c("MessageAdapter", sb12.toString());
                                return;
                            }
                            C34173a a7 = C34002d.m77716a();
                            if (a7 == null) {
                                C35459a.m80151c("MessageAdapter", "open redPacket null redPacketService");
                            } else if (a7.mo72175a((FragmentActivity) view.getContext()).mo72181d()) {
                                C35459a.m80151c("MessageAdapter", "open redPacket loading now");
                            } else {
                                C11207p pVar12 = (C11207p) view2.getTag(134217728);
                                DouYinRedPacketContent douYinRedPacketContent = (DouYinRedPacketContent) view2.getTag(100663296);
                                douYinRedPacketContent.getOrderNo();
                                if (pVar12.isSelf() && !C33689r.this.f87368m.isSingleChat()) {
                                    douYinRedPacketContent.getRedPacketType();
                                }
                            }
                        }
                    }
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo71722a(final C11207p pVar) {
                    if (C33689r.this.f86483b.indexOf(pVar) >= 0 && C33689r.this.f86482a != null) {
                        new C33220b(C33689r.this.f86482a.getContext(), new C33242d() {
                            public final void sendMsg() {
                                pVar.addLocalExt("key_resend", "1");
                                if (pVar.getMsgType() == 2 || pVar.getMsgType() == 27) {
                                    C33440v a = C33440v.m76638a();
                                    C11207p pVar = pVar;
                                    if (pVar.getMsgType() == 2) {
                                        OnlyPictureContent onlyPictureContent = (OnlyPictureContent) C35277o.m79760a(pVar.getContent(), OnlyPictureContent.class);
                                        if (onlyPictureContent.getUrl() != null) {
                                            pVar.setMsgStatus(0);
                                            C35197am.m79563c(pVar);
                                        } else if (onlyPictureContent.isSendRaw() || TextUtils.isEmpty(onlyPictureContent.getCompressPath()) || C9396a.m18583b(onlyPictureContent.getCompressPath()) || C35186ab.m79427a(onlyPictureContent.getPicturePath(), onlyPictureContent.getCompressPath()) != 2) {
                                            pVar.setMsgStatus(0);
                                            C35197am.m79561b(pVar);
                                            a.mo70816a(pVar);
                                        } else {
                                            C10691a.m21543b(C11010c.m22280a(), (int) R.string.bg0, 1).mo19066a();
                                        }
                                    } else if (pVar.getMsgType() == 27) {
                                        StoryPictureContent storyPictureContent = (StoryPictureContent) C35277o.m79760a(pVar.getContent(), StoryPictureContent.class);
                                        if (storyPictureContent.getUrl() != null) {
                                            pVar.setMsgStatus(0);
                                            C35197am.m79563c(pVar);
                                        } else if (storyPictureContent.isSendRaw() || TextUtils.isEmpty(storyPictureContent.getCompressPath()) || C9396a.m18583b(storyPictureContent.getCompressPath()) || C35186ab.m79427a(storyPictureContent.getPicturePath(), storyPictureContent.getCompressPath()) != 2) {
                                            pVar.setMsgStatus(0);
                                            C35197am.m79561b(pVar);
                                            a.mo70816a(pVar);
                                        } else {
                                            C10691a.m21543b(C11010c.m22280a(), (int) R.string.bg0, 1).mo19066a();
                                        }
                                    }
                                } else if (pVar.getMsgType() == 30) {
                                    C33403g gVar = C33403g.f86598a;
                                    C11207p pVar2 = pVar;
                                    C52711k.m112240b(pVar2, "chatMessage");
                                    if (pVar2.getMsgType() == 30) {
                                        StoryVideoContent storyVideoContent = (StoryVideoContent) C35277o.m79760a(pVar2.getContent(), StoryVideoContent.class);
                                        pVar2.setMsgStatus(0);
                                        if (storyVideoContent.getVideo() != null) {
                                            C35197am.m79563c(pVar2);
                                        } else {
                                            C35197am.m79561b(pVar2);
                                            gVar.mo70816a(pVar2);
                                        }
                                    }
                                } else if (pVar.getMsgType() == 17) {
                                    C33394b.m76552a().mo70816a(pVar);
                                } else {
                                    C35197am.m79563c(pVar);
                                }
                            }
                        }).sendMsg();
                    }
                }
            };
        }
        if (this.f87375t == null) {
            this.f87375t = new OnLongClickListener() {

                /* renamed from: a */
                public DmtButton f87390a;

                /* renamed from: b */
                public DmtButton f87391b;

                /* renamed from: c */
                public DmtButton f87392c;

                /* renamed from: d */
                public DmtButton f87393d;

                /* renamed from: e */
                public DmtButton f87394e;

                /* renamed from: f */
                public PopupWindow f87395f;

                /* renamed from: g */
                int f87396g;

                /* renamed from: h */
                public BaseContent f87397h;

                /* renamed from: i */
                public C11207p f87398i;

                /* renamed from: k */
                private OnClickListener f87400k;

                /* renamed from: b */
                private void m77177b() {
                    if (this.f87400k == null) {
                        this.f87400k = new OnClickListener() {
                            public final void onClick(final View view) {
                                ClickInstrumentation.onClick(view);
                                if (!view.equals(C336932.this.f87390a)) {
                                    int i = 1;
                                    if (view.equals(C336932.this.f87393d)) {
                                        int indexOf = C33689r.this.f86483b.indexOf(C336932.this.f87398i);
                                        if (indexOf != -1) {
                                            C35243bl.m79705a(view.getContext(), 1, true, (Runnable) new Runnable(C336932.this.f87398i, indexOf) {

                                                /* renamed from: a */
                                                final /* synthetic */ C11207p f87405a;

                                                /* renamed from: b */
                                                final /* synthetic */ int f87406b;

                                                public final void run() {
                                                    C336932 r0 = C336932.this;
                                                    C11207p pVar = this.f87405a;
                                                    int i = this.f87406b;
                                                    if (r0.f87396g == 1 || r0.f87396g == 2 || r0.f87396g == 9 || r0.f87396g == 8 || r0.f87396g == 10 || r0.f87396g == 14 || r0.f87396g == 11 || r0.f87396g == 19 || r0.f87396g == 16 || r0.f87396g == 17 || r0.f87396g == 18 || r0.f87396g == 15 || r0.f87396g == 20 || r0.f87396g == 21 || r0.f87396g == 22 || r0.f87396g == 23 || r0.f87396g == 26 || r0.f87396g == 27 || r0.f87396g == 25 || r0.f87396g == 28 || r0.f87396g == 29 || r0.f87396g == 30 || r0.f87396g == 31 || r0.f87396g == 32 || r0.f87396g == 33 || r0.f87396g == 34 || r0.f87396g == 35 || r0.f87396g == 36 || r0.f87396g == 37 || r0.f87396g == 38 || r0.f87396g == 39 || r0.f87396g == 42 || r0.f87396g == 43) {
                                                        if (r0.f87396g == 19) {
                                                            C33374a.m76531a().mo70754a(pVar);
                                                        }
                                                        if (TextUtils.isEmpty(pVar.getConversationId())) {
                                                            C18842a.m45932a(new Runnable(pVar, null) {

                                                                /* renamed from: a */
                                                                final /* synthetic */ C11207p f90639a;

                                                                /* renamed from: b */
                                                                final /* synthetic */ C23371a f90640b;

                                                                public final void run() {
                                                                    try {
                                                                        e = C35286u.f90624a.deleteStrangerSingleMsg(this.f90639a.getSender(), C35197am.m79564d(this.f90639a)).get();
                                                                    } catch (InterruptedException | ExecutionException e) {
                                                                        e = e;
                                                                    }
                                                                    if (this.f90640b != null) {
                                                                        C18842a.m45934b(new Runnable() {
                                                                            public final void run() {
                                                                                C353009.this.f90640b.run(e);
                                                                            }
                                                                        });
                                                                    }
                                                                }

                                                                {
                                                                    this.f90639a = r1;
                                                                    this.f90640b = r2;
                                                                }
                                                            });
                                                            String uuid = pVar.getUuid();
                                                            int i2 = 0;
                                                            int size = C33689r.this.f87360e.size();
                                                            while (true) {
                                                                if (i2 >= size) {
                                                                    break;
                                                                } else if (TextUtils.equals(((C11207p) C33689r.this.f87360e.get(i2)).getUuid(), uuid)) {
                                                                    C33689r.this.f87360e.remove(i2);
                                                                    break;
                                                                } else {
                                                                    i2++;
                                                                }
                                                            }
                                                            C33689r.this.mo71713b();
                                                            return;
                                                        }
                                                        C11213r.m22771c(pVar);
                                                    }
                                                }

                                                {
                                                    this.f87405a = r2;
                                                    this.f87406b = r3;
                                                }
                                            });
                                        }
                                    } else if (view.equals(C336932.this.f87394e)) {
                                        if (C29368b.m69241a().mo59395e() >= 79) {
                                            C10691a.m21543b(view.getContext(), (int) R.string.bk8, 1).mo19066a();
                                        } else {
                                            C336932 r11 = C336932.this;
                                            EmojiContent emojiContent = (EmojiContent) C336932.this.f87397h;
                                            long imageId = emojiContent.getImageId();
                                            UrlModel url = emojiContent.getUrl();
                                            String str = "";
                                            String str2 = "";
                                            boolean z = false;
                                            if (url != null) {
                                                str = url.getUri();
                                                str2 = (String) url.getUrlList().get(0);
                                            }
                                            long packageId = emojiContent.getPackageId();
                                            if (r11.f87397h.getType() == 501) {
                                                i = 2;
                                            } else if (r11.f87397h.getType() == 500) {
                                                C29410a a = C29410a.m69356a();
                                                C29358c cVar = new C29358c();
                                                cVar.setId(packageId);
                                                if (a.f77027a != null) {
                                                    z = new ArrayList(a.f77027a.keySet()).contains(cVar);
                                                }
                                                if (!z) {
                                                    i = 10;
                                                }
                                            }
                                            C29368b.m69241a().mo59383a(imageId, str, str2, packageId, i);
                                            C35190af.m79442a();
                                            C26890h.m65011a("add_to_emoji", (Map<String, String>) new HashMap<String,String>());
                                        }
                                    } else if (view.equals(C336932.this.f87391b)) {
                                        C336932 r0 = C336932.this;
                                        Context context = view.getContext();
                                        Bundle bundle = new Bundle();
                                        SharePackage generateSharePackage = r0.f87397h.generateSharePackage();
                                        Bundle bundle2 = generateSharePackage.f106900i;
                                        bundle2.putString("enter_method", "forward");
                                        bundle2.putString("platform", "chat_forward");
                                        bundle.putParcelable("share_package", generateSharePackage);
                                        bundle.putSerializable("share_content", r0.f87397h);
                                        bundle.putLong("forward_origin_msgid", r0.f87398i.getMsgId());
                                        RelationSelectActivity.m78822a(context, bundle, null);
                                    } else if (view.equals(C336932.this.f87392c)) {
                                        if (C33689r.this.f87361f == null) {
                                            C33689r.this.f87361f = new C35403i(view.getContext());
                                            C35403i iVar = C33689r.this.f87361f;
                                            String string = C11010c.m22280a().getString(R.string.bma);
                                            C52711k.m112240b(string, "loadingTxt");
                                            iVar.f90993a.setText(string);
                                        }
                                        C33689r.this.f87361f.show();
                                        C11207p pVar = C336932.this.f87398i;
                                        C336961 r1 = new C11162b<C11207p>() {
                                            /* renamed from: a */
                                            public final /* synthetic */ void mo20506a(Object obj) {
                                                C11207p pVar = (C11207p) obj;
                                                if (C33689r.this.f87361f != null) {
                                                    C33689r.this.f87361f.dismiss();
                                                }
                                                C33689r.this.mo71713b();
                                            }

                                            /* renamed from: a */
                                            public final void mo20508a(C11202k kVar) {
                                                if (C33689r.this.f87361f != null) {
                                                    C33689r.this.f87361f.dismiss();
                                                }
                                                if (C33689r.this.f87362g == null) {
                                                    C33689r.this.f87362g = new C11073c(view.getContext(), -2, -2, 17);
                                                }
                                                C11073c cVar = C33689r.this.f87362g;
                                                String string = C11010c.m22280a().getString(R.string.bm_);
                                                if (!cVar.f29756e) {
                                                    boolean z = false;
                                                    cVar.f29753b.setVisibility(8);
                                                    if (!C9431p.m18664a(string)) {
                                                        cVar.f29754c.setText(string);
                                                        z = true;
                                                    }
                                                    if (z) {
                                                        cVar.f29759h.removeCallbacks(cVar.f29760i);
                                                        cVar.mo20076a();
                                                        try {
                                                            cVar.f29752a.getWindow().setGravity(17);
                                                            if (cVar.f29758g) {
                                                                if (VERSION.SDK_INT >= 16) {
                                                                    cVar.f29752a.getWindow().getDecorView().setSystemUiVisibility(5380);
                                                                } else {
                                                                    cVar.f29752a.getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
                                                                }
                                                            }
                                                            cVar.f29752a.show();
                                                            cVar.f29759h.postDelayed(cVar.f29760i, 2000);
                                                        } catch (Exception unused) {
                                                        }
                                                    }
                                                }
                                            }
                                        };
                                        C11409r.m23292a();
                                        C11409r.m23298a(pVar, (C11162b<C11207p>) r1);
                                        String valueOf = String.valueOf(C11190e.m22685a(C336932.this.f87398i.getConversationId()));
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("enter_from", "chat");
                                        hashMap.put("to_user_id", valueOf);
                                        C26890h.m65011a("recall_message", (Map<String, String>) hashMap);
                                    }
                                } else if (C336932.this.f87397h instanceof TextContent) {
                                    C35201ao.m79579a(view.getContext(), ((TextContent) C336932.this.f87397h).getText());
                                } else if (C336932.this.f87397h instanceof StoryReplyContent) {
                                    C35201ao.m79579a(view.getContext(), ((StoryReplyContent) C336932.this.f87397h).getStoryReplyText());
                                } else if (C336932.this.f87397h instanceof SelfStoryReplyContent) {
                                    C35201ao.m79579a(view.getContext(), ((SelfStoryReplyContent) C336932.this.f87397h).getStoryReplyText());
                                }
                                C336932.this.f87395f.dismiss();
                            }
                        };
                    }
                }

                /* renamed from: a */
                private void m77174a() {
                    m77177b();
                    this.f87390a.setOnClickListener(this.f87400k);
                    this.f87393d.setOnClickListener(this.f87400k);
                    this.f87394e.setOnClickListener(this.f87400k);
                    this.f87391b.setOnClickListener(this.f87400k);
                    this.f87392c.setOnClickListener(this.f87400k);
                }

                /* renamed from: a */
                private void m77175a(View view) {
                    int[] a = C35201ao.m79580a(view, this.f87395f.getContentView());
                    a[0] = a[0] - 20;
                    this.f87395f.setOnDismissListener(new OnDismissListener() {
                        public final void onDismiss() {
                            C336932.this.f87390a.setOnClickListener(null);
                            C336932.this.f87393d.setOnClickListener(null);
                            C336932.this.f87391b.setOnClickListener(null);
                            C336932.this.f87394e.setOnClickListener(null);
                        }
                    });
                    this.f87395f.showAtLocation(view, 8388659, a[0], a[1]);
                }

                /* renamed from: b */
                private void m77178b(View view) {
                    if (this.f87395f == null) {
                        this.f87395f = C35201ao.m79578a(view.getContext(), R.layout.rj, view);
                        View contentView = this.f87395f.getContentView();
                        this.f87390a = (DmtButton) contentView.findViewById(R.id.a0l);
                        this.f87391b = (DmtButton) contentView.findViewById(R.id.cnv);
                        this.f87392c = (DmtButton) contentView.findViewById(R.id.c9m);
                        this.f87393d = (DmtButton) contentView.findViewById(R.id.a4_);
                        this.f87394e = (DmtButton) contentView.findViewById(R.id.v4);
                    }
                    Context context = view.getContext();
                    m77176a(this.f87390a, context.getString(R.string.bg6));
                    m77176a(this.f87391b, context.getString(R.string.bnv));
                    m77176a(this.f87392c, context.getString(R.string.bm9));
                    m77176a(this.f87393d, context.getString(R.string.bgc));
                    m77176a(this.f87394e, context.getString(R.string.bed));
                }

                /* JADX WARNING: Code restructure failed: missing block: B:135:0x01c5, code lost:
                    if (r3 != 39) goto L_0x01c8;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final boolean onLongClick(android.view.View r17) {
                    /*
                        r16 = this;
                        r0 = r16
                        r1 = r17
                        r2 = 50331648(0x3000000, float:3.761582E-37)
                        java.lang.Object r3 = r1.getTag(r2)
                        r4 = 0
                        if (r3 != 0) goto L_0x000e
                        return r4
                    L_0x000e:
                        java.lang.Object r2 = r1.getTag(r2)
                        java.lang.Integer r2 = (java.lang.Integer) r2
                        int r2 = r2.intValue()
                        r0.f87396g = r2
                        r2 = 100663296(0x6000000, float:2.4074124E-35)
                        java.lang.Object r2 = r1.getTag(r2)
                        com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r2 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent) r2
                        r0.f87397h = r2
                        r2 = 134217728(0x8000000, float:3.85186E-34)
                        java.lang.Object r2 = r1.getTag(r2)
                        com.bytedance.im.core.c.p r2 = (com.bytedance.p702im.core.p706c.C11207p) r2
                        r0.f87398i = r2
                        com.bytedance.im.core.c.p r2 = r0.f87398i
                        if (r2 != 0) goto L_0x0033
                        return r4
                    L_0x0033:
                        com.bytedance.im.core.c.p r2 = r0.f87398i
                        boolean r2 = r2.isSelf()
                        com.bytedance.im.core.c.p r3 = r0.f87398i
                        boolean r3 = r3.isRecalled()
                        com.bytedance.im.core.c.p r5 = r0.f87398i
                        int r5 = r5.getMsgStatus()
                        r6 = 5
                        r7 = 2
                        r8 = 1
                        if (r5 == r7) goto L_0x0055
                        com.bytedance.im.core.c.p r5 = r0.f87398i
                        int r5 = r5.getMsgStatus()
                        if (r5 != r6) goto L_0x0053
                        goto L_0x0055
                    L_0x0053:
                        r5 = 0
                        goto L_0x0056
                    L_0x0055:
                        r5 = 1
                    L_0x0056:
                        com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r9 = r0.f87397h
                        boolean r9 = r9 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.TextContent
                        if (r9 == 0) goto L_0x0068
                        com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r9 = r0.f87397h
                        com.ss.android.ugc.aweme.im.sdk.chat.model.TextContent r9 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.TextContent) r9
                        boolean r9 = r9.isDefault()
                        if (r9 == 0) goto L_0x0068
                        r9 = 1
                        goto L_0x0069
                    L_0x0068:
                        r9 = 0
                    L_0x0069:
                        if (r3 == 0) goto L_0x006c
                        return r4
                    L_0x006c:
                        int r3 = r0.f87396g
                        r10 = 10
                        r11 = 8
                        if (r3 == r8) goto L_0x0254
                        int r3 = r0.f87396g
                        r12 = 25
                        if (r3 == r12) goto L_0x0254
                        int r3 = r0.f87396g
                        r12 = 32
                        if (r3 != r12) goto L_0x0082
                        goto L_0x0254
                    L_0x0082:
                        int r3 = r0.f87396g
                        r9 = 16
                        r12 = 43
                        r13 = 15
                        r14 = 42
                        r15 = 11
                        r6 = 19
                        r4 = 9
                        r8 = 31
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        if (r3 == r11) goto L_0x0161
                        int r3 = r0.f87396g
                        if (r3 == r4) goto L_0x0161
                        int r3 = r0.f87396g
                        if (r3 == r10) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 14
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        if (r3 == r15) goto L_0x0161
                        int r3 = r0.f87396g
                        if (r3 == r6) goto L_0x0161
                        int r3 = r0.f87396g
                        if (r3 == r13) goto L_0x0161
                        int r3 = r0.f87396g
                        if (r3 == r9) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 17
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 18
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 20
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 21
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 22
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 23
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 26
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 27
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 28
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 29
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 30
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        if (r3 == r8) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 33
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 34
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 35
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 36
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 37
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 38
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        r7 = 39
                        if (r3 == r7) goto L_0x0161
                        int r3 = r0.f87396g
                        if (r3 == r14) goto L_0x0161
                        int r3 = r0.f87396g
                        if (r3 != r12) goto L_0x0131
                        goto L_0x0161
                    L_0x0131:
                        int r1 = r0.f87396g
                        r2 = 3
                        if (r1 != r2) goto L_0x02a7
                        com.ss.android.ugc.aweme.im.sdk.chat.r r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33689r.this
                        com.ss.android.ugc.aweme.im.sdk.chat.r$b r1 = r1.f87370o
                        if (r1 == 0) goto L_0x02a7
                        com.bytedance.im.core.c.p r1 = r0.f87398i
                        boolean r1 = r1.isSelf()
                        if (r1 != 0) goto L_0x02a7
                        com.ss.android.ugc.aweme.im.sdk.chat.r r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33689r.this
                        com.ss.android.ugc.aweme.im.sdk.chat.ab r1 = r1.f87368m
                        boolean r1 = r1.isGroupChat()
                        if (r1 == 0) goto L_0x02a7
                        com.ss.android.ugc.aweme.im.sdk.chat.r r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33689r.this
                        com.ss.android.ugc.aweme.im.sdk.chat.r$b r1 = r1.f87370o
                        com.bytedance.im.core.c.p r2 = r0.f87398i
                        long r2 = r2.getSender()
                        java.lang.String r2 = java.lang.String.valueOf(r2)
                        r1.mo70668a(r2)
                        r1 = 1
                        return r1
                    L_0x0161:
                        r16.m77178b(r17)
                        int r3 = r0.f87396g
                        if (r3 == r8) goto L_0x016d
                        com.bytedance.ies.dmt.ui.widget.DmtButton r3 = r0.f87390a
                        r3.setVisibility(r11)
                    L_0x016d:
                        int r3 = r0.f87396g
                        if (r3 != r4) goto L_0x017e
                        com.ss.android.ugc.aweme.im.sdk.d.b r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
                        com.ss.android.ugc.aweme.im.service.j r3 = r3.mo71949f()
                        boolean r4 = r3.enableSendPic()
                        goto L_0x01c9
                    L_0x017e:
                        if (r3 != r10) goto L_0x0189
                        com.ss.android.ugc.aweme.im.sdk.providedservices.IImplService r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77718b()
                        boolean r4 = r3.enableSendEmoji()
                        goto L_0x01c9
                    L_0x0189:
                        if (r3 == r6) goto L_0x01c8
                        r4 = 1
                        if (r3 == r4) goto L_0x01c9
                        r6 = 2
                        if (r3 == r6) goto L_0x01c9
                        if (r3 == r11) goto L_0x01c9
                        if (r3 == r9) goto L_0x01c9
                        r6 = 17
                        if (r3 == r6) goto L_0x01c9
                        r6 = 18
                        if (r3 == r6) goto L_0x01c9
                        if (r3 == r13) goto L_0x01c9
                        r6 = 21
                        if (r3 == r6) goto L_0x01c9
                        r6 = 22
                        if (r3 == r6) goto L_0x01c9
                        r6 = 23
                        if (r3 == r6) goto L_0x01c9
                        r6 = 28
                        if (r3 == r6) goto L_0x01c9
                        r6 = 26
                        if (r3 == r6) goto L_0x01c9
                        r6 = 33
                        if (r3 == r6) goto L_0x01c9
                        r6 = 34
                        if (r3 == r6) goto L_0x01c9
                        r6 = 35
                        if (r3 == r6) goto L_0x01c9
                        r6 = 38
                        if (r3 == r6) goto L_0x01c9
                        r6 = 39
                        if (r3 != r6) goto L_0x01c8
                        goto L_0x01c9
                    L_0x01c8:
                        r4 = 0
                    L_0x01c9:
                        if (r4 == 0) goto L_0x01d2
                        com.bytedance.ies.dmt.ui.widget.DmtButton r3 = r0.f87391b
                        r4 = 0
                        r3.setVisibility(r4)
                        goto L_0x01d7
                    L_0x01d2:
                        com.bytedance.ies.dmt.ui.widget.DmtButton r3 = r0.f87391b
                        r3.setVisibility(r11)
                    L_0x01d7:
                        int r3 = r0.f87396g
                        if (r3 != r14) goto L_0x01ea
                        com.bytedance.ies.dmt.ui.widget.DmtButton r3 = r0.f87390a
                        r3.setVisibility(r11)
                        com.bytedance.ies.dmt.ui.widget.DmtButton r3 = r0.f87391b
                        r3.setVisibility(r11)
                        com.bytedance.ies.dmt.ui.widget.DmtButton r3 = r0.f87392c
                        r3.setVisibility(r11)
                    L_0x01ea:
                        int r3 = r0.f87396g
                        if (r3 != r12) goto L_0x01fd
                        com.bytedance.ies.dmt.ui.widget.DmtButton r3 = r0.f87390a
                        r3.setVisibility(r11)
                        com.bytedance.ies.dmt.ui.widget.DmtButton r3 = r0.f87391b
                        r3.setVisibility(r11)
                        com.bytedance.ies.dmt.ui.widget.DmtButton r3 = r0.f87392c
                        r3.setVisibility(r11)
                    L_0x01fd:
                        r3 = 50331649(0x3000001, float:3.7615824E-37)
                        java.lang.Object r3 = r1.getTag(r3)
                        boolean r4 = r3 instanceof java.lang.Boolean
                        if (r4 == 0) goto L_0x0215
                        java.lang.Boolean r3 = (java.lang.Boolean) r3
                        boolean r3 = r3.booleanValue()
                        if (r3 == 0) goto L_0x0215
                        com.bytedance.ies.dmt.ui.widget.DmtButton r3 = r0.f87391b
                        r3.setVisibility(r11)
                    L_0x0215:
                        boolean r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p.m79763a()
                        if (r3 != 0) goto L_0x022d
                        if (r2 == 0) goto L_0x022d
                        if (r5 == 0) goto L_0x022d
                        int r2 = r0.f87396g
                        r3 = 30
                        if (r2 == r3) goto L_0x022d
                        int r2 = r0.f87396g
                        if (r2 == r15) goto L_0x022d
                        int r2 = r0.f87396g
                        if (r2 != r8) goto L_0x0232
                    L_0x022d:
                        com.bytedance.ies.dmt.ui.widget.DmtButton r2 = r0.f87392c
                        r2.setVisibility(r11)
                    L_0x0232:
                        com.ss.android.ugc.aweme.im.sdk.chat.r r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33689r.this
                        com.ss.android.ugc.aweme.im.sdk.chat.ab r2 = r2.f87368m
                        if (r2 == 0) goto L_0x024d
                        com.ss.android.ugc.aweme.im.sdk.chat.r r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33689r.this
                        com.ss.android.ugc.aweme.im.sdk.chat.ab r2 = r2.f87368m
                        boolean r2 = r2.isAuthorSupporterChat()
                        if (r2 == 0) goto L_0x024d
                        com.bytedance.ies.dmt.ui.widget.DmtButton r2 = r0.f87390a
                        com.bytedance.ies.dmt.ui.widget.DmtButton r3 = r0.f87393d
                        com.bytedance.ies.dmt.ui.widget.DmtButton r4 = r0.f87392c
                        com.bytedance.ies.dmt.ui.widget.DmtButton r5 = r0.f87391b
                        com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33453a.m76676a(r2, r3, r4, r5)
                    L_0x024d:
                        r16.m77174a()
                        r16.m77175a(r17)
                        goto L_0x02a7
                    L_0x0254:
                        r16.m77178b(r17)
                        com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r3 = r0.f87397h
                        boolean r3 = r3 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryReplyContent
                        if (r3 != 0) goto L_0x0263
                        com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r3 = r0.f87397h
                        boolean r3 = r3 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SelfStoryReplyContent
                        if (r3 == 0) goto L_0x0270
                    L_0x0263:
                        com.bytedance.ies.dmt.ui.widget.DmtButton r3 = r0.f87390a
                        r4 = 2132545265(0x7f1c0ef1, float:2.0743715E38)
                        r3.setText(r4)
                        com.bytedance.ies.dmt.ui.widget.DmtButton r3 = r0.f87391b
                        r3.setVisibility(r11)
                    L_0x0270:
                        boolean r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p.m79763a()
                        if (r3 != 0) goto L_0x027c
                        if (r2 == 0) goto L_0x027c
                        if (r5 == 0) goto L_0x027c
                        if (r9 == 0) goto L_0x0281
                    L_0x027c:
                        com.bytedance.ies.dmt.ui.widget.DmtButton r2 = r0.f87392c
                        r2.setVisibility(r11)
                    L_0x0281:
                        com.ss.android.ugc.aweme.im.sdk.chat.r r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33689r.this
                        com.ss.android.ugc.aweme.im.sdk.chat.ab r2 = r2.f87368m
                        if (r2 == 0) goto L_0x02a1
                        com.ss.android.ugc.aweme.im.sdk.chat.r r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33689r.this
                        com.ss.android.ugc.aweme.im.sdk.chat.ab r2 = r2.f87368m
                        boolean r2 = r2.isAuthorSupporterChat()
                        if (r2 == 0) goto L_0x02a1
                        com.bytedance.ies.dmt.ui.widget.DmtButton r2 = r0.f87390a
                        com.bytedance.ies.dmt.ui.widget.DmtButton r3 = r0.f87393d
                        com.bytedance.ies.dmt.ui.widget.DmtButton r4 = r0.f87392c
                        com.bytedance.ies.dmt.ui.widget.DmtButton r5 = r0.f87391b
                        boolean r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33453a.m76676a(r2, r3, r4, r5)
                        if (r2 == 0) goto L_0x02a1
                        r2 = 0
                        return r2
                    L_0x02a1:
                        r16.m77174a()
                        r16.m77175a(r17)
                    L_0x02a7:
                        int r1 = r0.f87396g
                        if (r1 != r10) goto L_0x02f2
                        com.bytedance.im.core.c.p r1 = r0.f87398i
                        int r1 = r1.getMsgType()
                        r2 = 5
                        if (r1 != r2) goto L_0x02f2
                        com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = r0.f87397h
                        if (r1 == 0) goto L_0x02ec
                        boolean r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p.m79763a()
                        if (r1 != 0) goto L_0x02ec
                        com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = r0.f87397h
                        com.ss.android.ugc.aweme.im.sdk.chat.model.EmojiContent r1 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EmojiContent) r1
                        com.ss.android.ugc.aweme.emoji.f.a r2 = new com.ss.android.ugc.aweme.emoji.f.a
                        r2.<init>()
                        long r3 = r1.getImageId()
                        r2.setId(r3)
                        com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getUrl()
                        r2.setAnimateUrl(r1)
                        com.ss.android.ugc.aweme.emoji.g.b r1 = com.p683ss.android.ugc.aweme.emoji.p1688g.C29368b.m69241a()
                        boolean r1 = r1.mo59389a(r2)
                        if (r1 == 0) goto L_0x02e5
                        com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r0.f87394e
                        r1.setVisibility(r11)
                        goto L_0x02fb
                    L_0x02e5:
                        com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r0.f87394e
                        r2 = 0
                        r1.setVisibility(r2)
                        goto L_0x02fb
                    L_0x02ec:
                        com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r0.f87394e
                        r1.setVisibility(r11)
                        goto L_0x02fb
                    L_0x02f2:
                        com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r0.f87394e
                        if (r1 == 0) goto L_0x02fb
                        com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r0.f87394e
                        r1.setVisibility(r11)
                    L_0x02fb:
                        com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r0.f87391b
                        if (r1 == 0) goto L_0x030e
                        com.ss.android.ugc.aweme.im.service.IIMService r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices.IMService.inst()
                        boolean r1 = r1.isImReduction()
                        if (r1 == 0) goto L_0x030e
                        com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r0.f87391b
                        r1.setVisibility(r11)
                    L_0x030e:
                        r1 = 0
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33689r.C336932.onLongClick(android.view.View):boolean");
                }

                /* renamed from: a */
                private static void m77176a(DmtButton dmtButton, String str) {
                    dmtButton.setVisibility(0);
                    dmtButton.setText(str);
                }
            };
        }
        if (this.f87368m.getSelectMsgType() == 1 && this.f87374s == null) {
            this.f87374s = new C33704s(this);
        }
    }

    /* renamed from: a */
    private void m77138a(C11207p pVar) {
        if (pVar != null && C33888y.content(pVar) != null && C33888y.content(pVar).getExtContent() != null) {
            int i = 3;
            if (pVar.getMsgType() == 1007) {
                i = 4;
            }
            if (!TextUtils.isEmpty(C33888y.content(pVar).getExtContent().getStrongTips())) {
                Context context = this.f86482a.getContext();
                SystemContent extContent = C33888y.content(pVar).getExtContent();
                StringBuilder sb = new StringBuilder();
                sb.append(pVar.getSender());
                C33358ae.m76519a(context, extContent, sb.toString(), i);
            }
        }
    }

    /* renamed from: b */
    private void m77141b(int i) {
        int i2;
        long j;
        if (this.f87368m.isSingleChat() && C11016e.m22312g() != null && C34004b.m77717a().mo71949f().checkShowPushNotificationGuide(C11016e.m22312g())) {
            boolean z = false;
            if (this.f87368m.getSingleChatFromUser() != null) {
                i2 = this.f87368m.getSingleChatFromUser().getFollowStatus();
            } else {
                i2 = 0;
            }
            if (i2 == 1 || i2 == 2) {
                z = true;
            }
            if (i == 2 && !z) {
                return;
            }
            if (i != 4 || (this.f87379x && z)) {
                C11207p pVar = new C11207p();
                pVar.setMsgType(1005);
                pVar.setUuid(UUID.randomUUID().toString());
                C11180b a = C11182d.m22641a().mo20658a(this.f87368m.getConversationId());
                long j2 = 1;
                if (a != null) {
                    C11207p lastMessage = a.getLastMessage();
                    if (lastMessage != null) {
                        j2 = 1 + lastMessage.getOrderIndex();
                    }
                    pVar.setOrderIndex(j2);
                    if (lastMessage != null) {
                        j = lastMessage.getIndex();
                    } else {
                        j = a.getLastMessageIndex();
                    }
                    pVar.setIndex(j);
                } else {
                    pVar.setOrderIndex(1);
                    pVar.setIndex(1);
                }
                pVar.setConversationId(this.f87368m.getConversationId());
                pVar.setContent(C35277o.m79761a(new TextContent()));
                pVar.setSender(C35265e.m79733d());
                pVar.setCreatedAt(System.currentTimeMillis());
                pVar.setMsgStatus(2);
                this.f87359d.f30221a.add(pVar);
                C34004b.m77717a().mo71949f().showPushNotification(this.f87368m.getSingleChatFromUserId());
                this.f87377v.sendMessage(this.f87377v.obtainMessage(2));
            }
        }
    }

    /* renamed from: a */
    public final int mo71702a(long j) {
        if (this.f86483b == null) {
            return -1;
        }
        int size = this.f86483b.size() - 1;
        if (size < 0) {
            return -1;
        }
        C11207p pVar = (C11207p) this.f86483b.get(size);
        if (pVar != null) {
            if (pVar.getIndex() <= j) {
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    C11207p pVar2 = (C11207p) this.f86483b.get(size);
                    if (m77142b(pVar2) && pVar2.getIndex() > j) {
                        this.f87380y = (C11207p) this.f86483b.get(size);
                        this.f87380y.addLocalExt("show_unread_message_tips", "1");
                        notifyItemChanged(size);
                        break;
                    }
                    size--;
                }
                return size;
            } else if (!this.f87366k) {
                while (true) {
                    if (size < 0) {
                        break;
                    } else if (m77142b((C11207p) this.f86483b.get(size))) {
                        this.f87380y = (C11207p) this.f86483b.get(size);
                        this.f87380y.addLocalExt("show_unread_message_tips", "1");
                        notifyItemChanged(size);
                        break;
                    } else {
                        size--;
                    }
                }
            }
        }
        size = -1;
        return size;
    }

    /* renamed from: a */
    public final int mo71703a(String str) {
        int i = -1;
        if (this.f86483b == null || this.f86483b.isEmpty()) {
            return -1;
        }
        int min = Math.min(this.f86483b.size(), 20);
        int i2 = 0;
        while (true) {
            if (i2 >= min) {
                break;
            } else if (TextUtils.equals(((C11207p) this.f86483b.get(i2)).getUuid(), str)) {
                StringBuilder sb = new StringBuilder("findMsgByMsgUUid get for index:");
                sb.append(i2);
                C32458a.m75141a(4, "MessageAdapter", sb.toString());
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    private void m77140a(ArrayList<DragViewInfo> arrayList, long j) {
        if (this.f86482a != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f86482a.getLayoutManager();
            if (linearLayoutManager != null) {
                int j2 = linearLayoutManager.mo4749j();
                int l = linearLayoutManager.mo4751l();
                if (j2 >= 0 && l < this.f86483b.size()) {
                    while (j2 <= l) {
                        C1352v f = this.f86482a.mo4847f(j2);
                        if (f != null) {
                            View c = ((C33805c) f).mo71804c();
                            C11207p pVar = (C11207p) this.f86483b.get(j2);
                            if (pVar.getIndex() != j) {
                                DragViewInfo dragViewInfo = new DragViewInfo();
                                dragViewInfo.f89367a = pVar.getIndex();
                                int[] iArr = new int[2];
                                c.getLocationOnScreen(iArr);
                                IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], c.getHeight(), c.getWidth(), (((float) c.getHeight()) * 1.0f) / ((float) c.getWidth()));
                                dragViewInfo.f89368b = iViewInfo;
                                ArrayList<DragViewInfo> arrayList2 = arrayList;
                                arrayList.add(dragViewInfo);
                                j2++;
                            }
                        }
                        ArrayList<DragViewInfo> arrayList3 = arrayList;
                        j2++;
                    }
                }
            }
        }
    }

    public /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        String str;
        C33805c cVar = (C33805c) vVar;
        C35219ba.m79606a("onBindViewHolder");
        if (cVar.f87699a == 9) {
            this.f87372q = (C33746ai) cVar;
            this.f87372q.mo71799g();
        } else {
            C11207p pVar = (C11207p) this.f86483b.get(i);
            if (cVar instanceof C33842dd) {
                C33842dd ddVar = (C33842dd) cVar;
                if (this.f87364i == null) {
                    str = null;
                } else {
                    str = this.f87364i.getUuid();
                }
                ddVar.f87802y = str;
            }
            if (i < this.f86483b.size() - 1) {
                cVar.mo71780a(pVar, (C11207p) this.f86483b.get(i + 1), C33888y.content(pVar), i);
            } else {
                cVar.mo71780a(pVar, (C11207p) null, C33888y.content(pVar), i);
            }
            if (pVar.isSelf()) {
                cVar.mo71847a(this.f87378w, pVar, i);
            } else if (this.f87368m.isGroupChat()) {
                cVar.mo71847a(C34010e.m77748a().mo71952a(String.valueOf(pVar.getSender())), pVar, i);
            } else {
                cVar.mo71847a(this.f87368m.getSingleChatFromUser(), pVar, i);
            }
            mo70857a(this.f87378w, this.f87368m, cVar, pVar, i);
            if (this.f87369n == null || this.f87369n.getValue() == null || !((List) this.f87369n.getValue()).contains(pVar)) {
                z = false;
            } else {
                z = true;
            }
            int i2 = 8;
            if (cVar.f87710l == 1) {
                if (cVar.f87705g != null) {
                    cVar.f87705g.setOnClickListener(new C33845f(cVar, pVar));
                    cVar.f87705g.setVisibility(0);
                }
                if (cVar.f87701c != null) {
                    cVar.f87701c.setChecked(z);
                }
                FrameLayout frameLayout = cVar.f87702d;
                if (C33805c.m77464a(pVar)) {
                    i2 = 0;
                }
                C33805c.m77463a((View) frameLayout, i2);
                if (cVar.f87702d != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) cVar.f87702d.getLayoutParams();
                    if (pVar.getConversationType() != C11170a.f30116b || pVar.isSelf()) {
                        marginLayoutParams.topMargin = 0;
                    } else {
                        marginLayoutParams.topMargin = cVar.f87700b;
                    }
                    cVar.f87702d.setLayoutParams(marginLayoutParams);
                }
            } else {
                C33805c.m77463a((View) cVar.f87702d, 8);
                C33805c.m77463a(cVar.f87705g, 8);
            }
        }
        C35219ba.m79607b("onBindViewHolder");
    }

    /* renamed from: a */
    private void m77139a(String str, Key[] keyArr, boolean z) {
        long j;
        long lastMessageIndex;
        C11207p pVar = new C11207p();
        pVar.setMsgType(1);
        pVar.setUuid(UUID.randomUUID().toString());
        C11180b a = C11182d.m22641a().mo20658a(this.f87368m.getConversationId());
        if (a != null) {
            C11207p lastMessage = a.getLastMessage();
            if (lastMessage != null) {
                j = lastMessage.getOrderIndex() + 1;
            } else {
                j = 1;
            }
            pVar.setOrderIndex(j);
            if (lastMessage != null) {
                lastMessageIndex = lastMessage.getIndex();
            } else {
                lastMessageIndex = a.getLastMessageIndex();
            }
            pVar.setIndex(lastMessageIndex + 1);
        } else {
            pVar.setOrderIndex(1);
            pVar.setIndex(1);
        }
        pVar.setConversationId(this.f87368m.getConversationId());
        SystemContent systemContent = new SystemContent();
        systemContent.setTips(str);
        systemContent.setTemplate(keyArr);
        pVar.setContent(C35277o.m79761a(systemContent));
        pVar.setSender(C35265e.m79733d());
        pVar.setCreatedAt(System.currentTimeMillis());
        pVar.setMsgStatus(2);
        C11213r.m22772d(pVar);
    }
}
