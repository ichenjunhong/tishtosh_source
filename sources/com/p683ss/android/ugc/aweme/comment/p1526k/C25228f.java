package com.p683ss.android.ugc.aweme.comment.p1526k;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeNationalTask;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.p683ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.p683ss.android.ugc.aweme.feed.model.StarAtlasLink;
import com.p683ss.android.ugc.aweme.p1308ad.experiment.LinkMigrationExperiment;

/* renamed from: com.ss.android.ugc.aweme.comment.k.f */
public final class C25228f {
    /* renamed from: a */
    private static boolean m61350a() {
        if (C10181b.m20511a().mo18172a(LinkMigrationExperiment.class, true, "enable_link_ad_migration", 31744, true)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C26129j m61349a(Aweme aweme) {
        C26138s a = C26428bm.m63902a(aweme);
        C26129j jVar = null;
        if (a == null || a.linkType != 0) {
            AwemeStarAtlas starAtlasInfo = aweme.getStarAtlasInfo();
            if (starAtlasInfo != null) {
                StarAtlasLink starAtlasLink = starAtlasInfo.getStarAtlasLink();
                if (starAtlasLink != null) {
                    if (!m61350a()) {
                        return null;
                    }
                    jVar = new C26129j();
                    jVar.setAid(aweme.getAid());
                    jVar.setAvatarIcon(starAtlasLink.getAvatarIcon());
                    jVar.setCommentInfo(starAtlasLink.getTitle());
                    jVar.setCommentNickName(aweme.getAuthor().getNickname());
                    jVar.setCommentTime(aweme.getCreateTime());
                    jVar.setUser(aweme.getAuthor());
                    jVar.setCommentType(10);
                }
                return jVar;
            }
            AwemeNationalTask awemeNationalTask = aweme.getAwemeNationalTask();
            if (awemeNationalTask != null) {
                NationalTaskLink nationalTaskLink = awemeNationalTask.getNationalTaskLink();
                if (nationalTaskLink != null) {
                    if (!m61350a()) {
                        return null;
                    }
                    jVar = new C26129j();
                    jVar.setAid(aweme.getAid());
                    jVar.setCommentTime(aweme.getCreateTime());
                    jVar.setAvatarIcon(nationalTaskLink.getAvatarIcon());
                    jVar.setCommentInfo(nationalTaskLink.getTitle());
                    jVar.setCommentNickName(aweme.getAuthor().getNickname());
                    jVar.setUser(aweme.getAuthor());
                    jVar.setCommentType(10);
                }
                return jVar;
            } else if (a == null || a.linkType != 1 || !C26503d.m64071n(aweme)) {
                return null;
            } else {
                C26129j jVar2 = new C26129j();
                jVar2.setCommentTime(aweme.getCreateTime());
                jVar2.setCommentType(12);
                return jVar2;
            }
        } else if (!m61350a()) {
            return null;
        } else {
            C26129j jVar3 = new C26129j();
            jVar3.setAid(aweme.getAid());
            jVar3.setAvatarIcon(a.avatarIcon);
            jVar3.setButtonText(a.buttonText);
            jVar3.setCommentTime(aweme.getCreateTime());
            jVar3.setCommentInfo(a.title);
            jVar3.setTitle(a.title);
            jVar3.setCommentNickName(aweme.getAuthor().getNickname());
            jVar3.setUser(aweme.getAuthor());
            jVar3.setCommentType(10);
            return jVar3;
        }
    }
}
