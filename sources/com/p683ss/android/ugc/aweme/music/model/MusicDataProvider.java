package com.p683ss.android.ugc.aweme.music.model;

import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p683ss.android.ugc.p2425e.p2427b.C48553b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicDataProvider */
public class MusicDataProvider {
    public static ArrayList<MusicModel> getMusicModel(ArrayList<C48553b> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList<MusicModel> arrayList2 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C48553b bVar = (C48553b) it.next();
            MusicModel musicModel = new MusicModel();
            musicModel.setAlbum(bVar.f122004i);
            musicModel.setAllRate(bVar.f122006k);
            musicModel.setCollectionType(CollectionType.NOT_COLLECTED);
            musicModel.setDuration(bVar.f122008m);
            musicModel.setMusicId(bVar.f122005j);
            musicModel.setName(bVar.f121998c);
            musicModel.setLocalPath(bVar.f121997b);
            musicModel.setMusicType(MusicType.BAIDU);
            musicModel.setPicBig(bVar.f122002g);
            musicModel.setPicHuge(bVar.f122001f);
            musicModel.setPicPremium(bVar.f122000e);
            musicModel.setPicSmall(bVar.f122003h);
            musicModel.setSinger(bVar.f121999d);
            musicModel.setSongId(bVar.f121996a);
            musicModel.setSourcePlatform(bVar.f122007l);
            arrayList2.add(musicModel);
        }
        return arrayList2;
    }
}
