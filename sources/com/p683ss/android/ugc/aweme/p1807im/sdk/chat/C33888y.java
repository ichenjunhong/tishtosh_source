package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.text.TextUtils;
import android.view.View;
import com.C2240a;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImMtShareVideoAutoPlayExperiment;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.AudioContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ChatCallContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.CommandShareContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.CommentContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.CommonRedEnvelopeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.DefaultTextExtra;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.DouYinRedPacketContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EPlatformCardContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EmojiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.GroupAnnouncementContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.GroupInviteContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.GroupNoticeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.OnlyPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SayHelloContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SelfStoryReplyContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SetUpGroupInvitePasswordContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareAwemeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareChallengeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareCompilationContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareCouponContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareGoodContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareGoodWindowContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareLiveContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareMiniAppContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareMusicContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SharePictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SharePoiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareRankingListContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareStickerContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareUserContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareWebContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StickerEmojiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryReplyContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SystemContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.TextContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.VideoRedEnvelopeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.VideoRedEnvelopeNewYearContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.VideoUpdateTipsContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33731aa;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33735ab;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33736ac;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33737ad;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33739ae;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33740af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33741ag;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33746ai;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33748aj;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33749ak;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33753am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33763aq;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33764ar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33766as;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33767at;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33775ax;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33776ay;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33777az;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33779ba;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33780bb;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33781bc;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33782bd;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33783be;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33784bf;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33785bg;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33786bh;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33787bi;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33788bj;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33789bk;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33790bl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33791bm;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33792bn;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33793bo;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33794bp;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33795bq;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33796br;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33797bs;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33798bt;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33799bu;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33800bv;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33801bw;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33802bx;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33803by;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33804bz;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33805c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33807ca;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33808cb;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33810cd;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33811ce;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33812cf;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33813cg;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33814ch;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33815ci;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33816cj;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33817ck;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33818cl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33819cm;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33822co;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33823cp;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33824cq;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33826cr;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33827cs;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33828ct;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33829cu;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33833cv;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33834cw;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33835cx;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33836cy;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33837cz;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33839da;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33840db;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33841dc;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33842dd;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33843de;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33847h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33848i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33873o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33874p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33875q;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33876r;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33878s;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33879t;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33880u;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33881v;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33882w;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33883x;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33884y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33885z;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like.C33857a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like.C33865f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35207at;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.y */
public enum C33888y {
    ITEM_SYSTEM_RECEIVE(0) {
        public final int getItemLayoutId() {
            return R.layout.bew;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SystemContent.class;
        }
    },
    ITEM_TEXT_RECEIVE(1) {
        public final int getItemLayoutId() {
            return R.layout.bex;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return TextContent.class;
        }
    },
    ITEM_TEXT_SEND(2) {
        public final int getItemLayoutId() {
            return R.layout.bey;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return TextContent.class;
        }
    },
    ITEM_SHARE_AWEME_RECEIVE(3) {
        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareAwemeContent.class;
        }

        public final int getItemLayoutId() {
            if (C33229c.f86227e.mo70571d() == ImMtShareVideoAutoPlayExperiment.m76318a()) {
                return R.layout.bej;
            }
            return R.layout.bem;
        }
    },
    ITEM_SHARE_AWEME_SEND(4) {
        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareAwemeContent.class;
        }

        public final int getItemLayoutId() {
            if (C33229c.f86227e.mo70571d() == ImMtShareVideoAutoPlayExperiment.m76318a()) {
                return R.layout.bek;
            }
            return R.layout.beo;
        }
    },
    ITEM_SHARE_PICTURE_RECEIVE(5) {
        public final int getItemLayoutId() {
            return R.layout.bej;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePictureContent.class;
        }
    },
    ITEM_SHARE_PICTURE_SEND(6) {
        public final int getItemLayoutId() {
            return R.layout.bek;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePictureContent.class;
        }
    },
    ITEM_ONLY_PICTURE_RECEIVE(10) {
        public final int getItemLayoutId() {
            return R.layout.be4;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return OnlyPictureContent.class;
        }
    },
    ITEM_ONLY_PICTURE_SEND(11) {
        public final int getItemLayoutId() {
            return R.layout.be5;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return OnlyPictureContent.class;
        }
    },
    ITEM_BIG_EMOJI_RECEIVE(12) {
        public final int getItemLayoutId() {
            return R.layout.bdm;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return EmojiContent.class;
        }
    },
    ITEM_BIG_EMOJI_SEND(13) {
        public final int getItemLayoutId() {
            return R.layout.bdn;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return EmojiContent.class;
        }
    },
    ITEM_COMMAND_SHARE_RECEIVE(15) {
        public final int getItemLayoutId() {
            return R.layout.bdq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommandShareContent.class;
        }

        public final BaseContent parse(C11207p pVar) {
            CommandShareContent commandShareContent = (CommandShareContent) C33888y.super.parse(pVar);
            commandShareContent.setSendMsg(false);
            return commandShareContent;
        }
    },
    ITEM_COMMAND_SHARE_SEND(16) {
        public final int getItemLayoutId() {
            return R.layout.bdr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommandShareContent.class;
        }

        public final BaseContent parse(C11207p pVar) {
            CommandShareContent commandShareContent = (CommandShareContent) C33888y.super.parse(pVar);
            commandShareContent.setSendMsg(true);
            return commandShareContent;
        }
    },
    ITEM_COMMENT_RECEIVE(17) {
        public final int getItemLayoutId() {
            return R.layout.bds;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommentContent.class;
        }
    },
    ITEM_COMMENT_SEND(18) {
        public final int getItemLayoutId() {
            return R.layout.bdt;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommentContent.class;
        }
    },
    ITEM_SHARE_POI_MULTI_RECEIVE(24) {
        public final int getItemLayoutId() {
            return R.layout.bec;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePoiContent.class;
        }
    },
    ITEM_SHARE_POI_MULTI_SEND(25) {
        public final int getItemLayoutId() {
            return R.layout.bed;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePoiContent.class;
        }
    },
    ITEM_SHARE_POI_SIMPLE_RECEIVE(26) {
        public final int getItemLayoutId() {
            return R.layout.beg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePoiContent.class;
        }
    },
    ITEM_SHARE_POI_SIMPLE_SEND(27) {
        public final int getItemLayoutId() {
            return R.layout.beh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePoiContent.class;
        }
    },
    ITEM_SHARE_COUPON_RECEIVE(68) {
        public final int getItemLayoutId() {
            return R.layout.beg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareCouponContent.class;
        }
    },
    ITEM_SHARE_COUPON_SEND(69) {
        public final int getItemLayoutId() {
            return R.layout.beh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareCouponContent.class;
        }
    },
    ITEM_LOAD_MORE(9) {
        public final int getItemLayoutId() {
            return R.layout.bdc;
        }

        public final String getMsgHint(BaseContent baseContent) {
            return "";
        }
    },
    ITEM_DEFAULT_RECEIVE(7) {
        public final int getItemLayoutId() {
            return ITEM_TEXT_RECEIVE.getItemLayoutId();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ITEM_TEXT_RECEIVE.getMessageContentClazz();
        }

        public final String getMsgHint(BaseContent baseContent) {
            return C33888y.getDefaultText(false);
        }

        public final BaseContent parse(C11207p pVar) {
            TextContent textContent = new TextContent();
            textContent.setText(C33888y.getDefaultText(false));
            textContent.setDefault(true);
            return textContent;
        }
    },
    ITEM_DEFAULT_SEND(8) {
        public final int getItemLayoutId() {
            return ITEM_TEXT_SEND.getItemLayoutId();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ITEM_TEXT_SEND.getMessageContentClazz();
        }

        public final String getMsgHint(BaseContent baseContent) {
            return C33888y.getDefaultText(true);
        }

        public final BaseContent parse(C11207p pVar) {
            TextContent textContent = new TextContent();
            textContent.setText(C33888y.getDefaultText(true));
            textContent.setDefault(true);
            return textContent;
        }
    },
    ITEM_VIDEO_UPDATE_TIPS(14) {
        public final int getItemLayoutId() {
            return R.layout.bf1;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return VideoUpdateTipsContent.class;
        }
    },
    ITEM_SAY_HELLO(19) {
        public final int getItemLayoutId() {
            return R.layout.be7;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SayHelloContent.class;
        }

        public final BaseContent parse(C11207p pVar) {
            SayHelloContent sayHelloContent = (SayHelloContent) C33888y.super.parse(pVar);
            sayHelloContent.setMsgHint(C2240a.m6772a(C11010c.m22280a().getResources().getString(R.string.bmt), new Object[]{sayHelloContent.getNickname()}));
            return sayHelloContent;
        }
    },
    ITEM_VOICE_RECEIVE(20) {
        public final int getItemLayoutId() {
            return R.layout.bf2;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return AudioContent.class;
        }
    },
    ITEM_VOICE_SEND(21) {
        public final int getItemLayoutId() {
            return R.layout.bf3;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return AudioContent.class;
        }

        public final BaseContent parse(C11207p pVar) {
            if (pVar.getContent().equals("FakeVoiceMessage")) {
                return null;
            }
            return C33888y.super.parse(pVar);
        }
    },
    ITEM_SHARE_RANK_LIST_SEND(23) {
        public final int getItemLayoutId() {
            return R.layout.beh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareRankingListContent.class;
        }
    },
    ITEM_SHARE_RANK_LIST_RECEIVE(22) {
        public final int getItemLayoutId() {
            return R.layout.beg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareRankingListContent.class;
        }
    },
    ITEM_SHARE_MUSIC_MULTI_SEND(29) {
        public final int getItemLayoutId() {
            return R.layout.bed;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMusicContent.class;
        }
    },
    ITEM_SHARE_MUSIC_MULTI_RECEIVE(28) {
        public final int getItemLayoutId() {
            return R.layout.bec;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMusicContent.class;
        }
    },
    ITEM_SHARE_MUSIC_SIMPLE_SEND(31) {
        public final int getItemLayoutId() {
            return R.layout.beh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMusicContent.class;
        }
    },
    ITEM_SHARE_MUSIC_SIMPLE_RECEIVE(30) {
        public final int getItemLayoutId() {
            return R.layout.beg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMusicContent.class;
        }
    },
    ITEM_SHARE_CHALLENGE_MULTI_SEND(33) {
        public final int getItemLayoutId() {
            return R.layout.bed;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareChallengeContent.class;
        }
    },
    ITEM_SHARE_CHALLENGE_MULTI_RECEIVE(32) {
        public final int getItemLayoutId() {
            return R.layout.bec;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareChallengeContent.class;
        }
    },
    ITEM_SHARE_CHALLENGE_SIMPLE_SEND(35) {
        public final int getItemLayoutId() {
            return R.layout.beh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareChallengeContent.class;
        }
    },
    ITEM_SHARE_CHALLENGE_SIMPLE_RECEIVE(34) {
        public final int getItemLayoutId() {
            return R.layout.beg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareChallengeContent.class;
        }
    },
    ITEM_SHARE_MINI_APP_SEND(39) {
        public final int getItemLayoutId() {
            return R.layout.beh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMiniAppContent.class;
        }
    },
    ITEM_SHARE_MINI_APP_RECEIVE(38) {
        public final int getItemLayoutId() {
            return R.layout.beg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMiniAppContent.class;
        }
    },
    ITEM_SHARE_USER_MULTI_SEND(41) {
        public final int getItemLayoutId() {
            return R.layout.bed;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareUserContent.class;
        }
    },
    ITEM_SHARE_USER_MULTI_RECEIVE(40) {
        public final int getItemLayoutId() {
            return R.layout.bec;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareUserContent.class;
        }
    },
    ITEM_SHARE_USER_SIMPLE_SEND(43) {
        public final int getItemLayoutId() {
            return R.layout.beh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareUserContent.class;
        }
    },
    ITEM_SHARE_USER_SIMPLE_RECEIVE(42) {
        public final int getItemLayoutId() {
            return R.layout.beg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareUserContent.class;
        }
    },
    ITEM_SHARE_WEB_SEND(45) {
        public final int getItemLayoutId() {
            return R.layout.beh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareWebContent.class;
        }
    },
    ITEM_SHARE_WEB_RECEIVE(44) {
        public final int getItemLayoutId() {
            return R.layout.beg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareWebContent.class;
        }
    },
    ITEM_SHARE_LIVE_SEND(47) {
        public final int getItemLayoutId() {
            return R.layout.bek;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareLiveContent.class;
        }
    },
    ITEM_SHARE_LIVE_RECEIVE(46) {
        public final int getItemLayoutId() {
            return R.layout.bej;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareLiveContent.class;
        }
    },
    ITEM_STORY_REPLY_SEND(49) {
        public final int getItemLayoutId() {
            return R.layout.bes;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryReplyContent.class;
        }
    },
    ITEM_STORY_REPLY_RECEIVE(48) {
        public final int getItemLayoutId() {
            return R.layout.ber;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryReplyContent.class;
        }
    },
    ITEM_STORY_VIDEO_SEND(51) {
        public final int getItemLayoutId() {
            return R.layout.bev;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryVideoContent.class;
        }
    },
    ITEM_STORY_VIDEO_RECEIVE(50) {
        public final int getItemLayoutId() {
            return R.layout.beu;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryVideoContent.class;
        }
    },
    ITEM_STORY_PICTURE_RECEIVE(52) {
        public final int getItemLayoutId() {
            return R.layout.be4;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryPictureContent.class;
        }
    },
    ITEM_STORY_PICTURE_SEND(53) {
        public final int getItemLayoutId() {
            return R.layout.be5;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryPictureContent.class;
        }
    },
    ITEM_COMMON_RED_ENVELOPE_RECEIVE(54) {
        public final int getItemLayoutId() {
            return R.layout.beg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommonRedEnvelopeContent.class;
        }
    },
    ITEM_COMMON_RED_ENVELOPE_SEND(55) {
        public final int getItemLayoutId() {
            return R.layout.beh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommonRedEnvelopeContent.class;
        }
    },
    ITEM_VIDEO_RED_ENVELOPE_RECEIVE(56) {
        public final int getItemLayoutId() {
            return R.layout.beg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return VideoRedEnvelopeContent.class;
        }
    },
    ITEM_VIDEO_RED_ENVELOPE_SEND(57) {
        public final int getItemLayoutId() {
            return R.layout.beh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return VideoRedEnvelopeContent.class;
        }
    },
    ITEM_VIDEO_RED_ENVELOPE_NEW_YEAR_RECEIVE(58) {
        public final int getItemLayoutId() {
            return R.layout.beg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return VideoRedEnvelopeNewYearContent.class;
        }
    },
    ITEM_VIDEO_RED_ENVELOPE_NEW_YEAR_SEND(59) {
        public final int getItemLayoutId() {
            return R.layout.beh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return VideoRedEnvelopeNewYearContent.class;
        }
    },
    ITEM_XPLAN_DEFAULT_SEND(61) {
        public final int getItemLayoutId() {
            return ITEM_TEXT_SEND.getItemLayoutId();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ITEM_TEXT_SEND.getMessageContentClazz();
        }

        public final String getMsgHint(BaseContent baseContent) {
            return C33888y.getXplanDefaultText(true);
        }

        public final BaseContent parse(C11207p pVar) {
            TextContent textContent = new TextContent();
            textContent.setText(C33888y.getXplanDefaultText(pVar));
            textContent.setDefault(true);
            return textContent;
        }
    },
    ITEM_XPLAN_DEFAULT_RECEIVE(60) {
        public final int getItemLayoutId() {
            return ITEM_TEXT_RECEIVE.getItemLayoutId();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ITEM_TEXT_RECEIVE.getMessageContentClazz();
        }

        public final String getMsgHint(BaseContent baseContent) {
            return C33888y.getXplanDefaultText(false);
        }

        public final BaseContent parse(C11207p pVar) {
            TextContent textContent = new TextContent();
            textContent.setText(C33888y.getXplanDefaultText(pVar));
            textContent.setDefault(true);
            return textContent;
        }
    },
    ITEM_RECALL_SEND(67) {
        public final int getItemLayoutId() {
            return ITEM_TEXT_SEND.getItemLayoutId();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ITEM_TEXT_SEND.getMessageContentClazz();
        }

        public final String getMsgHint(BaseContent baseContent) {
            return C33888y.getRecallText(true);
        }

        public final BaseContent parse(C11207p pVar) {
            TextContent textContent = new TextContent();
            if (C35197am.m79569g(pVar)) {
                textContent.setText(C11010c.m22280a().getResources().getString(R.string.bko));
            } else if (C35197am.m79570h(pVar)) {
                textContent.setText(C11010c.m22280a().getResources().getString(R.string.gwc));
            } else {
                textContent.setText(C33888y.getRecallText(true));
            }
            return textContent;
        }
    },
    ITEM_RECALL_RECEIVE(66) {
        public final int getItemLayoutId() {
            return ITEM_TEXT_RECEIVE.getItemLayoutId();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ITEM_TEXT_RECEIVE.getMessageContentClazz();
        }

        public final String getMsgHint(BaseContent baseContent) {
            return C33888y.getRecallText(false);
        }

        public final BaseContent parse(C11207p pVar) {
            TextContent textContent = new TextContent();
            if (C35197am.m79569g(pVar)) {
                textContent.setText(C11010c.m22280a().getResources().getString(R.string.bko));
            } else if (C35197am.m79570h(pVar)) {
                textContent.setText(C11010c.m22280a().getResources().getString(R.string.gwc));
            } else {
                textContent.setText(C33888y.getRecallText(false));
            }
            return textContent;
        }
    },
    ITEM_XPLAN_STICKER_EMOJI_RECEIVE(62) {
        public final int getItemLayoutId() {
            return R.layout.bdm;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StickerEmojiContent.class;
        }
    },
    ITEM_XPLAN_STICKER_EMOJI_SEND(63) {
        public final int getItemLayoutId() {
            return R.layout.bdn;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StickerEmojiContent.class;
        }
    },
    ITEM_SELF_STORY_REPLY_RECEIVE(64) {
        public final int getItemLayoutId() {
            return R.layout.ber;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SelfStoryReplyContent.class;
        }
    },
    ITEM_SELF_STORY_REPLY_SEND(65) {
        public final int getItemLayoutId() {
            return R.layout.bes;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SelfStoryReplyContent.class;
        }
    },
    ITEM_SHARE_GOOD_RECEIVE(70) {
        public final int getItemLayoutId() {
            return R.layout.beg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareGoodContent.class;
        }
    },
    ITEM_SHARE_GOOD_SEND(71) {
        public final int getItemLayoutId() {
            return R.layout.beh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareGoodContent.class;
        }
    },
    ITEM_SHARE_GOOD_WINDOW_RECEIVE(72) {
        public final int getItemLayoutId() {
            return R.layout.beg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareGoodWindowContent.class;
        }
    },
    ITEM_SHARE_GOOD_WINDOW_SEND(73) {
        public final int getItemLayoutId() {
            return R.layout.beh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareGoodWindowContent.class;
        }
    },
    ITEM_E_PLATFORM_CARD_RECEIVE(74) {
        public final int getItemLayoutId() {
            return R.layout.bdw;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return EPlatformCardContent.class;
        }
    },
    ITEM_E_PLATFORM_CARD_SEND(75) {
        public final int getItemLayoutId() {
            return R.layout.bdx;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return EPlatformCardContent.class;
        }
    },
    ITEM_GROUP_GREET_TIPS(76) {
        public final int getItemLayoutId() {
            return R.layout.bdy;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SayHelloContent.class;
        }

        public final BaseContent parse(C11207p pVar) {
            SayHelloContent sayHelloContent = (SayHelloContent) C33888y.super.parse(pVar);
            StringBuilder sb = new StringBuilder("[");
            sb.append(C11010c.m22280a().getString(R.string.bgu));
            sb.append("]");
            sayHelloContent.setMsgHint(sb.toString());
            return sayHelloContent;
        }
    },
    ITEM_GROUP_INVITE_SEND(78) {
        public final int getItemLayoutId() {
            return R.layout.be2;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return GroupInviteContent.class;
        }
    },
    ITEM_GROUP_INVITE_RECEIVE(77) {
        public final int getItemLayoutId() {
            return R.layout.be1;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return GroupInviteContent.class;
        }
    },
    ITEM_GROUP_NOTICE(79) {
        public final int getItemLayoutId() {
            return R.layout.be3;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return GroupNoticeContent.class;
        }
    },
    ITEM_SHARE_COMPILATION_MULTI_RECEIVE(80) {
        public final int getItemLayoutId() {
            return R.layout.bec;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareCompilationContent.class;
        }
    },
    ITEM_SHARE_COMPILATION_MULTI_SEND(81) {
        public final int getItemLayoutId() {
            return R.layout.bed;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareCompilationContent.class;
        }
    },
    ITEM_SHARE_COMPILATION_SIMPLE_RECEIVE(82) {
        public final int getItemLayoutId() {
            return R.layout.beg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareCompilationContent.class;
        }
    },
    ITEM_SHARE_COMPILATION_SIMPLE_SEND(83) {
        public final int getItemLayoutId() {
            return R.layout.beh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareCompilationContent.class;
        }
    },
    ITEM_SHARE_STICKER_MULTI_RECEIVE(84) {
        public final int getItemLayoutId() {
            return R.layout.bec;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareStickerContent.class;
        }
    },
    ITEM_SHARE_STICKER_MULTI_SEND(85) {
        public final int getItemLayoutId() {
            return R.layout.bed;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareStickerContent.class;
        }
    },
    ITEM_SHARE_STICKER_SIMPLE_RECEIVE(86) {
        public final int getItemLayoutId() {
            return R.layout.beg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareStickerContent.class;
        }
    },
    ITEM_SHARE_STICKER_SIMPLE_SEND(87) {
        public final int getItemLayoutId() {
            return R.layout.beh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareStickerContent.class;
        }
    },
    ITEM_GROUP_ANNOUNCEMENT_RECEIVE(88) {
        public final int getItemLayoutId() {
            return R.layout.bdz;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return GroupAnnouncementContent.class;
        }
    },
    ITEM_GROUP_ANNOUNCEMENT_SEND(89) {
        public final int getItemLayoutId() {
            return R.layout.be0;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return GroupAnnouncementContent.class;
        }
    },
    ITEM_PUSH_NOTIFICATION_GUIDE(90) {
        public final int getItemLayoutId() {
            return R.layout.be6;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return TextContent.class;
        }
    },
    ITEM_NOTICE_DANGER_WARNNING_TOP(91) {
        public final int getItemLayoutId() {
            return R.layout.bez;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SystemContent.class;
        }
    },
    ITEM_CHAT_CALL_RECEIVE(92) {
        public final int getItemLayoutId() {
            return R.layout.bdo;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ChatCallContent.class;
        }
    },
    ITEM_CHAT_CALL_SEND(93) {
        public final int getItemLayoutId() {
            return R.layout.bdp;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ChatCallContent.class;
        }
    },
    ITEM_GROUP_OWNER_SET_UP_INVITE_PASSWORD(94) {
        public final int getItemLayoutId() {
            return R.layout.bdb;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SetUpGroupInvitePasswordContent.class;
        }

        public final BaseContent parse(C11207p pVar) {
            SetUpGroupInvitePasswordContent setUpGroupInvitePasswordContent = (SetUpGroupInvitePasswordContent) C33888y.super.parse(pVar);
            setUpGroupInvitePasswordContent.setMsgHint("为方便查找，记得修改群名哦");
            return setUpGroupInvitePasswordContent;
        }
    },
    ITEM_TT_GUIDE_BUBBLE(95) {
        public final int getItemLayoutId() {
            return R.layout.bf0;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return C33857a.class;
        }
    },
    ITEM_RED_PACKET_SELF(96) {
        public final int getItemLayoutId() {
            return R.layout.bj0;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return DouYinRedPacketContent.class;
        }
    },
    ITEM_RED_PACKET_OTHER(97) {
        public final int getItemLayoutId() {
            return R.layout.biz;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return DouYinRedPacketContent.class;
        }
    };
    

    /* renamed from: b */
    private static final Class<? extends BaseContent> f87887b = null;

    /* renamed from: c */
    private static final int f87888c = 0;

    /* renamed from: d */
    private static final int f87889d = 0;

    /* renamed from: a */
    private int f87891a;

    public int getItemLayoutId() {
        return f87888c;
    }

    public int getItemViewType() {
        return this.f87891a;
    }

    public Class<? extends BaseContent> getMessageContentClazz() {
        return f87887b;
    }

    static {
        f87887b = TextContent.class;
        f87888c = R.layout.bex;
        f87889d = R.layout.bey;
    }

    public static boolean isMineMsg(C11207p pVar) {
        return pVar.isSelf();
    }

    public static BaseContent content(C11207p pVar) {
        return valueOf(pVar).parse(pVar);
    }

    public String getMsgHint(BaseContent baseContent) {
        if (baseContent == null) {
            return "";
        }
        return baseContent.getMsgHint();
    }

    public static String getRecallText(boolean z) {
        if (z) {
            return C11010c.m22280a().getString(R.string.bmc);
        }
        return C11010c.m22280a().getString(R.string.bmb);
    }

    public static String getXplanDefaultText(boolean z) {
        if (C35243bl.m79709a()) {
            return C11010c.m22280a().getString(R.string.bqg);
        }
        return C11010c.m22280a().getString(R.string.bpw);
    }

    public static String getDefaultText(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (z) {
            str = C11010c.m22280a().getString(R.string.bld);
        } else {
            str = C11010c.m22280a().getString(R.string.blc);
        }
        sb.append(str);
        sb.append(" ");
        sb.append(C11010c.m22280a().getString(R.string.bgq));
        return sb.toString();
    }

    public static String getXplanDefaultText(C11207p pVar) {
        if (!C35243bl.m79709a()) {
            return C11010c.m22280a().getString(R.string.bpw);
        }
        if (pVar != null) {
            String str = (String) pVar.getExt().get("a:1128_default_text");
            if (!TextUtils.isEmpty(str)) {
                try {
                    DefaultTextExtra defaultTextExtra = (DefaultTextExtra) C35277o.m79760a(str, DefaultTextExtra.class);
                    if (defaultTextExtra != null && !TextUtils.isEmpty(defaultTextExtra.getTextZh())) {
                        return defaultTextExtra.getTextZh();
                    }
                } catch (Throwable th) {
                    C32458a.m75148a(th);
                }
            }
        }
        return C11010c.m22280a().getString(R.string.bqg);
    }

    public BaseContent parse(C11207p pVar) {
        BaseContent baseContent;
        String content = pVar.getContent();
        try {
            baseContent = (BaseContent) C35277o.m79760a(content, getMessageContentClazz());
        } catch (Exception unused) {
            baseContent = null;
        }
        if (baseContent == null) {
            try {
                StringBuilder sb = new StringBuilder("MessageViewType parse: itemType:");
                sb.append(this.f87891a);
                sb.append(" messageStr:");
                sb.append(pVar.toString());
                C32458a.m75144a(sb.toString());
                StringBuilder sb2 = new StringBuilder("MessageViewType parse: itemType:");
                sb2.append(this.f87891a);
                sb2.append(" contentStr:");
                sb2.append(content);
                C32458a.m75144a(sb2.toString());
                return (BaseContent) getMessageContentClazz().newInstance();
            } catch (IllegalAccessException e) {
                C32458a.m75148a((Throwable) e);
            } catch (InstantiationException e2) {
                C32458a.m75148a((Throwable) e2);
            }
        }
        return baseContent;
    }

    public static C33888y valueOf(int i) {
        switch (i) {
            case 0:
                return ITEM_SYSTEM_RECEIVE;
            case 1:
                return ITEM_TEXT_RECEIVE;
            case 2:
                return ITEM_TEXT_SEND;
            case 3:
                return ITEM_SHARE_AWEME_RECEIVE;
            case 4:
                return ITEM_SHARE_AWEME_SEND;
            case 5:
                return ITEM_SHARE_PICTURE_RECEIVE;
            case 6:
                return ITEM_SHARE_PICTURE_SEND;
            case 7:
                return ITEM_DEFAULT_RECEIVE;
            case 8:
                return ITEM_DEFAULT_SEND;
            case 9:
                return ITEM_LOAD_MORE;
            case 10:
                return ITEM_ONLY_PICTURE_RECEIVE;
            case 11:
                return ITEM_ONLY_PICTURE_SEND;
            case 12:
                return ITEM_BIG_EMOJI_RECEIVE;
            case 13:
                return ITEM_BIG_EMOJI_SEND;
            case 14:
                return ITEM_VIDEO_UPDATE_TIPS;
            case 15:
                return ITEM_COMMAND_SHARE_RECEIVE;
            case 16:
                return ITEM_COMMAND_SHARE_SEND;
            case 17:
                return ITEM_COMMENT_RECEIVE;
            case 18:
                return ITEM_COMMENT_SEND;
            case 19:
                return ITEM_SAY_HELLO;
            case 20:
                return ITEM_VOICE_RECEIVE;
            case 21:
                return ITEM_VOICE_SEND;
            case 22:
                return ITEM_SHARE_RANK_LIST_RECEIVE;
            case 23:
                return ITEM_SHARE_RANK_LIST_SEND;
            case 24:
                return ITEM_SHARE_POI_MULTI_RECEIVE;
            case 25:
                return ITEM_SHARE_POI_MULTI_SEND;
            case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                return ITEM_SHARE_POI_SIMPLE_RECEIVE;
            case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                return ITEM_SHARE_POI_SIMPLE_SEND;
            case 28:
                return ITEM_SHARE_MUSIC_MULTI_RECEIVE;
            case 29:
                return ITEM_SHARE_MUSIC_MULTI_SEND;
            case 30:
                return ITEM_SHARE_MUSIC_SIMPLE_RECEIVE;
            case 31:
                return ITEM_SHARE_MUSIC_SIMPLE_SEND;
            case 32:
                return ITEM_SHARE_CHALLENGE_MULTI_RECEIVE;
            case 33:
                return ITEM_SHARE_CHALLENGE_MULTI_SEND;
            case 34:
                return ITEM_SHARE_CHALLENGE_SIMPLE_RECEIVE;
            case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                return ITEM_SHARE_CHALLENGE_SIMPLE_SEND;
            case 36:
                return ITEM_SHARE_RANK_LIST_RECEIVE;
            case 37:
                return ITEM_SHARE_RANK_LIST_SEND;
            case 38:
                return ITEM_SHARE_MINI_APP_RECEIVE;
            case 39:
                return ITEM_SHARE_MINI_APP_SEND;
            case 40:
                return ITEM_SHARE_USER_MULTI_RECEIVE;
            case BaseNotice.LIKE /*41*/:
                return ITEM_SHARE_USER_MULTI_SEND;
            case 42:
                return ITEM_SHARE_USER_SIMPLE_RECEIVE;
            case 43:
                return ITEM_SHARE_USER_SIMPLE_SEND;
            case 44:
                return ITEM_SHARE_WEB_RECEIVE;
            case BaseNotice.f96882AT /*45*/:
                return ITEM_SHARE_WEB_SEND;
            case 46:
                return ITEM_SHARE_LIVE_RECEIVE;
            case 47:
                return ITEM_SHARE_LIVE_SEND;
            case 48:
                return ITEM_STORY_REPLY_RECEIVE;
            case 49:
                return ITEM_STORY_REPLY_SEND;
            case 50:
                return ITEM_STORY_VIDEO_RECEIVE;
            case 51:
                return ITEM_STORY_VIDEO_SEND;
            case 52:
                return ITEM_STORY_PICTURE_RECEIVE;
            case 53:
                return ITEM_STORY_PICTURE_SEND;
            case 54:
                return ITEM_COMMON_RED_ENVELOPE_RECEIVE;
            case 55:
                return ITEM_COMMON_RED_ENVELOPE_SEND;
            case 56:
                return ITEM_VIDEO_RED_ENVELOPE_RECEIVE;
            case 57:
                return ITEM_VIDEO_RED_ENVELOPE_SEND;
            case 58:
                return ITEM_VIDEO_RED_ENVELOPE_NEW_YEAR_RECEIVE;
            case 59:
                return ITEM_VIDEO_RED_ENVELOPE_NEW_YEAR_SEND;
            case 60:
                return ITEM_XPLAN_DEFAULT_RECEIVE;
            case BaseNotice.TCM /*61*/:
                return ITEM_XPLAN_DEFAULT_SEND;
            case BaseNotice.CREATOR /*62*/:
                return ITEM_XPLAN_STICKER_EMOJI_RECEIVE;
            case 63:
                return ITEM_XPLAN_STICKER_EMOJI_SEND;
            case UnReadVideoExperiment.RELATION_LIST /*64*/:
                return ITEM_SELF_STORY_REPLY_RECEIVE;
            case 65:
                return ITEM_SELF_STORY_REPLY_SEND;
            case 66:
                return ITEM_RECALL_RECEIVE;
            case 67:
                return ITEM_RECALL_SEND;
            case 68:
                return ITEM_SHARE_COUPON_RECEIVE;
            case BaseNotice.DONATION /*69*/:
                return ITEM_SHARE_COUPON_SEND;
            case 70:
                return ITEM_SHARE_GOOD_RECEIVE;
            case 71:
                return ITEM_SHARE_GOOD_SEND;
            case 72:
                return ITEM_SHARE_GOOD_WINDOW_RECEIVE;
            case 73:
                return ITEM_SHARE_GOOD_WINDOW_SEND;
            case 74:
                return ITEM_E_PLATFORM_CARD_RECEIVE;
            case 75:
                return ITEM_E_PLATFORM_CARD_SEND;
            case 76:
                return ITEM_GROUP_GREET_TIPS;
            case 77:
                return ITEM_GROUP_INVITE_RECEIVE;
            case 78:
                return ITEM_GROUP_INVITE_SEND;
            case 79:
                return ITEM_GROUP_NOTICE;
            case 80:
                return ITEM_SHARE_COMPILATION_MULTI_RECEIVE;
            case 81:
                return ITEM_SHARE_COMPILATION_MULTI_SEND;
            case 82:
                return ITEM_SHARE_COMPILATION_SIMPLE_RECEIVE;
            case 83:
                return ITEM_SHARE_COMPILATION_SIMPLE_SEND;
            case 84:
                return ITEM_SHARE_STICKER_MULTI_RECEIVE;
            case 85:
                return ITEM_SHARE_STICKER_MULTI_SEND;
            case 86:
                return ITEM_SHARE_STICKER_SIMPLE_RECEIVE;
            case 87:
                return ITEM_SHARE_STICKER_SIMPLE_SEND;
            case 88:
                return ITEM_GROUP_ANNOUNCEMENT_RECEIVE;
            case 89:
                return ITEM_GROUP_ANNOUNCEMENT_SEND;
            case 90:
                return ITEM_PUSH_NOTIFICATION_GUIDE;
            case 91:
                return ITEM_NOTICE_DANGER_WARNNING_TOP;
            case 92:
                return ITEM_CHAT_CALL_RECEIVE;
            case 93:
                return ITEM_CHAT_CALL_SEND;
            case 94:
                return ITEM_GROUP_OWNER_SET_UP_INVITE_PASSWORD;
            case 95:
                return ITEM_TT_GUIDE_BUBBLE;
            case 96:
                return ITEM_RED_PACKET_SELF;
            case 97:
                return ITEM_RED_PACKET_OTHER;
            default:
                return ITEM_DEFAULT_RECEIVE;
        }
    }

    public C33805c getViewHolder(View view) {
        int itemViewType = getItemViewType();
        switch (itemViewType) {
            case 0:
                return new C33833cv(view, itemViewType);
            case 1:
                return new C33835cx(view, itemViewType);
            case 2:
                return new C33834cw(view, itemViewType);
            case 3:
                if (C35207at.m79589a()) {
                    return new C33767at(view, itemViewType, C35207at.m79590b());
                }
                return new C33775ax(view, itemViewType);
            case 4:
                if (C35207at.m79589a()) {
                    return new C33776ay(view, itemViewType, C35207at.m79590b());
                }
                return new C33777az(view, itemViewType);
            case 5:
                return new C33775ax(view, itemViewType);
            case 6:
                return new C33777az(view, itemViewType);
            case 7:
                return new C33835cx(view, itemViewType);
            case 8:
                return new C33834cw(view, itemViewType);
            case 9:
                return new C33746ai(view, itemViewType);
            case 10:
                return new C33749ak(view, itemViewType);
            case 11:
                return new C33748aj(view, itemViewType);
            case 12:
                return new C33885z(view, itemViewType);
            case 13:
                return new C33884y(view, itemViewType);
            case 14:
                return new C33841dc(view, itemViewType);
            case 15:
                return new C33874p(view, itemViewType);
            case 16:
                return new C33873o(view, itemViewType);
            case 17:
                return new C33876r(view, itemViewType);
            case 18:
                return new C33875q(view, itemViewType);
            case 19:
                return new C33763aq(view, itemViewType);
            case 20:
                return new C33842dd(view, itemViewType);
            case 21:
                return new C33843de(view, itemViewType);
            case 22:
                return new C33808cb(view, itemViewType);
            case 23:
                return new C33807ca(view, itemViewType);
            case 24:
                return new C33804bz(view, itemViewType);
            case 25:
                return new C33801bw(view, itemViewType);
            case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                return new C33803by(view, itemViewType);
            case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                return new C33802bx(view, itemViewType);
            case 28:
                return new C33797bs(view, itemViewType);
            case 29:
                return new C33798bt(view, itemViewType);
            case 30:
                return new C33799bu(view, itemViewType);
            case 31:
                return new C33800bv(view, itemViewType);
            case 32:
                return new C33782bd(view, itemViewType);
            case 33:
                return new C33779ba(view, itemViewType);
            case 34:
                return new C33781bc(view, itemViewType);
            case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                return new C33780bb(view, itemViewType);
            case 36:
                return new C33808cb(view, itemViewType);
            case 37:
                return new C33807ca(view, itemViewType);
            case 38:
                return new C33796br(view, itemViewType);
            case 39:
                return new C33795bq(view, itemViewType);
            case 40:
                return new C33814ch(view, itemViewType);
            case BaseNotice.LIKE /*41*/:
                return new C33815ci(view, itemViewType);
            case 42:
                return new C33816cj(view, itemViewType);
            case 43:
                return new C33817ck(view, itemViewType);
            case 44:
                return new C33818cl(view, itemViewType);
            case BaseNotice.f96882AT /*45*/:
                return new C33819cm(view, itemViewType);
            case 46:
                return new C33793bo(view, itemViewType);
            case 47:
                return new C33794bp(view, itemViewType);
            case 48:
                return new C33824cq(view, itemViewType);
            case 49:
                return new C33826cr(view, itemViewType);
            case 50:
                return new C33827cs(view, itemViewType);
            case 51:
                return new C33828ct(view, itemViewType);
            case 52:
                return new C33823cp(view, itemViewType);
            case 53:
                return new C33822co(view, itemViewType);
            case 54:
                return new C33878s(view, itemViewType);
            case 55:
                return new C33879t(view, itemViewType);
            case 56:
                return new C33836cy(view, itemViewType);
            case 57:
                return new C33840db(view, itemViewType);
            case 58:
                return new C33837cz(view, itemViewType);
            case 59:
                return new C33839da(view, itemViewType);
            case 60:
                return new C33835cx(view, itemViewType);
            case BaseNotice.TCM /*61*/:
                return new C33834cw(view, itemViewType);
            case BaseNotice.CREATOR /*62*/:
                return new C33885z(view, itemViewType);
            case 63:
                return new C33884y(view, itemViewType);
            case UnReadVideoExperiment.RELATION_LIST /*64*/:
                return new C33764ar(view, itemViewType);
            case 65:
                return new C33766as(view, itemViewType);
            case 68:
                return new C33788bj(view, itemViewType);
            case BaseNotice.DONATION /*69*/:
                return new C33787bi(view, itemViewType);
            case 70:
                return new C33790bl(view, itemViewType);
            case 71:
                return new C33789bk(view, itemViewType);
            case 72:
                return new C33792bn(view, itemViewType);
            case 73:
                return new C33791bm(view, itemViewType);
            case 74:
                return new C33882w(view, itemViewType);
            case 75:
                return new C33883x(view, itemViewType);
            case 76:
                return new C33731aa(view, itemViewType);
            case 77:
                return new C33739ae(view, itemViewType);
            case 78:
                return new C33737ad(view, itemViewType);
            case 79:
                return new C33740af(view, itemViewType);
            case 80:
                return new C33786bh(view, itemViewType);
            case 81:
                return new C33783be(view, itemViewType);
            case 82:
                return new C33785bg(view, itemViewType);
            case 83:
                return new C33784bf(view, itemViewType);
            case 84:
                return new C33813cg(view, itemViewType);
            case 85:
                return new C33810cd(view, itemViewType);
            case 86:
                return new C33812cf(view, itemViewType);
            case 87:
                return new C33811ce(view, itemViewType);
            case 88:
                return new C33736ac(view, itemViewType);
            case 89:
                return new C33735ab(view, itemViewType);
            case 90:
                return new C33753am(view, itemViewType);
            case 91:
                return new C33829cu(view, itemViewType);
            case 92:
                return new C33848i(view, itemViewType);
            case 93:
                return new C33847h(view, itemViewType);
            case 94:
                return new C33741ag(view, itemViewType);
            case 95:
                return new C33865f(view, itemViewType);
            case 96:
                return new C33881v(view, itemViewType);
            case 97:
                return new C33880u(view, itemViewType);
            default:
                return new C33835cx(view, itemViewType);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x023c, code lost:
        if (isMineMsg(r6) != false) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x023e, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0241, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0263, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x03d1, code lost:
        if (isMineMsg(r6) != false) goto L_0x03d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x03d7, code lost:
        r6 = 34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0410, code lost:
        if (isMineMsg(r6) != false) goto L_0x03d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x046d, code lost:
        if (isMineMsg(r6) != false) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0148, code lost:
        if (isMineMsg(r6) == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x014a, code lost:
        r6 = 93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x014e, code lost:
        r6 = 92;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y valueOf(com.bytedance.p702im.core.p706c.C11207p r6) {
        /*
            boolean r0 = r6.isRecalled()
            if (r0 == 0) goto L_0x0016
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x000f
            r6 = 67
            goto L_0x0011
        L_0x000f:
            r6 = 66
        L_0x0011:
            com.ss.android.ugc.aweme.im.sdk.chat.y r6 = valueOf(r6)
            return r6
        L_0x0016:
            java.lang.String r0 = r6.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 7
            r2 = 8
            if (r0 == 0) goto L_0x0030
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x002b
            r1 = 8
        L_0x002b:
            com.ss.android.ugc.aweme.im.sdk.chat.y r6 = valueOf(r1)
            return r6
        L_0x0030:
            int r0 = r6.getMsgType()
            switch(r0) {
                case 1: goto L_0x047d;
                case 2: goto L_0x0471;
                default: goto L_0x0037;
            }
        L_0x0037:
            r3 = 1
            r4 = 2
            r5 = 3
            switch(r0) {
                case 7: goto L_0x0469;
                case 8: goto L_0x045e;
                case 9: goto L_0x0459;
                default: goto L_0x003d;
            }
        L_0x003d:
            switch(r0) {
                case 12: goto L_0x044f;
                case 13: goto L_0x0443;
                case 14: goto L_0x043e;
                case 15: goto L_0x0439;
                case 16: goto L_0x042d;
                case 17: goto L_0x0421;
                case 18: goto L_0x0413;
                case 19: goto L_0x03bf;
                case 20: goto L_0x0368;
                case 21: goto L_0x035a;
                case 22: goto L_0x0303;
                case 23: goto L_0x02f5;
                case 24: goto L_0x02e7;
                case 25: goto L_0x0290;
                case 26: goto L_0x0282;
                case 27: goto L_0x0274;
                case 28: goto L_0x0266;
                default: goto L_0x0040;
            }
        L_0x0040:
            switch(r0) {
                case 35: goto L_0x025b;
                case 36: goto L_0x0252;
                default: goto L_0x0043;
            }
        L_0x0043:
            switch(r0) {
                case 51: goto L_0x0244;
                case 52: goto L_0x0238;
                case 53: goto L_0x022a;
                default: goto L_0x0046;
            }
        L_0x0046:
            switch(r0) {
                case 61: goto L_0x021c;
                case 62: goto L_0x020e;
                default: goto L_0x0049;
            }
        L_0x0049:
            switch(r0) {
                case 70: goto L_0x0200;
                case 71: goto L_0x01a9;
                case 72: goto L_0x0152;
                case 73: goto L_0x0144;
                case 74: goto L_0x0136;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r0) {
                case 1001: goto L_0x0130;
                case 1002: goto L_0x012a;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r0) {
                case 1004: goto L_0x011c;
                case 1005: goto L_0x0116;
                case 1006: goto L_0x047d;
                case 1007: goto L_0x0110;
                case 1008: goto L_0x010a;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r0) {
                case 5: goto L_0x00fc;
                case 30: goto L_0x00ee;
                case 32: goto L_0x00aa;
                case 38: goto L_0x00a0;
                case 58: goto L_0x0092;
                case 1017: goto L_0x0144;
                default: goto L_0x0055;
            }
        L_0x0055:
            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.p1893a.C35181a.f90460a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r3.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x006a
            int r0 = r0.intValue()
            goto L_0x006c
        L_0x006a:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x006c:
            if (r0 == r3) goto L_0x0071
            r6 = r0
            goto L_0x047f
        L_0x0071:
            boolean r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am.m79567e(r6)
            if (r0 == 0) goto L_0x0085
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0081
            r6 = 61
            goto L_0x047f
        L_0x0081:
            r6 = 60
            goto L_0x047f
        L_0x0085:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x008f
            r6 = 8
            goto L_0x047f
        L_0x008f:
            r6 = 7
            goto L_0x047f
        L_0x0092:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x009c
            r6 = 78
            goto L_0x047f
        L_0x009c:
            r6 = 77
            goto L_0x047f
        L_0x00a0:
            r0 = 59
            r1 = 58
            int r1 = m77681a(r6, r0, r1)
            goto L_0x0263
        L_0x00aa:
            boolean r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am.m79567e(r6)
            r1 = 48
            if (r0 == 0) goto L_0x00e4
            com.ss.android.ugc.aweme.im.sdk.chat.y r0 = valueOf(r1)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r0 = r0.parse(r6)
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryReplyContent r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryReplyContent) r0
            if (r0 == 0) goto L_0x00d6
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryContent r0 = r0.getStoryContent()
            int r0 = r0.getSyncAweme()
            if (r0 != 0) goto L_0x00d6
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x00d2
            r6 = 61
            goto L_0x047f
        L_0x00d2:
            r6 = 60
            goto L_0x047f
        L_0x00d6:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x00e0
            r6 = 49
            goto L_0x047f
        L_0x00e0:
            r6 = 48
            goto L_0x047f
        L_0x00e4:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x00e0
            r6 = 49
            goto L_0x047f
        L_0x00ee:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x00f8
            r6 = 51
            goto L_0x047f
        L_0x00f8:
            r6 = 50
            goto L_0x047f
        L_0x00fc:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0106
            r6 = 13
            goto L_0x047f
        L_0x0106:
            r6 = 12
            goto L_0x047f
        L_0x010a:
            r1 = 94
            r6 = 94
            goto L_0x047f
        L_0x0110:
            r1 = 91
            r6 = 91
            goto L_0x047f
        L_0x0116:
            r1 = 90
            r6 = 90
            goto L_0x047f
        L_0x011c:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0126
            r6 = 89
            goto L_0x047f
        L_0x0126:
            r6 = 88
            goto L_0x047f
        L_0x012a:
            r1 = 76
            r6 = 76
            goto L_0x047f
        L_0x0130:
            r1 = 79
            r6 = 79
            goto L_0x047f
        L_0x0136:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0140
            r6 = 96
            goto L_0x047f
        L_0x0140:
            r6 = 97
            goto L_0x047f
        L_0x0144:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x014e
            r6 = 93
            goto L_0x047f
        L_0x014e:
            r6 = 92
            goto L_0x047f
        L_0x0152:
            java.lang.String r0 = r6.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x016a
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0166
            r6 = 87
            goto L_0x047f
        L_0x0166:
            r6 = 86
            goto L_0x047f
        L_0x016a:
            r0 = 84
            com.ss.android.ugc.aweme.im.sdk.chat.y r1 = valueOf(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = r1.parse(r6)
            com.ss.android.ugc.aweme.im.sdk.chat.model.ShareStickerContent r1 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareStickerContent) r1
            if (r1 == 0) goto L_0x019b
            java.util.List r2 = r1.getAwemeCoverList()
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
            if (r2 != 0) goto L_0x019b
            java.util.List r1 = r1.getAwemeCoverList()
            int r1 = r1.size()
            if (r1 >= r5) goto L_0x018d
            goto L_0x019b
        L_0x018d:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0197
            r6 = 85
            goto L_0x047f
        L_0x0197:
            r6 = 84
            goto L_0x047f
        L_0x019b:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x01a5
            r6 = 87
            goto L_0x047f
        L_0x01a5:
            r6 = 86
            goto L_0x047f
        L_0x01a9:
            java.lang.String r0 = r6.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01c1
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x01bd
            r6 = 83
            goto L_0x047f
        L_0x01bd:
            r6 = 82
            goto L_0x047f
        L_0x01c1:
            r0 = 80
            com.ss.android.ugc.aweme.im.sdk.chat.y r1 = valueOf(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = r1.parse(r6)
            com.ss.android.ugc.aweme.im.sdk.chat.model.ShareCompilationContent r1 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareCompilationContent) r1
            if (r1 == 0) goto L_0x01f2
            java.util.List r2 = r1.getAwemeCoverList()
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
            if (r2 != 0) goto L_0x01f2
            java.util.List r1 = r1.getAwemeCoverList()
            int r1 = r1.size()
            if (r1 >= r5) goto L_0x01e4
            goto L_0x01f2
        L_0x01e4:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x01ee
            r6 = 81
            goto L_0x047f
        L_0x01ee:
            r6 = 80
            goto L_0x047f
        L_0x01f2:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x01fc
            r6 = 83
            goto L_0x047f
        L_0x01fc:
            r6 = 82
            goto L_0x047f
        L_0x0200:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x020a
            r6 = 75
            goto L_0x047f
        L_0x020a:
            r6 = 74
            goto L_0x047f
        L_0x020e:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0218
            r6 = 73
            goto L_0x047f
        L_0x0218:
            r6 = 72
            goto L_0x047f
        L_0x021c:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0226
            r6 = 71
            goto L_0x047f
        L_0x0226:
            r6 = 70
            goto L_0x047f
        L_0x022a:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0234
            r6 = 65
            goto L_0x047f
        L_0x0234:
            r6 = 64
            goto L_0x047f
        L_0x0238:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0241
        L_0x023e:
            r6 = 2
            goto L_0x047f
        L_0x0241:
            r6 = 1
            goto L_0x047f
        L_0x0244:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x024e
            r6 = 63
            goto L_0x047f
        L_0x024e:
            r6 = 62
            goto L_0x047f
        L_0x0252:
            r0 = 57
            r1 = 56
            int r1 = m77681a(r6, r0, r1)
            goto L_0x0263
        L_0x025b:
            r0 = 55
            r1 = 54
            int r1 = m77681a(r6, r0, r1)
        L_0x0263:
            r6 = r1
            goto L_0x047f
        L_0x0266:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0270
            r6 = 69
            goto L_0x047f
        L_0x0270:
            r6 = 68
            goto L_0x047f
        L_0x0274:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x027e
            r6 = 53
            goto L_0x047f
        L_0x027e:
            r6 = 52
            goto L_0x047f
        L_0x0282:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x028c
            r6 = 45
            goto L_0x047f
        L_0x028c:
            r6 = 44
            goto L_0x047f
        L_0x0290:
            java.lang.String r0 = r6.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x02a8
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x02a4
            r6 = 43
            goto L_0x047f
        L_0x02a4:
            r6 = 42
            goto L_0x047f
        L_0x02a8:
            r0 = 40
            com.ss.android.ugc.aweme.im.sdk.chat.y r1 = valueOf(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = r1.parse(r6)
            com.ss.android.ugc.aweme.im.sdk.chat.model.ShareUserContent r1 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareUserContent) r1
            if (r1 == 0) goto L_0x02d9
            java.util.List r2 = r1.getAwemeCoverList()
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
            if (r2 != 0) goto L_0x02d9
            java.util.List r1 = r1.getAwemeCoverList()
            int r1 = r1.size()
            if (r1 >= r5) goto L_0x02cb
            goto L_0x02d9
        L_0x02cb:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x02d5
            r6 = 41
            goto L_0x047f
        L_0x02d5:
            r6 = 40
            goto L_0x047f
        L_0x02d9:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x02e3
            r6 = 43
            goto L_0x047f
        L_0x02e3:
            r6 = 42
            goto L_0x047f
        L_0x02e7:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x02f1
            r6 = 39
            goto L_0x047f
        L_0x02f1:
            r6 = 38
            goto L_0x047f
        L_0x02f5:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x02ff
            r6 = 37
            goto L_0x047f
        L_0x02ff:
            r6 = 36
            goto L_0x047f
        L_0x0303:
            java.lang.String r0 = r6.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x031b
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0317
            r6 = 31
            goto L_0x047f
        L_0x0317:
            r6 = 30
            goto L_0x047f
        L_0x031b:
            r0 = 28
            com.ss.android.ugc.aweme.im.sdk.chat.y r1 = valueOf(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = r1.parse(r6)
            com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMusicContent r1 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareMusicContent) r1
            if (r1 == 0) goto L_0x034c
            java.util.List r2 = r1.getAwemeCoverList()
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
            if (r2 != 0) goto L_0x034c
            java.util.List r1 = r1.getAwemeCoverList()
            int r1 = r1.size()
            if (r1 >= r5) goto L_0x033e
            goto L_0x034c
        L_0x033e:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0348
            r6 = 29
            goto L_0x047f
        L_0x0348:
            r6 = 28
            goto L_0x047f
        L_0x034c:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0356
            r6 = 31
            goto L_0x047f
        L_0x0356:
            r6 = 30
            goto L_0x047f
        L_0x035a:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0364
            r6 = 47
            goto L_0x047f
        L_0x0364:
            r6 = 46
            goto L_0x047f
        L_0x0368:
            java.lang.String r0 = r6.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0380
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x037c
            r6 = 27
            goto L_0x047f
        L_0x037c:
            r6 = 26
            goto L_0x047f
        L_0x0380:
            r0 = 24
            com.ss.android.ugc.aweme.im.sdk.chat.y r1 = valueOf(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = r1.parse(r6)
            com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent r1 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SharePoiContent) r1
            if (r1 == 0) goto L_0x03b1
            java.util.List r2 = r1.getCoverUrl()
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
            if (r2 != 0) goto L_0x03b1
            java.util.List r1 = r1.getCoverUrl()
            int r1 = r1.size()
            if (r1 >= r5) goto L_0x03a3
            goto L_0x03b1
        L_0x03a3:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x03ad
            r6 = 25
            goto L_0x047f
        L_0x03ad:
            r6 = 24
            goto L_0x047f
        L_0x03b1:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x03bb
            r6 = 27
            goto L_0x047f
        L_0x03bb:
            r6 = 26
            goto L_0x047f
        L_0x03bf:
            java.lang.String r0 = r6.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 34
            r2 = 35
            if (r0 == 0) goto L_0x03db
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x03d7
        L_0x03d3:
            r6 = 35
            goto L_0x047f
        L_0x03d7:
            r6 = 34
            goto L_0x047f
        L_0x03db:
            r0 = 32
            com.ss.android.ugc.aweme.im.sdk.chat.y r3 = valueOf(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r3 = r3.parse(r6)
            com.ss.android.ugc.aweme.im.sdk.chat.model.ShareChallengeContent r3 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareChallengeContent) r3
            if (r3 == 0) goto L_0x040c
            java.util.List r4 = r3.getCoverUrl()
            boolean r4 = com.bytedance.common.utility.p522b.C9376b.m18558a(r4)
            if (r4 != 0) goto L_0x040c
            java.util.List r3 = r3.getCoverUrl()
            int r3 = r3.size()
            if (r3 >= r5) goto L_0x03fe
            goto L_0x040c
        L_0x03fe:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0408
            r6 = 33
            goto L_0x047f
        L_0x0408:
            r6 = 32
            goto L_0x047f
        L_0x040c:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x03d7
            goto L_0x03d3
        L_0x0413:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x041d
            r6 = 23
            goto L_0x047f
        L_0x041d:
            r6 = 22
            goto L_0x047f
        L_0x0421:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x042a
            r6 = 21
            goto L_0x047f
        L_0x042a:
            r6 = 20
            goto L_0x047f
        L_0x042d:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0436
            r6 = 18
            goto L_0x047f
        L_0x0436:
            r6 = 17
            goto L_0x047f
        L_0x0439:
            r1 = 19
            r6 = 19
            goto L_0x047f
        L_0x043e:
            r1 = 14
            r6 = 14
            goto L_0x047f
        L_0x0443:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x044c
            r6 = 16
            goto L_0x047f
        L_0x044c:
            r6 = 15
            goto L_0x047f
        L_0x044f:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0457
            r6 = 6
            goto L_0x047f
        L_0x0457:
            r6 = 5
            goto L_0x047f
        L_0x0459:
            r1 = 9
            r6 = 9
            goto L_0x047f
        L_0x045e:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0467
            r5 = 4
            r6 = 4
            goto L_0x047f
        L_0x0467:
            r6 = 3
            goto L_0x047f
        L_0x0469:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x0241
            goto L_0x023e
        L_0x0471:
            boolean r6 = isMineMsg(r6)
            if (r6 == 0) goto L_0x047a
            r6 = 11
            goto L_0x047f
        L_0x047a:
            r6 = 10
            goto L_0x047f
        L_0x047d:
            r1 = 0
            r6 = 0
        L_0x047f:
            com.ss.android.ugc.aweme.im.sdk.chat.y r6 = valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y.valueOf(com.bytedance.im.core.c.p):com.ss.android.ugc.aweme.im.sdk.chat.y");
    }

    private C33888y(int i) {
        this.f87891a = 1;
        this.f87891a = i;
    }

    /* renamed from: a */
    private static int m77681a(C11207p pVar, int i, int i2) {
        if (isMineMsg(pVar)) {
            if (C35243bl.m79709a()) {
                return i;
            }
            return 61;
        } else if (C35243bl.m79709a()) {
            return i2;
        } else {
            return 60;
        }
    }

    public static BaseContent content(int i, String str, boolean z, long j) {
        if (TextUtils.isEmpty(str)) {
            C32458a.m75144a("Content of stranger message is empty");
            return new TextContent();
        }
        C11207p pVar = new C11207p();
        pVar.getExt().put("s:is_recalled", String.valueOf(z));
        pVar.setContent(str);
        pVar.setMsgType(i);
        pVar.setSender(j);
        return content(pVar);
    }
}
