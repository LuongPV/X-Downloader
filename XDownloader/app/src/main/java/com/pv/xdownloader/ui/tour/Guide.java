package com.pv.xdownloader.ui.tour;

class Guide {
    private int resImage;
    private int resTitle;
    private int resDescription;

    Guide(int resImage, int resTitle, int resDescription) {
        this.resImage = resImage;
        this.resTitle = resTitle;
        this.resDescription = resDescription;
    }

    int getResImage() {
        return resImage;
    }

    int getResTitle() {
        return resTitle;
    }

    int getResDescription() {
        return resDescription;
    }
}
