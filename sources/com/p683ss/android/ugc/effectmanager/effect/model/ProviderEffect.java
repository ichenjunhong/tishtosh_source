package com.p683ss.android.ugc.effectmanager.effect.model;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.ProviderEffect */
public class ProviderEffect {
    private String click_url;

    /* renamed from: id */
    private String f122943id;
    private String path;
    private StickerBean sticker;
    private StickerBean thumbnail_sticker;
    private String title;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.ProviderEffect$StickerBean */
    public class StickerBean {
        private String height;
        private String size;
        private String url;
        private String width;

        public String getHeight() {
            return this.height;
        }

        public String getSize() {
            return this.size;
        }

        public String getUrl() {
            return this.url;
        }

        public String getWidth() {
            return this.width;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("StickerBean{url='");
            sb.append(this.url);
            sb.append('\'');
            sb.append(", width='");
            sb.append(this.width);
            sb.append('\'');
            sb.append(", height='");
            sb.append(this.height);
            sb.append('\'');
            sb.append(", size='");
            sb.append(this.size);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        public void setHeight(String str) {
            this.height = str;
        }

        public void setSize(String str) {
            this.size = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setWidth(String str) {
            this.width = str;
        }

        public StickerBean() {
        }
    }

    public String getClickUrl() {
        return this.click_url;
    }

    public String getId() {
        return this.f122943id;
    }

    public String getPath() {
        return this.path;
    }

    public StickerBean getSticker() {
        return this.sticker;
    }

    public StickerBean getThumbnailSticker() {
        return this.thumbnail_sticker;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StickerListBean{id='");
        sb.append(this.f122943id);
        sb.append('\'');
        sb.append(", title='");
        sb.append(this.title);
        sb.append('\'');
        sb.append(", thumbnail_sticker=");
        sb.append(this.thumbnail_sticker);
        sb.append(", sticker=");
        sb.append(this.sticker);
        sb.append(", path='");
        sb.append(this.path);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setClickUrl(String str) {
        this.click_url = str;
    }

    public void setId(String str) {
        this.f122943id = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSticker(StickerBean stickerBean) {
        this.sticker = stickerBean;
    }

    public void setThumbnailSticker(StickerBean stickerBean) {
        this.thumbnail_sticker = stickerBean;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
