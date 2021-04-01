package com.example.anivaletask;

public class ItemModelclass {
    private String imageUrl,tags;
    private  int like;

    public ItemModelclass(String imageUrl,String tags,int like){
        this.imageUrl = imageUrl;
        this.tags = tags;
        this.like = like;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTags() {
        return tags;
    }

    public int getLike() {
        return like;
    }
}
