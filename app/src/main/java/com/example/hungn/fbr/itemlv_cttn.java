package com.example.hungn.fbr;

/**
 * Created by hungn on 4/12/2017.
 */

public class itemlv_cttn {
    private String chuto_cttn;
    private String chunho_cttn;
    private int anh_cttn;

    public itemlv_cttn(String chuto_cttn, String chunho_cttn, int anh_cttn) {
        this.chuto_cttn = chuto_cttn;
        this.chunho_cttn = chunho_cttn;
        this.anh_cttn = anh_cttn;
    }

    public String getChuto_cttn() {
        return chuto_cttn;
    }

    public void setChuto_cttn(String chuto_cttn) {
        this.chuto_cttn = chuto_cttn;
    }

    public String getChunho_cttn() {
        return chunho_cttn;
    }

    public void setChunho_cttn(String chunho_cttn) {
        this.chunho_cttn = chunho_cttn;
    }

    public int getAnh_cttn() {
        return anh_cttn;
    }

    public void setAnh_cttn(int anh_cttn) {
        this.anh_cttn = anh_cttn;
    }
}
