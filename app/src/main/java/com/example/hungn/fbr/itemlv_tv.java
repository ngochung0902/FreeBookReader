package com.example.hungn.fbr;

/**
 * Created by hungn on 4/7/2017.
 */

public class itemlv_tv {
    private String chuto;
    private String chunho;
    private int anh;

    public itemlv_tv(String chuto, String chunho, int anh) {
        this.chuto = chuto;
        this.chunho = chunho;
        this.anh = anh;
    }

    public String getChuto() {
        return chuto;
    }

    public void setChuto(String chuto) {
        this.chuto = chuto;
    }

    public String getChunho() {
        return chunho;
    }

    public void setChunho(String chunho) {
        this.chunho = chunho;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}
