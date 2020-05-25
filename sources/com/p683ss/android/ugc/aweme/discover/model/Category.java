package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Category */
public class Category extends C23453a implements Serializable {
    @C17951b(mo34826a = StringJsonAdapterFactory.class)
    @C17952c(mo34828a = "ad_data")
    CategoryListAdInfo adData;
    @C17952c(mo34828a = "creator_info")
    private User author;
    @C17952c(mo34828a = "category_type")
    private int categoryType;
    @C17952c(mo34828a = "challenge_info")
    private Challenge challenge;
    @C17952c(mo34828a = "desc")
    private String desc;
    @C17952c(mo34828a = "effect_info")
    private C46069d effect;
    @C17952c(mo34828a = "aweme_list")
    private List<Aweme> items;
    @C17952c(mo34828a = "music_info")
    private Music music;
    @C17952c(mo34828a = "word_record")
    private Word word;

    public CategoryListAdInfo getAdData() {
        return this.adData;
    }

    public User getAuthor() {
        return this.author;
    }

    public int getCategoryType() {
        return this.categoryType;
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public String getDesc() {
        return this.desc;
    }

    public C46069d getEffect() {
        return this.effect;
    }

    public List<Aweme> getItems() {
        return this.items;
    }

    public Music getMusic() {
        return this.music;
    }

    public Word getWord() {
        return this.word;
    }

    public boolean isAd() {
        if (this.adData != null) {
            return true;
        }
        return false;
    }

    public boolean isChallenge() {
        if (this.challenge != null) {
            return true;
        }
        return false;
    }

    public boolean isMusic() {
        if (this.music != null) {
            return true;
        }
        return false;
    }

    public UrlModel getClickTrackUrlList() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.clickTrackUrlList;
    }

    public String getLogExtra() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.logExtra;
    }

    public UrlModel getTrackUrlList() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.trackUrlList;
    }

    public boolean isChallengeAd() {
        if (!isAd() || this.challenge == null) {
            return false;
        }
        return true;
    }

    public boolean isPicAd() {
        if (!isAd() || this.challenge != null) {
            return false;
        }
        return true;
    }

    public long getCreativeId() {
        if (this.adData == null) {
            return 0;
        }
        return this.adData.getCreativeId().longValue();
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setCategoryType(int i) {
        this.categoryType = i;
    }

    public void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setEffect(C46069d dVar) {
        this.effect = dVar;
    }

    public void setItems(List<Aweme> list) {
        this.items = list;
    }

    public void setMusic(Music music2) {
        this.music = music2;
    }

    public void setWord(Word word2) {
        this.word = word2;
    }
}
