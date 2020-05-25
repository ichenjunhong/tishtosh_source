package com.p683ss.android.ugc.aweme.services;

import com.p683ss.android.ugc.aweme.port.p2082in.C39541ac;
import com.p683ss.android.ugc.aweme.port.p2082in.C39543ad;
import com.p683ss.android.ugc.aweme.port.p2082in.C39544ae;
import com.p683ss.android.ugc.aweme.port.p2082in.C39545af;
import com.p683ss.android.ugc.aweme.port.p2082in.C39548ah;
import com.p683ss.android.ugc.aweme.port.p2082in.C39550ai;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al;
import com.p683ss.android.ugc.aweme.port.p2082in.C39560am;
import com.p683ss.android.ugc.aweme.port.p2082in.C39562ao;
import com.p683ss.android.ugc.aweme.port.p2082in.C39564aq;
import com.p683ss.android.ugc.aweme.port.p2082in.C39566ar;
import com.p683ss.android.ugc.aweme.port.p2082in.C39569au;
import com.p683ss.android.ugc.aweme.port.p2082in.C39575aw;
import com.p683ss.android.ugc.aweme.port.p2082in.C39577ay;
import com.p683ss.android.ugc.aweme.port.p2082in.C39588bb;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc;
import com.p683ss.android.ugc.aweme.port.p2082in.C39593bd;
import com.p683ss.android.ugc.aweme.port.p2082in.C39594be;
import com.p683ss.android.ugc.aweme.port.p2082in.C39596bf;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg;
import com.p683ss.android.ugc.aweme.port.p2082in.C39600bi;
import com.p683ss.android.ugc.aweme.port.p2082in.C39603bj;
import com.p683ss.android.ugc.aweme.port.p2082in.C39604bk;
import com.p683ss.android.ugc.aweme.port.p2082in.C39605bl;
import com.p683ss.android.ugc.aweme.port.p2082in.C39608bm;
import com.p683ss.android.ugc.aweme.port.p2082in.C39613br;
import com.p683ss.android.ugc.aweme.port.p2082in.C39631n;
import com.p683ss.android.ugc.aweme.port.p2082in.C39638t;
import com.p683ss.android.ugc.aweme.services.connection.IConnectionEntranceService;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieServiceProvider;
import com.p683ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService;

/* renamed from: com.ss.android.ugc.aweme.services.IAVServiceProxy */
public interface IAVServiceProxy extends IFoundationAVServiceProxy {
    C39631n getABService();

    C39638t getAVConverter();

    C39541ac getApplicationService();

    C39543ad getBridgeService();

    C39544ae getBusinessGoodsService();

    C39545af getCaptureService();

    C39548ah getCommerceService();

    C39550ai getConnectionService();

    C39554al getDmtChallengeService();

    C39560am getDuoShanService();

    C39562ao getHashTagService();

    C39564aq getLiveService();

    C39566ar getLocationService();

    C39569au getMusicService();

    C39575aw getNationalTaskService();

    IPhotoMovieServiceProvider getPhotoMovieServiceProvider();

    C39588bb getPoiService();

    C39591bc getPublishService();

    C39593bd getSettingService();

    C39596bf getShareService();

    C39597bg getShortVideoPluginService();

    C39594be getSpService();

    C39600bi getStickerShareService();

    C39603bj getStoryPublishService();

    C39604bk getSummonFriendService();

    C39605bl getSyncShareService();

    C39608bm getToolsComponentService();

    C39613br getWikiService();

    IConnectionEntranceService getXsEntranceService();

    C39577ay openSDKService();

    ISuperEntrancePrivacyService superEntrancePrivacyService();
}
